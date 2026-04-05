// 
// Decompiled by Procyon v0.6.0
// 

final class PlatformRequestWorker implements Runnable
{
	
    public final void run() {
        while (GLLib.s_bPlatformRequestPending) {
            GLLib.doPlatformRequest();
            try {
                Thread.sleep(1000L);
            }
            catch (final Exception ex) {}
        }
    }
}
