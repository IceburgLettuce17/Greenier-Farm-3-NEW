
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
                        PaySMS.sub_78dd();
                        PaySMS.sub_78fd(-1);
                        return;
                    }
                    smsAdress = smsProto + PaySMS.sub_789f()[PaySMS.getCurrentProfile()][11];
                }
            }
            new StringBuffer().append("PaySMS.buy: smsAdress: ").append(smsAdress);
            PaySMS.conn = (MessageConnection)Connector.open(smsAdress);
            new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(PaySMS.conn);
            final TextMessage msg = (TextMessage)PaySMS.conn.newMessage("text");
            new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(msg);
            msg.setPayloadText(PaySMS.getSmsContent());
            try {
                Thread.sleep(200L);
            }
            catch (final Exception ex) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex.toString());
            }
            PaySMS.setTimer(new Timer());
            PaySMS.getTimer().schedule(new BuyCloseTask(), 30000);
            PaySMS.conn.send((Message)msg);
            PaySMS.setIsSms(PaySMS.var_2aed = true);
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
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex2.toString());
            }
        }
        catch (final SecurityException ex3) {
            PaySMS.setIsSms(false);
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "0");
            PaySMS.sub_78fd(-9);
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(ex3.toString());
        }
        catch (final Throwable t) {
            PaySMS.setIsSms(false);
            PaySMS.rmsSave(PaySMS.RMS_RECORDS[0], "0");
            if (PaySMS.var_2ae5) {
                PaySMS.sub_78fd(-4);
            }
            else {
                PaySMS.sub_78fd(-1);
            }
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(t.toString());
        }
        try {
            if (PaySMS.conn != null) {
                ((Connection)PaySMS.conn).close();
            }
        }
        catch (final Exception ex4) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(ex4.toString());
        }
        PaySMS.sub_78dd();
    }
}
