import javax.microedition.media.Controllable;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.MIDIControl;
import javax.microedition.media.control.VolumeControl;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Player;

// 
// Decompiled by Procyon v0.6.0
// 

final class GLLibPlayer implements Runnable
{
    private int posX;
    private int posY;
    int curFlags;
    ASprite sprite;
    private int curAnim;
    private int var_1597;
    private int var_159f;
    private int var_15a7;
    private int nbLoop;
    private boolean animIsOver;
    private int var_15bf;
    private static int var_15c7;
    private int var_15cf;
    private static final int k_snd_nbChannel;
    static int s_snd_masterVolume;
    private static int var_15e7;
    private static boolean s_snd_isSoundEngineInitialized;
    private static byte[][] s_snd_sndSlot;
    private static int[] s_snd_sndType;
    private static Player[] s_snd_Player;
    private static int[] s_snd_index;
    private static int[] s_snd_priority;
    private static int[] s_snd_state;
    private static int[] s_snd_volume;
    private static int[] s_snd_loop;
    private static Thread s_pThread;
    private static GLLibPlayer s_pSoundPlayerIns;
    private static int[] s_snd_queue;
    private static int[] s_snd_queue_pointer;
    private static int[] s_snd_queue_size;
    private static boolean var_165f;
    private static int[] var_1667;
    private static int[] var_166f;
    private static int[] var_1677;
    private static int[] var_167f;
    private static int[] var_1687;
    private static boolean[] var_168f;
    private static int[] var_1697;
    private static int var_169f;
    private static boolean s_bTilesetPlayerInitialized;
    private static int s_TilesetMaxLayerCount;
    private static final int var_16b7;
    private static final int var_16bf;
    private static int[] var_16c7;
    private static int[][] s_TilesetLayerInfo;
    private static byte[][][] s_TilesetLayerData;
    private static GLLibImage[][] s_TilesetLayerImage;
    static Graphics[][] s_TilesetLayerGraphics;
    private static int[][][] var_16ef;
    private static int var_16f7;
    private static ASprite[] s_TilesetSprite;
    private static int var_1707;
    
    GLLibPlayer() {
        this.Reset();
    }
    
    GLLibPlayer(final ASprite sprite, final int x, final int y) {
        this.Reset();
        this.posX = x;
        this.posY = y;
        this.SetSprite(sprite);
    }
    
    final void Reset() {
        this.posX = 0;
        this.posY = 0;
        this.curAnim = -1;
        this.var_1597 = 0;
        this.sprite = null;
        this.curFlags = 0;
        this.var_159f = 0;
        this.nbLoop = 1;
        this.var_15cf = -1;
        this.animIsOver = true;
        this.var_15bf = -1;
    }
    
    final void SetPos(final int x, final int y) {
        this.posX = x;
        this.posY = y;
    }
    
    final ASprite GetSprite() {
        return this.sprite;
    }
    
    final void SetSprite(final ASprite sprite) {
        this.sprite = sprite;
        if (sprite != null) {
            this.SetAnim(-1, -1);
            return;
        }
        this.curAnim = -1;
    }
    
    final void SetAnim2(final int anim, final int nbLoop, final boolean b) {
        if (b) {
            this.SetAnim(-1, 1);
        }
        this.SetAnim(anim, nbLoop);
    }
    
    final void SetAnim(int anim, final int nbLoop) {
        if (this.animIsOver || anim != this.curAnim) {
            this.curAnim = anim;
            this.var_15a7 = GLLibPlayer.var_15c7;
            if (this.curAnim >= 0) {
                this.var_1597 = 0 % this.GetNbFrame();
                this.var_159f = 0;
            }
            this.nbLoop = nbLoop - 1;
            this.animIsOver = false;
        }
    }
    
    final int GetAnim() {
        return this.curAnim;
    }
    
    final void sub_1941() {
        this.var_1597 = GLLib.Math_Rand(0, this.GetNbFrame());
        this.var_159f = 0;
    }
    
    final int sub_196d() {
        return this.var_1597;
    }
    
    final void SetTransform(final int transform) {
        switch (transform) {
            case 0: {
                this.curFlags = 0;
                return;
            }
            case 2: {
                this.curFlags = 1;
                return;
            }
            case 1: {
                this.curFlags = 2;
                return;
            }
            case 3: {
                this.curFlags = 3;
                return;
            }
            case 5: {
                this.curFlags = 4;
                return;
            }
            case 6: {
                this.curFlags = 7;
                return;
            }
            case 7: {
                this.curFlags = 6;
                return;
            }
            case 4: {
                this.curFlags = 5;
                break;
            }
        }
    }
    
    final void sub_1a6a(final int var_15cf) {
        this.var_15cf = var_15cf;
    }
    
    final int sub_1a8a() {
        return this.nbLoop;
    }
    
    private int GetNbFrame() {
        if (this.curAnim >= 0) {
            return this.sprite.GetAFrames(this.curAnim);
        }
        return -1;
    }
    
    private int sub_1aeb() {
        if (this.curAnim >= 0) {
            return this.sprite.sub_2fc8(this.curAnim, this.var_1597) * this.var_15a7;
        }
        return 0;
    }
    
    final boolean sub_1b34() {
        return this.curAnim < 0 || (this.nbLoop >= 0 && this.animIsOver);
    }
    
    final void sub_1b7f() {
        if (this.curAnim < 0) {
            return;
        }
        if (this.animIsOver) {
            return;
        }
        boolean b = false;
        if (this.var_15bf != -1 && this.var_15bf != 100 && (GLLib.var_1fe7 & 0x2000) == 0x0) {
            b = true;
            GLLib.sub_5b71();
            GLLib.sub_5c41(this.var_15bf);
        }
        if (this.var_15cf != -1) {
            final int sub_6475 = this.sprite.sub_6475();
            this.sprite.sub_6434(this.var_15cf);
            this.sprite.sub_700c(GLLib.g, this.curAnim, this.var_1597, this.posX, this.posY, this.curFlags);
            this.sprite.sub_6434(sub_6475);
        }
        else {
            this.sprite.sub_700c(GLLib.g, this.curAnim, this.var_1597, this.posX, this.posY, this.curFlags);
        }
        if (b) {
            GLLib.var_1fe7 &= 0xFFF0081F;
        }
    }
    
    final void sub_1ca1(final int n) {
        if (this.animIsOver || this.curAnim < 0) {
            return;
        }
        int n2;
        if ((n2 = this.sub_1aeb()) == 0) {
            return;
        }
        while (this.var_159f >= n2) {
            this.var_159f -= n2;
            if (this.var_1597 < this.sprite.GetAFrames(this.curAnim) - 1) {
                ++this.var_1597;
            }
            else {
                if (this.nbLoop == 0) {
                    this.animIsOver = true;
                    break;
                }
                if (this.nbLoop > 0) {
                    --this.nbLoop;
                }
                this.var_1597 = 0;
            }
            if ((n2 = this.sub_1aeb()) == 0) {
                break;
            }
        }
        this.var_159f += n;
    }
    
    final void sub_1d9e(final int var_15bf) {
        this.var_15bf = var_15bf;
    }
    
    static final Player Snd_GetChannelPlayer(final int channel) {
        if (channel < 0) {
            new StringBuffer().append("Snd_GetChannelPlayer: Index is negative [").append(channel).append("]");
        }
        if (channel >= GLLibPlayer.k_snd_nbChannel) {
            new StringBuffer().append("Snd_GetChannelPlayer: Index [").append(channel).append("] is out of range. Max channels is ").append(GLLibPlayer.k_snd_nbChannel);
        }
        return GLLibPlayer.s_snd_Player[channel];
    }
    
    private static final int SndQueue_NormalizeIndex(int index) {
        while (index >= 7) {
            index -= 7;
        }
        while (index < 0) {
            index += 7;
        }
        return index;
    }
    
    private static synchronized void SndQueue_Push_THUNK(int channel, int command, int index, int priority, int volume, final int loop) {
        if (GLLibPlayer.s_snd_isSoundEngineInitialized) {
            final int start = GLLibPlayer.s_snd_queue_pointer[channel];
            final int size = GLLibPlayer.s_snd_queue_size[channel];
            final int end = SndQueue_NormalizeIndex(start + size);
            for (int i = 0; i < size; ++i) {
                final int idx = channel * 7 * 5 + SndQueue_NormalizeIndex(end - i - 1) * 5;
                if (GLLibPlayer.s_snd_queue[idx] == command && ((command != 3 && command != 1) || GLLibPlayer.s_snd_queue[idx + 2] >= priority)) {
                    GLLibPlayer.s_snd_queue[idx] = 0;
                }
            }
            final int idx = channel * 7 * 5 + end * 5;
            GLLibPlayer.s_snd_queue[idx] = command;
            GLLibPlayer.s_snd_queue[idx + 1] = index;
            GLLibPlayer.s_snd_queue[idx + 2] = priority;
            GLLibPlayer.s_snd_queue[idx + 3] = volume;
            GLLibPlayer.s_snd_queue[idx + 4] = loop;
            ++s_snd_queue_size[channel];
        }
    }
    
    
    private static void SndQueue_Push(int channel, int command, int index, int priority, int volume, final int loop) {
        SndQueue_Push_THUNK(channel, command, index, priority, volume, loop);
    }
    
    private static synchronized void sub_1fe4(int n, final int[] array) {
        array[5] = GLLibPlayer.s_snd_queue_size[n];
        if (GLLibPlayer.s_snd_queue_size[n] > 0) {
            System.arraycopy(GLLibPlayer.s_snd_queue, n * 7 * 5 + GLLibPlayer.s_snd_queue_pointer[n] * 5, array, 0, 5);
            GLLibPlayer.s_snd_queue_pointer[n] = SndQueue_NormalizeIndex(GLLibPlayer.s_snd_queue_pointer[n] + 1);
            final int[] var_1657 = GLLibPlayer.s_snd_queue_size;
            final int n2 = n;
            --var_1657[n2];
        }
    }
    
    static void Snd_Init(int nbSoundSlot) {
        GLLibPlayer.s_snd_Player = new Player[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_index = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_priority = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_state = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_volume = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_loop = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_queue = new int[GLLibPlayer.k_snd_nbChannel * 7 * 5];
        GLLibPlayer.s_snd_queue_pointer = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_queue_size = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.var_1667 = new int[6];
        GLLibPlayer.var_166f = new int[GLLibPlayer.k_snd_nbChannel * 3];
        GLLibPlayer.var_1677 = new int[GLLibPlayer.k_snd_nbChannel * 3];
        GLLibPlayer.var_167f = new int[(GLLibPlayer.k_snd_nbChannel << 4) * 9];
        GLLibPlayer.var_1687 = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.var_168f = new boolean[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.var_1697 = new int[GLLibPlayer.k_snd_nbChannel];
        int j;
        int n;
        for (nbSoundSlot = 0; nbSoundSlot < GLLibPlayer.k_snd_nbChannel; ++nbSoundSlot) {
            GLLibPlayer.var_1687[nbSoundSlot] = 0;
            GLLibPlayer.var_166f[nbSoundSlot * 3] = 0;
            GLLibPlayer.var_1677[nbSoundSlot * 3] = 0;
            GLLibPlayer.var_168f[nbSoundSlot] = false;
            for (j = 0; j < 16; ++j) {
                n = ((nbSoundSlot << 4) + j) * 9;
                GLLibPlayer.var_167f[n] = 0;
                GLLibPlayer.var_167f[n + 3] = 127;
            }
            GLLibPlayer.var_1697[nbSoundSlot] = 0;
        }
        GLLibPlayer.var_169f = 0;
        for (nbSoundSlot = 0; nbSoundSlot < GLLibPlayer.k_snd_nbChannel; ++nbSoundSlot) {
            GLLibPlayer.s_snd_index[nbSoundSlot] = -1;
            GLLibPlayer.s_snd_queue_pointer[nbSoundSlot] = 0;
            GLLibPlayer.s_snd_queue_size[nbSoundSlot] = 0;
        }
        GLLibPlayer.s_snd_sndSlot = new byte[GLLibPlayer.var_15e7 = 119][];
        GLLibPlayer.s_snd_sndType = new int[GLLibPlayer.var_15e7];
        GLLibPlayer.s_snd_masterVolume = 100;
        GLLibPlayer.s_snd_isSoundEngineInitialized = true;
        GLLibPlayer.s_pSoundPlayerIns = new GLLibPlayer();
        (GLLibPlayer.s_pThread = new Thread(GLLibPlayer.s_pSoundPlayerIns)).start();
    }
    
    static void Snd_LoadSound(final String dataFileName, int resourceIndex, final boolean bCacheThisSound) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (resourceIndex < 0) {
            return;
        }
        GLLib.Pack_Open(dataFileName);
        final byte[] pData = GLLib.Pack_ReadData(resourceIndex);
        resourceIndex = GLLib.s_pack_lastDataReadMimeType;
        if (GLLibPlayer.s_snd_isSoundEngineInitialized) {
            if (pData == null || pData.length <= 0) {
                return;
            }
            GLLibPlayer.s_snd_sndSlot[resourceIndex] = pData;
            GLLibPlayer.s_snd_sndType[resourceIndex] = resourceIndex;
        }
    }
    
    static boolean Snd_IsInSlot(final int index) {
        return GLLibPlayer.s_snd_sndSlot != null && index < GLLibPlayer.s_snd_sndSlot.length && GLLibPlayer.s_snd_sndSlot[index] != null;
    }
    
    static void Snd_UnLoadSound(final int index) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (index < 0) {
            return;
        }
        GLLibPlayer.s_snd_sndSlot[index] = null;
        System.gc();
    }
    
    static void Snd_Play(final int channel, final int index, final int loop, final int volume, final int priority) {
        if (loop < 0) {
            new StringBuffer().append("Snd_Play: Invalid loop number of ").append(loop);
        }
        if (channel >= GLLibPlayer.k_snd_nbChannel) {
            new StringBuffer().append("Snd_Play: Attempting to play on channel ").append(channel).append(" while only have max ").append(GLLibPlayer.k_snd_nbChannel);
        }
        if (index < 0 || volume == 0) {
            return;
        }
        SndQueue_Push(channel, 3, index, priority, volume, loop);
    }
    
    static final void sub_239b(int i, final boolean b) {
        SndQueue_Push(i, 4, -1, -1, -1, -1);
        final int n = i;
        sub_2ca7(0, i);
        sub_2cdc(0, i);
        for (i = 0; i < 16; ++i) {
            sub_2d26(0, n, i, 0);
        }
    }
    
    private static void Snd_PrepareExec(final int channel, final int index, final int priority) throws MediaException, IOException {
        if (GLLibPlayer.s_snd_state[channel] == 2 && GLLibPlayer.s_snd_priority[channel] < priority) {
            return;
        }
        if (GLLibPlayer.s_snd_index[channel] == index && GLLibPlayer.s_snd_state[channel] != 0) {
            return;
        }
        Snd_FreeChannelExec(channel);
        if (GLLibPlayer.s_snd_Player[channel] == null) {
            if (GLLibPlayer.s_snd_sndSlot[index] == null) {
                return;
            }
			GLLibPlayer.s_snd_Player[channel] = Manager.createPlayer((InputStream)new ByteArrayInputStream(GLLibPlayer.s_snd_sndSlot[index]), GLLib.GetMIME(GLLibPlayer.s_snd_sndType[index]));
        }
        if (GLLibPlayer.s_snd_Player[channel] == null) {
            return;
        }
		GLLibPlayer.s_snd_Player[channel].realize();
		GLLibPlayer.s_snd_Player[channel].prefetch();
        GLLibPlayer.s_snd_state[channel] = 1;
        GLLibPlayer.s_snd_index[channel] = index;
    }
    
    private static void Snd_PlayExec(final int channel, final int index, final int priority, final int loop, final int volume) throws MediaException, IOException {
        if (GLLib.s_game_isPaused) {
            return;
        }
        Snd_PrepareExec(channel, index, priority);
        if (GLLib.s_game_isPaused) {
            return;
        }
        if (GLLibPlayer.s_snd_state[channel] != 1 || GLLibPlayer.s_snd_Player[channel] == null) {
            return;
        }
        if (loop == 0) {
            GLLibPlayer.s_snd_Player[channel].setLoopCount(-1);
        }
        else {
            GLLibPlayer.s_snd_Player[channel].setLoopCount(loop);
        }
        ((VolumeControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("VolumeControl")).setLevel(volume * GLLibPlayer.s_snd_masterVolume * 100 / 10000);
        GLLibPlayer.s_snd_Player[channel].setMediaTime(0L);
        GLLibPlayer.s_snd_Player[channel].start();
        GLLibPlayer.s_snd_state[channel] = 2;
        GLLibPlayer.s_snd_volume[channel] = volume;
        GLLibPlayer.s_snd_loop[channel] = loop;
        GLLibPlayer.s_snd_priority[channel] = priority;
        GLLibPlayer.s_snd_index[channel] = index;
    }
    
    static void Snd_SetMasterVolume(int volume) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        GLLibPlayer.s_snd_masterVolume = volume;
        try {
            for (volume = 0; volume < GLLibPlayer.k_snd_nbChannel; ++volume) {
                Snd_SetVolumeForPlayer(volume, GLLibPlayer.s_snd_volume[volume]);
            }
        }
        catch (final Exception ex) {}
    }
    
    private static int sub_2635(final int n) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return 0;
        }
        int n2 = 0;
        try {
            if (GLLibPlayer.s_snd_Player[n] == null) {
                n2 = 0;
            }
            n2 = ((VolumeControl)((Controllable)GLLibPlayer.s_snd_Player[n]).getControl("VolumeControl")).getLevel() * 100 * 100 / (GLLibPlayer.s_snd_masterVolume * 100);
        }
        catch (final Exception ex) {}
        return n2;
    }
    
    private static void Snd_SetVolumeForPlayer(final int volume, final int beforeVolume) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized || GLLibPlayer.s_snd_Player[volume] == null) {
            return;
        }
        try {
            if (GLLibPlayer.s_snd_Player[volume] != null) {
                ((VolumeControl)((Controllable)GLLibPlayer.s_snd_Player[volume]).getControl("VolumeControl")).setLevel(beforeVolume * GLLibPlayer.s_snd_masterVolume * 100 / 10000);
            }
        }
        catch (final Exception ex) {}
    }
    
    private static void sub_2745() {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (GLLibPlayer.var_165f) {
            return;
        }
        GLLibPlayer.var_165f = true;
        for (int i = 0; i < GLLibPlayer.k_snd_nbChannel; ++i) {
            sub_1fe4(i, GLLibPlayer.var_1667);
            if (GLLibPlayer.var_1667[5] > 0) {
                if (GLLibPlayer.s_snd_state[i] == 2) {
                    boolean sub_29de;
                    try {
                        sub_29de = Snd_IsPlaying(i);
                    }
                    catch (final Exception obj) {
                        new StringBuffer().append("Snd_update.error on channel (").append(i).append(").").append(obj);
                        sub_29de = false;
                    }
                    if (!sub_29de) {
                        GLLibPlayer.s_snd_state[i] = 1;
                    }
                }
                while (GLLibPlayer.var_1667[5] > 0) {
                    try {
                        switch (GLLibPlayer.var_1667[0]) {
                            case 1: {
                                Snd_PrepareExec(i, GLLibPlayer.var_1667[1], GLLibPlayer.var_1667[2]);
                                break;
                            }
                            case 2: {
                                Snd_FreeChannelExec(i);
                                break;
                            }
                            case 3: {
                                Snd_PlayExec(i, GLLibPlayer.var_1667[1], GLLibPlayer.var_1667[2], GLLibPlayer.var_1667[4], GLLibPlayer.var_1667[3]);
                                break;
                            }
                            case 4: {
                                final int n = i;
                                if (GLLibPlayer.s_snd_Player[n] != null) {
                                    GLLibPlayer.s_snd_Player[n].stop();
                                    GLLibPlayer.s_snd_state[n] = 1;
                                }
                                break;
                            }
                            case 5: {
                                final int n2 = i;
                                if (GLLibPlayer.s_snd_state[n2] == 2 && GLLibPlayer.s_snd_Player[n2] != null) {
                                    GLLibPlayer.s_snd_Player[n2].getState();
                                    GLLibPlayer.s_snd_Player[n2].stop();
                                    GLLibPlayer.s_snd_state[n2] = 3;
                                }
                                break;
                            }
                            case 6: {
                                final int n3 = i;
                                if (GLLibPlayer.s_snd_state[n3] == 3 && GLLibPlayer.s_snd_Player[n3] != null) {
                                    GLLibPlayer.s_snd_Player[n3].start();
                                    GLLibPlayer.s_snd_state[n3] = 2;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    catch (final Exception obj2) {
                        new StringBuffer().append("Snd_update.error on channel (").append(i).append(").").append(obj2);
                        obj2.printStackTrace();
                    }
                    sub_1fe4(i, GLLibPlayer.var_1667);
                }
            }
            sub_2d9e(i);
        }
        GLLibPlayer.var_165f = false;
    }
    
    public final void run() {
        while (GLLibPlayer.s_pThread != null) {
            sub_2745();
            try {
                Thread.sleep(50);
            }
            catch (final Exception ex) {}
        }
    }
    
    protected static boolean Snd_IsPlaying(final int channel) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return false;
        }
        if (channel >= GLLibPlayer.k_snd_nbChannel || GLLibPlayer.s_snd_Player[channel] == null) {
            return false;
        }
        if (GLLibPlayer.s_snd_Player[channel].getState() != 400) {
            return false;
        }
        return true;
    }
    
    private static void Snd_FreeChannelExec(final int channel) throws MediaException {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (GLLibPlayer.s_snd_Player[channel] != null) {
            GLLibPlayer.s_snd_Player[channel].stop();
            GLLibPlayer.s_snd_Player[channel].deallocate();
            GLLibPlayer.s_snd_Player[channel].close();
            GLLibPlayer.s_snd_Player[channel] = null;
        }
        GLLibPlayer.s_snd_state[channel] = 0;
        GLLibPlayer.s_snd_index[channel] = -1;
    }
    
    static int Snd_GetCurrentSoundIndex() {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_snd_index != null) {
            return GLLibPlayer.s_snd_index[0];
        }
        return -1;
    }
    
    private static long Snd_MediaTimeGet(final int channel) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return -1L;
        }
        long t = -1L;
        try {
            t = GLLibPlayer.s_snd_Player[channel].getMediaTime();
        }
        catch (final Exception ex) {}
        return t;
    }
    
    private static boolean Snd_MidiSetChannelVolume(final int channel, final int MIDIChannel, final int volume) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return false;
        }
        boolean b = false;
        GLLibPlayer.var_167f[((channel << 4) + MIDIChannel) * 9 + 3] = volume;
        final MIDIControl midiControl;
        if ((midiControl = (MIDIControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("MIDIControl")) != null) {
            midiControl.shortMidiEvent(0xB0 | MIDIChannel, 7, volume);
            b = true;
        }
        return b;
    }
    
    private static int sub_2bd9(final int n) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return -1;
        }
        try {
            final TempoControl tempoControl;
            if ((tempoControl = (TempoControl)((Controllable)GLLibPlayer.s_snd_Player[n]).getControl("TempoControl")) != null) {
                return tempoControl.getTempo();
            }
        }
        catch (final Exception ex) {}
        return -1;
    }
    
    private static boolean sub_2c4b(final int n, final int tempo) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return false;
        }
        final TempoControl tempoControl;
        if ((tempoControl = (TempoControl)((Controllable)GLLibPlayer.s_snd_Player[n]).getControl("TempoControl")) != null) {
            tempoControl.setTempo(tempo);
            return true;
        }
        return false;
    }
    
    private static void sub_2ca7(int n, final int n2) {
        n = n2 * 3;
        GLLibPlayer.var_166f[n] = 0;
        GLLibPlayer.var_166f[n + 1] = 0;
        GLLibPlayer.var_166f[n + 2] = 0;
    }
    
    private static void sub_2cdc(final int n, int n2) {
        n2 *= 3;
        GLLibPlayer.var_1677[n2] = n;
        if (n != 1) {
            GLLibPlayer.var_1677[n2 + 1] = 0;
            GLLibPlayer.var_1677[n2 + 2] = 0;
        }
    }
    
    private static void sub_2d26(final int n, final int n2, final int n3, int n4) {
        n4 = ((n2 << 4) + n3) * 9;
        GLLibPlayer.var_167f[n4] = n;
        if (n == 0 || n == 1) {
            final int[] var_1687 = GLLibPlayer.var_1687;
            var_1687[n2] &= ~(1 << n3);
            return;
        }
        GLLibPlayer.var_167f[n4 + 1] = 0;
        GLLibPlayer.var_167f[n4 + 2] = 0;
        final int[] var_1688 = GLLibPlayer.var_1687;
        var_1688[n2] |= 1 << n3;
    }
    
    private static void sub_2d9e(final int n) {
        if ((GLLibPlayer.var_169f += GLLib.s_game_frameDT) < 0) {
            return;
        }
        final int var_169f = GLLibPlayer.var_169f;
        GLLibPlayer.var_169f = 0;
        final long sub_2b00;
        if ((sub_2b00 = Snd_MediaTimeGet(n)) >= 0L && sub_2b00 <= var_169f * 1000) {
            GLLibPlayer.var_168f[n] = true;
        }
        try {
            if (!Snd_IsPlaying(n)) {
                if (!GLLib.s_game_isPaused && GLLibPlayer.s_snd_loop[n] == 0 && GLLibPlayer.var_1697[n] < 3) {
                    switch (GLLibPlayer.var_1697[n]) {
                        case 0: {
                            if (GLLibPlayer.s_snd_state[n] == 2) {
                                GLLibPlayer.var_1697[n] = 1;
                                GLLibPlayer.var_168f[n] = true;
                                return;
                            }
                            break;
                        }
                        case 1: {
                            GLLibPlayer.var_1697[n] = 2;
                            GLLibPlayer.s_snd_Player[n].stop();
                            GLLibPlayer.s_snd_state[n] = 1;
                            return;
                        }
                        case 2: {
                            Snd_PlayExec(n, GLLibPlayer.s_snd_index[n], GLLibPlayer.s_snd_priority[n], 0, GLLibPlayer.s_snd_volume[n]);
                            GLLibPlayer.var_1697[n] = 3;
                            break;
                        }
                    }
                }
                return;
            }
        }
        catch (final Exception ex) {
            return;
        }
        GLLibPlayer.var_1697[n] = 0;
        final int n2 = n * 3;
        final int n3;
        if ((n3 = GLLibPlayer.var_166f[n2]) != 0 && n3 != 1) {
            final int n4 = GLLibPlayer.var_166f[n2 + 1];
            int n6;
            try {
                final int sub_2635 = sub_2635(n);
                final int n5 = (1 > GLLibPlayer.var_166f[n2 + 2] * var_169f / 1000) ? 1 : (GLLibPlayer.var_166f[n2 + 2] * var_169f / 1000);
                n6 = ((sub_2635 < n4) ? ((n4 < sub_2635 + n5) ? n4 : (sub_2635 + n5)) : ((n4 > sub_2635 - n5) ? n4 : (sub_2635 - n5)));
                Snd_SetVolumeForPlayer(n, n6);
            }
            catch (final Exception ex2) {
                n6 = n4;
            }
            if (n6 == n4) {
                if (n3 == 4) {
                    sub_239b(n, true);
                }
                sub_2ca7(0, n);
            }
        }
        final int n7;
        if ((n7 = GLLibPlayer.var_1677[n2]) != 0 && n7 != 1) {
            final int n8 = GLLibPlayer.var_1677[n2 + 1];
            int sub_2bd9 = -1;
            try {
                sub_2bd9 = sub_2bd9(n);
                final int n9 = (1 > GLLibPlayer.var_1677[n2 + 2] * var_169f / 1000) ? 1 : (GLLibPlayer.var_1677[n2 + 2] * var_169f / 1000);
                sub_2bd9 = ((sub_2bd9 < n8) ? ((n8 < sub_2bd9 + n9) ? n8 : (sub_2bd9 + n9)) : ((n8 > sub_2bd9 - n9) ? n8 : (sub_2bd9 - n9)));
                sub_2c4b(n, sub_2bd9);
            }
            catch (final Exception ex3) {
                sub_2cdc(0, n);
            }
            if (sub_2bd9 < 0 || ((sub_2bd9 - n8 < 0) ? (-(sub_2bd9 - n8)) : (sub_2bd9 - n8)) < 500) {
                sub_2cdc(1, n);
            }
        }
        else if (GLLibPlayer.var_168f[n] && n7 == 1) {
            try {
                final int n10 = GLLibPlayer.var_1677[n2 + 1];
                final int sub_2bd10;
                if ((((sub_2bd10 = sub_2bd9(n)) - n10 < 0) ? (-(sub_2bd10 - n10)) : (sub_2bd10 - n10)) >= 500) {
                    sub_2c4b(n, n10);
                }
            }
            catch (final Exception ex4) {}
        }
        if (GLLibPlayer.var_1687[n] == 0 && !GLLibPlayer.var_168f[n]) {
            return;
        }
        for (int i = 0; i < 16; ++i) {
            if ((GLLibPlayer.var_1687[n] & 1 << i) != 0x0 || GLLibPlayer.var_168f[n]) {
                final int n11 = ((n << 4) + i) * 9;
                final int n12;
                switch (n12 = GLLibPlayer.var_167f[n11]) {
                    case 1: {
                        if (GLLibPlayer.var_168f[n]) {
                            final int n13 = GLLibPlayer.var_167f[n11 + 1];
                            try {
                                Snd_MidiSetChannelVolume(n, i, n13);
                            }
                            catch (final Exception ex5) {}
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final int n14 = GLLibPlayer.var_167f[n11 + 1];
                        final int n15 = GLLibPlayer.var_167f[n11 + 3];
                        final int n16 = (1 > GLLibPlayer.var_167f[n11 + 2] * var_169f / 1000) ? 1 : (GLLibPlayer.var_167f[n11 + 2] * var_169f / 1000);
                        int n17 = (n15 < n14) ? ((n14 < n15 + n16) ? n14 : (n15 + n16)) : ((n14 > n15 - n16) ? n14 : (n15 - n16));
                        try {
                            Snd_MidiSetChannelVolume(n, i, n17);
                        }
                        catch (final Exception ex6) {
                            n17 = n14;
                        }
                        if (n17 == n14) {
                            sub_2d26(1, n, i, 0);
                            break;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        final int n18 = (n12 == 6) ? GLLibPlayer.var_167f[n11 + 1] : 0;
                        final int n19;
                        if ((n19 = GLLibPlayer.var_167f[n11 + 3]) != n18) {
                            final int n20 = (1 > GLLibPlayer.var_167f[n11 + 2] * var_169f / 1000) ? 1 : (GLLibPlayer.var_167f[n11 + 2] * var_169f / 1000);
                            final int n21 = (n19 < n18) ? ((n18 < n19 + n20) ? n18 : (n19 + n20)) : ((n18 > n19 - n20) ? n18 : (n19 - n20));
                            try {
                                Snd_MidiSetChannelVolume(n, i, n21);
                            }
                            catch (final Exception ex7) {}
                        }
                        final int[] var_167f = GLLibPlayer.var_167f;
                        final int n22 = n11 + 8;
                        var_167f[n22] -= var_169f;
                        if (GLLibPlayer.var_167f[n11 + 8] > 0) {
                            break;
                        }
                        final int n23 = i;
                        final boolean b = n12 == 7;
                        final int n24 = ((n << 4) + n23) * 9;
                        final int n25;
                        if ((n25 = GLLibPlayer.var_167f[n24]) != 6 && n25 != 7) {
                            break;
                        }
                        if (b) {
                            GLLibPlayer.var_167f[n24] = 6;
                            GLLibPlayer.var_167f[n24 + 8] = GLLib.Math_Rand(GLLibPlayer.var_167f[n24 + 4], GLLibPlayer.var_167f[n24 + 5] + 1);
                            break;
                        }
                        GLLibPlayer.var_167f[n24] = 7;
                        GLLibPlayer.var_167f[n24 + 8] = GLLib.Math_Rand(GLLibPlayer.var_167f[n24 + 6], GLLibPlayer.var_167f[n24 + 7] + 1);
                        break;
                    }
                }
            }
        }
        GLLibPlayer.var_168f[n] = false;
    }
    
    static void sub_35e7() {
        try {
            for (int i = 0; i < GLLibPlayer.k_snd_nbChannel; ++i) {
                sub_239b(i, true);
            }
            if (GLLib.s_game_isPaused) {
                sub_2745();
            }
            if (GLLib.s_game_isPaused) {
                sub_2745();
            }
        }
        catch (final Exception ex) {}
    }
    
    static void sub_3661(final int n, final int n2, final int n3, final int n4) {
        GLLibPlayer.var_16c7 = new int[8];
        GLLibPlayer.s_TilesetLayerInfo = new int[GLLibPlayer.s_TilesetMaxLayerCount][GLLibPlayer.var_16b7];
        GLLibPlayer.s_TilesetLayerImage = new GLLibImage[GLLibPlayer.s_TilesetMaxLayerCount][1];
        GLLibPlayer.s_TilesetLayerGraphics = new Graphics[GLLibPlayer.s_TilesetMaxLayerCount][1];
        if (n3 > 0 && n4 > 0) {
            GLLibPlayer.s_TilesetLayerData = new byte[GLLibPlayer.s_TilesetMaxLayerCount][2][];
            GLLibPlayer.s_TilesetSprite = new ASprite[GLLibPlayer.s_TilesetMaxLayerCount];
            GLLibPlayer.var_16c7[2] = n3;
            GLLibPlayer.var_16c7[4] = 0;
            GLLibPlayer.var_16c7[5] = n4;
            GLLibPlayer.var_16c7[7] = 0;
        }
        GLLibPlayer.var_16ef = new int[GLLibPlayer.s_TilesetMaxLayerCount][GLLibPlayer.var_16bf][4];
        GLLibPlayer.var_16c7[0] = n;
        GLLibPlayer.var_16c7[1] = n2;
        GLLibPlayer.s_bTilesetPlayerInitialized = true;
    }
    
    private static void sub_370b(int n) {
        n = 0;
        n = GLLibPlayer.s_TilesetLayerInfo[0][18];
        final int n2 = GLLibPlayer.s_TilesetLayerInfo[0][19];
        final int n3 = n % GLLibPlayer.var_16c7[2];
        GLLibPlayer.s_TilesetLayerInfo[0][7] = n - n3 + (1 + ((n3 != 0) ? 1 : 0)) * GLLibPlayer.var_16c7[2];
        n = n2 % GLLibPlayer.var_16c7[5];
        GLLibPlayer.s_TilesetLayerInfo[0][8] = n2 - n + (1 + ((n != 0) ? 1 : 0)) * GLLibPlayer.var_16c7[5];
    }
    
    private static void sub_37be(final int n) {
        try {
            GLLibPlayer.s_TilesetLayerImage[0][0] = GLLibImage.createImage(GLLibPlayer.s_TilesetLayerInfo[0][8], GLLibPlayer.s_TilesetLayerInfo[0][7]);
            GLLibPlayer.s_TilesetLayerGraphics[0][0] = GLLibPlayer.s_TilesetLayerImage[0][0].image.getGraphics();
        }
        catch (final Exception ex) {
            new StringBuffer().append("GLLibPlayer.Tileset_LoadLayer.pb while ceating circular buffer : ").append(ex.toString());
        }
    }
    
    static void sub_3837() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        sub_370b(0);
        sub_37be(0);
    }
    
    private static boolean sub_386f(final int n, final int n2) {
        return (GLLibPlayer.s_TilesetLayerInfo[n][15] & n2) != 0x0;
    }
    
    private static void sub_38aa(final int n, final int n2, final boolean b) {
        if (b) {
            final int[] array = GLLibPlayer.s_TilesetLayerInfo[0];
            final int n3 = 15;
            array[n3] |= n2;
            return;
        }
        final int[] array2 = GLLibPlayer.s_TilesetLayerInfo[0];
        final int n4 = 15;
        array2[n4] &= ~n2;
    }
    
    static void sub_38f5(final int n, byte[] array, byte[] array2, byte[] array3, final ASprite class_e, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        final byte[] array4 = array;
        final byte[] array5 = array2;
        array2 = array5;
        array = array4;
        if (GLLibPlayer.s_bTilesetPlayerInitialized) {
            Tileset_Destroy(0, false);
            GLLibPlayer.s_TilesetLayerInfo[0][18] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][19] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][18] = GLLibPlayer.var_16c7[0];
            GLLibPlayer.s_TilesetLayerInfo[0][19] = GLLibPlayer.var_16c7[1];
            GLLibPlayer.s_TilesetLayerData[0][0] = array2;
            GLLibPlayer.s_TilesetLayerData[0][1] = array3;
            GLLibPlayer.s_TilesetLayerInfo[0][2] = GLLib.Mem_GetShort(array, 0);
            GLLibPlayer.s_TilesetLayerInfo[0][3] = GLLib.Mem_GetShort(array, 2);
            GLLibPlayer.s_TilesetLayerInfo[0][5] = GLLibPlayer.s_TilesetLayerInfo[0][2] * GLLibPlayer.var_16c7[2];
            GLLibPlayer.s_TilesetLayerInfo[0][6] = GLLibPlayer.s_TilesetLayerInfo[0][3] * GLLibPlayer.var_16c7[5];
            GLLibPlayer.s_TilesetSprite[0] = class_e;
            sub_370b(0);
            if (GLLibPlayer.s_TilesetLayerImage[0][0] == null || GLLibPlayer.s_TilesetLayerImage[0][0].image.getWidth() != GLLibPlayer.s_TilesetLayerInfo[0][8] || GLLibPlayer.s_TilesetLayerImage[0][0].image.getHeight() != GLLibPlayer.s_TilesetLayerInfo[0][7]) {
                sub_37be(0);
            }
            sub_38aa(0, 64, true);
            sub_38aa(0, 4, true);
            sub_38aa(0, 128, true);
            GLLibPlayer.s_TilesetLayerInfo[0][9] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][10] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][11] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][12] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][0] = 1;
            GLLibPlayer.s_TilesetLayerInfo[0][1] = 1;
            GLLibPlayer.s_TilesetLayerInfo[0][13] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][14] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][16] = 0;
            sub_38aa(GLLibPlayer.s_TilesetLayerInfo[0][17] = 0, 1, false);
            sub_38aa(0, 16, false);
            sub_38aa(0, 2, false);
            sub_38aa(0, 32, false);
            sub_38aa(0, 8, false);
        }
    }
    
    static void Tileset_Destroy(final int nLayer) {
        Tileset_Destroy(nLayer, true);
    }
    
    private static void Tileset_Destroy(final int nLayer, final boolean bFreeBufferImage) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[nLayer] = new int[GLLibPlayer.var_16b7];
        if (bFreeBufferImage) {
            GLLibPlayer.s_TilesetLayerImage[nLayer] = new GLLibImage[1];
            GLLibPlayer.s_TilesetLayerGraphics[nLayer] = new Graphics[1];
        }
        if (GLLibPlayer.s_TilesetLayerData != null) {
            GLLibPlayer.s_TilesetLayerData[nLayer] = new byte[2][];
            GLLibPlayer.s_TilesetSprite[nLayer] = null;
        }
    }
    
    static void sub_3b5c(Graphics graphics, int n, int n2, int n3) {
        final Graphics graphics2 = graphics;
        final int n4 = n;
        n = n4;
        graphics = graphics2;
        if (GLLibPlayer.s_bTilesetPlayerInitialized) {
            if (n3 == -1) {
                for (int i = 0; i < GLLibPlayer.s_TilesetMaxLayerCount; ++i) {
                    sub_3b5c(graphics, n, n2, i);
                }
                return;
            }
            int n5 = GLLibPlayer.s_TilesetLayerInfo[n3][18] * 100 / GLLibPlayer.var_1707;
            final int n6 = GLLibPlayer.s_TilesetLayerInfo[n3][19] * 100 / GLLibPlayer.var_1707;
            if (n5 == 0) {
                GLLibPlayer.s_TilesetLayerInfo[n3][18] = GLLibPlayer.var_16c7[0];
                n5 = GLLibPlayer.s_TilesetLayerInfo[n3][18];
            }
            if (n6 == 0) {
                GLLibPlayer.s_TilesetLayerInfo[n3][19] = GLLibPlayer.var_16c7[1];
                n5 = GLLibPlayer.s_TilesetLayerInfo[n3][18];
            }
            final int[] array;
            if ((array = GLLibPlayer.s_TilesetLayerInfo[n3])[0] != 1 || array[1] != 1) {
                return;
            }
            int j = array[13] + array[16];
            int k = array[14] + array[17];
            if (sub_386f(n3, 4)) {
                int sub_35c6 = 0;
                int sub_3600 = 0;
                int sub_3601 = 0;
                int sub_367d = 0;
                if (graphics != null) {
                    sub_35c6 = GLLib.GetClip(graphics, true);
                    sub_3600 = GLLib.sub_3600(graphics, true);
                    sub_3601 = GLLib.sub_3643(graphics, true);
                    sub_367d = GLLib.sub_367d(graphics, true);
                }
                if (sub_386f(n3, 128)) {
                    GLLibPlayer.var_16f7 = 0;
                }
                Label_1365: {
                    if (sub_386f(n3, 256)) {
                        final int[] array2;
                        final int n7 = (array2 = GLLibPlayer.s_TilesetLayerInfo[n3])[13];
                        final int n8 = array2[14];
                        final int n9 = GLLibPlayer.var_16c7[0];
                        final int n10 = GLLibPlayer.var_16c7[1];
                        final int n11 = array2[5];
                        final int n12 = array2[6];
                        final int n13 = n11 + array2[7];
                        final int n14 = n12 + array2[8];
                        final int n15 = array2[2];
                        final int n16 = array2[3];
                        final boolean b = array2[9] > 0;
                        int n17;
                        if ((n17 = n7) < 0) {
                            n17 = n7 - (n15 - 1);
                        }
                        int n18;
                        if ((n18 = n8) < 0) {
                            n18 = n8 - (n16 - 1);
                        }
                        if (!b) {
                            final int n19 = n13 - 1;
                            final int n20 = n14 - 1;
                            final int n21 = n7 + n9 - 1;
                            final int n22 = n8 + n10 - 1;
                            final int n23 = n21;
                            final int n24 = n20;
                            if (n19 >= n7 && n11 <= n23 && n24 >= n8 && n12 <= n22) {
                                int n25 = 0;
                                int n26 = 0;
                                if (n7 < n11) {
                                    final int n27 = n17 / n15 * n15;
                                    final int n28 = n18 / n16 * n16;
                                    final int n29 = n11 - n27;
                                    final int n30 = array2[8];
                                    n25 = n29;
                                    n26 = n29;
                                    sub_7adc(n3, array2[5] = n27, n28, n29, n30);
                                }
                                else if (n7 + n9 >= n13) {
                                    final int n31 = n18 / n16 * n16;
                                    final int n32 = ((n7 + n9 - n13) / n15 + 1) * n15;
                                    final int n33 = array2[8];
                                    n26 = n32;
                                    array2[5] = n17 / n15 * n15;
                                    sub_7adc(n3, n13, n31, n26, n33);
                                }
                                if (n8 < n12) {
                                    final int n34 = n17 / n15 * n15 + n25;
                                    final int n35 = n18 / n16 * n16;
                                    sub_7adc(n3, n34, array2[6] = n35, array2[7] - n26, n12 - n35);
                                }
                                else if (n8 + n10 >= n14) {
                                    final int n36 = n17 / n15 * n15 + n25;
                                    final int n37 = array2[7] - n26;
                                    final int n38 = ((n8 + n10 - n14) / n16 + 1) * n16;
                                    array2[6] = n18 / n16 * n16;
                                    sub_7adc(n3, n36, n14, n37, n38);
                                }
                                array2[10] = 0;
                                break Label_1365;
                            }
                        }
                        final int n39 = n17 / n15 * n15;
                        final int n40 = n18 / n16 * n16;
                        sub_7adc(n3, n39, n40, array2[7], array2[8]);
                        array2[5] = n39;
                        array2[6] = n40;
                        if (b) {
                            array2[9] = 0;
                        }
                        array2[10] = 1;
                    }
                    else {
                        int n41 = j;
                        int n42 = k;
                        if (n41 < 0) {
                            n41 -= GLLibPlayer.var_16c7[2];
                        }
                        if (n42 < 0) {
                            n42 -= GLLibPlayer.var_16c7[5];
                        }
                        final int n43 = n41 / GLLibPlayer.var_16c7[2];
                        final int n44 = n42 / GLLibPlayer.var_16c7[5];
                        final int n45 = n43 + array[7] / GLLibPlayer.var_16c7[2] - 1;
                        final int n46 = n44 + array[8] / GLLibPlayer.var_16c7[5] - 1;
                        int n47 = 0;
                        int n48 = 0;
                        if (array[10] != n44 || array[12] != n46) {
                            if (array[10] < n44 || array[12] < n46) {
                                if (array[12] < n44) {
                                    n47 = n44;
                                    n48 = n46;
                                }
                                else {
                                    n47 = array[12] + 1;
                                    n48 = n46;
                                }
                            }
                            else if (array[10] > n46) {
                                n47 = n44;
                                n48 = n46;
                            }
                            else {
                                n47 = n44;
                                n48 = array[10] - 1;
                            }
                        }
                        if (array[9] != n43 || array[11] != n45) {
                            int n49;
                            int n50;
                            if (array[9] < n43 || array[11] < n45) {
                                if (array[11] < n43) {
                                    n49 = n43;
                                    n50 = n45;
                                }
                                else {
                                    n49 = array[11] + 1;
                                    n50 = n45;
                                }
                            }
                            else if (array[9] > n45) {
                                n49 = n43;
                                n50 = n45;
                            }
                            else {
                                n49 = n43;
                                n50 = array[9] - 1;
                            }
                            int n51 = n46 - n44;
                            int n52 = n44;
                            if (array[10] != n44 || array[12] != n46) {
                                if (array[10] < n44 || array[12] < n46) {
                                    n51 -= n48 - n47 + 1;
                                }
                                else {
                                    n51 -= n48 - n47 + 1;
                                    n52 += n48 - n47 + 1;
                                }
                            }
                            if (n51 >= 0) {
                                sub_4f0b(GLLibPlayer.s_TilesetLayerGraphics[n3][0], n3, n49, n52, n50 - n49, n51, 0, 0);
                            }
                            array[9] = n43;
                            array[11] = n45;
                        }
                        if (array[10] != n44 || array[12] != n46) {
                            sub_4f0b(GLLibPlayer.s_TilesetLayerGraphics[n3][0], n3, n43, n47, n45 - n43, n48 - n47, 0, 0);
                            array[10] = n44;
                            array[12] = n46;
                        }
                    }
                }
                if (graphics != null) {
                    if (!sub_386f(n3, 273)) {
                        if (j < 0) {
                            n -= j;
                            j = 0;
                        }
                        else if (j > array[5] - n5) {
                            n -= j - (array[5] - n5);
                            j = array[5] - n5;
                        }
                    }
                    else {
                        while (j < 0) {
                            j += array[7];
                        }
                    }
                    if (!sub_386f(n3, 290)) {
                        if (k < 0) {
                            n2 -= k;
                            k = 0;
                        }
                        else if (k > array[6] - n6) {
                            n2 -= k - (array[6] - n6);
                            k = array[6] - n6;
                        }
                    }
                    else {
                        while (k < 0) {
                            k += array[8];
                        }
                    }
                    final int n53 = j % array[7];
                    final int n54 = k % array[8];
                    final int n55 = (j + n5) % array[7];
                    final int n56 = (k + n6) % array[8];
                    GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                    if (n55 > n53) {
                        if (n56 > n54) {
                            sub_4e59(graphics, n3, n53, n54, n5, n6, n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        }
                        else {
                            sub_4e59(graphics, n3, n53, n54, n5, n6 - n56, n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                            GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                            sub_4e59(graphics, n3, n53, 0, n5, n56, n, n6 - n56 + n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        }
                    }
                    else if (n56 > n54) {
                        sub_4e59(graphics, n3, n53, n54, n5 - n55, n6, n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                        sub_4e59(graphics, n3, 0, n54, n55, n6, n5 - n55 + n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                    }
                    else {
                        sub_4e59(graphics, n3, n53, n54, n5 - n55, n6 - n56, n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                        sub_4e59(graphics, n3, n53, 0, n5 - n55, n56, n, n6 - n56 + n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                        sub_4e59(graphics, n3, 0, n54, n55, n6 - n56, n5 - n55 + n, n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                        GLLib.sub_36f4(graphics, sub_35c6, sub_3600, sub_3601, sub_367d, true);
                        sub_4e59(graphics, n3, 0, 0, n55, n56, n5 - n55 + n, n6 - n56 + n2, sub_35c6, sub_3600, sub_3601, sub_367d, 100);
                    }
                    final Graphics graphics3 = graphics;
                    final int n57 = sub_35c6;
                    final int n58 = sub_3600;
                    final int n59 = sub_3601;
                    n3 = sub_367d;
                    n2 = n59;
                    final int n60 = n58;
                    n = n57;
                    GLLib.sub_36f4(graphics3, n57, n60, n2, n3, true);
                }
                return;
            }
            if (graphics != null) {
                int n61 = j;
                int n62 = k;
                if (n61 < 0) {
                    n61 -= GLLibPlayer.var_16c7[2];
                }
                if (n62 < 0) {
                    n62 -= GLLibPlayer.var_16c7[5];
                }
                final int n63 = n61 / GLLibPlayer.var_16c7[2];
                final int n64 = n62 / GLLibPlayer.var_16c7[5];
                int n65;
                if ((n65 = n5 / GLLibPlayer.var_16c7[2]) * GLLibPlayer.var_16c7[2] < n5) {
                    ++n65;
                }
                int n66;
                if ((n66 = n6 / GLLibPlayer.var_16c7[5]) * GLLibPlayer.var_16c7[5] < n6) {
                    ++n66;
                }
                sub_4f0b(graphics, n3, n63, n64, n65, n66, n63 * GLLibPlayer.var_16c7[2] - j + n, n64 * GLLibPlayer.var_16c7[5] - k + n2);
            }
        }
    }
    
    static void sub_4c02(int n, int n2, int n3, int n4, final int n5) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized || !sub_386f(n5, 4)) {
            return;
        }
        if (n5 == -1) {
            for (int i = 0; i < GLLibPlayer.s_TilesetMaxLayerCount; ++i) {
                sub_4c02(n, n2, n3, n4, i);
            }
            return;
        }
        final int[] array;
        if ((array = GLLibPlayer.s_TilesetLayerInfo[n5])[0] != 1 || array[1] != 1) {
            return;
        }
        if (n + n3 > array[13] && n < array[13] + array[7] && n2 + n4 > array[14] && n2 < array[14] + array[8]) {
            n3 = ((n + n3 < array[13] + array[7]) ? (n + n3) : (array[13] + array[7]));
            n4 = ((n2 + n4 < array[14] + array[8]) ? (n2 + n4) : (array[14] + array[8]));
            n = ((n > array[13]) ? n : array[13]);
            n2 = ((n2 > array[14]) ? n2 : array[14]);
            n3 -= n;
            n4 -= n2;
            if (n < 0) {
                n -= GLLibPlayer.var_16c7[2];
            }
            if (n2 < 0) {
                n2 -= GLLibPlayer.var_16c7[5];
            }
            n /= GLLibPlayer.var_16c7[2];
            n2 /= GLLibPlayer.var_16c7[5];
            n3 = n3 / GLLibPlayer.var_16c7[2] - 1;
            n4 = n4 / GLLibPlayer.var_16c7[5] - 1;
            sub_4f36(GLLibPlayer.s_TilesetLayerGraphics[n5][0], n5, n, n2, n3, n4, 0, 0, true);
        }
    }
    
    private static void sub_4e59(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        if (n6 > (n8 + n10) * 100 || n7 > (n9 + n11) * 100 || n6 + n4 < n8 * 100 || n7 + n5 < n9 * 100) {
            return;
        }
        GLLib.sub_36b7(graphics, n6, n7, n4, n5, true);
        GLLib.sub_38df(graphics, GLLibPlayer.s_TilesetLayerImage[n][0], n3 - n7 + ASprite.var_10cf - GLLibPlayer.s_TilesetLayerInfo[n][8], n6 - n2, 20, false);
    }
    
    private static void sub_4f0b(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        sub_4f36(graphics, n, n2, n3, n4, n5, n6, n7, false);
    }
    
    private static void sub_4f36(final Graphics graphics, int var_10cf, int i, int j, int n, int n2, int n3, int n4, final boolean b) {
        final boolean sub_386f = sub_386f(var_10cf, 4);
        final boolean sub_386f2 = sub_386f(var_10cf, 1);
        final boolean sub_386f3 = sub_386f(var_10cf, 2);
        final int n5 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][2];
        final int n6 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][3];
        final int n7 = GLLibPlayer.var_16c7[2];
        final int n8 = GLLibPlayer.var_16c7[5];
        final int n9 = n5 * n6;
        if (sub_386f) {
            final int var_10c7 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][7];
            final int var_10cf2 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][8];
            ASprite.var_10c7 = var_10c7;
            ASprite.var_10cf = var_10cf2;
        }
        if (sub_386f) {
            n3 += i * GLLibPlayer.var_16c7[2] % GLLibPlayer.s_TilesetLayerInfo[var_10cf][7];
            n4 += j * GLLibPlayer.var_16c7[5] % GLLibPlayer.s_TilesetLayerInfo[var_10cf][8];
            if (n3 < 0) {
                n3 += GLLibPlayer.s_TilesetLayerInfo[var_10cf][7];
            }
            if (n4 < 0) {
                n4 += GLLibPlayer.s_TilesetLayerInfo[var_10cf][8];
            }
        }
        if (sub_386f2) {
            while (i < 0) {
                i += n5;
            }
            while (i >= n5) {
                i -= n5;
            }
        }
        else if (!sub_386f(var_10cf, 16)) {
            if (i < 0) {
                n3 -= i * n7;
                n += i;
                i = 0;
                if (sub_386f && n3 >= GLLibPlayer.s_TilesetLayerInfo[var_10cf][7]) {
                    n3 = 0;
                }
            }
            if (i + n >= n5) {
                n = n5 - i - 1;
            }
            if (n < 0) {
                final int var_1ddf = GLLib.s_screenWidth;
                var_10cf = GLLib.s_screenHeight;
                ASprite.var_10c7 = var_1ddf;
                ASprite.var_10cf = var_10cf;
                return;
            }
        }
        if (sub_386f3) {
            while (j < 0) {
                j += n6;
            }
            while (j >= n6) {
                j -= n6;
            }
        }
        else if (!sub_386f(var_10cf, 32)) {
            if (j < 0) {
                n4 -= j * n8;
                n2 += j;
                j = 0;
                if (sub_386f && n4 >= GLLibPlayer.s_TilesetLayerInfo[var_10cf][8]) {
                    n4 = 0;
                }
            }
            if (j + n2 >= n6) {
                n2 = n6 - j - 1;
            }
            if (n2 < 0) {
                final int var_1ddf2 = GLLib.s_screenWidth;
                var_10cf = GLLib.s_screenHeight;
                ASprite.var_10c7 = var_1ddf2;
                ASprite.var_10cf = var_10cf;
                return;
            }
        }
        int n10 = n3;
        int n11 = n4;
        while (n2-- >= 0) {
            n10 = n3;
            int n12 = n;
            int n13 = i;
            while (n12-- >= 0) {
                final int n14;
                final int sub_7ab4;
                if ((n14 = n13 + j * n5) < n9 && (sub_7ab4 = sub_7ab4(var_10cf, 0, n14, false)) != 255) {
                    int sub_7ab5;
                    if (GLLibPlayer.s_TilesetLayerData[var_10cf][1] == null) {
                        sub_7ab5 = 0;
                    }
                    else {
                        sub_7ab5 = sub_7ab4(var_10cf, 1, n14, false);
                    }
                    if (GLLibPlayer.var_1707 != 100) {
                        GLLib.sub_5b71();
                        GLLib.var_1fef[13][1] = GLLibPlayer.var_1707;
                        GLLib.sub_5c77(true);
                    }
                    if (GLLibPlayer.s_TilesetSprite[var_10cf].sub_3717() == 0) {
                        GLLibPlayer.s_TilesetSprite[var_10cf].sub_7dca(graphics, sub_7ab4, n10, n11, sub_7ab5, GLLibPlayer.var_16c7[2], GLLibPlayer.var_16c7[5]);
                    }
                    else {
                        int n15 = n10;
                        int n16 = n11;
                        if ((sub_7ab5 & 0x1) != 0x0) {
                            n15 += n7;
                        }
                        if ((sub_7ab5 & 0x2) != 0x0) {
                            n16 += n8;
                        }
                        if ((sub_7ab5 & 0x4) != 0x0) {
                            if ((sub_7ab5 & 0x1) != 0x0) {
                                n15 -= n8;
                            }
                            else {
                                n15 += n8;
                            }
                        }
                        GLLibPlayer.s_TilesetSprite[var_10cf].sub_71ae(graphics, sub_7ab4, n15, n16, sub_7ab5);
                    }
                    if (GLLibPlayer.var_1707 != 100) {
                        GLLib.sub_5c77(false);
                        GLLib.sub_5b96();
                    }
                }
                n10 += n7;
                if (++n13 >= n5) {
                    if (!sub_386f2) {
                        break;
                    }
                    n13 = 0;
                }
                if (sub_386f && n10 >= GLLibPlayer.s_TilesetLayerInfo[var_10cf][7]) {
                    n10 = 0;
                }
            }
            n11 += n8;
            if (++j >= n6) {
                if (!sub_386f3) {
                    break;
                }
                j = 0;
            }
            if (sub_386f && n11 >= GLLibPlayer.s_TilesetLayerInfo[var_10cf][8]) {
                n11 = 0;
            }
        }
        if (!b && sub_386f(var_10cf, 128)) {
            int n17;
            int n18;
            if (n10 > n3) {
                n17 = n10;
                n18 = 0;
            }
            else {
                n17 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][7];
                n18 = n10;
            }
            int n19;
            if (n11 > n4) {
                n19 = n11;
                i = 0;
            }
            else {
                n19 = GLLibPlayer.s_TilesetLayerInfo[var_10cf][8];
                i = n11;
            }
            for (j = 0; j < 4; ++j) {
                if (((j != 1 && j != 3) || n18 != 0) && ((j != 2 && j != 3) || i != 0)) {
                    n = ((j == 0 || j == 2) ? n3 : 0);
                    n2 = ((j == 0 || j == 1) ? n4 : 0);
                    sub_59b2(var_10cf, n, n2, (j == 0 || j == 2) ? (n17 - n3) : n18, (j == 0 || j == 1) ? (n19 - n4) : i);
                }
            }
        }
        final int var_1ddf3 = GLLib.s_screenWidth;
        var_10cf = GLLib.s_screenHeight;
        ASprite.var_10c7 = var_1ddf3;
        ASprite.var_10cf = var_10cf;
    }
    
    private static final void sub_59b2(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array;
        (array = GLLibPlayer.var_16ef[n][GLLibPlayer.var_16f7])[0] = n2;
        array[1] = n3;
        array[2] = n4;
        array[3] = n5;
        ++GLLibPlayer.var_16f7;
    }
    
    private static final int sub_59f0(final int n, final int n2) {
        if (sub_386f(n, 8)) {
            return GLLibPlayer.s_TilesetLayerInfo[n][6] - GLLibPlayer.var_16c7[1] - n2;
        }
        return n2;
    }
    
    static final void sub_5a36(final int n, final int n2, final int n3) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_SetCamera: nLayer invalid : ").append(0);
            return;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[0][13] = n2;
        GLLibPlayer.s_TilesetLayerInfo[0][14] = sub_59f0(0, n3);
        if (sub_386f(0, 16)) {
            if (GLLibPlayer.s_TilesetLayerInfo[0][13] < 0) {
                GLLibPlayer.s_TilesetLayerInfo[0][13] = 0;
            }
            else if (GLLibPlayer.s_TilesetLayerInfo[0][13] + GLLibPlayer.var_16c7[0] >= GLLibPlayer.s_TilesetLayerInfo[0][5]) {
                GLLibPlayer.s_TilesetLayerInfo[0][13] = GLLibPlayer.s_TilesetLayerInfo[0][5] - GLLibPlayer.var_16c7[0] - 1;
            }
        }
        if (sub_386f(0, 32)) {
            if (GLLibPlayer.s_TilesetLayerInfo[0][14] < 0) {
                GLLibPlayer.s_TilesetLayerInfo[0][14] = 0;
                return;
            }
            if (GLLibPlayer.s_TilesetLayerInfo[0][14] + GLLibPlayer.var_16c7[1] >= GLLibPlayer.s_TilesetLayerInfo[0][6]) {
                GLLibPlayer.s_TilesetLayerInfo[0][14] = GLLibPlayer.s_TilesetLayerInfo[0][6] - GLLibPlayer.var_16c7[1] - 1;
            }
        }
    }
    
    static final int sub_5b8b(final int n) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][13];
    }
    
    static final int sub_5c0b(final int n) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return -1;
        }
        if (sub_386f(0, 8)) {
            return GLLibPlayer.s_TilesetLayerInfo[0][6] - GLLibPlayer.var_16c7[1] - GLLibPlayer.s_TilesetLayerInfo[0][14];
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][14];
    }
    
    static final int sub_5cb3() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetLayerWidth: nLayer invalid : ").append(0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][5];
    }
    
    static final int sub_5d2e() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetLayerHeight: nLayer invalid : ").append(0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][6];
    }
    
    static final int sub_5daa(int n, int i, int sub_59f0) {
        sub_59f0 = sub_59f0(0, sub_59f0);
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetTile: nLayer invalid : ").append(0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return -1;
        }
        if (i < 0 || i > GLLibPlayer.s_TilesetLayerInfo[0][2]) {
            new StringBuffer().append("Tileset_GetTile: x value out of bound [").append(i).append("]  0 <= x < ").append(GLLibPlayer.s_TilesetLayerInfo[0][2]);
            return -1;
        }
        if (sub_59f0 < 0 || sub_59f0 > GLLibPlayer.s_TilesetLayerInfo[0][3]) {
            new StringBuffer().append("Tileset_GetTile: y value out of bound [").append(sub_59f0).append("]  0 <= y < ").append(GLLibPlayer.s_TilesetLayerInfo[0][3]);
            return -1;
        }
        final int n2 = i = i;
        n = sub_59f0;
        sub_59f0 = n2;
        i = GLLibPlayer.s_TilesetLayerInfo[0][2];
        return sub_7ab4(0, 0, n * i + sub_59f0, false);
    }
    
    static final GLLibImage sub_5ecf() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return null;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_GetBufferImage: p_iLayer invalid : ").append(0);
            return null;
        }
        return GLLibPlayer.s_TilesetLayerImage[0][0];
    }
    
    static void sub_5f26() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (sub_386f(0, 256)) {
            GLLibPlayer.s_TilesetLayerInfo[0][9] = 1;
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[0][9] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][10] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][11] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][12] = -1;
    }
    
    static void sub_5f94(int i, int sub_59f0, final int n) {
        sub_59f0 = sub_59f0(0, sub_59f0);
        i /= GLLibPlayer.var_16c7[2];
        sub_59f0 /= GLLibPlayer.var_16c7[5];
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            new StringBuffer().append("Tileset_SetTile: layer invalid : ").append(0);
            return;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return;
        }
        if (i < 0 || i > GLLibPlayer.s_TilesetLayerInfo[0][2]) {
            new StringBuffer().append("Tileset_SetTile: x value out of bound [").append(i).append("]  0 <= x < ").append(GLLibPlayer.s_TilesetLayerInfo[0][2]);
            return;
        }
        if (sub_59f0 < 0 || sub_59f0 > GLLibPlayer.s_TilesetLayerInfo[0][3]) {
            new StringBuffer().append("Tileset_SetTile: y value out of bound [").append(sub_59f0).append("]  0 <= y < ").append(GLLibPlayer.s_TilesetLayerInfo[0][3]);
            return;
        }
        i += sub_59f0 * GLLibPlayer.s_TilesetLayerInfo[0][2];
        if (n != -1) {
            sub_7a8a(0, 0, i, n);
        }
        sub_7a8a(0, 1, i, 0);
    }
    
    static final void sub_60d3(int n, int n2, final int n3, final int n4, final boolean b) {
        if (sub_386f(0, 4)) {
            sub_61f8(2, 0, null, 0, 0, 0, 0, n3, n4, 0, b, null);
            return;
        }
        final int n5 = 0 - sub_5b8b(0);
        n2 = 0 - sub_5c0b(0);
        n = n5;
        GLLib.FillRect(GLLib.g, n, n2, n3, n4, true);
    }
    
    static final void sub_6133(int var_1707, final ASprite class_e, final int n, final int n2, final int n3, final boolean b, final int[] array) {
        if (GLLibPlayer.var_1707 != 100) {
            GLLib.sub_5b71();
            var_1707 = GLLibPlayer.var_1707;
            GLLib.var_1fef[13][1] = var_1707;
            GLLib.sub_5c77(true);
        }
        if (sub_386f(0, 4)) {
            sub_61f8(0, 0, class_e, 0, n, n2, n3, 0, 0, 0, b, array);
        }
        else {
            class_e.sub_71ae(GLLib.g, n, n2 - sub_5b8b(0), n3 - sub_5c0b(0), 0);
        }
        if (GLLibPlayer.var_1707 != 100) {
            GLLib.sub_5c77(false);
            GLLib.sub_5b96();
        }
    }
    
    private static void sub_61f8(int var_1de7, int sub_31e6, Object o, int n, int n2, int sub_59f0, int n3, int n4, int sub_3238, int n5, final boolean b, int[] array) {
        final int n6 = var_1de7;
        final Object o2 = o;
        final int n7 = n2;
        final int n8 = sub_59f0;
        final int n9 = n3;
        final int n10 = n4;
        final int n11 = sub_3238;
        final int[] array2 = array;
        n5 = (b ? 1 : 0);
        n4 = n11;
        n3 = n10;
        sub_59f0 = n9;
        n2 = n8;
        n = n7;
        o = o2;
        var_1de7 = n6;
        if (sub_386f(0, 4) && (GLLibPlayer.var_16f7 != 0 || n5 != 0)) {
            array = GLLibPlayer.s_TilesetLayerInfo[0];
            sub_31e6 = 0;
            sub_3238 = 0;
            int sub_312c = 0;
            int sub_3239 = 0;
            if (var_1de7 == 0) {
                sub_31e6 = ((ASprite)o).sub_31e6(n);
                sub_3238 = ((ASprite)o).sub_3238(n);
                sub_312c = ((ASprite)o).sub_312c(n);
                sub_3239 = ((ASprite)o).sub_3189(n);
                if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                    final int n12 = GLLib.var_1fef[13][1];
                    sub_31e6 = sub_31e6 * n12 / 100;
                    sub_3238 = sub_3238 * n12 / 100;
                    sub_312c = sub_312c * n12 / 100;
                    sub_3239 = sub_3239 * n12 / 100;
                }
            }
            else if (var_1de7 == 1 || var_1de7 == 2 || var_1de7 == 3 || var_1de7 == 5 || var_1de7 == 4) {
                sub_312c = n3;
                sub_3239 = n4;
            }
            else {
                new StringBuffer().append("Tileset_PaintToBuffer: Invalid drawOperation set: ").append(var_1de7);
            }
            sub_59f0 = sub_59f0(0, sub_59f0);
            final int n13 = array[13];
            final int n14 = array[14];
            int n15;
            int n16;
            if (sub_386f(0, 256)) {
                n15 = array[2];
                n16 = array[3];
            }
            else {
                n15 = GLLibPlayer.var_16c7[2];
                n16 = GLLibPlayer.var_16c7[5];
            }
            int n17 = n13 % n15;
            int n18 = n14 % n16;
            if (n17 < 0) {
                n17 += n15;
            }
            if (n18 < 0) {
                n18 += n16;
            }
            int n19 = n13 - n17;
            int n20 = n14 - n18;
            n2 -= n19;
            sub_59f0 -= n20;
            if (sub_386f(0, 273) && n19 < 0) {
                n19 = array[7] + n19 % array[7];
            }
            if (sub_386f(0, 290) && n20 < 0) {
                n20 = array[8] + n20 % array[8];
            }
            final int n21 = n19 % array[7];
            final int n22 = n20 % array[8];
            final int n23 = array[7] - n21;
            final int n24 = array[8] - n22;
            final Graphics graphics = GLLibPlayer.s_TilesetLayerGraphics[0][0];
            final int var_10c7 = GLLibPlayer.s_TilesetLayerInfo[0][7];
            final int var_10cf = GLLibPlayer.s_TilesetLayerInfo[0][8];
            ASprite.var_10c7 = var_10c7;
            ASprite.var_10cf = var_10cf;
            final int sub_35c6 = GLLib.GetClip(graphics, true);
            final int sub_3240 = GLLib.sub_3600(graphics, true);
            final int sub_3241 = GLLib.sub_3643(graphics, true);
            final int sub_367d = GLLib.sub_367d(graphics, true);
            int var_16f7 = 1;
            if (n5 == 0) {
                var_16f7 = GLLibPlayer.var_16f7;
            }
            final int n25 = array[7];
            final int n26 = array[8];
            final int var_10c8 = ASprite.var_10c7;
            final int var_10cf2 = ASprite.var_10cf;
            final int var_10c9 = n25;
            final int var_10cf3 = n26;
            ASprite.var_10c7 = var_10c9;
            ASprite.var_10cf = var_10cf3;
            final int n27 = var_16f7;
            n2 += sub_31e6;
            sub_59f0 += sub_3238;
            final int n28 = n2 + sub_312c;
            final int n29 = sub_59f0 + sub_3239;
            int n30 = 0;
            int n31 = 0;
            int n32 = 0;
            int n33 = 0;
            if (array2 != null) {
                n30 = array2[0] - n19;
                n31 = array2[1] - n20;
                n32 = array2[2] - n19;
                n33 = array2[3] - n20;
            }
            for (int i = 0; i < 1; ++i) {
                final int n34 = n2;
                final int n35 = sub_59f0;
                final int n36 = n28;
                final int n37 = n29;
                for (int j = 0; j < 1; ++j) {
                    final int n38 = n34;
                    final int n39 = n35;
                    final int n40 = n36;
                    final int n41 = n37;
                    if (n38 <= n25 && n41 >= 0 && n40 >= 0 && n39 <= n26) {
                        int n42 = n27;
                        while (--n42 >= 0) {
                            int[] array3 = null;
                            if (n5 == 0) {
                                int n43 = (array3 = GLLibPlayer.var_16ef[0][n42])[0] - n21;
                                if (array3[0] < n21) {
                                    n43 += array[7];
                                }
                                if (n38 >= n43 + array3[2] || n40 < n43) {
                                    continue;
                                }
                                int n44 = array3[1] - n22;
                                if (array3[1] < n22) {
                                    n44 += array[8];
                                }
                                if (n39 >= n44 + array3[3] || n41 < n44) {
                                    continue;
                                }
                            }
                            if (n38 < n23 && (array2 == null || n30 < n23)) {
                                if (n39 < n24 && (array2 == null || n31 < n24)) {
                                    int n47;
                                    int n48;
                                    int n49;
                                    int n50;
                                    if (array2 != null) {
                                        final int n45 = (n30 > 0) ? n30 : 0;
                                        final int n46 = (n31 > 0) ? n31 : 0;
                                        n47 = ((n32 < n23) ? n32 : n23) - n45;
                                        n48 = ((n33 < n24) ? n33 : n24) - n46;
                                        n49 = n45 + n21;
                                        n50 = n46 + n22;
                                    }
                                    else {
                                        n49 = n21;
                                        n50 = n22;
                                        n47 = n23;
                                        n48 = n24;
                                    }
                                    sub_78bd(graphics, o, n, 0, n49, n50, n47, n48, n21 + n38 - sub_31e6, n22 + n39 - sub_3238, n3, n4, var_1de7, sub_35c6, sub_3240, sub_3241, sub_367d, array3, (boolean)(n5 != 0));
                                }
                                if (n41 >= n24 && n22 != 0 && (array2 == null || n33 >= n24)) {
                                    int n52;
                                    int n53;
                                    int n54;
                                    int n55;
                                    if (array2 != null) {
                                        final int n51 = (n30 > 0) ? n30 : 0;
                                        n52 = ((n31 - n24 > 0) ? (n31 - n24) : 0);
                                        n53 = ((n32 < n23) ? n32 : n23) - n51;
                                        n54 = ((n33 - n24 < n22) ? (n33 - n24) : n22) - n52;
                                        n55 = n51 + n21;
                                    }
                                    else {
                                        n55 = n21;
                                        n52 = 0;
                                        n53 = n23;
                                        n54 = n22;
                                    }
                                    sub_78bd(graphics, o, n, 0, n55, n52, n53, n54, n21 + n38 - sub_31e6, n39 - sub_3238 - n24, n3, n4, var_1de7, sub_35c6, sub_3240, sub_3241, sub_367d, array3, (boolean)(n5 != 0));
                                }
                            }
                            if (n40 >= n23 && n21 != 0 && (array2 == null || n32 >= n23)) {
                                if (n39 < n24 && (array2 == null || n31 < n24)) {
                                    int n56;
                                    int n58;
                                    int n59;
                                    int n60;
                                    if (array2 != null) {
                                        n56 = ((n30 - n23 > 0) ? (n30 - n23) : 0);
                                        final int n57 = (n31 > 0) ? n31 : 0;
                                        n58 = ((n32 - n23 < n21) ? (n32 - n23) : n21) - n56;
                                        n59 = ((n33 < n24) ? n33 : n24) - n57;
                                        n60 = n57 + n22;
                                    }
                                    else {
                                        n56 = 0;
                                        n60 = n22;
                                        n58 = n21;
                                        n59 = n24;
                                    }
                                    sub_78bd(graphics, o, n, 0, n56, n60, n58, n59, n38 - sub_31e6 - n23, n22 + n39 - sub_3238, n3, n4, var_1de7, sub_35c6, sub_3240, sub_3241, sub_367d, array3, (boolean)(n5 != 0));
                                }
                                if (n41 < n24 || n22 == 0 || (array2 != null && n33 < n24)) {
                                    continue;
                                }
                                int n61;
                                int n62;
                                int n63;
                                int n64;
                                if (array2 != null) {
                                    n61 = ((n30 - n23 > 0) ? (n30 - n23) : 0);
                                    n62 = ((n31 - n24 > 0) ? (n31 - n24) : 0);
                                    n63 = ((n32 - n23 < n21) ? (n32 - n23) : n21) - n61;
                                    n64 = ((n33 - n24 < n22) ? (n33 - n24) : n22) - n62;
                                }
                                else {
                                    n61 = 0;
                                    n62 = 0;
                                    n63 = n21;
                                    n64 = n22;
                                }
                                sub_78bd(graphics, o, n, 0, n61, n62, n63, n64, n38 - sub_31e6 - n23, n39 - sub_3238 - n24, n3, n4, var_1de7, sub_35c6, sub_3240, sub_3241, sub_367d, array3, (boolean)(n5 != 0));
                            }
                        }
                    }
                }
            }
            final Graphics graphics2 = graphics;
            final int n65 = sub_35c6;
            final int n66 = sub_3240;
            final int n67 = sub_3241;
            n = sub_367d;
            final int n68 = n67;
            sub_31e6 = n66;
            var_1de7 = n65;
            GLLib.sub_36f4(graphics2, n65, sub_31e6, n68, n, true);
            final int var_10c10 = var_10c8;
            var_1de7 = var_10cf2;
            ASprite.var_10c7 = var_10c10;
            ASprite.var_10cf = var_1de7;
            final int var_1ddf = GLLib.s_screenWidth;
            var_1de7 = GLLib.s_screenHeight;
            ASprite.var_10c7 = var_1ddf;
            ASprite.var_10cf = var_1de7;
        }
    }
    
    private static void sub_78bd(final Graphics graphics, final Object o, int n, final int n2, final int n3, int n4, int n5, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int[] array, final boolean b) {
        GLLib.sub_36b7(graphics, n3, n4, n5, n6, true);
        if (!b) {
            final int n16 = array[0];
            final int n17 = array[1];
            final int n18 = array[2];
            final int n19 = array[3];
            n6 = n18;
            n5 = n17;
            n4 = n16;
            GLLib.sub_36b7(graphics, n16, n5, n6, n19, true);
        }
        if (n11 == 0) {
            ((ASprite)o).sub_71d4(graphics, n, n7, n8, n2);
        }
        else if (n11 == 5) {
            n = n7;
            n7 = ASprite.var_10cf - n8 - n10;
            GLLib.sub_3bae(graphics, (int[])o, 0, n10, n7, n, n10, n9, true, false, n2, -1, false);
        }
        else if (n11 == 4) {
            GLLib.sub_38df(graphics, (GLLibImage)o, n7, n8, 20, true);
        }
        else if (n11 == 1) {
            GLLib.sub_37b0(graphics, n7, n8, n9, n10, true);
        }
        else if (n11 == 2) {
            GLLib.FillRect(graphics, n7, n8, n9, n10, true);
        }
        else if (n11 == 3) {
            GLLib.sub_57eb(graphics, n7, n8, n9, n10);
        }
        GLLib.sub_36f4(graphics, n12, n13, n14, n15, true);
    }
    
    private static final void sub_7a8a(final int n, int n2, int n3, final int n4) {
        GLLibPlayer.s_TilesetLayerData[0][n2][n3] = (byte)n4;
    }
    
    private static int sub_7ab4(final int n, final int n2, final int n3, final boolean b) {
        return GLLibPlayer.s_TilesetLayerData[n][n2][n3] & 0xFF;
    }
    
    private static void sub_7adc(final int n, int var_1de7, int n2, int n3, int n4) {
        final Graphics graphics;
        (graphics = GLLibPlayer.s_TilesetLayerGraphics[n][0]).setColor(GLLibPlayer.s_TilesetLayerInfo[n][4]);
        final int var_10c7 = GLLibPlayer.s_TilesetLayerInfo[n][7];
        final int var_10cf = GLLibPlayer.s_TilesetLayerInfo[n][8];
        ASprite.var_10c7 = var_10c7;
        ASprite.var_10cf = var_10cf;
        if ((var_1de7 %= var_10c7) < 0) {
            var_1de7 += var_10c7;
        }
        if ((n2 %= var_10cf) < 0) {
            n2 += var_10cf;
        }
        if (var_1de7 + n3 > var_10c7) {
            int n5 = n4;
            if (n2 + n4 > var_10cf) {
                GLLib.FillRect(graphics, 0, 0, var_1de7 + n3 - var_10c7, n2 + n4 - var_10cf, true);
                sub_59b2(n, 0, 0, var_1de7 + n3 - var_10c7, n2 + n4 - var_10cf);
                n5 = var_10cf - n2;
            }
            GLLib.FillRect(graphics, 0, n2, var_1de7 + n3 - var_10c7, n5, true);
            sub_59b2(n, 0, n2, var_1de7 + n3 - var_10c7, n5);
            n3 = var_10c7 - var_1de7;
        }
        if (n2 + n4 > var_10cf) {
            GLLib.FillRect(graphics, var_1de7, 0, n3, n2 + n4 - var_10cf, true);
            sub_59b2(n, var_1de7, 0, n3, n2 + n4 - var_10cf);
            n4 = var_10cf - n2;
        }
        GLLib.FillRect(graphics, var_1de7, n2, n3, n4, true);
        sub_59b2(n, var_1de7, n2, n3, n4);
        final int var_1ddf = GLLib.s_screenWidth;
        var_1de7 = GLLib.s_screenHeight;
        ASprite.var_10c7 = var_1ddf;
        ASprite.var_10cf = var_1de7;
    }
    
    static {
        GLLibPlayer.var_15c7 = 50;
        k_snd_nbChannel = 1;
        GLLibPlayer.s_bTilesetPlayerInitialized = false;
        GLLibPlayer.s_TilesetMaxLayerCount = 4;
        var_16b7 = 20;
        var_16bf = 6;
        GLLibPlayer.var_1707 = 100;
    }
}
