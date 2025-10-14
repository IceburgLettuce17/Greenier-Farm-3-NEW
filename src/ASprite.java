import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ASprite
{
    static int[] var_f67;
    private static int[] var_f6f;
    private int var_f77;
    short[] var_f7f;
    short[] var_f87;
    private short[] var_f8f;
    private short[] var_f97;
    private byte[] var_f9f;
    private short[] var_fa7;
    short[] var_faf;
    private byte[] var_fb7;
    private short[] var_fbf;
    private byte[] var_fc7;
    private short[] var_fcf;
    private short[] var_fd7;
    private byte[] var_fdf;
    private short[] var_fe7;
    private byte[] var_fef;
    private short[] var_ff7;
    private short[] var_fff;
    private byte[] _anims_naf;
    private short[] _anims_af_start;
    private byte[] _aframes;
    private byte[] _aframes_time;
    private short[] var_1027;
    private short[] var_102f;
    private byte[] var_1037;
    private byte[] var_103f;
    private byte[] var_1047;
    private short[][] var_104f;
    private int var_1057;
    byte[] var_105f;
    private int[] var_1067;
    private int var_106f;
    private int[][][] var_1077;
    int var_107f;
    private int[] var_1087;
    private int var_108f;
    private boolean var_1097;
    //private boolean var_109f;
    private int var_10a7;
    private short var_10af;
    private int[] var_10b7;
    private int[] var_10bf;
    static int s_screenHeight;
    static int s_screenWidth;
    GLLibImage[][] var_10d7;
    private GLLibImage[][][] var_10df;
    private static boolean var_10e7;
    private static int[] midp2_flags;
    private static int[] var_10f7;
    private static int[] var_10ff;
    private static int[] var_1107;
    private byte[] var_110f;
    private byte[] var_1117;
    private int[] var_111f;
    private static int var_1127;
    private static int var_112f;
    private static int var_1137;
    private static int var_113f;
    static int[] s_rc;
    private static boolean var_114f;
    private static char var_1157;
    private GLLibImage[][] var_115f;
    private int[][] var_1167;
    private int var_116f;
    private static short[][] var_1177;
    private static int[] var_117f;
    private static int[] var_1187;
    private static ASprite[][] var_118f;
    private static int var_1197;
    static int var_119f;
    private static int var_11a7;
    private int var_11af;
    private int var_11b7;
    private int var_11bf;
    private int var_11c7;
    private int var_11cf;
    private boolean var_11d7;
    private boolean var_11df;
    private short[][] var_11e7;
    private short var_11ef;
    private int var_11f7;
    private static short[] _warpTextInfo;
    private static int var_1207;
    private static int var_120f;
    private static int var_1217;
    private static int var_121f;
    
    final void sub_123f() {
        this.var_f7f = null;
        this.var_f87 = null;
        this.var_fe7 = null;
        this.var_fdf = null;
        this.var_fa7 = null;
        this.var_f9f = null;
        this._aframes = null;
        this._anims_naf = null;
        this.var_faf = null;
        this.var_fb7 = null;
        this.var_fbf = null;
        this.var_fc7 = null;
        this.var_fcf = null;
        this.var_fd7 = null;
        this._anims_af_start = null;
        if (this.var_104f != null) {
            for (int i = 0; i < this.var_104f.length; ++i) {
                this.var_104f[i] = null;
            }
            this.var_104f = null;
        }
        if (this.var_1077 != null) {
            for (int j = 0; j < this.var_1077.length; ++j) {
                this.var_1077[j] = null;
            }
            this.var_1077 = null;
        }
        if (this.var_10d7 != null) {
            for (int k = 0; k < this.var_10d7.length; ++k) {
                this.var_10d7[k] = null;
            }
            this.var_10d7 = null;
        }
    }
    
    final void sub_1372(final byte[] file, int n) {
        if (file == null) {
            return;
        }
        try {
            if (ASprite.var_114f) {
                System.gc();
            }
            this.var_106f = (file[2] & 0xFF) + ((file[3] & 0xFF) << 8) + ((file[4] & 0xFF) << 16) + ((file[5] & 0xFF) << 24);
            
            int n2 = 6;
            
            final int n3 = 6;
            ++n2;
            final int n4 = file[n3] & 0xFF;
            final int n5 = 7;
            ++n2;
            this.var_f77 = (short)(n4 + ((file[n5] & 0xFF) << 8));
            if (this.var_f77 > 0) {
                this.var_f7f = new short[this.var_f77];
                this.var_f87 = new short[this.var_f77];
                int n6 = 0;
                int n7 = 0;
                short[][] array2 = null;
                if ((this.var_106f & 0x4) != 0x0) {
                    this.var_1117 = new byte[this.var_f77];
                }
                boolean b = false;
                boolean b2 = false;
                for (int i = 0; i < this.var_f77; ++i) {
                    boolean b3 = false;
                    boolean b4 = false;
                    boolean b5 = false;
                    if ((file[n2] & 0xFF) == 0x0) {
                        ++n2;
                        b = false;
                        b2 = true;
                        if ((this.var_106f & 0x4) != 0x0) {
                            this.var_1117[i] = file[n2++];
                        }
                    }
                    else if ((file[n2] & 0xFF) == 0xFF) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 1;
                        b = true;
                        b2 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xFE) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 2;
                        b = true;
                        b2 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xFD) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 5;
                        b = false;
                        b2 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xFC) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 3;
                        b = true;
                        b2 = true;
                        b3 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xFB) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 4;
                        b = true;
                        b2 = true;
                        b3 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xFA) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 6;
                        b = true;
                        b2 = false;
                        b4 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xF9) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 7;
                        b = true;
                        b2 = false;
                        b4 = true;
                    }
                    else if ((file[n2] & 0xFF) == 0xF8) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 8;
                        b = true;
                        b2 = true;
                        b4 = false;
                    }
                    else if ((file[n2] & 0xFF) == 0xF7) {
                        ++n2;
                        this.sub_2f12(this.var_f77);
                        this.var_110f[i] = 9;
                        b = true;
                        b5 = true;
                        b2 = true;
                        b4 = false;
                    }
                    if (b) {
                        this.var_111f[i] = (file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8) + ((file[n2++] & 0xFF) << 16) + ((file[n2++] & 0xFF) << 24);
                    }
                    if (b5) {
                        if (array2 == null) {
                            array2 = new short[this.var_f77][];
                        }
                        final short[] array3 = new short[3];
                        final int n8 = (file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8) + ((file[n2++] & 0xFF) << 16) + ((file[n2++] & 0xFF) << 24);
                        array3[0] = (short)n8;
                        array3[1] = (short)(n8 >> 16);
                        array3[2] = file[n2++];
                        array2[i] = array3;
                        ++n6;
                        n7 += 3;
                    }
                    if (b2) {
                        if ((this.var_106f & 0x10) == 0x0) {
                            this.var_f7f[i] = (short)(file[n2++] & 0xFF);
                            this.var_f87[i] = (short)(file[n2++] & 0xFF);
                        }
                        else {
                            this.var_f7f[i] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                            this.var_f87[i] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        }
                    }
                    if (b3) {
                        if (array2 == null) {
                            array2 = new short[this.var_f77][];
                        }
                        final short[] array4;
                        (array4 = new short[2])[0] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array4[1] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array2[i] = array4;
                        ++n6;
                        n7 += 2;
                    }
                    if (b4) {
                        if (array2 == null) {
                            array2 = new short[this.var_f77][];
                        }
                        final short[] array5;
                        (array5 = new short[4])[0] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array5[1] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array5[2] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array5[3] = (short)((file[n2++] & 0xFF) + ((file[n2++] & 0xFF) << 8));
                        array2[i] = array5;
                        ++n6;
                        n7 += 4;
                    }
                }
                if (n6 > 0) {
                    this.var_f8f = new short[n7];
                    this.var_f97 = new short[n6 << 1];
                    int n9 = 0;
                    short n10 = 0;
                    for (short n11 = 0; n11 < this.var_f77; ++n11) {
                        int n12;
                        if (this.var_110f[n11] == 3 || this.var_110f[n11] == 4) {
                            n12 = 2;
                        }
                        else if (this.var_110f[n11] == 6 || this.var_110f[n11] == 7) {
                            n12 = 4;
                        }
                        else if (this.var_110f[n11] == 9) {
                            n12 = 3;
                        }
                        else {
                            n12 = -1;
                        }
                        if (n12 > 0) {
                            this.var_f97[n9 << 1] = n11;
                            this.var_f97[(n9 << 1) + 1] = n10;
                            for (int j = 0; j < n12; ++j) {
                                this.var_f8f[n10] = array2[n11][j];
                                ++n10;
                            }
                            array2[n11] = null;
                            ++n9;
                        }
                    }
                }
            }
            n = n2;
            
            int n13 = n;
            final ASprite this4 = this;
            final short n14;
            if ((n14 = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8))) > 0) {
                if ((this4.var_106f & 0x100000) != 0x0) {
                    this4.var_fe7 = new short[n14];
                }
                else {
                    this4.var_fdf = new byte[n14];
                }
                this4.var_ff7 = new short[n14];
                this4.var_fff = new short[n14];
                this4.var_fef = new byte[n14];
                for (short n15 = 0; n15 < n14; ++n15) {
                    if ((this4.var_106f & 0x100000) != 0x0) {
                        this4.var_fe7[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                    }
                    else {
                        this4.var_fdf[n15] = file[n13++];
                    }
                    if ((this4.var_106f & 0x400) != 0x0) {
                        this4.var_ff7[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                        this4.var_fff[n15] = (short)((file[n13++] & 0xFF) + ((file[n13++] & 0xFF) << 8));
                    }
                    else {
                        this4.var_ff7[n15] = file[n13++];
                        this4.var_fff[n15] = file[n13++];
                    }
                    this4.var_fef[n15] = file[n13++];
                }
            }
            n = n13;
            final ASprite this5 = this;
            int n16 = n;
            final ASprite this6 = this5;
            if ((this5.var_106f & 0x8000) != 0x0) {
                final short n17 = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                if ((this6.var_106f & 0x400) == 0x0) {
                    System.arraycopy(file, n16, this6.var_fc7 = new byte[n17 << 2], 0, n17 << 2);
                    n16 += n17 << 2;
                }
                else {
                    this6.var_fcf = new short[n17 << 2];
                    final int n18 = n16;
                    final short[] var_fcf = this6.var_fcf;
                    final int n19 = n17 << 2;
                    final short[] array6 = var_fcf;
                    int n20 = n18;
                    for (int k = 0; k < n19; ++k) {
                        array6[k] = (short)((file[n20++] & 0xFF) + ((file[n20++] & 0xFF) << 8));
                    }
                    n16 = n20;
                }
            }
            final short n21;
            if ((n21 = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8))) > 0) {
                if ((this6.var_106f & 0x800) != 0x0) {
                    this6.var_fa7 = new short[n21];
                }
                else {
                    this6.var_f9f = new byte[n21];
                }
                this6.var_faf = new short[n21];
                if ((this6.var_106f & 0x8000) != 0x0) {
                    this6.var_fd7 = new short[n21 + 1];
                }
                short n22 = 0;
                for (short n23 = 0; n23 < n21; ++n23) {
                    if ((this6.var_106f & 0x800) != 0x0) {
                        this6.var_fa7[n23] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                    }
                    else {
                        this6.var_f9f[n23] = file[n16++];
                    }
                    this6.var_faf[n23] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                    if ((this6.var_106f & 0x8000) != 0x0 && (this6.var_106f & 0x8000) != 0x0) {
                        this6.var_fd7[n23] = n22;
                        n22 += file[n16++];
                    }
                }
                if ((this6.var_106f & 0x8000) != 0x0) {
                    this6.var_fd7[this6.var_fd7.length - 1] = n22;
                }
                if ((this6.var_106f & 0x1000) == 0x0) {
                    final int n24 = n21 << 2;
                    if ((this6.var_106f & 0x400) == 0x0) {
                        this6.var_fb7 = new byte[n24];
                        for (int l = 0; l < n24; ++l) {
                            this6.var_fb7[l] = file[n16++];
                        }
                    }
                    else {
                        this6.var_fbf = new short[n24];
                        for (int n25 = 0; n25 < n24; ++n25) {
                            this6.var_fbf[n25] = (short)((file[n16++] & 0xFF) + ((file[n16++] & 0xFF) << 8));
                        }
                    }
                }
            }
            n = n16;
            int n26 = n;
            final short n27;
            if ((n27 = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8))) > 0) {
                this._aframes = new byte[n27];
                this._aframes_time = new byte[n27];
                if ((this.var_106f & 0x40000) != 0x0) {
                    this.var_1027 = new short[n27];
                    this.var_102f = new short[n27];
                }
                else {
                    this.var_1037 = new byte[n27];
                    this.var_103f = new byte[n27];
                }
                this.var_1047 = new byte[n27];
                for (short n28 = 0; n28 < n27; ++n28) {
                    this._aframes[n28] = file[n26++];
                    this._aframes_time[n28] = file[n26++];
                    if ((this.var_106f & 0x40000) != 0x0) {
                        this.var_1027[n28] = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8));
                        this.var_102f[n28] = (short)((file[n26++] & 0xFF) + ((file[n26++] & 0xFF) << 8));
                    }
                    else {
                        this.var_1037[n28] = file[n26++];
                        this.var_103f[n28] = file[n26++];
                    }
                    this.var_1047[n28] = file[n26++];
                }
            }
            n = n26;
            
            int offset = n;
            final short nAnims = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
            if (nAnims > 0) {
                this._anims_naf = new byte[nAnims];
                this._anims_af_start = new short[nAnims];
                for (short i = 0; i < nAnims; ++i) {
                    this._anims_naf[i] = file[offset++];
                    this._anims_af_start[i] = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
                }
            }
            n = offset;
            if (this.var_f77 <= 0) {
                if (ASprite.var_114f) {
                    System.gc();
                }
                return;
            }
            if ((this.var_106f & 0x1000000) != 0x0) {
                final ASprite this11 = this;
                int n32 = n;
                final ASprite this12 = this11;
                if ((this11.var_106f & 0x1000000) != 0x0 && n32 < file.length) {
                    final short n33 = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                    int n34 = 1;
                    if ((this12.var_106f & 0x40000000) != 0x0) {
                        n34 = file[n32++];
                    }
                    if (this12.var_1087 == null) {
                        this12.var_1087 = new int[n34];
                    }
                    for (int n35 = 0; n35 < n34; ++n35) {
                        this12.var_107f = (file[n32++] & 0xFF);
                        int n36;
                        if ((n36 = (file[n32++] & 0xFF)) == 0) {
                            n36 = 256;
                        }
                        this12.var_1087[n35] = n36;
                        final ASprite this13 = this12;
                        final int n37 = n34;
                        final ASprite this14 = this13;
                        if (this13.var_1077 == null) {
                            this14.var_1077 = new int[n37][16][];
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
                        for (int n45 = 0; n45 < this16.var_107f; ++n45) {
                            this16.var_1077[n41][n45] = new int[n42];
                            final int[] array7 = this16.var_1077[n41][n45];
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
                    this12.var_10af = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                    if (this12.var_10af == 25840 || this12.var_10af == -22976) {
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
                    if (this12.var_f77 > 0) {
                        this12.var_1067 = new int[this12.var_f77];
                        int n61 = 0;
                        final int n62 = n32;
                        for (int n63 = 0; n63 < this12.var_f77; ++n63) {
                            int n64;
                            if ((this12.var_106f & 0x80) != 0x0) {
                                n64 = (file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8) + ((file[n32++] & 0xFF) << 16) + ((file[n32++] & 0xFF) << 24);
                            }
                            else {
                                n64 = (short)((file[n32++] & 0xFF) + ((file[n32++] & 0xFF) << 8));
                            }
                            this12.var_1067[n63] = n61;
                            n61 += n64;
                            n32 += n64;
                        }
                        int n65 = n62;
                        this12.var_105f = new byte[n61];
                        for (int n66 = 0; n66 < this12.var_f77; ++n66) {
                            int n67;
                            if ((this12.var_106f & 0x80) != 0x0) {
                                n67 = (file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8) + ((file[n65++] & 0xFF) << 16) + ((file[n65++] & 0xFF) << 24);
                            }
                            else {
                                n67 = (short)((file[n65++] & 0xFF) + ((file[n65++] & 0xFF) << 8));
                            }
                            System.arraycopy(file, n65, this12.var_105f, this12.sub_3801(n66), n67);
                            n65 += n67;
                        }
                    }
                }
            }
            this.var_1057 = -1;
            this.var_104f = new short[16][];
            if ((this.var_106f & 0x1000) != 0x0) {
                final int sub_3717;
                if ((sub_3717 = this.sub_3717()) > 0) {
                    n = 0;
                    if ((this.var_106f & 0x400) == 0x0 && (this.var_10a7 & 0x4) == 0x0) {
                        this.var_fb7 = new byte[sub_3717 << 2];
                        for (int n68 = 0; n68 < sub_3717; ++n68) {
                            this.sub_33cb(ASprite.s_rc, n68);
                            this.var_fb7[n++] = (byte)ASprite.s_rc[0];
                            this.var_fb7[n++] = (byte)ASprite.s_rc[1];
                            this.var_fb7[n++] = (byte)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this.var_fb7[n++] = (byte)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                    else {
                        this.var_fbf = new short[sub_3717 << 2];
                        for (int n69 = 0; n69 < sub_3717; ++n69) {
                            this.sub_33cb(ASprite.s_rc, n69);
                            this.var_fbf[n++] = (short)ASprite.s_rc[0];
                            this.var_fbf[n++] = (short)ASprite.s_rc[1];
                            this.var_fbf[n++] = (short)(ASprite.s_rc[2] - ASprite.s_rc[0]);
                            this.var_fbf[n++] = (short)(ASprite.s_rc[3] - ASprite.s_rc[1]);
                        }
                    }
                }
            }
            else if ((this.var_10a7 & 0x4) != 0x0) {
                final ASprite this17 = this;
                this17.var_10a7 &= 0xFFFFFFFB;
            }
            if (ASprite.var_114f) {
                System.gc();
            }
        }
        catch (final Exception ex) {}
    }
    
    private void sub_2f12(final int n) {
        if (this.var_110f == null) {
            this.var_110f = new byte[n];
            for (int i = 0; i < n; ++i) {
                this.var_110f[i] = 0;
            }
        }
        if (this.var_111f == null) {
            this.var_111f = new int[n];
        }
    }
    
    final void sub_2f84() {
        this.var_1077 = null;
        this.var_105f = null;
        this.var_1067 = null;
        if (ASprite.var_114f) {
            System.gc();
        }
    }
    
    final int GetAFrameTime(final int anim, final int aframe) {
        return this._aframes_time[this._anims_af_start[anim] + aframe] & 0xFF;
    }
    
    final int GetAFrames(final int anim) {
        return this._anims_naf[anim] & 0xFF;
    }
    
    private int sub_3019(final int n) {
        if ((this.var_106f & 0x800) != 0x0) {
            return this.var_fa7[n];
        }
        return this.var_f9f[n] & 0xFF;
    }
    
    private int sub_3062(final int n) {
        if ((this.var_106f & 0x40000) != 0x0) {
            return this.var_1027[n];
        }
        return this.var_1037[n];
    }
    
    private int sub_30a6(final int n) {
        if ((this.var_106f & 0x40000) != 0x0) {
            return this.var_102f[n];
        }
        return this.var_103f[n];
    }
    
    final int sub_30ea(final int n) {
        return this.var_ff7[n];
    }
    
    final int sub_310b(final int n) {
        return this.var_fff[n];
    }
    
    final int sub_312c(final int n) {
        if ((this.var_106f & 0x400) == 0x0 && (this.var_10a7 & 0x4) == 0x0) {
            return this.var_fb7[(n << 2) + 2] & 0xFF;
        }
        return this.var_fbf[(n << 2) + 2] & 0xFFFF;
    }
    
    final int sub_3189(final int n) {
        if ((this.var_106f & 0x400) == 0x0 && (this.var_10a7 & 0x4) == 0x0) {
            return this.var_fb7[(n << 2) + 3] & 0xFF;
        }
        return this.var_fbf[(n << 2) + 3] & 0xFFFF;
    }
    
    final int sub_31e6(final int n) {
        if ((this.var_106f & 0x400) == 0x0 && (this.var_10a7 & 0x4) == 0x0) {
            return this.var_fb7[n << 2];
        }
        return this.var_fbf[n << 2];
    }
    
    final int sub_3238(final int n) {
        if ((this.var_106f & 0x400) == 0x0 && (this.var_10a7 & 0x4) == 0x0) {
            return this.var_fb7[(n << 2) + 1];
        }
        return this.var_fbf[(n << 2) + 1];
    }
    
    private int sub_328e(final int n) {
        int n2;
        if ((this.var_106f & 0x100000) != 0x0) {
            n2 = this.var_fe7[n];
        }
        else {
            n2 = (this.var_fdf[n] & 0xFF);
        }
        return n2;
    }
    
    final int sub_32e3(int sub_3356, final int n) {
        sub_3356 = this.sub_3356(sub_3356, n);
        return this.sub_328e(sub_3356);
    }
    
    private int sub_330a(final int n) {
        return this.var_fef[n] & 0xFF;
    }
    
    final int sub_332f(int sub_3356, final int n) {
        sub_3356 = this.sub_3356(sub_3356, n);
        return this.sub_330a(sub_3356);
    }
    
    private int sub_3356(final int n, final int n2) {
        return this.var_faf[n] + n2;
    }
    
    private int sub_3379(int n) {
        n = this.var_faf[n];
        return this.var_ff7[n];
    }
    
    final int sub_33a1(int n, final int n2) {
        n = this.var_faf[n] + n2;
        return this.var_fff[n];
    }
    
    private void sub_33cb(final int[] array, final int n) {
        this.sub_33f1(array, n, 0, 0, 0, false, true);
    }
    
    private void sub_33f1(final int[] array, int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        if (!b2) {
            int sub_31e6 = this.sub_31e6(n);
            int sub_3238 = this.sub_3238(n);
            int sub_312c = this.sub_312c(n);
            int sub_3239 = this.sub_3189(n);
            if ((n4 & 0x1) != 0x0) {
                sub_31e6 = -sub_31e6 - sub_312c;
            }
            if ((n4 & 0x2) != 0x0) {
                sub_3238 = -sub_3238 - sub_3239;
            }
            if ((n4 & 0x4) != 0x0) {
                n = sub_31e6;
                sub_31e6 = -sub_3238 - sub_3239;
                sub_3238 = n;
                n = sub_312c;
                sub_312c = sub_3239;
                sub_3239 = n;
            }
            ASprite.var_1127 = n2 + sub_31e6;
            ASprite.var_112f = n3 + sub_3238;
            ASprite.var_1137 = ASprite.var_1127 + sub_312c;
            ASprite.var_113f = ASprite.var_112f + sub_3239;
        }
        else {
            ASprite.var_1127 = Integer.MAX_VALUE;
            ASprite.var_112f = Integer.MAX_VALUE;
            ASprite.var_1137 = Integer.MIN_VALUE;
            ASprite.var_113f = Integer.MIN_VALUE;
            ASprite.var_121f = 1;
            this.sub_71ae(null, n, n2, n3, n4);
            ASprite.var_121f = 0;
        }
        array[0] = ASprite.var_1127;
        array[1] = ASprite.var_112f;
        array[2] = ASprite.var_1137;
        array[3] = ASprite.var_113f;
    }
    
    final void sub_3524(final int[] array, final int n, final int n2, final int n3) {
        this.sub_33f1(array, n, n2, n3, 0, false, false);
    }
    
    final void sub_354b(final int[] array, int sub_30a6, int n, final int n2, final int n3, final int n4) {
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
        int sub_3062 = this.sub_3062(this._anims_af_start[sub_30a6] + n);
        sub_30a6 = this.sub_30a6(this._anims_af_start[sub_30a6] + n);
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
        this.sub_33f1(array, n7, n2 + sub_3062, n3 + sub_30a6, n6, false, false);
    }
    
    final int sub_36dd() {
        if (this._anims_naf == null) {
            return 0;
        }
        return this._anims_naf.length;
    }
    
    final int sub_3717() {
        if ((this.var_106f & 0x800) != 0x0) {
            if (this.var_fa7 == null) {
                return 0;
            }
            return this.var_fa7.length;
        }
        else {
            if (this.var_f9f == null) {
                return 0;
            }
            return this.var_f9f.length;
        }
    }
    
    final int sub_377d(final int n) {
        int sub_3019;
        for (int n2 = sub_3019 = this.sub_3019(n), i = 0; i < n2; ++i) {
            final int sub_32e3 = this.sub_32e3(n, i);
            if ((this.sub_332f(n, i) & 0x10) != 0x0) {
                sub_3019 = sub_3019 - 1 + this.sub_377d(sub_32e3);
            }
        }
        return sub_3019;
    }
    
    private int sub_3801(final int n) {
        if (this.var_1067 != null) {
            return this.var_1067[n];
        }
        return -1;
    }
    
    final int sub_383d(final int n) {
        if (this.var_fd7 != null) {
            return this.var_fd7[n + 1] - this.var_fd7[n];
        }
        return 0;
    }
    
    final void sub_3882(int n, final int n2, final int[] array, int n3) {
        if (this.var_fd7 != null && array != null) {
            n3 = this.var_fd7[n];
            if ((n = this.var_fd7[n + 1] - n3) > 0 && n2 < n) {
                n3 = n3 + n2 << 2;
                if ((this.var_106f & 0x400) != 0x0) {
                    if (this.var_fcf != null) {
                        array[0] = this.var_fcf[n3];
                        array[1] = this.var_fcf[n3 + 1];
                        array[2] = (this.var_fcf[n3 + 2] & 0xFFFF);
                        array[3] = (this.var_fcf[n3 + 3] & 0xFFFF);
                    }
                }
                else if (this.var_fc7 != null) {
                    array[0] = this.var_fc7[n3];
                    array[1] = this.var_fc7[n3 + 1];
                    array[2] = (this.var_fc7[n3 + 2] & 0xFF);
                    array[3] = (this.var_fc7[n3 + 3] & 0xFF);
                }
                return;
            }
            array[1] = (array[0] = 0);
            array[3] = (array[2] = 0);
        }
    }
    
    static int[] sub_39a6(final int[] array) {
        if (array == null || array != ASprite.var_f67) {
            if (ASprite.var_f67 == null) {
                ASprite.var_f67 = new int[27832];
            }
            return ASprite.var_f67;
        }
        if (array == null || array != ASprite.var_f6f) {
            if (ASprite.var_f6f == null) {
                ASprite.var_f6f = new int[27832];
            }
            return ASprite.var_f6f;
        }
        return null;
    }
    
    final boolean sub_3a3a(final int n) {
        return n >= 0 && this.var_10d7 != null && n < this.var_10d7.length && this.var_10d7[n] != null;
    }
    
    final void sub_3aab(final int n, final int n2) {
        this.var_ff7[n] = (short)n2;
    }
    
    final void sub_3ace(final int n, final int n2) {
        this.var_fff[n] = (short)n2;
    }
    
    public final void sub_3af1() {
        this.var_115f = new GLLibImage[this.var_107f][this.var_f77];
        this.var_1167 = new int[this.var_107f][this.var_f77];
    }
    
    public final boolean sub_3b2c() {
        return this.var_115f != null;
    }
    
    private static int sub_3b62(final int[] array, final int n) {
        return GLLib.sub_45c0(array, 0, array.length, n);
    }
    
    private boolean sub_3b85(int n, final int n2, final int n3, int n4) {
        if (this.sub_3b2c()) {
            final int sub_5a53;
            final int[] sub_5a52 = GLLib.sub_5a52(sub_5a53 = GLLib.sub_5a72());
            final int n5 = sub_5a53;
            final int[] array = sub_5a52;
            if (this.var_115f != null && this.var_115f[this.var_108f][n] != null && sub_3b62(array, n5) == this.var_1167[this.var_108f][n]) {
                final GLLibImage class_l2;
                final GLLibImage class_l = class_l2 = this.var_115f[this.var_108f][n];
                final int width = class_l.image.getWidth();
                final int height = class_l2.image.getHeight();
                final int n6 = ASprite.midp2_flags[n4];
                n4 = height;
                n = width;
                GLLib.DrawRegion(GLLib.g, class_l, 0, 0, n, n4, n6, n2, n3, 20, false);
                return true;
            }
        }
        return false;
    }
    
    private boolean sub_3c9a(int n, final int n2, final int n3, final int[] array, int n4) {
        if (this.sub_3b2c() && array != null) {
            final int sub_5a53;
            final int[] sub_5a52 = GLLib.sub_5a52(sub_5a53 = GLLib.sub_5a72());
            final GLLibImage sub_1d9 = GLLibImage.createRGBImage(array, GLLib.var_201f, GLLib.var_2027, true);
            
            final int n5 = n;
            final GLLibImage class_l = sub_1d9;
            final int n6 = sub_5a53;
            final int[] array2 = sub_5a52;
            final int n7 = n6;
            final GLLibImage class_l2 = class_l;
            n = n5;
            this.var_115f[this.var_108f][n] = class_l2;
            this.var_1167[this.var_108f][n] = sub_3b62(array2, n7);
            final GLLibImage class_l3 = sub_1d9;
            final int width = sub_1d9.image.getWidth();
            final int height = sub_1d9.image.getHeight();
            n4 = ASprite.midp2_flags[n4];
            final int n8 = height;
            n = width;
            GLLib.DrawRegion(GLLib.g, class_l3, 0, 0, n, n8, n4, n2, n3, 20, false);
            return true;
        }
        return false;
    }
    
    static void sub_3d55(final int n) {
        ASprite.var_1177 = new short[n][];
        ASprite.var_118f = new ASprite[n][];
        ASprite.var_117f = new int[n];
        ASprite.var_1187 = new int[n];
    }
    
    static void sub_3d8a(final int n, int i) {
        ASprite.var_1187[n] = i;
        ASprite.var_1177[n] = new short[i];
        ASprite.var_118f[n] = new ASprite[i];
        for (i = 0; i < ASprite.var_1177[n].length; ++i) {
            ASprite.var_1177[n][i] = -1;
        }
    }
    
    final void sub_3dee(int i) {
        this.var_116f = i;
        if (this.var_10d7 == null) {
            this.var_10d7 = new GLLibImage[this.var_107f][];
            for (i = 0; i < this.var_107f; ++i) {
                this.var_10d7[i] = new GLLibImage[this.var_f77];
            }
        }
    }
    
    final void sub_3e59() {
        if (this.var_116f >= 0) {
            for (int i = 0; i < ASprite.var_1187[this.var_116f]; ++i) {
                if (ASprite.var_118f[this.var_116f][i] == this) {
                    final short n2;
                    final int n = (n2 = ASprite.var_1177[this.var_116f][i]) >> 10;
                    final int n3 = n2 & 0x3FF;
                    ASprite.var_118f[this.var_116f][i] = null;
                    this.var_10d7[n][n3] = null;
                }
            }
        }
    }
    
    private final void sub_3eec(int n, final Object o) {
        if (this.var_116f >= 0 && this.var_10d7[this.var_108f][n] == null) {
            final int n2 = ASprite.var_117f[this.var_116f];
            final short n4;
            final int n3 = (n4 = ASprite.var_1177[this.var_116f][n2]) >> 10;
            final int n5 = n4 & 0x3FF;

            if (n4 >= 0 && var_118f[this.var_116f][n2] != null) {
                this.var_10d7[n3][n5] = null;
            }
            ASprite.var_1177[this.var_116f][n2] = (short)((n & 0x3FF) + (this.var_108f << 10));
            ASprite.var_118f[this.var_116f][n2] = this;
            ASprite.var_117f[this.var_116f] = (ASprite.var_117f[this.var_116f] + 1) % ASprite.var_1187[this.var_116f];
            this.var_10d7[this.var_108f][n] = (GLLibImage)o;
        }
    }
    
    final Object sub_3fdb(final int n) {
        return this.sub_3ffb(n);
    }
    
    private int[] sub_3ffb(int n) {
        if (this.var_1067 != null && this.var_105f != null) {
            final int n2 = n;
            final byte b = (byte)((this.var_1117 == null) ? 0 : this.var_1117[n2]);
            final byte[] var_105f = this.var_105f;
            final int sub_3801 = this.sub_3801(n);
            final int n3 = this.var_f7f[n] & 0xFFFF;
            final int n4 = this.var_f87[n] & 0xFFFF;
            final int n5 = n3;
            n = sub_3801;
            final byte[] array = var_105f;
            final byte b2 = b;
            int i = 0;
            int n6 = n5 * n4;
            if (ASprite.var_f67 == null) {
                ASprite.var_f67 = new int[27832];
            }
            final byte b3 = b2;
            final int var_108f = this.var_108f;
            final byte b4 = b3;
            final int[] array2;
            boolean b5;
            if ((array2 = (int[])((var_108f >= 0 && var_108f < this.var_107f && this.var_1077 != null && var_108f < this.var_1077[b4].length) ? this.var_1077[b4][var_108f] : null)) == null) {
                b5 = false;
            }
            else {
                if (this.var_10af == 25840) {
                    while (i < n6) {
                        final int n7 = array[n++] & 0xFF;
                        final int n8 = array2[n7 & this.var_10b7[b2]];
                        int n9 = n7 >> this.var_10bf[b2];
                        while (n9-- >= 0) {
                            ASprite.var_f67[i++] = n8;
                        }
                    }
                }
                else if (this.var_10af == 10225) {
                    while (i < n6) {
                        int n10;
                        if ((n10 = (array[n++] & 0xFF)) > 127) {
                            final int n11 = array2[array[n++] & 0xFF];
                            n10 -= 128;
                            while (n10-- > 0) {
                                ASprite.var_f67[i++] = n11;
                            }
                        }
                        else {
                            ASprite.var_f67[i++] = array2[n10];
                        }
                    }
                }
                else if (this.var_10af == 22258) {
                    --n;
                    --i;
                    --n6;
                    while (i < n6) {
                        int n12;
                        if ((n12 = array[++n]) < 0) {
                            n12 += 128;
                            do {
                                ASprite.var_f67[++i] = array2[array[++n] & 0xFF];
                            } while (--n12 > 0);
                        }
                        else {
                            final int n13 = array2[array[++n] & 0xFF];
                            do {
                                ASprite.var_f67[++i] = n13;
                            } while (--n12 > 0);
                        }
                    }
                }
                else if (this.var_10af == 5632) {
                    int n14 = n6 + (((n6 & 0x1) == 0x0) ? 0 : 2) >> 1;
                    while (--n14 >= 0) {
                        final byte b6 = array[n++];
                        ASprite.var_f67[i++] = array2[b6 >> 4 & 0xF];
                        ASprite.var_f67[i++] = array2[b6 & 0xF];
                    }
                }
                else if (this.var_10af == 1024) {
                    int n15 = n6 + (((n6 & 0x3) == 0x0) ? 0 : 4) >> 2;
                    while (--n15 >= 0) {
                        final byte b7 = array[n++];
                        ASprite.var_f67[i++] = array2[b7 >> 6 & 0x3];
                        ASprite.var_f67[i++] = array2[b7 >> 4 & 0x3];
                        ASprite.var_f67[i++] = array2[b7 >> 2 & 0x3];
                        ASprite.var_f67[i++] = array2[b7 & 0x3];
                    }
                }
                else if (this.var_10af == 512) {
                    int n16 = n6 + (((n6 & 0x7) == 0x0) ? 0 : 8) >> 3;
                    while (--n16 >= 0) {
                        final byte b8 = array[n++];
                        ASprite.var_f67[i++] = array2[b8 >> 7 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 6 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 5 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 4 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 3 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 2 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 >> 1 & 0x1];
                        ASprite.var_f67[i++] = array2[b8 & 0x1];
                    }
                }
                else if (this.var_10af == 22018) {
                    while (--n6 >= 0) {
                        ASprite.var_f67[i++] = array2[array[n++] & 0xFF];
                    }
                }
                b5 = true;
            }
            if (b5) {
                return ASprite.var_f67;
            }
        }
        return null;
    }
    
    final void sub_46d6(final short[] array) {
        this.var_11ef = array[0];
        this.var_11e7 = new short[this.var_11ef][];
        int n = 1;
        for (short n2 = 0; n2 < this.var_11ef; ++n2) {
            (this.var_11e7[n2] = new short[2])[0] = array[n++];
            this.var_11e7[n2][1] = array[n++];
        }
        int i = n;
        while (i < array.length) {
            final short n3 = array[i++];
            final int n4;
            final short[] array2;
            (array2 = new short[((n4 = array[i++]) << 1) + 2])[0] = this.var_11e7[n3][0];
            array2[1] = this.var_11e7[n3][1];
            for (int j = 0; j < n4; ++j) {
                array2[(j << 1) + 2] = array[i++];
                array2[(j << 1) + 3] = array[i++];
            }
            this.var_11e7[n3] = array2;
        }
        this.var_11cf = this.sub_33a1(0, 0);
        this.var_11af = this.var_11cf + this.sub_33a1(0, 1);
        
        this.var_11b7 = this.sub_33a1(0, 2) - this.sub_33a1(0, 1);
        this.var_11c7 = this.sub_3379(this.sub_4851(32));
    }
    
    private int sub_4851(final int n) {
        if (this.var_11e7 == null) {
            return 0;
        }
        final int n2 = n % this.var_11ef;
        if (this.var_11e7[n2][0] == n) {
            return this.var_11e7[n2][1];
        }
        int n3;
        int length;
        for (n3 = 2, length = this.var_11e7[n2].length; n3 < length && this.var_11e7[n2][n3] != n; n3 += 2) {}
        if (n3 >= length) {
            return 1;
        }
        return this.var_11e7[n2][n3 + 1];
    }
    
    final int sub_490a() {
        if (this.var_11f7 >= 0) {
            return this.var_11b7 * this.var_11f7 >> 8;
        }
        return this.var_11b7;
    }
    
    final int sub_494e() {
        if (this.var_11f7 >= 0) {
            return this.var_11af * this.var_11f7 >> 8;
        }
        return this.var_11af;
    }
    
    private int GetSpaceWidth() {
        if (this.var_11f7 >= 0) {
            return this.var_11c7 * this.var_11f7 >> 8;
        }
        return this.var_11c7;
    }
    
    private int sub_49d6() {
        if (this.var_11f7 >= 0) {
            return this.var_11bf * this.var_11f7 >> 8;
        }
        return this.var_11bf;
    }
    
    final void sub_4a1a(final int var_11bf) {
        this.var_11bf = var_11bf;
    }
    
    final int sub_4a3a() {
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
        int var_11df = this.var_11df ? 1 : 0;
        int var_11d7 = this.var_11d7 ? 1 : 0;
        int var_108f = this.var_108f;
        int n4 = 0;
        short n5 = 0;
        int var_11df2 = this.var_11df ? 1 : 0;
        int var_11d8 = this.var_11d7 ? 1 : 0;
        int var_108f2;
        int n6 = ((var_108f2 = this.var_108f) & 0xFFF) | ((var_11df2 != 0) ? 4096 : 0) | ((var_11d8 != 0) ? 8192 : 0);
        for (int i = 0; i < str_len; ++i) {
            final char c = s.charAt(i);
            final int sub_63ed = this.sub_63ed(this.sub_4851(c));
            if (c == ' ' || c == ASprite.var_1157) {
                if (c == ' ') {
                    lineSize += (short)this.GetSpaceWidth();
                }
                lastSpacePos = (short)i;
                var_11df = var_11df2;
                n4 = 1;
                n5 = 0;
                var_11d7 = var_11d8;
                var_108f = var_108f2;
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
                    var_108f2 = var_108f;
                    n6 = ((var_108f & 0xFFF) | ((var_11df != 0) ? 4096 : 0) | ((var_11d7 != 0) ? 8192 : 0));
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
                    if (n12 < this.var_107f) {
                        var_108f2 = n12;
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
                n6 = ((var_108f2 & 0xFFF) | ((var_11df2 != 0) ? 4096 : 0) | ((var_11d8 != 0) ? 8192 : 0));
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
                int n18 = sub_63ed + this.sub_49d6();
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
                        var_108f = var_108f2;
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
                    var_108f2 = var_108f;
                    n6 = ((var_108f & 0xFFF) | ((var_11df != 0) ? 4096 : 0) | ((var_11d7 != 0) ? 8192 : 0));
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
    
    final void sub_547f(final Graphics graphics, final String s, final short[] array, final int n, int n2, int n3, int n4, final int n5, int sub_4a3a, final boolean b) {
        n3 = array[0];
        sub_4a3a = this.sub_4a3a();
        if (n4 == -1) {
            n4 = n3;
        }
        if (n4 > n3) {
            n4 = n3;
        }
        sub_4a3a += this.sub_490a();
        if ((n5 & 0x20) != 0x0) {
            n2 -= sub_4a3a * (n4 - 1);
        }
        else if ((n5 & 0x2) != 0x0) {
            n2 -= sub_4a3a * (n4 - 1) >> 1;
        }
        ASprite.var_1197 = this.var_108f;
        final boolean var_11df = this.var_11df;
        final boolean var_11d7 = this.var_11d7;
        final int sub_3600;
        final int n6 = (sub_3600 = GLLib.sub_3600(graphics, true)) + GLLib.sub_367d(graphics, true);
        final int n7 = sub_3600 - sub_4a3a;
        final int n8 = n6 + sub_4a3a;
        for (int n9 = 0, n10 = 0; n10 < n3 && n9 <= n4 - 1; ++n10, ++n9) {
            ASprite.var_1207 = ((n10 > 0) ? sub_4a7e(array, n10 - 1) : 0);
            ASprite.var_120f = sub_4a7e(array, n10);
            if (ASprite.var_1207 < s.length() && s.charAt(ASprite.var_1207) == '\n') {
                ++ASprite.var_1207;
            }
            int n11 = n;
            int n12;
            if ((n12 = n2 + n9 * sub_4a3a) >= n7) {
                if (n12 > n8) {
                    break;
                }
                if ((n5 & 0x2B) != 0x0) {
                    if (this.var_11f7 >= 0) {
                        if ((n5 & 0x8) != 0x0) {
                            n11 = n - (sub_4aa2(array, n10) * this.var_11f7 >> 8);
                        }
                        else if ((n5 & 0x1) != 0x0) {
                            n11 = n - (sub_4aa2(array, n10) * this.var_11f7 >> 9);
                        }
                    }
                    else if ((n5 & 0x8) != 0x0) {
                        n11 = n - sub_4aa2(array, n10);
                    }
                    else if ((n5 & 0x1) != 0x0) {
                        n11 = n - (sub_4aa2(array, n10) >> 1);
                    }
                    if ((n5 & 0x20) != 0x0) {
                        n12 -= this.sub_4a3a();
                    }
                    else if ((n5 & 0x2) != 0x0) {
                        n12 -= this.sub_4a3a() >> 1;
                    }
                }
                final short n13 = array[n10 * 3 + 3];
                this.var_11df = ((n13 & 0x1000) != 0x0);
                this.var_11d7 = ((n13 & 0x2000) != 0x0);
                this.sub_6434(n13 & 0xFFF);
                this.sub_5cf9(graphics, s, n11, n12, 0, false);
            }
        }
        ASprite.var_1207 = -1;
        ASprite.var_120f = -1;
        ASprite.var_1217 = -1;
        this.var_108f = ASprite.var_1197;
        this.var_11df = var_11df;
        this.var_11d7 = var_11d7;
    }
    
    final void sub_5917(final String s, final char[] array) {
        if (s == null) {
            return;
        }
        ASprite.var_119f = 0;
        ASprite.var_11a7 = this.sub_4a3a();
        int n = 0;
        final boolean b = s != null;
        int i = (ASprite.var_1207 >= 0) ? ASprite.var_1207 : 0;
        int n2;
        if (b) {
            n2 = ((ASprite.var_120f >= 0) ? ASprite.var_120f : s.length());
        }
        else {
            n2 = ((ASprite.var_120f >= 0) ? ASprite.var_120f : 0);
        }
        boolean var_11df = this.var_11df;
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
                        sub_4851 = this.sub_4851(c);
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
                            if (n > ASprite.var_119f) {
                                ASprite.var_119f = n;
                            }
                            n = 0;
                            ASprite.var_11a7 += this.sub_490a() + this.sub_4a3a();
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
                    n += this.sub_63ed(sub_4851) + this.sub_49d6();
                    if (var_11df) {
                        ++n;
                    }
                }
            }
            ++i;
        }
        if (n > ASprite.var_119f) {
            ASprite.var_119f = n;
        }
        if (ASprite.var_119f > 0) {
            ASprite.var_119f -= this.sub_49d6();
        }
    }
    
    final void sub_5cd2(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        this.sub_5cf9(graphics, s, n, n2, n3, true);
    }
    
    private void sub_5cf9(Graphics graphics, String s, int n, int n2, int n3, final boolean b) {
        
        final Graphics graphics2 = graphics;
        final String s2 = s;
        final int n4 = n;
        final int n5 = n2;
        n2 = n5;
        n = n4;
        s = s2;
        graphics = graphics2;
        
        if (s != null) {
            if (this.var_11f7 >= 0) {
                n2 += this.var_11cf * this.var_11f7 >> 8;
            }
            else {
                n2 += this.var_11cf;
            }
            final boolean b2 = s != null;
            this.sub_5917(s, null);
            if ((n3 & 0x2B) != 0x0) {
                if ((n3 & 0x8) != 0x0) {
                    n -= ASprite.var_119f;
                }
                else if ((n3 & 0x1) != 0x0) {
                    n -= ASprite.var_119f >> 1;
                }
                if ((n3 & 0x20) != 0x0) {
                    n2 -= ASprite.var_11a7;
                }
                else if ((n3 & 0x2) != 0x0) {
                    n2 -= ASprite.var_11a7 >> 1;
                }
            }
            n3 = n;
            if (b) {
                ASprite.var_1197 = this.var_108f;
            }
            final int n6 = (ASprite.var_1207 >= 0) ? ASprite.var_1207 : 0;
            int var_1217;
            if (b2) {
                var_1217 = ((ASprite.var_120f >= 0) ? ASprite.var_120f : s.length());
            }
            else {
                var_1217 = ((ASprite.var_120f >= 0) ? ASprite.var_120f : 0);
            }
            if (ASprite.var_1217 >= 0 && var_1217 > ASprite.var_1217) {
                var_1217 = ASprite.var_1217;
            }
            for (int i = n6; i < var_1217; ++i) {
                final char c;
                if ((c = (b2 ? s.charAt(i) : 0)) == '\\') {
                    ++i;
                    final char c2;
                    if ((c2 = (b2 ? s.charAt(i) : 0)) == '_') {
                        this.var_11d7 = !this.var_11d7;
                    }
                    else if (c2 == '^') {
                        this.var_11df = !this.var_11df;
                    }
                    else {
                        this.sub_6434((c2 & '\u00ff') - 48);
                    }
                }
                else if (c != ASprite.var_1157) {
                    int sub_4851;
                    if (c > ' ') {
                        sub_4851 = this.sub_4851(c);
                    }
                    else {
                        if (c == ' ') {
                            if (this.var_11d7) {
                                final int sub_4852 = this.sub_4851(95);
                                this.sub_71ae(graphics, sub_4852, n3 + (this.GetSpaceWidth() - this.sub_63ed(sub_4852) >> 1), n2, 0);
                            }
                            n3 += this.GetSpaceWidth();
                            continue;
                        }
                        if (c == '\n') {
                            n3 = n;
                            n2 += this.sub_490a() + this.sub_4a3a();
                            continue;
                        }
                        if (c == '\u0001') {
                            ++i;
                            final char c3;
                            if ((c3 = (b2 ? s.charAt(i) : 0)) < this.var_107f) {
                                this.sub_6434(c3);
                            }
                            if (c3 == '\u00ff') {
                                this.var_108f = ASprite.var_1197;
                            }
                            continue;
                        }
                        else {
                            if (c != '\u0002') {
                                continue;
                            }
                            ++i;
                            sub_4851 = (b2 ? s.charAt(i) : 0);
                        }
                    }
                    final int n7 = sub_4851;
                    this.sub_71ae(graphics, n7, n3, n2, 0);
                    if (this.var_11d7) {
                        final int sub_4853 = this.sub_4851(95);
                        this.sub_71ae(graphics, sub_4853, n3 + (this.sub_63ed(n7) - this.sub_63ed(sub_4853) >> 1), n2, 0);
                    }
                    if (this.var_11df) {
                        ++n3;
                        this.sub_71ae(graphics, n7, n3, n2, 0);
                    }
                    n3 += this.sub_63ed(n7) + this.sub_49d6();
                }
            }
            if (b) {
                this.var_108f = ASprite.var_1197;
            }
        }
    }
    
    private final int sub_63ed(final int n) {
        if (this.var_11f7 >= 0) {
            return this.sub_3379(n) * this.var_11f7 >> 8;
        }
        return this.sub_3379(n);
    }
    
    final void sub_6434(final int var_108f) {
        
        if (var_108f < this.var_107f && var_108f >= 0) {
            this.var_108f = var_108f;
        }
    }
    
    final int sub_6475() {
        return this.var_108f;
    }
    
    final int sub_6494(final int n) {
        if ((this.var_106f & 0x100000) != 0x0) {
            return this.var_fa7[n];
        }
        return this.var_f9f[n];
    }
    
    final void sub_64d8(final int var_108f, int i, int n, int var_108f2) {
        if (this.var_10d7 == null) {
            this.var_10d7 = new GLLibImage[this.var_107f][];
        }
        if (this.var_10d7[var_108f] == null) {
            this.var_10d7[var_108f] = new GLLibImage[this.var_f77];
        }
        if (this.var_f77 == 0) {
            return;
        }
        if (n == -1) {
            n = this.var_f77 - 1;
        }
        if ((this.var_106f & 0x1000008) != 0x0) {
            var_108f2 = this.var_108f;
            this.var_108f = var_108f;
            if (ASprite.var_114f) {
                System.gc();
            }
            while (i <= n) {
                final int n2 = i;
                if (((this.var_110f != null) ? this.var_110f[n2] : 0) == 0) {
                    int var_201f = this.var_f7f[i] & 0xFFFF;
                    int var_2027 = this.var_f87[i] & 0xFFFF;
                    int[] array;
                    if (var_201f > 0 && var_2027 > 0 && (array = this.sub_3ffb(i)) != null) {
                        if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                            array = GLLib.sub_5d84(null, array, 0, 0, var_201f, var_2027, 0, this.var_1097, false, false);
                            var_201f = GLLib.var_201f;
                            var_2027 = GLLib.var_2027;
                        }
                        final int[] array2 = array;
                        final int n3 = var_201f;
                        final int n4 = var_2027;
                        final int n5 = i;
                        final int n6 = n4;
                        final int n7 = n3;
                        final int[] array3 = array2;
                        final int n8 = n7 * n6;
                        boolean b = false;
                        for (int j = 0; j < n8; ++j) {
                            if ((array3[j] & 0xFF000000) != 0xFF000000) {
                                b = true;
                                break;
                            }
                        }
                        this.var_10d7[var_108f][n5] = GLLibImage.createRGBImage(sub_9c11(array3, n6, n7, 4, null), n6, n7, b);
                    }
                }
                ++i;
            }
            if (ASprite.var_114f) {
                System.gc();
            }
            this.var_108f = var_108f2;
        }
        if (ASprite.var_114f) {
            System.gc();
        }
    }
    
    final void sub_677f(final int n, final int n2, int var_114f) {
        var_114f = (ASprite.var_114f ? 1 : 0);
        if (ASprite.var_114f) {
            System.gc();
            ASprite.var_114f = false;
        }
        for (int sub_3019 = this.sub_3019(n2), i = 0; i < sub_3019; ++i) {
            final int sub_32e3;
            final int n3 = sub_32e3 = this.sub_32e3(n2, i);
            if (((this.var_10d7 != null && n >= 0 && n < this.var_10d7.length && this.var_10d7[n] != null && sub_32e3 >= 0 && sub_32e3 < this.var_10d7[n].length) ? this.var_10d7[n][sub_32e3] : null) == null) {
                this.sub_64d8(n, n3, n3, -1);
            }
        }
        if (ASprite.var_114f = (var_114f != 0)) {
            System.gc();
        }
    }
    
    final void sub_68a3(final int n) {
        if (this.var_10d7 != null && n < this.var_10d7.length) {
            this.var_10d7[n] = null;
        }
    }
    
    final void sub_68e7(int n, int sub_312c, int n2) {
        final int sub_3717 = this.sub_3717();
        if (n2 == -1 || n2 >= sub_3717) {
            n2 = sub_3717 - 1;
        }
        if (this.var_10df == null) {
            this.var_10df = new GLLibImage[this.var_107f][][];
        }
        final int n4 = this.var_1057 + 1;
        if (this.var_10df[n] == null) {
            
            int n5 = 0;
            int length = 0;
            Label_0128: {
                if (this.var_104f != null) {
                    if (this.var_104f.length != 16) {
                        length = this.var_104f.length;
                        break Label_0128;
                    }
                    for (n5 = 15; n5 >= 0 && this.var_104f[n5] == null; --n5) {}
                    ++n5;
                }
                length = n5;
            }
            this.var_10df[n] = new GLLibImage[length + 1][];
        }
        if (this.var_10df[n][n4] == null) {
            this.var_10df[n][n4] = new GLLibImage[sub_3717];
        }
        for (int i = sub_312c; i <= n2; ++i) {
            final GLLibImage[] array = this.var_10df[n][n4];
            final int n6 = i;
            
            final int n7 = i;
            final ASprite this4 = this;
            sub_312c = this.sub_312c(n7);
            int sub_3718 = this4.sub_3189(n7);
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
                final ASprite this5 = this4;
                final int n8 = n7;
                final int var_108f = n;
                final int n9 = n8;
                final ASprite this6 = this5;
                boolean var_10e7 = false;
                int sub_312c2 = this6.sub_312c(n9);
                int sub_3719 = this6.sub_3189(n9);
                final int sub_31e6 = this6.sub_31e6(n9);
                final int sub_3720 = this6.sub_3238(n9);
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
                    final int var_108f2 = this6.var_108f;
                    this6.var_108f = var_108f;
                    final int n12;
                    if (((n12 = ASprite.var_1107[0]) & 0x4) != 0x0) {
                        final int n13 = sub_312c2;
                        sub_312c2 = sub_3719;
                        sub_3719 = n13;
                    }
                    final GLLibImage sub_1b2;
                    final Graphics graphics;
                    (graphics = (sub_1b2 = GLLibImage.createImage(sub_312c2, sub_3719)).image.getGraphics()).setColor(-65281);
                    graphics.fillRect(0, 0, sub_312c2, sub_3719);
                    if ((n12 & 0x4) != 0x0) {
                        final int var_10c7 = sub_3719;
                        final int var_10cf = sub_312c2;
                        ASprite.s_screenHeight = var_10c7;
                        ASprite.s_screenWidth = var_10cf;
                    }
                    this6.sub_71ae(graphics, n9, n10, n11, 0);
                    if ((n12 & 0x4) != 0x0) {
                        final int var_1ddf = GLLib.s_screenWidth;
                        final int var_1de7 = GLLib.s_screenHeight;
                        ASprite.s_screenHeight = var_1ddf;
                        ASprite.s_screenWidth = var_1de7;
                    }
                    GLLib.sub_3d3b(sub_1b2, array3, 0, sub_312c2, 0, 0, sub_312c2, sub_3719);
                    final int displayColor = GLLib.g.getDisplayColor(16711935);
                    while (j > 0) {
                        --j;
                        if ((array3[j] & 0xFFFFFF) == displayColor) {
                            array3[j] = 16711935;
                            var_10e7 = true;
                        }
                    }
                    ASprite.var_10e7 = var_10e7;
                    this6.var_108f = var_108f2;
                    array2 = array3;
                }
                final int[] array4 = array2;
                final int n14 = ASprite.var_1107[0];
                class_l = ((array4 == null) ? null : (((n14 & 0x4) != 0x0) ? GLLibImage.createRGBImage(array4, sub_3718, sub_312c, ASprite.var_10e7) : GLLibImage.createRGBImage(array4, sub_312c, sub_3718, ASprite.var_10e7)));
            }
            array[n6] = class_l;
        }
    }
    
    private static boolean sub_6ef1(final Graphics graphics, final int n, final int n2, int n3, int n4) {
        final int sub_35c6 = GLLib.GetClip(graphics, true);
        final int sub_3600 = GLLib.sub_3600(graphics, true);
        final int sub_3601 = GLLib.sub_3643(graphics, true);
        final int sub_367d = GLLib.sub_367d(graphics, true);
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
        int sub_3062 = this.sub_3062(anim);
        int sub_30a6 = this.sub_30a6(anim);
        int n4 = this.var_1047[anim] & 0xF;
        if ((flags & 0x1) != 0x0) {
            n4 = (ASprite.var_10f7[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            sub_3062 = -sub_3062;
        }
        if ((flags & 0x2) != 0x0) {
            n4 = (ASprite.var_10ff[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            sub_30a6 = -sub_30a6;
        }
        if ((flags & 0x4) != 0x0) {
            n4 = (ASprite.var_1107[n4 & 0x7] | (n4 & 0xFFFFFFF8));
            anim = sub_3062;
            sub_3062 = -sub_30a6;
            sub_30a6 = anim;
        }
        if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][5] == 0) {
            anim = GLLib.sub_5bbb();
            flags = GLLib.sub_5bfe();
            sub_3062 = anim * sub_3062 / 100;
            sub_30a6 = flags * sub_30a6 / 100;
        }
        this.sub_71ae(g, aframe, posX + sub_3062, posY + sub_30a6, n4);
    }
    
    final void sub_71ae(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        this.sub_71d4(graphics, n, n2, n3, n4);
    }
    
    final void sub_71d4(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        int sub_3019 = -1;
        Label_0748: {
            if (ASprite.var_121f == 0) {
                final int var_108f = this.var_108f;
                final int n5 = this.var_1057 + 1;
                if (this.var_10df != null && this.var_10df[var_108f] != null && this.var_10df[var_108f][n5][n] != null) {
                    int n6 = n4;
                    int n7 = 0;
                    final int sub_312c = this.sub_312c(n);
                    final int sub_3020 = this.sub_3189(n);
                    int sub_31e6 = this.sub_31e6(n);
                    int sub_3021 = this.sub_3238(n);
                    if ((n4 & 0x4) != 0x0) {
                        final int n8 = sub_31e6;
                        sub_31e6 = sub_3021;
                        sub_3021 = n8;
                    }
                    if ((n4 & 0x1) != 0x0) {
                        sub_31e6 = -sub_31e6 - sub_312c;
                    }
                    if ((n4 & 0x2) != 0x0) {
                        sub_3021 = -sub_3021 - sub_3020;
                    }
                    if ((n4 & 0x4) != 0x0) {
                        final int n9 = sub_31e6;
                        sub_31e6 = -sub_3021 - sub_3020;
                        sub_3021 = n9;
                    }
                    int n10 = n2 + sub_31e6;
                    int n11 = n3 + sub_3021;
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
                        if ((n4 & 0x1) == 0x0 || (n4 & 0x2) == 0x0) {
                            if ((n4 & 0x1) != 0x0) {
                                n6 = ((n4 & 0xFFFFFFFE) | 0x2);
                            }
                            else if ((n4 & 0x2) != 0x0) {
                                n6 = ((n4 & 0xFFFFFFFD) | 0x1);
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
                        final int var_108f2 = this.var_108f;
                        final GLLibImage class_l;
                        if ((class_l = ((this.var_10df == null || this.var_10df[var_108f2] == null) ? null : this.var_10df[var_108f2][this.var_1057 + 1][n])) != null) {
                            Label_0733: {
                                if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                                    final GLLibImage class_l2 = class_l;
                                    final int n20 = n15;
                                    final int n21 = n16;
                                    final int n22 = n18;
                                    final int n23 = n19;
                                    final int n24 = n6;
                                    final int n25 = n23;
                                    final int n26 = n22;
                                    final int n27 = n21;
                                    final int n28 = n20;
                                    final GLLibImage class_l3 = class_l2;
                                    boolean b = false;
                                    if (class_l3 != null) {
                                        final GLLibImage class_l4 = class_l3;
                                        final boolean var_1097 = this.var_1097;
                                        final GLLibImage class_l5 = class_l4;
                                        final int[] sub_39a6 = sub_39a6(null);
                                        GLLib.sub_3d3b(class_l5, sub_39a6, 0, n26, 0, 0, n26, n25);
                                        final int[] sub_5d84 = GLLib.sub_5d84(graphics, sub_39a6, n28, n27, n26, n25, n24, var_1097, false, true);
                                        if (sub_5d84 != null) {
                                            GLLib.sub_3bae(graphics, sub_5d84, 0, GLLib.var_201f, n28, n27, GLLib.var_201f, GLLib.var_2027, GLLib.var_1ff7, true, 0, -1, false);
                                        }
                                        b = true;
                                    }
                                    if (b) {
                                        break Label_0733;
                                    }
                                }
                                if (n6 == 0) {
                                    GLLib.DrawImage(graphics, class_l, n15, n16, 20, false);
                                }
                                else {
                                    GLLib.DrawRegion(graphics, class_l, 0, 0, n18, n19, ASprite.midp2_flags[n6 & 0x7], n15, n16, 20, false);
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
            sub_3019 = this.sub_3019(n);
        }
        if (sub_3019 > 0) {
            for (int i = 0; i < sub_3019; ++i) {
                final int sub_3022 = this.sub_3356(n, i);
                int sub_330a = this.sub_330a(sub_3022);
                final int sub_328e;
                int n29 = sub_328e = this.sub_328e(sub_3022);
                if (this.var_1057 >= 0) {
                    n29 = this.var_104f[this.var_1057][n29];
                }
                int n30 = this.var_f7f[n29] & 0xFFFF;
                int n31 = this.var_f87[n29] & 0xFFFF;
                final int n32 = n30;
                final int n33 = n31;
                int n34 = 0 + this.var_ff7[sub_3022];
                int n35 = 0 + this.var_fff[sub_3022];
                if ((sub_330a & 0x4) != 0x0) {
                    final int n36 = n30;
                    n30 = n31;
                    n31 = n36;
                }
                if ((n4 & 0x1) != 0x0) {
                    sub_330a = (ASprite.var_10f7[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n34 = -n34 - n30;
                }
                if ((n4 & 0x2) != 0x0) {
                    sub_330a = (ASprite.var_10ff[sub_330a & 0x7] | (sub_330a & 0xFFFFFFF8));
                    n35 = -n35 - n31;
                }
                if ((n4 & 0x4) != 0x0) {
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
                this.sub_7dca(graphics, sub_328e, n2 + n34, n3 + n35, sub_330a & 0xF, n32, n33);
            }
        }
    }
    
    final void sub_7d2b(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        GLLib.sub_5b71();
        GLLib.sub_5c41(n4);
        this.sub_71ae(graphics, n, n2, n3, 0);
        GLLib.sub_5b96();
    }
    
    private int sub_7d5b(final int n) {
        if (this.var_f97 != null) {
            for (int i = 0; i < this.var_f97.length; i += 2) {
                if (this.var_f97[i] == n) {
                    return this.var_f97[i + 1];
                }
            }
        }
        return -1;
    }
    
    final void sub_7dca(Graphics graphics, int color, int n, int n2, int n3, int a, int a2) {
        ASprite.s_rc[0] = a;
        ASprite.s_rc[1] = a2;
        
        final Graphics graphics2 = graphics;
        final int n4 = color;
        final int n5 = n;
        final int n6 = n2;
        final int n7 = n3;
        final int[] var_1147 = ASprite.s_rc;
        n3 = n7;
        n2 = n6;
        n = n5;
        color = n4;
        graphics = graphics2;
        
        a2 = n;
        final int n8 = n2;
        final int n9 = n3;
        if (this.var_1057 >= 0) {
            color = this.var_104f[this.var_1057][color];
        }
        if ((GLLib.var_1fe7 & 0x2000) != 0x0 && GLLib.var_1fef[13][5] != 0) {
            final int sub_5bbb = GLLib.sub_5bbb();
            final int sub_5bfe = GLLib.sub_5bfe();
            n = n * sub_5bbb / 100;
            n2 = n2 * sub_5bfe / 100;
        }
        
        final int n10 = color;
        
        if (((this.var_110f != null) ? this.var_110f[n10] : 0) == 0) {
            if ((n3 & 0x1) == 0x0 || (n3 & 0x2) == 0x0) {
                if ((n3 & 0x1) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFE) | 0x2);
                }
                else if ((n3 & 0x2) != 0x0) {
                    n3 = ((n3 & 0xFFFFFFFD) | 0x1);
                }
            }
            final int n11 = n;
            final int n12 = ASprite.s_screenWidth - n2;
            final ASprite this4 = this;
            final int n13 = color;
            final int n14 = n3;
            n2 = n13;
            final ASprite this5 = this4;
            int n15 = this4.var_f87[n2];
            if ((n14 & 0x4) != 0x0) {
                n15 = this5.var_f7f[n2];
            }
            if (n15 < 0) {
                n15 += 255;
            }
            if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                n15 = n15 * GLLib.sub_5bfe() / 100;
            }
            n = n12 - n15;
            n2 = n11;
        }
        final int n16 = var_1147[0];
        final int n17 = a = var_1147[1];
        int var_1148 = n16;
        int n18 = a;
        int n19 = var_1148;
        if ((n3 & 0x4) != 0x0) {
            final int n20 = a;
            a = var_1148;
            var_1148 = n20;
        }
        final ASprite this6 = this;
        final int n21 = color;
        final ASprite this7 = this6;
        if (((this6.var_110f != null) ? this7.var_110f[n21] : 0) != 0 && graphics != null) {
            
            final Graphics graphics3 = graphics;
            final int n22 = color;
            final int n23 = var_1148;
            final int n24 = a;
            final int n25 = n;
            int n26 = n2;
            int n27 = n25;
            int n28 = n24;
            int n29 = n23;
            final int n30 = n22;
            final Graphics graphics4 = graphics3;
            
            color = this.var_111f[n30];
            graphics4.setColor(color);
            switch (this.var_110f[n30]) {
                case 2: {
                    if ((color & 0xFF000000) == 0xFF000000 || (color & 0xFF000000) == 0x0) {
                        GLLib.FillRect(graphics4, n27, n26, n29, n28, true);
                        return;
                    }
                    GLLib.sub_56ff(color);
                    GLLib.sub_57eb(graphics4, n27, n26, n29, n28);
                    return;
                }
                case 1: {
                    --n29;
                    --n28;
                    GLLib.DrawRect(graphics4, n27, n26, n29, n28, true);
                    return;
                }
                case 3:
                case 4: {
                    if ((n3 = this.sub_7d5b(n30)) != -1) {
                        a = this.var_f8f[n3];
                        a2 = this.var_f8f[n3 + 1];
                        if ((n9 & 0x1) != 0x0) {
                            a = 90 - a;
                        }
                        if ((n9 & 0x2) != 0x0) {
                            a = -a;
                            a2 = -a2;
                        }
                        if ((n9 & 0x4) != 0x0) {
                            a -= 90;
                        }
                        if (this.var_110f[n30] == 3) {
                            GLLib.DrawArc(graphics4, n27, n26, n29, n28, a, a2, true);
                            return;
                        }
                        GLLib.FillArc(graphics4, n27, n26, n29, n28, a, a2, true);
                    }
                    return;
                }
                case 6:
                case 7: {
                    if ((n3 = this.sub_7d5b(n30)) != -1) {
                        a = this.var_f8f[n3];
                        a2 = this.var_f8f[n3 + 1];
                        int a3 = this.var_f8f[n3 + 2];
                        int a4 = this.var_f8f[n3 + 3];
                        final int n31 = n27;
                        final int n32 = n26;
                        if ((n9 & 0x1) != 0x0) {
                            a = -a;
                            a3 = -a3;
                            final int n33 = n27;
                            final int a5 = a;
                            final int abs = Math.abs(a);
                            final int a6 = a3;
                            n27 = n33 + ((abs > Math.abs(a3)) ? Math.abs(a5) : Math.abs(a6));
                        }
                        if ((n9 & 0x2) != 0x0) {
                            a2 = -a2;
                            a4 = -a4;
                            final int n34 = n26;
                            final int a7 = a2;
                            final int abs2 = Math.abs(a2);
                            final int a8 = a4;
                            n26 = n34 + ((abs2 > Math.abs(a4)) ? Math.abs(a7) : Math.abs(a8));
                        }
                        if ((n9 & 0x4) != 0x0) {
                            final int n35 = (Math.abs(a2) > Math.abs(a4)) ? Math.abs(a2) : Math.abs(a4);
                            final int n36 = n26 - n32;
                            n26 = n32 + (n27 - n31);
                            n27 = n31 - n36 + n35;
                            final int n37 = a;
                            a = -a2;
                            a2 = n37;
                            final int n38 = a3;
                            a3 = -a4;
                            a4 = n38;
                        }
                        if (this.var_110f[n30] == 6) {
                            GLLib.sub_3731(graphics4, n27, n26, n27 + a, n26 + a2, true);
                            GLLib.sub_3731(graphics4, n27 + a, n26 + a2, n27 + a3, n26 + a4, true);
                            GLLib.sub_3731(graphics4, n27, n26, n27 + a3, n26 + a4, true);
                            return;
                        }
                        GLLib.FillTriangle(graphics4, n27, n26, n27 + a, n26 + a2, n27 + a3, n26 + a4, true);
                    }
                    return;
                }
                case 8: {
                    n3 = n27;
                    a = n27 + n29;
                    a2 = n26;
                    int n39 = n26 + n28;
                    if ((n9 & 0x1) != 0x0) {
                        n3 = a;
                        a = n27;
                    }
                    if ((n9 & 0x2) != 0x0) {
                        a2 = n39;
                        n39 = n26;
                    }
                    if ((n9 & 0x4) != 0x0) {
                        final int n40 = n3;
                        n3 = a;
                        a = n40;
                    }
                    GLLib.sub_3731(graphics4, n3, a2, a, n39, true);
                    return;
                }
                case 9: {
                    if ((n3 = this.sub_7d5b(n30)) == -1) {
                        break;
                    }
                    a = color;
                    a2 = ((this.var_f8f[n3] & 0xFFFF) | (this.var_f8f[n3 + 1] << 16 & 0xFFFF0000));
                    final short n41 = this.var_f8f[n3 + 2];
                    if ((n9 & 0x1) != 0x0 && n41 < 2) {
                        a = a2;
                        a2 = color;
                    }
                    if ((n9 & 0x2) != 0x0 && n41 > 1) {
                        final int n42 = a;
                        a = a2;
                        a2 = n42;
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
                    if ((n9 & 0x4) != 0x0) {
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
                    if (a >>> 24 != 255 || a2 >>> 24 != 255) {
                        GLLib.sub_7041(graphics4, n27, n26, n29, n28, a, a2, n43);
                        return;
                    }
                    GLLib.sub_6ccf(graphics4, n27, n26, n29, n28, a, a2, n43);
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
            GLLib.sub_5cfb(GLLib.Math_Cos(GLLib.Math_Angle90 - n44), GLLib.Math_Cos(n44), a, var_1148, ASprite.s_rc);
            int n45 = ASprite.s_rc[0];
            int n46 = ASprite.s_rc[1];
            int n47 = a - GLLib.var_1fef[16][2];
            int n48 = GLLib.var_1fef[16][1];
            if ((GLLib.var_1fe7 & 0x2000) != 0x0) {
                n47 = n47 * GLLib.sub_5bbb() / 100;
                n48 = n48 * GLLib.sub_5bfe() / 100;
                a = a * GLLib.sub_5bbb() / 100;
                var_1148 = var_1148 * GLLib.sub_5bfe() / 100;
                n45 = n45 * GLLib.sub_5bbb() / 100;
                n46 = n46 * GLLib.sub_5bbb() / 100;
            }
            final int n49 = n44;
            GLLib.sub_5cbc(GLLib.Math_Cos(GLLib.Math_Angle90 - n49), GLLib.Math_Cos(n49), (a >> 1) - n47, (var_1148 >> 1) - n48, ASprite.s_rc);
            n += ASprite.s_rc[0] - n45 / 2 + n47;
            n2 += ASprite.s_rc[1] - n46 / 2 + n48;
        }
        if (a <= 0 || var_1148 <= 0) {
            return;
        }
        if (graphics == null || sub_6ef1(graphics, a2, n8, var_1148, a)) {
            GLLibImage class_l = null;
            if ((this.var_106f & 0x1000008) != 0x0) {
                if (this.var_10d7 != null && this.var_10d7[this.var_108f] != null) {
                    class_l = this.var_10d7[this.var_108f][color];
                }
                boolean b = this.var_1097;
                if (class_l == null) {
                    int[] array;
                    if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0 && this.sub_3b2c()) {
                        if (this.sub_3b85(color, n, n2, n3)) {
                            return;
                        }
                        array = this.sub_3ffb(color);
                    }
                    else {
                        array = this.sub_3ffb(color);
                    }
                    if (array != null) {
                        boolean b2 = false;
                        if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                            if (this.sub_3b85(color, n, n2, n3)) {
                                return;
                            }
                            final boolean sub_3b2c;
                            if (!(sub_3b2c = this.sub_3b2c())) {
                                n3 = (ASprite.var_1107[n9 & 0x7] | (n9 & 0xFFFFFFF8));
                            }
                            array = GLLib.sub_5d84(graphics, array, n, n2, n19, n18, sub_3b2c ? 4 : n3, b, false, !sub_3b2c);
                            if (this.sub_3c9a(color, n, n2, array, n3) || array == null) {
                                return;
                            }
                            b = GLLib.var_1ff7;
                            n3 = 0;
                            n = GLLib.var_200f;
                            n2 = GLLib.var_2017;
                            a = GLLib.var_201f;
                            var_1148 = GLLib.var_2027;
                            n18 = a;
                            n19 = var_1148;
                            GLLib.sub_3bae(graphics, array, 0, n18, n, n2, n18, n19, b, b, 0, -1, false);
                            b2 = true;
                        }
                        if (this.var_116f >= 0) {
                            if (this.var_10d7 == null) {
                                this.var_10d7 = new GLLibImage[this.var_107f][];
                                for (int i = 0; i < this.var_107f; ++i) {
                                    this.var_10d7[i] = new GLLibImage[this.var_f77];
                                }
                            }
                            GLLibImage class_l2;
                            if (!b2) {
                                final int[] array2 = new int[a * var_1148];
                                a2 = var_1148;
                                int n50 = a;
                                if ((n3 & 0x4) != 0x0) {
                                    a2 = a;
                                    n50 = var_1148;
                                }
                                for (int j = 0; j < a2; ++j) {
                                    for (int k = 0; k < n50; ++k) {
                                        array2[n50 - k - 1 + j * n50] = array[j + a2 * k];
                                    }
                                }
                                if ((n3 & 0x4) != 0x0) {
                                    class_l2 = GLLibImage.createRGBImage(array2, var_1148, a, this.var_1097);
                                }
                                else {
                                    class_l2 = GLLibImage.createRGBImage(array2, a, var_1148, this.var_1097);
                                }
                            }
                            else if ((n3 & 0x4) != 0x0) {
                                class_l2 = GLLibImage.createRGBImage(array, var_1148, a, this.var_1097);
                            }
                            else {
                                class_l2 = GLLibImage.createRGBImage(array, a, var_1148, this.var_1097);
                            }
                            this.sub_3eec(color, class_l2);
                            if (!b2) {
                                if (class_l2 != null) {
                                    if (ASprite.midp2_flags[n3 & 0x7] == 0) {
                                        GLLib.DrawImage(graphics, class_l2, n, n2, 20, false);
                                        return;
                                    }
                                    if ((n3 & 0x4) != 0x0) {
                                        GLLib.DrawRegion(graphics, class_l2, 0, 0, var_1148, a, ASprite.midp2_flags[n3 & 0x7], n, n2, 20, false);
                                        return;
                                    }
                                    GLLib.DrawRegion(graphics, class_l2, 0, 0, a, var_1148, ASprite.midp2_flags[n3 & 0x7], n, n2, 20, false);
                                }
                            }
                        }
                        else if (!b2) {
                            n = a2;
                            n2 = n8;
                            final int n51 = n18;
                            final int n52 = n19;
                            final int n53 = n51;
                            final Graphics graphics5 = graphics;
                            final int[] array3 = array;
                            final int n54 = n52;
                            final int n55 = n;
                            final int n56 = n2;
                            final int n57 = n52;
                            final int n58 = n53;
                            final int n59 = b ? 1 : 0;
                            final int n60 = b ? 1 : 0;
                            a2 = n59;
                            a = n58;
                            n3 = n57;
                            n2 = n56;
                            n = n55;
                            final int n61;
                            color = (n61 = n54);
                            final int n62 = n3;
                            final int n63 = a;
                            final int n64 = a2;
                            a2 = n60;
                            a = n64;
                            n3 = n63;
                            color = n62;
                            GLLib.sub_3bae(graphics5, array3, 0, n61, n, n2, color, n3, (boolean)(a != 0), (boolean)(a2 != 0), n9, -1, true);
                        }
                    }
                }
                else if (GLLib.var_1fdf && (GLLib.var_1fe7 & 0xFF7E0) != 0x0) {
                    if (!this.sub_3b85(color, n, n2, n3)) {
                        final boolean sub_3b2c2 = this.sub_3b2c();
                        final Graphics graphics6 = graphics;
                        final GLLibImage class_l3 = class_l;
                        final int n65 = n;
                        final int n66 = n2;
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
                        final int[] sub_39a6 = sub_39a6(null);
                        GLLib.sub_3d3b(class_l4, sub_39a6, 0, n72, 0, 0, n72, n71);
                        final int[] sub_5d84 = GLLib.sub_5d84(graphics7, sub_39a6, n74, n73, n72, n71, n70, b5, false, b4);
                        if (!this.sub_3c9a(color, n, n2, sub_5d84, n3) && sub_5d84 != null) {
                            final boolean var_1ff7 = GLLib.var_1ff7;
                            n = GLLib.var_200f;
                            n2 = GLLib.var_2017;
                            a = GLLib.var_201f;
                            final int var_1149 = GLLib.var_2027;
                            final int n75 = a;
                            GLLib.sub_3bae(graphics, sub_5d84, 0, n75, n, n2, n75, var_1149, var_1ff7, true, 0, -1, false);
                        }
                    }
                }
                else {
                    a = n16;
                    final int n76 = n17;
                    final int n77 = a;
                    a = n76;
                    final int n78 = n77;
                    this.sub_3eec(color, class_l);
                    if (class_l != null) {
                        if (ASprite.midp2_flags[n3 & 0x7] == 0) {
                            GLLib.DrawImage(graphics, class_l, n, n2, 20, false);
                            return;
                        }
                        GLLib.DrawRegion(graphics, class_l, 0, 0, a, n78, ASprite.midp2_flags[n3 & 0x7], n, n2, 20, false);
                    }
                }
            }
        }
    }
    
    static final int[] sub_9c11(final int[] array, final int n, final int n2, int n3, int[] sub_39a6) {
        if ((n3 & 0x7) == 0x0) {
            return array;
        }
        sub_39a6 = sub_39a6(array);
        int n4 = 0;
        int n5 = 0;
        switch (n3 & 0x7) {
            case 1: {
                int n6 = n * n2;
                int n7 = n * (n2 - 1);
                int n8 = n2;
                while (--n8 >= 0) {
                    n3 = n;
                    while (--n3 >= 0) {
                        sub_39a6[--n6] = array[n7++];
                    }
                    n7 -= n << 1;
                }
                break;
            }
            case 2: {
                int n9 = (n2 - 1) * n;
                int n10 = n2;
                while (--n10 >= 0) {
                    System.arraycopy(array, n5, sub_39a6, n9, n);
                    n9 -= n;
                    n5 += n;
                }
                break;
            }
            case 3: {
                for (int i = n * n2 - 1; i >= 0; sub_39a6[n4++] = array[i--]) {}
                break;
            }
            case 4: {
                int n11 = n * n2;
                int n12 = n2;
                while (--n12 >= 0) {
                    int n13 = n12;
                    n3 = n;
                    while (--n3 >= 0) {
                        sub_39a6[--n11] = array[n13];
                        n13 += n2;
                    }
                }
                break;
            }
            case 5: {
                int n14 = n * n2;
                int n15 = n2;
                while (--n15 >= 0) {
                    int n16 = n2 - 1 - n15;
                    n3 = n;
                    while (--n3 >= 0) {
                        sub_39a6[--n14] = array[n16];
                        n16 += n2;
                    }
                }
                break;
            }
            case 6: {
                int n18;
                int n17 = (n18 = n * n2) - 1;
                int n19 = n2;
                while (--n19 >= 0) {
                    int n20 = n17--;
                    n3 = n;
                    while (--n3 >= 0) {
                        sub_39a6[--n18] = array[n20];
                        n20 -= n2;
                    }
                }
                break;
            }
            case 7: {
                int n22;
                int n21 = (n22 = n * n2) - n2;
                int n23 = n2;
                while (--n23 >= 0) {
                    int n24 = n21++;
                    n3 = n;
                    while (--n3 >= 0) {
                        sub_39a6[--n22] = array[n24];
                        n24 -= n2;
                    }
                }
                break;
            }
        }
        return sub_39a6;
    }
    
    static final int[] sub_9f61(final int[] array) {
        return sub_39a6(array);
    }
    
    public ASprite() {
        this.var_116f = -1;
        this.var_11d7 = false;
        this.var_11df = false;
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
        ASprite.var_114f = true;
        ASprite.var_1157 = '|';
        ASprite.var_1207 = -1;
        ASprite.var_120f = -1;
        ASprite.var_1217 = -1;
        ASprite.var_121f = 0;
    }
}
