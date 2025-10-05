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

public final class Class_d implements Runnable
{
    private boolean var_64f;
    private Thread var_657;
    private String var_65f;
    private HttpConnection var_667;
    private InputStream var_66f;
    private OutputStream var_677;
    public String var_67f;
    private boolean var_687;
    boolean var_68f;
    private boolean var_697;
    public boolean var_69f;
    private int var_6a7;
    private String var_6af;
    
    public Class_d() {
        this(true);
    }
    
    public Class_d(final boolean var_64f) {
        this.var_64f = var_64f;
        this.var_6af = "application/x-www-form-urlencoded";
    }
    
    public final synchronized void sub_71b() {
        if (!this.var_697) {
            this.var_697 = true;
            if (this.var_667 != null) {
                if (this.var_66f != null) {
                    try {
                        synchronized (this.var_667) {
                            this.var_66f.close();
                        }
                    }
                    catch (final Exception ex) {}
                }
                if (this.var_667 != null) {
                    try {
                        synchronized (this.var_667) {
                            ((Connection)this.var_667).close();
                        }
                    }
                    catch (final Exception ex2) {}
                }
                if (this.var_677 != null) {
                    try {
                        synchronized (this.var_677) {
                            this.var_677.close();
                        }
                    }
                    catch (final Exception ex3) {}
                }
                this.var_677 = null;
            }
            this.var_66f = null;
            this.var_667 = null;
            this.var_68f = false;
            this.var_657 = null;
            System.gc();
        }
    }
    
    public final void sub_895(final String str, final String str2) {
        this.var_687 = false;
        System.gc();
        while (this.var_68f) {
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
        this.sub_71b();
        this.var_69f = false;
        this.var_67f = null;
        this.var_68f = true;
        this.var_697 = false;
        this.var_65f = str + str2;
        this.var_69f = false;
        (this.var_657 = new Thread(this)).start();
    }
    
    public final void run() {
        if (this.var_65f == null) {
            this.sub_71b();
            this.var_69f = true;
            this.var_68f = false;
            return;
        }
        try {
            this.var_69f = false;
            if (this.var_697) {
                this.var_68f = false;
                return;
            }
            (this.var_667 = (HttpConnection)Connector.open(this.var_65f, 3)).setRequestMethod("GET");
            this.var_667.setRequestProperty("Connection", "close");
            this.var_6a7 = this.var_667.getResponseCode();
            this.var_667.getResponseMessage();
            this.var_667.getDate();
            if (this.var_6a7 != 200 && this.var_6a7 != 202) {
                this.sub_71b();
                this.var_69f = true;
                this.var_68f = false;
                return;
            }
            if (this.var_697) {
                this.var_68f = false;
                return;
            }
            synchronized (this.var_667) {
                this.var_66f = ((InputConnection)this.var_667).openInputStream();
            }
            Thread.yield();
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final byte[] array = new byte[256];
            int i = 0;
            while (i != -1) {
                if (this.var_697) {
                    this.var_68f = false;
                    return;
                }
                for (int j = 0; j < 256; ++j) {
                    array[j] = 0;
                }
                if (this.var_66f.read(array, 0, 256) == -1) {
                    break;
                }
                for (i = 255; i >= 0 && array[i] == 0; --i) {}
                ++i;
                byteArrayOutputStream.write(array, 0, i);
            }
            this.var_67f = byteArrayOutputStream.toString();
            byteArrayOutputStream.toByteArray();
        }
        catch (final Exception ex) {
            this.var_69f = true;
            this.var_68f = false;
        }
        finally {
            this.sub_71b();
        }
    }
    
    public final String toString() {
        return (String)null + ": " + this.var_65f;
    }
}
