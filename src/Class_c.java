import javax.microedition.io.Connection;
import javax.wireless.messaging.Message;
import java.util.TimerTask;
import java.util.Timer;
import javax.wireless.messaging.TextMessage;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class Class_c extends Thread
{
    public final void run() {
        try {
            final String str = "sms://";
            String str2;
            if (!Class_o.sub_77e8().equals("")) {
                str2 = str + Class_o.sub_77e8();
            }
            else {
                if (Class_o.sub_7806().equals("1")) {
                    Class_o.sub_7824(Class_o.sub_7844("IAP-ShortCode-PP" + Class_o.var_2975));
                }
                else {
                    Class_o.sub_7824("");
                }
                if (!Class_o.sub_7863().equals("")) {
                    str2 = str + Class_o.sub_7863();
                }
                else {
                    if (Class_o.sub_7881() == -1) {
                        Class_o.sub_78bd(false);
                        Class_o.sub_6c0f(Class_o.var_2a5d[0], "0");
                        Class_o.sub_78dd();
                        Class_o.sub_78fd(-1);
                        return;
                    }
                    str2 = str + Class_o.sub_789f()[Class_o.sub_7881()][11];
                }
            }
            new StringBuffer().append("PaySMS.buy: smsAdress: ").append(str2);
            Class_o.var_2add = (MessageConnection)Connector.open(str2);
            new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(Class_o.var_2add);
            final TextMessage obj = (TextMessage)Class_o.var_2add.newMessage("text");
            new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(obj);
            obj.setPayloadText(Class_o.sub_791d());
            try {
                Thread.sleep(200L);
            }
            catch (final Exception ex) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex.toString());
            }
            Class_o.sub_793b(new Timer());
            Class_o.sub_795b().schedule(new Class_i(), 30000);
            Class_o.var_2add.send((Message)obj);
            Class_o.sub_78bd(Class_o.var_2aed = true);
            Class_o.sub_6c0f(Class_o.var_2a5d[0], "1");
            Class_o.sub_6c0f(Class_o.var_2a5d[1], Class_o.sub_7979());
            Class_o.sub_6c0f(Class_o.var_2a5d[2], String.valueOf(Class_o.var_2965));
            Class_o.sub_6c0f(Class_o.var_2a5d[5], Class_o.var_296d);
            Class_o.sub_7997();
            Class_o.sub_6c0f(Class_o.var_2a5d[11], "" + Class_o.sub_79bb());
            if (!Class_o.sub_7806().equals("1")) {
                Class_o.sub_79f7(Class_o.sub_79d9());
            }
            try {
                Thread.sleep(100L);
            }
            catch (final Exception ex2) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(ex2.toString());
            }
        }
        catch (final SecurityException ex3) {
            Class_o.sub_78bd(false);
            Class_o.sub_6c0f(Class_o.var_2a5d[0], "0");
            Class_o.sub_78fd(-9);
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(ex3.toString());
        }
        catch (final Throwable t) {
            Class_o.sub_78bd(false);
            Class_o.sub_6c0f(Class_o.var_2a5d[0], "0");
            if (Class_o.var_2ae5) {
                Class_o.sub_78fd(-4);
            }
            else {
                Class_o.sub_78fd(-1);
            }
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(t.toString());
        }
        try {
            if (Class_o.var_2add != null) {
                ((Connection)Class_o.var_2add).close();
            }
        }
        catch (final Exception ex4) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(ex4.toString());
        }
        Class_o.sub_78dd();
    }
}
