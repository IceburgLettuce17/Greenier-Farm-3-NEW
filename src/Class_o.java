import java.util.Random;
import javax.microedition.rms.RecordStore;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import javax.wireless.messaging.MessageConnection;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class Class_o
{
    private static MIDlet application;
    static int var_2965;
    static String itemType;
    static int pricePoint;
    private static String language;
    private static String VERSION;
    private static Class_d var_298d;
    private static int var_2995;
    private static boolean var_299d;
    private static String[][] var_29a5;
    private static boolean var_29ad;
    private static Vector[] var_29b5;
    private static String[][] var_29bd;
    private static String[][] var_29c5;
    private static int var_29cd;
    private static Vector currentValidProfiles;
    private static int var_29dd;
    private static String[] var_29e5;
    private static int var_29ed;
    private static String[][] var_29f5;
    private static String[] var_29fd;
    private static String debugNum;
    private static String debugMnc;
    private static String smsProperty;
    private static String var_2a1d;
    private static String igpCode;
    private static String phoneModel;
    private static String var_2a35;
    private static String var_2a3d;
    private static String var_2a45;
    private static int currentProfile;
    private static long var_2a55;
    public static final String[] rmsNames;
    private static boolean var_2a65;
    private static boolean var_2a6d;
    private static boolean var_2a75;
    private static boolean var_2a7d;
    private static boolean var_2a85;
    private static String overrideFromJad;
    private static String var_2a95;
    private static String var_2a9d;
    private static String var_2aa5;
    private static String var_2aad;
    private static String billingUrl;
    private static String billingType;
    private static String profilesFile;
    private static String textFile;
    private static Timer var_2ad5;
    public static MessageConnection var_2add;
    public static boolean var_2ae5;
    public static boolean var_2aed;
    private static int var_2af5;
    private static int var_2afd;
    private static String var_2b05;
    private static String var_2b0d;
    private static String var_2b15;
    private static String iapTestField;
    private static String useTestProfile;
    private static String[] currencys;
    private static Vector validContentIds;
    private static Vector var_2b3d;
    private static Vector var_2b45;
    private static String[] var_2b4d;
    private static boolean creditCardEnabled;
    private static boolean var_2b5d;
    private static String[] var_2b65;
    private static String[] var_2b6d;
    private static String[] var_2b75;
    private static int[] var_2b7d;
    private static int[] var_2b85;
    private static int var_2b8d;
    private static char var_2b95;
    
    private static String sub_2bd4(final String s, int i, final char c) {
        int srcBegin = 0;
        final int n = i;
        int srcEnd = s.indexOf(124, 1);
        while (i > 0) {
            if (srcBegin == -1) {
                return null;
            }
            srcBegin = srcEnd;
            srcEnd = s.indexOf(124, srcBegin + 1);
            --i;
        }
        if (srcBegin == -1) {
            return null;
        }
        if (srcEnd == -1) {
            srcEnd = s.length();
        }
        if (n > 0) {
            ++srcBegin;
        }
        if (srcBegin == srcEnd) {
            return "";
        }
        if (srcBegin > srcEnd) {
            return null;
        }
        try {
            final char[] array = new char[srcEnd - srcBegin];
            s.getChars(srcBegin, srcEnd, array, 0);
            return new String(array);
        }
        catch (final IndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    public static void sub_2ce9(final String language) {
        Class_o.language = language;
        Class_o.application = GLLib.s_application;
        Class_o.var_2afd = 0;
        if (Class_o.currentValidProfiles == null) {
            Class_o.currentValidProfiles = new Vector();
        }
        if (Class_o.var_29c5 == null) {
            Class_o.var_29c5 = loadSpecificTextsFile();
        }
        Class_o.var_29f5 = sub_67fc();
        Class_o.var_2a6d = sub_6cf3();
        Class_o.var_2a7d = sub_6d38();
        if ((Class_o.var_2a45 = sub_6d7d()).equals("")) {
            Class_o.var_2a45 = sub_6f82();
            rmsSave(Class_o.rmsNames[1], Class_o.var_2a45);
        }
        Class_o.var_2a55 = sub_6dba();
        Class_o.var_299d = true;
        if (Class_o.VERSION != null) {
            Class_o.VERSION += "";
        }
        if (!sub_6e52() && getTestFieldInt() == 0 && Class_o.var_29ad && sub_498c()) {
            sub_4436();
        }
        sub_568e();
    }
    
    private static boolean sub_2dde() {
        if (Class_o.var_298d.var_68f) {
            return false;
        }
        if (Class_o.var_298d.var_69f) {
            return true;
        }
        if (Class_o.var_298d.var_67f != null && Class_o.var_298d.var_67f != "") {
            final String sub_2bd4 = sub_2bd4(Class_o.var_298d.var_67f, 0, '|');
            try {
                if (sub_2bd4.equals("FAILURE")) {
                    Class_o.var_2995 = Integer.parseInt(sub_2bd4(Class_o.var_298d.var_67f, 1, '|'));
                    return true;
                }
            }
            catch (final NumberFormatException ex) {
                Class_o.var_2995 = 40;
                final String sub_2bd5;
                if ((sub_2bd5 = sub_2bd4(Class_o.var_298d.var_67f, 1, '|')).indexOf("PB") != -1) {
                    try {
                        Class_o.var_2995 = Integer.parseInt(sub_2bd5.substring(2, sub_2bd5.length()));
                    }
                    catch (final NumberFormatException ex2) {}
                }
                return true;
            }
            if (sub_2bd4.equals("SUCCESS")) {
                Class_o.var_2a45 = sub_2bd4(Class_o.var_298d.var_67f, 2, '|');
                Class_o.var_2995 = 0;
                return true;
            }
        }
        Class_o.var_2995 = 40;
        return true;
    }
    
    public static boolean parseJadFields() {
        Class_o.var_2b8d = 6;
        final String unlocked = rmsLoad(Class_o.rmsNames[6]);
        boolean isUnlocked;
        if (unlocked != null && !unlocked.equals("1") && unlocked.equals("0")) {
            isUnlocked = false;
            Class_o.var_2afd = -10;
        }
        else {
            Class_o.application = GLLib.s_application;
            if ((Class_o.overrideFromJad = getAppProperty("IAP-OverrideFromJad")).equals("1")) {
                if ((Class_o.billingType = getAppProperty("IAP-BillingType").toUpperCase()).equals("HTTP")) {
                    if ((Class_o.billingUrl = getAppProperty("IAP-BillingURL")).equals("")) {
                        Class_o.overrideFromJad = "0";
                    }
                }
                else if (!Class_o.billingType.equals("SMS")) {
                    Class_o.overrideFromJad = "0";
                }
            }
            getAppProperty("IAP-Version");
            boolean hasIGPCode;
            if ((Class_o.igpCode = getAppProperty("IAP-GameCodeIGP")).length() == 0) {
                hasIGPCode = false;
            }
            else {
                if ((Class_o.phoneModel = getAppProperty("IAP-PhoneModel")).length() == 0) {
                    Class_o.phoneModel = "5477";
                }
                if ((Class_o.iapTestField = getAppProperty("IAP-Test")).length() == 0) {
                    Class_o.iapTestField = "0";
                }
                if (getTestFieldInt() != 0) {
                    if (getTestFieldInt() == 1) {
                        Class_o.useTestProfile = Class_o.var_2b05;
                    }
                    else if (getTestFieldInt() == 2) {
                        Class_o.useTestProfile = Class_o.var_2b0d;
                    }
                    else {
                        Class_o.iapTestField = "0";
                        Class_o.useTestProfile = "";
                    }
                }
                new StringBuffer().append("PaySMS.parseJadFields:iapTestField: ").append(Class_o.iapTestField).append(" useTestProfile: ").append(Class_o.useTestProfile);
                Class_o.debugNum = getAppProperty("IAP-DebugNumber");
                final String smsProp;
                if ((smsProp = System.getProperty("wireless.messaging.sms.smsc")) != null && smsProp.length() > 0) {
                    Class_o.smsProperty = smsProp;
                }
                final String debugSmsCenter = getAppProperty("IAP-DebugSMSCenter");
                Class_o.debugMnc = getAppProperty("IAP-DebugMNC");
                if (!debugSmsCenter.equals("")) {
                    Class_o.smsProperty = debugSmsCenter;
                }
                if (!Class_o.debugMnc.equals("")) {
                    Class_o.var_2a1d = Class_o.debugMnc;
                }
                Class_o.var_2a35 = getAppProperty("Download-Code");
                if (getAppProperty("IAP-EnableCreditCard").equals("1")) {
                    Class_o.creditCardEnabled = true;
                }
                Class_o.validContentIds = new Vector();
                Class_o.var_2b3d = new Vector();
                Class_o.var_2b45 = new Vector();
                for (int i = 0; i < Class_o.currencys.length; ++i) {
                    for (int j = 1; j <= Class_o.var_2b8d; ++j) {
                        final String contentID;
                        if ((contentID = getAppProperty("IAP-ContentID-" + Class_o.currencys[i] + "-" + j)) != null && !contentID.equals("")) {
                            Class_o.validContentIds.addElement(contentID);
                        }
                    }
                }
                new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(Class_o.validContentIds);
                for (int k = 0; k < Class_o.validContentIds.size(); ++k) {
                    final String obj = (String)Class_o.validContentIds.elementAt(k);
                    boolean b2 = false;
                    for (int l = k + 1; l < Class_o.validContentIds.size(); ++l) {
                        if (Class_o.validContentIds.elementAt(l).equals(obj)) {
                            b2 = true;
                            Class_o.validContentIds.removeElementAt(l);
                            --l;
                        }
                    }
                    if (b2) {
                        Class_o.validContentIds.removeElementAt(k);
                        --k;
                    }
                }
                if (Class_o.validContentIds.size() == 0) {
                    hasIGPCode = false;
                }
                else {
                    new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(Class_o.validContentIds);
                    String str;
                    if ((str = getAppProperty("IAP-Profiles")).equals("")) {
                        hasIGPCode = false;
                    }
                    else {
                        if (str.length() > 0 && str.charAt(str.length() - 1) != ';') {
                            str += ";";
                        }
                        final String[] sub_6617;
                        if ((sub_6617 = sub_6617(str)) == null) {
                            hasIGPCode = false;
                        }
                        else if (!loadProfileConfiguration(null, sub_6617, readFile(Class_o.profilesFile))) {
                            hasIGPCode = Class_o.creditCardEnabled;
                        }
                        else {
                            Class_o.var_29ad = true;
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
        boolean retbool;
        if (getTestFieldInt() != 0) {
            retbool = true;
        }
        else if (Class_o.creditCardEnabled && (Class_o.var_29a5 == null || Class_o.var_29a5.length == 0)) {
            retbool = true;
        }
        else if (Class_o.var_29a5.length == 1) {
            retbool = true;
        }
        else if (Class_o.var_29a5.length > 1) {
            final String s = Class_o.var_29a5[0][2];
            final String s2 = Class_o.var_29a5[0][3];
            retbool = true;
            for (int i = 1; i < Class_o.var_29a5.length; ++i) {
                final String anObject = Class_o.var_29a5[i][2];
                final String anObject2 = Class_o.var_29a5[i][3];
                if (!s.equals(anObject) || !s2.equals(anObject2)) {
                    retbool = false;
                    break;
                }
            }
        }
        else {
            retbool = false;
        }
        new StringBuffer().append("PaySMS.checkAvailable:validProfiles: ").append(retbool ? "true" : "false");
        return retbool;
    }
    
    public static boolean sub_34dd() {
        Class_o.var_2a6d = sub_6cf3();
        Class_o.var_2a7d = sub_6d38();
        return Class_o.var_2a6d || Class_o.var_2a7d;
    }
    
    public static void sendRequest(final int pricePoint, String itemType) {
        new StringBuffer().append("PaySMS.sendRequest: start (PricePoint:").append(pricePoint).append(") (Item Type: ").append(itemType).append(")");
        Class_o.pricePoint = pricePoint;
        Class_o.var_2965 = sub_59b0(pricePoint, itemType);
        Class_o.itemType = itemType;
        boolean b = false;
        String type = "";
        if (Class_o.overrideFromJad.equals("1")) {
            type = Class_o.billingType;
        }
        else {
            if (getTestFieldInt() != 0) {
                Class_o.var_29a5 = Class_o.var_29bd;
                if (getTestFieldInt() == 1) {
                    type = "SMS";
                }
                else if (getTestFieldInt() == 2) {
                    type = "HTTP";
                }
                for (int i = 0; i < Class_o.var_29a5.length; ++i) {
                    if (Class_o.var_29a5[i][0].equals(Class_o.useTestProfile)) {
                        Class_o.currentProfile = i;
                        b = true;
                        break;
                    }
                }
            }
            else {
                new StringBuffer().append("PaySMS.sendRequest: currentValidProfiles: ").append((Class_o.currentValidProfiles == null) ? "null" : ("Size: " + Class_o.currentValidProfiles.size()));
                if (Class_o.currentValidProfiles == null || Class_o.currentValidProfiles.size() == 0) {
                    Class_o.currentProfile = -1;
                }
                else {
                    Class_o.currentProfile = 0;
                    for (int j = 0; j < Class_o.currentValidProfiles.size(); ++j) {
                        final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(j)).intValue();
                        try {
                            if (Integer.parseInt(Class_o.var_29a5[intValue][14]) == pricePoint) {
                                Class_o.currentProfile = intValue;
                                b = true;
                                type = Class_o.var_29a5[Class_o.currentProfile][6];
                                break;
                            }
                        }
                        catch (final Exception ex) {
                            Class_o.currentProfile = 0;
                        }
                    }
                }
            }
            new StringBuffer().append("PaySMS.sendRequest: currentProfile: ").append(Class_o.currentProfile);
            if (b && Class_o.currentProfile != -1) {
                new StringBuffer().append("PaySMS.sendRequest: Id: ").append(Class_o.var_29a5[Class_o.currentProfile][0]).append(" Billing: ").append(Class_o.var_29a5[Class_o.currentProfile][6]).append(" Region: ").append(Class_o.var_29a5[Class_o.currentProfile][2]).append(" Carrier: ").append(Class_o.var_29a5[Class_o.currentProfile][3]).append(" Pricepoint: ").append(Class_o.var_29a5[Class_o.currentProfile][14]);
            }
        }
        if (!Class_o.var_299d) {
            return;
        }
        new StringBuffer().append("creditCardEnabled: ").append(Class_o.creditCardEnabled);
        if (b && type.equals("SMS")) {
            Class_o.var_2a65 = true;
            Class_o.var_2a6d = false;
            rmsSave(Class_o.rmsNames[0], "0");
            Class_o.var_2a3d = "";
            if (Class_o.overrideFromJad.equals("1")) {
                Class_o.var_2aa5 = getAppProperty("IAP-Alias-PP" + Class_o.pricePoint);
            }
            else {
                Class_o.var_2aa5 = "";
            }
            if (!Class_o.var_2aa5.equals("")) {
                sub_4c7d(Class_o.var_2aa5);
            }
            else if (Class_o.currentProfile != -1 && !Class_o.var_29a5[Class_o.currentProfile][10].equals("")) {
                sub_4c7d(Class_o.var_29a5[Class_o.currentProfile][10]);
            }
            if (Class_o.var_29a5[Class_o.currentProfile][12].equals("7")) {
                sub_4c7d("UNLOCK");
            }
            else {
                sub_4c7d("INAPP");
            }
            sub_4c7d("V009");
            sub_4c7d(Class_o.igpCode);
            sub_4c7d(Class_o.var_2a45);
            sub_4c7d(Class_o.phoneModel);
            if (Class_o.overrideFromJad.equals("1")) {
                Class_o.var_2a9d = getAppProperty("IAP-ProfileID-PP" + Class_o.pricePoint);
            }
            else {
                Class_o.var_2a9d = "";
            }
            if (!Class_o.var_2a9d.equals("")) {
                sub_4c7d(Class_o.var_2a9d);
            }
            else {
                if (Class_o.currentProfile == -1) {
                    Class_o.var_2afd = 7;
                    return;
                }
                sub_4c7d(Class_o.var_29a5[Class_o.currentProfile][0]);
            }
            if (!Class_o.language.equals("")) {
                sub_4c7d(Class_o.language);
            }
            else {
                sub_4c7d("EN");
            }
            if (Class_o.var_29a5[Class_o.currentProfile][12].equals("7")) {
                sub_4c7d("7");
            }
            else {
                sub_4c7d("1");
            }
            final String sub_5e3c;
            if (!(sub_5e3c = getAppProperty("IAP-ContentID-" + Class_o.itemType + "-" + Class_o.pricePoint)).equals("")) {
                sub_4c7d(sub_5e3c);
                sub_4c7d(Class_o.var_2a35);
                sub_4c7d("ct" + Class_o.var_2a55);
                new StringBuffer().append("PaySMS.sendSMS: smsContent: ").append(Class_o.var_2a3d);
                Class_o.var_2a75 = true;
                new Class_c().start();
                return;
            }
            new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(Class_o.itemType).append("-").append(Class_o.pricePoint).append(" missing in JAD");
            Class_o.var_2afd = -2;
        }
        else if (b && type.equals("HTTP")) {
            Class_o.var_298d = new Class_d(false);
            String str2;
            if (Class_o.overrideFromJad.equals("1")) {
                str2 = Class_o.billingUrl;
                itemType = (Class_o.var_2a9d = getAppProperty("IAP-ProfileID-PP" + Class_o.pricePoint));
            }
            else {
                if (Class_o.currentProfile == -1) {
                    Class_o.var_2afd = 7;
                    return;
                }
                str2 = Class_o.var_29a5[Class_o.currentProfile][11];
                itemType = Class_o.var_29a5[Class_o.currentProfile][0];
            }
            if (str2.equals("") || itemType.equals("")) {
                Class_o.var_2afd = 4;
                return;
            }
            new StringBuffer().append("PaySMS.sendHTTP: URL = ").append(str2);
            if (!str2.startsWith("http://")) {
                str2 = "http://" + str2;
            }
            if (!str2.endsWith("?")) {
                str2 += "?";
            }
            final String sub_5e3c2;
            if ((sub_5e3c2 = getAppProperty("IAP-ContentID-" + Class_o.itemType + "-" + Class_o.pricePoint)).equals("")) {
                new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(Class_o.itemType).append("-").append(Class_o.pricePoint).append(" missing in JAD");
                Class_o.var_2afd = -2;
                return;
            }
            final String s = str2;
            final String s2 = sub_5e3c2;
            final String s3 = itemType;
            final String var_2a25 = Class_o.igpCode;
            final String var_2a26 = Class_o.var_2a45;
            final String var_2a27 = Class_o.var_2a35;
            final String var_2a2d = Class_o.phoneModel;
            final String str3 = var_2a27;
            final String str4 = var_2a26;
            final String str5 = var_2a25;
            final String str6 = s3;
            itemType = s2;
            final String s4 = s;
            Class_o.var_298d.sub_71b();
            final String s5 = "%7C";
            final String s6 = s4;
            String s7 = "b=contentpurchase" + s5 + str5 + s5 + itemType + s5 + str6 + s5 + str4;
            if (!str3.equals("")) {
                s7 = s7 + "&d=" + str3;
            }
            final String string = s7 + "&phoneId=" + var_2a2d;
            Class_o.var_2995 = -100;
            Class_o.var_298d.sub_895(s6, string);
            rmsSave(Class_o.rmsNames[1], Class_o.var_2a45);
            rmsSave(Class_o.rmsNames[2], String.valueOf(Class_o.var_2965));
            rmsSave(Class_o.rmsNames[5], Class_o.itemType);
            if (!Class_o.overrideFromJad.equals("1")) {
                sub_6ef9(Class_o.currentValidProfiles);
            }
            Class_o.var_2af5 = 1;
        }
        else {
            if (Class_o.creditCardEnabled && Class_o.currentProfile == -1) {
                sub_4aec(pricePoint, itemType);
                return;
            }
            if (Class_o.creditCardEnabled) {
                sub_4aec(pricePoint, itemType);
                return;
            }
            Class_o.var_2afd = -2;
        }
    }
    
    public static void sub_3e56() {
        Class_o.var_2a7d = true;
        rmsSave(Class_o.rmsNames[4], "1");
        final int sub_4060 = sub_4060();
        final String sub_6e15 = sub_6e15();
        sendRequest(sub_591c(sub_4060, sub_6e15), sub_6e15);
    }
    
    public static int sub_3e90() {
        if (Class_o.var_2a85) {
            Class_o.var_2a85 = false;
            return 7;
        }
        if (!Class_o.var_299d) {
            return 0;
        }
        if (Class_o.var_2a6d) {
            return 2;
        }
        if (Class_o.var_2a75) {
            return 1;
        }
        if (Class_o.var_2a65 || Class_o.var_2a7d) {
            if (Class_o.var_2a7d) {
                Class_o.var_2a65 = false;
                Class_o.var_2a6d = true;
                rmsSave(Class_o.rmsNames[0], "1");
                return 8;
            }
            sub_437f();
            return 3;
        }
        else {
            if (Class_o.var_2af5 != 1) {
                if (!Class_o.overrideFromJad.equals("1") && getTestFieldInt() == 0) {
                    if (Class_o.var_2afd != 0) {
                        return 3;
                    }
                    if ((Class_o.currentValidProfiles == null || Class_o.currentValidProfiles.size() < 1) && (!Class_o.creditCardEnabled || Class_o.var_29ad)) {
                        if (Class_o.var_29ed < 0) {
                            Class_o.var_2afd = -3;
                            return 3;
                        }
                        if (Class_o.currentValidProfiles.size() < 1) {
                            Class_o.var_2afd = -3;
                            return 3;
                        }
                    }
                }
                return 6;
            }
            if (!sub_2dde()) {
                return 1;
            }
            Class_o.var_2af5 = 0;
            int var_2995;
            final int n = Class_o.var_298d.var_68f ? (var_2995 = -1) : (Class_o.var_298d.var_69f ? (var_2995 = -2) : (var_2995 = Class_o.var_2995));
            final int var_2afd = var_2995;
            if (n == 0) {
                if (sub_40d2(Integer.parseInt(Class_o.var_2a45))) {
                    Class_o.var_2afd = 0;
                    sub_437f();
                    return 7;
                }
                Class_o.var_2afd = 1;
                sub_437f();
                return 3;
            }
            else {
                if (var_2afd == -2) {
                    Class_o.var_2afd = -1;
                    sub_437f();
                    return 3;
                }
                Class_o.var_2afd = var_2afd;
                sub_437f();
                return 3;
            }
        }
    }
    
    public static int sub_4042() {
        return Class_o.var_2afd;
    }
    
    public static int sub_4060() {
        final String sub_6b21;
        if ((sub_6b21 = rmsLoad(Class_o.rmsNames[2])) == null || sub_6b21.length() == 0) {
            return -1;
        }
        int int1;
        try {
            int1 = Integer.parseInt(sub_6b21);
        }
        catch (final Exception ex) {
            int1 = -1;
        }
        return int1;
    }
    
    public static boolean sub_40d2(int c) {
        boolean equals = false;
        if ((Class_o.var_2a45 = sub_6d7d()) != null && Class_o.var_2a45.length() > 0) {
            equals = String.valueOf(c).equals(String.valueOf(Integer.parseInt(Class_o.var_2a45) ^ 0xD0A4));
        }
        new StringBuffer().append("PaySMS.verifyRequest: inputCode: ").append(c).append(" ").append(equals ? "Unlocked" : "Still Locked");
        if (equals) {
            try {
                final String sub_6b21 = rmsLoad(Class_o.rmsNames[7]);
                String substring = "0";
                if (sub_6b21 != null && !sub_6b21.equals("")) {
                    substring = sub_6b21.substring(0, sub_6b21.indexOf(95));
                }
                c = sub_4060();
                c = sub_591c(c, sub_6e15());
                final String sub_5260 = sub_5260(0, c);
                final String sub_5261 = sub_5260(9, c);
                final String s = substring;
                final String s2 = sub_5261;
                final String replace = s.replace(',', '.');
                final String replace2 = s2.replace(',', '.');
                final long sub_5262 = sub_7695(replace);
                final long sub_5263 = sub_7695(replace2);
                final String s3 = replace;
                final String s4 = replace2;
                c = ((s3.indexOf(Class_o.var_2b95) != -1 || s4.indexOf(Class_o.var_2b95) != -1) ? Class_o.var_2b95 : ' ');
                final long n = sub_5262 + sub_5263;
                final String s5 = (c == 32) ? (n / 100000L + "") : ("" + n / 100000L + (char)c + n % 100000L);
                new StringBuffer().append("totalMoneySpent : ").append(s5).append("  profileID: ").append(sub_5260);
                rmsSave(Class_o.rmsNames[7], s5 + "_" + sub_5260);
            }
            catch (final Exception obj) {
                new StringBuffer().append("Exception : ").append(obj);
            }
            Class_o.var_2afd = 0;
            if (!sub_532f(sub_4060()).equals("http_2d")) {
                Class_o.var_2a85 = true;
            }
            sub_437f();
        }
        return equals;
    }
    
    private static void sub_437f() {
        Class_o.var_2a75 = false;
        Class_o.var_2a65 = false;
        Class_o.var_299d = false;
        rmsSave(Class_o.rmsNames[1], "");
        Class_o.var_2a6d = false;
        rmsSave(Class_o.rmsNames[0], "0");
        Class_o.var_2a7d = false;
        rmsSave(Class_o.rmsNames[4], "0");
        Class_o.var_2b5d = false;
    }
    
    public static void sub_43d0() {
        Class_o.var_29cd = -1;
        Class_o.var_29ed = -1;
        Class_o.currentValidProfiles = null;
        Class_o.var_2a85 = false;
        rmsSave(Class_o.rmsNames[2], "");
        rmsSave(Class_o.rmsNames[5], "");
        rmsSave(Class_o.rmsNames[3], "");
        rmsSave(Class_o.rmsNames[8], "");
        rmsSave(Class_o.rmsNames[9], "");
        Class_o.var_2a1d = null;
        sub_437f();
    }
    
    private static boolean sub_4436() {
        if (Class_o.currentValidProfiles == null) {
            Class_o.currentValidProfiles = new Vector();
        }
        if (Class_o.currentValidProfiles.size() == 1) {
            Class_o.currentProfile = ((Integer) Class_o.currentValidProfiles.elementAt(0)).intValue();
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ").append(Class_o.currentProfile);
            return true;
        }
        Class_o.var_29dd = -1;
        Class_o.currentProfile = -1;
        Class_o.currentValidProfiles.removeAllElements();
        final String[][] sub_4cc9;
        Class_o.var_29e5 = new String[(sub_4cc9 = sub_4cc9(Class_o.var_29f5[Class_o.var_29ed][0])).length];
        final String[] array = new String[sub_4cc9.length];
        for (int i = 0; i < sub_4cc9.length; ++i) {
            Class_o.var_29e5[i] = sub_4cc9[i][0];
            array[i] = sub_4cc9[i][1];
        }
        Class_o.var_29e5 = sub_70ca(Class_o.var_29e5);
        final String[] sub_70ca = sub_70ca(array);
        new StringBuffer().append("PaySMS.detectCarrier: currentIDS ").append(sub_70ca.length).append(", currentCarriers = ").append(Class_o.var_29e5.length);
        if (sub_70ca.length == 1) {
            Class_o.var_29dd = 0;
            for (int j = 0; j < Class_o.var_29a5.length; ++j) {
                if (Class_o.var_29a5[j][0].equals(sub_70ca[0])) {
                    Class_o.currentValidProfiles.addElement(new Integer(j));
                }
            }
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ").append(Class_o.currentValidProfiles.size());
            return true;
        }
        if (Class_o.var_29e5.length == 1) {
            Class_o.var_29dd = 0;
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ").append(Class_o.var_29e5[Class_o.var_29dd]);
            for (int k = 0; k < Class_o.var_29a5.length; ++k) {
                if (Class_o.var_29a5[k][2].indexOf(Class_o.var_29f5[Class_o.var_29ed][0]) != -1) {
                    for (int l = 0; l < Class_o.var_29b5[k].size(); ++l) {
                        if (((String)Class_o.var_29b5[k].elementAt(l)).indexOf(Class_o.var_29e5[Class_o.var_29dd]) != -1) {
                            Class_o.currentValidProfiles.addElement(new Integer(k));
                        }
                    }
                }
            }
            new StringBuffer().append("PaySMS.detectCarrier: currentValidProfiles.size =  ").append(Class_o.currentValidProfiles.size());
            return true;
        }
        if (Class_o.var_29e5.length >= 1) {
            final String[][] array2 = new String[sub_70ca.length][2];
            boolean b = true;
            for (int m = 0; m < sub_70ca.length; ++m) {
                new StringBuffer().append("PaySMS.detectCarrier: currentIDS[").append(m).append("]= ").append(sub_70ca[m]);
                int i2 = 0;
                while (i2 < Class_o.var_29a5.length) {
                    if (Class_o.var_29a5[i2][0].equals(sub_70ca[m])) {
                        array2[m][0] = Class_o.var_29a5[i2][3];
                        array2[m][1] = "" + i2;
                        new StringBuffer().append("PaySMS.detectCarrier: is Openmarket???? ").append(Class_o.var_29a5[i2][1]);
                        if (Class_o.var_29a5[i2][1].indexOf("Open Market") == -1) {
                            b = false;
                            break;
                        }
                        break;
                    }
                    else {
                        ++i2;
                    }
                }
            }
            boolean b2 = true;
            for (int n = 1; n < array2.length; ++n) {
                if (!array2[n][0].equals(array2[n - 1][0])) {
                    b2 = false;
                    new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(array2[n][0]);
                    new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ").append(array2[n - 1][0]);
                }
            }
            new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(b2).append(", isOpenMarket: ").append(b);
            if (b2) {
                for (int n2 = 0; n2 < sub_70ca.length; ++n2) {
                    for (int value = 0; value < Class_o.var_29a5.length; ++value) {
                        if (Class_o.var_29a5[value][0].equals(sub_70ca[n2])) {
                            Class_o.currentValidProfiles.addElement(new Integer(value));
                            break;
                        }
                    }
                }
                new StringBuffer().append("PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ").append(Class_o.currentValidProfiles.size());
                new StringBuffer().append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ").append(array2[0][0]);
                return true;
            }
            final int length = Class_o.var_29e5.length;
            for (int n3 = 0; n3 < length; ++n3) {
                Class_o.var_29e5[n3] = Class_o.var_29e5[n3].trim();
            }
            final int[] array3 = new int[length];
            for (int i3 = 0; i3 < length; ++i3) {
                array3[i3] = i3;
                new StringBuffer().append("PaySMS.detectCarrier: carrierNames[").append(i3).append("]: ").append(Class_o.var_29e5[i3]);
            }
        }
        return false;
    }
    
    private static boolean sub_498c() {
        if (Class_o.var_29cd != -1) {
            Class_o.var_29ed = Class_o.var_29cd;
            return true;
        }
        Class_o.var_29ed = -1;
        Class_o.currentProfile = -1;
        Class_o.currentValidProfiles = null;
        Class_o.var_29fd = new String[Class_o.var_29f5.length];
        for (int i = 0; i < Class_o.var_29fd.length; ++i) {
            Class_o.var_29fd[i] = Class_o.var_29f5[i][0];
        }
        if (Class_o.var_29fd.length == 1 && (Class_o.smsProperty == null || Class_o.var_29cd == -1)) {
            Class_o.var_29ed = 0;
            Class_o.var_29cd = 0;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, only one region: ").append(Class_o.var_29fd[Class_o.var_29ed]);
            return true;
        }
        if (Class_o.smsProperty != null && Class_o.var_29cd != -1) {
            Class_o.var_29ed = Class_o.var_29cd;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ").append(Class_o.var_29cd);
            return true;
        }
        for (int length = Class_o.var_29fd.length, j = 0; j < length - 1; ++j) {
            for (int k = j + 1; k < length; ++k) {
                if (Class_o.var_29fd[j].compareTo(Class_o.var_29fd[k]) > 0) {
                    final String s = Class_o.var_29fd[j];
                    Class_o.var_29fd[j] = Class_o.var_29fd[k];
                    Class_o.var_29fd[k] = s;
                }
            }
        }
        return false;
    }
    
    private static void sub_4aec(final int n, String str) {
        new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(n).append(" Type:").append(str);
        final String str2 = Class_o.var_2b4d[11];
        final String sub_5e3c;
        if ((sub_5e3c = getAppProperty("IAP-ContentID-" + str + "-" + n)).equals("")) {
            new StringBuffer().append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(str).append("-").append(n).append(" missing in JAD");
            Class_o.var_2afd = -2;
            return;
        }
        str = "";
        str = str + "?igpcode=" + Class_o.igpCode;
        str = str + "&content_id=" + sub_5e3c;
        str = str + "&tier=" + n;
        str = str + "&code=" + Class_o.var_2a45;
        str = str + "&d=" + Class_o.var_2a35;
        final String string = str2 + str;
        new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: ").append(string);
        final String s;
        if ((s = string) != null) {
            GLLib.sub_28bf(s);
        }
        rmsSave(Class_o.rmsNames[0], "1");
        rmsSave(Class_o.rmsNames[1], Class_o.var_2a45);
        rmsSave(Class_o.rmsNames[2], String.valueOf(Class_o.var_2965));
        rmsSave(Class_o.rmsNames[5], Class_o.itemType);
    }
    
    private static void sub_4c7d(final String str) {
        if (str != null) {
            Class_o.var_2a3d = Class_o.var_2a3d + str + " ";
        }
    }
    
    private static String[][] sub_4cc9(final String s) {
        final Vector vector = new Vector();
        for (int i = 0; i < Class_o.var_29a5.length; ++i) {
            if (Class_o.var_29a5[i][2].indexOf(s) != -1) {
                for (int j = 0; j < Class_o.var_29b5[i].size(); ++j) {
                    final String str = (String)Class_o.var_29b5[i].elementAt(j);
                    final String s2 = Class_o.var_29a5[i][0];
                    if (str != null) {
                        int n;
                        if ((n = str.indexOf(40)) == -1) {
                            n = str.length();
                        }
                        new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(s).append(", carrierName = ").append(str);
                        if ((Class_o.var_2a1d == null || sub_702c(str, Class_o.var_2a1d)) && !vector.contains(str.substring(0, n))) {
                            vector.addElement(new String[] { str.substring(0, n), s2 });
                        }
                    }
                }
            }
        }
        final String[][] anArray = new String[vector.size()][2];
        vector.copyInto(anArray);
        return anArray;
    }
    
    public static String sub_4e32(final int n) {
        return sub_4e51(n);
    }
    
    private static String sub_4e51(final int n) {
        new StringBuffer().append("PaySMS.getPrice: begin (").append(n).append(")");
        if (Class_o.overrideFromJad.equals("1")) {
            if ((Class_o.var_2aad = getAppProperty("IAP-Price-PP" + n)).equals("")) {
                return null;
            }
            return Class_o.var_2aad;
        }
        else {
            new StringBuffer().append("PaySMS.getPrice: currentValidProfiles: ").append((Class_o.currentValidProfiles == null) ? "NULL" : ("Size: " + Class_o.currentValidProfiles.size()));
            if (Class_o.currentValidProfiles == null) {
                if (Class_o.creditCardEnabled) {
                    return " ";
                }
                return null;
            }
            else {
                int i = -1;
                if (getTestFieldInt() == 0) {
                    for (int j = 0; j < Class_o.currentValidProfiles.size(); ++j) {
                        final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(j)).intValue();
                        try {
                            if (Integer.parseInt(Class_o.var_29a5[intValue][14]) == n) {
                                i = intValue;
                                break;
                            }
                        }
                        catch (final Exception ex) {}
                    }
                }
                else {
                    for (int k = 0; k < Class_o.var_29bd.length; ++k) {
                        if (Class_o.var_29bd[k][0].equals(Class_o.useTestProfile)) {
                            return Class_o.var_29bd[k][9];
                        }
                    }
                }
                new StringBuffer().append("PaySMS.getPrice: profileIndex: ").append(i);
                if (i != -1) {
                    return Class_o.var_29a5[i][4];
                }
                if (Class_o.creditCardEnabled) {
                    return " ";
                }
                return null;
            }
        }
    }
    
    public static long sub_5038(final long lng, final int i) {
        new StringBuffer().append("PaySMS.getVirtualCurrency: begin basecurrency ").append(lng).append(", pricepoint").append(i);
        long lng2 = 0L;
        if (getTestFieldInt() == 0 && Class_o.currentValidProfiles != null && Class_o.currentValidProfiles.size() > 0) {
            for (int j = 0; j < Class_o.currentValidProfiles.size(); ++j) {
                final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(j)).intValue();
                try {
                    if (Integer.parseInt(Class_o.var_29a5[intValue][14]) == i) {
                        lng2 = lng * Long.parseLong(Class_o.var_29a5[intValue][16]) / 10000000L;
                        lng2 += lng * Long.parseLong(Class_o.var_29a5[intValue][16]) % 10000000L / 5000000L;
                        break;
                    }
                }
                catch (final Exception ex) {}
            }
        }
        else {
            lng2 = lng * Class_o.var_2b85[i - 1] * Class_o.var_2b7d[i - 1] / (Class_o.var_2b85[0] * 100) + lng * Class_o.var_2b85[i - 1] * Class_o.var_2b7d[i - 1] % (Class_o.var_2b85[0] * 100) / (Class_o.var_2b85[0] * 100 >> 1);
        }
        final int length = ("" + lng2).length();
        int k = 1;
        if (length == 2) {
            k = 2;
        }
        else if (length > 2) {
            k = 5;
            for (int l = 0; l < length - 3; ++l) {
                k *= 10;
            }
        }
        new StringBuffer().append("currency:\t").append(lng2).append("\tRound Up:\t").append(k);
        if (lng2 % k != 0L) {
            lng2 = (lng2 / k + 1L) * k;
        }
        new StringBuffer().append("Rounded currency:\t").append(lng2);
        return lng2;
    }
    
    private static String sub_5260(final int n, final int i) {
        if (getTestFieldInt() == 0) {
            for (int j = 0; j < Class_o.currentValidProfiles.size(); ++j) {
                final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(j)).intValue();
                if (Class_o.var_29a5[intValue][14].equals(String.valueOf(i))) {
                    return Class_o.var_29a5[intValue][n];
                }
            }
        }
        else {
            for (int k = 0; k < Class_o.var_29bd.length; ++k) {
                if (Class_o.var_29bd[k][0].equals(Class_o.useTestProfile)) {
                    return Class_o.var_29bd[k][n];
                }
            }
        }
        return "";
    }
    
    private static String sub_532f(final int n) {
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
        new StringBuffer().append("PaySMS.GetBillingType: currentValidProfiles: ").append((Class_o.currentValidProfiles == null) ? "NULL" : ("Size: " + Class_o.currentValidProfiles.size()));
        if (Class_o.currentValidProfiles == null) {
            return "cc_2d";
        }
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < Class_o.currentValidProfiles.size(); ++i) {
            final int intValue = ((Integer)Class_o.currentValidProfiles.elementAt(i)).intValue();
            try {
                if (Integer.parseInt(Class_o.var_29a5[intValue][14]) == n) {
                    n2 = intValue;
                    b = true;
                    break;
                }
            }
            catch (final Exception ex) {}
        }
        if (!b) {
            return "cc_2d";
        }
        if (Class_o.var_29a5[n2][6].equals("SMS")) {
            return "sms_2d";
        }
        if (Class_o.var_29a5[n2][6].equals("HTTP")) {
            return "http_2d";
        }
        return null;
    }
    
    public static String sub_54b2() {
        new StringBuffer().append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append((Class_o.currentValidProfiles == null) ? "NULL" : ("Size: " + Class_o.currentValidProfiles.size()));
        if (Class_o.currentValidProfiles == null) {
            return null;
        }
        String str = null;
        String str2 = null;
        if (getTestFieldInt() == 0) {
            if (Class_o.currentValidProfiles.size() > 0) {
                final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(0)).intValue();
                try {
                    str = Class_o.var_29a5[intValue][13];
                    str2 = Class_o.var_29a5[intValue][15];
                }
                catch (final Exception ex) {}
            }
        }
        else if (Class_o.var_29bd.length > 0) {
            for (int i = 0; i < Class_o.var_29bd.length; ++i) {
                if (Class_o.var_29bd[i][0].equals(Class_o.useTestProfile)) {
                    str = Class_o.var_29bd[i][13];
                    break;
                }
            }
        }
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tncID = '").append(str).append("'");
        final String sub_5b32 = sub_5b32(str);
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc = '").append(sub_5b32).append("'");
        new StringBuffer().append("PaySMS.GetTermsAndConditions: supportNumber = '").append(str2).append("'");
        final String sub_5bf6 = sub_5bf6(sub_5b32, str2);
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc without phone number = '").append(sub_5bf6).append("'");
        return sub_5bf6;
    }
    
    public static int sub_5638(final String s) {
        if (s.equals("Cash")) {
            return Class_o.var_2b3d.size();
        }
        if (s.equals("Coin")) {
            return Class_o.var_2b45.size();
        }
        return -1;
    }
    
    private static void sub_568e() {
        Class_o.var_2b3d.removeAllElements();
        Class_o.var_2b45.removeAllElements();
        if (getTestFieldInt() == 0 && Class_o.currentValidProfiles != null && Class_o.currentValidProfiles.size() > 0) {
            for (int i = 0; i < Class_o.currentValidProfiles.size(); ++i) {
                final int int1;
                if (sub_5a7c(int1 = Integer.parseInt(Class_o.var_29a5[((Integer)Class_o.currentValidProfiles.elementAt(i)).intValue()][14]), "Cash")) {
                    Class_o.var_2b3d.addElement(new Integer(int1));
                }
                if (sub_5a7c(int1, "Coin")) {
                    Class_o.var_2b45.addElement(new Integer(int1));
                }
            }
        }
        else if (Class_o.creditCardEnabled || getTestFieldInt() != 0) {
            new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ").append(Class_o.creditCardEnabled);
            for (int j = 1; j <= Class_o.var_2b8d; ++j) {
                if (sub_5a7c(j, "Cash")) {
                    Class_o.var_2b3d.addElement(new Integer(j));
                }
                if (sub_5a7c(j, "Coin")) {
                    Class_o.var_2b45.addElement(new Integer(j));
                }
            }
        }
        for (int k = 0; k < Class_o.var_2b3d.size() - 1; ++k) {
            for (int l = k + 1; l < Class_o.var_2b3d.size(); ++l) {
                final int intValue = ((Integer) Class_o.var_2b3d.elementAt(k)).intValue();
                final int intValue2 = ((Integer) Class_o.var_2b3d.elementAt(l)).intValue();
                if (intValue > intValue2) {
                    Class_o.var_2b3d.setElementAt(new Integer(intValue2), k);
                    Class_o.var_2b3d.setElementAt(new Integer(intValue), l);
                }
            }
        }
        for (int n = 0; n < Class_o.var_2b45.size() - 1; ++n) {
            for (int n2 = n + 1; n2 < Class_o.var_2b45.size(); ++n2) {
                final int intValue3 = ((Integer) Class_o.var_2b45.elementAt(n)).intValue();
                final int intValue4 = ((Integer) Class_o.var_2b45.elementAt(n2)).intValue();
                if (intValue3 > intValue4) {
                    Class_o.var_2b45.setElementAt(new Integer(intValue4), n);
                    Class_o.var_2b45.setElementAt(new Integer(intValue3), n2);
                }
            }
        }
        new StringBuffer().append("PaySMS.parseValidItems: number of cash: ").append(Class_o.var_2b3d.size());
        new StringBuffer().append("PaySMS.parseValidItems: number of coin: ").append(Class_o.var_2b45.size());
    }
    
    public static int sub_591c(final int index, final String str) {
        new StringBuffer().append("PaySMS.getPricePoint: itemIndex").append(index).append(", itemType ").append(str);
        if (str.equals("Cash") && index <= Class_o.var_2b3d.size()) {
            return ((Integer) Class_o.var_2b3d.elementAt(index)).intValue();
        }
        if (str.equals("Coin") && index <= Class_o.var_2b45.size()) {
            return ((Integer) Class_o.var_2b45.elementAt(index)).intValue();
        }
        return -1;
    }
    
    private static int sub_59b0(final int n, final String s) {
        int n2 = -1;
        if (s.equals("Cash")) {
            for (int i = 0; i < Class_o.var_2b3d.size(); ++i) {
                if (((Integer) Class_o.var_2b3d.elementAt(i)).intValue() == n) {
                    n2 = i;
                    break;
                }
            }
        }
        else if (s.equals("Coin")) {
            for (int j = 0; j < Class_o.var_2b45.size(); ++j) {
                if (((Integer) Class_o.var_2b45.elementAt(j)).intValue() == n) {
                    n2 = j;
                    break;
                }
            }
        }
        return n2;
    }
    
    private static boolean sub_5a7c(final int n, final String s) {
        final String sub_5e3c = getAppProperty("IAP-ContentID-" + s + "-" + n);
        boolean b = false;
        if (Class_o.validContentIds.contains(sub_5e3c)) {
            b = true;
        }
        new StringBuffer().append("PaySMS.isValidContentID: IAP-ContentID-").append(s).append("-").append(n).append(": ").append(sub_5e3c).append(b ? " - Valid" : " - Invalid");
        return b;
    }
    
    private static String sub_5b32(final String str) {
        new StringBuffer().append("PaySMS.retrieveTermsAndConditions: id = '").append(str).append("'");
        if (str == null || str.length() == 0) {
            return "";
        }
        for (int i = 0; i < Class_o.var_29c5.length; ++i) {
            new StringBuffer().append("PaySMS.retrieveTermsAndConditions: profilesTexts[").append(i).append("][TEXT_PROFILE_ID] = '").append(Class_o.var_29c5[i][0]).append("'");
            if (equalsIgnoreCase(Class_o.var_29c5[i][0], str)) {
                return Class_o.var_29c5[i][1];
            }
        }
        return "";
    }
    
    private static String sub_5bf6(final String s, final String str) {
        if (s == null || s.equals("")) {
            return null;
        }
        String s2;
        try {
            final int index = s.indexOf("<phone>");
            final int index2 = s.indexOf("</phone>", index + "<phone>".length());
            final String substring = s.substring(0, index);
            final String substring2 = s.substring(index + "<phone>".length(), index2);
            final String substring3 = s.substring(index2 + "</phone>".length(), s.length());
            if (str == null || str.equals("")) {
                s2 = substring + substring3;
            }
            else {
                final int index3 = substring2.indexOf("<support_number>");
                s2 = substring + (substring2.substring(0, index3) + str + substring2.substring(index3 + "<support_number>".length(), substring2.length())) + substring3;
            }
        }
        catch (final Exception ex) {
            return s;
        }
        return s2;
    }
    
    private static String[][] loadSpecificTextsFile() {
        final String[] sub_66b7 = readFile(Class_o.textFile);
        if (sub_66b7 == null) {
            return null;
        }
        final String[][] array = new String[sub_66b7.length][2];
        for (int i = 0; i < sub_66b7.length; ++i) {
            final int index = sub_66b7[i].indexOf(59);
            if (index != -1) {
                array[i][0] = sub_66b7[i].substring(0, index);
                array[i][1] = sub_66b7[i].substring(index + 1, sub_66b7[i].length());
            }
        }
        for (int j = 0; j < array.length; ++j) {
            new StringBuffer().append("PaySMS.loadSpecificTextsFile: ID: ").append(array[j][0]).append(" TEXT: ").append(array[j][1]);
        }
        return array;
    }
    
    private static String getAppProperty(String prop) {
    	prop = Class_o.application.getAppProperty(prop);
        if (prop == null) {
            prop = "";
        }
        return prop;
    }
    
    private static int getTestFieldInt() {
        if (Class_o.iapTestField.equals("0")) {
            return 0;
        }
        if (Class_o.iapTestField.equals("1")) {
            return 1;
        }
        if (Class_o.iapTestField.equals("2")) {
            return 2;
        }
        return 0;
    }
    
    private static boolean loadProfileConfiguration(String[] array, final String[] array2, final String[] profilesArgs) {
        if (profilesArgs == null) {
            Class_o.var_2afd = 8;
            return false;
        }
        for (int i = 0; i < profilesArgs.length; ++i) {
            new StringBuffer().append("PaySMS.loadProfileConfiguration: profilesArgs[").append(i).append("]: ").append(profilesArgs[i]);
        }
        array = array2;
        int n = 0;
        final int[] array4 = new int[profilesArgs.length];
        final String[][] array5 = new String[profilesArgs.length][17];
        int n2 = 0;
        final int[] array6 = new int[profilesArgs.length];
        for (int j = 0; j < profilesArgs.length; ++j) {
            int n3 = 0;
            for (int k = 0; k < 16; ++k) {
                final int index = profilesArgs[j].indexOf(";", n3);
                array5[j][k] = profilesArgs[j].substring(n3, index);
                n3 = index + 1;
            }
            if (sub_65c1(array5[j][0])) {
                array6[n2++] = j;
            }
            if (array5[j][6].equals("CC")) {
                Class_o.var_2b4d = array5[j];
            }
            int l = 0;
            while (l < array.length) {
                final String anObject;
                if ((anObject = array[l]) != null && anObject.length() != 0 && array5[j][0].equals(anObject)) {
                    if (!sub_65c1(array5[j][0]) && !array5[j][6].equals("CC")) {
                        array4[n++] = j;
                        array[l] = null;
                        break;
                    }
                    break;
                }
                else {
                    ++l;
                }
            }
        }
        if (n2 != 0) {
            Class_o.var_29bd = new String[n2][];
            for (int n4 = 0; n4 < Class_o.var_29bd.length; ++n4) {
                Class_o.var_29bd[n4] = array5[array6[n4]];
            }
        }
        if (n == 0) {
            return false;
        }
        Class_o.var_29a5 = new String[n][];
        for (int n5 = 0; n5 < Class_o.var_29a5.length; ++n5) {
            Class_o.var_29a5[n5] = array5[array4[n5]];
        }
        try {
            for (int n6 = 0; n6 < n; ++n6) {
                final String s = Class_o.var_29a5[n6][9];
                final String s2 = Class_o.var_29a5[n6][7];
                final int int1 = Integer.parseInt(Class_o.var_29a5[n6][14]);
                if (s2 != null) {
                    Class_o.var_29a5[n6][16] = "" + sub_7695(s) * (100 + Integer.parseInt(Class_o.var_29a5[n6][5])) * 100000L / sub_7695(s2);
                    new StringBuffer().append("bonus    ").append(100 + Integer.parseInt(Class_o.var_29a5[n6][5])).append(", tier ").append(int1);
                }
                new StringBuffer().append("profile Id :\t").append(Class_o.var_29a5[n6][0]).append("\tTier:\t").append(int1).append("\tRatios :\t").append(Class_o.var_29a5[n6][16]);
            }
        }
        catch (final Exception ex) {}
        parseMultipleCarriers();
        return true;
    }
    
    private static void parseMultipleCarriers() {
        int length = Class_o.var_29a5.length;
        if (Class_o.var_2b4d != null) {
            ++length;
        }
        Class_o.var_29b5 = new Vector[length];
        for (int i = 0; i < Class_o.var_29a5.length; ++i) {
            Class_o.var_29b5[i] = new Vector();
            final String s = Class_o.var_29a5[i][3];
            new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(Class_o.var_29a5[i][0]);
            int beginIndex = 0;
            int j;
            if ((j = s.indexOf("¬", 0)) == -1) {
                Class_o.var_29b5[i].addElement(s);
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s);
            }
            else {
                while (j != -1) {
                    Class_o.var_29b5[i].addElement(s.substring(beginIndex, j));
                    new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s.substring(beginIndex, j));
                    beginIndex = j + 1;
                    j = s.indexOf("¬", beginIndex);
                }
                Class_o.var_29b5[i].addElement(s.substring(beginIndex, s.length()));
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s.substring(beginIndex, s.length()));
            }
            new StringBuffer().append("\tSize: ").append(Class_o.var_29b5[i].size());
        }
        if (Class_o.var_2b4d != null) {
            Class_o.var_29b5[Class_o.var_29a5.length] = new Vector();
            final String s2 = Class_o.var_2b4d[3];
            new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(Class_o.var_2b4d[0]);
            int beginIndex2 = 0;
            int k;
            if ((k = s2.indexOf("¬", 0)) == -1) {
                Class_o.var_29b5[Class_o.var_29a5.length].addElement(s2);
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s2);
            }
            else {
                while (k != -1) {
                    Class_o.var_29b5[Class_o.var_29a5.length].addElement(s2.substring(beginIndex2, k));
                    new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s2.substring(beginIndex2, k));
                    beginIndex2 = k + 1;
                    k = s2.indexOf("¬", beginIndex2);
                }
                Class_o.var_29b5[Class_o.var_29a5.length].addElement(s2.substring(beginIndex2, s2.length()));
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(s2.substring(beginIndex2, s2.length()));
            }
            new StringBuffer().append("\tSize: ").append(Class_o.var_29b5[Class_o.var_29a5.length].size());
        }
    }
    
    private static boolean sub_65c1(final String s) {
        return s.equals(Class_o.var_2b05) || s.equals(Class_o.var_2b0d) || s.equals(Class_o.var_2b15);
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
            }
            else {
                i = s.length();
            }
        }
        final String[] anArray = new String[vector.size()];
        vector.copyInto(anArray);
        return anArray;
    }
    
    private static String[] readFile(final String s) {
        final InputStream resourceAsStream = "".getClass().getResourceAsStream(s);
        String s2;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
            final byte[] array = new byte[256];
            int read;
            while ((read = resourceAsStream.read(array)) != -1) {
                byteArrayOutputStream.write(array, 0, read);
            }
            resourceAsStream.close();
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            s2 = new String(byteArray, 0, byteArray.length, "UTF-8");
        }
        catch (final Exception ex) {
            new StringBuffer().append("PaySMS.readFile: ").append(s).append(" Exception: ").append(ex.toString());
            return null;
        }
        int n = 0;
        final Vector vector = new Vector();
        int i;
        do {
            if ((i = s2.indexOf(10, n)) != -1) {
                vector.addElement(s2.substring(n, i));
                n = i + 1;
            }
        } while (i != -1);
        final String[] anArray = new String[vector.size()];
        vector.copyInto(anArray);
        return anArray;
    }
    
    private static String[][] sub_67fc() {
        if (!Class_o.var_29ad || getTestFieldInt() != 0) {
            return null;
        }
        final Vector vector = new Vector();
        for (int i = 0; i < Class_o.var_29a5.length; ++i) {
            final String s = Class_o.var_29a5[i][2];
            int n = 0;
            for (int index = 0; n == 0 && index < vector.size(); ++index) {
                if (equalsIgnoreCase(s, (String)vector.elementAt(index))) {
                    n = 1;
                }
            }
            if (n == 0) {
                vector.addElement(Class_o.var_29a5[i][2]);
            }
        }
        if (Class_o.var_2b4d != null && Class_o.creditCardEnabled && vector.size() > 1) {
            vector.addElement("Other");
        }
        final String[] anArray = new String[vector.size()];
        vector.copyInto(anArray);
        vector.removeAllElements();
        final Vector vector2 = new Vector();
        String[][] anArray2 = new String[anArray.length][2];
        int n2 = 0;
        int n3 = 0;
        for (int j = 0; j < anArray.length; ++j) {
            final String s2;
            int index2;
            if ((index2 = (s2 = anArray[j]).indexOf(40)) != -1) {
                anArray2[j][0] = s2.substring(0, index2);
                ++index2;
                final int index3 = s2.indexOf(58, index2);
                rmsLoad(Class_o.rmsNames[8]);
                if (index3 != -1) {
                    anArray2[j][1] = s2.substring(index2, index3);
                    if (Class_o.smsProperty != null && Class_o.smsProperty.startsWith(anArray2[j][1], 1) && n2 <= index3 - index2) {
                        n2 = index3 - index2;
                        Class_o.var_29cd = j;
                        new StringBuffer().append("currentAutoDetectedRegion ").append(Class_o.var_29cd);
                        final String[] obj;
                        (obj = new String[2])[0] = anArray2[j][0];
                        obj[1] = anArray2[j][1];
                        vector2.addElement(obj);
                        ++n3;
                    }
                }
            }
            else {
                anArray2[j][0] = s2;
                anArray2[j][1] = "";
            }
            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(j).append("][REGION_NAME]: ").append(anArray2[j][0]);
            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(j).append("][REGION_CODE]: ").append(anArray2[j][1]);
        }
        if (n3 > 1) {
            Class_o.var_29cd = -1;
            anArray2 = new String[vector2.size()][2];
            vector2.copyInto(anArray2);
        }
        new StringBuffer().append("PaySMS.getProfilesRegions: Auto-detected: ").append((Class_o.var_29cd == -1) ? "NONE" : anArray2[Class_o.var_29cd][0]);
        return anArray2;
    }
    
    private static String rmsLoad(final String s) {
        RecordStore rs = null;
        String recordStr = null;
        try {
            final byte[] record;
            rs = RecordStore.openRecordStore(s, (boolean)(1 != 0));
            record = rs.getRecord(1);
            if (rs.getNumRecords() >= 1 && record != null) {
                recordStr = new String(record);
            }
        }
        catch (final Exception ex) {
            new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(s).append(" ").append(ex.toString());
        }
        try {
            rs.closeRecordStore();
        }
        catch (final Exception ex2) {
            new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(s).append(" ").append(ex2.toString());
        }
        return recordStr;
    }
    
    public static void rmsSave(final String s, final String s2) {
        RecordStore rs = null;
        try {
            rs = RecordStore.openRecordStore(s, true);
            final byte[] bytes = s2.getBytes();
            if (rs.getNumRecords() >= 1) {
                rs.setRecord(1, bytes, 0, bytes.length);
            }
            else {
                rs.addRecord(bytes, 0, bytes.length);
            }
        }
        catch (final Exception ex) {
            new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(ex.toString());
        }
        if (rs != null) {
            try {
                rs.closeRecordStore();
            }
            catch (final Exception ex2) {
                new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(ex2.toString());
            }
        }
    }
    
    private static boolean sub_6cf3() {
        final String sub_6b21;
        return (sub_6b21 = rmsLoad(Class_o.rmsNames[0])) != null && sub_6b21.equals("1");
    }
    
    private static boolean sub_6d38() {
        final String sub_6b21;
        return (sub_6b21 = rmsLoad(Class_o.rmsNames[4])) != null && sub_6b21.equals("1");
    }
    
    private static String sub_6d7d() {
        final String sub_6b21;
        if ((sub_6b21 = rmsLoad(Class_o.rmsNames[1])) != null) {
            return sub_6b21;
        }
        return "";
    }
    
    private static long sub_6dba() {
        try {
            final String sub_6b21;
            if ((sub_6b21 = rmsLoad(Class_o.rmsNames[11])) != null) {
                return Long.parseLong(sub_6b21);
            }
        }
        catch (final Exception ex) {}
        return 1L;
    }
    
    public static String sub_6e15() {
        final String sub_6b21;
        if ((sub_6b21 = rmsLoad(Class_o.rmsNames[5])) != null) {
            return sub_6b21;
        }
        return "";
    }
    
    private static boolean sub_6e52() {
        final String sub_6b21;
        if ((sub_6b21 = rmsLoad(Class_o.rmsNames[3])) == null || sub_6b21.length() == 0) {
            return false;
        }
        final Vector var_29d5 = new Vector();
        for (int n = 0, i = sub_6b21.indexOf(";"); i != -1; i = sub_6b21.indexOf(";", n)) {
            var_29d5.addElement(new Integer(Integer.parseInt(sub_6b21.substring(n, i))));
            n = i + 1;
        }
        Class_o.currentValidProfiles = var_29d5;
        return true;
    }
    
    private static void sub_6ef9(final Vector vector) {
        String string = "";
        for (int i = 0; i < vector.size(); ++i) {
            string = string + vector.elementAt(i) + ";";
        }
        new StringBuffer().append("PaySMS.storeProfileID: ").append(string);
        rmsSave(Class_o.rmsNames[3], String.valueOf(string));
    }
    
    private static String sub_6f82() {
        int i;
        for (i = Math.abs(new Random().nextInt() % 9999); i < 1000; i += 1000) {
            if (i < 1000) {}
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
    
    public static int sub_7195() {
        if (Class_o.currentValidProfiles == null || Class_o.currentValidProfiles.size() <= 0) {
            return 0;
        }
        if (getTestFieldInt() != 0) {
            return 8;
        }
        try {
            final int intValue = ((Integer) Class_o.currentValidProfiles.elementAt(0)).intValue();
            final String str = Class_o.var_29a5[intValue][0];
            new StringBuffer().append("profileID : ").append(str);
            for (int i = 0; i < Class_o.var_2b65.length; ++i) {
                if (str != null && str.equals(Class_o.var_2b65[i])) {
                    new StringBuffer().append("PaySMS. Found valid the Turkey profile: ").append(Class_o.var_29a5[intValue][0]);
                    return 3;
                }
            }
            for (int j = 0; j < Class_o.var_2b6d.length; ++j) {
                if (str != null && str.equals(Class_o.var_2b6d[j])) {
                    new StringBuffer().append("PaySMS. Found valid the FR Open Market profile: ").append(Class_o.var_29a5[intValue][0]);
                    return 6;
                }
            }
            for (int k = 0; k < Class_o.var_2b75.length; ++k) {
                if (str != null && str.equals(Class_o.var_2b75[k])) {
                    new StringBuffer().append("PaySMS. Found valid the Indonesia Telkomsel profile: ").append(Class_o.var_29a5[intValue][0]);
                    return 11;
                }
            }
            final String s;
            if ((s = Class_o.var_29a5[intValue][2]) == null) {
                return 8;
            }
            final String trim = s.substring(s.indexOf(40) + 1, s.lastIndexOf(58)).trim();
            new StringBuffer().append("PaySMS. Country code ").append(trim);
            if (Class_o.var_29a5[intValue][6].equals("SMS")) {
                if (trim.equals("49:DE")) {
                    return 2;
                }
                if (trim.equals("45:DK")) {
                    return 4;
                }
                if (trim.equals("43:AT")) {
                    return 5;
                }
                if (trim.equals("91:IN")) {
                    return 7;
                }
                if (trim.equals("34:ES")) {
                    return 0;
                }
                if (trim.equals("44:GB")) {
                    return 10;
                }
                if (trim.equals("58:VE")) {
                    return 12;
                }
            }
            if (trim.equals("34:ES") && Class_o.var_29a5[intValue][6].equals("HTTP")) {
                return 9;
            }
        }
        catch (final Exception obj) {
            new StringBuffer().append("PaySMS. GetSpecialFlow,  Exception: ").append(obj);
        }
        return 8;
    }
    
    public static int sub_74c8(final int n) {
        if (sub_7195() == 6) {
            if (Class_o.currentValidProfiles == null) {
                return 0;
            }
            for (int i = 0; i < Class_o.currentValidProfiles.size(); ++i) {
                final int intValue = ((Integer)Class_o.currentValidProfiles.elementAt(i)).intValue();
                try {
                    if (Integer.parseInt(Class_o.var_29a5[intValue][14]) == n) {
                        final long sub_7695 = sub_7695(Class_o.var_29a5[intValue][9]);
                        new StringBuffer().append("Fixed price : ").append(Class_o.var_29a5[intValue][9]);
                        if (sub_7695 > 500000L) {
                            new StringBuffer().append("Found Price greater than 5 Euros : ").append(Class_o.var_29a5[intValue][9]);
                            return 1;
                        }
                        break;
                    }
                }
                catch (final Exception ex) {}
            }
        }
        return 0;
    }
    
    public static String sub_75be() {
        try {
            final String supportUrl = GLLib.s_application.getAppProperty("URL-SUPPORT");
            if (supportUrl == null) {
                return null;
            }
            final String moneySpent = rmsLoad(Class_o.rmsNames[7]);
            if (moneySpent == null || moneySpent.equals("")) {
                return supportUrl;
            }
            return supportUrl + "&extra_1=" + GLLib.sub_4545(GLLib.sub_4655(moneySpent.substring(0, moneySpent.indexOf(95)).getBytes(), "a8bc1a23a89", true)) + "&extra_2=" + moneySpent.substring(moneySpent.indexOf(95) + 1);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private static long sub_7695(String str) {
        final int index;
        if ((index = (str = str.replace((char)44, (char)46)).indexOf(Class_o.var_2b95)) == -1) {
            return sub_773b(str) * 100000L;
        }
        final long n = sub_773b(str.substring(0, index)) * 100000L;
        for (str = str.substring(index + 1); str.length() < "100000".length() - 1; str += "0") {}
        return n + sub_773b(str);
    }
    
    private static int sub_773b(final String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (final Exception ex) {
            return -1;
        }
    }
    
    private static boolean equalsIgnoreCase(final String s1, final String s2) {
        if (s1 == null || s2 == null) {
            new StringBuffer().append("PaySMS.equalsIgnoreCase: s1 = '").append(s1).append("', s2 = '").append(s2).append("'");
            return false;
        }
        return s1.toUpperCase().equals(s2.toUpperCase());
    }
    
    static String sub_77e8() {
        return Class_o.debugNum;
    }
    
    static String sub_7806() {
        return Class_o.overrideFromJad;
    }
    
    static String sub_7824(final String var_2a95) {
        return Class_o.var_2a95 = var_2a95;
    }
    
    static String sub_7844(final String s) {
        return getAppProperty(s);
    }
    
    static String sub_7863() {
        return Class_o.var_2a95;
    }
    
    static int sub_7881() {
        return Class_o.currentProfile;
    }
    
    static String[][] sub_789f() {
        return Class_o.var_29a5;
    }
    
    static boolean sub_78bd(final boolean var_2a6d) {
        return Class_o.var_2a6d = var_2a6d;
    }
    
    static boolean sub_78dd() {
        return Class_o.var_2a75 = false;
    }
    
    static int sub_78fd(final int var_2afd) {
        return Class_o.var_2afd = var_2afd;
    }
    
    static String sub_791d() {
        return Class_o.var_2a3d;
    }
    
    static Timer sub_793b(final Timer var_2ad5) {
        return Class_o.var_2ad5 = var_2ad5;
    }
    
    static Timer sub_795b() {
        return Class_o.var_2ad5;
    }
    
    static String sub_7979() {
        return Class_o.var_2a45;
    }
    
    static long sub_7997() {
        return Class_o.var_2a55++;
    }
    
    static long sub_79bb() {
        return Class_o.var_2a55;
    }
    
    static Vector sub_79d9() {
        return Class_o.currentValidProfiles;
    }
    
    static void sub_79f7(final Vector vector) {
        sub_6ef9(vector);
    }
    
    static {
        Class_o.application = null;
        Class_o.var_2965 = -1;
        Class_o.itemType = "";
        Class_o.pricePoint = -1;
        Class_o.language = "";
        Class_o.VERSION = "PaySMS.IAP.Version:1.1.8";
        Class_o.var_299d = false;
        Class_o.var_29a5 = null;
        Class_o.var_29ad = false;
        Class_o.var_29b5 = null;
        Class_o.var_29bd = null;
        Class_o.var_29c5 = null;
        Class_o.var_29cd = -1;
        Class_o.currentValidProfiles = null;
        Class_o.var_29dd = -1;
        Class_o.var_29e5 = null;
        Class_o.var_29ed = -1;
        Class_o.var_29f5 = null;
        Class_o.var_29fd = null;
        Class_o.debugNum = null;
        Class_o.debugMnc = null;
        Class_o.smsProperty = null;
        Class_o.var_2a1d = null;
        Class_o.igpCode = null;
        Class_o.phoneModel = null;
        Class_o.var_2a35 = null;
        Class_o.var_2a3d = "";
        Class_o.var_2a45 = "";
        Class_o.currentProfile = -1;
        Class_o.var_2a55 = 1L;
        rmsNames = new String[] { "rmsSMS", "Cm1zY2", "rmsPackageId", "rmsAvailableProfiles", "rmsRedeemUnlocked", "rmsItemType", "rmsUnlocked", "rmsMoneySpent", "rmsCurrentRegion", "rmsCurrentCarrier", "Cm1zY1", "rmsSMSCnt" };
        Class_o.var_2a65 = false;
        Class_o.var_2a6d = false;
        Class_o.var_2a75 = false;
        Class_o.var_2a7d = false;
        Class_o.var_2a85 = false;
        Class_o.overrideFromJad = "";
        Class_o.var_2a95 = "";
        Class_o.var_2a9d = "";
        Class_o.var_2aa5 = "";
        Class_o.var_2aad = "";
        Class_o.billingUrl = "";
        Class_o.billingType = "";
        Class_o.profilesFile = "/IAP_profiles";
        Class_o.textFile = "/IAP_texts";
        Class_o.var_2ad5 = null;
        Class_o.var_2add = null;
        Class_o.var_2ae5 = false;
        Class_o.var_2aed = false;
        Class_o.var_2af5 = 0;
        Class_o.var_2afd = 0;
        Class_o.var_2b05 = "933";
        Class_o.var_2b0d = "5023";
        Class_o.var_2b15 = "5025";
        Class_o.iapTestField = "";
        Class_o.useTestProfile = "";
        Class_o.currencys = new String[] { "Cash", "Coin" };
        Class_o.validContentIds = null;
        Class_o.var_2b3d = null;
        Class_o.var_2b45 = null;
        Class_o.var_2b4d = null;
        Class_o.creditCardEnabled = false;
        Class_o.var_2b5d = false;
        Class_o.var_2b65 = new String[] { "2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509", "3511" };
        Class_o.var_2b6d = new String[] { "1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878" };
        Class_o.var_2b75 = new String[] { "1104", "1106", "1108", "1110" };
        Class_o.var_2b7d = new int[] { 100, 110, 120, 130, 140, 150 };
        Class_o.var_2b85 = new int[] { 199, 399, 999, 1999, 2999, 3999 };
        Class_o.var_2b8d = 4;
        Class_o.var_2b95 = '.';
    }
}
