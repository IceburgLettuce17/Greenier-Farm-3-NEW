
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
    static int m_customSleepTime;
    static int s_game_frameDT;
    private static long s_game_frameDTTimer;
    static int s_game_totalExecutionTime;
	private static int s_game_currentFrameNB;
    static GLLib s_gllib_instance;
    static boolean s_bPlatformRequestPending;
    private static String s_urlPlatformRequest;
    private static int m_keys_pressed;
    private static int m_keys_released;
    private static int m_current_keys_state;
    private static int m_current_keys_pressed;
    private static int m_current_keys_released;
    private static int s_keysDisabledTimer;
    private static Hashtable standardKeyTable;
    private static Hashtable gameActionKeyTable;
    private static int s_nbKey;
    static final int s_math_F_1;
    static final int s_math_F_05;
    static Random s_math_random;
    static int s_math_bezierX;
    static int s_math_bezierY;
    private static int[] s_math_cosTable;
    private static int[] s_math_sqrtTable;
    static final int Math_AngleMUL;
    static final int Math_Angle90;
    private static int Math_Angle180;
    private static int Math_Angle270;
    private static int Math_Angle360;
    static String s_pack_filename;
    private static InputStream s_pack_is;
    private static int s_pack_dataSource;
    private static byte[] s_pack_memBufSrc;
    private static int s_pack_memBufSrcOff;
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
    private static char[] hexDigit;
    private static int[] crcTable;
    private static boolean s_crcTableWasInited;
    static String text_encoding;
    private static int[] text_multiple_array_map;
    private static byte[][] s_text_localeGroups;
    private static int[] text_multiple_nbStrings;
    private static int[][] text_multiple_arrayOffsets;
    private static String[][] text_multiple_stringCacheArrays;
    private static RecordStore s_rs;
    private static int s_alphaRectCurrentARGB;
    private static int[] s_alphaRectARGBData;
    private static int[][] s_alphaRectARGBDatas;
    static final boolean pfx_useSpriteEffects;
    static int s_PFX_type;
    static int[][] s_PFX_params;
    static boolean s_PFX_hasAlpha;
    private static int s_PFX_sizeX;
    private static int s_PFX_sizeY;
    static int s_PFX_newPosX;
    static int s_PFX_newPosY;
    static int s_PFX_newSizeX;
    static int s_PFX_newSizeY;
    static int s_pointerState;
    static int s_pointerX;
    static int s_pointerY;
    private static int s_tmpPrevPointerX;
    private static int s_tmpPrevPointerY;
    private static boolean s_isPointerPressedSystem;
    private static boolean s_isPointerReleasedSystem;
    private static boolean s_isPointerDraggedSystem;
    private static long s_iapRequestTime;
    
    abstract void Game_update();
    
    public GLLib(final Object application, final Object display) {
		Dbg("GLLib.constructor");
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
		Dbg("GLLib.init");
        if (GLLib.s_game_state >= 0) {
            return;
        }
        GLLib.s_screenWidth = GLLibConfig.screenWidth;
        GLLib.s_screenHeight = GLLibConfig.screenHeight;
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
		Dbg("GLLib.deInit");
        GLLib.MIME_type = null;
        System.gc();
    }
    
    protected void Pause() {
        if (!GLLib.s_game_isPaused) {
            GLLib.s_game_isPaused = true;
			Dbg("GLLib.pause");
            GLLibPlayer.Snd_PauseNotify();
        }
    }
    
    private void Resume() {
		Dbg("GLLib.resume");
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
		Dbg("GLLib.SetupDisplay");
        this.setFullScreenMode(true);
        if (GLLib.s_display != null && GLLib.s_display.getCurrent() != this) {
            GLLib.s_display.setCurrent((Displayable)this);
        }
    }
    
    public void run() {
		Dbg("GLLib.run");
        try {
            this.SetupDisplay();
            GLLib.s_game_isInPaint = false;
            while (GLLib.s_game_state >= 0) {
                if (!GLLib.s_game_isPaused) {
                    this.repaint();
                    this.serviceRepaints();
                    long curTime = System.currentTimeMillis();
                    this.m_frameCoheranceTimer = Math.min(this.m_frameCoheranceTimer, curTime);
                    if (GLLib.m_customSleepTime >= 0) {
                        if (GLLib.m_customSleepTime == 0) {
                            Thread.yield();
                        }
                        else {
                            Thread.sleep(GLLib.m_customSleepTime);
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
			Dbg("!!FATAL ERROR!! in cGame.run()." + ex);
			ex.printStackTrace();
            GLLib.s_game_state = -1;
        }
		Dbg("GLLib.Quitting main loop");
        this.UnInit();
        GLLib.s_application.notifyDestroyed();
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
            if (GLLib.s_keysDisabledTimer > 0) {
                if (GLLib.s_keysDisabledTimer != Integer.MAX_VALUE) {
                    GLLib.s_keysDisabledTimer -= GLLib.s_game_frameDT;
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
        if (GLLib.s_isPointerPressedSystem) {
            GLLib.s_pointerState = 1;
            GLLib.s_isPointerPressedSystem = false;
        }
        else if (GLLib.s_isPointerReleasedSystem) {
            GLLib.s_pointerState = 2;
            GLLib.s_isPointerReleasedSystem = false;
            GLLib.s_isPointerDraggedSystem = false;
        }
        else if (GLLib.s_isPointerDraggedSystem) {
            GLLib.s_pointerState = 3;
            GLLib.s_isPointerDraggedSystem = false;
        }
        GLLib.s_tmpPrevPointerX = GLLib.s_pointerX;
        GLLib.s_tmpPrevPointerY = GLLib.s_pointerY;
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
			Dbg("!!FATAL ERROR!! in Game_paint()." + ex);
            ex.printStackTrace();
            GLLib.s_game_state = -1;
        }
        GLLib.s_game_isInPaint = false;
    }
    
    static final void OpenBrowser(final String uri) {
        GLLib.s_bPlatformRequestPending = true;
        GLLib.s_urlPlatformRequest = uri;
        new Thread(new PlatformRequestWorker()).start();
    }
    
    static final void doPlatformRequest() {
        GLLib.s_bPlatformRequestPending = false;
        if (GLLib.s_urlPlatformRequest != null) {
            try {
                GLLib.s_application.platformRequest(GLLib.s_urlPlatformRequest);
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
        GLLib.m_keys_released = 0;
        GLLib.m_current_keys_state = 0;
        GLLib.m_current_keys_pressed = 0;
        GLLib.m_current_keys_released = 0;
    }
    
    public static int WasAnyKeyPressed() {
        if (GLLib.m_keys_pressed == 0) {
            return -1;
        }
        int i = GLLib.s_nbKey;
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
        int i = GLLib.s_nbKey;
        while (--i >= 0) {
            if ((GLLib.m_keys_released & 1 << i) != 0x0) {
                return i;
            }
        }
        return -1;
    }
    
    static void Math_Init(final String packName) {
		if (packName == null) {
            Assert(false, "Math_Init.packName is null");
        }
        Pack_Open(packName);
        GLLib.s_math_cosTable = (int[])Pack_ReadArray(1);
        GLLib.s_math_sqrtTable = (int[])Pack_ReadArray(0);
        Pack_Close(true);
    }
    
    static int Math_Rand(final int a, final int b) {
        if (GLLib.s_math_random == null) {
            Assert(false, "Math_Rand.GLLib mut be initialised prior to using this function");
        }
        if (a > b) {
            Assert(false, "Math_Rand.a must be <= b");
        }
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
		if (GLLib.s_math_cosTable == null) {
            Assert(false, "!!ERROR!! Math_Cos.s_math_cosTable is null, call Math_Init first");
        }
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
		Assert(GLLib.s_math_sqrtTable != null, "!!ERROR!! Math_sqrt.s_math_sqrtTable is null, call Math_Init first");
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
    
    static void Math_Bezier2D(final int x1, final int y1, final int x2, final int y2, final int x3, final int y3, int interp) {
        final int mum2 = GLLib.s_math_F_1 - interp * GLLib.s_math_F_1 - interp;
        interp *= GLLib.s_math_F_1;
        GLLib.s_math_bezierX = (x1 * mum2 + (x2 << 1) * interp + x3 * interp * interp) / (1 << 16);
        GLLib.s_math_bezierY = (y1 * mum2 + (y2 << 1) * interp + y3 * interp * interp) / (1 << 16);
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
		if (filename == null) {
            Assert(false, "Pack_Open.filename is null");
        }
        GLLib.s_pack_dataSource = 1;
        if (GLLib.s_pack_filename == null || filename == null || filename.compareTo(GLLib.s_pack_filename) != 0) {
            Pack_Close(true);
            GLLib.s_pack_filename = filename;
            GLLib.s_pack_memBufSrc = null;
            GLLib.s_pack_memBufSrcOff = 0;
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
        if (GLLib.s_pack_dataSource == 3) {
            pStream = new ByteArrayInputStream(null, 0, 0);
        }
        else if (GLLib.s_pack_dataSource != 2 && GLLib.s_pack_dataSource == 1) {
            pStream = "".getClass().getResourceAsStream(s);
        }
        return pStream;
    }
    
    static final void Pack_FullyClose() {
        Pack_Close(true);
    }
    
    private static final void Pack_Close(final boolean resetFilename) {
        Pack_ResetInputStream();
        if (GLLib.s_pack_dataSource == 3) {
            GLLib.s_pack_memBufSrc = null;
        }
        if (resetFilename) {
            GLLib.s_pack_filename = null;
        }
        System.gc();
    }
    
    private static final void Pack_ResetInputStream() {
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
		if (idx < 0) {
            Assert(false, "Pack_PositionAtData.idx is invalid");
        }
        if (idx >= GLLib.s_pack_nbData) {
            Assert(false, "Pack_PositionAtData.idx is invalid");
        }
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
                Pack_ResetInputStream();
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
		if (idx < 0) {
            Assert(false, "Pack_ReadData.idx is invalid");
        }
        if (idx >= GLLib.s_pack_nbData) {
            Assert(false, "Pack_ReadData.idx is invalid");
        }
        byte[] data = new byte[idx = Pack_PositionAtData(idx)];
        Pack_ReadFully(data, 0, data.length);
        return data;
    }
    
    private static void Pack_Skip(int nb) {
        if (nb == 0) {
            return;
        }
        if (GLLib.s_pack_dataSource == 3) {
            GLLib.s_pack_curOffset += nb;
            try {
                while (nb > 0) {
                    nb -= (int)GLLib.s_pack_is.skip(nb);
                }
                return;
            }
            catch (final Exception ex) {
                //return;
				Assert(false, "Pack_Skip.IO exception occured");
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
        catch (final Exception e) {
            Assert(false, "Pack_Read.IO exception occured");
        }
        if (read < 0) {
            Assert(false, "Pack_Read.EOF");
        }
        ++GLLib.s_pack_curOffset;
        return read;
    }
    
    private static int Pack_Read16() {
        return (Pack_Read() & 0xFF) | (Pack_Read() & 0xFF) << 8;
    }
    
    private static int Pack_ReadFully(final byte[] array, int offset, final int length) {
		if (array == null) {
            Assert(false, "Pack_ReadFully.array is null");
        }
        if (offset < 0) {
            Assert(false, "Pack_ReadFully.offset is negative");
        }
        if (length < 0) {
            Assert(false, "Pack_ReadFully.length is negative");
        }
        if (offset + length > array.length) {
            Assert(false, "Pack_ReadFully.offset+length is bigger than array size");
        }
        offset = 0;
        int len = length;
        try {
            while (len > 0) {
                final int read = GLLib.s_pack_is.read(array, offset, len);
				if (read < 0) {
                    Assert(false, "Pack_ReadFully.EOF");
                }
                len -= read;
                offset += read;
            }
        }
        catch (final Exception e) {
            Assert(false, "Pack_Read.IO exception occured");
        }
        GLLib.s_pack_curOffset += length;
        return length;
    }
    
    static final Object Pack_ReadArray(final int idx) {
		if (idx < 0) {
            Assert(false, "Pack_ReadArray.idx is invalid");
        }
        if (idx >= GLLib.s_pack_nbData) {
            Assert(false, "Pack_ReadArray.idx is invalid");
        }
        Pack_PositionAtData(idx);
        GLLib.Stream_readOffset = 0;
        final Object array = Mem_ReadArray(GLLib.s_pack_is);
        GLLib.s_pack_curOffset += GLLib.Stream_readOffset;
        return array;
    }
    
    static void Pack_LoadMIME(final String filename) {
		if (filename == null) {
            Assert(false, "Pack_LoadMIME.filename is null");
        }
        if (GLLib.MIME_type == null) {
            GLLib.s_pack_is = Pack_GetInputStreamFromName(filename);
            GLLib.MIME_type = new byte[Pack_Read()][];
            for (int i = 0; i < Pack_Read(); ++i) {
                Pack_ReadFully(GLLib.MIME_type[i] = new byte[Pack_Read()], 0, Pack_Read());
            }
            try {
                GLLib.s_pack_is.close();
            }
            catch (final Exception e) {
                Assert(false, "Pack_LoadMIME.IO Error");
            }
        }
    }
    
    static String GetMIME(final int idx) {
		if (GLLib.MIME_type == null) {
            Assert(false, "GetMIME. MIME type not loaded yet, use Pack_LoadMIME first");
        }
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
    
    private static void SetColor(final Graphics _g, int red, final int green, final int blue) {
		if (red > 255) {
            Assert(false, "setColor. red is bigger than 0xFF");
        }
        if (green > 255) {
            Assert(false, "setColor. green is bigger than 0xFF");
        }
        if (blue > 255) {
            Assert(false, "setColor. blue is bigger than 0xFF");
        }
		_g.setColor(red << 16 | green << 8 | blue);
    }
    
    static final int GetClipX(final Graphics _g, final boolean allowRotation) {
        if (allowRotation) {
            return _g.getClipY();
        }
        return _g.getClipX();
    }
    
    static final int GetClipY(final Graphics _g, final boolean allowRotation) {
        if (allowRotation) {
            return ASprite._graphicsHeight - _g.getClipX() - _g.getClipWidth();
        }
        return _g.getClipY();
    }
    
    static final int GetClipWidth(final Graphics _g, final boolean allowRotation) {
        if (allowRotation) {
            return _g.getClipHeight();
        }
        return _g.getClipWidth();
    }
    
    static final int GetClipHeight(final Graphics graphics, final boolean allowRotation) {
        if (allowRotation) {
            return graphics.getClipWidth();
        }
        return graphics.getClipHeight();
    }
    
    static final void ClipRect(final Graphics g, int x, int y, int width, int height, final boolean allowRotation) {
        int holdTemp = x;
        x = ASprite._graphicsHeight - y - height;
        y = holdTemp;
        holdTemp = width;
        width = height;
        height = holdTemp;
        g.clipRect(x, y, width, height);
    }
    
    static final void SetClip(final Graphics g, int x, int y, int width, int height, final boolean allowRotation) {
        int holdTemp = x;
        x = ASprite._graphicsHeight - y - height;
        y = holdTemp;
        holdTemp = width;
        width = height;
        height = holdTemp;
        g.setClip(x, y, width, height);
    }
    
    static final void DrawLine(final Graphics g, int x1, int y1, int x2, int y2, final boolean allowRotation) {
        x1 = ASprite._graphicsHeight - y1 - 1;
        y1 = x1;
        x2 = ASprite._graphicsHeight - y2 - 1;
        y2 = x2;
        g.drawLine(x1, y1, x2, y2);
    }
    
    static final void FillRect(final Graphics g, int x, int y, int width, int height, final boolean allowRotation) {
        x = ASprite._graphicsHeight - y - height;
        y = x;
        width = height;
        height = width;
        g.fillRect(x, y, width, height);
    }
    
    static final void DrawRect(final Graphics g, int x, int y, int width, int height, final boolean allowRotation) {
        x = ASprite._graphicsHeight - y - height - 1;
        y = x;
        width = height;
        height = width;
        g.drawRect(x, y, width, height);
    }
    
    static final void FillArc(final Graphics g, int x, int y, int width, int height, int startAngle, final int arcAngle, final boolean allowRotation) {
        x = ASprite._graphicsHeight - y - height;
        y = x;
        width = height;
        height = width;
        startAngle -= 90;
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
    
    static final void DrawArc(final Graphics g, int x, int y, int width, int height, int startAngle, final int arcAngle, final boolean allowRotation) {
        x = ASprite._graphicsHeight - y - height;
        y = x;
        width = height;
        height = width;
        startAngle -= 90;
        g.drawArc(x, y, width, height, startAngle, arcAngle);
    }
    
    static final void DrawString(final String str, final int x, final int y, int anchor) {
		if (str == null) {
            Assert(false, "DrawString.str is null");
        }
        if ((anchor & 0x32) == 0x0) {
            Assert(false, "DrawString.anchor miss vertical positionning");
        }
        if ((anchor & 0xD) == 0x0) {
            Assert(false, "DrawString.anchor miss horizontal positionning");
        }
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
    
    static final void DrawImage(final Graphics g, ImageG img, final int x, final int y, int anchor, final boolean allowRotation) {
		if (img == null) {
            Assert(false, "DrawImage.data is null");
        }
        if ((anchor & 0x32) == 0x0) {
            Assert(false, "DrawImage.anchor miss vertical positionning");
        }
        if ((anchor & 0xD) == 0x0) {
            Assert(false, "DrawImage.anchor miss horizontal positionning");
        }
        try {
            if (allowRotation) {
                anchor = img.image.getWidth();
                DrawRegion(g, img, 0, 0, anchor, img.image.getHeight(), 0, x, y, 20, true);
                return;
            }
            g.drawImage(img.image, x, y, 20);
        }
        catch (final Exception ex) {}
    }
    
    static final void DrawRegion(final Graphics g, final ImageG src, final int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor, final boolean allowRotation) {
		if (src == null) {
            Assert(false, "DrawRegion.src is null");
        }
        if ((anchor & 0x32) == 0x0) {
            Assert(false, "DrawRegion.anchor miss vertical positionning");
        }
        if ((anchor & 0xD) == 0x0) {
            Assert(false, "DrawRegion.anchor miss horizontal positionning");
        }
        if (transform < 0) {
            Assert(false, "DrawRegion.transform is invalid");
        }
        if (transform > 7) {
            Assert(false, "DrawRegion.transform is invalid");
        }
        if (x_src < 0) {
            Assert(false, "DrawRegion.x_src is negative");
        }
        if (y_src < 0) {
            Assert(false, "DrawRegion.y_src is negative");
        }
        if (allowRotation) {
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
            x_dest = ASprite._graphicsHeight - y_dest;
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
            g.drawRegion(src.image, 0, 0, width, height, transform, x_dest, y_dest, anchor);
        }
		catch (final IllegalArgumentException iae) {
            Assert(false, "DrawRegion.src cannot be the current graphic context");
        }
        catch (final Exception ex) {}
    }
    
    static final void FillTriangle(final Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, final boolean allowRotation) {
        x1 = ASprite._graphicsHeight - y1 - 1;
        y1 = x1;
        x2 = ASprite._graphicsHeight - y2 - 1;
        y2 = x2;
        x3 = ASprite._graphicsHeight - y3 - 1;
        y3 = x3;
        g.fillTriangle(x1, y1, x2, y2, x3, y3);
        DrawLine(g, x1, y1, x2, y2, true);
        x2 = y3;
        y1 = x3;
        DrawLine(g, x1, y1, y1, y3, true);
        DrawLine(g, y1, x2, x2, y2, true);
    }
    
    static final void DrawRGB(final Graphics g, int[] rgbData, final int offset, int scanlength, int x, int y, int width, int height, final boolean processAlpha, final boolean processComplexAlpha, int flags, int _palTranspIndex, final boolean allowRotatedModules) {
		if (rgbData == null) {
            Assert(false, "DrawRGB.rgbData is null");
        }
        if (offset < 0) {
            Assert(false, "DrawRGB. invalid parameter: offset < 0");
        }
        if (width < 0) {
            Assert(false, "DrawRGB. invalid parameter: width < 0");
        }
        if (height < 0) {
            Assert(false, "DrawRGB. invalid parameter: height < 0");
        }
        if (scanlength < 0) {
            Assert(false, "DrawRGB. invalid parameter: scanlength < 0");
        }
        if (offset + width + (height - 1) * scanlength > rgbData.length) {
            Assert(false, "DrawRGB. invalid parameter(s) out of array bounds");
		}
        if (allowRotatedModules) {
            int n9 = height;
            if ((flags & 0x4) != 0x0) {
                n9 = width;
                if (((flags &= 0xFFFFFFFB) & 0x2) != 0x0) {
                    flags &= 0xFFFFFFFD;
                }
                else {
                    flags |= 0x2;
                }
                if ((flags & 0x1) != 0x0) {
                    flags &= 0xFFFFFFFE;
                }
                else {
                    flags |= 0x1;
                }
            }
            else {
                flags |= 0x4;
            }
            _palTranspIndex = x;
            x = ASprite._graphicsHeight - y - n9;
            y = _palTranspIndex;
        }
        if (flags != 0) {
            int n10 = 0;
            if ((flags & 0x4) != 0x0) {
                n10 = width;
                width = height;
                height = scanlength;
                scanlength = width;
            }
            _palTranspIndex = width;
            rgbData = ASprite.TransformRGB(rgbData, width, height, flags, null);
            if ((flags & 0x4) != 0x0) {
                height = n10;
            }
        }
        g.drawRGB(rgbData, 0, scanlength, x, y, width, height, processAlpha);
    }
    
    static final void GetRGB(final ImageG img, final int[] rgbData, final int offset, final int scanlength, final int x, final int y, final int w, final int h) {
        img.getRGB(rgbData, 0, scanlength, 0, 0, w, h);
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
    
    private static Object Mem_ReadArray(final InputStream is) {
		if (is == null) {
            Assert(false, "Mem_ReadArray.is is null");
        }
        Object o = null;
        try {
            final int ID;
            final int dataPadding = (ID = Stream_Read(is)) >> 4;
            final int type = ID & 0x7;
            int nbComponent;
            if ((ID & 0x8) != 0x0) {
                nbComponent = Stream_Read16(is);
            }
            else {
                nbComponent = Stream_Read(is);
            }
            switch (type) {
                case 0: {
                    final byte[] array = new byte[nbComponent];
                    for (int i = 0; i < nbComponent; ++i) {
                        array[i] = (byte)Stream_Read(is);
                    }
                    o = array;
                    break;
                }
                case 1: {
                    final short[] array2 = new short[nbComponent];
                    if (dataPadding == 0) {
                        for (int j = 0; j < nbComponent; ++j) {
                            array2[j] = (byte)Stream_Read(is);
                        }
                    }
                    else {
                        for (int k = 0; k < nbComponent; ++k) {
                            array2[k] = (short)Stream_Read16(is);
                        }
                    }
                    o = array2;
                    break;
                }
                case 2: {
                    final int[] array3 = new int[nbComponent];
                    if (dataPadding == 0) {
                        for (int l = 0; l < nbComponent; ++l) {
                            array3[l] = (byte)Stream_Read(is);
                        }
                    }
                    else if (dataPadding == 1) {
                        for (int n4 = 0; n4 < nbComponent; ++n4) {
                            array3[n4] = (short)Stream_Read16(is);
                        }
                    }
                    else {
                        for (int n5 = 0; n5 < nbComponent; ++n5) {
                            array3[n5] = Stream_Read32(is);
                        }
                    }
                    o = array3;
                    break;
                }
                default: {
                    Object[] array4 = null;
                    switch (type & 0x3) {
                        case 0: {
                            if (dataPadding == 2) {
                                array4 = new byte[nbComponent][];
                                break;
                            }
                            array4 = new byte[nbComponent][][];
                            break;
                        }
                        case 1: {
                            if (dataPadding == 2) {
                                array4 = new short[nbComponent][];
                                break;
                            }
                            array4 = new short[nbComponent][][];
                            break;
                        }
                        default: {
                            if (dataPadding == 2) {
                                array4 = new int[nbComponent][];
                                break;
                            }
                            array4 = new int[nbComponent][][];
                            break;
                        }
                    }
                    for (int n6 = 0; n6 < nbComponent; ++n6) {
                        array4[n6] = Mem_ReadArray(is);
                    }
                    o = array4;
                    break;
                }
            }
        }
        catch (final Exception e) {
            Assert(false, "Mem_ReadArray.IO error");
        }
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
    
    private static int Stream_ReadFully(final InputStream is, final byte[] array, int offset, final int length) {
		if (array == null) {
            Assert(false, "Stream_ReadFully.array is null");
        }
        if (offset < 0) {
            Assert(false, "Stream_ReadFully.offset is negative");
        }
        if (length < 0) {
            Assert(false, "Stream_ReadFully.length is negative");
        }
        if (offset + length > array.length) {
            Assert(false, "Stream_ReadFully.offset+length is bigger than array size");
        }
        offset = 0;
        int len = length;
        try {
            while (len > 0) {
                final int read = is.read(array, offset, len);
				if (read < 0) {
                    Assert(false, "Pack_ReadFully.EOF");
                }
                len -= read;
                offset += read;
            }
        }
        catch (final Exception e) {
            Assert(false, "Stream_ReadFully.IO exception occured");
        }
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
            sb.append(GLLib.hexDigit[bytes[i] >> 4 & 0xF]);
            sb.append(GLLib.hexDigit[bytes[i] & 0xF]);
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
    
	static byte[] XXTEA_Encrypt(byte[] data, final String key, final boolean includeLength) {
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
            GLLib.text_multiple_arrayOffsets[tabID] = new int[GLLib.text_multiple_nbStrings[tabID] + 1];
            for (int i = 1; i < GLLib.text_multiple_nbStrings[tabID] + 1; ++i) {
                GLLib.text_multiple_arrayOffsets[tabID][i] = Stream_Read32(is);
            }
            Stream_ReadFully(is, GLLib.s_text_localeGroups[tabID] = new byte[GLLib.text_multiple_arrayOffsets[tabID][GLLib.text_multiple_nbStrings[tabID]]], 0, GLLib.s_text_localeGroups[tabID].length);
        }
        catch (final Exception ex) {}
        return tabID;
    }
    
    static void Text_LoadTextFromPack(String filename, final int index) {
        Text_FreeIndex(index);
        Pack_Open(filename);
        Pack_PositionAtData(index);
        if (GLLib.text_multiple_array_map == null) {
            GLLib.text_multiple_array_map = new int[32];
            for (int i = 0; i < 32; ++i) {
                GLLib.text_multiple_array_map[i] = -1;
            }
            GLLib.s_text_localeGroups = new byte[32][];
            GLLib.text_multiple_arrayOffsets = new int[32][];
            GLLib.text_multiple_nbStrings = new int[32];
            GLLib.text_multiple_stringCacheArrays = new String[32][];
        }
        GLLib.text_multiple_array_map[index] = Text_LoadTextFromStream(GLLib.s_pack_is);
        Pack_Close(true);
        final int idx = GLLib.text_multiple_array_map[index];
        if (GLLib.text_multiple_nbStrings[idx] != 0) {
            final String[] array = new String[GLLib.text_multiple_nbStrings[idx]];
            for (int j = 0; j < GLLib.text_multiple_nbStrings[idx]; ++j) {
                array[j] = Text_GetString(j + (idx << 10));
            }
            GLLib.text_multiple_stringCacheArrays[idx] = array;
            GLLib.text_multiple_arrayOffsets[idx] = null;
            GLLib.s_text_localeGroups[idx] = null;
            System.gc();
        }
    }
    
	static String Text_GetString(int index) {
		if (GLLib.text_encoding == null) {
            Assert(false, "Text_GetString.current text encoding is not set, use Text_SetEncoding()");
        }
        final int arrayID = index >> 10;
        index &= 0x3FF;
        if (GLLib.text_multiple_stringCacheArrays != null && GLLib.text_multiple_stringCacheArrays[arrayID] != null) {
            return GLLib.text_multiple_stringCacheArrays[arrayID][index];
        }
        try {
            final int length = GLLib.text_multiple_arrayOffsets[arrayID][index + 1];
            if (length - GLLib.text_multiple_arrayOffsets[arrayID][index] == 0) {
                return null;
            }
            return new String(GLLib.s_text_localeGroups[arrayID], GLLib.text_multiple_arrayOffsets[arrayID][index], length, GLLib.text_encoding);
        }
        catch (final Exception ex) {
            Assert(false, "Text_GetString.unable to create string, might try another encoding." + ex);
            return null;
        }
    }
    
    static void Text_FreeAll() {
        for (int i = 0; i < 32; ++i) {
            Text_FreeIndex(i);
        }
    }
    
    private static void Text_FreeIndex(final int index) {
        if (GLLib.text_multiple_array_map != null) {
            final int n2;
            if ((n2 = GLLib.text_multiple_array_map[index]) == -1) {
                return;
            }
            if (GLLib.text_multiple_stringCacheArrays[n2] != null) {
                for (int i = 0; i < GLLib.text_multiple_nbStrings[n2]; ++i) {
                    GLLib.text_multiple_stringCacheArrays[n2][i] = null;
                }
                GLLib.text_multiple_stringCacheArrays[n2] = null;
            }
            GLLib.text_multiple_arrayOffsets[n2] = null;
            GLLib.s_text_localeGroups[n2] = null;
            GLLib.text_multiple_nbStrings[n2] = 0;
            GLLib.text_multiple_array_map[index] = -1;
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
    
    static String StringFormat(final String pattern, final String[] args) {
        String r = "";
        if (pattern.indexOf(37) < 0) {
            return pattern;
        }
        int n = 0;
        int i = 0;
        do {
            if ((i = pattern.indexOf(37, i)) < 0 || i == pattern.length() - 1) {
                r += pattern.substring(n);
                i = -1;
            }
            else if (pattern.charAt(i + 1) == 's') {
                int n2 = -1;
                if (i + 2 < pattern.length()) {
                    n2 = pattern.charAt(i + 2) - '0';
                }
                if (n2 >= 0 && n2 <= 9) {
                    r = r + pattern.substring(n, i) + args[n2];
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
    
    static String Text_FindReplace(String text, final String keyword, final String newKeyword) {
        for (int i = text.indexOf(keyword); i != -1; i = text.indexOf(keyword, i + newKeyword.length())) {
            text = text.substring(0, i) + newKeyword + text.substring(i + keyword.length());
        }
        return text;
    }
    
    private static void Rms_Close() {
        if (GLLib.s_rs == null) {
            return;
        }
        try {
            GLLib.s_rs.closeRecordStore();
        }
        catch (final RecordStoreException e) {
            Dbg("ERROR! Failed closing RMS: " + e);
        }
        GLLib.s_rs = null;
    }
    
    private static void Rms_Open(final String strName) throws RecordStoreFullException, RecordStoreNotFoundException, RecordStoreException {
		Dbg(" Open recordstore : " + strName);
        GLLib.s_rs = RecordStore.openRecordStore(strName, true);
    }
    
    static byte[] Rms_Read(String strName) {
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
         catch (final RecordStoreException e) {
            Dbg("ERROR! Failed reading from RMS: " + e);
            data = null;
        }
        Rms_Close();
        return data;
    }
    
    static void Rms_Write(String strName, byte[] data) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreFullException, RecordStoreException {
        final String string = "";
        byte[] bytes = null;
        if ("".equals(string) == false) {
            bytes = string.getBytes();
        }
        Rms_Write_Single(strName, data, 0, data.length, bytes);
    }
    
    static void Rms_Write_Single(final String strName, byte[] data, final int offset, final int size, final byte[] unk) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreFullException, RecordStoreException {
        try {
            Rms_Open(strName);
            if (GLLib.s_rs.getNumRecords() > 0) {
                GLLib.s_rs.setRecord(1, data, 0, data.length);
            }
            else {
                GLLib.s_rs.addRecord(data, 0, data.length);
            }
        }
        catch (final RecordStoreException e) {
            Dbg("ERROR! Failed writing into RMS: " + e);
        }
        Rms_Close();
    }
    
    static void AlphaRect_SetColor(int p_iColor) {
        if (s_alphaRectARGBData == null) {
           s_alphaRectARGBData = new int[1];
           s_alphaRectARGBDatas = new int[1][];
        }

        int var2 = 0;

        int var10000;
        while (true) {
           if (var2 >= s_alphaRectARGBData.length) {
              var10000 = -1;
              break;
           }

           if (s_alphaRectARGBData[var2] == p_iColor) {
              var10000 = var2;
              break;
           }

           var2++;
        }

        if (var10000 == -1 || s_alphaRectARGBDatas == null) {
           s_alphaRectCurrentARGB++;
           var10000 = 0;
           s_alphaRectARGBData[0] = p_iColor;
           if (s_alphaRectARGBDatas[0] == null) {
              s_alphaRectARGBDatas[0] = new int[256];
           }

           var2 = 256;

           while (var2 > 0) {
              s_alphaRectARGBDatas[0][--var2] = p_iColor;
           }
        }

        s_alphaRectCurrentARGB = var10000;
     }
    
    static void AlphaRect_Draw(final Graphics g, int x, int y, int w, int h) {
        final int cx = GetClipX(g, true);
        final int cy = GetClipY(g, true);
        final int cw = GetClipWidth(g, true);
        final int ch = GetClipHeight(g, true);
        final int nx = (x > cx) ? x : cx;
        final int ny = (y > cy) ? y : cy;
        w = ((x + w < cx + cw) ? (x + w) : (cx + cw)) - nx;
        h = ((y + h < cy + ch) ? (y + h) : (cy + ch)) - ny;
        if (w <= 0 || h <= 0) {
            return;
        }
        x = (y > cy) ? y : cy;
        y = nx;
        SetClip(g, nx, x, w, h, true);
        if (h * w < 256) {
            DrawRGB(g, GLLib.s_alphaRectARGBDatas[GLLib.s_alphaRectCurrentARGB], 0, w, ASprite._graphicsHeight - ny - h, x, w, h, true, true, 0, -1, false);
        }
        else {
            w += ASprite._graphicsHeight - ny - h;
            h += x;
            for (x = ASprite._graphicsHeight - ny - h; x < w; x += 16) {
                for (y = x; y < h; y += 16) {
                    DrawRGB(g, GLLib.s_alphaRectARGBDatas[GLLib.s_alphaRectCurrentARGB], 0, 16, x, y, 16, 16, true, true, 0, -1, false);
                }
            }
        }
        SetClip(g, cx, cy, cw, ch, true);
    }
    
    public static int[] PFX_GetParams(final int paramId) {
        return GLLib.s_PFX_params[paramId];
    }
    
    public static int PFX_GetFirstEnabledEffect() {
        final int n;
        if ((n = (GLLib.s_PFX_type & 0xFF7E0)) != 0) {
            for (int i = 0; i < 20; ++i) {
                if ((n & 1 << i) != 0x0) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    private static final void DrawRGB(final Graphics g, final int[] rgbData, final int scanlength, final int x, final int y, final int width, final int height, final boolean processAlpha) {
        DrawRGB(g, rgbData, 0, scanlength, x, y, width, height, processAlpha, true, 0, -1, false);
    }
    
    static final void PFX_Init() {
        GLLib.s_PFX_type = 0;
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
        GLLib.s_PFX_type |= 0x2000;
    }
    
    static final void PFX_DisableScaleEffect() {
        GLLib.s_PFX_type &= 0xFFFFDFFF;
    }
    
    static final int PFX_Scale_GetScaleX() {
        final int mainScale;
        if ((mainScale = GLLib.s_PFX_params[13][1]) != 100) {
            return mainScale;
        }
        return GLLib.s_PFX_params[13][3];
    }
    
    static final int PFX_Scale_GetScaleY() {
        final int mainScale;
        if ((mainScale = GLLib.s_PFX_params[13][1]) != 100) {
            return mainScale;
        }
        return GLLib.s_PFX_params[13][4];
    }
    
    static final void PFX_Scale_SetScale(final int scale) {
        GLLib.s_PFX_params[13][1] = scale;
        GLLib.s_PFX_params[13][3] = scale;
        GLLib.s_PFX_params[13][4] = scale;
    }
    
    static final void PFX_Scale_SetUnkScaleProp5(final boolean value) {
        GLLib.s_PFX_params[13][5] = (value ? 1 : 0);
    }
    
    static final void PFX_Rotate_UnkFunc5cbc(final int n, final int n2, final int n3, final int n4, final int[] array) {
        array[0] = n3 * n2 - n4 * n + 128 >> 8;
        array[1] = n4 * n2 + n3 * n + 128 >> 8;
    }
    
    static final void PFX_Rotate_GetRotatedRectSize(int n, int abs, int abs2, int a, final int[] array) {
        PFX_Rotate_UnkFunc5cbc(n, abs, 0, a, ASprite.s_rc);
        final int n2 = ASprite.s_rc[0];
        final int n3 = ASprite.s_rc[1];
        PFX_Rotate_UnkFunc5cbc(n, abs, abs2, a, ASprite.s_rc);
        a = ASprite.s_rc[0];
        final int a2 = ASprite.s_rc[1];
        PFX_Rotate_UnkFunc5cbc(n, abs, abs2, 0, ASprite.s_rc);
        n = ASprite.s_rc[0];
        abs = ASprite.s_rc[1];
        array[0] = Math.max(Math.abs(a), abs2 = Math.abs(n - n2));
        array[1] = Math.max(Math.abs(a2), abs = Math.abs(abs - n3));
    }
    
    static final int[] PFX_ProcessSpriteEffects(final Graphics g, int[] src, int x, int y, int w, int h, int flags, boolean hasAlpha, final boolean multiAlpha, final boolean b2) {
        GLLib.s_PFX_hasAlpha = hasAlpha;
        GLLib.s_PFX_sizeX = w;
        GLLib.s_PFX_sizeY = h;
        GLLib.s_PFX_newPosX = x;
        GLLib.s_PFX_newPosY = y;
        if ((GLLib.s_PFX_type & 0x5600) != 0x0) {
            if ((flags & 0x4) != 0x0) {
                GLLib.s_PFX_sizeX = h;
                GLLib.s_PFX_sizeY = w;
                w = GLLib.s_PFX_sizeX;
                h = GLLib.s_PFX_sizeY;
            }
            src = ASprite.TransformRGB(src, w, h, flags, null);
        }
        GLLib.s_PFX_newSizeX = w;
        GLLib.s_PFX_newSizeY = h;
        int[] array = ASprite.GetPixelBuffer(src);
        if ((GLLib.s_PFX_type & 0x2000) == 0x0) {
            return null;
        }
        final int n3;
        final boolean b3 = (n3 = GLLib.s_PFX_params[13][0]) != 1 && (n3 == 2 || multiAlpha);
        int n4;
        if ((n4 = GLLib.s_PFX_params[13][6]) % GLLib.Math_Angle360 != 0) {
            hasAlpha = true;
            w = h;
            final int var_2018 = y;
            final int var_200f2 = x;
            int[] sub_9f61 = array;
            if ((flags & 0x4) != 0x0) {
                flags = (flags & 0xFFFFFFFB);
                n4 += 90 * GLLib.Math_AngleMUL / 360;
            }
            if (flags != 0) {
            	array = ASprite.GetPixelBuffer(src = ASprite.TransformRGB(src, w, w, flags, null));
            }
            final int sub_2be7 = Math_Cos(GLLib.Math_Angle90 - n4);
            final int sub_2be8 = Math_Cos(n4);
            PFX_Rotate_GetRotatedRectSize(sub_2be7, sub_2be8, w, w, ASprite.s_rc);
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
                        sub_9f61[n27] = src[n29 * w + n28];
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
            array = ASprite.GetPixelBuffer(src = sub_9f61);
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
        int[] sub_9c13 = src;
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
                        DrawRGB(g, sub_9f62, var_201f2, n42, n59, var_201f2, n57, b7);
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
                            DrawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
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
                            DrawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
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
                            DrawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51, true);
                        }
                        n53 += n51;
                        n52 = n51;
                        n43 = 0;
                    }
                }
            }
            if (b2 && n52 != n51) {
                DrawRGB(g, sub_9f62, var_201f2, n42, n53, var_201f2, n51 - n52, true);
            }
        }
        if (b2) {
            return null;
        }
        return sub_9f62;
    }
    
    static void DrawGradientRect(final Graphics g, final int x, final int y, int w, int h, int c1, int c2, int direction) {
        final int n7 = c1 >> 16 & 0xFF;
        final int n8 = c1 >> 8 & 0xFF;
        c1 &= 0xFF;
        final int n9 = c2 >> 16 & 0xFF;
        final int n10 = c2 >> 8 & 0xFF;
        c2 &= 0xFF;
        final int n11 = n9 - n7;
        final int n12 = n10 - n8;
        c2 -= c1;
        w = x + w - 1;
        h = y + h - 1;
        int red = n7 << 16;
        int green = n8 << 16;
        c1 <<= 16;
        if (direction == 4) {
            direction = w - x;
            final int n15 = (n11 << 16) / direction;
            final int n16 = (n12 << 16) / direction;
            c2 = (c2 << 16) / direction;
            for (direction = w; direction >= x; --direction) {
                SetColor(g, red >> 16, green >> 16, c1 >> 16);
                DrawLine(g, direction, y, direction, h, true);
                red += n15;
                green += n16;
                c1 += c2;
            }
            return;
        }
        if (direction == 8) {
            direction = w - x;
            final int n17 = (n11 << 16) / direction;
            final int n18 = (n12 << 16) / direction;
            c2 = (c2 << 16) / direction;
            for (direction = x; direction <= w; ++direction) {
                SetColor(g, red >> 16, green >> 16, c1 >> 16);
                DrawLine(g, direction, y, direction, h, true);
                red += n17;
                green += n18;
                c1 += c2;
            }
            return;
        }
        if (direction == 16) {
            direction = h - y;
            c2 = (c2 << 16) / direction;
            for (direction = h; direction >= y; --direction) {
                SetColor(g, red >> 16, green >> 16, c1 >> 16);
                DrawLine(g, x, direction, w, direction, true);
                red += (n11 << 16) / direction;
                green += (n12 << 16) / direction;
                c1 += c2;
            }
            return;
        }
        if (direction == 32) {
            direction = h - y;
            c2 = (c2 << 16) / direction;
            for (direction = y; direction <= h; ++direction) {
                SetColor(g, red >> 16, green >> 16, c1 >> 16);
                DrawLine(g, x, direction, w, direction, true);
                red += (n11 << 16) / direction;
                green += (n12 << 16) / direction;
                c1 += c2;
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
    
    public static final void Pointer_Init() {
        GLLib.s_pointerState = 0;
    }
    
    private static final void Pointer_AdjustToRotatedCoordinates() {
        final int temp = GLLib.s_pointerY;
        GLLib.s_pointerY = GLLib.s_screenHeight - GLLib.s_pointerX;
        GLLib.s_pointerX = temp;
    }
    
    protected void pointerReleased(int x, final int y) {
    	GLLib.s_pointerX = x;
        x = GLLib.s_pointerX;
        GLLib.s_pointerY = y;
        Pointer_AdjustToRotatedCoordinates();
        GLLib.s_isPointerReleasedSystem = true;
    }
    
    protected void pointerPressed(int x, final int y) {
    	GLLib.s_pointerX = x;
    	x = GLLib.s_pointerX;
        GLLib.s_pointerY = y;
        Pointer_AdjustToRotatedCoordinates();
        GLLib.s_isPointerPressedSystem = true;
    }
    
    protected void pointerDragged(int x, final int y) {
    	GLLib.s_pointerX = x;
    	x = GLLib.s_pointerX;
        GLLib.s_pointerY = y;
        Pointer_AdjustToRotatedCoordinates();
        GLLib.s_isPointerDraggedSystem = true;
    }
    
    static final boolean Pointer_IsReleased() {
        return GLLib.s_pointerState == 2;
    }
    
    static final boolean Pointer_IsPressed() {
        return GLLib.s_pointerState == 1;
    }
    
    static final boolean Pointer_IsDragged() {
        return GLLib.s_pointerState == 3;
    }
    
    static final boolean Pointer_IsDown() {
        return GLLib.s_pointerState == 4;
    }
    
    static final boolean Pointer_IsHeldDown() {
        return GLLib.s_pointerState == 4 || GLLib.s_pointerState == 1 || GLLib.s_pointerState == 3;
    }
    
    static boolean PaySMS_ParseJADFields() {
        return PaySMS.parseJadFields();
    }
    
    static void PaySMS_Init(final String language) {
        PaySMS.Init(language);
    }
    
    static void PaySMS_SendRequest(final int itemIndex, final String itemType) {
        if (System.currentTimeMillis() - GLLib.s_iapRequestTime <= 3000L) {
            return;
        }
        GLLib.s_iapRequestTime = System.currentTimeMillis();
        PaySMS.sendRequest(PaySMS.getPricePoint(itemIndex, itemType), itemType);
    }
    
    static void PaySMS_SendRedeemRequest() {
        if (System.currentTimeMillis() - GLLib.s_iapRequestTime <= 3000L) {
            return;
        }
        GLLib.s_iapRequestTime = System.currentTimeMillis();
        PaySMS.sendRedeemRequest();
    }
    
    static int PaySMS_Update() {
        return PaySMS.update();
    }
    
    static boolean PaySMS_VerifyRequest(final int inputCode) {
        return PaySMS.verifyRequest(inputCode);
    }
    
    static boolean PaySMS_CanRedeemCode() {
        return PaySMS.canRedeemCode();
    }
    
    static int PaySMS_GetPackageID() {
        return PaySMS.getPackageId();
    }
    
    static int PaySMS_GetErrorCode() {
        return PaySMS.getErrorCode();
    }
    
    static String PaySMS_GetItemPrice(final int itemIndex, final String itemType) {
        return PaySMS.getItemPrice(PaySMS.getPricePoint(itemIndex, itemType));
    }
    
    static String PaySMS_GetTermsAndConditions() {
        return PaySMS.GetTermsAndConditions();
    }
    
    static String PaySMS_GetFullSupportUrl() {
        return PaySMS.getFullSupportUrl();
    }
    
    static void PaySMS_Reset() {
        PaySMS.reset();
    }
    
    static long PaySMS_GetVirtualCurrency(final long basecurrency, int itemIndex, final String itemType) {
        itemIndex = PaySMS.getPricePoint(itemIndex, itemType);
        return PaySMS.getVirtualCurrency(basecurrency, itemIndex);
    }
    
    static int PaySMS_GetSpecialFlow() {
        return PaySMS.GetSpecialFlow();
    }
    
    static int PaySMS_FindPrice(final int itemIndex, final String itemType) {
        return PaySMS.findPrice(PaySMS.getPricePoint(itemIndex, itemType));
    }
    
    static int PaySMS_GetCurrencyAmount(final String currency) {
        return PaySMS.getCurrencyAmount(currency);
    }
    
    static int PaySMS_GetPricePoint(final int itemIndex, final String itemType) {
        return PaySMS.getPricePoint(itemIndex, itemType);
    }
    
    static long PaySMS_GetVirtualCurrency(final long basecurrency) {
        return PaySMS_GetVirtualCurrency(basecurrency, PaySMS.getPackageId(), PaySMS.getItemTypeRms());
    }
    
    static {
        GLLib.g = null;
        GLLib.s_lastPaintGraphics = null;
        GLLib.s_screenWidth = GLLibConfig.screenWidth;
        GLLib.s_screenHeight = GLLibConfig.screenHeight;
        GLLib.m_FPSLimiter = 50;
        GLLib.m_customSleepTime = -1;
        GLLib.s_bPlatformRequestPending = false;
        GLLib.s_urlPlatformRequest = null;
        GLLib.s_nbKey = 25;
        s_math_F_1 = 256;
        s_math_F_05 = 128;
        Math_AngleMUL = 256;
        Math_Angle90 = 90 * GLLib.Math_AngleMUL / 360;
        GLLib.Math_Angle180 = 180 * GLLib.Math_AngleMUL / 360;
        GLLib.Math_Angle270 = 270 * GLLib.Math_AngleMUL / 360;
        GLLib.Math_Angle360 = 360 * GLLib.Math_AngleMUL / 360;
        GLLib.Stream_readOffset = 0;
        GLLib.hexDigit = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        GLLib.text_encoding = "UTF-8";
        pfx_useSpriteEffects = true;
        GLLib.s_PFX_type = 0;
        GLLib.s_PFX_params = null;
        GLLib.s_iapRequestTime = 0L;
    }
	
	// These debug methods are patched from the originals to use the Define.GLLIB_DEBUG_MODE boolean in order to allow printing
	static void Dbg(final String log) {
		if (Define.GLLIB_DEBUG_MODE)
			System.out.println(log);
    }
    
    static void Assert(final boolean test, final String errMessage) {
        if (!test && Define.GLLIB_DEBUG_MODE) {
            Dbg("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Dbg("ERROR . " + errMessage);
            Dbg("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            new Throwable().printStackTrace();
        }
    }
    
    static void Warning(final String message) {
		if (Define.GLLIB_DEBUG_MODE) {
			Dbg("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			Dbg("WARNING . " + message);
			Dbg("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
    }
}
