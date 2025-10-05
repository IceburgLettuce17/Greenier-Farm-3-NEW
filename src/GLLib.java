import javax.microedition.lcdui.Command;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.microedition.lcdui.Displayable;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import java.io.InputStream;
import java.util.Random;
import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class GLLib extends Canvas implements Runnable
{
    public static Graphics var_1daf;
    static Graphics var_1db7;
    static boolean s_game_isPaused;
    static int s_game_state;
    static long s_game_timeWhenFrameStart;
    private static long var_1dd7;
    static int var_1ddf;
    static int var_1de7;
    static Display var_1def;
    private static boolean s_game_isInPaint;
    static MIDlet s_application;
    private static int m_FPSLimiter;
    private long m_frameCoheranceTimer;
    static int var_1e17;
    static int var_1e1f;
    private static long s_game_frameDTTimer;
    static int var_1e2f;
    private static int var_1e37;
    static GLLib var_1e3f;
    static boolean var_1e47;
    private static String var_1e4f;
    private static int var_1e57;
    private static int var_1e5f;
    private static int var_1e67;
    private static int var_1e6f;
    private static int var_1e77;
    private static int var_1e7f;
    private static Hashtable standardKeyTable;
    private static Hashtable gameActionKeyTable;
    private static int var_1e97;
    static final int var_1e9f;
    static final int var_1ea7;
    static Random s_math_random;
    static int var_1eb7;
    static int var_1ebf;
    private static int[] var_1ec7;
    private static int[] var_1ecf;
    static final int var_1ed7;
    static final int var_1edf;
    private static int var_1ee7;
    private static int var_1eef;
    private static int var_1ef7;
    static String s_pack_filename;
    private static InputStream s_pack_is;
    private static int var_1f0f;
    private static byte[] var_1f17;
    private static int var_1f1f;
    private static int s_pack_curOffset;
    private static short var_1f2f;
    private static int[] var_1f37;
    private static short var_1f3f;
    private static short[] var_1f47;
    private static int var_1f4f;
    static int var_1f57;
    private static byte[] var_1f5f;
    private static byte[][] MIME_type;
    private static int var_1f6f;
    private static char[] var_1f77;
    private static int[] var_1f7f;
    private static boolean var_1f87;
    static String var_1f8f;
    private static int[] var_1f97;
    private static byte[][] var_1f9f;
    private static int[] var_1fa7;
    private static int[][] var_1faf;
    private static String[][] var_1fb7;
    private static RecordStore s_rs;
    private static int var_1fc7;
    private static int[] var_1fcf;
    private static int[][] var_1fd7;
    static final boolean var_1fdf;
    static int var_1fe7;
    static int[][] var_1fef;
    static boolean var_1ff7;
    private static int var_1fff;
    private static int var_2007;
    static int var_200f;
    static int var_2017;
    static int var_201f;
    static int var_2027;
    static int var_202f;
    static int var_2037;
    static int var_203f;
    private static int var_2047;
    private static int var_204f;
    private static boolean var_2057;
    private static boolean var_205f;
    private static boolean var_2067;
    private static long var_206f;
    
    abstract void Game_update();
    
    public GLLib(final Object o, final Object o2) {
        GLLib.var_1e3f = this;
        GLLib.s_game_state = -1;
        GLLib.s_game_isInPaint = true;
        GLLib.s_application = (MIDlet)o;
        GLLib.var_1def = (Display)o2;
        this.SetupDisplay();
        GLLib.gameActionKeyTable = new Hashtable();
        (GLLib.standardKeyTable = new Hashtable()).put(new Integer(48), new Integer(6));
        GLLib.standardKeyTable.put(new Integer(49), new Integer(7));
        GLLib.standardKeyTable.put(new Integer(50), new Integer(1));
        GLLib.standardKeyTable.put(new Integer(51), new Integer(9));
        GLLib.standardKeyTable.put(new Integer(52), new Integer(3));
        GLLib.standardKeyTable.put(new Integer(53), new Integer(5));
        GLLib.standardKeyTable.put(new Integer(54), new Integer(4));
        GLLib.standardKeyTable.put(new Integer(55), new Integer(13));
        GLLib.standardKeyTable.put(new Integer(56), new Integer(2));
        GLLib.standardKeyTable.put(new Integer(57), new Integer(15));
        GLLib.standardKeyTable.put(new Integer(35), new Integer(17));
        GLLib.standardKeyTable.put(new Integer(42), new Integer(16));
        GLLib.standardKeyTable.put(new Integer(-6), new Integer(18));
        GLLib.standardKeyTable.put(new Integer(-7), new Integer(19));
        GLLib.standardKeyTable.put(new Integer(-8), new Integer(24));
        GLLib.gameActionKeyTable.put(new Integer(-5), new Integer(5));
        GLLib.gameActionKeyTable.put(new Integer(-1), new Integer(1));
        GLLib.gameActionKeyTable.put(new Integer(-2), new Integer(2));
        GLLib.gameActionKeyTable.put(new Integer(-3), new Integer(3));
        GLLib.gameActionKeyTable.put(new Integer(-4), new Integer(4));
        GLLib.s_game_frameDTTimer = System.currentTimeMillis();
        this.m_frameCoheranceTimer = GLLib.s_game_frameDTTimer;
    }
    
    protected final void Init() {
        if (GLLib.s_game_state >= 0) {
            return;
        }
        GLLib.var_1ddf = 800;
        GLLib.var_1de7 = 480;
        GLLib.var_202f = 0;
        if (!GLLib.var_1f87) {
            GLLib.var_1f7f = new int[256];
            for (int i = 0; i < 256; ++i) {
                int n = i;
                for (int j = 8; j > 0; --j) {
                    if ((n & 0x1) == 0x1) {
                        n = (n >>> 1 ^ 0xEDB88320);
                    }
                    else {
                        n >>>= 1;
                    }
                }
                GLLib.var_1f7f[i] = n;
            }
            GLLib.var_1f87 = true;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (GLLib.s_math_random == null) {
            GLLib.s_math_random = new Random(currentTimeMillis);
        }
        else {
            GLLib.s_math_random.setSeed(currentTimeMillis);
        }
        GLLib.s_game_state = 0;
        new Thread(this).start();
    }
    
    protected void UnInit() {
        GLLib.MIME_type = null;
        System.gc();
    }
    
    protected void Pause() {
        if (!GLLib.s_game_isPaused) {
            GLLib.s_game_isPaused = true;
            GLLibPlayer.sub_35e7();
        }
    }
    
    private void Resume() {
        if (GLLib.s_game_isPaused) {
            final long time = GLLib.s_game_frameDTTimer = (GLLib.s_game_timeWhenFrameStart = System.currentTimeMillis());
            this.m_frameCoheranceTimer = time;
            GLLib.s_game_isPaused = false;
            this.SetupDisplay();
            if (!GLLib.s_game_isInPaint) {
                this.repaint();
            }
            ResetKey();
        }
    }
    
    public void hideNotify() {
        this.Pause();
    }
    
    public void showNotify() {
        this.Resume();
    }
    
    public void sizeChanged(final int n, final int n2) {
    }
    
    private void SetupDisplay() {
        this.setFullScreenMode(true);
        if (GLLib.var_1def != null && GLLib.var_1def.getCurrent() != this) {
            GLLib.var_1def.setCurrent((Displayable)this);
        }
    }
    
    public void run() {
        try {
            this.SetupDisplay();
            GLLib.s_game_isInPaint = false;
            while (GLLib.s_game_state >= 0) {
                if (!GLLib.s_game_isPaused) {
                    this.repaint();
                    this.serviceRepaints();
                    long curTime = System.currentTimeMillis();
                    this.m_frameCoheranceTimer = Math.min(this.m_frameCoheranceTimer, curTime);
                    if (GLLib.var_1e17 >= 0) {
                        if (GLLib.var_1e17 == 0) {
                            Thread.yield();
                        }
                        else {
                            Thread.sleep(GLLib.var_1e17);
                        }
                    }
                    else {
                        Thread.sleep(Math.max(1L, GLLib.m_FPSLimiter - (curTime - this.m_frameCoheranceTimer)));
                    }
                    this.m_frameCoheranceTimer = System.currentTimeMillis();
                }
                else {
                    this.m_frameCoheranceTimer = Math.min(this.m_frameCoheranceTimer, System.currentTimeMillis());
                    Thread.sleep(1L);
                }
            }
        }
        catch (final Exception ex) {
            GLLib.s_game_state = -1;
        }
        this.UnInit();
        GLLib.s_application.notifyDestroyed();
    }
    
    public void paint(final Graphics graphics) {
        final long n = System.currentTimeMillis() - GLLib.var_1dd7;
        GLLib.var_1dd7 = System.currentTimeMillis();
        if (n > 3000 && GLLib.var_1dd7 != 0L) {
            this.Pause();
            this.Resume();
        }
        if (GLLib.s_game_isPaused || GLLib.s_game_isInPaint) {
            return;
        }
        GLLib.s_game_isInPaint = true;
        if (GLLib.s_game_state != -1) {
            GLLib.var_1e57 = GLLib.var_1e6f;
            GLLib.var_1e5f = GLLib.var_1e77;
            GLLib.var_1e6f = 0;
            GLLib.var_1e77 = 0;
            if (GLLib.var_1e7f > 0) {
                if (GLLib.var_1e7f != Integer.MAX_VALUE) {
                    GLLib.var_1e7f -= GLLib.var_1e1f;
                }
                ResetKey();
            }
        }
        switch (GLLib.var_202f) {
            case 1: {
                GLLib.var_202f = 4;
                break;
            }
            case 2: {
                GLLib.var_202f = 0;
                break;
            }
        }
        if (GLLib.var_2057) {
            GLLib.var_202f = 1;
            GLLib.var_2057 = false;
        }
        else if (GLLib.var_205f) {
            GLLib.var_202f = 2;
            GLLib.var_205f = false;
            GLLib.var_2067 = false;
        }
        else if (GLLib.var_2067) {
            GLLib.var_202f = 3;
            GLLib.var_2067 = false;
        }
        GLLib.var_2047 = GLLib.var_2037;
        GLLib.var_204f = GLLib.var_203f;
        if ((GLLib.var_1e1f = (int)((GLLib.s_game_timeWhenFrameStart = System.currentTimeMillis()) - GLLib.s_game_frameDTTimer)) < 0) {
            GLLib.var_1e1f = 0;
        }
        if (GLLib.var_1e1f > 1000) {
            GLLib.var_1e1f = 1000;
        }
        GLLib.s_game_frameDTTimer = GLLib.s_game_timeWhenFrameStart;
        GLLib.var_1e2f += GLLib.var_1e1f;
        ++GLLib.var_1e37;
        try {
            GLLib.var_1db7 = graphics;
            GLLib.var_1daf = graphics;
            this.Game_update();
        }
        catch (final Exception ex) {
            GLLib.s_game_state = -1;
        }
        GLLib.s_game_isInPaint = false;
    }
    
    static final void sub_28bf(final String var_1e4f) {
        GLLib.var_1e47 = true;
        GLLib.var_1e4f = var_1e4f;
        new Thread(new Class_j()).start();
    }
    
    static final void sub_28f3() {
        GLLib.var_1e47 = false;
        if (GLLib.var_1e4f != null) {
            try {
                GLLib.s_application.platformRequest(GLLib.var_1e4f);
            }
            catch (final Exception ex) {}
        }
    }
    
    protected void keyPressed(final int n) {
        final int n2 = 1 << sub_2a05(n);
        GLLib.var_1e6f |= n2;
        GLLib.var_1e67 |= n2;
    }
    
    protected void keyReleased(final int n) {
        final int n2 = 1 << sub_2a05(n);
        GLLib.var_1e77 |= n2;
        GLLib.var_1e67 &= ~n2;
    }
    
    public static void Game_KeySetKeyCode(final boolean gameAction, final int keyCode, final int key) {
        Hashtable hashtable = null;
        final Integer ikey = new Integer(keyCode);
        if (gameAction) {
            hashtable = GLLib.gameActionKeyTable;
        }
        else {
            hashtable = GLLib.standardKeyTable;
        }
        final Integer oldAssignation = (Integer) hashtable.get(ikey);
        if (oldAssignation != null) {
            hashtable.remove(ikey);
        }
        hashtable.put(ikey, new Integer(key));
    }
    
    private static byte sub_2a05(final int value) {
        final Integer n = new Integer(value);
        if (GLLib.standardKeyTable == null) {
            return 0;
        }
        final Integer n2;
        if ((n2 = (Integer) GLLib.standardKeyTable.get(n)) != null) {
            return n2.byteValue();
        }
        final Integer n3;
        if ((n3 = (Integer) GLLib.gameActionKeyTable.get(n)) != null) {
            return n3.byteValue();
        }
        return 0;
    }
    
    private static void ResetKey() {
        GLLib.var_1e57 = 0;
        GLLib.var_1e5f = 0;
        GLLib.var_1e67 = 0;
        GLLib.var_1e6f = 0;
        GLLib.var_1e77 = 0;
    }
    
    public static int sub_2ab2() {
        if (GLLib.var_1e57 == 0) {
            return -1;
        }
        int var_1e97 = GLLib.var_1e97;
        while (--var_1e97 >= 0) {
            if ((GLLib.var_1e57 & 1 << var_1e97) != 0x0) {
                return var_1e97;
            }
        }
        return -1;
    }
    
    public static int sub_2b09() {
        if (GLLib.var_1e5f == 0) {
            return -1;
        }
        int var_1e97 = GLLib.var_1e97;
        while (--var_1e97 >= 0) {
            if ((GLLib.var_1e5f & 1 << var_1e97) != 0x0) {
                return var_1e97;
            }
        }
        return -1;
    }
    
    static void Math_Init(final String s) {
        Pack_Open(s);
        GLLib.var_1ec7 = (int[])sub_3451(1);
        GLLib.var_1ecf = (int[])sub_3451(0);
        Pack_Close(true);
    }
    
    static int sub_2b97(final int n, final int n2) {
        if (n2 != n) {
            int nextInt;
            if ((nextInt = GLLib.s_math_random.nextInt()) < 0) {
                nextInt = -nextInt;
            }
            return n + nextInt % (n2 - n);
        }
        return n2;
    }
    
    static int sub_2be7(int n) {
        if (n < 0) {
            n = -n;
        }
        if ((n &= GLLib.var_1ef7 - 1) <= GLLib.var_1edf) {
            return GLLib.var_1ec7[n];
        }
        if (n < GLLib.var_1ee7) {
            n = GLLib.var_1ee7 - n;
            return -GLLib.var_1ec7[n];
        }
        if (n <= GLLib.var_1eef) {
            n -= GLLib.var_1ee7;
            return -GLLib.var_1ec7[n];
        }
        n = GLLib.var_1ef7 - n;
        return GLLib.var_1ec7[n];
    }
    
    static int sub_2c75(final int n) {
        if (n >= 65536) {
            if (n >= 16777216) {
                if (n >= 268435456) {
                    if (n >= 1073741824) {
                        return GLLib.var_1ecf[n >> 24] << 8;
                    }
                    return GLLib.var_1ecf[n >> 22] << 7;
                }
                else {
                    if (n >= 67108864) {
                        return GLLib.var_1ecf[n >> 20] << 6;
                    }
                    return GLLib.var_1ecf[n >> 18] << 5;
                }
            }
            else if (n >= 1048576) {
                if (n >= 4194304) {
                    return GLLib.var_1ecf[n >> 16] << 4;
                }
                return GLLib.var_1ecf[n >> 14] << 3;
            }
            else {
                if (n >= 262144) {
                    return GLLib.var_1ecf[n >> 12] << 2;
                }
                return GLLib.var_1ecf[n >> 10] << 1;
            }
        }
        else if (n >= 256) {
            if (n >= 4096) {
                if (n >= 16384) {
                    return GLLib.var_1ecf[n >> 8];
                }
                return GLLib.var_1ecf[n >> 6] >> 1;
            }
            else {
                if (n >= 1024) {
                    return GLLib.var_1ecf[n >> 4] >> 2;
                }
                return GLLib.var_1ecf[n >> 2] >> 3;
            }
        }
        else {
            if (n >= 0) {
                return GLLib.var_1ecf[n] >> 4;
            }
            return 0;
        }
    }
    
    static void sub_2dcf(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int n7) {
        final int n8 = n7 * n7;
        final int n10;
        final int n9 = n10 = GLLib.var_1e9f - n7;
        final int n11 = n9 * n9;
        n7 *= n10;
        GLLib.var_1eb7 = (n * n11 + (n3 << 1) * n7 + n5 * n8) / (1 << 16);
        GLLib.var_1ebf = (n2 * n11 + (n4 << 1) * n7 + n6 * n8) / (1 << 16);
    }
    
    private static void sub_2e37() {
        int n;
        if (GLLib.var_1f4f == GLLib.var_1f3f - 1) {
            n = GLLib.var_1f2f - GLLib.var_1f47[GLLib.var_1f4f];
        }
        else {
            n = GLLib.var_1f47[GLLib.var_1f4f + 1] - GLLib.var_1f47[GLLib.var_1f4f];
        }
        GLLib.var_1f37 = new int[n + 1];
        for (int i = 0; i < n + 1; ++i) {
            GLLib.var_1f37[i] = ((Pack_Read() & 0xFF) | (Pack_Read() & 0xFF) << 8 | ((Pack_Read() & 0xFF) << 16 | (Pack_Read() & 0xFF) << 24));
        }
    }
    
    static final void Pack_Open(final String filename) {
        GLLib.var_1f0f = 1;
        if (GLLib.s_pack_filename == null || filename == null || filename.compareTo(GLLib.s_pack_filename) != 0) {
            Pack_Close(true);
            GLLib.s_pack_filename = filename;
            GLLib.var_1f17 = null;
            GLLib.var_1f1f = 0;
            GLLib.s_pack_is = GetResourceAsStream(GLLib.s_pack_filename);
            GLLib.var_1f2f = (short)sub_3399();
            GLLib.var_1f47 = new short[GLLib.var_1f3f = (short)sub_3399()];
            for (short n = 0; n < GLLib.var_1f3f; ++n) {
                GLLib.var_1f47[n] = (short)sub_3399();
            }
            GLLib.var_1f4f = 0;
            sub_2e37();
        }
    }
    
    private static InputStream GetResourceAsStream(String s) {
        InputStream resourceAsStream = null;
        if (GLLib.var_1f0f == 3) {
            resourceAsStream = new ByteArrayInputStream(null, 0, 0);
        }
        else if (GLLib.var_1f0f != 2 && GLLib.var_1f0f == 1) {
            resourceAsStream = "".getClass().getResourceAsStream(s);
        }
        return resourceAsStream;
    }
    
    static final void Pack_FullyClose() {
        Pack_Close(true);
    }
    
    private static final void Pack_Close(final boolean resetFilename) {
        Pack_ClosePart1();
        if (GLLib.var_1f0f == 3) {
            GLLib.var_1f17 = null;
        }
        if (resetFilename) {
            GLLib.s_pack_filename = null;
        }
        System.gc();
    }
    
    private static final void Pack_ClosePart1() {
        if (GLLib.s_pack_is != null) {
            try {
                GLLib.s_pack_is.close();
            }
            catch (final Exception ex) {}
            GLLib.s_pack_is = null;
        }
        GLLib.s_pack_curOffset = 0;
    }
    
    private static int sub_30b8(int n) {
        int var_1f4f;
        for (var_1f4f = GLLib.var_1f3f - 1; var_1f4f >= 0 && GLLib.var_1f47[var_1f4f] > n; --var_1f4f) {}
        if (GLLib.var_1f4f != var_1f4f) {
            GLLib.var_1f4f = var_1f4f;
            Pack_Close(false);
            if (GLLib.var_1f4f == 0) {
                final String var_1eff = GLLib.s_pack_filename;
                GLLib.s_pack_filename = null;
                Pack_Open(var_1eff);
            }
            else {
                GLLib.s_pack_is = GetResourceAsStream(GLLib.s_pack_filename + "." + GLLib.var_1f4f);
                sub_2e37();
            }
        }
        else if (GLLib.s_pack_is == null) {
            if (GLLib.var_1f4f == 0) {
                final String var_1eff2 = GLLib.s_pack_filename;
                GLLib.s_pack_filename = null;
                Pack_Open(var_1eff2);
            }
            else {
                GLLib.s_pack_is = GetResourceAsStream(GLLib.s_pack_filename + "." + GLLib.var_1f4f);
            }
        }
        n -= GLLib.var_1f47[GLLib.var_1f4f];
        int n2 = GLLib.var_1f37[n];
        n = GLLib.var_1f37[n + 1] - GLLib.var_1f37[n];
        if (GLLib.s_pack_curOffset != n2) {
            if (GLLib.s_pack_curOffset > n2) {
                Pack_ClosePart1();
                if (GLLib.var_1f4f == 0) {
                    GLLib.s_pack_is = GetResourceAsStream(GLLib.s_pack_filename);
                }
                else {
                    GLLib.s_pack_is = GetResourceAsStream(GLLib.s_pack_filename + "." + GLLib.var_1f4f);
                }
            }
            else {
                n2 -= GLLib.s_pack_curOffset;
            }
            sub_3280(n2);
        }
        if (n > 0) {
            GLLib.var_1f57 = (Pack_Read() & 0xFF);
            --n;
        }
        return n;
    }
    
    static final byte[] Pack_ReadData(int idx) {
        byte[] data = new byte[idx = sub_30b8(idx)];
        Pack_ReadFully(data, 0, data.length);
        return data;
    }
    
    private static void sub_3280(int i) {
        if (i == 0) {
            return;
        }
        if (GLLib.var_1f0f == 3) {
            GLLib.s_pack_curOffset += i;
            try {
                while (i > 0) {
                    i -= (int)GLLib.s_pack_is.skip(i);
                }
                return;
            }
            catch (final Exception ex) {
                return;
            }
        }
        if (GLLib.var_1f5f == null) {
            GLLib.var_1f5f = new byte[256];
        }
        while (i > 256) {
            Pack_ReadFully(GLLib.var_1f5f, 0, 256);
            i -= 256;
        }
        if (i > 0) {
            Pack_ReadFully(GLLib.var_1f5f, 0, i);
        }
    }
    
    private static int Pack_Read() {
        int read = 0;
        try {
            read = GLLib.s_pack_is.read();
        }
        catch (final Exception ex) {}
        ++GLLib.s_pack_curOffset;
        return read;
    }
    
    private static int sub_3399() {
        return (Pack_Read() & 0xFF) | (Pack_Read() & 0xFF) << 8;
    }
    
    private static int Pack_ReadFully(final byte[] array, int offset, final int length) {
        offset = 0;
        int len = length;
        try {
            while (len > 0) {
                final int read = GLLib.s_pack_is.read(array, offset, len);
                len -= read;
                offset += read;
            }
        }
        catch (final Exception ex) {}
        GLLib.s_pack_curOffset += length;
        return length;
    }
    
    static final Object sub_3451(final int n) {
        sub_30b8(n);
        GLLib.var_1f6f = 0;
        final Object sub_3fb9 = sub_3fb9(GLLib.s_pack_is);
        GLLib.s_pack_curOffset += GLLib.var_1f6f;
        return sub_3fb9;
    }
    
    static void sub_3487(final String s) {
        if (GLLib.MIME_type == null) {
            GLLib.s_pack_is = GetResourceAsStream(s);
            GLLib.MIME_type = new byte[Pack_Read()][];
            for (int i = 0; i < Pack_Read(); ++i) {
                Pack_ReadFully(GLLib.MIME_type[i] = new byte[Pack_Read()], 0, Pack_Read());
            }
            try {
                GLLib.s_pack_is.close();
            }
            catch (final Exception ex) {}
        }
    }
    
    static String sub_3535(final int n) {
        if (n >= GLLib.MIME_type.length) {
            return "";
        }
        try {
            return new String(GLLib.MIME_type[n], "UTF-8");
        }
        catch (final Exception ex) {
            return "";
        }
    }
    
    private static void sub_358e(final Graphics graphics, int color, final int n, final int n2) {
        color = ((color & 0xFF) << 16 | (n & 0xFF) << 8 | (n2 & 0xFF));
        graphics.setColor(color);
    }
    
    static final int sub_35c6(final Graphics graphics, final boolean b) {
        if (b) {
            return graphics.getClipY();
        }
        return graphics.getClipX();
    }
    
    static final int sub_3600(final Graphics graphics, final boolean b) {
        if (b) {
            return ASprite.var_10cf - graphics.getClipX() - graphics.getClipWidth();
        }
        return graphics.getClipY();
    }
    
    static final int sub_3643(final Graphics graphics, final boolean b) {
        if (b) {
            return graphics.getClipHeight();
        }
        return graphics.getClipWidth();
    }
    
    static final int sub_367d(final Graphics graphics, final boolean b) {
        if (b) {
            return graphics.getClipWidth();
        }
        return graphics.getClipHeight();
    }
    
    static final void sub_36b7(final Graphics graphics, int n, int n2, int n3, int n4, final boolean b) {
        final int n5 = n;
        n = ASprite.var_10cf - n2 - n4;
        n2 = n5;
        final int n6 = n3;
        n3 = n4;
        n4 = n6;
        graphics.clipRect(n, n2, n3, n4);
    }
    
    static final void sub_36f4(final Graphics graphics, int n, int n2, int n3, int n4, final boolean b) {
        final int n5 = n;
        n = ASprite.var_10cf - n2 - n4;
        n2 = n5;
        final int n6 = n3;
        n3 = n4;
        n4 = n6;
        graphics.setClip(n, n2, n3, n4);
    }
    
    static final void sub_3731(final Graphics graphics, int n, int n2, int n3, int n4, final boolean b) {
        final int n5 = n;
        n = ASprite.var_10cf - n2 - 1;
        n2 = n5;
        final int n6 = n3;
        n3 = ASprite.var_10cf - n4 - 1;
        n4 = n6;
        graphics.drawLine(n, n2, n3, n4);
    }
    
    static final void sub_3773(final Graphics graphics, int n, int n2, int n3, int n4, final boolean b) {
        final int n5 = n;
        n = ASprite.var_10cf - n2 - n4;
        n2 = n5;
        final int n6 = n3;
        n3 = n4;
        n4 = n6;
        graphics.fillRect(n, n2, n3, n4);
    }
    
    static final void sub_37b0(final Graphics graphics, int n, int n2, int n3, int n4, final boolean b) {
        final int n5 = n;
        n = ASprite.var_10cf - n2 - n4 - 1;
        n2 = n5;
        final int n6 = n3;
        n3 = n4;
        n4 = n6;
        graphics.drawRect(n, n2, n3, n4);
    }
    
    static final void sub_37ef(final Graphics graphics, int n, int n2, int n3, int n4, int n5, final int n6, final boolean b) {
        final int n7 = n;
        n = ASprite.var_10cf - n2 - n4;
        n2 = n7;
        final int n8 = n3;
        n3 = n4;
        n4 = n8;
        n5 -= 90;
        graphics.fillArc(n, n2, n3, n4, n5, n6);
    }
    
    static final void sub_3833(final Graphics graphics, int n, int n2, int n3, int n4, int n5, final int n6, final boolean b) {
        final int n7 = n;
        n = ASprite.var_10cf - n2 - n4;
        n2 = n7;
        final int n8 = n3;
        n3 = n4;
        n4 = n8;
        n5 -= 90;
        graphics.drawArc(n, n2, n3, n4, n5, n6);
    }
    
    static final void sub_3877(final String s, final int n, final int n2, int n3) {
        try {
            int n4 = n3;
            if ((n3 & 0x2) != 0x0) {
                n4 = ((n3 & 0xFFFFFFFD) | 0x40);
            }
            n3 = n4;
            GLLib.var_1daf.drawString(s, n, n2, n3);
        }
        catch (final Exception ex) {}
    }
    
    static final void sub_38df(final Graphics graphics, Class_l class_l, final int n, final int n2, int n3, final boolean b) {
        try {
            if (b) {
                final Class_l class_l2 = class_l;
                final int width = class_l.var_192.getWidth();
                final int height = class_l.var_192.getHeight();
                n3 = width;
                class_l = class_l2;
                sub_3966(graphics, class_l2, 0, 0, n3, height, 0, n, n2, 20, true);
                return;
            }
            graphics.drawImage(class_l.var_192, n, n2, 20);
        }
        catch (final Exception ex) {}
    }
    
    static final void sub_3966(final Graphics graphics, final Class_l class_l, final int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, final boolean b) {
        if (b) {
            if (n5 == 0) {
                n5 = 5;
            }
            else if (n5 == 5) {
                n5 = 3;
            }
            else if (n5 == 3) {
                n5 = 6;
            }
            else if (n5 == 6) {
                n5 = 0;
            }
            else if (n5 == 2) {
                n5 = 7;
            }
            n2 = n6;
            n6 = ASprite.var_10cf - n7;
            n7 = n2;
            n8 = 24;
        }
        if (n3 >= class_l.var_192.getWidth()) {
            n3 += class_l.var_192.getWidth() - n3;
        }
        if (n4 >= class_l.var_192.getHeight()) {
            n4 += class_l.var_192.getHeight() - n4;
        }
        if (n4 <= 0 || n3 <= 0) {
            return;
        }
        try {
            graphics.drawRegion(class_l.var_192, 0, 0, n3, n4, n5, n6, n7, n8);
        }
        catch (final Exception ex) {}
    }
    
    static final void sub_3b26(final Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, final boolean b) {
        final int n7 = n;
        n = ASprite.var_10cf - n2 - 1;
        n2 = n7;
        final int n8 = n3;
        n3 = ASprite.var_10cf - n4 - 1;
        n4 = n8;
        final int n9 = n5;
        n5 = ASprite.var_10cf - n6 - 1;
        n6 = n9;
        graphics.fillTriangle(n, n2, n3, n4, n5, n6);
        final int n10 = n;
        final int n11 = n2;
        final int n12 = n3;
        final int n13 = n11;
        final int n14 = n10;
        sub_3731(graphics, n, n2, n3, n4, true);
        final int n15 = n5;
        n3 = n6;
        n2 = n15;
        sub_3731(graphics, n14, n13, n2, n6, true);
        sub_3731(graphics, n2, n3, n12, n4, true);
    }
    
    static final void sub_3bae(final Graphics graphics, int[] sub_9c11, final int n, int n2, int n3, int n4, int n5, int n6, final boolean b, final boolean b2, int n7, int n8, final boolean b3) {
        if (b3) {
            int n9 = n6;
            if ((n7 & 0x4) != 0x0) {
                n9 = n5;
                if (((n7 &= 0xFFFFFFFB) & 0x2) != 0x0) {
                    n7 &= 0xFFFFFFFD;
                }
                else {
                    n7 |= 0x2;
                }
                if ((n7 & 0x1) != 0x0) {
                    n7 &= 0xFFFFFFFE;
                }
                else {
                    n7 |= 0x1;
                }
            }
            else {
                n7 |= 0x4;
            }
            n8 = n3;
            n3 = ASprite.var_10cf - n4 - n9;
            n4 = n8;
        }
        if (n7 != 0) {
            int n10 = 0;
            if ((n7 & 0x4) != 0x0) {
                n10 = n5;
                n5 = n6;
                n6 = n2;
                n2 = n5;
            }
            final int[] array = sub_9c11;
            final int n11 = n5;
            final int n12 = n6;
            final int n13 = n7;
            final int n14 = n12;
            n8 = n11;
            sub_9c11 = ASprite.sub_9c11(array, n11, n14, n13, null);
            if ((n7 & 0x4) != 0x0) {
                n6 = n10;
            }
        }
        graphics.drawRGB(sub_9c11, 0, n2, n3, n4, n5, n6, b);
    }
    
    static final void sub_3d3b(final Class_l class_l, final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        class_l.sub_202(array, 0, n2, 0, 0, n5, n6);
    }
    
    static int sub_3d63(final byte[] array, int n, final byte b) {
        array[n++] = b;
        return n;
    }
    
    static int sub_3d86(final byte[] array, int n, final short n2) {
        array[n++] = (byte)n2;
        array[n++] = (byte)(n2 >>> 8);
        return n;
    }
    
    static int Mem_SetInt(final byte[] dst, int dst_off, final int src) {
        dst[dst_off++] = (byte)src;
        dst[dst_off++] = (byte)(src >>> 8);
        dst[dst_off++] = (byte)(src >>> 16);
        dst[dst_off++] = (byte)(src >> 24);
        return dst_off;
    }
    
    static int sub_3df9(final byte[] array, int n, final long n2) {
        array[n++] = (byte)(n2 & 0xFFL);
        array[n++] = (byte)(n2 >>> 8 & 0xFFL);
        array[n++] = (byte)(n2 >>> 16 & 0xFFL);
        array[n++] = (byte)(n2 >>> 24 & 0xFFL);
        array[n++] = (byte)(n2 >>> 32 & 0xFFL);
        array[n++] = (byte)(n2 >>> 40 & 0xFFL);
        array[n++] = (byte)(n2 >>> 48 & 0xFFL);
        array[n++] = (byte)(n2 >>> 56 & 0xFFL);
        return n;
    }
    
    static byte Mem_GetByte(final byte[] src, final int src_off) {
        return src[src_off];
    }
    
    static short sub_3eb0(final byte[] array, int n) {
        return (short)((array[n++] & 0xFF) | (array[n] & 0xFF) << 8);
    }
    
    static int Mem_GetInt(final byte[] src, int src_off) {
        return (src[src_off++] & 0xFF) | (src[src_off++] & 0xFF) << 8 | (src[src_off++] & 0xFF) << 16 | (src[src_off] & 0xFF) << 24;
    }
    
    static long sub_3f2d(final byte[] array, int n) {
        return (long)(array[n++] & 0xFF) | (long)(array[n++] & 0xFF) << 8 | (long)(array[n++] & 0xFF) << 16 | (long)(array[n++] & 0xFF) << 24 | (long)(array[n++] & 0xFF) << 32 | (long)(array[n++] & 0xFF) << 40 | (long)(array[n++] & 0xFF) << 48 | (long)(array[n] & 0xFF) << 56;
    }
    
    private static Object sub_3fb9(final InputStream inputStream) {
        Object o = null;
        try {
            final int sub_4332;
            final int n = (sub_4332 = sub_4332(inputStream)) >> 4;
            final int n2 = sub_4332 & 0x7;
            int n3;
            if ((sub_4332 & 0x8) != 0x0) {
                n3 = sub_436e(inputStream);
            }
            else {
                n3 = sub_4332(inputStream);
            }
            switch (n2) {
                case 0: {
                    final byte[] array = new byte[n3];
                    for (int i = 0; i < n3; ++i) {
                        array[i] = (byte)sub_4332(inputStream);
                    }
                    o = array;
                    break;
                }
                case 1: {
                    final short[] array2 = new short[n3];
                    if (n == 0) {
                        for (int j = 0; j < n3; ++j) {
                            array2[j] = (byte)sub_4332(inputStream);
                        }
                    }
                    else {
                        for (int k = 0; k < n3; ++k) {
                            array2[k] = (short)sub_436e(inputStream);
                        }
                    }
                    o = array2;
                    break;
                }
                case 2: {
                    final int[] array3 = new int[n3];
                    if (n == 0) {
                        for (int l = 0; l < n3; ++l) {
                            array3[l] = (byte)sub_4332(inputStream);
                        }
                    }
                    else if (n == 1) {
                        for (int n4 = 0; n4 < n3; ++n4) {
                            array3[n4] = (short)sub_436e(inputStream);
                        }
                    }
                    else {
                        for (int n5 = 0; n5 < n3; ++n5) {
                            array3[n5] = sub_439d(inputStream);
                        }
                    }
                    o = array3;
                    break;
                }
                default: {
                    Object[] array4 = null;
                    switch (n2 & 0x3) {
                        case 0: {
                            if (n == 2) {
                                array4 = new byte[n3][];
                                break;
                            }
                            array4 = new byte[n3][][];
                            break;
                        }
                        case 1: {
                            if (n == 2) {
                                array4 = new short[n3][];
                                break;
                            }
                            array4 = new short[n3][][];
                            break;
                        }
                        default: {
                            if (n == 2) {
                                array4 = new int[n3][];
                                break;
                            }
                            array4 = new int[n3][][];
                            break;
                        }
                    }
                    for (int n6 = 0; n6 < n3; ++n6) {
                        array4[n6] = sub_3fb9(inputStream);
                    }
                    o = array4;
                    break;
                }
            }
        }
        catch (final Exception ex) {}
        return o;
    }
    
    private static int sub_4332(final InputStream inputStream) throws IOException {
        final int read;
        if ((read = inputStream.read()) >= 0) {
            ++GLLib.var_1f6f;
        }
        return read;
    }
    
    private static int sub_436e(final InputStream inputStream) throws IOException {
        return (sub_4332(inputStream) & 0xFF) | (sub_4332(inputStream) & 0xFF) << 8;
    }
    
    private static int sub_439d(final InputStream inputStream) throws IOException {
        return (sub_4332(inputStream) & 0xFF) | (sub_4332(inputStream) & 0xFF) << 8 | ((sub_4332(inputStream) & 0xFF) << 16 | (sub_4332(inputStream) & 0xFF) << 24);
    }
    
    private static int sub_43e4(final InputStream inputStream, final byte[] b, int off, final int n) {
        off = 0;
        int i = n;
        try {
            while (i > 0) {
                final int read = inputStream.read(b, off, i);
                i -= read;
                off += read;
            }
        }
        catch (final Exception ex) {}
        GLLib.var_1f6f += n;
        return n;
    }
    
    private static int[] sub_447e(final byte[] array, final boolean b, int[] array2) {
        final int n = ((array.length & 0x3) == 0x0) ? (array.length >>> 2) : ((array.length >>> 2) + 1);
        if (b) {
            (array2 = new int[n + 1])[n] = array.length;
        }
        else {
            array2 = new int[n];
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final int[] array3 = array2;
            final int n2 = i >>> 2;
            array3[n2] |= (0xFF & array[i]) << ((i & 0x3) << 3);
        }
        return array2;
    }
    
    static String sub_4545(final byte[] array) {
        final StringBuffer sb = new StringBuffer(array.length << 1);
        for (int i = 0; i < array.length; ++i) {
            sb.append(GLLib.var_1f77[array[i] >> 4 & 0xF]);
            sb.append(GLLib.var_1f77[array[i] & 0xF]);
        }
        return sb.toString();
    }
    
    static int sub_45c0(final int[] array, int n, int n2, int n3) {
        n3 ^= -1;
        while (n2-- != 0) {
            for (int i = 0; i < 4; ++i) {
                n3 = (GLLib.var_1f7f[(n3 ^ (byte)(array[n] >> i)) & 0xFF] ^ n3 >>> 8);
            }
            ++n;
        }
        return ~n3;
    }
    
    static byte[] sub_4655(byte[] array, final String anObject, final boolean b) {
        byte[] bytes = null;
        if (!"".equals(anObject) && anObject != null) {
            bytes = anObject.getBytes();
        }
        final byte[] array2 = array;
        final byte[] array3 = bytes;
        array = array2;
        if (array2.length == 0) {
            return array;
        }
        final int[] sub_447e = sub_447e(array, true, null);
        int[] sub_447e2 = sub_447e(array3, false, null);
        final int[] array4 = sub_447e;
        final int n;
        if ((n = sub_447e.length - 1) >= 1) {
            if (sub_447e2.length < 4) {
                final int[] array5 = new int[4];
                System.arraycopy(sub_447e2, 0, array5, 0, sub_447e2.length);
                sub_447e2 = array5;
            }
            int n2 = array4[n];
            final int n3 = -1640531527;
            int n4 = 0;
            int n5 = 6 + 52 / (n + 1);
            while (n5-- > 0) {
                final int n6 = (n4 += n3) >>> 2 & 0x3;
                int i;
                for (i = 0; i < n; ++i) {
                    final int n7 = array4[i + 1];
                    final int[] array6 = array4;
                    final int n8 = i;
                    final int n9 = array6[n8] + ((n2 >>> 5 ^ n7 << 2) + (n7 >>> 3 ^ n2 << 4) ^ (n4 ^ n7) + (sub_447e2[(i & 0x3) ^ n6] ^ n2));
                    array6[n8] = n9;
                    n2 = n9;
                }
                final int n10 = array4[0];
                final int[] array7 = array4;
                final int n11 = n;
                final int n12 = array7[n11] + ((n2 >>> 5 ^ n10 << 2) + (n10 >>> 3 ^ n2 << 4) ^ (n4 ^ n10) + (sub_447e2[(i & 0x3) ^ n6] ^ n2));
                array7[n11] = n12;
                n2 = n12;
            }
        }
        final int[] array9;
        final int n13;
        final byte[] array8 = new byte[n13 = (array9 = array4).length << 2];
        for (int j = 0; j < n13; ++j) {
            array8[j] = (byte)(array9[j >>> 2] >>> ((j & 0x3) << 3));
        }
        return array8;
    }
    
    static int sub_4822() {
        try {
            final String property;
            if ((property = System.getProperty("microedition.locale")) == null) {
                return 0;
            }
            final String upperCase;
            if ((upperCase = property.toUpperCase()).indexOf("EN") >= 0) {
                return 0;
            }
            if (upperCase.indexOf("DE") >= 0) {
                return 1;
            }
            if (upperCase.indexOf("FR") >= 0) {
                return 2;
            }
            if (upperCase.indexOf("IT") >= 0) {
                return 3;
            }
            if (upperCase.indexOf("ES") >= 0) {
                return 4;
            }
            if (upperCase.indexOf("BR") >= 0) {
                return 5;
            }
            if (upperCase.indexOf("PT") >= 0) {
                return 6;
            }
            if (upperCase.indexOf("JA") >= 0) {
                return 7;
            }
            if (upperCase.indexOf("JP") >= 0) {
                return 7;
            }
            if (upperCase.indexOf("ZH") >= 0) {
                return 8;
            }
            if (upperCase.indexOf("CN") >= 0) {
                return 8;
            }
            if (upperCase.indexOf("KO") >= 0) {
                return 9;
            }
            if (upperCase.indexOf("KP") >= 0) {
                return 9;
            }
            if (upperCase.indexOf("KR") >= 0) {
                return 9;
            }
            if (upperCase.indexOf("RU") >= 0) {
                return 10;
            }
            if (upperCase.indexOf("PL") >= 0) {
                return 12;
            }
            if (upperCase.indexOf("TR") >= 0) {
                return 11;
            }
            if (upperCase.indexOf("CZ") >= 0) {
                return 13;
            }
            if (upperCase.indexOf("NL") >= 0) {
                return 14;
            }
            if (upperCase.indexOf("TH") >= 0) {
                return 15;
            }
            if (upperCase.indexOf("VI") >= 0) {
                return 16;
            }
            if (upperCase.indexOf("VN") >= 0) {
                return 16;
            }
            if (upperCase.indexOf("AR") >= 0) {
                return 17;
            }
        }
        catch (final Exception ex) {}
        return 0;
    }
    
    static String sub_4b10(final int n) {
        switch (n) {
            case 0: {
                return "EN";
            }
            case 1: {
                return "DE";
            }
            case 2: {
                return "FR";
            }
            case 3: {
                return "IT";
            }
            case 4: {
                return "ES";
            }
            case 5: {
                return "BR";
            }
            case 6: {
                return "PT";
            }
            case 7: {
                return "JP";
            }
            case 8: {
                return "CN";
            }
            case 9: {
                return "KR";
            }
            case 10: {
                return "RU";
            }
            case 12: {
                return "PL";
            }
            case 11: {
                return "TR";
            }
            case 13: {
                return "CZ";
            }
            case 14: {
                return "NL";
            }
            case 15: {
                return "TH";
            }
            case 16: {
                return "VI";
            }
            case 17: {
                return "AR";
            }
            default: {
                return null;
            }
        }
    }
    
    private static int sub_4c47(final InputStream inputStream) {
        int sub_4332 = 0;
        try {
            sub_4332 = sub_4332(inputStream);
            GLLib.var_1fa7[sub_4332] = sub_439d(inputStream);
            if (GLLib.var_1fa7[sub_4332] > 1024) {
                GLLib.var_1fa7[sub_4332] = 1024;
            }
            GLLib.var_1faf[sub_4332] = new int[GLLib.var_1fa7[sub_4332] + 1];
            for (int i = 1; i < GLLib.var_1fa7[sub_4332] + 1; ++i) {
                GLLib.var_1faf[sub_4332][i] = sub_439d(inputStream);
            }
            sub_43e4(inputStream, GLLib.var_1f9f[sub_4332] = new byte[GLLib.var_1faf[sub_4332][GLLib.var_1fa7[sub_4332]]], 0, GLLib.var_1f9f[sub_4332].length);
        }
        catch (final Exception ex) {}
        return sub_4332;
    }
    
    static void sub_4d20(String s, final int n) {
        sub_4f04(n);
        Pack_Open(s);
        sub_30b8(n);
        if (GLLib.var_1f97 == null) {
            GLLib.var_1f97 = new int[32];
            for (int i = 0; i < 32; ++i) {
                GLLib.var_1f97[i] = -1;
            }
            GLLib.var_1f9f = new byte[32][];
            GLLib.var_1faf = new int[32][];
            GLLib.var_1fa7 = new int[32];
            GLLib.var_1fb7 = new String[32][];
        }
        GLLib.var_1f97[n] = sub_4c47(GLLib.s_pack_is);
        Pack_Close(true);
        final int n2 = GLLib.var_1f97[n];
        if (GLLib.var_1fa7[n2] != 0) {
            final String[] array = new String[GLLib.var_1fa7[n2]];
            for (int j = 0; j < GLLib.var_1fa7[n2]; ++j) {
                array[j] = sub_4e1f(j + (n2 << 10));
            }
            GLLib.var_1fb7[n2] = array;
            GLLib.var_1faf[n2] = null;
            GLLib.var_1f9f[n2] = null;
            System.gc();
        }
    }
    
    static String sub_4e1f(int n) {
        final int n2 = n >> 10;
        n &= 0x3FF;
        if (GLLib.var_1fb7 != null && GLLib.var_1fb7[n2] != null) {
            return GLLib.var_1fb7[n2][n];
        }
        try {
            final int length;
            if ((length = GLLib.var_1faf[n2][n + 1] - GLLib.var_1faf[n2][n]) == 0) {
                return null;
            }
            return new String(GLLib.var_1f9f[n2], GLLib.var_1faf[n2][n], length, GLLib.var_1f8f);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    static void sub_4ec1() {
        for (int i = 0; i < 32; ++i) {
            sub_4f04(i);
        }
    }
    
    private static void sub_4f04(final int n) {
        if (GLLib.var_1f97 != null) {
            final int n2;
            if ((n2 = GLLib.var_1f97[n]) == -1) {
                return;
            }
            if (GLLib.var_1fb7[n2] != null) {
                for (int i = 0; i < GLLib.var_1fa7[n2]; ++i) {
                    GLLib.var_1fb7[n2][i] = null;
                }
                GLLib.var_1fb7[n2] = null;
            }
            GLLib.var_1faf[n2] = null;
            GLLib.var_1f9f[n2] = null;
            GLLib.var_1fa7[n2] = 0;
            GLLib.var_1f97[n] = -1;
        }
    }
    
    static String sub_4fa1(long n, final int n2, final String s) {
        if (n < 1000L) {
            return "" + n;
        }
        String s2 = "";
        switch (n2) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 15:
            case 17: {
                s2 = ",";
                break;
            }
            case 1:
            case 3:
            case 5:
            case 16: {
                s2 = ".";
                break;
            }
            case 12:
            case 13: {
                s2 = s;
                break;
            }
            case 2:
            case 4:
            case 6:
            case 10: {
                if (n >= 10000L) {
                    s2 = s;
                    break;
                }
                break;
            }
            case 11:
            case 14: {
                if (n >= 10000L) {
                    s2 = ".";
                    break;
                }
                break;
            }
            default: {
                return "" + n;
            }
        }
        String str = "";
        long lng = (n % 1000L < 0L) ? (-(n % 1000L)) : (n % 1000L);
        n /= 1000L;
        while (lng != 0L || n != 0L) {
            if (lng < 10L) {
                str = "00" + ((lng < 0L) ? (-lng) : lng) + str;
            }
            else if (lng < 100L) {
                str = "0" + ((lng < 0L) ? (-lng) : lng) + str;
            }
            else {
                str = ((lng < 0L) ? (-lng) : lng) + str;
            }
            lng = n % 1000L;
            if ((n /= 1000L) != 0L) {
                str = s2 + str;
            }
            else {
                if (lng == 0L) {
                    continue;
                }
                str = lng + s2 + str;
                lng = 0L;
            }
        }
        return str;
    }
    
    static String sub_5307(final String s, final String[] array) {
        String s2 = "";
        if (s.indexOf(37) < 0) {
            return s;
        }
        int n = 0;
        int i = 0;
        do {
            if ((i = s.indexOf(37, i)) < 0 || i == s.length() - 1) {
                s2 += s.substring(n);
                i = -1;
            }
            else if (s.charAt(i + 1) == 's') {
                int n2 = -1;
                if (i + 2 < s.length()) {
                    n2 = s.charAt(i + 2) - '0';
                }
                if (n2 >= 0 && n2 <= 9) {
                    s2 = s2 + s.substring(n, i) + array[n2];
                    n = (i += 3);
                }
                else {
                    ++i;
                }
            }
            else {
                ++i;
            }
        } while (i >= 0);
        return s2;
    }
    
    static String sub_547c(String string, final String s, final String str) {
        for (int i = string.indexOf(s); i != -1; i = string.indexOf(s, i + str.length())) {
            string = string.substring(0, i) + str + string.substring(i + s.length());
        }
        return string;
    }
    
    private static void Rms_Close() {
        if (GLLib.s_rs == null) {
            return;
        }
        try {
            GLLib.s_rs.closeRecordStore();
        }
        catch (final RecordStoreException ex) {}
        GLLib.s_rs = null;
    }
    
    private static void Rms_Open(final String s) throws RecordStoreFullException, RecordStoreNotFoundException, RecordStoreException {
        GLLib.s_rs = RecordStore.openRecordStore(s, true);
    }
    
    // Fan name level: 35/50
    static byte[] Rms_ReadFromBytes(String strName) {
        final String anObject = "";
        byte[] bytes = null;
        if ("".equals(anObject) == false) {
            bytes = anObject.getBytes();
        }
        return Rms_Read(strName, bytes);
    }
    
    private static byte[] Rms_Read(final String strName, byte[] data) {
        data = null;
        try {
            Rms_Open(strName);
            if (GLLib.s_rs.getNumRecords() > 0) {
                data = GLLib.s_rs.getRecord(1);
            }
        }
        catch (final RecordStoreException ex) {
            data = null;
        }
        Rms_Close();
        return data;
    }
    
    static void Rms_WriteFromBytes(String strName, byte[] data) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreFullException, RecordStoreException {
        final String string = "";
        byte[] bytes = null;
        if ("".equals(string) == false) {
            bytes = string.getBytes();
        }
        Rms_Write(strName, data, 0, data.length, bytes);
    }
    
    static void Rms_Write(final String strName, byte[] data, final int unusedInt, final int len, final byte[] unusedByteArr) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreFullException, RecordStoreException {
        Rms_Open(strName);
        if (GLLib.s_rs.getNumRecords() > 0) {
            GLLib.s_rs.setRecord(1, data, 0, len);
        }
        else {
            GLLib.s_rs.addRecord(data, 0, len);
        }
        Rms_Close();
    }
    
    static void sub_56ff(final int n) {
        if (GLLib.var_1fcf == null) {
            GLLib.var_1fcf = new int[1];
            GLLib.var_1fd7 = new int[1][];
        }
        while (true) {
            for (int i = 0; i < GLLib.var_1fcf.length; ++i) {
                if (GLLib.var_1fcf[i] == n) {
                    final int n3;
                    final int n2 = n3 = i;
                    int var_1fc7 = n3;
                    if (n2 == -1 || GLLib.var_1fd7 == null) {
                        ++GLLib.var_1fc7;
                        var_1fc7 = 0;
                        GLLib.var_1fcf[0] = n;
                        if (GLLib.var_1fd7[0] == null) {
                            GLLib.var_1fd7[0] = new int[256];
                        }
                        for (int j = 256; j > 0; GLLib.var_1fd7[0][--j] = n) {}
                    }
                    GLLib.var_1fc7 = var_1fc7;
                    return;
                }
            }
            int n3;
            final int n2 = n3 = -1;
            continue;
        }
    }
    
    static void sub_57eb(final Graphics graphics, int i, int j, int n, int n2) {
        final int sub_35c6 = sub_35c6(graphics, true);
        final int sub_3600 = sub_3600(graphics, true);
        final int sub_3601 = sub_3643(graphics, true);
        final int sub_367d = sub_367d(graphics, true);
        final int n3 = (i > sub_35c6) ? i : sub_35c6;
        final int n4 = (j > sub_3600) ? j : sub_3600;
        n = ((i + n < sub_35c6 + sub_3601) ? (i + n) : (sub_35c6 + sub_3601)) - n3;
        n2 = ((j + n2 < sub_3600 + sub_367d) ? (j + n2) : (sub_3600 + sub_367d)) - n4;
        if (n <= 0 || n2 <= 0) {
            return;
        }
        final int n5 = n3;
        final int n6 = n4;
        final int n7 = n;
        final int n8 = n2;
        final int n9 = n7;
        i = n6;
        j = n5;
        sub_36f4(graphics, n5, i, n9, n8, true);
        i = n3;
        final int n10 = ASprite.var_10cf - n4 - n2;
        final int n11 = i;
        i = n;
        n = n2;
        n2 = i;
        if (n * n2 < 256) {
            sub_3bae(graphics, GLLib.var_1fd7[GLLib.var_1fc7], 0, n, n10, n11, n, n2, true, true, 0, -1, false);
        }
        else {
            n += n10;
            n2 += n11;
            for (i = n10; i < n; i += 16) {
                for (j = n11; j < n2; j += 16) {
                    sub_3bae(graphics, GLLib.var_1fd7[GLLib.var_1fc7], 0, 16, i, j, 16, 16, true, true, 0, -1, false);
                }
            }
        }
        sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
    }
    
    public static int[] sub_5a52(final int n) {
        return GLLib.var_1fef[n];
    }
    
    public static int sub_5a72() {
        final int n;
        if ((n = (GLLib.var_1fe7 & 0xFF7E0)) != 0) {
            for (int i = 0; i < 20; ++i) {
                if ((n & 1 << i) != 0x0) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    private static final void sub_5ad0(final Graphics graphics, final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        sub_3bae(graphics, array, 0, n, n2, n3, n4, n5, b, true, 0, -1, false);
    }
    
    static final void sub_5aff() {
        GLLib.var_1fe7 = 0;
        (GLLib.var_1fef = new int[20][])[13] = new int[7];
        GLLib.var_1fef[13][1] = 100;
        GLLib.var_1fef[13][2] = -1;
        GLLib.var_1fef[13][0] = -1;
        GLLib.var_1fef[13][3] = 100;
        GLLib.var_1fef[13][4] = 100;
        GLLib.var_1fef[13][5] = 0;
        GLLib.var_1fef[13][6] = 0;
    }
    
    static final void sub_5b71() {
        GLLib.var_1fe7 |= 0x2000;
    }
    
    static final void sub_5b96() {
        GLLib.var_1fe7 &= 0xFFFFDFFF;
    }
    
    static final int sub_5bbb() {
        final int n;
        if ((n = GLLib.var_1fef[13][1]) != 100) {
            return n;
        }
        return GLLib.var_1fef[13][3];
    }
    
    static final int sub_5bfe() {
        final int n;
        if ((n = GLLib.var_1fef[13][1]) != 100) {
            return n;
        }
        return GLLib.var_1fef[13][4];
    }
    
    static final void sub_5c41(final int n) {
        GLLib.var_1fef[13][1] = n;
        GLLib.var_1fef[13][3] = n;
        GLLib.var_1fef[13][4] = n;
    }
    
    static final void sub_5c77(final boolean b) {
        GLLib.var_1fef[13][5] = (b ? 1 : 0);
    }
    
    static final void sub_5cbc(final int n, final int n2, final int n3, final int n4, final int[] array) {
        array[0] = n3 * n2 - n4 * n + 128 >> 8;
        array[1] = n4 * n2 + n3 * n + 128 >> 8;
    }
    
    static final void sub_5cfb(int n, int abs, int abs2, int a, final int[] array) {
        sub_5cbc(n, abs, 0, a, ASprite.var_1147);
        final int n2 = ASprite.var_1147[0];
        final int n3 = ASprite.var_1147[1];
        sub_5cbc(n, abs, abs2, a, ASprite.var_1147);
        a = ASprite.var_1147[0];
        final int a2 = ASprite.var_1147[1];
        sub_5cbc(n, abs, abs2, 0, ASprite.var_1147);
        n = ASprite.var_1147[0];
        abs = ASprite.var_1147[1];
        array[0] = Math.max(Math.abs(a), abs2 = Math.abs(n - n2));
        array[1] = Math.max(Math.abs(a2), abs = Math.abs(abs - n3));
    }
    
    static final int[] sub_5d84(final Graphics graphics, int[] sub_9c11, int var_200f, int var_2017, int n, int i, int n2, boolean var_1ff7, final boolean b, final boolean b2) {
        GLLib.var_1ff7 = var_1ff7;
        GLLib.var_1fff = n;
        GLLib.var_2007 = i;
        GLLib.var_200f = var_200f;
        GLLib.var_2017 = var_2017;
        if ((GLLib.var_1fe7 & 0x5600) != 0x0) {
            if ((n2 & 0x4) != 0x0) {
                GLLib.var_1fff = i;
                GLLib.var_2007 = n;
                n = GLLib.var_1fff;
                i = GLLib.var_2007;
            }
            sub_9c11 = ASprite.sub_9c11(sub_9c11, n, i, n2, null);
        }
        GLLib.var_201f = n;
        GLLib.var_2027 = i;
        int[] array = ASprite.sub_9f61(sub_9c11);
        if ((GLLib.var_1fe7 & 0x2000) == 0x0) {
            return null;
        }
        final int n3;
        final boolean b3 = (n3 = GLLib.var_1fef[13][0]) != 1 && (n3 == 2 || b);
        final int n4;
        if ((n4 = GLLib.var_1fef[13][6]) % GLLib.var_1ef7 != 0) {
            var_1ff7 = true;
            final int[] array2 = sub_9c11;
            final int[] array3 = array;
            final int n5 = var_200f;
            final int n6 = var_2017;
            final int n7 = n;
            final int n8 = i;
            final int n9 = n4;
            int n10 = n2;
            int n11 = n9;
            n = n8;
            final int n12 = n7;
            final int var_2018 = n6;
            final int var_200f2 = n5;
            int[] sub_9f61 = array3;
            int[] sub_9c12 = array2;
            if ((n2 & 0x4) != 0x0) {
                n10 = (n2 & 0xFFFFFFFB);
                n11 += 90 * GLLib.var_1ed7 / 360;
            }
            if (n10 != 0) {
                sub_9f61 = ASprite.sub_9f61(sub_9c12 = ASprite.sub_9c11(sub_9c12, n12, n, n10, null));
            }
            final int sub_2be7 = sub_2be7(GLLib.var_1edf - n11);
            final int sub_2be8 = sub_2be7(n11);
            sub_5cfb(sub_2be7, sub_2be8, n12, n, ASprite.var_1147);
            final int var_201f = ASprite.var_1147[0];
            i = ASprite.var_1147[1];
            final int n13 = var_201f >> 1;
            final int n14 = i >> 1;
            final int n15 = var_201f - n12 >> 1;
            final int n16 = i - n >> 1;
            final int n17 = n14 * sub_2be7;
            final int n18 = -n14 * sub_2be8;
            final int n19 = n13 * sub_2be7;
            final int n20 = n13 * sub_2be8;
            final int n21 = n13 - n15;
            final int n22 = n14 - n16;
            int n23 = -n20;
            int n24 = -n19;
            for (int j = 0; j < var_201f; ++j) {
                int n25 = n23 - n17;
                int n26 = n18 - n24;
                int n27 = j;
                for (int k = 0; k < i; ++k) {
                    final int n28 = n21 + (n25 + 128 >> 8);
                    final int n29 = n22 + (n26 + 128 >> 8);
                    n25 += sub_2be7;
                    n26 += sub_2be8;
                    if (n28 >= 0 && n29 >= 0 && n28 < n12 && n29 < n) {
                        sub_9f61[n27] = sub_9c12[n29 * n12 + n28];
                    }
                    else {
                        sub_9f61[n27] = 0;
                    }
                    n27 += var_201f;
                }
                n23 += sub_2be8;
                n24 += sub_2be7;
            }
            GLLib.var_200f = var_200f2;
            GLLib.var_2017 = var_2018;
            GLLib.var_201f = var_201f;
            GLLib.var_2027 = i;
            GLLib.var_1ff7 = true;
            array = ASprite.sub_9f61(sub_9c11 = sub_9f61);
            var_200f = GLLib.var_200f;
            var_2017 = GLLib.var_2017;
            n = GLLib.var_201f;
            i = GLLib.var_2027;
            n2 &= ~n2;
        }
        final int sub_5bfe = sub_5bfe();
        final int sub_5bbb = sub_5bbb();
        final int[] array4 = sub_9c11;
        final int[] array5 = array;
        final int n30 = var_200f;
        final int n31 = var_2017;
        final int n32 = n;
        final int n33 = i;
        final int n34 = sub_5bfe;
        final int n35 = sub_5bbb;
        final int n36 = GLLib.var_1fef[13][2];
        final boolean b4 = var_1ff7;
        final boolean b5 = b3;
        int n37 = n2;
        final boolean b6 = b5;
        final boolean b7 = b4;
        final int n38 = n36;
        final int n39 = n35;
        final int n40 = n34;
        n = n33;
        int var_1fff = n32;
        final int n41 = n31;
        final int n42 = n30;
        int[] sub_9f62 = array5;
        int[] sub_9c13 = array4;
        int n43 = 0;
        int n44 = n37 & 0xFFFFFFFE;
        if ((n37 & 0x4) != 0x0) {
            n44 = n37;
            n37 = 0;
        }
        if (n44 != 0) {
            if ((n44 & 0x4) != 0x0) {
                GLLib.var_1fff = n;
                GLLib.var_2007 = var_1fff;
                var_1fff = GLLib.var_1fff;
                n = GLLib.var_2007;
            }
            final int[] array6 = sub_9c13;
            final int n45 = var_1fff;
            final int n46 = n;
            var_2017 = n44;
            var_200f = n46;
            sub_9f62 = ASprite.sub_9f61(sub_9c13 = ASprite.sub_9c11(array6, n45, var_200f, var_2017, null));
        }
        final int var_201f2 = var_1fff * n40 / 100 + ((var_1fff * n40 % 100 != 0) ? 1 : 0);
        final int var_2019 = n * n39 / 100 + ((n * n39 % 100 != 0) ? 1 : 0);
        GLLib.var_201f = var_201f2;
        GLLib.var_2027 = var_2019;
        if (var_201f2 <= 0 || var_2019 <= 0) {
            return null;
        }
        final int n47 = (var_1fff << 8) / var_201f2;
        final int n48 = (n << 8) / var_2019;
        sub_35c6(graphics, false);
        sub_3600(graphics, false);
        sub_3643(graphics, false);
        sub_367d(graphics, false);
        final int n49 = var_201f2;
        final int n50 = var_201f2;
        final int n51;
        if ((n51 = sub_9f62.length / var_201f2) <= 0) {
            return null;
        }
        int n52 = n51;
        int n53 = n41;
        if (n38 < 0) {
            n = n51 * var_201f2;
            int n54;
            int n55;
            if ((n37 & 0x1) != 0x0) {
                n54 = (n49 - n50) * n47;
                n55 = n47;
            }
            else {
                n54 = (n50 - 1) * n47;
                n55 = -n47;
            }
            int n56;
            if ((n56 = var_2019 - var_2019 / n51 * n51) == 0) {
                n56 = n51;
            }
            int n57 = n56;
            int n58 = n56 * var_201f2;
            int n59 = n41 + var_2019 - n56;
            int n60 = (i = var_2019) * n48;
            while (--i >= 0) {
                int n61 = (((n60 -= n48) >> 8) * var_1fff << 8) + n54;
                n2 = n50;
                while (--n2 >= 0) {
                    sub_9f62[--n58] = sub_9c13[n61 >> 8];
                    n61 += n55;
                }
                if (--n56 == 0) {
                    if (b2) {
                        sub_5ad0(graphics, sub_9f62, var_201f2, n42, n59, var_201f2, n57, b7);
                    }
                    n57 = n51;
                    n59 -= n51;
                    n56 = n51;
                    n58 = n;
                }
            }
        }
        else {
            int n62;
            if ((n37 & 0x1) != 0x0) {
                n = (n49 - 1) * n47;
                n62 = -n47;
            }
            else {
                n = 0;
                n62 = n47;
            }
            if (!b6 && !b7) {
                final int n63 = (n38 & 0xFF) << 24;
                for (int l = 0, n64 = 0; l < var_2019; ++l, n64 += n48) {
                    final int n65 = (n64 >> 8) * var_1fff;
                    i = 0;
                    for (int n66 = n; i < var_201f2; ++i, n66 += n62) {
                        sub_9f62[n43++] = (n63 | (sub_9c13[n65 + (n66 >> 8)] & 0xFFFFFF));
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            sub_5ad0(graphics, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
                        }
                        n53 += n51;
                        n52 = n51;
                        n43 = 0;
                    }
                }
            }
            else if (!b6 && b7) {
                final int n67 = (n38 & 0xFF) << 24;
                for (int n68 = 0, n69 = 0; n68 < var_2019; ++n68, n69 += n48) {
                    final int n70 = (n69 >> 8) * var_1fff;
                    i = 0;
                    for (int n71 = n; i < var_201f2; ++i, n71 += n62) {
                        if ((n2 = (sub_9c13[n70 + (n71 >> 8)] & 0xFFFFFF)) != 16711935 && n2 != 0) {
                            sub_9f62[n43++] = (n67 | n2);
                        }
                        else {
                            sub_9f62[n43++] = 0;
                        }
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            sub_5ad0(graphics, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
                        }
                        n53 += n51;
                        n52 = n51;
                        n43 = 0;
                    }
                }
            }
            else {
                for (int n72 = 0, n73 = 0; n72 < var_2019; ++n72, n73 += n48) {
                    final int n74 = (n73 >> 8) * var_1fff;
                    i = 0;
                    for (int n75 = n; i < var_201f2; ++i, n75 += n62) {
                        final int n76 = n74 + (n75 >> 8);
                        n2 = ((sub_9c13[n76] >>> 24) * n38 >> 8 & 0xFF & 0xFF) << 24;
                        sub_9f62[n43++] = (n2 | (sub_9c13[n76] & 0xFFFFFF));
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            sub_5ad0(graphics, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
                        }
                        n53 += n51;
                        n52 = n51;
                        n43 = 0;
                    }
                }
            }
            if (b2 && n52 != n51) {
                sub_5ad0(graphics, sub_9f62, var_201f2, n42, n53, var_201f2, n51 - n52, true);
            }
        }
        if (b2) {
            return null;
        }
        return sub_9f62;
    }
    
    static void sub_6ccf(final Graphics graphics, final int n, final int n2, int n3, int n4, int n5, int n6, int i) {
        final int n7 = n5 >> 16 & 0xFF;
        final int n8 = n5 >> 8 & 0xFF;
        n5 &= 0xFF;
        final int n9 = n6 >> 16 & 0xFF;
        final int n10 = n6 >> 8 & 0xFF;
        n6 &= 0xFF;
        final int n11 = n9 - n7;
        final int n12 = n10 - n8;
        n6 -= n5;
        n3 = n + n3 - 1;
        n4 = n2 + n4 - 1;
        int n13 = n7 << 16;
        int n14 = n8 << 16;
        n5 <<= 16;
        if (i == 4) {
            i = n3 - n;
            final int n15 = (n11 << 16) / i;
            final int n16 = (n12 << 16) / i;
            n6 = (n6 << 16) / i;
            for (i = n3; i >= n; --i) {
                sub_358e(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
                sub_3731(graphics, i, n2, i, n4, true);
                n13 += n15;
                n14 += n16;
                n5 += n6;
            }
            return;
        }
        if (i == 8) {
            i = n3 - n;
            final int n17 = (n11 << 16) / i;
            final int n18 = (n12 << 16) / i;
            n6 = (n6 << 16) / i;
            for (i = n; i <= n3; ++i) {
                sub_358e(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
                sub_3731(graphics, i, n2, i, n4, true);
                n13 += n17;
                n14 += n18;
                n5 += n6;
            }
            return;
        }
        if (i == 16) {
            i = n4 - n2;
            final int n19 = (n11 << 16) / i;
            final int n20 = (n12 << 16) / i;
            n6 = (n6 << 16) / i;
            for (i = n4; i >= n2; --i) {
                sub_358e(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
                sub_3731(graphics, n, i, n3, i, true);
                n13 += n19;
                n14 += n20;
                n5 += n6;
            }
            return;
        }
        if (i == 32) {
            i = n4 - n2;
            final int n21 = (n11 << 16) / i;
            final int n22 = (n12 << 16) / i;
            n6 = (n6 << 16) / i;
            for (i = n2; i <= n4; ++i) {
                sub_358e(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
                sub_3731(graphics, n, i, n3, i, true);
                n13 += n21;
                n14 += n22;
                n5 += n6;
            }
        }
    }
    
    static void sub_7018(final int n, final int n2, final int n3, final int n4) {
        sub_7041(GLLib.var_1daf, 0, n, n2, n3, n4, 0, 16);
    }
    
    static void sub_7041(final Graphics graphics, int n, int n2, final int n3, final int n4, int n5, int n6, int n7) {
        int n8 = n3;
        int i = n4;
        if (n7 == 16 || n7 == 32) {
            n8 = n4;
            i = n3;
        }
        if (n7 == 4 || n7 == 16) {
            final int n9 = n5;
            n5 = n6;
            n6 = n9;
        }
        final int[] sub_39a6 = ASprite.sub_39a6(null);
        final int n10 = (i < sub_39a6.length / n8) ? i : (sub_39a6.length / n8);
        final int n11 = n5 >>> 24;
        final int n12 = n5 >> 16 & 0xFF;
        final int n13 = n5 >> 8 & 0xFF;
        final int n14 = n5 & 0xFF;
        final int n15 = n6 >>> 24;
        final int n16 = n6 >> 16 & 0xFF;
        final int n17 = n6 >> 8 & 0xFF;
        n6 &= 0xFF;
        --n8;
        final int n18 = (n15 - n11 << 16) / n8;
        final int n19 = (n16 - n12 << 16) / n8;
        final int n20 = (n17 - n13 << 16) / n8;
        final int n21 = (n6 - n14 << 16) / n8;
        ++n8;
        int n22 = n11 << 16;
        int n23 = n12 << 16;
        int n24 = n13 << 16;
        int n25 = n14 << 16;
        int n26;
        if (n7 == 4 || n7 == 8) {
            n26 = n3;
            n6 = -(n3 * n10) + 1;
        }
        else {
            n26 = 1;
            n6 = 0;
        }
        int n27 = 0;
        for (int j = 0; j < n8; ++j) {
            int n28 = n10;
            while (--n28 >= 0) {
                sub_39a6[n27] = n5;
                n27 += n26;
            }
            n22 += n18;
            n23 += n19;
            n24 += n20;
            n25 += n21;
            n5 = ((n22 << 8 & 0xFF000000) | (n23 & 0xFF0000) | (n24 >> 8 & 0xFF00) | (n25 >> 16 & 0xFF));
            n27 += n6;
        }
        if (n7 == 4 || n7 == 8) {
            while (i > 0) {
                final int[] array = sub_39a6;
                final int n29 = n2;
                final int n30 = (n10 < i) ? n10 : i;
                final int n31;
                n7 = (n31 = n29);
                final int n32 = n30;
                final int n33;
                n7 = (n33 = n31);
                n7 = n3;
                sub_3bae(graphics, array, 0, n7, n, n33, n3, n32, true, true, 0, -1, true);
                n2 += n10;
                i -= n10;
            }
        }
        else if (n7 == 16 || n7 == 32) {
            while (i > 0) {
                final int[] array2 = sub_39a6;
                final int n34 = n10;
                final int n35 = n;
                final int n36 = (n10 < i) ? n10 : i;
                n7 = n35;
                final int n37;
                n6 = (n37 = n34);
                final int n38 = n7;
                final int n39 = n36;
                n7 = n38;
                final int n40;
                n6 = (n40 = n37);
                n6 = n40;
                sub_3bae(graphics, array2, 0, n6, n7, n2, n39, n4, true, true, 0, -1, true);
                n += n10;
                i -= n10;
            }
        }
    }
    
    public void addCommand(final Command command) {
        super.addCommand(command);
    }
    
    public static final void sub_755d() {
        GLLib.var_202f = 0;
    }
    
    private static final void sub_757c() {
        final int var_203f = GLLib.var_203f;
        GLLib.var_203f = GLLib.var_1de7 - GLLib.var_2037;
        GLLib.var_2037 = var_203f;
    }
    
    protected void pointerReleased(int var_2037, final int var_203f) {
        var_2037 = (GLLib.var_2037 = var_2037);
        GLLib.var_203f = var_203f;
        sub_757c();
        GLLib.var_205f = true;
    }
    
    protected void pointerPressed(int var_2037, final int var_203f) {
        var_2037 = (GLLib.var_2037 = var_2037);
        GLLib.var_203f = var_203f;
        sub_757c();
        GLLib.var_2057 = true;
    }
    
    protected void pointerDragged(int var_2037, final int var_203f) {
        var_2037 = (GLLib.var_2037 = var_2037);
        GLLib.var_203f = var_203f;
        sub_757c();
        GLLib.var_2067 = true;
    }
    
    static final boolean sub_762d() {
        return GLLib.var_202f == 2;
    }
    
    static final boolean sub_7660() {
        return GLLib.var_202f == 1;
    }
    
    static final boolean sub_7693() {
        return GLLib.var_202f == 3;
    }
    
    static final boolean sub_76c6() {
        return GLLib.var_202f == 4;
    }
    
    static final boolean sub_76f9() {
        return GLLib.var_202f == 4 || GLLib.var_202f == 1 || GLLib.var_202f == 3;
    }
    
    static boolean sub_7740() {
        return Class_o.sub_2f03();
    }
    
    static void sub_775e(final String s) {
        Class_o.sub_2ce9(s);
    }
    
    static void sub_777d(final int n, final String s) {
        if (System.currentTimeMillis() - GLLib.var_206f <= 3000L) {
            return;
        }
        GLLib.var_206f = System.currentTimeMillis();
        Class_o.sub_3527(Class_o.sub_591c(n, s), s);
    }
    
    static void sub_77ca() {
        if (System.currentTimeMillis() - GLLib.var_206f <= 3000L) {
            return;
        }
        GLLib.var_206f = System.currentTimeMillis();
        Class_o.sub_3e56();
    }
    
    static int sub_780b() {
        return Class_o.sub_3e90();
    }
    
    static boolean sub_7829(final int n) {
        return Class_o.sub_40d2(n);
    }
    
    static boolean sub_7848() {
        return Class_o.sub_34dd();
    }
    
    static int sub_7866() {
        return Class_o.sub_4060();
    }
    
    static int sub_7884() {
        return Class_o.sub_4042();
    }
    
    static String sub_78a2(final int n, final String s) {
        return Class_o.sub_4e32(Class_o.sub_591c(n, s));
    }
    
    static String sub_78c7() {
        return Class_o.sub_54b2();
    }
    
    static String sub_78e5() {
        return Class_o.sub_75be();
    }
    
    static void sub_7903() {
        Class_o.sub_43d0();
    }
    
    static long sub_7921(final long n, int sub_591c, final String s) {
        sub_591c = Class_o.sub_591c(sub_591c, s);
        return Class_o.sub_5038(n, sub_591c);
    }
    
    static int sub_7947() {
        return Class_o.sub_7195();
    }
    
    static int sub_7965(final int n, final String s) {
        return Class_o.sub_74c8(Class_o.sub_591c(n, s));
    }
    
    static int sub_7988(final String s) {
        return Class_o.sub_5638(s);
    }
    
    static int sub_79a7(final int n, final String s) {
        return Class_o.sub_591c(n, s);
    }
    
    static long sub_79c7(final long n) {
        return sub_7921(n, Class_o.sub_4060(), Class_o.sub_6e15());
    }
    
    static {
        GLLib.var_1daf = null;
        GLLib.var_1db7 = null;
        GLLib.var_1ddf = 800;
        GLLib.var_1de7 = 480;
        GLLib.m_FPSLimiter = 50;
        GLLib.var_1e17 = -1;
        GLLib.var_1e47 = false;
        GLLib.var_1e4f = null;
        GLLib.var_1e97 = 25;
        var_1e9f = 256;
        var_1ea7 = 128;
        var_1ed7 = 256;
        var_1edf = 90 * GLLib.var_1ed7 / 360;
        GLLib.var_1ee7 = 180 * GLLib.var_1ed7 / 360;
        GLLib.var_1eef = 270 * GLLib.var_1ed7 / 360;
        GLLib.var_1ef7 = 360 * GLLib.var_1ed7 / 360;
        GLLib.var_1f6f = 0;
        GLLib.var_1f77 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        GLLib.var_1f8f = "UTF-8";
        var_1fdf = true;
        GLLib.var_1fe7 = 0;
        GLLib.var_1fef = null;
        GLLib.var_206f = 0L;
    }
}
