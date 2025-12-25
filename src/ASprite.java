
import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ASprite
{
    static int[] temp_int;
    private static int[] _temp_int;
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
    private byte[] _fmodules_id;
    private short[] _fmodules_id_short;
    private byte[] _fmodules_flags;
    private short[] _fmodules_ox_short;
    private short[] _fmodules_oy_short;
    private byte[] _anims_naf;
    private short[] _anims_af_start;
    private byte[] _aframes;
    private byte[] _aframes_time;
    private short[] _modules_x_short;
    private short[] _modules_y_short;
    private byte[] _modules_x_byte;
    private byte[] _modules_y_byte;
    private byte[] var_1047;
    private short[][] map;
    private int var_1057;
    byte[] _modules_data;
    private int[] _modules_data_off_int;
    private int _bs_flags;
    private int[][][] _module_image_intAAA;
    int _palettes;
    private int[] var_1087;
    private int _crt_pal;
    private boolean var_1097;
    //private boolean var_109f;
    private int _flags;
    private short _data_format;
    private int[] var_10b7;
    private int[] var_10bf;
    static int s_screenHeight;
    static int s_screenWidth;
    GLLibImage[][] _module_image_imageAA;
    private GLLibImage[][][] var_10df;
    private static boolean var_10e7;
    private static int[] midp2_flags;
    private static int[] var_10f7;
    private static int[] var_10ff;
    private static int[] var_1107;
    private byte[] _module_types_2;
    private byte[] _module_types;
    private int[] _module_colors_int;
    private static int _rectX1;
    private static int _rectY1;
    private static int _rectX2;
    private static int _rectY2;
    static int[] s_rc;
    private static boolean s_gcEnabled;
    private static char var_1157;
    private GLLibImage[][] _unkImageArr;
    private int[][] var_1167;
    private int _cur_pool;
    private static short[][] _poolCacheStack;
    private static int[] _poolCacheStackIndex;
    private static int[] _poolCacheStackMax;
    private static ASprite[][] _poolCacheSprites;
    private static int _old_pal;
    static int _text_w;
    private static int _text_h;
    private int var_11af;
    private int var_11b7;
    private int _nHeight;
    private int _nSpaceWidth;
    private int var_11cf;
    private boolean _bUnderline;
    private boolean _bBold;
    private short[][] _pMapCharShort;
    private short _nDivider;
    private int var_11f7;
    private static short[] _warpTextInfo;
    private static int _index1;
    private static int _index2;
    private static int var_1217;
    private static int _operation;
    
    final void unload() {
        this._modules_w_short = null;
        this._modules_h_short = null;
        this._fmodules_id_short = null;
        this._fmodules_id = null;
        this._frames_nfm_short = null;
        this._frames_nfm_byte = null;
        this._aframes = null;
        this._anims_naf = null;
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
        if (this._module_image_intAAA != null) {
            for (int j = 0; j < this._module_image_intAAA.length; ++j) {
                this._module_image_intAAA[j] = null;
            }
            this._module_image_intAAA = null;
        }
        if (this._module_image_imageAA != null) {
            for (int k = 0; k < this._module_image_imageAA.length; ++k) {
                this._module_image_imageAA[k] = null;
            }
            this._module_image_imageAA = null;
        }
    }
    
    final void Load(final byte[] file, int offset_) {
        if (file == null) {
            return;
        }
        try {
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
            this._bs_flags = (file[2] & 0xFF) + ((file[3] & 0xFF) << 8) + ((file[4] & 0xFF) << 16) + ((file[5] & 0xFF) << 24);
            
            int offset2 = 6;
            
            final int n3 = 6;
            ++offset2;
            final int n4 = file[n3] & 0xFF;
            final int n5 = 7;
            ++offset2;
            this._nModules = (short)(n4 + ((file[n5] & 0xFF) << 8));
            if (this._nModules > 0) {
                this._modules_w_short = new short[this._nModules];
                this._modules_h_short = new short[this._nModules];
                int tmpExtraInfoCount = 0;
                int tmpExtraInfoSize = 0;
                short[][] tmpExtraInfo = null;
                if ((this._bs_flags & 0x4) != 0x0) {
                    this._module_types = new byte[this._nModules];
                }
                boolean bLoadAModuleColor = false;
                boolean bLoadAModuleSize = false;
                for (int i = 0; i < this._nModules; ++i) {
                    boolean bLoadAModuleArc = false;
                    boolean bLoadAModuleTriangle = false;
                    boolean a = false;
                    if ((file[offset2] & 0xFF) == 0x0) {
                        ++offset2;
                        bLoadAModuleColor = false;
                        bLoadAModuleSize = true;
                        if ((this._bs_flags & 0x4) != 0x0) {
                            this._module_types[i] = file[offset2++];
                        }
                    }
                    else if ((file[offset2] & 0xFF) == 0xFF) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 1;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xFE) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 2;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xFD) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 5;
                        bLoadAModuleColor = false;
                        bLoadAModuleSize = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xFC) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 3;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleArc = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xFB) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 4;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleArc = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xFA) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 6;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = false;
                        bLoadAModuleTriangle = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xF9) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 7;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = false;
                        bLoadAModuleTriangle = true;
                    }
                    else if ((file[offset2] & 0xFF) == 0xF8) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 8;
                        bLoadAModuleColor = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleTriangle = false;
                    }
                    else if ((file[offset2] & 0xFF) == 0xF7) {
                        ++offset2;
                        this.sub_2f12(this._nModules);
                        this._module_types_2[i] = 9;
                        bLoadAModuleColor = true;
                        a = true;
                        bLoadAModuleSize = true;
                        bLoadAModuleTriangle = false;
                    }
                    if (bLoadAModuleColor) {
                        this._module_colors_int[i] = (file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8) + ((file[offset2++] & 0xFF) << 16) + ((file[offset2++] & 0xFF) << 24);
                    }
                    if (a) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] array3 = new short[3];
                        final int n8 = (file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8) + ((file[offset2++] & 0xFF) << 16) + ((file[offset2++] & 0xFF) << 24);
                        array3[0] = (short)n8;
                        array3[1] = (short)(n8 >> 16);
                        array3[2] = file[offset2++];
                        tmpExtraInfo[i] = array3;
                        ++tmpExtraInfoCount;
                        tmpExtraInfoSize += 3;
                    }
                    if (bLoadAModuleSize) {
                        if ((this._bs_flags & 0x10) == 0x0) {
                            this._modules_w_short[i] = (short)(file[offset2++] & 0xFF);
                            this._modules_h_short[i] = (short)(file[offset2++] & 0xFF);
                        }
                        else {
                            this._modules_w_short[i] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                            this._modules_h_short[i] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        }
                    }
                    if (bLoadAModuleArc) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] aShort;
                        (aShort = new short[2])[0] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        aShort[1] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        tmpExtraInfo[i] = aShort;
                        ++tmpExtraInfoCount;
                        tmpExtraInfoSize += 2;
                    }
                    if (bLoadAModuleTriangle) {
                        if (tmpExtraInfo == null) {
                            tmpExtraInfo = new short[this._nModules][];
                        }
                        final short[] aShort;
                        (aShort = new short[4])[0] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        aShort[1] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        aShort[2] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
                        aShort[3] = (short)((file[offset2++] & 0xFF) + ((file[offset2++] & 0xFF) << 8));
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
                        if (this._module_types_2[m] == 3 || this._module_types_2[m] == 4) {
                            nSize = 2;
                        }
                        else if (this._module_types_2[m] == 6 || this._module_types_2[m] == 7) {
                            nSize = 4;
                        }
                        else if (this._module_types_2[m] == 9) {
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
            offset_ = offset2;
            
            int n13 = offset_;

            final short n14;
            if ((n14 = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8))) > 0) {
                if ((this._bs_flags & 0x100000) != 0x0) {
                    this._fmodules_id_short = new short[n14];
                }
                else {
                    this._fmodules_id = new byte[n14];
                }
                this._fmodules_ox_short = new short[n14];
                this._fmodules_oy_short = new short[n14];
                this._fmodules_flags = new byte[n14];
                for (short n15 = 0; n15 < n14; ++n15) {
                    if ((this._bs_flags & 0x100000) != 0x0) {
                        this._fmodules_id_short[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                    }
                    else {
                        this._fmodules_id[n15] = file[n13++];
                    }
                    if ((this._bs_flags & 0x400) != 0x0) {
                        this._fmodules_ox_short[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                        this._fmodules_oy_short[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                    }
                    else {
                        this._fmodules_ox_short[n15] = file[n13++];
                        this._fmodules_oy_short[n15] = file[n13++];
                    }
                    this._fmodules_flags[n15] = file[n13++];
                }
            }
            offset_ = n13;

            int n16 = offset_;
            
            if ((this._bs_flags & 0x8000) != 0x0) {
                final short n17 = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                if ((this._bs_flags & 0x400) == 0x0) {
                    System.arraycopy(file, n16, this._frames_rects = new byte[n17 << 2], 0, n17 << 2);
                    n16 += n17 << 2;
                }
                else {
                    this._frames_rects_short = new short[n17 << 2];
                    final int n18 = n16;
                    final short[] var_fcf = this._frames_rects_short;
                    final int n19 = n17 << 2;
                    final short[] array6 = var_fcf;
                    int n20 = n18;
                    for (int k = 0; k < n19; ++k) {
                        array6[k] = (short)((file[n20++] & 0xFF) + ((file[n20++] & 0xFF) << 8));
                    }
                    n16 = n20;
                }
            }
            final short nFrames;
            if ((nFrames = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8))) > 0) {
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
                short n22 = 0;
                for (short n23 = 0; n23 < nFrames; ++n23) {
                    if ((this._bs_flags & 0x800) != 0x0) {
                        this._frames_nfm_short[n23] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                    }
                    else {
                        this._frames_nfm_byte[n23] = file[n16++];
                    }
                    this._frames_fm_start[n23] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                    if ((this._bs_flags & 0x8000) != 0x0 && (this._bs_flags & 0x8000) != 0x0) {
                        this._frames_rects_start[n23] = n22;
                        n22 += file[n16++];
                    }
                }
                if ((this._bs_flags & 0x8000) != 0x0) {
                    this._frames_rects_start[this._frames_rects_start.length - 1] = n22;
                }
                if ((this._bs_flags & 0x1000) == 0x0) {
                    final int nFrames2 = nFrames << 2;
                    if ((this._bs_flags & 0x400) == 0x0) {
                        this._frames_rc = new byte[nFrames2];
                        for (int l = 0; l < nFrames2; ++l) {
                            this._frames_rc[l] = file[n16++];
                        }
                    }
                    else {
                        this._frames_rc_short = new short[nFrames2];
                        for (int n25 = 0; n25 < nFrames2; ++n25) {
                            this._frames_rc_short[n25] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                        }
                    }
                }
            }
            offset_ = n16;
            int n26 = offset_;
            final short nModules;
            if ((nModules = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8))) > 0) {
                this._aframes = new byte[nModules];
                this._aframes_time = new byte[nModules];
                if ((this._bs_flags & 0x40000) != 0x0) {
                    this._modules_x_short = new short[nModules];
                    this._modules_y_short = new short[nModules];
                }
                else {
                    this._modules_x_byte = new byte[nModules];
                    this._modules_y_byte = new byte[nModules];
                }
                this.var_1047 = new byte[nModules];
                for (int i = 0; i < nModules; ++i) {
                    this._aframes[i] = file[n26++];
                    this._aframes_time[i] = file[n26++];
                    if ((this._bs_flags & 0x40000) != 0x0) {
                        this._modules_x_short[i] = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8));
                        this._modules_y_short[i] = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8));
                    }
                    else {
                        this._modules_x_byte[i] = file[n26++];
                        this._modules_y_byte[i] = file[n26++];
                    }
                    this.var_1047[i] = file[n26++];
                }
            }
            offset_ = n26;
            
            int offset = offset_;
            final short nAnims = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
            if (nAnims > 0) {
                this._anims_naf = new byte[nAnims];
                this._anims_af_start = new short[nAnims];
                for (short i = 0; i < nAnims; ++i) {
                    this._anims_naf[i] = file[offset++];
                    this._anims_af_start[i] = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
                }
            }
            offset_ = offset;
            if (this._nModules <= 0) {
                if (ASprite.s_gcEnabled) {
                    System.gc();
                }
                return;
            }
            if ((this._bs_flags & 0x1000000) != 0x0) {
                final ASprite this11 = this;
                int n32 = offset_;
                final ASprite this12 = this11;
                if ((this11._bs_flags & 0x1000000) != 0x0 && n32 < file.length) {
                    final short n33 = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                    int n34 = 1;
                    if ((this12._bs_flags & 0x40000000) != 0x0) {
                        n34 = file[n32++];
                    }
                    if (this12.var_1087 == null) {
                        this12.var_1087 = new int[n34];
                    }
                    for (int n35 = 0; n35 < n34; ++n35) {
                        this12._palettes = (file[n32++] & 0xFF);
                        int n36;
                        if ((n36 = (file[n32++] & 0xFF)) == 0) {
                            n36 = 256;
                        }
                        this12.var_1087[n35] = n36;
                        final ASprite this13 = this12;
                        final int n37 = n34;
                        final ASprite this14 = this13;
                        if (this13._module_image_intAAA == null) {
                            this14._module_image_intAAA = new int[n37][16][];
                        }
                        final ASprite this15 = this12;
                        final int n38 = n32;
                        final short n39 = n33;
                        final int n40 = n36;
                        final int n41 = n35;
                        final int n42 = n40;
                        final short n43 = n39;
                        int n44 = n38;
                        final ASprite this16 = this15;
                        for (int n45 = 0; n45 < this16._palettes; ++n45) {
                            this16._module_image_intAAA[n41][n45] = new int[n42];
                            final int[] array7 = this16._module_image_intAAA[n41][n45];
                            if (n43 == 21781) {
                                for (int n46 = 0; n46 < n42; ++n46) {
                                    final short n47 = (short)((file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8));
                                    int n48 = -16777216;
                                    if ((n47 & 0x8000) != 0x8000) {
                                        n48 = 0;
                                        this16.var_1097 = true;
                                    }
                                    int n49;
                                    if ((n49 = (n48 | (n47 & 0x7C00) << 9 | (n47 & 0x3E0) << 6 | (n47 & 0x1F) << 3)) == 16253176) {
                                        n49 = 16711935;
                                    }
                                    array7[n46] = n49;
                                }
                            }
                            else if (n43 == 25861) {
                                for (int n50 = 0; n50 < n42; ++n50) {
                                    final short n51 = (short)((file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8));
                                    int n52 = -16777216;
                                    if ((n51 & 0xFFFF) == 0xF81F) {
                                        n52 = 0;
                                        this16.var_1097 = true;
                                    }
                                    int n53;
                                    if ((n53 = (n52 | (n51 & 0xF800) << 8 | (n51 & 0x7E0) << 5 | (n51 & 0x1F) << 3)) == 16253176) {
                                        n53 = 16711935;
                                    }
                                    array7[n50] = n53;
                                }
                            }
                            else if (n43 == -30712) {
                                //this16.var_109f = false;
                                for (int n54 = 0; n54 < n42; ++n54) {
                                    int n55;
                                    if ((n55 = (file[n44++] & 0xFF) + ((file[n44++] & 0xFF) << 8) + ((file[n44++] & 0xFF) << 16)) == 16711935) {
                                        this16.var_1097 = true;
                                    }
                                    else {
                                        n55 |= 0xFF000000;
                                    }
                                    array7[n54] = n55;
                                }
                            }
                        }
                        n32 = n44;
                    }
                    this12._data_format = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                    if (this12._data_format == 25840 || this12._data_format == -22976) {
                        if (this12.var_10b7 == null) {
                            this12.var_10b7 = new int[n34];
                            this12.var_10bf = new int[n34];
                        }
                        for (int n56 = 0; n56 < n34; ++n56) {
                            int n57 = this12.var_1087[n56] - 1;
                            this12.var_10b7[n56] = 1;
                            this12.var_10bf[n56] = 0;
                            while (n57 != 0) {
                                n57 >>= 1;
                                final int[] var_10b7 = this12.var_10b7;
                                final int n58 = n56;
                                var_10b7[n58] <<= 1;
                                final int[] var_10bf = this12.var_10bf;
                                final int n59 = n56;
                                ++var_10bf[n59];
                            }
                            final int[] var_10b8 = this12.var_10b7;
                            final int n60 = n56;
                            --var_10b8[n60];
                        }
                    }
                    if (this12._nModules > 0) {
                        this12._modules_data_off_int = new int[this12._nModules];
                        int n61 = 0;
                        final int n62 = n32;
                        for (int n63 = 0; n63 < this12._nModules; ++n63) {
                            int n64;
                            if ((this12._bs_flags & 0x80) != 0x0) {
                                n64 = (file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8) + ((file[n32++] & 0xFF) << 16) + ((file[n32++] & 0xFF) << 24);
                            }
                            else {
                                n64 = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                            }
                            this12._modules_data_off_int[n63] = n61;
                            n61 += n64;
                            n32 += n64;
                        }
                        int n65 = n62;
                        this12._modules_data = new byte[n61];
                        for (int n66 = 0; n66 < this12._nModules; ++n66) {
                            int n67;
                            if ((this12._bs_flags & 0x80) != 0x0) {
                                n67 = (file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8) + ((file[n65++] & 0xFF) << 16) + ((file[n65++] & 0xFF) << 24);
                            }
                            else {
                                n67 = (short)((file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8));
                            }
                            System.arraycopy(file, n65, this12._modules_data, this12.getStartModuleData(n66), n67);
                            n65 += n67;
                        }
                    }
                }
            }
            this.var_1057 = -1;
            this.map = new short[16][];
            if ((this._bs_flags & 0x1000) != 0x0) {
                final int sub_3717;
                if ((sub_3717 = this.GetFrames()) > 0) {
                    offset_ = 0;
                    if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
                        this._frames_rc = new byte[sub_3717 << 2];
                        for (int n68 = 0; n68 < sub_3717; ++n68) {
                            this.GetFrameRect(ASprite.s_rc, n68);
                            this._frames_rc[offset_++] = (byte)ASprite.s_rc[0];
                            this._frames_rc[offset_++] = (byte)ASprite.s_rc[1];
                            this._frames_rc[offset_++] = (byte)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this._frames_rc[offset_++] = (byte)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                    else {
                        this._frames_rc_short = new short[sub_3717 << 2];
                        for (int n69 = 0; n69 < sub_3717; ++n69) {
                            this.GetFrameRect(ASprite.s_rc, n69);
                            this._frames_rc_short[offset_++] = (short)ASprite.s_rc[0];
                            this._frames_rc_short[offset_++] = (short)ASprite.s_rc[1];
                            this._frames_rc_short[offset_++] = (short)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this._frames_rc_short[offset_++] = (short)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                }
            }
            else if ((this._flags & 0x4) != 0x0) {
                final ASprite this17 = this;
                this17._flags &= 0xFFFFFFFB;
            }
            if (ASprite.s_gcEnabled) {
                System.gc();
            }
        }
        catch (final Exception ex) {}
    }
    
    private void sub_2f12(final int n) {
        if (this._module_types_2 == null) {
            this._module_types_2 = new byte[n];
            for (int i = 0; i < n; ++i) {
                this._module_types_2[i] = 0;
            }
        }
        if (this._module_colors_int == null) {
            this._module_colors_int = new int[n];
        }
    }
    
    final void FreeCacheData() {
        this._module_image_intAAA = null;
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
        return this._anims_naf[anim] & 0xFF;
    }
    
    private int GetFModules(final int n) {
        if ((this._bs_flags & 0x800) != 0x0) {
            return this._frames_nfm_short[n];
        }
        return this._frames_nfm_byte[n] & 0xFF;
    }
    
    private int GetModuleX(final int module) {
        if ((this._bs_flags & 0x40000) != 0x0) {
            return this._modules_x_short[module];
        }
        return this._modules_x_byte[module];
    }
    
    private int GetModuleY(final int module) {
        if ((this._bs_flags & 0x40000) != 0x0) {
            return this._modules_y_short[module];
        }
        return this._modules_y_byte[module];
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
    
    final int GetFrameX(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[frame << 2];
        }
        return this._frames_rc_short[frame << 2];
    }
    
    final int GetFrameY(final int frame) {
        if ((this._bs_flags & 0x400) == 0x0 && (this._flags & 0x4) == 0x0) {
            return this._frames_rc[(frame << 2) + 1];
        }
        return this._frames_rc_short[(frame << 2) + 1];
    }
    
    private int GetFrameModule(final int frame) {
        int n2;
        if ((this._bs_flags & 0x100000) != 0x0) {
            n2 = this._fmodules_id_short[frame];
        }
        else {
            n2 = (this._fmodules_id[frame] & 0xFF);
        }
        return n2;
    }
    
    final int GetFrameModule(int frame, final int fmodule) {
        frame = this.GetFrameModuleOffset(frame, fmodule);
        return this.GetFrameModule(frame);
    }
    
    private int GetFModuleFlags(final int off) {
        return this._fmodules_flags[off] & 0xFF;
    }
    
    final int GetFMFlags(int sub_3356, final int n) {
        sub_3356 = this.GetFrameModuleOffset(sub_3356, n);
        return this.GetFModuleFlags(sub_3356);
    }
    
    private int GetFrameModuleOffset(final int frame, final int fmodule) {
        return this._frames_fm_start[frame] + fmodule;
    }
    
    private int sub_3379(int n) {
        n = this._frames_fm_start[n];
        return this._fmodules_ox_short[n];
    }
    
    final int sub_33a1(int n, final int n2) {
        n = this._frames_fm_start[n] + n2;
        return this._fmodules_oy_short[n];
    }
    
    private void GetFrameRect(final int[] rc, final int frame) {
        this.GetFrameRect(rc, frame, 0, 0, 0, false, true);
    }
    
    private void GetFrameRect(final int[] rc, int frame, final int posX, final int posY, final int flags, final boolean allowRotation, final boolean forceComputeFrameRect) {
        if (!forceComputeFrameRect) {
            int fx = this.GetFrameX(frame);
            int fy = this.GetFrameY(frame);
            int fwidth = this.GetFrameWidth(frame);
            int fheight = this.GetFrameHeight(frame);
            if ((flags & 0x1) != 0x0) {
                fx = -fx - fwidth;
            }
            if ((flags & 0x2) != 0x0) {
                fy = -fy - fheight;
            }
            if ((flags & 0x4) != 0x0) {
                frame = fx;
                fx = -fy - fheight;
                fy = frame;
                frame = fwidth;
                fwidth = fheight;
                fheight = frame;
            }
            ASprite._rectX1 = posX + fx;
            ASprite._rectY1 = posY + fy;
            ASprite._rectX2 = ASprite._rectX1 + fwidth;
            ASprite._rectY2 = ASprite._rectY1 + fheight;
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
    
    final void sub_354b(final int[] rc, int sub_30a6, int n, final int n2, final int n3, final int n4) {
        int n5 = this.var_1047[this._anims_af_start[sub_30a6] + n] & 0xF;
        if ((n4 & 0x1) != 0x0) {
            n5 = (ASprite.var_10f7[n5 & 0x7] | (n5 & 0xFFFFFFF8));
        }
        if ((n4 & 0x2) != 0x0) {
            n5 = (ASprite.var_10ff[n5 & 0x7] | (n5 & 0xFFFFFFF8));
        }
        if ((n4 & 0x4) != 0x0) {
            n5 = (ASprite.var_1107[n5 & 0x7] | (n5 & 0xFFFFFFF8));
        }
        final int n6 = n5;
        final int n7 = this._aframes[this._anims_af_start[sub_30a6] + n] & 0xFF;
        int sub_3062 = this.GetModuleX(this._anims_af_start[sub_30a6] + n);
        sub_30a6 = this.GetModuleY(this._anims_af_start[sub_30a6] + n);
        if ((n4 & 0x1) != 0x0) {
            sub_3062 = -sub_3062;
        }
        if ((n4 & 0x2) != 0x0) {
            sub_30a6 = -sub_30a6;
        }
        if ((n4 & 0x4) != 0x0) {
            n = sub_3062;
            sub_3062 = -sub_30a6;
            sub_30a6 = n;
        }
        this.GetFrameRect(rc, n7, n2 + sub_3062, n3 + sub_30a6, n6, false, false);
    }
    
    final int GetAnims() {
        if (this._anims_naf == null) {
            return 0;
        }
        return this._anims_naf.length;
    }
    
    final int GetFrames() {
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
            if ((this.GetFMFlags(frame, fmodule) & 0x10) != 0x0) {
                realcount = realcount - 1 + this.CountFrameModules(index);
            }
        }
        return realcount;
    }
    
    private int getStartModuleData(final int module) {
        if (this._modules_data_off_int != null) {
            return this._modules_data_off_int[module];
        }
        return -1;
    }
    
    final int GetFrameRectCount(final int frames) {
        if (this._frames_rects_start != null) {
            return this._frames_rects_start[frames + 1] - this._frames_rects_start[frames];
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
    
    static int[] InitTempBuffer(final int[] buf) {
        if (buf == null || buf != ASprite.temp_int) {
            if (ASprite.temp_int == null) {
                ASprite.temp_int = new int[27832];
            }
            return ASprite.temp_int;
        }
        if (buf == null || buf != ASprite._temp_int) {
            if (ASprite._temp_int == null) {
                ASprite._temp_int = new int[27832];
            }
            return ASprite._temp_int;
        }
        return null;
    }
    
    final boolean sub_3a3a(final int n) {
        return n >= 0 && this._module_image_imageAA != null && n < this._module_image_imageAA.length && this._module_image_imageAA[n] != null;
    }
    
    final void sub_3aab(final int n, final int n2) {
        this._fmodules_ox_short[n] = (short)n2;
    }
    
    final void sub_3ace(final int n, final int n2) {
        this._fmodules_oy_short[n] = (short)n2;
    }
    
    public final void InitUnkVars() {
        this._unkImageArr = new GLLibImage[this._palettes][this._nModules];
        this.var_1167 = new int[this._palettes][this._nModules];
    }
    
    public final boolean HasUnkImageArr() {
        return this._unkImageArr != null;
    }
    
    private static int sub_3b62(final int[] array, final int n) {
        return GLLib.sub_45c0(array, 0, array.length, n);
    }
    
    private boolean sub_3b85(int n, final int n2, final int n3, int n4) {
        if (this.HasUnkImageArr()) {
            final int sub_5a53;
            final int[] sub_5a52 = GLLib.sub_5a52(sub_5a53 = GLLib.sub_5a72());
            final int n5 = sub_5a53;
            final int[] array = sub_5a52;
            if (this._unkImageArr != null && this._unkImageArr[this._crt_pal][n] != null && sub_3b62(array, n5) == this.var_1167[this._crt_pal][n]) {
                final GLLibImage class_l = this._unkImageArr[this._crt_pal][n];
                final int width = class_l.image.getWidth();
                final int height = class_l.image.getHeight();
                GLLib.DrawRegion(GLLib.g, class_l, 0, 0, width, height, ASprite.midp2_flags[n4], n2, n3, 20, false);
                return true;
            }
        }
        return false;
    }
    
    private boolean sub_3c9a(int n, final int n2, final int n3, final int[] array, int n4) {
        if (this.HasUnkImageArr() && array != null) {
            final int sub_5a53;
            final int[] sub_5a52 = GLLib.sub_5a52(sub_5a53 = GLLib.sub_5a72());
            final GLLibImage sub_1d9 = GLLibImage.createRGBImage(array, GLLib.var_201f, GLLib.var_2027, true);
            
            this._unkImageArr[this._crt_pal][n] = sub_1d9;
            this.var_1167[this._crt_pal][n] = sub_3b62(sub_5a52, sub_5a53);
            final int width = sub_1d9.image.getWidth();
            final int height = sub_1d9.image.getHeight();
            GLLib.DrawRegion(GLLib.g, sub_1d9, 0, 0, width, height, ASprite.midp2_flags[n4], n2, n3, 20, false);
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
    
    final void sub_3e59() {
        if (this._cur_pool >= 0) {
            for (int i = 0; i < ASprite._poolCacheStackMax[this._cur_pool]; ++i) {
                if (ASprite._poolCacheSprites[this._cur_pool][i] == this) {
                    final short n2;
                    final int n = (n2 = ASprite._poolCacheStack[this._cur_pool][i]) >> 10;
                    final int n3 = n2 & 0x3FF;
                    ASprite._poolCacheSprites[this._cur_pool][i] = null;
                    this._module_image_imageAA[n][n3] = null;
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
            final byte b = (byte)((this._module_types == null) ? 0 : this._module_types[module]);
            final int sub_3801 = this.getStartModuleData(module);
            final int sizeX = this._modules_w_short[module] & 0xFFFF;
            final int sizeY = this._modules_h_short[module] & 0xFFFF;
            module = sub_3801;
            int di = 0;
            int ds = sizeX * sizeY;
            if (ASprite.temp_int == null) {
                ASprite.temp_int = new int[27832]; // TMP_BUFFER_SIZE
            }
            final int[] pal_int;
            boolean unkbool;
            if ((pal_int = (int[])((_crt_pal >= 0 && _crt_pal < this._palettes && this._module_image_intAAA != null && _crt_pal < this._module_image_intAAA[b].length) ? this._module_image_intAAA[b][_crt_pal] : null)) == null) {
                unkbool = false;
            }
            else {
                if (this._data_format == 25840) {
                    while (di < ds) {
                        int c = _modules_data[module++] & 0xFF;
                        final int clr_int = pal_int[c & this.var_10b7[b]];
                        c >>= this.var_10bf[b];
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
                unkbool = true;
            }
            if (unkbool) {
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
        int i = index;
        while (i < pNewMap.length) {
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
        this.var_11cf = this.sub_33a1(0, 0);
        this.var_11af = this.var_11cf + this.sub_33a1(0, 1);
        
        this.var_11b7 = this.sub_33a1(0, 2) - this.sub_33a1(0, 1);
        this._nSpaceWidth = this.sub_3379(this.GetCharFrame(32));
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
    
    final int sub_490a() {
        if (this.var_11f7 >= 0) {
            return this.var_11b7 * this.var_11f7 >> 8;
        }
        return this.var_11b7;
    }
    
    final int _GetLineHeight() {
        if (this.var_11f7 >= 0) {
            return this.var_11af * this.var_11f7 >> 8;
        }
        return this.var_11af;
    }
    
    private int GetSpaceWidth() {
        if (this.var_11f7 >= 0) {
            return this._nSpaceWidth * this.var_11f7 >> 8;
        }
        return this._nSpaceWidth;
    }
    
    private int GetLineHeight() {
        if (this.var_11f7 >= 0) {
            return this._nHeight * this.var_11f7 >> 8;
        }
        return this._nHeight;
    }
    
    final void SetLineHeight(final int SetLineHeight) {
        this._nHeight = SetLineHeight;
    }
    
    final int i_forgot_what_this_is() {
        if (this.var_11f7 >= 0) {
            return this.var_11af * this.var_11f7 >> 8;
        }
        return this.var_11af;
    }
    
    private static final int sub_4a7e(final short[] array, int n) {
        n = n * 3 + 1;
        return array[n];
    }
    
    private static final int sub_4aa2(final short[] array, int n) {
        n = n * 3 + 2;
        return array[n];
    }
    
    final short[] WraptextB(final String s, final int width, final boolean b) {
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
            if (c == ' ' || c == ASprite.var_1157) {
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
                    for (int pos = lastSpacePos; pos >= 0 && (s.charAt(pos) == ' ' || s.charAt(pos) == ASprite.var_1157); --pos) {
                        if (s.charAt(pos) == ' ') {
                            lineSize -= (short)this.GetSpaceWidth();
                        }
                    }
                    while (lastSpacePos < str_len && (s.charAt(lastSpacePos) == ' ' || s.charAt(lastSpacePos) == ASprite.var_1157)) {
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
                int n18 = sub_63ed + this.GetLineHeight();
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
                    for (int n19 = lastSpacePos; n19 >= 0 && (s.charAt(n19) == ' ' || s.charAt(n19) == '\n' || s.charAt(n19) == ASprite.var_1157); --n19) {
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
    
    final void DrawPageB(final Graphics g, final String s, final short[] info, final int x, int y, int startLine, int maxLines, final int anchor, int sub_4a3a, final boolean b) {
        startLine = info[0];
        sub_4a3a = this.i_forgot_what_this_is();
        if (maxLines == -1) {
            maxLines = startLine;
        }
        if (maxLines > startLine) {
            maxLines = startLine;
        }
        sub_4a3a += this.sub_490a();
        if ((anchor & 0x20) != 0x0) {
            y -= sub_4a3a * (maxLines - 1);
        }
        else if ((anchor & 0x2) != 0x0) {
            y -= sub_4a3a * (maxLines - 1) >> 1;
        }
        ASprite._old_pal = this._crt_pal;
        final boolean var_11df = this._bBold;
        final boolean var_11d7 = this._bUnderline;
        final int sub_3600;
        final int n6 = (sub_3600 = GLLib.GetClipY(g, true)) + GLLib.GetClipHeight(g, true);
        final int n7 = sub_3600 - sub_4a3a;
        final int n8 = n6 + sub_4a3a;
        for (int n9 = 0, n10 = 0; n10 < startLine && n9 <= maxLines - 1; ++n10, ++n9) {
            ASprite._index1 = ((n10 > 0) ? sub_4a7e(info, n10 - 1) : 0);
            ASprite._index2 = sub_4a7e(info, n10);
            if (ASprite._index1 < s.length() && s.charAt(ASprite._index1) == '\n') {
                ++ASprite._index1;
            }
            int xx = x;
            int yy;
            if ((yy = y + n9 * sub_4a3a) >= n7) {
                if (yy > n8) {
                    break;
                }
                if ((anchor & 0x2B) != 0x0) {
                    if (this.var_11f7 >= 0) {
                        if ((anchor & 0x8) != 0x0) {
                            xx = x - (sub_4aa2(info, n10) * this.var_11f7 >> 8);
                        }
                        else if ((anchor & 0x1) != 0x0) {
                            xx = x - (sub_4aa2(info, n10) * this.var_11f7 >> 9);
                        }
                    }
                    else if ((anchor & 0x8) != 0x0) {
                        xx = x - sub_4aa2(info, n10);
                    }
                    else if ((anchor & 0x1) != 0x0) {
                        xx = x - (sub_4aa2(info, n10) >> 1);
                    }
                    if ((anchor & 0x20) != 0x0) {
                        yy -= this.i_forgot_what_this_is();
                    }
                    else if ((anchor & 0x2) != 0x0) {
                        yy -= this.i_forgot_what_this_is() >> 1;
                    }
                }
                final short n13 = info[n10 * 3 + 3];
                this._bBold = ((n13 & 0x1000) != 0x0);
                this._bUnderline = ((n13 & 0x2000) != 0x0);
                this.SetCurrentPalette(n13 & 0xFFF);
                this.DrawStringOrChars(g, s, xx, yy, 0, false);
            }
        }
        ASprite._index1 = -1;
        ASprite._index2 = -1;
        ASprite.var_1217 = -1;
        this._crt_pal = ASprite._old_pal;
        this._bBold = var_11df;
        this._bUnderline = var_11d7;
    }
    
    final void UpdateStringOrCharsSize(final String s, final char[] charBuff) {
        if (s == null) {
            return;
        }
        ASprite._text_w = 0;
        ASprite._text_h = this.i_forgot_what_this_is();
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
                        if (c == ' ' || c == ASprite.var_1157) {
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
                            ASprite._text_h += this.sub_490a() + this.i_forgot_what_this_is();
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
                    n += this.GetLineSpacing(sub_4851) + this.GetLineHeight();
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
            ASprite._text_w -= this.GetLineHeight();
        }
    }
    
    final void DrawString(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        this.DrawStringOrChars(graphics, s, n, n2, n3, true);
    }
    
    private void DrawStringOrChars(Graphics graphics, String s, int x, int y, int anchor, final boolean restorecol) {
        
        if (s != null) {
            if (this.var_11f7 >= 0) {
                y += this.var_11cf * this.var_11f7 >> 8;
            }
            else {
                y += this.var_11cf;
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
            if (ASprite.var_1217 >= 0 && index2 > ASprite.var_1217) {
                index2 = ASprite.var_1217;
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
                else if (c != ASprite.var_1157) {
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
                            y += this.sub_490a() + this.i_forgot_what_this_is();
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
                    anchor += this.GetLineSpacing(n7) + this.GetLineHeight();
                }
            }
            if (restorecol) {
                this._crt_pal = ASprite._old_pal;
            }
        }
    }
    
    private final int GetLineSpacing(final int n) {
        if (this.var_11f7 >= 0) {
            return this.sub_3379(n) * this.var_11f7 >> 8;
        }
        return this.sub_3379(n);
    }
    
    final void SetCurrentPalette(final int pal) {
        
        if (pal < this._palettes && pal >= 0) {
            this._crt_pal = pal;
        }
    }
    
    final int GetCurrentPalette() {
        return this._crt_pal;
    }
    
    final int sub_6494(final int n) {
        if ((this._bs_flags & 0x100000) != 0x0) {
            return this._frames_nfm_short[n];
        }
        return this._frames_nfm_byte[n];
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
                if (((this._module_types_2 != null) ? this._module_types_2[m1] : 0) == 0) {
                    int sizeX = this._modules_w_short[m1] & 0xFFFF;
                    int sizeY = this._modules_h_short[m1] & 0xFFFF;
                    int[] image_data2;
                    if (sizeX > 0 && sizeY > 0 && (image_data2 = this.DecodeImage_int(m1)) != null) {
                        if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                            image_data2 = GLLib.GetRGBData(null, image_data2, 0, 0, sizeX, sizeY, 0, this.var_1097, false, false);
                            sizeX = GLLib.var_201f;
                            sizeY = GLLib.var_2027;
                        }
                        boolean b = false;
                        for (int j = 0; j < sizeX * sizeY; ++j) {
                            if ((image_data2[j] & 0xFF000000) != 0xFF000000) {
                                b = true;
                                break;
                            }
                        }
                        this._module_image_imageAA[pal][m1] = GLLibImage.createRGBImage(GetRGBData(image_data2, sizeY, sizeX, 4, null), sizeY, sizeX, b);
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
        final int frames = this.GetFrames();
        if (n2 == -1 || n2 >= frames) {
            n2 = frames - 1;
        }
        if (this.var_10df == null) {
            this.var_10df = new GLLibImage[this._palettes][][];
        }
        final int n4 = this.var_1057 + 1;
        if (this.var_10df[n] == null) {
            
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
            this.var_10df[n] = new GLLibImage[length + 1][];
        }
        if (this.var_10df[n][n4] == null) {
            this.var_10df[n][n4] = new GLLibImage[frames];
        }
        for (int i = sub_312c; i <= n2; ++i) {
            sub_312c = this.GetFrameWidth(i);
            int sub_3718 = this.GetFrameHeight(i);
            if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                final int sub_5bbb = GLLib.sub_5bbb();
                final int sub_5bfe = GLLib.sub_5bfe();
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
                final int sub_31e6 = this.GetFrameX(i);
                final int sub_3720 = this.GetFrameY(i);
                int n10 = -sub_31e6;
                int n11 = -sub_3720;
                if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                    final int sub_5bbb2 = GLLib.sub_5bbb();
                    final int sub_5bfe2 = GLLib.sub_5bfe();
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
                    if (((n12 = ASprite.var_1107[0]) & 0x4) != 0x0) {
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
                        ASprite.s_screenHeight = var_10c7;
                        ASprite.s_screenWidth = var_10cf;
                    }
                    this.PaintFrame(graphics, i, n10, n11, 0);
                    if ((n12 & 0x4) != 0x0) {
                        final int var_1ddf = GLLib.s_screenWidth;
                        final int var_1de7 = GLLib.s_screenHeight;
                        ASprite.s_screenHeight = var_1ddf;
                        ASprite.s_screenWidth = var_1de7;
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
                final int n14 = ASprite.var_1107[0];
                class_l = ((array4 == null) ? null : (((n14 & 0x4) != 0x0) ? GLLibImage.createRGBImage(array4, sub_3718, sub_312c, ASprite.var_10e7) : GLLibImage.createRGBImage(array4, sub_312c, sub_3718, ASprite.var_10e7)));
            }
            this.var_10df[n][n4][i] = class_l;
        }
    }
    
    private static boolean sub_6ef1(final Graphics graphics, final int n, final int n2, int n3, int n4) {
        final int sub_35c6 = GLLib.GetClipX(graphics, true);
        final int sub_3600 = GLLib.GetClipY(graphics, true);
        final int sub_3601 = GLLib.GetClipWidth(graphics, true);
        final int sub_367d = GLLib.GetClipHeight(graphics, true);
        if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
            final int sub_5bbb = GLLib.sub_5bbb();
            final int sub_5bfe = GLLib.sub_5bfe();
            n3 = n3 * sub_5bbb / 100;
            n4 = n4 * sub_5bfe / 100;
        }
        else if ((GLLib.var_1fe7 & 1 << 15) != 0x0) {
            return true;
        }
        return n + n3 >= sub_35c6 && n2 + n4 >= sub_3600 && n < sub_35c6 + sub_3601 && n2 < sub_3600 + sub_367d;
    }
    
    final void PaintAFrame(final Graphics g, int anim, int aframe, final int posX, final int posY, int flags) {
        anim = this._anims_af_start[anim] + aframe;
        aframe = (this._aframes[anim] & 0xFF);
        int hx = this.GetModuleX(anim);
        int hy = this.GetModuleY(anim);
        int n4 = this.var_1047[anim] & 0xF;
        if ((flags & 0x1) != 0x0) {
            n4 = (ASprite.var_10f7[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            hx = -hx;
        }
        if ((flags & 0x2) != 0x0) {
            n4 = (ASprite.var_10ff[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            hy = -hy;
        }
        if ((flags & 0x4) != 0x0) {
            n4 = (ASprite.var_1107[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            anim = hx;
            hx = -hy;
            hy = anim;
        }
        if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][5] == 0) {
            anim = GLLib.sub_5bbb();
            flags = GLLib.sub_5bfe();
            hx = anim * hx / 100;
            hy = flags * hy / 100;
        }
        this.PaintFrame(g, aframe, posX + hx, posY + hy, n4);
    }
    
    final void PaintFrame(final Graphics g, final int frame, final int posX, final int posY, final int flags) {
        this.sub_71d4(g, frame, posX, posY, flags);
    }
    
    final void sub_71d4(final Graphics graphics, final int n, final int n2, final int width, int height) {
        int sub_3019 = -1;
        Label_0748: {
            if (ASprite._operation == 0) {
                if (this.var_10df != null && this.var_10df[_crt_pal] != null && this.var_10df[_crt_pal][this.var_1057 + 1][n] != null) {
                    int n6 = height;
                    int n7 = 0;
                    final int sub_312c = this.GetFrameWidth(n);
                    final int sub_3020 = this.GetFrameHeight(n);
                    int sub_31e6 = this.GetFrameX(n);
                    int sub_3021 = this.GetFrameY(n);
                    if ((height & 0x4) != 0x0) {
                        sub_31e6 = sub_3021;
                        sub_3021 = sub_31e6;
                    }
                    if ((height & 0x1) != 0x0) {
                        sub_31e6 = -sub_31e6 - sub_312c;
                    }
                    if ((height & 0x2) != 0x0) {
                        sub_3021 = -sub_3021 - sub_3020;
                    }
                    if ((height & 0x4) != 0x0) {
                        sub_31e6 = -sub_3021 - sub_3020;
                        sub_3021 = sub_31e6;
                    }
                    int n10 = n2 + sub_31e6;
                    int n11 = width + sub_3021;
                    if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                        final int sub_5bbb = GLLib.sub_5bbb();
                        final int sub_5bfe = GLLib.sub_5bfe();
                        sub_31e6 -= sub_5bbb * sub_31e6 / 100;
                        sub_3021 -= sub_5bfe * sub_3021 / 100;
                        n10 -= sub_31e6;
                        n11 -= sub_3021;
                    }
                    if ((GLLib.var_1fe7 & 1 << 15) != 0x0) {
                        n10 -= sub_31e6;
                        n11 -= sub_3021;
                    }
                    int n12;
                    if (graphics != null && !sub_6ef1(graphics, n10, n11, sub_312c, sub_3020)) {
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
                        int n13 = sub_3020;
                        if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                            n13 = n13 * GLLib.sub_5bfe() / 100;
                        }
                        final int n14 = n10;
                        final int n15 = ASprite.s_screenWidth - n11 - n13;
                        final int n16 = n14;
                        final int n17 = sub_312c;
                        final int n18 = sub_3020;
                        final int n19 = n17;
                        final int _crt_pal2 = this._crt_pal;
                        final GLLibImage image;
                        if ((image = ((this.var_10df == null || this.var_10df[_crt_pal2] == null) ? null : this.var_10df[_crt_pal2][this.var_1057 + 1][n])) != null) {
                            Label_0733: {
                                if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                                    boolean b = false;
                                    if (image != null) {
                                        final int[] sub_39a6 = InitTempBuffer(null);
                                        GLLib.GetRGB(image, sub_39a6, 0, n18, 0, 0, n18, n19);
                                        final int[] sub_5d84 = GLLib.GetRGBData(graphics, sub_39a6, n15, n16, n18, n19, height, var_1097, false, true);
                                        if (sub_5d84 != null) {
                                            GLLib.DrawRGB(graphics, sub_5d84, 0, GLLib.var_201f, n15, n16, GLLib.var_201f, GLLib.var_2027, GLLib.var_1ff7, true, 0, -1, false);
                                        }
                                        b = true;
                                    }
                                    if (b) {
                                        break Label_0733;
                                    }
                                }
                                if (n6 == 0) {
                                    GLLib.DrawImage(graphics, image, n15, n16, 20, false);
                                }
                                else {
                                    GLLib.DrawRegion(graphics, image, 0, 0, n18, n19, ASprite.midp2_flags[height & 0x7], n15, n16, 20, false);
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
                int sub_330a = this.GetFModuleFlags(sub_3022);
                final int sub_328e;
                int n29 = sub_328e = this.GetFrameModule(sub_3022);
                if (this.var_1057 >= 0) {
                    n29 = this.map[this.var_1057][n29];
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
                    sub_330a = (ASprite.var_10f7[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n34 = -n34 - n30;
                }
                if ((height & 0x2) != 0x0) {
                    sub_330a = (ASprite.var_10ff[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n35 = -n35 - n31;
                }
                if ((height & 0x4) != 0x0) {
                    sub_330a = (ASprite.var_1107[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    final int n37 = n34;
                    n34 = -n35 - n31;
                    n35 = n37;
                }
                if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][5] == 0) {
                    final int sub_5bbb2 = GLLib.sub_5bbb();
                    final int sub_5bfe2 = GLLib.sub_5bfe();
                    if (GLLib.var_1fef[13][6] % GLLib.var_1e9f != 0) {
                        GLLib.var_1fef[16][1] = -n34;
                        GLLib.var_1fef[16][2] = -n35;
                    }
                    n34 = sub_5bbb2 * n34 / 100;
                    n35 = sub_5bfe2 * n35 / 100;
                }
                this.sub_7dca(graphics, sub_328e, n2 + n34, width + n35, sub_330a & 0xF, n32, n33);
            }
        }
    }
    
    final void PaintFrameWithZoom(final Graphics g, final int frame, final int posX, final int posY, final int zoom) {
        GLLib.sub_5b71();
        GLLib.Custom_SetZoomLevel(zoom);
        this.PaintFrame(g, frame, posX, posY, 0);
        GLLib.sub_5b96();
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
        if (this.var_1057 >= 0) {
            module = this.map[this.var_1057][module];
        }
        if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][5] != 0) {
            posX *= GLLib.sub_5bbb() / 100;
            posY *= GLLib.sub_5bfe() / 100;
        }
        
        if (((this._module_types_2 != null) ? this._module_types_2[module] : 0) == 0) {
            if ((n3 & 0x1) == 0x0 || (n3 & 0x2) == 0x0) {
                if ((n3 & 0x1) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFE) | 0x2);
                }
                else if ((n3 & 0x2) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFD) | 0x1);
                }
            }
            final int n12 = ASprite.s_screenWidth - posY;
            posY = module;

            int n15 = this._modules_h_short[posY];
            if ((n3 & 0x4) != 0x0) {
                n15 = this._modules_w_short[posY];
            }
            if (n15 < 0) {
                n15 += 255;
            }
            if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                n15 = n15 * GLLib.sub_5bfe() / 100;
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
        if (((this._module_types_2 != null) ? this._module_types_2[module] : 0) != 0 && g != null) {
            module = this._module_colors_int[module];
            g.setColor(module);
            switch (this._module_types_2[module]) {
                case 2: {
                    if ((module & 0xFF000000) == 0xFF000000 || (module & 0xFF000000) == 0x0) {
                        GLLib.FillRect(g, posX, posY, var_1148, p2x, true);
                        return;
                    }
                    GLLib.sub_56ff(module);
                    GLLib.sub_57eb(g, posX, posY, var_1148, p2x);
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
                        if (this._module_types_2[module] == 3) {
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
                        if (this._module_types_2[module] == 6) {
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
                        GLLib.sub_7041(g, posX, posY, var_1148, p2x, p2x, p2y, n43);
                        return;
                    }
                    GLLib.sub_6ccf(g, posX, posY, var_1148, p2x, p2x, p2y, n43);
                    break;
                }
            }
            return;
        }
        if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][6] % 360 != 0) {
            int n44 = ((GLLib.var_1fe7 & 0x2000) != 0x0) ? GLLib.var_1fef[13][6] : GLLib.var_1fef[16][0];
            if ((n3 & 0x4) != 0x0) {
                n3 &= 0xFFFFFFFB;
                n44 += 90 * GLLib.var_1ed7 / 360;
            }
            GLLib.sub_5cfb(GLLib.Math_Cos(GLLib.Math_Angle90 - n44), GLLib.Math_Cos(n44), p2x, var_1148, ASprite.s_rc);
            int n45 = ASprite.s_rc[0];
            int n46 = ASprite.s_rc[1];
            int n47 = p2x - GLLib.var_1fef[16][2];
            int n48 = GLLib.var_1fef[16][1];
            if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                n47 = n47 * GLLib.sub_5bbb() / 100;
                n48 = n48 * GLLib.sub_5bfe() / 100;
                p2x = p2x * GLLib.sub_5bbb() / 100;
                var_1148 = var_1148 * GLLib.sub_5bfe() / 100;
                n45 = n45 * GLLib.sub_5bbb() / 100;
                n46 = n46 * GLLib.sub_5bbb() / 100;
            }
            final int n49 = n44;
            GLLib.sub_5cbc(GLLib.Math_Cos(GLLib.Math_Angle90 - n49), GLLib.Math_Cos(n49), (p2x >> 1) - n47, (var_1148 >> 1) - n48, ASprite.s_rc);
            posX += ASprite.s_rc[0] - n45 / 2 + n47;
            posY += ASprite.s_rc[1] - n46 / 2 + n48;
        }
        if (p2x <= 0 || var_1148 <= 0) {
            return;
        }
        if (g == null || sub_6ef1(g, p2y, posY, var_1148, p2x)) {
            GLLibImage class_l = null;
            if ((this._bs_flags & 0x1000008) != 0x0) {
                if (this._module_image_imageAA != null && this._module_image_imageAA[this._crt_pal] != null) {
                    class_l = this._module_image_imageAA[this._crt_pal][module];
                }
                boolean b = this.var_1097;
                if (class_l == null) {
                    int[] array;
                    if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0 && this.HasUnkImageArr()) {
                        if (this.sub_3b85(module, posX, posY, n3)) {
                            return;
                        }
                        array = this.DecodeImage_int(module);
                    }
                    else {
                        array = this.DecodeImage_int(module);
                    }
                    if (array != null) {
                        boolean b2 = false;
                        if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                            if (this.sub_3b85(module, posX, posY, n3)) {
                                return;
                            }
                            final boolean sub_3b2c;
                            if (!(sub_3b2c = this.HasUnkImageArr())) {
                                n3 = (ASprite.var_1107[n3 & 0x7] | (n3 & 0xFFFFFFF8));
                            }
                            array = GLLib.GetRGBData(g, array, posX, posY, n19, n18, sub_3b2c ? 4 : n3, b, false, !sub_3b2c);
                            if (this.sub_3c9a(module, posX, posY, array, n3) || array == null) {
                                return;
                            }
                            b = GLLib.var_1ff7;
                            n3 = 0;
                            posX = GLLib.var_200f;
                            posY = GLLib.var_2017;
                            p2x = GLLib.var_201f;
                            var_1148 = GLLib.var_2027;
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
                                    class_l2 = GLLibImage.createRGBImage(array2, var_1148, p2x, this.var_1097);
                                }
                                else {
                                    class_l2 = GLLibImage.createRGBImage(array2, p2x, var_1148, this.var_1097);
                                }
                            }
                            else if ((n3 & 0x4) != 0x0) {
                                class_l2 = GLLibImage.createRGBImage(array, var_1148, p2x, this.var_1097);
                            }
                            else {
                                class_l2 = GLLibImage.createRGBImage(array, p2x, var_1148, this.var_1097);
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
                else if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                    if (!this.sub_3b85(module, posX, posY, n3)) {
                        final boolean sub_3b2c2 = this.HasUnkImageArr();
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
                        final int[] sub_39a6 = InitTempBuffer(null);
                        GLLib.GetRGB(class_l4, sub_39a6, 0, n72, 0, 0, n72, n71);
                        final int[] sub_5d84 = GLLib.GetRGBData(graphics7, sub_39a6, n74, n73, n72, n71, n70, b5, false, b4);
                        if (!this.sub_3c9a(module, posX, posY, sub_5d84, n3) && sub_5d84 != null) {
                            final boolean var_1ff7 = GLLib.var_1ff7;
                            posX = GLLib.var_200f;
                            posY = GLLib.var_2017;
                            p2x = GLLib.var_201f;
                            final int var_1149 = GLLib.var_2027;
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
    
    static final int[] GetRGBData(final int[] imgData, final int width, int height, int n3, int[] initBuffer) {
        if ((n3 & 0x7) == 0x0) {
            return imgData;
        }
        initBuffer = InitTempBuffer(imgData);
        int n4 = 0;
        int n5 = 0;
        switch (n3 & 0x7) {
            case 1: {
                int n6 = width * height;
                int n7 = width * (height - 1);
                while (--height >= 0) {
                    n3 = width;
                    while (--n3 >= 0) {
                        initBuffer[--n6] = imgData[n7++];
                    }
                    n7 -= width << 1;
                }
                break;
            }
            case 2: {
                int n9 = (height - 1) * width;
                while (--height >= 0) {
                    System.arraycopy(imgData, n5, initBuffer, n9, width);
                    n9 -= width;
                    n5 += width;
                }
                break;
            }
            case 3: {
                for (int i = width * height - 1; i >= 0; initBuffer[n4++] = imgData[i--]) {}
                break;
            }
            case 4: {
                int n11 = width * height;
                while (--height >= 0) {
                    n3 = width;
                    while (--n3 >= 0) {
                        initBuffer[--n11] = imgData[height];
                        height += height;
                    }
                }
                break;
            }
            case 5: {
                int n14 = width * height;
                while (--height >= 0) {
                    int n16 = height - 1 - height;
                    n3 = width;
                    while (--n3 >= 0) {
                        initBuffer[--n14] = imgData[n16];
                        n16 += height;
                    }
                }
                break;
            }
            case 6: {
                int n18;
                int n17 = (n18 = width * height) - 1;
                while (--height >= 0) {
                    int n20 = n17--;
                    n3 = width;
                    while (--n3 >= 0) {
                        initBuffer[--n18] = imgData[n20];
                        n20 -= height;
                    }
                }
                break;
            }
            case 7: {
                int n22;
                int n21 = (n22 = width * height) - height;
                while (--height >= 0) {
                    int n24 = n21++;
                    n3 = width;
                    while (--n3 >= 0) {
                        initBuffer[--n22] = imgData[n24];
                        n24 -= height;
                    }
                }
                break;
            }
        }
        return initBuffer;
    }
    
    static final int[] _InitTempBuffers(final int[] buf) {
        return InitTempBuffer(buf);
    }
    
    public ASprite() {
        this._cur_pool = -1;
        this._bUnderline = false;
        this._bBold = false;
        this.var_11f7 = -1;
    }
    
    static {
        ASprite.s_screenHeight = 800;
        ASprite.s_screenWidth = 480;
        ASprite.midp2_flags = new int[] { 0, 2, 1, 3, 5, 7, 4, 6 };
        ASprite.var_10f7 = new int[] { 1, 0, 3, 2, 6, 7, 4, 5 };
        ASprite.var_10ff = new int[] { 2, 3, 0, 1, 5, 4, 7, 6 };
        ASprite.var_1107 = new int[] { 4, 5, 6, 7, 3, 2, 1, 0 };
        ASprite.s_rc = new int[4];
        ASprite.s_gcEnabled = true;
        ASprite.var_1157 = '|';
        ASprite._index1 = -1;
        ASprite._index2 = -1;
        ASprite.var_1217 = -1;
        ASprite._operation = 0;
    }
}
