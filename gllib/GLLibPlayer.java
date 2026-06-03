
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
    private int curFrame;
    private int curTime;
    private int k_animBaseFrameTime;
    private int nbLoop;
    private boolean animIsOver;
    private int curScale;
    private static int defaultFrameTime;
    private int palette;
    private static final int k_snd_nbChannel;
    static int s_snd_masterVolume;
    private static int s_snd_maxNbSoundSlot;
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
    private static boolean s_snd_bInUpdate;
    private static int[] s_snd_requestBuffer;
    private static int[] s_snd_fade;
    private static int[] s_snd_fadeTempo;
    private static int[] s_snd_fadeMidi;
    private static int[] s_snd_MidiChannelActiveFlags;
    private static boolean[] s_snd_fadeParamsNeedRefresh;
    private static int[] s_snd_fadeLoopingFixState;
    private static int s_snd_fadeDeltaTime;
    private static boolean s_bTilesetPlayerInitialized;
    private static int s_TilesetMaxLayerCount;
    private static final int k_TilesetLayerCOUNT;
    private static final int k_TilesetLayerAreaCount;
    private static int[] s_TilesetInfo;
    private static int[][] s_TilesetLayerInfo;
    private static byte[][][] s_TilesetLayerData;
    private static ImageG[][] s_TilesetLayerImage;
    static Graphics[][] s_TilesetLayerGraphics;
    private static int[][][] s_TilesetLayerLastUpdatedArea;
    private static int s_TilesetLayerLastUpdatedAreaIndex;
    private static ASprite[] s_TilesetSprite;
    private static int curExtraScale;
    
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
        this.curFrame = 0;
        this.sprite = null;
        this.curFlags = 0;
        this.curTime = 0;
        this.nbLoop = 1;
        this.palette = -1;
        this.animIsOver = true;
        this.curScale = -1;
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
    
    final void SetAnim(final int anim, final int nbLoop, final boolean b) {
        if (b) {
            this.SetAnim(-1, 1);
        }
        this.SetAnim(anim, nbLoop);
    }
    
    final void SetAnim(int anim, final int nbLoop) {
		if (this.sprite == null) {
            GLLib.Assert(false, "GLLibPlayer.SetAnim().sprite is not set");
        }
        if (nbLoop == 0) {
            GLLib.Assert(false, "GLLibPlayer.SetAnim().nbLoop is invalid");
        }
        if (this.animIsOver || anim != this.curAnim) {
            this.curAnim = anim;
            this.k_animBaseFrameTime = GLLibPlayer.defaultFrameTime;
            if (this.curAnim >= 0) {
                this.curFrame = 0 % this.GetNbFrame();
                this.curTime = 0;
            }
            this.nbLoop = nbLoop - 1;
            this.animIsOver = false;
        }
    }
    
    final int GetAnim() {
        return this.curAnim;
    }
    
    final void RandomizeAnim() {
        this.curFrame = GLLib.Math_Rand(0, this.GetNbFrame());
        this.curTime = 0;
    }
    
    final int GetFrame() {
        return this.curFrame;
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
    
    final void SetPalette(final int palette) {
        this.palette = palette;
    }
    
    final int GetNumLoops() {
        return this.nbLoop;
    }
    
    private int GetNbFrame() {
		if (this.sprite == null) {
            GLLib.Assert(false, "GLLibPlayer.GetNbFrame().sprite is not set");
        }
        if (this.curAnim >= 0) {
            return this.sprite.GetAFrames(this.curAnim);
        }
        return -1;
    }
    
    private int GetDuration() {
		if (this.sprite == null) {
            GLLib.Assert(false, "GLLibPlayer.GetDuration().sprite is not set");
        }
        if (this.curAnim >= 0) {
            return this.sprite.GetAFrameTime(this.curAnim, this.curFrame) * this.k_animBaseFrameTime;
        }
        return 0;
    }
    
    final boolean IsAnimOver() {
		if (this.sprite == null) {
            GLLib.Assert(false, "GLLibPlayer.isAnimOver().sprite is not set");
        }
        return this.curAnim < 0 || (this.nbLoop >= 0 && this.animIsOver);
    }
    
    final void Render() {
		if (this.sprite == null) {
            GLLib.Assert(false, "GLLibPlayer.render().sprite is not set");
        }
        if (this.curAnim < 0) {
            return;
        }
        if (this.animIsOver) {
            return;
        }
        boolean disableEffects = false;
        if (this.curScale != -1 && this.curScale != 100 && (GLLib.s_PFX_type & 0x2000) == 0x0) {
            disableEffects = true;
            GLLib.PFX_EnableScaleEffect();
            GLLib.PFX_Scale_SetScale(this.curScale);
        }
        if (this.palette != -1) {
            final int savePal = this.sprite.GetCurrentPalette();
            this.sprite.SetCurrentPalette(this.palette);
            this.sprite.PaintAFrame(GLLib.g, this.curAnim, this.curFrame, this.posX, this.posY, this.curFlags);
            this.sprite.SetCurrentPalette(savePal);
        }
        else {
            this.sprite.PaintAFrame(GLLib.g, this.curAnim, this.curFrame, this.posX, this.posY, this.curFlags);
        }
        if (disableEffects) {
            GLLib.s_PFX_type &= 0xFFF0081F;
        }
    }
    
    final void Update(final int DT) {
		if (DT < 0) {
            GLLib.Assert(false, "GLLibPlayer.Update.DT is negative");
        }
		else if (DT == 1) {
            GLLib.Warning("GLLibPlayer.Update was called with DT equal 1, the player is currently working as a Time Based Player, it should be more than 1 ms ?");
        }
        if (this.animIsOver || this.curAnim < 0) {
            return;
        }
        int duration = this.GetDuration();
        if (duration == 0) {
            GLLib.Assert(false, "GLLibPlayer.Update.frame " + this.curFrame + " of animation " + this.curAnim + " has a duration of 0");
        }
        while (this.curTime >= duration) {
            this.curTime -= duration;
            if (this.curFrame < this.sprite.GetAFrames(this.curAnim) - 1) {
                ++this.curFrame;
            }
            else {
                if (this.nbLoop == 0) {
                    this.animIsOver = true;
                    break;
                }
                if (this.nbLoop > 0) {
                    --this.nbLoop;
                }
                this.curFrame = 0;
            }
            duration = this.GetDuration();
            if (duration == 0) {
                GLLib.Assert(false, "GLLibPlayer.Update.frame " + this.curFrame + " of animation " + this.curAnim + " has a duration of 0");
				break; // if necessary
            }
        }
        this.curTime += DT;
    }
    
    final void SetScale(final int scale) {
        this.curScale = scale;
    }
    
    static final Player Snd_GetChannelPlayer(final int channel) {
        if (channel < 0) {
            GLLib.Assert(false, "Snd_GetChannelPlayer: Index is negative [" + channel + "]");
        }
        if (channel >= GLLibPlayer.k_snd_nbChannel) {
            GLLib.Assert(false, "Snd_GetChannelPlayer: Index [" + channel + "] is out of range. Max channels is " + GLLibPlayer.k_snd_nbChannel);
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
    
    private static synchronized void SndQueue_Push_Normal(int channel, int command, int index, int priority, int volume, final int loop) {
		if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (GLLibPlayer.s_snd_queue_size[channel] >= 7) {
            GLLib.Assert(false, "SndQueue_Push: Too many sound requests given before Snd_Update!");
        }
		// don't wanna indent
        if (true) {
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
        SndQueue_Push_Normal(channel, command, index, priority, volume, loop);
    }
    
    private static synchronized void SndQueue_Pop(int channel, final int[] channelInfo) {
        channelInfo[5] = GLLibPlayer.s_snd_queue_size[channel];
        if (GLLibPlayer.s_snd_queue_size[channel] > 0) {
            System.arraycopy(GLLibPlayer.s_snd_queue, channel * 7 * 5 + GLLibPlayer.s_snd_queue_pointer[channel] * 5, channelInfo, 0, 5);
            GLLibPlayer.s_snd_queue_pointer[channel] = SndQueue_NormalizeIndex(GLLibPlayer.s_snd_queue_pointer[channel] + 1);
            --s_snd_queue_size[channel];
        }
    }
    
    static void Snd_Init(int nbSoundSlot) {
		GLLib.Dbg("SOUND : Init : JSR135");
        GLLibPlayer.s_snd_Player = new Player[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_index = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_priority = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_state = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_volume = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_loop = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_queue = new int[GLLibPlayer.k_snd_nbChannel * 7 * 5];
        GLLibPlayer.s_snd_queue_pointer = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_queue_size = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_requestBuffer = new int[6];
        GLLibPlayer.s_snd_fade = new int[GLLibPlayer.k_snd_nbChannel * 3];
        GLLibPlayer.s_snd_fadeTempo = new int[GLLibPlayer.k_snd_nbChannel * 3];
        GLLibPlayer.s_snd_fadeMidi = new int[(GLLibPlayer.k_snd_nbChannel << 4) * 9];
        GLLibPlayer.s_snd_MidiChannelActiveFlags = new int[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_fadeParamsNeedRefresh = new boolean[GLLibPlayer.k_snd_nbChannel];
        GLLibPlayer.s_snd_fadeLoopingFixState = new int[GLLibPlayer.k_snd_nbChannel];
        int n;
        for (nbSoundSlot = 0; nbSoundSlot < GLLibPlayer.k_snd_nbChannel; ++nbSoundSlot) {
            GLLibPlayer.s_snd_MidiChannelActiveFlags[nbSoundSlot] = 0;
            GLLibPlayer.s_snd_fade[nbSoundSlot * 3] = 0;
            GLLibPlayer.s_snd_fadeTempo[nbSoundSlot * 3] = 0;
            GLLibPlayer.s_snd_fadeParamsNeedRefresh[nbSoundSlot] = false;
            for (int j = 0; j < 16; ++j) {
                n = ((nbSoundSlot << 4) + j) * 9;
                GLLibPlayer.s_snd_fadeMidi[n] = 0;
                GLLibPlayer.s_snd_fadeMidi[n + 3] = 127;
            }
            GLLibPlayer.s_snd_fadeLoopingFixState[nbSoundSlot] = 0;
        }
        GLLibPlayer.s_snd_fadeDeltaTime = 0;
        for (nbSoundSlot = 0; nbSoundSlot < GLLibPlayer.k_snd_nbChannel; ++nbSoundSlot) {
            GLLibPlayer.s_snd_index[nbSoundSlot] = -1;
            GLLibPlayer.s_snd_queue_pointer[nbSoundSlot] = 0;
            GLLibPlayer.s_snd_queue_size[nbSoundSlot] = 0;
        }
        GLLibPlayer.s_snd_sndSlot = new byte[GLLibPlayer.s_snd_maxNbSoundSlot = 119][];
        GLLibPlayer.s_snd_sndType = new int[GLLibPlayer.s_snd_maxNbSoundSlot];
        GLLibPlayer.s_snd_masterVolume = 100;
        GLLibPlayer.s_snd_isSoundEngineInitialized = true;
        GLLibPlayer.s_pSoundPlayerIns = new GLLibPlayer();
        (GLLibPlayer.s_pThread = new Thread(GLLibPlayer.s_pSoundPlayerIns)).start();
    }
    
    static void Snd_LoadSound(final String dataFileName, int resourceIndex, final boolean bCacheThisSound) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (resourceIndex >= GLLibPlayer.s_snd_sndSlot.length) {
            GLLib.Assert(false, "resourceIndex is larger that slot count. Read the Warning in the doc.");
        }
        if (resourceIndex < 0) {
            return;
        }
        if (GLLibPlayer.s_snd_sndSlot == null) {
            GLLib.Assert(false, "Snd_LoadSound.snd not correctly initialized");
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
    
    static boolean Snd_IsLoaded(final int index) {
        return GLLibPlayer.s_snd_sndSlot != null && index < GLLibPlayer.s_snd_sndSlot.length && GLLibPlayer.s_snd_sndSlot[index] != null;
    }
    
    static void Snd_UnLoadSound(final int index) {
		if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (GLLibPlayer.s_snd_sndSlot == null) {
            GLLib.Assert(false, "Snd_unLoadSound.array is not initialised");
        }
        if (index < 0) {
            return;
        }
        GLLibPlayer.s_snd_sndSlot[index] = null;
        System.gc();
    }
    
    static void Snd_Play(final int channel, final int index, final int loop, final int volume, final int priority) {
        if (loop < 0) {
            GLLib.Assert(false, "Snd_Play: Invalid loop number of " + loop);
        }
        if (channel >= GLLibPlayer.k_snd_nbChannel) {
            GLLib.Assert(false, "Snd_Play: Attempting to play on channel " + channel + " while only have max " + GLLibPlayer.k_snd_nbChannel);
        }
        if (index < 0 || volume == 0) {
            return;
        }
        SndQueue_Push(channel, 3, index, priority, volume, loop);
    }
    
    // Just a speculation on stopMidiChannels since the function was merged
    static final void Snd_Stop(int channel, final boolean stopMidiChannels) {
        SndQueue_Push(channel, 4, -1, -1, -1, -1);
        Snd_FadeCommand(0, channel);
        Snd_FadeTempoCommand(0, channel);
        for (channel = 0; channel < 16; ++channel) {
            Snd_FadeMidiCommand(0, channel, channel, 0);
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
            GLLib.Dbg("    ERROR.player is null 1092");
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
                Snd_SetChannelVolume(volume, GLLibPlayer.s_snd_volume[volume]);
            }
        }
        catch (final Exception ex) {}
    }
    
    private static int Snd_GetChannelVolume(final int channel) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return 0;
        }
        try {
            if (GLLibPlayer.s_snd_Player[channel] == null) {
                return 0;
            }
            return ((VolumeControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("VolumeControl")).getLevel() * 100 * 100 / (GLLibPlayer.s_snd_masterVolume * 100);
        }
        catch (final Exception ex) {}
        return 0;
    }
    
    private static void Snd_SetChannelVolume(final int channel, final int volume) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized || GLLibPlayer.s_snd_Player[channel] == null) {
            return;
        }
        try {
            if (GLLibPlayer.s_snd_Player[channel] != null) {
                ((VolumeControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("VolumeControl")).setLevel(volume * GLLibPlayer.s_snd_masterVolume * 100 / 10000);
            }
        }
        catch (final Exception ex) {}
    }
    
    private static void Snd_Update_Exec() {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return;
        }
        if (GLLibPlayer.s_snd_bInUpdate) {
            return;
        }
        GLLibPlayer.s_snd_bInUpdate = true;
        for (int channel = 0; channel < GLLibPlayer.k_snd_nbChannel; ++channel) {
            SndQueue_Pop(channel, GLLibPlayer.s_snd_requestBuffer);
            if (GLLibPlayer.s_snd_requestBuffer[5] > 0) {
                if (GLLibPlayer.s_snd_state[channel] == 2) {
                    boolean isPlaying;
                    try {
                        isPlaying = Snd_IsPlaying(channel);
                    }
                    catch (final Exception e) {
                        GLLib.Assert(false, "Snd_update.error on channel (" + channel + ")." + e);
                        isPlaying = false;
                    }
                    if (!isPlaying) {
                        GLLibPlayer.s_snd_state[channel] = 1;
                    }
                }
                while (GLLibPlayer.s_snd_requestBuffer[5] > 0) {
                    try {
                        switch (GLLibPlayer.s_snd_requestBuffer[0]) {
                            case 1: {
                                Snd_PrepareExec(channel, GLLibPlayer.s_snd_requestBuffer[1], GLLibPlayer.s_snd_requestBuffer[2]);
                                break;
                            }
                            case 2: {
                                Snd_FreeChannelExec(channel);
                                break;
                            }
                            case 3: {
                                Snd_PlayExec(channel, GLLibPlayer.s_snd_requestBuffer[1], GLLibPlayer.s_snd_requestBuffer[2], GLLibPlayer.s_snd_requestBuffer[4], GLLibPlayer.s_snd_requestBuffer[3]);
                                break;
                            }
                            case 4: {
                                if (GLLibPlayer.s_snd_Player[channel] != null) {
                                    GLLibPlayer.s_snd_Player[channel].stop();
                                    GLLibPlayer.s_snd_state[channel] = 1;
                                }
                                break;
                            }
                            case 5: {
                                if (GLLibPlayer.s_snd_state[channel] == 2 && GLLibPlayer.s_snd_Player[channel] != null) {
                                    GLLibPlayer.s_snd_Player[channel].getState();
                                    GLLibPlayer.s_snd_Player[channel].stop();
                                    GLLibPlayer.s_snd_state[channel] = 3;
                                }
                                break;
                            }
                            case 6: {
                                if (GLLibPlayer.s_snd_state[channel] == 3 && GLLibPlayer.s_snd_Player[channel] != null) {
                                    GLLibPlayer.s_snd_Player[channel].start();
                                    GLLibPlayer.s_snd_state[channel] = 2;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    catch (final Exception e2) {
						GLLib.Dbg("Snd_update.error on channel (" + channel + ")." + e2);
                        e2.printStackTrace();
                    }
                    SndQueue_Pop(channel, GLLibPlayer.s_snd_requestBuffer);
                }
            }
            SndFade_Update(channel);
        }
        GLLibPlayer.s_snd_bInUpdate = false;
    }
    
    public final void run() {
        while (GLLibPlayer.s_pThread != null) {
            Snd_Update_Exec();
            try {
                Thread.sleep(50); // FPSLimiter is also 20?
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
        GLLibPlayer.s_snd_fadeMidi[((channel << 4) + MIDIChannel) * 9 + 3] = volume;
        final MIDIControl midiControl;
        if ((midiControl = (MIDIControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("MIDIControl")) != null) {
            midiControl.shortMidiEvent(0xB0 | MIDIChannel, 7, volume);
            return true;
        }
        return false;
    }
    
    private static int Snd_TempoGet(final int channel) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return -1;
        }
        try {
            final TempoControl tempoControl;
            if ((tempoControl = (TempoControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("TempoControl")) != null) {
                return tempoControl.getTempo();
            }
        }
        catch (final Exception ex) {}
        return -1;
    }
    
    private static boolean Snd_TempoSet(final int channel, final int tempo) {
        if (!GLLibPlayer.s_snd_isSoundEngineInitialized) {
            return false;
        }
        final TempoControl tempoControl;
        if ((tempoControl = (TempoControl)((Controllable)GLLibPlayer.s_snd_Player[channel]).getControl("TempoControl")) != null) {
            tempoControl.setTempo(tempo);
            return true;
        }
        return false;
    }
    
    private static void Snd_FadeCommand(int idx, final int channel) {
        idx = channel * 3;
        GLLibPlayer.s_snd_fade[idx] = 0;
        GLLibPlayer.s_snd_fade[idx + 1] = 0;
        GLLibPlayer.s_snd_fade[idx + 2] = 0;
    }
    
    private static void Snd_FadeTempoCommand(final int fadeCommand, int channel) {
        channel *= 3;
        GLLibPlayer.s_snd_fadeTempo[channel] = fadeCommand;
        if (fadeCommand != 1) {
            GLLibPlayer.s_snd_fadeTempo[channel + 1] = 0;
            GLLibPlayer.s_snd_fadeTempo[channel + 2] = 0;
        }
    }
    
    private static void Snd_FadeMidiCommand(final int fadeCommand, final int channel, final int midiChannel, int idx) {
        idx = ((channel << 4) + midiChannel) * 9;
        GLLibPlayer.s_snd_fadeMidi[idx] = fadeCommand;
        if (fadeCommand == 0 || fadeCommand == 1) {
            final int[] s_snd_MidiChannelActiveFlags = GLLibPlayer.s_snd_MidiChannelActiveFlags;
            s_snd_MidiChannelActiveFlags[channel] &= ~(1 << midiChannel);
            return;
        }
        GLLibPlayer.s_snd_fadeMidi[idx + 1] = 0;
        GLLibPlayer.s_snd_fadeMidi[idx + 2] = 0;
        final int[] s_snd_MidiChannelActiveFlags2 = GLLibPlayer.s_snd_MidiChannelActiveFlags;
        s_snd_MidiChannelActiveFlags2[channel] |= 1 << midiChannel;
    }
    
    private static void SndFade_Update(final int channel) {
        if ((GLLibPlayer.s_snd_fadeDeltaTime += GLLib.s_game_frameDT) < 0) {
            return;
        }
        final int deltaTime = GLLibPlayer.s_snd_fadeDeltaTime;
        GLLibPlayer.s_snd_fadeDeltaTime = 0;
        final long mediaTime;
        if ((mediaTime = Snd_MediaTimeGet(channel)) >= 0L && mediaTime <= deltaTime * 1000) {
            GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel] = true;
        }
        try {
            if (!Snd_IsPlaying(channel)) {
                if (!GLLib.s_game_isPaused && GLLibPlayer.s_snd_loop[channel] == 0 && GLLibPlayer.s_snd_fadeLoopingFixState[channel] < 3) {
                    switch (GLLibPlayer.s_snd_fadeLoopingFixState[channel]) {
                        case 0: {
                            if (GLLibPlayer.s_snd_state[channel] == 2) {
                                GLLibPlayer.s_snd_fadeLoopingFixState[channel] = 1;
                                GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel] = true;
                                return;
                            }
                            break;
                        }
                        case 1: {
                            GLLibPlayer.s_snd_fadeLoopingFixState[channel] = 2;
                            GLLibPlayer.s_snd_Player[channel].stop();
                            GLLibPlayer.s_snd_state[channel] = 1;
                            return;
                        }
                        case 2: {
                            Snd_PlayExec(channel, GLLibPlayer.s_snd_index[channel], GLLibPlayer.s_snd_priority[channel], 0, GLLibPlayer.s_snd_volume[channel]);
                            GLLibPlayer.s_snd_fadeLoopingFixState[channel] = 3;
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
        GLLibPlayer.s_snd_fadeLoopingFixState[channel] = 0;
        final int idx = channel * 3;
        final int cmd;
        if ((cmd = GLLibPlayer.s_snd_fade[idx]) != 0 && cmd != 1) {
            final int finalVolume = GLLibPlayer.s_snd_fade[idx + 1];
            int volume;
            try {
                final int curVolume = Snd_GetChannelVolume(channel);
                final int delta = (1 > GLLibPlayer.s_snd_fade[idx + 2] * deltaTime / 1000) ? 1 : (GLLibPlayer.s_snd_fade[idx + 2] * deltaTime / 1000);
                volume = ((curVolume < finalVolume) ? ((finalVolume < curVolume + delta) ? finalVolume : (curVolume + delta)) : ((finalVolume > curVolume - delta) ? finalVolume : (curVolume - delta)));
                Snd_SetChannelVolume(channel, volume);
            }
            catch (final Exception ex2) {
                volume = finalVolume;
            }
            if (volume == finalVolume) {
                if (cmd == 4) {
                    Snd_Stop(channel, true);
                }
                Snd_FadeCommand(0, channel);
            }
        }
        final int cmd2;
        if ((cmd2 = GLLibPlayer.s_snd_fadeTempo[idx]) != 0 && cmd2 != 1) {
            final int finalTempo = GLLibPlayer.s_snd_fadeTempo[idx + 1];
            int tempo = -1;
            try {
                tempo = Snd_TempoGet(channel);
                final int delta = (1 > GLLibPlayer.s_snd_fadeTempo[idx + 2] * deltaTime / 1000) ? 1 : (GLLibPlayer.s_snd_fadeTempo[idx + 2] * deltaTime / 1000);
                tempo = ((tempo < finalTempo) ? ((finalTempo < tempo + delta) ? finalTempo : (tempo + delta)) : ((finalTempo > tempo - delta) ? finalTempo : (tempo - delta)));
                Snd_TempoSet(channel, tempo);
            }
            catch (final Exception ex3) {
                Snd_FadeTempoCommand(0, channel);
            }
            if (tempo < 0 || ((tempo - finalTempo < 0) ? (-(tempo - finalTempo)) : (tempo - finalTempo)) < 500) {
                Snd_FadeTempoCommand(1, channel);
            }
        }
        else if (GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel] && cmd2 == 1) {
            try {
                final int finalTempo = GLLibPlayer.s_snd_fadeTempo[idx + 1];
                final int tempo;
                if ((((tempo = Snd_TempoGet(channel)) - finalTempo < 0) ? (-(tempo - finalTempo)) : (tempo - finalTempo)) >= 500) {
                    Snd_TempoSet(channel, finalTempo);
                }
            }
            catch (final Exception ex4) {}
        }
        if (GLLibPlayer.s_snd_MidiChannelActiveFlags[channel] == 0 && !GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel]) {
            return;
        }
        for (int i = 0; i < 16; ++i) {
            if ((GLLibPlayer.s_snd_MidiChannelActiveFlags[channel] & 1 << i) != 0x0 || GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel]) {
                final int idx2 = ((channel << 4) + i) * 9;
                final int cmd3;
                switch (cmd3 = GLLibPlayer.s_snd_fadeMidi[idx2]) {
                    case 1: {
                        if (GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel]) {
                            final int finalVolume2 = GLLibPlayer.s_snd_fadeMidi[idx2 + 1];
                            try {
                                Snd_MidiSetChannelVolume(channel, i, finalVolume2);
                            }
                            catch (final Exception ex5) {}
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final int finalVolume2 = GLLibPlayer.s_snd_fadeMidi[idx2 + 1];
                        final int volume2 = GLLibPlayer.s_snd_fadeMidi[idx2 + 3];
                        final int delta2 = (1 > GLLibPlayer.s_snd_fadeMidi[idx2 + 2] * deltaTime / 1000) ? 1 : (GLLibPlayer.s_snd_fadeMidi[idx2 + 2] * deltaTime / 1000);
                        int volumeNew2 = (volume2 < finalVolume2) ? ((finalVolume2 < volume2 + delta2) ? finalVolume2 : (volume2 + delta2)) : ((finalVolume2 > volume2 - delta2) ? finalVolume2 : (volume2 - delta2));
                        try {
                            Snd_MidiSetChannelVolume(channel, i, volumeNew2);
                        }
                        catch (final Exception ex6) {
                            volumeNew2 = finalVolume2;
                        }
                        if (volumeNew2 == finalVolume2) {
                            Snd_FadeMidiCommand(1, channel, i, 0);
                            break;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        final int finalVolume2 = (cmd3 == 6) ? GLLibPlayer.s_snd_fadeMidi[idx2 + 1] : 0;
                        final int volume2;
                        if ((volume2 = GLLibPlayer.s_snd_fadeMidi[idx2 + 3]) != finalVolume2) {
                            final int delta2 = (1 > GLLibPlayer.s_snd_fadeMidi[idx2 + 2] * deltaTime / 1000) ? 1 : (GLLibPlayer.s_snd_fadeMidi[idx2 + 2] * deltaTime / 1000);
                            final int volumeNew2 = (volume2 < finalVolume2) ? ((finalVolume2 < volume2 + delta2) ? finalVolume2 : (volume2 + delta2)) : ((finalVolume2 > volume2 - delta2) ? finalVolume2 : (volume2 - delta2));
                            try {
                                Snd_MidiSetChannelVolume(channel, i, volumeNew2);
                            }
                            catch (final Exception ex7) {}
                        }
                        final int[] s_snd_fadeMidi = GLLibPlayer.s_snd_fadeMidi;
                        final int n = idx2 + 8;
                        s_snd_fadeMidi[n] -= deltaTime;
                        if (GLLibPlayer.s_snd_fadeMidi[idx2 + 8] > 0) {
                            break;
                        }
                        final int idx3 = ((channel << 4) + i) * 9;
                        final int cmd4;
                        if ((cmd4 = GLLibPlayer.s_snd_fadeMidi[idx3]) != 6 && cmd4 != 7) {
                            break;
                        }
                        if (cmd3 == 7) {
                            GLLibPlayer.s_snd_fadeMidi[idx3] = 6;
                            GLLibPlayer.s_snd_fadeMidi[idx3 + 8] = GLLib.Math_Rand(GLLibPlayer.s_snd_fadeMidi[idx3 + 4], GLLibPlayer.s_snd_fadeMidi[idx3 + 5] + 1);
                            break;
                        }
                        GLLibPlayer.s_snd_fadeMidi[idx3] = 7;
                        GLLibPlayer.s_snd_fadeMidi[idx3 + 8] = GLLib.Math_Rand(GLLibPlayer.s_snd_fadeMidi[idx3 + 6], GLLibPlayer.s_snd_fadeMidi[idx3 + 7] + 1);
                        break;
                    }
                }
            }
        }
        GLLibPlayer.s_snd_fadeParamsNeedRefresh[channel] = false;
    }
    
    static void Snd_PauseNotify() {
        try {
            for (int channel = 0; channel < GLLibPlayer.k_snd_nbChannel; ++channel) {
                Snd_Stop(channel, true);
            }
            if (GLLib.s_game_isPaused) {
                Snd_Update_Exec();
            }
            if (GLLib.s_game_isPaused) {
                Snd_Update_Exec();
            }
        }
        catch (final Exception ex) {}
    }
    
    static void Tileset_Init(final int nDestWidth, final int nDestHeight, final int nTileWidth, final int nTileHeight) {
        GLLibPlayer.s_TilesetInfo = new int[8];
        GLLibPlayer.s_TilesetLayerInfo = new int[GLLibPlayer.s_TilesetMaxLayerCount][GLLibPlayer.k_TilesetLayerCOUNT];
        GLLibPlayer.s_TilesetLayerImage = new ImageG[GLLibPlayer.s_TilesetMaxLayerCount][1];
        GLLibPlayer.s_TilesetLayerGraphics = new Graphics[GLLibPlayer.s_TilesetMaxLayerCount][1];
        if (nTileWidth > 0 && nTileHeight > 0) {
            GLLibPlayer.s_TilesetLayerData = new byte[GLLibPlayer.s_TilesetMaxLayerCount][2][];
            GLLibPlayer.s_TilesetSprite = new ASprite[GLLibPlayer.s_TilesetMaxLayerCount];
            GLLibPlayer.s_TilesetInfo[2] = nTileWidth;
            GLLibPlayer.s_TilesetInfo[4] = 0;
            GLLibPlayer.s_TilesetInfo[5] = nTileHeight;
            GLLibPlayer.s_TilesetInfo[7] = 0;
        }
        GLLibPlayer.s_TilesetLayerLastUpdatedArea = new int[GLLibPlayer.s_TilesetMaxLayerCount][GLLibPlayer.k_TilesetLayerAreaCount][4];
        GLLibPlayer.s_TilesetInfo[0] = nDestWidth;
        GLLibPlayer.s_TilesetInfo[1] = nDestHeight;
        GLLibPlayer.s_bTilesetPlayerInitialized = true;
    }
    
    private static void Tileset_Buffer_CalculateSize(int nLayer) {
        nLayer = 0;
        nLayer = GLLibPlayer.s_TilesetLayerInfo[0][18];
        final int n2 = GLLibPlayer.s_TilesetLayerInfo[0][19];
        final int n3 = nLayer % GLLibPlayer.s_TilesetInfo[2];
        GLLibPlayer.s_TilesetLayerInfo[0][7] = nLayer - n3 + (1 + ((n3 != 0) ? 1 : 0)) * GLLibPlayer.s_TilesetInfo[2];
        nLayer = n2 % GLLibPlayer.s_TilesetInfo[5];
        GLLibPlayer.s_TilesetLayerInfo[0][8] = n2 - nLayer + (1 + ((nLayer != 0) ? 1 : 0)) * GLLibPlayer.s_TilesetInfo[5];
    }
    
    private static void Tileset_Buffer_Create(final int nLayer) {
        try {
            GLLibPlayer.s_TilesetLayerImage[0][0] = ImageG.createImage(GLLibPlayer.s_TilesetLayerInfo[0][8], GLLibPlayer.s_TilesetLayerInfo[0][7]);
            GLLibPlayer.s_TilesetLayerGraphics[0][0] = GLLibPlayer.s_TilesetLayerImage[0][0].image.getGraphics();
        }
        catch (final Exception ex) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer.pb while ceating circular buffer : " + ex.toString());
        }
    }
    
    static void Tileset_CreateBuffer() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        Tileset_Buffer_CalculateSize(0);
        Tileset_Buffer_Create(0);
    }
    
    private static boolean isFlag(final int nLayer, final int flag) {
        return (GLLibPlayer.s_TilesetLayerInfo[nLayer][15] & flag) != 0x0;
    }
    
    private static void setFlag(final int nLayer, final int flag, final boolean value) {
        if (value) {
            GLLibPlayer.s_TilesetLayerInfo[0][15] |= flag;
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[0][15] &= ~flag;
    }
    
    static void Tileset_LoadLayer(final int nLayer, byte[] MapSizes, byte[] MapData, byte[] MapFlip, final ASprite MapSprite, final int n2, final int n3, final int n4, final int n5, final boolean b) {
		if (MapSizes == null) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer.MapSizes is null");
        }
        if (MapData == null) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer.MapData is null");
        }
        if (MapSprite == null) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer.MapSprite is null");
        }
		// TODO: figure these out
        /*if (wrappingX != 0 && wrappingX != 1) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer. X wrapping is not valid");
        }
        if (wrappingY != 0 && wrappingY != 1) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer. Y wrapping is not valid");
        }
        if (origin != 16 && origin != 32) {
            GLLib.Assert(false, "GLLibPlayer.Tileset_LoadLayer. origin is not valid");
        }*/
        if (MapFlip == null) {
            GLLib.Dbg("WARNING GLLibPlayer.Tileset_LoadLayer.MapFlip is null, no flip will occur");
        }
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (true) {
            Tileset_Destroy(0, false);
            GLLibPlayer.s_TilesetLayerInfo[0][18] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][19] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][18] = GLLibPlayer.s_TilesetInfo[0];
            GLLibPlayer.s_TilesetLayerInfo[0][19] = GLLibPlayer.s_TilesetInfo[1];
            GLLibPlayer.s_TilesetLayerData[0][0] = MapData;
            GLLibPlayer.s_TilesetLayerData[0][1] = MapFlip;
            GLLibPlayer.s_TilesetLayerInfo[0][2] = GLLib.Mem_GetShort(MapSizes, 0);
            GLLibPlayer.s_TilesetLayerInfo[0][3] = GLLib.Mem_GetShort(MapSizes, 2);
            GLLibPlayer.s_TilesetLayerInfo[0][5] = GLLibPlayer.s_TilesetLayerInfo[0][2] * GLLibPlayer.s_TilesetInfo[2];
            GLLibPlayer.s_TilesetLayerInfo[0][6] = GLLibPlayer.s_TilesetLayerInfo[0][3] * GLLibPlayer.s_TilesetInfo[5];
            GLLibPlayer.s_TilesetSprite[0] = MapSprite;
            Tileset_Buffer_CalculateSize(0);
            if (GLLibPlayer.s_TilesetLayerImage[0][0] == null || GLLibPlayer.s_TilesetLayerImage[0][0].image.getWidth() != GLLibPlayer.s_TilesetLayerInfo[0][8] || GLLibPlayer.s_TilesetLayerImage[0][0].image.getHeight() != GLLibPlayer.s_TilesetLayerInfo[0][7]) {
                Tileset_Buffer_Create(0);
            }
            setFlag(0, 64, true);
            setFlag(0, 4, true);
            setFlag(0, 128, true);
            GLLibPlayer.s_TilesetLayerInfo[0][9] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][10] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][11] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][12] = -1;
            GLLibPlayer.s_TilesetLayerInfo[0][0] = 1;
            GLLibPlayer.s_TilesetLayerInfo[0][1] = 1;
            GLLibPlayer.s_TilesetLayerInfo[0][13] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][14] = 0;
            GLLibPlayer.s_TilesetLayerInfo[0][16] = 0;
            setFlag(GLLibPlayer.s_TilesetLayerInfo[0][17] = 0, 1, false);
            setFlag(0, 16, false);
            setFlag(0, 2, false);
            setFlag(0, 32, false);
            setFlag(0, 8, false);
        }
    }
    
    static void Tileset_Destroy(final int nLayer) {
        Tileset_Destroy(nLayer, true);
    }
    
    private static void Tileset_Destroy(final int nLayer, final boolean bFreeBufferImage) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[nLayer] = new int[GLLibPlayer.k_TilesetLayerCOUNT];
        if (bFreeBufferImage) {
            GLLibPlayer.s_TilesetLayerImage[nLayer] = new ImageG[1];
            GLLibPlayer.s_TilesetLayerGraphics[nLayer] = new Graphics[1];
        }
        if (GLLibPlayer.s_TilesetLayerData != null) {
            GLLibPlayer.s_TilesetLayerData[nLayer] = new byte[2][];
            GLLibPlayer.s_TilesetSprite[nLayer] = null;
        }
    }
    
    static void Tileset_Draw(Graphics g, int dx, int dy, int nLayer) {
        if (GLLibPlayer.s_bTilesetPlayerInitialized) {
            if (nLayer == -1) {
                for (int i = 0; i < GLLibPlayer.s_TilesetMaxLayerCount; ++i) {
                    Tileset_Draw(g, dx, dy, i);
                }
                return;
            }
            int n5 = GLLibPlayer.s_TilesetLayerInfo[nLayer][18] * 100 / GLLibPlayer.curExtraScale;
            final int n6 = GLLibPlayer.s_TilesetLayerInfo[nLayer][19] * 100 / GLLibPlayer.curExtraScale;
            if (n5 == 0) {
                GLLibPlayer.s_TilesetLayerInfo[nLayer][18] = GLLibPlayer.s_TilesetInfo[0];
                n5 = GLLibPlayer.s_TilesetLayerInfo[nLayer][18];
            }
            if (n6 == 0) {
                GLLibPlayer.s_TilesetLayerInfo[nLayer][19] = GLLibPlayer.s_TilesetInfo[1];
                n5 = GLLibPlayer.s_TilesetLayerInfo[nLayer][18];
            }
            final int[] array;
            if ((array = GLLibPlayer.s_TilesetLayerInfo[nLayer])[0] != 1 || array[1] != 1) {
                return;
            }
            int j = array[13] + array[16];
            int k = array[14] + array[17];
            if (isFlag(nLayer, 4)) {
                int cx = 0;
                int cy = 0;
                int cw = 0;
                int ch = 0;
                if (g != null) {
                    cx = GLLib.GetClipX(g, true);
                    cy = GLLib.GetClipY(g, true);
                    cw = GLLib.GetClipWidth(g, true);
                    ch = GLLib.GetClipHeight(g, true);
                }
                if (isFlag(nLayer, 128)) {
                    GLLibPlayer.s_TilesetLayerLastUpdatedAreaIndex = 0;
                }
                Label_1365: {
                    if (isFlag(nLayer, 256)) {
                        final int[] array2;
                        final int n7 = (array2 = GLLibPlayer.s_TilesetLayerInfo[nLayer])[13];
                        final int n8 = array2[14];
                        final int n9 = GLLibPlayer.s_TilesetInfo[0];
                        final int n10 = GLLibPlayer.s_TilesetInfo[1];
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
                                    Tileset_UpdateEmpyTilemapBuffer(nLayer, array2[5] = n27, n28, n29, n30);
                                }
                                else if (n7 + n9 >= n13) {
                                    final int n31 = n18 / n16 * n16;
                                    final int n32 = ((n7 + n9 - n13) / n15 + 1) * n15;
                                    final int n33 = array2[8];
                                    n26 = n32;
                                    array2[5] = n17 / n15 * n15;
                                    Tileset_UpdateEmpyTilemapBuffer(nLayer, n13, n31, n26, n33);
                                }
                                if (n8 < n12) {
                                    final int n34 = n17 / n15 * n15 + n25;
                                    final int n35 = n18 / n16 * n16;
                                    Tileset_UpdateEmpyTilemapBuffer(nLayer, n34, array2[6] = n35, array2[7] - n26, n12 - n35);
                                }
                                else if (n8 + n10 >= n14) {
                                    final int n36 = n17 / n15 * n15 + n25;
                                    final int n37 = array2[7] - n26;
                                    final int n38 = ((n8 + n10 - n14) / n16 + 1) * n16;
                                    array2[6] = n18 / n16 * n16;
                                    Tileset_UpdateEmpyTilemapBuffer(nLayer, n36, n14, n37, n38);
                                }
                                array2[10] = 0;
                                break Label_1365;
                            }
                        }
                        final int n39 = n17 / n15 * n15;
                        final int n40 = n18 / n16 * n16;
                        Tileset_UpdateEmpyTilemapBuffer(nLayer, n39, n40, array2[7], array2[8]);
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
                            n41 -= GLLibPlayer.s_TilesetInfo[2];
                        }
                        if (n42 < 0) {
                            n42 -= GLLibPlayer.s_TilesetInfo[5];
                        }
                        final int n43 = n41 / GLLibPlayer.s_TilesetInfo[2];
                        final int n44 = n42 / GLLibPlayer.s_TilesetInfo[5];
                        final int n45 = n43 + array[7] / GLLibPlayer.s_TilesetInfo[2] - 1;
                        final int n46 = n44 + array[8] / GLLibPlayer.s_TilesetInfo[5] - 1;
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
                                Tileset_UpdateBuffer(GLLibPlayer.s_TilesetLayerGraphics[nLayer][0], nLayer, n49, n52, n50 - n49, n51, 0, 0);
                            }
                            array[9] = n43;
                            array[11] = n45;
                        }
                        if (array[10] != n44 || array[12] != n46) {
                            Tileset_UpdateBuffer(GLLibPlayer.s_TilesetLayerGraphics[nLayer][0], nLayer, n43, n47, n45 - n43, n48 - n47, 0, 0);
                            array[10] = n44;
                            array[12] = n46;
                        }
                    }
                }
                if (g != null) {
                    if (!isFlag(nLayer, 273)) {
                        if (j < 0) {
                            dx -= j;
                            j = 0;
                        }
                        else if (j > array[5] - n5) {
                            dx -= j - (array[5] - n5);
                            j = array[5] - n5;
                        }
                    }
                    else {
                        while (j < 0) {
                            j += array[7];
                        }
                    }
                    if (!isFlag(nLayer, 290)) {
                        if (k < 0) {
                            dy -= k;
                            k = 0;
                        }
                        else if (k > array[6] - n6) {
                            dy -= k - (array[6] - n6);
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
                    GLLib.SetClip(g, cx, cy, cw, ch, true);
                    if (n55 > n53) {
                        if (n56 > n54) {
                            Tileset_Draw2Screen(g, nLayer, n53, n54, n5, n6, dx, dy, cx, cy, cw, ch, 100);
                        }
                        else {
                            Tileset_Draw2Screen(g, nLayer, n53, n54, n5, n6 - n56, dx, dy, cx, cy, cw, ch, 100);
                            GLLib.SetClip(g, cx, cy, cw, ch, true);
                            Tileset_Draw2Screen(g, nLayer, n53, 0, n5, n56, dx, n6 - n56 + dy, cx, cy, cw, ch, 100);
                        }
                    }
                    else if (n56 > n54) {
                        Tileset_Draw2Screen(g, nLayer, n53, n54, n5 - n55, n6, dx, dy, cx, cy, cw, ch, 100);
                        GLLib.SetClip(g, cx, cy, cw, ch, true);
                        Tileset_Draw2Screen(g, nLayer, 0, n54, n55, n6, n5 - n55 + dx, dy, cx, cy, cw, ch, 100);
                    }
                    else {
                        Tileset_Draw2Screen(g, nLayer, n53, n54, n5 - n55, n6 - n56, dx, dy, cx, cy, cw, ch, 100);
                        GLLib.SetClip(g, cx, cy, cw, ch, true);
                        Tileset_Draw2Screen(g, nLayer, n53, 0, n5 - n55, n56, dx, n6 - n56 + dy, cx, cy, cw, ch, 100);
                        GLLib.SetClip(g, cx, cy, cw, ch, true);
                        Tileset_Draw2Screen(g, nLayer, 0, n54, n55, n6 - n56, n5 - n55 + dx, dy, cx, cy, cw, ch, 100);
                        GLLib.SetClip(g, cx, cy, cw, ch, true);
                        Tileset_Draw2Screen(g, nLayer, 0, 0, n55, n56, n5 - n55 + dx, n6 - n56 + dy, cx, cy, cw, ch, 100);
                    }
                    final Graphics graphics3 = g;
                    final int n57 = cx;
                    final int n58 = cy;
                    final int n59 = cw;
                    nLayer = ch;
                    dy = n59;
                    final int n60 = n58;
                    dx = n57;
                    GLLib.SetClip(graphics3, n57, n60, dy, nLayer, true);
                }
                return;
            }
            if (g != null) {
                int n61 = j;
                int n62 = k;
                if (n61 < 0) {
                    n61 -= GLLibPlayer.s_TilesetInfo[2];
                }
                if (n62 < 0) {
                    n62 -= GLLibPlayer.s_TilesetInfo[5];
                }
                final int tileX0 = n61 / GLLibPlayer.s_TilesetInfo[2];
                final int tileY0 = n62 / GLLibPlayer.s_TilesetInfo[5];
                int nbTileX;
                if ((nbTileX = n5 / GLLibPlayer.s_TilesetInfo[2]) * GLLibPlayer.s_TilesetInfo[2] < n5) {
                    ++nbTileX;
                }
                int nbTileY;
                if ((nbTileY = n6 / GLLibPlayer.s_TilesetInfo[5]) * GLLibPlayer.s_TilesetInfo[5] < n6) {
                    ++nbTileY;
                }
                Tileset_UpdateBuffer(g, nLayer, tileX0, tileY0, nbTileX, nbTileY, tileX0 * GLLibPlayer.s_TilesetInfo[2] - j + dx, tileY0 * GLLibPlayer.s_TilesetInfo[5] - k + dy);
            }
        }
    }
    
    static void Tileset_Draw(int dx, int dy, int tx, int ty, final int nLayer) {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized || !isFlag(nLayer, 4)) {
            return;
        }
        if (nLayer == -1) {
            for (int i = 0; i < GLLibPlayer.s_TilesetMaxLayerCount; ++i) {
                Tileset_Draw(dx, dy, tx, ty, i);
            }
            return;
        }
        final int[] array;
        if ((array = GLLibPlayer.s_TilesetLayerInfo[nLayer])[0] != 1 || array[1] != 1) {
            return;
        }
        if (dx + tx > array[13] && dx < array[13] + array[7] && dy + ty > array[14] && dy < array[14] + array[8]) {
            tx = ((dx + tx < array[13] + array[7]) ? (dx + tx) : (array[13] + array[7]));
            ty = ((dy + ty < array[14] + array[8]) ? (dy + ty) : (array[14] + array[8]));
            dx = ((dx > array[13]) ? dx : array[13]);
            dy = ((dy > array[14]) ? dy : array[14]);
            tx -= dx;
            ty -= dy;
            if (dx < 0) {
                dx -= GLLibPlayer.s_TilesetInfo[2];
            }
            if (dy < 0) {
                dy -= GLLibPlayer.s_TilesetInfo[5];
            }
            dx /= GLLibPlayer.s_TilesetInfo[2];
            dy /= GLLibPlayer.s_TilesetInfo[5];
            tx = tx / GLLibPlayer.s_TilesetInfo[2] - 1;
            ty = ty / GLLibPlayer.s_TilesetInfo[5] - 1;
            Tileset_UpdateBuffer(GLLibPlayer.s_TilesetLayerGraphics[nLayer][0], nLayer, dx, dy, tx, ty, 0, 0, true);
        }
    }
    
    private static void Tileset_Draw2Screen(final Graphics g, final int nLayer, final int srcX, final int srcY, final int width, final int height, final int destX, final int destY, final int cx, final int cy, final int cw, final int ch, final int unk) {
        if (destX > (cx + cw) * 100 || destY > (cy + ch) * 100 || destX + width < cx * 100 || destY + height < cy * 100) {
            return;
        }
        GLLib.ClipRect(g, destX, destY, width, height, true);
        GLLib.DrawImage(g, GLLibPlayer.s_TilesetLayerImage[nLayer][0], srcY - destY + ASprite._graphicsHeight - GLLibPlayer.s_TilesetLayerInfo[nLayer][8], destX - srcX, 20, false);
    }
    
    private static void Tileset_UpdateBuffer(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        Tileset_UpdateBuffer(graphics, n, n2, n3, n4, n5, n6, n7, false);
    }
    
    private static void Tileset_UpdateBuffer(final Graphics gDest, int nLayer, int tileX0, int tileY0, int nbTileX, int nbTileY, int originDestX, int destY, final boolean b) {
        final boolean useCB = isFlag(nLayer, 4);
        final boolean repeatX = isFlag(nLayer, 1);
        final boolean repeatY = isFlag(nLayer, 2);
        final int tileMapWidth = GLLibPlayer.s_TilesetLayerInfo[nLayer][2];
        final int tileMapHeight = GLLibPlayer.s_TilesetLayerInfo[nLayer][3];
        final int tileWidth = GLLibPlayer.s_TilesetInfo[2];
        final int tileHeight = GLLibPlayer.s_TilesetInfo[5];
        final int dataArrayLength = tileMapWidth * tileMapHeight;
        if (useCB) {
            final int var_10c7 = GLLibPlayer.s_TilesetLayerInfo[nLayer][7];
            final int var_10cf2 = GLLibPlayer.s_TilesetLayerInfo[nLayer][8];
            ASprite._graphicsWidth = var_10c7;
            ASprite._graphicsHeight = var_10cf2;
        }
        if (useCB) {
            originDestX += tileX0 * GLLibPlayer.s_TilesetInfo[2] % GLLibPlayer.s_TilesetLayerInfo[nLayer][7];
            destY += tileY0 * GLLibPlayer.s_TilesetInfo[5] % GLLibPlayer.s_TilesetLayerInfo[nLayer][8];
            if (originDestX < 0) {
                originDestX += GLLibPlayer.s_TilesetLayerInfo[nLayer][7];
            }
            if (destY < 0) {
                destY += GLLibPlayer.s_TilesetLayerInfo[nLayer][8];
            }
        }
        if (repeatX) {
            while (tileX0 < 0) {
                tileX0 += tileMapWidth;
            }
            while (tileX0 >= tileMapWidth) {
                tileX0 -= tileMapWidth;
            }
        }
        else if (!isFlag(nLayer, 16)) {
            if (tileX0 < 0) {
                originDestX -= tileX0 * tileWidth;
                nbTileX += tileX0;
                tileX0 = 0;
                if (useCB && originDestX >= GLLibPlayer.s_TilesetLayerInfo[nLayer][7]) {
                    originDestX = 0;
                }
            }
            if (tileX0 + nbTileX >= tileMapWidth) {
                nbTileX = tileMapWidth - tileX0 - 1;
            }
            if (nbTileX < 0) {
                final int var_1ddf = GLLib.s_screenWidth;
                nLayer = GLLib.s_screenHeight;
                ASprite._graphicsWidth = var_1ddf;
                ASprite._graphicsHeight = nLayer;
                return;
            }
        }
        if (repeatY) {
            while (tileY0 < 0) {
                tileY0 += tileMapHeight;
            }
            while (tileY0 >= tileMapHeight) {
                tileY0 -= tileMapHeight;
            }
        }
        else if (!isFlag(nLayer, 32)) {
            if (tileY0 < 0) {
                destY -= tileY0 * tileHeight;
                nbTileY += tileY0;
                tileY0 = 0;
                if (useCB && destY >= GLLibPlayer.s_TilesetLayerInfo[nLayer][8]) {
                    destY = 0;
                }
            }
            if (tileY0 + nbTileY >= tileMapHeight) {
                nbTileY = tileMapHeight - tileY0 - 1;
            }
            if (nbTileY < 0) {
                final int var_1ddf2 = GLLib.s_screenWidth;
                nLayer = GLLib.s_screenHeight;
                ASprite._graphicsWidth = var_1ddf2;
                ASprite._graphicsHeight = nLayer;
                return;
            }
        }
        int destX = originDestX;
        int n11 = destY;
        while (nbTileY-- >= 0) {
            destX = originDestX;
            int nbX = nbTileX;
            int tileX = tileX0;
            while (nbX-- >= 0) {
                final int offsetCur;
                final int sub_7ab4;
                if ((offsetCur = tileX + tileY0 * tileMapWidth) < dataArrayLength && (sub_7ab4 = Tileset_GetLayerData(nLayer, 0, offsetCur, false)) != 255) {
                    int sub_7ab5;
                    if (GLLibPlayer.s_TilesetLayerData[nLayer][1] == null) {
                        sub_7ab5 = 0;
                    }
                    else {
                        sub_7ab5 = Tileset_GetLayerData(nLayer, 1, offsetCur, false);
                    }
                    if (GLLibPlayer.curExtraScale != 100) {
                        GLLib.PFX_EnableScaleEffect();
                        GLLib.s_PFX_params[13][1] = GLLibPlayer.curExtraScale;
                        GLLib.PFX_Scale_SetUnkScaleProp5(true);
                    }
                    if (GLLibPlayer.s_TilesetSprite[nLayer].GetFrameCount() == 0) {
                        GLLibPlayer.s_TilesetSprite[nLayer].sub_7dca(gDest, sub_7ab4, destX, n11, sub_7ab5, GLLibPlayer.s_TilesetInfo[2], GLLibPlayer.s_TilesetInfo[5]);
                    }
                    else {
                        if ((sub_7ab5 & 0x1) != 0x0) {
                        	destX += tileWidth;
                        }
                        if ((sub_7ab5 & 0x2) != 0x0) {
                        	destX += tileHeight;
                        }
                        if ((sub_7ab5 & 0x4) != 0x0) {
                            if ((sub_7ab5 & 0x1) != 0x0) {
                            	destX -= tileHeight;
                            }
                            else {
                            	destX += tileHeight;
                            }
                        }
                        GLLibPlayer.s_TilesetSprite[nLayer].PaintFrame(gDest, sub_7ab4, destX, n11, sub_7ab5);
                    }
                    if (GLLibPlayer.curExtraScale != 100) {
                        GLLib.PFX_Scale_SetUnkScaleProp5(false);
                        GLLib.PFX_DisableScaleEffect();
                    }
                }
                destX += tileWidth;
                if (++tileX >= tileMapWidth) {
                    if (!repeatX) {
                        break;
                    }
                    tileX = 0;
                }
                if (useCB && destX >= GLLibPlayer.s_TilesetLayerInfo[nLayer][7]) {
                    destX = 0;
                }
            }
            n11 += tileHeight;
            if (++tileY0 >= tileMapHeight) {
                if (!repeatY) {
                    break;
                }
                tileY0 = 0;
            }
            if (useCB && n11 >= GLLibPlayer.s_TilesetLayerInfo[nLayer][8]) {
                n11 = 0;
            }
        }
        if (!b && isFlag(nLayer, 128)) {
            int n17;
            int n18;
            if (destX > originDestX) {
                n17 = destX;
                n18 = 0;
            }
            else {
                n17 = GLLibPlayer.s_TilesetLayerInfo[nLayer][7];
                n18 = destX;
            }
            int n19;
            if (n11 > destY) {
                n19 = n11;
                tileX0 = 0;
            }
            else {
                n19 = GLLibPlayer.s_TilesetLayerInfo[nLayer][8];
                tileX0 = n11;
            }
            for (tileY0 = 0; tileY0 < 4; ++tileY0) {
                if (((tileY0 != 1 && tileY0 != 3) || n18 != 0) && ((tileY0 != 2 && tileY0 != 3) || tileX0 != 0)) {
                    nbTileX = ((tileY0 == 0 || tileY0 == 2) ? originDestX : 0);
                    nbTileY = ((tileY0 == 0 || tileY0 == 1) ? destY : 0);
                    Tileset_AddUpdatedArea(nLayer, nbTileX, nbTileY, (tileY0 == 0 || tileY0 == 2) ? (n17 - originDestX) : n18, (tileY0 == 0 || tileY0 == 1) ? (n19 - destY) : tileX0);
                }
            }
        }
        nLayer = GLLib.s_screenHeight;
        ASprite._graphicsWidth = GLLib.s_screenWidth;
        ASprite._graphicsHeight = nLayer;
    }
    
    private static final void Tileset_AddUpdatedArea(final int nLayer, final int rX, final int rY, final int rW, final int rH) {
        final int[] rect;
        (rect = GLLibPlayer.s_TilesetLayerLastUpdatedArea[nLayer][GLLibPlayer.s_TilesetLayerLastUpdatedAreaIndex])[0] = rX;
        rect[1] = rY;
        rect[2] = rW;
        rect[3] = rH;
        ++GLLibPlayer.s_TilesetLayerLastUpdatedAreaIndex;
    }
    
    private static final int Tileset_GetTranslatedOriginY(final int nLayer, final int y) {
        if (isFlag(nLayer, 8)) {
            return GLLibPlayer.s_TilesetLayerInfo[nLayer][6] - GLLibPlayer.s_TilesetInfo[1] - y;
        }
        return y;
    }
    
    static final void Tileset_SetCamera(final int nLayer, final int x, final int y) {
		if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_SetCamera: Tileset player is not initialized");
            return;
        }
        if (0 <= GLLibPlayer.s_TilesetMaxLayerCount) {
            GLLib.Assert(false, "Tileset_SetCamera: nLayer invalid : " + 0);
            return;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            GLLib.Assert(false, "Tileset_SetCamera: nLayer in not initialized or not enabled.");
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[0][13] = x;
        GLLibPlayer.s_TilesetLayerInfo[0][14] = Tileset_GetTranslatedOriginY(0, y);
        if (isFlag(0, 16)) {
            if (GLLibPlayer.s_TilesetLayerInfo[0][13] < 0) {
                GLLibPlayer.s_TilesetLayerInfo[0][13] = 0;
            }
            else if (GLLibPlayer.s_TilesetLayerInfo[0][13] + GLLibPlayer.s_TilesetInfo[0] >= GLLibPlayer.s_TilesetLayerInfo[0][5]) {
                GLLibPlayer.s_TilesetLayerInfo[0][13] = GLLibPlayer.s_TilesetLayerInfo[0][5] - GLLibPlayer.s_TilesetInfo[0] - 1;
            }
        }
        if (isFlag(0, 32)) {
            if (GLLibPlayer.s_TilesetLayerInfo[0][14] < 0) {
                GLLibPlayer.s_TilesetLayerInfo[0][14] = 0;
                return;
            }
            if (GLLibPlayer.s_TilesetLayerInfo[0][14] + GLLibPlayer.s_TilesetInfo[1] >= GLLibPlayer.s_TilesetLayerInfo[0][6]) {
                GLLibPlayer.s_TilesetLayerInfo[0][14] = GLLibPlayer.s_TilesetLayerInfo[0][6] - GLLibPlayer.s_TilesetInfo[1] - 1;
            }
        }
    }
    
    static final int Tileset_GetCameraX(final int nLayer) {
		if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_GetCamera: Tileset player is not initialized");
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetCamera: nLayer invalid : " + 0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            GLLib.Assert(false, "Tileset_GetCamera: nLayer in not initialized or not enabled.");
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][13];
    }
    
    static final int Tileset_GetCameraY(final int nLayer) {
		if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_GetCamera: Tileset player is not initialized");
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetCamera: nLayer invalid : " + 0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            GLLib.Assert(false, "Tileset_GetCamera: nLayer in not initialized or not enabled.");
            return -1;
        }
        if (isFlag(0, 8)) {
            return GLLibPlayer.s_TilesetLayerInfo[0][6] - GLLibPlayer.s_TilesetInfo[1] - GLLibPlayer.s_TilesetLayerInfo[0][14];
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][14];
    }
    
    static final int Tileset_GetLayerWidth() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_GetLayerWidth: Tileset player is not initialized");
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetLayerWidth: nLayer invalid : " + 0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            GLLib.Assert(false, "Tileset_GetLayerWidth: nLayer in not initialized or not enabled.");
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][5];
    }
    
    static final int Tileset_GetLayerHeight() {
         if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_GetLayerHeight: Tileset player is not initialized");
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetLayerHeight: nLayer invalid : " + 0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            GLLib.Assert(false, "Tileset_GetLayerHeight: nLayer in not initialized or not enabled.");
            return -1;
        }
        return GLLibPlayer.s_TilesetLayerInfo[0][6];
    }
    
    static final int Tileset_GetTile(int nLayer, int x, int y) {
        y = Tileset_GetTranslatedOriginY(0, y);
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
			GLLib.Assert(false, "Tileset_GetTile: Tileset player is not initialized");
            return -1;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetTile: nLayer invalid : " + 0);
            return -1;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
			GLLib.Assert(false, "Tileset_GetTile: nLayer in not initialized or not enabled.");
            return -1;
        }
        if (x < 0 || x > GLLibPlayer.s_TilesetLayerInfo[0][2]) {
            GLLib.Assert(false, "Tileset_GetTile: x value out of bound [" + x + "]  0 <= x < " + GLLibPlayer.s_TilesetLayerInfo[0][2]);
            return -1;
        }
        if (y < 0 || y > GLLibPlayer.s_TilesetLayerInfo[0][3]) {
            GLLib.Assert(false, "Tileset_GetTile: y value out of bound [" + y + "]  0 <= y < " + GLLibPlayer.s_TilesetLayerInfo[0][3]);
            return -1;
        }
        return Tileset_GetLayerData(0, 0, y * GLLibPlayer.s_TilesetLayerInfo[0][2] + x, false);
    }
    
    static final ImageG Tileset_GetBufferImage() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            GLLib.Assert(false, "Tileset_GetBufferImage: Tileset player is not initialized");
            return null;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_GetBufferImage: p_iLayer invalid : " + 0);
            return null;
        }
        return GLLibPlayer.s_TilesetLayerImage[0][0];
    }
    
    static void Tileset_Refresh() {
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (isFlag(0, 256)) {
            GLLibPlayer.s_TilesetLayerInfo[0][9] = 1;
            return;
        }
        GLLibPlayer.s_TilesetLayerInfo[0][9] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][10] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][11] = -1;
        GLLibPlayer.s_TilesetLayerInfo[0][12] = -1;
    }
    
    static void Tileset_SetTile(int x, int y, final int nLayer) {
        y = Tileset_GetTranslatedOriginY(0, y);
        x /= GLLibPlayer.s_TilesetInfo[2];
        y /= GLLibPlayer.s_TilesetInfo[5];
        if (!GLLibPlayer.s_bTilesetPlayerInitialized) {
            return;
        }
        if (GLLibPlayer.s_TilesetMaxLayerCount <= 0) {
            GLLib.Assert(false, "Tileset_SetTile: layer invalid : " + 0);
            return;
        }
        if (GLLibPlayer.s_TilesetLayerInfo[0][0] != 1 || GLLibPlayer.s_TilesetLayerInfo[0][1] != 1) {
            return;
        }
        if (x < 0 || x > GLLibPlayer.s_TilesetLayerInfo[0][2]) {
            GLLib.Assert(false, "Tileset_SetTile: x value out of bound [" + x + "]  0 <= x < " + GLLibPlayer.s_TilesetLayerInfo[0][2]);
            return;
        }
        if (y < 0 || y > GLLibPlayer.s_TilesetLayerInfo[0][3]) {
            GLLib.Assert(false, "Tileset_SetTile: y value out of bound [" + y + "]  0 <= y < " + GLLibPlayer.s_TilesetLayerInfo[0][3]);
            return;
        }
        x += y * GLLibPlayer.s_TilesetLayerInfo[0][2];
        if (nLayer != -1) {
            Tileset_SetLayerData(0, 0, x, nLayer);
        }
        Tileset_SetLayerData(0, 1, x, 0);
    }
    
    static final void Tileset_FillRect(int x, int y, final int w, final int h, final boolean force) {
        if (isFlag(0, 4)) {
            Tileset_PaintToBuffer(2, 0, null, 0, 0, 0, 0, w, h, 0, force, null);
            return;
        }
        y = 0 - Tileset_GetCameraY(0);
        x = 0 - Tileset_GetCameraX(0);
        GLLib.FillRect(GLLib.g, x, y, w, h, true);
    }
    
    static final void Tileset_PaintSpriteWithScale(int scale, final ASprite sprite, final int frame, final int posX, final int posY, final boolean force, final int[] layerInfo) {
        if (GLLibPlayer.curExtraScale != 100) {
            GLLib.PFX_EnableScaleEffect();
            scale = GLLibPlayer.curExtraScale;
            GLLib.s_PFX_params[13][1] = scale;
            GLLib.PFX_Scale_SetUnkScaleProp5(true);
        }
        if (isFlag(0, 4)) {
            Tileset_PaintToBuffer(0, 0, sprite, 0, frame, posX, posY, 0, 0, 0, force, layerInfo);
        }
        else {
            sprite.PaintFrame(GLLib.g, frame, posX - Tileset_GetCameraX(0), posY - Tileset_GetCameraY(0), 0);
        }
        if (GLLibPlayer.curExtraScale != 100) {
            GLLib.PFX_Scale_SetUnkScaleProp5(false);
            GLLib.PFX_DisableScaleEffect();
        }
    }
    
    private static void Tileset_PaintToBuffer(int drawOperation, int nLayer, Object sprite, int anim, int frame, int x, int y, int p0, int p1, int flags, final boolean force, int[] layerInfo) {
        flags = (force ? 1 : 0);
        p0 = p1;
        y = p0;
        x = y;
        frame = x;
        anim = frame;
        if (isFlag(0, 4) && (GLLibPlayer.s_TilesetLayerLastUpdatedAreaIndex != 0 || flags != 0)) {
            layerInfo = GLLibPlayer.s_TilesetLayerInfo[0];
            nLayer = 0;
            p1 = 0;
            int asprite_framewidth = 0;
            int asprite_frameheight = 0;
            if (drawOperation == 0) {
                nLayer = ((ASprite)sprite).GetFrameMinX(anim);
                p1 = ((ASprite)sprite).GetFrameMinY(anim);
                asprite_framewidth = ((ASprite)sprite).GetFrameWidth(anim);
                asprite_frameheight = ((ASprite)sprite).GetFrameHeight(anim);
                if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                    final int zoom = GLLib.s_PFX_params[13][1];
                    nLayer = nLayer * zoom / 100;
                    p1 = p1 * zoom / 100;
                    asprite_framewidth = asprite_framewidth * zoom / 100;
                    asprite_frameheight = asprite_frameheight * zoom / 100;
                }
            }
            else if (drawOperation == 1 || drawOperation == 2 || drawOperation == 3 || drawOperation == 5 || drawOperation == 4) {
                asprite_framewidth = y;
                asprite_frameheight = p0;
            }
            else {
                GLLib.Assert(false, "Tileset_PaintToBuffer: Invalid drawOperation set: " + drawOperation);
            }
            x = Tileset_GetTranslatedOriginY(0, x);
            final int n13 = layerInfo[13];
            final int n14 = layerInfo[14];
            int n15;
            int n16;
            if (isFlag(0, 256)) {
                n15 = layerInfo[2];
                n16 = layerInfo[3];
            }
            else {
                n15 = GLLibPlayer.s_TilesetInfo[2];
                n16 = GLLibPlayer.s_TilesetInfo[5];
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
            frame -= n19;
            x -= n20;
            if (isFlag(0, 273) && n19 < 0) {
                n19 = layerInfo[7] + n19 % layerInfo[7];
            }
            if (isFlag(0, 290) && n20 < 0) {
                n20 = layerInfo[8] + n20 % layerInfo[8];
            }
            final int n21 = n19 % layerInfo[7];
            final int n22 = n20 % layerInfo[8];
            final int n23 = layerInfo[7] - n21;
            final int n24 = layerInfo[8] - n22;
            final Graphics graphics = GLLibPlayer.s_TilesetLayerGraphics[0][0];
            final int height = GLLibPlayer.s_TilesetLayerInfo[0][7];
            final int width = GLLibPlayer.s_TilesetLayerInfo[0][8];
            ASprite._graphicsWidth = height;
            ASprite._graphicsHeight = width;
            final int cx = GLLib.GetClipX(graphics, true);
            final int cy = GLLib.GetClipY(graphics, true);
            final int cw = GLLib.GetClipWidth(graphics, true);
            final int ch = GLLib.GetClipHeight(graphics, true);
            int var_16f7 = 1;
            if (flags == 0) {
                var_16f7 = GLLibPlayer.s_TilesetLayerLastUpdatedAreaIndex;
            }
            final int n25 = layerInfo[7];
            final int n26 = layerInfo[8];
            final int var_10c8 = ASprite._graphicsWidth;
            final int var_10cf2 = ASprite._graphicsHeight;
            final int var_10c9 = n25;
            final int var_10cf3 = n26;
            ASprite._graphicsWidth = var_10c9;
            ASprite._graphicsHeight = var_10cf3;
            final int n27 = var_16f7;
            frame += nLayer;
            x += p1;
            final int n28 = frame + asprite_framewidth;
            final int n29 = x + asprite_frameheight;
            int n30 = 0;
            int n31 = 0;
            int n32 = 0;
            int n33 = 0;
            if (layerInfo != null) {
                n30 = layerInfo[0] - n19;
                n31 = layerInfo[1] - n20;
                n32 = layerInfo[2] - n19;
                n33 = layerInfo[3] - n20;
            }
            for (int i = 0; i < 1; ++i) {
                final int n34 = frame;
                final int n35 = x;
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
                            if (flags == 0) {
                                int n43 = (array3 = GLLibPlayer.s_TilesetLayerLastUpdatedArea[0][n42])[0] - n21;
                                if (array3[0] < n21) {
                                    n43 += layerInfo[7];
                                }
                                if (n38 >= n43 + array3[2] || n40 < n43) {
                                    continue;
                                }
                                int n44 = array3[1] - n22;
                                if (array3[1] < n22) {
                                    n44 += layerInfo[8];
                                }
                                if (n39 >= n44 + array3[3] || n41 < n44) {
                                    continue;
                                }
                            }
                            if (n38 < n23 && (layerInfo == null || n30 < n23)) {
                                if (n39 < n24 && (layerInfo == null || n31 < n24)) {
                                    int n47;
                                    int n48;
                                    int n49;
                                    int n50;
                                    if (layerInfo != null) {
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
                                    Tileset_PaintWithDrawOperation(graphics, sprite, anim, 0, n49, n50, n47, n48, n21 + n38 - nLayer, n22 + n39 - p1, y, p0, drawOperation, cx, cy, cw, ch, array3, (boolean)(flags != 0));
                                }
                                if (n41 >= n24 && n22 != 0 && (layerInfo == null || n33 >= n24)) {
                                    int n52;
                                    int n53;
                                    int n54;
                                    int n55;
                                    if (layerInfo != null) {
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
                                    Tileset_PaintWithDrawOperation(graphics, sprite, anim, 0, n55, n52, n53, n54, n21 + n38 - nLayer, n39 - p1 - n24, y, p0, drawOperation, cx, cy, cw, ch, array3, (boolean)(flags != 0));
                                }
                            }
                            if (n40 >= n23 && n21 != 0 && (layerInfo == null || n32 >= n23)) {
                                if (n39 < n24 && (layerInfo == null || n31 < n24)) {
                                    int n56;
                                    int n58;
                                    int n59;
                                    int n60;
                                    if (layerInfo != null) {
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
                                    Tileset_PaintWithDrawOperation(graphics, sprite, anim, 0, n56, n60, n58, n59, n38 - nLayer - n23, n22 + n39 - p1, y, p0, drawOperation, cx, cy, cw, ch, array3, (boolean)(flags != 0));
                                }
                                if (n41 < n24 || n22 == 0 || (layerInfo != null && n33 < n24)) {
                                    continue;
                                }
                                int n61;
                                int n62;
                                int n63;
                                int n64;
                                if (layerInfo != null) {
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
                                Tileset_PaintWithDrawOperation(graphics, sprite, anim, 0, n61, n62, n63, n64, n38 - nLayer - n23, n39 - p1 - n24, y, p0, drawOperation, cx, cy, cw, ch, array3, (boolean)(flags != 0));
                            }
                        }
                    }
                }
            }
            GLLib.SetClip(graphics, cx, cy, cw, ch, true);
            ASprite._graphicsWidth = var_10c8;
            ASprite._graphicsHeight = var_10cf2;
            ASprite._graphicsWidth = GLLib.s_screenWidth;
            ASprite._graphicsHeight = GLLib.s_screenHeight;
        }
    }
    
    private static void Tileset_PaintWithDrawOperation(final Graphics gDest, final Object o, int frame, final int uHeight, final int camX0, int camY0, int camW0, int camH0, int x, final int y, final int p0, final int p1, final int drawOperation, final int n12, final int n13, final int n14, final int n15, final int[] array, final boolean force) {
        GLLib.ClipRect(gDest, camX0, camY0, camW0, camH0, true);
        if (!force) {
            camY0 = array[0];
            GLLib.ClipRect(gDest, array[0], array[1], array[2], array[3], true);
        }
        if (drawOperation == 0) {
            ((ASprite)o).PaintCachedFrame(gDest, frame, x, y, uHeight);
        }
        else if (drawOperation == 5) {
            frame = x;
            x = ASprite._graphicsHeight - y - p1;
            GLLib.DrawRGB(gDest, (int[])o, 0, p1, x, frame, p1, p0, true, false, uHeight, -1, false);
        }
        else if (drawOperation == 4) {
            GLLib.DrawImage(gDest, (ImageG)o, x, y, 20, true);
        }
        else if (drawOperation == 1) {
            GLLib.DrawRect(gDest, x, y, p0, p1, true);
        }
        else if (drawOperation == 2) {
            GLLib.FillRect(gDest, x, y, p0, p1, true);
        }
        else if (drawOperation == 3) {
            GLLib.AlphaRect_Draw(gDest, x, y, p0, p1);
        }
        GLLib.SetClip(gDest, n12, n13, n14, n15, true);
    }
    
    private static final void Tileset_SetLayerData(final int nLayer, int type, int index, final int data) {
        GLLibPlayer.s_TilesetLayerData[0][type][index] = (byte)data;
    }
    
    private static int Tileset_GetLayerData(final int nLayer, final int type, final int index, final boolean b) {
        return GLLibPlayer.s_TilesetLayerData[nLayer][type][index] & 0xFF;
    }
    
    private static void Tileset_UpdateEmpyTilemapBuffer(final int nLayer, int rX, int rY, int rW, int rH) {
        final Graphics gDest;
        (gDest = GLLibPlayer.s_TilesetLayerGraphics[nLayer][0]).setColor(GLLibPlayer.s_TilesetLayerInfo[nLayer][4]);
        final int bufferW = GLLibPlayer.s_TilesetLayerInfo[nLayer][7];
        final int bufferH = GLLibPlayer.s_TilesetLayerInfo[nLayer][8];
        ASprite._graphicsWidth = bufferW;
        ASprite._graphicsHeight = bufferH;
        if ((rX %= bufferW) < 0) {
            rX += bufferW;
        }
        if ((rY %= bufferH) < 0) {
            rY += bufferH;
        }
        if (rX + rW > bufferW) {
            int rightH = rH;
            if (rY + rH > bufferH) {
                GLLib.FillRect(gDest, 0, 0, rX + rW - bufferW, rY + rH - bufferH, true);
                Tileset_AddUpdatedArea(nLayer, 0, 0, rX + rW - bufferW, rY + rH - bufferH);
                rightH = bufferH - rY;
            }
            GLLib.FillRect(gDest, 0, rY, rX + rW - bufferW, rightH, true);
            Tileset_AddUpdatedArea(nLayer, 0, rY, rX + rW - bufferW, rightH);
            rW = bufferW - rX;
        }
        if (rY + rH > bufferH) {
            GLLib.FillRect(gDest, rX, 0, rW, rY + rH - bufferH, true);
            Tileset_AddUpdatedArea(nLayer, rX, 0, rW, rY + rH - bufferH);
            rH = bufferH - rY;
        }
        GLLib.FillRect(gDest, rX, rY, rW, rH, true);
        Tileset_AddUpdatedArea(nLayer, rX, rY, rW, rH);
        ASprite._graphicsWidth = GLLib.s_screenWidth;
        ASprite._graphicsHeight = GLLib.s_screenHeight;
    }
    
    static {
        GLLibPlayer.defaultFrameTime = 50; // GLLibConfig.sprite_animFPS is 20 based on this (1000 / 20 = 50.0)
        k_snd_nbChannel = 1;
        GLLibPlayer.s_bTilesetPlayerInitialized = false;
        GLLibPlayer.s_TilesetMaxLayerCount = 4;
        k_TilesetLayerCOUNT = 20;
        k_TilesetLayerAreaCount = 6;
        GLLibPlayer.curExtraScale = 100;
    }
}
