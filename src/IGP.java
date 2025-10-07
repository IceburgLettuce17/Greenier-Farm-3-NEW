import java.util.Hashtable;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.Canvas;
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.CommandListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class IGP implements Runnable, CommandListener
{
    private static String s_igpClassVersion;
    private static String s_fullIgpSignature;
    private static String s_dataIGPVersion;
    private static String var_1c15;
    private static Font s_igpFont;
    private static String var_1c25;
    private static int var_1c2d;
    private static boolean[] var_1c35;
    private static int[] var_1c3d;
    private static int var_1c45;
    private static int var_1c4d;
    private static int var_1c55;
    private static int var_1c5d;
    private static int var_1c65;
    private static int var_1c6d;
    private static int var_1c75;
    private static int var_1c7d;
    private static int var_1c85;
    private static int var_1c8d;
    private static int var_1c95;
    private static int var_1c9d;
    private static int var_1ca5;
    private static int var_1cad;
    private static int var_1cb5;
    private static int var_1cbd;
    private static int var_1cc5;
    private static int var_1ccd;
    private static int var_1cd5;
    private static String var_1cdd;
    private static String var_1ce5;
    private static String var_1ced;
    private static String var_1cf5;
    private static String var_1cfd;
    private static String var_1d05;
    private static String s_operatorUrlProp;
    private static int var_1d15;
    private static int var_1d1d;
    private static int var_1d25;
    private static int var_1d2d;
    private static int var_1d35;
    private static int var_1d3d;
    private static int var_1d45;
    private static int var_1d4d;
    private static int var_1d55;
    private static int var_1d5d;
    private static int var_1d65;
    private static int var_1d6d;
    private static int var_1d75;
    private static int var_1d7d;
    private static int var_1d85;
    private static int var_1d8d;
    private static int var_1d95;
    private static int var_1d9d;
    private static int var_1da5;
    private static int var_1dad;
    private static int var_1db5;
    private static int var_1dbd;
    private static int var_1dc5;
    private static int var_1dcd;
    private static int var_1dd5;
    private static int var_1ddd;
    private static int var_1de5;
    private static int var_1ded;
    private static int var_1df5;
    private static int var_1dfd;
    private static int var_1e05;
    private static int var_1e0d;
    private static int var_1e15;
    private static int var_1e1d;
    private static int[] var_1e25;
    private static int var_1e2d;
    private static int var_1e35;
    private static int var_1e3d;
    private static int var_1e45;
    private static int var_1e4d;
    private static int var_1e55;
    private static String var_1e5d;
    private static String var_1e65;
    private static String var_1e6d;
    private static String var_1e75;
    private static String s_moreGamesUrlProp;
    private static String s_moreGamesStatProp;
    private static String s_moreGamesAppProp;
    private static String moreGamesStatAppProp;
    private static String var_1e9d;
    private static String var_1ea5;
    private static String var_1ead;
    private static String var_1eb5;
    private static String var_1ebd;
    private static String var_1ec5;
    private static String var_1ecd;
    private static String var_1ed5;
    private static String var_1edd;
    private static boolean var_1ee5;
    private static boolean var_1eed;
    private static String var_1ef5;
    private static boolean var_1efd;
    private static String[] var_1f05;
    private static int var_1f0d;
    private static String[] var_1f15;
    private static short[] var_1f1d;
    private static String[] var_1f25;
    private static String[] var_1f2d;
    private static int var_1f35;
    private static boolean var_1f3d;
    private static boolean var_1f45;
    private static int[][] var_1f4d;
    private static boolean var_1f55;
    private static MIDlet s_midlet;
    private static Canvas s_game;
    private static boolean var_1f6d;
    private static CommandListener s_cmdListener;
    private static IGP var_1f7d;
    private static boolean var_1f85;
    private static String var_1f8d;
    private static boolean s_isAvailable;
    private static int var_1f9d;
    private static int var_1fa5;
    private static int var_1fad;
    private static int var_1fb5;
    private static int var_1fbd;
    private static int var_1fc5;
    private static ASprite[] var_1fcd;
    private static ASprite var_1fd5;
    private static ASprite var_1fdd;
    private static int[] var_1fe5;
    private static String[] var_1fed;
    private static int[] var_1ff5;
    private static boolean[] var_1ffd;
    private static int var_2005;
    private static int var_200d;
    private static int var_2015;
    private static int var_201d;
    private static String var_2025;
    private static String var_202d;
    private static String s_igpLoadingMsg;
    private static String var_203d;
    private static String var_2045;
    private static String var_204d;
    private static boolean var_2055;
    private static int s_screenHeight;
    private static int s_screenWidth;
    private static int var_206d;
    private static int var_2075;
    private static int var_207d;
    private static boolean var_2085;
    private static boolean var_208d;
    private static boolean var_2095;
    private static boolean var_209d;
    private static boolean var_20a5;
    private static int var_20ad;
    private static int var_20b5;
    
    private static boolean sub_20f4() {
        sub_21d0();
        try {
            final InputStream sub_67eb;
            IGP.var_1e25 = new int[IGP.var_1e1d = (IGP.var_1e1d = ((sub_67eb = getResourceAsStream("/dataIGP")).read() & 0xFF)) + ((sub_67eb.read() & 0xFF) << 8)];
            for (int i = 0; i < IGP.var_1e1d; ++i) {
                IGP.var_1e25[i] = (sub_67eb.read() & 0xFF);
                final int[] var_1e25 = IGP.var_1e25;
                final int n = i;
                var_1e25[n] += (sub_67eb.read() & 0xFF) << 8;
                final int[] var_1e26 = IGP.var_1e25;
                final int n2 = i;
                var_1e26[n2] += (sub_67eb.read() & 0xFF) << 16;
                final int[] var_1e27 = IGP.var_1e25;
                final int n3 = i;
                var_1e27[n3] += (sub_67eb.read() & 0xFF) << 24;
            }
            sub_67eb.close();
        }
        catch (final Exception ex) {
            return false;
        }
        return true;
    }
    
    private static void sub_21d0() {
        IGP.var_1e25 = null;
        IGP.var_1e1d = 0;
        System.gc();
    }
    
    private static byte[] sub_21f6(int i) {
        if (i < 0 || i >= IGP.var_1e1d - 1) {
            return null;
        }
        final int n;
        if ((n = IGP.var_1e25[i + 1] - IGP.var_1e25[i]) == 0) {
            return null;
        }
        byte[] b = null;
        try {
            InputStream sub_67eb = getResourceAsStream("/dataIGP");
            sub_67eb.skip(2 + 4 * IGP.var_1e1d + IGP.var_1e25[i]);
            for (i = (b = new byte[n]).length; i > 0; i -= sub_67eb.read(b)) {}
            sub_67eb.close();
        }
        catch (final Exception ex) {}
        return b;
    }
    
    private static int sub_22c9(final byte[] array) {
        return (array[IGP.var_1e2d++] & 0xFF) + ((array[IGP.var_1e2d++] & 0xFF) << 8);
    }
    
    private static String sub_2306(final int n) {
        return "" + IGP.var_1f15[n];
    }
    
    private static void sub_2338(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        sub_2389(s, graphics, n, n2, n3, n4, 10, false);
    }
    
    private static void sub_2361(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4, final boolean b) {
        sub_2389(s, graphics, n, n2, n3, 3, 10, true);
    }
    
    private static void sub_2389(final String s, Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (b) {
            if (IGP.var_1e45 == 0) {
                IGP.var_1fd5.sub_6434(IGP.var_1e3d);
                final short[] sub_4ac6 = IGP.var_1fd5.sub_4ac6(s, n, false);
                final ASprite var_1fd5 = IGP.var_1fd5;
                final Graphics graphics2 = graphics;
                final short[] array = sub_4ac6;
                graphics = graphics2;
                var_1fd5.sub_547f(graphics2, s, array, n2, n3, 0, 10, n4, -1, false);
                return;
            }
            IGP.var_1fdd.sub_6434(IGP.var_1e3d);
            final short[] sub_4ac7 = IGP.var_1fdd.sub_4ac6(s, n, false);
            final ASprite var_1fdd = IGP.var_1fdd;
            final Graphics graphics3 = graphics;
            final short[] array2 = sub_4ac7;
            graphics = graphics3;
            var_1fdd.sub_547f(graphics3, s, array2, n2, n3, 0, 10, n4, -1, false);
        }
        else {
            if (IGP.var_1e45 == 0) {
                IGP.var_1fd5.sub_6434(IGP.var_1e3d);
                IGP.var_1fd5.sub_5cd2(graphics, s, n2, n3, n4);
                return;
            }
            IGP.var_1fdd.sub_6434(IGP.var_1e3d);
            IGP.var_1fdd.sub_5cd2(graphics, s, n2, n3, n4);
        }
    }
    
    public static void initialize(MIDlet midlet, Canvas game, int screenWidth, final int screenHeight) {
        new StringBuffer().append("initialize(midlet = ").append(midlet).append(", game = ").append(game).append(", screenWidth = ").append(screenWidth).append(", screenHeight = ").append(screenHeight).append(", cmdListener = ").append((Object)null).append(")");
        IGP.s_screenHeight = screenHeight;
        IGP.s_screenWidth = screenWidth;
        IGP.var_206d = IGP.s_screenHeight >> 1;
        IGP.var_2075 = IGP.s_screenWidth >> 1;
        if (2 > IGP.s_screenHeight) {
            IGP.var_1c2d = 2;
        }
        if (IGP.s_midlet == null && game != null) {
            IGP.s_midlet = midlet;
            IGP.s_game = game;
            sub_2bc9();
            new StringBuffer().append(IGP.s_fullIgpSignature).append("");
            sub_3367();
            IGP.var_1ecd = null;
            IGP.var_1edd = null;
            IGP.var_1e75 = null;
            IGP.var_1e5d = null;
            IGP.var_1cfd = null;
            IGP.var_1d05 = null;
            IGP.s_operatorUrlProp = null;
            IGP.var_1c25 = null;
            IGP.var_1ea5 = null;
            IGP.var_1ead = null;
            IGP.var_1ec5 = null;
            IGP.var_1eb5 = null;
            IGP.var_1ed5 = null;
            IGP.var_1e65 = null;
            System.gc();
        }
    }
    
    private static boolean sub_258f(String trim, final int n) {
        return trim != null && (trim = trim.trim()).length() != 0 && trim.toUpperCase().compareTo("DEL") != 0 && trim.toUpperCase().compareTo("NO") != 0 && trim.toUpperCase().compareTo("0") != 0;
    }
    
    private static String sub_25ff(final String s, final String str, String trim) {
        String str2 = "";
        try {
            if (trim != null && s != null && str != null) {
                final int index = s.indexOf(str + "=");
                trim = trim.trim();
                if (index >= 0 && trim.length() > 0) {
                    final int n = index + (str.length() + 1);
                    int endIndex;
                    if ((endIndex = s.indexOf(IGP.var_1ed5, n)) < 0) {
                        endIndex = s.length();
                    }
                    if ((str2 = s.substring(n, endIndex).trim()).length() == 0 || str2.compareTo("0") == 0 || str2.toUpperCase().compareTo("NO") == 0) {
                        str2 = "";
                    }
                    else if (str2.toUpperCase().compareTo("DEL") != 0 && str.compareTo("OP") != 0) {
                        final int index2;
                        if ((index2 = trim.indexOf(IGP.var_1ea5)) >= 0) {
                            str2 = trim.substring(0, index2) + str2 + trim.substring(index2 + IGP.var_1ea5.length());
                        }
                        else {
                            str2 = trim;
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {
            str2 = "";
        }
        return str2;
    }
    
    private static void sub_277b(final int n, final String str, final int n2, String s, final String s2, final int n3) {
        try {
            String s3 = "";
            String s4;
            if (IGP.var_1eed) {
                s4 = sub_25ff(IGP.s_midlet.getAppProperty(s), str, s2);
                if (str.equals(IGP.var_1ce5)) {
                    s = IGP.var_1e6d;
                    s3 = sub_25ff(IGP.s_midlet.getAppProperty(s), IGP.var_1f25[n - IGP.var_1f2d.length], s2);
                }
            }
            else if (str.equals(IGP.var_1cf5)) {
                s4 = IGP.var_203d;
            }
            else {
                s = IGP.var_1c25 + "-" + str;
                s4 = IGP.s_midlet.getAppProperty(s);
            }
            if (str.equals(IGP.var_1ce5)) {
                if (IGP.var_1eed) {
                    final int index;
                    if ((index = s4.indexOf(IGP.var_1ce5)) >= 0) {
                        s4 = s4.substring(0, index) + IGP.var_1f25[n - IGP.var_1f2d.length] + s4.substring(index + IGP.var_1f25[n - IGP.var_1f2d.length].length());
                    }
                }
                else {
                    s = IGP.var_1c25 + "-" + IGP.var_1ce5 + "-" + IGP.var_1f25[n - IGP.var_1f2d.length];
                    s4 = IGP.s_midlet.getAppProperty(s);
                    s = IGP.var_1c25 + "-" + IGP.var_1ce5 + "-" + IGP.var_1f25[n - IGP.var_1f2d.length];
                    s3 = IGP.s_midlet.getAppProperty(s);
                }
            }
            final boolean sub_258f = sub_258f(s4, 7);
            boolean sub_258f2 = true;
            if (str.equals(IGP.var_1ce5)) {
                sub_258f2 = sub_258f(s3, 7);
            }
            if (sub_258f && sub_258f2 && (s4.toUpperCase().compareTo("NO") != 0 || s4.toUpperCase().compareTo("0") != 0)) {
                IGP.var_1ffd[n] = true;
                IGP.var_1fed[n] = s4;
                if (IGP.var_1ffd[n]) {
                    switch (IGP.var_1ff5[n] = n3) {
                        case 4: {
                            ++IGP.var_2005;
                            if (IGP.var_1ee5) {
                                final StringBuffer sb = new StringBuffer();
                                final String[] var_1fed = IGP.var_1fed;
                                var_1fed[n] = sb.append(var_1fed[n]).append(IGP.var_1eb5).append(IGP.var_1ec5).append((IGP.var_2005 < 10) ? "0" : "").append(IGP.var_2005).toString();
                                return;
                            }
                            break;
                        }
                        case 6: {
                            ++IGP.var_200d;
                            if (IGP.var_1ee5) {
                                final StringBuffer sb2 = new StringBuffer();
                                final String[] var_1fed2 = IGP.var_1fed;
                                var_1fed2[n] = sb2.append(var_1fed2[n]).append(IGP.var_1eb5).append(IGP.var_1ce5).toString();
                                return;
                            }
                            break;
                        }
                        case 7: {
                            if (IGP.var_1ee5) {
                                final StringBuffer sb3 = new StringBuffer();
                                final String[] var_1fed3 = IGP.var_1fed;
                                var_1fed3[n] = sb3.append(var_1fed3[n]).append(IGP.var_1eb5).append(IGP.var_1ced).toString();
                                return;
                            }
                            break;
                        }
                        case 8: {
                            if (IGP.var_1ee5) {
                                final StringBuffer sb4 = new StringBuffer();
                                final String[] var_1fed4 = IGP.var_1fed;
                                var_1fed4[n] = sb4.append(var_1fed4[n]).append(IGP.var_1eb5).append(IGP.var_1cf5).toString();
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    private static String[] sub_2b59(final byte[] bytes) {
        final String[] array = new String[sub_22c9(bytes)];
        for (int i = 0; i < array.length; ++i) {
            final int sub_22c9 = sub_22c9(bytes);
            array[i] = new String(bytes, IGP.var_1e2d, sub_22c9);
            IGP.var_1e2d += sub_22c9;
        }
        return array;
    }
    
    private static void sub_2bc9() {
        try {
            if (!sub_20f4()) {
                IGP.s_isAvailable = false;
                return;
            }
            final byte[] sub_21f6;
            sub_22c9(sub_21f6 = sub_21f6(0));
            IGP.var_1e2d += sub_22c9(sub_21f6);
            final int sub_22c9 = sub_22c9(sub_21f6);
            IGP.var_1ef5 = new String(sub_21f6, IGP.var_1e2d, sub_22c9);
            IGP.var_1e2d += sub_22c9;
            IGP.var_1e2d += sub_22c9(sub_21f6);
            IGP.var_1e2d += sub_22c9(sub_21f6);
            IGP.var_1e2d += sub_22c9(sub_21f6);
            IGP.var_1efd = (sub_22c9(sub_21f6) == 1);
            sub_22c9(sub_21f6);
            sub_22c9(sub_21f6);
            IGP.var_1f05 = sub_2b59(sub_21f6);
            IGP.var_1f2d = sub_2b59(sub_21f6);
            IGP.var_1f25 = sub_2b59(sub_21f6);
            sub_2b59(sub_21f6);
            for (int i = 0; i < IGP.var_1c35.length; ++i) {
                IGP.var_1c35[i] = (sub_22c9(sub_21f6) == 1);
            }
            try {
                IGP.s_dataIGPVersion = new String(sub_21f6, IGP.var_1e2d, sub_22c9(sub_21f6));
                new StringBuffer().append("IGP dataIGP version: ").append(IGP.s_dataIGPVersion);
                new StringBuffer().append(IGP.s_igpClassVersion).append("z");
                if (!IGP.s_dataIGPVersion.startsWith(IGP.s_igpClassVersion)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(IGP.s_dataIGPVersion);
                    new StringBuffer().append("IGP Class version : ").append(IGP.s_igpClassVersion);
                }
            }
            catch (final Exception ex) {
                IGP.s_isAvailable = false;
            }
            sub_21d0();
        }
        catch (final Exception ex2) {
            IGP.s_isAvailable = false;
            return;
        }
        final String[] var_1f2d = IGP.var_1f2d;
        final String[] var_1f25 = IGP.var_1f25;
        final String[] array = var_1f2d;
        int n = ((var_1f2d.length - 1 > 0) ? (array.length - 1) : 0) + ((var_1f25.length - 1 > 0) ? (var_1f25.length - 1) : 0);
        IGP.var_1c8d = (IGP.var_1cd5 = (IGP.var_1ccd = (IGP.var_1cc5 = (IGP.var_1cbd = (IGP.var_1cb5 = (IGP.var_1cad = (IGP.var_1ca5 = (IGP.var_1c9d = (IGP.var_1c85 = (IGP.var_1c7d = (IGP.var_1c75 = (IGP.var_1c6d = (IGP.var_1c95 = ++n + 1) + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1) + 1) + 1;
        IGP.var_1f0d = IGP.var_1f2d.length + IGP.var_1f25.length + 1 + 1;
        for (int j = 0; j < IGP.var_1c35.length; ++j) {
            if (IGP.var_1c35[j]) {
                IGP.var_1c3d[j] = ++IGP.var_1c4d;
            }
            else {
                IGP.var_1c3d[j] = --IGP.var_1c45;
            }
        }
        ++IGP.var_1c4d;
        IGP.var_1fed = new String[IGP.var_1f0d];
        IGP.var_1ffd = new boolean[IGP.var_1f0d];
        IGP.var_1ff5 = new int[IGP.var_1f0d];
        for (int k = 0; k < IGP.var_1ffd.length; ++k) {
            IGP.var_1ffd[k] = false;
        }
        IGP.var_1c65 = (IGP.var_1c5d = (IGP.var_1c55 = IGP.var_1f2d.length) + IGP.var_1f25.length) + 1;
        IGP.s_moreGamesAppProp = IGP.s_midlet.getAppProperty(IGP.s_moreGamesUrlProp);
        IGP.moreGamesStatAppProp = IGP.s_midlet.getAppProperty(IGP.s_moreGamesStatProp);
        if (IGP.s_moreGamesAppProp != null && IGP.moreGamesStatAppProp.toLowerCase().equals(IGP.var_1e9d.toLowerCase())) {
            IGP.var_204d = IGP.s_moreGamesAppProp;
            IGP.var_2055 = true;
            IGP.s_isAvailable = true;
            return;
        }
        try {
            if ((IGP.var_1edd = IGP.s_midlet.getAppProperty(IGP.var_1e75)) != null) {
                IGP.var_1edd = IGP.var_1edd.trim();
                IGP.var_1eed = true;
                if (IGP.var_1edd.indexOf(IGP.var_1ecd) != -1) {
                    IGP.var_1ee5 = true;
                }
            }
        }
        catch (final Exception ex3) {}
        for (int l = 0; l < IGP.var_1f2d.length; ++l) {
            sub_277b(l, IGP.var_1f2d[l], 7, IGP.var_1e65, IGP.var_1edd, 4);
        }
        for (int n2 = 0; n2 < IGP.var_1f25.length; ++n2) {
            sub_277b(IGP.var_1c55 + n2, IGP.var_1ce5, 7, IGP.var_1e5d, IGP.var_1edd, 6);
        }
        try {
            final String trim;
            if (sub_258f(trim = IGP.s_midlet.getAppProperty(IGP.s_operatorUrlProp).trim(), 7)) {
                IGP.var_203d = trim;
            }
        }
        catch (final Exception ex4) {}
        sub_277b(IGP.var_1c5d, IGP.var_1ced, 7, IGP.var_1e5d, IGP.var_1edd, 7);
        sub_277b(IGP.var_1c65, IGP.var_1cf5, 7, IGP.var_1e5d, IGP.var_1edd, 8);
        IGP.var_2025 = sub_3135(IGP.s_midlet.getAppProperty(IGP.var_1cfd));
        IGP.var_202d = sub_3135(IGP.s_midlet.getAppProperty(IGP.var_1d05));
        IGP.var_1fe5 = sub_357f();
        if (sub_3607() > 0) {
            IGP.s_isAvailable = true;
        }
        new StringBuffer().append("isAvailable = ").append(IGP.s_isAvailable);
    }
    
    private static String sub_3135(String upperCase) {
        if (upperCase == null) {
            return "0";
        }
        String string = "";
        upperCase = upperCase.toUpperCase();
        boolean b = false;
        final int var_2065 = IGP.s_screenWidth;
        if (var_2065 >= IGP.s_screenHeight && var_2065 == 320) {
            b = true;
        }
        final char[] charArray = upperCase.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            final char c = charArray[i];
            if (!b || c != '\n') {
                string += c;
            }
        }
        return string;
    }
    
    public static boolean sub_320d() {
        return IGP.s_isAvailable;
    }
    
    public static void enterIGP(String loadingMsg, final int appLanguage) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(loadingMsg).append(", appLanguage = ").append(0).append(" (").append(IGP.var_1f05[0]).append(")");
        if (IGP.var_2055) {
            sub_3539();
            IGP.var_1f85 = true;
            IGP.var_1f8d = IGP.var_204d;
        }
        else {
            sub_4f48();
            if (0 < IGP.var_1f05.length) {
                IGP.var_201d = 0;
                IGP.s_igpLoadingMsg = loadingMsg;
                IGP.var_1fbd = -1;
                IGP.var_1f9d = 0;
                IGP.var_1fb5 = -1;
                IGP.var_1fad = 0;
                IGP.var_1f85 = true;
                IGP.s_igpFont = Font.getFont(0, 0, 8);
                sub_3539();
            }
            IGP.var_1fc5 = 4 + IGP.var_1f0d;
            IGP.var_1fad = sub_3660();
        }
        RecordStore store = null;
        try {
        	store = RecordStore.openRecordStore("igp19", false);
        }
        catch (final Exception ex) {
            try {
            	store = RecordStore.openRecordStore("igp19", true);
            }
            catch (final Exception ex2) {}
        }
        try {
            if (loadingMsg != null) {
                store.closeRecordStore();
            }
        }
        catch (final Exception ex3) {}
    }
    
    private static boolean sub_3367() {
        boolean b = false;
        for (int i = 0; i < IGP.var_1f05.length; ++i) {
            if (IGP.var_1f05[i].equals("SP")) {
                b = true;
            }
        }
        if (!b) {
            return false;
        }
        try {
            final String appProperty;
            if ((appProperty = IGP.s_midlet.getAppProperty(IGP.var_1e5d)) == null || appProperty.indexOf(IGP.var_1cdd) == -1) {
                return (IGP.var_2045 = IGP.s_midlet.getAppProperty(IGP.var_1c25 + "-" + IGP.var_1cdd)) != null;
            }
            final int beginIndex;
            final int endIndex;
            if ((endIndex = (beginIndex = appProperty.indexOf(IGP.var_1cdd) + IGP.var_1cdd.length() + 1) + IGP.var_1cdd.length()) >= appProperty.length()) {
                return false;
            }
            if (!appProperty.substring(beginIndex, endIndex).equals(IGP.var_1cdd)) {
                return false;
            }
            IGP.var_2045 = IGP.var_203d;
            if (IGP.var_1ee5) {
                final int index;
                if ((index = (IGP.var_2045 += IGP.var_1ead).indexOf(IGP.var_1ea5)) >= 0) {
                    IGP.var_2045 = IGP.var_2045.substring(0, index) + IGP.var_1cdd + IGP.var_2045.substring(index + IGP.var_1ea5.length());
                }
                if (IGP.var_2045.length() == 0) {
                    return false;
                }
            }
        }
        catch (final Exception ex) {
            return false;
        }
        return true;
    }
    
    private static void sub_3539() {
        if (IGP.var_1f7d == null) {
            IGP.var_1f7d = new IGP();
        }
        new Thread(IGP.var_1f7d).start();
    }
    
    private static int[] sub_357f() {
        final int[] array = new int[2];
        array[1] = (array[0] = 0);
        for (int i = 0; i < IGP.var_1ffd.length; ++i) {
            if (IGP.var_1ffd[i]) {
                if (i < IGP.var_1c55) {
                    final int[] array2 = array;
                    final int n = 0;
                    ++array2[n];
                }
                else {
                    final int[] array3 = array;
                    final int n2 = 1;
                    ++array3[n2];
                }
            }
        }
        return array;
    }
    
    private static int sub_3607() {
        int n = 0;
        for (int i = 0; i < IGP.var_1ffd.length; ++i) {
            if (IGP.var_1ffd[i]) {
                ++n;
            }
        }
        return n;
    }
    
    private static int sub_3660() {
        for (int i = 0; i < IGP.var_1ffd.length; ++i) {
            if (IGP.var_1ffd[i]) {
                return i;
            }
        }
        return -1;
    }
    
    private static void sub_36b3(int offset) {
        try {
            IGP.var_1e2d = 0;
            switch (offset) {
                case -1: {
                    IGP.var_1fcd = new ASprite[IGP.var_1d55];
                    return;
                }
                case 0: {
                    return;
                }
                case 4: {
                    return;
                }
                case 5: {
                    return;
                }
                case 6: {
                    return;
                }
                case 7: {
                    return;
                }
                case 8: {
                    return;
                }
                case 1: {
                    sub_20f4();
                    final byte[] sub_21f6;
                    sub_22c9(sub_21f6 = sub_21f6(offset));
                    final int sub_22c9;
                    IGP.var_1f15 = new String[sub_22c9 = sub_22c9(sub_21f6)];
                    final byte[] bytes = new byte[sub_22c9];
                    System.arraycopy(sub_21f6, IGP.var_1e2d, bytes, 0, sub_22c9);
                    IGP.var_1e2d += sub_22c9;
                    sub_22c9(sub_21f6);
                    final int n;
                    IGP.var_1f1d = new short[n = ((sub_21f6[IGP.var_1e2d++] & 0xFF) | (sub_21f6[IGP.var_1e2d++] & 0xFF) << 8)];
                    for (int i = 0; i < n - 1; ++i) {
                        IGP.var_1f1d[i] = (short)((sub_21f6[IGP.var_1e2d++] & 0xFF) + ((sub_21f6[IGP.var_1e2d++] & 0xFF) << 8));
                    }
                    IGP.var_1f1d[n - 1] = (short)sub_22c9;
                    for (int j = 0; j < n; ++j) {
                        offset = ((j == 0) ? 0 : (IGP.var_1f1d[j - 1] & 0xFFFF));
                        final int length;
                        if ((length = (IGP.var_1f1d[j] & 0xFFFF) - offset) != 0) {
                            try {
                                IGP.var_1f15[j] = new String(bytes, offset, length, "UTF-8");
                            }
                            catch (final Exception ex) {}
                        }
                    }
                    return;
                }
                case 2: {
                    GLLib.Pack_Open("/11");
                    (IGP.var_1fd5 = sub_680f(IGP.var_1d35, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(IGP.var_1d45));
                    IGP.var_1e35 = IGP.var_1fd5.sub_494e();
                    (IGP.var_1fdd = sub_680f(IGP.var_1d3d, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(IGP.var_1d4d));
                    if (IGP.s_screenWidth > 160 && IGP.s_screenWidth > 220) {
                        if (IGP.s_screenWidth <= 320) {
                            IGP.var_1fd5.sub_4a1a(-1);
                            if (IGP.s_screenHeight == 240 || IGP.var_1efd) {
                                IGP.var_1fd5.sub_4a1a(0);
                            }
                        }
                        else if (IGP.s_screenWidth <= 480) {
                            IGP.var_1fdd.sub_4a1a(-1);
                        }
                    }
                    GLLib.Pack_FullyClose();
                    return;
                }
                case 3: {
                    GLLib.Pack_Open("/11");
                    for (int k = 0; k < IGP.var_1d55; ++k) {
                        if (k != IGP.var_1d35 && k != IGP.var_1d45 && k != IGP.var_1d3d && k != IGP.var_1d4d) {
                            IGP.var_1fcd[k] = sub_680f(k, 1, true, true);
                        }
                    }
                    GLLib.Pack_FullyClose();
                    break;
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    private static void sub_3a10(final boolean b) {
        for (int i = 0; i < IGP.var_1d55; ++i) {
            if (IGP.var_1fcd[i] != null && i != IGP.var_1d35 && i != IGP.var_1d45 && i != IGP.var_1d3d && i != IGP.var_1d4d && i != 0) {
                IGP.var_1fcd[i].sub_123f();
                IGP.var_1fcd[i] = null;
            }
        }
        if (b) {
            sub_21d0();
            GLLib.Pack_FullyClose();
            IGP.var_1f1d = null;
            IGP.var_1f15 = null;
            IGP.s_igpLoadingMsg = null;
            for (int j = 0; j < IGP.var_1d55; ++j) {
                if (IGP.var_1fcd[j] != null) {
                    IGP.var_1fcd[j].sub_123f();
                    IGP.var_1fcd[j] = null;
                }
            }
            IGP.var_1fcd = null;
            IGP.var_1fd5.sub_123f();
            IGP.var_1fd5 = null;
            IGP.var_1fdd.sub_123f();
            IGP.var_1fdd = null;
        }
        System.gc();
    }
    
    public static void sub_3b06(final boolean b) {
        if (b) {
            if (IGP.var_1f9d == 0 || IGP.var_1f9d == 2) {
                IGP.var_1fb5 = IGP.var_1f9d;
                IGP.var_1f9d = 5;
            }
            sub_4f48();
            return;
        }
        if (IGP.var_1f9d == 5) {
            IGP.var_1f9d = IGP.var_1fb5;
            IGP.var_1fbd = -1;
        }
    }
    
    public static boolean sub_3b75(int var_1fa5) {
        if (IGP.var_2055) {
            return true;
        }
        if (!IGP.s_isAvailable) {
            return true;
        }
        if (IGP.var_2085) {
            IGP.var_2085 = false;
        }
        else {
            IGP.var_1fa5 = var_1fa5;
        }
        Label_2560: {
            switch (IGP.var_1f9d) {
                case 0: {
                    if (IGP.var_1fbd >= IGP.var_1fc5) {
                        IGP.var_1f9d = 1;
                        IGP.var_2015 = IGP.var_1fad;
                        var_1fa5 = IGP.s_screenWidth;
                        final int var_205d = IGP.s_screenHeight;
                        IGP.var_1f4d = new int[IGP.var_1e15][];
                        for (int i = 0; i < IGP.var_1e15; ++i) {
                            (IGP.var_1f4d[i] = new int[2])[0] = 0;
                            IGP.var_1f4d[i][1] = 0;
                        }
                        final int sub_48a7 = sub_48a7(0, 0);
                        final int sub_48cb = sub_48cb(0, 0);
                        final int sub_48a8 = sub_48a7(IGP.var_1d15, 0);
                        final int sub_48cb2 = sub_48cb(IGP.var_1d15, 0);
                        final int sub_48cb3 = sub_48cb(0, 9);
                        int n = sub_48a7(0, 10);
                        int n2 = sub_48cb(0, 10);
                        if ((var_1fa5 == 240 && (var_205d == 320 || var_205d == 400)) || (var_1fa5 == 360 && (var_205d == 640 || var_205d == 480))) {
                            n = sub_48a7(0, 35);
                            n2 = sub_48cb(0, 35);
                        }
                        final int sub_48cb4 = sub_48cb(0, 15);
                        final int sub_48cb5 = sub_48cb(0, 29);
                        IGP.var_1fd5.sub_5917(sub_2306(IGP.var_1cd5), null);
                        final short[] sub_4ac6 = IGP.var_1fd5.sub_4ac6(sub_2306(IGP.var_1cd5), var_1fa5 - sub_48a7, false);
                        IGP.var_1e55 = ASprite.var_119f;
                        int n3 = IGP.var_1e4d = sub_4ac6[0] * IGP.var_1e35;
                        if (sub_48cb > IGP.var_1e4d) {
                            n3 = sub_48cb;
                        }
                        if (n2 > n3) {
                            n3 = n2;
                        }
                        final int var_1e35;
                        final int n4 = var_205d - ((var_1e35 = IGP.var_1e35) + sub_48cb3 + sub_48cb2 + n3) - 3 - sub_48cb4 >> 2;
                        int n5 = -3;
                        if (var_205d <= 160) {
                            n5 = 2;
                        }
                        else if (var_205d <= 220) {
                            n5 = 1;
                        }
                        else if (var_205d <= 240) {
                            n5 = 0;
                        }
                        else if (var_205d <= 320) {
                            n5 = 0;
                            if (var_1fa5 == 240) {
                                n5 = 1;
                            }
                        }
                        else if (var_205d <= 360) {
                            n5 = 3;
                        }
                        else if (var_205d <= 400) {
                            n5 = 1;
                        }
                        else if (var_205d <= 480) {
                            n5 = 6;
                            if (var_1fa5 == 360) {
                                n5 = 0;
                            }
                        }
                        else if (var_205d <= 640) {
                            n5 = 0;
                        }
                        else if (var_205d <= 800) {
                            n5 = 3;
                        }
                        int n6 = sub_48a7(0, 15);
                        int n7 = sub_48a7(0, 17);
                        if ((var_1fa5 == 240 && (var_205d == 320 || var_205d == 400)) || (var_1fa5 == 360 && (var_205d == 640 || var_205d == 480))) {
                            n6 = sub_48a7(0, 31);
                            n7 = sub_48a7(0, 33);
                        }
                        IGP.var_1f4d[IGP.var_1d65][0] = var_1fa5 - n6 >> 2;
                        IGP.var_1f4d[IGP.var_1d65][1] = 3;
                        IGP.var_1f4d[IGP.var_1d6d][0] = (var_1fa5 - n7 >> 2) * 3;
                        IGP.var_1f4d[IGP.var_1d6d][1] = IGP.var_1f4d[IGP.var_1d65][1];
                        final int sub_33a1 = IGP.var_1fcd[0].sub_33a1(15, IGP.var_1fcd[0].sub_377d(15) - 1);
                        IGP.var_1f4d[IGP.var_1d75][0] = var_1fa5 >> 2;
                        IGP.var_1f4d[IGP.var_1d75][1] = IGP.var_1f4d[IGP.var_1d65][1] + (sub_33a1 >> 1) + n5;
                        IGP.var_1f4d[IGP.var_1d7d][0] = (var_1fa5 >> 1) + (var_1fa5 >> 2);
                        IGP.var_1f4d[IGP.var_1d7d][1] = IGP.var_1f4d[IGP.var_1d75][1];
                        IGP.var_1f4d[0][0] = var_1fa5 >> 1;
                        IGP.var_1f4d[0][1] = n4 + (var_1e35 >> 1) + n5 - 2;
                        final int[] array = IGP.var_1f4d[0];
                        final int n8 = 1;
                        array[n8] += IGP.var_1f4d[IGP.var_1d65][1] + sub_48cb4;
                        IGP.var_1f4d[IGP.var_1d85][0] = 0;
                        IGP.var_1f4d[IGP.var_1d85][1] = IGP.var_1f4d[0][1] + n4 + (var_1e35 >> 1) - n5 + 2;
                        IGP.var_1f4d[IGP.var_1d5d][0] = var_1fa5 >> 1;
                        IGP.var_1f4d[IGP.var_1d5d][1] = IGP.var_1f4d[IGP.var_1d85][1] + (sub_48cb3 >> 1) + n5 - 2;
                        final int sub_48a9 = sub_48a7(0, 2);
                        final int sub_48cb6 = sub_48cb(0, 2);
                        IGP.var_1f4d[IGP.var_1dbd][0] = 5;
                        IGP.var_1f4d[IGP.var_1dbd][1] = IGP.var_1f4d[IGP.var_1d85][1] + (sub_48cb3 >> 1) - (sub_48cb6 >> 1);
                        IGP.var_1f4d[IGP.var_1dc5][0] = var_1fa5 - 5 - sub_48a9;
                        IGP.var_1f4d[IGP.var_1dc5][1] = IGP.var_1f4d[IGP.var_1dbd][1];
                        IGP.var_1f4d[IGP.var_1dad][0] = var_1fa5 - IGP.var_1c2d - sub_48a7;
                        IGP.var_1f4d[IGP.var_1dad][1] = var_205d - 2 - sub_48cb;
                        IGP.var_1f4d[IGP.var_1e0d][0] = IGP.var_1c2d;
                        IGP.var_1f4d[IGP.var_1e0d][1] = var_205d - 2 - sub_48cb;
                        final int n9 = IGP.var_1f4d[IGP.var_1dad][0] - (n << 1);
                        IGP.var_1f4d[IGP.var_1dd5][0] = n9 / 3;
                        IGP.var_1f4d[IGP.var_1dd5][1] = var_205d - 2 - n2;
                        IGP.var_1f4d[IGP.var_1de5][0] = IGP.var_1f4d[IGP.var_1dd5][0] + (n >> 1) + n % 2;
                        IGP.var_1f4d[IGP.var_1de5][1] = IGP.var_1f4d[IGP.var_1dd5][1] + (n2 >> 1) + n5;
                        IGP.var_1f4d[IGP.var_1dcd][0] = IGP.var_1f4d[IGP.var_1dd5][0] + n + n9 / 3;
                        IGP.var_1f4d[IGP.var_1dcd][1] = IGP.var_1f4d[IGP.var_1dd5][1];
                        IGP.var_1f4d[IGP.var_1ded][0] = IGP.var_1f4d[IGP.var_1dcd][0] + (n >> 1) + n % 2;
                        IGP.var_1f4d[IGP.var_1ded][1] = IGP.var_1f4d[IGP.var_1dcd][1] + (n2 >> 1) + n5;
                        IGP.var_1f4d[IGP.var_1ddd][0] = (var_1fa5 >> 1) - (n >> 1);
                        IGP.var_1f4d[IGP.var_1ddd][1] = IGP.var_1f4d[IGP.var_1dd5][1];
                        IGP.var_1f4d[IGP.var_1df5][0] = IGP.var_1f4d[IGP.var_1ddd][0] + (n >> 1) + n % 2;
                        IGP.var_1f4d[IGP.var_1df5][1] = IGP.var_1f4d[IGP.var_1ddd][1] + (n2 >> 1) + n5;
                        IGP.var_1f4d[IGP.var_1d8d][0] = (var_1fa5 >> 1) - (sub_48a8 >> 1);
                        IGP.var_1f4d[IGP.var_1d8d][1] = IGP.var_1f4d[IGP.var_1d85][1] + sub_48cb3 + n4;
                        IGP.var_1f4d[IGP.var_1dfd][0] = var_1fa5 - sub_48a7 >> 1;
                        IGP.var_1f4d[IGP.var_1dfd][1] = IGP.var_1f4d[IGP.var_1d8d][1] + sub_48cb2 + (var_205d - IGP.var_1f4d[IGP.var_1d8d][1] - sub_48cb2 >> 1);
                        IGP.var_1f4d[IGP.var_1dfd][0] = var_1fa5 - n >> 2;
                        if (var_205d > var_1fa5) {
                            IGP.var_1f4d[IGP.var_1dfd][1] = IGP.var_1f4d[IGP.var_1d8d][1] + sub_48cb2 + (IGP.var_1f4d[IGP.var_1ddd][1] - (IGP.var_1f4d[IGP.var_1d8d][1] + sub_48cb2) >> 1);
                            IGP.var_1f4d[IGP.var_1dfd][0] = var_1fa5 >> 1;
                        }
                        IGP.var_1f4d[IGP.var_1d95][0] = var_1fa5 >> 1;
                        IGP.var_1f4d[IGP.var_1d95][1] = IGP.var_1f4d[IGP.var_1d8d][1] + (sub_48cb2 << 1) / 3;
                        IGP.var_1f4d[IGP.var_1d9d][0] = 5;
                        IGP.var_1f4d[IGP.var_1d9d][1] = IGP.var_1f4d[IGP.var_1d8d][1] + (sub_48cb2 >> 1) - (sub_48cb(0, 6) >> 1);
                        IGP.var_1f4d[IGP.var_1da5][0] = var_1fa5 - sub_48a7(0, 4) - 5;
                        IGP.var_1f4d[IGP.var_1da5][1] = IGP.var_1f4d[IGP.var_1d9d][1];
                        int n10 = sub_48a7(0, 8);
                        int n11 = sub_48cb(0, 8);
                        if (var_1fa5 == 360 && var_205d == 480) {
                            n10 = sub_48a7(0, 39);
                            n11 = sub_48cb(0, 39);
                        }
                        IGP.var_1f4d[IGP.var_1db5][0] = IGP.var_1f4d[IGP.var_1d8d][0] + sub_48a8 - n10;
                        IGP.var_1f4d[IGP.var_1db5][1] = IGP.var_1f4d[IGP.var_1d8d][1] + sub_48cb2 - n11;
                        IGP.var_1f4d[IGP.var_1e05][0] = 0;
                        IGP.var_1f4d[IGP.var_1e05][1] = IGP.var_1f4d[0][1] - (sub_48cb5 >> 1);
                        var_1fa5 = IGP.var_1fcd[0].sub_377d(15);
                        var_1fa5 = IGP.var_1fcd[0].sub_33a1(15, var_1fa5 - 1);
                        IGP.var_1f4d[IGP.var_1e05][1] = IGP.var_1f4d[IGP.var_1d65][1] + (var_1fa5 >> 1) - (sub_48cb5 >> 1);
                    }
                    else {
                        sub_36b3(IGP.var_1fbd);
                    }
                    ++IGP.var_1fbd;
                    break;
                }
                case 1: {
                    Label_2264: {
                        Label_2258: {
                            switch (IGP.var_1fa5) {
                                case 26: {
                                    IGP.var_1f9d = 4;
                                    break Label_2560;
                                }
                                case 23: {
                                    var_1fa5 = 0;
                                    if (IGP.var_1fad >= IGP.var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (IGP.var_1fe5[var_1fa5] > 1) {
                                        if (IGP.var_1fad == 0) {
                                            IGP.var_1fad = IGP.var_1c55 - 1;
                                        }
                                        else if (IGP.var_1fad == IGP.var_1c55) {
                                            IGP.var_1fad = IGP.var_1f0d - 1;
                                        }
                                        else {
                                            --IGP.var_1fad;
                                        }
                                        while (!IGP.var_1ffd[IGP.var_1fad]) {
                                            if (IGP.var_1fad == 0) {
                                                IGP.var_1fad = IGP.var_1c55 - 1;
                                            }
                                            else if (IGP.var_1fad == IGP.var_1c55) {
                                                IGP.var_1fad = IGP.var_1f0d - 1;
                                            }
                                            else {
                                                --IGP.var_1fad;
                                            }
                                        }
                                        IGP.var_1f3d = true;
                                        break;
                                    }
                                    break Label_2264;
                                }
                                case 24: {
                                    var_1fa5 = 0;
                                    if (IGP.var_1fad >= IGP.var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (IGP.var_1fe5[var_1fa5] > 1) {
                                        if (!IGP.var_1f3d) {
                                            if (IGP.var_1fad == IGP.var_1c55 - 1) {
                                                IGP.var_1fad = 0;
                                            }
                                            else if (IGP.var_1fad == IGP.var_1f0d - 1) {
                                                IGP.var_1fad = IGP.var_1c55;
                                            }
                                            else {
                                                ++IGP.var_1fad;
                                            }
                                            while (!IGP.var_1ffd[IGP.var_1fad]) {
                                                if (IGP.var_1fad == IGP.var_1c55 - 1) {
                                                    IGP.var_1fad = 0;
                                                }
                                                else if (IGP.var_1fad == IGP.var_1f0d - 1) {
                                                    IGP.var_1fad = IGP.var_1c55;
                                                }
                                                else {
                                                    ++IGP.var_1fad;
                                                }
                                            }
                                            IGP.var_1f45 = true;
                                        }
                                        IGP.var_2015 = IGP.var_1fad;
                                        break Label_2560;
                                    }
                                    break Label_2264;
                                }
                                case 32: {
                                    break Label_2560;
                                }
                                case 21: {
                                    break Label_2560;
                                }
                                case 25:
                                case 27: {
                                    IGP.var_1f9d = 6;
                                    break Label_2560;
                                }
                                case 28: {
                                Label_2175:
                                    while (true) {
                                        IGP.var_1fad = 0;
                                        while (!IGP.var_1ffd[IGP.var_1fad]) {
                                            if (IGP.var_1fad == IGP.var_1c55 - 1) {
                                                continue Label_2175;
                                            }
                                            ++IGP.var_1fad;
                                        }
                                        break;
                                    }
                                    IGP.var_2015 = IGP.var_1fad;
                                    break Label_2560;
                                }
                                case 29: {
                                Label_2220:
                                    while (true) {
                                        IGP.var_1fad = IGP.var_1c55;
                                        while (!IGP.var_1ffd[IGP.var_1fad]) {
                                            if (IGP.var_1fad == IGP.var_1f0d - 1) {
                                                continue Label_2220;
                                            }
                                            ++IGP.var_1fad;
                                        }
                                        break Label_2258;
                                    }
                                }
                            }
                        }
                        IGP.var_2015 = IGP.var_1fad;
                    }
                    break;
                }
                case 6: {
                    String s;
                    if (IGP.var_1f55) {
                        s = IGP.var_1fed[IGP.var_1c65];
                    }
                    else {
                        s = IGP.var_1fed[IGP.var_1fad];
                    }
                    if (s != null && s.length() > 0) {
                        if (IGP.var_1ee5) {
                            final int index;
                            if ((index = s.indexOf(IGP.var_1ebd)) == -1) {
                                s = s + IGP.var_1ebd + IGP.var_1f05[0];
                            }
                            else {
                                s = s.substring(0, index) + IGP.var_1ebd + IGP.var_1f05[0] + s.substring(index + IGP.var_1ebd.length() + 2);
                            }
                        }
                        IGP.var_1f8d = s;
                        break;
                    }
                    break;
                }
                case 2: {
                    sub_3a10(false);
                    var_1fa5 = IGP.var_1fad;
                    int var_1fbd;
                    final int n12 = (IGP.var_1ff5[var_1fa5] == 4) ? (var_1fbd = IGP.var_1ff5[var_1fa5]) : ((IGP.var_1ff5[var_1fa5] == 6) ? (var_1fbd = 6) : ((IGP.var_1ff5[var_1fa5] == 7) ? (var_1fbd = 7) : ((IGP.var_1ff5[var_1fa5] == 8) ? (var_1fbd = 8) : (var_1fbd = -1))));
                    IGP.var_1fbd = var_1fbd;
                    sub_36b3(n12);
                    IGP.var_1f9d = 1;
                }
                case 3: {
                    switch (IGP.var_1fa5) {
                        case 26: {
                            IGP.var_1f9d = 1;
                            break;
                        }
                        case 25:
                        case 30: {
                            IGP.var_1f8d = null;
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    sub_3a10(true);
                    IGP.var_1f85 = false;
                    return true;
                }
            }
        }
        return false;
    }
    
    private static int sub_48a7(final int n, final int n2) {
        return IGP.var_1fcd[n].sub_312c(n2);
    }
    
    private static int sub_48cb(final int n, final int n2) {
        return IGP.var_1fcd[n].sub_3189(n2);
    }
    
    public static void sub_48ef(int n, int n2) {
        int sub_4b75 = sub_4b75(n, n2);
        final int var_2065 = IGP.s_screenWidth;
        final int var_205d = IGP.s_screenHeight;
        final int n3 = n;
        n = n2;
        n2 = n3;
        n2 = var_205d - n2;
        int n4 = sub_48cb(0, 10);
        if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
            n4 = sub_48cb(0, 35);
        }
        final int sub_48cb = sub_48cb(0, 15);
        final int sub_48a7 = sub_48a7(0, 6);
        final int sub_48cb2 = sub_48cb(0, 6);
        if (Math.abs(IGP.var_20ad - n) > var_2065 * 10 / 100 && n2 < var_205d - n4 && n2 > sub_48cb && (IGP.var_20ad >= sub_48a7 || IGP.var_20b5 <= IGP.var_1f4d[IGP.var_1d9d][1] || IGP.var_20b5 >= IGP.var_1f4d[IGP.var_1d9d][1] + sub_48cb2) && (IGP.var_20ad <= var_2065 - sub_48a7 || IGP.var_20b5 <= IGP.var_1f4d[IGP.var_1da5][1] || IGP.var_20b5 >= IGP.var_1f4d[IGP.var_1da5][1] + sub_48cb2) && IGP.var_20b5 >= sub_48cb && IGP.var_20b5 <= var_205d - n4) {
            if (IGP.var_20ad - n < 0) {
                sub_4b75 = 23;
                IGP.var_2095 = true;
            }
            else {
                sub_4b75 = 24;
                IGP.var_2095 = true;
            }
        }
        if (sub_4b75 != 0) {
            IGP.var_1fa5 = sub_4b75;
            IGP.var_2085 = true;
            if (IGP.var_209d && IGP.var_1fed[IGP.var_1c65] != null) {
                IGP.var_1f55 = true;
            }
        }
        IGP.var_207d = 0;
        IGP.var_208d = false;
        IGP.var_209d = false;
        IGP.var_20a5 = false;
        IGP.var_20ad = -1;
        IGP.var_20b5 = -1;
    }
    
    public static void sub_4acf(int var_20ad, int var_20b5) {
        final int sub_4b75;
        if ((sub_4b75 = sub_4b75(var_20ad, var_20b5)) != 0) {
            IGP.var_207d = sub_4b75;
        }
        final int var_205d = IGP.s_screenHeight;
        final int n = var_20ad;
        var_20ad = var_20b5;
        var_20b5 = n;
        var_20b5 = var_205d - var_20b5;
        if (IGP.var_20ad == -1 || IGP.var_20b5 == -1) {
            IGP.var_20ad = var_20ad;
            IGP.var_20b5 = var_20b5;
        }
    }
    
    public static void sub_4b41(final int n, final int n2) {
        IGP.var_1fa5 = 0;
        IGP.var_207d = 0;
        IGP.var_208d = false;
        IGP.var_209d = false;
        IGP.var_20a5 = false;
        sub_4acf(n, n2);
    }
    
    private static int sub_4b75(int n, int n2) {
        final int var_2065 = IGP.s_screenWidth;
        final int var_205d = IGP.s_screenHeight;
        final int n3 = n;
        n = n2;
        n2 = n3;
        n2 = var_205d - n2;
        if (n < 0 || n2 < 0) {
            return 0;
        }
        if (IGP.var_1f9d == 0 || !IGP.var_1f85) {
            return 0;
        }
        if (n2 > IGP.var_1f4d[IGP.var_1d65][1] && n2 < IGP.var_1f4d[IGP.var_1d65][1] + sub_48cb(0, 15)) {
            if (n < var_2065 >> 1) {
                if (IGP.var_1fad > IGP.var_1f2d.length - 1) {
                    return 28;
                }
            }
            else if (IGP.var_1fad < IGP.var_1f2d.length) {
                return 29;
            }
        }
        final int n4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
        if (n > IGP.var_1f4d[IGP.var_1d9d][0] + n4 && n < IGP.var_1f4d[IGP.var_1d9d][0] + sub_48a7(0, 6) + n4 && n2 > IGP.var_1f4d[IGP.var_1d9d][1] && n2 < IGP.var_1f4d[IGP.var_1d9d][1] + sub_48cb(0, 6)) {
            return 23;
        }
        if (n > IGP.var_1f4d[IGP.var_1da5][0] - n4 && n < IGP.var_1f4d[IGP.var_1da5][0] + sub_48a7(0, 4) - n4 && n2 > IGP.var_1f4d[IGP.var_1da5][1] && n2 < IGP.var_1f4d[IGP.var_1da5][1] + sub_48cb(0, 4)) {
            return 24;
        }
        int n5 = sub_48a7(0, 10);
        int n6 = sub_48cb(0, 10);
        if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
            n5 = sub_48a7(0, 35);
            n6 = sub_48cb(0, 35);
        }
        if (IGP.var_1ff5[IGP.var_1fad] == 6 || IGP.var_1ff5[IGP.var_1fad] == 7 || IGP.var_1ff5[IGP.var_1fad] == 8) {
            if (n > IGP.var_1f4d[IGP.var_1ddd][0] && n < IGP.var_1f4d[IGP.var_1ddd][0] + n5 && n2 > IGP.var_1f4d[IGP.var_1ddd][1] && n2 < IGP.var_1f4d[IGP.var_1ddd][1] + n6) {
                IGP.var_208d = true;
                return 25;
            }
        }
        else {
            if (n > IGP.var_1f4d[IGP.var_1dd5][0] && n < IGP.var_1f4d[IGP.var_1dd5][0] + n5 && n2 > IGP.var_1f4d[IGP.var_1dd5][1] && n2 < IGP.var_1f4d[IGP.var_1dd5][1] + n6) {
                IGP.var_209d = true;
                return 25;
            }
            if (n > IGP.var_1f4d[IGP.var_1dcd][0] && n < IGP.var_1f4d[IGP.var_1dcd][0] + n5 && n2 > IGP.var_1f4d[IGP.var_1dcd][1] && n2 < IGP.var_1f4d[IGP.var_1dcd][1] + n6) {
                IGP.var_208d = true;
                return 25;
            }
        }
        if (n > IGP.var_1f4d[IGP.var_1dad][0] - 10 && n < IGP.var_1f4d[IGP.var_1dad][0] + sub_48a7(0, 0) + 10 && n2 > IGP.var_1f4d[IGP.var_1dad][1] - 10 && n2 < IGP.var_1f4d[IGP.var_1dad][1] + sub_48cb(0, 0) + 10) {
            IGP.var_20a5 = true;
            return 26;
        }
        final int sub_48a7 = sub_48a7(IGP.var_1d15, 0);
        final int sub_48cb = sub_48cb(IGP.var_1d15, 0);
        if (n > IGP.var_1f4d[IGP.var_1d8d][0] && n < IGP.var_1f4d[IGP.var_1d8d][0] + sub_48a7 && n2 > IGP.var_1f4d[IGP.var_1d8d][1] && n2 < IGP.var_1f4d[IGP.var_1d8d][1] + sub_48cb) {
            return 25;
        }
        return 0;
    }
    
    private static void sub_4f48() {
        IGP.var_1fa5 = 0;
        IGP.var_207d = 0;
        IGP.var_2085 = true;
        IGP.var_208d = false;
        IGP.var_209d = false;
        IGP.var_20a5 = false;
        IGP.var_1f35 = 0;
        IGP.var_1f3d = false;
        IGP.var_1f45 = false;
        IGP.var_20ad = -1;
        IGP.var_20b5 = -1;
    }
    
    public static void sub_4f8f(Graphics var_1daf) {
        if (IGP.var_2055) {
            return;
        }
        if (!IGP.s_isAvailable) {
            return;
        }
        final Graphics graphics;
        sub_669f(graphics = var_1daf, 0, 0, IGP.s_screenHeight, IGP.s_screenWidth);
        switch (IGP.var_1f9d) {
            case 0: {
                graphics.setColor(0);
                GLLib.FillRect(graphics, 0, 0, IGP.s_screenWidth, IGP.s_screenHeight, true);
                final int var_206d = IGP.var_206d;
                final int n = IGP.s_screenWidth * 3 / 4;
                final int var_1fbd = IGP.var_1fbd;
                final int var_1fc5 = IGP.var_1fc5;
                int n2 = var_1fbd;
                final int n3 = n;
                final int n4 = var_206d;
                if (n2 > var_1fc5) {
                    n2 = var_1fc5;
                }
                final int n5 = (IGP.s_screenWidth - n3) / 2;
                final int n6 = (n3 - 2 - 2) * n2 / var_1fc5 + 1;
                sub_669f(graphics, 0, 0, IGP.s_screenHeight, IGP.s_screenWidth);
                graphics.setColor(16777215);
                GLLib.FillRect(graphics, n5, n4, n3, 6, true);
                graphics.setColor(0);
                final int n7 = n5 + 1 + 1;
                final int n8 = n4 + 1 + 1;
                final int n9 = n3 - 2 - 1;
                final int n10 = n8;
                GLLib.FillRect(graphics, n7, n10, n9, 3, true);
                graphics.setColor(16711680);
                GLLib.FillRect(graphics, n5 + 1 + 1, n10, n6, 3, true);
                if (IGP.s_igpLoadingMsg != null && !IGP.s_igpLoadingMsg.trim().equals("")) {
                    Image image = Image.createImage(IGP.s_screenWidth, 30);
                    final Graphics graphics5 = image.getGraphics();
                    graphics5.setColor(0);
                    GLLib.FillRect(graphics5, 0, 0, 30, IGP.s_screenWidth, true);
                    graphics5.setColor(16777215);
                    // REST IN PEACE YOU POOR SOUL
                    //if (graphics5 == null) {
                    //    GLLib.g = GLLib.s_lastPaintGraphics;
                    //}
                    //else {
                    GLLib.g = graphics5;
                    //}
                    GLLib.g.setFont(IGP.s_igpFont);
                    GLLib.sub_3877(IGP.s_igpLoadingMsg, IGP.var_2075, 25, 33);
                    if (var_1daf == null) {
                        GLLib.g = GLLib.s_lastPaintGraphics;
                    }
                    else {
                        GLLib.g = var_1daf;
                    }
                    graphics.drawRegion(image, 0, 0, IGP.s_screenHeight, 30, 5, IGP.var_206d + 5 + 30, 0, 0);
                    return;
                }
                break;
            }
            case 1: {
                sub_5366(graphics);
                if (System.currentTimeMillis() % 1000L <= 500L && (IGP.var_207d != 27 || IGP.var_208d)) {
                    break;
                }
                if (IGP.var_1fad != IGP.var_1c65) {
                    return;
                }
                return;
            }
            case 2: {
                return;
            }
            case 5: {
                return;
            }
            case 3: {
                sub_5366(graphics);
                final int var_205d = IGP.s_screenHeight;
                final int var_2065 = IGP.s_screenWidth;
                final int n11 = var_205d * 40 / 100;
                final int n12 = sub_48a7(0, 0) - 5;
                sub_52f7(graphics, 0, n11 - 1, var_2065, var_205d - (n11 - 1 << 1), -1);
                sub_52f7(graphics, 0, n11, var_2065, var_205d - (n11 << 1), -220209185);
                graphics.setColor(16777215);
                GLLib.FillRect(graphics, 0, var_205d - (n12 + 1), var_2065, n12 + 1, true);
                graphics.setColor(-220209185);
                GLLib.FillRect(graphics, 0, var_205d - n12, var_2065, n12, true);
                IGP.var_1e3d = 1;
                sub_2361(sub_2306(IGP.var_1c8d), graphics, IGP.s_screenHeight, var_2065 >> 1, var_205d >> 1, 3, true);
                sub_6621(graphics);
                break;
            }
        }
    }
    
    private static void sub_52f7(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array = new int[n3 * n4];
        for (int i = 0; i < array.length; ++i) {
            array[i] = n5;
        }
        graphics.drawRGB(array, 0, n3, 0, n2, n3, n4, true);
    }
    
    private static void sub_5366(final Graphics graphics) {
        final int var_2065 = IGP.s_screenWidth;
        final int var_205d = IGP.s_screenHeight;
        graphics.setColor(16777215);
        if (IGP.var_1c35[0]) {
            graphics.setColor(0);
        }
        graphics.setColor(16777215);
        GLLib.FillRect(graphics, 0, 0, var_2065, var_205d, true);
        final int n = IGP.var_1f4d[0][0];
        final int n2 = IGP.var_1f4d[0][1];
        final int n3 = IGP.var_1f4d[IGP.var_1d5d][0];
        final int n4 = IGP.var_1f4d[IGP.var_1d5d][1];
        final int n5 = IGP.var_1f4d[IGP.var_1d8d][0];
        final int n6 = IGP.var_1f4d[IGP.var_1d8d][1];
        final int n7 = IGP.var_1f4d[IGP.var_1db5][0];
        final int n8 = IGP.var_1f4d[IGP.var_1db5][1];
        final int n9 = IGP.var_1f4d[IGP.var_1d85][0];
        final int n10 = IGP.var_1f4d[IGP.var_1d85][1];
        final int n11 = IGP.var_1f4d[IGP.var_1dbd][0];
        final int n12 = IGP.var_1f4d[IGP.var_1dbd][1];
        final int n13 = IGP.var_1f4d[IGP.var_1dc5][0];
        final int n14 = IGP.var_1f4d[IGP.var_1dc5][1];
        final int n15 = IGP.var_1f4d[IGP.var_1dfd][0];
        final int n16 = IGP.var_1f4d[IGP.var_1dfd][1];
        final int n17 = IGP.var_1f4d[IGP.var_1e05][1];
        sub_6676(graphics, 0, 9, n9, n10);
        IGP.var_1e3d = 1;
        IGP.var_1e45 = 0;
        if (IGP.var_1ff5[IGP.var_1fad] == 6) {
            if (!IGP.var_2025.equals("0")) {
                sub_2338(IGP.var_2025, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(IGP.var_2015), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, IGP.var_1d1d + (IGP.var_1fad - IGP.var_1c55), 0, n5, n6);
            int n18 = 8;
            if (var_2065 == 360 && var_205d == 480) {
                n18 = 39;
            }
            sub_6676(graphics, 0, n18, n7, n8);
            if (IGP.var_1ef5 == null || !IGP.var_1ef5.equals("TMUS")) {
                final int var_1e45 = IGP.var_1e45;
                IGP.var_1e45 = 1;
                int n19 = sub_48a7(0, 10);
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n19 = sub_48a7(0, 35);
                }
                int n20 = var_2065 - IGP.var_1c2d - n19 >> 1;
                if (var_205d > var_2065) {
                    n20 = var_2065;
                }
                sub_2361(sub_2306(IGP.var_1cd5), graphics, n20, n15, n16, 3, true);
                IGP.var_1e45 = var_1e45;
            }
        }
        else if (IGP.var_1ff5[IGP.var_1fad] == 7) {
            if (!IGP.var_202d.equals("0")) {
                sub_2338(IGP.var_202d, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(IGP.var_1ca5), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, IGP.var_1d25, 0, n5, n6);
        }
        else if (IGP.var_1ff5[IGP.var_1fad] == 8) {
            sub_2338(sub_2306(IGP.var_1cad), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(IGP.var_1c95), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, IGP.var_1d2d, 0, n5, n6);
        }
        else {
            IGP.var_1e3d = 1;
            sub_2338(sub_2306(IGP.var_1c9d), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(IGP.var_2015), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, IGP.var_1d15 + IGP.var_1fad, 0, n5, n6);
        }
        int n21 = 0;
        if (IGP.var_1fad >= IGP.var_1c55) {
            n21 = 1;
        }
        boolean b = false;
        if (IGP.var_1fe5[n21] > 1) {
            b = true;
        }
        if (b) {
            sub_6676(graphics, 0, 2, n11, n12);
            sub_6676(graphics, 0, 3, n13, n14);
        }
        final int n22 = IGP.var_1f4d[IGP.var_1d65][0];
        final int n23 = IGP.var_1f4d[IGP.var_1d65][1];
        final int n24 = IGP.var_1f4d[IGP.var_1d6d][0];
        final int n25 = IGP.var_1f4d[IGP.var_1d6d][1];
        final int n26 = IGP.var_1f4d[IGP.var_1dd5][0];
        final int n27 = IGP.var_1f4d[IGP.var_1dd5][1];
        final int n28 = IGP.var_1f4d[IGP.var_1dcd][0];
        final int n29 = IGP.var_1f4d[IGP.var_1dcd][1];
        final int n30 = IGP.var_1f4d[IGP.var_1ddd][0];
        final int n31 = IGP.var_1f4d[IGP.var_1ddd][1];
        final int n32 = IGP.var_1f4d[IGP.var_1d75][0];
        final int n33 = IGP.var_1f4d[IGP.var_1d75][1];
        final int n34 = IGP.var_1f4d[IGP.var_1d7d][0];
        final int n35 = IGP.var_1f4d[IGP.var_1d7d][1];
        final int n36 = IGP.var_1f4d[IGP.var_1de5][0];
        final int n37 = IGP.var_1f4d[IGP.var_1de5][1];
        final int n38 = IGP.var_1f4d[IGP.var_1ded][0];
        final int n39 = IGP.var_1f4d[IGP.var_1ded][1];
        final int n40 = IGP.var_1f4d[IGP.var_1df5][0];
        final int n41 = IGP.var_1f4d[IGP.var_1df5][1];
        if (IGP.var_1ff5[IGP.var_1fad] == 6 || IGP.var_1ff5[IGP.var_1fad] == 7 || IGP.var_1ff5[IGP.var_1fad] == 8) {
            final int sub_48a7 = sub_48a7(0, 19);
            int n42 = sub_48a7(0, 10);
            int n43 = sub_48cb(0, 10);
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n42 = sub_48a7(0, 35);
                n43 = sub_48cb(0, 35);
            }
            int n44 = 15;
            int n45 = 18;
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n44 = 31;
                n45 = 34;
            }
            sub_6676(graphics, 0, n44, n22, n23);
            sub_6676(graphics, 0, n45, n24, n25);
            int n46 = 13;
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n46 = 37;
            }
            if (IGP.var_208d) {
                n46 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n46 = 36;
                }
            }
            sub_6676(graphics, 0, n46, n30, n31);
            IGP.var_1e3d = 0;
            if (IGP.var_208d) {
                IGP.var_1e3d = 1;
            }
            final short[] sub_4ac6;
            IGP.var_1e55 = (sub_4ac6 = IGP.var_1fd5.sub_4ac6(sub_2306(IGP.var_1ccd), n42 - sub_48a7 - 4, false))[2];
            if (sub_4ac6[0] > 1) {
                IGP.var_1e55 = n42 - sub_48a7 - 8;
            }
            final int n48;
            final int n47 = ((n48 = n42 - (IGP.var_1e55 + sub_48a7 + 4)) < 0) ? 0 : (n48 >> 1);
            sub_6676(graphics, 0, 19, n40 - (n42 >> 1) + n47, n31 + (n43 >> 1) - (sub_48cb(0, 19) >> 1));
            if (sub_4ac6[0] > 1) {
                int n49 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n49 = 4;
                }
                sub_2361(sub_2306(IGP.var_1ccd), graphics, n42 - sub_48a7 + n49, n40 + (sub_48a7 >> 1), n41 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(IGP.var_1ccd), graphics, var_2065, n40 - (n42 >> 1) + n47 + sub_48a7 + 2, n41 - 2, 6);
            }
        }
        else {
            int n50 = 17;
            int n51 = 16;
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n50 = 33;
                n51 = 32;
            }
            sub_6676(graphics, 0, n50, n24, n25);
            sub_6676(graphics, 0, n51, n22, n23);
            int n52 = 13;
            int n53 = 10;
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n52 = 37;
                n53 = 35;
            }
            if (IGP.var_208d) {
                n52 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n52 = 36;
                }
            }
            if (IGP.var_209d) {
                n53 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n53 = 36;
                }
            }
            sub_6676(graphics, 0, n53, n26, n27);
            sub_6676(graphics, 0, n52, n28, n29);
            IGP.var_1e3d = 0;
            if (IGP.var_209d) {
                IGP.var_1e3d = 1;
            }
            sub_2338(sub_2306(IGP.var_1cc5), graphics, var_2065, n36, n37 - 2, 3);
            final int sub_48a8 = sub_48a7(0, 19);
            int n54 = sub_48a7(0, 10);
            int n55 = sub_48cb(0, 10);
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n54 = sub_48a7(0, 35);
                n55 = sub_48cb(0, 35);
            }
            final short[] sub_4ac7;
            IGP.var_1e55 = (sub_4ac7 = IGP.var_1fd5.sub_4ac6(sub_2306(IGP.var_1ccd), n54 - sub_48a8 - 4, false))[2];
            if (sub_4ac7[0] > 1) {
                IGP.var_1e55 = n54 - sub_48a8 - 8;
            }
            final int n57;
            final int n56 = ((n57 = n54 - (IGP.var_1e55 + sub_48a8 + 4)) < 0) ? 0 : (n57 >> 1);
            sub_6676(graphics, 0, 19, n38 - (n54 >> 1) + n56, n29 + (n55 >> 1) - (sub_48cb(0, 19) >> 1));
            IGP.var_1e3d = 0;
            if (IGP.var_208d) {
                IGP.var_1e3d = 1;
            }
            if (sub_4ac7[0] > 1) {
                int n58 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n58 = 4;
                }
                sub_2361(sub_2306(IGP.var_1ccd), graphics, n54 - sub_48a8 + n58, n38 + (sub_48a8 >> 1), n39 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(IGP.var_1ccd), graphics, var_2065, n38 - (n54 >> 1) + n56 + sub_48a8 + 2, n39 - 2, 6);
            }
            IGP.var_1e3d = 0;
        }
        IGP.var_1e3d = 0;
        sub_2338(sub_2306(IGP.var_1cb5), graphics, var_2065, n32, n33, 3);
        sub_2338(sub_2306(IGP.var_1cbd), graphics, var_2065, n34, n35, 3);
        IGP.var_1e55 = IGP.var_1fd5.sub_4ac6(sub_2306(IGP.var_1cbd), var_2065, false)[2];
        sub_6676(graphics, 0, 29, n34 + (IGP.var_1e55 >> 1) + 3, n17);
        if (b) {
            final int abs = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
            int n59 = 6;
            int n60 = 4;
            final int n61 = abs + 1;
            final int n62 = IGP.var_1f4d[IGP.var_1d9d][0];
            final int n63 = IGP.var_1f4d[IGP.var_1d9d][1];
            final int n64 = IGP.var_1f4d[IGP.var_1da5][0];
            final int n65 = IGP.var_1f4d[IGP.var_1da5][1];
            if (IGP.var_1f3d || IGP.var_207d == 23) {
                if (!IGP.var_2095) {
                    n59 = 7;
                }
                ++IGP.var_1f35;
            }
            if (IGP.var_1f45 || IGP.var_207d == 24) {
                if (!IGP.var_2095) {
                    n60 = 5;
                }
                ++IGP.var_1f35;
            }
            sub_6676(graphics, 0, n59, n62 + n61, n63);
            sub_6676(graphics, 0, n60, n64 - n61, n65);
            if (IGP.var_1f35 > 4) {
                IGP.var_1f3d = false;
                IGP.var_1f45 = false;
                IGP.var_1f35 = 0;
                IGP.var_2095 = false;
            }
        }
        sub_6621(graphics);
    }
    
    private static void sub_6621(final Graphics graphics) {
        final int n = IGP.var_1f4d[IGP.var_1dad][0];
        final int n2 = IGP.var_1f4d[IGP.var_1dad][1];
        int n3 = 0;
        if (IGP.var_20a5) {
            n3 = 1;
        }
        sub_6676(graphics, 0, n3, n, n2);
    }
    
    private static void sub_6676(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        IGP.var_1fcd[n].sub_71ae(graphics, n2, n3, n4, 0);
    }
    
    private static void sub_669f(final Graphics graphics, int max, int max2, int min, int min2) {
        max = Math.max(0, 0);
        max2 = Math.max(0, 0);
        min = Math.min(min, IGP.s_screenHeight);
        min2 = Math.min(min2, IGP.s_screenWidth);
        GLLib.sub_36f4(graphics, max, max2, min2, min, true);
    }
    
    public final void run() {
        new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());
        while (IGP.var_1f85) {
            try {
                if (IGP.var_1f8d != null) {
                	IGP.var_1c15 = IGP.var_1f8d;
                    if (IGP.var_1c15 != null && IGP.var_1c15.length() > 0) {
                        IGP.var_1f55 = false;
                        final String urlPlatformRequest = IGP.var_1c15;
                        IGP.var_1c15 = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(urlPlatformRequest);
                        try {
                            IGP.s_midlet.platformRequest(urlPlatformRequest);
                            Thread.sleep(200L);
                        }
                        catch (final Exception ex) {}
                        IGP.var_1f9d = 1;
                    }
                    IGP.var_1f8d = null;
                }
                Thread.sleep(1000L);
            }
            catch (final Exception ex2) {}
        }
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
    }
    
    private static InputStream getResourceAsStream(final String name) {
        return "a".getClass().getResourceAsStream(name);
    }
    
    private static ASprite sub_680f(int n, int n2, final boolean b, final boolean b2) {
        final int n3 = n;
        n = n3;
        final ASprite class_e;
        (class_e = new ASprite()).sub_1372(GLLib.Pack_ReadData(n), 0);
        for (n = 0; n2 >> n != 0; ++n) {
            if ((n2 >> n & 0x1) != 0x0) {
                class_e.sub_64d8(n, 0, -1, -1);
            }
        }
        if (b2) {
            class_e.sub_2f84();
        }
        return class_e;
    }
    
    static {
        IGP.s_igpClassVersion = "2.3";
        IGP.s_fullIgpSignature = "IGP-Signature=" + IGP.s_igpClassVersion;
        IGP.s_dataIGPVersion = "";
        IGP.var_1c25 = "URL";
        IGP.var_1c2d = 2;
        IGP.var_1c35 = new boolean[1];
        IGP.var_1c3d = new int[1];
        IGP.var_1c45 = -1;
        IGP.var_1c4d = 8;
        IGP.var_1cdd = "ZVIP";
        IGP.var_1ce5 = "SCFR";
        IGP.var_1ced = "GMCL";
        IGP.var_1cf5 = "CCTL";
        IGP.var_1cfd = "TITLE-FREEMIUM";
        IGP.var_1d05 = "TITLE-GLCLUB";
        IGP.s_operatorUrlProp = "URL-OPERATOR";
        IGP.var_1d15 = 1;
        IGP.var_1d1d = 4;
        IGP.var_1d25 = 8;
        IGP.var_1d2d = 9;
        IGP.var_1d35 = 10;
        IGP.var_1d3d = 11;
        IGP.var_1d45 = 12;
        IGP.var_1d4d = 13;
        IGP.var_1d55 = 14;
        IGP.var_1d5d = 1;
        IGP.var_1d65 = 2;
        IGP.var_1d6d = 3;
        IGP.var_1d75 = 4;
        IGP.var_1d7d = 5;
        IGP.var_1d85 = 6;
        IGP.var_1d8d = 7;
        IGP.var_1d95 = 8;
        IGP.var_1d9d = 9;
        IGP.var_1da5 = 10;
        IGP.var_1dad = 11;
        IGP.var_1db5 = 12;
        IGP.var_1dbd = 13;
        IGP.var_1dc5 = 14;
        IGP.var_1dcd = 15;
        IGP.var_1dd5 = 16;
        IGP.var_1ddd = 17;
        IGP.var_1de5 = 18;
        IGP.var_1ded = 19;
        IGP.var_1df5 = 20;
        IGP.var_1dfd = 21;
        IGP.var_1e05 = 22;
        IGP.var_1e0d = 24;
        IGP.var_1e15 = 25;
        IGP.var_1e5d = "IGP-CATEGORIES";
        IGP.var_1e65 = "IGP-PROMOS";
        IGP.var_1e6d = "IGP-FREEMIUM";
        IGP.var_1e75 = "URL-TEMPLATE-GAME";
        IGP.s_moreGamesUrlProp = "more_games_url";
        IGP.s_moreGamesStatProp = "more_games_status";
        IGP.s_moreGamesAppProp = null;
        IGP.moreGamesStatAppProp = null;
        IGP.var_1e9d = "on";
        IGP.var_1ea5 = "XXXX";
        IGP.var_1ead = "&ctg=" + IGP.var_1ea5;
        IGP.var_1eb5 = "&ctg=";
        IGP.var_1ebd = "&lg=";
        IGP.var_1ec5 = "SC";
        IGP.var_1ecd = "ingameads.gameloft.com/redir";
        IGP.var_1ed5 = ";";
        IGP.var_1efd = false;
        IGP.var_1f05 = new String[0];
        IGP.var_1f55 = false;
        IGP.var_1f6d = false;
        IGP.s_cmdListener = null;
        IGP.var_1f7d = null;
        IGP.var_1f85 = false;
        IGP.var_1f8d = null;
        IGP.s_isAvailable = false;
        IGP.var_1fe5 = new int[2];
        IGP.var_2005 = 0;
        IGP.var_200d = 0;
        IGP.var_203d = "";
        IGP.var_2055 = false;
        IGP.var_207d = 0;
        IGP.var_2085 = false;
        IGP.var_208d = false;
        IGP.var_2095 = false;
        IGP.var_209d = false;
        IGP.var_20a5 = false;
        IGP.var_20ad = -1;
        IGP.var_20b5 = -1;
        new Hashtable();
    }
}
