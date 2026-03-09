
import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class BuyCloseTask extends TimerTask
{
    public final void run() {
        if (!PaySMS.unkBool) {
            try {
                PaySMS.connClosed = true;
                PaySMS.conn.close();
            }
            catch (final Exception ex) {
				if (Define.DECOMP_MODE)
					System.out.println("PaySMS.buy: Failed to close connection in timer. Exception: " + ex.toString());
            }
        }
    }
}
