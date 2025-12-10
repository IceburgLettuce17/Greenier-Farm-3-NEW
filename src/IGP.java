

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
    private static String URL_PREFIX;
    private static int var_1c2d;
    private static boolean[] var_1c35;
    private static int[] var_1c3d;
    private static int var_1c45;
    private static int var_1c4d;
    private static int var_1c55;
    private static int var_1c5d;
    private static int var_1c65;
   // private static int var_1c6d;
    //private static int var_1c75;
   // private static int var_1c7d;
   // private static int var_1c85;
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
    private static String ZVIP_PREFIX;
    private static String SCFR_PREFIX;
    private static String GMCL_PREFIX;
    private static String CCTL_PREFIX;
    private static String s_TITLE_FREEMIUM;
    private static String s_TITLE_GLCLUB;
    private static String s_URL_OPERATOR;
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
    private static String s_IGP_CATEGORIES;
    private static String s_IGP_PROMOS;
    private static String s_IGP_FREEMIUM;
    private static String k_URL_TEMPLATE_GAME;
    private static String s_moreGamesUrlProp;
    private static String s_moreGamesStatProp;
    private static String s_moreGamesAppProp;
    private static String moreGamesStatAppProp;
    private static String var_1e9d;
    private static String s_PLACEHOLDER;
    private static String s_ctg_PLACEHOLDER;
    private static String var_1eb5;
    private static String var_1ebd;
    private static String var_1ec5;
    private static String s_igaUrlRedir;
    private static String s_GAME_SEPARATOR;
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
    private static MIDlet MidletInstance;
    //private static Canvas s_game;
    //private static boolean var_1f6d;
    //private static CommandListener s_cmdListener;
    private static IGP var_1f7d;
    private static boolean var_1f85;
    private static String var_1f8d;
    private static boolean s_isAvailable;
    private static int CurrentState;
    private static int var_1fa5;
    private static int var_1fad;
    private static int var_1fb5;
    private static int CurrentLoadingStep;
    private static int var_1fc5;
    private static ASprite[] var_1fcd;
    private static ASprite var_1fd5;
    private static ASprite var_1fdd;
    private static int[] var_1fe5;
    private static String[] var_1fed;
    private static int[] var_1ff5;
    private static boolean[] var_1ffd;
    private static int var_2005;
    //private static int var_200d;
    private static int var_2015;
   // private static int var_201d;
    private static String var_2025;
    private static String var_202d;
    private static String StringLoading;
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
    
    private static boolean tryReadFromDataIGP() {
        sub_21d0();
        try {
            final InputStream dataIGP = getResourceAsStream("/dataIGP");
            var_1e25 = new int[var_1e1d = (var_1e1d = (dataIGP.read() & 0xFF)) + ((dataIGP.read() & 0xFF) << 8)];
            for (int i = 0; i < var_1e1d; ++i) {
                var_1e25[i] = dataIGP.read();
                var_1e25[i] += (dataIGP.read()) << 8;
                var_1e25[i] += (dataIGP.read()) << 16;
                var_1e25[i] += (dataIGP.read()) << 24;
            }
            dataIGP.close();
        }
        catch (final Exception ex) {
            return false;
        }
        return true;
    }
    
    private static void sub_21d0() {
        var_1e25 = null;
        var_1e1d = 0;
        System.gc();
    }
    
    private static byte[] sub_21f6(int i) {
        if (i < 0 || i >= var_1e1d - 1) {
            return null;
        }
        if (var_1e25[i + 1] - var_1e25[i] == 0) {
            return null;
        }
        byte[] b = null;
        try {
            InputStream dataIGP = getResourceAsStream("/dataIGP");
            dataIGP.skip(2 + 4 * var_1e1d + var_1e25[i]);
            for (i = (b = new byte[var_1e25[i + 1]]).length; i > 0; i -= dataIGP.read(b)) {}
            dataIGP.close();
        }
        catch (final Exception ex) {}
        return b;
    }
    
    private static int sub_22c9(final byte[] array) {
        return array[var_1e2d++] + (array[var_1e2d++] << 8);
    }
    
    private static String sub_2306(final int n) {
        return "" + var_1f15[n];
    }
    
    private static void sub_2338(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        sub_2389(s, graphics, n, n2, n3, n4, 10, false);
    }
    
    private static void sub_2361(final String s, final Graphics graphics, final int n, final int n2, final int n3, final int n4, final boolean b) {
        sub_2389(s, graphics, n, n2, n3, 3, 10, true);
    }
    
    private static void sub_2389(final String s, Graphics g, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (b) {
            if (var_1e45 == 0) {
                var_1fd5.SetCurrentPalette(var_1e3d);
                var_1fd5.sub_547f(g, s, var_1fd5.WraptextB(s, n, false), n2, n3, 0, 10, n4, -1, false);
                return;
            }
            var_1fdd.SetCurrentPalette(var_1e3d);
            var_1fdd.sub_547f(g, s, var_1fdd.WraptextB(s, n, false), n2, n3, 0, 10, n4, -1, false);
        }
        else {
            if (var_1e45 == 0) {
                var_1fd5.SetCurrentPalette(var_1e3d);
                var_1fd5.sub_5cd2(g, s, n2, n3, n4);
                return;
            }
            var_1fdd.SetCurrentPalette(var_1e3d);
            var_1fdd.sub_5cd2(g, s, n2, n3, n4);
        }
    }
    
    public static void initialize(MIDlet midlet, Canvas game, int screenWidth, final int screenHeight) {
        new StringBuffer().append("initialize(midlet = ").append(midlet).append(", game = ").append(game).append(", screenWidth = ").append(screenWidth).append(", screenHeight = ").append(screenHeight).append(", cmdListener = ").append((Object)null).append(")");
        s_screenHeight = screenHeight;
        s_screenWidth = screenWidth;
        var_206d = s_screenHeight >> 1;
        var_2075 = s_screenWidth >> 1;
        if (/*2 >*/ s_screenHeight > 2) {
            var_1c2d = 2;
        }
        if (MidletInstance == null && game != null) {
            MidletInstance = midlet;
            //s_game = game;
            sub_2bc9();
            new StringBuffer().append(s_fullIgpSignature).append("");
            sub_3367();
            s_igaUrlRedir = null;
            var_1edd = null;
            k_URL_TEMPLATE_GAME = null;
            s_IGP_CATEGORIES = null;
            s_TITLE_FREEMIUM = null;
            s_TITLE_GLCLUB = null;
            s_URL_OPERATOR = null;
            URL_PREFIX = null;
            s_PLACEHOLDER = null;
            s_ctg_PLACEHOLDER = null;
            var_1ec5 = null;
            var_1eb5 = null;
            s_GAME_SEPARATOR = null;
            s_IGP_PROMOS = null;
            System.gc();
        }
    }
    
    private static boolean checkURL(String url, int checkFlags) {
        return url != null && (url = url.trim()).length() != 0 && url.toUpperCase().compareTo("DEL") != 0 && url.toUpperCase().compareTo("NO") != 0 && url.toUpperCase().compareTo("0") != 0;
    }
    
    private static String getRedirLink(String appProp, String code, String urlTemplate) {
        String url = "";
        try {
            if (urlTemplate != null && appProp != null && code != null) {
                int startPos = appProp.indexOf(code + "=");
                urlTemplate = urlTemplate.trim();
                if (startPos >= 0 && urlTemplate.length() > 0) {
                    startPos += code.length()+1;
                    int endPos = appProp.indexOf(s_GAME_SEPARATOR, startPos);
                    if (endPos < 0) {
                        endPos = appProp.length();
                    }
                    url = appProp.substring(startPos, endPos);
                    if (url.trim().length() == 0 || url.compareTo("0") == 0 || url.toUpperCase().compareTo("NO") == 0) {
                        url = "";
                    }
                    else if (url.toUpperCase().compareTo("DEL") != 0 && code.compareTo("OP") != 0) {
                        final int separatorPos = urlTemplate.indexOf(s_PLACEHOLDER);
                        if (separatorPos >= 0) {
                            url = urlTemplate.substring(0, separatorPos) + url + urlTemplate.substring(separatorPos + s_PLACEHOLDER.length());
                        }
                        else {
                            url = urlTemplate;
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {
            url = "";
        }
        return url;
    }
    
    private static void sub_277b(final int n, final String str, final int n2, String property, final String s2, final int n3) {
        try {
            String s3 = "";
            String s4;
            if (var_1eed) {
                s4 = getRedirLink(MidletInstance.getAppProperty(property), str, s2);
                if (str.equals(SCFR_PREFIX)) {
                    property = s_IGP_FREEMIUM;
                    s3 = getRedirLink(MidletInstance.getAppProperty(property), var_1f25[n - var_1f2d.length], s2);
                }
            }
            else if (str.equals(CCTL_PREFIX)) {
                s4 = var_203d;
            }
            else {
                property = URL_PREFIX + "-" + str;
                s4 = MidletInstance.getAppProperty(property);
            }
            if (str.equals(SCFR_PREFIX)) {
                if (var_1eed) {
                    final int index;
                    if ((index = s4.indexOf(SCFR_PREFIX)) >= 0) {
                        s4 = s4.substring(0, index) + var_1f25[n - var_1f2d.length] + s4.substring(index + var_1f25[n - var_1f2d.length].length());
                    }
                }
                else {
                    property = URL_PREFIX + "-" + SCFR_PREFIX + "-" + var_1f25[n - var_1f2d.length];
                    s4 = MidletInstance.getAppProperty(property);
                    property = URL_PREFIX + "-" + SCFR_PREFIX + "-" + var_1f25[n - var_1f2d.length];
                    s3 = MidletInstance.getAppProperty(property);
                }
            }
            final boolean sub_258f = checkURL(s4, 7);
            boolean sub_258f2 = true;
            if (str.equals(SCFR_PREFIX)) {
                sub_258f2 = checkURL(s3, 7);
            }
            if (sub_258f && sub_258f2 && (s4.toUpperCase().compareTo("NO") != 0 || s4.toUpperCase().compareTo("0") != 0)) {
                var_1ffd[n] = true;
                var_1fed[n] = s4;
                if (var_1ffd[n]) {
                    switch (var_1ff5[n] = n3) {
                        case 4: {
                            ++var_2005;
                            if (var_1ee5) {
                                final StringBuffer sb = new StringBuffer();
                                var_1fed[n] = sb.append(var_1fed[n]).append(var_1eb5).append(var_1ec5).append((var_2005 < 10) ? "0" : "").append(var_2005).toString();
                                return;
                            }
                            break;
                        }
                        case 6: {
                            //++var_200d;
                            if (var_1ee5) {
                                final StringBuffer sb2 = new StringBuffer();
                                final String[] var_1fed2 = var_1fed;
                                var_1fed2[n] = sb2.append(var_1fed2[n]).append(var_1eb5).append(SCFR_PREFIX).toString();
                                return;
                            }
                            break;
                        }
                        case 7: {
                            if (var_1ee5) {
                                final StringBuffer sb3 = new StringBuffer();
                                final String[] var_1fed3 = var_1fed;
                                var_1fed3[n] = sb3.append(var_1fed3[n]).append(var_1eb5).append(GMCL_PREFIX).toString();
                                return;
                            }
                            break;
                        }
                        case 8: {
                            if (var_1ee5) {
                                final StringBuffer sb4 = new StringBuffer();
                                final String[] var_1fed4 = var_1fed;
                                var_1fed4[n] = sb4.append(var_1fed4[n]).append(var_1eb5).append(CCTL_PREFIX).toString();
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
            array[i] = new String(bytes, var_1e2d, sub_22c9);
            var_1e2d += sub_22c9;
        }
        return array;
    }
    
    private static void sub_2bc9() {
        try {
            if (!tryReadFromDataIGP()) {
                s_isAvailable = false;
                return;
            }
            final byte[] sub_21f6 = sub_21f6(0);
            sub_22c9(sub_21f6);
            var_1e2d += sub_22c9(sub_21f6);
            final int sub_22c9 = sub_22c9(sub_21f6);
            var_1ef5 = new String(sub_21f6, var_1e2d, sub_22c9);
            var_1e2d += sub_22c9;
            var_1e2d += sub_22c9(sub_21f6);
            var_1e2d += sub_22c9(sub_21f6);
            var_1e2d += sub_22c9(sub_21f6);
            var_1efd = (sub_22c9(sub_21f6) == 1);
            sub_22c9(sub_21f6);
            sub_22c9(sub_21f6);
            var_1f05 = sub_2b59(sub_21f6);
            var_1f2d = sub_2b59(sub_21f6);
            var_1f25 = sub_2b59(sub_21f6);
            sub_2b59(sub_21f6);
            for (int i = 0; i < var_1c35.length; ++i) {
                var_1c35[i] = (sub_22c9(sub_21f6) == 1);
            }
            try {
                s_dataIGPVersion = new String(sub_21f6, var_1e2d, sub_22c9(sub_21f6));
                new StringBuffer().append("IGP dataIGP version: ").append(s_dataIGPVersion);
                new StringBuffer().append(s_igpClassVersion).append("z");
                if (!s_dataIGPVersion.startsWith(s_igpClassVersion)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(s_dataIGPVersion);
                    new StringBuffer().append("IGP Class version : ").append(s_igpClassVersion);
                }
            }
            catch (final Exception ex) {
                s_isAvailable = false;
            }
            sub_21d0();
        }
        catch (final Exception ex2) {
            s_isAvailable = false;
            return;
        }
        final String[] array = var_1f2d;
        int n = ((var_1f2d.length - 1 > 0) ? (array.length - 1) : 0) + ((var_1f25.length - 1 > 0) ? (var_1f25.length - 1) : 0);
        var_1c8d = (var_1cd5 = (var_1ccd = (var_1cc5 = (var_1cbd = (var_1cb5 = (var_1cad = (var_1ca5 = (var_1c9d = (var_1c95 = ++n + 1) + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1 + 1 + 1) + 1;
        var_1f0d = var_1f2d.length + var_1f25.length + 1 + 1;
        for (int j = 0; j < var_1c35.length; ++j) {
            if (var_1c35[j]) {
                var_1c3d[j] = ++var_1c4d;
            }
            else {
                var_1c3d[j] = --var_1c45;
            }
        }
        ++var_1c4d;
        var_1fed = new String[var_1f0d];
        var_1ffd = new boolean[var_1f0d];
        var_1ff5 = new int[var_1f0d];
        for (int k = 0; k < var_1ffd.length; ++k) {
            var_1ffd[k] = false;
        }
        var_1c65 = (var_1c5d = (var_1c55 = var_1f2d.length) + var_1f25.length) + 1;
        s_moreGamesAppProp = MidletInstance.getAppProperty(s_moreGamesUrlProp);
        moreGamesStatAppProp = MidletInstance.getAppProperty(s_moreGamesStatProp);
        if (s_moreGamesAppProp != null && moreGamesStatAppProp.toLowerCase().equals(var_1e9d.toLowerCase())) {
            var_204d = s_moreGamesAppProp;
            var_2055 = true;
            s_isAvailable = true;
            return;
        }
        try {
            if ((var_1edd = MidletInstance.getAppProperty(k_URL_TEMPLATE_GAME)) != null) {
                var_1edd = var_1edd.trim();
                var_1eed = true;
                if (var_1edd.indexOf(s_igaUrlRedir) != -1) {
                    var_1ee5 = true;
                }
            }
        }
        catch (final Exception ex3) {}
        for (int l = 0; l < var_1f2d.length; ++l) {
            sub_277b(l, var_1f2d[l], 7, s_IGP_PROMOS, var_1edd, 4);
        }
        for (int n2 = 0; n2 < var_1f25.length; ++n2) {
            sub_277b(var_1c55 + n2, SCFR_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 6);
        }
        try {
            final String trim;
            if (checkURL(trim = MidletInstance.getAppProperty(s_URL_OPERATOR).trim(), 7)) {
                var_203d = trim;
            }
        }
        catch (final Exception ex4) {}
        sub_277b(var_1c5d, GMCL_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 7);
        sub_277b(var_1c65, CCTL_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 8);
        var_2025 = sub_3135(MidletInstance.getAppProperty(s_TITLE_FREEMIUM));
        var_202d = sub_3135(MidletInstance.getAppProperty(s_TITLE_GLCLUB));
        var_1fe5 = sub_357f();
        if (sub_3607() > 0) {
            s_isAvailable = true;
        }
        new StringBuffer().append("isAvailable = ").append(s_isAvailable);
    }
    
    private static String sub_3135(String upperCase) {
        if (upperCase == null) {
            return "0";
        }
        String string = "";
        upperCase = upperCase.toUpperCase();
        boolean b = false;
        final int var_2065 = s_screenWidth;
        if (var_2065 >= s_screenHeight && var_2065 == 320) {
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
    
    public static boolean IsAvailable() {
        return s_isAvailable;
    }
    
    public static void enterIGP(String loadingMsg, final int lang) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(loadingMsg).append(", appLanguage = ").append(0).append(" (").append(var_1f05[0]).append(")");
        if (var_2055) {
            sub_3539();
            var_1f85 = true;
            var_1f8d = var_204d;
        }
        else {
            sub_4f48();
            if (0 < var_1f05.length) {
                //var_201d = 0;
                StringLoading = loadingMsg;
                CurrentLoadingStep = -1;
                CurrentState = 0;
                var_1fb5 = -1;
                var_1fad = 0;
                var_1f85 = true;
                s_igpFont = Font.getFont(0, 0, 8);
                sub_3539();
            }
            var_1fc5 = 4 + var_1f0d;
            var_1fad = sub_3660();
        }
        RecordStore igp19 = null;
        try {
        	igp19 = RecordStore.openRecordStore("igp19", false);
        }
        catch (final Exception ex) {
            try {
            	igp19 = RecordStore.openRecordStore("igp19", true);
            }
            catch (final Exception ex2) {}
        }
        try {
            if (loadingMsg != null) {
                igp19.closeRecordStore();
            }
        }
        catch (final Exception ex3) {}
    }
    
    private static boolean sub_3367() {
        boolean b = false;
        for (int i = 0; i < var_1f05.length; ++i) {
            if (var_1f05[i].equals("SP")) {
                b = true;
            }
        }
        if (!b) {
            return false;
        }
        try {
            final String appProperty;
            if ((appProperty = MidletInstance.getAppProperty(s_IGP_CATEGORIES)) == null || appProperty.indexOf(ZVIP_PREFIX) == -1) {
            	var_2045 = MidletInstance.getAppProperty(URL_PREFIX + "-" + ZVIP_PREFIX);
                return var_2045 != null;
            }
            final int beginIndex;
            final int endIndex;
            if ((endIndex = (beginIndex = appProperty.indexOf(ZVIP_PREFIX) + ZVIP_PREFIX.length() + 1) + ZVIP_PREFIX.length()) >= appProperty.length()) {
                return false;
            }
            if (!appProperty.substring(beginIndex, endIndex).equals(ZVIP_PREFIX)) {
                return false;
            }
            var_2045 = var_203d;
            if (var_1ee5) {
                final int index;
                if ((index = (var_2045 += s_ctg_PLACEHOLDER).indexOf(s_PLACEHOLDER)) >= 0) {
                    var_2045 = var_2045.substring(0, index) + ZVIP_PREFIX + var_2045.substring(index + s_PLACEHOLDER.length());
                }
                if (var_2045.length() == 0) {
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
        if (var_1f7d == null) {
            var_1f7d = new IGP();
        }
        new Thread(var_1f7d).start();
    }
    
    private static int[] sub_357f() {
        final int[] array = new int[2];
        array[1] = (array[0] = 0);
        for (int i = 0; i < var_1ffd.length; ++i) {
            if (var_1ffd[i]) {
                if (i < var_1c55) {
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
        for (int i = 0; i < var_1ffd.length; ++i) {
            if (var_1ffd[i]) {
                ++n;
            }
        }
        return n;
    }
    
    private static int sub_3660() {
        for (int i = 0; i < var_1ffd.length; ++i) {
            if (var_1ffd[i]) {
                return i;
            }
        }
        return -1;
    }
    
    private static void sub_36b3(int offset) {
        try {
            var_1e2d = 0;
            switch (offset) {
                case -1: {
                    var_1fcd = new ASprite[var_1d55];
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
                    tryReadFromDataIGP();
                    final byte[] sub_21f6;
                    sub_22c9(sub_21f6 = sub_21f6(offset));
                    final int sub_22c9;
                    var_1f15 = new String[sub_22c9 = sub_22c9(sub_21f6)];
                    final byte[] bytes = new byte[sub_22c9];
                    System.arraycopy(sub_21f6, var_1e2d, bytes, 0, sub_22c9);
                    var_1e2d += sub_22c9;
                    sub_22c9(sub_21f6);
                    final int n;
                    var_1f1d = new short[n = ((sub_21f6[var_1e2d++] & 0xFF) | (sub_21f6[var_1e2d++] & 0xFF) << 8)];
                    for (int i = 0; i < n - 1; ++i) {
                        var_1f1d[i] = (short)((sub_21f6[var_1e2d++] & 0xFF) + ((sub_21f6[var_1e2d++] & 0xFF) << 8));
                    }
                    var_1f1d[n - 1] = (short)sub_22c9;
                    for (int j = 0; j < n; ++j) {
                        offset = ((j == 0) ? 0 : (var_1f1d[j - 1] & 0xFFFF));
                        final int length;
                        if ((length = (var_1f1d[j] & 0xFFFF) - offset) != 0) {
                            try {
                                var_1f15[j] = new String(bytes, offset, length, "UTF-8");
                            }
                            catch (final Exception ex) {}
                        }
                    }
                    return;
                }
                case 2: {
                    GLLib.Pack_Open("/11");
                    (var_1fd5 = sub_680f(var_1d35, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(var_1d45));
                    var_1e35 = var_1fd5.sub_494e();
                    (var_1fdd = sub_680f(var_1d3d, 3, true, false)).sub_46d6((short[])GLLib.Pack_ReadArray(var_1d4d));
                    if (s_screenWidth > 160 && s_screenWidth > 220) {
                        if (s_screenWidth <= 320) {
                            var_1fd5.sub_4a1a(-1);
                            if (s_screenHeight == 240 || var_1efd) {
                                var_1fd5.sub_4a1a(0);
                            }
                        }
                        else if (s_screenWidth <= 480) {
                            var_1fdd.sub_4a1a(-1);
                        }
                    }
                    GLLib.Pack_FullyClose();
                    return;
                }
                case 3: {
                    GLLib.Pack_Open("/11");
                    for (int k = 0; k < var_1d55; ++k) {
                        if (k != var_1d35 && k != var_1d45 && k != var_1d3d && k != var_1d4d) {
                            var_1fcd[k] = sub_680f(k, 1, true, true);
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
        for (int i = 0; i < var_1d55; ++i) {
            if (var_1fcd[i] != null && i != var_1d35 && i != var_1d45 && i != var_1d3d && i != var_1d4d && i != 0) {
                var_1fcd[i].sub_123f();
                var_1fcd[i] = null;
            }
        }
        if (b) {
            sub_21d0();
            GLLib.Pack_FullyClose();
            var_1f1d = null;
            var_1f15 = null;
            StringLoading = null;
            for (int j = 0; j < var_1d55; ++j) {
                if (var_1fcd[j] != null) {
                    var_1fcd[j].sub_123f();
                    var_1fcd[j] = null;
                }
            }
            var_1fcd = null;
            var_1fd5.sub_123f();
            var_1fd5 = null;
            var_1fdd.sub_123f();
            var_1fdd = null;
        }
        System.gc();
    }
    
    public static void sub_3b06(final boolean b) {
        if (b) {
            if (CurrentState == 0 || CurrentState == 2) {
                var_1fb5 = CurrentState;
                CurrentState = 5;
            }
            sub_4f48();
            return;
        }
        if (CurrentState == 5) {
            CurrentState = var_1fb5;
            CurrentLoadingStep = -1;
        }
    }
    
    public static boolean sub_3b75(int var_1fa5) {
        if (var_2055) {
            return true;
        }
        if (!s_isAvailable) {
            return true;
        }
        if (var_2085) {
            var_2085 = false;
        }
        else {
            var_1fa5 = IGP.var_1fa5;
        }
        Label_2560: {
            switch (CurrentState) {
                case 0: {
                    if (CurrentLoadingStep >= var_1fc5) {
                        CurrentState = 1;
                        var_2015 = var_1fad;
                        var_1fa5 = s_screenWidth;
                        final int var_205d = s_screenHeight;
                        var_1f4d = new int[var_1e15][];
                        for (int i = 0; i < var_1e15; ++i) {
                            (var_1f4d[i] = new int[2])[0] = 0;
                            var_1f4d[i][1] = 0;
                        }
                        final int sub_48a7 = sub_48a7(0, 0);
                        final int sub_48cb = sub_48cb(0, 0);
                        final int sub_48a8 = sub_48a7(var_1d15, 0);
                        final int sub_48cb2 = sub_48cb(var_1d15, 0);
                        final int sub_48cb3 = sub_48cb(0, 9);
                        int n = sub_48a7(0, 10);
                        int n2 = sub_48cb(0, 10);
                        if ((var_1fa5 == 240 && (var_205d == 320 || var_205d == 400)) || (var_1fa5 == 360 && (var_205d == 640 || var_205d == 480))) {
                            n = sub_48a7(0, 35);
                            n2 = sub_48cb(0, 35);
                        }
                        final int sub_48cb4 = sub_48cb(0, 15);
                        final int sub_48cb5 = sub_48cb(0, 29);
                        var_1fd5.sub_5917(sub_2306(var_1cd5), null);
                        final short[] sub_4ac6 = var_1fd5.WraptextB(sub_2306(var_1cd5), var_1fa5 - sub_48a7, false);
                        var_1e55 = ASprite.var_119f;
                        int n3 = var_1e4d = sub_4ac6[0] * var_1e35;
                        if (sub_48cb > var_1e4d) {
                            n3 = sub_48cb;
                        }
                        if (n2 > n3) {
                            n3 = n2;
                        }
                        final int n4 = var_205d - (var_1e35 + sub_48cb3 + sub_48cb2 + n3) - 3 - sub_48cb4 >> 2;
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
                        var_1f4d[var_1d65][0] = var_1fa5 - n6 >> 2;
                        var_1f4d[var_1d65][1] = 3;
                        var_1f4d[var_1d6d][0] = (var_1fa5 - n7 >> 2) * 3;
                        var_1f4d[var_1d6d][1] = var_1f4d[var_1d65][1];
                        final int sub_33a1 = var_1fcd[0].sub_33a1(15, var_1fcd[0].sub_377d(15) - 1);
                        var_1f4d[var_1d75][0] = var_1fa5 >> 2;
                        var_1f4d[var_1d75][1] = var_1f4d[var_1d65][1] + (sub_33a1 >> 1) + n5;
                        var_1f4d[var_1d7d][0] = (var_1fa5 >> 1) + (var_1fa5 >> 2);
                        var_1f4d[var_1d7d][1] = var_1f4d[var_1d75][1];
                        var_1f4d[0][0] = var_1fa5 >> 1;
                        var_1f4d[0][1] = n4 + (var_1e35 >> 1) + n5 - 2;
                        final int[] array = var_1f4d[0];
                        final int n8 = 1;
                        array[n8] += var_1f4d[var_1d65][1] + sub_48cb4;
                        var_1f4d[var_1d85][0] = 0;
                        var_1f4d[var_1d85][1] = var_1f4d[0][1] + n4 + (var_1e35 >> 1) - n5 + 2;
                        var_1f4d[var_1d5d][0] = var_1fa5 >> 1;
                        var_1f4d[var_1d5d][1] = var_1f4d[var_1d85][1] + (sub_48cb3 >> 1) + n5 - 2;
                        final int sub_48a9 = sub_48a7(0, 2);
                        final int sub_48cb6 = sub_48cb(0, 2);
                        var_1f4d[var_1dbd][0] = 5;
                        var_1f4d[var_1dbd][1] = var_1f4d[var_1d85][1] + (sub_48cb3 >> 1) - (sub_48cb6 >> 1);
                        var_1f4d[var_1dc5][0] = var_1fa5 - 5 - sub_48a9;
                        var_1f4d[var_1dc5][1] = var_1f4d[var_1dbd][1];
                        var_1f4d[var_1dad][0] = var_1fa5 - var_1c2d - sub_48a7;
                        var_1f4d[var_1dad][1] = var_205d - 2 - sub_48cb;
                        var_1f4d[var_1e0d][0] = var_1c2d;
                        var_1f4d[var_1e0d][1] = var_205d - 2 - sub_48cb;
                        final int n9 = var_1f4d[var_1dad][0] - (n << 1);
                        var_1f4d[var_1dd5][0] = n9 / 3;
                        var_1f4d[var_1dd5][1] = var_205d - 2 - n2;
                        var_1f4d[var_1de5][0] = var_1f4d[var_1dd5][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1de5][1] = var_1f4d[var_1dd5][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1dcd][0] = var_1f4d[var_1dd5][0] + n + n9 / 3;
                        var_1f4d[var_1dcd][1] = var_1f4d[var_1dd5][1];
                        var_1f4d[var_1ded][0] = var_1f4d[var_1dcd][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1ded][1] = var_1f4d[var_1dcd][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1ddd][0] = (var_1fa5 >> 1) - (n >> 1);
                        var_1f4d[var_1ddd][1] = var_1f4d[var_1dd5][1];
                        var_1f4d[var_1df5][0] = var_1f4d[var_1ddd][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1df5][1] = var_1f4d[var_1ddd][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1d8d][0] = (var_1fa5 >> 1) - (sub_48a8 >> 1);
                        var_1f4d[var_1d8d][1] = var_1f4d[var_1d85][1] + sub_48cb3 + n4;
                        var_1f4d[var_1dfd][0] = var_1fa5 - sub_48a7 >> 1;
                        var_1f4d[var_1dfd][1] = var_1f4d[var_1d8d][1] + sub_48cb2 + (var_205d - var_1f4d[var_1d8d][1] - sub_48cb2 >> 1);
                        var_1f4d[var_1dfd][0] = var_1fa5 - n >> 2;
                        if (var_205d > var_1fa5) {
                            var_1f4d[var_1dfd][1] = var_1f4d[var_1d8d][1] + sub_48cb2 + (var_1f4d[var_1ddd][1] - (var_1f4d[var_1d8d][1] + sub_48cb2) >> 1);
                            var_1f4d[var_1dfd][0] = var_1fa5 >> 1;
                        }
                        var_1f4d[var_1d95][0] = var_1fa5 >> 1;
                        var_1f4d[var_1d95][1] = var_1f4d[var_1d8d][1] + (sub_48cb2 << 1) / 3;
                        var_1f4d[var_1d9d][0] = 5;
                        var_1f4d[var_1d9d][1] = var_1f4d[var_1d8d][1] + (sub_48cb2 >> 1) - (sub_48cb(0, 6) >> 1);
                        var_1f4d[var_1da5][0] = var_1fa5 - sub_48a7(0, 4) - 5;
                        var_1f4d[var_1da5][1] = var_1f4d[var_1d9d][1];
                        int n10 = sub_48a7(0, 8);
                        int n11 = sub_48cb(0, 8);
                        if (var_1fa5 == 360 && var_205d == 480) {
                            n10 = sub_48a7(0, 39);
                            n11 = sub_48cb(0, 39);
                        }
                        var_1f4d[var_1db5][0] = var_1f4d[var_1d8d][0] + sub_48a8 - n10;
                        var_1f4d[var_1db5][1] = var_1f4d[var_1d8d][1] + sub_48cb2 - n11;
                        var_1f4d[var_1e05][0] = 0;
                        var_1f4d[var_1e05][1] = var_1f4d[0][1] - (sub_48cb5 >> 1);
                        var_1fa5 = var_1fcd[0].sub_377d(15);
                        var_1fa5 = var_1fcd[0].sub_33a1(15, var_1fa5 - 1);
                        var_1f4d[var_1e05][1] = var_1f4d[var_1d65][1] + (var_1fa5 >> 1) - (sub_48cb5 >> 1);
                    }
                    else {
                        sub_36b3(CurrentLoadingStep);
                    }
                    ++CurrentLoadingStep;
                    break;
                }
                case 1: {
                    Label_2264: {
                        Label_2258: {
                            switch (var_1fa5) {
                                case 26: {
                                    CurrentState = 4;
                                    break Label_2560;
                                }
                                case 23: {
                                    var_1fa5 = 0;
                                    if (var_1fad >= var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (var_1fe5[var_1fa5] > 1) {
                                        if (var_1fad == 0) {
                                            var_1fad = var_1c55 - 1;
                                        }
                                        else if (var_1fad == var_1c55) {
                                            var_1fad = var_1f0d - 1;
                                        }
                                        else {
                                            --var_1fad;
                                        }
                                        while (!var_1ffd[var_1fad]) {
                                            if (var_1fad == 0) {
                                                var_1fad = var_1c55 - 1;
                                            }
                                            else if (var_1fad == var_1c55) {
                                                var_1fad = var_1f0d - 1;
                                            }
                                            else {
                                                --var_1fad;
                                            }
                                        }
                                        var_1f3d = true;
                                        break;
                                    }
                                    break Label_2264;
                                }
                                case 24: {
                                    var_1fa5 = 0;
                                    if (var_1fad >= var_1c55) {
                                        var_1fa5 = 1;
                                    }
                                    if (var_1fe5[var_1fa5] > 1) {
                                        if (!var_1f3d) {
                                            if (var_1fad == var_1c55 - 1) {
                                                var_1fad = 0;
                                            }
                                            else if (var_1fad == var_1f0d - 1) {
                                                var_1fad = var_1c55;
                                            }
                                            else {
                                                ++var_1fad;
                                            }
                                            while (!var_1ffd[var_1fad]) {
                                                if (var_1fad == var_1c55 - 1) {
                                                    var_1fad = 0;
                                                }
                                                else if (var_1fad == var_1f0d - 1) {
                                                    var_1fad = var_1c55;
                                                }
                                                else {
                                                    ++var_1fad;
                                                }
                                            }
                                            var_1f45 = true;
                                        }
                                        var_2015 = var_1fad;
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
                                    CurrentState = 6;
                                    break Label_2560;
                                }
                                case 28: {
                                Label_2175:
                                    while (true) {
                                        var_1fad = 0;
                                        while (!var_1ffd[var_1fad]) {
                                            if (var_1fad == var_1c55 - 1) {
                                                continue Label_2175;
                                            }
                                            ++var_1fad;
                                        }
                                        break;
                                    }
                                    var_2015 = var_1fad;
                                    break Label_2560;
                                }
                                case 29: {
                                Label_2220:
                                    while (true) {
                                        var_1fad = var_1c55;
                                        while (!var_1ffd[var_1fad]) {
                                            if (var_1fad == var_1f0d - 1) {
                                                continue Label_2220;
                                            }
                                            ++var_1fad;
                                        }
                                        break Label_2258;
                                    }
                                }
                            }
                        }
                        var_2015 = var_1fad;
                    }
                    break;
                }
                case 6: {
                    String s;
                    if (var_1f55) {
                        s = var_1fed[var_1c65];
                    }
                    else {
                        s = var_1fed[var_1fad];
                    }
                    if (s != null && s.length() > 0) {
                        if (var_1ee5) {
                            final int index;
                            if ((index = s.indexOf(var_1ebd)) == -1) {
                                s = s + var_1ebd + var_1f05[0];
                            }
                            else {
                                s = s.substring(0, index) + var_1ebd + var_1f05[0] + s.substring(index + var_1ebd.length() + 2);
                            }
                        }
                        var_1f8d = s;
                        break;
                    }
                    break;
                }
                case 2: {
                    sub_3a10(false);
                    var_1fa5 = var_1fad;
                    int var_1fbd;
                    final int n12 = (var_1ff5[var_1fa5] == 4) ? (var_1fbd = var_1ff5[var_1fa5]) : ((var_1ff5[var_1fa5] == 6) ? (var_1fbd = 6) : ((var_1ff5[var_1fa5] == 7) ? (var_1fbd = 7) : ((var_1ff5[var_1fa5] == 8) ? (var_1fbd = 8) : (var_1fbd = -1))));
                    CurrentLoadingStep = var_1fbd;
                    sub_36b3(n12);
                    CurrentState = 1;
                }
                case 3: {
                    switch (var_1fa5) {
                        case 26: {
                            CurrentState = 1;
                            break;
                        }
                        case 25:
                        case 30: {
                            var_1f8d = null;
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    sub_3a10(true);
                    var_1f85 = false;
                    return true;
                }
            }
        }
        return false;
    }
    
    private static int sub_48a7(final int n, final int n2) {
        return var_1fcd[n].sub_312c(n2);
    }
    
    private static int sub_48cb(final int n, final int n2) {
        return var_1fcd[n].sub_3189(n2);
    }
    
    public static void sub_48ef(int n, int n2) {
        int sub_4b75 = sub_4b75(n, n2);
        final int var_2065 = s_screenWidth;
        final int var_205d = s_screenHeight;
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
        if (Math.abs(var_20ad - n) > var_2065 * 10 / 100 && n2 < var_205d - n4 && n2 > sub_48cb && (var_20ad >= sub_48a7 || var_20b5 <= var_1f4d[var_1d9d][1] || var_20b5 >= var_1f4d[var_1d9d][1] + sub_48cb2) && (var_20ad <= var_2065 - sub_48a7 || var_20b5 <= var_1f4d[var_1da5][1] || var_20b5 >= var_1f4d[var_1da5][1] + sub_48cb2) && var_20b5 >= sub_48cb && var_20b5 <= var_205d - n4) {
            if (var_20ad - n < 0) {
                sub_4b75 = 23;
                var_2095 = true;
            }
            else {
                sub_4b75 = 24;
                var_2095 = true;
            }
        }
        if (sub_4b75 != 0) {
            var_1fa5 = sub_4b75;
            var_2085 = true;
            if (var_209d && var_1fed[var_1c65] != null) {
                var_1f55 = true;
            }
        }
        var_207d = 0;
        var_208d = false;
        var_209d = false;
        var_20a5 = false;
        var_20ad = -1;
        var_20b5 = -1;
    }
    
    public static void sub_4acf(int var_20ad, int var_20b5) {
        final int sub_4b75;
        if ((sub_4b75 = sub_4b75(var_20ad, var_20b5)) != 0) {
            var_207d = sub_4b75;
        }
        final int var_205d = s_screenHeight;
        final int n = var_20ad;
        var_20ad = var_20b5;
        var_20b5 = n;
        var_20b5 = var_205d - var_20b5;
        if (var_20ad == -1 || var_20b5 == -1) {
            var_20ad = IGP.var_20ad;
            var_20b5 = IGP.var_20b5;
        }
    }
    
    public static void sub_4b41(final int n, final int n2) {
        var_1fa5 = 0;
        var_207d = 0;
        var_208d = false;
        var_209d = false;
        var_20a5 = false;
        sub_4acf(n, n2);
    }
    
    private static int sub_4b75(int n, int n2) {
        final int var_2065 = s_screenWidth;
        final int var_205d = s_screenHeight;
        final int n3 = n;
        n = n2;
        n2 = n3;
        n2 = var_205d - n2;
        if (n < 0 || n2 < 0) {
            return 0;
        }
        if (CurrentState == 0 || !var_1f85) {
            return 0;
        }
        if (n2 > var_1f4d[var_1d65][1] && n2 < var_1f4d[var_1d65][1] + sub_48cb(0, 15)) {
            if (n < var_2065 >> 1) {
                if (var_1fad > var_1f2d.length - 1) {
                    return 28;
                }
            }
            else if (var_1fad < var_1f2d.length) {
                return 29;
            }
        }
        final int n4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
        if (n > var_1f4d[var_1d9d][0] + n4 && n < var_1f4d[var_1d9d][0] + sub_48a7(0, 6) + n4 && n2 > var_1f4d[var_1d9d][1] && n2 < var_1f4d[var_1d9d][1] + sub_48cb(0, 6)) {
            return 23;
        }
        if (n > var_1f4d[var_1da5][0] - n4 && n < var_1f4d[var_1da5][0] + sub_48a7(0, 4) - n4 && n2 > var_1f4d[var_1da5][1] && n2 < var_1f4d[var_1da5][1] + sub_48cb(0, 4)) {
            return 24;
        }
        int n5 = sub_48a7(0, 10);
        int n6 = sub_48cb(0, 10);
        if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
            n5 = sub_48a7(0, 35);
            n6 = sub_48cb(0, 35);
        }
        if (var_1ff5[var_1fad] == 6 || var_1ff5[var_1fad] == 7 || var_1ff5[var_1fad] == 8) {
            if (n > var_1f4d[var_1ddd][0] && n < var_1f4d[var_1ddd][0] + n5 && n2 > var_1f4d[var_1ddd][1] && n2 < var_1f4d[var_1ddd][1] + n6) {
                var_208d = true;
                return 25;
            }
        }
        else {
            if (n > var_1f4d[var_1dd5][0] && n < var_1f4d[var_1dd5][0] + n5 && n2 > var_1f4d[var_1dd5][1] && n2 < var_1f4d[var_1dd5][1] + n6) {
                var_209d = true;
                return 25;
            }
            if (n > var_1f4d[var_1dcd][0] && n < var_1f4d[var_1dcd][0] + n5 && n2 > var_1f4d[var_1dcd][1] && n2 < var_1f4d[var_1dcd][1] + n6) {
                var_208d = true;
                return 25;
            }
        }
        if (n > var_1f4d[var_1dad][0] - 10 && n < var_1f4d[var_1dad][0] + sub_48a7(0, 0) + 10 && n2 > var_1f4d[var_1dad][1] - 10 && n2 < var_1f4d[var_1dad][1] + sub_48cb(0, 0) + 10) {
            var_20a5 = true;
            return 26;
        }
        final int sub_48a7 = sub_48a7(var_1d15, 0);
        final int sub_48cb = sub_48cb(var_1d15, 0);
        if (n > var_1f4d[var_1d8d][0] && n < var_1f4d[var_1d8d][0] + sub_48a7 && n2 > var_1f4d[var_1d8d][1] && n2 < var_1f4d[var_1d8d][1] + sub_48cb) {
            return 25;
        }
        return 0;
    }
    
    private static void sub_4f48() {
        var_1fa5 = 0;
        var_207d = 0;
        var_2085 = true;
        var_208d = false;
        var_209d = false;
        var_20a5 = false;
        var_1f35 = 0;
        var_1f3d = false;
        var_1f45 = false;
        var_20ad = -1;
        var_20b5 = -1;
    }
    
    public static void paint(Graphics g) {
        if (var_2055) {
            return;
        }
        if (!s_isAvailable) {
            return;
        }
        sub_669f(g, 0, 0, s_screenHeight, s_screenWidth);
        switch (CurrentState) {
            case /* STATE_LOADING */ 0: { 
                g.setColor(0);
                GLLib.FillRect(g, 0, 0, s_screenWidth, s_screenHeight, true);
                final int n = s_screenWidth * 3 / 4;
                int n2 = CurrentLoadingStep;
                final int n3 = n;
                final int n4 = var_206d;
                if (CurrentLoadingStep > var_1fc5) {
                	CurrentLoadingStep = var_1fc5;
                }
                final int n5 = (s_screenWidth - n3) / 2;
                final int n6 = (n3 - 2 - 2) * n2 / var_1fc5 + 1;
                sub_669f(g, 0, 0, s_screenHeight, s_screenWidth);
                g.setColor(16777215);
                GLLib.FillRect(g, n5, n4, n3, 6, true);
                g.setColor(0);
                final int n7 = n5 + 1 + 1;
                final int n8 = n4 + 1 + 1;
                final int n9 = n3 - 2 - 1;
                final int n10 = n8;
                GLLib.FillRect(g, n7, n10, n9, 3, true);
                g.setColor(16711680);
                GLLib.FillRect(g, n5 + 1 + 1, n10, n6, 3, true);
                if (StringLoading != null && !StringLoading.trim().equals("")) {
                    Image image = Image.createImage(s_screenWidth, 30);
                    final Graphics graphics5 = image.getGraphics();
                    graphics5.setColor(0);
                    GLLib.FillRect(graphics5, 0, 0, 30, s_screenWidth, true);
                    graphics5.setColor(16777215);
                    // REST IN PEACE YOU POOR SOUL
                    //if (graphics5 == null) {
                    //    GLLib.g = GLLib.s_lastPaintGraphics;
                    //}
                    //else {
                    GLLib.g = graphics5;
                    //}
                    GLLib.g.setFont(s_igpFont);
                    GLLib.DrawString(StringLoading, var_2075, 25, 33);
                    GLLib.g = g;
                    g.drawRegion(image, 0, 0, s_screenHeight, 30, 5, var_206d + 5 + 30, 0, 0);
                    return;
                }
                break;
            }
            case /* STATE_PAGE */ 1: {
                sub_5366(g);
                if (System.currentTimeMillis() % 1000L <= 500L && (var_207d != 27 || var_208d)) {
                    break;
                }
                if (var_1fad != var_1c65) {
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
                sub_5366(g);
                final int var_205d = s_screenHeight;
                final int var_2065 = s_screenWidth;
                final int n11 = var_205d * 40 / 100;
                final int n12 = sub_48a7(0, 0) - 5;
                sub_52f7(g, 0, n11 - 1, var_2065, var_205d - (n11 - 1 << 1), -1);
                sub_52f7(g, 0, n11, var_2065, var_205d - (n11 << 1), -220209185);
                g.setColor(16777215);
                GLLib.FillRect(g, 0, var_205d - (n12 + 1), var_2065, n12 + 1, true);
                g.setColor(-220209185);
                GLLib.FillRect(g, 0, var_205d - n12, var_2065, n12, true);
                var_1e3d = 1;
                sub_2361(sub_2306(var_1c8d), g, s_screenHeight, var_2065 >> 1, var_205d >> 1, 3, true);
                sub_6621(g);
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
        final int var_2065 = s_screenWidth;
        final int var_205d = s_screenHeight;
        graphics.setColor(16777215);
        if (var_1c35[0]) {
            graphics.setColor(0);
        }
        graphics.setColor(16777215);
        GLLib.FillRect(graphics, 0, 0, var_2065, var_205d, true);
        final int n = var_1f4d[0][0];
        final int n2 = var_1f4d[0][1];
        final int n3 = var_1f4d[var_1d5d][0];
        final int n4 = var_1f4d[var_1d5d][1];
        final int n5 = var_1f4d[var_1d8d][0];
        final int n6 = var_1f4d[var_1d8d][1];
        final int n7 = var_1f4d[var_1db5][0];
        final int n8 = var_1f4d[var_1db5][1];
        final int n9 = var_1f4d[var_1d85][0];
        final int n10 = var_1f4d[var_1d85][1];
        final int n11 = var_1f4d[var_1dbd][0];
        final int n12 = var_1f4d[var_1dbd][1];
        final int n13 = var_1f4d[var_1dc5][0];
        final int n14 = var_1f4d[var_1dc5][1];
        final int n15 = var_1f4d[var_1dfd][0];
        final int n16 = var_1f4d[var_1dfd][1];
        final int n17 = var_1f4d[var_1e05][1];
        sub_6676(graphics, 0, 9, n9, n10);
        var_1e3d = 1;
        var_1e45 = 0;
        if (var_1ff5[var_1fad] == 6) {
            if (!var_2025.equals("0")) {
                sub_2338(var_2025, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(var_2015), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, var_1d1d + (var_1fad - var_1c55), 0, n5, n6);
            int n18 = 8;
            if (var_2065 == 360 && var_205d == 480) {
                n18 = 39;
            }
            sub_6676(graphics, 0, n18, n7, n8);
            if (var_1ef5 == null || !var_1ef5.equals("TMUS")) {
                var_1e45 = 1;
                int n19 = sub_48a7(0, 10);
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n19 = sub_48a7(0, 35);
                }
                int n20 = var_2065 - var_1c2d - n19 >> 1;
                if (var_205d > var_2065) {
                    n20 = var_2065;
                }
                sub_2361(sub_2306(var_1cd5), graphics, n20, n15, n16, 3, true);
            }
        }
        else if (var_1ff5[var_1fad] == 7) {
            if (!var_202d.equals("0")) {
                sub_2338(var_202d, graphics, var_2065, n, n2, 3);
            }
            sub_2338(sub_2306(var_1ca5), graphics, var_2065, n3, n4, 3);
            sub_6676(graphics, var_1d25, 0, n5, n6);
        }
        else if (var_1ff5[var_1fad] == 8) {
            sub_2338(sub_2306(var_1cad), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(var_1c95), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, var_1d2d, 0, n5, n6);
        }
        else {
            var_1e3d = 1;
            sub_2338(sub_2306(var_1c9d), graphics, var_2065, n, n2, 3);
            sub_2338(sub_2306(var_2015), graphics, var_2065 * 3 / 4, n3, n4, 3);
            sub_6676(graphics, var_1d15 + var_1fad, 0, n5, n6);
        }
        int n21 = 0;
        if (var_1fad >= var_1c55) {
            n21 = 1;
        }
        boolean b = false;
        if (var_1fe5[n21] > 1) {
            b = true;
        }
        if (b) {
            sub_6676(graphics, 0, 2, n11, n12);
            sub_6676(graphics, 0, 3, n13, n14);
        }
        final int n22 = var_1f4d[var_1d65][0];
        final int n23 = var_1f4d[var_1d65][1];
        final int n24 = var_1f4d[var_1d6d][0];
        final int n25 = var_1f4d[var_1d6d][1];
        final int n26 = var_1f4d[var_1dd5][0];
        final int n27 = var_1f4d[var_1dd5][1];
        final int n28 = var_1f4d[var_1dcd][0];
        final int n29 = var_1f4d[var_1dcd][1];
        final int n30 = var_1f4d[var_1ddd][0];
        final int n31 = var_1f4d[var_1ddd][1];
        final int n32 = var_1f4d[var_1d75][0];
        final int n33 = var_1f4d[var_1d75][1];
        final int n34 = var_1f4d[var_1d7d][0];
        final int n35 = var_1f4d[var_1d7d][1];
        final int n36 = var_1f4d[var_1de5][0];
        final int n37 = var_1f4d[var_1de5][1];
        final int n38 = var_1f4d[var_1ded][0];
        final int n39 = var_1f4d[var_1ded][1];
        final int n40 = var_1f4d[var_1df5][0];
        final int n41 = var_1f4d[var_1df5][1];
        if (var_1ff5[var_1fad] == 6 || var_1ff5[var_1fad] == 7 || var_1ff5[var_1fad] == 8) {
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
            if (var_208d) {
                n46 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n46 = 36;
                }
            }
            sub_6676(graphics, 0, n46, n30, n31);
            var_1e3d = 0;
            if (var_208d) {
                var_1e3d = 1;
            }
            final short[] sub_4ac6;
            var_1e55 = (sub_4ac6 = var_1fd5.WraptextB(sub_2306(var_1ccd), n42 - sub_48a7 - 4, false))[2];
            if (sub_4ac6[0] > 1) {
                var_1e55 = n42 - sub_48a7 - 8;
            }
            final int n48;
            final int n47 = ((n48 = n42 - (var_1e55 + sub_48a7 + 4)) < 0) ? 0 : (n48 >> 1);
            sub_6676(graphics, 0, 19, n40 - (n42 >> 1) + n47, n31 + (n43 >> 1) - (sub_48cb(0, 19) >> 1));
            if (sub_4ac6[0] > 1) {
                int n49 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n49 = 4;
                }
                sub_2361(sub_2306(var_1ccd), graphics, n42 - sub_48a7 + n49, n40 + (sub_48a7 >> 1), n41 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(var_1ccd), graphics, var_2065, n40 - (n42 >> 1) + n47 + sub_48a7 + 2, n41 - 2, 6);
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
            if (var_208d) {
                n52 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n52 = 36;
                }
            }
            if (var_209d) {
                n53 = 11;
                if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                    n53 = 36;
                }
            }
            sub_6676(graphics, 0, n53, n26, n27);
            sub_6676(graphics, 0, n52, n28, n29);
            var_1e3d = 0;
            if (var_209d) {
                var_1e3d = 1;
            }
            sub_2338(sub_2306(var_1cc5), graphics, var_2065, n36, n37 - 2, 3);
            final int sub_48a8 = sub_48a7(0, 19);
            int n54 = sub_48a7(0, 10);
            int n55 = sub_48cb(0, 10);
            if ((var_2065 == 240 && (var_205d == 320 || var_205d == 400)) || (var_2065 == 360 && (var_205d == 640 || var_205d == 480))) {
                n54 = sub_48a7(0, 35);
                n55 = sub_48cb(0, 35);
            }
            final short[] sub_4ac7;
            var_1e55 = (sub_4ac7 = var_1fd5.WraptextB(sub_2306(var_1ccd), n54 - sub_48a8 - 4, false))[2];
            if (sub_4ac7[0] > 1) {
                var_1e55 = n54 - sub_48a8 - 8;
            }
            final int n57;
            final int n56 = ((n57 = n54 - (var_1e55 + sub_48a8 + 4)) < 0) ? 0 : (n57 >> 1);
            sub_6676(graphics, 0, 19, n38 - (n54 >> 1) + n56, n29 + (n55 >> 1) - (sub_48cb(0, 19) >> 1));
            var_1e3d = 0;
            if (var_208d) {
                var_1e3d = 1;
            }
            if (sub_4ac7[0] > 1) {
                int n58 = -4;
                if (var_2065 == 320 || var_205d == 320) {
                    n58 = 4;
                }
                sub_2361(sub_2306(var_1ccd), graphics, n54 - sub_48a8 + n58, n38 + (sub_48a8 >> 1), n39 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(var_1ccd), graphics, var_2065, n38 - (n54 >> 1) + n56 + sub_48a8 + 2, n39 - 2, 6);
            }
            var_1e3d = 0;
        }
        var_1e3d = 0;
        sub_2338(sub_2306(var_1cb5), graphics, var_2065, n32, n33, 3);
        sub_2338(sub_2306(var_1cbd), graphics, var_2065, n34, n35, 3);
        var_1e55 = var_1fd5.WraptextB(sub_2306(var_1cbd), var_2065, false)[2];
        sub_6676(graphics, 0, 29, n34 + (var_1e55 >> 1) + 3, n17);
        if (b) {
            final int abs = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
            int n59 = 6;
            int n60 = 4;
            final int n61 = abs + 1;
            final int n62 = var_1f4d[var_1d9d][0];
            final int n63 = var_1f4d[var_1d9d][1];
            final int n64 = var_1f4d[var_1da5][0];
            final int n65 = var_1f4d[var_1da5][1];
            if (var_1f3d || var_207d == 23) {
                if (!var_2095) {
                    n59 = 7;
                }
                ++var_1f35;
            }
            if (var_1f45 || var_207d == 24) {
                if (!var_2095) {
                    n60 = 5;
                }
                ++var_1f35;
            }
            sub_6676(graphics, 0, n59, n62 + n61, n63);
            sub_6676(graphics, 0, n60, n64 - n61, n65);
            if (var_1f35 > 4) {
                var_1f3d = false;
                var_1f45 = false;
                var_1f35 = 0;
                var_2095 = false;
            }
        }
        sub_6621(graphics);
    }
    
    private static void sub_6621(final Graphics graphics) {
        final int n = var_1f4d[var_1dad][0];
        final int n2 = var_1f4d[var_1dad][1];
        int n3 = 0;
        if (var_20a5) {
            n3 = 1;
        }
        sub_6676(graphics, 0, n3, n, n2);
    }
    
    private static void sub_6676(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        var_1fcd[n].sub_71ae(graphics, n2, n3, n4, 0);
    }
    
    private static void sub_669f(final Graphics graphics, int max, int max2, int min, int min2) {
        max = Math.max(0, 0);
        max2 = Math.max(0, 0);
        min = Math.min(min, s_screenHeight);
        min2 = Math.min(min2, s_screenWidth);
        GLLib.SetClip(graphics, max, max2, min2, min, true);
    }
    
    public final void run() {
        new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());
        while (var_1f85) {
            try {
                if (var_1f8d != null) {
                	var_1c15 = var_1f8d;
                    if (var_1c15 != null && var_1c15.length() > 0) {
                        var_1f55 = false;
                        final String urlPlatformRequest = var_1c15;
                        var_1c15 = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(urlPlatformRequest);
                        try {
                            MidletInstance.platformRequest(urlPlatformRequest);
                            Thread.sleep(200L);
                        }
                        catch (final Exception ex) {}
                        CurrentState = 1;
                    }
                    var_1f8d = null;
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
        (class_e = new ASprite()).Load(GLLib.Pack_ReadData(n), 0);
        for (n = 0; n2 >> n != 0; ++n) {
            if ((n2 >> n & 0x1) != 0x0) {
                class_e.BuildCacheImages(n, 0, -1, -1);
            }
        }
        if (b2) {
            class_e.FreeCacheData();
        }
        return class_e;
    }
    
    static {
        s_igpClassVersion = "2.3";
        s_fullIgpSignature = "IGP-Signature=" + s_igpClassVersion;
        s_dataIGPVersion = "";
        URL_PREFIX = "URL";
        var_1c2d = 2;
        var_1c35 = new boolean[1];
        var_1c3d = new int[1];
        var_1c45 = -1;
        var_1c4d = 8;
        ZVIP_PREFIX = "ZVIP";
        SCFR_PREFIX = "SCFR";
        GMCL_PREFIX = "GMCL";
        CCTL_PREFIX = "CCTL";
        s_TITLE_FREEMIUM = "TITLE-FREEMIUM";
        s_TITLE_GLCLUB = "TITLE-GLCLUB";
        s_URL_OPERATOR = "URL-OPERATOR";
        var_1d15 = 1;
        var_1d1d = 4;
        var_1d25 = 8;
        var_1d2d = 9;
        var_1d35 = 10;
        var_1d3d = 11;
        var_1d45 = 12;
        var_1d4d = 13;
        var_1d55 = 14;
        var_1d5d = 1;
        var_1d65 = 2;
        var_1d6d = 3;
        var_1d75 = 4;
        var_1d7d = 5;
        var_1d85 = 6;
        var_1d8d = 7;
        var_1d95 = 8;
        var_1d9d = 9;
        var_1da5 = 10;
        var_1dad = 11;
        var_1db5 = 12;
        var_1dbd = 13;
        var_1dc5 = 14;
        var_1dcd = 15;
        var_1dd5 = 16;
        var_1ddd = 17;
        var_1de5 = 18;
        var_1ded = 19;
        var_1df5 = 20;
        var_1dfd = 21;
        var_1e05 = 22;
        var_1e0d = 24;
        var_1e15 = 25;
        s_IGP_CATEGORIES = "IGP-CATEGORIES";
        s_IGP_PROMOS = "IGP-PROMOS";
        s_IGP_FREEMIUM = "IGP-FREEMIUM";
        k_URL_TEMPLATE_GAME = "URL-TEMPLATE-GAME";
        s_moreGamesUrlProp = "more_games_url";
        s_moreGamesStatProp = "more_games_status";
        s_moreGamesAppProp = null;
        moreGamesStatAppProp = null;
        var_1e9d = "on";
        s_PLACEHOLDER = "XXXX";
        s_ctg_PLACEHOLDER = "&ctg=" + s_PLACEHOLDER;
        var_1eb5 = "&ctg=";
        var_1ebd = "&lg=";
        var_1ec5 = "SC";
        s_igaUrlRedir = "ingameads.gameloft.com/redir";
        s_GAME_SEPARATOR = ";";
        var_1efd = false;
        var_1f05 = new String[0];
        var_1f55 = false;
        //var_1f6d = false;
        //s_cmdListener = null;
        var_1f7d = null;
        var_1f85 = false;
        var_1f8d = null;
        s_isAvailable = false;
        var_1fe5 = new int[2];
        var_2005 = 0;
        //var_200d = 0;
        var_203d = "";
        var_2055 = false;
        var_207d = 0;
        var_2085 = false;
        var_208d = false;
        var_2095 = false;
        var_209d = false;
        var_20a5 = false;
        var_20ad = -1;
        var_20b5 = -1;
        new Hashtable();
    }
}
