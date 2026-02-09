
import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ASprite
{
    static int[] temp_int;
    private static int[] transform_int;
    private int _nModules;
    short[] _modules_w_short;
    short[] _modules_h_short;
    private short[] _modules_extra_info;
    private short[] _modules_extra_pointer;
    private byte[] _frames_nfm_byte;
    private short[] _frames_nfm_short;
    short[] _frames_fm_start;
    private byte[] _frames_rc;
    private short[] _frames_rc_short;
    private byte[] _frames_rects;
    private short[] _frames_rects_short;
    private short[] _frames_rects_start;
    private byte[] _fmodules_id_byte;
    private short[] _fmodules_id_short;
    private byte[] _fmodules_flags;
    private short[] _fmodules_ox_short;
    private short[] _fmodules_oy_short;
    private byte[] _anims_naf_byte;
    private short[] _anims_af_start;
    private byte[] _aframes;
    private byte[] _aframes_time;
    private short[] _aframes_ox_short;
    private short[] _aframes_oy_short;
    private byte[] _aframes_ox_byte;
    private byte[] _aframes_oy_byte;
    private byte[] _aframes_flags;
    private short[][] map;
    private int _cur_map;
    byte[] _modules_data;
    private int[] _modules_data_off_int;
    private int _bs_flags;
    private int[][][] _pal_int;
    int _palettes;
    private int[] _pal_int_not;
    private int _crt_pal;
    private boolean _alpha;
    //private boolean var_109f;
    private int _flags;
    private short _data_format;
    private int[] var_10b7;
    private int[] begone;
    static int _graphicsWidth;
    static int _graphicsHeight;
    GLLibImage[][] _module_image_imageAA;
    private GLLibImage[][][] _frame_image_imageAAA;
    private static boolean var_10e7;
    private static int[] midp2_flags;
    private static int[] TRANSFORM_FLIP_X;
    private static int[] TRANSFORM_FLIP_Y;
    private static int[] TRANSFORM_ROT_90;
    private byte[] _module_types;
    private byte[] _module_img;
    private int[] _module_colors_int;
    private static int _rectX1;
    private static int _rectY1;
    private static int _rectX2;
    private static int _rectY2;
    static int[] s_rc;
    private static boolean s_gcEnabled;
    private static char k_cCanBreakLine;
    private GLLibImage[][] _imgPFXModuleCache;
    private int[][] _PFXParamsModuleCRC;
    private int _cur_pool;
    private static short[][] _poolCacheStack;
    private static int[] _poolCacheStackIndex;
    private static int[] _poolCacheStackMax;
    private static ASprite[][] _poolCacheSprites;
    private static int _old_pal;
    static int _text_w;
    private static int _text_h;
    private int _nLineHeight;
    private int _nLineSpacing;
    private int _nHeightFake;
    private int _nSpaceWidth;
    private int _nFontAscent;
    private boolean _bUnderline;
    private boolean _bBold;
    private short[][] _pMapCharShort;
    private short _nDivider;
    private int m_scaleAccelerator;
    private static short[] _warpTextInfo;
    private static int _index1;
    private static int _index2;
    private static int _indexMax;
    private static int _operation;
    
    final void unload() {
        this._modules_w_short = null;
        this._modules_h_short = null;
        this._fmodules_id_short = null;
        this._fmodules_id_byte = null;
        this._frames_nfm_short = null;
        this._frames_nfm_byte = null;
        this._aframes = null;
        this._anims_naf_byte = null;
        this._frames_fm_start = null;
        this._frames_rc = null;
        this._frames_rc_short = null;
        this._frames_rects = null;
        this._frames_rects_short = null;
        this._frames_rects_start = null;
        this._anims_af_start = null;
        if (this.map != null) {
            for (int i = 0; i < this.map.length; ++i) {
                this.map[i] = null;
            }
            this.map = null;
        }
        if (this._pal_int != null) {
            for (int j = 0; j < this._pal_int.length; ++j) {
                this._pal_int[j] = null;
            }
            this._pal_int = null;
        }
        if (this._module_image_imageAA != null) {
            for (int k = 0; k < this._module_image_imageAA.length; ++k) {
                this._module_image_imageAA[k] = null;
            }
            this._module_image_imageAA = null;
        }
    }
    
    final void Load(final byte[] file, int offset) {
        if (file == null) {
            return;
        }
        try {
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
            this._bs_flags = (file[2] & 0xFF) + ((file[3] & 0xFF) << 8) + ((file[4] & 0xFF) << 16) + ((file[5] & 0xFF) << 24);
            
            int offset_mod = 6;
            
            final int n3 = 6;
            ++offset_mod;
            final int n4 = file[n3] & 0xFF;
            final int n5 = 7;
            ++offset_mod;
            this._nModules = (short)(n4 + ((file[n5] & 0xFF) << 8));
            if (this._nModules > 0) {
                this._modules_w_short = new short[this._nModules];
                this._modules_h_short = new short[this._nModules];
                int tmpExtraInfoCount = 0;
                int tmpExtraInfoSize = 0;
                short[][] tmpExtraInfo = null;
                if ((this._bs_flags & 0x4) != 0x0) {
                    this._module_img = new byte[this._nModules];
                }
                boolean bLoadAModuleColor = false;
                boolean bLoadAModuleSize = false;
                for (int i = 0; i < this._nModules; ++i) {
                    boolean bLoadAModuleArc = false;
                    boolean bLoadAModuleTriangle = false;
                    boolean bLoadAModuleGrad = false;
                    if ((file[offset_mod] & 0xFF) == 0x0) {
                        ++offset_mod;
                        bLoadAModuleColor = false;
                        bLoadAModuleSize = true;
                        if ((this._bs_flags & 0x4) != 0x0) {
                            this._module_img[i] = file[offset_mod++];
                        }
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFF) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 1;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFE) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 2;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFD) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 5;
                        bLoadAModuleColor = false;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFC) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 3;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleArc = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFB) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 4;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleArc = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xFA) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 6;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = false;
                        bLoadAModuleTriangle = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xF9) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 7;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = false;
                        bLoadAModuleTriangle = true;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xF8) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 8;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleTriangle = false;
                    }
                    else if ((file[offset_mod] & 0xFF) == 0xF7) {
                        ++offset_mod;
                        this.InitMultipleModuleTypes(this._nModules);
                        this._module_types[i] = 9;
                        bLoadAModuleColor = true;
                        bLoadAModuleGrad = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleTriangle = false;
                    }
                    if (bLoadAModuleColor) {
                        this._module_colors_int[i] = (file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8) + ((file[offset_mod++] & 0xFF) << 16) + ((file[offset_mod++] & 0xFF) << 24);
                    }
                    if (bLoadAModuleGrad) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] aShort = new short[3];
                        final int altColor = (file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8) + ((file[offset_mod++] & 0xFF) << 16) + ((file[offset_mod++] & 0xFF) << 24);
                        aShort[0] = (short)altColor;
                        aShort[1] = (short)(altColor >> 16);
                        aShort[2] = file[offset_mod++];
                        tmpExtraInfo[i] = aShort;
                        ++tmpExtraInfoCount;
                        tmpExtraInfoSize += 3;
                    }
                    if (bLoadAModuleSize) {
                        if ((this._bs_flags & 0x10) == 0x0) {
                            this._modules_w_short[i] = (short)(file[offset_mod++] & 0xFF);
                            this._modules_h_short[i] = (short)(file[offset_mod++] & 0xFF);
                        }
                        else {
                            this._modules_w_short[i] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                            this._modules_h_short[i] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        }
                    }
                    if (bLoadAModuleArc) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] aShort;
                        (aShort = new short[2])[0] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        aShort[1] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        tmpExtraInfo[i] = aShort;
                        ++tmpExtraInfoCount;
                        tmpExtraInfoSize += 2;
                    }
                    if (bLoadAModuleTriangle) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] aShort;
                        (aShort = new short[4])[0] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        aShort[1] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        aShort[2] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        aShort[3] = (short)((file[offset_mod++] & 0xFF) + ((file[offset_mod++] & 0xFF) << 8));
                        tmpExtraInfo[i] = aShort;
                        ++tmpExtraInfoCount;
                        tmpExtraInfoSize += 4;
                    }
                }
                if (tmpExtraInfoCount > 0) {
                    this._modules_extra_info = new short[tmpExtraInfoSize];
                    this._modules_extra_pointer = new short[tmpExtraInfoCount << 1];
                    int xCount = 0;
                    short xOffset = 0;
                    for (short m = 0; m < this._nModules; ++m) {
                        int nSize;
                        if (this._module_types[m] == 3 || this._module_types[m] == 4) {
                            nSize = 2;
                        }
                        else if (this._module_types[m] == 6 || this._module_types[m] == 7) {
                            nSize = 4;
                        }
                        else if (this._module_types[m] == 9) {
                            nSize = 3;
                        }
                        else {
                            nSize = -1;
                        }
                        if (nSize > 0) {
                            this._modules_extra_pointer[xCount << 1] = m;
                            this._modules_extra_pointer[(xCount << 1) + 1] = xOffset;
                            for (int x = 0; x < nSize; ++x) {
                                this._modules_extra_info[xOffset] = tmpExtraInfo[m][x];
                                ++xOffset;
                            }
                            tmpExtraInfo[m] = null;
                            ++xCount;
                        }
                    }
                }
            }
            offset = offset_mod;
            
            int offset_fmod = offset;

            short nFModules = (short)((file[offset_fmod++] & 0xFF) + ((file[offset_fmod++] & 0xFF) << 8));
            if (nFModules > 0) {
                if ((this._bs_flags & 0x100000) != 0x0) {
                    this._fmodules_id_short = new short[nFModules];
                }
                else {
                    this._fmodules_id_byte = new byte[nFModules];
                }
                this._fmodules_ox_short = new short[nFModules];
                this._fmodules_oy_short = new short[nFModules];
                this._fmodules_flags = new byte[nFModules];
                for (int i = 0; i < nFModules; ++i) {
                    if ((this._bs_flags & 0x100000) != 0x0) {
                        this._fmodules_id_short[i] = (short)((file[offset_fmod++] & 0xFF) + ((file[offset_fmod++] & 0xFF) << 8));
                    }
                    else {
                        this._fmodules_id_byte[i] = file[offset_fmod++];
                    }
                    if ((this._bs_flags & 0x400) != 0x0) {
                        this._fmodules_ox_short[i] = (short)((file[offset_fmod++] & 0xFF) + ((file[offset_fmod++] & 0xFF) << 8));
                        this._fmodules_oy_short[i] = (short)((file[offset_fmod++] & 0xFF) + ((file[offset_fmod++] & 0xFF) << 8));
                    }
                    else {
                        this._fmodules_ox_short[i] = file[offset_fmod++];
                        this._fmodules_oy_short[i] = file[offset_fmod++];
                    }
                    this._fmodules_flags[i] = file[offset_fmod++];
                }
            }
            offset = offset_fmod;

            int offset_frame = offset;
            
            if ((this._bs_flags & 0x8000) != 0x0) {
                final short nRects = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8));
                if ((this._bs_flags & 0x400) == 0x0) {
                    System.arraycopy(file, offset_frame, this._frames_rects = new byte[nRects << 2], 0, nRects << 2);
                    offset_frame += nRects << 2;
                }
                else {
                    this._frames_rects_short = new short[nRects << 2];
                    for (int k = 0; k < nRects << 2; ++k) {
                    	_frames_rects_short[k] = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8));
                    }
                }
            }
            final short nFrames;
            if ((nFrames = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8))) > 0) {
                if ((this._bs_flags & 0x800) != 0x0) {
                    this._frames_nfm_short = new short[nFrames];
                }
                else {
                    this._frames_nfm_byte = new byte[nFrames];
                }
                this._frames_fm_start = new short[nFrames];
                if ((this._bs_flags & 0x8000) != 0x0) {
                    this._frames_rects_start = new short[nFrames + 1];
                }
                short frame_start = 0;
                for (int i = 0; i < nFrames; ++i) {
                    if ((this._bs_flags & 0x800) != 0x0) {
                        this._frames_nfm_short[i] = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8));
                    }
                    else {
                        this._frames_nfm_byte[i] = file[offset_frame++];
                    }
                    this._frames_fm_start[i] = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8));
                    if ((this._bs_flags & 0x8000) != 0x0 && (this._bs_flags & 0x8000) != 0x0) {
                        this._frames_rects_start[i] = frame_start;
                        frame_start += file[offset_frame++];
                    }
                }
                if ((this._bs_flags & 0x8000) != 0x0) {
                    this._frames_rects_start[this._frames_rects_start.length - 1] = frame_start;
                }
                if ((this._bs_flags & 0x1000) == 0x0) {
                    final int nFrames2 = nFrames << 2;
                    if ((this._bs_flags & 0x400) == 0x0) {
                        this._frames_rc = new byte[nFrames2];
                        for (int j = 0; j < nFrames2; ++j) {
                            this._frames_rc[j] = file[offset_frame++];
                        }
                    }
                    else {
                        this._frames_rc_short = new short[nFrames2];
                        for (int j = 0; j < nFrames2; ++j) {
                            this._frames_rc_short[j] = (short)((file[offset_frame++] & 0xFF) + ((file[offset_frame++] & 0xFF) << 8));
                        }
                    }
                }
            }
            offset = offset_frame;
            int offset_aframe = offset;
            final short nAFrames;
            if ((nAFrames = (short)((file[offset_aframe++] & 0xFF) + ((file[offset_aframe++] & 0xFF) << 8))) > 0) {
                this._aframes = new byte[nAFrames];
                this._aframes_time = new byte[nAFrames];
                if ((this._bs_flags & 0x40000) != 0x0) {
                    this._aframes_ox_short = new short[nAFrames];
                    this._aframes_oy_short = new short[nAFrames];
                }
                else {
                    this._aframes_ox_byte = new byte[nAFrames];
                    this._aframes_oy_byte = new byte[nAFrames];
                }
                this._aframes_flags = new byte[nAFrames];
                for (int i = 0; i < nAFrames; ++i) {
                    this._aframes[i] = file[offset_aframe++];
                    this._aframes_time[i] = file[offset_aframe++];
                    if ((this._bs_flags & 0x40000) != 0x0) {
                        this._aframes_ox_short[i] = (short)((file[offset_aframe++] & 0xFF) + ((file[offset_aframe++] & 0xFF) << 8));
                        this._aframes_oy_short[i] = (short)((file[offset_aframe++] & 0xFF) + ((file[offset_aframe++] & 0xFF) << 8));
                    }
                    else {
                        this._aframes_ox_byte[i] = file[offset_aframe++];
                        this._aframes_oy_byte[i] = file[offset_aframe++];
                    }
                    this._aframes_flags[i] = file[offset_aframe++];
                }
            }
            offset = offset_aframe;
            
            int offset_anim = offset;
            final short nAnims = (short)((file[offset_anim++] & 0xFF) + ((file[offset_anim++] & 0xFF) << 8));
            if (nAnims > 0) {
                this._anims_naf_byte = new byte[nAnims];
                this._anims_af_start = new short[nAnims];
                for (int i = 0; i < nAnims; ++i) {
                    this._anims_naf_byte[i] = file[offset_anim++];
                    this._anims_af_start[i] = (short)((file[offset_anim++] & 0xFF) + ((file[offset_anim++] & 0xFF) << 8));
                }
            }
            offset = offset_anim;
            if (this._nModules <= 0) {
                if (ASprite.s_gcEnabled) {
                    System.gc();
                }
                return;
            }
            if ((this._bs_flags & 0x1000000) != 0x0) {
                int offset_sngimg = offset;
                if ((this._bs_flags & 0x1000000) != 0x0 && offset_sngimg < file.length) {
                    final short _pixel_format = (short)((file[offset_sngimg++] & 0xFF) + ((file[offset_sngimg++] & 0xFF) << 8));
                    int _number_image = 1;
                    if ((this._bs_flags & 0x40000000) != 0x0) {
                        _number_image = file[offset_sngimg++];
                    }
                    if (this._pal_int_not == null) {
                        this._pal_int_not = new int[_number_image];
                    }
                    for (int p = 0; p < _number_image; ++p) {
                        this._palettes = (file[offset_sngimg++] & 0xFF);
                        int colors;
                        if ((colors = (file[offset_sngimg++] & 0xFF)) == 0) {
                            colors = 256;
                        }
                        this._pal_int_not[p] = colors;
                        if (this._pal_int == null) {
                            this._pal_int = new int[_number_image][16][];
                        }
                        final int n38 = offset_sngimg;
                        final short n39 = _pixel_format;
                        final int n40 = colors;
                        final int n41 = p;
                        final int n42 = n40;
                        final short n43 = n39;
                        int n44 = n38;
                        for (int n45 = 0; n45 < this._palettes; ++n45) {
                            this._pal_int[n41][n45] = new int[n42];
                            final int[] array7 = this._pal_int[n41][n45];
                            if (n43 == 21781) {
                                for (int n46 = 0; n46 < n42; ++n46) {
                                    final short _4446 = (short)((file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8));
                                    int a = -16777216;
                                    if ((_4446 & 0x8000) != 0x8000) {
                                        a = 0;
                                        this._alpha = true;
                                    }
                                    int _temp = (a | (_4446 & 0x7C00) << 9 | (_4446 & 0x3E0) << 6 | (_4446 & 0x1F) << 3);
                                    if (_temp == 16253176) {
                                        _temp = 16711935;
                                    }
                                    array7[n46] = _temp;
                                }
                            }
                            else if (n43 == 25861) {
                                for (int n50 = 0; n50 < n42; ++n50) {
                                    final short n51 = (short)((file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8));
                                    int n52 = -16777216;
                                    if ((n51 & 0xFFFF) == 0xF81F) {
                                        n52 = 0;
                                        this._alpha = true;
                                    }
                                    int n53;
                                    if ((n53 = (n52 | (n51 & 0xF800) << 8 | (n51 & 0x7E0) << 5 | (n51 & 0x1F) << 3)) == 16253176) {
                                        n53 = 16711935;
                                    }
                                    array7[n50] = n53;
                                }
                            }
                            else if (n43 == -30712) {
                                //this.var_109f = false;
                                for (int n54 = 0; n54 < n42; ++n54) {
                                    int n55;
                                    if ((n55 = (file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8) + ((file[n44++] & 0xFF) << 16)) == 16711935) {
                                        this._alpha = true;
                                    }
                                    else {
                                        n55 |= 0xFF000000;
                                    }
                                    array7[n54] = n55;
                                }
                            }
                        }
                        offset_sngimg = n44;
                    }
                    this._data_format = (short)((file[offset_sngimg++] & 0xFF) + ((file[offset_sngimg++] & 0xFF) << 8));
                    if (this._data_format == 25840 || this._data_format == -22976) {
                        if (this.var_10b7 == null) {
                            this.var_10b7 = new int[_number_image];
                            this.begone = new int[_number_image];
                        }
                        for (int n56 = 0; n56 < _number_image; ++n56) {
                            int n57 = this._pal_int_not[n56] - 1;
                            this.var_10b7[n56] = 1;
                            this.begone[n56] = 0;
                            while (n57 != 0) {
                                n57 >>= 1;
                                final int[] var_10b7 = this.var_10b7;
                                final int n58 = n56;
                                var_10b7[n58] <<= 1;
                                final int[] var_10bf = this.begone;
                                final int n59 = n56;
                                ++var_10bf[n59];
                            }
                            final int[] var_10b8 = this.var_10b7;
                            final int n60 = n56;
                            --var_10b8[n60];
                        }
                    }
                    if (this._nModules > 0) {
                        this._modules_data_off_int = new int[this._nModules];
                        int n61 = 0;
                        final int n62 = offset_sngimg;
                        for (int n63 = 0; n63 < this._nModules; ++n63) {
                            int n64;
                            if ((this._bs_flags & 0x80) != 0x0) {
                                n64 = (file[offset_sngimg++] & 0xFF) + ((file[offset_sngimg++] & 0xFF) << 8) + ((file[offset_sngimg++] & 0xFF) << 16) + ((file[offset_sngimg++] & 0xFF) << 24);
                            }
                            else {
                                n64 = (short)((file[offset_sngimg++] & 0xFF) + ((file[offset_sngimg++] & 0xFF) << 8));
                            }
                            this._modules_data_off_int[n63] = n61;
                            n61 += n64;
                            offset_sngimg += n64;
                        }
                        int n65 = n62;
                        this._modules_data = new byte[n61];
                        for (int n66 = 0; n66 < this._nModules; ++n66) {
                            int n67;
                            if ((this._bs_flags & 0x80) != 0x0) {
                                n67 = (file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8) + ((file[n65++] & 0xFF) << 16) + ((file[n65++] & 0xFF) << 24);
                            }
                            else {
                                n67 = (short)((file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8));
                            }
                            System.arraycopy(file, n65, this._modules_data, this.GetStartModuleData(n66), n67);
                            n65 += n67;
                        }
                    }
                }
            }
            this._cur_map = -1;
            this.map = new short[16][];
            if ((this._bs_flags & 0x1000) != 0x0) {
                int nFrames_ = this.GetFrameCount();
                if (nFrames_ > 0) {
                    offset = 0;
                    if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
                        this._frames_rc = new byte[nFrames_ << 2];
                        for (int i = 0; i < nFrames_; ++i) {
                            this.GetFrameRect(ASprite.s_rc, i);
                            this._frames_rc[offset++] = (byte)ASprite.s_rc[0];
                            this._frames_rc[offset++] = (byte)ASprite.s_rc[1];
                            this._frames_rc[offset++] = (byte)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this._frames_rc[offset++] = (byte)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                    else {
                        this._frames_rc_short = new short[nFrames_ << 2];
                        for (int i = 0; i < nFrames_; ++i) {
                            this.GetFrameRect(ASprite.s_rc, i);
                            this._frames_rc_short[offset++] = (short)ASprite.s_rc[0];
                            this._frames_rc_short[offset++] = (short)ASprite.s_rc[1];
                            this._frames_rc_short[offset++] = (short)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this._frames_rc_short[offset++] = (short)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                }
            }
            else if ((this._flags & 0x4) != 0x0) {
                this._flags &= 0xFFFFFFFB;
            }
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
        }
        catch (final Exception ex) {}
    }
    
    private void InitMultipleModuleTypes(final int nModules) {
        if (this._module_types == null) {
            this._module_types = new byte[nModules];
            for (int i = 0; i < nModules; ++i) {
                this._module_types[i] = 0;
            }
        }
        if (this._module_colors_int == null) {
            this._module_colors_int = new int[nModules];
        }
    }
    
    final void FreeCacheData() {
        this._pal_int = null;
        this._modules_data = null;
        this._modules_data_off_int = null;
        if (ASprite.s_gcEnabled) {
            System.gc();
        }
    }
    
    final int GetAFrameTime(final int anim, final int aframe) {
        return this._aframes_time[this._anims_af_start[anim] + aframe] & 0xFF;
    }
    
    final int GetAFrames(final int anim) {
        return this._anims_naf_byte[anim] & 0xFF;
    }
    
    private int GetFModules(final int n) {
        if ((this._bs_flags & 0x800) != 0x0) {
            return this._frames_nfm_short[n];
        }
        return this._frames_nfm_byte[n] & 0xFF;
    }
    
    private int GetAFramesOX(final int module) {
        if ((this._bs_flags & 0x40000) != 0x0) {
            return this._aframes_ox_short[module];
        }
        return this._aframes_ox_byte[module];
    }
    
    private int GetAFramesOY(final int module) {
        if ((this._bs_flags & 0x40000) != 0x0) {
            return this._aframes_oy_short[module];
        }
        return this._aframes_oy_byte[module];
    }
    
    final int GetFModuleOX(final int v) {
        return this._fmodules_ox_short[v];
    }
    
    final int GetFModuleOY(final int v) {
        return this._fmodules_oy_short[v];
    }
    
    final int GetFrameWidth(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[(frame << 2) + 2] & 0xFF;
        }
        return this._frames_rc_short[(frame << 2) + 2] & 0xFFFF;
    }
    
    final int GetFrameHeight(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[(frame << 2) + 3] & 0xFF;
        }
        return this._frames_rc_short[(frame << 2) + 3] & 0xFFFF;
    }
    
    final int GetFrameMinX(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[frame << 2];
        }
        return this._frames_rc_short[frame << 2];
    }
    
    final int GetFrameMinY(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[(frame << 2) + 1];
        }
        return this._frames_rc_short[(frame << 2) + 1];
    }
    
    private int GetFrameModule(final int fmoduleOffset) {
        int index;
        if ((this._bs_flags & 0x100000) != 0x0) {
            index = this._fmodules_id_short[fmoduleOffset];
        }
        else {
            index = (this._fmodules_id_byte[fmoduleOffset] & 0xFF);
        }
        return index;
    }
    
    final int GetFrameModule(int frame, final int fmodule) {
        frame = this.GetFrameModuleOffset(frame, fmodule);
        return this.GetFrameModule(frame);
    }
    
    private int GetFrameModuleFlags(final int fmoduleOffset) {
        return this._fmodules_flags[fmoduleOffset] & 0xFF;
    }
    
    final int GetFrameModuleFlags(int frame, final int fmodule) {
        frame = this.GetFrameModuleOffset(frame, fmodule);
        return this.GetFrameModuleFlags(frame);
    }
    
    private int GetFrameModuleOffset(final int frame, final int fmodule) {
        return this._frames_fm_start[frame] + fmodule;
    }
    
    private int GetFrameModuleX(int frame) {
        frame = this._frames_fm_start[frame];
        return this._fmodules_ox_short[frame];
    }
    
    final int GetFrameModuleY(int frame, final int fmodule) {
        frame = this._frames_fm_start[frame] + fmodule;
        return this._fmodules_oy_short[frame];
    }
    
    private void GetFrameRect(final int[] rc, final int frame) {
        this.GetFrameRect(rc, frame, 0, 0, 0, false, true);
    }
    
    private void GetFrameRect(final int[] rc, int frame, final int posX, final int posY, final int flags, final boolean allowRotation, final boolean forceComputeFrameRect) {
        if (!forceComputeFrameRect) {
            int fx = this.GetFrameMinX(frame);
            int fy = this.GetFrameMinY(frame);
            int fw = this.GetFrameWidth(frame);
            int fh = this.GetFrameHeight(frame);
            if ((flags & 0x1) != 0x0) {
                fx = -fx - fw;
            }
            if ((flags & 0x2) != 0x0) {
                fy = -fy - fh;
            }
            if ((flags & 0x4) != 0x0) {
                frame = fx;
                fx = -fy - fh;
                fy = frame;
                frame = fw;
                fw = fh;
                fh = frame;
            }
            ASprite._rectX1 = posX + fx;
            ASprite._rectY1 = posY + fy;
            ASprite._rectX2 = ASprite._rectX1 + fw;
            ASprite._rectY2 = ASprite._rectY1 + fh;
        }
        else {
            ASprite._rectX1 = Integer.MAX_VALUE;
            ASprite._rectY1 = Integer.MAX_VALUE;
            ASprite._rectX2 = Integer.MIN_VALUE;
            ASprite._rectY2 = Integer.MIN_VALUE;
            ASprite._operation = 1;
            this.PaintFrame(null, frame, posX, posY, flags);
            ASprite._operation = 0;
        }
        rc[0] = ASprite._rectX1;
        rc[1] = ASprite._rectY1;
        rc[2] = ASprite._rectX2;
        rc[3] = ASprite._rectY2;
    }
    
    final void GetRect(final int[] rc, final int frame, final int posX, final int posY) {
        this.GetFrameRect(rc, frame, posX, posY, 0, false, false);
    }
    
    final void GetRect(final int[] rc, int anim, int aframe, final int posX, final int posY, final int flags) {
        int rflags = this._aframes_flags[this._anims_af_start[anim] + aframe] & 0xF;
        if ((flags & 0x1) != 0x0) {
            rflags = (ASprite.TRANSFORM_FLIP_X[rflags & 0x7] | (rflags & 0xFFFFFFF8));
        }
        if ((flags & 0x2) != 0x0) {
            rflags = (ASprite.TRANSFORM_FLIP_Y[rflags & 0x7] | (rflags & 0xFFFFFFF8));
        }
        if ((flags & 0x4) != 0x0) {
            rflags = (ASprite.TRANSFORM_ROT_90[rflags & 0x7] | (rflags & 0xFFFFFFF8));
        }
        final int frame = this._aframes[this._anims_af_start[anim] + aframe] & 0xFF;
        int ox = this.GetAFramesOX(this._anims_af_start[anim] + aframe);
        anim = this.GetAFramesOY(this._anims_af_start[anim] + aframe);
        if ((flags & 0x1) != 0x0) {
            ox = -ox;
        }
        if ((flags & 0x2) != 0x0) {
            anim = -anim;
        }
        if ((flags & 0x4) != 0x0) {
            aframe = ox;
            ox = -anim;
            anim = aframe;
        }
        this.GetFrameRect(rc, frame, posX + ox, posY + anim, rflags, false, false);
    }
    
    final int GetAnimationCount() {
        if (this._anims_naf_byte == null) {
            return 0;
        }
        return this._anims_naf_byte.length;
    }
    
    final int GetFrameCount() {
        if ((this._bs_flags & 0x800) != 0x0) {
            if (this._frames_nfm_short == null) {
                return 0;
            }
            return this._frames_nfm_short.length;
        }
        else {
            if (this._frames_nfm_byte == null) {
                return 0;
            }
            return this._frames_nfm_byte.length;
        }
    }
    
    final int CountFrameModules(final int frame) {
        int realcount;
        for (int count = realcount = this.GetFModules(frame), fmodule = 0; fmodule < count; ++fmodule) {
            final int index = this.GetFrameModule(frame, fmodule);
            if ((this.GetFrameModuleFlags(frame, fmodule) & 0x10) != 0x0) {
                realcount = realcount - 1 + this.CountFrameModules(index);
            }
        }
        return realcount;
    }
    
    private int GetStartModuleData(final int module) {
        if (this._modules_data_off_int != null) {
            return this._modules_data_off_int[module];
        }
        return -1;
    }
    
    final int GetFrameRectCount(final int frame) {
        if (this._frames_rects_start != null) {
            return this._frames_rects_start[frame + 1] - this._frames_rects_start[frame];
        }
        return 0;
    }
    
    final void GetFrameRect(int frame, final int rectIndex, final int[] rect, int flags) {
        if (this._frames_rects_start != null && rect != null) {
            flags = this._frames_rects_start[frame];
            if ((frame = this._frames_rects_start[frame + 1] - flags) > 0 && rectIndex < frame) {
                flags = flags + rectIndex << 2;
                if ((this._bs_flags & 0x400) != 0x0) {
                    if (this._frames_rects_short != null) {
                        rect[0] = this._frames_rects_short[flags];
                        rect[1] = this._frames_rects_short[flags + 1];
                        rect[2] = (this._frames_rects_short[flags + 2] & 0xFFFF);
                        rect[3] = (this._frames_rects_short[flags + 3] & 0xFFFF);
                    }
                }
                else if (this._frames_rects != null) {
                    rect[0] = this._frames_rects[flags];
                    rect[1] = this._frames_rects[flags + 1];
                    rect[2] = (this._frames_rects[flags + 2] & 0xFF);
                    rect[3] = (this._frames_rects[flags + 3] & 0xFF);
                }
                return;
            }
            rect[1] = (rect[0] = 0);
            rect[3] = (rect[2] = 0);
        }
    }
    
    static int[] GetPixelBuffer_int(final int[] buffer) {
        if (buffer == null || buffer != ASprite.temp_int) {
            if (ASprite.temp_int == null) {
                ASprite.temp_int = new int[27832];
            }
            return ASprite.temp_int;
        }
        if (buffer == null || buffer != ASprite.transform_int) {
            if (ASprite.transform_int == null) {
                ASprite.transform_int = new int[27832];
            }
            return ASprite.transform_int;
        }
        return null;
    }
    
    final boolean DoesPaletteHaveImageCache(final int pal) {
        return pal >= 0 && this._module_image_imageAA != null && pal < this._module_image_imageAA.length && this._module_image_imageAA[pal] != null;
    }
    
    final void SetFModuleOX(final int baseOffset, final int value) {
        this._fmodules_ox_short[baseOffset] = (short)value;
    }
    
    final void SetFModuleOY(final int baseOffset, final int value) {
        this._fmodules_oy_short[baseOffset] = (short)value;
    }
    
    public final void PFXCache_Init() {
        this._imgPFXModuleCache = new GLLibImage[this._palettes][this._nModules];
        this._PFXParamsModuleCRC = new int[this._palettes][this._nModules];
    }
    
    public final boolean PFXCache_IsInited() {
        return this._imgPFXModuleCache != null;
    }
    
    private static int PFXCache_GetParamsCRC(final int[] PFXparams, final int PFXid) {
        return GLLib.Crc32(PFXparams, 0, PFXparams.length, PFXid);
    }
    
    private boolean PFXCache_TryPaintModule(int module, final int x, final int y, int flags) {
        if (this.PFXCache_IsInited()) {
            int PFXid = GLLib.PFX_GetFirstEnabledEffect();
            final int[] PFXparams = GLLib.PFX_GetParams(PFXid);
            if (this._imgPFXModuleCache != null && this._imgPFXModuleCache[this._crt_pal][module] != null && PFXCache_GetParamsCRC(PFXparams, PFXid) == this._PFXParamsModuleCRC[this._crt_pal][module]) {
                final GLLibImage img = this._imgPFXModuleCache[this._crt_pal][module];
                GLLib.DrawRegion(GLLib.g, img, 0, 0, img.image.getWidth(), img.image.getHeight(), ASprite.midp2_flags[flags], x, y, 20, false);
                return true;
            }
        }
        return false;
    }
    
    private boolean PFXCache_TryCacheAndPaintModule(int module, final int x, final int y, final int[] data, int flags) {
        if (this.PFXCache_IsInited() && data != null) {
            int PFXid = GLLib.PFX_GetFirstEnabledEffect();
            final int[] PFXparams = GLLib.PFX_GetParams(PFXid);
            final GLLibImage img = GLLibImage.createRGBImage(data, GLLib.s_PFX_newSizeX, GLLib.s_PFX_newSizeY, true);
            
            this._imgPFXModuleCache[this._crt_pal][module] = img;
            this._PFXParamsModuleCRC[this._crt_pal][module] = PFXCache_GetParamsCRC(PFXparams, PFXid);
            final int width = img.image.getWidth();
            final int height = img.image.getHeight();
            GLLib.DrawRegion(GLLib.g, img, 0, 0, width, height, ASprite.midp2_flags[flags], x, y, 20, false);
            return true;
        }
        return false;
    }
    
    static void InitCachePool(final int poolCount) {
        ASprite._poolCacheStack = new short[poolCount][];
        ASprite._poolCacheSprites = new ASprite[poolCount][];
        ASprite._poolCacheStackIndex = new int[poolCount];
        ASprite._poolCacheStackMax = new int[poolCount];
    }
    
    static void InitPoolSize(final int poolIndex, int size) {
        ASprite._poolCacheStackMax[poolIndex] = size;
        ASprite._poolCacheStack[poolIndex] = new short[size];
        ASprite._poolCacheSprites[poolIndex] = new ASprite[size];
        for (size = 0; size < ASprite._poolCacheStack[poolIndex].length; ++size) {
            ASprite._poolCacheStack[poolIndex][size] = -1;
        }
    }
    
    final void SetPool(int poolIndex) {
        this._cur_pool = poolIndex;
        if (this._module_image_imageAA == null) {
            this._module_image_imageAA = new GLLibImage[this._palettes][];
            for (poolIndex = 0; poolIndex < this._palettes; ++poolIndex) {
                this._module_image_imageAA[poolIndex] = new GLLibImage[this._nModules];
            }
        }
    }
    
    final void FreeCachePoolData() {
        if (this._cur_pool >= 0) {
            for (int i = 0; i < ASprite._poolCacheStackMax[this._cur_pool]; ++i) {
                if (ASprite._poolCacheSprites[this._cur_pool][i] == this )
                {
                    int img_index = ASprite._poolCacheStack[this._cur_pool][i];
                    int img_pal = img_index >> 10;
                    final int img_module = img_index & 0x3FF;
                    ASprite._poolCacheSprites[this._cur_pool][i] = null;
                    this._module_image_imageAA[img_pal][img_module] = null;
                }
            }
        }
    }
    
    private void UpdatePoolCache(int module, final Object cached) {
        if (this._cur_pool >= 0 && this._module_image_imageAA[this._crt_pal][module] == null) {
            final int cur_index = ASprite._poolCacheStackIndex[this._cur_pool];
            short img_index = ASprite._poolCacheStack[this._cur_pool][cur_index];
            final int img_pal = img_index >> 10;
            final int img_module = img_index & 0x3FF;

            if (img_index >= 0 && _poolCacheSprites[this._cur_pool][cur_index] != null) {
                this._module_image_imageAA[img_pal][img_module] = null;
            }
            ASprite._poolCacheStack[this._cur_pool][cur_index] = (short)((module & 0x3FF) + (this._crt_pal << 10));
            ASprite._poolCacheSprites[this._cur_pool][cur_index] = this;
            ASprite._poolCacheStackIndex[this._cur_pool] = (ASprite._poolCacheStackIndex[this._cur_pool] + 1) % ASprite._poolCacheStackMax[this._cur_pool];
            this._module_image_imageAA[this._crt_pal][module] = (GLLibImage)cached;
        }
    }
    
    Object DecodeImage(final int module) {
        return this.DecodeImage_int(module);
    }
    
    private int[] DecodeImage_int(int module) {
        if (this._modules_data_off_int != null && this._modules_data != null) {
            final byte b = (byte)((this._module_img == null) ? 0 : this._module_img[module]);
            final int sizeX = this._modules_w_short[module] & 0xFFFF;
            final int sizeY = this._modules_h_short[module] & 0xFFFF;
            module = this.GetStartModuleData(module);
            int di = 0;
            int ds = sizeX * sizeY;
            if (ASprite.temp_int == null) {
                ASprite.temp_int = new int[27832]; // TMP_BUFFER_SIZE
            }
            final int[] pal_int;
            boolean ret;
            if ((pal_int = ((_crt_pal >= 0 && _crt_pal < this._palettes && this._pal_int != null && _crt_pal < this._pal_int[b].length) ? this._pal_int[b][_crt_pal] : null)) == null) {
                ret = false;
            }
            else {
                if (this._data_format == 25840) {
                    while (di < ds) {
                        int c = _modules_data[module++] & 0xFF;
                        final int clr_int = pal_int[c & this.var_10b7[b]];
                        c >>= this.begone[b];
                        while (c-- >= 0) {
                            ASprite.temp_int[di++] = clr_int;
                        }
                    }
                }
                else if (this._data_format == 10225) {
                    while (di < ds) {
                        int c2;
                        if ((c2 = (_modules_data[module++] & 0xFF)) > 127) {
                            final int clr_int = pal_int[_modules_data[module++] & 0xFF];
                            c2 -= 128;
                            while (c2-- > 0) {
                                ASprite.temp_int[di++] = clr_int;
                            }
                        }
                        else {
                            ASprite.temp_int[di++] = pal_int[c2];
                        }
                    }
                }
                else if (this._data_format == 22258) {
                    --module;
                    --di;
                    --ds;
                    while (di < ds) {
                        int c;
                        if ((c = _modules_data[++module]) < 0) {
                            c += 128;
                            do {
                                ASprite.temp_int[++di] = pal_int[_modules_data[++module] & 0xFF];
                            } while (--c > 0);
                        }
                        else {
                            final int clr_int = pal_int[_modules_data[++module] & 0xFF];
                            do {
                                ASprite.temp_int[++di] = clr_int;
                            } while (--c > 0);
                        }
                    }
                }
                else if (this._data_format == 5632) {
                    int unkvar = ds + (((ds & 0x1) == 0x0) ? 0 : 2) >> 1;
                    while (--unkvar >= 0) {
                        int c = _modules_data[module++];
                        ASprite.temp_int[di++] = pal_int[c >> 4 & 0xF];
                        ASprite.temp_int[di++] = pal_int[c & 0xF];
                    }
                }
                else if (this._data_format == 1024) {
                    int unkvar = ds + (((ds & 0x3) == 0x0) ? 0 : 4) >> 2;
                    while (--unkvar >= 0) {
                        final int c = _modules_data[module++];
                        ASprite.temp_int[di++] = pal_int[c >> 6 & 0x3];
                        ASprite.temp_int[di++] = pal_int[c >> 4 & 0x3];
                        ASprite.temp_int[di++] = pal_int[c >> 2 & 0x3];
                        ASprite.temp_int[di++] = pal_int[c & 0x3];
                    }
                }
                else if (this._data_format == 512) {
                    int unkvar = ds + (((ds & 0x7) == 0x0) ? 0 : 8) >> 3;
                    while (--unkvar >= 0) {
                        final int c = _modules_data[module++];
                        ASprite.temp_int[di++] = pal_int[c >> 7 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 6 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 5 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 4 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 3 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 2 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c >> 1 & 0x1];
                        ASprite.temp_int[di++] = pal_int[c & 0x1];
                    }
                }
                else if (this._data_format == 22018) {
                    while (--ds >= 0) {
                        ASprite.temp_int[di++] = pal_int[_modules_data[module++] & 0xFF];
                    }
                }
                ret = true;
            }
            if (ret) {
                return ASprite.temp_int;
            }
        }
        return null;
    }
    
    final void SetCharMap(final short[] pNewMap) {
        this._nDivider = pNewMap[0];
        this._pMapCharShort = new short[this._nDivider][];
        int index = 1;
        for (int i = 0; i < this._nDivider; ++i) {
            (this._pMapCharShort[i] = new short[2])[0] = pNewMap[index++];
            this._pMapCharShort[i][1] = pNewMap[index++];
        }
        
     	for (int i = index; i < pNewMap.length;)
     	{
            final int insertIndex = pNewMap[i++];
            final int count;
            final short[] newEntry;
            (newEntry = new short[((count = pNewMap[i++]) << 1) + 2])[0] = this._pMapCharShort[insertIndex][0];
            newEntry[1] = this._pMapCharShort[insertIndex][1];
            for (int j = 0; j < count; ++j) {
                newEntry[(j << 1) + 2] = pNewMap[i++];
                newEntry[(j << 1) + 3] = pNewMap[i++];
            }
            this._pMapCharShort[insertIndex] = newEntry;
        }
        this._nFontAscent = this.GetFrameModuleY(0, 0);
        this._nLineHeight = this._nFontAscent + this.GetFrameModuleY(0, 1);
        
        this._nLineSpacing = this.GetFrameModuleY(0, 2) - this.GetFrameModuleY(0, 1);
        this._nSpaceWidth = this.GetFrameModuleX(this.GetCharFrame(32));
    }
    
    private int GetCharFrame(final int n) {
        if (this._pMapCharShort == null) {
            return 0;
        }
        final int n2 = n % this._nDivider;
        if (this._pMapCharShort[n2][0] == n) {
            return this._pMapCharShort[n2][1];
        }
        int n3;
        int length;
        for (n3 = 2, length = this._pMapCharShort[n2].length; n3 < length && this._pMapCharShort[n2][n3] != n; n3 += 2) {}
        if (n3 >= length) {
            return 1;
        }
        return this._pMapCharShort[n2][n3 + 1];
    }
    
    final int GetLineSpacing() {
        if (this.m_scaleAccelerator >= 0) {
            return this._nLineSpacing * this.m_scaleAccelerator >> 8;
        }
        return this._nLineSpacing;
    }
    
    final int _GetLineHeight() {
        if (this.m_scaleAccelerator >= 0) {
            return this._nLineHeight * this.m_scaleAccelerator >> 8;
        }
        return this._nLineHeight;
    }
    
    private int GetSpaceWidth() {
        if (this.m_scaleAccelerator >= 0) {
            return this._nSpaceWidth * this.m_scaleAccelerator >> 8;
        }
        return this._nSpaceWidth;
    }
    
    private int GetLineHeightFake() {
        if (this.m_scaleAccelerator >= 0) {
            return this._nHeightFake * this.m_scaleAccelerator >> 8;
        }
        return this._nHeightFake;
    }
    
    final void SetLineHeightFake(final int heightFake) {
        this._nHeightFake = heightFake;
    }
    
    final int GetLineHeight() {
        if (this.m_scaleAccelerator >= 0) {
            return this._nLineHeight * this.m_scaleAccelerator >> 8;
        }
        return this._nLineHeight;
    }
    
    private static final int GetWrapInfo_LineStart(final short[] wrapInfo, int iLine) {
        iLine = iLine * 3 + 1;
        return wrapInfo[iLine];
    }
    
    private static final int GetWrapInfo_LineWidth(final short[] wrapInfo, int iLine) {
        iLine = iLine * 3 + 2;
        return wrapInfo[iLine];
    }
    
    final short[] WraptextB(final String s, final int width, final boolean bFreeWrap) {
        if (ASprite._warpTextInfo == null) {
            ASprite._warpTextInfo = new short[1100];
        }
        final int str_len = s.length();
        short lineSize = 0;
        int n3 = 1;
        int lastSpacePos = 0;
        int var_11df = this._bBold ? 1 : 0;
        int var_11d7 = this._bUnderline ? 1 : 0;
        int _crt_pal = this._crt_pal;
        int n4 = 0;
        short n5 = 0;
        int var_11df2 = this._bBold ? 1 : 0;
        int var_11d8 = this._bUnderline ? 1 : 0;
        int _crt_pal2;
        int n6 = ((_crt_pal2 = this._crt_pal) & 0xFFF) | ((var_11df2 != 0) ? 4096 : 0) | ((var_11d8 != 0) ? 8192 : 0);
        for (int i = 0; i < str_len; ++i) {
            final char c = s.charAt(i);
            final int sub_63ed = this.GetLineSpacing(this.GetCharFrame(c));
            if (c == ' ' || c == ASprite.k_cCanBreakLine) {
                if (c == ' ') {
                    lineSize += (short)this.GetSpaceWidth();
                }
                lastSpacePos = (short)i;
                var_11df = var_11df2;
                n4 = 1;
                n5 = 0;
                var_11d7 = var_11d8;
                _crt_pal = _crt_pal2;
                if (lineSize > width) {
                    n4 = 0;
                    for (int pos = lastSpacePos; pos >= 0 && (s.charAt(pos) == ' ' || s.charAt(pos) == ASprite.k_cCanBreakLine); --pos) {
                        if (s.charAt(pos) == ' ') {
                            lineSize -= (short)this.GetSpaceWidth();
                        }
                    }
                    while (lastSpacePos < str_len && (s.charAt(lastSpacePos) == ' ' || s.charAt(lastSpacePos) == ASprite.k_cCanBreakLine)) {
                        ++lastSpacePos;
                    }
                    lastSpacePos = (i = (short)(lastSpacePos - 1));
                    var_11df2 = var_11df;
                    final short[] warpTextInfo = ASprite._warpTextInfo;
                    final int n7 = n3;
                    final short n8 = (short)(n3 + 1);
                    warpTextInfo[n7] = (short)(lastSpacePos + 1);
                    final short[] var_11ff2 = ASprite._warpTextInfo;
                    final short n9 = n8;
                    final short n10 = (short)(n8 + 1);
                    var_11ff2[n9] = lineSize;
                    final short[] var_11ff3 = ASprite._warpTextInfo;
                    final short n11 = n10;
                    n3 = (short)(n10 + 1);
                    var_11ff3[n11] = (short)n6;
                    var_11d8 = var_11d7;
                    _crt_pal2 = _crt_pal;
                    n6 = ((_crt_pal & 0xFFF) | ((var_11df != 0) ? 4096 : 0) | ((var_11d7 != 0) ? 8192 : 0));
                    lineSize = 0;
                }
            }
            else if (c == '\\') {
                ++i;
                final char char2;
                if ((char2 = s.charAt(i)) == '^') {
                    var_11df2 = ((var_11df2 == 0) ? 1 : 0);
                }
                else if (char2 == '_') {
                    var_11d8 = ((var_11d8 == 0) ? 1 : 0);
                }
                else {
                    int n12 = char2 & '\u00ff';
                    n12 -= 48;
                    if (n12 < this._palettes) {
                        _crt_pal2 = n12;
                    }
                }
            }
            else if (c == '\n') {
                final short[] var_11ff4 = ASprite._warpTextInfo;
                final int n13 = n3;
                final short n14 = (short)(n3 + 1);
                var_11ff4[n13] = (short)i;
                final short[] var_11ff5 = ASprite._warpTextInfo;
                final short n15 = n14;
                final short n16 = (short)(n14 + 1);
                var_11ff5[n15] = lineSize;
                lastSpacePos = (short)i;
                lineSize = 0;
                n5 = 0;
                final short[] var_11ff6 = ASprite._warpTextInfo;
                final short n17 = n16;
                n3 = (short)(n16 + 1);
                var_11ff6[n17] = (short)n6;
                n6 = ((_crt_pal2 & 0xFFF) | ((var_11df2 != 0) ? 4096 : 0) | ((var_11d8 != 0) ? 8192 : 0));
            }
            else {
                if (c < ' ') {
                    if (c == '\u0001') {
                        ++i;
                        continue;
                    }
                    if (c != '\u0002') {
                        continue;
                    }
                    ++i;
                }
                int n18 = sub_63ed + this.GetLineHeightFake();
                if (var_11df2 != 0) {
                    ++n18;
                }
                n5 += (short)n18;
                if ((lineSize += (short)n18) > width) {
                    final boolean b2;
                    if (b2 = (n4 == 0)) {
                        lineSize -= (short)n18;
                        lastSpacePos = (short)(i - 1);
                    }
                    n4 = 0;
                    for (int n19 = lastSpacePos; n19 >= 0 && (s.charAt(n19) == ' ' || s.charAt(n19) == '\n' || s.charAt(n19) == ASprite.k_cCanBreakLine); --n19) {
                        if (s.charAt(n19) == ' ') {
                            lineSize -= (short)this.GetSpaceWidth();
                        }
                    }
                    if (b2) {
                        var_11df = var_11df2;
                        var_11d7 = var_11d8;
                        _crt_pal = _crt_pal2;
                        n5 = 0;
                    }
                    if (s.charAt(lastSpacePos) != '\n') {
                        final short[] var_11ff7 = ASprite._warpTextInfo;
                        final int n20 = n3;
                        final short n21 = (short)(n3 + 1);
                        var_11ff7[n20] = (short)(lastSpacePos + 1);
                        final short[] var_11ff8 = ASprite._warpTextInfo;
                        final short n22 = n21;
                        n3 = (short)(n21 + 1);
                        var_11ff8[n22] = (short)(lineSize - n5);
                    }
                    final short[] var_11ff9 = ASprite._warpTextInfo;
                    final int n23 = n3;
                    n3 = (short)(n3 + 1);
                    var_11ff9[n23] = (short)n6;
                    var_11d8 = var_11d7;
                    _crt_pal2 = _crt_pal;
                    n6 = ((_crt_pal & 0xFFF) | ((var_11df != 0) ? 4096 : 0) | ((var_11d7 != 0) ? 8192 : 0));
                    lineSize = 0;
                    i = lastSpacePos;
                    var_11df2 = var_11df;
                }
            }
        }
        final short[] var_11ff10 = ASprite._warpTextInfo;
        final int n24 = n3;
        final short n25 = (short)(n3 + 1);
        var_11ff10[n24] = (short)str_len;
        final short[] var_11ff11 = ASprite._warpTextInfo;
        final short n26 = n25;
        final short n27 = (short)(n25 + 1);
        var_11ff11[n26] = lineSize;
        final short[] var_11ff12 = ASprite._warpTextInfo;
        final short n28 = n27;
        final short cnt = (short)(n27 + 1);
        var_11ff12[n28] = (short)n6;
        ASprite._warpTextInfo[0] = (short)(cnt / 3);
        return ASprite._warpTextInfo;
    }
    
    final void DrawPageB(final Graphics g, final String s, final short[] info, final int x, int y, int startLine, int maxLines, final int anchor, int maxChars, final boolean bottomToTop) {
        startLine = info[0];
        maxChars = this.GetLineHeight();
        if (maxLines == -1) {
            maxLines = startLine;
        }
        if (maxLines > startLine) {
            maxLines = startLine;
        }
        maxChars += this.GetLineSpacing();
        if ((anchor & 0x20) != 0x0) {
            y -= maxChars * (maxLines - 1);
        }
        else if ((anchor & 0x2) != 0x0) {
            y -= maxChars * (maxLines - 1) >> 1;
        }
        ASprite._old_pal = this._crt_pal;
        final boolean old_bold = this._bBold;
        final boolean old_underline = this._bUnderline;
        final int sub_3600;
        final int n6 = (sub_3600 = GLLib.GetClipY(g, true)) + GLLib.GetClipHeight(g, true);
        final int n7 = sub_3600 - maxChars;
        final int maxYLimit = n6 + maxChars;
        for (int k = 0, j = 0; j < startLine && k <= maxLines - 1; ++j, ++k) {
            ASprite._index1 = ((j > 0) ? GetWrapInfo_LineStart(info, j - 1) : 0);
            ASprite._index2 = GetWrapInfo_LineStart(info, j);
            if (ASprite._index1 < s.length() && s.charAt(ASprite._index1) == '\n') {
                ++ASprite._index1;
            }
            int xx = x;
            int yy;
            if ((yy = y + k * maxChars) >= n7) {
                if (yy > maxYLimit) {
                    break;
                }
                if ((anchor & 0x2B) != 0x0) {
                    if (this.m_scaleAccelerator >= 0) {
                        if ((anchor & 0x8) != 0x0) {
                            xx = x - (GetWrapInfo_LineWidth(info, j) * this.m_scaleAccelerator >> 8);
                        }
                        else if ((anchor & 0x1) != 0x0) {
                            xx = x - (GetWrapInfo_LineWidth(info, j) * this.m_scaleAccelerator >> 9);
                        }
                    }
                    else if ((anchor & 0x8) != 0x0) {
                        xx = x - GetWrapInfo_LineWidth(info, j);
                    }
                    else if ((anchor & 0x1) != 0x0) {
                        xx = x - (GetWrapInfo_LineWidth(info, j) >> 1);
                    }
                    if ((anchor & 0x20) != 0x0) {
                        yy -= this.GetLineHeight();
                    }
                    else if ((anchor & 0x2) != 0x0) {
                        yy -= this.GetLineHeight() >> 1;
                    }
                }
                final short format = info[j * 3 + 3];
                this._bBold = ((format & 0x1000) != 0x0);
                this._bUnderline = ((format & 0x2000) != 0x0);
                this.SetCurrentPalette(format & 0xFFF);
                this.DrawStringOrChars(g, s, xx, yy, 0, false);
            }
        }
        ASprite._index1 = -1;
        ASprite._index2 = -1;
        ASprite._indexMax = -1;
        this._crt_pal = ASprite._old_pal;
        this._bBold = old_bold;
        this._bUnderline = old_underline;
    }
    
    final void UpdateStringOrCharsSize(final String s, final char[] charBuff) {
        if (s == null) {
            return;
        }
        ASprite._text_w = 0;
        ASprite._text_h = this.GetLineHeight();
        int n = 0;
        final boolean b = s != null;
        int i = (ASprite._index1 >= 0) ? ASprite._index1 : 0;
        int n2;
        if (b) {
            n2 = ((ASprite._index2 >= 0) ? ASprite._index2 : s.length());
        }
        else {
            n2 = ((ASprite._index2 >= 0) ? ASprite._index2 : 0);
        }
        boolean var_11df = this._bBold;
        while (i < n2) {
            Label_0328: {
                final char c;
                if ((c = (b ? s.charAt(i) : 0)) == '\\') {
                    ++i;
                    if ((b ? s.charAt(i) : 0) == '^') {
                        var_11df = !var_11df;
                    }
                }
                else {
                    int sub_4851;
                    if (c > ' ') {
                        sub_4851 = this.GetCharFrame(c);
                    }
                    else {
                        if (c == ' ' || c == ASprite.k_cCanBreakLine) {
                            if (c == ' ') {
                                n += this.GetSpaceWidth();
                            }
                            break Label_0328;
                        }
                        if (c == ' ') {
                            n += this.GetSpaceWidth();
                            break Label_0328;
                        }
                        if (c == '\n') {
                            if (n > ASprite._text_w) {
                                ASprite._text_w = n;
                            }
                            n = 0;
                            ASprite._text_h += this.GetLineSpacing() + this.GetLineHeight();
                            break Label_0328;
                        }
                        if (c == '\u0001') {
                            ++i;
                            break Label_0328;
                        }
                        if (c != '\u0002') {
                            break Label_0328;
                        }
                        ++i;
                        sub_4851 = (b ? s.charAt(i) : 0);
                    }
                    n += this.GetLineSpacing(sub_4851) + this.GetLineHeightFake();
                    if (var_11df) {
                        ++n;
                    }
                }
            }
            ++i;
        }
        if (n > ASprite._text_w) {
            ASprite._text_w = n;
        }
        if (ASprite._text_w > 0) {
            ASprite._text_w -= this.GetLineHeightFake();
        }
    }
    
    final void DrawString(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        this.DrawStringOrChars(graphics, s, n, n2, n3, true);
    }
    
    private void DrawStringOrChars(Graphics graphics, String s, int x, int y, int anchor, final boolean restorecol) {
        
        if (s != null) {
            if (this.m_scaleAccelerator >= 0) {
                y += this._nFontAscent * this.m_scaleAccelerator >> 8;
            }
            else {
                y += this._nFontAscent;
            }
            final boolean isDrawString = s != null;
            this.UpdateStringOrCharsSize(s, null);
            if ((anchor & 0x2B) != 0x0) {
                if ((anchor & 0x8) != 0x0) {
                    x -= ASprite._text_w;
                }
                else if ((anchor & 0x1) != 0x0) {
                    x -= ASprite._text_w >> 1;
                }
                if ((anchor & 0x20) != 0x0) {
                    y -= ASprite._text_h;
                }
                else if ((anchor & 0x2) != 0x0) {
                    y -= ASprite._text_h >> 1;
                }
            }
            anchor = x;
            if (restorecol) {
                ASprite._old_pal = this._crt_pal;
            }
            final int index1 = (ASprite._index1 >= 0) ? ASprite._index1 : 0;
            int index2;
            if (isDrawString) {
                index2 = ((ASprite._index2 >= 0) ? ASprite._index2 : s.length());
            }
            else {
                index2 = ((ASprite._index2 >= 0) ? ASprite._index2 : 0);
            }
            if (ASprite._indexMax >= 0 && index2 > ASprite._indexMax) {
                index2 = ASprite._indexMax;
            }
            for (int i = index1; i < index2; ++i) {
                final char c;
                if ((c = (isDrawString ? s.charAt(i) : 0)) == '\\') {
                    ++i;
                    final char c2;
                    if ((c2 = (isDrawString ? s.charAt(i) : 0)) == '_') {
                        this._bUnderline = !this._bUnderline;
                    }
                    else if (c2 == '^') {
                        this._bBold = !this._bBold;
                    }
                    else {
                        this.SetCurrentPalette((c2 & '\u00ff') - 48);
                    }
                }
                else if (c != ASprite.k_cCanBreakLine) {
                    int sub_4851;
                    if (c > ' ') {
                        sub_4851 = this.GetCharFrame(c);
                    }
                    else {
                        if (c == ' ') {
                            if (this._bUnderline) {
                                final int uc = this.GetCharFrame(95);
                                this.PaintFrame(graphics, uc, anchor + (this.GetSpaceWidth() - this.GetLineSpacing(uc) >> 1), y, 0);
                            }
                            anchor += this.GetSpaceWidth();
                            continue;
                        }
                        if (c == '\n') {
                            anchor = x;
                            y += this.GetLineSpacing() + this.GetLineHeight();
                            continue;
                        }
                        if (c == '\u0001') {
                            ++i;
                            final char c3;
                            if ((c3 = (isDrawString ? s.charAt(i) : 0)) < this._palettes) {
                                this.SetCurrentPalette(c3);
                            }
                            if (c3 == '\u00ff') {
                                this._crt_pal = ASprite._old_pal;
                            }
                            continue;
                        }
                        else {
                            if (c != '\u0002') {
                                continue;
                            }
                            ++i;
                            sub_4851 = (isDrawString ? s.charAt(i) : 0);
                        }
                    }
                    final int n7 = sub_4851;
                    this.PaintFrame(graphics, n7, anchor, y, 0);
                    if (this._bUnderline) {
                        final int sub_4853 = this.GetCharFrame(95);
                        this.PaintFrame(graphics, sub_4853, anchor + (this.GetLineSpacing(n7) - this.GetLineSpacing(sub_4853) >> 1), y, 0);
                    }
                    if (this._bBold) {
                        ++anchor;
                        this.PaintFrame(graphics, n7, anchor, y, 0);
                    }
                    anchor += this.GetLineSpacing(n7) + this.GetLineHeightFake();
                }
            }
            if (restorecol) {
                this._crt_pal = ASprite._old_pal;
            }
        }
    }
    
    private final int GetLineSpacing(final int n) {
        if (this.m_scaleAccelerator >= 0) {
            return this.GetFrameModuleX(n) * this.m_scaleAccelerator >> 8;
        }
        return this.GetFrameModuleX(n);
    }
    
    final void SetCurrentPalette(final int pal) {
        
        if (pal < this._palettes && pal >= 0) {
            this._crt_pal = pal;
        }
    }
    
    final int GetCurrentPalette() {
        return this._crt_pal;
    }
    
    final int GetFrameModulesCount(final int frame) {
        if ((this._bs_flags & 0x100000) != 0x0) {
            return this._frames_nfm_short[frame];
        }
        return this._frames_nfm_byte[frame];
    }
    
    final void BuildCacheImages(final int pal, int m1, int m2, int pal_copy) {
        if (this._module_image_imageAA == null) {
            this._module_image_imageAA = new GLLibImage[this._palettes][];
        }
        if (this._module_image_imageAA[pal] == null) {
            this._module_image_imageAA[pal] = new GLLibImage[this._nModules];
        }
        if (this._nModules == 0) {
            return;
        }
        if (m2 == -1) {
            m2 = this._nModules - 1;
        }
        if ((this._bs_flags & 0x1000008) != 0x0) {
            this._crt_pal = pal;
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
            while (m1 <= m2) {
                if (((this._module_types != null) ? this._module_types[m1] : 0) == 0) {
                    int sizeX = this._modules_w_short[m1] & 0xFFFF;
                    int sizeY = this._modules_h_short[m1] & 0xFFFF;
                    int[] image_data2;
                    if (sizeX > 0 && sizeY > 0 && (image_data2 = this.DecodeImage_int(m1)) != null) {
                        if (GLLib.pfx_useSpriteEffects && (GLLib.s_PFX_type & 0xFF7E0) != 0x0) {
                            image_data2 = GLLib.PFX_ProcessSpriteEffects(null, image_data2, 0, 0, sizeX, sizeY, 0, this._alpha, false, false);
                            sizeX = GLLib.s_PFX_newSizeX;
                            sizeY = GLLib.s_PFX_newSizeY;
                        }
                        boolean b = false;
                        for (int j = 0; j < sizeX * sizeY; ++j) {
                            if ((image_data2[j] & 0xFF000000) != 0xFF000000) {
                                b = true;
                                break;
                            }
                        }
                        this._module_image_imageAA[pal][m1] = GLLibImage.createRGBImage(TransformRGB(image_data2, sizeY, sizeX, 4, null), sizeY, sizeX, b);
                    }
                }
                ++m1;
            }
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
            this._crt_pal = pal_copy;
        }
        if (ASprite.s_gcEnabled) {
            System.gc();
        }
    }
    
    final void BuildFrameCacheImages(final int palette, final int frame, int useGc) {
        useGc = (ASprite.s_gcEnabled ? 1 : 0);
        if (ASprite.s_gcEnabled) {
            System.gc();
            ASprite.s_gcEnabled = false;
        }
        for (int numModules = this.GetFModules(frame), m = 0; m < numModules; ++m) {
            final int moduleId = this.GetFrameModule(frame, m);
            if (((this._module_image_imageAA != null && palette >= 0 && palette < this._module_image_imageAA.length && this._module_image_imageAA[palette] != null && moduleId >= 0 && moduleId < this._module_image_imageAA[palette].length) ? this._module_image_imageAA[palette][moduleId] : null) == null) {
                this.BuildCacheImages(palette, moduleId, moduleId, -1);
            }
        }
        if (ASprite.s_gcEnabled = (useGc != 0)) {
            System.gc();
        }
    }
    
    final void sub_68a3(final int n) {
        if (this._module_image_imageAA != null && n < this._module_image_imageAA.length) {
            this._module_image_imageAA[n] = null;
        }
    }
    
    final void sub_68e7(int n, int sub_312c, int n2) {
        final int frames = this.GetFrameCount();
        if (n2 == -1 || n2 >= frames) {
            n2 = frames - 1;
        }
        if (this._frame_image_imageAAA == null) {
            this._frame_image_imageAAA = new GLLibImage[this._palettes][][];
        }
        final int n4 = this._cur_map + 1;
        if (this._frame_image_imageAAA[n] == null) {
            
            int i = 0;
            int length = 0;
            Label_0128: {
                if (this.map != null) {
                    if (this.map.length != 16) {
                        length = this.map.length;
                        break Label_0128;
                    }
                    for (i = 15; i >= 0 && this.map[i] == null; --i) {}
                    ++i;
                }
                length = i;
            }
            this._frame_image_imageAAA[n] = new GLLibImage[length + 1][];
        }
        if (this._frame_image_imageAAA[n][n4] == null) {
            this._frame_image_imageAAA[n][n4] = new GLLibImage[frames];
        }
        for (int i = sub_312c; i <= n2; ++i) {
            sub_312c = this.GetFrameWidth(i);
            int sub_3718 = this.GetFrameHeight(i);
            if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                final int sub_5bbb = GLLib.PFX_Scale_GetScaleX();
                final int sub_5bfe = GLLib.PFX_Scale_GetScaleY();
                sub_312c = sub_312c * sub_5bbb / 100;
                sub_3718 = sub_3718 * sub_5bfe / 100;
            }
            GLLibImage class_l;
            if (sub_312c == 0 || sub_3718 == 0) {
                class_l = null;
            }
            else {
    
                final int _crt_pal = n;
                
                boolean var_10e7 = false;
                int sub_312c2 = this.GetFrameWidth(i);
                int sub_3719 = this.GetFrameHeight(i);
                final int sub_31e6 = this.GetFrameMinX(i);
                final int sub_3720 = this.GetFrameMinY(i);
                int n10 = -sub_31e6;
                int n11 = -sub_3720;
                if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                    final int sub_5bbb2 = GLLib.PFX_Scale_GetScaleX();
                    final int sub_5bfe2 = GLLib.PFX_Scale_GetScaleY();
                    sub_312c2 = sub_312c2 * sub_5bbb2 / 100;
                    sub_3719 = sub_3719 * sub_5bfe2 / 100;
                    n10 = n10 * sub_5bbb2 / 100;
                    n11 = n11 * sub_5bfe2 / 100;
                }
                int j = sub_312c2 * sub_3719;
                int[] array2;
                if (sub_312c2 == 0 || sub_3719 == 0) {
                    array2 = null;
                }
                else {
                    final int[] array3 = new int[j];
                    final int _crt_pal2 = this._crt_pal;
                    this._crt_pal = _crt_pal;
                    final int n12;
                    if (((n12 = ASprite.TRANSFORM_ROT_90[0]) & 0x4) != 0x0) {
                        final int n13 = sub_312c2;
                        sub_312c2 = sub_3719;
                        sub_3719 = n13;
                    }
                    final GLLibImage img;
                    final Graphics graphics;
                    (graphics = (img = GLLibImage.createImage(sub_312c2, sub_3719)).image.getGraphics()).setColor(-65281);
                    graphics.fillRect(0, 0, sub_312c2, sub_3719);
                    if ((n12 & 0x4) != 0x0) {
                        final int var_10c7 = sub_3719;
                        final int var_10cf = sub_312c2;
                        ASprite._graphicsWidth = var_10c7;
                        ASprite._graphicsHeight = var_10cf;
                    }
                    this.PaintFrame(graphics, i, n10, n11, 0);
                    if ((n12 & 0x4) != 0x0) {
                        final int var_1ddf = GLLib.s_screenWidth;
                        final int var_1de7 = GLLib.s_screenHeight;
                        ASprite._graphicsWidth = var_1ddf;
                        ASprite._graphicsHeight = var_1de7;
                    }
                    GLLib.GetRGB(img, array3, 0, sub_312c2, 0, 0, sub_312c2, sub_3719);
                    final int displayColor = GLLib.g.getDisplayColor(16711935);
                    while (j > 0) {
                        --j;
                        if ((array3[j] & 0xFFFFFF) == displayColor) {
                            array3[j] = 16711935;
                            var_10e7 = true;
                        }
                    }
                    ASprite.var_10e7 = var_10e7;
                    this._crt_pal = _crt_pal2;
                    array2 = array3;
                }
                final int[] array4 = array2;
                final int n14 = ASprite.TRANSFORM_ROT_90[0];
                class_l = ((array4 == null) ? null : (((n14 & 0x4) != 0x0) ? GLLibImage.createRGBImage(array4, sub_3718, sub_312c, ASprite.var_10e7) : GLLibImage.createRGBImage(array4, sub_312c, sub_3718, ASprite.var_10e7)));
            }
            this._frame_image_imageAAA[n][n4][i] = class_l;
        }
    }
    
    private static boolean CheckVisibility(final Graphics g, final int x, final int y, int w, int h) {
        final int cx = GLLib.GetClipX(g, true);
        final int cy = GLLib.GetClipY(g, true);
        final int cw = GLLib.GetClipWidth(g, true);
        final int ch = GLLib.GetClipHeight(g, true);
        if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
            final int percentX = GLLib.PFX_Scale_GetScaleX();
            final int percentY = GLLib.PFX_Scale_GetScaleY();
            w = w * percentX / 100;
            h = h * percentY / 100;
        }
        else if ((GLLib.s_PFX_type & 1 << 15) != 0x0) {
            return true;
        }
        return x + w >= cx && y + h >= cy && x < cx + cw && y < cy + ch;
    }
    
    final void PaintAFrame(final Graphics g, int anim, int aframe, final int posX, final int posY, int flags) {
        anim = this._anims_af_start[anim] + aframe;
        aframe = (this._aframes[anim] & 0xFF);
        int offsetX = this.GetAFramesOX(anim);
        int offsetY = this.GetAFramesOY(anim);
        int n4 = this._aframes_flags[anim] & 0xF;
        if ((flags & 0x1) != 0x0) {
            n4 = (ASprite.TRANSFORM_FLIP_X[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            offsetX = -offsetX;
        }
        if ((flags & 0x2) != 0x0) {
            n4 = (ASprite.TRANSFORM_FLIP_Y[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            offsetY = -offsetY;
        }
        if ((flags & 0x4) != 0x0) {
            n4 = (ASprite.TRANSFORM_ROT_90[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            anim = offsetX;
            offsetX = -offsetY;
            offsetY = anim;
        }
        if ((GLLib.s_PFX_type & 0x2000) != 0x0 && GLLib.s_PFX_params[13][5] == 0) {
            anim = GLLib.PFX_Scale_GetScaleX();
            flags = GLLib.PFX_Scale_GetScaleY();
            offsetX = anim * offsetX / 100;
            offsetY = flags * offsetY / 100;
        }
        this.PaintFrame(g, aframe, posX + offsetX, posY + offsetY, n4);
    }
    
    final void PaintFrame(final Graphics g, final int frame, final int posX, final int posY, final int flags) {
        this.PaintCachedFrame(g, frame, posX, posY, flags);
    }
    
    final void PaintCachedFrame(final Graphics g, final int n, int posX, int posY, int height) {
        int sub_3019 = -1;
        Label_0748: {
            if (ASprite._operation == 0) {
                if (this._frame_image_imageAAA != null && this._frame_image_imageAAA[_crt_pal] != null && this._frame_image_imageAAA[_crt_pal][this._cur_map + 1][n] != null) {
                    int n6 = height;
                    int n7 = 0;
                    final int sizeX = this.GetFrameWidth(n);
                    final int sizeY = this.GetFrameHeight(n);
                    int offsetX = this.GetFrameMinX(n);
                    int offsetY = this.GetFrameMinY(n);
                    if ((height & 0x4) != 0x0) {
                        offsetX = offsetY;
                        offsetY = offsetX;
                    }
                    if ((height & 0x1) != 0x0) {
                        offsetX = -offsetX - sizeX;
                    }
                    if ((height & 0x2) != 0x0) {
                        offsetY = -offsetY - sizeY;
                    }
                    if ((height & 0x4) != 0x0) {
                        offsetX = -offsetY - sizeY;
                        offsetY = offsetX;
                    }
                    posX = posX + offsetX;
                    posY = posY + offsetY;
                    if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                        final int percentX = GLLib.PFX_Scale_GetScaleX();
                        final int percentY = GLLib.PFX_Scale_GetScaleY();
                        offsetX -= percentX * offsetX / 100;
                        offsetY -= percentY * offsetY / 100;
                        posX -= offsetX;
                        posY -= offsetY;
                    }
                    if ((GLLib.s_PFX_type & 1 << 15) != 0x0) {
                        posX -= offsetX;
                        posY -= offsetY;
                    }
                    int n12;
                    if (g != null && !CheckVisibility(g, posX, posY, sizeX, sizeY)) {
                        n12 = 1;
                    }
                    else {
                        if ((height & 0x1) == 0x0 || (height & 0x2) == 0x0) {
                            if ((height & 0x1) != 0x0) {
                                height = ((height & 0xFFFFFFFE) | 0x2);
                            }
                            else if ((height & 0x2) != 0x0) {
                                height = ((height & 0xFFFFFFFD) | 0x1);
                            }
                        }
                        int n13 = sizeY;
                        if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                            n13 = n13 * GLLib.PFX_Scale_GetScaleY() / 100;
                        }
                        final int n14 = posX;
                        final int n15 = ASprite._graphicsHeight - posY - n13;
                        final int n16 = n14;
                        final int n17 = sizeX;
                        final int n18 = sizeY;
                        final int n19 = n17;
                        final int pal = this._crt_pal;
                        final GLLibImage img_image;
                        if ((img_image = ((this._frame_image_imageAAA == null || this._frame_image_imageAAA[pal] == null) ? null : this._frame_image_imageAAA[pal][this._cur_map + 1][n])) != null) {
                            Label_0733: {
                                if (GLLib.pfx_useSpriteEffects && (GLLib.s_PFX_type & 0xFF7E0) != 0x0) {
                                    boolean b = false;
                                    if (img_image != null) {
                                        final int[] buffer = GetPixelBuffer_int(null);
                                        GLLib.GetRGB(img_image, buffer, 0, n18, 0, 0, n18, n19);
                                        final int[] image_data = GLLib.PFX_ProcessSpriteEffects(g, buffer, n15, n16, n18, n19, height, _alpha, false, true);
                                        if (image_data != null) {
                                            GLLib.DrawRGB(g, image_data, 0, GLLib.s_PFX_newSizeX, n15, n16, GLLib.s_PFX_newSizeX, GLLib.s_PFX_newSizeY, GLLib.s_PFX_hasAlpha, true, 0, -1, false);
                                        }
                                        b = true;
                                    }
                                    if (b) {
                                        break Label_0733;
                                    }
                                }
                                if (n6 == 0) {
                                    GLLib.DrawImage(g, img_image, n15, n16, 20, false);
                                }
                                else {
                                    GLLib.DrawRegion(g, img_image, 0, 0, n18, n19, ASprite.midp2_flags[height & 0x7], n15, n16, 20, false);
                                }
                            }
                            n7 = 1;
                        }
                        n12 = n7;
                    }
                    if (n12 != 0) {
                        break Label_0748;
                    }
                }
            }
            sub_3019 = this.GetFModules(n);
        }
        if (sub_3019 > 0) {
            for (int i = 0; i < sub_3019; ++i) {
                final int sub_3022 = this.GetFrameModuleOffset(n, i);
                int sub_330a = this.GetFrameModuleFlags(sub_3022);
                final int sub_328e;
                int n29 = sub_328e = this.GetFrameModule(sub_3022);
                if (this._cur_map >= 0) {
                    n29 = this.map[this._cur_map][n29];
                }
                int n30 = this._modules_w_short[n29] & 0xFFFF;
                int n31 = this._modules_h_short[n29] & 0xFFFF;
                final int n32 = n30;
                final int n33 = n31;
                int n34 = 0 + this._fmodules_ox_short[sub_3022];
                int n35 = 0 + this._fmodules_oy_short[sub_3022];
                if ((sub_330a & 0x4) != 0x0) {
                    final int n36 = n30;
                    n30 = n31;
                    n31 = n36;
                }
                if ((height & 0x1) != 0x0) {
                    sub_330a = (ASprite.TRANSFORM_FLIP_X[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n34 = -n34 - n30;
                }
                if ((height & 0x2) != 0x0) {
                    sub_330a = (ASprite.TRANSFORM_FLIP_Y[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n35 = -n35 - n31;
                }
                if ((height & 0x4) != 0x0) {
                    sub_330a = (ASprite.TRANSFORM_ROT_90[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    final int n37 = n34;
                    n34 = -n35 - n31;
                    n35 = n37;
                }
                if ((GLLib.s_PFX_type & 0x2000) != 0x0 && GLLib.s_PFX_params[13][5] == 0) {
                    final int sub_5bbb2 = GLLib.PFX_Scale_GetScaleX();
                    final int sub_5bfe2 = GLLib.PFX_Scale_GetScaleY();
                    if (GLLib.s_PFX_params[13][6] % GLLib.s_math_F_1 != 0) {
                        GLLib.s_PFX_params[16][1] = -n34;
                        GLLib.s_PFX_params[16][2] = -n35;
                    }
                    n34 = sub_5bbb2 * n34 / 100;
                    n35 = sub_5bfe2 * n35 / 100;
                }
                this.sub_7dca(g, sub_328e, posX + n34, posY + n35, sub_330a & 0xF, n32, n33);
            }
        }
    }
    
    final void PaintFrameScaled(final Graphics g, final int frame, final int posX, final int posY, final int scale) {
        GLLib.PFX_EnableScaleEffect();
        GLLib.PFX_Scale_SetScale(scale);
        this.PaintFrame(g, frame, posX, posY, 0);
        GLLib.PFX_DisableScaleEffect();
    }
    
    private int sub_7d5b(final int n) {
        if (this._modules_extra_pointer != null) {
            for (int i = 0; i < this._modules_extra_pointer.length; i += 2) {
                if (this._modules_extra_pointer[i] == n) {
                    return this._modules_extra_pointer[i + 1];
                }
            }
        }
        return -1;
    }
    
    final void sub_7dca(Graphics g, int module, int posX, int posY, int n3, int p2x, int p2y) {
        ASprite.s_rc[0] = p2x;
        ASprite.s_rc[1] = p2y;
        
        p2y = posX;
        if (this._cur_map >= 0) {
            module = this.map[this._cur_map][module];
        }
        if ((GLLib.s_PFX_type & 0x2000) != 0x0 && GLLib.s_PFX_params[13][5] != 0) {
            posX *= GLLib.PFX_Scale_GetScaleX() / 100;
            posY *= GLLib.PFX_Scale_GetScaleY() / 100;
        }
        
        if (((this._module_types != null) ? this._module_types[module] : 0) == 0) {
            if ((n3 & 0x1) == 0x0 || (n3 & 0x2) == 0x0) {
                if ((n3 & 0x1) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFE) | 0x2);
                }
                else if ((n3 & 0x2) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFD) | 0x1);
                }
            }
            final int n12 = ASprite._graphicsHeight - posY;
            posY = module;

            int n15 = this._modules_h_short[posY];
            if ((n3 & 0x4) != 0x0) {
                n15 = this._modules_w_short[posY];
            }
            if (n15 < 0) {
                n15 += 255;
            }
            if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                n15 = n15 * GLLib.PFX_Scale_GetScaleY() / 100;
            }
            posX = n12 - n15;
            posY = posX;
        }
        final int n16 = s_rc[0];
        final int n17 = p2x = s_rc[1];
        int var_1148 = n16;
        int n18 = p2x;
        int n19 = var_1148;
        if ((n3 & 0x4) != 0x0) {
            final int n20 = p2x;
            p2x = var_1148;
            var_1148 = n20;
        }
        if (((this._module_types != null) ? this._module_types[module] : 0) != 0 && g != null) {
            module = this._module_colors_int[module];
            g.setColor(module);
            switch (this._module_types[module]) {
                case 2: {
                    if ((module & 0xFF000000) == 0xFF000000 || (module & 0xFF000000) == 0x0) {
                        GLLib.FillRect(g, posX, posY, var_1148, p2x, true);
                        return;
                    }
                    GLLib.AlphaRect_SetColor(module);
                    GLLib.AlphaRect_Draw(g, posX, posY, var_1148, p2x);
                    return;
                }
                case 1: {
                    --var_1148;
                    --p2x;
                    GLLib.DrawRect(g, posX, posY, var_1148, p2x, true);
                    return;
                }
                case 3:
                case 4: {
                    if ((n3 = this.sub_7d5b(module)) != -1) {
                        p2x = this._modules_extra_info[n3];
                        p2y = this._modules_extra_info[n3 + 1];
                        if ((n3 & 0x1) != 0x0) {
                            p2x = 90 - p2x;
                        }
                        if ((n3 & 0x2) != 0x0) {
                            p2x = -p2x;
                            p2y = -p2y;
                        }
                        if ((n3 & 0x4) != 0x0) {
                            p2x -= 90;
                        }
                        if (this._module_types[module] == 3) {
                            GLLib.DrawArc(g, posX, posY, var_1148, p2x, p2x, p2y, true);
                            return;
                        }
                        GLLib.FillArc(g, posX, posY, var_1148, p2x, p2x, p2y, true);
                    }
                    return;
                }
                case 6:
                case 7: {
                    if ((n3 = this.sub_7d5b(module)) != -1) {
                        p2x = this._modules_extra_info[n3];
                        p2y = this._modules_extra_info[n3 + 1];
                        int p3x = this._modules_extra_info[n3 + 2];
                        int p3y = this._modules_extra_info[n3 + 3];
                        final int n31 = posX;
                        final int n32 = posY;
                        if ((n3 & 0x1) != 0x0) {
                            p2x = -p2x;
                            p3x = -p3x;
                            final int n33 = posX;
                            final int a5 = p2x;
                            final int abs = Math.abs(p2x);
                            final int a6 = p3x;
                            posX = n33 + ((abs > Math.abs(p3x)) ? Math.abs(a5) : Math.abs(a6));
                        }
                        if ((n3 & 0x2) != 0x0) {
                            p2y = -p2y;
                            p3y = -p3y;
                            final int n34 = posY;
                            final int a7 = p2y;
                            final int abs2 = Math.abs(p2y);
                            final int a8 = p3y;
                            posY = n34 + ((abs2 > Math.abs(p3y)) ? Math.abs(a7) : Math.abs(a8));
                        }
                        if ((n3 & 0x4) != 0x0) {
                            final int n35 = (Math.abs(p2y) > Math.abs(p3y)) ? Math.abs(p2y) : Math.abs(p3y);
                            final int n36 = posY - n32;
                            posY = n32 + (posX - n31);
                            posX = n31 - n36 + n35;
                            final int n37 = p2x;
                            p2x = -p2y;
                            p2y = n37;
                            final int n38 = p3x;
                            p3x = -p3y;
                            p3y = n38;
                        }
                        if (this._module_types[module] == 6) {
                            GLLib.DrawLine(g, posX, posY, posX + p2x, posY + p2y, true);
                            GLLib.DrawLine(g, posX + p2x, posY + p2y, posX + p3x, posY + p3y, true);
                            GLLib.DrawLine(g, posX, posY, posX + p3x, posY + p3y, true);
                            return;
                        }
                        GLLib.FillTriangle(g, posX, posY, posX + p2x, posY + p2y, posX + p3x, posY + p3y, true);
                    }
                    return;
                }
                case 8: {
                    n3 = posX;
                    p2x = posX + var_1148;
                    p2y = posY;
                    int n39 = posY + p2x;
                    if ((n3 & 0x1) != 0x0) {
                        n3 = p2x;
                        p2x = posX;
                    }
                    if ((n3 & 0x2) != 0x0) {
                        p2y = n39;
                        n39 = posY;
                    }
                    if ((n3 & 0x4) != 0x0) {
                        final int n40 = n3;
                        n3 = p2x;
                        p2x = n40;
                    }
                    GLLib.DrawLine(g, n3, p2y, p2x, n39, true);
                    return;
                }
                case 9: {
                    if ((n3 = this.sub_7d5b(module)) == -1) {
                        break;
                    }
                    p2x = module;
                    p2y = ((this._modules_extra_info[n3] & 0xFFFF) | (this._modules_extra_info[n3 + 1] << 16 & 0xFFFF0000));
                    final short n41 = this._modules_extra_info[n3 + 2];
                    if ((n3 & 0x1) != 0x0 && n41 < 2) {
                        p2x = p2y;
                        p2y = module;
                    }
                    if ((n3 & 0x2) != 0x0 && n41 > 1) {
                        final int n42 = p2x;
                        p2x = p2y;
                        p2y = n42;
                    }
                    int n43;
                    if (n41 == 0) {
                        n43 = 4;
                    }
                    else if (n41 == 1) {
                        n43 = 8;
                    }
                    else if (n41 == 2) {
                        n43 = 16;
                    }
                    else {
                        n43 = 32;
                    }
                    if ((n3 & 0x4) != 0x0) {
                        if (n43 == 4) {
                            n43 = 16;
                        }
                        else if (n43 == 8) {
                            n43 = 32;
                        }
                        else if (n43 == 16) {
                            n43 = 8;
                        }
                        else if (n43 == 32) {
                            n43 = 4;
                        }
                    }
                    if (p2x >>> 24 != 255 || p2y >>> 24 != 255) {
                        GLLib.DrawAlphaGradientRect(g, posX, posY, var_1148, p2x, p2x, p2y, n43);
                        return;
                    }
                    GLLib.DrawGradientRect(g, posX, posY, var_1148, p2x, p2x, p2y, n43);
                    break;
                }
            }
            return;
        }
        if ((GLLib.s_PFX_type & 0x2000) != 0x0 && GLLib.s_PFX_params[13][6] % 360 != 0) {
            int n44 = ((GLLib.s_PFX_type & 0x2000) != 0x0) ? GLLib.s_PFX_params[13][6] : GLLib.s_PFX_params[16][0];
            if ((n3 & 0x4) != 0x0) {
                n3 &= 0xFFFFFFFB;
                n44 += 90 * GLLib.Math_AngleMUL / 360;
            }
            GLLib.PFX_Rotate_GetRotatedRectSize(GLLib.Math_Cos(GLLib.Math_Angle90 - n44), GLLib.Math_Cos(n44), p2x, var_1148, ASprite.s_rc);
            int n45 = ASprite.s_rc[0];
            int n46 = ASprite.s_rc[1];
            int n47 = p2x - GLLib.s_PFX_params[16][2];
            int n48 = GLLib.s_PFX_params[16][1];
            if ((GLLib.s_PFX_type & 0x2000) != 0x0) {
                n47 = n47 * GLLib.PFX_Scale_GetScaleX() / 100;
                n48 = n48 * GLLib.PFX_Scale_GetScaleY() / 100;
                p2x = p2x * GLLib.PFX_Scale_GetScaleX() / 100;
                var_1148 = var_1148 * GLLib.PFX_Scale_GetScaleY() / 100;
                n45 = n45 * GLLib.PFX_Scale_GetScaleX() / 100;
                n46 = n46 * GLLib.PFX_Scale_GetScaleX() / 100;
            }
            final int n49 = n44;
            GLLib.PFX_Rotate_UnkFunc5cbc(GLLib.Math_Cos(GLLib.Math_Angle90 - n49), GLLib.Math_Cos(n49), (p2x >> 1) - n47, (var_1148 >> 1) - n48, ASprite.s_rc);
            posX += ASprite.s_rc[0] - n45 / 2 + n47;
            posY += ASprite.s_rc[1] - n46 / 2 + n48;
        }
        if (p2x <= 0 || var_1148 <= 0) {
            return;
        }
        if (g == null || CheckVisibility(g, p2y, posY, var_1148, p2x)) {
            GLLibImage class_l = null;
            if ((this._bs_flags & 0x1000008) != 0x0) {
                if (this._module_image_imageAA != null && this._module_image_imageAA[this._crt_pal] != null) {
                    class_l = this._module_image_imageAA[this._crt_pal][module];
                }
                boolean b = this._alpha;
                if (class_l == null) {
                    int[] array;
                    if (GLLib.pfx_useSpriteEffects && (GLLib.s_PFX_type & 0xFF7E0) != 0x0 && this.PFXCache_IsInited()) {
                        if (this.PFXCache_TryPaintModule(module, posX, posY, n3)) {
                            return;
                        }
                        array = this.DecodeImage_int(module);
                    }
                    else {
                        array = this.DecodeImage_int(module);
                    }
                    if (array != null) {
                        boolean b2 = false;
                        if (GLLib.pfx_useSpriteEffects && (GLLib.s_PFX_type & 0xFF7E0) != 0x0) {
                            if (this.PFXCache_TryPaintModule(module, posX, posY, n3)) {
                                return;
                            }
                            final boolean sub_3b2c;
                            if (!(sub_3b2c = this.PFXCache_IsInited())) {
                                n3 = (ASprite.TRANSFORM_ROT_90[n3 & 0x7] | (n3 & 0xFFFFFFF8));
                            }
                            array = GLLib.PFX_ProcessSpriteEffects(g, array, posX, posY, n19, n18, sub_3b2c ? 4 : n3, b, false, !sub_3b2c);
                            if (this.PFXCache_TryCacheAndPaintModule(module, posX, posY, array, n3) || array == null) {
                                return;
                            }
                            b = GLLib.s_PFX_hasAlpha;
                            n3 = 0;
                            posX = GLLib.s_PFX_newPosX;
                            posY = GLLib.s_PFX_newPosY;
                            p2x = GLLib.s_PFX_newSizeX;
                            var_1148 = GLLib.s_PFX_newSizeY;
                            n18 = p2x;
                            n19 = var_1148;
                            GLLib.DrawRGB(g, array, 0, n18, posX, posY, n18, n19, b, b, 0, -1, false);
                            b2 = true;
                        }
                        if (this._cur_pool >= 0) {
                            if (this._module_image_imageAA == null) {
                                this._module_image_imageAA = new GLLibImage[this._palettes][];
                                for (int i = 0; i < this._palettes; ++i) {
                                    this._module_image_imageAA[i] = new GLLibImage[this._nModules];
                                }
                            }
                            GLLibImage class_l2;
                            if (!b2) {
                                final int[] array2 = new int[p2x * var_1148];
                                p2y = var_1148;
                                int n50 = p2x;
                                if ((n3 & 0x4) != 0x0) {
                                    p2y = p2x;
                                    n50 = var_1148;
                                }
                                for (int j = 0; j < p2y; ++j) {
                                    for (int k = 0; k < n50; ++k) {
                                        array2[n50 - k - 1 + j * n50] = array[j + p2y * k];
                                    }
                                }
                                if ((n3 & 0x4) != 0x0) {
                                    class_l2 = GLLibImage.createRGBImage(array2, var_1148, p2x, this._alpha);
                                }
                                else {
                                    class_l2 = GLLibImage.createRGBImage(array2, p2x, var_1148, this._alpha);
                                }
                            }
                            else if ((n3 & 0x4) != 0x0) {
                                class_l2 = GLLibImage.createRGBImage(array, var_1148, p2x, this._alpha);
                            }
                            else {
                                class_l2 = GLLibImage.createRGBImage(array, p2x, var_1148, this._alpha);
                            }
                            this.UpdatePoolCache(module, class_l2);
                            if (!b2) {
                                if (class_l2 != null) {
                                    if (ASprite.midp2_flags[n3 & 0x7] == 0) {
                                        GLLib.DrawImage(g, class_l2, posX, posY, 20, false);
                                        return;
                                    }
                                    if ((n3 & 0x4) != 0x0) {
                                        GLLib.DrawRegion(g, class_l2, 0, 0, var_1148, p2x, ASprite.midp2_flags[n3 & 0x7], posX, posY, 20, false);
                                        return;
                                    }
                                    GLLib.DrawRegion(g, class_l2, 0, 0, p2x, var_1148, ASprite.midp2_flags[n3 & 0x7], posX, posY, 20, false);
                                }
                            }
                        }
                        else if (!b2) {
                            posX = p2y;
                            final int n51 = n18;
                            final int n52 = n19;
                            final int n53 = n51;
                            final Graphics graphics5 = g;
                            final int[] array3 = array;
                            final int n54 = n52;
                            final int n55 = posX;
                            final int n56 = posY;
                            final int n57 = n52;
                            final int n58 = n53;
                            final int n59 = b ? 1 : 0;
                            final int n60 = b ? 1 : 0;
                            p2y = n59;
                            p2x = n58;
                            n3 = n57;
                            posY = n56;
                            posX = n55;
                            final int n61;
                            module = (n61 = n54);
                            final int n62 = n3;
                            final int n63 = p2x;
                            final int n64 = p2y;
                            p2y = n60;
                            p2x = n64;
                            n3 = n63;
                            module = n62;
                            GLLib.DrawRGB(graphics5, array3, 0, n61, posX, posY, module, n3, (boolean)(p2x != 0), (boolean)(p2y != 0), n3, -1, true);
                        }
                    }
                }
                else if (GLLib.pfx_useSpriteEffects && (GLLib.s_PFX_type & 0xFF7E0) != 0x0) {
                    if (!this.PFXCache_TryPaintModule(module, posX, posY, n3)) {
                        final boolean sub_3b2c2 = this.PFXCache_IsInited();
                        final Graphics graphics6 = g;
                        final GLLibImage class_l3 = class_l;
                        final int n65 = posX;
                        final int n66 = posY;
                        final int n67 = n18;
                        final int n68 = n19;
                        final int n69 = sub_3b2c2 ? 0 : n3;
                        final boolean b3 = b;
                        final boolean b4 = !sub_3b2c2;
                        final boolean b5 = b3;
                        final int n70 = n69;
                        final int n71 = n68;
                        final int n72 = n67;
                        final int n73 = n66;
                        final int n74 = n65;
                        final GLLibImage class_l4 = class_l3;
                        final Graphics graphics7 = graphics6;
                        final int[] sub_39a6 = GetPixelBuffer_int(null);
                        GLLib.GetRGB(class_l4, sub_39a6, 0, n72, 0, 0, n72, n71);
                        final int[] sub_5d84 = GLLib.PFX_ProcessSpriteEffects(graphics7, sub_39a6, n74, n73, n72, n71, n70, b5, false, b4);
                        if (!this.PFXCache_TryCacheAndPaintModule(module, posX, posY, sub_5d84, n3) && sub_5d84 != null) {
                            final boolean var_1ff7 = GLLib.s_PFX_hasAlpha;
                            posX = GLLib.s_PFX_newPosX;
                            posY = GLLib.s_PFX_newPosY;
                            p2x = GLLib.s_PFX_newSizeX;
                            final int var_1149 = GLLib.s_PFX_newSizeY;
                            final int n75 = p2x;
                            GLLib.DrawRGB(g, sub_5d84, 0, n75, posX, posY, n75, var_1149, var_1ff7, true, 0, -1, false);
                        }
                    }
                }
                else {
                    p2x = n16;
                    final int n76 = n17;
                    final int n77 = p2x;
                    p2x = n76;
                    final int n78 = n77;
                    this.UpdatePoolCache(module, class_l);
                    if (class_l != null) {
                        if (ASprite.midp2_flags[n3 & 0x7] == 0) {
                            GLLib.DrawImage(g, class_l, posX, posY, 20, false);
                            return;
                        }
                        GLLib.DrawRegion(g, class_l, 0, 0, p2x, n78, ASprite.midp2_flags[n3 & 0x7], posX, posY, 20, false);
                    }
                }
            }
        }
    }
    
    static final int[] TransformRGB(final int[] image_data, final int sizeX, int sizeY, int flags, int[] initBuffer) {
        if ((flags & 0x7) == 0x0) {
            return image_data;
        }
        initBuffer = GetPixelBuffer_int(image_data);
        int n4 = 0;
        int n5 = 0;
        switch (flags & 0x7) {
            case 1: {
                int pointer = sizeX * sizeY;
                int offset = sizeX * (sizeY - 1);
                while (--sizeY >= 0) {
                    flags = sizeX;
                    while (--flags >= 0) {
                        initBuffer[--pointer] = image_data[offset++];
                    }
                    offset -= sizeX << 1;
                }
                break;
            }
            case 2: {
                int n9 = (sizeY - 1) * sizeX;
                while (--sizeY >= 0) {
                    System.arraycopy(image_data, n5, initBuffer, n9, sizeX);
                    n9 -= sizeX;
                    n5 += sizeX;
                }
                break;
            }
            case 3: {
                for (int i = sizeX * sizeY - 1; i >= 0; initBuffer[n4++] = image_data[i--]) {}
                break;
            }
            case 4: {
                int n11 = sizeX * sizeY;
                while (--sizeY >= 0) {
                    flags = sizeX;
                    while (--flags >= 0) {
                        initBuffer[--n11] = image_data[sizeY];
                        sizeY += sizeY;
                    }
                }
                break;
            }
            case 5: {
                int n14 = sizeX * sizeY;
                while (--sizeY >= 0) {
                    int n16 = sizeY - 1 - sizeY;
                    flags = sizeX;
                    while (--flags >= 0) {
                        initBuffer[--n14] = image_data[n16];
                        n16 += sizeY;
                    }
                }
                break;
            }
            case 6: {
                int n18;
                int n17 = (n18 = sizeX * sizeY) - 1;
                while (--sizeY >= 0) {
                    int n20 = n17--;
                    flags = sizeX;
                    while (--flags >= 0) {
                        initBuffer[--n18] = image_data[n20];
                        n20 -= sizeY;
                    }
                }
                break;
            }
            case 7: {
                int n22;
                int n21 = (n22 = sizeX * sizeY) - sizeY;
                while (--sizeY >= 0) {
                    int n24 = n21++;
                    flags = sizeX;
                    while (--flags >= 0) {
                        initBuffer[--n22] = image_data[n24];
                        n24 -= sizeY;
                    }
                }
                break;
            }
        }
        return initBuffer;
    }
    
    // Only used in GLLib.PFX_ProcessSpriteEffects...
    static final int[] GetPixelBuffer(final int[] buffer) {
        return GetPixelBuffer_int(buffer);
    }
    
    public ASprite() {
        this._cur_pool = -1;
        this._bUnderline = false;
        this._bBold = false;
        this.m_scaleAccelerator = -1;
    }
    
    static {
        ASprite._graphicsWidth = 800;
        ASprite._graphicsHeight = 480;
        ASprite.midp2_flags = new int[] { 0, 2, 1, 3, 5, 7, 4, 6 };
        ASprite.TRANSFORM_FLIP_X = new int[] { 1, 0, 3, 2, 6, 7, 4, 5 };
        ASprite.TRANSFORM_FLIP_Y = new int[] { 2, 3, 0, 1, 5, 4, 7, 6 };
        ASprite.TRANSFORM_ROT_90 = new int[] { 4, 5, 6, 7, 3, 2, 1, 0 };
        ASprite.s_rc = new int[4];
        ASprite.s_gcEnabled = true;
        ASprite.k_cCanBreakLine = '|';
        ASprite._index1 = -1;
        ASprite._index2 = -1;
        ASprite._indexMax = -1;
        ASprite._operation = 0;
    }
}
