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
    public static Graphics g;
    static Graphics s_lastPaintGraphics;
    static boolean s_game_isPaused;
    static int s_game_state;
    static long s_game_timeWhenFrameStart;
    private static long s_game_lastFrameTime;
    static int s_screenWidth;
    static int s_screenHeight;
    static Display s_display;
    private static boolean s_game_isInPaint;
    static MIDlet s_application;
    private static int m_FPSLimiter;
    private long m_frameCoheranceTimer;
    static int var_1e17;
    static int s_game_frameDT;
    private static long s_game_frameDTTimer;
    static int s_game_totalExecutionTime;
    private static int s_game_currentFrameNB;
    static GLLib s_gllib_instance;
    static boolean var_1e47;
    private static String s_platformRequestUrl;
    private static int m_keys_pressed;
    private static int m_keys_state;
    private static int m_current_keys_state;
    private static int m_current_keys_pressed;
    private static int m_current_keys_released;
    private static int var_1e7f;
    private static Hashtable standardKeyTable;
    private static Hashtable gameActionKeyTable;
    private static int var_1e97;
    static final int var_1e9f;
    static final int var_1ea7;
    static Random s_math_random;
    static int var_1eb7;
    static int var_1ebf;
    private static int[] s_math_cosTable;
    private static int[] s_math_sqrtTable;
    static final int var_1ed7;
    static final int Math_Angle90;
    private static int Math_Angle180;
    private static int Math_Angle270;
    private static int Math_Angle360;
    static String s_pack_filename;
    private static InputStream s_pack_is;
    private static int var_1f0f;
    private static byte[] var_1f17;
    private static int var_1f1f;
    private static int s_pack_curOffset;
    private static short s_pack_nbData;
    private static int[] s_pack_offset;
    private static short s_pack_subPack_nbOf;
    private static short[] s_pack_subPack_fat;
    private static int s_pack_subPack_curSubPack;
    static int s_pack_lastDataReadMimeType;
    private static byte[] s_Pack_SkipBuffer;
    private static byte[][] MIME_type;
    private static int Stream_readOffset;
    private static char[] var_1f77;
    private static int[] var_1f7f;
    private static boolean var_1f87;
    static String text_encoding;
    private static int[] var_1f97;
    private static byte[][] localeGroups;
    private static int[] var_1fa7;
    private static int[][] var_1faf;
    private static String[][] s_localeStrings;
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
    static int s_screenX;
    static int s_screenY;
    private static int var_2047;
    private static int var_204f;
    private static boolean var_2057;
    private static boolean var_205f;
    private static boolean var_2067;
    private static long var_206f;
    
    abstract void Game_update();
    
    public GLLib(final Object application, final Object display) {
        GLLib.s_gllib_instance = this;
        GLLib.s_game_state = -1;
        GLLib.s_game_isInPaint = true;
        GLLib.s_application = (MIDlet)application;
        GLLib.s_display = (Display)display;
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
        GLLib.s_screenWidth = 800;
        GLLib.s_screenHeight = 480;
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
    
    public void sizeChanged(final int w, final int h) {
    }
    
    private void SetupDisplay() {
        this.setFullScreenMode(true);
        if (GLLib.s_display != null && GLLib.s_display.getCurrent() != this) {
            GLLib.s_display.setCurrent((Displayable)this);
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
            this.UnInit();
            GLLib.s_application.notifyDestroyed();
        }
    }
    
    public void paint(final Graphics _g) {
        final long elapsedTime = System.currentTimeMillis() - GLLib.s_game_lastFrameTime;
        GLLib.s_game_lastFrameTime = System.currentTimeMillis();
        if (elapsedTime > 3000 && GLLib.s_game_lastFrameTime != 0L) {
            this.Pause();
            this.Resume();
        }
        if (GLLib.s_game_isPaused || GLLib.s_game_isInPaint) {
            return;
        }
        GLLib.s_game_isInPaint = true;
        if (GLLib.s_game_state != -1) {
            GLLib.m_keys_pressed = GLLib.m_current_keys_pressed;
            GLLib.m_keys_state = GLLib.m_current_keys_released;
            GLLib.m_current_keys_pressed = 0;
            GLLib.m_current_keys_released = 0;
            if (GLLib.var_1e7f > 0) {
                if (GLLib.var_1e7f != Integer.MAX_VALUE) {
                    GLLib.var_1e7f -= GLLib.s_game_frameDT;
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
        GLLib.var_2047 = GLLib.s_screenX;
        GLLib.var_204f = GLLib.s_screenY;
        if ((GLLib.s_game_frameDT = (int)((GLLib.s_game_timeWhenFrameStart = System.currentTimeMillis()) - GLLib.s_game_frameDTTimer)) < 0) {
            GLLib.s_game_frameDT = 0;
        }
        if (GLLib.s_game_frameDT > 1000) {
            GLLib.s_game_frameDT = 1000;
        }
        GLLib.s_game_frameDTTimer = GLLib.s_game_timeWhenFrameStart;
        GLLib.s_game_totalExecutionTime += GLLib.s_game_frameDT;
        ++GLLib.s_game_currentFrameNB;
        try {
            GLLib.s_lastPaintGraphics = _g;
            GLLib.g = _g;
            this.Game_update();
        }
        catch (final Exception ex) {
            GLLib.s_game_state = -1;
        }
        GLLib.s_game_isInPaint = false;
    }
    
    static final void PlatformRequestThread(final String url) {
        GLLib.var_1e47 = true;
        GLLib.s_platformRequestUrl = url;
        new Thread(new PlatformRequester()).start();
    }
    
    static final void PlatformRequest() {
        GLLib.var_1e47 = false;
        if (GLLib.s_platformRequestUrl != null) {
            try {
                GLLib.s_application.platformRequest(GLLib.s_platformRequestUrl);
            }
            catch (final Exception ex) {}
        }
    }
    
    protected void keyPressed(final int keyCode) {
        final int keyFlag = 1 << Game_TranslateKeyCode(keyCode);
        GLLib.m_current_keys_pressed |= keyFlag;
        GLLib.m_current_keys_state |= keyFlag;
    }
    
    protected void keyReleased(final int keyCode) {
        final int keyFlag = 1 << Game_TranslateKeyCode(keyCode);
        GLLib.m_current_keys_released |= keyFlag;
        GLLib.m_current_keys_state &= ~keyFlag;
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
    
    private static byte Game_TranslateKeyCode(final int keyCode) {
        final Integer key = new Integer(keyCode);
        if (GLLib.standardKeyTable == null) {
            return 0;
        }
        final Integer codeStd;
        if ((codeStd = (Integer) GLLib.standardKeyTable.get(key)) != null) {
            return codeStd.byteValue();
        }
        final Integer codeAct;
        if ((codeAct = (Integer) GLLib.gameActionKeyTable.get(key)) != null) {
            return codeAct.byteValue();
        }
        return 0;
    }
    
    private static void ResetKey() {
        GLLib.m_keys_pressed = 0;
        GLLib.m_keys_state = 0;
        GLLib.m_current_keys_state = 0;
        GLLib.m_current_keys_pressed = 0;
        GLLib.m_current_keys_released = 0;
    }
    
    public static int WasAnyKeyPressed() {
        if (GLLib.m_keys_pressed == 0) {
            return -1;
        }
        int i = GLLib.var_1e97;
        while (--i >= 0) {
            if ((GLLib.m_keys_pressed & 1 << i) != 0x0) {
                return i;
            }
        }
        return -1;
    }
    
    public static int IsAnyKeyDown() {
        if (GLLib.m_keys_state == 0) {
            return -1;
        }
        int i = GLLib.var_1e97;
        while (--i >= 0) {
            if ((GLLib.m_keys_state & 1 << i) != 0x0) {
                return i;
            }
        }
        return -1;
    }
    
    static void Math_Init(final String packName) {
        Pack_Open(packName);
        GLLib.s_math_cosTable = (int[])Pack_ReadArray(1);
        GLLib.s_math_sqrtTable = (int[])Pack_ReadArray(0);
        Pack_Close(true);
    }
    
    static int Math_Rand(final int a, final int b) {
        if (b != a) {
            int rnd = GLLib.s_math_random.nextInt();
            if (rnd < 0) {
                rnd = -rnd;
            }
            return a + rnd % (b - a);
        }
        return b;
    }
    
    static int Math_Cos(int angle) {
        if (angle < 0) {
            angle = -angle;
        }
        angle &= GLLib.Math_Angle360 - 1;
        if (angle <= GLLib.Math_Angle90) {
            return GLLib.s_math_cosTable[angle];
        }
        if (angle < GLLib.Math_Angle180) {
            angle = GLLib.Math_Angle180 - angle;
            return -GLLib.s_math_cosTable[angle];
        }
        if (angle <= GLLib.Math_Angle270) {
            angle -= GLLib.Math_Angle180;
            return -GLLib.s_math_cosTable[angle];
        }
        angle = GLLib.Math_Angle360 - angle;
        return GLLib.s_math_cosTable[angle];
    }
    
    static int sub_2c75(final int n) {
        if (n >= 65536) {
            if (n >= 16777216) {
                if (n >= 268435456) {
                    if (n >= 1073741824) {
                        return GLLib.s_math_sqrtTable[n >> 24] << 8;
                    }
                    return GLLib.s_math_sqrtTable[n >> 22] << 7;
                }
                else {
                    if (n >= 67108864) {
                        return GLLib.s_math_sqrtTable[n >> 20] << 6;
                    }
                    return GLLib.s_math_sqrtTable[n >> 18] << 5;
                }
            }
            else if (n >= 1048576) {
                if (n >= 4194304) {
                    return GLLib.s_math_sqrtTable[n >> 16] << 4;
                }
                return GLLib.s_math_sqrtTable[n >> 14] << 3;
            }
            else {
                if (n >= 262144) {
                    return GLLib.s_math_sqrtTable[n >> 12] << 2;
                }
                return GLLib.s_math_sqrtTable[n >> 10] << 1;
            }
        }
        else if (n >= 256) {
            if (n >= 4096) {
                if (n >= 16384) {
                    return GLLib.s_math_sqrtTable[n >> 8];
                }
                return GLLib.s_math_sqrtTable[n >> 6] >> 1;
            }
            else {
                if (n >= 1024) {
                    return GLLib.s_math_sqrtTable[n >> 4] >> 2;
                }
                return GLLib.s_math_sqrtTable[n >> 2] >> 3;
            }
        }
        else {
            if (n >= 0) {
                return GLLib.s_math_sqrtTable[n] >> 4;
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
    
    private static void Pack_GetDataOffset() {
        int nbData;
        if (GLLib.s_pack_subPack_curSubPack == GLLib.s_pack_subPack_nbOf - 1) {
            nbData = GLLib.s_pack_nbData - GLLib.s_pack_subPack_fat[GLLib.s_pack_subPack_curSubPack];
        }
        else {
            nbData = GLLib.s_pack_subPack_fat[GLLib.s_pack_subPack_curSubPack + 1] - GLLib.s_pack_subPack_fat[GLLib.s_pack_subPack_curSubPack];
        }
        GLLib.s_pack_offset = new int[nbData + 1];
        for (int i = 0; i < nbData + 1; ++i) {
            GLLib.s_pack_offset[i] = ((Pack_Read() & 0xFF) | (Pack_Read() & 0xFF) << 8 | ((Pack_Read() & 0xFF) << 16 | (Pack_Read() & 0xFF) << 24));
        }
    }
    
    static final void Pack_Open(final String filename) {
        GLLib.var_1f0f = 1;
        if (GLLib.s_pack_filename == null || filename == null || filename.compareTo(GLLib.s_pack_filename) != 0) {
            Pack_Close(true);
            GLLib.s_pack_filename = filename;
            GLLib.var_1f17 = null;
            GLLib.var_1f1f = 0;
            GLLib.s_pack_is = Pack_GetInputStreamFromName(GLLib.s_pack_filename);
            GLLib.s_pack_nbData = (short)Pack_Read16();
            GLLib.s_pack_subPack_fat = new short[GLLib.s_pack_subPack_nbOf = (short)Pack_Read16()];
            for (short n = 0; n < GLLib.s_pack_subPack_nbOf; ++n) {
                GLLib.s_pack_subPack_fat[n] = (short)Pack_Read16();
            }
            GLLib.s_pack_subPack_curSubPack = 0;
            Pack_GetDataOffset();
        }
    }
    
    private static InputStream Pack_GetInputStreamFromName(String s) {
        InputStream pStream = null;
        if (GLLib.var_1f0f == 3) {
            pStream = new ByteArrayInputStream(null, 0, 0);
        }
        else if (GLLib.var_1f0f != 2 && GLLib.var_1f0f == 1) {
            pStream = "".getClass().getResourceAsStream(s);
        }
        return pStream;
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
    
    private static int Pack_PositionAtData(int idx) {
    	int subpack;
        for (subpack = GLLib.s_pack_subPack_nbOf - 1; subpack >= 0 && GLLib.s_pack_subPack_fat[subpack] > idx; --subpack) {}
        if (GLLib.s_pack_subPack_curSubPack != subpack) {
            GLLib.s_pack_subPack_curSubPack = subpack;
            Pack_Close(false);
            if (GLLib.s_pack_subPack_curSubPack == 0) {
                final String name = GLLib.s_pack_filename;
                GLLib.s_pack_filename = null;
                Pack_Open(name);
            }
            else {
                GLLib.s_pack_is = Pack_GetInputStreamFromName(GLLib.s_pack_filename + "." + GLLib.s_pack_subPack_curSubPack);
                Pack_GetDataOffset();
            }
        }
        else if (GLLib.s_pack_is == null) {
            if (GLLib.s_pack_subPack_curSubPack == 0) {
                final String name = GLLib.s_pack_filename;
                GLLib.s_pack_filename = null;
                Pack_Open(name);
            }
            else {
                GLLib.s_pack_is = Pack_GetInputStreamFromName(GLLib.s_pack_filename + "." + GLLib.s_pack_subPack_curSubPack);
            }
        }
        idx -= GLLib.s_pack_subPack_fat[GLLib.s_pack_subPack_curSubPack];
        int offset = GLLib.s_pack_offset[idx];
        idx = GLLib.s_pack_offset[idx + 1] - GLLib.s_pack_offset[idx];
        if (GLLib.s_pack_curOffset != offset) {
            if (GLLib.s_pack_curOffset > offset) {
                Pack_ClosePart1();
                if (GLLib.s_pack_subPack_curSubPack == 0) {
                    GLLib.s_pack_is = Pack_GetInputStreamFromName(GLLib.s_pack_filename);
                }
                else {
                    GLLib.s_pack_is = Pack_GetInputStreamFromName(GLLib.s_pack_filename + "." + GLLib.s_pack_subPack_curSubPack);
                }
            }
            else {
                offset -= GLLib.s_pack_curOffset;
            }
            Pack_Skip(offset);
        }
        if (idx > 0) {
            GLLib.s_pack_lastDataReadMimeType = (Pack_Read() & 0xFF);
            --idx;
        }
        return idx;
    }
    
    static final byte[] Pack_ReadData(int idx) {
        byte[] data = new byte[idx = Pack_PositionAtData(idx)];
        Pack_ReadFully(data, 0, data.length);
        return data;
    }
    
    private static void Pack_Skip(int nb) {
        if (nb == 0) {
            return;
        }
        if (GLLib.var_1f0f == 3) {
            GLLib.s_pack_curOffset += nb;
            try {
                while (nb > 0) {
                    nb -= (int)GLLib.s_pack_is.skip(nb);
                }
                return;
            }
            catch (final Exception ex) {
                return;
            }
        }
        if (GLLib.s_Pack_SkipBuffer == null) {
            GLLib.s_Pack_SkipBuffer = new byte[256];
        }
        while (nb > 256) {
            Pack_ReadFully(GLLib.s_Pack_SkipBuffer, 0, 256);
            nb -= 256;
        }
        if (nb > 0) {
            Pack_ReadFully(GLLib.s_Pack_SkipBuffer, 0, nb);
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
    
    private static int Pack_Read16() {
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
    
    static final Object Pack_ReadArray(final int idx) {
        Pack_PositionAtData(idx);
        GLLib.Stream_readOffset = 0;
        final Object array = Mem_ReadArray(GLLib.s_pack_is);
        GLLib.s_pack_curOffset += GLLib.Stream_readOffset;
        return array;
    }
    
    static void Pack_LoadMIME(final String filename) {
        if (GLLib.MIME_type == null) {
            GLLib.s_pack_is = Pack_GetInputStreamFromName(filename);
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
    
    static String GetMIME(final int idx) {
        if (idx >= GLLib.MIME_type.length) {
            return "";
        }
        try {
            return new String(GLLib.MIME_type[idx], "UTF-8");
        }
        catch (final Exception ex) {
            return "";
        }
    }
    
    private static void setColor(final Graphics _g, int red, final int green, final int blue) {
        red = ((red & 0xFF) << 16 | (green & 0xFF) << 8 | blue);
        _g.setColor(red);
    }
    
    static final int GetClip(final Graphics _g, final boolean y) {
        if (y) {
            return _g.getClipY();
        }
        return _g.getClipX();
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
    
    static final void SetClip(final Graphics _g, int x, int y, int width, int height, final boolean b) {
        x = ASprite.var_10cf - y - height;
        y = x;
        width = height;
        height = width;
        _g.setClip(x, y, width, height);
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
    
    static final void FillRect(final Graphics _g, int x, int y, int width, int height, final boolean processAlpha) {
        x = ASprite.var_10cf - y - height;
        y = x;
        width = height;
        height = width;
        _g.fillRect(x, y, width, height);
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
            GLLib.g.drawString(s, n, n2, n3);
        }
        catch (final Exception ex) {}
    }
    
    static final void sub_38df(final Graphics graphics, GLLibImage class_l, final int n, final int n2, int n3, final boolean b) {
        try {
            if (b) {
                final GLLibImage class_l2 = class_l;
                final int width = class_l.image.getWidth();
                final int height = class_l.image.getHeight();
                n3 = width;
                class_l = class_l2;
                sub_3966(graphics, class_l2, 0, 0, n3, height, 0, n, n2, 20, true);
                return;
            }
            graphics.drawImage(class_l.image, n, n2, 20);
        }
        catch (final Exception ex) {}
    }
    
    static final void sub_3966(final Graphics graphics, final GLLibImage class_l, final int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, final boolean b) {
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
        if (n3 >= class_l.image.getWidth()) {
            n3 += class_l.image.getWidth() - n3;
        }
        if (n4 >= class_l.image.getHeight()) {
            n4 += class_l.image.getHeight() - n4;
        }
        if (n4 <= 0 || n3 <= 0) {
            return;
        }
        try {
            graphics.drawRegion(class_l.image, 0, 0, n3, n4, n5, n6, n7, n8);
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
    
    static final void sub_3d3b(final GLLibImage class_l, final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        class_l.getRGB(array, 0, n2, 0, 0, n5, n6);
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
    
    static short Mem_GetShort(final byte[] src, int src_off) {
        return (short)((src[src_off++] & 0xFF) | (src[src_off] & 0xFF) << 8);
    }
    
    static int Mem_GetInt(final byte[] src, int src_off) {
        return (src[src_off++] & 0xFF) | (src[src_off++] & 0xFF) << 8 | (src[src_off++] & 0xFF) << 16 | (src[src_off] & 0xFF) << 24;
    }
    
    static long Mem_GetLong(final byte[] src, int src_off) {
        return (long)(src[src_off++] & 0xFF) | (long)(src[src_off++] & 0xFF) << 8 | (long)(src[src_off++] & 0xFF) << 16 | (long)(src[src_off++] & 0xFF) << 24 | (long)(src[src_off++] & 0xFF) << 32 | (long)(src[src_off++] & 0xFF) << 40 | (long)(src[src_off++] & 0xFF) << 48 | (long)(src[src_off] & 0xFF) << 56;
    }
    
    private static Object Mem_ReadArray(final InputStream inputStream) {
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
                        array4[n6] = Mem_ReadArray(inputStream);
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
            ++GLLib.Stream_readOffset;
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
        GLLib.Stream_readOffset += n;
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
        if ("".equals(anObject) == false && anObject != null) {
            bytes = anObject.getBytes();
        }
        if (array.length == 0) {
            return array;
        }
        final int[] sub_447e = sub_447e(array, true, null);
        int[] sub_447e2 = sub_447e(bytes, false, null);
        final int n = sub_447e.length - 1;
        if (n >= 1) {
            if (sub_447e2.length < 4) {
                final int[] array5 = new int[4];
                System.arraycopy(sub_447e2, 0, array5, 0, sub_447e2.length);
                sub_447e2 = array5;
            }
            int n2 = sub_447e[n];
            final int n3 = -1640531527;
            int n4 = 0;
            int n5 = 6 + 52 / (n + 1);
            while (n5-- > 0) {
                final int n6 = (n4 += n3) >>> 2 & 0x3;
                int i;
                for (i = 0; i < n; ++i) {
                    final int n7 = sub_447e[i + 1];
                    final int n9 = sub_447e[i] + ((n2 >>> 5 ^ n7 << 2) + (n7 >>> 3 ^ n2 << 4) ^ (n4 ^ n7) + (sub_447e2[(i & 0x3) ^ n6] ^ n2));
                    sub_447e[i] = n9;
                    n2 = n9;
                }
                final int n10 = sub_447e[0];
                final int n12 = sub_447e[n] + ((n2 >>> 5 ^ n10 << 2) + (n10 >>> 3 ^ n2 << 4) ^ (n4 ^ n10) + (sub_447e2[(i & 0x3) ^ n6] ^ n2));
                sub_447e[n] = n12;
                n2 = n12;
            }
        }
        final int[] array9;
        final int n13;
        final byte[] array8 = new byte[n13 = (array9 = sub_447e).length << 2];
        for (int j = 0; j < n13; ++j) {
            array8[j] = (byte)(array9[j >>> 2] >>> ((j & 0x3) << 3));
        }
        return array8;
    }
    
    static int Text_GetPhoneDefaultLangage() {
        try {
            String lang = System.getProperty("microedition.locale");
            if (lang == null) {
                return 0;
            }
            lang = lang.toUpperCase();
            if (lang.indexOf("EN") >= 0) {
                return 0;
            }
            if (lang.indexOf("DE") >= 0) {
                return 1;
            }
            if (lang.indexOf("FR") >= 0) {
                return 2;
            }
            if (lang.indexOf("IT") >= 0) {
                return 3;
            }
            if (lang.indexOf("ES") >= 0) {
                return 4;
            }
            if (lang.indexOf("BR") >= 0) {
                return 5;
            }
            if (lang.indexOf("PT") >= 0) {
                return 6;
            }
            if (lang.indexOf("JA") >= 0) {
                return 7;
            }
            if (lang.indexOf("JP") >= 0) {
                return 7;
            }
            if (lang.indexOf("ZH") >= 0) {
                return 8;
            }
            if (lang.indexOf("CN") >= 0) {
                return 8;
            }
            if (lang.indexOf("KO") >= 0) {
                return 9;
            }
            if (lang.indexOf("KP") >= 0) {
                return 9;
            }
            if (lang.indexOf("KR") >= 0) {
                return 9;
            }
            if (lang.indexOf("RU") >= 0) {
                return 10;
            }
            if (lang.indexOf("PL") >= 0) {
                return 12;
            }
            if (lang.indexOf("TR") >= 0) {
                return 11;
            }
            if (lang.indexOf("CZ") >= 0) {
                return 13;
            }
            if (lang.indexOf("NL") >= 0) {
                return 14;
            }
            if (lang.indexOf("TH") >= 0) {
                return 15;
            }
            if (lang.indexOf("VI") >= 0) {
                return 16;
            }
            if (lang.indexOf("VN") >= 0) {
                return 16;
            }
            if (lang.indexOf("AR") >= 0) {
                return 17;
            }
        }
        catch (final Exception ex) {}
        return 0;
    }
    
    static String Text_GetLanguageAsString(final int languageCode) {
        switch (languageCode) {
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
            sub_43e4(inputStream, GLLib.localeGroups[sub_4332] = new byte[GLLib.var_1faf[sub_4332][GLLib.var_1fa7[sub_4332]]], 0, GLLib.localeGroups[sub_4332].length);
        }
        catch (final Exception ex) {}
        return sub_4332;
    }
    
    static void sub_4d20(String s, final int n) {
        sub_4f04(n);
        Pack_Open(s);
        Pack_PositionAtData(n);
        if (GLLib.var_1f97 == null) {
            GLLib.var_1f97 = new int[32];
            for (int i = 0; i < 32; ++i) {
                GLLib.var_1f97[i] = -1;
            }
            GLLib.localeGroups = new byte[32][];
            GLLib.var_1faf = new int[32][];
            GLLib.var_1fa7 = new int[32];
            GLLib.s_localeStrings = new String[32][];
        }
        GLLib.var_1f97[n] = sub_4c47(GLLib.s_pack_is);
        Pack_Close(true);
        final int n2 = GLLib.var_1f97[n];
        if (GLLib.var_1fa7[n2] != 0) {
            final String[] array = new String[GLLib.var_1fa7[n2]];
            for (int j = 0; j < GLLib.var_1fa7[n2]; ++j) {
                array[j] = Text_GetStringFromLocaleFile(j + (n2 << 10));
            }
            GLLib.s_localeStrings[n2] = array;
            GLLib.var_1faf[n2] = null;
            GLLib.localeGroups[n2] = null;
            System.gc();
        }
    }
    
	static String Text_GetStringFromLocaleFile(int id) {
        final int groupId = id >> 10;
        id &= 0x3FF;
        if (GLLib.s_localeStrings != null && GLLib.s_localeStrings[groupId] != null) {
            return GLLib.s_localeStrings[groupId][id];
        }
        try {
            final int length = GLLib.var_1faf[groupId][id + 1];
            if (length - GLLib.var_1faf[groupId][id] == 0) {
                return null;
            }
            return new String(GLLib.localeGroups[groupId], GLLib.var_1faf[groupId][id], length, GLLib.text_encoding);
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
            if (GLLib.s_localeStrings[n2] != null) {
                for (int i = 0; i < GLLib.var_1fa7[n2]; ++i) {
                    GLLib.s_localeStrings[n2][i] = null;
                }
                GLLib.s_localeStrings[n2] = null;
            }
            GLLib.var_1faf[n2] = null;
            GLLib.localeGroups[n2] = null;
            GLLib.var_1fa7[n2] = 0;
            GLLib.var_1f97[n] = -1;
        }
    }
    
    static String BigNumberSeparate(long number, final int n2, final String s) {
        if (number < 1000L) {
            return "" + number;
        }
        String separator = "";
        switch (n2) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 15:
            case 17: {
                separator = ",";
                break;
            }
            case 1:
            case 3:
            case 5:
            case 16: {
                separator = ".";
                break;
            }
            case 12:
            case 13: {
                separator = s;
                break;
            }
            case 2:
            case 4:
            case 6:
            case 10: {
                if (number >= 10000L) {
                    separator = s;
                    break;
                }
                break;
            }
            case 11:
            case 14: {
                if (number >= 10000L) {
                    separator = ".";
                    break;
                }
                break;
            }
            default: {
                return "" + number;
            }
        }
        String newCurrency = "";
        long lng = (number % 1000L < 0L) ? (-(number % 1000L)) : (number % 1000L);
        number /= 1000L;
        while (lng != 0L || number != 0L) {
            if (lng < 10L) {
                newCurrency = "00" + ((lng < 0L) ? (-lng) : lng) + newCurrency;
            }
            else if (lng < 100L) {
                newCurrency = "0" + ((lng < 0L) ? (-lng) : lng) + newCurrency;
            }
            else {
                newCurrency = ((lng < 0L) ? (-lng) : lng) + newCurrency;
            }
            lng = number % 1000L;
            if ((number /= 1000L) != 0L) {
                newCurrency = separator + newCurrency;
            }
            else {
                if (lng == 0L) {
                    continue;
                }
                newCurrency = lng + separator + newCurrency;
                lng = 0L;
            }
        }
        return newCurrency;
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
    
    static String Text_ReplaceText(String string, final String replacee, final String replacer) {
        for (int i = string.indexOf(replacee); i != -1; i = string.indexOf(replacee, i + replacer.length())) {
            string = string.substring(0, i) + replacer + string.substring(i + replacee.length());
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
        final int sub_35c6 = GetClip(graphics, true);
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
        SetClip(graphics, n5, i, n9, n8, true);
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
        SetClip(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
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
        sub_5cbc(n, abs, 0, a, ASprite.s_rc);
        final int n2 = ASprite.s_rc[0];
        final int n3 = ASprite.s_rc[1];
        sub_5cbc(n, abs, abs2, a, ASprite.s_rc);
        a = ASprite.s_rc[0];
        final int a2 = ASprite.s_rc[1];
        sub_5cbc(n, abs, abs2, 0, ASprite.s_rc);
        n = ASprite.s_rc[0];
        abs = ASprite.s_rc[1];
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
        if ((n4 = GLLib.var_1fef[13][6]) % GLLib.Math_Angle360 != 0) {
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
            final int sub_2be7 = Math_Cos(GLLib.Math_Angle90 - n11);
            final int sub_2be8 = Math_Cos(n11);
            sub_5cfb(sub_2be7, sub_2be8, n12, n, ASprite.s_rc);
            final int var_201f = ASprite.s_rc[0];
            i = ASprite.s_rc[1];
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
        GetClip(graphics, false);
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
                setColor(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
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
                setColor(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
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
                setColor(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
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
                setColor(graphics, n13 >> 16, n14 >> 16, n5 >> 16);
                sub_3731(graphics, n, i, n3, i, true);
                n13 += n21;
                n14 += n22;
                n5 += n6;
            }
        }
    }
    
    static void sub_7018(final int n, final int n2, final int n3, final int n4) {
        sub_7041(GLLib.g, 0, n, n2, n3, n4, 0, 16);
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
    
    private static final void SetCoordinateValues() {
        GLLib.s_screenY = GLLib.s_screenHeight - GLLib.s_screenX;
        GLLib.s_screenX = s_screenY;
    }
    
    protected void pointerReleased(int x, final int y) {
    	GLLib.s_screenX = x;
        //x = (GLLib.s_screenX = x);
        GLLib.s_screenY = y;
        SetCoordinateValues();
        GLLib.var_205f = true;
    }
    
    protected void pointerPressed(int x, final int y) {
    	GLLib.s_screenX = x;
        //x = (GLLib.s_screenX = x);
        GLLib.s_screenY = y;
        SetCoordinateValues();
        GLLib.var_2057 = true;
    }
    
    protected void pointerDragged(int x, final int y) {
    	GLLib.s_screenX = x;
        //x = (GLLib.s_screenX = x);
        GLLib.s_screenY = y;
        SetCoordinateValues();
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
    
    static boolean IAP_ParseJADFields() {
        return Class_o.parseJadFields();
    }
    
    static void IAP_Init(final String language) {
        Class_o.Init(language);
    }
    
    static void IAP_SendRequest(final int itemIndex, final String itemType) {
        if (System.currentTimeMillis() - GLLib.var_206f <= 3000L) {
            return;
        }
        GLLib.var_206f = System.currentTimeMillis();
        Class_o.sendRequest(Class_o.getPricePoint(itemIndex, itemType), itemType);
    }
    
    static void IAP_SendRedeemRequest() {
        if (System.currentTimeMillis() - GLLib.var_206f <= 3000L) {
            return;
        }
        GLLib.var_206f = System.currentTimeMillis();
        Class_o.sendRedeemRequest();
    }
    
    static int sub_780b() {
        return Class_o.sub_3e90();
    }
    
    static boolean IAP_VerifyRequest(final int inputCode) {
        return Class_o.verifyRequest(inputCode);
    }
    
    static boolean sub_7848() {
        return Class_o.sub_34dd();
    }
    
    static int IAP_GetPackageIDInt() {
        return Class_o.getPackageIdInt();
    }
    
    static int sub_7884() {
        return Class_o.sub_4042();
    }
    
    static String sub_78a2(final int n, final String s) {
        return Class_o.sub_4e32(Class_o.getPricePoint(n, s));
    }
    
    static String IAP_GetTermsAndConditions() {
        return Class_o.GetTermsAndConditions();
    }
    
    static String IAP_GetFullSupportUrl() {
        return Class_o.getFullSupportUrl();
    }
    
    static void sub_7903() {
        Class_o.sub_43d0();
    }
    
    static long IAP_GetVirtualCurrency(final long basecurrency, int itemIndex, final String itemType) {
        itemIndex = Class_o.getPricePoint(itemIndex, itemType);
        return Class_o.getVirtualCurrency(basecurrency, itemIndex);
    }
    
    static int IAP_GetSpecialFlow() {
        return Class_o.GetSpecialFlow();
    }
    
    static int IAP_FindPrice(final int itemIndex, final String itemType) {
        return Class_o.findPrice(Class_o.getPricePoint(itemIndex, itemType));
    }
    
    static int IAP_GetCurrencyAmount(final String currency) {
        return Class_o.getCurrencyAmount(currency);
    }
    
    static int IAP_GetPricePoint(final int itemIndex, final String itemType) {
        return Class_o.getPricePoint(itemIndex, itemType);
    }
    
    static long IAP_GetVirtualCurrencyFromBase(final long basecurrency) {
        return IAP_GetVirtualCurrency(basecurrency, Class_o.getPackageIdInt(), Class_o.getItemTypeRms());
    }
    
    static {
        GLLib.g = null;
        GLLib.s_lastPaintGraphics = null;
        GLLib.s_screenWidth = 800;
        GLLib.s_screenHeight = 480;
        GLLib.m_FPSLimiter = 50;
        GLLib.var_1e17 = -1;
        GLLib.var_1e47 = false;
        GLLib.s_platformRequestUrl = null;
        GLLib.var_1e97 = 25;
        var_1e9f = 256;
        var_1ea7 = 128;
        var_1ed7 = 256;
        Math_Angle90 = 90 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle180 = 180 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle270 = 270 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle360 = 360 * GLLib.var_1ed7 / 360;
        GLLib.Stream_readOffset = 0;
        GLLib.var_1f77 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        GLLib.text_encoding = "UTF-8";
        var_1fdf = true;
        GLLib.var_1fe7 = 0;
        GLLib.var_1fef = null;
        GLLib.var_206f = 0L;
    }
}
