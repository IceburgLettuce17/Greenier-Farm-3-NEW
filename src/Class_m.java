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

public final class Class_m implements Runnable, CommandListener
{
    private static String var_1bfd;
    private static String var_1c05;
    private static String var_1c0d;
    private static String var_1c15;
    private static Font var_1c1d;
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
    private static String var_1d0d;
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
    private static String var_1e7d;
    private static String var_1e85;
    private static String var_1e8d;
    private static String var_1e95;
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
    private static MIDlet var_1f5d;
    private static Canvas var_1f65;
    private static boolean var_1f6d;
    private static CommandListener var_1f75;
    private static Class_m var_1f7d;
    private static boolean var_1f85;
    private static String var_1f8d;
    private static boolean var_1f95;
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
    private static String var_2035;
    private static String var_203d;
    private static String var_2045;
    private static String var_204d;
    private static boolean var_2055;
    private static int var_205d;
    private static int var_2065;
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
            Class_m.var_1e25 = new int[Class_m.var_1e1d = (Class_m.var_1e1d = ((sub_67eb = sub_67eb("/dataIGP")).read() & 0xFF)) + ((sub_67eb.read() & 0xFF) << 8)];
            for (int i = 0; i < Class_m.var_1e1d; ++i) {
                Class_m.var_1e25[i] = (sub_67eb.read() & 0xFF);
                final int[] var_1e25 = Class_m.var_1e25;
                final int n = i;
                var_1e25[n] += (sub_67eb.read() & 0xFF) << 8;
                final int[] var_1e26 = Class_m.var_1e25;
                final int n2 = i;
                var_1e26[n2] += (sub_67eb.read() & 0xFF) << 16;
                final int[] var_1e27 = Class_m.var_1e25;
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
        Class_m.var_1e25 = null;
        Class_m.var_1e1d = 0;
        System.gc();
    }
    
    private static byte[] sub_21f6(int i) {
        if (i < 0 || i >= Class_m.var_1e1d - 1) {
            return null;
        }
        final int n;
        if ((n = Class_m.var_1e25[i + 1] - Class_m.var_1e25[i]) == 0) {
            return null;
        }
        byte[] b = null;
        try {
            final InputStream sub_67eb;
            (sub_67eb = sub_67eb("/dataIGP")).skip(2 + 4 * Class_m.var_1e1d + Class_m.var_1e25[i]);
            for (i = (b = new byte[n]).length; i > 0; i -= sub_67eb.read(b)) {}
            sub_67eb.close();
        }
        catch (final Exception ex) {}
        return b;
    }
    
    private static int sub_22c9(final byte[] array) {
        return (array[Class_m.var_1e2d++] & 0xFF) + ((array[Class_m.var_1e2d++] & 0xFF) << 8);
    }
    
    private static String sub_2306(final int n) {
        return "" + Class_m.var_1f15[n];
    }
    
    private static void sub_2338(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        sub_2389(s, graphics, n, n2, n3, n4, 10, false);
    }
    
    private static void sub_2361(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4, final boolean b) {
        sub_2389(s, graphics, n, n2, n3, 3, 10, true);
    }
    
    private static void sub_2389(final String s, Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (b) {
            if (Class_m.var_1e45 == 0) {
                Class_m.var_1fd5.sub_6434(Class_m.var_1e3d);
                final short[] sub_4ac6 = Class_m.var_1fd5.sub_4ac6(s, n, false);
                final ASprite var_1fd5 = Class_m.var_1fd5;
                final Graphics graphics2 = graphics;
                final short[] array = sub_4ac6;
                graphics = graphics2;
                var_1fd5.sub_547f(graphics2, s, array, n2, n3, 0, 10, n4, -1, false);
                return;
            }
            Class_m.var_1fdd.sub_6434(Class_m.var_1e3d);
            final short[] sub_4ac7 = Class_m.var_1fdd.sub_4ac6(s, n, false);
            final ASprite var_1fdd = Class_m.var_1fdd;
            final Graphics graphics3 = graphics;
            final short[] array2 = sub_4ac7;
            graphics = graphics3;
            var_1fdd.sub_547f(graphics3, s, array2, n2, n3, 0, 10, n4, -1, false);
        }
        else {
            if (Class_m.var_1e45 == 0) {
                Class_m.var_1fd5.sub_6434(Class_m.var_1e3d);
                Class_m.var_1fd5.sub_5cd2(graphics, s, n2, n3, n4);
                return;
            }
            Class_m.var_1fdd.sub_6434(Class_m.var_1e3d);
            Class_m.var_1fdd.sub_5cd2(graphics, s, n2, n3, n4);
        }
    }
    
    public static void sub_2484(MIDlet miDlet, Canvas canvas, int n, final int n2) {
        final MIDlet miDlet2 = miDlet;
        final Canvas canvas2 = canvas;
        canvas = canvas2;
        miDlet = miDlet2;
        new StringBuffer().append("initialize(midlet = ").append(miDlet).append(", game = ").append(canvas).append(", screenWidth = ").append(n).append(", screenHeight = ").append(n2).append(", cmdListener = ").append((Object)null).append(")");
        Class_m.var_205d = n2;
        Class_m.var_2065 = n;
        Class_m.var_206d = Class_m.var_205d >> 1;
        Class_m.var_2075 = Class_m.var_2065 >> 1;
        if (2 > Class_m.var_205d) {
            Class_m.var_1c2d = 2;
        }
        if (Class_m.var_1f5d == null && canvas != null) {
            Class_m.var_1f5d = miDlet;
            Class_m.var_1f65 = canvas;
            sub_2bc9();
            new StringBuffer().append(Class_m.var_1c05).append("");
            sub_3367();
            Class_m.var_1ecd = null;
            Class_m.var_1edd = null;
            Class_m.var_1e75 = null;
            Class_m.var_1e5d = null;
            Class_m.var_1cfd = null;
            Class_m.var_1d05 = null;
            Class_m.var_1d0d = null;
            Class_m.var_1c25 = null;
            Class_m.var_1ea5 = null;
            Class_m.var_1ead = null;
            Class_m.var_1ec5 = null;
            Class_m.var_1eb5 = null;
            Class_m.var_1ed5 = null;
            Class_m.var_1e65 = null;
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
                    if ((endIndex = s.indexOf(Class_m.var_1ed5, n)) < 0) {
                        endIndex = s.length();
                    }
                    if ((str2 = s.substring(n, endIndex).trim()).length() == 0 || str2.compareTo("0") == 0 || str2.toUpperCase().compareTo("NO") == 0) {
                        str2 = "";
                    }
                    else if (str2.toUpperCase().compareTo("DEL") != 0 && str.compareTo("OP") != 0) {
                        final int index2;
                        if ((index2 = trim.indexOf(Class_m.var_1ea5)) >= 0) {
                            str2 = trim.substring(0, index2) + str2 + trim.substring(index2 + Class_m.var_1ea5.length());
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
            if (Class_m.var_1eed) {
                s4 = sub_25ff(Class_m.var_1f5d.getAppProperty(s), str, s2);
                if (str.equals(Class_m.var_1ce5)) {
                    s = Class_m.var_1e6d;
                    s3 = sub_25ff(Class_m.var_1f5d.getAppProperty(s), Class_m.var_1f25[n - Class_m.var_1f2d.length], s2);
                }
            }
            else if (str.equals(Class_m.var_1cf5)) {
                s4 = Class_m.var_203d;
            }
            else {
                s = Class_m.var_1c25 + "-" + str;
                s4 = Class_m.var_1f5d.getAppProperty(s);
            }
            if (str.equals(Class_m.var_1ce5)) {
                if (Class_m.var_1eed) {
                    final int index;
                    if ((index = s4.indexOf(Class_m.var_1ce5)) >= 0) {
                        s4 = s4.substring(0, index) + Class_m.var_1f25[n - Class_m.var_1f2d.length] + s4.substring(index + Class_m.var_1f25[n - Class_m.var_1f2d.length].length());
                    }
                }
                else {
                    s = Class_m.var_1c25 + "-" + Class_m.var_1ce5 + "-" + Class_m.var_1f25[n - Class_m.var_1f2d.length];
                    s4 = Class_m.var_1f5d.getAppProperty(s);
                    s = Class_m.var_1c25 + "-" + Class_m.var_1ce5 + "-" + Class_m.var_1f25[n - Class_m.var_1f2d.length];
                    s3 = Class_m.var_1f5d.getAppProperty(s);
                }
            }
            final boolean sub_258f = sub_258f(s4, 7);
            boolean sub_258f2 = true;
            if (str.equals(Class_m.var_1ce5)) {
                sub_258f2 = sub_258f(s3, 7);
            }
            if (sub_258f && sub_258f2 && (s4.toUpperCase().compareTo("NO") != 0 || s4.toUpperCase().compareTo("0") != 0)) {
                Class_m.var_1ffd[n] = true;
                Class_m.var_1fed[n] = s4;
                if (Class_m.var_1ffd[n]) {
                    switch (Class_m.var_1ff5[n] = n3) {
                        case 4: {
                            ++Class_m.var_2005;
                            if (Class_m.var_1ee5) {
                                final StringBuffer sb = new StringBuffer();
                                final String[] var_1fed = Class_m.var_1fed;
                                var_1fed[n] = sb.append(var_1fed[n]).append(Class_m.var_1eb5).append(Class_m.var_1ec5).append((Class_m.var_2005 < 10) ? "0" : "").append(Class_m.var_2005).toString();
                                return;
                            }
                            break;
                        }
                        case 6: {
                            ++Class_m.var_200d;
                            if (Class_m.var_1ee5) {
                                final StringBuffer sb2 = new StringBuffer();
                                final String[] var_1fed2 = Class_m.var_1fed;
                                var_1fed2[n] = sb2.append(var_1fed2[n]).append(Class_m.var_1eb5).append(Class_m.var_1ce5).toString();
                                return;
                            }
                            break;
                        }
                        case 7: {
                            if (Class_m.var_1ee5) {
                                final StringBuffer sb3 = new StringBuffer();
                                final String[] var_1fed3 = Class_m.var_1fed;
                                var_1fed3[n] = sb3.append(var_1fed3[n]).append(Class_m.var_1eb5).append(Class_m.var_1ced).toString();
                                return;
                            }
                            break;
                        }
                        case 8: {
                            if (Class_m.var_1ee5) {
                                final StringBuffer sb4 = new StringBuffer();
                                final String[] var_1fed4 = Class_m.var_1fed;
                                var_1fed4[n] = sb4.append(var_1fed4[n]).append(Class_m.var_1eb5).append(Class_m.var_1cf5).toString();
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
            array[i] = new String(bytes, Class_m.var_1e2d, sub_22c9);
            Class_m.var_1e2d += sub_22c9;
        }
        return array;
    }
    
    private static void sub_2bc9() {
        try {
            if (!sub_20f4()) {
                Class_m.var_1f95 = false;
                return;
            }
            final byte[] sub_21f6;
            sub_22c9(sub_21f6 = sub_21f6(0));
            Class_m.var_1e2d += sub_22c9(sub_21f6);
            final int sub_22c9 = sub_22c9(sub_21f6);
            Class_m.var_1ef5 = new String(sub_21f6, Class_m.var_1e2d, sub_22c9);
            Class_m.var_1e2d += sub_22c9;
            Class_m.var_1e2d += sub_22c9(sub_21f6);
            Class_m.var_1e2d += sub_22c9(sub_21f6);
            Class_m.var_1e2d += sub_22c9(sub_21f6);
            Class_m.var_1efd = (sub_22c9(sub_21f6) == 1);
            sub_22c9(sub_21f6);
            sub_22c9(sub_21f6);
            Class_m.var_1f05 = sub_2b59(sub_21f6);
            Class_m.var_1f2d = sub_2b59(sub_21f6);
            Class_m.var_1f25 = sub_2b59(sub_21f6);
            sub_2b59(sub_21f6);
            for (int i = 0; i < Class_m.var_1c35.length; ++i) {
                Class_m.var_1c35[i] = (sub_22c9(sub_21f6) == 1);
            }
            try {
                Class_m.var_1c0d = new String(sub_21f6, Class_m.var_1e2d, sub_22c9(sub_21f6));
                new StringBuffer().append("IGP dataIGP version: ").append(Class_m.var_1c0d);
                new StringBuffer().append(Class_m.var_1bfd).append("z");
                if (!Class_m.var_1c0d.startsWith(Class_m.var_1bfd)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(Class_m.var_1c0d);
                    new StringBuffer().append("IGP Class version : ").append(Class_m.var_1bfd);
                }
            }
            catch (final Exception ex) {
                Class_m.var_1f95 = false;
            }
            sub_21d0();
        }
        catch (final Exception ex2) {
            Class_m.var_1f95 = false;
            return;
        }
        final String[] var_1f2d = Class_m.var_1f2d;
        final String[] var_1f25 = Class_m.var_1f25;
        final String[] array = var_1f2d;
        int n = ((var_1f2d.length - 1 > 0) ? (array.length - 1) : 0) + ((var_1f25.length - 1 > 0) ? (var_1f25.length - 1) : 0);
        Class_m.var_1c8d = (Class_m.var_1cd5 = (Class_m.var_1ccd = (Class_m.var_1cc5 = (Class_m.var_1cbd = (Class_m.var_1cb5 = (Class_m.var_1cad = (Class_m.var_1ca5 = (Class_m.var_1c9d = (Class_m.var_1c85 = (Class_m.var_1c7d = (Class_m.var_1c75 = (Class_m.var_1c6d = (Class_m.var_1c95 = ++n + 1) + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1) + 1) + 1;
        Class_m.var_1f0d = Class_m.var_1f2d.length + Class_m.var_1f25.length + 1 + 1;
        for (int j = 0; j < Class_m.var_1c35.length; ++j) {
            if (Class_m.var_1c35[j]) {
                Class_m.var_1c3d[j] = ++Class_m.var_1c4d;
            }
            else {
                Class_m.var_1c3d[j] = --Class_m.var_1c45;
            }
        }
        ++Class_m.var_1c4d;
        Class_m.var_1fed = new String[Class_m.var_1f0d];
        Class_m.var_1ffd = new boolean[Class_m.var_1f0d];
        Class_m.var_1ff5 = new int[Class_m.var_1f0d];
        for (int k = 0; k < Class_m.var_1ffd.length; ++k) {
            Class_m.var_1ffd[k] = false;
        }
        Class_m.var_1c65 = (Class_m.var_1c5d = (Class_m.var_1c55 = Class_m.var_1f2d.length) + Class_m.var_1f25.length) + 1;
        Class_m.var_1e8d = Class_m.var_1f5d.getAppProperty(Class_m.var_1e7d);
        Class_m.var_1e95 = Class_m.var_1f5d.getAppProperty(Class_m.var_1e85);
        if (Class_m.var_1e8d != null && Class_m.var_1e95.toLowerCase().equals(Class_m.var_1e9d.toLowerCase())) {
            Class_m.var_204d = Class_m.var_1e8d;
            Class_m.var_2055 = true;
            Class_m.var_1f95 = true;
            return;
        }
        try {
            if ((Class_m.var_1edd = Class_m.var_1f5d.getAppProperty(Class_m.var_1e75)) != null) {
                Class_m.var_1edd = Class_m.var_1edd.trim();
                Class_m.var_1eed = true;
                if (Class_m.var_1edd.indexOf(Class_m.var_1ecd) != -1) {
                    Class_m.var_1ee5 = true;
                }
            }
        }
        catch (final Exception ex3) {}
        for (int l = 0; l < Class_m.var_1f2d.length; ++l) {
            sub_277b(l, Class_m.var_1f2d[l], 7, Class_m.var_1e65, Class_m.var_1edd, 4);
        }
        for (int n2 = 0; n2 < Class_m.var_1f25.length; ++n2) {
            sub_277b(Class_m.var_1c55 + n2, Class_m.var_1ce5, 7, Class_m.var_1e5d, Class_m.var_1edd, 6);
        }
        try {
            final String trim;
            if (sub_258f(trim = Class_m.var_1f5d.getAppProperty(Class_m.var_1d0d).trim(), 7)) {
                Class_m.var_203d = trim;
            }
        }
        catch (final Exception ex4) {}
        sub_277b(Class_m.var_1c5d, Class_m.var_1ced, 7, Class_m.var_1e5d, Class_m.var_1edd, 7);
        sub_277b(Class_m.var_1c65, Class_m.var_1cf5, 7, Class_m.var_1e5d, Class_m.var_1edd, 8);
        Class_m.var_2025 = sub_3135(Class_m.var_1f5d.getAppProperty(Class_m.var_1cfd));
        Class_m.var_202d = sub_3135(Class_m.var_1f5d.getAppProperty(Class_m.var_1d05));
        Class_m.var_1fe5 = sub_357f();
        if (sub_3607() > 0) {
            Class_m.var_1f95 = true;
        }
        new StringBuffer().append("isAvailable = ").append(Class_m.var_1f95);
    }
    
    private static String sub_3135(String upperCase) {
        if (upperCase == null) {
            return "0";
        }
        String string = "";
        upperCase = upperCase.toUpperCase();
        boolean b = false;
        final int var_2065 = Class_m.var_2065;
        if (var_2065 >= Class_m.var_205d && var_2065 == 320) {
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
        return Class_m.var_1f95;
    }
    
    public static void sub_322b(String s, final int n) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(s).append(", appLanguage = ").append(0).append(" (").append(Class_m.var_1f05[0]).append(")");
        if (Class_m.var_2055) {
            sub_3539();
            Class_m.var_1f85 = true;
            Class_m.var_1f8d = Class_m.var_204d;
        }
        else {
            sub_4f48();
            if (0 < Class_m.var_1f05.length) {
                final int length = Class_m.var_1f05.length;
                Class_m.var_201d = 0;
                Class_m.var_2035 = s;
                Class_m.var_1fbd = -1;
                Class_m.var_1f9d = 0;
                Class_m.var_1fb5 = -1;
                Class_m.var_1fad = 0;
                Class_m.var_1f85 = true;
                Class_m.var_1c1d = Font.getFont(0, 0, 8);
                sub_3539();
            }
            Class_m.var_1fc5 = 4 + Class_m.var_1f0d;
            Class_m.var_1fad = sub_3660();
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
            if (s != null) {
                store.closeRecordStore();
            }
        }
        catch (final Exception ex3) {}
    }
    
    private static boolean sub_3367() {
        boolean b = false;
        for (int i = 0; i < Class_m.var_1f05.length; ++i) {
            if (Class_m.var_1f05[i].equals("SP")) {
                b = true;
            }
        }
        if (!b) {
            return false;
        }
        try {
            final String appProperty;
            if ((appProperty = Class_m.var_1f5d.getAppProperty(Class_m.var_1e5d)) == null || appProperty.indexOf(Class_m.var_1cdd) == -1) {
                return (Class_m.var_2045 = Class_m.var_1f5d.getAppProperty(Class_m.var_1c25 + "-" + Class_m.var_1cdd)) != null;
            }
            final int beginIndex;
            final int endIndex;
            if ((endIndex = (beginIndex = appProperty.indexOf(Class_m.var_1cdd) + Class_m.var_1cdd.length() + 1) + Class_m.var_1cdd.length()) >= appProperty.length()) {
                return false;
            }
            if (!appProperty.substring(beginIndex, endIndex).equals(Class_m.var_1cdd)) {
                return false;
            }
            Class_m.var_2045 = Class_m.var_203d;
            if (Class_m.var_1ee5) {
                final int index;
                if ((index = (Class_m.var_2045 += Class_m.var_1ead).indexOf(Class_m.var_1ea5)) >= 0) {
                    Class_m.var_2045 = Class_m.var_2045.substring(0, index) + Class_m.var_1cdd + Class_m.var_2045.substring(index + Class_m.var_1ea5.length());
                }
                if (Class_m.var_2045.length() == 0) {
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
        if (Class_m.var_1f7d == null) {
            Class_m.var_1f7d = new Class_m();
        }
        new Thread(Class_m.var_1f7d).start();
    }
    
    private static int[] sub_357f() {
        final int[] array = new int[2];
        array[1] = (array[0] = 0);
        for (int i = 0; i < Class_m.var_1ffd.length; ++i) {
            if (Class_m.var_1ffd[i]) {
                if (i < Class_m.var_1c55) {
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
        for (int i = 0; i < Class_m.var_1ffd.length; ++i) {
            if (Class_m.var_1ffd[i]) {
                ++n;
            }
        }
        return n;
    }
    
    private static int sub_3660() {
        for (int i = 0; i < Class_m.var_1ffd.length; ++i) {
            if (Class_m.var_1ffd[i]) {
                return i;
            }
        }
        return -1;
    }
    
    private static void sub_36b3(int offset) {
        try {
            Class_m.var_1e2d = 0;
            switch (offset) {
                case -1: {
                    Class_m.var_1fcd = new ASprite[Class_m.var_1d55];
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
                    Class_m.var_1f15 = new String[sub_22c9 = sub_22c9(sub_21f6)];
                    final byte[] bytes = new byte[sub_22c9];
                    System.arraycopy(sub_21f6, Class_m.var_1e2d, bytes, 0, sub_22c9);
                    Class_m.var_1e2d += sub_22c9;
                    sub_22c9(sub_21f6);
                    final int n;
                    Class_m.var_1f1d = new short[n = ((sub_21f6[Class_m.var_1e2d++] & 0xFF) | (sub_21f6[Class_m.var_1e2d++] & 0xFF) << 8)];
                    for (int i = 0; i < n - 1; ++i) {
                        Class_m.var_1f1d[i] = (short)((sub_21f6[Class_m.var_1e2d++] & 0xFF) + ((sub_21f6[Class_m.var_1e2d++] & 0xFF) << 8));
                    }
                    Class_m.var_1f1d[n - 1] = (short)sub_22c9;
                    for (int j = 0; j < n; ++j) {
                        offset = ((j == 0) ? 0 : (Class_m.var_1f1d[j - 1] & 0xFFFF));
                        final int length;
                        if ((length = (Class_m.var_1f1d[j] & 0xFFFF) - offset) != 0) {
                            try {
                                Class_m.var_1f15[j] = new String(bytes, offset, length, "UTF-8");
                            }
                            catch (final Exception ex) {}
                        }
                    }
                    return;
                }
                case 2: {
                    GLLib.Pack_Open("/11");
                    (Class_m.var_1fd5 = sub_680f(Class_m.var_1d35, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(Class_m.var_1d45));
                    Class_m.var_1e35 = Class_m.var_1fd5.sub_494e();
                    (Class_m.var_1fdd = sub_680f(Class_m.var_1d3d, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(Class_m.var_1d4d));
                    if (Class_m.var_2065 > 160 && Class_m.var_2065 > 220) {
                        if (Class_m.var_2065 <= 320) {
                            Class_m.var_1fd5.sub_4a1a(-1);
                            if (Class_m.var_205d == 240 || Class_m.var_1efd) {
                                Class_m.var_1fd5.sub_4a1a(0);
                            }
                        }
                        else if (Class_m.var_2065 <= 480) {
                            Class_m.var_1fdd.sub_4a1a(-1);
                        }
                    }
                    GLLib.Pack_FullyClose();
                    return;
                }
                case 3: {
                    GLLib.Pack_Open("/11");
                    for (int k = 0; k < Class_m.var_1d55; ++k) {
                        if (k != Class_m.var_1d35 && k != Class_m.var_1d45 && k != Class_m.var_1d3d && k != Class_m.var_1d4d) {
                            Class_m.var_1fcd[k] = sub_680f(k, 1, true, true);
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
        for (int i = 0; i < Class_m.var_1d55; ++i) {
            if (Class_m.var_1fcd[i] != null && i != Class_m.var_1d35 && i != Class_m.var_1d45 && i != Class_m.var_1d3d && i != Class_m.var_1d4d && i != 0) {
                Class_m.var_1fcd[i].sub_123f();
                Class_m.var_1fcd[i] = null;
            }
        }
        if (b) {
            sub_21d0();
            GLLib.Pack_FullyClose();
            Class_m.var_1f1d = null;
            Class_m.var_1f15 = null;
            Class_m.var_2035 = null;
            for (int j = 0; j < Class_m.var_1d55; ++j) {
                if (Class_m.var_1fcd[j] != null) {
                    Class_m.var_1fcd[j].sub_123f();
                    Class_m.var_1fcd[j] = null;
                }
            }
            Class_m.var_1fcd = null;
            Class_m.var_1fd5.sub_123f();
            Class_m.var_1fd5 = null;
            Class_m.var_1fdd.sub_123f();
            Class_m.var_1fdd = null;
        }
        System.gc();
    }
    
    public static void sub_3b06(final boolean b) {
        if (b) {
            if (Class_m.var_1f9d == 0 || Class_m.var_1f9d == 2) {
                Class_m.var_1fb5 = Class_m.var_1f9d;
                Class_m.var_1f9d = 5;
            }
            sub_4f48();
            return;
        }
        if (Class_m.var_1f9d == 5) {
            Class_m.var_1f9d = Class_m.var_1fb5;
            Class_m.var_1fbd = -1;
        }
    }
    
    public static boolean sub_3b75(int var_1fa5) {
        if (Class_m.var_2055) {
            return true;
        }
        if (!Class_m.var_1f95) {
            return true;
        }
        if (Class_m.var_2085) {
            Class_m.var_2085 = false;
        }
        else {
            Class_m.var_1fa5 = var_1fa5;
        }
        Label_2560: {
            switch (Class_m.var_1f9d) {
                case 0: {
                    if (Class_m.var_1fbd >= Class_m.var_1fc5) {
                        Class_m.var_1f9d = 1;
                        Class_m.var_2015 = Class_m.var_1fad;
                        var_1fa5 = Class_m.var_2065;
                        final int var_205d = Class_m.var_205d;
                        Class_m.var_1f4d = new int[Class_m.var_1e15][];
                        for (int i = 0; i < Class_m.var_1e15; ++i) {
                            (Class_m.var_1f4d[i] = new int[2])[0] = 0;
                            Class_m.var_1f4d[i][1] = 0;
                        }
                        final int sub_48a7 = sub_48a7(0, 0);
                        final int sub_48cb = sub_48cb(0, 0);
                        final int sub_48a8 = sub_48a7(Class_m.var_1d15, 0);
                        final int sub_48cb2 = sub_48cb(Class_m.var_1d15, 0);
                        final int sub_48cb3 = sub_48cb(0, 9);
                        int n = sub_48a7(0, 10);
                        int n2 = sub_48cb(0, 10);
                        if ((var_1fa5 == 240 && (var_205d == 320 || var_205d == 400)) || (var_1fa5 == 360 && (var_205d == 640 || var_205d == 480))) {
                            n = sub_48a7(0, 35);
                            n2 = sub_48cb(0, 35);
                        }
                        final int sub_48cb4 = sub_48cb(0, 15);
                        final int sub_48cb5 = sub_48cb(0, 29);
                        Class_m.var_1fd5.sub_5917(sub_2306(Class_m.var_1cd5), null);
                        final short[] sub_4ac6 = Class_m.var_1fd5.sub_4ac6(sub_2306(Class_m.var_1cd5), var_1fa5 - sub_48a7, false);
                        Class_m.var_1e55 = ASprite.var_119f;
                        int n3 = Class_m.var_1e4d = sub_4ac6[0] * Class_m.var_1e35;
                        if (sub_48cb > Class_m.var_1e4d) {
                            n3 = sub_48cb;
                        }
                        if (n2 > n3) {
                            n3 = n2;
                        }
                        final int var_1e35;
                        final int n4 = var_205d - ((var_1e35 = Class_m.var_1e35) + sub_48cb3 + sub_48cb2 + n3) - 3 - sub_48cb4 >> 2;
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
                        Class_m.var_1f4d[Class_m.var_1d65][0] = var_1fa5 - n6 >> 2;
                        Class_m.var_1f4d[Class_m.var_1d65][1] = 3;
                        Class_m.var_1f4d[Class_m.var_1d6d][0] = (var_1fa5 - n7 >> 2) * 3;
                        Class_m.var_1f4d[Class_m.var_1d6d][1] = Class_m.var_1f4d[Class_m.var_1d65][1];
                        final int sub_33a1 = Class_m.var_1fcd[0].sub_33a1(15, Class_m.var_1fcd[0].sub_377d(15) - 1);
                        Class_m.var_1f4d[Class_m.var_1d75][0] = var_1fa5 >> 2;
                        Class_m.var_1f4d[Class_m.var_1d75][1] = Class_m.var_1f4d[Class_m.var_1d65][1] + (sub_33a1 >> 1) + n5;
                        Class_m.var_1f4d[Class_m.var_1d7d][0] = (var_1fa5 >> 1) + (var_1fa5 >> 2);
                        Class_m.var_1f4d[Class_m.var_1d7d][1] = Class_m.var_1f4d[Class_m.var_1d75][1];
                        Class_m.var_1f4d[0][0] = var_1fa5 >> 1;
                        Class_m.var_1f4d[0][1] = n4 + (var_1e35 >> 1) + n5 - 2;
                        final int[] array = Class_m.var_1f4d[0];
                        final int n8 = 1;
                        array[n8] += Class_m.var_1f4d[Class_m.var_1d65][1] + sub_48cb4;
                        Class_m.var_1f4d[Class_m.var_1d85][0] = 0;
                        Class_m.var_1f4d[Class_m.var_1d85][1] = Class_m.var_1f4d[0][1] + n4 + (var_1e35 >> 1) - n5 + 2;
                        Class_m.var_1f4d[Class_m.var_1d5d][0] = var_1fa5 >> 1;
                        Class_m.var_1f4d[Class_m.var_1d5d][1] = Class_m.var_1f4d[Class_m.var_1d85][1] + (sub_48cb3 >> 1) + n5 - 2;
                        final int sub_48a9 = sub_48a7(0, 2);
                        final int sub_48cb6 = sub_48cb(0, 2);
                        Class_m.var_1f4d[Class_m.var_1dbd][0] = 5;
                        Class_m.var_1f4d[Class_m.var_1dbd][1] = Class_m.var_1f4d[Class_m.var_1d85][1] + (sub_48cb3 >> 1) - (sub_48cb6 >> 1);
                        Class_m.var_1f4d[Class_m.var_1dc5][0] = var_1fa5 - 5 - sub_48a9;
                        Class_m.var_1f4d[Class_m.var_1dc5][1] = Class_m.var_1f4d[Class_m.var_1dbd][1];
                        Class_m.var_1f4d[Class_m.var_1dad][0] = var_1fa5 - Class_m.var_1c2d - sub_48a7;
                        Class_m.var_1f4d[Class_m.var_1dad][1] = var_205d - 2 - sub_48cb;
                        Class_m.var_1f4d[Class_m.var_1e0d][0] = Class_m.var_1c2d;
                        Class_m.var_1f4d[Class_m.var_1e0d][1] = var_205d - 2 - sub_48cb;
                        final int n9 = Class_m.var_1f4d[Class_m.var_1dad][0] - (n << 1);
                        Class_m.var_1f4d[Class_m.var_1dd5][0] = n9 / 3;
                        Class_m.var_1f4d[Class_m.var_1dd5][1] = var_205d - 2 - n2;
                        Class_m.var_1f4d[Class_m.var_1de5][0] = Class_m.var_1f4d[Class_m.var_1dd5][0] + (n >> 1) + n % 2;
                        Class_m.var_1f4d[Class_m.var_1de5][1] = Class_m.var_1f4d[Class_m.var_1dd5][1] + (n2 >> 1) + n5;
                        Class_m.var_1f4d[Class_m.var_1dcd][0] = Class_m.var_1f4d[Class_m.var_1dd5][0] + n + n9 / 3;
                        Class_m.var_1f4d[Class_m.var_1dcd][1] = Class_m.var_1f4d[Class_m.var_1dd5][1];
                        Class_m.var_1f4d[Class_m.var_1ded][0] = Class_m.var_1f4d[Class_m.var_1dcd][0] + (n >> 1) + n % 2;
                        Class_m.var_1f4d[Class_m.var_1ded][1] = Class_m.var_1f4d[Class_m.var_1dcd][1] + (n2 >> 1) + n5;
                        Class_m.var_1f4d[Class_m.var_1ddd][0] = (var_1fa5 >> 1) - (n >> 1);
                        Class_m.var_1f4d[Class_m.var_1ddd][1] = Class_m.var_1f4d[Class_m.var_1dd5][1];
                        Class_m.var_1f4d[Class_m.var_1df5][0] = Class_m.var_1f4d[Class_m.var_1ddd][0] + (n >> 1) + n % 2;
                        Class_m.var_1f4d[Class_m.var_1df5][1] = Class_m.var_1f4d[Class_m.var_1ddd][1] + (n2 >> 1) + n5;
                        Class_m.var_1f4d[Class_m.var_1d8d][0] = (var_1fa5 >> 1) - (sub_48a8 >> 1);
                        Class_m.var_1f4d[Class_m.var_1d8d][1] = Class_m.var_1f4d[Class_m.var_1d85][1] + sub_48cb3 + n4;
                        Class_m.var_1f4d[Class_m.var_1dfd][0] = var_1fa5 - sub_48a7 >> 1;
                        Class_m.var_1f4d[Class_m.var_1dfd][1] = Class_m.var_1f4d[Class_m.var_1d8d][1] + sub_48cb2 + (var_205d - Class_m.var_1f4d[Class_m.var_1d8d][1] - sub_48cb2 >> 1);
                        Class_m.var_1f4d[Class_m.var_1dfd][0] = var_1fa5 - n >> 2;
                        if (var_205d > var_1fa5) {
                            Class_m.var_1f4d[Class_m.var_1dfd][1] = Class_m.var_1f4d[Class_m.var_1d8d][1] + sub_48cb2 + (Class_m.var_1f4d[Class_m.var_1ddd][1] - (Class_m.var_1f4d[Class_m.var_1d8d][1] + sub_48cb2) >> 1);
                            Class_m.var_1f4d[Class_m.var_1dfd][0] = var_1fa5 >> 1;
                        }
                        Class_m.var_1f4d[Class_m.var_1d95][0] = var_1fa5 >> 1;
                        Class_m.var_1f4d[Class_m.var_1d95][1] = Class_m.var_1f4d[Class_m.var_1d8d][1] + (sub_48cb2 << 1) / 3;
                        Class_m.var_1f4d[Class_m.var_1d9d][0] = 5;
                        Class_m.var_1f4d[Class_m.var_1d9d][1] = Class_m.var_1f4d[Class_m.var_1d8d][1] + (sub_48cb2 >> 1) - (sub_48cb(0, 6) >> 1);
                        Class_m.var_1f4d[Class_m.var_1da5][0] = var_1fa5 - sub_48a7(0, 4) - 5;
                        Class_m.var_1f4d[Class_m.var_1da5][1] = Class_m.var_1f4d[Class_m.var_1d9d][1];
                        int n10 = sub_48a7(0, 8);
                        int n11 = sub_48cb(0, 8);
                        if (var_1fa5 == 360 && var_205d == 480) {
                            n10 = sub_48a7(0, 39);
                            n11 = sub_48cb(0, 39);
                        }
                        Class_m.var_1f4d[Class_m.var_1db5][0] = Class_m.var_1f4d[Class_m.var_1d8d][0] + sub_48a8 - n10;
                        Class_m.var_1f4d[Class_m.var_1db5][1] = Class_m.var_1f4d[Class_m.var_1d8d][1] + sub_48cb2 - n11;
                        Class_m.var_1f4d[Class_m.var_1e05][0] = 0;
                        Class_m.var_1f4d[Class_m.var_1e05][1] = Class_m.var_1f4d[0][1] - (sub_48cb5 >> 1);
                        var_1fa5 = Class_m.var_1fcd[0].sub_377d(15);
                        var_1fa5 = Class_m.var_1fcd[0].sub_33a1(15, var_1fa5 - 1);
                        Class_m.var_1f4d[Class_m.var_1e05][1] = Class_m.var_1f4d[Class_m.var_1d65][1] + (var_1fa5 >> 1) - (sub_48cb5 >> 1);
                    }
                    else {
                        sub_36b3(Class_m.var_1fbd);
                    }
                    ++Class_m.var_1fbd;
                    break;
                }
                case 1: {
                    Label_2264: {
                        Label_2258: {
                            switch (Class_m.var_1fa5) {
                                case 26: {
                                    Class_m.var_1f9d = 4;
                                    break Label_2560;
                                }
                                case 23: {
                                    var_1fa5 = 0;
                                    if (Class_m.var_1fad >= Class_m.var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (Class_m.var_1fe5[var_1fa5] > 1) {
                                        if (Class_m.var_1fad == 0) {
                                            Class_m.var_1fad = Class_m.var_1c55 - 1;
                                        }
                                        else if (Class_m.var_1fad == Class_m.var_1c55) {
                                            Class_m.var_1fad = Class_m.var_1f0d - 1;
                                        }
                                        else {
                                            --Class_m.var_1fad;
                                        }
                                        while (!Class_m.var_1ffd[Class_m.var_1fad]) {
                                            if (Class_m.var_1fad == 0) {
                                                Class_m.var_1fad = Class_m.var_1c55 - 1;
                                            }
                                            else if (Class_m.var_1fad == Class_m.var_1c55) {
                                                Class_m.var_1fad = Class_m.var_1f0d - 1;
                                            }
                                            else {
                                                --Class_m.var_1fad;
                                            }
                                        }
                                        Class_m.var_1f3d = true;
                                        break;
                                    }
                                    break Label_2264;
                                }
                                case 24: {
                                    var_1fa5 = 0;
                                    if (Class_m.var_1fad >= Class_m.var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (Class_m.var_1fe5[var_1fa5] > 1) {
                                        if (!Class_m.var_1f3d) {
                                            if (Class_m.var_1fad == Class_m.var_1c55 - 1) {
                                                Class_m.var_1fad = 0;
                                            }
                                            else if (Class_m.var_1fad == Class_m.var_1f0d - 1) {
                                                Class_m.var_1fad = Class_m.var_1c55;
                                            }
                                            else {
                                                ++Class_m.var_1fad;
                                            }
                                            while (!Class_m.var_1ffd[Class_m.var_1fad]) {
                                                if (Class_m.var_1fad == Class_m.var_1c55 - 1) {
                                                    Class_m.var_1fad = 0;
                                                }
                                                else if (Class_m.var_1fad == Class_m.var_1f0d - 1) {
                                                    Class_m.var_1fad = Class_m.var_1c55;
                                                }
                                                else {
                                                    ++Class_m.var_1fad;
                                                }
                                            }
                                            Class_m.var_1f45 = true;
                                        }
                                        Class_m.var_2015 = Class_m.var_1fad;
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
                                    Class_m.var_1f9d = 6;
                                    break Label_2560;
                                }
                                case 28: {
                                Label_2175:
                                    while (true) {
                                        Class_m.var_1fad = 0;
                                        while (!Class_m.var_1ffd[Class_m.var_1fad]) {
                                            if (Class_m.var_1fad == Class_m.var_1c55 - 1) {
                                                continue Label_2175;
                                            }
                                            ++Class_m.var_1fad;
                                        }
                                        break;
                                    }
                                    Class_m.var_2015 = Class_m.var_1fad;
                                    break Label_2560;
                                }
                                case 29: {
                                Label_2220:
                                    while (true) {
                                        Class_m.var_1fad = Class_m.var_1c55;
                                        while (!Class_m.var_1ffd[Class_m.var_1fad]) {
                                            if (Class_m.var_1fad == Class_m.var_1f0d - 1) {
                                                continue Label_2220;
                                            }
                                            ++Class_m.var_1fad;
                                        }
                                        break Label_2258;
                                    }
                                }
                            }
                        }
                        Class_m.var_2015 = Class_m.var_1fad;
                    }
                    break;
                }
                case 6: {
                    String s;
                    if (Class_m.var_1f55) {
                        s = Class_m.var_1fed[Class_m.var_1c65];
                    }
                    else {
                        s = Class_m.var_1fed[Class_m.var_1fad];
                    }
                    if (s != null && s.length() > 0) {
                        if (Class_m.var_1ee5) {
                            final int index;
                            if ((index = s.indexOf(Class_m.var_1ebd)) == -1) {
                                s = s + Class_m.var_1ebd + Class_m.var_1f05[0];
                            }
                            else {
                                s = s.substring(0, index) + Class_m.var_1ebd + Class_m.var_1f05[0] + s.substring(index + Class_m.var_1ebd.length() + 2);
                            }
                        }
                        Class_m.var_1f8d = s;
                        break;
                    }
                    break;
                }
                case 2: {
                    sub_3a10(false);
                    var_1fa5 = Class_m.var_1fad;
                    int var_1fbd;
                    final int n12 = (Class_m.var_1ff5[var_1fa5] == 4) ? (var_1fbd = Class_m.var_1ff5[var_1fa5]) : ((Class_m.var_1ff5[var_1fa5] == 6) ? (var_1fbd = 6) : ((Class_m.var_1ff5[var_1fa5] == 7) ? (var_1fbd = 7) : ((Class_m.var_1ff5[var_1fa5] == 8) ? (var_1fbd = 8) : (var_1fbd = -1))));
                    Class_m.var_1fbd = var_1fbd;
                    sub_36b3(n12);
                    Class_m.var_1f9d = 1;
                }
                case 3: {
                    switch (Class_m.var_1fa5) {
                        case 26: {
                            Class_m.var_1f9d = 1;
                            break;
                        }
                        case 25:
                        case 30: {
                            Class_m.var_1f8d = null;
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    sub_3a10(true);
                    Class_m.var_1f85 = false;
                    return true;
                }
            }
        }
        return false;
    }
    
    private static int sub_48a7(final int n, final int n2) {
        return Class_m.var_1fcd[n].sub_312c(n2);
    }
    
    private static int sub_48cb(final int n, final int n2) {
        return Class_m.var_1fcd[n].sub_3189(n2);
    }
    
    public static void sub_48ef(int n, int n2) {
        int sub_4b75 = sub_4b75(n, n2);
        final int var_2065 = Class_m.var_2065;
        final int var_205d = Class_m.var_205d;
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
        if (Math.abs(Class_m.var_20ad - n) > var_2065 * 10 / 100 && n2 < var_205d - n4 && n2 > sub_48cb && (Class_m.var_20ad >= sub_48a7 || Class_m.var_20b5 <= Class_m.var_1f4d[Class_m.var_1d9d][1] || Class_m.var_20b5 >= Class_m.var_1f4d[Class_m.var_1d9d][1] + sub_48cb2) && (Class_m.var_20ad <= var_2065 - sub_48a7 || Class_m.var_20b5 <= Class_m.var_1f4d[Class_m.var_1da5][1] || Class_m.var_20b5 >= Class_m.var_1f4d[Class_m.var_1da5][1] + sub_48cb2) && Class_m.var_20b5 >= sub_48cb && Class_m.var_20b5 <= var_205d - n4) {
            if (Class_m.var_20ad - n < 0) {
                sub_4b75 = 23;
                Class_m.var_2095 = true;
            }
            else {
                sub_4b75 = 24;
                Class_m.var_2095 = true;
            }
        }
        if (sub_4b75 != 0) {
            Class_m.var_1fa5 = sub_4b75;
            Class_m.var_2085 = true;
            if (Class_m.var_209d && Class_m.var_1fed[Class_m.var_1c65] != null) {
                Class_m.var_1f55 = true;
            }
        }
        Class_m.var_207d = 0;
        Class_m.var_208d = false;
        Class_m.var_209d = false;
        Class_m.var_20a5 = false;
        Class_m.var_20ad = -1;
        Class_m.var_20b5 = -1;
    }
    
    public static void sub_4acf(int var_20ad, int var_20b5) {
        final int sub_4b75;
        if ((sub_4b75 = sub_4b75(var_20ad, var_20b5)) != 0) {
            Class_m.var_207d = sub_4b75;
        }
        final int var_205d = Class_m.var_205d;
        final int n = var_20ad;
        var_20ad = var_20b5;
        var_20b5 = n;
        var_20b5 = var_205d - var_20b5;
        if (Class_m.var_20ad == -1 || Class_m.var_20b5 == -1) {
            Class_m.var_20ad = var_20ad;
            Class_m.var_20b5 = var_20b5;
        }
    }
    
    public static void sub_4b41(final int n, final int n2) {
        Class_m.var_1fa5 = 0;
        Class_m.var_207d = 0;
        Class_m.var_208d = false;
        Class_m.var_209d = false;
        Class_m.var_20a5 = false;
        sub_4acf(n, n2);
    }
    
    private static int sub_4b75(int n, int n2) {
        final int var_2065 = Class_m.var_2065;
        final int var_205d = Class_m.var_205d;
        final int n3 = n;
        n = n2;
        n2 = n3;
        n2 = var_205d - n2;
        if (n < 0 || n2 < 0) {
            return 0;
        }
        if (Class_m.var_1f9d == 0 || !Class_m.var_1f85) {
            return 0;
        }
        if (n2 > Class_m.var_1f4d[Class_m.var_1d65][1] && n2 < Class_m.var_1f4d[Class_m.var_1d65][1] + sub_48cb(0, 15)) {
            if (n < var_2065 >> 1) {
                if (Class_m.var_1fad > Class_m.var_1f2d.length - 1) {
                    return 28;
                }
            }
            else if (Class_m.var_1fad < Class_m.var_1f2d.length) {
                return 29;
            }
        }
        final int n4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
        if (n > Class_m.var_1f4d[Class_m.var_1d9d][0] + n4 && n < Class_m.var_1f4d[Class_m.var_1d9d][0] + sub_48a7(0, 6) + n4 && n2 > Class_m.var_1f4d[Class_m.var_1d9d][1] && n2 < Class_m.var_1f4d[Class_m.var_1d9d][1] + sub_48cb(0, 6)) {
            return 23;
        }
        if (n > Class_m.var_1f4d[Class_m.var_1da5][0] - n4 && n < Class_m.var_1f4d[Class_m.var_1da5][0] + sub_48a7(0, 4) - n4 && n2 > Class_m.var_1f4d[Class_m.var_1da5][1] && n2 < Class_m.var_1f4d[Class_m.var_1da5][1] + sub_48cb(0, 4)) {
            return 24;
        }
        int n5 = sub_48a7(0, 10);
        int n6 = sub_48cb(0, 10);
        if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
            n5 = sub_48a7(0, 35);
            n6 = sub_48cb(0, 35);
        }
        if (Class_m.var_1ff5[Class_m.var_1fad] == 6 || Class_m.var_1ff5[Class_m.var_1fad] == 7 || Class_m.var_1ff5[Class_m.var_1fad] == 8) {
            if (n > Class_m.var_1f4d[Class_m.var_1ddd][0] && n < Class_m.var_1f4d[Class_m.var_1ddd][0] + n5 && n2 > Class_m.var_1f4d[Class_m.var_1ddd][1] && n2 < Class_m.var_1f4d[Class_m.var_1ddd][1] + n6) {
                Class_m.var_208d = true;
                return 25;
            }
        }
        else {
            if (n > Class_m.var_1f4d[Class_m.var_1dd5][0] && n < Class_m.var_1f4d[Class_m.var_1dd5][0] + n5 && n2 > Class_m.var_1f4d[Class_m.var_1dd5][1] && n2 < Class_m.var_1f4d[Class_m.var_1dd5][1] + n6) {
                Class_m.var_209d = true;
                return 25;
            }
            if (n > Class_m.var_1f4d[Class_m.var_1dcd][0] && n < Class_m.var_1f4d[Class_m.var_1dcd][0] + n5 && n2 > Class_m.var_1f4d[Class_m.var_1dcd][1] && n2 < Class_m.var_1f4d[Class_m.var_1dcd][1] + n6) {
                Class_m.var_208d = true;
                return 25;
            }
        }
        if (n > Class_m.var_1f4d[Class_m.var_1dad][0] - 10 && n < Class_m.var_1f4d[Class_m.var_1dad][0] + sub_48a7(0, 0) + 10 && n2 > Class_m.var_1f4d[Class_m.var_1dad][1] - 10 && n2 < Class_m.var_1f4d[Class_m.var_1dad][1] + sub_48cb(0, 0) + 10) {
            Class_m.var_20a5 = true;
            return 26;
        }
        final int sub_48a7 = sub_48a7(Class_m.var_1d15, 0);
        final int sub_48cb = sub_48cb(Class_m.var_1d15, 0);
        if (n > Class_m.var_1f4d[Class_m.var_1d8d][0] && n < Class_m.var_1f4d[Class_m.var_1d8d][0] + sub_48a7 && n2 > Class_m.var_1f4d[Class_m.var_1d8d][1] && n2 < Class_m.var_1f4d[Class_m.var_1d8d][1] + sub_48cb) {
            return 25;
        }
        return 0;
    }
    
    private static void sub_4f48() {
        Class_m.var_1fa5 = 0;
        Class_m.var_207d = 0;
        Class_m.var_2085 = true;
        Class_m.var_208d = false;
        Class_m.var_209d = false;
        Class_m.var_20a5 = false;
        Class_m.var_1f35 = 0;
        Class_m.var_1f3d = false;
        Class_m.var_1f45 = false;
        Class_m.var_20ad = -1;
        Class_m.var_20b5 = -1;
    }
    
    public static void sub_4f8f(Graphics var_1daf) {
        if (Class_m.var_2055) {
            return;
        }
        if (!Class_m.var_1f95) {
            return;
        }
        final Graphics graphics;
        sub_669f(graphics = var_1daf, 0, 0, Class_m.var_205d, Class_m.var_2065);
        switch (Class_m.var_1f9d) {
            case 0: {
                graphics.setColor(0);
                GLLib.FillRect(graphics, 0, 0, Class_m.var_2065, Class_m.var_205d, true);
                final Graphics graphics2 = graphics;
                final int var_206d = Class_m.var_206d;
                final int n = Class_m.var_2065 * 3 / 4;
                final int var_1fbd = Class_m.var_1fbd;
                final int var_1fc5 = Class_m.var_1fc5;
                int n2 = var_1fbd;
                final int n3 = n;
                final int n4 = var_206d;
                final Graphics graphics3 = graphics2;
                if (n2 > var_1fc5) {
                    n2 = var_1fc5;
                }
                final int n5 = (Class_m.var_2065 - n3) / 2;
                final int n6 = (n3 - 2 - 2) * n2 / var_1fc5 + 1;
                sub_669f(graphics3, 0, 0, Class_m.var_205d, Class_m.var_2065);
                graphics3.setColor(16777215);
                GLLib.FillRect(graphics3, n5, n4, n3, 6, true);
                graphics3.setColor(0);
                final Graphics graphics4 = graphics3;
                final int n7 = n5 + 1 + 1;
                final int n8 = n4 + 1 + 1;
                final int n9 = n3 - 2 - 1;
                final int n10 = n8;
                GLLib.FillRect(graphics4, n7, n10, n9, 3, true);
                graphics3.setColor(16711680);
                GLLib.FillRect(graphics3, n5 + 1 + 1, n10, n6, 3, true);
                if (Class_m.var_2035 != null && !Class_m.var_2035.trim().equals("")) {
                    final Image image;
                    final Graphics graphics5;
                    (graphics5 = (image = Image.createImage(Class_m.var_2065, 30)).getGraphics()).setColor(0);
                    GLLib.FillRect(graphics5, 0, 0, 30, Class_m.var_2065, true);
                    graphics5.setColor(16777215);
                    final Graphics var_1daf2 = graphics5;
                    // REST IN PEACE YOU POOR SOUL
                    if (var_1daf2 == null) {
                        GLLib.g = GLLib.s_lastPaintGraphics;
                    }
                    else {
                        GLLib.g = var_1daf2;
                    }
                    GLLib.g.setFont(Class_m.var_1c1d);
                    GLLib.sub_3877(Class_m.var_2035, Class_m.var_2075, 25, 33);
                    if (var_1daf == null) {
                        GLLib.g = GLLib.s_lastPaintGraphics;
                    }
                    else {
                        GLLib.g = var_1daf;
                    }
                    graphics.drawRegion(image, 0, 0, Class_m.var_205d, 30, 5, Class_m.var_206d + 5 + 30, 0, 0);
                    return;
                }
                break;
            }
            case 1: {
                sub_5366(graphics);
                if (System.currentTimeMillis() % 1000L <= 500L && (Class_m.var_207d != 27 || Class_m.var_208d)) {
                    break;
                }
                if (Class_m.var_1fad != Class_m.var_1c65) {
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
                final int var_205d = Class_m.var_205d;
                final int var_2065 = Class_m.var_2065;
                final int n11 = var_205d * 40 / 100;
                final int n12 = sub_48a7(0, 0) - 5;
                sub_52f7(graphics, 0, n11 - 1, var_2065, var_205d - (n11 - 1 << 1), -1);
                sub_52f7(graphics, 0, n11, var_2065, var_205d - (n11 << 1), -220209185);
                graphics.setColor(16777215);
                GLLib.FillRect(graphics, 0, var_205d - (n12 + 1), var_2065, n12 + 1, true);
                graphics.setColor(-220209185);
                GLLib.FillRect(graphics, 0, var_205d - n12, var_2065, n12, true);
                Class_m.var_1e3d = 1;
                sub_2361(sub_2306(Class_m.var_1c8d), graphics, Class_m.var_205d, var_2065 >> 1, var_205d >> 1, 3, true);
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
        final int var_2065 = Class_m.var_2065;
        final int var_205d = Class_m.var_205d;
        graphics.setColor(16777215);
        if (Class_m.var_1c35[0]) {
            graphics.setColor(0);
        }
        graphics.setColor(16777215);
        GLLib.FillRect(graphics, 0, 0, var_2065, var_205d, true);
        final int n = Class_m.var_1f4d[0][0];
        final int n2 = Class_m.var_1f4d[0][1];
        final int n3 = Class_m.var_1f4d[Class_m.var_1d5d][0];
        final int n4 = Class_m.var_1f4d[Class_m.var_1d5d][1];
        final int n5 = Class_m.var_1f4d[Class_m.var_1d8d][0];
        final int n6 = Class_m.var_1f4d[Class_m.var_1d8d][1];
        final int n7 = Class_m.var_1f4d[Class_m.var_1db5][0];
        final int n8 = Class_m.var_1f4d[Class_m.var_1db5][1];
        final int n9 = Class_m.var_1f4d[Class_m.var_1d85][0];
        final int n10 = Class_m.var_1f4d[Class_m.var_1d85][1];
        final int n11 = Class_m.var_1f4d[Class_m.var_1dbd][0];
        final int n12 = Class_m.var_1f4d[Class_m.var_1dbd][1];
        final int n13 = Class_m.var_1f4d[Class_m.var_1dc5][0];
        final int n14 = Class_m.var_1f4d[Class_m.var_1dc5][1];
        final int n15 = Class_m.var_1f4d[Class_m.var_1dfd][0];
        final int n16 = Class_m.var_1f4d[Class_m.var_1dfd][1];
        final int n17 = Class_m.var_1f4d[Class_m.var_1e05][1];
        sub_6676(graphics, 0, 9, n9, n10);
        Class_m.var_1e3d = 1;
        Class_m.var_1e45 = 0;
        if (Class_m.var_1ff5[Class_m.var_1fad] == 6) {
            if (!Class_m.var_2025.equals("0")) {
                sub_2338(Class_m.var_2025, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(Class_m.var_2015), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, Class_m.var_1d1d + (Class_m.var_1fad - Class_m.var_1c55), 0, n5, n6);
            int n18 = 8;
            if (var_2065 == 360 && var_205d == 480) {
                n18 = 39;
            }
            sub_6676(graphics, 0, n18, n7, n8);
            if (Class_m.var_1ef5 == null || !Class_m.var_1ef5.equals("TMUS")) {
                final int var_1e45 = Class_m.var_1e45;
                Class_m.var_1e45 = 1;
                int n19 = sub_48a7(0, 10);
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n19 = sub_48a7(0, 35);
                }
                int n20 = var_2065 - Class_m.var_1c2d - n19 >> 1;
                if (var_205d > var_2065) {
                    n20 = var_2065;
                }
                sub_2361(sub_2306(Class_m.var_1cd5), graphics, n20, n15, n16, 3, true);
                Class_m.var_1e45 = var_1e45;
            }
        }
        else if (Class_m.var_1ff5[Class_m.var_1fad] == 7) {
            if (!Class_m.var_202d.equals("0")) {
                sub_2338(Class_m.var_202d, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(Class_m.var_1ca5), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, Class_m.var_1d25, 0, n5, n6);
        }
        else if (Class_m.var_1ff5[Class_m.var_1fad] == 8) {
            sub_2338(sub_2306(Class_m.var_1cad), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(Class_m.var_1c95), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, Class_m.var_1d2d, 0, n5, n6);
        }
        else {
            Class_m.var_1e3d = 1;
            sub_2338(sub_2306(Class_m.var_1c9d), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(Class_m.var_2015), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, Class_m.var_1d15 + Class_m.var_1fad, 0, n5, n6);
        }
        int n21 = 0;
        if (Class_m.var_1fad >= Class_m.var_1c55) {
            n21 = 1;
        }
        boolean b = false;
        if (Class_m.var_1fe5[n21] > 1) {
            b = true;
        }
        if (b) {
            sub_6676(graphics, 0, 2, n11, n12);
            sub_6676(graphics, 0, 3, n13, n14);
        }
        final int n22 = Class_m.var_1f4d[Class_m.var_1d65][0];
        final int n23 = Class_m.var_1f4d[Class_m.var_1d65][1];
        final int n24 = Class_m.var_1f4d[Class_m.var_1d6d][0];
        final int n25 = Class_m.var_1f4d[Class_m.var_1d6d][1];
        final int n26 = Class_m.var_1f4d[Class_m.var_1dd5][0];
        final int n27 = Class_m.var_1f4d[Class_m.var_1dd5][1];
        final int n28 = Class_m.var_1f4d[Class_m.var_1dcd][0];
        final int n29 = Class_m.var_1f4d[Class_m.var_1dcd][1];
        final int n30 = Class_m.var_1f4d[Class_m.var_1ddd][0];
        final int n31 = Class_m.var_1f4d[Class_m.var_1ddd][1];
        final int n32 = Class_m.var_1f4d[Class_m.var_1d75][0];
        final int n33 = Class_m.var_1f4d[Class_m.var_1d75][1];
        final int n34 = Class_m.var_1f4d[Class_m.var_1d7d][0];
        final int n35 = Class_m.var_1f4d[Class_m.var_1d7d][1];
        final int n36 = Class_m.var_1f4d[Class_m.var_1de5][0];
        final int n37 = Class_m.var_1f4d[Class_m.var_1de5][1];
        final int n38 = Class_m.var_1f4d[Class_m.var_1ded][0];
        final int n39 = Class_m.var_1f4d[Class_m.var_1ded][1];
        final int n40 = Class_m.var_1f4d[Class_m.var_1df5][0];
        final int n41 = Class_m.var_1f4d[Class_m.var_1df5][1];
        if (Class_m.var_1ff5[Class_m.var_1fad] == 6 || Class_m.var_1ff5[Class_m.var_1fad] == 7 || Class_m.var_1ff5[Class_m.var_1fad] == 8) {
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
            if (Class_m.var_208d) {
                n46 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n46 = 36;
                }
            }
            sub_6676(graphics, 0, n46, n30, n31);
            Class_m.var_1e3d = 0;
            if (Class_m.var_208d) {
                Class_m.var_1e3d = 1;
            }
            final short[] sub_4ac6;
            Class_m.var_1e55 = (sub_4ac6 = Class_m.var_1fd5.sub_4ac6(sub_2306(Class_m.var_1ccd), n42 - sub_48a7 - 4, false))[2];
            if (sub_4ac6[0] > 1) {
                Class_m.var_1e55 = n42 - sub_48a7 - 8;
            }
            final int n48;
            final int n47 = ((n48 = n42 - (Class_m.var_1e55 + sub_48a7 + 4)) < 0) ? 0 : (n48 >> 1);
            sub_6676(graphics, 0, 19, n40 - (n42 >> 1) + n47, n31 + (n43 >> 1) - (sub_48cb(0, 19) >> 1));
            if (sub_4ac6[0] > 1) {
                int n49 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n49 = 4;
                }
                sub_2361(sub_2306(Class_m.var_1ccd), graphics, n42 - sub_48a7 + n49, n40 + (sub_48a7 >> 1), n41 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(Class_m.var_1ccd), graphics, var_2065, n40 - (n42 >> 1) + n47 + sub_48a7 + 2, n41 - 2, 6);
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
            if (Class_m.var_208d) {
                n52 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n52 = 36;
                }
            }
            if (Class_m.var_209d) {
                n53 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n53 = 36;
                }
            }
            sub_6676(graphics, 0, n53, n26, n27);
            sub_6676(graphics, 0, n52, n28, n29);
            Class_m.var_1e3d = 0;
            if (Class_m.var_209d) {
                Class_m.var_1e3d = 1;
            }
            sub_2338(sub_2306(Class_m.var_1cc5), graphics, var_2065, n36, n37 - 2, 3);
            final int sub_48a8 = sub_48a7(0, 19);
            int n54 = sub_48a7(0, 10);
            int n55 = sub_48cb(0, 10);
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n54 = sub_48a7(0, 35);
                n55 = sub_48cb(0, 35);
            }
            final short[] sub_4ac7;
            Class_m.var_1e55 = (sub_4ac7 = Class_m.var_1fd5.sub_4ac6(sub_2306(Class_m.var_1ccd), n54 - sub_48a8 - 4, false))[2];
            if (sub_4ac7[0] > 1) {
                Class_m.var_1e55 = n54 - sub_48a8 - 8;
            }
            final int n57;
            final int n56 = ((n57 = n54 - (Class_m.var_1e55 + sub_48a8 + 4)) < 0) ? 0 : (n57 >> 1);
            sub_6676(graphics, 0, 19, n38 - (n54 >> 1) + n56, n29 + (n55 >> 1) - (sub_48cb(0, 19) >> 1));
            Class_m.var_1e3d = 0;
            if (Class_m.var_208d) {
                Class_m.var_1e3d = 1;
            }
            if (sub_4ac7[0] > 1) {
                int n58 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n58 = 4;
                }
                sub_2361(sub_2306(Class_m.var_1ccd), graphics, n54 - sub_48a8 + n58, n38 + (sub_48a8 >> 1), n39 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(Class_m.var_1ccd), graphics, var_2065, n38 - (n54 >> 1) + n56 + sub_48a8 + 2, n39 - 2, 6);
            }
            Class_m.var_1e3d = 0;
        }
        Class_m.var_1e3d = 0;
        sub_2338(sub_2306(Class_m.var_1cb5), graphics, var_2065, n32, n33, 3);
        sub_2338(sub_2306(Class_m.var_1cbd), graphics, var_2065, n34, n35, 3);
        Class_m.var_1e55 = Class_m.var_1fd5.sub_4ac6(sub_2306(Class_m.var_1cbd), var_2065, false)[2];
        sub_6676(graphics, 0, 29, n34 + (Class_m.var_1e55 >> 1) + 3, n17);
        if (b) {
            final int abs = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
            int n59 = 6;
            int n60 = 4;
            final int n61 = abs + 1;
            final int n62 = Class_m.var_1f4d[Class_m.var_1d9d][0];
            final int n63 = Class_m.var_1f4d[Class_m.var_1d9d][1];
            final int n64 = Class_m.var_1f4d[Class_m.var_1da5][0];
            final int n65 = Class_m.var_1f4d[Class_m.var_1da5][1];
            if (Class_m.var_1f3d || Class_m.var_207d == 23) {
                if (!Class_m.var_2095) {
                    n59 = 7;
                }
                ++Class_m.var_1f35;
            }
            if (Class_m.var_1f45 || Class_m.var_207d == 24) {
                if (!Class_m.var_2095) {
                    n60 = 5;
                }
                ++Class_m.var_1f35;
            }
            sub_6676(graphics, 0, n59, n62 + n61, n63);
            sub_6676(graphics, 0, n60, n64 - n61, n65);
            if (Class_m.var_1f35 > 4) {
                Class_m.var_1f3d = false;
                Class_m.var_1f45 = false;
                Class_m.var_1f35 = 0;
                Class_m.var_2095 = false;
            }
        }
        sub_6621(graphics);
    }
    
    private static void sub_6621(final Graphics graphics) {
        final int n = Class_m.var_1f4d[Class_m.var_1dad][0];
        final int n2 = Class_m.var_1f4d[Class_m.var_1dad][1];
        int n3 = 0;
        if (Class_m.var_20a5) {
            n3 = 1;
        }
        sub_6676(graphics, 0, n3, n, n2);
    }
    
    private static void sub_6676(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        Class_m.var_1fcd[n].sub_71ae(graphics, n2, n3, n4, 0);
    }
    
    private static void sub_669f(final Graphics graphics, int max, int max2, int min, int min2) {
        max = Math.max(0, 0);
        max2 = Math.max(0, 0);
        min = Math.min(min, Class_m.var_205d);
        min2 = Math.min(min2, Class_m.var_2065);
        GLLib.sub_36f4(graphics, max, max2, min2, min, true);
    }
    
    public final void run() {
        new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());
        while (Class_m.var_1f85) {
            try {
                if (Class_m.var_1f8d != null) {
                    if ((Class_m.var_1c15 = Class_m.var_1f8d) != null && Class_m.var_1c15.length() > 0) {
                        Class_m.var_1f55 = false;
                        final String var_1c15 = Class_m.var_1c15;
                        Class_m.var_1c15 = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(var_1c15);
                        try {
                            Class_m.var_1f5d.platformRequest(var_1c15);
                            Thread.sleep(200L);
                        }
                        catch (final Exception ex) {}
                        Class_m.var_1f9d = 1;
                    }
                    Class_m.var_1f8d = null;
                }
                Thread.sleep(1000L);
            }
            catch (final Exception ex2) {}
        }
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
    }
    
    private static InputStream sub_67eb(final String name) {
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
        Class_m.var_1bfd = "2.3";
        Class_m.var_1c05 = "IGP-Signature=" + Class_m.var_1bfd;
        Class_m.var_1c0d = "";
        Class_m.var_1c25 = "URL";
        Class_m.var_1c2d = 2;
        Class_m.var_1c35 = new boolean[1];
        Class_m.var_1c3d = new int[1];
        Class_m.var_1c45 = -1;
        Class_m.var_1c4d = 8;
        Class_m.var_1cdd = "ZVIP";
        Class_m.var_1ce5 = "SCFR";
        Class_m.var_1ced = "GMCL";
        Class_m.var_1cf5 = "CCTL";
        Class_m.var_1cfd = "TITLE-FREEMIUM";
        Class_m.var_1d05 = "TITLE-GLCLUB";
        Class_m.var_1d0d = "URL-OPERATOR";
        Class_m.var_1d15 = 1;
        Class_m.var_1d1d = 4;
        Class_m.var_1d25 = 8;
        Class_m.var_1d2d = 9;
        Class_m.var_1d35 = 10;
        Class_m.var_1d3d = 11;
        Class_m.var_1d45 = 12;
        Class_m.var_1d4d = 13;
        Class_m.var_1d55 = 14;
        Class_m.var_1d5d = 1;
        Class_m.var_1d65 = 2;
        Class_m.var_1d6d = 3;
        Class_m.var_1d75 = 4;
        Class_m.var_1d7d = 5;
        Class_m.var_1d85 = 6;
        Class_m.var_1d8d = 7;
        Class_m.var_1d95 = 8;
        Class_m.var_1d9d = 9;
        Class_m.var_1da5 = 10;
        Class_m.var_1dad = 11;
        Class_m.var_1db5 = 12;
        Class_m.var_1dbd = 13;
        Class_m.var_1dc5 = 14;
        Class_m.var_1dcd = 15;
        Class_m.var_1dd5 = 16;
        Class_m.var_1ddd = 17;
        Class_m.var_1de5 = 18;
        Class_m.var_1ded = 19;
        Class_m.var_1df5 = 20;
        Class_m.var_1dfd = 21;
        Class_m.var_1e05 = 22;
        Class_m.var_1e0d = 24;
        Class_m.var_1e15 = 25;
        Class_m.var_1e5d = "IGP-CATEGORIES";
        Class_m.var_1e65 = "IGP-PROMOS";
        Class_m.var_1e6d = "IGP-FREEMIUM";
        Class_m.var_1e75 = "URL-TEMPLATE-GAME";
        Class_m.var_1e7d = "more_games_url";
        Class_m.var_1e85 = "more_games_status";
        Class_m.var_1e8d = null;
        Class_m.var_1e95 = null;
        Class_m.var_1e9d = "on";
        Class_m.var_1ea5 = "XXXX";
        Class_m.var_1ead = "&ctg=" + Class_m.var_1ea5;
        Class_m.var_1eb5 = "&ctg=";
        Class_m.var_1ebd = "&lg=";
        Class_m.var_1ec5 = "SC";
        Class_m.var_1ecd = "ingameads.gameloft.com/redir";
        Class_m.var_1ed5 = ";";
        Class_m.var_1efd = false;
        Class_m.var_1f05 = new String[0];
        Class_m.var_1f55 = false;
        Class_m.var_1f6d = false;
        Class_m.var_1f75 = null;
        Class_m.var_1f7d = null;
        Class_m.var_1f85 = false;
        Class_m.var_1f8d = null;
        Class_m.var_1f95 = false;
        Class_m.var_1fe5 = new int[2];
        Class_m.var_2005 = 0;
        Class_m.var_200d = 0;
        Class_m.var_203d = "";
        Class_m.var_2055 = false;
        Class_m.var_207d = 0;
        Class_m.var_2085 = false;
        Class_m.var_208d = false;
        Class_m.var_2095 = false;
        Class_m.var_209d = false;
        Class_m.var_20a5 = false;
        Class_m.var_20ad = -1;
        Class_m.var_20b5 = -1;
        new Hashtable();
    }
}
