// 
// Decompiled by Procyon v0.6.0
// 

final class Class_f
{
    static Class_f[] var_157d;
    private int var_1585;
    private int var_158d;
    private int m_screenX;
    private int m_screenY;
    boolean var_15a5;
    private int var_15ad;
    private int var_15b5;
    private int var_15bd;
    long var_15c5;
    boolean var_15cd;
    private int var_15d5;
    private boolean var_15dd;
    long var_15e5;
    private int var_15ed;
    private int var_15f5;
    private int var_15fd;
    int var_1605;
    private boolean var_160d;
    long var_1615;
    long var_161d;
    int var_1625;
    int var_162d;
    int var_1635;
    int var_163d;
    long var_1645;
    int var_164d;
    private boolean var_1655;
    private boolean var_165d;
    private boolean var_1665;
    private boolean var_166d;
    boolean var_1675;
    int var_167d;
    short var_1685;
    private boolean var_168d;
    private boolean var_1695;
    short var_169d;
    short var_16a5;
    int var_16ad;
    int var_16b5;
    int var_16bd;
    int var_16c5;
    short var_16cd;
    boolean var_16d5;
    long var_16dd;
    int var_16e5;
    int var_16ed;
    private boolean var_16f5;
    private int var_16fd;
    int var_1705;
    int var_170d;
    private int m_itemIndex;
    private int var_171d;
    private int var_1725;
    boolean var_172d;
    private boolean var_1735;
    private int var_173d;
    private int var_1745;
    private int var_174d;
    private int var_1755;
    private int var_175d;
    private int var_1765;
    private boolean var_176d;
    private static int var_1775;
    private static int var_177d;
    private static int var_1785;
    private static int var_178d;
    private static int var_1795;
    private static int var_179d;
    int var_17a5;
    Class_f var_17ad;
    private Class_f var_17b5;
    private int var_17bd;
    int var_17c5;
    int var_17cd;
    int var_17d5;
    int var_17dd;
    private int var_17e5;
    int var_17ed;
    int var_17f5;
    private int var_17fd;
    private int var_1805;
    private int var_180d;
    int var_1815;
    int var_181d;
    private int var_1825;
    short var_182d;
    int var_1835;
    int var_183d;
    int var_1845;
    int var_184d;
    int var_1855;
    int var_185d;
    int var_1865;
    int var_186d;
    private int var_1875;
    int var_187d;
    int var_1885;
    int var_188d;
    private Class_f var_1895;
    GLLibPlayer var_189d;
    private int var_18a5;
    private int var_18ad;
    GLLibPlayer var_18b5;
    boolean var_18bd;
    int var_18c5;
    int m_prepareTime;
    byte var_18d5;
    private Class_n var_18dd;
    private int var_18e5;
    private int var_18ed;
    private boolean var_18f5;
    private boolean var_18fd;
    private static int[] var_1905;
    private static int[][] var_190d;
    private static int var_1915;
    int var_191d;
    
    Class_f() {
        this.var_15a5 = false;
        this.var_15c5 = 0L;
        this.var_15cd = false;
        this.var_15d5 = 0;
        this.var_15dd = false;
        this.var_1605 = 0;
        this.var_160d = false;
        this.var_161d = 0L;
        this.var_1625 = Integer.MAX_VALUE;
        this.var_162d = 0;
        this.var_1635 = 0;
        this.var_163d = 0;
        this.var_1645 = 0L;
        this.var_164d = 0;
        this.var_1655 = false;
        this.var_165d = false;
        this.var_1665 = false;
        this.var_166d = false;
        this.var_1675 = false;
        this.var_167d = 0;
        this.var_1685 = 0;
        this.var_168d = false;
        this.var_1695 = false;
        this.var_169d = 0;
        this.var_16a5 = 0;
        this.var_16ad = 0;
        this.var_16b5 = 0;
        this.var_16bd = 0;
        this.var_16c5 = 0;
        this.var_16cd = 0;
        this.var_16d5 = false;
        this.var_16dd = 0L;
        this.var_16e5 = 0;
        this.var_16ed = 0;
        this.var_16fd = 0;
        this.var_1705 = 0;
        this.var_170d = 0;
        this.m_itemIndex = 0;
        this.var_171d = 0;
        this.var_1725 = 0;
        this.var_172d = false;
        this.var_1735 = false;
        this.var_173d = 0;
        this.var_1745 = 0;
        this.var_174d = 0;
        this.var_1755 = 0;
        this.var_175d = 0;
        this.var_1765 = 0;
        this.var_176d = true;
        this.var_17a5 = 0;
        this.var_17bd = -1;
        this.var_182d = 0;
        this.var_1835 = -1;
        this.var_1845 = 0;
        this.var_184d = 0;
        this.m_prepareTime = 0;
        this.var_18d5 = 0;
    }
    
    static void sub_1a7a() {
        for (int i = 0; i < 5; ++i) {
            Class_f var_17ad;
            for (Class_f class_f = Class_f.var_157d[i]; class_f != null; class_f = var_17ad) {
                var_17ad = class_f.var_17ad;
                if (class_f.var_189d != null) {
                    class_f.var_189d.Update(GLLib.s_game_frameDT);
                }
                switch (class_f.var_17c5) {
                    case 42: {
                        switch (class_f.var_185d) {
                            case 0: {
                                if (class_f.var_189d.IsAnimOver()) {
                                    class_f.sub_60d7(0);
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                class_f.sub_a392();
                                if (class_f.var_17cd == class_f.var_1845 && class_f.var_17d5 == class_f.var_184d) {
                                    class_f.sub_60d7(0);
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (class_f.var_189d.IsAnimOver() || class_f.var_189d.GetAnim() == 2) {
                                    class_f.sub_60d7(0);
                                    cGame.var_70dc = 3;
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                if (class_f.var_189d.IsAnimOver()) {
                                    class_f.sub_60d7(0);
                                    cGame.sub_4049d(292, 293, 15, 0, 1);
                                    cGame.var_6c64 = 0;
                                    break;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 51: {
                        switch (class_f.var_185d) {
                            case 0: {
                                if (class_f.var_189d.IsAnimOver()) {
                                    class_f.sub_9175(0);
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                class_f.sub_a392();
                                if (class_f.var_17cd == class_f.var_1845 && class_f.var_17d5 == class_f.var_184d) {
                                    class_f.sub_9175(0);
                                    break;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 50: {
                        if (class_f.var_1835 != 18) {
                            if ((class_f.var_1835 == 12 || class_f.var_1835 == 11) && cGame.var_807c == 0 && class_f.sub_a2a0(512)) {
                                final long n;
                                if ((n = System.currentTimeMillis() / 1000L - class_f.var_15c5) < 86400L && cGame.var_8034 == class_f) {
                                    cGame.sub_df48((int)n, 86400);
                                    class_f.m_prepareTime = cGame.sub_e1e7((int)(86400L - n));
                                }
                                if (!class_f.var_15cd && n >= 86400L) {
                                    class_f.var_15cd = true;
                                    class_f.sub_a21a(16);
                                    class_f.sub_aa65(sub_92ea(33, 0, new int[] { class_f.var_17cd, class_f.var_17d5, 150, 10, 13, -63, -117, 0, 1 }));
                                    if (cGame.sub_1146d()) {
                                        cGame.sub_11320(false, null);
                                    }
                                }
                            }
                            else if (class_f.var_1835 == 15) {
                                final GLLibPlayer var_189d = class_f.var_189d;
                                if (cGame.sub_2a397()) {
                                    if (class_f.var_15d5 >= 0) {
                                        
                                        class_f.var_15d5 -= GLLib.s_game_frameDT;
                                        if (class_f.var_15d5 < 0) {
                                            (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17ed, class_f.var_17f5)).SetAnim(0, 1);
                                        }
                                    }
                                    else if (class_f.var_189d != null) {
                                        class_f.var_189d.Update(GLLib.s_game_frameDT);
                                        if (class_f.var_189d.IsAnimOver()) {
                                            class_f.var_189d = null;
                                            class_f.var_15d5 = GLLib.Math_Rand(1000, 4000);
                                        }
                                    }
                                }
                                else if (class_f.var_189d != null) {
                                    class_f.var_189d = null;
                                }
                                if (var_189d != class_f.var_189d) {
                                    class_f.sub_aac5();
                                }
                            }
                            else if (class_f.var_1835 == 9) {
                                if (cGame.var_807c == 0 && cGame.sub_2b680()) {
                                    if (!class_f.var_15dd && cGame.sub_4abbb(cGame.var_80f4[0]) && cGame.sub_4abbb(cGame.var_80f4[1])) {
                                        class_f.var_15dd = true;
                                        class_f.sub_aa65(sub_92ea(33, 0, new int[] { class_f.var_17cd, class_f.var_17d5, 150, 10, 13, -63, -117, 0, 1 }));
                                    }
                                    if (class_f.var_15d5 >= 0) {
                                        final Class_f class_f7 = class_f;
                                        class_f7.var_15d5 -= GLLib.s_game_frameDT;
                                        if (class_f.var_15d5 < 0) {
                                            (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17ed, class_f.var_17f5)).SetAnim(0, 1);
                                        }
                                    }
                                    else if (class_f.var_189d != null) {
                                        class_f.var_189d.Update(GLLib.s_game_frameDT);
                                        if (class_f.var_189d.IsAnimOver()) {
                                            class_f.var_15d5 = GLLib.Math_Rand(10000, 30000);
                                            class_f.var_189d = null;
                                        }
                                    }
                                }
                                else {
                                    if (class_f.var_189d != null) {
                                        class_f.var_189d = null;
                                        class_f.sub_aac5();
                                    }
                                    if (class_f.var_15dd) {
                                        class_f.sub_aa8a();
                                        class_f.var_15dd = false;
                                    }
                                }
                                if (class_f.var_189d != null) {
                                    class_f.sub_aac5();
                                }
                            }
                            else if (class_f.var_1835 == 2) {
                                if (cGame.sub_35bc4()) {
                                    if (class_f.var_18b5 == null) {
                                        final ASprite class_e;
                                        final short n2 = (class_e = cGame.s_gameSprites[class_f.var_1865])._frames_fm_start[1];
                                        class_f.var_18a5 = class_e.sub_30ea(n2);
                                        class_f.var_18ad = class_e.sub_310b(n2);
                                        class_f.var_18b5 = new GLLibPlayer(cGame.s_gameSprites[147], class_f.var_17ed, class_f.var_17f5);
                                    }
                                    if (class_f.var_15d5 >= 0) {
                                        final Class_f class_f8 = class_f;
                                        class_f8.var_15d5 -= GLLib.s_game_frameDT;
                                        if (class_f.var_15d5 < 0) {
                                            class_f.var_18b5.SetAnim(0, 1);
                                        }
                                    }
                                    else {
                                        class_f.var_18b5.Update(GLLib.s_game_frameDT);
                                        if (class_f.var_18b5.IsAnimOver()) {
                                            class_f.var_15d5 = GLLib.Math_Rand(3000, 4000);
                                        }
                                    }
                                }
                                else if (class_f.var_18b5 != null) {
                                    class_f.var_18b5 = null;
                                }
                            }
                            else if (class_f.var_1835 == 1) {
                                if (class_f.var_18b5 != null) {
                                    class_f.var_18b5 = null;
                                }
                            }
                            else if (class_f.var_1835 == 14) {
                                if (!class_f.var_15cd && cGame.sub_376da()) {
                                    class_f.var_15cd = true;
                                    class_f.sub_a21a(16);
                                    class_f.sub_aa65(sub_92ea(33, 0, new int[] { class_f.var_17cd, class_f.var_17d5, 150, 10, 13, -63, -117, 0, 1 }));
                                }
                                final long n3 = System.currentTimeMillis() / 1000L;
                                boolean b = false;
                                for (int n4 = 0; !b && n4 < cGame.var_7514; b = (cGame.var_7544[n4] > 0L && n3 < cGame.var_7544[n4] + cGame.var_753c[n4]), ++n4) {}
                                if (b) {
                                    if (class_f.var_189d == null) {
                                        (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17ed, class_f.var_17f5)).SetAnim(1, -1);
                                        cGame.playSndNoLoop(37);
                                    }
                                    else {
                                        class_f.var_189d.Update(GLLib.s_game_frameDT);
                                    }
                                }
                                else if (class_f.var_189d != null) {
                                    class_f.var_189d = null;
                                }
                            }
                            else if (class_f.var_1835 == 17) {
                                if (class_f.var_15d5 >= 0) {
                                    final Class_f class_f9 = class_f;
                                    class_f9.var_15d5 -= GLLib.s_game_frameDT;
                                    if (class_f.var_15d5 < 0) {
                                        (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17ed, class_f.var_17f5)).SetAnim(0, 1);
                                        if (class_f.sub_b03e()) {
                                            cGame.playSndNoLoop(30);
                                        }
                                    }
                                }
                                else if (class_f.var_189d != null) {
                                    class_f.var_189d.Update(GLLib.s_game_frameDT);
                                    if (class_f.var_189d.IsAnimOver()) {
                                        class_f.var_189d = null;
                                        class_f.var_15d5 = GLLib.Math_Rand(10000, 30000);
                                    }
                                }
                                if (cGame.var_807c == 0) {
                                    cGame.var_7d9c = System.currentTimeMillis();
                                    if (class_f.sub_a2a0(512) && (class_f.var_1895 == null || class_f.var_1895.var_17c5 == -1) && cGame.var_7d9c > cGame.var_7da4) {
                                        class_f.sub_aa65(sub_92ea(33, 0, new int[] { class_f.var_17cd, class_f.var_17d5, 150, 10, 13, -63, -117, 0, 1 }));
                                    }
                                    else if (class_f.sub_a2a0(512) && class_f.var_1895 != null && class_f.var_1895.var_17c5 != -1 && cGame.var_7d9c <= cGame.var_7da4) {
                                        class_f.sub_aa8a();
                                    }
                                }
                                if (class_f.var_189d != null) {
                                    class_f.sub_aac5();
                                }
                            }
                        }
                        break;
                    }
                    case 34: {
                        final Class_f class_f10;
                        if ((class_f10 = class_f).var_185d == 1) {
                            class_f10.sub_a392();
                            if (class_f10.var_17cd == class_f10.var_1845 && class_f10.var_17d5 == class_f10.var_184d) {
                                class_f10.sub_8723();
                            }
                        }
                        if (!class_f10.var_16f5 && class_f10.sub_b03e() && class_f10.var_1835 == 2) {
                            if (cGame.var_6a0c) {
                                cGame.playSndNoLoop(22);
                            }
                            class_f10.var_16f5 = true;
                            break;
                        }
                        if (class_f10.var_16f5 && !class_f10.sub_b03e() && class_f10.var_1835 == 2) {
                            class_f10.var_16f5 = false;
                        }
                        break;
                    }
                    case 54: {
                        final Class_f class_f11;
                        if ((class_f11 = class_f).var_189d != null) {
                            if (class_f11.var_18b5 != null) {
                                final int sub_1923;
                                if ((sub_1923 = class_f11.var_18b5.GetAnim()) == 0) {
                                    if (class_f11.var_16a5 == 0) {
                                        final GameDatas class_h = GameDatas.s_allDatas[0];
                                        class_f11.var_16a5 = (short)class_h.m_dataVars[class_f11.var_1835][30];
                                        final ASprite class_e2;
                                        final short n5 = (class_e2 = cGame.s_gameSprites[class_h.m_dataVars[class_f11.var_1835][31]])._frames_fm_start[class_f11.var_16a5];
                                        class_f11.var_16bd = class_e2.sub_30ea(n5);
                                        class_f11.var_16c5 = class_e2.sub_310b(n5);
                                        class_f11.var_18a5 = class_f11.var_16bd;
                                        class_f11.var_18ad = class_f11.var_16c5;
                                    }
                                }
                                else {
                                    class_f11.var_18b5.SetPos(class_f11.var_17ed, class_f11.var_17f5 - 50);
                                }
                                class_f11.var_18b5.SetZoomLevel(cGame.s_zoomLevel);
                                if (class_f11.var_18b5.IsAnimOver()) {
                                    if (sub_1923 == 1 && cGame.s_tutorialState == 18) {
                                        cGame.s_hasFinishedTut = true;
                                    }
                                    class_f11.var_18b5 = null;
                                }
                                else {
                                    class_f11.var_18b5.Update(GLLib.s_game_frameDT);
                                }
                            }
                            if ((class_f11.var_18b5 == null || class_f11.var_18b5.GetSprite() != cGame.s_gameSprites[16]) && class_f11.var_1675) {
                                (class_f11.var_18b5 = new GLLibPlayer(cGame.s_gameSprites[16], class_f11.var_17ed, class_f11.var_17f5)).SetAnim(0, -1);
                                class_f11.var_18b5.setSprPalette(1);
                            }
                            else if (class_f11.var_18b5 != null && !class_f11.var_1675 && class_f11.var_18b5.GetSprite() == cGame.s_gameSprites[16]) {
                                class_f11.var_18b5 = null;
                            }
                            if (!class_f11.sub_a2a0(512)) {
                                if (class_f11.var_189d.IsAnimOver()) {
                                    class_f11.sub_8365(0);
                                }
                            }
                            else {
                                if (class_f11.sub_b03e()) {
                                    if (!class_f11.var_168d && cGame.var_6aac != null && cGame.var_6aac != class_f11 && class_f11.var_17cd > cGame.var_8124 + 150 && class_f11.var_17cd < cGame.var_8124 + 530 && class_f11.var_17d5 > cGame.var_812c + 340 && class_f11.var_17d5 < cGame.var_812c + 570) {
                                        class_f11.var_168d = true;
                                        class_f11.sub_7d3f(cGame.var_8124 + 150, cGame.var_812c + 446);
                                    }
                                    if (class_f11.var_168d && class_f11.var_17cd == class_f11.var_1845 && class_f11.var_17d5 == class_f11.var_184d) {
                                        class_f11.var_168d = false;
                                    }
                                    final Class_f[] array = new Class_f[10];
                                    for (int j = 0; j < 10; ++j) {
                                        array[j] = null;
                                    }
                                    sub_577d(0, 50, cGame.var_80b4[10], array, 10);
                                    for (int k = 0; k < 10; ++k) {
                                        if (array[k] != null && class_f11.var_17cd > array[k].var_17cd - 100 && class_f11.var_17cd < array[k].var_17cd + 100 && class_f11.var_17d5 > array[k].var_17d5 - 100 && class_f11.var_17d5 < array[k].var_17d5 + 100 && !class_f11.var_1695) {
                                            class_f11.var_1695 = true;
                                            class_f11.sub_7d3f(array[k].var_17cd - 150, array[k].var_17d5);
                                        }
                                    }
                                    for (int l = 0; l < 10; ++l) {
                                        array[l] = null;
                                    }
                                    if (class_f11.var_1695 && class_f11.var_17cd == class_f11.var_1845 && class_f11.var_17d5 == class_f11.var_184d) {
                                        class_f11.var_1695 = false;
                                    }
                                }
                                switch (class_f11.var_185d) {
                                    case 0: {
                                        if (!class_f11.var_189d.IsAnimOver()) {
                                            break;
                                        }
                                        if (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1 || cGame.var_6aa4 == 3 || (cGame.sub_1146d() && cGame.var_8034 == class_f11) || !class_f11.sub_b03e() || cGame.var_813c || GLLib.Math_Rand(0, 100) < 50) {
                                            class_f11.sub_8365(0);
                                            break;
                                        }
                                        final Class_f class_f12 = class_f11;
                                        cGame.var_813c = true;
                                        final int sub_2b97 = GLLib.Math_Rand(-4, 4);
                                        final int sub_2b98 = GLLib.Math_Rand(-4, 4);
                                        final int[] array2 = new int[2];
                                        final int[] array3 = new int[2];
                                        array2[0] = class_f12.var_17cd;
                                        array2[1] = class_f12.var_17d5;
                                        cGame.sub_2c867(array2, array3);
                                        final int[] array4 = array3;
                                        final int n6 = 0;
                                        array4[n6] += sub_2b97;
                                        final int[] array5 = array3;
                                        final int n7 = 1;
                                        array5[n7] += sub_2b98;
                                        if (cGame.s_tutorialState == -1 && !cGame.sub_2cce3(array3[0], array3[1], class_f12.var_1815 << 1, class_f12.var_181d << 1)) {
                                            cGame.sub_2c8b0(array3, array2);
                                            class_f12.sub_ac99(array2[0], array2[1]);
                                            break;
                                        }
                                        class_f12.sub_8365(0);
                                        break;
                                    }
                                    case 1: {
                                        if (cGame.s_tutorialState == 15) {
                                            class_f11.sub_8365(0);
                                        }
                                        final int var_17cd = class_f11.var_17cd;
                                        final int var_17d5 = class_f11.var_17d5;
                                        class_f11.sub_a392();
                                        if (class_f11.var_168d) {
                                            break;
                                        }
                                        final int[] array6 = new int[2];
                                        final int[] array7 = new int[2];
                                        array6[0] = class_f11.var_17cd;
                                        array6[1] = class_f11.var_17d5;
                                        cGame.sub_2c867(array6, array7);
                                        if (cGame.sub_1146d() && cGame.var_8034 == class_f11) {
                                            class_f11.var_17cd = var_17cd;
                                            class_f11.var_17d5 = var_17d5;
                                            class_f11.sub_8365(0);
                                        }
                                        if (!cGame.sub_2ceb1(array7[0], array7[1])) {
                                            class_f11.var_17cd = var_17cd;
                                            class_f11.var_17d5 = var_17d5;
                                            class_f11.sub_8365(0);
                                            break;
                                        }
                                        if (class_f11.var_17cd == class_f11.var_1845 && class_f11.var_17d5 == class_f11.var_184d) {
                                            class_f11.sub_8365(0);
                                            break;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        if (!class_f11.sub_a2a0(4)) {
                                            class_f11.sub_85b3(4);
                                        }
                                        if (class_f11.var_189d.IsAnimOver()) {
                                            class_f11.sub_8365(0);
                                            break;
                                        }
                                        break;
                                    }
                                    case 7: {
                                        if (class_f11.var_189d.IsAnimOver()) {
                                            class_f11.sub_8365(0);
                                            class_f11.var_1675 = true;
                                            break;
                                        }
                                        break;
                                    }
                                    case 3: {
                                        if (class_f11.var_189d.IsAnimOver()) {
                                            if (!cGame.var_6c24 && cGame.getState() == 18) {
                                                cGame.var_6c24 = true;
                                                cGame.var_6c8c = (cGame.s_hasFinishedTut = false);
                                                cGame.s_tutorialState = 33;
                                            }
                                            class_f11.sub_8365(0);
                                            break;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        final Class_f class_f13 = class_f11;
                                        final int[] array8 = { 0, 0, 14 };
                                        sub_92ea(47, 2, array8).sub_8c4c(class_f13.var_17cd, class_f13.var_17d5, 37, 1000, false, 1);
                                        final GameDatas class_h2;
                                        int n8 = (class_h2 = GameDatas.s_allDatas[0]).m_dataVars[class_f13.var_1835][18];
                                        final int var_188d = class_h2.m_dataVars[class_f13.var_1835][19];
                                        final int n9 = class_h2.m_dataVars[class_f13.var_1835][20];
                                        int n10 = class_h2.m_dataVars[class_f13.var_1835][21];
                                        final int n11 = class_h2.m_dataVars[class_f13.var_1835][22];
                                        final int n12 = class_h2.m_dataVars[class_f13.var_1835][23];
                                        boolean b2 = false;
                                        if (class_f13.var_1675) {
                                            if (n8 > 0) {
                                                ++n8;
                                            }
                                            if (n10 > 0) {
                                                ++n10;
                                            }
                                            class_f13.var_1675 = false;
                                        }
                                        if (cGame.var_807c == 0 || (cGame.sub_2dcf3(5) < cGame.sub_2df26() && GLLib.Math_Rand(0, 100) < cGame.var_8064[20])) {
                                            final int sub_2b99 = GLLib.Math_Rand(0, 100);
                                            int n13 = 0;
                                            if (sub_2b99 < n9) {
                                                class_f13.var_188d = var_188d;
                                                n13 = n8 << 16;
                                                final Class_f sub_92ea = sub_92ea(47, 2, array8);
                                                if (cGame.var_807c != 0) {
                                                    n13 = 1;
                                                }
                                                sub_92ea.sub_8c4c(class_f13.var_17cd, class_f13.var_17d5, 59, 1000, true, class_f13.var_188d | n13);
                                                b2 = true;
                                            }
                                            if (sub_2b99 < n12) {
                                                if (cGame.var_807c == 0) {
                                                    class_f13.var_188d = n11;
                                                    sub_92ea(47, 2, array8).sub_8c4c(class_f13.var_17cd + 50, class_f13.var_17d5 + 10, 59, 1000, true, class_f13.var_188d | n10 << 16);
                                                    b2 = true;
                                                }
                                                else if (n13 == 0) {
                                                    class_f13.var_188d = n11;
                                                    sub_92ea(47, 2, array8).sub_8c4c(class_f13.var_17cd + 50, class_f13.var_17d5 + 10, 59, 1000, true, class_f13.var_188d | 0x1);
                                                    b2 = true;
                                                }
                                            }
                                            if (class_f13.sub_a2a0(2048) && class_f13.var_167d > 0) {
                                                sub_92ea(47, 2, array8).sub_8c4c(class_f13.var_17cd + 65, class_f13.var_17d5, 36, 1000, true, class_f13.var_167d);
                                            }
                                        }
                                        if (b2) {
                                            cGame.sub_49db0(class_f13.var_18c5, 1, 41, class_f13.sub_a2a0(2048));
                                        }
                                        class_f11.sub_7ed6();
                                        class_f11.sub_8365(2);
                                        break;
                                    }
                                }
                                if (class_f11.sub_a2a0(32)) {
                                    final long currentTimeMillis;
                                    final long n14 = (currentTimeMillis = System.currentTimeMillis()) / 1000L - class_f11.var_1645;
                                    if (class_f11.var_16d5 && class_f11.var_16dd > 0L) {
                                        class_f11.var_163d = (int)(GameDatas.s_allDatas[0].m_dataVars[class_f11.var_1835][13] * 60 + (currentTimeMillis - class_f11.var_16dd) / 1000L);
                                    }
                                    if (class_f11.var_163d > 0 && cGame.var_8034 == class_f11) {
                                        cGame.sub_df48((int)n14, class_f11.var_163d);
                                        class_f11.m_prepareTime = cGame.sub_e1e7((int)(class_f11.var_163d - n14));
                                    }
                                    if (n14 >= class_f11.var_163d) {
                                        class_f11.sub_80fc();
                                    }
                                }
                                else if (!class_f11.sub_a2a0(4) && !class_f11.sub_a2a0(16)) {
                                    final long currentTimeMillis2 = System.currentTimeMillis();
                                    if (cGame.s_tutorialState == 33) {
                                        class_f11.var_161d = currentTimeMillis2;
                                    }
                                    final long n15 = (currentTimeMillis2 - class_f11.var_161d) / 1000L;
                                    if (!class_f11.sub_a2a0(256) && (cGame.sub_4ac19(20) || cGame.sub_4abbb(cGame.var_80f4[20]))) {
                                        if (n15 > class_f11.var_1625 * 3 / 4 && class_f11.var_161d > 0L && !class_f11.var_165d) {
                                            class_f11.var_165d = true;
                                            if (!class_f11.var_1655) {
                                                if (GLLib.Math_Rand(0, 100) < 35) {
                                                    class_f11.sub_85b3(256);
                                                    class_f11.var_1655 = true;
                                                }
                                            }
                                        }
                                        else if (n15 > class_f11.var_1625 >> 1 && class_f11.var_161d > 0L && !class_f11.var_1665) {
                                            class_f11.var_1665 = true;
                                            if (!class_f11.var_1655) {
                                                if (GLLib.Math_Rand(0, 100) < 35) {
                                                    class_f11.sub_85b3(256);
                                                    class_f11.var_1655 = true;
                                                }
                                            }
                                        }
                                        else if (n15 > class_f11.var_1625 >> 2 && class_f11.var_161d > 0L && !class_f11.var_166d) {
                                            class_f11.var_166d = true;
                                            if (!class_f11.var_1655 && GLLib.Math_Rand(0, 100) < 35) {
                                                class_f11.sub_85b3(256);
                                                class_f11.var_1655 = true;
                                            }
                                        }
                                    }
                                    if (n15 >= class_f11.var_1625 && class_f11.var_161d != 0L) {
                                        if (cGame.s_tutorialState == 35) {
                                            cGame.s_hasFinishedTut = true;
                                        }
                                        if (cGame.s_tutorialState != 34) {
                                            class_f11.sub_85b3(16);
                                            cGame.sub_11320(false, null);
                                        }
                                    }
                                    if (cGame.var_8034 == class_f11 && class_f11.var_1625 != 0) {
                                        cGame.sub_df48((int)n15, class_f11.var_1625);
                                        class_f11.m_prepareTime = cGame.sub_e1e7((int)(class_f11.var_1625 - n15));
                                    }
                                }
                                if (class_f11.sub_a2a0(4) && (class_f11.var_1895 == null || class_f11.var_1895.var_17c5 == -1)) {
                                    class_f11.sub_85b3(4);
                                }
                                else if (class_f11.sub_a2a0(16) && (class_f11.var_1895 == null || class_f11.var_1895.var_17c5 == -1)) {
                                    class_f11.sub_85b3(16);
                                }
                                else if (class_f11.sub_a2a0(256) && (class_f11.var_1895 == null || class_f11.var_1895.var_17c5 == -1)) {
                                    class_f11.sub_85b3(256);
                                }
                                else if (!cGame.var_6a04 && !cGame.sndPlayingOnChannel(0)) {
                                    if ((cGame.var_6aac == null || cGame.var_6aac != class_f11) && class_f11.sub_b03e() && GLLib.Math_Rand(0, 100) < 10) {
                                        cGame.sub_23d1d(class_f11.var_18d5);
                                        cGame.var_6a04 = true;
                                        cGame.var_6a1c = 0;
                                    }
                                }
                                else if (cGame.var_6a04 && cGame.var_6a1c >= cGame.var_6a74) {
                                    cGame.var_6a04 = false;
                                }
                                else if (cGame.var_6a04 && cGame.var_6a1c < cGame.var_6a74) {
                                    ++cGame.var_6a1c;
                                }
                            }
                        }
                        break;
                    }
                    case 49: {
                        final Class_f class_f14;
                        if ((class_f14 = class_f).var_18b5 != null) {
                            class_f14.var_18b5.Update(GLLib.s_game_frameDT);
                        }
                        if (class_f14.var_185d == 3) {
                            final long n16;
                            if ((n16 = (System.currentTimeMillis() - class_f14.var_15e5) / 1000L) >= class_f14.var_15ed / 2 && cGame.s_tutorialState != 8 && cGame.s_tutorialState != 45) {
                                class_f14.sub_7795(4);
                            }
                            if (cGame.var_8034 == class_f14 && class_f14.var_15ed != 0) {
                                cGame.sub_df48((int)n16, class_f14.var_15ed);
                                class_f14.m_prepareTime = cGame.sub_e1e7((int)(class_f14.var_15ed - n16));
                            }
                        }
                        else if (class_f14.var_185d == 4) {
                            final long n17;
                            if ((n17 = (System.currentTimeMillis() - class_f14.var_15e5) / 1000L) >= class_f14.var_15ed && (cGame.s_tutorialState < 46 || cGame.s_tutorialState > 57) && cGame.s_tutorialState != 8 && cGame.s_tutorialState != 45) {
                                class_f14.sub_7795(5);
                            }
                            if (cGame.var_8034 == class_f14 && class_f14.var_15ed != 0) {
                                cGame.sub_df48((int)n17, class_f14.var_15ed);
                                class_f14.m_prepareTime = cGame.sub_e1e7((int)(class_f14.var_15ed - n17));
                            }
                        }
                        else if (cGame.var_8034 == class_f14) {
                            cGame.sub_11320(false, null);
                        }
                        if ((class_f14.var_18b5 == null || class_f14.var_18b5.GetSprite() != cGame.s_gameSprites[16]) && class_f14.var_185d == 5) {
                            (class_f14.var_18b5 = new GLLibPlayer(cGame.s_gameSprites[16], class_f14.var_17ed, class_f14.var_17f5)).SetAnim(0, -1);
                            class_f14.var_18b5.setSprPalette(0);
                        }
                        else if (class_f14.var_18b5 != null && class_f14.var_185d != 5 && class_f14.var_18b5.GetSprite() == cGame.s_gameSprites[16]) {
                            class_f14.var_18b5 = null;
                        }
                        if (class_f14.var_18b5 != null && class_f14.var_185d == 5) {
                            int n18 = 0;
                            if (class_f14.sub_a2a0(1024)) {
                                n18 = 1;
                            }
                            if (class_f14.var_18b5.GetSprite().GetCurrentPalette() != n18) {
                                class_f14.var_18b5.GetSprite().SetCurrentPalette(n18);
                            }
                        }
                        break;
                    }
                    case 52: {
                        final Class_f class_f15;
                        if ((class_f15 = class_f).var_185d == 2) {
                            final long n19;
                            if ((n19 = (System.currentTimeMillis() - class_f15.var_1615) / 1000L) >= class_f15.var_191d) {
                                class_f15.sub_7b13(3);
                            }
                            if (cGame.var_8034 == class_f15 && class_f15.var_191d != 0) {
                                cGame.sub_df48((int)n19, class_f15.var_191d);
                                class_f15.m_prepareTime = cGame.sub_e1e7((int)(class_f15.var_191d - n19));
                            }
                            break;
                        }
                        if (cGame.var_8034 == class_f15) {
                            cGame.sub_11320(false, null);
                        }
                        break;
                    }
                    case 21: {
                        class_f.sub_8ed0();
                        break;
                    }
                    case 47: {
                        class_f.sub_87a1();
                        break;
                    }
                    case 22: {
                        final Class_f class_f16;
                        if ((class_f16 = class_f).var_185d != 0) {
                            if (class_f16.var_189d.IsAnimOver()) {
                                class_f16.var_189d.SetAnim(0, -1);
                            }
                            class_f16.sub_605f();
                        }
                        break;
                    }
                    case 23: {
                        final Class_f class_f17;
                        if ((class_f17 = class_f).var_189d != null && class_f17.var_189d.IsAnimOver() && (Class_f.var_1785 == -1 || Class_f.var_1785 < Class_f.var_178d)) {
                            class_f17.var_189d.SetAnim(1, 1);
                            final int sub_312c = class_f17.var_189d.GetSprite().GetFrameWidth(0);
                            final int sub_1924 = class_f17.var_189d.GetSprite().GetFrameHeight(0);
                            class_f17.var_17cd = Class_f.var_1795 + GLLib.Math_Rand(-sub_312c, sub_312c);
                            class_f17.var_17d5 = Class_f.var_179d + GLLib.Math_Rand(-sub_1924, sub_1924);
                            if (Class_f.var_1785 > -1) {
                                ++Class_f.var_1785;
                            }
                            break;
                        }
                        if (class_f17.var_189d != null && class_f17.var_189d.IsAnimOver() && Class_f.var_1785 >= Class_f.var_178d) {
                            class_f17.var_189d = null;
                            class_f17.var_17c5 = -1;
                            sub_5439(0, 23, new Class_f[1], 1);
                            sub_6cdb();
                            final Class_f[] array9 = { null };
                            sub_5439(0, 42, array9, 1);
                            array9[0].sub_60d7(3);
                            cGame.playSndNoLoop(34);
                            sub_904a(3);
                        }
                        break;
                    }
                    case 32: {
                        if (class_f.var_17cd != class_f.var_1845 || class_f.var_17d5 != class_f.var_184d) {
                            class_f.sub_a392();
                            break;
                        }
                        break;
                    }
                    case 33: {
                        class_f.var_17cd = class_f.var_1895.var_17cd;
                        class_f.var_17d5 = class_f.var_1895.var_17d5;
                        if (class_f.var_189d != null && class_f.var_189d.IsAnimOver()) {
                            class_f.var_189d = null;
                            break;
                        }
                        break;
                    }
                    case -1: {
                        class_f.sub_4bf4();
                        break;
                    }
                }
                if (class_f.var_17c5 != 10 && class_f.var_17c5 != 13) {
                    class_f.sub_605f();
                    if (class_f.var_189d != null) {
                        class_f.var_189d.SetPos(class_f.var_17ed, class_f.var_17f5);
                    }
                }
            }
        }
    }
    
    static void sub_3bcd() {
        for (int i = 0; i < 5; ++i) {
            final int n = i;
            for (Class_f var_17ad = Class_f.var_157d[n]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
                final Class_f class_f;
                if ((class_f = var_17ad).var_187d > -1 && class_f.sub_a2a0(16777224)) {
                    class_f.sub_5bd2(class_f.var_187d, class_f.var_1885);
                }
            }
            for (Class_f var_17ad2 = Class_f.var_157d[n]; var_17ad2 != null; var_17ad2 = var_17ad2.var_17ad) {
                final Class_f class_f;
                if ((class_f = var_17ad2).var_17c5 == 10) {
                    if (cGame.var_800c.var_17d5 < 576) {
                        int n2 = 138;
                        if (cGame.s_zoomLevel != 100) {
                            GLLib.sub_5b71();
                            GLLib.Custom_SetZoomLevel(cGame.s_zoomLevel);
                            n2 = 138 * cGame.s_zoomLevel / 100;
                        }
                        GLLibPlayer.s_TilesetLayerGraphics[0][0].setColor(-15682062);
                        GLLibPlayer.sub_60d3(0, 0, GLLibPlayer.sub_5cb3(), n2, cGame.var_8074);
                        final int sub_5cb3 = GLLibPlayer.sub_5cb3();
                        int n3 = 800;
                        int n4 = 321;
                        if (cGame.s_zoomLevel != 100) {
                            n3 = 800 * cGame.s_zoomLevel / 100;
                            n4 = 321 * cGame.s_zoomLevel / 100;
                        }
                        for (int j = 0; j < sub_5cb3; j += n3) {
                            if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(79)) {
                                GLLib.sub_5b96();
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[79], cGame.s_gameSprites[79].GetFrames() / 2, j, n4, cGame.var_8074, null);
                                GLLib.sub_5b71();
                            }
                            else {
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[79], 0, j, n4, cGame.var_8074, null);
                            }
                        }
                        int n5 = 240;
                        int n6 = 536;
                        if (cGame.s_zoomLevel != 100) {
                            n5 = 240 * cGame.s_zoomLevel / 100;
                            n6 = 536 * cGame.s_zoomLevel / 100;
                        }
                        for (int k = 0; k < sub_5cb3; k += n5) {
                            if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(78)) {
                                GLLib.sub_5b96();
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[78], cGame.s_gameSprites[78].GetFrames() / 2, k, n6, cGame.var_8074, null);
                                GLLib.sub_5b71();
                            }
                            else {
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[78], 0, k, n6, cGame.var_8074, null);
                            }
                        }
                        int n7 = 400;
                        int n8 = 576;
                        if (cGame.s_zoomLevel != 100) {
                            n7 = 400 * cGame.s_zoomLevel / 100;
                            n8 = 576 * cGame.s_zoomLevel / 100;
                        }
                        for (int l = 0; l < sub_5cb3; l += n7) {
                            if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(77)) {
                                GLLib.sub_5b96();
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[77], cGame.s_gameSprites[77].GetFrames() / 2, l, n8, cGame.var_8074, null);
                                GLLib.sub_5b71();
                            }
                            else {
                                GLLibPlayer.sub_6133(0, cGame.s_gameSprites[77], 0, l, n8, cGame.var_8074, null);
                            }
                        }
                        if (cGame.s_zoomLevel != 100) {
                            GLLib.sub_5b96();
                        }
                    }
                }
                else if (class_f.sub_a2a0(16777224) && class_f.var_1865 > -1 && class_f.var_186d > -1) {
                    class_f.sub_5bd2(class_f.var_1865, class_f.var_186d);
                }
            }
            for (Class_f var_17ad3 = Class_f.var_157d[n]; var_17ad3 != null; var_17ad3 = var_17ad3.var_17ad) {
                final Class_f class_f;
                if ((class_f = var_17ad3).var_17c5 == 10) {
                    GLLibPlayer.Tileset_Draw(GLLib.g, 0, 0, 0);
                }
                else if (class_f.sub_a2a0(8)) {
                    if (!class_f.sub_a2a0(16777216) || class_f.var_189d != null) {
                        int var_1875 = class_f.var_1875;
                        if (class_f.var_189d != null) {
                            if (class_f.sub_a2a0(65536)) {
                                var_1875 += class_f.var_189d.GetSprite()._palettes >> 1;
                            }
                            if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(class_f.var_1865)) {
                                final ASprite sub_17f3;
                                (sub_17f3 = class_f.var_189d.GetSprite()).SetCurrentPalette(var_1875);
                                sub_17f3.PaintAFrame(GLLib.g, sub_17f3.sub_36dd() / 2 + class_f.var_189d.GetAnim(), class_f.var_189d.GetFrame(), class_f.var_17ed, class_f.var_17f5, 0);
                            }
                            else {
                                class_f.var_189d.GetSprite().SetCurrentPalette(var_1875);
                                class_f.var_189d.SetPos(class_f.var_17ed, class_f.var_17f5);
                                class_f.var_189d.SetZoomLevel(cGame.s_zoomLevel);
                                class_f.var_189d.Render();
                            }
                            if (class_f.sub_a2a0(33554432)) {
                                cGame.s_gameSprites[class_f.var_1865].sub_354b(Class_f.var_1905, class_f.var_189d.GetAnim(), class_f.var_189d.GetFrame(), class_f.var_17cd, class_f.var_17d5, class_f.var_189d.curFlags);
                                if (cGame.s_zoomLevel != 100) {
                                    Class_f.var_1905[0] = Class_f.var_1905[0] * cGame.s_zoomLevel / 100;
                                    Class_f.var_1905[1] = Class_f.var_1905[1] * cGame.s_zoomLevel / 100;
                                    Class_f.var_1905[2] = Class_f.var_1905[2] * cGame.s_zoomLevel / 100;
                                    Class_f.var_1905[3] = Class_f.var_1905[3] * cGame.s_zoomLevel / 100;
                                }
                                sub_4854(Class_f.var_1905[0], Class_f.var_1905[1], Class_f.var_1905[2], Class_f.var_1905[3]);
                            }
                        }
                        else {
                            if (class_f.var_187d > -1) {
                                class_f.sub_5f3b(class_f.var_187d, class_f.var_1885);
                            }
                            if (class_f.var_1865 > -1) {
                                class_f.sub_5f3b(class_f.var_1865, class_f.var_186d);
                            }
                        }
                    }
                    else if (class_f.var_1865 > -1 && class_f.var_186d > -1) {
                        final int var_1876;
                        final int n9 = (var_1876 = class_f.var_1865) & 0x7FFF;
                        final ASprite class_e = ((var_1876 & 0x8000) != 0x0) ? cGame.var_68d4[n9] : cGame.s_gameSprites[n9];
                        int var_1877 = class_f.var_1875;
                        if (class_f.sub_a2a0(65536)) {
                            var_1877 += class_e._palettes >> 1;
                        }
                        class_e.SetCurrentPalette(var_1877);
                        final ASprite class_e2 = class_e;
                        class_e2.sub_3524(Class_f.var_1905, class_f.var_186d, class_f.var_17cd, class_f.var_17d5);
                        if (cGame.s_zoomLevel != 100) {
                            Class_f.var_1905[0] = Class_f.var_1905[0] * cGame.s_zoomLevel / 100;
                            Class_f.var_1905[1] = Class_f.var_1905[1] * cGame.s_zoomLevel / 100;
                            Class_f.var_1905[2] = Class_f.var_1905[2] * cGame.s_zoomLevel / 100;
                            Class_f.var_1905[3] = Class_f.var_1905[3] * cGame.s_zoomLevel / 100;
                        }
                        for (int n10 = 0; n10 < Class_f.var_1915; ++n10) {
                            if (Class_f.var_1905[2] >= Class_f.var_190d[n10][0] && Class_f.var_1905[0] <= Class_f.var_190d[n10][2] && Class_f.var_1905[3] >= Class_f.var_190d[n10][1] && Class_f.var_1905[1] <= Class_f.var_190d[n10][3]) {
                                final int[] array = new int[2];
                                final int[] array2 = new int[2];
                                array[0] = Class_f.var_190d[n10][2];
                                array[1] = Class_f.var_190d[n10][3];
                                cGame.sub_264d4(array, array2);
                                cGame.sub_264d4(Class_f.var_190d[n10], array);
                                GLLib.SetClip(GLLib.g, array[0], array[1], array2[0] - array[0], array2[1] - array[1], true);
                                if (cGame.s_zoomLevel == 100) {
                                    class_e2.PaintFrame(GLLib.g, class_f.var_186d, class_f.var_17ed, class_f.var_17f5, 0);
                                }
                                else if (cGame.sub_438b0(class_f.var_1865)) {
                                    class_e2.PaintFrame(GLLib.g, class_e2.GetFrames() / 2 + class_f.var_186d, class_f.var_17ed, class_f.var_17f5, 0);
                                }
                                else {
                                    class_e2.PaintFrameWithZoom(GLLib.g, class_f.var_186d, class_f.var_17ed, class_f.var_17f5, cGame.s_zoomLevel);
                                }
                                GLLib.SetClip(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
                            }
                        }
                    }
                    if (class_f.var_17c5 == 47) {
                        class_f.sub_8d93();
                    }
                }
                switch (class_f.var_17c5) {
                    case 54: {
                        if (class_f.sub_a2a0(8)) {
                            break;
                        }
                        final int sub_1922;
                        if (((sub_1922 = class_f.var_189d.GetAnim()) == 1 || sub_1922 == 6 || sub_1922 == 2 || sub_1922 == 7) && cGame.var_68d4[1] != null) {
                            int n11 = class_f.var_17ed + class_f.var_16ad;
                            final int n12 = class_f.var_17f5 + class_f.var_16b5;
                            if (cGame.s_zoomLevel == 100) {
                                cGame.var_68d4[1].PaintFrame(GLLib.g, 34, n11, n12, 0);
                            }
                            else {
                                n11 += 10;
                                cGame.var_68d4[1].PaintFrameWithZoom(GLLib.g, 34, n11, n12, cGame.s_zoomLevel);
                            }
                        }
                        if (!class_f.sub_a2a0(2048)) {
                            break;
                        }
                        final int n13 = class_f.var_17ed + 5;
                        int n14 = class_f.var_17f5 - 80;
                        if (cGame.s_zoomLevel == 100) {
                            cGame.var_68d4[1].PaintFrame(GLLib.g, 64, n13, n14, 0);
                            break;
                        }
                        n14 += 40;
                        cGame.var_68d4[1].PaintFrameWithZoom(GLLib.g, 64, n13, n14, cGame.s_zoomLevel);
                        break;
                    }
                }
                if (class_f.var_18bd && cGame.var_6aac == class_f) {
                    final Class_f class_f7 = class_f;
                    final int var_1878 = class_f.var_1825;
                    final ASprite class_e3 = cGame.s_gameSprites[14];
                    final int n15 = var_1878;
                    final ASprite class_e4 = class_e3;
                    final Class_f class_f8 = class_f7;
                    boolean b;
                    if (class_e4 != null && n15 > -1) {
                        final int n16 = class_f8.var_17ed + class_e4.sub_31e6(n15);
                        final int n17 = class_f8.var_17f5 + class_e4.sub_3238(n15);
                        final int n18 = n16 + class_e4.GetFrameWidth(n15);
                        final int n19 = n17 + class_e4.GetFrameHeight(n15);
                        final int n20 = 0 + GLLib.s_screenWidth;
                        final int n21 = 0 + GLLib.s_screenHeight;
                        b = (n18 > 0 && n16 < n20 && n19 > 0 && n17 < n21);
                    }
                    else {
                        b = false;
                    }
                    if (b && cGame.sub_2cad2(class_f)) {
                        if (cGame.s_zoomLevel == 100) {
                            cGame.s_gameSprites[14].PaintFrame(GLLib.g, class_f.var_1825, class_f.var_17ed, class_f.var_17f5, 0);
                        }
                        else {
                            cGame.s_gameSprites[14].PaintFrameWithZoom(GLLib.g, class_f.var_1825, class_f.var_17ed, class_f.var_17f5, cGame.s_zoomLevel);
                        }
                    }
                }
            }
            for (Class_f var_17ad4 = Class_f.var_157d[n]; var_17ad4 != null; var_17ad4 = var_17ad4.var_17ad) {
                final Class_f class_f9;
                if ((class_f9 = var_17ad4).var_18b5 != null) {
                    class_f9.var_18b5.SetPos(class_f9.var_17ed + class_f9.var_18a5, class_f9.var_17f5 + class_f9.var_18ad);
                    class_f9.var_18b5.SetZoomLevel(cGame.s_zoomLevel);
                    class_f9.var_18b5.Render();
                }
            }
        }
        cGame.var_8074 = false;
        Class_f.var_1915 = 0;
    }
    
    private static void sub_4854(final int n, final int n2, final int n3, final int n4) {
        if (Class_f.var_1915 >= 500) {
            Class_f.var_1915 = 0;
        }
        Class_f.var_190d[Class_f.var_1915][0] = n;
        Class_f.var_190d[Class_f.var_1915][1] = n2;
        Class_f.var_190d[Class_f.var_1915][2] = n3;
        Class_f.var_190d[Class_f.var_1915][3] = n4;
        ++Class_f.var_1915;
    }
    
    static void sub_48be() {
        for (int i = 0; i < 5; ++i) {
            final int n = i;
            while (Class_f.var_157d[n] != null) {
                Class_f.var_157d[n].sub_4bf4();
            }
        }
    }
    
    static void sub_4921() {
        for (Class_f var_17ad = Class_f.var_157d[2]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 47) {
                if (var_17ad != null && var_17ad.var_16fd == 37) {
                    cGame.addExperience(var_17ad.var_1725);
                }
                else if (var_17ad.var_16fd == 36) {
                    cGame.addCoin(var_17ad.var_1725);
                }
                else if (var_17ad.var_16fd == 6) {
                    cGame.addCash(var_17ad.var_1725);
                }
                else if (var_17ad.var_16fd == 59) {
                    final int n = var_17ad.var_1725 & 0xFFFF;
                    final int n2 = var_17ad.var_1725 >> 16;
                    if (n == 110) {
                        cGame.sub_2e64f(n2);
                    }
                    else if (n == 5) {
                        cGame.sub_2e5a7(n2);
                    }
                    else if ((n < 111 || n > 116) && n >= 1 && n <= 26) {
                        cGame.sub_2da54(0, n, n2);
                    }
                }
            }
        }
    }
    
    private static void sub_4a43(final Class_f class_f, final int var_17bd) {
        class_f.var_17bd = var_17bd;
        class_f.var_17fd = class_f.sub_60b0();
        Class_f var_17b5 = null;
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[var_17bd]; var_17ad != null && class_f.var_17fd > var_17ad.sub_60b0(); var_17ad = var_17ad.var_17ad) {
            var_17b5 = var_17ad;
        }
        class_f.var_17b5 = var_17b5;
        class_f.var_17ad = var_17ad;
        if (var_17b5 == null) {
            Class_f.var_157d[var_17bd] = class_f;
        }
        else {
            var_17b5.var_17ad = class_f;
        }
        if (var_17ad != null) {
            var_17ad.var_17b5 = class_f;
        }
    }
    
    static void sub_4b09(final int n) {
        Class_f class_f = Class_f.var_157d[0];
        Class_f var_17ad = null;
        while (class_f != null) {
            final Class_f var_17ad2 = class_f.var_17ad;
            final int sub_60b0;
            if ((sub_60b0 = class_f.sub_60b0()) != class_f.var_17fd) {
                class_f.var_17fd = sub_60b0;
                class_f.sub_4bf4();
                class_f.var_17ad = var_17ad;
                var_17ad = class_f;
            }
            class_f = var_17ad2;
        }
        while (var_17ad != null) {
            final Class_f var_17ad3 = var_17ad.var_17ad;
            sub_4a43(var_17ad, 0);
            var_17ad = var_17ad3;
        }
    }
    
    static void sub_4ba6(final int n) {
        Class_f var_17ad;
        for (Class_f class_f = Class_f.var_157d[0]; class_f != null; class_f = var_17ad) {
            var_17ad = class_f.var_17ad;
            class_f.var_17fd = 0;
        }
    }
    
    final void sub_4bf4() {
        if (this.sub_a2a0(16777216)) {
            this.sub_aac5();
        }
        if (this.var_17b5 != null) {
            this.var_17b5.var_17ad = this.var_17ad;
        }
        else if (this.var_17bd >= 0) {
            Class_f.var_157d[this.var_17bd] = this.var_17ad;
        }
        if (this.var_17ad != null) {
            this.var_17ad.var_17b5 = this.var_17b5;
        }
        this.var_17bd = -1;
        this.var_17ad = null;
        this.var_17b5 = null;
    }
    
    private static int sub_4c91(final int n, final int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        int n3 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == n2) {
                ++n3;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n3;
    }
    
    static int sub_4cf5(final int n, final int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        int n3 = 0;
        while (var_17ad != null) {
            if ((n2 == -1 || var_17ad.var_17c5 == n2) && var_17ad.sub_a2a0(512)) {
                ++n3;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n3;
    }
    
    static int sub_4d73(final int n, final int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        int n3 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_18c5 == n2 && var_17ad.sub_a2a0(512)) {
                ++n3;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n3;
    }
    
    static int sub_4de1(final int n, int n2, final int n3, final int n4) {
        Class_f var_17ad = Class_f.var_157d[0];
        n2 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512) && var_17ad.var_1835 % 2 == 1 && var_17ad.var_1835 >= n3 && var_17ad.var_1835 <= n4) {
                ++n2;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static int sub_4e6d(final int n, int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        n2 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 52 && var_17ad.sub_a2a0(512)) {
                ++n2;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static int sub_4ed9(final int n, int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        n2 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512) && var_17ad.var_1835 % 2 == 1 && var_17ad.sub_a2a0(2048)) {
                ++n2;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static Class_f sub_4f59() {
        return sub_4f79(0, -1);
    }
    
    static Class_f sub_4f79(final int n, final int n2) {
        if (Class_f.var_157d != null) {
            Class_f class_f;
            for (Class_f var_17ad = class_f = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
                if ((n2 == -1 || var_17ad.var_17c5 == n2) && var_17ad.sub_a2a0(512) && var_17ad.sub_a06e()) {
                    return var_17ad;
                }
                class_f = var_17ad;
            }
            for (Class_f var_17b5 = class_f; var_17b5 != null; var_17b5 = var_17b5.var_17b5) {
                if ((n2 == -1 || var_17b5.var_17c5 == n2) && var_17b5.sub_a2a0(512) && var_17b5.sub_9fbb()) {
                    return var_17b5;
                }
            }
        }
        return null;
    }
    
    static int sub_506a(final Class_f[] array, final int n) {
        int n2 = 0;
        if (Class_f.var_157d != null) {
            for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
                if (var_17ad.sub_a2a0(512) && (var_17ad.sub_a06e() || var_17ad.sub_9fbb())) {
                    array[n2] = var_17ad;
                    ++n2;
                }
            }
        }
        return n2;
    }
    
    static Class_f sub_50f9() {
        Class_f class_f = null;
        if (Class_f.var_157d != null) {
            for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
                if (var_17ad.sub_a2a0(512) && (var_17ad.sub_a06e() || var_17ad.sub_9fbb())) {
                    if (var_17ad.var_17c5 == 54) {
                        class_f = var_17ad;
                        if (var_17ad.sub_a2a0(4) || var_17ad.sub_a2a0(16) || var_17ad.sub_a2a0(256)) {
                            return var_17ad;
                        }
                    }
                    else if (var_17ad.var_17c5 == 49 || var_17ad.var_17c5 == 52) {
                        if (class_f == null) {
                            final boolean b = var_17ad.var_17c5 == 49 && var_17ad.var_185d == 5;
                            final boolean b2 = var_17ad.var_17c5 == 52 && var_17ad.var_185d == 3;
                            if (b || b2) {
                                class_f = var_17ad;
                            }
                            else {
                                class_f = var_17ad;
                            }
                        }
                    }
                    else {
                        class_f = var_17ad;
                    }
                }
            }
        }
        if (cGame.var_6aa4 != -1 && cGame.var_6aac != null) {
            if (cGame.var_6aac == class_f) {
                return class_f;
            }
            if (cGame.var_6aac == class_f) {
                return class_f;
            }
            if (cGame.var_6aac == class_f) {
                return class_f;
            }
            if (cGame.var_6aac == class_f) {
                return class_f;
            }
        }
        if (class_f != null) {
            return class_f;
        }
        return class_f;
    }
    
    static Class_f sub_53db(final int n, final int n2) {
        for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_183d == n2) {
                return var_17ad;
            }
        }
        return null;
    }
    
    static int sub_5439(final int n, final int n2, final Class_f[] array, final int n3) {
        return sub_545c(n, n2, -1, array, n3);
    }
    
    static int sub_545c(final int n, final int n2, final int n3, final Class_f[] array, final int n4) {
        Class_f var_17ad;
        int n5;
        for (var_17ad = Class_f.var_157d[n], n5 = 0; var_17ad != null && n5 < n4; var_17ad = var_17ad.var_17ad) {
            if ((n2 == -1 || var_17ad.var_17c5 == n2) && (n3 == -1 || var_17ad.var_1835 == n3)) {
                array[n5++] = var_17ad;
            }
        }
        return n5;
    }
    
    static int sub_550f(final int n, int n2, final int n3, final int n4, final Class_f[] array, final int n5) {
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[0], n2 = 0; var_17ad != null && n2 < n5; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512) && var_17ad.var_1835 >= n3 && var_17ad.var_1835 <= n4 && var_17ad.var_1835 % 2 == 1) {
                array[n2++] = var_17ad;
            }
        }
        return n2;
    }
    
    static int sub_55b2(final int n, int n2, final int n3, final Class_f[] array) {
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[0], n2 = 0; var_17ad != null && n2 < 1; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 48 && var_17ad.sub_a2a0(512) && (n3 == -1 || var_17ad.var_1835 == n3)) {
                array[n2++] = var_17ad;
            }
        }
        return n2;
    }
    
    static int sub_564e(final int n, int n2, final int n3, final int n4, final Class_f[] array) {
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[0], n2 = 0; var_17ad != null && n2 < 1; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512) && var_17ad.var_18c5 >= n3 && var_17ad.var_18c5 <= n4 && var_17ad.var_18c5 % 2 == 1) {
                array[n2++] = var_17ad;
            }
        }
        return n2;
    }
    
    static int sub_56ed(final int n, int n2, final Class_f[] array, final Class_f class_f) {
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[0], n2 = 0; var_17ad != null && n2 < 50; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512) && cGame.sub_2cc02(var_17ad, class_f)) {
                array[n2++] = var_17ad;
            }
        }
        return n2;
    }
    
    static int sub_577d(final int n, final int n2, final int n3, final Class_f[] array, final int n4) {
        Class_f var_17ad;
        int n5;
        for (var_17ad = Class_f.var_157d[0], n5 = 0; var_17ad != null && n5 < n4; var_17ad = var_17ad.var_17ad) {
            if ((n2 == -1 || var_17ad.var_17c5 == n2) && (n3 == -1 || var_17ad.var_18c5 == n3)) {
                array[n5++] = var_17ad;
            }
        }
        return n5;
    }
    
    static int sub_5830(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class_f[] array, int n7) {
        Class_f var_17ad = Class_f.var_157d[0];
        n7 = 0;
        final int[] array2 = new int[2];
        final int[] array3 = new int[2];
        while (var_17ad != null && n7 < 100) {
            array2[0] = var_17ad.var_17cd;
            array2[1] = var_17ad.var_17d5;
            cGame.sub_2c867(array2, array3);
            if ((n2 == -1 || n2 == var_17ad.var_17c5) && var_17ad.var_17c5 != -1 && array3[0] >= n3 && array3[0] < n4 && array3[1] >= n5 && array3[1] < n6) {
                array[n7++] = var_17ad;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n7;
    }
    
    static void sub_5932(final int n) {
        for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
            final int[] array = new int[2];
            final int[] array2 = new int[2];
            array[0] = var_17ad.var_17cd;
            array[1] = var_17ad.var_17d5;
            cGame.sub_2c867(array, array2);
            if (cGame.sub_2d3f4(cGame.sub_2d213(array2[0], array2[1]))) {
                var_17ad.sub_a21a(512);
            }
            else {
                var_17ad.sub_a25c(512);
            }
        }
    }
    
    static int sub_59d2(final int n) {
        Class_f var_17ad = Class_f.var_157d[2];
        int n2 = 0;
        while (var_17ad != null) {
            final int n3;
            if (var_17ad.var_17c5 == 47 && var_17ad.var_16fd == 59 && (n3 = (var_17ad.var_1725 & 0xFFFF)) != 110 && n3 != 5 && (n3 < 111 || n3 > 116)) {
                n2 += var_17ad.var_1725 >> 16;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static int sub_5a6e(final int n) {
        Class_f var_17ad = Class_f.var_157d[2];
        int n2 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 47 && var_17ad.var_16fd == 37) {
                ++n2;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static int sub_5ad9(final int n, int n2) {
        Class_f var_17ad = Class_f.var_157d[0];
        n2 = 0;
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(512)) {
                n2 += var_17ad.var_182d;
            }
            var_17ad = var_17ad.var_17ad;
        }
        return n2;
    }
    
    static int sub_5b49(final int n, int n2, final int n3, final Class_f[] array) {
        Class_f var_17ad;
        for (var_17ad = Class_f.var_157d[0], n2 = 0; var_17ad != null && n2 < 1; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 54 && var_17ad.sub_a2a0(4096) && var_17ad.var_18c5 == n3) {
                array[n2++] = var_17ad;
            }
        }
        return n2;
    }
    
    private void sub_5bd2(int n, final int n2) {
        final int n3 = n & 0x7FFF;
        final ASprite class_e;
        if ((class_e = (((n & 0x8000) != 0x0) ? cGame.var_68d4[n3] : cGame.s_gameSprites[n3])) == null || n2 < 0) {
            return;
        }
        int var_17cd = this.var_17cd;
        int var_17d5 = this.var_17d5;
        if (cGame.s_zoomLevel != 100) {
            GLLib.sub_5b71();
            GLLib.Custom_SetZoomLevel(cGame.s_zoomLevel);
            var_17cd = var_17cd * cGame.s_zoomLevel / 100;
            var_17d5 = var_17d5 * cGame.s_zoomLevel / 100;
        }
        int var_1875 = this.var_1875;
        if (this.sub_a2a0(65536)) {
            var_1875 += class_e._palettes >> 1;
        }
        class_e.SetCurrentPalette(var_1875);
        if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(n)) {
            GLLib.sub_5b96();
            GLLibPlayer.sub_6133(0, class_e, class_e.GetFrames() / 2 + n2, var_17cd, var_17d5, cGame.var_8074, null);
            GLLib.sub_5b71();
        }
        else {
            GLLibPlayer.sub_6133(0, class_e, n2, var_17cd, var_17d5, cGame.var_8074, null);
        }
        if (n2 > -1) {
            final int n4 = n & 0x7FFF;
            final ASprite class_e2;
            (class_e2 = (((n & 0x8000) != 0x0) ? cGame.var_68d4[n4] : cGame.s_gameSprites[n4])).sub_3524(Class_f.var_1905, n2, this.var_17cd, this.var_17d5);
            if (cGame.s_zoomLevel != 100) {
                Class_f.var_1905[0] = Class_f.var_1905[0] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[1] = Class_f.var_1905[1] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[2] = Class_f.var_1905[2] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[3] = Class_f.var_1905[3] * cGame.s_zoomLevel / 100;
            }
            for (int i = 0; i < Class_f.var_1915; ++i) {
                if (Class_f.var_1905[2] >= Class_f.var_190d[i][0] && Class_f.var_1905[0] <= Class_f.var_190d[i][2] && Class_f.var_1905[3] >= Class_f.var_190d[i][1] && Class_f.var_1905[1] <= Class_f.var_190d[i][3]) {
                    int var_17cd2 = this.var_17cd;
                    int var_17d6 = this.var_17d5;
                    if (cGame.s_zoomLevel != 100) {
                        var_17cd2 = var_17cd2 * cGame.s_zoomLevel / 100;
                        var_17d6 = var_17d6 * cGame.s_zoomLevel / 100;
                    }
                    int var_1876 = this.var_1875;
                    if (this.sub_a2a0(65536)) {
                        var_1876 += class_e2._palettes >> 1;
                    }
                    class_e2.SetCurrentPalette(var_1876);
                    if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(n)) {
                        GLLib.sub_5b96();
                        GLLibPlayer.sub_6133(0, class_e2, class_e2.GetFrames() / 2 + n2, var_17cd2, var_17d6, true, Class_f.var_190d[i]);
                        GLLib.sub_5b71();
                    }
                    else {
                        GLLibPlayer.sub_6133(0, class_e2, n2, var_17cd2, var_17d6, true, Class_f.var_190d[i]);
                    }
                }
            }
        }
        if (cGame.s_zoomLevel != 100) {
            GLLib.sub_5b96();
        }
    }
    
    private void sub_5f3b(int n, final int frame2) {
        final int n3 = n & 0x7FFF;
        final ASprite class_e = ((n & 0x8000) != 0x0) ? cGame.var_68d4[n3] : cGame.s_gameSprites[n3];
        int palette = this.var_1875;
        if (class_e == null || frame2 < 0) {
            return;
        }
        if (this.sub_a2a0(65536)) {
            palette += class_e._palettes >> 1;
        }
        class_e.SetCurrentPalette(palette);
        if (cGame.s_zoomLevel == 100) {
            class_e.PaintFrame(GLLib.g, frame2, this.var_17ed, this.var_17f5, 0);
            return;
        }
        if (cGame.s_zoomLevel < 100 && cGame.sub_438b0(n)) {
            n = class_e.GetFrames() / 2 + frame2;
            class_e.PaintFrame(GLLib.g, n, this.var_17ed, this.var_17f5, 0);
            return;
        }
        class_e.PaintFrameWithZoom(GLLib.g, frame2, this.var_17ed, this.var_17f5, cGame.s_zoomLevel);
    }
    
    final void sub_605f() {
        this.var_17ed = (this.var_17cd + this.var_1805) * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17cd;
        this.var_17f5 = (this.var_17d5 + this.var_180d) * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17d5;
    }
    
    private int sub_60b0() {
        return (this.var_17dd << 20) + this.var_17d5;
    }
    
    final void sub_60d7(int var_185d) {
        int anim = 0;
        int loop = -1;
        switch (var_185d) {
            case 0: {
                anim = 2;
                break;
            }
            case 1: {
                if (this.var_1845 > this.var_17cd) {
                    this.var_18f5 = false;
                    if (this.var_184d > this.var_17d5) {
                        anim = 0;
                        this.var_18fd = false;
                    }
                    else {
                        anim = 1;
                        this.var_18fd = true;
                    }
                }
                else {
                    this.var_18f5 = true;
                    if (this.var_184d > this.var_17d5) {
                        anim = 0;
                        this.var_18fd = false;
                    }
                    else {
                        anim = 1;
                        this.var_18fd = true;
                    }
                }
                cGame.playSndNoLoop(54);
                break;
            }
            case 2: {
                int n3 = 0;
                switch (cGame.var_70b4[cGame.var_70cc]) {
                    case 5: {
                        anim = 3;
                        n3 = -1;
                        break;
                    }
                    case 2: {
                        anim = 3;
                        if (cGame.var_70c4[cGame.var_70cc] != null && (cGame.var_70c4[cGame.var_70cc].var_1835 == 0 || cGame.var_70c4[cGame.var_70cc].var_1835 == 51 || cGame.var_70c4[cGame.var_70cc].var_1835 == 52)) {
                            n3 = 23;
                            break;
                        }
                        if (cGame.var_70c4[cGame.var_70cc] != null && (cGame.var_70c4[cGame.var_70cc].var_1835 == 1 || cGame.var_70c4[cGame.var_70cc].var_1835 == 53 || cGame.var_70c4[cGame.var_70cc].var_1835 == 54)) {
                            n3 = 41;
                            break;
                        }
                        n3 = 41;
                        break;
                    }
                    case 6: {
                        anim = 3;
                        n3 = 23;
                        break;
                    }
                    case 0: {
                        anim = 4;
                        n3 = 47;
                        break;
                    }
                    case 1: {
                        anim = 4;
                        n3 = 40;
                        break;
                    }
                    case 3: {
                        anim = 6;
                        n3 = 36;
                        break;
                    }
                    case 4: {
                        anim = 4;
                        n3 = -1;
                        this.var_18fd = false;
                        this.var_18f5 = false;
                        break;
                    }
                    default: {
                        anim = 2;
                        n3 = 54;
                        break;
                    }
                }
                loop = 1;
                if (n3 != -1) {
                    cGame.playSndNoLoop(n3);
                    break;
                }
                break;
            }
            case 3: {
                anim = 7;
                loop = 3;
                break;
            }
        }
        this.var_185d = var_185d;
        if ((!this.var_18f5 && !this.var_18fd) || (this.var_18f5 && this.var_18fd)) {
            var_185d = 1;
        }
        else {
            var_185d = 0;
        }
        this.var_189d.SetAnim(anim, loop);
        if (var_185d != 0) {
            this.var_189d.SetTransform(2);
            return;
        }
        this.var_189d.SetTransform(0);
    }
    
    final void sub_6426() {
        int n;
        if (this.var_1845 > this.var_17cd) {
            this.var_18f5 = false;
            if (this.var_184d > this.var_17d5) {
                n = 0;
                this.var_18fd = false;
            }
            else {
                n = 1;
                this.var_18fd = true;
            }
        }
        else {
            this.var_18f5 = true;
            if (this.var_184d > this.var_17d5) {
                n = 0;
                this.var_18fd = false;
            }
            else {
                n = 1;
                this.var_18fd = true;
            }
        }
        final boolean b = (!this.var_18f5 && !this.var_18fd) || (this.var_18f5 && this.var_18fd);
        this.var_189d.SetAnim(n, -1);
        if (b) {
            this.var_189d.SetTransform(2);
            return;
        }
        this.var_189d.SetTransform(0);
    }
    
    final boolean sub_6533() {
        boolean b = false;
        if (this.var_185d == 3) {
            return false;
        }
        if (cGame.var_70d4 == 0 && cGame.sub_2c4ff() < 50) {
            final int[] array = new int[2];
            final int[] array2;
            (array2 = new int[2])[0] = GLLib.s_screenX;
            array2[1] = GLLib.s_screenY;
            cGame.sub_26427(array2, array);
            cGame.sub_2c867(array, array2);
            if (GLLib.sub_762d() && cGame.var_6aa4 == -1) {
                if (cGame.sub_2ceb1(array2[0], array2[1])) {
                    b = true;
                    final int[] array3 = new int[2];
                    int[] array4 = new int[2];
                    array4[0] = GLLib.s_screenX;
                    array4[1] = GLLib.s_screenY;
                    cGame.sub_26427(array4, array3);
                    this.sub_66d8(array3[0], array3[1]);
                }
                else if (cGame.var_807c == 0 && cGame.sub_2d213(array2[0], array2[1]) > 0) {
                    final int sub_2d213;
                    if ((sub_2d213 = cGame.sub_2d213(array2[0], array2[1])) >= 1 && !cGame.var_6d5c[sub_2d213] && cGame.s_tutorialState == -1 && cGame.sub_4abbb(cGame.var_80f4[0]) && cGame.sub_4abbb(cGame.var_80f4[1])) {
                        cGame.var_6d54 = sub_2d213;
                        cGame.switchToState(12);
                    }
                }
            }
            else if (cGame.var_807c == 0 && GLLib.sub_76f9() && !cGame.sub_2d3f4(cGame.sub_2d213(array2[0], array2[1])) && cGame.sub_2d213(array2[0], array2[1]) > 0 && cGame.var_6aa4 == -1 && cGame.sub_4abbb(cGame.var_80f4[0]) && cGame.sub_4abbb(cGame.var_80f4[1])) {
                final int sub_2d214 = cGame.sub_2d213(array2[0], array2[1]);
                if (cGame.sub_2d213(array2[0], array2[1]) > 0 && cGame.s_tutorialState == -1) {
                    cGame.var_6d54 = sub_2d214;
                    cGame.var_6df4 = true;
                }
            }
        }
        return b;
    }
    
    final void sub_66d8(final int var_1845, final int var_184d) {
        this.var_1845 = var_1845;
        this.var_184d = var_184d;
        this.sub_60d7(1);
        this.sub_ac99(this.var_1845, this.var_184d);
    }
    
    final void sub_670e(final int var_1845, final int var_184d) {
        this.var_1845 = var_1845;
        this.var_184d = var_184d;
        if (Math.abs(this.var_1845 - this.var_17cd) > 180 || Math.abs(this.var_184d - this.var_17d5) > 180) {
            this.var_17cd += (this.var_1845 - this.var_17cd) * 80 / 100;
            this.var_17d5 += (this.var_184d - this.var_17d5) * 80 / 100;
        }
        this.sub_60d7(1);
    }
    
    final void sub_67aa() {
        if (this.var_185d == 0) {
            if (GLLib.sub_7660()) {
                this.var_1585 = this.var_17cd;
                this.var_158d = this.var_17d5;
                this.m_screenX = GLLib.s_screenX;
                this.m_screenY = GLLib.s_screenY;
                this.var_15a5 = true;
                return;
            }
            if (GLLib.sub_7693() && this.var_15a5 && !cGame.var_6bec) {
                this.var_17cd = this.var_1585 + (this.m_screenX - GLLib.s_screenX);
                this.var_17d5 = this.var_158d + (this.m_screenY - GLLib.s_screenY);
                if (cGame.var_6af4 == 0 && !cGame.var_6bec) {
                    cGame.var_6af4 = -1;
                    cGame.sub_10e3f(false, 0, cGame.var_6b04);
                }
            }
            else if (GLLib.sub_762d()) {
                this.var_15a5 = false;
            }
        }
    }
    
    final void sub_6872() {
        if (this.var_185d == 0 && GLLib.sub_7693()) {
            if (GLLib.s_screenX < 40) {
                this.var_17cd -= 1 * GLLib.s_game_frameDT;
            }
            else if (GLLib.s_screenX > GLLib.s_screenWidth - 40) {
                this.var_17cd += 1 * GLLib.s_game_frameDT;
            }
            if (GLLib.s_screenY < 40) {
                this.var_17d5 -= 1 * GLLib.s_game_frameDT;
                return;
            }
            if (GLLib.s_screenY > GLLib.s_screenHeight - 40) {
                this.var_17d5 += 1 * GLLib.s_game_frameDT;
            }
        }
    }
    
    final void sub_692a() {
        if (cGame.s_clickblocked) {
            return;
        }
        if (this.var_185d == 0) {
            final int var_17cd = 0 * cGame.s_zoomLevel / 100;
            final int var_17d5 = 0 * cGame.s_zoomLevel / 100;
            final int var_17cd2 = this.var_15ad * cGame.s_zoomLevel / 100 - GLLib.s_screenWidth;
            final int var_17d6 = this.var_15b5 * cGame.s_zoomLevel / 100 - GLLib.s_screenHeight;
            if (this.var_17cd < var_17cd) {
                this.var_17cd = var_17cd;
            }
            else if (this.var_17cd > var_17cd2) {
                this.var_17cd = var_17cd2;
            }
            if (this.var_17d5 < var_17d5) {
                this.var_17d5 = var_17d5;
            }
            else if (this.var_17d5 > var_17d6) {
                this.var_17d5 = var_17d6;
            }
        }
        else if (this.var_185d == 1) {
            this.var_15bd -= GLLib.s_game_frameDT;
            final int[] array = new int[2];
            final int[] array2;
            (array2 = new int[2])[0] = GLLib.s_screenWidth >> 1;
            array2[1] = GLLib.s_screenHeight >> 1;
            cGame.sub_26427(array2, array);
            final int n = this.var_1845 - array[0];
            final int n2 = this.var_184d - array[1];
            int n3;
            if (this.var_15bd > 0) {
                if ((n3 = GLLib.s_game_frameDT * 100 / this.var_15bd) > 100) {
                    n3 = 100;
                }
            }
            else {
                this.var_15bd = 0;
                this.var_185d = 0;
                n3 = 100;
            }
            final int n4 = n * n3 / 100;
            final int n5 = n2 * n3 / 100;
            this.var_17cd += n4;
            this.var_17d5 += n5;
        }
        GLLibPlayer.sub_5a36(0, this.var_17cd, this.var_17d5);
    }
    
    final void sub_6adb(final int var_17cd, final int var_17d5) {
        this.var_17cd = var_17cd;
        this.var_17d5 = var_17d5;
        GLLibPlayer.sub_5a36(0, this.var_17cd, this.var_17d5);
    }
    
    final void sub_6b0c(final int var_1845, final int var_184d, final int var_15bd) {
        this.var_1845 = var_1845;
        this.var_184d = var_184d;
        this.var_185d = 1;
        this.var_15bd = var_15bd;
    }
    
    static void setZoomLevel(final int level) {
        if (cGame.s_zoomLevel != level) {
            final int newW = GLLib.s_screenWidth >> 1;
            final int newH = GLLib.s_screenHeight >> 1;
            final int n3 = (cGame.var_800c.var_17cd - newW * cGame.s_zoomLevel / 100 + newW) * 100 / cGame.s_zoomLevel;
            final int n4 = (cGame.var_800c.var_17d5 - newH * cGame.s_zoomLevel / 100 + newH) * 100 / cGame.s_zoomLevel;
            cGame.s_zoomLevel = level;
            cGame.loadMap();
            cGame.var_800c.var_17cd = (n3 + newW) * cGame.s_zoomLevel / 100 - newW;
            cGame.var_800c.var_17d5 = (n4 + newH) * cGame.s_zoomLevel / 100 - newH;
        }
    }
    
    static void sub_6bd7() {
        cGame.var_6c64 = 1;
        final Class_f[] array = { null };
        sub_545c(0, 50, 18, array, 1);
        if (array[0] != null) {
            Class_f.var_1795 = array[0].var_17cd;
            Class_f.var_179d = array[0].var_17d5;
        }
        cGame.playSndNoLoop(31);
        Class_f.var_1785 = 0;
        Class_f.var_178d = 4;
        if (sub_4c91(0, 23) > 0) {
            final Class_f[] array2 = { null };
            sub_5439(0, 23, array2, 1);
            (array2[0].var_189d = new GLLibPlayer(cGame.s_gameSprites[13], array2[0].var_17cd, array2[0].var_17d5)).SetAnim(1, 1);
            return;
        }
        final Class_f sub_92ea = sub_92ea(23, 0, new int[] { Class_f.var_1795 * 100 / cGame.s_zoomLevel, Class_f.var_179d * 100 / cGame.s_zoomLevel, 255 });
        (sub_92ea.var_189d = new GLLibPlayer(cGame.s_gameSprites[13], sub_92ea.var_17cd, sub_92ea.var_17d5)).SetAnim(1, 1);
    }
    
    static void sub_6cdb() {
        Class_f var_17ad = Class_f.var_157d[0];
        int var_808c;
        if (cGame.var_807c == 0) {
            var_808c = cGame.var_808c;
        }
        else {
            var_808c = 0;
        }
        while (var_17ad != null) {
            if (var_17ad.var_17c5 == 50) {
                switch (var_17ad.var_1835) {
                    case 2: {
                        var_17ad.sub_aac5();
                        if (var_808c < 1) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 0: {
                        var_17ad.sub_aac5();
                        if (var_808c < 2) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 3: {
                        var_17ad.sub_aac5();
                        if (var_808c < 3) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 1: {
                        var_17ad.sub_aac5();
                        if (var_808c < 4) {
                            var_17ad.var_1865 = 128;
                            var_17ad.var_186d = 1;
                            break;
                        }
                        var_17ad.var_1865 = 130;
                        var_17ad.var_186d = 0;
                        break;
                    }
                    case 4: {
                        var_17ad.sub_aac5();
                        if (var_808c < 5) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 5: {
                        var_17ad.sub_aac5();
                        if (var_808c < 6) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 6: {
                        var_17ad.sub_aac5();
                        if (var_808c < 7) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                    case 7: {
                        var_17ad.sub_aac5();
                        if (var_808c < 8) {
                            var_17ad.var_1865 = 128;
                            var_17ad.var_186d = 2;
                            break;
                        }
                        var_17ad.var_1865 = 136;
                        var_17ad.var_186d = 0;
                        break;
                    }
                    case 8: {
                        var_17ad.sub_aac5();
                        if (var_808c < 9) {
                            var_17ad.sub_a25c(8);
                            break;
                        }
                        var_17ad.sub_a21a(8);
                        break;
                    }
                }
            }
            var_17ad = var_17ad.var_17ad;
        }
    }
    
    final boolean sub_6f71() {
        if (cGame.s_tutorialState == 1 || cGame.s_tutorialState == 2 || cGame.s_tutorialState == 3 || (cGame.s_tutorialState >= 32 && cGame.s_tutorialState <= 36)) {
            return false;
        }
        if (this.var_185d == 5) {
            cGame.sub_251a0(1);
        }
        return this.sub_6fe6();
    }
    
    final boolean sub_6fe6() {
        if (cGame.s_tutorialState == 4 || cGame.s_tutorialState == 7 || cGame.s_tutorialState == 44) {
            cGame.s_hasFinishedTut = true;
        }
        if (this.var_185d == 1 && cGame.var_6af4 == 0) {
            if (cGame.var_6b44 <= cGame.getLevel()) {
                if (cGame.s_tutorialState == 45) {
                    cGame.var_6b0c = 1;
                }
                this.sub_736e(cGame.var_6b0c);
                if ((cGame.var_6b24 > 0 && cGame.sub_2e3a5(cGame.var_6b24)) || (cGame.var_6b2c > 0 && cGame.sub_2e3d9(cGame.var_6b2c))) {
                    cGame.sub_2ec47(0, this);
                    if (cGame.s_tutorialState == 5 || cGame.s_tutorialState == 8) {
                        cGame.var_6ccc = false;
                    }
                }
                else {
                    cGame.var_7aac = -1;
                    if (cGame.var_6b24 > 0) {
                        final String sub_4e1f;
                        cGame.var_7ab4 = GLLib.Text_ReplaceText(((sub_4e1f = GLLib.Text_GetStringFromLocaleFile(379)) == null) ? "" : sub_4e1f, "%d", GLLib.BigNumberSeparate(cGame.var_6b24 - cGame.getCoin(), cGame.s_currencySeprType, " "));
                        cGame.var_7aac = 18;
                        cGame.var_7d24 = false;
                    }
                    else if (cGame.var_6b2c > 0) {
                        final String sub_4e1f2;
                        cGame.var_7ab4 = GLLib.Text_ReplaceText(((sub_4e1f2 = GLLib.Text_GetStringFromLocaleFile(381)) == null) ? "" : sub_4e1f2, "%d", GLLib.BigNumberSeparate(cGame.var_6b2c - cGame.getCash(), cGame.s_currencySeprType, " "));
                        cGame.var_7aac = 19;
                        cGame.var_7d24 = true;
                    }
                    if (cGame.var_7aac != -1) {
                        cGame.switchToState(34);
                        cGame.var_815c = true;
                    }
                    cGame.var_6af4 = -1;
                    this.var_160d = false;
                }
            }
            return true;
        }
        if (this.var_185d != 5 || cGame.var_6af4 != 1) {
            return false;
        }
        if ((cGame.var_70e4 & 0x2) != 0x2) {
            return false;
        }
        if (cGame.var_6fdc) {
            return false;
        }
        if ((cGame.var_807c == 0 && cGame.sub_2dcf3(5) + sub_59d2(2) + 1 > cGame.sub_2df26()) || (cGame.var_807c == 0 && cGame.sub_2dcf3(5) + cGame.var_6fd4 + 1 > cGame.sub_2df26())) {
            cGame.var_6fdc = true;
            cGame.sub_10e3f(false, 1, cGame.var_6b04);
            cGame.sub_40658(471, 477);
            return false;
        }
        cGame.sub_2ec47(1, this);
        if (cGame.s_tutorialState == 5) {
            cGame.var_6ccc = false;
        }
        return true;
    }
    
    final boolean sub_7296() {
        if (cGame.s_tutorialState == 38) {
            return false;
        }
        if (this.var_185d == 1 && cGame.var_6af4 != 0 && (cGame.var_70e4 & 0x1) == 0x1) {
            cGame.sub_251a0(0);
            return true;
        }
        if (cGame.s_tutorialState >= 14 && cGame.s_tutorialState <= 35) {
            return false;
        }
        if ((this.var_185d == 3 || this.var_185d == 4) && cGame.var_6af4 == -1) {
            if (cGame.s_tutorialState == -1) {
                cGame.playSndNoLoop(47);
                cGame.sub_11320(true, this);
            }
            return false;
        }
        return false;
    }
    
    final void sub_736e(final int n) {
        if (this.var_160d) {
            return;
        }
        this.var_160d = true;
        this.var_1835 = (char)n;
        this.var_188d = cGame.var_6b14;
        this.var_15ed = cGame.var_6b1c;
        this.var_1605 = cGame.var_6b4c;
        this.var_15f5 = cGame.var_6b24;
        this.var_15fd = cGame.var_6b2c;
        this.var_1835 = cGame.var_6b0c;
        this.var_18c5 = cGame.var_6b34;
        this.var_1865 = cGame.var_6b3c;
    }
    
    final void sub_73e7() {
        if ((this.var_15f5 > 0 && cGame.sub_2e369(this.var_15f5)) || (this.var_15fd > 0 && cGame.sub_2e449(this.var_15fd))) {
            this.sub_7795(3);
            if (cGame.s_tutorialState == 45) {
                ++cGame.var_6cbc;
                return;
            }
            if (cGame.s_tutorialState == 8) {
                ++cGame.var_6cbc;
                return;
            }
            if (cGame.s_tutorialState == -1) {
                cGame.sub_4a20b(this.var_18c5, 1, 12);
            }
        }
        else {
            cGame.var_7aac = -1;
            if (this.var_15f5 > 0) {
                final String sub_4e1f;
                cGame.var_7ab4 = GLLib.Text_ReplaceText(((sub_4e1f = GLLib.Text_GetStringFromLocaleFile(379)) == null) ? "" : sub_4e1f, "%d", GLLib.BigNumberSeparate(this.var_15f5 - cGame.getCoin(), cGame.s_currencySeprType, " "));
                cGame.var_7aac = 18;
                cGame.var_7d24 = false;
            }
            else if (this.var_15fd > 0) {
                final String sub_4e1f2;
                cGame.var_7ab4 = GLLib.Text_ReplaceText(((sub_4e1f2 = GLLib.Text_GetStringFromLocaleFile(381)) == null) ? "" : sub_4e1f2, "%d", GLLib.BigNumberSeparate(this.var_15fd - cGame.getCash(), cGame.s_currencySeprType, " "));
                cGame.var_7aac = 19;
                cGame.var_7d24 = true;
            }
            if (cGame.var_7aac != -1) {
                cGame.switchToState(34);
                cGame.var_815c = true;
            }
            cGame.var_6af4 = -1;
            this.var_160d = false;
        }
    }
    
    final void sub_7589() {
        this.sub_7795(1);
        if (cGame.s_tutorialState == 38) {
            ++cGame.var_6cbc;
        }
        else if (cGame.s_tutorialState == 5) {
            ++cGame.var_6cbc;
        }
        this.sub_75fa(false);
        this.var_18c5 = cGame.var_8094[0];
        this.sub_a25c(1024);
    }
    
    private void sub_75fa(final boolean b) {
        final int[] array = { 0, 0, 14 };
        sub_92ea(47, 2, array).sub_8c4c(this.var_17cd, this.var_17d5, 37, 1000, false, this.var_1605);
        if (cGame.var_807c == 0 || (cGame.sub_2dcf3(5) < cGame.sub_2df26() && GLLib.Math_Rand(0, 100) < cGame.var_8064[20])) {
            final Class_f sub_92ea = sub_92ea(47, 2, array);
            final int var_188d = this.var_188d;
            if (this.var_188d == -1) {
                return;
            }
            int n = 1;
            if (b) {
                n = 3;
            }
            if (this.sub_a2a0(1024)) {
                ++n;
            }
            if (b && cGame.s_tutorialState == -1) {
                cGame.sub_2bae9(this.var_18c5, n, 14);
            }
            if (cGame.s_tutorialState == -1) {
                cGame.sub_4a20b(this.var_18c5, n, 14);
            }
            sub_92ea.sub_8c4c(this.var_17cd, this.var_17d5, 59, 1000, true, var_188d | n << 16);
        }
        if (cGame.getLevel() >= cGame.var_7a04[0] && GLLib.Math_Rand(0, 100) < cGame.var_8064[10]) {
            sub_92ea(47, 2, array).sub_8c4c(this.var_17cd - 60, this.var_17d5, 60, 2000, false, 1);
        }
    }
    
    final void sub_7795(final int var_185d) {
        this.sub_aac5();
        switch (this.var_185d = var_185d) {
            case 1: {
                this.var_1865 = -1;
                this.var_186d = -1;
                this.var_1835 = 0;
                this.var_160d = false;
                this.var_17dd = 11;
                break;
            }
            case 8: {
                this.var_17dd = 11;
                break;
            }
            case 3: {
                this.var_186d = 0;
                this.var_15e5 = System.currentTimeMillis();
                this.var_17dd = 11;
                this.sub_aa8a();
                break;
            }
            case 4: {
                this.var_186d = 1;
                this.var_186d = 1;
                this.var_17dd = 12;
                break;
            }
            case 5: {
                this.var_186d = 2;
                this.var_17dd = 12;
                break;
            }
        }
        this.var_187d = 6;
        this.var_1885 = 0;
    }
    
    static void sub_7898() {
        for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
            if (var_17ad.var_17c5 == 49 || var_17ad.var_17c5 == 52) {
                var_17ad.sub_a21a(1024);
            }
        }
    }
    
    final boolean sub_790a() {
        if (this.var_185d == 3) {
            cGame.sub_251a0(1);
        }
        return this.sub_7946();
    }
    
    final boolean sub_7946() {
        if (this.var_185d != 3 || cGame.var_6af4 != 1) {
            return false;
        }
        if (cGame.var_6fdc) {
            return false;
        }
        if ((cGame.var_807c == 0 && cGame.sub_2dcf3(5) + sub_59d2(2) + 3 > cGame.sub_2df26()) || (cGame.var_807c == 0 && cGame.sub_2dcf3(5) + cGame.var_6fd4 + 3 > cGame.sub_2df26())) {
            cGame.var_6fdc = true;
            cGame.sub_10e3f(false, 1, cGame.var_6b04);
            if (cGame.sub_2dcf3(5) < cGame.sub_2df26()) {
                final String sub_4e1f;
                final String sub_4e1f2;
                cGame.drawCustomPopupNoOpts(((sub_4e1f = GLLib.Text_GetStringFromLocaleFile(475)) == null) ? "" : sub_4e1f, GLLib.Text_ReplaceText(((sub_4e1f2 = GLLib.Text_GetStringFromLocaleFile(476)) == null) ? "" : sub_4e1f2, "%slots", "3"), 7, 0);
            }
            else {
                cGame.sub_40658(471, 477);
            }
            return false;
        }
        cGame.sub_2ec47(1, this);
        return true;
    }
    
    final boolean sub_7a79() {
        if (this.var_185d == 2) {
            if (cGame.s_tutorialState != 18 && cGame.var_6af4 == -1) {
                cGame.playSndNoLoop(47);
                cGame.sub_11320(true, this);
                return true;
            }
        }
        else if (this.var_185d == 3 && cGame.var_6af4 != 1) {
            cGame.sub_251a0(1);
            return true;
        }
        return false;
    }
    
    final void sub_7ae7() {
        this.sub_7b13(2);
        this.sub_75fa(true);
        this.sub_a25c(1024);
    }
    
    final void sub_7b13(final int var_185d) {
        this.sub_aac5();
        switch (this.var_185d = var_185d) {
            case 2: {
                this.var_1615 = System.currentTimeMillis();
                this.var_186d = 0;
                return;
            }
            case 3: {
                this.sub_a25c(32);
                this.var_186d = 1;
                break;
            }
        }
    }
    
    final void sub_7b94() {
        if (this.var_1865 > -1 && this.var_186d > -1) {
            final int var_1865;
            final int n = (var_1865 = this.var_1865) & 0x7FFF;
            final ASprite class_e;
            final int n2 = (class_e = (((var_1865 & 0x8000) != 0x0) ? cGame.var_68d4[n] : cGame.s_gameSprites[n])).GetFrameWidth(this.var_186d) >> 1;
            final int n3 = class_e.GetFrameHeight(this.var_186d) >> 1;
            if (this.var_17cd - n2 > GLLibPlayer.sub_5b8b(0) && this.var_17d5 - n3 > GLLibPlayer.sub_5c0b(0)) {
                this.sub_aac5();
            }
            else {
                GLLibPlayer.sub_5f26();
                cGame.var_8074 = true;
            }
        }
        cGame.sub_2c9ec(this);
        final GameDatas class_h;
        final int n4 = (class_h = GameDatas.s_allDatas[11]).m_dataVars[this.var_1835][3];
        final int n5 = class_h.m_dataVars[this.var_1835][4];
        final int n6 = class_h.m_dataVars[this.var_1835][5];
        final int n7 = class_h.m_dataVars[this.var_1835][6];
        final int[] array = { 0, 0, 14 };
        if (n4 > 0) {
            sub_92ea(47, 2, array).sub_8c4c(this.var_17cd, this.var_17d5, 37, 1000, false, n4);
        }
        if (n5 > 0) {
            sub_92ea(47, 2, array).sub_8c4c(this.var_17cd, this.var_17d5, 36, 1000, true, n5);
        }
        final int sub_2b97;
        if (n7 > 0 && (sub_2b97 = GLLib.Math_Rand(n6, n7 + 1)) > 0) {
            sub_92ea(47, 2, array).sub_8c4c(this.var_17cd, this.var_17d5, 6, 1000, true, sub_2b97);
        }
        this.sub_4bf4();
    }
    
    final void sub_7d3f(final int var_1845, final int var_184d) {
        this.var_1845 = var_1845;
        this.var_184d = var_184d;
        this.var_18dd = null;
        this.var_18e5 = 0;
        this.var_18ed = 0;
        this.sub_8365(1);
    }
    
    final boolean sub_7d78() {
        if (cGame.var_6c64 == 1) {
            return false;
        }
        if (this.var_185d == 3) {
            return false;
        }
        if (this.var_185d == 7) {
            return false;
        }
        cGame.playSndNoLoop(this.var_18d5);
        if (cGame.var_6c9c == this) {
            cGame.sub_28ca1();
        }
        if (this.sub_a2a0(4)) {
            if (cGame.getFeed(this.var_1685) >= this.var_164d) {
                cGame.sub_2ec47(4, this);
            }
            else {
                cGame.sub_4014a(391, 7, 0);
            }
            return true;
        }
        if (this.sub_a2a0(16)) {
            if (cGame.sub_2dcf3(5) + sub_59d2(2) < cGame.sub_2df26() || cGame.var_807c != 0) {
                cGame.sub_2ec47(7, this);
                return true;
            }
            cGame.sub_40658(471, 477);
            return false;
        }
        else {
            if (this.sub_a2a0(256)) {
                cGame.sub_2ec47(4, this);
                return true;
            }
            this.sub_8365(0);
            cGame.sub_11320(true, this);
            if (!this.sub_a2a0(32) && this.var_1625 == 0 && this.var_161d != 0L && cGame.var_807c == 0) {
                this.sub_85b3(16);
                cGame.sub_11320(false, null);
            }
            return false;
        }
    }
    
    final void sub_7ed6() {
        this.var_1625 = GameDatas.s_allDatas[0].m_dataVars[this.var_1835][25] * 60;
        this.var_161d = System.currentTimeMillis();
    }
    
    final void sub_7f11() {
        this.var_163d = GameDatas.s_allDatas[0].m_dataVars[this.var_1835][13] * 60;
        this.var_1645 = System.currentTimeMillis() / 1000L;
    }
    
    final void sub_7f50() {
        if (!this.sub_a2a0(4)) {
            if (this.sub_a2a0(256)) {
                this.sub_8365(7);
                cGame.sub_4a20b(this.var_18c5, 1, 20);
                this.sub_a25c(256);
                this.sub_aa8a();
                (this.var_18b5 = new GLLibPlayer(cGame.s_gameSprites[13], this.var_17ed, this.var_17f5)).SetAnim(0, 2);
                this.var_18a5 = this.var_16bd;
                this.var_18ad = this.var_16c5;
                cGame.playSndNoLoop(32);
            }
            return;
        }
        if (this.var_185d != 3 && cGame.var_807c == 0) {
            cGame.sub_2e40d(this.var_164d, this.var_1685);
            this.sub_8365(3);
            ++this.var_1635;
            if (this.var_1635 >= this.var_162d && !this.sub_a2a0(2048)) {
                this.sub_a21a(2048);
                cGame.sub_40631();
                cGame.sub_4ad3f(0);
            }
            cGame.sub_4a20b(this.var_18c5, 1, 19);
            this.sub_a25c(4);
            this.sub_aa8a();
            this.var_161d = System.currentTimeMillis();
            this.var_1655 = false;
            final boolean var_165d = false;
            this.var_166d = var_165d;
            this.var_1665 = var_165d;
            this.var_165d = var_165d;
            this.var_1675 = false;
            cGame.playSndNoLoop(36);
            return;
        }
        if (cGame.var_807c != 0) {
            this.sub_8365(3);
            this.sub_a25c(4);
            this.sub_aa8a();
            this.var_161d = System.currentTimeMillis();
            this.var_1655 = false;
            final boolean var_165d2 = false;
            this.var_166d = var_165d2;
            this.var_1665 = var_165d2;
            this.var_165d = var_165d2;
            this.var_1675 = false;
            cGame.playSndNoLoop(36);
            return;
        }
        cGame.playSndNoLoop(56);
    }
    
    final void sub_80cb() {
        this.sub_8365(5);
        this.sub_a25c(16);
        this.sub_aa8a();
        this.var_161d = System.currentTimeMillis();
    }
    
    private void sub_80fc() {
        if (this.sub_a2a0(32)) {
            final int var_18c5 = this.var_18c5;
            cGame.sub_11320(false, null);
            this.sub_a25c(32);
            ++this.var_1835;
            final GameDatas class_h = GameDatas.s_allDatas[0];
            this.var_164d = class_h.m_dataVars[this.var_1835][24];
            this.var_162d = class_h.m_dataVars[this.var_1835][14];
            this.var_167d = class_h.m_dataVars[this.var_1835][17];
            this.var_1635 = 0;
            this.var_1815 = class_h.m_dataVars[this.var_1835][27];
            this.var_181d = class_h.m_dataVars[this.var_1835][28];
            final ASprite class_e = cGame.s_gameSprites[class_h.m_dataVars[this.var_1835][31]];
            this.var_1875 = class_h.m_dataVars[this.var_1835][32];
            this.var_186d = class_h.m_dataVars[this.var_1835][33];
            this.var_169d = (short)class_h.m_dataVars[this.var_1835][29];
            this.var_16a5 = (short)class_h.m_dataVars[this.var_1835][30];
            if (this.var_189d != null && class_e != null) {
                this.var_189d.SetSprite(class_e);
                this.var_189d.SetAnim(0, -1);
            }
            (this.var_18b5 = new GLLibPlayer(cGame.s_gameSprites[13], this.var_17ed, this.var_17f5 - 50)).SetAnim(1, 1);
            if (cGame.var_807c == 0) {
                cGame.sub_4a20b(var_18c5, 1, 21);
            }
            this.var_18c5 = class_h.m_dataVars[this.var_1835][1];
            if (cGame.var_807c == 0) {
                cGame.sub_4ad3f(this.var_18c5);
                cGame.sub_2c0fa(true);
            }
            this.sub_7ed6();
            this.sub_8365(2);
            if (class_h.m_dataVars[this.var_1835][19] != 5 && class_h.m_dataVars[this.var_1835][19] != 110) {
                this.var_16e5 = class_h.m_dataVars[this.var_1835][18];
            }
            if (class_h.m_dataVars[this.var_1835][22] != 5 && class_h.m_dataVars[this.var_1835][22] != 110) {
                this.var_16ed = class_h.m_dataVars[this.var_1835][21];
            }
            cGame.playSndNoLoop(44);
            final short n = class_e._frames_fm_start[this.var_169d];
            this.var_16ad = class_e.sub_30ea(n);
            this.var_16b5 = class_e.sub_310b(n);
            final short n2 = class_e._frames_fm_start[this.var_16a5];
            this.var_16bd = class_e.sub_30ea(n2);
            this.var_16c5 = class_e.sub_310b(n2);
            this.var_168d = false;
        }
    }
    
    final void sub_8365(final int var_185d) {
        int n = 0;
        int sub_2b97 = -1;
        boolean b = false;
        this.sub_a21a(1);
        switch (var_185d) {
            case 4: {
                if (this.sub_a2a0(32)) {
                    n = 5;
                    break;
                }
                n = 0;
                break;
            }
            case 0: {
                if (this.sub_a2a0(32)) {
                    n = 5;
                }
                else {
                    n = 0;
                }
                sub_2b97 = GLLib.Math_Rand(1, 5);
                break;
            }
            case 1: {
                int n2 = 0;
                if (this.sub_a2a0(32)) {
                    n2 = 5;
                }
                int n3;
                if (this.var_1845 > this.var_17cd) {
                    if (this.var_184d > this.var_17d5) {
                        n3 = 3;
                        b = true;
                    }
                    else {
                        n3 = 4;
                    }
                }
                else if (this.var_184d > this.var_17d5) {
                    n3 = 3;
                }
                else {
                    n3 = 4;
                    b = true;
                }
                n = n3 + n2;
                break;
            }
            case 3: {
                this.sub_a25c(1);
                if (this.sub_a2a0(32)) {
                    n = 6;
                }
                else {
                    n = 1;
                }
                sub_2b97 = 3;
                break;
            }
            case 7: {
                this.sub_a25c(1);
                if (this.sub_a2a0(32)) {
                    n = 5;
                }
                else {
                    n = 0;
                }
                sub_2b97 = 5;
                break;
            }
        }
        this.var_185d = var_185d;
        this.var_189d.SetAnim(n, sub_2b97, this.var_189d.GetAnim() == n);
        if (b) {
            this.var_189d.SetTransform(2);
            return;
        }
        this.var_189d.SetTransform(0);
    }
    
    final void sub_85b3(final int n) {
        if (cGame.var_807c != 0 && n == 4) {
            return;
        }
        this.sub_aa8a();
        this.sub_a21a(n);
        int n2 = 0;
        if (n == 4) {
            n2 = 14;
        }
        else if (n == 16) {
            n2 = 13;
        }
        else if (n == 256) {
            n2 = 12;
        }
        this.sub_aa65(sub_92ea(33, 0, new int[] { this.var_17cd, this.var_17d5, 150, 10, n2, -63, -117, 0, 1 }));
    }
    
    final void sub_867b() {
        this.sub_aa8a();
    }
    
    final void sub_869a() {
        if (this.sub_a2a0(4) && this.var_1895 != null) {
            this.sub_aa8a();
            this.var_1895 = null;
        }
        if (this.sub_a2a0(16) && this.var_1895 != null) {
            this.sub_aa8a();
            this.var_1895 = null;
        }
        if (this.sub_a2a0(256) && this.var_1895 != null) {
            this.sub_aa8a();
            this.var_1895 = null;
        }
    }
    
    private void sub_8723() {
        if ((GLLib.Math_Rand(0, 100) & 0x1) == 0x0) {
            this.var_17cd = GLLib.Math_Rand(GLLibPlayer.sub_5cb3() >> 1, GLLibPlayer.sub_5cb3());
            this.var_17d5 = GLLibPlayer.sub_5d2e();
        }
        else {
            this.var_17cd = GLLibPlayer.sub_5cb3();
            this.var_17d5 = GLLib.Math_Rand(GLLibPlayer.sub_5d2e() >> 1, GLLibPlayer.sub_5d2e());
        }
        this.var_1845 = 0;
        this.var_184d = 0;
        this.var_16f5 = false;
    }
    
    final void sub_87a1() {
        if (!this.sub_a2a0(8)) {
            return;
        }
        if (!this.var_172d) {
            this.var_1755 += GLLib.s_game_frameDT;
            this.var_175d += GLLib.s_game_frameDT;
            final int n = this.var_1755 << 1;
            final int n2 = this.var_1735 ? 1 : -1;
            if (this.var_1765 < 3) {
                this.var_173d = this.var_174d * this.var_175d * n2 / 100;
                this.var_1745 = (n << 2) * n / 10000 + n * -40 / 100;
                for (int i = 1; i < this.var_1765; ++i) {
                    this.var_1745 = this.var_1745 * 40 / 100;
                }
                if (this.var_1745 > 0) {
                    ++this.var_1765;
                    this.var_1745 = this.var_1745 * -40 / 100;
                    this.var_1755 = 0;
                }
            }
            else {
                this.var_172d = true;
                cGame.playSndNoLoop(38);
                if (this.var_16fd == 60) {
                    cGame.sub_3d6da(true, ((this.var_1865 & 0xFFFF7FFF) - 107 << 2) + this.var_186d);
                }
            }
            this.var_17cd = this.m_itemIndex + this.var_173d;
            this.var_17d5 = this.var_171d + this.var_1745;
            return;
        }
        this.var_1705 += 4 * GLLib.s_game_frameDT;
        if (this.var_16fd == 57) {
            this.var_1845 = cGame.var_800c.var_17cd + cGame.var_68bc[1][26][2] + (cGame.var_68d4[1].GetFrameWidth(33) >> 1);
            this.var_184d = cGame.var_800c.var_17d5 + cGame.var_68bc[1][26][3] + (cGame.var_68d4[1].GetFrameWidth(33) >> 1);
        }
        else if (this.var_16fd >= 59) {
            if ((this.var_1725 & 0xFFFF) == 0x5) {
                this.var_1845 = cGame.var_800c.var_17cd + cGame.var_68bc[1][28][2];
                this.var_184d = cGame.var_800c.var_17d5 + cGame.var_68bc[1][28][3];
            }
            else {
                this.var_1845 = cGame.var_800c.var_17cd + cGame.var_68bc[1][59][2];
                this.var_184d = cGame.var_800c.var_17d5 + cGame.var_68bc[1][59][3];
            }
        }
        else if (this.var_16fd == 37) {
            this.var_1845 = cGame.var_800c.var_17cd + cGame.var_68bc[1][21][2] + (cGame.var_68d4[1].GetFrameWidth(4) >> 1);
            this.var_184d = cGame.var_800c.var_17d5 + cGame.var_68bc[1][21][3] + (cGame.var_68d4[1].GetFrameWidth(4) >> 1);
        }
        else {
            this.var_1845 = cGame.var_800c.var_17cd;
            this.var_184d = cGame.var_800c.var_17d5;
        }
        if (this.var_16fd == 60) {
            this.var_1845 = cGame.var_800c.var_17cd + cGame.var_68bc[1][80 + this.var_186d][2];
            this.var_184d = cGame.var_800c.var_17d5 + cGame.var_68bc[1][80 + this.var_186d][3];
        }
        if (this.var_170d > 0) {
            this.var_17cd = this.m_itemIndex + (this.var_1845 * 100 / cGame.s_zoomLevel - this.m_itemIndex) * this.var_1705 / this.var_170d;
            this.var_17d5 = this.var_171d + (this.var_184d * 100 / cGame.s_zoomLevel - this.var_171d) * (this.var_1705 * this.var_1705) / this.var_170d / this.var_170d;
        }
        if (this.var_1705 > this.var_170d) {
            this.sub_a21a(8);
            if (this.var_176d) {
                this.sub_4bf4();
                if (this.var_16fd == 37) {
                    cGame.addExperience(this.var_1725);
                    return;
                }
                if (this.var_16fd == 36) {
                    cGame.addCoin(this.var_1725);
                    return;
                }
                if (this.var_16fd == 6) {
                    cGame.addCash(this.var_1725);
                    return;
                }
                if (this.var_16fd == 59) {
                    final int n3 = this.var_1725 & 0xFFFF;
                    final int n4 = this.var_1725 >> 16;
                    if (n3 == 110) {
                        cGame.sub_2e64f(n4);
                        final short n5;
                        cGame.sub_2bae9(n5 = cGame.var_80cc[n3], n4, 34);
                        cGame.sub_4a20b(n5, n4, 34);
                        cGame.sub_4a20b(n5, n4, 22);
                    }
                    else if (n3 == 5) {
                        cGame.sub_2e5a7(n4);
                    }
                    else if (n3 >= 111 && n3 <= 116) {
                        cGame.sub_2e4fa(n4, n3 - 111);
                    }
                    else {
                        cGame.sub_2da54(0, n3, n4);
                        if (n4 > 0) {
                            cGame.sub_2df70(-n4);
                        }
                        cGame.sub_2df93();
                    }
                    if (n3 >= 0 && n3 < 6) {
                        cGame.sub_4a20b(cGame.var_80cc[n3], n4, 22);
                    }
                }
            }
        }
    }
    
    final void sub_8c4c(int itemIndex, int var_171d, final int var_16fd, final int var_170d, final boolean var_1735, final int var_1736) {
        this.var_16fd = var_16fd;
        this.m_itemIndex = itemIndex;
        this.var_171d = var_171d;
        this.var_17ed = this.m_itemIndex;
        this.var_17f5 = this.var_171d;
        this.var_170d = var_170d;
        this.var_1705 = 0;
        this.var_172d = false;
        this.var_1735 = var_1735;
        this.var_1725 = var_1736;
        if (var_16fd == 59) {
            itemIndex = (this.var_1725 & 0xFFFF);
            new StringBuffer().append("itemIndex : ").append(itemIndex);
            this.var_1865 = (cGame.var_80d4[itemIndex] | 0x8000);
            this.var_186d = cGame.var_80dc[itemIndex];
        }
        else if (var_16fd == 60) {
            itemIndex = cGame.sub_3dbf6();
            var_171d = 107 + itemIndex / 4;
            this.var_1865 = (var_171d | 0x8000);
            this.var_186d = itemIndex % 4;
            itemIndex = var_171d;
            cGame.sub_d500(1, itemIndex, 1, 0, 24, 0, -1);
            GLLib.Pack_Open("/7");
            cGame.sub_d2c8(1);
            GLLib.Pack_FullyClose();
        }
        else {
            this.var_1865 = 32769;
            this.var_186d = this.var_16fd;
        }
        this.var_1755 = 0;
        this.var_175d = 0;
        this.var_174d = 4;
        this.var_1765 = 1;
    }
    
    final void sub_8d6c() {
        this.sub_5f3b(this.var_1865, this.var_186d);
    }
    
    final void sub_8d93() {
        int var_1725 = 0;
        if (this.var_16fd == 37 || this.var_16fd == 36 || this.var_16fd == 6) {
            var_1725 = this.var_1725;
        }
        else if (this.var_16fd == 59) {
            var_1725 = this.var_1725 >> 16;
        }
        if (var_1725 > 0) {
            GLLib.sub_5c77(true);
            cGame.sub_1e07e("+" + GLLib.BigNumberSeparate(var_1725, cGame.s_currencySeprType, " "), (this.var_17cd + this.var_1805) * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17cd + 10, (this.var_17d5 + this.var_180d) * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17d5 + 10, 0, 0, 0, 0, 2, 1, false, false);
            GLLib.sub_5c77(false);
        }
    }
    
    final void sub_8e7d() {
        if (this.var_189d != null) {
            this.var_189d.SetZoomLevel(cGame.s_zoomLevel);
            this.var_189d.SetPos(this.var_17ed, this.var_17f5);
            this.var_189d.Render();
        }
    }
    
    final void sub_8ed0() {
        if (this.var_189d != null && this.var_189d.IsAnimOver() && (Class_f.var_1775 == -1 || Class_f.var_1775 < Class_f.var_177d)) {
            cGame.playSndNoLoop(GLLib.Math_Rand(26, 30));
            this.var_189d.SetAnim(0, 1);
            final int sub_312c = this.var_189d.GetSprite().GetFrameWidth(0);
            final int sub_3189 = this.var_189d.GetSprite().GetFrameHeight(0);
            this.var_17cd = (cGame.var_800c.var_17cd + GLLib.Math_Rand(sub_312c, GLLib.s_screenWidth - sub_312c)) * 100 / cGame.s_zoomLevel;
            this.var_17d5 = (cGame.var_800c.var_17d5 + GLLib.Math_Rand(sub_3189, GLLib.s_screenHeight - sub_3189)) * 100 / cGame.s_zoomLevel;
            if (cGame.s_game_states[cGame.s_game_state] == 13) {
                this.var_17ed = this.var_17cd * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17cd;
                this.var_17f5 = this.var_17d5 * cGame.s_zoomLevel / 100 - cGame.var_800c.var_17d5;
            }
            this.var_189d.setSprPalette(GLLib.Math_Rand(0, this.var_189d.GetSprite()._palettes));
            if (Class_f.var_1775 > -1) {
                ++Class_f.var_1775;
            }
            return;
        }
        if (this.var_189d != null && this.var_189d.IsAnimOver() && Class_f.var_1775 >= Class_f.var_177d) {
            this.var_189d = null;
            this.var_17c5 = -1;
            if (sub_5439(0, 21, new Class_f[1], 1) == 0) {
                cGame.sub_d500(0, 85, 65535, 1, 0, 0, -1);
                cGame.sub_d2c8(0);
            }
        }
    }
    
    static Class_f sub_904a(final int var_177d) {
        cGame.playSndNoLoop(GLLib.Math_Rand(26, 30));
        if (var_177d == -1) {
            Class_f.var_1775 = -1;
        }
        else {
            Class_f.var_1775 = 0;
            Class_f.var_177d = var_177d;
        }
        if (cGame.s_gameSprites[85] == null) {
            cGame.sub_d500(0, 85, 15, 0, 24, 0, -1);
            GLLib.Pack_Open("/5");
            cGame.sub_d2c8(0);
            GLLib.Pack_FullyClose();
        }
        if (sub_4c91(0, 21) > 0) {
            final Class_f[] array = { null };
            sub_5439(0, 21, array, 1);
            (array[0].var_189d = new GLLibPlayer(cGame.s_gameSprites[85], array[0].var_17cd, array[0].var_17d5)).SetAnim(0, 1);
            return array[0];
        }
        final Class_f sub_92ea = sub_92ea(21, 0, new int[] { (cGame.var_800c.var_17cd + (GLLib.s_screenWidth >> 1)) * 100 / cGame.s_zoomLevel, (cGame.var_800c.var_17d5 + (GLLib.s_screenHeight >> 1)) * 100 / cGame.s_zoomLevel, 255 });
        (sub_92ea.var_189d = new GLLibPlayer(cGame.s_gameSprites[85], sub_92ea.var_17cd, sub_92ea.var_17d5)).SetAnim(0, 1);
        return sub_92ea;
    }
    
    private void sub_9175(final int var_185d) {
        int n = 0;
        boolean b = false;
        switch (var_185d) {
            case 0: {
                n = 1;
                break;
            }
            case 1: {
                if (this.var_1845 > this.var_17cd) {
                    n = 0;
                    break;
                }
                n = 0;
                b = true;
                break;
            }
        }
        this.var_185d = var_185d;
        if (this.var_189d.sprite.sub_36dd() > n) {
            this.var_189d.SetAnim(n, -1);
            if (b) {
                this.var_189d.SetTransform(2);
                return;
            }
            this.var_189d.SetTransform(0);
        }
    }
    
    final void sub_924a(final int var_1845, final int var_184d) {
        this.var_1845 = var_1845;
        this.var_184d = var_184d;
        this.sub_9175(1);
    }
    
    final void sub_9274() {
        cGame.sub_2c9ec(this);
        this.sub_4bf4();
    }
    
    final void sub_9297() {
        cGame.sub_2c907(this);
        this.var_185d = 1;
        this.var_189d.SetAnim(0, -1);
        this.var_186d = 0;
    }
    
    static Class_f sub_92c9(final int n, final int[] array) {
        return sub_92ea(n, 0, array);
    }
    
    static Class_f sub_92ea(final int var_17c5, final int n, final int[] array) {
        final Class_f class_f = new Class_f();
        class_f.var_17ad = null;
        class_f.var_17b5 = null;
        class_f.var_189d = null;
        class_f.var_18b5 = null;
        class_f.var_17bd = -1;
        class_f.var_17c5 = 0;
        class_f.var_17cd = 0;
        class_f.var_17d5 = 0;
        class_f.var_17dd = 0;
        class_f.var_17ed = 0;
        class_f.var_17f5 = 0;
        class_f.var_17fd = 0;
        class_f.var_18a5 = 0;
        class_f.var_18ad = 0;
        class_f.var_183d = -1;
        class_f.var_1855 = 0;
        class_f.var_1865 = -1;
        class_f.var_186d = -1;
        class_f.var_1875 = 0;
        class_f.var_187d = -1;
        class_f.var_18bd = false;
        class_f.var_1815 = 1;
        class_f.var_181d = 1;
        class_f.var_18d5 = 0;
        class_f.var_1805 = 0;
        class_f.var_180d = 0;
        class_f.var_17c5 = var_17c5;
        class_f.sub_a21a(8);
        switch (class_f.var_17c5) {
            case 10: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                break;
            }
            case 13: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_185d = 0;
                class_f.var_15ad = GLLibPlayer.sub_5cb3();
                class_f.var_15b5 = GLLibPlayer.sub_5d2e();
                GLLibPlayer.sub_5a36(0, class_f.var_17cd, class_f.var_17d5);
                class_f.sub_a25c(8);
                break;
            }
            case 34: {
                class_f.var_17dd = array[0];
                class_f.var_1865 = array[1];
                (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], 0, 0)).SetAnim(array[2], -1);
                class_f.var_185d = array[3];
                switch (array[3]) {
                    case 0: {
                        final int n2 = array[4];
                        
                        final Class_f[] array2 = new Class_f[100];
                        int sub_5439 = sub_5439(0, n2, array2, 100);
                        if (sub_5439 > 0) {
                            final int sub_2b97 = GLLib.Math_Rand(0, sub_5439);
                            class_f.var_17cd = array2[sub_2b97].var_17cd;
                            class_f.var_17d5 = array2[sub_2b97].var_17d5;
                            class_f.var_1845 = class_f.var_17cd;
                            class_f.var_184d = class_f.var_17d5;
                        }
                        break;
                    }
                    case 1: {
                        class_f.sub_8723();
                        class_f.var_17e5 = array[4];
                        break;
                    }
                }
                break;
            }
            case 50: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1835 = array[3];
                class_f.var_1865 = array[4];
                class_f.var_186d = array[5];
                class_f.var_1815 = array[6];
                class_f.var_181d = array[7];
                class_f.var_1825 = cGame.sub_2d629(class_f.var_1815, class_f.var_181d);
                class_f.sub_a21a(16777730);
                final int n3 = array[8];
                final int n4 = array[9];
                final int n5 = array[10];
                if (n3 == 1) {
                    class_f.sub_a21a(64);
                }
                if (n4 == 1) {
                    class_f.sub_a21a(128);
                }
                if (n5 == 1) {
                    class_f.sub_a21a(1);
                }
                if (class_f.var_1835 == 18) {
                    class_f.var_187d = 135;
                    class_f.var_1885 = 0;
                    cGame.var_8124 = class_f.var_17cd;
                    cGame.var_812c = class_f.var_17d5;
                }
                if (class_f.var_1865 == 4 || class_f.var_1865 == 145) {
                    class_f.sub_a21a(33554432);
                }
                break;
            }
            case 20: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1835 = array[3];
                class_f.var_1865 = array[4];
                class_f.var_1875 = array[5];
                class_f.var_186d = array[6];
                class_f.var_1815 = array[7];
                class_f.var_181d = array[8];
                class_f.var_1825 = cGame.sub_2d629(class_f.var_1815, class_f.var_181d);
                if (cGame.s_gameSprites[class_f.var_1865].sub_36dd() > 0) {
                    (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17cd, class_f.var_17d5)).SetAnim(0, -1);
                    class_f.sub_a21a(33554432);
                }
                else {
                    class_f.sub_a21a(16777216);
                }
                class_f.sub_a21a(515);
                final int n6 = array[9];
                final int n7 = array[10];
                if (n6 == 1) {
                    class_f.sub_a21a(64);
                }
                if (n7 == 1) {
                    class_f.sub_a21a(128);
                }
                break;
            }
            case 21: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.sub_a21a(65536);
                break;
            }
            case 23: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.sub_a21a(65536);
                break;
            }
            case 54: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1815 = array[3];
                class_f.var_181d = array[4];
                class_f.var_1825 = 16;
                final ASprite class_e = cGame.s_gameSprites[array[5]];
                class_f.var_1875 = array[6];
                if (array[7] == 1) {
                    class_f.sub_a21a(32);
                }
                class_f.var_188d = array[8];
                class_f.var_1865 = array[5];
                class_f.var_186d = array[9];
                class_f.var_189d = new GLLibPlayer(class_e, class_f.var_17cd, class_f.var_17d5);
                class_f.sub_8365(0);
                class_f.sub_a21a(33554945);
                final int n8 = array[10];
                final int n9 = array[11];
                if (n8 == 1) {
                    class_f.sub_a21a(64);
                }
                if (n9 == 1) {
                    class_f.sub_a21a(128);
                }
                class_f.var_17e5 = 50;
                break;
            }
            case 42: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[3];
                class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17cd, class_f.var_17d5);
                class_f.var_1845 = class_f.var_17cd;
                class_f.var_184d = class_f.var_17d5;
                class_f.var_17e5 = 100;
                class_f.sub_a21a(33554432);
                class_f.sub_60d7(0);
                break;
            }
            case 51: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[4];
                final ASprite class_e2 = cGame.s_gameSprites[class_f.var_1865];
                class_f.var_186d = 0;
                class_f.var_189d = new GLLibPlayer(class_e2, class_f.var_17cd, class_f.var_17d5);
                class_f.var_1845 = class_f.var_17cd;
                class_f.var_184d = class_f.var_17d5;
                class_f.var_17e5 = array[6];
                class_f.sub_9175(0);
                class_f.sub_a21a(33554432);
                break;
            }
            case 49: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1815 = 4;
                class_f.var_181d = 4;
                class_f.var_1825 = 16;
                class_f.sub_a21a(64);
                class_f.sub_a21a(16777731);
                class_f.sub_7795(1);
                break;
            }
            case 52: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1815 = 4;
                class_f.var_181d = 4;
                class_f.var_1825 = 16;
                class_f.var_1865 = array[3];
                class_f.sub_a21a(16777763);
                final int n10 = array[4];
                final int n11 = array[5];
                if (n10 == 1) {
                    class_f.sub_a21a(64);
                }
                if (n11 == 1) {
                    class_f.sub_a21a(128);
                }
                class_f.sub_7b13(2);
                break;
            }
            case 48: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[3];
                class_f.var_186d = array[4];
                class_f.var_1875 = array[5];
                class_f.sub_a21a(16777730);
                class_f.var_1815 = 4;
                class_f.var_181d = 4;
                class_f.var_1825 = 16;
                break;
            }
            case 47: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1815 = 2;
                class_f.var_181d = 2;
                class_f.sub_a21a(512);
                class_f.var_176d = true;
                break;
            }
            case 32: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_1845 = class_f.var_17cd;
                class_f.var_184d = class_f.var_17d5;
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[3];
                class_f.var_186d = array[4];
                class_f.var_1875 = array[5];
                if (array[6] != -1) {
                    (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17cd, class_f.var_17d5)).SetAnim(array[6], -1);
                }
                else if (class_f.var_1865 == 152 || class_f.var_1865 == 153 || class_f.var_1865 == 154 || class_f.var_1865 == 156 || class_f.var_1865 == 9) {
                    class_f.sub_a21a(50331648);
                }
                class_f.var_187d = class_f.var_1865;
                class_f.var_1885 = array[7];
                class_f.var_17e5 = array[8];
                break;
            }
            case 11: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[3];
                class_f.var_186d = array[4];
                break;
            }
            case 33: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                class_f.var_1865 = array[3];
                class_f.var_186d = array[4];
                class_f.var_1805 = array[5];
                class_f.var_180d = array[6];
                if (array.length > 7) {
                    (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[class_f.var_1865], class_f.var_17cd, class_f.var_17d5)).SetAnim(array[7], array[8]);
                }
                else {
                    class_f.sub_a21a(16777216);
                }
                class_f.var_1875 = 0;
                break;
            }
            case 22: {
                class_f.var_17cd = array[0];
                class_f.var_17d5 = array[1];
                class_f.var_17dd = array[2];
                (class_f.var_189d = new GLLibPlayer(cGame.s_gameSprites[144], class_f.var_17cd, class_f.var_17d5)).SetAnim(0, -1);
                class_f.sub_a21a(514);
                class_f.var_1865 = 144;
                class_f.var_186d = 0;
                break;
            }
            default: {
                class_f.var_17c5 = -1;
                break;
            }
        }
        class_f.var_1845 = class_f.var_17cd;
        class_f.var_184d = class_f.var_17d5;
        if (class_f.sub_a2a0(16777216)) {
            class_f.sub_aac5();
        }
        sub_4a43(class_f, n);
        return class_f;
    }
    
    static void sub_9f59() {
        Class_f.var_157d = new Class_f[5];
        Class_f.var_1905 = new int[4];
        Class_f.var_190d = new int[500][];
        Class_f.var_1915 = 0;
        for (int i = 0; i < 500; ++i) {
            Class_f.var_190d[i] = new int[4];
        }
    }
    
    private boolean sub_9fbb() {
        final int[] array = new int[2];
        final int[] array2 = new int[2];
        array[0] = this.var_17cd;
        array[1] = this.var_17d5;
        cGame.sub_2c867(array, array2);
        final int[] array3 = array2;
        final int n = 0;
        array3[n] -= this.var_1815 >> 1;
        final int[] array4 = array2;
        final int n2 = 1;
        array4[n2] -= this.var_181d >> 1;
        final int[] array5;
        (array5 = new int[2])[0] = GLLib.s_screenX;
        array5[1] = GLLib.s_screenY;
        cGame.sub_26427(array5, array);
        cGame.sub_2c867(array, array5);
        return array5[0] >= array2[0] && array5[0] < array2[0] + this.var_1815 && array5[1] >= array2[1] && array5[1] < array2[1] + this.var_181d;
    }
    
    private boolean sub_a06e() {
        if (this.var_1865 != -1 && this.var_186d != -1 && (this.var_1865 & 0xFFFF0000) == 0x0) {
            int n;
            if ((this.var_1865 & 0x8000) != 0x0) {
                n = cGame.var_68d4[this.var_1865 & 0x7FFF].GetFrameRectCount(this.var_186d);
            }
            else {
                n = cGame.s_gameSprites[this.var_1865].GetFrameRectCount(this.var_186d);
            }
            if (n > 0) {
                final int[] array = new int[4];
                final int[] array2 = new int[2];
                final int[] array3 = new int[2];
                array2[0] = GLLib.s_screenX;
                array2[1] = GLLib.s_screenY;
                cGame.sub_26427(array2, array3);
                if ((this.var_1865 & 0x8000) != 0x0) {
                    cGame.var_68d4[this.var_1865 & 0x7FFF].GetFrameRect(this.var_186d, 0, array, 0);
                }
                else {
                    cGame.s_gameSprites[this.var_1865].GetFrameRect(this.var_186d, 0, array, 0);
                }
                final int n2 = this.var_17cd + array[0];
                final int n3 = this.var_17d5 + array[1];
                final int n4 = n2 + array[2];
                final int n5 = n3 + array[3];
                return array3[0] + 20 >= n2 && array3[0] - 20 <= n4 && array3[1] + 20 >= n3 && array3[1] - 20 <= n5;
            }
        }
        return false;
    }
    
    final boolean sub_a1cc() {
        return this.var_1845 != this.var_17cd || this.var_184d != this.var_17d5;
    }
    
    final void sub_a21a(final int n) {
        if ((n & 0x8) != 0x0) {
            this.sub_aac5();
        }
        this.var_1855 |= n;
    }
    
    final void sub_a25c(final int n) {
        if ((n & 0x8) != 0x0) {
            this.sub_aac5();
        }
        this.var_1855 &= ~n;
    }
    
    final boolean sub_a2a0(final int n) {
        return (this.var_1855 & n) == n;
    }
    
    final void sub_a2da() {
        if (this.var_17c5 == 49) {
            this.var_15ed = 0;
            this.sub_7795(5);
            return;
        }
        if (this.var_17c5 == 54) {
            if (this.sub_a2a0(32)) {
                this.var_163d = 0;
                this.sub_80fc();
            }
            else {
                this.var_1625 = 0;
            }
            cGame.var_8044 = 100;
            cGame.s_plantGrowTime = "0:0:0";
            return;
        }
        if (this.var_17c5 == 52) {
            this.sub_7b13(3);
            return;
        }
        if (this.var_17c5 == 50) {
            this.var_15c5 = 0L;
        }
    }
    
    private void sub_a392() {
        final int[] array;
        (array = new int[2])[0] = this.var_1845;
        array[1] = this.var_184d;
        final int[] array2 = new int[2];
        final int[] array3 = new int[2];
        if (this.var_18dd != null && this.var_18e5 > 0) {
            final int[] array4 = new int[3];
            final int[] array5 = new int[3];
            for (int i = 0; i < 3; ++i) {
                array2[0] = this.var_18dd.sub_a03(i);
                array2[1] = this.var_18dd.sub_a2d(i);
                cGame.sub_2c8b0(array2, array3);
                array4[i] = array3[0];
                array5[i] = array3[1];
            }
            if (this.var_17c5 == 42) {
                this.var_18ed -= Class_b.var_70;
            }
            else if (this.var_17c5 == 54) {
                this.var_18ed -= 5;
            }
            if (this.var_18ed <= 0) {
                this.var_18e5 = 0;
            }
            else {
                GLLib.sub_2dcf(array4[0], array5[0], array4[1], array5[1], array4[2], array5[2], this.var_18ed);
                array[0] = GLLib.var_1eb7;
                array[1] = GLLib.var_1ebf;
                if (this.var_17c5 == 42) {
                    this.sub_6426();
                }
            }
        }
        final int n = array[0] - this.var_17cd;
        final int n2 = array[1] - this.var_17d5;
        final int sub_2c75;
        if ((sub_2c75 = GLLib.Math_Sqrt(n * n + n2 * n2)) == 0) {
            this.var_17cd = array[0];
            this.var_17d5 = array[1];
            if (this.var_18ed <= 0) {
                this.var_17cd = this.var_1845;
                this.var_17d5 = this.var_184d;
            }
            return;
        }
        final int n3 = (this.var_17e5 * GLLib.s_game_frameDT << 8) / 1000;
        final int n4 = n * n3 / sub_2c75 >> 8;
        final int n5 = n2 * n3 / sub_2c75 >> 8;
        if (((n4 < 0) ? (-n4) : n4) >= ((n < 0) ? (-n) : n) || n4 == 0) {
            this.var_17cd = array[0];
        }
        else {
            this.var_17cd += n4;
        }
        if (((n5 < 0) ? (-n5) : n5) >= ((n2 < 0) ? (-n2) : n2) || n5 == 0) {
            this.var_17d5 = array[1];
            return;
        }
        this.var_17d5 += n5;
    }
    
    final int sub_a709() {
        int n = 0;
        final int var_18c5;
        switch ((((var_18c5 = this.var_18c5) >= 1000 && var_18c5 < 2000) || (var_18c5 >= 10000 && var_18c5 < 11000)) ? 50 : ((var_18c5 >= 2000 && var_18c5 < 3000) ? 54 : ((var_18c5 >= 3000 && var_18c5 < 4000) ? 49 : ((var_18c5 >= 7000 && var_18c5 < 8000) ? 20 : ((var_18c5 >= 25000 && var_18c5 < 26000) ? 48 : -1))))) {
            case 50: {
                n = GameDatas.s_allDatas[3].m_dataVars[this.var_1835][33];
                break;
            }
            case 49: {
                n = GameDatas.s_allDatas[2].m_dataVars[this.var_1835][18];
                break;
            }
            case 20: {
                n = GameDatas.s_allDatas[4].m_dataVars[this.var_1835][18];
                break;
            }
            case 54: {
                final GameDatas class_h = GameDatas.s_allDatas[0];
                if (this.sub_a2a0(2048)) {
                    n = class_h.m_dataVars[this.var_1835][11];
                    break;
                }
                n = class_h.m_dataVars[this.var_1835][10];
                break;
            }
        }
        return n;
    }
    
    final void sub_a8e3() {
        int n;
        if (this.var_17c5 == 49) {
            if (this.var_185d == 3 || this.var_185d == 4) {
                n = this.sub_a709();
                this.sub_7795(1);
                this.var_18c5 = cGame.var_8094[0];
                this.sub_a25c(1024);
            }
            else {
                if (this.sub_a2a0(2)) {
                    cGame.sub_2c9ec(this);
                }
                n = this.sub_a709();
                this.sub_4bf4();
            }
        }
        else {
            if (this.sub_a2a0(2)) {
                cGame.sub_2c9ec(this);
            }
            n = this.sub_a709();
            this.sub_4bf4();
        }
        this.sub_aa8a();
        sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(this.var_17cd, this.var_17d5, 36, 1000, false, n);
    }
    
    final int sub_a9ce() {
        int n = -1;
        switch (this.var_17c5) {
            case 54: {
                n = 3;
                break;
            }
            case 50: {
                n = 1;
                break;
            }
            case 20: {
                n = 2;
                break;
            }
            case 52: {
                n = 4;
                break;
            }
        }
        return n;
    }
    
    private void sub_aa65(final Class_f var_1895) {
        this.var_1895 = var_1895;
        var_1895.var_1895 = this;
    }
    
    final void sub_aa8a() {
        if (this.var_1895 != null) {
            this.var_1895.var_17c5 = -1;
        }
    }
    
    final void sub_aac5() {
        this.sub_aaf8(this.var_187d, this.var_1885);
        this.sub_aaf8(this.var_1865, this.var_186d);
    }
    
    private void sub_aaf8(final int n, final int n2) {
        if (n > -1 && n2 > -1) {
            int n3 = cGame.s_gameSprites[0]._modules_w_short[0] & 0xFFFF;
            int n4 = cGame.s_gameSprites[0]._modules_h_short[0] & 0xFFFF;
            final int n5 = n & 0x7FFF;
            (((n & 0x8000) != 0x0) ? cGame.var_68d4[n5] : cGame.s_gameSprites[n5]).sub_3524(Class_f.var_1905, n2, this.var_17cd, this.var_17d5);
            if (cGame.s_zoomLevel != 100) {
                Class_f.var_1905[0] = Class_f.var_1905[0] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[1] = Class_f.var_1905[1] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[2] = Class_f.var_1905[2] * cGame.s_zoomLevel / 100;
                Class_f.var_1905[3] = Class_f.var_1905[3] * cGame.s_zoomLevel / 100;
                n3 = (cGame.s_gameSprites[158]._modules_w_short[0] & 0xFFFF);
                n4 = (cGame.s_gameSprites[158]._modules_h_short[0] & 0xFFFF);
            }
            Class_f.var_1905[0] = Class_f.var_1905[0] / n3 * n3;
            Class_f.var_1905[1] = Class_f.var_1905[1] / n4 * n4;
            Class_f.var_1905[2] = (Class_f.var_1905[2] + n3 - 1) / n3 * n3;
            Class_f.var_1905[3] = (Class_f.var_1905[3] + n4 - 1) / n4 * n4;
            sub_4854(Class_f.var_1905[0], Class_f.var_1905[1], Class_f.var_1905[2], Class_f.var_1905[3]);
            if (!cGame.sub_2f517()) {
                GLLibPlayer.sub_4c02(Class_f.var_1905[0], Class_f.var_1905[1], Class_f.var_1905[2] - Class_f.var_1905[0], Class_f.var_1905[3] - Class_f.var_1905[1], 0);
            }
        }
    }
    
    private void sub_ac99(final int var_1845, final int var_184d) {
        final int[] array;
        (array = new int[2])[0] = var_1845;
        array[1] = var_184d;
        (this.var_18dd = new Class_n()).sub_26c(96, 96, cGame.var_6fc4, 14, 10, 10, 8);
        final int[] array2 = new int[2];
        cGame.sub_2c867(array, array2);
        array2[0] = ((array2[0] < 0) ? 0 : ((array2[0] > 95) ? 95 : array2[0]));
        array2[1] = ((array2[1] < 0) ? 0 : ((array2[1] > 95) ? 95 : array2[1]));
        final int[] array3 = new int[2];
        final int[] array4;
        (array4 = new int[2])[0] = this.var_17cd;
        array4[1] = this.var_17d5;
        cGame.sub_2c867(array4, array3);
        array3[0] = ((array3[0] < 0) ? 0 : ((array3[0] > 95) ? 95 : array3[0]));
        array3[1] = ((array3[1] < 0) ? 0 : ((array3[1] > 95) ? 95 : array3[1]));
        this.var_18dd.sub_2f7(array3[0], array3[1], 0, array2[0], array2[1]);
        final int sub_9e2 = this.var_18dd.sub_9e2();
        this.var_18ed = GLLib.var_1e9f;
        this.var_18e5 = 0;
        if (this.var_17c5 != 42) {
            if (this.var_17c5 == 54) {
                if (sub_9e2 > 2) {
                    this.var_18e5 = sub_9e2 - 1;
                }
                if (this.var_18e5 == 0) {
                    this.sub_8365(0);
                    return;
                }
                this.var_1845 = var_1845;
                this.var_184d = var_184d;
                this.sub_8365(1);
            }
            return;
        }
        if (sub_9e2 > 0) {
            this.var_18e5 = sub_9e2 - 1;
        }
        if (this.var_18e5 > 2) {
            this.var_18e5 = 2;
            final int[] array5;
            (array5 = new int[2])[0] = this.var_18dd.sub_a03(this.var_18e5);
            array5[1] = this.var_18dd.sub_a2d(this.var_18e5);
            final int[] array6 = new int[2];
            cGame.sub_2c8b0(array5, array6);
            this.var_17cd = array6[0];
            this.var_17d5 = array6[1];
            return;
        }
        if (Math.abs(this.var_1845 - this.var_17cd) > 180 || Math.abs(this.var_184d - this.var_17d5) > 180) {
            this.var_17cd += (this.var_1845 - this.var_17cd) * 80 / 100;
            this.var_17d5 += (this.var_184d - this.var_17d5) * 80 / 100;
        }
        this.var_18ed = 0;
    }
    
    private boolean sub_b03e() {
        final int[] array = new int[2];
        final int[] array2 = new int[2];
        array[0] = this.var_17cd;
        array[1] = this.var_17d5;
        cGame.sub_264d4(array, array2);
        return array2[0] > -100 && array2[0] < GLLib.s_screenWidth + 100 && array2[1] >= -100 && array2[1] < GLLib.s_screenHeight + 100;
    }
    
    static {
        Class_f.var_1775 = 0;
        Class_f.var_177d = 10;
        Class_f.var_1785 = 0;
        Class_f.var_178d = 10;
        Class_f.var_1795 = 0;
        Class_f.var_179d = 0;
    }
}
