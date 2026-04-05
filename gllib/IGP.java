

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
    private static String s_platformRequestUrl;
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
    private static int _lib_nChunks;
    private static int[] _lib_pOffset;
    private static int var_1e35;
    private static int palette;
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
    private static String s_moreGamesStatAppProp;
    private static String s_on;
    private static String s_PLACEHOLDER;
    private static String s_ctg_PLACEHOLDER;
    private static String s_ctg;
    private static String s_lg;
    private static String s_SC;
    private static String s_igaUrlRedir;
    private static String s_GAME_SEPARATOR;
    private static String var_1edd;
    private static boolean var_1ee5;
    private static boolean b_useIGPRedir;
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
	private static Canvas s_game;
	private static boolean var_1f6d;
	private static CommandListener s_cmdListener;
    private static IGP s_igpThreadInst;
    private static boolean var_1f85;
    private static String var_1f8d;
    private static boolean IsAvailable;
    private static int CurrentState;
    private static int var_1fa5;
    private static int var_1fad;
    private static int OldState;
    private static int CurrentLoadingStep;
    private static int TotalLoadingSteps;
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
    private static String StringLoading;
    private static String var_203d;
    private static String var_2045;
    private static String var_204d;
    private static boolean var_2055;
    private static int s_screenHeight;
    private static int s_screenWidth;
    private static int var_206d;
    private static int realWidth;
    private static int var_207d;
    private static boolean var_2085;
    private static boolean var_208d;
    private static boolean var_2095;
    private static boolean var_209d;
    private static boolean var_20a5;
    private static int var_20ad;
    private static int var_20b5;
    
    private static boolean Lib_Open() {
        Lib_Close();
        try {
            final InputStream is = getResourceAsStream("/dataIGP");
            
            // Number of chunks...
         	_lib_nChunks  = (is.read() & 0xFF);
         	_lib_nChunks += (is.read() & 0xFF) << 8;
         	
			// Offset of each chunk...
			_lib_pOffset = new int[_lib_nChunks];
			for (int i = 0; i < _lib_nChunks; i++)
			{
				_lib_pOffset[i]  = (is.read() & 0xFF);
				_lib_pOffset[i] += (is.read() & 0xFF) << 8;
				_lib_pOffset[i] += (is.read() & 0xFF) << 16;
				_lib_pOffset[i] += (is.read() & 0xFF) << 24;
			}
            is.close();
        }
        catch (final Exception ex) {
            return false;
        }
        return true;
    }
    
    private static void Lib_Close() {
        _lib_pOffset = null;
        _lib_nChunks = 0;
        System.gc();
    }
    
    private static byte[] Lib_GetData(int index) {
    	if (index < 0 || index >= _lib_nChunks-1)
			return null;

		int chunk_size = _lib_pOffset[index+1] - _lib_pOffset[index];
		if (chunk_size == 0)
			return null;
		
        byte[] data = null;
        try {
        	data = new byte[_lib_pOffset[index + 1]];
            InputStream is = getResourceAsStream("/dataIGP");
            is.skip(2 + 4 * _lib_nChunks + _lib_pOffset[index]);
            for (index = data.length; index > 0; index -= is.read(data)) {}
            is.close();
        }
        catch (final Exception ex) {}
        return data;
    }
    
    static int dataOffset;

	static int readInt( byte[] data )
	{
		return ( data[dataOffset++]&0xFF ) + ( (data[dataOffset++]&0xFF) << 8 );
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
    
    private static void sub_2389(final String s, Graphics g, final int n, final int x, final int y, final int anchor, final int n5, final boolean b) {
        if (b) {
            if (var_1e45 == 0) {
                var_1fd5.SetCurrentPalette(palette);
                var_1fd5.DrawPageB(g, s, var_1fd5.WraptextB(s, n, false), x, y, 0, 10, anchor, -1, false);
                return;
            }
            var_1fdd.SetCurrentPalette(palette);
            var_1fdd.DrawPageB(g, s, var_1fdd.WraptextB(s, n, false), x, y, 0, 10, anchor, -1, false);
        }
        else {
            if (var_1e45 == 0) {
                var_1fd5.SetCurrentPalette(palette);
                var_1fd5.DrawString(g, s, x, y, anchor);
                return;
            }
            var_1fdd.SetCurrentPalette(palette);
            var_1fdd.DrawString(g, s, x, y, anchor);
        }
    }
    
    public static void initialize(MIDlet midlet, Canvas game, int screenWidth, final int screenHeight) {
        if (Define.DECOMP_MODE) System.out.println("initialize(midlet = " + midlet + ", game = " + game + ", screenWidth = " + screenWidth + ", screenHeight = " + screenHeight + ", cmdListener = " + (Object)null + ")");
        s_screenHeight = screenHeight;
        s_screenWidth = screenWidth;
        var_206d = s_screenHeight >> 1;
        realWidth = s_screenWidth >> 1;
        if (/*2 >*/ s_screenHeight > 2) {
            var_1c2d = 2;
        }
        if (MidletInstance == null && game != null) {
            MidletInstance = midlet;
            s_game = game;
            sub_2bc9();
            if (Define.DECOMP_MODE) System.out.println(s_fullIgpSignature + "");
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
            s_SC = null;
            s_ctg = null;
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
    
    private static void parseSplash(final int page, final String code, final int check, String jadEntry, final String urlTemplate, final int n3) {
        try {
            String s3 = "";
            String url;
            if (b_useIGPRedir) {
                url = getRedirLink(MidletInstance.getAppProperty(jadEntry), code, urlTemplate);
                if (code.equals(SCFR_PREFIX)) {
                    jadEntry = s_IGP_FREEMIUM;
                    s3 = getRedirLink(MidletInstance.getAppProperty(jadEntry), var_1f25[page - var_1f2d.length], urlTemplate);
                }
            }
            else if (code.equals(CCTL_PREFIX)) {
                url = var_203d;
            }
            else {
                jadEntry = URL_PREFIX + "-" + code;
                url = MidletInstance.getAppProperty(jadEntry);
            }
            if (code.equals(SCFR_PREFIX)) {
                if (b_useIGPRedir) {
                    final int index;
                    if ((index = url.indexOf(SCFR_PREFIX)) >= 0) {
                        url = url.substring(0, index) + var_1f25[page - var_1f2d.length] + url.substring(index + var_1f25[page - var_1f2d.length].length());
                    }
                }
                else {
                    jadEntry = URL_PREFIX + "-" + SCFR_PREFIX + "-" + var_1f25[page - var_1f2d.length];
                    url = MidletInstance.getAppProperty(jadEntry);
                    jadEntry = URL_PREFIX + "-" + SCFR_PREFIX + "-" + var_1f25[page - var_1f2d.length];
                    s3 = MidletInstance.getAppProperty(jadEntry);
                }
            }
            final boolean sub_258f = checkURL(url, 7);
            boolean sub_258f2 = true;
            if (code.equals(SCFR_PREFIX)) {
                sub_258f2 = checkURL(s3, 7);
            }
            if (sub_258f && sub_258f2 && (url.toUpperCase().compareTo("NO") != 0 || url.toUpperCase().compareTo("0") != 0)) {
                var_1ffd[page] = true;
                var_1fed[page] = url;
                if (var_1ffd[page]) {
                    switch (var_1ff5[page] = n3) {
                        case 4: {
                            ++var_2005;
                            if (var_1ee5) {
                                final StringBuffer sb = new StringBuffer();
                                var_1fed[page] = sb.append(var_1fed[page]).append(s_ctg).append(s_SC).append((var_2005 < 10) ? "0" : "").append(var_2005).toString();
                                return;
                            }
                            break;
                        }
                        case 6: {
                            ++var_200d;
                            if (var_1ee5) {
                                final StringBuffer sb2 = new StringBuffer();
                                final String[] var_1fed2 = var_1fed;
                                var_1fed2[page] = sb2.append(var_1fed2[page] + s_ctg + SCFR_PREFIX).toString();
                                return;
                            }
                            break;
                        }
                        case 7: {
                            if (var_1ee5) {
                                final StringBuffer sb3 = new StringBuffer();
                                final String[] var_1fed3 = var_1fed;
                                var_1fed3[page] = sb3.append(var_1fed3[page] + s_ctg + GMCL_PREFIX).toString();
                                return;
                            }
                            break;
                        }
                        case 8: {
                            if (var_1ee5) {
                                final StringBuffer sb4 = new StringBuffer();
                                final String[] var_1fed4 = var_1fed;
                                var_1fed4[page] = sb4.append(var_1fed4[page] + s_ctg + CCTL_PREFIX).toString();
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
        final String[] array = new String[readInt(bytes)];
        for (int i = 0; i < array.length; ++i) {
            final int sub_22c9 = readInt(bytes);
            array[i] = new String(bytes, dataOffset, sub_22c9);
            dataOffset += sub_22c9;
        }
        return array;
    }
    
    private static void sub_2bc9() {
        try {
            if (!Lib_Open()) {
                IsAvailable = false;
                return;
            }
            final byte[] data = Lib_GetData(0);
            readInt(data);
            dataOffset += readInt(data);
            final int size = readInt(data);
            var_1ef5 = new String(data, dataOffset, size);
            dataOffset += size;
            dataOffset += readInt(data);
            dataOffset += readInt(data);
            dataOffset += readInt(data);
            var_1efd = (readInt(data) == 1);
            readInt(data);
            readInt(data);
            var_1f05 = sub_2b59(data);
            var_1f2d = sub_2b59(data);
            var_1f25 = sub_2b59(data);
            sub_2b59(data);
            for (int i = 0; i < var_1c35.length; ++i) {
                var_1c35[i] = (readInt(data) == 1);
            }
            try {
                s_dataIGPVersion = new String(data, dataOffset, readInt(data));
                if (Define.DECOMP_MODE) System.out.println("IGP dataIGP version: " + s_dataIGPVersion);
                if (Define.DECOMP_MODE) System.out.println(s_igpClassVersion + "z");
                if (!s_dataIGPVersion.startsWith(s_igpClassVersion)) {
                    if (Define.DECOMP_MODE) System.out.println("Invalid dataIGP file, dataIGP file IGP Version : " + s_dataIGPVersion);
                    if (Define.DECOMP_MODE) System.out.println("IGP Class version : " + s_igpClassVersion);
                }
            }
            catch (final Exception ex) {
                IsAvailable = false;
            }
            Lib_Close();
        }
        catch (final Exception ex2) {
            IsAvailable = false;
            return;
        }
        final String[] array = var_1f2d;
        int n = ((var_1f2d.length - 1 > 0) ? (array.length - 1) : 0) + ((var_1f25.length - 1 > 0) ? (var_1f25.length - 1) : 0);
var_1c8d = (var_1cd5 = (var_1ccd = (var_1cc5 = (var_1cbd = (var_1cb5 = (var_1cad = (var_1ca5 = (var_1c9d = (var_1c85 = (var_1c7d = (var_1c75 = (var_1c6d = (var_1c95 = ++n + 1) + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1) + 1) + 1;
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
        s_moreGamesStatAppProp = MidletInstance.getAppProperty(s_moreGamesStatProp);
        
        // But s_on is already lower-case (in this case)... why call toLowerCase() then?
        if (s_moreGamesAppProp != null && s_moreGamesStatAppProp.toLowerCase().equals(s_on.toLowerCase())) {
            var_204d = s_moreGamesAppProp;
            var_2055 = true;
            IsAvailable = true;
            return;
        }
        try {
            if ((var_1edd = MidletInstance.getAppProperty(k_URL_TEMPLATE_GAME)) != null) {
                var_1edd = var_1edd.trim();
                b_useIGPRedir = true;
                if (var_1edd.indexOf(s_igaUrlRedir) != -1) {
                    var_1ee5 = true;
                }
            }
        }
        catch (final Exception ex3) {}
        for (int l = 0; l < var_1f2d.length; ++l) {
            parseSplash(l, var_1f2d[l], 7, s_IGP_PROMOS, var_1edd, 4);
        }
        for (int n2 = 0; n2 < var_1f25.length; ++n2) {
            parseSplash(var_1c55 + n2, SCFR_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 6);
        }
        try {
            final String trim;
            if (checkURL(trim = MidletInstance.getAppProperty(s_URL_OPERATOR).trim(), 7)) {
                var_203d = trim;
            }
        }
        catch (final Exception ex4) {}
        parseSplash(var_1c5d, GMCL_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 7);
        parseSplash(var_1c65, CCTL_PREFIX, 7, s_IGP_CATEGORIES, var_1edd, 8);
        var_2025 = sub_3135(MidletInstance.getAppProperty(s_TITLE_FREEMIUM));
        var_202d = sub_3135(MidletInstance.getAppProperty(s_TITLE_GLCLUB));
        var_1fe5 = sub_357f();
        if (sub_3607() > 0) {
            IsAvailable = true;
        }
        if (Define.DECOMP_MODE) System.out.println("isAvailable = " + IsAvailable);
    }
    
    private static String sub_3135(String s) {
        if (s == null) {
            return "0";
        }
        String newString = "";
        s = s.toUpperCase();
        boolean widthAboveHeight = false;
        
        if (s_screenWidth >= s_screenHeight && s_screenWidth == 320) {
            widthAboveHeight = true;
        }
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            final char c = chars[i];
            if (!widthAboveHeight || c != '\n') {
                newString += c;
            }
        }
        return newString;
    }
    
    public static boolean IsAvailable() {
        return IsAvailable;
    }
    
    public static void enterIGP(String loadingMsg, final int appLanguage) {
        if (Define.DECOMP_MODE) System.out.println("enterIGP(loadingMsg = " + loadingMsg + ", appLanguage = " + 0 + " (" + var_1f05[0] + ")");
        if (var_2055) {
            initThread();
            var_1f85 = true;
            var_1f8d = var_204d;
        }
        else {
            reset();
            if (0 < var_1f05.length) {
                var_201d = 0;
                StringLoading = loadingMsg;
                CurrentLoadingStep = -1;
                CurrentState = 0;
                OldState = -1;
                var_1fad = 0;
                var_1f85 = true;
                s_igpFont = Font.getFont(0, 0, 8);
                initThread();
            }
            TotalLoadingSteps = 4 + var_1f0d;
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
    
    private static void initThread() {
        if (s_igpThreadInst == null) {
            s_igpThreadInst = new IGP();
        }
        new Thread(s_igpThreadInst).start();
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
            dataOffset = 0;
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
                    Lib_Open();
                    final byte[] data;
                    readInt(data = Lib_GetData(offset));
                    final int sub_22c9;
                    var_1f15 = new String[sub_22c9 = readInt(data)];
                    final byte[] bytes = new byte[sub_22c9];
                    System.arraycopy(data, dataOffset, bytes, 0, sub_22c9);
                    dataOffset += sub_22c9;
                    readInt(data);
                    final int n;
                    var_1f1d = new short[n = ((data[dataOffset++] & 0xFF) | (data[dataOffset++] & 0xFF) << 8)];
                    for (int i = 0; i < n - 1; ++i) {
                        var_1f1d[i] = (short)((data[dataOffset++] & 0xFF) + ((data[dataOffset++] & 0xFF) << 8));
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
                    (var_1fd5 = sub_680f(var_1d35, 3, true, false)).SetCharMap((short[])GLLib.Pack_ReadArray(var_1d45));
                    var_1e35 = var_1fd5._GetLineHeight();
                    (var_1fdd = sub_680f(var_1d3d, 3, true, false)).SetCharMap((short[])GLLib.Pack_ReadArray(var_1d4d));
                    if (s_screenWidth > 160 && s_screenWidth > 220) {
                        if (s_screenWidth <= 320) {
                            var_1fd5.SetLineHeightFake(-1);
                            if (s_screenHeight == 240 || var_1efd) {
                                var_1fd5.SetLineHeightFake(0);
                            }
                        }
                        else if (s_screenWidth <= 480) {
                            var_1fdd.SetLineHeightFake(-1);
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
    
    private static void unloadResources(final boolean complete) {
        for (int i = 0; i < var_1d55; ++i) {
            if (var_1fcd[i] != null && i != var_1d35 && i != var_1d45 && i != var_1d3d && i != var_1d4d && i != 0) {
                var_1fcd[i].unload();
                var_1fcd[i] = null;
            }
        }
        if (complete) {
            Lib_Close();
            GLLib.Pack_FullyClose();
            var_1f1d = null;
            var_1f15 = null;
            StringLoading = null;
            for (int j = 0; j < var_1d55; ++j) {
                if (var_1fcd[j] != null) {
                    var_1fcd[j].unload();
                    var_1fcd[j] = null;
                }
            }
            var_1fcd = null;
            var_1fd5.unload();
            var_1fd5 = null;
            var_1fdd.unload();
            var_1fdd = null;
        }
        System.gc();
    }
    
    public static void exitIGP(final boolean reset) {
        if (reset) {
            if (CurrentState == 0 || CurrentState == 2) {
                OldState = CurrentState;
                CurrentState = 5;
            }
            reset();
            return;
        }
        if (CurrentState == 5) {
            CurrentState = OldState;
            CurrentLoadingStep = -1;
        }
    }
    
    public static boolean update(int action) {
        if (var_2055) {
            return true;
        }
        if (!IsAvailable) {
            return true;
        }
        if (var_2085) {
            var_2085 = false;
        }
        else {
            action = IGP.var_1fa5;
        }
        Label_2560: {
            switch (CurrentState) {
                case 0: {
                    if (CurrentLoadingStep >= TotalLoadingSteps) {
                        CurrentState = 1;
                        var_2015 = var_1fad;
                        action = s_screenWidth;
                        
                        var_1f4d = new int[var_1e15][];
                        for (int i = 0; i < var_1e15; ++i) {
                            (var_1f4d[i] = new int[2])[0] = 0;
                            var_1f4d[i][1] = 0;
                        }
                        final int sub_48a7 = GetFrameWidth(0, 0);
                        final int sub_48cb = GetFrameHeight(0, 0);
                        final int sub_48a8 = GetFrameWidth(var_1d15, 0);
                        final int sub_48cb2 = GetFrameHeight(var_1d15, 0);
                        final int sub_48cb3 = GetFrameHeight(0, 9);
                        int n = GetFrameWidth(0, 10);
                        int n2 = GetFrameHeight(0, 10);
                        if ((action == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (action == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                            n = GetFrameWidth(0, 35);
                            n2 = GetFrameHeight(0, 35);
                        }
                        final int sub_48cb4 = GetFrameHeight(0, 15);
                        final int sub_48cb5 = GetFrameHeight(0, 29);
                        var_1fd5.UpdateStringOrCharsSize(sub_2306(var_1cd5), null);
                        final short[] sub_4ac6 = var_1fd5.WraptextB(sub_2306(var_1cd5), action - sub_48a7, false);
                        var_1e55 = ASprite._text_w;
                        int n3 = var_1e4d = sub_4ac6[0] * var_1e35;
                        if (sub_48cb > var_1e4d) {
                            n3 = sub_48cb;
                        }
                        if (n2 > n3) {
                            n3 = n2;
                        }
                        final int n4 = s_screenHeight - (var_1e35 + sub_48cb3 + sub_48cb2 + n3) - 3 - sub_48cb4 >> 2;
                        int n5 = -3;
                        if (s_screenHeight <= 160) {
                            n5 = 2;
                        }
                        else if (s_screenHeight <= 220) {
                            n5 = 1;
                        }
                        else if (s_screenHeight <= 240) {
                            n5 = 0;
                        }
                        else if (s_screenHeight <= 320) {
                            n5 = 0;
                            if (action == 240) {
                                n5 = 1;
                            }
                        }
                        else if (s_screenHeight <= 360) {
                            n5 = 3;
                        }
                        else if (s_screenHeight <= 400) {
                            n5 = 1;
                        }
                        else if (s_screenHeight <= 480) {
                            n5 = 6;
                            if (action == 360) {
                                n5 = 0;
                            }
                        }
                        else if (s_screenHeight <= 640) {
                            n5 = 0;
                        }
                        else if (s_screenHeight <= 800) {
                            n5 = 3;
                        }
                        int n6 = GetFrameWidth(0, 15);
                        int n7 = GetFrameWidth(0, 17);
                        if ((action == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (action == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                            n6 = GetFrameWidth(0, 31);
                            n7 = GetFrameWidth(0, 33);
                        }
                        var_1f4d[var_1d65][0] = action - n6 >> 2;
                        var_1f4d[var_1d65][1] = 3;
                        var_1f4d[var_1d6d][0] = (action - n7 >> 2) * 3;
                        var_1f4d[var_1d6d][1] = var_1f4d[var_1d65][1];
                        final int sub_33a1 = var_1fcd[0].GetFrameModuleY(15, var_1fcd[0].CountFrameModules(15) - 1);
                        var_1f4d[var_1d75][0] = action >> 2;
                        var_1f4d[var_1d75][1] = var_1f4d[var_1d65][1] + (sub_33a1 >> 1) + n5;
                        var_1f4d[var_1d7d][0] = (action >> 1) + (action >> 2);
                        var_1f4d[var_1d7d][1] = var_1f4d[var_1d75][1];
                        var_1f4d[0][0] = action >> 1;
                        var_1f4d[0][1] = n4 + (var_1e35 >> 1) + n5 - 2;
                        final int[] array = var_1f4d[0];
                        final int n8 = 1;
                        array[n8] += var_1f4d[var_1d65][1] + sub_48cb4;
                        var_1f4d[var_1d85][0] = 0;
                        var_1f4d[var_1d85][1] = var_1f4d[0][1] + n4 + (var_1e35 >> 1) - n5 + 2;
                        var_1f4d[var_1d5d][0] = action >> 1;
                        var_1f4d[var_1d5d][1] = var_1f4d[var_1d85][1] + (sub_48cb3 >> 1) + n5 - 2;
                        final int sub_48a9 = GetFrameWidth(0, 2);
                        final int sub_48cb6 = GetFrameHeight(0, 2);
                        var_1f4d[var_1dbd][0] = 5;
                        var_1f4d[var_1dbd][1] = var_1f4d[var_1d85][1] + (sub_48cb3 >> 1) - (sub_48cb6 >> 1);
                        var_1f4d[var_1dc5][0] = action - 5 - sub_48a9;
                        var_1f4d[var_1dc5][1] = var_1f4d[var_1dbd][1];
                        var_1f4d[var_1dad][0] = action - var_1c2d - sub_48a7;
                        var_1f4d[var_1dad][1] = s_screenHeight - 2 - sub_48cb;
                        var_1f4d[var_1e0d][0] = var_1c2d;
                        var_1f4d[var_1e0d][1] = s_screenHeight - 2 - sub_48cb;
                        final int n9 = var_1f4d[var_1dad][0] - (n << 1);
                        var_1f4d[var_1dd5][0] = n9 / 3;
                        var_1f4d[var_1dd5][1] = s_screenHeight - 2 - n2;
                        var_1f4d[var_1de5][0] = var_1f4d[var_1dd5][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1de5][1] = var_1f4d[var_1dd5][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1dcd][0] = var_1f4d[var_1dd5][0] + n + n9 / 3;
                        var_1f4d[var_1dcd][1] = var_1f4d[var_1dd5][1];
                        var_1f4d[var_1ded][0] = var_1f4d[var_1dcd][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1ded][1] = var_1f4d[var_1dcd][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1ddd][0] = (action >> 1) - (n >> 1);
                        var_1f4d[var_1ddd][1] = var_1f4d[var_1dd5][1];
                        var_1f4d[var_1df5][0] = var_1f4d[var_1ddd][0] + (n >> 1) + n % 2;
                        var_1f4d[var_1df5][1] = var_1f4d[var_1ddd][1] + (n2 >> 1) + n5;
                        var_1f4d[var_1d8d][0] = (action >> 1) - (sub_48a8 >> 1);
                        var_1f4d[var_1d8d][1] = var_1f4d[var_1d85][1] + sub_48cb3 + n4;
                        var_1f4d[var_1dfd][0] = action - sub_48a7 >> 1;
                        var_1f4d[var_1dfd][1] = var_1f4d[var_1d8d][1] + sub_48cb2 + (s_screenHeight - var_1f4d[var_1d8d][1] - sub_48cb2 >> 1);
                        var_1f4d[var_1dfd][0] = action - n >> 2;
                        if (s_screenHeight > action) {
                            var_1f4d[var_1dfd][1] = var_1f4d[var_1d8d][1] + sub_48cb2 + (var_1f4d[var_1ddd][1] - (var_1f4d[var_1d8d][1] + sub_48cb2) >> 1);
                            var_1f4d[var_1dfd][0] = action >> 1;
                        }
                        var_1f4d[var_1d95][0] = action >> 1;
                        var_1f4d[var_1d95][1] = var_1f4d[var_1d8d][1] + (sub_48cb2 << 1) / 3;
                        var_1f4d[var_1d9d][0] = 5;
                        var_1f4d[var_1d9d][1] = var_1f4d[var_1d8d][1] + (sub_48cb2 >> 1) - (GetFrameHeight(0, 6) >> 1);
                        var_1f4d[var_1da5][0] = action - GetFrameWidth(0, 4) - 5;
                        var_1f4d[var_1da5][1] = var_1f4d[var_1d9d][1];
                        int n10 = GetFrameWidth(0, 8);
                        int n11 = GetFrameHeight(0, 8);
                        if (action == 360 && s_screenHeight == 480) {
                            n10 = GetFrameWidth(0, 39);
                            n11 = GetFrameHeight(0, 39);
                        }
                        var_1f4d[var_1db5][0] = var_1f4d[var_1d8d][0] + sub_48a8 - n10;
                        var_1f4d[var_1db5][1] = var_1f4d[var_1d8d][1] + sub_48cb2 - n11;
                        var_1f4d[var_1e05][0] = 0;
                        var_1f4d[var_1e05][1] = var_1f4d[0][1] - (sub_48cb5 >> 1);
                        action = var_1fcd[0].CountFrameModules(15);
                        action = var_1fcd[0].GetFrameModuleY(15, action - 1);
                        var_1f4d[var_1e05][1] = var_1f4d[var_1d65][1] + (action >> 1) - (sub_48cb5 >> 1);
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
                            switch (action) {
                                case 26: {
                                    CurrentState = 4;
                                    break Label_2560;
                                }
                                case 23: {
                                    action = 0;
                                    if (var_1fad >= var_1c55) {
                                        action = 1;
                                    }
                                    if (var_1fe5[action] > 1) {
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
                                    action = 0;
                                    if (var_1fad >= var_1c55) {
                                        action = 1;
                                    }
                                    if (var_1fe5[action] > 1) {
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
                            if ((index = s.indexOf(s_lg)) == -1) {
                                s = s + s_lg + var_1f05[0];
                            }
                            else {
                                s = s.substring(0, index) + s_lg + var_1f05[0] + s.substring(index + s_lg.length() + 2);
                            }
                        }
                        var_1f8d = s;
                        break;
                    }
                    break;
                }
                case 2: {
                    unloadResources(false);
                    action = var_1fad;
                    int var_1fbd;
                    final int n12 = (var_1ff5[action] == 4) ? (var_1fbd = var_1ff5[action]) : ((var_1ff5[action] == 6) ? (var_1fbd = 6) : ((var_1ff5[action] == 7) ? (var_1fbd = 7) : ((var_1ff5[action] == 8) ? (var_1fbd = 8) : (var_1fbd = -1))));
                    CurrentLoadingStep = var_1fbd;
                    sub_36b3(n12);
                    CurrentState = 1;
                }
                case 3: {
                    switch (action) {
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
                    unloadResources(true);
                    var_1f85 = false;
                    return true;
                }
            }
        }
        return false;
    }
    
    private static int GetFrameWidth(final int sprId, final int frame) {
        return var_1fcd[sprId].GetFrameWidth(frame);
    }
    
    private static int GetFrameHeight(final int sprId, final int frame) {
        return var_1fcd[sprId].GetFrameHeight(frame);
    }
    
    public static void updatePointerReleased(int x, int y) {
        int sub_4b75 = sub_4b75(x, y);
        x = y;
        y = x;
        y = s_screenHeight - y;
        int n4 = GetFrameHeight(0, 10);
        if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
            n4 = GetFrameHeight(0, 35);
        }
        final int frame15H = GetFrameHeight(0, 15);
        final int frame6W = GetFrameWidth(0, 6);
        final int frame6H = GetFrameHeight(0, 6);
        if (Math.abs(var_20ad - x) > s_screenWidth * 10 / 100 && y < s_screenHeight - n4 && y > frame15H && (var_20ad >= frame6W || var_20b5 <= var_1f4d[var_1d9d][1] || var_20b5 >= var_1f4d[var_1d9d][1] + frame6H) && (var_20ad <= s_screenWidth - frame6W || var_20b5 <= var_1f4d[var_1da5][1] || var_20b5 >= var_1f4d[var_1da5][1] + frame6H) && var_20b5 >= frame15H && var_20b5 <= s_screenHeight - n4) {
            if (var_20ad - x < 0) {
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
    
    public static void updatePointerPressed(int x, int y) {
        final int sub_4b75;
        if ((sub_4b75 = sub_4b75(x, y)) != 0) {
            var_207d = sub_4b75;
        }
        x = y;
        y = x;
        y = s_screenHeight - y;
        if (x == -1 || y == -1) {
            x = IGP.var_20ad;
            y = IGP.var_20b5;
        }
    }
    
    public static void updatePointerDragged(final int x, final int y) {
        var_1fa5 = 0;
        var_207d = 0;
        var_208d = false;
        var_209d = false;
        var_20a5 = false;
        updatePointerPressed(x, y);
    }
    
    private static int sub_4b75(int n, int n2) {
        
        
        final int n3 = n;
        n = n2;
        n2 = n3;
        n2 = s_screenHeight - n2;
        if (n < 0 || n2 < 0) {
            return 0;
        }
        if (CurrentState == 0 || !var_1f85) {
            return 0;
        }
        if (n2 > var_1f4d[var_1d65][1] && n2 < var_1f4d[var_1d65][1] + GetFrameHeight(0, 15)) {
            if (n < s_screenWidth >> 1) {
                if (var_1fad > var_1f2d.length - 1) {
                    return 28;
                }
            }
            else if (var_1fad < var_1f2d.length) {
                return 29;
            }
        }
        final int n4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
        if (n > var_1f4d[var_1d9d][0] + n4 && n < var_1f4d[var_1d9d][0] + GetFrameWidth(0, 6) + n4 && n2 > var_1f4d[var_1d9d][1] && n2 < var_1f4d[var_1d9d][1] + GetFrameHeight(0, 6)) {
            return 23;
        }
        if (n > var_1f4d[var_1da5][0] - n4 && n < var_1f4d[var_1da5][0] + GetFrameWidth(0, 4) - n4 && n2 > var_1f4d[var_1da5][1] && n2 < var_1f4d[var_1da5][1] + GetFrameHeight(0, 4)) {
            return 24;
        }
        int n5 = GetFrameWidth(0, 10);
        int n6 = GetFrameHeight(0, 10);
        if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
            n5 = GetFrameWidth(0, 35);
            n6 = GetFrameHeight(0, 35);
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
        if (n > var_1f4d[var_1dad][0] - 10 && n < var_1f4d[var_1dad][0] + GetFrameWidth(0, 0) + 10 && n2 > var_1f4d[var_1dad][1] - 10 && n2 < var_1f4d[var_1dad][1] + GetFrameHeight(0, 0) + 10) {
            var_20a5 = true;
            return 26;
        }
        final int sub_48a7 = GetFrameWidth(var_1d15, 0);
        final int sub_48cb = GetFrameHeight(var_1d15, 0);
        if (n > var_1f4d[var_1d8d][0] && n < var_1f4d[var_1d8d][0] + sub_48a7 && n2 > var_1f4d[var_1d8d][1] && n2 < var_1f4d[var_1d8d][1] + sub_48cb) {
            return 25;
        }
        return 0;
    }
    
    private static void reset() {
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
    
    final static int STATE_LOADING = 0;
    final static int STATE_PAGE = 1;
    
    public static void paint(Graphics g) {
        if (var_2055) {
            return;
        }
        if (!IsAvailable) {
            return;
        }
        setClip(g, 0, 0, s_screenHeight, s_screenWidth);
        switch (CurrentState) {
            case STATE_LOADING: { 
                g.setColor(0);
                GLLib.FillRect(g, 0, 0, s_screenWidth, s_screenHeight, true);
                if (CurrentLoadingStep > TotalLoadingSteps) {
                	CurrentLoadingStep = TotalLoadingSteps;
                }
                setClip(g, 0, 0, s_screenHeight, s_screenWidth);
                g.setColor(16777215);
                GLLib.FillRect(g, (s_screenWidth - s_screenWidth * 3 / 4) / 2, var_206d, s_screenWidth * 3 / 4, 6, true);
                g.setColor(0);
                GLLib.FillRect(g, (s_screenWidth - s_screenWidth * 3 / 4) / 2 + 1 + 1, var_206d + 1 + 1, s_screenWidth * 3 / 4 - 2 - 1, 3, true);
                g.setColor(16711680);
                GLLib.FillRect(g, (s_screenWidth - s_screenWidth * 3 / 4) / 2 + 1 + 1, var_206d + 1 + 1, (s_screenWidth * 3 / 4) * CurrentLoadingStep / TotalLoadingSteps + 1, 3, true);
                if (StringLoading != null && !StringLoading.trim().equals("")) {
                    Image image = Image.createImage(s_screenWidth, 30);
                    final Graphics graphics5 = image.getGraphics();
                    graphics5.setColor(0);
                    GLLib.FillRect(graphics5, 0, 0, 30, s_screenWidth, true);
                    graphics5.setColor(16777215);
                    //if (graphics5 == null) {
                    //    GLLib.g = GLLib.s_lastPaintGraphics;
                    //}
                    //else {
                    GLLib.g = graphics5;
                    //}
                    GLLib.g.setFont(s_igpFont);
                    GLLib.DrawString(StringLoading, realWidth, 25, 33);
                    GLLib.g = g;
                    g.drawRegion(image, 0, 0, s_screenHeight, 30, 5, var_206d + 5 + 30, 0, 0);
                    return;
                }
                break;
            }
            case STATE_PAGE: {
                drawPageState(g);
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
                drawPageState(g);
                
                
                final int n11 = s_screenHeight * 40 / 100;
                final int n12 = GetFrameWidth(0, 0) - 5;
                DrawRGB(g, 0, n11 - 1, s_screenWidth, s_screenHeight - (n11 - 1 << 1), -1);
                DrawRGB(g, 0, n11, s_screenWidth, s_screenHeight - (n11 << 1), -220209185);
                g.setColor(16777215);
                GLLib.FillRect(g, 0, s_screenHeight - (n12 + 1), s_screenWidth, n12 + 1, true);
                g.setColor(-220209185);
                GLLib.FillRect(g, 0, s_screenHeight - n12, s_screenWidth, n12, true);
                palette = 1;
                sub_2361(sub_2306(var_1c8d), g, s_screenHeight, s_screenWidth >> 1, s_screenHeight >> 1, 3, true);
                sub_6621(g);
                break;
            }
        }
    }
    
    private static void DrawRGB(final Graphics graphics, final int n, final int y, final int scanlength, final int height, final int n5) {
        final int[] rgbData = new int[scanlength * height];
        for (int i = 0; i < rgbData.length; ++i) {
            rgbData[i] = n5;
        }
        graphics.drawRGB(rgbData, 0, scanlength, 0, y, scanlength, height, true);
    }
    
    private static void drawPageState(final Graphics g) {
        
        
        g.setColor(16777215);
        if (var_1c35[0]) {
            g.setColor(0);
        }
        g.setColor(16777215);
        GLLib.FillRect(g, 0, 0, s_screenWidth, s_screenHeight, true);
        final int n = var_1f4d[0][0];
        final int n2 = var_1f4d[0][1];
        final int n3 = var_1f4d[var_1d5d][0];
        final int n4 = var_1f4d[var_1d5d][1];
        final int n5 = var_1f4d[var_1d8d][0];
        final int n6 = var_1f4d[var_1d8d][1];
        final int n7 = var_1f4d[var_1db5][0];
        final int n8 = var_1f4d[var_1db5][1];
        final int x = var_1f4d[var_1d85][0];
        final int y = var_1f4d[var_1d85][1];
        final int n11 = var_1f4d[var_1dbd][0];
        final int n12 = var_1f4d[var_1dbd][1];
        final int n13 = var_1f4d[var_1dc5][0];
        final int n14 = var_1f4d[var_1dc5][1];
        final int n15 = var_1f4d[var_1dfd][0];
        final int n16 = var_1f4d[var_1dfd][1];
        final int n17 = var_1f4d[var_1e05][1];
        PaintFrame(g, 0, 9, x, y);
        palette = 1;
        var_1e45 = 0;
        if (var_1ff5[var_1fad] == 6) {
            if (!var_2025.equals("0")) {
                sub_2338(var_2025, g, s_screenWidth, n, n2, 3);
            }
            sub_2338(sub_2306(var_2015), g, s_screenWidth, n3, n4, 3);
            PaintFrame(g, var_1d1d + (var_1fad - var_1c55), 0, n5, n6);
            int n18 = 8;
            if (s_screenWidth == 360 && s_screenHeight == 480) {
                n18 = 39;
            }
            PaintFrame(g, 0, n18, n7, n8);
            if (var_1ef5 == null || !var_1ef5.equals("TMUS")) {
                var_1e45 = 1;
                int n19 = GetFrameWidth(0, 10);
                if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                    n19 = GetFrameWidth(0, 35);
                }
                int n20 = s_screenWidth - var_1c2d - n19 >> 1;
                if (s_screenHeight > s_screenWidth) {
                    n20 = s_screenWidth;
                }
                sub_2361(sub_2306(var_1cd5), g, n20, n15, n16, 3, true);
            }
        }
        else if (var_1ff5[var_1fad] == 7) {
            if (!var_202d.equals("0")) {
                sub_2338(var_202d, g, s_screenWidth, n, n2, 3);
            }
            sub_2338(sub_2306(var_1ca5), g, s_screenWidth, n3, n4, 3);
            PaintFrame(g, var_1d25, 0, n5, n6);
        }
        else if (var_1ff5[var_1fad] == 8) {
            sub_2338(sub_2306(var_1cad), g, s_screenWidth, n, n2, 3);
            sub_2338(sub_2306(var_1c95), g, s_screenWidth * 3 / 4, n3, n4, 3);
            PaintFrame(g, var_1d2d, 0, n5, n6);
        }
        else {
            palette = 1;
            sub_2338(sub_2306(var_1c9d), g, s_screenWidth, n, n2, 3);
            sub_2338(sub_2306(var_2015), g, s_screenWidth * 3 / 4, n3, n4, 3);
            PaintFrame(g, var_1d15 + var_1fad, 0, n5, n6);
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
            PaintFrame(g, 0, 2, n11, n12);
            PaintFrame(g, 0, 3, n13, n14);
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
            final int sub_48a7 = GetFrameWidth(0, 19);
            int n42 = GetFrameWidth(0, 10);
            int n43 = GetFrameHeight(0, 10);
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n42 = GetFrameWidth(0, 35);
                n43 = GetFrameHeight(0, 35);
            }
            int n44 = 15;
            int n45 = 18;
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n44 = 31;
                n45 = 34;
            }
            PaintFrame(g, 0, n44, n22, n23);
            PaintFrame(g, 0, n45, n24, n25);
            int n46 = 13;
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n46 = 37;
            }
            if (var_208d) {
                n46 = 11;
                if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                    n46 = 36;
                }
            }
            PaintFrame(g, 0, n46, n30, n31);
            palette = 0;
            if (var_208d) {
                palette = 1;
            }
            final short[] sub_4ac6;
            var_1e55 = (sub_4ac6 = var_1fd5.WraptextB(sub_2306(var_1ccd), n42 - sub_48a7 - 4, false))[2];
            if (sub_4ac6[0] > 1) {
                var_1e55 = n42 - sub_48a7 - 8;
            }
            final int n48;
            final int n47 = ((n48 = n42 - (var_1e55 + sub_48a7 + 4)) < 0) ? 0 : (n48 >> 1);
            PaintFrame(g, 0, 19, n40 - (n42 >> 1) + n47, n31 + (n43 >> 1) - (GetFrameHeight(0, 19) >> 1));
            if (sub_4ac6[0] > 1) {
                int n49 = -4;
                if (s_screenWidth == 320 || s_screenHeight == 320) {
                    n49 = 4;
                }
                sub_2361(sub_2306(var_1ccd), g, n42 - sub_48a7 + n49, n40 + (sub_48a7 >> 1), n41 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(var_1ccd), g, s_screenWidth, n40 - (n42 >> 1) + n47 + sub_48a7 + 2, n41 - 2, 6);
            }
        }
        else {
            int n50 = 17;
            int n51 = 16;
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n50 = 33;
                n51 = 32;
            }
            PaintFrame(g, 0, n50, n24, n25);
            PaintFrame(g, 0, n51, n22, n23);
            int n52 = 13;
            int n53 = 10;
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n52 = 37;
                n53 = 35;
            }
            if (var_208d) {
                n52 = 11;
                if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                    n52 = 36;
                }
            }
            if (var_209d) {
                n53 = 11;
                if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                    n53 = 36;
                }
            }
            PaintFrame(g, 0, n53, n26, n27);
            PaintFrame(g, 0, n52, n28, n29);
            palette = 0;
            if (var_209d) {
                palette = 1;
            }
            sub_2338(sub_2306(var_1cc5), g, s_screenWidth, n36, n37 - 2, 3);
            final int sub_48a8 = GetFrameWidth(0, 19);
            int n54 = GetFrameWidth(0, 10);
            int n55 = GetFrameHeight(0, 10);
            if ((s_screenWidth == 240 && (s_screenHeight == 320 || s_screenHeight == 400)) || (s_screenWidth == 360 && (s_screenHeight == 640 || s_screenHeight == 480))) {
                n54 = GetFrameWidth(0, 35);
                n55 = GetFrameHeight(0, 35);
            }
            final short[] sub_4ac7;
            var_1e55 = (sub_4ac7 = var_1fd5.WraptextB(sub_2306(var_1ccd), n54 - sub_48a8 - 4, false))[2];
            if (sub_4ac7[0] > 1) {
                var_1e55 = n54 - sub_48a8 - 8;
            }
            final int n57;
            final int n56 = ((n57 = n54 - (var_1e55 + sub_48a8 + 4)) < 0) ? 0 : (n57 >> 1);
            PaintFrame(g, 0, 19, n38 - (n54 >> 1) + n56, n29 + (n55 >> 1) - (GetFrameHeight(0, 19) >> 1));
            palette = 0;
            if (var_208d) {
                palette = 1;
            }
            if (sub_4ac7[0] > 1) {
                int n58 = -4;
                if (s_screenWidth == 320 || s_screenHeight == 320) {
                    n58 = 4;
                }
                sub_2361(sub_2306(var_1ccd), g, n54 - sub_48a8 + n58, n38 + (sub_48a8 >> 1), n39 - 2, 3, true);
            }
            else {
                sub_2338(sub_2306(var_1ccd), g, s_screenWidth, n38 - (n54 >> 1) + n56 + sub_48a8 + 2, n39 - 2, 6);
            }
            palette = 0;
        }
        palette = 0;
        sub_2338(sub_2306(var_1cb5), g, s_screenWidth, n32, n33, 3);
        sub_2338(sub_2306(var_1cbd), g, s_screenWidth, n34, n35, 3);
        var_1e55 = var_1fd5.WraptextB(sub_2306(var_1cbd), s_screenWidth, false)[2];
        PaintFrame(g, 0, 29, n34 + (var_1e55 >> 1) + 3, n17);
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
            PaintFrame(g, 0, n59, n62 + n61, n63);
            PaintFrame(g, 0, n60, n64 - n61, n65);
            if (var_1f35 > 4) {
                var_1f3d = false;
                var_1f45 = false;
                var_1f35 = 0;
                var_2095 = false;
            }
        }
        sub_6621(g);
    }
    
    private static void sub_6621(final Graphics graphics) {
        final int posX = var_1f4d[var_1dad][0];
        final int posY = var_1f4d[var_1dad][1];
        int frame = 0;
        if (var_20a5) {
            frame = 1;
        }
        PaintFrame(graphics, 0, frame, posX, posY);
    }
    
    private static void PaintFrame(final Graphics g, final int sprId, final int frame, final int posX, final int posY) {
        var_1fcd[sprId].PaintFrame(g, frame, posX, posY, 0);
    }
    
    private static void setClip(final Graphics g, int x, int y, int width, int height) {
        GLLib.SetClip(g, x = Math.max(0, 0), y = Math.max(0, 0), Math.min(height, s_screenWidth), width = Math.min(width, s_screenHeight), true);
    }
    
    public final void run() {
        if (Define.DECOMP_MODE) System.out.println("Thread.activeCount() = " + Thread.activeCount());
        while (var_1f85) {
            try {
                if (var_1f8d != null) {
                	s_platformRequestUrl = var_1f8d;
                    if (s_platformRequestUrl != null && s_platformRequestUrl.length() > 0) {
                        var_1f55 = false;
                        final String urlPlatformRequest = s_platformRequestUrl;
                        s_platformRequestUrl = null;
                        if (Define.DECOMP_MODE) System.out.println("urlPlatformRequest = " + urlPlatformRequest);
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
    
    private static ASprite sub_680f(int index, int n2, final boolean unused, final boolean freeSprCache) {
        final ASprite spr;
        (spr = new ASprite()).Load(GLLib.Pack_ReadData(index), 0);
        for (index = 0; n2 >> index != 0; ++index) {
            if ((n2 >> index & 0x1) != 0x0) {
                spr.BuildCacheImages(index, 0, -1, -1);
            }
        }
        if (freeSprCache) {
            spr.FreeCacheData();
        }
        return spr;
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
        s_moreGamesStatAppProp = null;
        s_on = "on";
        s_PLACEHOLDER = "XXXX";
        s_ctg_PLACEHOLDER = "&ctg=" + s_PLACEHOLDER;
        s_ctg = "&ctg=";
        s_lg = "&lg=";
        s_SC = "SC";
        s_igaUrlRedir = "ingameads.gameloft.com/redir";
        s_GAME_SEPARATOR = ";";
        var_1efd = false;
        var_1f05 = new String[0];
        var_1f55 = false;
        var_1f6d = false;
        s_cmdListener = null;
        s_igpThreadInst = null;
        var_1f85 = false;
        var_1f8d = null;
        IsAvailable = false;
        var_1fe5 = new int[2];
        var_2005 = 0;
        var_200d = 0;
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
