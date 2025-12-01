// 
// Decompiled by Procyon v0.6.0
// 

// Utility class for GLLib


final class PlatformRequester implements Runnable
{
	
    public final void run() {
        while (GLLib.var_1e47) {
            GLLib.PlatformRequest();
            try {
                Thread.sleep(1000L);
            }
            catch (final Exception ex) {}
        }
    }
}
