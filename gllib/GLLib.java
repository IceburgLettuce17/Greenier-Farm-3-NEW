
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
	//private static int s_game_currentFrameNB;
    static GLLib s_gllib_instance;
    static boolean var_1e47;
    private static String s_platformRequestUrl;
    private static int m_keys_pressed;
    private static int m_keys_released;
    //private static int m_current_keys_state;
    private static int m_current_keys_pressed;
    private static int m_current_keys_released;
    private static int var_1e7f;
    private static Hashtable standardKeyTable;
    private static Hashtable gameActionKeyTable;
    private static int var_1e97;
    static final int var_1e9f;
    static final int ALWAYS_128;
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
    //private static byte[] var_1f17;
    //private static int var_1f1f;
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
    private static int[] crcTable;
    private static boolean s_crcTableWasInited;
    static String text_encoding;
    private static int[] idk;
    private static byte[][] s_text_localeGroups;
    private static int[] text_multiple_nbStrings;
    private static int[][] var_1faf;
    private static String[][] s_text_stringCacheArray;
    private static RecordStore s_rs;
    private static int var_1fc7;
    private static int[] var_1fcf;
    private static int[][] var_1fd7;
    static final boolean var_1fdf;
    static int s_PFX_param;
    static int[][] s_PFX_params;
    static boolean s_PFX_hasAlpha;
    private static int s_PFX_sizeX;
    private static int s_PFX_sizeY;
    static int s_PFX_newPosX;
    static int s_PFX_newPosY;
    static int s_PFX_newSizeX;
    static int s_PFX_newSizeY;
    static int s_pointerState;
    static int s_screenX;
    static int s_screenY;
    //private static int var_2047;
    //private static int var_204f;
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
        GLLib.s_pointerState = 0;
        if (!GLLib.s_crcTableWasInited) {
            GLLib.crcTable = new int[256];
            for (int i = 0; i < 256; ++i) {
                int crc = i;
                for (int j = 8; j > 0; --j) {
                    if ((crc & 0x1) == 0x1) {
                        crc = (crc >>> 1 ^ 0xEDB88320);
                    }
                    else {
                        crc >>>= 1;
                    }
                }
                GLLib.crcTable[i] = crc;
            }
            GLLib.s_crcTableWasInited = true;
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
            GLLibPlayer.Snd_PauseNotify();
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
            GLLib.m_keys_released = GLLib.m_current_keys_released;
            GLLib.m_current_keys_pressed = 0;
            GLLib.m_current_keys_released = 0;
            if (GLLib.var_1e7f > 0) {
                if (GLLib.var_1e7f != Integer.MAX_VALUE) {
                    GLLib.var_1e7f -= GLLib.s_game_frameDT;
                }
                ResetKey();
            }
        }
        switch (GLLib.s_pointerState) {
            case 1: {
                GLLib.s_pointerState = 4;
                break;
            }
            case 2: {
                GLLib.s_pointerState = 0;
                break;
            }
        }
        if (GLLib.var_2057) {
            GLLib.s_pointerState = 1;
            GLLib.var_2057 = false;
        }
        else if (GLLib.var_205f) {
            GLLib.s_pointerState = 2;
            GLLib.var_205f = false;
            GLLib.var_2067 = false;
        }
        else if (GLLib.var_2067) {
            GLLib.s_pointerState = 3;
            GLLib.var_2067 = false;
        }
        //GLLib.var_2047 = GLLib.s_screenX;
        //GLLib.var_204f = GLLib.s_screenY;
        if ((GLLib.s_game_frameDT = (int)((GLLib.s_game_timeWhenFrameStart = System.currentTimeMillis()) - GLLib.s_game_frameDTTimer)) < 0) {
            GLLib.s_game_frameDT = 0;
        }
        if (GLLib.s_game_frameDT > 1000) {
            GLLib.s_game_frameDT = 1000;
        }
        GLLib.s_game_frameDTTimer = GLLib.s_game_timeWhenFrameStart;
        GLLib.s_game_totalExecutionTime += GLLib.s_game_frameDT;
        //++GLLib.s_game_currentFrameNB;
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
        new Thread(new PlatformRequestWorker()).start();
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
        //GLLib.m_current_keys_state |= keyFlag;
    }
    
    protected void keyReleased(final int keyCode) {
        final int keyFlag = 1 << Game_TranslateKeyCode(keyCode);
        GLLib.m_current_keys_released |= keyFlag;
        //GLLib.m_current_keys_state &= ~keyFlag;
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
        GLLib.m_keys_released = 0;
        //GLLib.m_current_keys_state = 0;
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
        if (GLLib.m_keys_released == 0) {
            return -1;
        }
        int i = GLLib.var_1e97;
        while (--i >= 0) {
            if ((GLLib.m_keys_released & 1 << i) != 0x0) {
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
    
    static int Math_Sqrt(final int x) {
        if (x >= 65536) {
            if (x >= 16777216) {
                if (x >= 268435456) {
                    if (x >= 1073741824) {
                        return GLLib.s_math_sqrtTable[x >> 24] << 8;
                    }
                    return GLLib.s_math_sqrtTable[x >> 22] << 7;
                }
                else {
                    if (x >= 67108864) {
                        return GLLib.s_math_sqrtTable[x >> 20] << 6;
                    }
                    return GLLib.s_math_sqrtTable[x >> 18] << 5;
                }
            }
            else if (x >= 1048576) {
                if (x >= 4194304) {
                    return GLLib.s_math_sqrtTable[x >> 16] << 4;
                }
                return GLLib.s_math_sqrtTable[x >> 14] << 3;
            }
            else {
                if (x >= 262144) {
                    return GLLib.s_math_sqrtTable[x >> 12] << 2;
                }
                return GLLib.s_math_sqrtTable[x >> 10] << 1;
            }
        }
        else if (x >= 256) {
            if (x >= 4096) {
                if (x >= 16384) {
                    return GLLib.s_math_sqrtTable[x >> 8];
                }
                return GLLib.s_math_sqrtTable[x >> 6] >> 1;
            }
            else {
                if (x >= 1024) {
                    return GLLib.s_math_sqrtTable[x >> 4] >> 2;
                }
                return GLLib.s_math_sqrtTable[x >> 2] >> 3;
            }
        }
        else {
            if (x >= 0) {
                return GLLib.s_math_sqrtTable[x] >> 4;
            }
            return 0;
        }
    }
    
    static void sub_2dcf(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int n7) {
        final int n11 = GLLib.var_1e9f - n7 * GLLib.var_1e9f - n7;
        n7 *= GLLib.var_1e9f;
        GLLib.var_1eb7 = (n * n11 + (n3 << 1) * n7 + n5 * n7 * n7) / (1 << 16);
        GLLib.var_1ebf = (n2 * n11 + (n4 << 1) * n7 + n6 * n7 * n7) / (1 << 16);
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
            //GLLib.var_1f17 = null;
            //GLLib.var_1f1f = 0;
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
            //GLLib.var_1f17 = null;
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
    
    static final int GetClipX(final Graphics _g, final boolean y) {
        if (y) {
            return _g.getClipY();
        }
        return _g.getClipX();
    }
    
    static final int GetClipY(final Graphics _g, final boolean x) {
        if (x) {
            return ASprite.s_screenWidth - _g.getClipX() - _g.getClipWidth();
        }
        return _g.getClipY();
    }
    
    static final int GetClipWidth(final Graphics _g, final boolean h) {
        if (h) {
            return _g.getClipHeight();
        }
        return _g.getClipWidth();
    }
    
    static final int GetClipHeight(final Graphics graphics, final boolean w) {
        if (w) {
            return graphics.getClipWidth();
        }
        return graphics.getClipHeight();
    }
    
    static final void ClipRect(final Graphics g, int x, int y, int width, int height, final boolean processAlpha) {
        final int n5 = x;
        x = ASprite.s_screenWidth - y - height;
        y = n5;
        final int n6 = width;
        width = height;
        height = n6;
        g.clipRect(x, y, width, height);
    }
    
    static final void SetClip(final Graphics _g, int x, int y, int width, int height, final boolean processAlpha) {
        x = ASprite.s_screenWidth - y - height;
        y = x;
        width = height;
        height = width;
        _g.setClip(x, y, width, height);
    }
    
    static final void DrawLine(final Graphics _g, int x1, int y1, int x2, int y2, final boolean processAlpha) {
        x1 = ASprite.s_screenWidth - y1 - 1;
        y1 = x1;
        x2 = ASprite.s_screenWidth - y2 - 1;
        y2 = x2;
        _g.drawLine(x1, y1, x2, y2);
    }
    
    static final void FillRect(final Graphics _g, int x, int y, int width, int height, final boolean processAlpha) {
        x = ASprite.s_screenWidth - y - height;
        y = x;
        width = height;
        height = width;
        _g.fillRect(x, y, width, height);
    }
    
    static final void DrawRect(final Graphics _g, int x, int y, int width, int height, final boolean processAlpha) {
        x = ASprite.s_screenWidth - y - height - 1;
        y = x;
        width = height;
        height = width;
        _g.drawRect(x, y, width, height);
    }
    
    static final void FillArc(final Graphics _g, int x, int y, int width, int height, int startAngle, final int arcAngle, final boolean processAlpha) {
        x = ASprite.s_screenWidth - y - height;
        y = x;
        width = height;
        height = width;
        startAngle -= 90;
        _g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
    
    static final void DrawArc(final Graphics _g, int x, int y, int width, int height, int startAngle, final int arcAngle, final boolean processAlpha) {
        x = ASprite.s_screenWidth - y - height;
        y = x;
        width = height;
        height = width;
        startAngle -= 90;
        _g.drawArc(x, y, width, height, startAngle, arcAngle);
    }
    
    static final void DrawString(final String str, final int x, final int y, int anchor) {
        try {
            int _anchor = anchor;
            if ((anchor & 0x2) != 0x0) {
                _anchor = ((anchor & 0xFFFFFFFD) | 0x40);
            }
            anchor = _anchor;
            GLLib.g.drawString(str, x, y, anchor);
        }
        catch (final Exception ex) {}
    }
    
    static final void DrawImage(final Graphics _g, GLLibImage img, final int x, final int y, int width, final boolean processAlpha) {
        try {
            if (processAlpha) {
                width = img.image.getWidth();
                DrawRegion(_g, img, 0, 0, width, img.image.getHeight(), 0, x, y, 20, true);
                return;
            }
            _g.drawImage(img.image, x, y, 20);
        }
        catch (final Exception ex) {}
    }
    
    static final void DrawRegion(final Graphics _g, final GLLibImage src, final int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor, final boolean processAlpha) {
        if (processAlpha) {
            if (transform == 0) {
                transform = 5;
            }
            else if (transform == 5) {
                transform = 3;
            }
            else if (transform == 3) {
                transform = 6;
            }
            else if (transform == 6) {
                transform = 0;
            }
            else if (transform == 2) {
                transform = 7;
            }
            y_src = x_dest;
            x_dest = ASprite.s_screenWidth - y_dest;
            y_dest = y_src;
            anchor = 24;
        }
        if (width >= src.image.getWidth()) {
            width += src.image.getWidth() - width;
        }
        if (height >= src.image.getHeight()) {
            height += src.image.getHeight() - height;
        }
        if (height <= 0 || width <= 0) {
            return;
        }
        try {
            _g.drawRegion(src.image, 0, 0, width, height, transform, x_dest, y_dest, anchor);
        }
        catch (final Exception ex) {}
    }
    
    static final void FillTriangle(final Graphics _g, int x1, int y1, int x2, int y2, int x3, int y3, final boolean b) {
        x1 = ASprite.s_screenWidth - y1 - 1;
        y1 = x1;
        x2 = ASprite.s_screenWidth - y2 - 1;
        y2 = x2;
        x3 = ASprite.s_screenWidth - y3 - 1;
        y3 = x3;
        _g.fillTriangle(x1, y1, x2, y2, x3, y3);
        DrawLine(_g, x1, y1, x2, y2, true);
        x2 = y3;
        y1 = x3;
        DrawLine(_g, x1, y1, y1, y3, true);
        DrawLine(_g, y1, x2, x2, y2, true);
    }
    
    static final void DrawRGB(final Graphics g, int[] rgbData, final int offset, int scanlength, int x, int y, int width, int height, final boolean processAlpha, final boolean b2, int n7, int n8, final boolean b3) {
        if (b3) {
            int n9 = height;
            if ((n7 & 0x4) != 0x0) {
                n9 = width;
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
            n8 = x;
            x = ASprite.s_screenWidth - y - n9;
            y = n8;
        }
        if (n7 != 0) {
            int n10 = 0;
            if ((n7 & 0x4) != 0x0) {
                n10 = width;
                width = height;
                height = scanlength;
                scanlength = width;
            }
            n8 = width;
            rgbData = ASprite.TransformRGB(rgbData, width, height, n7, null);
            if ((n7 & 0x4) != 0x0) {
                height = n10;
            }
        }
        g.drawRGB(rgbData, 0, scanlength, x, y, width, height, processAlpha);
    }
    
    static final void GetRGB(final GLLibImage image, final int[] rgbData, final int offset, final int scanlength, final int x, final int y, final int width, final int height) {
        image.getRGB(rgbData, 0, scanlength, 0, 0, width, height);
    }
    
    static int Mem_SetByte(final byte[] dst, int dst_off, final byte src) {
        dst[dst_off++] = src;
        return dst_off;
    }
    
    static int Mem_SetShort(final byte[] dst, int dst_off, final short src) {
        dst[dst_off++] = (byte)src;
        dst[dst_off++] = (byte)(src >>> 8);
        return dst_off;
    }
    
    static int Mem_SetInt(final byte[] dst, int dst_off, final int src) {
        dst[dst_off++] = (byte)src;
        dst[dst_off++] = (byte)(src >>> 8);
        dst[dst_off++] = (byte)(src >>> 16);
        dst[dst_off++] = (byte)(src >> 24);
        return dst_off;
    }
    
    static int Mem_SetLong(final byte[] dst, int dst_off, final long src) {
        dst[dst_off++] = (byte)(src & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 8 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 16 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 24 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 32 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 40 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 48 & 0xFFL);
        dst[dst_off++] = (byte)(src >>> 56 & 0xFFL);
        return dst_off;
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
            final int n = (sub_4332 = Stream_Read(inputStream)) >> 4;
            final int n2 = sub_4332 & 0x7;
            int n3;
            if ((sub_4332 & 0x8) != 0x0) {
                n3 = Stream_Read16(inputStream);
            }
            else {
                n3 = Stream_Read(inputStream);
            }
            switch (n2) {
                case 0: {
                    final byte[] array = new byte[n3];
                    for (int i = 0; i < n3; ++i) {
                        array[i] = (byte)Stream_Read(inputStream);
                    }
                    o = array;
                    break;
                }
                case 1: {
                    final short[] array2 = new short[n3];
                    if (n == 0) {
                        for (int j = 0; j < n3; ++j) {
                            array2[j] = (byte)Stream_Read(inputStream);
                        }
                    }
                    else {
                        for (int k = 0; k < n3; ++k) {
                            array2[k] = (short)Stream_Read16(inputStream);
                        }
                    }
                    o = array2;
                    break;
                }
                case 2: {
                    final int[] array3 = new int[n3];
                    if (n == 0) {
                        for (int l = 0; l < n3; ++l) {
                            array3[l] = (byte)Stream_Read(inputStream);
                        }
                    }
                    else if (n == 1) {
                        for (int n4 = 0; n4 < n3; ++n4) {
                            array3[n4] = (short)Stream_Read16(inputStream);
                        }
                    }
                    else {
                        for (int n5 = 0; n5 < n3; ++n5) {
                            array3[n5] = Stream_Read32(inputStream);
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
    
    private static int Stream_Read(final InputStream is) throws IOException {
        final int read = is.read();
        if (read >= 0) {
            ++GLLib.Stream_readOffset;
        }
        return read;
    }
    
    private static int Stream_Read16(final InputStream is) throws IOException {
        return (Stream_Read(is) & 0xFF) | (Stream_Read(is) & 0xFF) << 8;
    }
    
    private static int Stream_Read32(final InputStream is) throws IOException {
        return (Stream_Read(is) & 0xFF) | (Stream_Read(is) & 0xFF) << 8 | ((Stream_Read(is) & 0xFF) << 16 | (Stream_Read(is) & 0xFF) << 24);
    }
    
    private static int Stream_ReadFully(final InputStream inputStream, final byte[] array, int off, final int length) {
        off = 0;
        int len = length;
        try {
            while (len > 0) {
                final int read = inputStream.read(array, off, len);
                len -= read;
                off += read;
            }
        }
        catch (final Exception ex) {}
        GLLib.Stream_readOffset += length;
        return length;
    }
    
    private static int[] ToIntArray(final byte[] data, final boolean includeLength, int[] result) {
        final int n = ((data.length & 0x3) == 0x0) ? (data.length >>> 2) : ((data.length >>> 2) + 1);
        if (includeLength) {
            (result = new int[n + 1])[n] = data.length;
        }
        else {
            result = new int[n];
        }
        for (int length = data.length, i = 0; i < length; ++i) {
            result[i >>> 2] |= (0xFF & data[i]) << ((i & 0x3) << 3);
        }
        return result;
    }
    
    static String GetHexString(final byte[] bytes) {
        final StringBuffer sb = new StringBuffer(bytes.length << 1);
        for (int i = 0; i < bytes.length; ++i) {
            sb.append(GLLib.var_1f77[bytes[i] >> 4 & 0xF]);
            sb.append(GLLib.var_1f77[bytes[i] & 0xF]);
        }
        return sb.toString();
    }
    
    static int Crc32(final int[] buffer, int start, int count, int crc) {
        crc ^= -1;
        while (count-- != 0) {
            for (int i = 0; i < 4; ++i) {
                crc = (GLLib.crcTable[(crc ^ (byte)(buffer[start] >> i)) & 0xFF] ^ crc >>> 8);
            }
            ++start;
        }
        return ~crc;
    }
    
	static byte[] XXTEA_Encrypt(byte[] data, final String key, final boolean b) {
        byte[] keyBytes = null;
        if ("".equals(key) == false && key != null) {
            keyBytes = key.getBytes();
        }
        if (data.length == 0) {
            return data;
        }
        final int[] xxtea_data = ToIntArray(data, true, null);
        int[] keyInts = ToIntArray(keyBytes, false, null);
        final int n = xxtea_data.length - 1;
        if (n >= 1) {
            if (keyInts.length < 4) {
                final int[] tmp = new int[4];
                System.arraycopy(keyInts, 0, tmp, 0, keyInts.length);
                keyInts = tmp;
            }
            int z = xxtea_data[n];
            final int delta = -1640531527;
            int sum = 0;
            int q = 6 + 52 / (n + 1);
            while (q-- > 0) {
                final int e = (sum += delta) >>> 2 & 0x3;
                int p;
                for (p = 0; p < n; ++p) {
                    final int y = xxtea_data[p + 1];
                    final int n9 = xxtea_data[p] + ((z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (keyInts[(p & 0x3) ^ e] ^ z));
                    xxtea_data[p] = n9;
                    z = n9;
                }
                final int y = xxtea_data[0];
                final int n12 = xxtea_data[n] + ((z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (keyInts[(p & 0x3) ^ e] ^ z));
                xxtea_data[n] = n12;
                z = n12;
            }
        }
        final int tba_n;
        final byte[] result = new byte[tba_n = xxtea_data.length << 2];
        for (int j = 0; j < tba_n; ++j) {
            result[j] = (byte)(xxtea_data[j >>> 2] >>> ((j & 0x3) << 3));
        }
        return result;
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
    
    private static int Text_LoadTextFromStream(final InputStream is) {
        int tabID = 0;
        try {
            tabID = Stream_Read(is);
            GLLib.text_multiple_nbStrings[tabID] = Stream_Read32(is);
            if (GLLib.text_multiple_nbStrings[tabID] > 1024) {
                GLLib.text_multiple_nbStrings[tabID] = 1024;
            }
            GLLib.var_1faf[tabID] = new int[GLLib.text_multiple_nbStrings[tabID] + 1];
            for (int i = 1; i < GLLib.text_multiple_nbStrings[tabID] + 1; ++i) {
                GLLib.var_1faf[tabID][i] = Stream_Read32(is);
            }
            Stream_ReadFully(is, GLLib.s_text_localeGroups[tabID] = new byte[GLLib.var_1faf[tabID][GLLib.text_multiple_nbStrings[tabID]]], 0, GLLib.s_text_localeGroups[tabID].length);
        }
        catch (final Exception ex) {}
        return tabID;
    }
    
    static void Text_LoadTextFromPack(String filename, final int index) {
        Text_FreeIndex(index);
        Pack_Open(filename);
        Pack_PositionAtData(index);
        if (GLLib.idk == null) {
            GLLib.idk = new int[32];
            for (int i = 0; i < 32; ++i) {
                GLLib.idk[i] = -1;
            }
            GLLib.s_text_localeGroups = new byte[32][];
            GLLib.var_1faf = new int[32][];
            GLLib.text_multiple_nbStrings = new int[32];
            GLLib.s_text_stringCacheArray = new String[32][];
        }
        GLLib.idk[index] = Text_LoadTextFromStream(GLLib.s_pack_is);
        Pack_Close(true);
        final int idx = GLLib.idk[index];
        if (GLLib.text_multiple_nbStrings[idx] != 0) {
            final String[] array = new String[GLLib.text_multiple_nbStrings[idx]];
            for (int j = 0; j < GLLib.text_multiple_nbStrings[idx]; ++j) {
                array[j] = Text_GetStringFromLocaleFile(j + (idx << 10));
            }
            GLLib.s_text_stringCacheArray[idx] = array;
            GLLib.var_1faf[idx] = null;
            GLLib.s_text_localeGroups[idx] = null;
            System.gc();
        }
    }
    
	static String Text_GetStringFromLocaleFile(int id) {
        final int groupId = id >> 10;
        id &= 0x3FF;
        if (GLLib.s_text_stringCacheArray != null && GLLib.s_text_stringCacheArray[groupId] != null) {
            return GLLib.s_text_stringCacheArray[groupId][id];
        }
        try {
            final int length = GLLib.var_1faf[groupId][id + 1];
            if (length - GLLib.var_1faf[groupId][id] == 0) {
                return null;
            }
            return new String(GLLib.s_text_localeGroups[groupId], GLLib.var_1faf[groupId][id], length, GLLib.text_encoding);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    static void Text_FreeAll() {
        for (int i = 0; i < 32; ++i) {
            Text_FreeIndex(i);
        }
    }
    
    private static void Text_FreeIndex(final int index) {
        if (GLLib.idk != null) {
            final int n2;
            if ((n2 = GLLib.idk[index]) == -1) {
                return;
            }
            if (GLLib.s_text_stringCacheArray[n2] != null) {
                for (int i = 0; i < GLLib.text_multiple_nbStrings[n2]; ++i) {
                    GLLib.s_text_stringCacheArray[n2][i] = null;
                }
                GLLib.s_text_stringCacheArray[n2] = null;
            }
            GLLib.var_1faf[n2] = null;
            GLLib.s_text_localeGroups[n2] = null;
            GLLib.text_multiple_nbStrings[n2] = 0;
            GLLib.idk[index] = -1;
        }
    }
    
    static String Text_FormatNumber(long p_iValue, final int p_iLang, final String spaceSeparator) {
        if (p_iValue < 1000L) {
            return "" + p_iValue;
        }
        String sSeperator = "";
        switch (p_iLang) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 15:
            case 17: {
                sSeperator = ",";
                break;
            }
            case 1:
            case 3:
            case 5:
            case 16: {
                sSeperator = ".";
                break;
            }
            case 12:
            case 13: {
                sSeperator = spaceSeparator;
                break;
            }
            case 2:
            case 4:
            case 6:
            case 10: {
                if (p_iValue >= 10000L) {
                    sSeperator = spaceSeparator;
                    break;
                }
                break;
            }
            case 11:
            case 14: {
                if (p_iValue >= 10000L) {
                    sSeperator = ".";
                    break;
                }
                break;
            }
            default: {
                return "" + p_iValue;
            }
        }
        String sResult = "";
        long end = (p_iValue % 1000L < 0L) ? (-(p_iValue % 1000L)) : (p_iValue % 1000L);
        p_iValue /= 1000L;
        while (end != 0L || p_iValue != 0L) {
            if (end < 10L) {
                sResult = "00" + ((end < 0L) ? (-end) : end) + sResult;
            }
            else if (end < 100L) {
                sResult = "0" + ((end < 0L) ? (-end) : end) + sResult;
            }
            else {
                sResult = ((end < 0L) ? (-end) : end) + sResult;
            }
            end = p_iValue % 1000L;
            if ((p_iValue /= 1000L) != 0L) {
                sResult = sSeperator + sResult;
            }
            else {
                if (end == 0L) {
                    continue;
                }
                sResult = end + sSeperator + sResult;
                end = 0L;
            }
        }
        return sResult;
    }
    
    static String sub_5307(final String s, final String[] array) {
        String r = "";
        if (s.indexOf(37) < 0) {
            return s;
        }
        int n = 0;
        int i = 0;
        do {
            if ((i = s.indexOf(37, i)) < 0 || i == s.length() - 1) {
                r += s.substring(n);
                i = -1;
            }
            else if (s.charAt(i + 1) == 's') {
                int n2 = -1;
                if (i + 2 < s.length()) {
                    n2 = s.charAt(i + 2) - '0';
                }
                if (n2 >= 0 && n2 <= 9) {
                    r = r + s.substring(n, i) + array[n2];
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
        return r;
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
    
    static void sub_56ff(int var0) {
        if (var_1fcf == null) {
           var_1fcf = new int[1];
           var_1fd7 = new int[1][];
        }

        int var2 = 0;

        int var10000;
        while (true) {
           if (var2 >= var_1fcf.length) {
              var10000 = -1;
              break;
           }

           if (var_1fcf[var2] == var0) {
              var10000 = var2;
              break;
           }

           var2++;
        }

        if (var10000 == -1 || var_1fd7 == null) {
           var_1fc7++;
           var10000 = 0;
           var_1fcf[0] = var0;
           if (var_1fd7[0] == null) {
              var_1fd7[0] = new int[256];
           }

           var2 = 256;

           while (var2 > 0) {
              var_1fd7[0][--var2] = var0;
           }
        }

        var_1fc7 = var10000;
     }
    
    static void sub_57eb(final Graphics graphics, int y, int j, int width, int height) {
        final int clipY = GetClipX(graphics, true);
        final int clipX = GetClipY(graphics, true);
        final int clipH = GetClipWidth(graphics, true);
        final int clipW = GetClipHeight(graphics, true);
        final int x = (y > clipY) ? y : clipY;
        final int _y = (j > clipX) ? j : clipX;
        width = ((y + width < clipY + clipH) ? (y + width) : (clipY + clipH)) - x;
        height = ((j + height < clipX + clipW) ? (j + height) : (clipX + clipW)) - _y;
        if (width <= 0 || height <= 0) {
            return;
        }
        y = (j > clipX) ? j : clipX;
        j = x;
        SetClip(graphics, x, y, width, height, true);
        if (height * width < 256) {
            DrawRGB(graphics, GLLib.var_1fd7[GLLib.var_1fc7], 0, width, ASprite.s_screenWidth - _y - height, y, width, height, true, true, 0, -1, false);
        }
        else {
            width += ASprite.s_screenWidth - _y - height;
            height += y;
            for (y = ASprite.s_screenWidth - _y - height; y < width; y += 16) {
                for (j = y; j < height; j += 16) {
                    DrawRGB(graphics, GLLib.var_1fd7[GLLib.var_1fc7], 0, 16, y, j, 16, 16, true, true, 0, -1, false);
                }
            }
        }
        SetClip(graphics, clipY, clipX, clipH, clipW, true);
    }
    
    public static int[] PFX_GetParams(final int PFXid) {
        return GLLib.s_PFX_params[PFXid];
    }
    
    public static int PFX_GetFirstEnabledEffect() {
        final int n;
        if ((n = (GLLib.s_PFX_param & 0xFF7E0)) != 0) {
            for (int i = 0; i < 20; ++i) {
                if ((n & 1 << i) != 0x0) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    private static final void drawRGB(final Graphics graphics, final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        DrawRGB(graphics, array, 0, n, n2, n3, n4, n5, b, true, 0, -1, false);
    }
    
    static final void Custom_ResetZoomLevel() {
        GLLib.s_PFX_param = 0;
        (GLLib.s_PFX_params = new int[20][])[13] = new int[7];
        GLLib.s_PFX_params[13][1] = 100;
        GLLib.s_PFX_params[13][2] = -1;
        GLLib.s_PFX_params[13][0] = -1;
        GLLib.s_PFX_params[13][3] = 100;
        GLLib.s_PFX_params[13][4] = 100;
        GLLib.s_PFX_params[13][5] = 0;
        GLLib.s_PFX_params[13][6] = 0;
    }
    
    static final void PFX_EnableScaleEffect() {
        GLLib.s_PFX_param |= 0x2000;
    }
    
    static final void PFX_DisableScaleEffect() {
        GLLib.s_PFX_param &= 0xFFFFDFFF;
    }
    
    static final int PFX_Scale_GetScaleX() {
        final int n;
        if ((n = GLLib.s_PFX_params[13][1]) != 100) {
            return n;
        }
        return GLLib.s_PFX_params[13][3];
    }
    
    static final int PFX_Scale_GetScaleY() {
        final int n;
        if ((n = GLLib.s_PFX_params[13][1]) != 100) {
            return n;
        }
        return GLLib.s_PFX_params[13][4];
    }
    
    static final void PFX_Scale_SetScale(final int scale) {
        GLLib.s_PFX_params[13][1] = scale;
        GLLib.s_PFX_params[13][3] = scale;
        GLLib.s_PFX_params[13][4] = scale;
    }
    
    static final void sub_5c77(final boolean b) {
        GLLib.s_PFX_params[13][5] = (b ? 1 : 0);
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
    
    static final int[] PFX_ProcessSpriteEffects(final Graphics g, int[] source, int x, int y, int w, int h, int flags, boolean hasAlpha, final boolean b, final boolean b2) {
        GLLib.s_PFX_hasAlpha = hasAlpha;
        GLLib.s_PFX_sizeX = w;
        GLLib.s_PFX_sizeY = h;
        GLLib.s_PFX_newPosX = x;
        GLLib.s_PFX_newPosY = y;
        if ((GLLib.s_PFX_param & 0x5600) != 0x0) {
            if ((flags & 0x4) != 0x0) {
                GLLib.s_PFX_sizeX = h;
                GLLib.s_PFX_sizeY = w;
                w = GLLib.s_PFX_sizeX;
                h = GLLib.s_PFX_sizeY;
            }
            source = ASprite.TransformRGB(source, w, h, flags, null);
        }
        GLLib.s_PFX_newSizeX = w;
        GLLib.s_PFX_newSizeY = h;
        int[] array = ASprite.GetPixelBuffer(source);
        if ((GLLib.s_PFX_param & 0x2000) == 0x0) {
            return null;
        }
        final int n3;
        final boolean b3 = (n3 = GLLib.s_PFX_params[13][0]) != 1 && (n3 == 2 || b);
        int n4;
        if ((n4 = GLLib.s_PFX_params[13][6]) % GLLib.Math_Angle360 != 0) {
            hasAlpha = true;
            w = h;
            final int var_2018 = y;
            final int var_200f2 = x;
            int[] sub_9f61 = array;
            if ((flags & 0x4) != 0x0) {
                flags = (flags & 0xFFFFFFFB);
                n4 += 90 * GLLib.var_1ed7 / 360;
            }
            if (flags != 0) {
            	array = ASprite.GetPixelBuffer(source = ASprite.TransformRGB(source, w, w, flags, null));
            }
            final int sub_2be7 = Math_Cos(GLLib.Math_Angle90 - n4);
            final int sub_2be8 = Math_Cos(n4);
            sub_5cfb(sub_2be7, sub_2be8, w, w, ASprite.s_rc);
            final int var_201f = ASprite.s_rc[0];
            h = ASprite.s_rc[1];
            final int n13 = var_201f >> 1;
            final int n14 = h >> 1;
            final int n15 = var_201f - w >> 1;
            final int n16 = h - w >> 1;
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
                for (int k = 0; k < h; ++k) {
                    final int n28 = n21 + (n25 + 128 >> 8);
                    final int n29 = n22 + (n26 + 128 >> 8);
                    n25 += sub_2be7;
                    n26 += sub_2be8;
                    if (n28 >= 0 && n29 >= 0 && n28 < w && n29 < w) {
                        sub_9f61[n27] = source[n29 * w + n28];
                    }
                    else {
                        sub_9f61[n27] = 0;
                    }
                    n27 += var_201f;
                }
                n23 += sub_2be8;
                n24 += sub_2be7;
            }
            GLLib.s_PFX_newPosX = var_200f2;
            GLLib.s_PFX_newPosY = var_2018;
            GLLib.s_PFX_newSizeX = var_201f;
            GLLib.s_PFX_newSizeY = h;
            GLLib.s_PFX_hasAlpha = true;
            array = ASprite.GetPixelBuffer(source = sub_9f61);
            x = GLLib.s_PFX_newPosX;
            y = GLLib.s_PFX_newPosY;
            w = GLLib.s_PFX_newSizeX;
            h = GLLib.s_PFX_newSizeY;
            flags &= ~flags;
        }
        final int sub_5bfe = PFX_Scale_GetScaleY();
        final int sub_5bbb = PFX_Scale_GetScaleX();
        final int n30 = x;
        final int n31 = y;
        final int n32 = w;
        final int n33 = h;
        final int n34 = sub_5bfe;
        final int n35 = sub_5bbb;
        final int n36 = GLLib.s_PFX_params[13][2];
        final boolean b4 = hasAlpha;
        final boolean b5 = b3;
        int n37 = flags;
        final boolean b6 = b5;
        final boolean b7 = b4;
        final int n38 = n36;
        final int n39 = n35;
        final int n40 = n34;
        w = n33;
        int var_1fff = n32;
        final int n41 = n31;
        final int n42 = n30;
        int[] sub_9f62 = array;
        int[] sub_9c13 = source;
        int n43 = 0;
        int n44 = n37 & 0xFFFFFFFE;
        if ((n37 & 0x4) != 0x0) {
            n44 = n37;
            n37 = 0;
        }
        if (n44 != 0) {
            if ((n44 & 0x4) != 0x0) {
                GLLib.s_PFX_sizeX = w;
                GLLib.s_PFX_sizeY = var_1fff;
                var_1fff = GLLib.s_PFX_sizeX;
                w = GLLib.s_PFX_sizeY;
            }
            final int[] array6 = sub_9c13;
            final int n45 = var_1fff;
            final int n46 = w;
            y = n44;
            x = n46;
            sub_9f62 = ASprite.GetPixelBuffer(sub_9c13 = ASprite.TransformRGB(array6, n45, x, y, null));
        }
        final int var_201f2 = var_1fff * n40 / 100 + ((var_1fff * n40 % 100 != 0) ? 1 : 0);
        final int var_2019 = w * n39 / 100 + ((w * n39 % 100 != 0) ? 1 : 0);
        GLLib.s_PFX_newSizeX = var_201f2;
        GLLib.s_PFX_newSizeY = var_2019;
        if (var_201f2 <= 0 || var_2019 <= 0) {
            return null;
        }
        final int n47 = (var_1fff << 8) / var_201f2;
        final int n48 = (w << 8) / var_2019;
        GetClipX(g, false);
        GetClipY(g, false);
        GetClipWidth(g, false);
        GetClipHeight(g, false);
        final int n49 = var_201f2;
        final int n50 = var_201f2;
        final int n51;
        if ((n51 = sub_9f62.length / var_201f2) <= 0) {
            return null;
        }
        int n52 = n51;
        int n53 = n41;
        if (n38 < 0) {
            w = n51 * var_201f2;
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
            int n60 = (h = var_2019) * n48;
            while (--h >= 0) {
                int n61 = (((n60 -= n48) >> 8) * var_1fff << 8) + n54;
                flags = n50;
                while (--flags >= 0) {
                    sub_9f62[--n58] = sub_9c13[n61 >> 8];
                    n61 += n55;
                }
                if (--n56 == 0) {
                    if (b2) {
                        drawRGB(g, sub_9f62, var_201f2, n42, n59, var_201f2, n57, b7);
                    }
                    n57 = n51;
                    n59 -= n51;
                    n56 = n51;
                    n58 = w;
                }
            }
        }
        else {
            int n62;
            if ((n37 & 0x1) != 0x0) {
                w = (n49 - 1) * n47;
                n62 = -n47;
            }
            else {
                w = 0;
                n62 = n47;
            }
            if (!b6 && !b7) {
                final int n63 = (n38 & 0xFF) << 24;
                for (int l = 0, n64 = 0; l < var_2019; ++l, n64 += n48) {
                    final int n65 = (n64 >> 8) * var_1fff;
                    h = 0;
                    for (int n66 = w; h < var_201f2; ++h, n66 += n62) {
                        sub_9f62[n43++] = (n63 | (sub_9c13[n65 + (n66 >> 8)] & 0xFFFFFF));
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            drawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
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
                    h = 0;
                    for (int n71 = w; h < var_201f2; ++h, n71 += n62) {
                        if ((flags = (sub_9c13[n70 + (n71 >> 8)] & 0xFFFFFF)) != 16711935 && flags != 0) {
                            sub_9f62[n43++] = (n67 | flags);
                        }
                        else {
                            sub_9f62[n43++] = 0;
                        }
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            drawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
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
                    h = 0;
                    for (int n75 = w; h < var_201f2; ++h, n75 += n62) {
                        final int n76 = n74 + (n75 >> 8);
                        flags = ((sub_9c13[n76] >>> 24) * n38 >> 8 & 0xFF & 0xFF) << 24;
                        sub_9f62[n43++] = (flags | (sub_9c13[n76] & 0xFFFFFF));
                    }
                    if (--n52 == 0) {
                        if (b2) {
                            drawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
                        }
                        n53 += n51;
                        n52 = n51;
                        n43 = 0;
                    }
                }
            }
            if (b2 && n52 != n51) {
                drawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51 - n52, true);
            }
        }
        if (b2) {
            return null;
        }
        return sub_9f62;
    }
    
    static void sub_6ccf(final Graphics g, final int x1, final int n2, int x2, int n4, int blue, int n6, int y1) {
        final int n7 = blue >> 16 & 0xFF;
        final int n8 = blue >> 8 & 0xFF;
        blue &= 0xFF;
        final int n9 = n6 >> 16 & 0xFF;
        final int n10 = n6 >> 8 & 0xFF;
        n6 &= 0xFF;
        final int n11 = n9 - n7;
        final int n12 = n10 - n8;
        n6 -= blue;
        x2 = x1 + x2 - 1;
        n4 = n2 + n4 - 1;
        int red = n7 << 16;
        int green = n8 << 16;
        blue <<= 16;
        if (y1 == 4) {
            y1 = x2 - x1;
            final int n15 = (n11 << 16) / y1;
            final int n16 = (n12 << 16) / y1;
            n6 = (n6 << 16) / y1;
            for (y1 = x2; y1 >= x1; --y1) {
                setColor(g, red >> 16, green >> 16, blue >> 16);
                DrawLine(g, y1, n2, y1, n4, true);
                red += n15;
                green += n16;
                blue += n6;
            }
            return;
        }
        if (y1 == 8) {
            y1 = x2 - x1;
            final int n17 = (n11 << 16) / y1;
            final int n18 = (n12 << 16) / y1;
            n6 = (n6 << 16) / y1;
            for (y1 = x1; y1 <= x2; ++y1) {
                setColor(g, red >> 16, green >> 16, blue >> 16);
                DrawLine(g, y1, n2, y1, n4, true);
                red += n17;
                green += n18;
                blue += n6;
            }
            return;
        }
        if (y1 == 16) {
            y1 = n4 - n2;
            n6 = (n6 << 16) / y1;
            for (y1 = n4; y1 >= n2; --y1) {
                setColor(g, red >> 16, green >> 16, blue >> 16);
                DrawLine(g, x1, y1, x2, y1, true);
                red += (n11 << 16) / y1;
                green += (n12 << 16) / y1;
                blue += n6;
            }
            return;
        }
        if (y1 == 32) {
            y1 = n4 - n2;
            n6 = (n6 << 16) / y1;
            for (y1 = n2; y1 <= n4; ++y1) {
                setColor(g, red >> 16, green >> 16, blue >> 16);
                DrawLine(g, x1, y1, x2, y1, true);
                red += (n11 << 16) / y1;
                green += (n12 << 16) / y1;
                blue += n6;
            }
        }
    }
    
    static void DrawAlphaGradientRect(final int x, final int y, final int w, final int h) {
        DrawAlphaGradientRect(GLLib.g, 0, x, y, w, h, 0, 16);
    }
    
    static void DrawAlphaGradientRect(final Graphics g, int x, int y, final int w, final int h, int c1, int c2, int direction) {
        int gradLength = w;
        int gradWidth = h;
        if (direction == 16 || direction == 32) {
            gradLength = h;
            gradWidth = w;
        }
        if (direction == 4 || direction == 16) {
            final int index = c1;
            c1 = c2;
            c2 = index;
        }
        final int[] buffer = ASprite.GetPixelBuffer_int(null);
        final int lines = (gradWidth < buffer.length / gradLength) ? gradWidth : (buffer.length / gradLength);
        final int a1 = c1 >>> 24;
        final int r1 = c1 >> 16 & 0xFF;
        final int g1 = c1 >> 8 & 0xFF;
        final int b1 = c1 & 0xFF;
        final int a2 = c2 >>> 24;
        final int r2 = c2 >> 16 & 0xFF;
        final int g2 = c2 >> 8 & 0xFF;
        c2 &= 0xFF;
        --gradLength;
        final int da = (a2 - a1 << 16) / gradLength;
        final int n19 = (r2 - r1 << 16) / gradLength;
        final int n20 = (g2 - g1 << 16) / gradLength;
        final int n21 = (c2 - b1 << 16) / gradLength;
        ++gradLength;
        int n22 = a1 << 16;
        int n23 = r1 << 16;
        int n24 = g1 << 16;
        int n25 = b1 << 16;
        int g2_2;
        if (direction == 4 || direction == 8) {
            g2_2 = w;
            c2 = -(w * lines) + 1;
        }
        else {
            g2_2 = 1;
            c2 = 0;
        }
        int n27 = 0;
        for (int j = 0; j < gradLength; ++j) {
            int n28 = lines;
            while (--n28 >= 0) {
                buffer[n27] = c1;
                n27 += g2_2;
            }
            n22 += da;
            n23 += n19;
            n24 += n20;
            n25 += n21;
            c1 = ((n22 << 8 & 0xFF000000) | (n23 & 0xFF0000) | (n24 >> 8 & 0xFF00) | (n25 >> 16 & 0xFF));
            n27 += c2;
        }
        if (direction == 4 || direction == 8) {
            while (gradWidth > 0) {
                DrawRGB(g, buffer, 0, w, x, y, w, (lines < gradWidth) ? lines : gradWidth, true, true, 0, -1, true);
                y += lines;
                gradWidth -= lines;
            }
        }
        else if (direction == 16 || direction == 32) {
            while (gradWidth > 0) {
                DrawRGB(g, buffer, 0, lines, x, y, ((lines)<(gradWidth)?(lines):(gradWidth)), h, true, true, 0, -1, true);
                x += lines;
                gradWidth -= lines;
            }
        }
    }
    
    public void addCommand(final Command command) {
        super.addCommand(command);
    }
    
    public static final void sub_755d() {
        GLLib.s_pointerState = 0;
    }
    
    private static final void SetCoordinateValues() {
        GLLib.s_screenY = GLLib.s_screenHeight - GLLib.s_screenX;
        GLLib.s_screenX = s_screenY;
    }
    
    protected void pointerReleased(int x, final int y) {
    	GLLib.s_screenX = x;
        x = GLLib.s_screenX;
        GLLib.s_screenY = y;
        SetCoordinateValues();
        GLLib.var_205f = true;
    }
    
    protected void pointerPressed(int x, final int y) {
    	GLLib.s_screenX = x;
    	x = GLLib.s_screenX;
        GLLib.s_screenY = y;
        SetCoordinateValues();
        GLLib.var_2057 = true;
    }
    
    protected void pointerDragged(int x, final int y) {
    	GLLib.s_screenX = x;
    	x = GLLib.s_screenX;
        GLLib.s_screenY = y;
        SetCoordinateValues();
        GLLib.var_2067 = true;
    }
    
    static final boolean sub_762d() {
        return GLLib.s_pointerState == 2;
    }
    
    static final boolean sub_7660() {
        return GLLib.s_pointerState == 1;
    }
    
    static final boolean sub_7693() {
        return GLLib.s_pointerState == 3;
    }
    
    static final boolean sub_76c6() {
        return GLLib.s_pointerState == 4;
    }
    
    static final boolean sub_76f9() {
        return GLLib.s_pointerState == 4 || GLLib.s_pointerState == 1 || GLLib.s_pointerState == 3;
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
    
    static boolean IAP_CanRedeemCode() {
        return Class_o.canRedeemCode();
    }
    
    static int IAP_GetPackageIDInt() {
        return Class_o.getPackageIdInt();
    }
    
    static int sub_7884() {
        return Class_o.sub_4042();
    }
    
    static String getPrice_2(final int pricePoint, final String s) {
        return Class_o.getPriceTHUNK(Class_o.getPricePoint(pricePoint, s));
    }
    
    static String IAP_GetTermsAndConditions() {
        return Class_o.GetTermsAndConditions();
    }
    
    static String IAP_GetFullSupportUrl() {
        return Class_o.getFullSupportUrl();
    }
    
    static void IAP_Reset() {
        Class_o.reset();
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
        ALWAYS_128 = 128;
        var_1ed7 = 256;
        Math_Angle90 = 90 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle180 = 180 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle270 = 270 * GLLib.var_1ed7 / 360;
        GLLib.Math_Angle360 = 360 * GLLib.var_1ed7 / 360;
        GLLib.Stream_readOffset = 0;
        GLLib.var_1f77 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        GLLib.text_encoding = "UTF-8";
        var_1fdf = true;
        GLLib.s_PFX_param = 0;
        GLLib.s_PFX_params = null;
        GLLib.var_206f = 0L;
    }
}
