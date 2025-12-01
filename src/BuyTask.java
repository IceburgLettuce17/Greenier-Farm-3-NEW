
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
            if (!Class_o.getDebugNumber().equals("")) {
                smsAdress = smsProto + Class_o.getDebugNumber();
            }
            else {
                if (Class_o.getOverrideFromJad().equals("1")) {
                    Class_o.setShortCode(Class_o.getProperty("IAP-ShortCode-PP" + Class_o.pricePoint));
                }
                else {
                    Class_o.setShortCode("");
                }
                if (!Class_o.getShortCode().equals("")) {
                    smsAdress = smsProto + Class_o.getShortCode();
                }
                else {
                    if (Class_o.getCurrentProfile() == -1) {
                        Class_o.setIsSms(false);
                        Class_o.rmsSave(Class_o.rmsNames[0], "0");
                        Class_o.sub_78dd();
                        Class_o.sub_78fd(-1);
                        return;
                    }
                    smsAdress = smsProto + Class_o.sub_789f()[Class_o.getCurrentProfile()][11];
                }
            }
            new StringBuffer().append("PaySMS.buy: smsAdress: ").append(smsAdress);
            Class_o.conn = (MessageConnection)Connector.open(smsAdress);
            new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(Class_o.conn);
            final TextMessage msg = (TextMessage)Class_o.conn.newMessage("text");
            new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(msg);
            msg.setPayloadText(Class_o.getSmsContent());
            try {
                Thread.sleep(200L);
            }
            catch (final Exception ex) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex.toString());
            }
            Class_o.setTimer(new Timer());
            Class_o.getTimer().schedule(new BuyCloseTask(), 30000);
            Class_o.conn.send((Message)msg);
            Class_o.setIsSms(Class_o.var_2aed = true);
            Class_o.rmsSave(Class_o.rmsNames[0], "1");
            Class_o.rmsSave(Class_o.rmsNames[1], Class_o.getCode());
            Class_o.rmsSave(Class_o.rmsNames[2], String.valueOf(Class_o.itemAmount));
            Class_o.rmsSave(Class_o.rmsNames[5], Class_o.itemType);
            Class_o.addToSmsCount();
            Class_o.rmsSave(Class_o.rmsNames[11], "" + Class_o.getSmsCount());
            if (!Class_o.getOverrideFromJad().equals("1")) {
                Class_o.storeProfile(Class_o.getCurrentValidProfiles());
            }
            try {
                Thread.sleep(100L);
            }
            catch (final Exception ex2) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex2.toString());
            }
        }
        catch (final SecurityException ex3) {
            Class_o.setIsSms(false);
            Class_o.rmsSave(Class_o.rmsNames[0], "0");
            Class_o.sub_78fd(-9);
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(ex3.toString());
        }
        catch (final Throwable t) {
            Class_o.setIsSms(false);
            Class_o.rmsSave(Class_o.rmsNames[0], "0");
            if (Class_o.var_2ae5) {
                Class_o.sub_78fd(-4);
            }
            else {
                Class_o.sub_78fd(-1);
            }
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(t.toString());
        }
        try {
            if (Class_o.conn != null) {
                ((Connection)Class_o.conn).close();
            }
        }
        catch (final Exception ex4) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(ex4.toString());
        }
        Class_o.sub_78dd();
    }
}
