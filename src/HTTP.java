import javax.microedition.io.InputConnection;
import javax.microedition.io.Connection;
import java.io.ByteArrayOutputStream;
import javax.microedition.io.Connector;
import java.io.OutputStream;
import java.io.InputStream;
import javax.microedition.io.HttpConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class HTTP implements Runnable
{
    private boolean var_64f;
    private Thread m_thread;
    private String m_sUrl;
    private HttpConnection m_c;
    private InputStream m_i;
    private OutputStream m_o;
    public String m_response;
    private boolean var_687;
    boolean m_bIsInProgress;
    boolean m_bCanceled;
    boolean m_bError;
    private int responseCode;
    private String var_6af;
    
    public HTTP() {
        this(true);
    }
    
    public HTTP(final boolean var_64f) {
        this.var_64f = var_64f;
        this.var_6af = "application/x-www-form-urlencoded";
    }
    
    public final synchronized void cancel() {
        if (!this.m_bCanceled) {
            this.m_bCanceled = true;
            if (this.m_c != null) {
                if (this.m_i != null) {
                    try {
                        synchronized (this.m_c) {
                            this.m_i.close();
                        }
                    }
                    catch (final Exception ex) {}
                }
                if (this.m_c != null) {
                    try {
                        synchronized (this.m_c) {
                            ((Connection)this.m_c).close();
                        }
                    }
                    catch (final Exception ex2) {}
                }
                if (this.m_o != null) {
                    try {
                        synchronized (this.m_o) {
                            this.m_o.close();
                        }
                    }
                    catch (final Exception ex3) {}
                }
                this.m_o = null;
            }
            this.m_i = null;
            this.m_c = null;
            this.m_bIsInProgress = false;
            this.m_thread = null;
            System.gc();
        }
    }
    
    public final void sendByGet(final String sUrl, final String sQuery) {
        this.var_687 = false;
        System.gc();
        while (this.m_bIsInProgress) {
            try {
                synchronized (this) {
                    this.wait(50L);
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
        this.cancel();
        this.m_bError = false;
        this.m_response = null;
        this.m_bIsInProgress = true;
        this.m_bCanceled = false;
        this.m_sUrl = sUrl + sQuery;
        this.m_bError = false;
        (this.m_thread = new Thread(this)).start();
    }
    
    public final void run() {
        if (this.m_sUrl == null) {
            this.cancel();
            this.m_bError = true;
            this.m_bIsInProgress = false;
            return;
        }
        try {
            this.m_bError = false;
            if (this.m_bCanceled) {
                this.m_bIsInProgress = false;
                return;
            }
            (this.m_c = (HttpConnection)Connector.open(this.m_sUrl, 3)).setRequestMethod("GET");
            this.m_c.setRequestProperty("Connection", "close");
            this.responseCode = this.m_c.getResponseCode();
            this.m_c.getResponseMessage();
            this.m_c.getDate();
            if (this.responseCode != 200 && this.responseCode != 202) {
                this.cancel();
                this.m_bError = true;
                this.m_bIsInProgress = false;
                return;
            }
            if (this.m_bCanceled) {
                this.m_bIsInProgress = false;
                return;
            }
            synchronized (this.m_c) {
                this.m_i = ((InputConnection)this.m_c).openInputStream();
            }
            Thread.yield();
            final ByteArrayOutputStream bao = new ByteArrayOutputStream();
            final byte[] abInBuffer = new byte[256];
            int nBytesRead = 0;
            while (nBytesRead != -1) {
                if (this.m_bCanceled) {
                    this.m_bIsInProgress = false;
                    return;
                }
                for (int i = 0; i < 256; ++i) {
                    abInBuffer[i] = 0;
                }
                if (this.m_i.read(abInBuffer, 0, 256) == -1) {
                    break;
                }
                for (nBytesRead = 255; nBytesRead >= 0 && abInBuffer[nBytesRead] == 0; --nBytesRead) {}
                ++nBytesRead;
                bao.write(abInBuffer, 0, nBytesRead);
            }
            this.m_response = bao.toString();
            //bao.toByteArray();
        }
        catch (final Exception ex) {
            this.m_bError = true;
            this.m_bIsInProgress = false;
        }
        finally {
            this.cancel();
        }
    }
    
    public final String toString() {
        return (String)null + ": " + this.m_sUrl;
    }
}
