import javax.microedition.io.Connection;
import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class Class_i extends TimerTask
{
    public final void run() {
        if (!Class_o.var_2aed) {
            try {
                Class_o.var_2ae5 = true;
                ((Connection)Class_o.var_2add).close();
            }
            catch (final Exception ex) {
                new StringBuffer().append("PaySMS.buy: Failed to close connection in timer. Exception: ").append(ex.toString());
            }
        }
    }
}
