
import javax.microedition.io.Connection;
import javax.wireless.messaging.Message;
//import java.util.TimerTask;
import java.util.Timer;
import javax.wireless.messaging.TextMessage;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class BuyTask extends Thread
{
    public final void run() {
        try {
            final String smsProto = "sms://";
            String smsAdress;
            if (!PaySMS.getDebugNumber().equals("")) {
                smsAdress = smsProto + PaySMS.getDebugNumber();
            }
            else {
                if (PaySMS.getOverrideFromJad().equals("1")) {
                    PaySMS.setShortCode(PaySMS.getProperty("IAP-ShortCode-PP" + PaySMS.pricePoint));
                }
                else {
                    PaySMS.setShortCode("");
                }
                if (!PaySMS.getShortCode().equals("")) {
                    smsAdress = smsProto + PaySMS.getShortCode();
                }
                else {
                    if (PaySMS.getCurrentProfile() == -1) {
                        PaySMS.setIsSms(false);
                        PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "0");
                        PaySMS.setNotSendingSMS();
                        PaySMS.setErrorCode(-1);
                        return;
                    }
                    smsAdress = smsProto + PaySMS.getProfilesData()[PaySMS.getCurrentProfile()][11];
                }
            }
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: smsAdress: " + smsAdress);
            PaySMS.conn = (MessageConnection)Connector.open(smsAdress);
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: Connection opened - conn: " + PaySMS.conn);
            final TextMessage msg = (TextMessage)PaySMS.conn.newMessage("text");
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: TextMessage created - msg: " + msg);
            msg.setPayloadText(PaySMS.getSmsContent());
            try {
                Thread.sleep(200L);
            }
            catch (final Exception ex) {
                if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: Exception trying to sleep: " + ex.toString());
            }
            PaySMS.setTimer(new Timer());
            PaySMS.getTimer().schedule(new BuyCloseTask(), 30000);
            PaySMS.conn.send((Message)msg);
            PaySMS.setIsSms(PaySMS.unkBool = true);
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "1");
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[1], PaySMS.getCode());
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[2], String.valueOf(PaySMS.itemAmount));
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[5], PaySMS.itemType);
            PaySMS.addToSmsCount();
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[11], "" + PaySMS.getSmsCount());
            if (!PaySMS.getOverrideFromJad().equals("1")) {
                PaySMS.storeProfile(PaySMS.getCurrentValidProfiles());
            }
            try {
                Thread.sleep(100L);
            }
            catch (final Exception ex2) {
                if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: Exception trying to sleep: " + ex2.toString());
            }
        }
        catch (final SecurityException ex3) {
            PaySMS.setIsSms(false);
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "0");
            PaySMS.setErrorCode(-9);
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: SMS sent failed! Security Exception: " + ex3.toString());
        }
        catch (final Throwable t) {
            PaySMS.setIsSms(false);
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "0");
            if (PaySMS.connClosed) {
                PaySMS.setErrorCode(-4);
            }
            else {
                PaySMS.setErrorCode(-1);
            }
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: SMS sent failed! Exception: " + t.toString());
        }
        try {
            if (PaySMS.conn != null) {
                ((Connection)PaySMS.conn).close();
            }
        }
        catch (final Exception ex4) {
            if (Define.DECOMP_MODE) System.out.println("PaySMS.buy: Failed to close connection! Exception: " + ex4.toString());
        }
        PaySMS.setNotSendingSMS();
    }
}
