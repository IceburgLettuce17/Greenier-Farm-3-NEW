
import java.util.Random;
import javax.microedition.rms.RecordStore;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import javax.wireless.messaging.MessageConnection;

import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

public final class PaySMS {
	private static MIDlet s_midletInstance;
	static int itemAmount;
	static String itemType;
	static int pricePoint;
	private static String s_language;
	private static String VERSION;
	private static HTTP http;
	private static int var_2995;
	private static boolean var_299d;
	private static String[][] profilesData;
	private static boolean var_29ad;
	private static Vector[] var_29b5;
	private static String[][] profilesConfig;
	private static String[][] profilesTexts;
	private static int currentAutoDetectedRegion;
	private static Vector currentValidProfiles;
	private static int var_29dd;
	private static String[] carrierNames;
	private static int regionId;
	private static String[][] profilesAndRegions;
	private static String[] var_29fd;
	private static String debugNum;
	private static String debugMnc;
	private static String smsProperty;
	private static String var_2a1d;
	private static String igpCode;
	private static String phoneModel;
	private static String downloadCode;
	private static String smsContent;
	private static String unlockCode;
	private static int currentProfile;
	private static long smsCount;
	public static final String[] RMS_RECORDS;
	private static boolean var_2a65;
	private static boolean isSMSSent;
	private static boolean isSMSBeingSent;
	private static boolean redeemUnlocked;
	private static boolean var_2a85;
	private static String overrideFromJad;
	private static String shortCode;
	private static String profIDPricePoint;
	private static String pricePointAlias;
	private static String var_2aad;
	private static String billingUrl;
	private static String billingType;
	private static String profilesFile;
	private static String textFile;
	private static Timer timer;
	public static MessageConnection conn;
	public static boolean connClosed;
	// TODO: Brainstorm name for this variable
	public static boolean unkBool;
	private static int var_2af5;
	private static int errorCode;
	private static String var_2b05;
	private static String var_2b0d;
	private static String var_2b15;
	private static String iapTestField;
	private static String testProfile;
	private static String[] currencys;
	private static Vector validContentIds;
	private static Vector cashVector;
	private static Vector coinVector;
	private static String[] var_2b4d;
	private static boolean creditCardEnabled;
	//private static boolean var_2b5d;
	private static String[] turkeyProfiles;
	private static String[] openMarketProfiles;
	private static String[] telkomselProfiles;
	private static int[] var_2b7d;
	private static int[] var_2b85;
	private static int contentIDAmnt;
	private static char currencySeparator;

	private static String separateStr(final String string, int index, final char unused) {
		int srcBegin = 0;
		int srcEnd = string.indexOf(124, 1);
		while (index > 0) {
			if (srcBegin == -1) {
				return null;
			}
			srcBegin = srcEnd;
			srcEnd = string.indexOf(124, srcBegin + 1);
			--index;
		}
		if (srcBegin == -1) {
			return null;
		}
		if (srcEnd == -1) {
			srcEnd = string.length();
		}
		if (index > 0) {
			++srcBegin;
		}
		if (srcBegin == srcEnd) {
			return "";
		}
		if (srcBegin > srcEnd) {
			return null;
		}
		try {
			final char[] chars = new char[srcEnd - srcBegin];
			string.getChars(srcBegin, srcEnd, chars, 0);
			return new String(chars);
		} catch (final IndexOutOfBoundsException ex) {
			return null;
		}
	}

	/**
	* Initializes an instance of PaySMS.
	* parameter - String s_language: The s_language unlockCode to use (example: "EN")
	* returns void
	*/
	public static void Init(final String language) {
		PaySMS.s_language = language;
		PaySMS.s_midletInstance = GLLib.s_application;
		PaySMS.errorCode = 0;
		if (PaySMS.currentValidProfiles == null) {
			PaySMS.currentValidProfiles = new Vector();
		}
		if (PaySMS.profilesTexts == null) {
			PaySMS.profilesTexts = loadSpecificTextsFile();
		}
		PaySMS.profilesAndRegions = getProfilesRegions();
		PaySMS.isSMSSent = isSMSSent();
		PaySMS.redeemUnlocked = isRedeemUnlocked();
		PaySMS.unlockCode = getUnlockCodeStored();
		if (PaySMS.unlockCode.equals("")) {
			PaySMS.unlockCode = getUniqueCode();
			rmsSave(PaySMS.RMS_RECORDS[1], PaySMS.unlockCode);
		}
		PaySMS.smsCount = getSmsCountRms();
		PaySMS.var_299d = true;
		if (PaySMS.VERSION != null) {
			PaySMS.VERSION += "";
		}
		if (!setValidProfilesFromRms() && getTestFieldInt() == 0 && PaySMS.var_29ad && detectRegion()) {
			detectCarrier();
		}
		parseValidItems();
	}

	private static boolean sub_2dde() {
		if (PaySMS.http.m_bCanceled) {
			return false;
		}
		if (PaySMS.http.m_bError) {
			return true;
		}
		if (PaySMS.http.m_response != null && PaySMS.http.m_response != "") {
			final String httpResponse = separateStr(PaySMS.http.m_response, 0, '|');
			try {
				if (httpResponse.equals("FAILURE")) {
					PaySMS.var_2995 = Integer.parseInt(separateStr(PaySMS.http.m_response, 1, '|'));
					return true;
				}
			} catch (final NumberFormatException ex) {
				PaySMS.var_2995 = 40;
				final String sub_2bd5;
				if ((sub_2bd5 = separateStr(PaySMS.http.m_response, 1, '|')).indexOf("PB") != -1) {
					try {
						PaySMS.var_2995 = Integer.parseInt(sub_2bd5.substring(2, sub_2bd5.length()));
					} catch (final NumberFormatException ex2) {
					}
				}
				return true;
			}
			if (httpResponse.equals("SUCCESS")) {
				PaySMS.unlockCode = separateStr(PaySMS.http.m_response, 2, '|');
				PaySMS.var_2995 = 0;
				return true;
			}
		}
		PaySMS.var_2995 = 40;
		return true;
	}


	/**
	 * Sets certain fields to values from your .jad file
	* note This function is called from GLLib, and is required for PaySMS to function properly.
	* note make sure to set all the fields here before using PaySMS.
	* returns true if things went right, otherwise false
	*/
	public static boolean parseJadFields() {
		PaySMS.contentIDAmnt = 6;
		final String unlocked = rmsLoad(PaySMS.RMS_RECORDS[6]);
		boolean isUnlocked;
		if (unlocked != null && !unlocked.equals("1") && unlocked.equals("0")) {
			isUnlocked = false;
			PaySMS.errorCode = -10;
		} else {
			PaySMS.s_midletInstance = GLLib.s_application;
			if ((PaySMS.overrideFromJad = getAppProperty("IAP-OverrideFromJad")).equals("1")) {
				if ((PaySMS.billingType = getAppProperty("IAP-BillingType").toUpperCase()).equals("HTTP")) {
					if ((PaySMS.billingUrl = getAppProperty("IAP-BillingURL")).equals("")) {
						PaySMS.overrideFromJad = "0";
					}
				} else if (!PaySMS.billingType.equals("SMS")) {
					PaySMS.overrideFromJad = "0";
				}
			}
			getAppProperty("IAP-Version");
			boolean hasIGPCode;
			if ((PaySMS.igpCode = getAppProperty("IAP-GameCodeIGP")).length() == 0) {
				hasIGPCode = false;
			} else {
				if ((PaySMS.phoneModel = getAppProperty("IAP-PhoneModel")).length() == 0) {
					PaySMS.phoneModel = "5477";
				}
				if ((PaySMS.iapTestField = getAppProperty("IAP-Test")).length() == 0) {
					PaySMS.iapTestField = "0";
				}
				if (getTestFieldInt() != 0) {
					if (getTestFieldInt() == 1) {
						PaySMS.testProfile = PaySMS.var_2b05;
					} else if (getTestFieldInt() == 2) {
						PaySMS.testProfile = PaySMS.var_2b0d;
					} else {
						PaySMS.iapTestField = "0";
						PaySMS.testProfile = "";
					}
				}
				new StringBuffer().append("PaySMS.parseJadFields:iapTestField: ").append(PaySMS.iapTestField)
						.append(" useTestProfile: ").append(PaySMS.testProfile);
				PaySMS.debugNum = getAppProperty("IAP-DebugNumber");
				final String smsProp;
				if ((smsProp = System.getProperty("wireless.messaging.sms.smsc")) != null && smsProp.length() > 0) {
					PaySMS.smsProperty = smsProp;
				}
				final String debugSmsCenter = getAppProperty("IAP-DebugSMSCenter");
				PaySMS.debugMnc = getAppProperty("IAP-DebugMNC");
				if (!debugSmsCenter.equals("")) {
					PaySMS.smsProperty = debugSmsCenter;
				}
				if (!PaySMS.debugMnc.equals("")) {
					PaySMS.var_2a1d = PaySMS.debugMnc;
				}
				PaySMS.downloadCode = getAppProperty("Download-Code");
				if (getAppProperty("IAP-EnableCreditCard").equals("1")) {
					PaySMS.creditCardEnabled = true;
				}
				PaySMS.validContentIds = new Vector();
				PaySMS.cashVector = new Vector();
				PaySMS.coinVector = new Vector();
				for (int i = 0; i < PaySMS.currencys.length; ++i) {
					for (int j = 1; j <= PaySMS.contentIDAmnt; ++j) {
						final String contentID;
						if ((contentID = getAppProperty("IAP-ContentID-" + PaySMS.currencys[i] + "-" + j)) != null
								&& !contentID.equals("")) {
							PaySMS.validContentIds.addElement(contentID);
						}
					}
				}
				new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(PaySMS.validContentIds);
				for (int k = 0; k < PaySMS.validContentIds.size(); ++k) {
					final String obj = (String) PaySMS.validContentIds.elementAt(k);
					boolean b2 = false;
					for (int l = k + 1; l < PaySMS.validContentIds.size(); ++l) {
						if (PaySMS.validContentIds.elementAt(l).equals(obj)) {
							b2 = true;
							PaySMS.validContentIds.removeElementAt(l);
							--l;
						}
					}
					if (b2) {
						PaySMS.validContentIds.removeElementAt(k);
						--k;
					}
				}
				if (PaySMS.validContentIds.size() == 0) {
					hasIGPCode = false;
				} else {
					new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ")
							.append(PaySMS.validContentIds);
					String str;
					if ((str = getAppProperty("IAP-Profiles")).equals("")) {
						hasIGPCode = false;
					} else {
						if (str.length() > 0 && str.charAt(str.length() - 1) != ';') {
							str += ";";
						}
						final String[] sub_6617;
						if ((sub_6617 = sub_6617(str)) == null) {
							hasIGPCode = false;
						} else if (!loadProfileConfiguration(null, sub_6617, readFile(PaySMS.profilesFile))) {
							hasIGPCode = PaySMS.creditCardEnabled;
						} else {
							PaySMS.var_29ad = true;
							hasIGPCode = true;
						}
					}
				}
			}
			new StringBuffer().append("PaySMS.checkAvailable:parseJadFields: ").append(hasIGPCode ? "true" : "false");
			isUnlocked = (hasIGPCode && checkAvailable());
		}
		return isUnlocked;
	}

	private static boolean checkAvailable() {
		boolean validProfiles;
		
		// Is on test profile?
		if (getTestFieldInt() != 0) {
			validProfiles = true;
		} else if (PaySMS.creditCardEnabled && (PaySMS.profilesData == null || PaySMS.profilesData.length == 0)) {
			validProfiles = true;
		} else if (PaySMS.profilesData.length == 1) {
			validProfiles = true;
		} else if (PaySMS.profilesData.length > 1) {
			final String s = PaySMS.profilesData[0][2];
			final String s2 = PaySMS.profilesData[0][3];
			validProfiles = true;
			for (int i = 1; i < PaySMS.profilesData.length; ++i) {
				final String anObject = PaySMS.profilesData[i][2];
				final String anObject2 = PaySMS.profilesData[i][3];
				if (!s.equals(anObject) || !s2.equals(anObject2)) {
					validProfiles = false;
					break;
				}
			}
		} else {
			validProfiles = false;
		}
		new StringBuffer().append("PaySMS.checkAvailable:validProfiles: ").append(validProfiles ? "true" : "false");
		return validProfiles;
	}

	/**
	* Can redeem a unlockCode through SMS?
	* Requires rmsIsSms and rmsRedeemUnlocked records to return true.
	* returns: true if you can, otherwise false
	*/
	public static boolean canRedeemCode() {
		PaySMS.isSMSSent = isSMSSent();
		PaySMS.redeemUnlocked = isRedeemUnlocked();
		return PaySMS.isSMSSent || PaySMS.redeemUnlocked;
	}

	/**
	 * Sends an IAP request.
	* parameter - int pricePoint: The price point of your item.
	* parameter - String itemType: The type of your item.
	* returns void
	*/
	public static void sendRequest(final int pricePoint, String itemType) {
		new StringBuffer().append("PaySMS.sendRequest: start (PricePoint:").append(pricePoint).append(") (Item Type: ")
				.append(itemType).append(")");
		PaySMS.pricePoint = pricePoint;
		PaySMS.itemAmount = getItemAmount(pricePoint, itemType);
		PaySMS.itemType = itemType;
		boolean b = false;
		String type = "";
		if (PaySMS.overrideFromJad.equals("1")) {
			type = PaySMS.billingType;
		} else {
			if (getTestFieldInt() != 0) {
				PaySMS.profilesData = PaySMS.profilesConfig;
				if (getTestFieldInt() == 1) {
					type = "SMS";
				} else if (getTestFieldInt() == 2) {
					type = "HTTP";
				}
				for (int i = 0; i < PaySMS.profilesData.length; ++i) {
					if (PaySMS.profilesData[i][0].equals(PaySMS.testProfile)) {
						PaySMS.currentProfile = i;
						b = true;
						break;
					}
				}
			} else {
				new StringBuffer().append("PaySMS.sendRequest: currentValidProfiles: ")
						.append((PaySMS.currentValidProfiles == null) ? "null"
								: ("Size: " + PaySMS.currentValidProfiles.size()));
				if (PaySMS.currentValidProfiles == null || PaySMS.currentValidProfiles.size() == 0) {
					PaySMS.currentProfile = -1;
				} else {
					PaySMS.currentProfile = 0;
					for (int j = 0; j < PaySMS.currentValidProfiles.size(); ++j) {
						final int intValue = ((Integer) PaySMS.currentValidProfiles.elementAt(j)).intValue();
						try {
							if (Integer.parseInt(PaySMS.profilesData[intValue][14]) == pricePoint) {
								PaySMS.currentProfile = intValue;
								b = true;
								type = PaySMS.profilesData[PaySMS.currentProfile][6];
								break;
							}
						} catch (final Exception ex) {
							PaySMS.currentProfile = 0;
						}
					}
				}
			}
			new StringBuffer().append("PaySMS.sendRequest: currentProfile: ").append(PaySMS.currentProfile);
			if (b && PaySMS.currentProfile != -1) {
				new StringBuffer().append("PaySMS.sendRequest: Id: ")
						.append(PaySMS.profilesData[PaySMS.currentProfile][0]).append(" Billing: ")
						.append(PaySMS.profilesData[PaySMS.currentProfile][6]).append(" Region: ")
						.append(PaySMS.profilesData[PaySMS.currentProfile][2]).append(" Carrier: ")
						.append(PaySMS.profilesData[PaySMS.currentProfile][3]).append(" Pricepoint: ")
						.append(PaySMS.profilesData[PaySMS.currentProfile][14]);
			}
		}
		if (!PaySMS.var_299d) {
			return;
		}
		new StringBuffer().append("creditCardEnabled: ").append(PaySMS.creditCardEnabled);
		if (b && type.equals("SMS")) {
			PaySMS.var_2a65 = true;
			PaySMS.isSMSSent = false;
			rmsSave(PaySMS.RMS_RECORDS[0], "0");
			PaySMS.smsContent = "";
			if (PaySMS.overrideFromJad.equals("1")) {
				PaySMS.pricePointAlias = getAppProperty("IAP-Alias-PP" + PaySMS.pricePoint);
			} else {
				PaySMS.pricePointAlias = "";
			}
			if (!PaySMS.pricePointAlias.equals("")) {
				appendToSms(PaySMS.pricePointAlias);
			} else if (PaySMS.currentProfile != -1 && !PaySMS.profilesData[PaySMS.currentProfile][10].equals("")) {
				appendToSms(PaySMS.profilesData[PaySMS.currentProfile][10]);
			}
			if (PaySMS.profilesData[PaySMS.currentProfile][12].equals("7")) {
				appendToSms("UNLOCK");
			} else {
				appendToSms("INAPP");
			}
			appendToSms("V009");
			appendToSms(PaySMS.igpCode);
			appendToSms(PaySMS.unlockCode);
			appendToSms(PaySMS.phoneModel);
			if (PaySMS.overrideFromJad.equals("1")) {
				PaySMS.profIDPricePoint = getAppProperty("IAP-ProfileID-PP" + PaySMS.pricePoint);
			} else {
				PaySMS.profIDPricePoint = "";
			}
			if (!PaySMS.profIDPricePoint.equals("")) {
				appendToSms(PaySMS.profIDPricePoint);
			} else {
				if (PaySMS.currentProfile == -1) {
					PaySMS.errorCode = 7;
					return;
				}
				appendToSms(PaySMS.profilesData[PaySMS.currentProfile][0]);
			}
			if (!PaySMS.s_language.equals("")) {
				appendToSms(PaySMS.s_language);
			} else {
				appendToSms("EN");
			}
			if (PaySMS.profilesData[PaySMS.currentProfile][12].equals("7")) {
				appendToSms("7");
			} else {
				appendToSms("1");
			}
			final String sub_5e3c;
			if (!(sub_5e3c = getAppProperty("IAP-ContentID-" + PaySMS.itemType + "-" + PaySMS.pricePoint))
					.equals("")) {
				appendToSms(sub_5e3c);
				appendToSms(PaySMS.downloadCode);
				appendToSms("ct" + PaySMS.smsCount);
				new StringBuffer().append("PaySMS.sendSMS: smsContent: ").append(PaySMS.smsContent);
				PaySMS.isSMSBeingSent = true;
				new BuyTask().start();
				return;
			}
			new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(PaySMS.itemType)
					.append("-").append(PaySMS.pricePoint).append(" missing in JAD");
			PaySMS.errorCode = -2;
			
		} else if (b && type.equals("HTTP")) {
			////HTTP////
			PaySMS.http = new HTTP();
			String httpUrl;
			if (PaySMS.overrideFromJad.equals("1")) {
				httpUrl = PaySMS.billingUrl;
				itemType = (PaySMS.profIDPricePoint = getAppProperty("IAP-ProfileID-PP" + PaySMS.pricePoint));
			} else {
				if (PaySMS.currentProfile == -1) {
					PaySMS.errorCode = 7;
					return;
				}
				httpUrl = PaySMS.profilesData[PaySMS.currentProfile][11];
				itemType = PaySMS.profilesData[PaySMS.currentProfile][0];
			}
			if (httpUrl.equals("") || itemType.equals("")) {
				PaySMS.errorCode = 4;
				return;
			}
			new StringBuffer().append("PaySMS.sendHTTP: URL = ").append(httpUrl);
			if (!httpUrl.startsWith("http://")) {
				httpUrl = "http://" + httpUrl;
			}
			if (!httpUrl.endsWith("?")) {
				httpUrl += "?";
			}
			final String contentID = getAppProperty("IAP-ContentID-" + PaySMS.itemType + "-" + PaySMS.pricePoint);
			if (contentID.equals("")) {
				new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(PaySMS.itemType)
						.append("-").append(PaySMS.pricePoint).append(" missing in JAD");
				PaySMS.errorCode = -2;
				return;
			}
			itemType = contentID;
			PaySMS.http.cancel();
			String fullUrl = "b=contentpurchase" + "%7C" + PaySMS.igpCode + "%7C" + itemType + "%7C" + itemType + "%7C" + PaySMS.unlockCode;
			if (!downloadCode.equals("")) {
				fullUrl = fullUrl + "&d=" + downloadCode;
			}
			PaySMS.var_2995 = -100;
			PaySMS.http.sendByGet(httpUrl, fullUrl + "&phoneId=" + phoneModel);
			rmsSave(PaySMS.RMS_RECORDS[1], PaySMS.unlockCode);
			rmsSave(PaySMS.RMS_RECORDS[2], String.valueOf(PaySMS.itemAmount));
			rmsSave(PaySMS.RMS_RECORDS[5], PaySMS.itemType);
			if (!PaySMS.overrideFromJad.equals("1")) {
				storeProfileID(PaySMS.currentValidProfiles);
			}
			PaySMS.var_2af5 = 1;
		} else {
			if (PaySMS.creditCardEnabled && PaySMS.currentProfile == -1) {
				sendCCARD(pricePoint, itemType);
				return;
			}
			if (PaySMS.creditCardEnabled) {
				sendCCARD(pricePoint, itemType);
				return;
			}
			PaySMS.errorCode = -2;
		}
	}

	/**
	 * Sends a redeem request.
	* returns void
	*/
	public static void sendRedeemRequest() {
		PaySMS.redeemUnlocked = true;
		rmsSave(PaySMS.RMS_RECORDS[4], "1");
		sendRequest(getPricePoint(getPackageId(), getItemTypeRms()), getItemTypeRms());
	}

	public static int update() {
		if (PaySMS.var_2a85) {
			PaySMS.var_2a85 = false;
			return 7;
		}
		if (!PaySMS.var_299d) {
			return 0;
		}
		if (PaySMS.isSMSSent) {
			return 2;
		}
		if (PaySMS.isSMSBeingSent) {
			return 1;
		}
		if (PaySMS.var_2a65 || PaySMS.redeemUnlocked) {
			if (PaySMS.redeemUnlocked) {
				PaySMS.var_2a65 = false;
				PaySMS.isSMSSent = true;
				rmsSave(PaySMS.RMS_RECORDS[0], "1");
				return 8;
			}
			cleanStatus();
			return 3;
		} else {
			if (PaySMS.var_2af5 != 1) {
				if (!PaySMS.overrideFromJad.equals("1") && getTestFieldInt() == 0) {
					if (PaySMS.errorCode != 0) {
						return 3;
					}
					if ((PaySMS.currentValidProfiles == null || PaySMS.currentValidProfiles.size() < 1)
							&& (!PaySMS.creditCardEnabled || PaySMS.var_29ad)) {
						if (PaySMS.regionId < 0) {
							PaySMS.errorCode = -3;
							return 3;
						}
						if (PaySMS.currentValidProfiles.size() < 1) {
							PaySMS.errorCode = -3;
							return 3;
						}
					}
				}
				return 6;
			}
			if (!sub_2dde()) {
				return 1;
			}
			PaySMS.var_2af5 = 0;
			int var_2995;
			final int n = PaySMS.http.m_bCanceled ? (var_2995 = -1)
					: (PaySMS.http.m_bError ? (var_2995 = -2) : (var_2995 = PaySMS.var_2995));
			final int var_2afd = var_2995;
			if (n == 0) {
				if (verifyRequest(Integer.parseInt(PaySMS.unlockCode))) {
					PaySMS.errorCode = 0;
					cleanStatus();
					return 7;
				}
				PaySMS.errorCode = 1;
				cleanStatus();
				return 3;
			} else {
				if (var_2afd == -2) {
					PaySMS.errorCode = -1;
					cleanStatus();
					return 3;
				}
				PaySMS.errorCode = var_2afd;
				cleanStatus();
				return 3;
			}
		}
	}

	public static int getErrorCode() {
		return PaySMS.errorCode;
	}

	/**
	 * Gets the package ID from an RMS record.
	* returns int: your package ID
	*/
	public static int getPackageId() {
		String packageId = rmsLoad(PaySMS.RMS_RECORDS[2]);
		if (packageId == null || packageId.length() == 0) {
			return -1;
		}
		int packageIdInt;
		try {
			packageIdInt = Integer.parseInt(packageId);
		} catch (final Exception ex) {
			packageIdInt = -1;
		}
		return packageIdInt;
	}

	/**
	 *  Verifies a redeem unlockCode.
	* parameter - int inputCode: The unlockCode to verify.
	* returns true if your inputCode is valid, otherwise false
	* 
	*/
	public static boolean verifyRequest(int inputCode) {
		boolean equals = false;
		if ((PaySMS.unlockCode = getUnlockCodeStored()) != null && PaySMS.unlockCode.length() > 0) {
			equals = String.valueOf(inputCode).equals(String.valueOf(Integer.parseInt(PaySMS.unlockCode) ^ 0xD0A4));
		}
		new StringBuffer().append("PaySMS.verifyRequest: inputCode: ").append(inputCode).append(" ")
				.append(equals ? "Unlocked" : "Still Locked");
		if (equals) {
			try {
				final String moneySpent = rmsLoad(PaySMS.RMS_RECORDS[7]);
				String substring = "0";
				if (moneySpent != null && !moneySpent.equals("")) {
					substring = moneySpent.substring(0, moneySpent.indexOf(95));
				}
				inputCode = getPackageId();
				inputCode = getPricePoint(inputCode, getItemTypeRms());
				final String profileID = sub_5260(0, inputCode);
				final String sub_5261 = sub_5260(9, inputCode);
				final String replace = substring.replace(',', '.');
				final String replace2 = sub_5261.replace(',', '.');
				final long sub_5262 = sub_7695(replace);
				final long sub_5263 = sub_7695(replace2);
				inputCode = ((replace.indexOf(PaySMS.currencySeparator) != -1 || replace2.indexOf(PaySMS.currencySeparator) != -1)
						? PaySMS.currencySeparator
						: ' ');
				final long n = sub_5262 + sub_5263;
				final String totalMoneySpent = (inputCode == 32) ? (n / 100000L + "")
						: ("" + n / 100000L + (char) inputCode + n % 100000L);
				new StringBuffer().append("totalMoneySpent : ").append(totalMoneySpent).append("  profileID: ").append(profileID);
				rmsSave(PaySMS.RMS_RECORDS[7], totalMoneySpent + "_" + profileID);
			} catch (final Exception obj) {
				new StringBuffer().append("Exception : ").append(obj);
			}
			PaySMS.errorCode = 0;
			if (!GetBillingType(getPackageId()).equals("http_2d")) {
				PaySMS.var_2a85 = true;
			}
			cleanStatus();
		}
		return equals;
	}

	private static void cleanStatus() {
		PaySMS.isSMSBeingSent = false;
		PaySMS.var_2a65 = false;
		PaySMS.var_299d = false;
		rmsSave(PaySMS.RMS_RECORDS[1], "");
		PaySMS.isSMSSent = false;
		rmsSave(PaySMS.RMS_RECORDS[0], "0");
		PaySMS.redeemUnlocked = false;
		rmsSave(PaySMS.RMS_RECORDS[4], "0");
		//PaySMS.var_2b5d = false;
	}
	
	/**
	 * Resets the PaySMS instance.
	* returns void
	*/
	public static void reset() {
		PaySMS.currentAutoDetectedRegion = -1;
		PaySMS.regionId = -1;
		PaySMS.currentValidProfiles = null;
		PaySMS.var_2a85 = false;
		rmsSave(PaySMS.RMS_RECORDS[2], "");
		rmsSave(PaySMS.RMS_RECORDS[5], "");
		rmsSave(PaySMS.RMS_RECORDS[3], "");
		rmsSave(PaySMS.RMS_RECORDS[8], "");
		rmsSave(PaySMS.RMS_RECORDS[9], "");
		PaySMS.var_2a1d = null;
		cleanStatus();
	}

	private static boolean detectCarrier() {
		if (PaySMS.currentValidProfiles == null) {
			PaySMS.currentValidProfiles = new Vector();
		}
		if (PaySMS.currentValidProfiles.size() == 1) {
			PaySMS.currentProfile = ((Integer) PaySMS.currentValidProfiles.elementAt(0)).intValue();
			new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ")
					.append(PaySMS.currentProfile);
			return true;
		}
		PaySMS.var_29dd = -1;
		PaySMS.currentProfile = -1;
		PaySMS.currentValidProfiles.removeAllElements();
		final String[][] profsCarrsIds = getProfilesCarrierAndIds(PaySMS.profilesAndRegions[PaySMS.regionId][0]);
		PaySMS.carrierNames = new String[profsCarrsIds.length];
		final String[] array = new String[profsCarrsIds.length];
		for (int i = 0; i < profsCarrsIds.length; ++i) {
			PaySMS.carrierNames[i] = profsCarrsIds[i][0];
			array[i] = profsCarrsIds[i][1];
		}
		PaySMS.carrierNames = sub_70ca(PaySMS.carrierNames);
		final String[] currentIDS = sub_70ca(array);
		new StringBuffer().append("PaySMS.detectCarrier: currentIDS ").append(currentIDS.length)
				.append(", currentCarriers = ").append(PaySMS.carrierNames.length);
		if (currentIDS.length == 1) {
			PaySMS.var_29dd = 0;
			for (int j = 0; j < PaySMS.profilesData.length; ++j) {
				if (PaySMS.profilesData[j][0].equals(currentIDS[0])) {
					PaySMS.currentValidProfiles.addElement(new Integer(j));
				}
			}
			new StringBuffer().append(
					"PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ")
					.append(PaySMS.currentValidProfiles.size());
			return true;
		}
		if (PaySMS.carrierNames.length == 1) {
			PaySMS.var_29dd = 0;
			new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ")
					.append(PaySMS.carrierNames[PaySMS.var_29dd]);
			for (int k = 0; k < PaySMS.profilesData.length; ++k) {
				if (PaySMS.profilesData[k][2].indexOf(PaySMS.profilesAndRegions[PaySMS.regionId][0]) != -1) {
					for (int l = 0; l < PaySMS.var_29b5[k].size(); ++l) {
						if (((String) PaySMS.var_29b5[k].elementAt(l))
								.indexOf(PaySMS.carrierNames[PaySMS.var_29dd]) != -1) {
							PaySMS.currentValidProfiles.addElement(new Integer(k));
						}
					}
				}
			}
			new StringBuffer().append("PaySMS.detectCarrier: currentValidProfiles.size =  ")
					.append(PaySMS.currentValidProfiles.size());
			return true;
		}
		if (PaySMS.carrierNames.length >= 1) {
			final String[][] multiCarrierProfiles = new String[currentIDS.length][2];
			boolean b = true;
			for (int m = 0; m < currentIDS.length; ++m) {
				new StringBuffer().append("PaySMS.detectCarrier: currentIDS[").append(m).append("]= ")
						.append(currentIDS[m]);
				int i2 = 0;
				while (i2 < PaySMS.profilesData.length) {
					if (PaySMS.profilesData[i2][0].equals(currentIDS[m])) {
						multiCarrierProfiles[m][0] = PaySMS.profilesData[i2][3];
						multiCarrierProfiles[m][1] = "" + i2;
						new StringBuffer().append("PaySMS.detectCarrier: is Openmarket???? ")
								.append(PaySMS.profilesData[i2][1]);
						if (PaySMS.profilesData[i2][1].indexOf("Open Market") == -1) {
							b = false;
							break;
						}
						break;
					} else {
						++i2;
					}
				}
			}
			boolean b2 = true;
			for (int i = 1; i < multiCarrierProfiles.length; ++i) {
				if (!multiCarrierProfiles[i][0].equals(multiCarrierProfiles[i - 1][0])) {
					b2 = false;
					new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(multiCarrierProfiles[i][0]);
					new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ")
							.append(multiCarrierProfiles[i - 1][0]);
				}
			}
			new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(b2)
					.append(", isOpenMarket: ").append(b);
			if (b2) {
				for (int n2 = 0; n2 < currentIDS.length; ++n2) {
					for (int value = 0; value < PaySMS.profilesData.length; ++value) {
						if (PaySMS.profilesData[value][0].equals(currentIDS[n2])) {
							PaySMS.currentValidProfiles.addElement(new Integer(value));
							break;
						}
					}
				}
				new StringBuffer().append(
						"PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ")
						.append(PaySMS.currentValidProfiles.size());
				new StringBuffer().append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ")
						.append(multiCarrierProfiles[0][0]);
				return true;
			}
			final int length = PaySMS.carrierNames.length;
			for (int n3 = 0; n3 < length; ++n3) {
				PaySMS.carrierNames[n3] = PaySMS.carrierNames[n3].trim();
			}
			final int[] array3 = new int[length];
			for (int i3 = 0; i3 < length; ++i3) {
				array3[i3] = i3;
				new StringBuffer().append("PaySMS.detectCarrier: carrierNames[").append(i3).append("]: ")
						.append(PaySMS.carrierNames[i3]);
			}
		}
		return false;
	}
	
	private static boolean detectRegion() {
		if (PaySMS.currentAutoDetectedRegion != -1) {
			PaySMS.regionId = PaySMS.currentAutoDetectedRegion;
			return true;
		}
		PaySMS.regionId = -1;
		PaySMS.currentProfile = -1;
		PaySMS.currentValidProfiles = null;
		PaySMS.var_29fd = new String[PaySMS.profilesAndRegions.length];
		for (int i = 0; i < PaySMS.var_29fd.length; ++i) {
			PaySMS.var_29fd[i] = PaySMS.profilesAndRegions[i][0];
		}
		if (PaySMS.var_29fd.length == 1 && (PaySMS.smsProperty == null || PaySMS.currentAutoDetectedRegion == -1)) {
			PaySMS.regionId = 0;
			PaySMS.currentAutoDetectedRegion = 0;
			new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, only one region: ")
					.append(PaySMS.var_29fd[PaySMS.regionId]);
			return true;
		}
		if (PaySMS.smsProperty != null && PaySMS.currentAutoDetectedRegion != -1) {
			PaySMS.regionId = PaySMS.currentAutoDetectedRegion;
			new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ")
					.append(PaySMS.currentAutoDetectedRegion);
			return true;
		}
		for (int length = PaySMS.var_29fd.length, j = 0; j < length - 1; ++j) {
			for (int k = j + 1; k < length; ++k) {
				if (PaySMS.var_29fd[j].compareTo(PaySMS.var_29fd[k]) > 0) {
					final String s = PaySMS.var_29fd[j];
					PaySMS.var_29fd[j] = PaySMS.var_29fd[k];
					PaySMS.var_29fd[k] = s;
				}
			}
		}
		return false;
	}
	
	private static void sendCCARD(final int pricepoint, String itemtype) {
		new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(pricepoint).append(" Type:").append(itemtype);
		final String contentID = getAppProperty("IAP-ContentID-" + itemtype + "-" + pricepoint);
		if (contentID.equals("")) {
			new StringBuffer().append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(itemtype).append("-").append(pricepoint)
					.append(" missing in JAD");
			PaySMS.errorCode = -2;
			return;
		}
		itemtype = "";
		itemtype = itemtype + "?igpcode=" + PaySMS.igpCode;
		itemtype = itemtype + "&content_id=" + contentID;
		itemtype = itemtype + "&tier=" + pricepoint;
		itemtype = itemtype + "&unlockCode=" + PaySMS.unlockCode;
		itemtype = itemtype + "&d=" + PaySMS.downloadCode;
		final String creditCard = PaySMS.var_2b4d[11] + itemtype;
		new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: ").append(creditCard);
		if (creditCard != null) {
			GLLib.OpenBrowser(creditCard);
		}
		rmsSave(PaySMS.RMS_RECORDS[0], "1");
		rmsSave(PaySMS.RMS_RECORDS[1], PaySMS.unlockCode);
		rmsSave(PaySMS.RMS_RECORDS[2], String.valueOf(PaySMS.itemAmount));
		rmsSave(PaySMS.RMS_RECORDS[5], PaySMS.itemType);
	}

	private static void appendToSms(final String text) {
		if (text != null) {
			PaySMS.smsContent = PaySMS.smsContent + text + " ";
		}
	}

	private static String[][] getProfilesCarrierAndIds(final String regionName) {
		final Vector vector = new Vector();
		for (int i = 0; i < PaySMS.profilesData.length; ++i) {
			if (PaySMS.profilesData[i][2].indexOf(regionName) != -1) {
				for (int j = 0; j < PaySMS.var_29b5[i].size(); ++j) {
					final String carrierName = (String) PaySMS.var_29b5[i].elementAt(j);
					final String s2 = PaySMS.profilesData[i][0];
					if (carrierName != null) {
						int n;
						if ((n = carrierName.indexOf(40)) == -1) {
							n = carrierName.length();
						}
						new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(regionName)
								.append(", carrierName = ").append(carrierName);
						if ((PaySMS.var_2a1d == null || sub_702c(carrierName, PaySMS.var_2a1d))
								&& !vector.contains(carrierName.substring(0, n))) {
							vector.addElement(new String[] { carrierName.substring(0, n), s2 });
						}
					}
				}
			}
		}
		final String[][] anArray = new String[vector.size()][2];
		vector.copyInto(anArray);
		return anArray;
	}

	// Public version of getPrice(int). All documentation of getPrice should go here
	
	/**
	 *  Gets the price of an item from the JAD.
	* parameter - int pricePoint: The price point of your item.
	* returns String: the price
	*/
	public static String getItemPrice(final int pricePoint) {
		return getPrice(pricePoint);
	}

	private static String getPrice(final int pricePoint) {
		new StringBuffer().append("PaySMS.getPrice: begin (").append(pricePoint).append(")");
		if (PaySMS.overrideFromJad.equals("1")) {
			PaySMS.var_2aad = getAppProperty("IAP-Price-PP" + pricePoint);
			if (PaySMS.var_2aad.equals("")) {
				return null;
			}
			return PaySMS.var_2aad;
		} else {
			new StringBuffer().append("PaySMS.getPrice: currentValidProfiles: ").append(
					(PaySMS.currentValidProfiles == null) ? "NULL" : ("Size: " + PaySMS.currentValidProfiles.size()));
			if (PaySMS.currentValidProfiles == null) {
				if (PaySMS.creditCardEnabled) {
					return " ";
				}
				return null;
			} else {
				int profileIndex = -1;
				if (getTestFieldInt() == 0) {
					for (int i = 0; i < PaySMS.currentValidProfiles.size(); ++i) {
						final int intValue = ((Integer) PaySMS.currentValidProfiles.elementAt(i)).intValue();
						try {
							if (Integer.parseInt(PaySMS.profilesData[intValue][14]) == pricePoint) {
								profileIndex = intValue;
								break;
							}
						} catch (final Exception ex) {
						}
					}
				} else {
					for (int j = 0; j < PaySMS.profilesConfig.length; ++j) {
						if (PaySMS.profilesConfig[j][0].equals(PaySMS.testProfile)) {
							return PaySMS.profilesConfig[j][9];
						}
					}
				}
				new StringBuffer().append("PaySMS.getPrice: profileIndex: ").append(profileIndex);
				if (profileIndex != -1) {
					return PaySMS.profilesData[profileIndex][4];
				}
				if (PaySMS.creditCardEnabled) {
					return " ";
				}
				return null;
			}
		}
	}
	
	/**
	* Gets the value of a virtual currency item.
	* parameter - long basecurrency: The base currency to calculate.
	* parameter - int pricePoint: The price point of your item.
	* returns long: your currency value
	*/
	public static long getVirtualCurrency(final long basecurrency, final int pricepoint) {
		new StringBuffer().append("PaySMS.getVirtualCurrency: begin basecurrency ").append(basecurrency).append(", pricepoint")
				.append(pricepoint);
		long currency = 0L;
		if (getTestFieldInt() == 0 && PaySMS.currentValidProfiles != null && PaySMS.currentValidProfiles.size() > 0) {
			for (int j = 0; j < PaySMS.currentValidProfiles.size(); ++j) {
				final int value = ((Integer) PaySMS.currentValidProfiles.elementAt(j)).intValue();
				try {
					if (Integer.parseInt(PaySMS.profilesData[value][14]) == pricepoint) {
						currency = basecurrency * Long.parseLong(PaySMS.profilesData[value][16]) / 10000000L;
						currency += basecurrency * Long.parseLong(PaySMS.profilesData[value][16]) % 10000000L / 5000000L;
						break;
					}
				} catch (final Exception ex) {
				}
			}
		} else {
			currency = basecurrency * PaySMS.var_2b85[pricepoint - 1] * PaySMS.var_2b7d[pricepoint - 1] / (PaySMS.var_2b85[0] * 100)
					+ basecurrency * PaySMS.var_2b85[pricepoint - 1] * PaySMS.var_2b7d[pricepoint - 1] % (PaySMS.var_2b85[0] * 100)
							/ (PaySMS.var_2b85[0] * 100 >> 1);
		}
		final int len = ("" + currency).length();
		int roundup = 1;
		if (len == 2) {
			roundup = 2;
		} else if (len > 2) {
			roundup = 5;
			for (int l = 0; l < len - 3; ++l) {
				roundup *= 10;
			}
		}
		new StringBuffer().append("currency:\t").append(currency).append("\tRound Up:\t").append(roundup);
		if (currency % roundup != 0L) {
			currency = (currency / roundup + 1L) * roundup;
		}
		new StringBuffer().append("Rounded currency:\t").append(currency);
		return currency;
	}

	private static String sub_5260(final int n, final int i) {
		if (getTestFieldInt() == 0) {
			for (int j = 0; j < PaySMS.currentValidProfiles.size(); ++j) {
				final int intValue = ((Integer) PaySMS.currentValidProfiles.elementAt(j)).intValue();
				if (PaySMS.profilesData[intValue][14].equals(String.valueOf(i))) {
					return PaySMS.profilesData[intValue][n];
				}
			}
		} else {
			for (int k = 0; k < PaySMS.profilesConfig.length; ++k) {
				if (PaySMS.profilesConfig[k][0].equals(PaySMS.testProfile)) {
					return PaySMS.profilesConfig[k][n];
				}
			}
		}
		return "";
	}
	
	private static String GetBillingType(final int n) {
		if (getTestFieldInt() != 0) {
			if (getTestFieldInt() == 1) {
				return "sms_2d";
			}
			if (getTestFieldInt() == 2) {
				return "http_2d";
			}
			if (getTestFieldInt() == 3) {
				return "cc_2d";
			}
		}
		new StringBuffer().append("PaySMS.GetBillingType: currentValidProfiles: ").append(
				(PaySMS.currentValidProfiles == null) ? "NULL" : ("Size: " + PaySMS.currentValidProfiles.size()));
		if (PaySMS.currentValidProfiles == null) {
			return "cc_2d";
		}
		int n2 = 0;
		boolean b = false;
		for (int i = 0; i < PaySMS.currentValidProfiles.size(); ++i) {
			final int intValue = ((Integer) PaySMS.currentValidProfiles.elementAt(i)).intValue();
			try {
				if (Integer.parseInt(PaySMS.profilesData[intValue][14]) == n) {
					n2 = intValue;
					b = true;
					break;
				}
			} catch (final Exception ex) {
			}
		}
		if (!b) {
			return "cc_2d";
		}
		if (PaySMS.profilesData[n2][6].equals("SMS")) {
			return "sms_2d";
		}
		if (PaySMS.profilesData[n2][6].equals("HTTP")) {
			return "http_2d";
		}
		return null;
	}

	/*
	* Gets the terms and conditions of IAP. You can then display this value in-game.
	* note Don't forget to populate your IAP_texts file with TNCs for each country.
	* returns String: your tncs
	*/
	public static String GetTermsAndConditions() {
		new StringBuffer().append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append(
				(PaySMS.currentValidProfiles == null) ? "NULL" : ("Size: " + PaySMS.currentValidProfiles.size()));
		if (PaySMS.currentValidProfiles == null) {
			return null;
		}
		String tncID = null;
		String supportNumber = null;
		if (getTestFieldInt() == 0) {
			if (PaySMS.currentValidProfiles.size() > 0) {
				final int intValue = ((Integer) PaySMS.currentValidProfiles.elementAt(0)).intValue();
				try {
					tncID = PaySMS.profilesData[intValue][13];
					supportNumber = PaySMS.profilesData[intValue][15];
				} catch (final Exception ex) {
				}
			}
		} else if (PaySMS.profilesConfig.length > 0) {
			for (int i = 0; i < PaySMS.profilesConfig.length; ++i) {
				if (PaySMS.profilesConfig[i][0].equals(PaySMS.testProfile)) {
					tncID = PaySMS.profilesConfig[i][13];
					break;
				}
			}
		}
		new StringBuffer().append("PaySMS.GetTermsAndConditions: tncID = '").append(tncID).append("'");
		final String tnc = retrieveTermsAndConditions(tncID);
		new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc = '").append(tnc).append("'");
		new StringBuffer().append("PaySMS.GetTermsAndConditions: supportNumber = '").append(supportNumber).append("'");
		final String tncWoPhone = replaceTncStrings(tnc, supportNumber);
		new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc without phone number = '").append(tncWoPhone)
				.append("'");
		return tncWoPhone;
	}
	
		
	/**
	 * Gets the amount of items for a currency.
	* parameter - String currency: The currency.
	* returns int: your currency amount
	*/
	public static int getCurrencyAmount(final String currency) {
		if (currency.equals("Cash")) {
			return PaySMS.cashVector.size();
		}
		if (currency.equals("Coin")) {
			return PaySMS.coinVector.size();
		}
		return -1;
	}

	private static void parseValidItems() {
		PaySMS.cashVector.removeAllElements();
		PaySMS.coinVector.removeAllElements();
		if (getTestFieldInt() == 0 && PaySMS.currentValidProfiles != null && PaySMS.currentValidProfiles.size() > 0) {
			for (int i = 0; i < PaySMS.currentValidProfiles.size(); ++i) {
				final int id;
				if (isValidContentID(
						id = Integer.parseInt(
								PaySMS.profilesData[((Integer) PaySMS.currentValidProfiles.elementAt(i)).intValue()][14]),
						"Cash")) {
					PaySMS.cashVector.addElement(new Integer(id));
				}
				if (isValidContentID(id, "Coin")) {
					PaySMS.coinVector.addElement(new Integer(id));
				}
			}
		} else if (PaySMS.creditCardEnabled || getTestFieldInt() != 0) {
			new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ")
					.append(PaySMS.creditCardEnabled);
			for (int j = 1; j <= PaySMS.contentIDAmnt; ++j) {
				if (isValidContentID(j, "Cash")) {
					PaySMS.cashVector.addElement(new Integer(j));
				}
				if (isValidContentID(j, "Coin")) {
					PaySMS.coinVector.addElement(new Integer(j));
				}
			}
		}
		for (int k = 0; k < PaySMS.cashVector.size() - 1; ++k) {
			for (int l = k + 1; l < PaySMS.cashVector.size(); ++l) {
				final int intValue = ((Integer) PaySMS.cashVector.elementAt(k)).intValue();
				final int intValue2 = ((Integer) PaySMS.cashVector.elementAt(l)).intValue();
				if (intValue > intValue2) {
					PaySMS.cashVector.setElementAt(new Integer(intValue2), k);
					PaySMS.cashVector.setElementAt(new Integer(intValue), l);
				}
			}
		}
		for (int n = 0; n < PaySMS.coinVector.size() - 1; ++n) {
			for (int n2 = n + 1; n2 < PaySMS.coinVector.size(); ++n2) {
				final int intValue3 = ((Integer) PaySMS.coinVector.elementAt(n)).intValue();
				final int intValue4 = ((Integer) PaySMS.coinVector.elementAt(n2)).intValue();
				if (intValue3 > intValue4) {
					PaySMS.coinVector.setElementAt(new Integer(intValue4), n);
					PaySMS.coinVector.setElementAt(new Integer(intValue3), n2);
				}
			}
		}
		new StringBuffer().append("PaySMS.parseValidItems: number of cash: ").append(PaySMS.cashVector.size());
		new StringBuffer().append("PaySMS.parseValidItems: number of coin: ").append(PaySMS.coinVector.size());
	}
	
	/**
	 *  Gets the price point of an item.
	* parameter - int itemIndex: The index of your item.
	* parameter - String pricePoint: The price point of your item.
	* returns int: your price point
	*/
	public static int getPricePoint(final int itemIndex, final String itemType) {
		new StringBuffer().append("PaySMS.getPricePoint: itemIndex").append(itemIndex).append(", itemType ").append(itemType);
		if (itemType.equals("Cash") && itemIndex <= PaySMS.cashVector.size()) {
			return ((Integer) PaySMS.cashVector.elementAt(itemIndex)).intValue();
		}
		if (itemType.equals("Coin") && itemIndex <= PaySMS.coinVector.size()) {
			return ((Integer) PaySMS.coinVector.elementAt(itemIndex)).intValue();
		}
		return -1;
	}

	private static int getItemAmount(final int pricePoint, final String itemType) {
		//int ret = -1;
		if (itemType.equals("Cash")) {
			for (int i = 0; i < PaySMS.cashVector.size(); ++i) {
				if (((Integer) PaySMS.cashVector.elementAt(i)).intValue() == pricePoint) {
					//ret = i;
					//break;
					return i;
				}
			}
		} else if (itemType.equals("Coin")) {
			for (int j = 0; j < PaySMS.coinVector.size(); ++j) {
				if (((Integer) PaySMS.coinVector.elementAt(j)).intValue() == pricePoint) {
					//ret = j;
					//break;
					return j;
				}
			}
		}
		return /** ret */ -1;
	}
	
	private static boolean isValidContentID(final int pricePoint, final String contentID) {
		final String _contentID = getAppProperty("IAP-ContentID-" + contentID + "-" + pricePoint);
		boolean value = false;
		if (PaySMS.validContentIds.contains(_contentID)) {
			value = true;
		}
		new StringBuffer().append("PaySMS.isValidContentID: IAP-ContentID-").append(contentID).append("-").append(pricePoint)
				.append(": ").append(_contentID).append(value ? " - Valid" : " - Invalid");
		return value;
	}

	private static String retrieveTermsAndConditions(final String id) {
		new StringBuffer().append("PaySMS.retrieveTermsAndConditions: id = '").append(id).append("'");
		if (id == null || id.length() == 0) {
			return "";
		}
		for (int i = 0; i < PaySMS.profilesTexts.length; ++i) {
			new StringBuffer().append("PaySMS.retrieveTermsAndConditions: profilesTexts[").append(i)
					.append("][TEXT_PROFILE_ID] = '").append(PaySMS.profilesTexts[i][0]).append("'");
			if (equalsIgnoreCase(PaySMS.profilesTexts[i][0], id)) {
				return PaySMS.profilesTexts[i][1];
			}
		}
		return "";
	}

	private static String replaceTncStrings(final String tnc, final String string) {
		if (tnc == null || tnc.equals("")) {
			return null;
		}
		String s2;
		try {
			final int phoneBegin = tnc.indexOf("<phone>");
			final int phoneEnd = tnc.indexOf("</phone>", phoneBegin + "<phone>".length());
			final String substring = tnc.substring(0, phoneBegin);
			final String substring2 = tnc.substring(phoneBegin + "<phone>".length(), phoneEnd);
			final String substring3 = tnc.substring(phoneEnd + "</phone>".length(), tnc.length());
			if (string == null || string.equals("")) {
				s2 = substring + substring3;
			} else {
				final int index3 = substring2.indexOf("<support_number>");
				s2 = substring
						+ (substring2.substring(0, index3) + string
								+ substring2.substring(index3 + "<support_number>".length(), substring2.length()))
						+ substring3;
			}
		} catch (final Exception ex) {
			return tnc;
		}
		return s2;
	}

	private static String[][] loadSpecificTextsFile() {
		final String[] textFile = readFile(PaySMS.textFile);
		if (textFile == null) {
			return null;
		}
		final String[][] array = new String[textFile.length][2];
		for (int i = 0; i < textFile.length; ++i) {
			final int index = textFile[i].indexOf(59);
			if (index != -1) {
				array[i][0] = textFile[i].substring(0, index);
				array[i][1] = textFile[i].substring(index + 1, textFile[i].length());
			}
		}
		for (int j = 0; j < array.length; ++j) {
			new StringBuffer().append("PaySMS.loadSpecificTextsFile: ID: ").append(array[j][0]).append(" TEXT: ")
					.append(array[j][1]);
		}
		return array;
	}

	private static String getAppProperty(String prop) {
		prop = PaySMS.s_midletInstance.getAppProperty(prop);
		if (prop == null) {
			prop = "";
		}
		return prop;
	}

	private static int getTestFieldInt() {
		if (PaySMS.iapTestField.equals("0")) {
			return 0;
		}
		if (PaySMS.iapTestField.equals("1")) {
			return 1;
		}
		if (PaySMS.iapTestField.equals("2")) {
			return 2;
		}
		return 0;
	}

	private static boolean loadProfileConfiguration(String[] array, final String[] array2,
			final String[] profilesArgs) {
		if (profilesArgs == null) {
			PaySMS.errorCode = 8;
			return false;
		}
		for (int i = 0; i < profilesArgs.length; ++i) {
			new StringBuffer().append("PaySMS.loadProfileConfiguration: profilesArgs[").append(i).append("]: ")
					.append(profilesArgs[i]);
		}
		array = array2;
		int n = 0;
		final int[] array4 = new int[profilesArgs.length];
		final String[][] profilesConfig = new String[profilesArgs.length][17];
		int n2 = 0;
		final int[] array6 = new int[profilesArgs.length];
		for (int j = 0; j < profilesArgs.length; ++j) {
			int n3 = 0;
			for (int k = 0; k < 16; ++k) {
				final int index = profilesArgs[j].indexOf(";", n3);
				profilesConfig[j][k] = profilesArgs[j].substring(n3, index);
				n3 = index + 1;
			}
			if (sub_65c1(profilesConfig[j][0])) {
				array6[n2++] = j;
			}
			if (profilesConfig[j][6].equals("CC")) {
				PaySMS.var_2b4d = profilesConfig[j];
			}
			int l = 0;
			while (l < array.length) {
				final String anObject;
				if ((anObject = array[l]) != null && anObject.length() != 0 && profilesConfig[j][0].equals(anObject)) {
					if (!sub_65c1(profilesConfig[j][0]) && !profilesConfig[j][6].equals("CC")) {
						array4[n++] = j;
						array[l] = null;
						break;
					}
					break;
				} else {
					++l;
				}
			}
		}
		if (n2 != 0) {
			PaySMS.profilesConfig = new String[n2][];
			for (int l = 0; l < PaySMS.profilesConfig.length; ++l) {
				PaySMS.profilesConfig[l] = profilesConfig[array6[l]];
			}
		}
		if (n == 0) {
			return false;
		}
		PaySMS.profilesData = new String[n][];
		for (int n5 = 0; n5 < PaySMS.profilesData.length; ++n5) {
			PaySMS.profilesData[n5] = profilesConfig[array4[n5]];
		}
		try {
			for (int n6 = 0; n6 < n; ++n6) {
				final String s = PaySMS.profilesData[n6][9];
				final String s2 = PaySMS.profilesData[n6][7];
				final int tier = Integer.parseInt(PaySMS.profilesData[n6][14]);
				if (s2 != null) {
					PaySMS.profilesData[n6][16] = ""
							+ sub_7695(s) * (100 + Integer.parseInt(PaySMS.profilesData[n6][5])) * 100000L / sub_7695(s2);
					new StringBuffer().append("bonus    ").append(100 + Integer.parseInt(PaySMS.profilesData[n6][5]))
							.append(", tier ").append(tier);
				}
				new StringBuffer().append("profile Id :\t").append(PaySMS.profilesData[n6][0]).append("\tTier:\t")
						.append(tier).append("\tRatios :\t").append(PaySMS.profilesData[n6][16]);
			}
		} catch (final Exception ex) {
		}
		parseMultipleCarriers();
		return true;
	}

	private static void parseMultipleCarriers() {
		int length = PaySMS.profilesData.length;
		if (PaySMS.var_2b4d != null) {
			++length;
		}
		PaySMS.var_29b5 = new Vector[length];
		for (int i = 0; i < PaySMS.profilesData.length; ++i) {
			PaySMS.var_29b5[i] = new Vector();
			final String s = PaySMS.profilesData[i][3];
			new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ")
					.append(PaySMS.profilesData[i][0]);
			int beginIndex = 0;
			int j;
			if ((j = s.indexOf("¬", 0)) == -1) {
				PaySMS.var_29b5[i].addElement(s);
				new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s);
			} else {
				while (j != -1) {
					PaySMS.var_29b5[i].addElement(s.substring(beginIndex, j));
					new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s.substring(beginIndex, j));
					beginIndex = j + 1;
					j = s.indexOf("¬", beginIndex);
				}
				PaySMS.var_29b5[i].addElement(s.substring(beginIndex, s.length()));
				new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t")
						.append(s.substring(beginIndex, s.length()));
			}
			new StringBuffer().append("\tSize: ").append(PaySMS.var_29b5[i].size());
		}
		if (PaySMS.var_2b4d != null) {
			PaySMS.var_29b5[PaySMS.profilesData.length] = new Vector();
			final String s2 = PaySMS.var_2b4d[3];
			new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(PaySMS.var_2b4d[0]);
			int beginIndex2 = 0;
			int k;
			if ((k = s2.indexOf("¬", 0)) == -1) {
				PaySMS.var_29b5[PaySMS.profilesData.length].addElement(s2);
				new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s2);
			} else {
				while (k != -1) {
					PaySMS.var_29b5[PaySMS.profilesData.length].addElement(s2.substring(beginIndex2, k));
					new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t")
							.append(s2.substring(beginIndex2, k));
					beginIndex2 = k + 1;
					k = s2.indexOf("¬", beginIndex2);
				}
				PaySMS.var_29b5[PaySMS.profilesData.length].addElement(s2.substring(beginIndex2, s2.length()));
				new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t")
						.append(s2.substring(beginIndex2, s2.length()));
			}
			new StringBuffer().append("\tSize: ").append(PaySMS.var_29b5[PaySMS.profilesData.length].size());
		}
	}

	private static boolean sub_65c1(final String s) {
		return s.equals(PaySMS.var_2b05) || s.equals(PaySMS.var_2b0d) || s.equals(PaySMS.var_2b15);
	}

	private static String[] sub_6617(final String s) {
		if (s == null) {
			return null;
		}
		final Vector vector = new Vector();
		int i = 0;
		while (i < s.length()) {
			final int index;
			if ((index = s.indexOf(59, i)) != -1) {
				vector.addElement(s.substring(i, index));
				i = index + 1;
			} else {
				i = s.length();
			}
		}
		final String[] anArray = new String[vector.size()];
		vector.copyInto(anArray);
		return anArray;
	}

	private static String[] readFile(final String filename) {
		final InputStream is = "".getClass().getResourceAsStream(filename);
		String bytesStr;
		try {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
			final byte[] madeBytes = new byte[256];
			int read = is.read(madeBytes);
			while (read != -1) {
				baos.write(madeBytes, 0, read);
			}
			is.close();
			final byte[] bytes = baos.toByteArray();
			baos.close();
			bytesStr = new String(bytes, 0, bytes.length, "UTF-8");
		} catch (final Exception ex) {
			new StringBuffer().append("PaySMS.readFile: ").append(filename).append(" Exception: ").append(ex.toString());
			return null;
		}
		int n = 0;
		final Vector vector = new Vector();
		int i;
		do {
			i = bytesStr.indexOf(10, n);
			if (i != -1) {
				vector.addElement(bytesStr.substring(n, i));
				n = i + 1;
			}
		} while (i != -1);
		final String[] vecStr = new String[vector.size()];
		vector.copyInto(vecStr);
		return vecStr;
	}

	private static String[][] getProfilesRegions() {
		if (!PaySMS.var_29ad || getTestFieldInt() != 0) {
			return null;
		}
		final Vector vector = new Vector();
		for (int i = 0; i < PaySMS.profilesData.length; ++i) {
			final String s = PaySMS.profilesData[i][2];
			int n = 0;
			for (int index = 0; n == 0 && index < vector.size(); ++index) {
				if (equalsIgnoreCase(s, (String) vector.elementAt(index))) {
					n = 1;
				}
			}
			if (n == 0) {
				vector.addElement(PaySMS.profilesData[i][2]);
			}
		}
		if (PaySMS.var_2b4d != null && PaySMS.creditCardEnabled && vector.size() > 1) {
			vector.addElement("Other");
		}
		final String[] anArray = new String[vector.size()];
		vector.copyInto(anArray);
		vector.removeAllElements();
		final Vector vector2 = new Vector();
		String[][] regionsConfig = new String[anArray.length][2];
		int n2 = 0;
		int n3 = 0;
		for (int j = 0; j < anArray.length; ++j) {
			final String s2;
			int index2;
			if ((index2 = (s2 = anArray[j]).indexOf(40)) != -1) {
				regionsConfig[j][0] = s2.substring(0, index2);
				++index2;
				final int index3 = s2.indexOf(58, index2);
				rmsLoad(PaySMS.RMS_RECORDS[8]);
				if (index3 != -1) {
					regionsConfig[j][1] = s2.substring(index2, index3);
					if (PaySMS.smsProperty != null && PaySMS.smsProperty.startsWith(regionsConfig[j][1], 1)
							&& n2 <= index3 - index2) {
						n2 = index3 - index2;
						PaySMS.currentAutoDetectedRegion = j;
						new StringBuffer().append("currentAutoDetectedRegion ").append(PaySMS.currentAutoDetectedRegion);
						final String[] obj;
						(obj = new String[2])[0] = regionsConfig[j][0];
						obj[1] = regionsConfig[j][1];
						vector2.addElement(obj);
						++n3;
					}
				}
			} else {
				regionsConfig[j][0] = s2;
				regionsConfig[j][1] = "";
			}
			new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(j)
					.append("][REGION_NAME]: ").append(regionsConfig[j][0]);
			new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(j)
					.append("][REGION_CODE]: ").append(regionsConfig[j][1]);
		}
		if (n3 > 1) {
			PaySMS.currentAutoDetectedRegion = -1;
			regionsConfig = new String[vector2.size()][2];
			vector2.copyInto(regionsConfig);
		}
		new StringBuffer().append("PaySMS.getProfilesRegions: Auto-detected: ")
				.append((PaySMS.currentAutoDetectedRegion == -1) ? "NONE" : regionsConfig[PaySMS.currentAutoDetectedRegion][0]);
		return regionsConfig;
	}

	private static String rmsLoad(final String recordName) {
		RecordStore rs = null;
		String recordStr = null;
		try {
			final byte[] record;
			rs = RecordStore.openRecordStore(recordName, true);
			record = rs.getRecord(1);
			if (rs.getNumRecords() >= 1 && record != null) {
				recordStr = new String(record);
			}
		} catch (final Exception ex) {
			new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(recordName).append(" ").append(ex.toString());
		}
		try {
			rs.closeRecordStore();
		} catch (final Exception ex2) {
			new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(recordName).append(" ").append(ex2.toString());
		}
		return recordStr;
	}

	/**
	 *  Saves an RMS record.
	* parameter - String record: Your record name.
	* parameter - String value: The value of your record.
	* returns void
	*/
	public static void rmsSave(final String record, final String value) {
		RecordStore rs = null;
		try {
			rs = RecordStore.openRecordStore(record, true);
			final byte[] bytes = value.getBytes();
			if (rs.getNumRecords() >= 1) {
				rs.setRecord(1, bytes, 0, bytes.length);
			} else {
				rs.addRecord(bytes, 0, bytes.length);
			}
		} catch (final Exception ex) {
			new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(ex.toString());
		}
		if (rs != null) {
			try {
				rs.closeRecordStore();
			} catch (final Exception ex2) {
				new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(ex2.toString());
			}
		}
	}

	private static boolean isSMSSent() {
		return rmsLoad(PaySMS.RMS_RECORDS[0]) != null && rmsLoad(PaySMS.RMS_RECORDS[0]).equals("1");
	}

	private static boolean isRedeemUnlocked() {
		return rmsLoad(PaySMS.RMS_RECORDS[4]) != null && rmsLoad(PaySMS.RMS_RECORDS[4]).equals("1");
	}

	private static String getUnlockCodeStored() {
		final String code = rmsLoad(PaySMS.RMS_RECORDS[1]);
		if (code != null) {
			return code;
		}
		return "";
	}

	private static long getSmsCountRms() {
		try {
			String smsCnt = rmsLoad(PaySMS.RMS_RECORDS[11]);
			if (smsCnt != null) {
				return Long.parseLong(smsCnt);
			}
		} catch (final Exception ex) {
		}
		return 1L;
	}
	
	/**
	 * Gets the item type from an RMS record.
	* returns String: your item type
	*/
	public static String getItemTypeRms() {
		if (rmsLoad(PaySMS.RMS_RECORDS[5]) != null) {
			return rmsLoad(PaySMS.RMS_RECORDS[5]);
		}
		return "";
	}

	private static boolean setValidProfilesFromRms() {
		final String availableProfiles = rmsLoad(PaySMS.RMS_RECORDS[3]);
		if (availableProfiles == null || availableProfiles.length() == 0) {
			return false;
		}
		final Vector currentValidProfiles = new Vector();
		for (int n = 0, i = availableProfiles.indexOf(";"); i != -1; i = availableProfiles.indexOf(";", n)) {
			currentValidProfiles.addElement(new Integer(Integer.parseInt(availableProfiles.substring(n, i))));
			n = i + 1;
		}
		PaySMS.currentValidProfiles = currentValidProfiles;
		return true;
	}

	private static void storeProfileID(final Vector vector) {
		String profile = "";
		for (int i = 0; i < vector.size(); ++i) {
			//profile = profile + vector.elementAt(i) + ";";
			profile += vector.elementAt(i) + ";";
		}
		new StringBuffer().append("PaySMS.storeProfileID: ").append(profile);
		rmsSave(PaySMS.RMS_RECORDS[3], String.valueOf(profile));
	}

	private static String getUniqueCode() {
		int i;
		for (i = Math.abs(new Random().nextInt() % 9999); i < 1000; i += 1000) {
			if (i < 1000) {
			}
		}
		return String.valueOf(i);
	}

	private static boolean sub_6fe0(final String s) {
		return s == null || s.length() == 0 || s.equals("null");
	}

	private static boolean sub_702c(final String s, final String s2) {
		if (sub_6fe0(s) || sub_6fe0(s2)) {
			return false;
		}
		for (int length = s2.length(), i = 0; i <= s.length() - length; ++i) {
			if (equalsIgnoreCase(s.substring(i, i + length), s2)) {
				return true;
			}
		}
		return false;
	}

	private static String[] sub_70ca(final String[] array) {
		final Vector vector = new Vector();
		for (int i = 0; i < array.length; ++i) {
			boolean b = false;
			for (int j = 0; j < i; ++j) {
				if (array[i].equals(array[j])) {
					b = true;
					break;
				}
			}
			if (!b) {
				vector.addElement(array[i]);
			}
		}
		final String[] anArray = new String[vector.size()];
		vector.copyInto(anArray);
		return anArray;
	}
	
	// Still investigating this function's name since 2024....
	public static int GetSpecialFlow() {
		if (PaySMS.currentValidProfiles == null || PaySMS.currentValidProfiles.size() <= 0) {
			return 0;
		}
		if (getTestFieldInt() != 0) {
			return 8;
		}
		try {
			final int h = ((Integer) PaySMS.currentValidProfiles.elementAt(0)).intValue();
			final String profileID = PaySMS.profilesData[h][0];
			new StringBuffer().append("profileID : ").append(profileID);
			for (int i = 0; i < PaySMS.turkeyProfiles.length; ++i) {
				if (profileID != null && profileID.equals(PaySMS.turkeyProfiles[i])) {
					new StringBuffer().append("PaySMS. Found valid the Turkey profile: ")
							.append(PaySMS.profilesData[h][0]);
					return 3;
				}
			}
			for (int j = 0; j < PaySMS.openMarketProfiles.length; ++j) {
				if (profileID != null && profileID.equals(PaySMS.openMarketProfiles[j])) {
					new StringBuffer().append("PaySMS. Found valid the FR Open Market profile: ")
							.append(PaySMS.profilesData[h][0]);
					return 6;
				}
			}
			for (int k = 0; k < PaySMS.telkomselProfiles.length; ++k) {
				if (profileID != null && profileID.equals(PaySMS.telkomselProfiles[k])) {
					new StringBuffer().append("PaySMS. Found valid the Indonesia Telkomsel profile: ")
							.append(PaySMS.profilesData[h][0]);
					return 11;
				}
			}
			final String s;
			if ((s = PaySMS.profilesData[h][2]) == null) {
				return 8;
			}
			final String countryCode = s.substring(s.indexOf(40) + 1, s.lastIndexOf(58)).trim();
			new StringBuffer().append("PaySMS. Country unlockCode ").append(countryCode);
			if (PaySMS.profilesData[h][6].equals("SMS")) {
				
				// Germany
				if (countryCode.equals("49:DE")) {
					return 2;
				}
				
				// Dunno these 2
				if (countryCode.equals("45:DK")) {
					return 4;
				}
				if (countryCode.equals("43:AT")) {
					return 5;
				}
				
				// India
				if (countryCode.equals("91:IN")) {
					return 7;
				}
				
				// Spain
				if (countryCode.equals("34:ES")) {
					return 0;
				}
				
				// Great Britain
				if (countryCode.equals("44:GB")) {
					return 10;
				}
				
				// Venezuela
				if (countryCode.equals("58:VE")) {
					return 12;
				}
			}
			if (countryCode.equals("34:ES") && PaySMS.profilesData[h][6].equals("HTTP")) {
				return 9;
			}
		} catch (final Exception obj) {
			new StringBuffer().append("PaySMS. GetSpecialFlow,  Exception: ").append(obj);
		}
		return 8;
	}
	
	/** 
	 * Finds the price using a price point.
	* parameter - int pricepoint: Your price point
	* returns int: your price
	*/
	public static int findPrice(final int pricepoint) {
		if (GetSpecialFlow() == 6) {
			if (PaySMS.currentValidProfiles == null) {
				return 0;
			}
			for (int i = 0; i < PaySMS.currentValidProfiles.size(); ++i) {
				final int j = ((Integer) PaySMS.currentValidProfiles.elementAt(i)).intValue();
				try {
					if (Integer.parseInt(PaySMS.profilesData[j][14]) == pricepoint) {
						final long sub_7695 = sub_7695(PaySMS.profilesData[j][9]);
						new StringBuffer().append("Fixed price : ").append(PaySMS.profilesData[j][9]);
						if (sub_7695 > 500000L) {
							new StringBuffer().append("Found Price greater than 5 Euros : ")
									.append(PaySMS.profilesData[j][9]);
							return 1;
						}
						break;
					}
				} catch (final Exception ex) {
				}
			}
		}
		return 0;
	}

	/**
	 *  Gets the support URL from your JAD. (URL-SUPPORT)
	* returns String your support url.
	*/
	public static String getFullSupportUrl() {
		try {
			final String supportUrl = GLLib.s_application.getAppProperty("URL-SUPPORT");
			if (supportUrl == null) {
				return null;
			}
			final String moneySpent = rmsLoad(PaySMS.RMS_RECORDS[7]);
			if (moneySpent == null || moneySpent.equals("")) {
				return supportUrl;
			}
			return supportUrl
					+ "&extra_1=" + GLLib.GetHexString(GLLib
							.XXTEA_Encrypt(moneySpent.substring(0, moneySpent.indexOf(95)).getBytes(), "a8bc1a23a89", true))
					+ "&extra_2=" + moneySpent.substring(moneySpent.indexOf(95) + 1);
		} catch (final Exception ex) {
			return null;
		}
	}

	private static long sub_7695(String str) {
		final int index;
		if ((index = (str = str.replace((char) 44, (char) 46)).indexOf(PaySMS.currencySeparator)) == -1) {
			return getAmountFromStr(str) * 100000L;
		}
		final long n = getAmountFromStr(str.substring(0, index)) * 100000L;
		for (str = str.substring(index + 1); str.length() < "100000".length() - 1; str += "0") {
		}
		return n + getAmountFromStr(str);
	}

	private static int getAmountFromStr(final String string) {
		try {
			return Integer.parseInt(string);
		} catch (final Exception ex) {
			return -1;
		}
	}

	private static boolean equalsIgnoreCase(final String s1, final String s2) {
		if (s1 == null || s2 == null) {
			new StringBuffer().append("PaySMS.equalsIgnoreCase: s1 = '").append(s1).append("', s2 = '").append(s2)
					.append("'");
			return false;
		}
		return s1.toUpperCase().equals(s2.toUpperCase());
	}
	
	// IDRN to do docs for getters and setters
	static String getDebugNumber() {
		return PaySMS.debugNum;
	}

	static String getOverrideFromJad() {
		return PaySMS.overrideFromJad;
	}

	static String setShortCode(final String shortCode) {
		return PaySMS.shortCode = shortCode;
	}

	static String getProperty(final String prop) {
		return getAppProperty(prop);
	}

	static String getShortCode() {
		return PaySMS.shortCode;
	}

	static int getCurrentProfile() {
		return PaySMS.currentProfile;
	}

	static String[][] getProfilesData() {
		return PaySMS.profilesData;
	}

	static boolean setIsSms(final boolean isSms) {
		return PaySMS.isSMSSent = isSms;
	}

	static boolean setNotSendingSMS() {
		return PaySMS.isSMSBeingSent = false;
	}

	static int setErrorCode(final int code) {
		return PaySMS.errorCode = code;
	}

	static String getSmsContent() {
		return PaySMS.smsContent;
	}

	static Timer setTimer(final Timer timer) {
		return PaySMS.timer = timer;
	}

	static Timer getTimer() {
		return PaySMS.timer;
	}

	static String getCode() {
		return PaySMS.unlockCode;
	}

	static long addToSmsCount() {
		return PaySMS.smsCount++;
	}

	static long getSmsCount() {
		return PaySMS.smsCount;
	}

	static Vector getCurrentValidProfiles() {
		return PaySMS.currentValidProfiles;
	}
	
	static void storeProfile(final Vector vector) {
		storeProfileID(vector);
	}

	static {
		PaySMS.s_midletInstance = null;
		PaySMS.itemAmount = -1;
		PaySMS.itemType = "";
		PaySMS.pricePoint = -1;
		PaySMS.s_language = "";
		PaySMS.VERSION = "PaySMS.IAP.Version:1.1.8";
		PaySMS.var_299d = false;
		PaySMS.profilesData = null;
		PaySMS.var_29ad = false;
		PaySMS.var_29b5 = null;
		PaySMS.profilesConfig = null;
		PaySMS.profilesTexts = null;
		PaySMS.currentAutoDetectedRegion = -1;
		PaySMS.currentValidProfiles = null;
		PaySMS.var_29dd = -1;
		PaySMS.carrierNames = null;
		PaySMS.regionId = -1;
		PaySMS.profilesAndRegions = null;
		PaySMS.var_29fd = null;
		PaySMS.debugNum = null;
		PaySMS.debugMnc = null;
		PaySMS.smsProperty = null;
		PaySMS.var_2a1d = null;
		PaySMS.igpCode = null;
		PaySMS.phoneModel = null;
		PaySMS.downloadCode = null;
		PaySMS.smsContent = "";
		PaySMS.unlockCode = "";
		PaySMS.currentProfile = -1;
		PaySMS.smsCount = 1L;
		RMS_RECORDS = new String[] { "rmsSMS", "Cm1zY2", "rmsPackageId", "rmsAvailableProfiles", "rmsRedeemUnlocked",
				"rmsItemType", "rmsUnlocked", "rmsMoneySpent", "rmsCurrentRegion", "rmsCurrentCarrier", "Cm1zY1",
				"rmsSMSCnt" };
		PaySMS.var_2a65 = false;
		PaySMS.isSMSSent = false;
		PaySMS.isSMSBeingSent = false;
		PaySMS.redeemUnlocked = false;
		PaySMS.var_2a85 = false;
		PaySMS.overrideFromJad = "";
		PaySMS.shortCode = "";
		PaySMS.profIDPricePoint = "";
		PaySMS.pricePointAlias = "";
		PaySMS.var_2aad = "";
		PaySMS.billingUrl = "";
		PaySMS.billingType = "";
		PaySMS.profilesFile = "/IAP_profiles";
		PaySMS.textFile = "/IAP_texts";
		PaySMS.timer = null;
		PaySMS.conn = null;
		PaySMS.connClosed = false;
		PaySMS.unkBool = false;
		PaySMS.var_2af5 = 0;
		PaySMS.errorCode = 0;
		PaySMS.var_2b05 = "933";
		PaySMS.var_2b0d = "5023";
		PaySMS.var_2b15 = "5025";
		PaySMS.iapTestField = "";
		PaySMS.testProfile = "";
		PaySMS.currencys = new String[] { "Cash", "Coin" };
		PaySMS.validContentIds = null;
		PaySMS.cashVector = null;
		PaySMS.coinVector = null;
		PaySMS.var_2b4d = null;
		PaySMS.creditCardEnabled = false;
		//PaySMS.var_2b5d = false;
		PaySMS.turkeyProfiles = new String[] { "2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509",
				"3511" };
		PaySMS.openMarketProfiles = new String[] { "1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878" };
		PaySMS.telkomselProfiles = new String[] { "1104", "1106", "1108", "1110" };
		PaySMS.var_2b7d = new int[] { 100, 110, 120, 130, 140, 150 };
		PaySMS.var_2b85 = new int[] { 199, 399, 999, 1999, 2999, 3999 };
		PaySMS.contentIDAmnt = 4;
		PaySMS.currencySeparator = '.';
	}
}
