import javax.microedition.media.Controllable;
import java.util.Random;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStore;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cGame extends GLLib implements Class_b {
	private static int var_67c4;
	private static int var_67cc;
	static int field_a_int;
	static int[] var_67dc;
	private static byte[] var_67e4;
	private static int var_67ec;
	private static int var_67f4;
	public static boolean s_clickblocked;
	private static int[] var_6804;
	private static int[] var_680c;
	private static int[] var_6814;
	private static int[] var_681c;
	private static int var_6824;
	private static int var_682c;
	private static int var_6834;
	private static boolean var_683c;
	private static boolean var_6844;
	private static boolean var_684c;
	private static int var_6854;
	private static int var_685c;
	private static boolean var_6864;
	private static boolean var_686c;
	private static int var_6874;
	private static byte[] var_687c;
	private static byte[][] var_6884;
	private static short[][] var_688c;
	private static short[][] var_6894;
	private static ASprite[][] var_689c;
	private static int[] var_68a4;
	private static int var_68ac;
	private static byte[] var_68b4;
	static short[][][] var_68bc;
	private static short[][][] var_68c4;
	private static String[][] var_68cc;
	static ASprite[] var_68d4;
	private static GLLibImage[] var_68dc;
	private static byte[] var_68e4;
	private static GLLibPlayer[] var_68ec;
	private static GLLibPlayer[] var_68f4;
	private static GLLibPlayer[] var_68fc;
	private static GLLibPlayer var_6904;
	private static GLLibPlayer[] var_690c;
	private static int[][] var_6914;
	private static int[][] var_691c;
	private static boolean var_6924;
	private static boolean var_692c;
	private static boolean var_6934;
	private static boolean var_693c;
	private static boolean var_6944;
	private static int var_694c;
	private static boolean var_6954;
	private static boolean var_695c;
	private static boolean var_6964;
	private static int var_696c;
	private static int var_6974;
	private static int var_697c;
	private static boolean var_6984;
	private static boolean var_698c;
	private static boolean var_6994;
	private static boolean var_699c;
	private static boolean var_69a4;
	private static boolean var_69ac;
	private static boolean var_69b4;
	private static boolean var_69bc;
	private static boolean var_69c4;
	private static boolean var_69cc;
	private static boolean var_69d4;
	private static boolean var_69dc;
	private static boolean var_69e4;
	private static boolean var_69ec;
	private static boolean var_69f4;
	private static boolean var_69fc;
	static boolean var_6a04;
	static boolean var_6a0c;
	private static boolean var_6a14;
	static int var_6a1c;
	private static int var_6a24;
	private static int var_6a2c;
	private static boolean var_6a34;
	private static int[][] var_6a3c;
	private static int var_6a44;
	private static int var_6a4c;
	private static int[] var_6a54;
	private static int var_6a5c;
	private static int var_6a64;
	private static long var_6a6c;
	static int var_6a74;
	private static long var_6a7c;
	private static long var_6a84;
	private static long var_6a8c;
	private static int var_6a94;
	private static boolean var_6a9c;
	static int var_6aa4;
	static Class_f var_6aac;
	private static Class_f var_6ab4;
	private static boolean var_6abc;
	private static boolean var_6ac4;
	private static int var_6acc;
	private static int var_6ad4;
	private static int var_6adc;
	private static int var_6ae4;
	private static boolean var_6aec;
	static int var_6af4;
	private static int var_6afc;
	static int var_6b04;
	static int var_6b0c;
	static int var_6b14;
	static int var_6b1c;
	static int var_6b24;
	static int var_6b2c;
	static int var_6b34;
	static int var_6b3c;
	static int var_6b44;
	static int var_6b4c;
	static byte var_6b54;
	private static GLLibPlayer var_6b5c;
	private static int var_6b64;
	private static int[] var_6b6c;
	private static int[] var_6b74;
	private static int[] var_6b7c;
	private static int[] var_6b84;
	private static int var_6b8c;
	private static int var_6b94;
	private static boolean var_6b9c;
	private static String var_6ba4;
	private static long var_6bac;
	private static short var_6bb4;
	private static short var_6bbc;
	private static boolean var_6bc4;
	private static char var_6bcc;
	private static boolean var_6bd4;
	private static int var_6bdc;
	private static char var_6be4;
	static boolean var_6bec;
	private static int var_6bf4;
	private static int var_6bfc;
	private static int var_6c04;
	private static int var_6c0c;
	private static boolean var_6c14;
	private static boolean var_6c1c;
	static boolean var_6c24;
	private static boolean var_6c2c;
	private static boolean var_6c34;
	private static boolean var_6c3c;
	private static boolean var_6c44;
	private static boolean var_6c4c;
	private static boolean var_6c54;
	private static int var_6c5c;
	static int var_6c64;
	private static boolean var_6c6c;
	private static int var_6c74;
	private static boolean var_6c7c;
	private static boolean var_6c84;
	static boolean var_6c8c;
	static boolean var_6c94;
	static Class_f var_6c9c;
	private static int var_6ca4;
	private static int var_6cac;
	private static int var_6cb4;
	static int var_6cbc;
	private static boolean var_6cc4;
	static boolean var_6ccc;
	private static boolean var_6cd4;
	private static int var_6cdc;
	private static int var_6ce4;
	private static int var_6cec;
	private static int var_6cf4;
	private static int var_6cfc;
	private static int var_6d04;
	private static int var_6d0c;
	private static int var_6d14;
	private static int var_6d1c;
	private static int var_6d24;
	private static int var_6d2c;
	private static int var_6d34;
	private static long var_6d3c;
	private static int var_6d44;
	private static int var_6d4c;
	static int var_6d54;
	static boolean[] var_6d5c;
	private static int var_6d64;
	private static GLLibPlayer var_6d6c;
	private static int var_6d74;
	private static int var_6d7c;
	private static int var_6d84;
	private static int var_6d8c;
	private static long var_6d94;
	private static long var_6d9c;
	private static int var_6da4;
	private static int var_6dac;
	private static int var_6db4;
	private static int var_6dbc;
	private static int var_6dc4;
	private static int var_6dcc;
	private static boolean var_6dd4;
	private static int var_6ddc;
	private static int var_6de4;
	private static Class_f[] var_6dec;
	static boolean var_6df4;
	private static boolean[] var_6dfc;
	private static boolean[] var_6e04;
	private static boolean var_6e0c;
	private static boolean var_6e14;
	private static long var_6e1c;
	private static int[][] var_6e24;
	private static int[][] var_6e2c;
	private static long[][] var_6e34;
	private static int[] var_6e3c;
	private static int[][] var_6e44;
	private static int[][] var_6e4c;
	private static int[] var_6e54;
	private static boolean var_6e5c;
	private static int[] var_6e64;
	private static String[] var_6e6c;
	private static String[] var_6e74;
	private static int[] var_6e7c;
	private static int[] var_6e84;
	private static int[] var_6e8c;
	private static int[] var_6e94;
	private static int[] var_6e9c;
	private static int[] var_6ea4;
	private static boolean[] var_6eac;
	private static int[] var_6eb4;
	private static int[] var_6ebc;
	private static int[] var_6ec4;
	private static int[] var_6ecc;
	private static int[] var_6ed4;
	private static byte[] var_6edc;
	private static int var_6ee4;
	private static boolean[] var_6eec;
	private static int[] var_6ef4;
	private static short[] var_6efc;
	private static int var_6f04;
	private static int var_6f0c;
	private static int var_6f14;
	private static int var_6f1c;
	private static int var_6f24;
	private static int var_6f2c;
	private static int var_6f34;
	private static int var_6f3c;
	private static int var_6f44;
	private static int var_6f4c;
	private static int var_6f54;
	private static int var_6f5c;
	private static int[] var_6f64;
	private static int[] var_6f6c;
	private static int[][] var_6f74;
	private static int var_6f7c;
	private static int var_6f84;
	private static int var_6f8c;
	private static int var_6f94;
	private static int var_6f9c;
	private static int var_6fa4;
	private static int var_6fac;
	private static int[] var_6fb4;
	private static GLLibPlayer var_6fbc;
	static byte[] var_6fc4;
	private static int[][] var_6fcc;
	static int var_6fd4;
	static boolean var_6fdc;
	private static int s_rmsLevel;
	private static int s_rmsExp;
	private static long var_6ff4;
	private static int var_6ffc;
	private static int s_rmsCash;
	private static int var_700c;
	private static int[] var_7014;
	private static int var_701c;
	private static int var_7024;
	private static int var_702c;
	private static int var_7034;
	private static int s_rmsMaxPlots;
	private static int giant_gyatt;
	private static int var_704c;
	private static int s_rmsMaxAmountInSilo;
	private static int var_705c;
	private static int var_7064;
	private static int var_706c;
	private static int[] var_7074;
	private static int[] var_707c;
	private static short[] var_7084;
	private static int var_708c;
	private static int var_7094;
	private static int var_709c;
	private static int var_70a4;
	private static int var_70ac;
	static int[] var_70b4;
	private static int[] var_70bc;
	static Class_f[] var_70c4;
	static int var_70cc;
	static int var_70d4;
	static int var_70dc;
	static int var_70e4;
	private static short var_70ec;
	private static short var_70f4;
	private static short var_70fc;
	private static short[] var_7104;
	private static short[][] var_710c;
	private static int[][] var_7114;
	private static int var_711c;
	private static int var_7124;
	private static int s_level;
	private static int s_experienceAmount;
	private static long var_713c;
	private static int s_cashAmount;
	private static int[] var_714c;
	private static int s_maxPlots;
	private static int skibidi_rizz;
	private static int s_maxAmountInSilo;
	private static long var_716c;
	private static int[][] var_7174;
	private static int field_cq;
	private static int field_cr;
	private static String var_718c;
	private static boolean var_7194;
	private static char var_719c;
	private static int[] var_71a4;
	private static int[] var_71ac;
	private static int[] var_71b4;
	private static int[] var_71bc;
	private static int[] var_71c4;
	private static int[] var_71cc;
	private static int[] var_71d4;
	private static int[] var_71dc;
	private static int[] var_71e4;
	private static int[] var_71ec;
	private static int[] var_71f4;
	private static int[] var_71fc;
	private static boolean[] var_7204;
	private static int var_720c;
	private static int var_7214;
	private static int var_721c;
	private static int var_7224;
	private static int var_722c;
	private static int var_7234;
	private static int[] var_723c;
	private static int[] var_7244;
	private static int[] var_724c;
	private static int[] var_7254;
	private static short[] var_725c;
	private static short[] var_7264;
	private static short[] var_726c;
	private static short[] var_7274;
	private static short[] var_727c;
	private static byte[] var_7284;
	private static long var_728c;
	private static int var_7294;
	private static int var_729c;
	private static int var_72a4;
	private static int var_72ac;
	private static int var_72b4;
	private static int[] var_72bc;
	private static int[] var_72c4;
	private static int[] var_72cc;
	private static int[] var_72d4;
	private static int[] var_72dc;
	private static int[] var_72e4;
	private static boolean var_72ec;
	private static int[] var_72f4;
	private static int[] var_72fc;
	private static char var_7304;
	private static char var_730c;
	private static int[][] var_7314;
	private static int[][] var_731c;
	private static int[][] var_7324;
	private static int[][] var_732c;
	private static int[][] var_7334;
	private static int[][] var_733c;
	private static int[][] var_7344;
	private static int[][] var_734c;
	private static boolean var_7354;
	private static int var_735c;
	private static int var_7364;
	private static int var_736c;
	private static int var_7374;
	private static int var_737c;
	private static int var_7384;
	private static int var_738c;
	private static String var_7394;
	private static int var_739c;
	private static int var_73a4;
	private static int var_73ac;
	private static boolean var_73b4;
	private static int var_73bc;
	private static int var_73c4;
	private static int var_73cc;
	private static int var_73d4;
	private static int var_73dc;
	private static int var_73e4;
	private static int var_73ec;
	private static int var_73f4;
	private static int var_73fc;
	private static int var_7404;
	private static int var_740c;
	private static int var_7414;
	private static boolean var_741c;
	private static boolean var_7424;
	private static int var_742c;
	private static int var_7434;
	private static boolean var_743c;
	private static int var_7444;
	private static char var_744c;
	private static char var_7454;
	private static int var_745c;
	private static char var_7464;
	private static int var_746c;
	private static int var_7474;
	private static int var_747c;
	private static int var_7484;
	private static int[] var_748c;
	private static int[] var_7494;
	private static int[] var_749c;
	private static long[] var_74a4;
	private static int[] var_74ac;
	private static int[] var_74b4;
	private static byte[] var_74bc;
	private static boolean[] var_74c4;
	private static int[] var_74cc;
	private static String[] var_74d4;
	private static boolean var_74dc;
	private static boolean var_74e4;
	private static int var_74ec;
	private static int var_74f4;
	private static int var_74fc;
	private static int var_7504;
	private static int var_750c;
	static int var_7514;
	private static int var_751c;
	private static int var_7524;
	private static int[] var_752c;
	private static int[] var_7534;
	static int[] var_753c;
	static long[] var_7544;
	private static int[] var_754c;
	private static int[] var_7554;
	private static int[] var_755c;
	private static byte[] var_7564;
	private static int[] var_756c;
	private static String[] var_7574;
	private static boolean var_757c;
	private static int var_7584;
	private static int var_758c;
	private static int[] var_7594;
	private static int[] var_759c;
	private static int[] var_75a4;
	private static int[] var_75ac;
	private static int[] var_75b4;
	private static int[] var_75bc;
	private static int[] var_75c4;
	private static byte[] var_75cc;
	private static boolean var_75d4;
	private static int var_75dc;
	private static int var_75e4;
	private static int var_75ec;
	private static int var_75f4;
	private static int var_75fc;
	private static int var_7604;
	private static int var_760c;
	private static int var_7614;
	private static int var_761c;
	private static String var_7624;
	private static int var_762c;
	private static int var_7634;
	private static int var_763c;
	private static int var_7644;
	private static int var_764c;
	private static int var_7654;
	private static int var_765c;
	private static int var_7664;
	private static int var_766c;
	private static int var_7674;
	private static int var_767c;
	private static int var_7684;
	private static int var_768c;
	private static int var_7694;
	private static int var_769c;
	private static boolean var_76a4;
	private static int var_76ac;
	private static char var_76b4;
	private static char var_76bc;
	private static int var_76c4;
	private static int var_76cc;
	private static int var_76d4;
	private static int var_76dc;
	private static int var_76e4;
	private static int var_76ec;
	private static short[] var_76f4;
	private static int[] var_76fc;
	private static int[] var_7704;
	private static int[] var_770c;
	private static int[] var_7714;
	private static short[] var_771c;
	private static short[] var_7724;
	private static short[] var_772c;
	private static short[] var_7734;
	private static short[] var_773c;
	private static byte[] var_7744;
	private static int var_774c;
	private static int var_7754;
	private static boolean var_775c;
	private static int[] var_7764;
	private static int var_776c;
	private static long[] var_7774;
	private static Class_f[] var_777c;
	private static boolean var_7784;
	private static boolean[] var_778c;
	private static boolean[] var_7794;
	private static boolean var_779c;
	private static boolean var_77a4;
	private static boolean var_77ac;
	private static long var_77b4;
	private static long var_77bc;
	private static String[] var_77c4;
	private static int[] var_77cc;
	private static int var_77d4;
	private static boolean var_77dc;
	private static int var_77e4;
	private static int var_77ec;
	private static short var_77f4;
	private static long var_77fc;
	private static String var_7804;
	private static int var_780c;
	private static boolean var_7814;
	private static int var_781c;
	private static int var_7824;
	private static int var_782c;
	private static String var_7834;
	private static String var_783c;
	private static boolean var_7844;
	private static String var_784c;
	private static boolean var_7854;
	private static boolean var_785c;
	private static boolean var_7864;
	private static int var_786c;
	private static int[] var_7874;
	private static int[] var_787c;
	private static int[] var_7884;
	private static short[] var_788c;
	private static short[] var_7894;
	private static short[] var_789c;
	private static short[] var_78a4;
	private static short[] var_78ac;
	private static byte[] var_78b4;
	private static boolean var_78bc;
	private static int var_78c4;
	private static int var_78cc;
	private static int[] var_78d4;
	private static int[] var_78dc;
	private static int[] var_78e4;
	private static short[] var_78ec;
	private static short[] var_78f4;
	private static short[] var_78fc;
	private static short[] var_7904;
	private static int var_790c;
	private static boolean var_7914;
	private static Class_f var_791c;
	private static int var_7924;
	private static int var_792c;
	private static int var_7934;
	private static int[] var_793c;
	private static int[] var_7944;
	private static int[] var_794c;
	private static int var_7954;
	private static int var_795c;
	private static boolean var_7964;
	private static boolean var_796c;
	private static boolean var_7974;
	private static boolean var_797c;
	private static int var_7984;
	private static String var_798c;
	private static int var_7994;
	private static boolean var_799c;
	private static int var_79a4;
	private static int var_79ac;
	private static int var_79b4;
	private static int var_79bc;
	private static int var_79c4;
	private static int var_79cc;
	private static String var_79d4;
	private static int var_79dc;
	private static int var_79e4;
	private static int var_79ec;
	private static int[] var_79f4;
	private static short[] var_79fc;
	static byte[] var_7a04;
	private static int[] var_7a0c;
	private static int[] var_7a14;
	private static byte[] var_7a1c;
	private static int[] var_7a24;
	private static int var_7a2c;
	static int var_7a34;
	static int var_7a3c;
	private static int var_7a44;
	private static short var_7a4c;
	private static long var_7a54;
	private static int[] var_7a5c;
	private static int var_7a64;
	private static byte var_7a6c;
	private static int var_7a74;
	private static int var_7a7c;
	private static int var_7a84;
	private static boolean var_7a8c;
	private static int var_7a94;
	private static boolean var_7a9c;
	private static int[] var_7aa4;
	static int var_7aac;
	static String var_7ab4;
	private static boolean var_7abc;
	private static String var_7ac4;
	private static String var_7acc;
	private static String var_7ad4;
	private static String var_7adc;
	private static int var_7ae4;
	private static int var_7aec;
	private static boolean var_7af4;
	private static boolean var_7afc;
	private static int var_7b04;
	private static int var_7b0c;
	private static Class_f var_7b14;
	private static String var_7b1c;
	private static int var_7b24;
	private static int var_7b2c;
	private static Class_f var_7b34;
	private static int var_7b3c;
	private static int[] var_7b44;
	private static int[] var_7b4c;
	private static int[] var_7b54;
	private static int[] var_7b5c;
	private static int[] var_7b64;
	private static int[] var_7b6c;
	private static int var_7b74;
	private static boolean var_7b7c;
	private static int var_7b84;
	private static int var_7b8c;
	private static int var_7b94;
	private static int var_7b9c;
	private static String var_7ba4;
	private static String var_7bac;
	private static int var_7bb4;
	private static int var_7bbc;
	private static int var_7bc4;
	private static int var_7bcc;
	private static int var_7bd4;
	private static int var_7bdc;
	private static int var_7be4;
	private static int var_7bec;
	private static int var_7bf4;
	private static int var_7bfc;
	private static int[][] var_7c04;
	private static int[][] var_7c0c;
	private static int[] var_7c14;
	private static int[] var_7c1c;
	private static int var_7c24;
	private static String var_7c2c;
	private static int var_7c34;
	private static boolean var_7c3c;
	private static boolean s_iapEnabled;
	private static boolean var_7c4c;
	private static String[] var_7c54;
	private static String[] var_7c5c;
	private static int[] var_7c64;
	private static int[] var_7c6c;
	private static int[] var_7c74;
	private static int[] var_7c7c;
	private static int[] var_7c84;
	private static int[] var_7c8c;
	private static int[] var_7c94;
	private static String var_7c9c;
	private static int var_7ca4;
	private static int var_7cac;
	private static int var_7cb4;
	private static int var_7cbc;
	private static int var_7cc4;
	private static boolean var_7ccc;
	private static boolean var_7cd4;
	private static int var_7cdc;
	private static int var_7ce4;
	private static long[] var_7cec;
	private static int[] var_7cf4;
	private static int[] var_7cfc;
	private static int[] var_7d04;
	private static int[] var_7d0c;
	private static int[] var_7d14;
	private static int var_7d1c;
	public static boolean var_7d24;
	private static int var_7d2c;
	private static int var_7d34;
	private static int var_7d3c;
	private static boolean var_7d44;
	private static int var_7d4c;
	private static int var_7d54;
	private static boolean var_7d5c;
	private static int var_7d64;
	private static int var_7d6c;
	private static int var_7d74;
	private static int var_7d7c;
	private static int[] var_7d84;
	private static int[] var_7d8c;
	private static int var_7d94;
	static long var_7d9c;
	static long var_7da4;
	private static int[] var_7dac;
	private static int[] var_7db4;
	private static int[] var_7dbc;
	private static int[] var_7dc4;
	private static int var_7dcc;
	private static int var_7dd4;
	private static int[] var_7ddc;
	private static int[] var_7de4;
	private static int[] var_7dec;
	private static int[] var_7df4;
	private static int[] var_7dfc;
	private static int[] var_7e04;
	private static String[] var_7e0c;
	private static int var_7e14;
	private static int var_7e1c;
	private static int var_7e24;
	private static int var_7e2c;
	private static int var_7e34;
	private static int var_7e3c;
	private static boolean var_7e44;
	private static int[] var_7e4c;
	private static int[] var_7e54;
	private static int[] var_7e5c;
	private static String[] var_7e64;
	private static String[] var_7e6c;
	private static String[] var_7e74;
	private static int[] var_7e7c;
	private static int[] var_7e84;
	private static String[] var_7e8c;
	private static int[] var_7e94;
	private static int[] var_7e9c;
	private static int[] var_7ea4;
	private static int[] var_7eac;
	private static int[] var_7eb4;
	private static boolean[] var_7ebc;
	private static String[] var_7ec4;
	private static int[] var_7ecc;
	private static int[] var_7ed4;
	private static int[] var_7edc;
	private static int[] var_7ee4;
	private static int[] var_7eec;
	private static boolean[] var_7ef4;
	private static String[] s_loadedTexts;
	private static int[] var_7f04;
	private static int[] var_7f0c;
	private static int[] var_7f14;
	private static int[] var_7f1c;
	private static int[] var_7f24;
	private static boolean[] var_7f2c;
	private static int[] var_7f34;
	private static String[] var_7f3c;
	private static int[] var_7f44;
	private static int[] var_7f4c;
	private static int[] var_7f54;
	private static int[] var_7f5c;
	private static int[] var_7f64;
	private static int var_7f6c;
	private static char var_7f74;
	private static int var_7f7c;
	private static short[] var_7f84;
	private static boolean[] var_7f8c;
	private static short var_7f94;
	private static boolean var_7f9c;
	private static int var_7fa4;
	private static boolean var_7fac;
	private static boolean var_7fb4;
	private static int[] var_7fbc;
	static int var_7fc4;
	private static int var_7fcc;
	static int var_7fd4;
	private static boolean var_7fdc;
	static int var_7fe4;
	private static int s_languageCode;
	static ASprite[] var_7ff4;
	private static ASprite[] var_7ffc;
	private static Class_f var_8004;
	static Class_f var_800c;
	private static Class_f var_8014;
	private static Class_f var_801c;
	private static Class_f var_8024;
	private static Class_f var_802c;
	static Class_f var_8034;
	private static int var_803c;
	static int var_8044;
	static String s_plantGrowTime;
	private static String var_8054;
	private static short[] var_805c;
	static int[] var_8064;
	private static int[] var_806c;
	static boolean var_8074;
	static int var_807c;
	private static int var_8084;
	static int var_808c;
	static short[] var_8094;
	private static int[] var_809c;
	private static short[] var_80a4;
	private static int[] var_80ac;
	static short[] var_80b4;
	private static int[] var_80bc;
	private static short[] var_80c4;
	static short[] var_80cc;
	static short[] var_80d4;
	static short[] var_80dc;
	private static short[] var_80e4;
	private static short[] var_80ec;
	static short[] var_80f4;
	private static short[] var_80fc;
	private static int[] var_8104;
	private static short[] var_810c;
	private static int[] var_8114;
	private static short[] var_811c;
	static int var_8124;
	static int var_812c;
	private static int var_8134;
	static boolean var_813c;
	private static long var_8144;
	private static long var_814c;
	private static long var_8154;
	static boolean var_815c;
	private static boolean var_8164;
	private static boolean var_816c;

	private static void sub_818c(final int n, final boolean b) {
		if (b) {
			var_67e4[n >> 3] |= (byte) (1 << (n & 0x7));
		}
		var_67e4[n >> 3] &= (byte) ~(1 << (n & 0x7));
	}

	static void sub_81e0(final int var_67c4) {
		int n = cGame.var_67dc[cGame.field_a_int];
		if (cGame.var_67dc != null && cGame.field_a_int != -1 && n == 17 || n == 18 && var_67c4 != 19 && var_67c4 != 35
				&& var_67c4 != 17 && var_67c4 != 18 && var_67c4 != 36 && var_67c4 != 12) {
			cGame.var_69d4 = true;
			cGame.s_clickblocked = true;
			GLLibPlayer.Tileset_Destroy(0);
			GLLibPlayer.Tileset_Destroy(1);
		}
		if (cGame.field_a_int < 15) {
			cGame.var_67c4 = var_67c4;
			cGame.var_67cc = 0;
			sub_2c69b();
		}
	}

	private static void sub_8281(final int var_67c4) {
		cGame.var_67c4 = var_67c4;
		cGame.var_67cc = 2;
		sub_2c69b();
	}

	private static void sub_82a7(final int var_67c4) {
		int n = var_67dc[field_a_int];
		if (cGame.var_67dc != null && cGame.field_a_int != -1 && n == 17 || n == 18 || n == 26 && var_67c4 != 19
				&& var_67c4 != 35 && var_67c4 != 17 && var_67c4 != 18 && var_67c4 != 36 && var_67c4 != 12) {
			cGame.var_69d4 = true;
			cGame.s_clickblocked = true;
			GLLibPlayer.Tileset_Destroy(0);
			GLLibPlayer.Tileset_Destroy(1);
		}
		if (cGame.field_a_int < 15) {
			cGame.var_67c4 = var_67c4;
			cGame.var_67cc = 3;
			sub_2c69b();
		}
	}

	private static void sub_834e() {
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_8370(final int var_67c4) {
		cGame.var_67c4 = var_67c4;
		cGame.var_67cc = 4;
		sub_2c69b();
	}

	static int sub_8396() {
		return field_a_int > -1 ? var_67dc[field_a_int] : -1;
	}

	private static int sub_83cf() {
		return field_a_int > 0 ? var_67dc[field_a_int - 1] : -1;
	}

	private static int sub_8409() {
		return field_a_int > -1 && field_a_int < 14 ? var_67dc[field_a_int + 1] : -1;
	}

	private static boolean sub_844c(int sub_2b09, int n) {
		boolean b = false;
		if (n > -1) {
			try {
				switch (cGame.var_67dc[n]) {
				case 1: {
					if (sub_2b09 == 0) {
						final String appProperty = GloftGF2M.s_instance.getAppProperty("IAP-EnableIAP");
						if (appProperty != null && appProperty.equals("1") && GLLib.IAP_ParseJADFields()) {
							cGame.s_iapEnabled = true;
						} else {
							cGame.s_iapEnabled = false;
						}
						sub_3021b(true);
						GLLib.sub_5aff();
					}
					if (sub_2b09 == 2) {
						n = GLLib.IsAnyKeyDown();
						if (n == 19 || n == 11) {
							GLLib.s_game_state = -1;
						}
						sub_81e0(2);
					}
					b = false;
					break;
				}
				case 2: {
					if (sub_2b09 == 0) {
						cGame.var_681c = cGame.var_6804;
						sub_b76e();
						GLLib.var_1e17 = 1;
						cGame.var_6a24 = 50;
					}
					if (sub_2b09 == 2) {
						n = GLLib.IsAnyKeyDown();
						if (n == 19 || n == 11) {
							GLLib.s_game_state = -1;
						}
						if (cGame.var_67f4 > 5000) {
							sub_8281(17);
							sub_8281(17);
						} else {
							sub_b7c5();
						}
					}
					if (sub_2b09 == 3) {
						cGame.var_68d4[19].sub_71ae(GLLib.g, 0, 0, 0, 0);
					}
					if (sub_2b09 == 5) {
						GLLib.var_1e17 = -1;
						var_718c = GLLib.s_pack_filename;
						if (var_718c != "") {
							GLLib.Pack_FullyClose();
						}
					}
					b = false;
					break;
				}
				case 4: {
					if (sub_2b09 == 0) {
						sub_1d1a7(0, true);
						if (cGame.var_7fe4 != 7) {
							cGame.var_68bc[0][1][5] = 49;
						}
						GLLib.var_1e17 = 1;
						if (cGame.var_681c == null) {
							switch (cGame.var_6824) {
							case 17: {
								cGame.var_681c = cGame.var_680c;
								break;
							}
							case 36: {
								if (cGame.var_7bac.equals("")) {
									cGame.var_681c = cGame.var_680c;
									break;
								}
								cGame.var_681c = cGame.var_6814;
								break;
							}
							case 5: {
								cGame.var_681c = cGame.var_6804;
								break;
							}
							}
							sub_b76e();
						} else if (cGame.var_718c != null && cGame.var_718c != "") {
							GLLib.Pack_Open(cGame.var_718c);
							cGame.var_718c = "";
						}
						sub_2000c(0, 4, true);
					}
					if (sub_2b09 == 1 && cGame.var_7194) {
						cGame.var_6824 = -1;
						cGame.var_8084 = 0;
						cGame.var_7194 = false;
						sub_8281(17);
					}
					if (sub_2b09 == 5) {
						cGame.var_686c = false;
						GLLib.var_1e17 = -1;
						cGame.var_681c = null;
						if (cGame.var_6824 != -1) {
							sub_81e0(cGame.var_6824);
						}
						cGame.var_683c = false;
						cGame.var_6824 = -1;
					}
					if (sub_2b09 == 2) {
						String sub_4e1f = GLLib.TODO_sub_4e1f(46);
						cGame.var_68cc[0][4] = ((sub_4e1f == null) ? "" : sub_4e1f);
						n = GLLib.IsAnyKeyDown();
						if (n == 19 || n == 11) {
							if (cGame.var_686c) {
								GLLib.s_game_state = -1;
							} else {
								String sub_4e1f2 = GLLib.TODO_sub_4e1f(498);
								sub_4c6b5("Show_Toast_" + ((sub_4e1f2 == null) ? "" : sub_4e1f2));
							}
						}
						sub_b7c5();
						if (cGame.var_683c && cGame.var_6844) {
							cGame.var_67cc = 1;
							sub_2c69b();
						}
					}
					if (sub_2b09 == 3) {
						sub_1dcc1(0);
						if (cGame.var_6834 == 0) {
							n = 416;
						} else {
							if (cGame.var_684c && cGame.var_685c > 0) {
								n = 416 * cGame.var_682c + 1;
								final int n2 = cGame.var_682c + 2 < cGame.var_6834 ? (cGame.var_682c + 2)
										: cGame.var_6834 * 416 / cGame.var_6834;
								if ((n / cGame.var_6834
										+ 416 / cGame.var_6834 * cGame.var_6854 / cGame.var_685c) > n2) {
									n = n2;
								}
							} else {
								n = 416 * (cGame.var_682c + 1) / cGame.var_6834;
							}
							if (n > 416) {
								n = 416;
							}
						}
						GLLib.g.setColor(26856);
						n = cGame.var_68bc[0][3][3];
						GLLib.FillRect(GLLib.g, cGame.var_68bc[0][3][2], n, n, 20, true);
					}
					b = false;
					break;
				}
				case 17: {
					b = sub_3ebe5(sub_2b09);
					break;
				}
				case 18: {
					if ((sub_2b09) == 0) {
						if (cGame.var_7fd4 == 1) {
							cGame.var_7fd4 = 1;
							cGame.var_6c8c = false;
							cGame.var_6c94 = false;
						}
						cGame.var_69fc = false;
					}
					if (sub_2b09 == 1) {
						if (cGame.var_69d4) {
							cGame.var_69d4 = false;
							sub_cc72();
						}
						if (cGame.var_6afc != -1) {
							sub_251a0(cGame.var_6afc);
						} else if (cGame.var_6ab4 != null) {
							sub_245ce(cGame.var_6ab4, false);
						}
						sub_2c69b();
						sub_1fb8e(1);
					}
					boolean b2 = false;
					Label_2355: {
						if (sub_2b09 == 8) {
							if (cGame.var_6aac != null && sub_240db()) {
								b2 = true;
								break Label_2355;
							}
							if (cGame.var_8014 != null) {
								switch (cGame.var_8014.var_17c5) {
								case 49: {
									if (cGame.var_8014.sub_6f71()) {
										b2 = true;
										break Label_2355;
									}
									break;
								}
								}
							} else if (cGame.var_801c != null) {
								switch (cGame.var_801c.var_17c5) {
								case 49: {
									if (cGame.var_801c.sub_6fe6()) {
										b2 = true;
										break Label_2355;
									}
									break;
								}
								}
							} else if (cGame.var_8024 != null) {
								switch (cGame.var_8024.var_17c5) {
								case 49: {
									if (cGame.var_8024.sub_7296()) {
										b2 = true;
										break Label_2355;
									}
									break;
								}
								case 50: {
									if (cGame.var_7fd4 == 54 && cGame.var_8024.var_1835 == 9) {
										cGame.var_6c94 = true;
										sub_23a84(60);
										sub_81e0(8);
										b2 = true;
										break Label_2355;
									}
									if (cGame.var_7fd4 == 49 && cGame.var_8024.var_1835 == 10
											&& cGame.var_8024.sub_a2a0(512)) {
										cGame.var_6c94 = true;
										sub_23a84(51);
										sub_81e0(28);
										b2 = true;
										break Label_2355;
									}
									if (cGame.var_8024.var_1835 == 17) {
										if (cGame.var_8024.sub_a2a0(512)) {
											sub_81e0(25);
											b2 = true;
											break Label_2355;
										}
										break;
									} else {
										if (cGame.var_8024.var_1835 == 14 && cGame.var_8024.sub_a2a0(512)
												&& cGame.var_7fd4 == 23) {
											sub_23a84(37);
											sub_81e0(27);
											b2 = true;
											break Label_2355;
										}
										break;
									}
								}
								case 47: {
									cGame.var_8024.var_172d = true;
									b2 = true;
									break Label_2355;
								}
								case 54: {
									if (cGame.var_7fd4 == 34 && cGame.var_8024.var_1835 == 17) {
										cGame.var_6c94 = true;
									} else if (cGame.var_7fd4 == 17 && cGame.var_8024.var_1835 == 16) {
										cGame.var_6c94 = true;
									} else if (cGame.var_7fd4 == 32 && cGame.var_8024.var_1835 == 17) {
										cGame.var_6c94 = true;
									}
									if (cGame.var_8024.sub_7d78()) {
										b2 = true;
										break Label_2355;
									}
									break;
								}
								}
							}
							if (GLLib.sub_762d() && (cGame.var_7fd4 == 3 || cGame.var_7fd4 == 6
									|| cGame.var_7fd4 == 46 || cGame.var_7fd4 == 48 || cGame.var_7fd4 == 39
									|| cGame.var_7fd4 == 43)) {
								n = GLLib.s_screenX;
								final int var_203f = GLLib.s_screenY;
								final short n7 = cGame.var_68bc[4][2][2];
								final short n8 = cGame.var_68bc[4][2][3];
								if (n >= n7 - 68 && n < n7 + 375 && var_203f > n8 - 20 && var_203f < n8 + 200) {
									cGame.var_6c94 = true;
									b2 = true;
									break Label_2355;
								}
							}
							if (cGame.var_8004 != null && !cGame.var_8004.sub_6533()) {
								cGame.var_800c.sub_67aa();
							}
						}
						if (sub_2b09 == 2) {
							if ((n = GLLib.IsAnyKeyDown()) == 19 || n == 24) {
								if (sub_202b7(1, 37) && sub_20167(1, 37)) {
									sub_10922();
								} else if (n == 19) {
									final String sub_4e1f3;
									sub_4c6b5("Show_Toast_"
											+ (((sub_4e1f3 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f3));
								} else if (n == 24) {
									final String sub_4e1f4;
									sub_4c6b5("Show_Toast_"
											+ (((sub_4e1f4 = GLLib.TODO_sub_4e1f(499)) == null) ? "" : sub_4e1f4));
								}
							}
							sub_253a8();
							if (cGame.var_6c9c != null || cGame.var_6ca4 != -1) {
								sub_27072();
							}
							if (cGame.var_6ccc) {
								final long currentTimeMillis = System.currentTimeMillis();
								if (cGame.var_6d3c != 0L) {
									cGame.var_6d44 += (int) (currentTimeMillis - cGame.var_6d3c);
									n = cGame.var_6cec;
									final int var_6cf4 = cGame.var_6cf4;
									final int var_6cfc = cGame.var_6cfc;
									final int var_6d04 = cGame.var_6d04;
									final int var_6d0c = cGame.var_6d0c;
									final int var_6d5 = cGame.var_6d14;
									if (cGame.var_6d34 == 0) {
										if (cGame.var_6d44 > 50) {
											cGame.var_6d2c += 8;
											cGame.var_6d44 = 0;
										}
										final int sub_2be7 = GLLib.Math_Cos(cGame.var_6d2c);
										cGame.var_6d1c = ((n + var_6cfc) / 2 - (var_6cfc - n) / 2 * sub_2be7 / 256)
												* cGame.var_7fc4 / 100 - cGame.var_800c.var_17cd;
										cGame.var_6d24 = ((var_6cf4 + var_6d04) / 2
												- (var_6d04 - var_6cf4) / 2 * sub_2be7 / 256) * cGame.var_7fc4 / 100
												- cGame.var_800c.var_17d5;
										n = cGame.var_6d2c;
										if (GLLib.Math_Cos(GLLib.Math_Angle90 - n) < 0) {
											cGame.var_6cd4 = false;
										} else {
											cGame.var_6cd4 = true;
										}
									} else if (cGame.var_6d34 == 1) {
										if (cGame.var_6d44 > 50) {
											++cGame.var_6d2c;
											cGame.var_6d44 = 0;
										}
										if (cGame.var_6d2c < 10) {
											cGame.var_6cd4 = true;
											cGame.var_6d1c = (n + (var_6d0c - n) * cGame.var_6d2c / 10)
													* cGame.var_7fc4 / 100 - cGame.var_800c.var_17cd;
											cGame.var_6d24 = (var_6cf4 + (var_6d5 - var_6cf4) * cGame.var_6d2c / 10)
													* cGame.var_7fc4 / 100 - cGame.var_800c.var_17d5;
										} else if (cGame.var_6d2c < 20) {
											cGame.var_6cd4 = true;
											cGame.var_6d1c = (var_6d0c
													+ (var_6cfc - var_6d0c) * (cGame.var_6d2c - 10) / 10)
													* cGame.var_7fc4 / 100 - cGame.var_800c.var_17cd;
											cGame.var_6d24 = (var_6d5
													+ (var_6d04 - var_6d5) * (cGame.var_6d2c - 10) / 10)
													* cGame.var_7fc4 / 100 - cGame.var_800c.var_17d5;
										} else if (cGame.var_6d2c < 30) {
											cGame.var_6cd4 = false;
										} else {
											cGame.var_6d2c = 0;
											cGame.var_6cd4 = false;
										}
									}
								}
								cGame.var_6d3c = currentTimeMillis;
							}
							sub_23dba();
							sub_273b8();
						}
						if (sub_2b09 == 3 && !cGame.s_clickblocked) {
							Class_f.sub_3bcd();
							sub_29ee2();
							sub_25129();
							sub_1dcc1(1);
							sub_2657c(false);
							sub_26716();
							if (cGame.var_6bec) {
								cGame.var_68d4[cGame.var_6bf4].sub_71ae(GLLib.g, cGame.var_6bfc,
										cGame.var_6c04, cGame.var_6c0c, 0);
							}
							if (cGame.var_6ccc && cGame.var_6cd4) {
								cGame.var_68d4[17].sub_71ae(GLLib.g, 1, cGame.var_6d1c, cGame.var_6d24,
										0);
								if (cGame.var_6d34 == 1) {
									cGame.var_68d4[cGame.var_6cdc].sub_71ae(GLLib.g, cGame.var_6ce4,
											cGame.var_6d1c, cGame.var_6d24, 0);
								}
							}
						}
						if (sub_2b09 == 4) {
							sub_10e3f(false, 0, cGame.var_6b04);
						}
						b2 = false;
					}
					b = b2;
					break;
				}
				case 7: {
					b = sub_30df7(sub_2b09);
					break;
				}
				case 8: {
					b = sub_32880(sub_2b09);
					break;
				}
				case 9: {
					if ((sub_2b09) == 1) {
						cGame.var_68ac = 100;
						sub_37750();
						sub_2c69b();
						sub_1fb8e(6);
					}
					if (sub_2b09 == 5) {
						sub_2c69b();
						sub_1fb8e(6);
						sub_239ef(6);
						cGame.var_742c = 0;
						sub_2000c(6, 32, cGame.var_7424 = false);
					}
					if (sub_2b09 == 2) {
						if ((n = GLLib.IsAnyKeyDown()) == 19 || n == 11) {
							if (cGame.var_6c5c == 160) {
								sub_14108();
							} else {
								final String sub_4e1f5;
								sub_4c6b5("Show_Toast_"
										+ (((sub_4e1f5 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f5));
							}
						}
						sub_d841(1);
						if (cGame.var_7fd4 != -1) {
							sub_273b8();
						}
						if (cGame.var_7424) {
							final int n9 = ++cGame.var_742c;
							cGame.var_7434 = n9 * n9;
							cGame.var_68bc[6][32][2] = (short) (cGame.var_68bc[6][21][2] + cGame.var_7434);
							cGame.var_68bc[6][32][3] = (short) (cGame.var_68bc[6][21][3] - 10 * cGame.var_742c);
							if (cGame.var_742c > 50 || cGame.var_68bc[6][32][2] > GLLib.s_screenWidth) {
								cGame.var_742c = 0;
								cGame.var_7424 = false;
								cGame.var_7434 = 0;
								sub_2000c(6, 32, false);
							}
						}
						if (cGame.var_76a4) {
							++cGame.var_76ac;
							if (cGame.var_76b4 == '\u0001' && cGame.var_691c[cGame.var_76bc] == null) {
								cGame.var_76b4 = '\u0002';
								sub_2000c(6, 33, true);
								sub_2024d(6, 33, true);
								sub_2c69b();
								sub_1fb8e(6);
							}
							if (cGame.var_76b4 == '\u0002' && cGame.var_76ac > 50) {
								cGame.var_76b4 = '\u0003';
								cGame.var_76bc = (char) sub_23556(393249, 393250, 0, 0, 300, 0, 500);
							}
							if (cGame.var_76b4 == '\u0003' && cGame.var_691c[cGame.var_76bc] == null) {
								cGame.var_76a4 = false;
								cGame.var_76ac = 0;
								cGame.var_76b4 = '\0';
								sub_2000c(6, 33, false);
								sub_2024d(6, 33, false);
								sub_2c69b();
								sub_1fb8e(6);
							}
						}
					}
					if (sub_2b09 == 3) {
						sub_1dcc1(6);
						final String sub_4e1f6;
						sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(388)) == null) ? "" : sub_4e1f6, 6, 30, 0, 0);
						final String sub_4e1f7;
						sub_1e2f2(((sub_4e1f7 = GLLib.TODO_sub_4e1f(cGame.var_7654)) == null) ? "" : sub_4e1f7, 6, 4, 0,
								0);
						sub_1df06(Integer.toString(cGame.var_7694) + " / " + cGame.var_7674, 6, 6, 0, 0);
						sub_1df06("+", 6, 13, 0, 0);
						final String sub_4e1f8;
						sub_1e2f2(((sub_4e1f8 = GLLib.TODO_sub_4e1f(cGame.var_765c)) == null) ? "" : sub_4e1f8, 6, 9, 0,
								0);
						sub_1df06(Integer.toString(cGame.var_769c) + " / " + cGame.var_767c, 6, 11, 0, 0);
						if (sub_20167(6, 7)) {
							sub_1df06(Integer.toString(cGame.var_7684), 6, 15, 0, 0);
						}
						if (sub_20167(6, 12)) {
							sub_1df06(Integer.toString(cGame.var_768c), 6, 16, 0, 0);
						}
						sub_1df06("=", 6, 14, 0, 0);
						final String sub_4e1f9;
						sub_1e2f2(((sub_4e1f9 = GLLib.TODO_sub_4e1f(cGame.var_762c)) == null) ? "" : sub_4e1f9, 6, 20, 0,
								0);
						sub_1df06("+" + cGame.var_7614, 6, 23, 0, 0);
						sub_1df06(cGame.var_7624, 6, 25, 0, 0);
						final String sub_4e1f10;
						sub_1df06(((sub_4e1f10 = GLLib.TODO_sub_4e1f(387)) == null) ? "" : sub_4e1f10, 6, 27, 0, 0);
						if (cGame.var_76a4) {
							final String sub_4e1f11;
							sub_1df06((((sub_4e1f11 = GLLib.TODO_sub_4e1f(188)) == null) ? "" : sub_4e1f11) + " "
									+ cGame.var_751c + "/" + cGame.var_7514, 6, 34, 0, 0);
						}
					}
					b = false;
					break;
				}
				case 10: {
					if ((sub_2b09) == 0) {
						sub_2c69b();
						sub_1fb8e(7);
						cGame.var_68ac = 100;
						cGame.var_7464 = cGame.var_7304;
					}
					if (sub_2b09 == 1) {
						sub_33c10();
						sub_34199(false);
						sub_2024d(7, 42, true);
						sub_2c69b();
						sub_1fb8e(7);
					}
					if (sub_2b09 == 5) {
						if (cGame.var_7464 >= '\0' && cGame.var_7464 <= '\u0002') {
							cGame.var_7304 = cGame.var_7464;
						}
						sub_2024d(7, 35, false);
						sub_2024d(7, 42, false);
						sub_2024d(7, 17, false);
						sub_2024d(7, 39, false);
						sub_2000c(7, 39, false);
						cGame.var_730c = '\0';
						cGame.var_745c = 0;
						sub_2c69b();
						sub_1fb8e(7);
						sub_239ef(7);
						cGame.var_742c = 0;
						sub_2000c(7, 40, cGame.var_7424 = false);
					}
					if (sub_2b09 == 2) {
						if ((n = GLLib.IsAnyKeyDown()) == 19 || n == 11) {
							sub_144e1();
						}
						sub_d841(1);
						if (cGame.var_6c54) {
							sub_26c8e();
						}
						if (cGame.var_7424) {
							final int n10 = ++cGame.var_742c;
							cGame.var_7434 = n10 * n10;
							cGame.var_68bc[7][40][2] = (short) (cGame.var_68bc[7][28][2] + cGame.var_7434);
							cGame.var_68bc[7][40][3] = (short) (cGame.var_68bc[7][28][3] - 10 * cGame.var_742c);
							if (cGame.var_742c > 50 || cGame.var_68bc[7][40][2] > GLLib.s_screenWidth) {
								cGame.var_742c = 0;
								cGame.var_7424 = false;
								cGame.var_7434 = 0;
								sub_2000c(7, 40, false);
							}
						}
						if (cGame.var_743c) {
							++cGame.var_7444;
							if (cGame.var_744c == '\u0001' && cGame.var_691c[cGame.var_7454] == null) {
								cGame.var_744c = '\u0002';
								sub_2000c(7, 47, true);
								sub_2024d(7, 47, true);
								sub_2c69b();
								sub_1fb8e(7);
							}
							if (cGame.var_744c == '\u0002' && cGame.var_7444 > 50) {
								cGame.var_744c = '\u0003';
								cGame.var_7454 = (char) sub_23556(458799, 458800, 0, 0, 300, 0, 500);
							}
							if (cGame.var_744c == '\u0003' && cGame.var_691c[cGame.var_7454] == null) {
								cGame.var_743c = false;
								cGame.var_7444 = 0;
								cGame.var_744c = '\0';
								sub_2000c(7, 47, false);
								sub_2024d(7, 47, false);
								sub_2c69b();
								sub_1fb8e(7);
							}
						}
					}
					if (sub_2b09 == 3) {
						sub_1dcc1(7);
						final String sub_4e1f12;
						sub_1df06(((sub_4e1f12 = GLLib.TODO_sub_4e1f(180)) == null) ? "" : sub_4e1f12, 7, 41, 0, 0);
						final String sub_4e1f13;
						sub_1e2f2(((sub_4e1f13 = GLLib.TODO_sub_4e1f(cGame.var_73c4)) == null) ? "" : sub_4e1f13, 7, 4,
								0, 0);
						sub_1df06(Integer.toString(cGame.var_7404) + " / " + cGame.var_73e4, 7, 6, 0, 0);
						sub_1df06("+", 7, 13, 0, 0);
						final String sub_4e1f14;
						sub_1e2f2(((sub_4e1f14 = GLLib.TODO_sub_4e1f(cGame.var_73cc)) == null) ? "" : sub_4e1f14, 7, 9,
								0, 0);
						sub_1df06(Integer.toString(cGame.var_740c) + " / " + cGame.var_73ec, 7, 11, 0, 0);
						if (sub_20167(7, 7)) {
							sub_1df06(Integer.toString(cGame.var_73f4), 7, 20, 0, 0);
						}
						if (sub_20167(7, 12)) {
							sub_1df06(Integer.toString(cGame.var_73fc), 7, 21, 0, 0);
						}
						final String sub_4e1f15;
						sub_1e2f2(((sub_4e1f15 = GLLib.TODO_sub_4e1f(185)) == null) ? "" : sub_4e1f15, 7, 15, 0, 0);
						sub_1df06(Integer.toString(cGame.var_7064), 7, 18, 0, 0);
						sub_1df06("=", 7, 19, 0, 0);
						final String sub_4e1f16;
						sub_1e2f2(((sub_4e1f16 = GLLib.TODO_sub_4e1f(cGame.var_739c)) == null) ? "" : sub_4e1f16, 7, 27,
								0, 0);
						sub_1df06("+" + GLLib.CurrencySeparator_just_a_guess(cGame.var_737c, cGame.var_7fe4, " "), 7, 30, 0, 0);
						sub_1df06("+" + GLLib.CurrencySeparator_just_a_guess(cGame.var_7384, cGame.var_7fe4, " "), 7, 32, 0, 0);
						sub_1df06(cGame.var_7394, 7, 34, 0, 0);
						final String sub_4e1f17;
						sub_1df06(((sub_4e1f17 = GLLib.TODO_sub_4e1f(387)) == null) ? "" : sub_4e1f17, 7, 36, 0, 0);
						if (cGame.var_743c) {
							final String sub_4e1f18;
							sub_1df06((((sub_4e1f18 = GLLib.TODO_sub_4e1f(188)) == null) ? "" : sub_4e1f18) + " "
									+ cGame.var_747c + "/" + cGame.var_746c, 7, 48, 0, 0);
						}
						if (cGame.var_741c && (cGame.var_68bc[7][43][17] > -1 && cGame.var_68bc[7][43][17] < 30
								&& (cGame.var_68ec[cGame.var_68bc[7][43][17]] != null
										&& cGame.var_68ec[cGame.var_68bc[7][43][17]].sub_1b34()))) {
							cGame.var_7ff4[138].sub_71ae(GLLib.g, 11, 555, 194, 0);
						}
					}
					b = false;
					break;
				}
				case 11: {
					b = sub_3423e(sub_2b09);
					break;
				}
				case 27: {
					b = sub_35c3d(sub_2b09);
					break;
				}
				case 28: {
					b = sub_37b49(sub_2b09);
					break;
				}
				case 29: {
					b = sub_38850(sub_2b09);
					break;
				}
				case 30: {
					if ((sub_2b09) == 0) {
						cGame.var_68c4[14][54][5] = 1135;
						sub_2000c(14, 54, true);
						cGame.var_68c4[14][55][5] = 1128;
						cGame.var_68c4[14][55][6] = 0;
						sub_2000c(14, 55, true);
						cGame.var_68c4[14][56][5] = 1128;
						cGame.var_68c4[14][56][6] = 3;
						sub_2000c(14, 56, true);
						cGame.var_68c4[14][57][5] = 1128;
						cGame.var_68c4[14][57][5] = 2;
						sub_2000c(14, 57, true);
						cGame.var_68c4[14][58][5] = 1127;
						sub_2000c(14, 58, false);
						cGame.var_68c4[14][59][5] = 1131;
						sub_2000c(14, 59, false);
						cGame.var_68c4[14][60][5] = 1129;
						sub_2000c(14, 60, false);
						cGame.var_68c4[14][61][5] = 1128;
						cGame.var_68c4[14][61][6] = 1;
						sub_2000c(14, 61, true);
						cGame.var_68c4[14][62][5] = 1132;
						sub_2000c(14, 62, false);
						cGame.var_68c4[14][63][5] = 1133;
						sub_2000c(14, 63, false);
						cGame.var_68c4[14][64][5] = 1134;
						sub_2000c(14, 64, false);
						cGame.var_68c4[14][65][5] = 1137;
						sub_2000c(14, 65, false);
						sub_1daf4(14);
						sub_2c69b();
						sub_1fb8e(14);
						cGame.var_68ac = 100;
					}
					if (sub_2b09 == 1) {
						if (cGame.var_808c == 0) {
							final String sub_4e1f19;
							cGame.var_783c = (((sub_4e1f19 = GLLib.TODO_sub_4e1f(243)) == null) ? "" : sub_4e1f19);
						} else if (cGame.var_808c == 1) {
							final String sub_4e1f20;
							cGame.var_783c = (((sub_4e1f20 = GLLib.TODO_sub_4e1f(244)) == null) ? "" : sub_4e1f20);
						} else if (cGame.var_808c == 2) {
							final String sub_4e1f21;
							cGame.var_783c = (((sub_4e1f21 = GLLib.TODO_sub_4e1f(245)) == null) ? "" : sub_4e1f21);
						} else if (cGame.var_808c == 3) {
							final String sub_4e1f22;
							cGame.var_7834 = (((sub_4e1f22 = GLLib.TODO_sub_4e1f(251)) == null) ? "" : sub_4e1f22);
						} else if (cGame.var_808c == 4) {
							final String sub_4e1f23;
							cGame.var_7834 = (((sub_4e1f23 = GLLib.TODO_sub_4e1f(252)) == null) ? "" : sub_4e1f23);
						} else if (cGame.var_808c == 5) {
							final String sub_4e1f24;
							cGame.var_7834 = (((sub_4e1f24 = GLLib.TODO_sub_4e1f(253)) == null) ? "" : sub_4e1f24);
						} else if (cGame.var_808c == 6) {
							final String sub_4e1f25;
							cGame.var_7834 = (((sub_4e1f25 = GLLib.TODO_sub_4e1f(254)) == null) ? "" : sub_4e1f25);
						} else if (cGame.var_808c == 7) {
							final String sub_4e1f26;
							cGame.var_7834 = (((sub_4e1f26 = GLLib.TODO_sub_4e1f(255)) == null) ? "" : sub_4e1f26);
						} else if (cGame.var_808c == 8) {
							final String sub_4e1f27;
							cGame.var_7834 = (((sub_4e1f27 = GLLib.TODO_sub_4e1f(256)) == null) ? "" : sub_4e1f27);
						}
						n = sub_df89(cGame.var_808c + 1);
						final Class_h class_h;
						cGame.var_781c = (class_h = Class_h.var_6a[3]).var_82[n][12];
						cGame.var_7824 = class_h.var_82[n][22];
						cGame.var_782c = class_h.var_82[n][21] * 60;
						if (cGame.var_77f4 == 0 || cGame.var_77f4 == 1) {
							sub_3a73b(cGame.var_77f4 = 1);
							sub_3a485();
							if (cGame.var_808c == 0) {
								sub_2000c(14, 76, true);
							} else {
								sub_2000c(14, 76, false);
							}
							n = (sub_3a230(cGame.var_77ec) ? 1 : 0);
							final boolean sub_3a383 = sub_3a383();
							sub_2000c(14, 7, (boolean) (n != 0));
							if (cGame.var_77dc = (n != 0 && sub_3a383)) {
								cGame.var_68bc[14][10][5] = 20;
								cGame.var_68bc[14][10][6] = 89;
								cGame.var_68bc[14][10][20] = 1;
								cGame.var_68bc[14][11][8] = 2;
								sub_2024d(14, 10, true);
							} else {
								cGame.var_68bc[14][10][5] = 20;
								cGame.var_68bc[14][10][6] = 177;
								cGame.var_68bc[14][10][20] = -1;
								cGame.var_68bc[14][11][8] = 3;
								sub_2024d(14, 10, true);
							}
							sub_2000c(14, 67, true);
							sub_2024d(14, 67, true);
							cGame.var_68cc[14][4] = cGame.var_784c;
							sub_1f8c5(14);
							sub_3a966(false);
							if (cGame.var_77dc && cGame.var_808c == 0) {
								sub_2000c(14, 53, false);
								sub_2024d(14, 53, false);
							} else {
								sub_2000c(14, 53, true);
								sub_2024d(14, 53, true);
							}
							sub_2c69b();
							sub_1f8c5(14);
						} else if (cGame.var_77f4 == 2 || cGame.var_77f4 == 3) {
							sub_3a73b(cGame.var_77f4);
							sub_3a485();
						}
					}
					if (sub_2b09 == 5) {
						sub_d7d7(1);
						sub_239ef(14);
					}
					if (sub_2b09 == 2) {
						if ((n = GLLib.IsAnyKeyDown()) == 19 || n == 11) {
							if (cGame.var_6c5c == 160) {
								sub_195c5();
							} else {
								final String sub_4e1f28;
								sub_4c6b5("Show_Toast_"
										+ (((sub_4e1f28 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f28));
							}
						}
						if (cGame.var_6c54) {
							sub_26c8e();
						}
						switch (cGame.var_77f4) {
						case 2: {
							final long n11 = System.currentTimeMillis() / 1000L;
							long n12 = 0L;
							if (cGame.var_7824 > 0) {
								n12 = cGame.var_77bc + cGame.var_77fc
										- sub_3a1d6() * cGame.var_77fc / cGame.var_7824 - n11;
							}
							if (n12 > 0L) {
								cGame.var_7804 = sub_dceb((int) n12);
								cGame.var_780c = sub_e1e7((int) n12);
								break;
							}
							cGame.var_7804 = "00:00:00";
							sub_2000c(14, 18, false);
							sub_2024d(14, 18, false);
							sub_2000c(14, 19, false);
							if (!sub_20167(14, 47)) {
								sub_2000c(14, 47, true);
								sub_2024d(14, 47, true);
							}
							sub_2c69b();
							sub_1f8c5(14);
							cGame.var_780c = sub_e1e7(0);
							break;
						}
						case 3: {
							cGame.var_7804 = "00:00:00";
							sub_2000c(14, 18, false);
							sub_2024d(14, 18, false);
							sub_2000c(14, 19, false);
							if (!sub_20167(14, 47)) {
								sub_2000c(14, 47, true);
								sub_2024d(14, 47, true);
								sub_2c69b();
								sub_1f8c5(14);
								break;
							}
							break;
						}
						}
						sub_d841(1);
					}
					if (sub_2b09 == 3) {
						if (cGame.var_77f4 == 1) {
							sub_2000c(14, 4, true);
							sub_2000c(14, 5, true);
						} else {
							sub_2000c(14, 4, false);
							sub_2000c(14, 5, false);
						}
						sub_1dcc1(14);
						switch (cGame.var_77f4) {
						case 1: {
							final String sub_4e1f29;
							sub_1df06(((sub_4e1f29 = GLLib.TODO_sub_4e1f(284)) == null) ? "" : sub_4e1f29, 14, 1, 0, 0);
							final String sub_4e1f30;
							sub_1df06(((sub_4e1f30 = GLLib.TODO_sub_4e1f(cGame.var_77d4)) == null) ? "" : sub_4e1f30, 14,
									2, 0, 0);
							sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_77e4, cGame.var_7fe4, " "), 14, 12, 0, 0);
							final String sub_4e1f31;
							sub_1e2f2(((sub_4e1f31 = GLLib.TODO_sub_4e1f(285)) == null) ? "" : sub_4e1f31, 14, 11, 0, 0);
							if (!sub_20167(14, 66)) {
								break;
							}
							sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_781c, cGame.var_7fe4, " "), 14, 72, 0, 0);
							if (cGame.var_808c < 3) {
								sub_1e2f2(cGame.var_783c, 14, 75, 0, 0);
							} else {
								sub_1e2f2(cGame.var_7834, 14, 71, 0, 0);
							}
							if (cGame.var_782c > 0) {
								sub_1df06(sub_dceb(cGame.var_782c), 14, 73, 0, 0);
								break;
							}
							break;
						}
						case 2: {
							final String sub_4e1f32;
							sub_1df06(((sub_4e1f32 = GLLib.TODO_sub_4e1f(284)) == null) ? "" : sub_4e1f32, 14, 1, 0, 0);
							final String sub_4e1f33;
							sub_1df06(((sub_4e1f33 = GLLib.TODO_sub_4e1f(279)) == null) ? "" : sub_4e1f33, 14, 16, 0, 0);
							sub_1df06(cGame.var_7804, 14, 17, 0, 0);
							if (sub_20167(14, 18)) {
								sub_1df06("" + cGame.var_780c, 14, 20, 0, 0);
							}
							if (sub_20167(14, 47)) {
								final String sub_4e1f34;
								sub_1df06(((sub_4e1f34 = GLLib.TODO_sub_4e1f(250)) == null) ? "" : sub_4e1f34, 14, 48, 0,
										0);
							}
							break;
						}
						case 3: {
							final String sub_4e1f35;
							sub_1df06(((sub_4e1f35 = GLLib.TODO_sub_4e1f(284)) == null) ? "" : sub_4e1f35, 14, 1, 0, 0);
							final String sub_4e1f36;
							sub_1df06(((sub_4e1f36 = GLLib.TODO_sub_4e1f(279)) == null) ? "" : sub_4e1f36, 14, 16, 0, 0);
							sub_1df06(cGame.var_7804, 14, 17, 0, 0);
							if (sub_20167(14, 47)) {
								final String sub_4e1f37;
								sub_1df06(((sub_4e1f37 = GLLib.TODO_sub_4e1f(250)) == null) ? "" : sub_4e1f37, 14, 48, 0,
										0);
								break;
							}
							break;
						}
						}
					}
					if (sub_2b09 == 6) {
						sub_3a73b(cGame.var_77f4);
					}
					b = false;
					break;
				}
				case 12: {
					if ((sub_2b09) == 1) {
						sub_d76c();
						sub_28cd9();
						sub_1ffee();
						sub_1fb8e(11);
						sub_23a84(60);
					}
					if (sub_2b09 == 5) {
						cGame.var_6d64 = -1;
						cGame.var_6d6c = null;
						sub_d7d7(1);
						if (cGame.var_7854) {
							sub_118c5(true);
							sub_10cd1(true);
							if (cGame.var_6e0c) {
								sub_2000c(1, 37, true);
								sub_2024d(1, 37, true);
							}
							if (cGame.var_6e14) {
								sub_2000c(1, 28, true);
								sub_2024d(1, 28, true);
								sub_2000c(1, 29, true);
							}
						}
						if (cGame.var_785c) {
							sub_4052e(493, 494, 26, 0);
						} else if (cGame.var_7864) {
							sub_4052e(493, 495, 26, 0);
						}
						cGame.var_785c = false;
						cGame.var_7864 = false;
						sub_239ef(11);
					}
					if (sub_2b09 == 2) {
						n = GLLib.IsAnyKeyDown();
						if (cGame.var_6d64 == 0) {
							if (n == 19) {
								sub_18b4a();
							}
							sub_d841(1);
						} else if (cGame.var_6d64 == 1) {
							if (!cGame.var_6d6c.sub_1b34()) {
								if (n == 19) {
									final String sub_4e1f38;
									sub_4c6b5("Show_Toast_"
											+ (((sub_4e1f38 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f38));
								}
								if (cGame.var_800c.var_185d != 0) {
									sub_253a8();
								} else {
									cGame.var_6d6c.sub_1ca1(GLLib.s_game_frameDT);
									final int[] array = new int[2];
									final int[] array2 = new int[2];
									final int[] array3 = new int[2];
									array2[0] = cGame.var_6d74 + cGame.var_6d84 >> 1;
									array2[1] = cGame.var_6d7c + cGame.var_6d8c >> 1;
									sub_2c8b0(array2, array);
									array3[0] = array[0] * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5b8b(0);
									array3[1] = array[1] * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5c0b(0);
									cGame.var_6d6c.SetPos(array3[0], array3[1]);
								}
							} else {
								sub_834e();
							}
						}
					}
					if (sub_2b09 == 3) {
						switch (cGame.var_6d64) {
						case 0: {
							sub_1dcc1(11);
							final String sub_4e1f39;
							sub_1df06(((sub_4e1f39 = GLLib.TODO_sub_4e1f(298)) == null) ? "" : sub_4e1f39, 11, 3, 0, 0);
							final String sub_4e1f40;
							sub_1df06(((sub_4e1f40 = GLLib.TODO_sub_4e1f(312 + (cGame.var_6d54 - 1))) == null) ? ""
									: sub_4e1f40, 11, 4, 0, 0);
							if (!cGame.var_6dfc[cGame.var_6d54]) {
								n = ((getIntValue(cGame.var_6dac) > getIntValue(cGame.var_6da4))
										? getIntValue(cGame.var_6da4)
										: getIntValue(cGame.var_6dac));
								sub_1e2f2("" + n + " / " + getIntValue(cGame.var_6da4), 11, 11, 0, 0);
							}
							if (!cGame.var_6e04[cGame.var_6d54]) {
								n = ((getIntValue(cGame.var_6dbc) > getIntValue(cGame.var_6db4))
										? getIntValue(cGame.var_6db4)
										: getIntValue(cGame.var_6dbc));
								sub_1e2f2("" + n + " / " + getIntValue(cGame.var_6db4), 11, 12, 0, 0);
							}
							final String sub_4e1f41;
							sub_1e2f2(((sub_4e1f41 = GLLib.TODO_sub_4e1f(cGame.var_6ddc)) == null) ? "" : sub_4e1f41, 11,
									14, 0, 0);
							final String sub_4e1f42;
							sub_1e2f2(((sub_4e1f42 = GLLib.TODO_sub_4e1f(cGame.var_6de4)) == null) ? "" : sub_4e1f42, 11,
									15, 0, 0);
							final String sub_4e1f43;
							sub_1e2f2(((sub_4e1f43 = GLLib.TODO_sub_4e1f(312 + (cGame.var_6d54 - 1) - 1)) == null) ? ""
									: sub_4e1f43, 11, 13, 0, 0);
							sub_1df06(
									GLLib.CurrencySeparator_just_a_guess(sub_301eb(cGame.var_6d9c), cGame.var_7fe4, " ") + " / "
											+ GLLib.CurrencySeparator_just_a_guess(sub_301eb(cGame.var_6d94), cGame.var_7fe4, " "),
									11, 32, 0, 0);
							if (!sub_2a117()) {
								final String sub_4e1f44;
								sub_1df06(((sub_4e1f44 = GLLib.TODO_sub_4e1f(324 + cGame.var_6d54 - 1)) == null) ? ""
										: sub_4e1f44, 11, 35, 0, 0);
							} else {
								if (!cGame.var_6dfc[cGame.var_6d54]
										&& getIntValue(cGame.var_6dac) < getIntValue(cGame.var_6da4)) {
									sub_1e2f2("" + getIntValue(cGame.var_6dc4), 11, 25, 0, 0);
								}
								if (!cGame.var_6e04[cGame.var_6d54]
										&& getIntValue(cGame.var_6dbc) < getIntValue(cGame.var_6db4)) {
									sub_1e2f2("" + getIntValue(cGame.var_6dcc), 11, 26, 0, 0);
								}
							}
							if (cGame.var_6dd4) {
								final String sub_4e1f45;
								sub_1df06(((sub_4e1f45 = GLLib.TODO_sub_4e1f(297)) == null) ? "" : sub_4e1f45, 11, 7, 0,
										0);
								break;
							}
							break;
						}
						case 1: {
							sub_2534f();
							sub_2657c(false);
							break;
						}
						}
					}
					b = false;
					break;
				}
				case 13: {
					b = sub_3ba87(sub_2b09);
					break;
				}
				case 15: {
					b = sub_3b305(sub_2b09);
					break;
				}
				case 16: {
					b = sub_3a9f7(sub_2b09);
					break;
				}
				case 14: {
					b = sub_3c2a9(sub_2b09);
					break;
				}
				case 21: {
					if ((sub_2b09) == 0) {
						cGame.var_8054 = GLLib.sub_5307(cGame.var_8054,
								new String[] { GLLib.s_application.getAppProperty("GameVer") });
						cGame.var_805c = cGame.var_7ffc[0].sub_4ac6(cGame.var_8054, GLLib.s_screenWidth - 20, false);
						cGame.var_682c = GLLib.s_screenHeight - 32;
					}
					if (sub_2b09 == 2) {
						n = GLLib.WasAnyKeyPressed();
						int n13 = 2;
						if (n == 19) {
							sub_834e();
						} else if (n == 18 || n == 5 || n == 11) {
							n13 = 4;
						}
						if (cGame.var_682c > 30) {
							cGame.var_682c -= n13;
						}
					}
					if (sub_2b09 == 3) {
						GLLib.g.setColor(0);
						GLLib.FillRect(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
						cGame.var_7ffc[0].sub_6434(1);
						cGame.var_7ffc[0].sub_547f(GLLib.g, cGame.var_8054, cGame.var_805c,
								GLLib.s_screenWidth >> 1, cGame.var_682c, 0, 999, 17, -1, false);
						GLLib.sub_7018(GLLib.s_screenHeight >> 1, GLLib.s_screenWidth, GLLib.s_screenHeight >> 1, -16777216);
					}
					b = false;
					break;
				}
				case 19: {
					b = sub_3fc6c(sub_2b09);
					break;
				}
				case 36: {
					b = sub_407ce(sub_2b09);
					break;
				}
				case 37: {
					b = sub_41bf9(sub_2b09);
					break;
				}
				case 38: {
					b = sub_40dc7(sub_2b09);
					break;
				}
				case 35: {
					b = sub_428d1(sub_2b09);
					break;
				}
				case 31: {
					b = sub_3ced3(sub_2b09);
					break;
				}
				case 32: {
					b = sub_3dea3(sub_2b09);
					break;
				}
				case 39: {
					b = sub_3e804(sub_2b09);
					break;
				}
				case 44: {
					final int n14;
					if ((n14 = sub_2b09) == 0) {
						sub_23d73();
						final String sub_4e1f46;
						IGP.enterIGP(((sub_4e1f46 = GLLib.TODO_sub_4e1f(46)) == null) ? "" : sub_4e1f46, 0);
					}
					if (n14 == 2) {
						sub_2b09 = GLLib.IsAnyKeyDown();
						n = 0;
						switch (sub_2b09) {
						case 3:
						case 10: {
							n = 23;
							break;
						}
						case 4:
						case 12: {
							n = 24;
							break;
						}
						case 1:
						case 8: {
							n = 21;
							break;
						}
						case 2:
						case 14: {
							n = 32;
							break;
						}
						case 19: {
							n = 26;
							break;
						}
						case 5:
						case 11: {
							n = 25;
							break;
						}
						}
						if (IGP.sub_3b75(n)) {
							cGame.var_67cc = 1;
							sub_2c69b();
						}
					}
					if (n14 == 3) {
						IGP.sub_4f8f(GLLib.g);
					}
					if (n14 == 6) {
						IGP.sub_3b06(false);
					}
					if (n14 == 7) {
						IGP.sub_3b06(true);
					}
					b = false;
					break;
				}
				case 42: {
					b = sub_43b80(sub_2b09);
					break;
				}
				case 3: {
					if (sub_2b09 == 2) {
						sub_81e0(5);
					}
					b = false;
					break;
				}
				case 34: {
					b = sub_44db4(sub_2b09);
					break;
				}
				case 26: {
					b = sub_48824(sub_2b09);
					break;
				}
				case 25: {
					b = sub_46ec6(sub_2b09);
					break;
				}
				default: {
					new StringBuffer().append("State [").append(cGame.var_67dc[n])
							.append("] is undefined. Message sent was: ").append(sub_2b09);
					break;
				}
				}
			} catch (final Exception ex) {
			}
		}
		return b;
	}

	private static boolean sub_b442() {
		return sub_844c(8, cGame.field_a_int);
	}

	private static void sub_b465() {
		if (cGame.var_67cc != -1) {
			if (cGame.var_67cc == 0) {
				cGame.var_67cc = -1;
				if (cGame.field_a_int > -1) {
					sub_844c(4, cGame.field_a_int);
				}
				++cGame.field_a_int;
				cGame.var_67dc[cGame.field_a_int] = cGame.var_67c4;
				cGame.var_67c4 = -1;
				if (cGame.var_67dc[cGame.field_a_int] != 1) {
					sub_1c7ce(cGame.var_67dc[cGame.field_a_int]);
				}
				sub_844c(0, cGame.field_a_int);
				sub_844c(1, cGame.field_a_int);
			} else if (cGame.var_67cc == 1) {
				cGame.var_67cc = -1;
				sub_844c(4, cGame.field_a_int);
				sub_844c(5, cGame.field_a_int);
				sub_1cd44(cGame.var_67dc[cGame.field_a_int]);
				if (--cGame.field_a_int > -1) {
					sub_1c7ce(cGame.var_67dc[cGame.field_a_int]);
					sub_844c(1, cGame.field_a_int);
				}
			} else if (cGame.var_67cc == 2) {
				cGame.var_67cc = -1;
				while (cGame.field_a_int >= 0) {
					sub_844c(5, cGame.field_a_int);
					sub_1cd44(cGame.var_67dc[cGame.field_a_int]);
					--cGame.field_a_int;
				}
				++cGame.field_a_int;
				cGame.var_6824 = cGame.var_67c4;
				sub_1c7ce(cGame.var_67dc[cGame.field_a_int] = 4);
				sub_844c(0, cGame.field_a_int);
				sub_844c(1, cGame.field_a_int);
			} else if (cGame.var_67cc == 3) {
				cGame.var_67cc = -1;
				sub_844c(4, cGame.field_a_int);
				sub_844c(5, cGame.field_a_int);
				sub_1cd44(cGame.var_67dc[cGame.field_a_int]);
				cGame.var_67dc[cGame.field_a_int] = cGame.var_67c4;
				cGame.var_67c4 = -1;
				sub_1c7ce(cGame.var_67dc[cGame.field_a_int]);
				sub_844c(0, cGame.field_a_int);
				sub_844c(1, cGame.field_a_int);
			} else if (cGame.var_67cc == 4) {
				cGame.var_67cc = -1;
				sub_844c(4, cGame.field_a_int);
				while (cGame.field_a_int >= 0 && cGame.var_67dc[cGame.field_a_int] != cGame.var_67c4) {
					sub_844c(5, cGame.field_a_int);
					sub_1cd44(cGame.var_67dc[cGame.field_a_int]);
					--cGame.field_a_int;
				}
				cGame.var_67dc[cGame.field_a_int] = cGame.var_67c4;
				cGame.var_67c4 = -1;
				if (cGame.field_a_int > -1) {
					sub_1c7ce(cGame.var_67dc[cGame.field_a_int]);
					sub_844c(1, cGame.field_a_int);
				}
			}
			sub_4c5ea();
		}
	}

	private static void sub_b693() {
		int i;
		for (i = cGame.field_a_int; i > 0; --i) {
			final int n = cGame.var_67dc[i];
			if ((cGame.var_67e4[n >> 3] & 1 << (n & 0x7)) != 0x0) {
				break;
			}
		}
		while (i <= cGame.field_a_int) {
			sub_844c(3, i);
			++i;
		}
		if (cGame.var_68e4 != null) {
			for (int j = 0; j < 200; ++j) {
				if ((cGame.var_68e4[j] & 0x1) == 0x0) {
					cGame.var_68dc[j] = null;
				} else {
					var_68e4[j] = (byte) (var_68e4[j] & -2);
				}
			}
		}
	}

	private static void sub_b76e() {
		cGame.var_6844 = false;
		cGame.var_683c = true;
		cGame.var_682c = 0;
		if (cGame.var_681c != null) {
			cGame.var_6834 = cGame.var_681c.length;
		} else {
			cGame.var_6834 = 0;
		}
		cGame.var_684c = false;
		cGame.var_6864 = false;
	}

	private static void sub_b7c5() {
		try {
			if (cGame.var_682c >= 0 && cGame.var_681c != null && cGame.var_681c.length > 0) {
				switch (cGame.var_681c[cGame.var_682c]) {
				case 37: {
					GLLib.Math_Init("/1");
					break;
				}
				case 38: {
					readFromRMSHeader();
					break;
				}
				case 36: {
					cGame.var_69e4 = true;
					break;
				}
				case 1: {
					GLLib.Pack_Open("/2");
					cGame.var_6874 = 2;
					break;
				}
				case 2: {
					GLLib.Pack_Open("/10");
					break;
				}
				case 6: {
					GLLib.Pack_Open("/5");
					cGame.var_6874 = 0;
					break;
				}
				case 7: {
					GLLib.Pack_Open("/7");
					cGame.var_6874 = 1;
					break;
				}
				case 0: {
					GLLib.Pack_FullyClose();
					break;
				}
				case 9: {
					sub_4c5ea();
					for (int i = 0; i < 6; ++i) {
						if (cGame.var_7ffc[i] != null) {
							sub_d500(2, i, 65535, 1, 0, 0, -1);
						}
					}
					sub_d2e8(2, 2);
					break;
				}
				case 22: {
					Class_f.sub_48be();
					cGame.var_8004 = null;
					cGame.var_800c = null;
					break;
				}
				case 21: {
					GLLibPlayer.Tileset_Destroy(0);
					GLLibPlayer.Tileset_Destroy(1);
					break;
				}
				case 20: {
					for (int length = cGame.var_6884[0].length, j = 0; j < length; ++j) {
						if ((cGame.var_6884[0][j] & 0x44) == 0x0) {
							sub_d500(0, j, 65535, 1, 0, 0, -1);
						}
					}
					sub_d2e8(0, 3);
					break;
				}
				case 30: {
					if (sub_83cf() == 1 && cGame.var_7fd4 != -1) {
						cGame.var_7fe4 = (cGame.s_languageCode = GLLib.Text_GetPhoneDefaultLangage());
					}
					if (cGame.var_7fe4 != 2 && cGame.var_7fe4 != 0 && cGame.var_7fe4 != 1 && cGame.var_7fe4 != 4
							&& cGame.var_7fe4 != 3 && cGame.var_7fe4 != 5 && cGame.var_7fe4 != 10
							&& cGame.var_7fe4 != 11 && cGame.var_7fe4 != 16 && cGame.var_7fe4 != 15) {
						cGame.var_7fe4 = 0;
					}
					final String string = "/" + GLLib.Text_GetLanguageAsString(0);
					for (int k = 0; k < 12; ++k) {
						GLLib.sub_4d20(string, k);
					}
					break;
				}
				case 31: {
					sub_d500(2, 0, 1, 0, 136, 0, -1);
					sub_d500(2, 1, 1, 0, 136, 0, -1);
					sub_d500(2, 2, 1, 0, 136, 0, -1);
					sub_d500(2, 3, 1, 0, 136, 0, -1);
					sub_d500(2, 4, 1, 0, 136, 0, -1);
					break;
				}
				case 32: {
					if (cGame.var_7fe4 == 15) {
						cGame.var_7ffc[4] = cGame.var_7ffc[2];
					}
					final short[] array = (short[]) GLLib.Pack_ReadArray(5);
					cGame.var_7ffc[0].sub_46d6(array);
					cGame.var_7ffc[1].sub_46d6(array);
					cGame.var_7ffc[2].sub_46d6(array);
					cGame.var_7ffc[3].sub_46d6(array);
					cGame.var_7ffc[4].sub_46d6(array);
					cGame.var_7ffc[0].sub_3dee(0);
					cGame.var_7ffc[1].sub_3dee(0);
					cGame.var_7ffc[2].sub_3dee(0);
					cGame.var_7ffc[3].sub_3dee(0);
					cGame.var_7ffc[4].sub_3dee(0);
					break;
				}
				case 40: {
					sub_1d1a7(1, true);
					sub_1d1a7(2, true);
					sub_1d1a7(3, true);
					sub_1d1a7(4, true);
					sub_1d1a7(5, true);
					sub_1d1a7(7, true);
					sub_1d1a7(6, true);
					sub_1d1a7(8, true);
					sub_1d1a7(9, true);
					sub_1d1a7(10, true);
					sub_1d1a7(11, true);
					sub_1d1a7(12, true);
					sub_1d1a7(13, true);
					sub_1d1a7(15, true);
					sub_1d1a7(14, true);
					sub_1d1a7(17, true);
					sub_1d1a7(16, true);
					sub_1d1a7(20, true);
					sub_1d1a7(21, true);
					sub_1d1a7(22, true);
					sub_1d1a7(23, true);
					sub_1d1a7(24, true);
					sub_1d1a7(19, true);
					sub_1d1a7(25, true);
					sub_1d1a7(18, true);
					sub_1d1a7(26, true);
					sub_1d1a7(27, true);
					break;
				}
				case 34: {
					IGP.initialize(GloftGF2M.s_instance, GLLib.s_gllib_instance, GLLib.s_screenWidth, GLLib.s_screenHeight);
					break;
				}
				case 45: {
					sub_d500(0, 158, 1, 0, 24, 0, -1);
					sub_d500(0, 0, 1, 0, 24, 0, -1);
					sub_d500(0, 77, 1, 0, 24, 0, -1);
					sub_d500(0, 78, 1, 0, 24, 0, -1);
					sub_d500(0, 79, 1, 0, 24, 0, -1);
					sub_d500(0, 6, 1, 0, 136, 0, -1);
					sub_d500(0, 1, 1, 0, 136, 0, -1);
					sub_d500(0, 66, 1, 0, 136, 0, -1);
					sub_d500(0, 67, 1, 0, 136, 0, -1);
					sub_d500(0, 68, 1, 0, 136, 0, -1);
					sub_d500(0, 69, 1, 0, 136, 0, -1);
					sub_d500(0, 70, 1, 0, 136, 0, -1);
					sub_d500(0, 71, 1, 0, 136, 0, -1);
					sub_d500(0, 72, 1, 0, 136, 0, -1);
					sub_d500(0, 73, 1, 0, 136, 0, -1);
					sub_d500(0, 74, 1, 0, 136, 0, -1);
					sub_d500(0, 75, 1, 0, 136, 0, -1);
					sub_d500(0, 76, 1, 0, 136, 0, -1);
					sub_d500(0, 4, 1, 0, 24, 0, -1);
					sub_d500(0, 15, 1, 0, 24, 0, -1);
					sub_d500(0, 82, 1, 0, 24, 0, -1);
					sub_d500(0, 83, 1, 0, 24, 0, -1);
					sub_d500(0, 96, 1, 0, 24, 0, -1);
					sub_d500(0, 102, 1, 0, 24, 0, -1);
					sub_d500(0, 103, 1, 0, 24, 0, -1);
					sub_d500(0, 149, 1, 0, 24, 0, -1);
					sub_d500(0, 145, 1, 0, 24, 0, -1);
					sub_d500(0, 127, 1, 0, 24, 0, -1);
					sub_d500(0, 128, 1, 0, 24, 0, -1);
					sub_d500(0, 129, 1, 0, 24, 0, -1);
					sub_d500(0, 130, 1, 0, 24, 0, -1);
					sub_d500(0, 131, 1, 0, 24, 0, -1);
					sub_d500(0, 132, 1, 0, 24, 0, -1);
					sub_d500(0, 133, 1, 0, 24, 0, -1);
					sub_d500(0, 134, 1, 0, 24, 0, -1);
					sub_d500(0, 135, 1, 0, 24, 0, -1);
					sub_d500(0, 137, 1, 0, 24, 0, -1);
					sub_d500(0, 136, 1, 0, 24, 0, -1);
					sub_d500(0, 2, 1, 0, 24, 0, -1);
					sub_d500(0, 8, 1, 0, 136, 0, -1);
					sub_d500(0, 7, 1, 0, 136, 0, -1);
					sub_d500(0, 18, 1, 0, 136, 0, -1);
					sub_d500(0, 19, 1, 0, 136, 0, -1);
					sub_d500(0, 20, 1, 0, 136, 0, -1);
					sub_d500(0, 5, 1, 0, 136, 0, -1);
					sub_d500(0, 17, 1, 0, 136, 0, -1);
					sub_d500(0, 30, 1, 0, 24, 0, -1);
					sub_d500(0, 31, 1, 0, 24, 0, -1);
					sub_d500(0, 32, 1, 0, 24, 0, -1);
					sub_d500(0, 33, 1, 0, 24, 0, -1);
					sub_d500(0, 34, 1, 0, 24, 0, -1);
					sub_d500(0, 35, 1, 0, 24, 0, -1);
					sub_d500(0, 36, 1, 0, 24, 0, -1);
					sub_d500(0, 115, 1, 0, 24, 0, -1);
					sub_d500(0, 116, 1, 0, 24, 0, -1);
					sub_d500(0, 117, 1, 0, 24, 0, -1);
					sub_d500(0, 118, 1, 0, 24, 0, -1);
					sub_d500(0, 119, 1, 0, 24, 0, -1);
					sub_d500(0, 120, 1, 0, 24, 0, -1);
					sub_d500(0, 37, 1, 0, 24, 0, -1);
					sub_d500(0, 104, 1, 0, 24, 0, -1);
					sub_d500(0, 105, 1, 0, 24, 0, -1);
					sub_d500(0, 106, 1, 0, 24, 0, -1);
					sub_d500(0, 12, 1, 0, 24, 0, -1);
					sub_d500(0, 38, 1, 0, 24, 0, -1);
					sub_d500(0, 39, 1, 0, 24, 0, -1);
					sub_d500(0, 40, 1, 0, 24, 0, -1);
					sub_d500(0, 107, 1, 0, 24, 0, -1);
					sub_d500(0, 41, 1, 0, 24, 0, -1);
					sub_d500(0, 42, 1, 0, 24, 0, -1);
					sub_d500(0, 108, 1, 0, 24, 0, -1);
					sub_d500(0, 109, 1, 0, 24, 0, -1);
					sub_d500(0, 45, 1, 0, 24, 0, -1);
					sub_d500(0, 43, 1, 0, 24, 0, -1);
					sub_d500(0, 44, 1, 0, 24, 0, -1);
					sub_d500(0, 46, 1, 0, 24, 0, -1);
					sub_d500(0, 47, 1, 0, 24, 0, -1);
					sub_d500(0, 146, 1, 0, 24, 0, -1);
					sub_d500(0, 48, 1, 0, 24, 0, -1);
					sub_d500(0, 49, 1, 0, 24, 0, -1);
					sub_d500(0, 110, 1, 0, 24, 0, -1);
					sub_d500(0, 111, 1, 0, 24, 0, -1);
					sub_d500(0, 50, 1, 0, 24, 0, -1);
					sub_d500(0, 51, 1, 0, 24, 0, -1);
					sub_d500(0, 52, 1, 0, 24, 0, -1);
					sub_d500(0, 53, 1, 0, 24, 0, -1);
					sub_d500(0, 112, 1, 0, 24, 0, -1);
					sub_d500(0, 54, 1, 0, 24, 0, -1);
					sub_d500(0, 55, 1, 0, 24, 0, -1);
					sub_d500(0, 56, 1, 0, 24, 0, -1);
					sub_d500(0, 57, 1, 0, 24, 0, -1);
					sub_d500(0, 58, 1, 0, 24, 0, -1);
					sub_d500(0, 59, 1, 0, 24, 0, -1);
					sub_d500(0, 60, 1, 0, 24, 0, -1);
					sub_d500(0, 61, 1, 0, 24, 0, -1);
					sub_d500(0, 121, 1, 0, 24, 0, -1);
					sub_d500(0, 122, 1, 0, 24, 0, -1);
					sub_d500(0, 62, 1, 0, 24, 0, -1);
					sub_d500(0, 123, 1, 0, 24, 0, -1);
					sub_d500(0, 124, 1, 0, 24, 0, -1);
					sub_d500(0, 125, 1, 0, 24, 0, -1);
					sub_d500(0, 126, 1, 0, 24, 0, -1);
					sub_d500(0, 113, 1, 0, 24, 0, -1);
					sub_d500(0, 114, 1, 0, 24, 0, -1);
					sub_d500(0, 63, 1, 0, 24, 0, -1);
					sub_d500(0, 140, 1, 0, 24, 0, -1);
					sub_d500(0, 64, 1, 0, 24, 0, -1);
					sub_d500(0, 65, 1, 0, 24, 0, -1);
					sub_d500(0, 142, 1, 0, 24, 0, -1);
					sub_d500(0, 84, 1, 0, 136, 0, -1);
					sub_d500(0, 21, 1, 0, 136, 0, -1);
					sub_d500(0, 11, 1, 0, 136, 0, -1);
					sub_d500(0, 27, 1, 0, 136, 0, -1);
					sub_d500(0, 25, 1, 0, 136, 0, -1);
					sub_d500(0, 29, 1, 0, 136, 0, -1);
					sub_d500(0, 26, 1, 0, 136, 0, -1);
					sub_d500(0, 23, 1, 0, 136, 0, -1);
					sub_d500(0, 22, 1, 0, 136, 0, -1);
					sub_d500(0, 28, 1, 0, 136, 0, -1);
					sub_d500(0, 24, 1, 0, 136, 0, -1);
					sub_d500(0, 3, 1, 0, 24, 0, -1);
					sub_d500(0, 10, 1, 0, 24, 0, -1);
					sub_d500(0, 13, 1, 0, 24, 0, -1);
					sub_d500(0, 14, 1, 0, 24, 0, -1);
					sub_d500(0, 16, 3, 0, 24, 0, -1);
					sub_d500(0, 144, 1, 0, 24, 0, -1);
					sub_d500(0, 143, 1, 0, 24, 0, -1);
					sub_d500(0, 138, 1, 0, 24, 0, -1);
					sub_d500(0, 147, 1, 0, 24, 0, -1);
					sub_d500(0, 148, 1, 0, 24, 0, -1);
					sub_d500(0, 80, 1, 0, 24, 0, -1);
					sub_d500(0, 9, 1, 0, 136, 0, -1);
					sub_d500(0, 139, 1, 0, 136, 0, -1);
					sub_d500(0, 150, 1, 0, 24, 0, -1);
					sub_d500(0, 151, 1, 0, 24, 0, -1);
					sub_d500(0, 157, 1, 0, 24, 0, -1);
					sub_d500(0, 155, 1, 0, 24, 0, -1);
					sub_d500(0, 98, 1, 0, 24, 0, -1);
					sub_d500(0, 156, 1, 0, 24, 0, -1);
					sub_d500(0, 141, 1, 0, 24, 0, -1);
					sub_d500(0, 152, 1, 0, 24, 0, -1);
					sub_d500(0, 153, 63, 0, 24, 0, -1);
					sub_d500(0, 154, 63, 0, 24, 0, -1);
					break;
				}
				case 41: {
					for (int l = 50; l <= 106; ++l) {
						sub_d500(1, l, 1, 0, 24, 0, -1);
					}
					for (int n = 107; n <= 121; ++n) {
						sub_d500(1, n, 1, 0, 24, 0, -1);
					}
					sub_d500(1, 44, 3, 0, 24, 0, -1);
					break;
				}
				case 140: {
					if (!cGame.var_684c) {
						cGame.var_684c = true;
						cGame.var_685c = sub_d691(cGame.var_6874);
						new StringBuffer().append("[0/").append(cGame.var_685c).append("] - EXECUTE SPRITE REQUESTS");
					}
					cGame.var_684c = sub_d1f5(cGame.var_6874);
					break;
				}
				case 141: {
					if (!cGame.var_684c) {
						cGame.var_684c = true;
						cGame.var_685c = sub_db02();
						new StringBuffer().append("[0/").append(cGame.var_685c).append("] - EXECUTE SOUND REQUESTS");
					}
					cGame.var_684c = sub_d8df();
					break;
				}
				case 39: {
					GLLib.Pack_LoadMIME("/0");
					GLLibPlayer.Snd_Init(119);
					sub_da7a(61, 0);
					sub_da7a(113, 0);
					break;
				}
				case 43: {
					sub_da7a(0, 0);
					sub_da7a(10, 0);
					sub_da7a(11, 0);
					sub_da7a(13, 0);
					sub_da7a(14, 0);
					sub_da7a(15, 0);
					sub_da7a(16, 0);
					sub_da7a(17, 0);
					sub_da7a(18, 0);
					sub_da7a(19, 0);
					sub_da7a(20, 0);
					sub_da7a(21, 0);
					sub_da7a(22, 0);
					sub_da7a(23, 0);
					sub_da7a(24, 0);
					sub_da7a(25, 0);
					sub_da7a(26, 0);
					sub_da7a(27, 0);
					sub_da7a(28, 0);
					sub_da7a(29, 0);
					sub_da7a(30, 0);
					sub_da7a(31, 0);
					sub_da7a(32, 0);
					sub_da7a(33, 0);
					sub_da7a(34, 0);
					sub_da7a(35, 0);
					sub_da7a(36, 0);
					sub_da7a(37, 0);
					sub_da7a(38, 0);
					sub_da7a(39, 0);
					sub_da7a(40, 0);
					sub_da7a(41, 0);
					sub_da7a(42, 0);
					sub_da7a(43, 0);
					sub_da7a(44, 0);
					sub_da7a(45, 0);
					sub_da7a(46, 0);
					sub_da7a(47, 0);
					sub_da7a(48, 0);
					sub_da7a(49, 0);
					sub_da7a(50, 0);
					sub_da7a(51, 0);
					sub_da7a(52, 0);
					sub_da7a(53, 0);
					sub_da7a(54, 0);
					sub_da7a(55, 0);
					sub_da7a(56, 0);
					sub_da7a(57, 0);
					sub_da7a(58, 0);
					sub_da7a(59, 0);
					sub_da7a(60, 0);
					sub_da7a(62, 0);
					sub_da7a(12, 0);
					sub_da7a(66, 0);
					sub_da7a(63, 0);
					sub_da7a(64, 0);
					sub_da7a(65, 0);
					sub_da7a(67, 0);
					sub_da7a(68, 0);
					sub_da7a(69, 0);
					sub_da7a(70, 0);
					sub_da7a(71, 0);
					sub_da7a(72, 0);
					sub_da7a(73, 0);
					sub_da7a(74, 0);
					sub_da7a(75, 0);
					sub_da7a(76, 0);
					sub_da7a(77, 0);
					sub_da7a(78, 0);
					sub_da7a(79, 0);
					sub_da7a(80, 0);
					sub_da7a(81, 0);
					sub_da7a(82, 0);
					sub_da7a(83, 0);
					sub_da7a(84, 0);
					sub_da7a(85, 0);
					sub_da7a(86, 0);
					sub_da7a(87, 0);
					sub_da7a(88, 0);
					sub_da7a(89, 0);
					sub_da7a(90, 0);
					sub_da7a(91, 0);
					sub_da7a(92, 0);
					sub_da7a(93, 0);
					sub_da7a(94, 0);
					sub_da7a(95, 0);
					sub_da7a(96, 0);
					sub_da7a(97, 0);
					sub_da7a(98, 0);
					sub_da7a(99, 0);
					sub_da7a(100, 0);
					sub_da7a(101, 0);
					sub_da7a(102, 0);
					sub_da7a(103, 0);
					sub_da7a(104, 0);
					sub_da7a(105, 0);
					sub_da7a(106, 0);
					sub_da7a(107, 0);
					sub_da7a(108, 0);
					sub_da7a(109, 0);
					sub_da7a(110, 0);
					sub_da7a(111, 0);
					sub_da7a(112, 0);
					sub_da7a(114, 0);
					sub_da7a(115, 0);
					sub_da7a(116, 0);
					sub_da7a(117, 0);
					sub_da7a(118, 0);
					break;
				}
				case 46: {
					cGame.var_807c = cGame.var_8084;
					sub_cc72();
					break;
				}
				case 49: {
					if (cGame.var_807c > 0 && cGame.var_807c <= 10) {
						sub_d500(0, Class_h.var_6a[8].var_82[cGame.var_807c - 1][3], 1, 0, 24, 0, -1);
						final int n2;
						if ((n2 = Class_h.var_6a[18].var_82[getLevel() - 1][1 + cGame.var_807c
								- 1]) > cGame.var_6e24[cGame.var_807c - 1][0]) {
							cGame.var_6e24[cGame.var_807c - 1][0] = n2;
						}
						break;
					}
					break;
				}
				case 126: {
					sub_3dac2();
					break;
				}
				case 44: {
					if (cGame.var_807c == 0) {
						cGame.var_7da4 = -1L;
						cGame.var_808c = 0;
						cGame.var_77f4 = 0;
					}
					setValuesFromGameplaySave(false);
					break;
				}
				case 47: {
					sub_2cf02();
					sub_cd28(3);
					if (cGame.var_807c > 10) {
						if (!sub_f524(true)) {
							sub_44ced(13);
						}
					} else if (cGame.var_807c > 0 || cGame.var_6864 || !sub_10216(false)) {
						cGame.var_6864 = false;
						sub_cd28(4 + cGame.var_807c);
						Class_f.sub_5932(0);
					}
					Class_f.sub_6cdb();
					Class_f.sub_92ea(10, 0, new int[] { 0, 0, 0 });
					if (cGame.var_800c != null && cGame.var_8004 != null) {
						cGame.var_800c.var_17cd = cGame.var_8004.var_17cd - (GLLib.s_screenWidth >> 1);
						cGame.var_800c.var_17d5 = cGame.var_8004.var_17d5 - (GLLib.s_screenHeight >> 1);
					}
					break;
				}
				case 23: {
					sub_29de8();
					break;
				}
				case 42: {
					sub_49758();
					break;
				}
				case 125: {
					sub_2b850();
					break;
				}
				}
			}
		} catch (final Exception ex) {
		}
		if (!cGame.var_6844) {
			if (cGame.var_684c) {
				if (cGame.var_681c[cGame.var_682c] != 50 || !cGame.var_7ba4.equals("")) {
					++cGame.var_6854;
				}
			} else if (cGame.var_681c[cGame.var_682c] != 50 || !cGame.var_7ba4.equals("")) {
				++cGame.var_682c;
				cGame.var_6854 = 0;
				if (cGame.var_682c >= cGame.var_6834) {
					cGame.var_6844 = true;
				}
			}
		}
	}

	private static ASprite sub_ca9c(final int n, final int n2, boolean b, final boolean b2, final int n3,
			final int n4) {
		ASprite class_e = new ASprite();
		class_e.sub_1372(GLLib.Pack_ReadData(n), 0);
		for (int i = 0; i < cGame.var_7fbc.length; i += 2) {
			if (n == cGame.var_7fbc[i] && GLLib.s_pack_filename.equals("/" + cGame.var_7fbc[i + 1])
					&& !class_e.sub_3b2c()) {
				class_e.sub_3af1();
			}
		}
		if (sub_43709(n) != -1) {
			class_e.sub_3dee(sub_43709(n));
			b = false;
		}
		if (sub_4378f(class_e, n)) {
			return class_e;
		}
		if (b) {
			sub_cbb5(class_e, n2, n3, n4);
			if (b2) {
				class_e.sub_2f84();
			}
		}
		return class_e;
	}

	private static void sub_cbb5(final ASprite class_e, final int n, final int n2, final int n3) {
		for (int i = 0; i < class_e.var_107f; ++i) {
			if ((n >> i & 0x1) != 0x0) {
				if (n2 == 0 && n3 == -1) {
					class_e.sub_64d8(i, 0, -1, -1);
				} else {
					for (int j = n2; j <= n3; ++j) {
						class_e.sub_677f(i, j, -1);
					}
				}
			}
		}
	}

	static void sub_cc72() {
		cGame.s_clickblocked = false;
		GLLib.Pack_Open("/10");
		int n = 0;
		if (cGame.var_7fc4 == 100) {
			n = 0;
		} else if (cGame.var_7fc4 == 50) {
			n = 158;
		}
		GLLibPlayer.sub_3661(GLLib.s_screenWidth, GLLib.s_screenHeight, cGame.var_7ff4[n].var_f7f[0] & 0xFFFF,
				cGame.var_7ff4[n].var_f87[0] & 0xFFFF);
		if (cGame.var_687c == null) {
			cGame.var_687c = GLLib.Pack_ReadData(0);
		}
		GLLibPlayer.sub_3837();
		GLLibPlayer.sub_38f5(0, GLLib.Pack_ReadData(2), cGame.var_687c, GLLib.Pack_ReadData(1), cGame.var_7ff4[n], 0, 16, 2,
				2, true);
		GLLib.Pack_FullyClose();
	}

	private static void sub_cd28(final int n) {
		GLLib.Pack_Open("/10");
		final byte[] sub_3253 = GLLib.Pack_ReadData(n);
		GLLib.Pack_FullyClose();
		int n2 = 0;
		boolean b = false;
		while (n2 < sub_3253.length && !b) {
			final byte sub_3e92 = GLLib.Mem_GetByte(sub_3253, n2);
			++n2;
			if (sub_3e92 == 50) {
				final short sub_3eb0 = GLLib.sub_3eb0(sub_3253, n2);
				n2 += 2;
				final short sub_3eb2 = GLLib.sub_3eb0(sub_3253, n2);
				n2 += 2;
				final short sub_3eb3 = GLLib.sub_3eb0(sub_3253, n2);
				n2 += 2;
				++n2;
				final byte sub_3e93 = GLLib.Mem_GetByte(sub_3253, n2);
				++n2;
				final byte sub_3e94 = GLLib.Mem_GetByte(sub_3253, n2);
				++n2;
				n2 += 2;
				final int[] array = { sub_3eb2, sub_3eb3, 11, 0 };
				Class_f class_f = null;
				if (sub_3e93 == 50 || sub_3e93 == 54 || sub_3e93 == 48) {
					array[2] = 12;
				}
				switch (sub_3e93) {
				case 13: {
					array[2] = 255;
					class_f = (cGame.var_800c = Class_f.sub_92c9(sub_3e93, array));
					break;
				}
				case 48: {
					(class_f = sub_25b35(11, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 42: {
					if (sub_3e94 == -1) {
						array[2] = 12;
						array[3] = 2;
						class_f = (cGame.var_8004 = Class_f.sub_92c9(sub_3e93, array));
						break;
					}
					array[2] = 12;
					array[3] = 2;
					(class_f = sub_25b35(8, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 49: {
					class_f = Class_f.sub_92c9(sub_3e93, array);
					if (sub_3e94 != -1) {
						sub_25213(sub_3e94);
						class_f.sub_736e(sub_3e94);
						class_f.sub_7795(5);
						break;
					}
					class_f.var_1835 = 65535;
					class_f.sub_7795(1);
					break;
				}
				case 52: {
					(class_f = sub_25b35(2, sub_3e94)).sub_7b13(3);
					class_f.var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 54: {
					(class_f = sub_25b35(0, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					class_f.var_189d.sub_198c(2);
					class_f.var_161d = System.currentTimeMillis();
					class_f.var_1625 = Integer.MAX_VALUE;
					break;
				}
				case 50: {
					(class_f = sub_25b35(3, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 20: {
					(class_f = sub_25b35(4, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 51: {
					(class_f = sub_25b35(9, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					break;
				}
				case 32: {
					(class_f = sub_25b35(15, sub_3e94)).var_17cd = sub_3eb2;
					class_f.var_17d5 = sub_3eb3;
					class_f.var_1845 = sub_3eb2;
					class_f.var_184d = sub_3eb3;
					break;
				}
				}
				if (class_f == null) {
					continue;
				}
				class_f.var_183d = sub_3eb0;
				if (!class_f.sub_a2a0(2)) {
					continue;
				}
				sub_2c907(class_f);
			} else {
				if (sub_3e92 != 54) {
					continue;
				}
				++n2;
				final short sub_3eb4 = GLLib.sub_3eb0(sub_3253, n2);
				n2 += 2;
				final short n3 = GLLib.Mem_GetByte(sub_3253, n2);
				++n2;
				if (b = (n3 > cGame.var_6e24[cGame.var_807c - 1][0])) {
					continue;
				}
				for (int i = 0; i < 13; ++i) {
					cGame.var_6d5c[i] = ((sub_3eb4 >> i & 0x1) != 0x0);
				}
			}
		}
	}

	private static boolean sub_d1f5(final int n) {
		int n2;
		boolean b2;
		for (boolean b = (n2 = sub_d635(n, 0, 3)) == -1; !b; b = (b2 || n2 == -1)) {
			b2 = (b || !sub_d339(n, n2));
			n2 = sub_d635(n, n2 + 1, 3);
		}
		return n2 >= 0;
	}

	static void sub_d2c8(final int n) {
		sub_d2e8(n, 3);
	}

	private static void sub_d2e8(final int n, final int n2) {
		for (int i = sub_d635(n, 0, n2); i != -1; i = sub_d635(n, i, n2)) {
			sub_d339(n, i);
		}
	}

	private static boolean sub_d339(final int n, final int n2) {
		boolean b = false;
		if ((cGame.var_6884[n][n2] & 0x1) != 0x0) {
			if (cGame.var_689c[n][n2] == null) {
				cGame.var_689c[n][n2] = sub_ca9c(n2, cGame.var_688c[n][n2], (cGame.var_6884[n][n2] & 0x8) != 0x0,
						(cGame.var_6884[n][n2] & 0x10) != 0x0, (byte) cGame.var_6894[n][n2],
						(byte) (cGame.var_6894[n][n2] >> 8));
				final byte[] array = cGame.var_6884[n];
				array[n2] &= 0xFFFFFFF8;
			}
		} else if ((cGame.var_6884[n][n2] & 0x2) != 0x0) {
			if ((cGame.var_688c[n][n2] & 0xFFFF) == 0xFFFF) {
				cGame.var_689c[n][n2].sub_123f();
				cGame.var_689c[n][n2] = null;
				cGame.var_6884[n][n2] = 0;
			} else {
				final int sub_d6f2 = sub_d6f2(n, n2);
				for (int i = 0; i < 16; ++i) {
					if ((sub_d6f2 & cGame.var_688c[n][n2] & 1 << i) != 0x0) {
						cGame.var_689c[n][n2].sub_68a3(i);
					}
				}
				final byte[] array2 = cGame.var_6884[n];
				array2[n2] &= 0xFFFFFFFD;
			}
			cGame.var_688c[n][n2] = 0;
			cGame.var_6894[n][n2] = -256;
			b = true;
		} else if ((cGame.var_6884[n][n2] & 0x4) != 0x0) {
			b = true;
		}
		return b;
	}

	static void sub_d500(final int n, final int n2, final int n3, final int n4, final int n5, int n6, int n7) {
		if (n4 == 0) {
			n6 = (((~sub_d6f2(n, n2) & n3) != 0x0) ? 1 : 0);
			n7 = (((~(cGame.var_6884[n][n2] & 0xFFFFFFF8) & n5) != 0x0) ? 1 : 0);
			if (cGame.var_689c[n][n2] != null && n6 == 0 && n7 == 0) {
				return;
			}
		} else if (n4 == 1) {
			if ((cGame.var_6884[n][n2] & 0x1) != 0x0) {
				cGame.var_6884[n][n2] = 0;
			}
			if (cGame.var_689c[n][n2] == null) {
				return;
			}
			cGame.var_689c[n][n2].sub_3e59();
		}
		cGame.var_6884[n][n2] = (byte) (1 << n4 | n5);
		final short[] array = cGame.var_688c[n];
		array[n2] |= (short) n3;
		cGame.var_6894[n][n2] = -256;
	}

	private static int sub_d635(final int n, int i, final int n2) {
		while (i < cGame.var_68a4[n]) {
			if ((cGame.var_6884[n][i] & n2) != 0x0) {
				return i;
			}
			++i;
		}
		return -1;
	}

	private static int sub_d691(final int n) {
		int n2 = 0;
		for (int i = 0; i < cGame.var_68a4[n]; ++i) {
			if ((cGame.var_6884[n][i] & 0x1) != 0x0) {
				++n2;
			}
		}
		return n2;
	}

	private static int sub_d6f2(final int n, final int n2) {
		if (cGame.var_689c[n][n2] == null) {
			return 0;
		}
		int n3 = 0;
		for (int i = 0; i < 16; ++i) {
			if (cGame.var_689c[n][n2].sub_3a3a(i)) {
				n3 |= 1 << i;
			}
		}
		return n3;
	}

	private static void sub_d76c() {
		cGame.var_68ac = 100;
	}

	private static void sub_d78c(final int n, final int n2) {
		if (n2 >= 0 && n2 < 1000 && cGame.var_689c[1][n2] == null) {
			sub_d500(1, n2, 1, 0, 56, 0, -1);
		}
	}

	private static void sub_d7d7(int i) {
		for (i = 0; i < cGame.var_68a4[1]; ++i) {
			if ((cGame.var_6884[1][i] & 0x20) != 0x0) {
				sub_d500(1, i, 65535, 1, 0, 0, -1);
			}
		}
		sub_d2e8(1, 3);
	}

	private static void sub_d841(final int n) {
		final int sub_d691;
		if ((sub_d691 = sub_d691(n)) > 0) {
			if (n == 0) {
				if (GLLib.s_pack_filename != "/5") {
					GLLib.Pack_Open("/5");
				}
			} else if (GLLib.s_pack_filename != "/7") {
				GLLib.Pack_Open("/7");
			}
			if (cGame.var_68ac <= 0) {
				System.gc();
				sub_d1f5(n);
				cGame.var_68ac = 1000;
			} else {
				cGame.var_68ac -= GLLib.s_game_frameDT;
			}
			if (sub_d691 <= 1) {
				GLLib.Pack_FullyClose();
			}
		}
	}

	private static boolean sub_d8df() {
		int n;
		boolean b2;
		for (boolean b = (n = sub_dab3(0)) == -1; !b; b = (b2 || n == -1)) {
			b2 = (b || !sub_d9a0(n));
			n = sub_dab3(n + 1);
		}
		return n >= 0;
	}

	private static boolean sub_d9a0(final int n) {
		boolean b = false;
		if (cGame.var_68b4[n] == 0) {
			return true;
		}
		if ((cGame.var_68b4[n] & 0x5) != 0x0) {
			if (GLLibPlayer.Snd_IsInSlot(n)) {
				return true;
			}
			try {
				GLLibPlayer.Snd_LoadSound("/3", n, false);
				final byte[] var_68b4 = cGame.var_68b4;
				var_68b4[n] &= 0xFFFFFFFE;
			} catch (final Exception ex) {
			}
			b = false;
		} else if ((cGame.var_68b4[n] & 0xA) != 0x0) {
			if (!GLLibPlayer.Snd_IsInSlot(n)) {
				return true;
			}
			try {
				GLLibPlayer.Snd_UnLoadSound(n);
			} catch (final Exception ex2) {
			}
			b = true;
		}
		return b;
	}

	private static void sub_da7a(final int n, final int unusedInt) {
		if (GLLibPlayer.Snd_IsInSlot(n)) {
			return;
		}
		cGame.var_68b4[n] = 1;
	}

	private static int sub_dab3(int i) {
		while (i < 119) {
			if (cGame.var_68b4[i] != 0) {
				return i;
			}
			++i;
		}
		return -1;
	}

	private static int sub_db02() {
		int n = 0;
		for (int i = 0; i < 119; ++i) {
			if ((cGame.var_68b4[i] & 0x1) != 0x0) {
				++n;
			}
		}
		return n;
	}

	private static String sub_db5b(final int n) {
		final int i = n / 86400;
		final int n2;
		final int j = (n2 = n % 86400) / 3600;
		final int n3;
		final int k = (n3 = n2 % 3600) / 60;
		final int l = n3 % 60;
		String str = "";
		String s;
		if (n > 0) {
			if (i > 0) {
				str = str + i + ":";
			}
			if (j > 0) {
				str = str + j + ":";
			}
			if (k > 0) {
				if (k / 10 < 1) {
					str += "0";
				}
				str = str + k + ":";
			}
			if (l > 0) {
				if (l / 10 < 1) {
					str += "0";
				}
				s = str + l;
			} else {
				s = str + "00";
			}
		} else {
			s = "-";
		}
		return s;
	}

	private static String sub_dceb(final int n) {
		final int i = n / 86400;
		final int n2;
		final int j = (n2 = n % 86400) / 3600;
		final int n3;
		final int k = (n3 = n2 % 3600) / 60;
		final int l = n3 % 60;
		String s = "";
		if (n > 0) {
			if (i > 0) {
				final String sub_4e1f;
				s = s + i + (((sub_4e1f = GLLib.TODO_sub_4e1f(193)) == null) ? "" : sub_4e1f) + " ";
			}
			if (j > 0) {
				final String sub_4e1f2;
				s = s + j + (((sub_4e1f2 = GLLib.TODO_sub_4e1f(194)) == null) ? "" : sub_4e1f2) + " ";
			}
			if (k > 0) {
				if (k / 10 < 1) {
					s += "0";
				}
				final String sub_4e1f3;
				s = s + k + (((sub_4e1f3 = GLLib.TODO_sub_4e1f(195)) == null) ? "" : sub_4e1f3) + " ";
			}
			if (l > 0) {
				if (l / 10 < 1) {
					s += "0";
				}
				final String sub_4e1f4;
				s = s + l + (((sub_4e1f4 = GLLib.TODO_sub_4e1f(196)) == null) ? "" : sub_4e1f4);
			}
		} else {
			s = "-";
		}
		return s;
	}

	static void sub_df48(final int n, final int n2) {
		if (n2 != 0) {
			cGame.var_8044 = n * 100 / n2;
			cGame.s_plantGrowTime = sub_dceb(n2 - n);
		}
	}

	private static int sub_df89(final int n) {
		int n2 = 0;
		if (n == 1) {
			n2 = 2;
		} else if (n == 2) {
			n2 = 0;
		} else if (n == 3) {
			n2 = 3;
		} else if (n == 4) {
			n2 = 1;
		} else if (n == 5) {
			n2 = 4;
		} else if (n == 6) {
			n2 = 5;
		} else if (n == 7) {
			n2 = 6;
		} else if (n == 8) {
			n2 = 7;
		} else if (n == 9) {
			n2 = 8;
		}
		return n2;
	}

	private static void sub_e055(final boolean b, int i, final int n, final int n2) {
		final int[] array = { 0, 0, 14 };
		int n3 = 10;
		if (i < 100) {
			n3 = i;
		} else if (i < 1000) {
			n3 = i / 2;
		} else if (i < 5000) {
			n3 = i / 3;
		} else if (i < 10000) {
			n3 = i / 4;
		} else if (i >= 10000) {
			n3 = i / 5;
		}
		while (i > 0) {
			int n4 = (i < n3) ? i : n3;
			if ((i -= n4) > 0 && i < n3) {
				n4 += i;
				i = 0;
			}
			Class_f.sub_92ea(47, 2, array).sub_8c4c(n + (GLLib.Math_Rand(0, 50) - 25),
					n2 + (GLLib.Math_Rand(0, 50) - 25), b ? 37 : 36, 1000, b, n4);
		}
	}

	static int sub_e1e7(final int n) {
		int n2 = 0;
		boolean b = false;
		for (int i = 0; i < 281; ++i) {
			if (n < cGame.var_8114[i]) {
				n2 = cGame.var_811c[i];
				b = true;
				break;
			}
		}
		if (!b) {
			n2 = cGame.var_811c[280];
		}
		if (n2 < 1) {
			n2 = 1;
		}
		return n2;
	}

	private static int getVersion() {
		final String version = GloftGF2M.s_instance.getAppProperty("MIDlet-Version");
		final int[] array = new int[3];
		int index = 0;
		for (int i = 0; i < version.length(); i++) {
			char char1 = version.charAt(i);
			if (char1 >= '0' && char1 <= '9') {
				array[index] = array[index] * 10 + (char1 - '0');
			} else if (char1 == '.') {
				++index;
			}
		}
		return 0 | array[0] << 8 | array[1] << 16 | array[2] << 24;
	}

	private static void makeRMSHeader() {
		final byte[] rmsHeader = new byte[11];
		GLLib.Mem_SetInt(rmsHeader, 0, getVersion());
		rmsHeader[4] = (byte) cGame.var_7fe4;
		rmsHeader[5] = (byte) cGame.s_languageCode;
		rmsHeader[6] = (byte) (cGame.var_69e4 ? 1 : 0);
		rmsHeader[7] = (byte) GLLibPlayer.s_snd_masterVolume;
		rmsHeader[10] = (byte) (cGame.var_7abc ? 1 : 0);
		try {
			GLLib.Rms_WriteFromBytes("RMSHeader", rmsHeader);
		} catch (final Exception ex) {
			sub_4052e(47, 48, 7, 0);
		}
	}

	private static boolean readFromRMSHeader() {
		final byte[] rmsHeader = GLLib.Rms_ReadFromBytes("RMSHeader");
		int version = 0;
		if (rmsHeader != null) {
			version = GLLib.Mem_GetInt(rmsHeader, 0);
		}
		if (rmsHeader == null || rmsHeader.length < 11 || version != getVersion()) {
			makeRMSHeader();
			return false;
		}
		cGame.var_7fe4 = rmsHeader[4];
		cGame.s_languageCode = rmsHeader[5];
		if (cGame.var_7fe4 == -1) {
			cGame.var_7fe4 = 0;
		}
		cGame.var_69e4 = (rmsHeader[6] == 1);
		cGame.var_7abc = (rmsHeader[10] == 1);
		try {
			GLLibPlayer.Snd_SetMasterVolume(rmsHeader[7]);
		} catch (final Exception ex) {
		}
		return true;
	}

	static void sub_e503() {
		sub_e522(false);
	}

	private static void sub_e522(final boolean b) {
		if (cGame.var_807c != 0 || cGame.var_6aa4 != -1) {
			return;
		}
		if (!b && (getLevel() < 3 || cGame.var_7fd4 != -1)) {
			return;
		}
		makeRMSHeader();
		if (cGame.var_6aa4 == -1) {
			byte[] array = new byte[51200];
			int n = GLLib.Mem_SetInt(array, GLLib.sub_3d63(array, GLLib.sub_3d63(array, GLLib.sub_3d63(array,
					GLLib.sub_3d63(array, GLLib.sub_3d63(array, GLLib.sub_3d63(array, GLLib.sub_3d63(array,
							GLLib.Mem_SetInt(array, GLLib.sub_3d63(array, GLLib.sub_3d63(array,
									GLLib.sub_3d63(array,
											GLLib.sub_3d63(array, 0, (byte) (cGame.var_7964 ? 1 : 0)),
											(byte) (cGame.var_69ec ? 1 : 0)),
									(byte) (cGame.var_69f4 ? 1 : 0)), (byte) (cGame.var_7974 ? 1 : 0)),
									cGame.var_6a24),
							(byte) cGame.var_7fd4), (byte) (cGame.var_6c14 ? 1 : 0)),
							(byte) (cGame.var_6c1c ? 1 : 0)), (byte) (cGame.var_6c24 ? 1 : 0)),
					(byte) (cGame.var_6c2c ? 1 : 0)), (byte) (cGame.var_6c4c ? 1 : 0)),
					(byte) (cGame.var_6c54 ? 1 : 0)), cGame.var_6c5c);
			for (char c = '\0'; c < cGame.var_7f74; ++c) {
				n = GLLib.sub_3d63(array,
						GLLib.Mem_SetInt(array,
								GLLib.sub_3d63(array,
										GLLib.Mem_SetInt(array, GLLib.sub_3d63(array, GLLib.Mem_SetInt(array,
												GLLib.Mem_SetInt(array, GLLib.Mem_SetInt(array, n, cGame.var_7e54[c]),
														cGame.var_7f5c[c]),
												cGame.var_7e94[c]), (byte) (cGame.var_7ebc[c] ? 1 : 0)),
												cGame.var_7ecc[c]),
										(byte) (cGame.var_7ef4[c] ? 1 : 0)),
								cGame.var_7f04[c]),
						(byte) (cGame.var_7f2c[c] ? 1 : 0));
			}
			for (int i = 0; i < cGame.var_7f7c; ++i) {
				n = GLLib.Mem_SetInt(array, n, cGame.var_7f64[i]);
			}
			int n2 = GLLib.Mem_SetInt(array,
					GLLib.Mem_SetInt(array,
							GLLib.Mem_SetInt(array, GLLib.sub_3d86(array, GLLib.Mem_SetInt(array,
									GLLib.sub_3d86(array, GLLib.Mem_SetInt(array, GLLib.sub_3df9(array,
											GLLib.Mem_SetInt(array, GLLib.Mem_SetInt(array, n, cGame.s_rmsLevel),
													cGame.s_rmsExp),
											cGame.var_6ff4), cGame.s_rmsCash), (short) cGame.var_7024),
									cGame.s_rmsMaxPlots), (short) cGame.var_7064), cGame.giant_gyatt),
							cGame.s_rmsMaxAmountInSilo),
					cGame.var_705c);
			for (int j = 0; j < 6; ++j) {
				n2 = GLLib.Mem_SetInt(array, n2, cGame.var_7014[j]);
			}
			for (int k = 0; k < 5; ++k) {
				for (int length = cGame.var_6fcc[k].length, l = 0; l < length; ++l) {
					n2 = GLLib.Mem_SetInt(array, n2, cGame.var_6fcc[k][l]);
				}
			}
			for (int n3 = 0; n3 < 10; ++n3) {
				for (int n4 = 0; n4 < 6; ++n4) {
					n2 = GLLib.Mem_SetInt(array, n2, cGame.var_6e24[n3][n4]);
				}
			}
			for (int n5 = 0; n5 < 10; ++n5) {
				for (int n6 = 0; n6 < 6; ++n6) {
					n2 = GLLib.sub_3df9(array, n2, cGame.var_6e34[n5][n6]);
				}
			}
			for (int n7 = 0; n7 < 10; ++n7) {
				for (int n8 = 0; n8 < 6; ++n8) {
					n2 = GLLib.Mem_SetInt(array, n2, cGame.var_6e2c[n7][n8]);
				}
			}
			for (int n9 = 0; n9 < 20; ++n9) {
				n2 = GLLib.Mem_SetInt(array, GLLib.Mem_SetInt(array,
						GLLib.Mem_SetInt(array, n2, cGame.var_6e4c[n9][0]), cGame.var_6e4c[n9][1]),
						cGame.var_6e4c[n9][2]);
				for (int n10 = 0; n10 < 3; ++n10) {
					n2 = GLLib.Mem_SetInt(array, GLLib.Mem_SetInt(array, n2, cGame.var_6e44[n9][n10 << 1]),
							cGame.var_6e44[n9][(n10 << 1) + 1]);
				}
			}
			int n11 = GLLib.sub_3d86(array, GLLib.Mem_SetInt(array, n2, cGame.var_808c), cGame.var_77f4);
			for (int n12 = 0; n12 < 6; ++n12) {
				n11 = GLLib.sub_3df9(array, n11, cGame.var_7774[n12]);
			}
			int n13 = GLLib.sub_3d63(array, n11, (byte) cGame.var_746c);
			for (int n14 = 0; n14 < cGame.var_746c; ++n14) {
				n13 = GLLib.sub_3d63(array,
						GLLib.Mem_SetInt(array,
								GLLib.Mem_SetInt(array,
										GLLib.sub_3df9(array, GLLib.sub_3d63(array, n13, cGame.var_74bc[n14]),
												cGame.var_74a4[n14]),
										cGame.var_749c[n14]),
								cGame.var_748c[n14]),
						(byte) (cGame.var_74c4[n14] ? 1 : 0));
			}
			int n15 = GLLib.sub_3d63(array, n13, (byte) cGame.var_7514);
			for (int n16 = 0; n16 < cGame.var_7514; ++n16) {
				n15 = GLLib.Mem_SetInt(array,
						GLLib.Mem_SetInt(array, GLLib.sub_3df9(array,
								GLLib.sub_3d63(array, n15, cGame.var_7564[n16]), cGame.var_7544[n16]),
								cGame.var_753c[n16]),
						cGame.var_752c[n16]);
			}
			for (int n17 = 0; n17 < cGame.var_6ee4; ++n17) {
				n15 = GLLib.Mem_SetInt(array,
						GLLib.sub_3d63(array,
								GLLib.Mem_SetInt(array,
										GLLib.sub_3d63(array, GLLib.Mem_SetInt(array, n15, cGame.var_6e64[n17]),
												cGame.var_6edc[n17]),
										cGame.var_6e94[n17]),
								(byte) (cGame.var_6eac[n17] ? 1 : 0)),
						cGame.var_6ed4[n17]);
			}
			for (int n18 = 0; n18 < 15; ++n18) {
				n15 = GLLib.sub_3d63(array, n15, (byte) (cGame.var_6eec[n18] ? 1 : 0));
			}
			for (int n19 = 0; n19 < 10; ++n19) {
				n15 = GLLib.Mem_SetInt(array, n15, cGame.var_6ef4[n19]);
			}
			for (int n20 = 0; n20 < 64; ++n20) {
				n15 = GLLib.sub_3d86(array, n15, cGame.var_6efc[n20]);
			}
			for (int n21 = 0; n21 < 60; ++n21) {
				n15 = GLLib.Mem_SetInt(array, n15, cGame.var_79f4[n21]);
			}
			for (int n22 = 0; n22 < 13; ++n22) {
				n15 = GLLib.sub_3d63(array, n15, (byte) (cGame.var_6dfc[n22] ? 1 : 0));
			}
			for (int n23 = 0; n23 < 13; ++n23) {
				n15 = GLLib.sub_3d63(array, n15, (byte) (cGame.var_6e04[n23] ? 1 : 0));
			}
			final int sub_3df9 = GLLib.sub_3df9(array, GLLib.sub_3df9(array, n15, cGame.var_7da4),
					cGame.var_814c);
			cGame.var_8144 = System.currentTimeMillis() / 1000L;
			int n24 = GLLib.Mem_SetInt(array, GLLib.sub_3df9(array, sub_3df9, cGame.var_8144), cGame.var_776c);
			for (int n25 = 0; n25 < 100; ++n25) {
				n24 = GLLib.Mem_SetInt(array, n24, cGame.var_7764[n25]);
			}
			GLLib.sub_3df9(array,
					GLLib.Mem_SetInt(array,
							GLLib.Mem_SetInt(array,
									GLLib.Mem_SetInt(array, GLLib.Mem_SetInt(array, GLLib.sub_3df9(array,
											GLLib.sub_3df9(array, GLLib.Mem_SetInt(array, n24, cGame.var_6d4c),
													cGame.var_77bc),
											cGame.var_77fc), cGame.var_709c), cGame.var_70a4),
									cGame.var_70ac),
							cGame.var_7d4c),
					cGame.var_77b4);
			try {
				GLLib.Rms_WriteFromBytes("save_gameplay", array);
			} catch (final Exception ex) {
				sub_4052e(47, 48, 7, 0);
			}
		}
		if (cGame.var_6aa4 == -1 && cGame.var_807c == 0) {
			final byte[] array2;
			final int sub_3db5 = GLLib.Mem_SetInt(array2 = new byte[102400], 0, getVersion());
			short n26 = 0;
			for (int n27 = 0; n27 < 13; ++n27) {
				if (cGame.var_6d5c[n27]) {
					n26 |= (short) (1 << n27);
				}
			}
			final int sub_3d86 = GLLib.sub_3d86(array2, sub_3db5, n26);
			final byte[] array4;
			final byte[] array3 = array4 = array2;
			final int n28 = sub_3d86;
			final Class_f var_800c = cGame.var_800c;
			final int n29 = n28;
			final byte[] array5 = array3;
			int n30 = GLLib.Mem_SetInt(array5,
					GLLib.sub_3d86(array5, GLLib.sub_3d86(array5,
							GLLib.sub_3d63(array3, n29, (byte) var_800c.var_17c5), (short) var_800c.var_17cd),
							(short) var_800c.var_17d5),
					var_800c.var_17dd);
			for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
				switch (var_17ad.var_17c5) {
				case 42: {
					final byte[] array6 = array4;
					final int n31 = n30;
					final Class_f class_f = var_17ad;
					final int n32 = n31;
					final byte[] array7 = array6;
					n30 = GLLib.Mem_SetInt(array7,
							GLLib.sub_3d86(array7, GLLib.sub_3d86(array7, GLLib.sub_3d86(array7,
									GLLib.sub_3d63(array7, GLLib.sub_3d63(array6, n32, (byte) class_f.var_17c5),
											(byte) class_f.var_1835),
									(short) class_f.var_17cd), (short) class_f.var_17d5), (short) class_f.var_17dd),
							class_f.var_1855);
					break;
				}
				case 20: {
					final byte[] array8 = array4;
					final int n33 = n30;
					final Class_f class_f2 = var_17ad;
					final int n34 = n33;
					final byte[] array9 = array8;
					n30 = GLLib.sub_3d63(array9, GLLib.Mem_SetInt(array9,
							GLLib.sub_3d86(array9, GLLib.sub_3d86(array9, GLLib.sub_3d86(array9,
									GLLib.sub_3d63(array9, GLLib.sub_3d63(array8, n34, (byte) class_f2.var_17c5),
											(byte) class_f2.var_1835),
									(short) class_f2.var_17cd), (short) class_f2.var_17d5), (short) class_f2.var_17dd),
							class_f2.var_1855), (byte) class_f2.var_185d);
					break;
				}
				case 48: {
					final byte[] array10 = array4;
					final int n35 = n30;
					final Class_f class_f3 = var_17ad;
					final int n36 = n35;
					final byte[] array11 = array10;
					n30 = GLLib.sub_3d63(array11, GLLib.Mem_SetInt(array11,
							GLLib.sub_3d86(array11, GLLib.sub_3d86(array11, GLLib.sub_3d86(array11,
									GLLib.sub_3d63(array11, GLLib.sub_3d63(array10, n36, (byte) class_f3.var_17c5),
											(byte) class_f3.var_1835),
									(short) class_f3.var_17cd), (short) class_f3.var_17d5), (short) class_f3.var_17dd),
							class_f3.var_1855), (byte) class_f3.var_185d);
					break;
				}
				case 22: {
					final byte[] array12 = array4;
					final int n37 = n30;
					final Class_f class_f4 = var_17ad;
					final int n38 = n37;
					final byte[] array13 = array12;
					n30 = GLLib.sub_3d63(array13, GLLib.Mem_SetInt(array13, GLLib.sub_3d86(array13,
							GLLib.sub_3d86(array13, GLLib.sub_3d86(array13, GLLib.sub_3d86(array13,
									GLLib.sub_3d63(array13, GLLib.sub_3d63(array12, n38, (byte) class_f4.var_17c5),
											(byte) class_f4.var_1835),
									(short) class_f4.var_17a5), (short) class_f4.var_17cd), (short) class_f4.var_17d5),
							(short) class_f4.var_17dd), class_f4.var_1855), (byte) class_f4.var_185d);
					break;
				}
				case 49: {
					final byte[] array14 = array4;
					final int n39 = n30;
					final Class_f class_f5 = var_17ad;
					final int n40 = n39;
					final byte[] array15 = array14;
					n30 = GLLib.sub_3df9(array15, GLLib.sub_3d63(array15, GLLib.Mem_SetInt(array15,
							GLLib.sub_3d86(array15, GLLib.sub_3d86(array15, GLLib.sub_3d86(array15,
									GLLib.sub_3d63(array15, GLLib.sub_3d63(array14, n40, (byte) class_f5.var_17c5),
											(byte) class_f5.var_1835),
									(short) class_f5.var_17cd), (short) class_f5.var_17d5), (short) class_f5.var_17dd),
							class_f5.var_1855), (byte) class_f5.var_185d), class_f5.var_15e5);
					break;
				}
				case 52: {
					final byte[] array16 = array4;
					final int n41 = n30;
					final Class_f class_f6 = var_17ad;
					final int n42 = n41;
					final byte[] array17 = array16;
					n30 = GLLib.sub_3df9(array17, GLLib.sub_3d63(array17, GLLib.Mem_SetInt(array17,
							GLLib.sub_3d86(array17, GLLib.sub_3d86(array17, GLLib.sub_3d86(array17,
									GLLib.sub_3d63(array17, GLLib.sub_3d63(array16, n42, (byte) class_f6.var_17c5),
											(byte) class_f6.var_1835),
									(short) class_f6.var_17cd), (short) class_f6.var_17d5), (short) class_f6.var_17dd),
							class_f6.var_1855), (byte) class_f6.var_185d), class_f6.var_1615);
					break;
				}
				case 50: {
					final byte[] array18 = array4;
					final int n43 = n30;
					final Class_f class_f7 = var_17ad;
					final int n44 = n43;
					final byte[] array19 = array18;
					int n45 = GLLib.sub_3d63(array19, GLLib.Mem_SetInt(array19,
							GLLib.sub_3d86(array19, GLLib.sub_3d86(array19, GLLib.sub_3d86(array19,
									GLLib.sub_3d63(array19, GLLib.sub_3d63(array18, n44, (byte) class_f7.var_17c5),
											(byte) class_f7.var_1835),
									(short) class_f7.var_17cd), (short) class_f7.var_17d5), (short) class_f7.var_17dd),
							class_f7.var_1855), (byte) class_f7.var_185d);
					if (class_f7.var_1835 == 12 || class_f7.var_1835 == 11) {
						n45 = GLLib.sub_3df9(array19, n45, class_f7.var_15c5);
					}
					n30 = n45;
					break;
				}
				case 54: {
					final byte[] array20 = array4;
					final int n46 = n30;
					final Class_f class_f8 = var_17ad;
					final int n47 = n46;
					final byte[] array21 = array20;
					n30 = GLLib.sub_3df9(array21,
							GLLib.sub_3df9(array21, GLLib.sub_3d63(array21, GLLib.sub_3d63(array21,
									GLLib.Mem_SetInt(array21, GLLib.sub_3d63(array21, GLLib.Mem_SetInt(array21,
											GLLib.sub_3d86(array21, GLLib.sub_3d86(array21,
													GLLib.sub_3d86(array21, GLLib.sub_3d63(array21,
															GLLib.sub_3d63(array20, n47, (byte) class_f8.var_17c5),
															(byte) class_f8.var_1835), (short) class_f8.var_17cd),
													(short) class_f8.var_17d5), (short) class_f8.var_17dd),
											class_f8.var_1855), (byte) class_f8.var_185d), class_f8.var_162d),
									(byte) class_f8.var_167d), (byte) class_f8.var_1635), class_f8.var_161d),
							class_f8.var_1645);
					break;
				}
				}
			}
			try {
				GLLib.Rms_Write("save_farm" + cGame.var_807c, array2, 0, n30, null);
			} catch (final Exception ex2) {
				sub_4052e(47, 48, 7, 0);
			}
		}
	}

	private static boolean sub_f524(final boolean b) {
		boolean sub_10216 = false;
		if (readFromRMSHeader() && (sub_10216 = sub_10216(true))) {
			for (char c = '\0'; c < cGame.var_7f74; ++c) {
				if (cGame.var_7e54[c] != -1) {
					sub_4a22d(cGame.var_7e54[c], c, false);
				}
			}
			sub_29e85();
		}
		return sub_10216;
	}

	private static boolean setValuesFromGameplaySave(final boolean b) {
		// Load the RMS file "save_gameplay"
		byte[] rmsGameplay = GLLib.Rms_ReadFromBytes("save_gameplay");
		if (rmsGameplay == null) {
			return false;
		} else {
			int offset = 0;
			cGame.var_7964 = (GLLib.Mem_GetByte(rmsGameplay, 0) != 0);
			++offset;
			offset += 2;
			cGame.var_69ec = true;
			cGame.var_69f4 = true;
			cGame.var_7974 = GLLib.Mem_GetByte(rmsGameplay, 3) != 0;
			++offset;
			cGame.var_6a24 = GLLib.Mem_GetInt(rmsGameplay, 4);
			offset += 4;
			cGame.var_7fd4 = GLLib.Mem_GetByte(rmsGameplay, 8);
			++offset;
			cGame.var_6c14 = GLLib.Mem_GetByte(rmsGameplay, 9) != 0;
			++offset;
			cGame.var_6c1c = GLLib.Mem_GetByte(rmsGameplay, 10) != 0;
			++offset;
			cGame.var_6c24 = GLLib.Mem_GetByte(rmsGameplay, 11) != 0;
			++offset;
			cGame.var_6c2c = GLLib.Mem_GetByte(rmsGameplay, 12) != 0;
			++offset;
			cGame.var_6c4c = GLLib.Mem_GetByte(rmsGameplay, 13) != 0;
			++offset;
			cGame.var_6c54 = GLLib.Mem_GetByte(rmsGameplay, 14) != 0;
			++offset;
			cGame.var_6c5c = GLLib.Mem_GetInt(rmsGameplay, 15);
			offset += 4;
			for (char c = '\0'; c < cGame.var_7f74; ++c) {
				cGame.var_7e54[c] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				if (cGame.var_7e54[c] == 255) {
					cGame.var_7e54[c] = -1;
				}
				cGame.var_7f5c[c] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_7e94[c] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_7ebc[c] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
				cGame.var_7ecc[c] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_7ef4[c] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
				cGame.var_7f04[c] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_7f2c[c] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
			}
			for (int i = 0; i < cGame.var_7f7c; ++i) {
				cGame.var_7f64[i] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
			}
			cGame.s_rmsLevel = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.s_rmsExp = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_6ff4 = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.s_rmsCash = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.s_level = cGame.s_rmsLevel;
			cGame.s_experienceAmount = cGame.s_rmsExp;
			cGame.var_713c = cGame.var_6ff4;
			cGame.s_cashAmount = cGame.s_rmsCash;
			cGame.var_7024 = GLLib.sub_3eb0(rmsGameplay, offset);
			offset += 2;
			cGame.s_rmsMaxPlots = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_7064 = GLLib.sub_3eb0(rmsGameplay, offset);
			offset += 2;
			cGame.giant_gyatt = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.s_rmsMaxAmountInSilo = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_705c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.s_maxPlots = cGame.s_rmsMaxPlots;
			cGame.skibidi_rizz = cGame.giant_gyatt;
			cGame.s_maxAmountInSilo = cGame.s_rmsMaxAmountInSilo;
			for (int j = 0; j < 6; ++j) {
				cGame.var_7014[j] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_714c[j] = cGame.var_7014[j];
			}
			for (int k = 0; k < 5; ++k) {
				for (int length = cGame.var_6fcc[k].length, l = 0; l < length; ++l) {
					cGame.var_6fcc[k][l] = GLLib.Mem_GetInt(rmsGameplay, offset);
					offset += 4;
					cGame.var_7174[k][l] = cGame.var_6fcc[k][l];
				}
			}
			for (int n2 = 0; n2 < 10; ++n2) {
				for (int n3 = 0; n3 < 6; ++n3) {
					cGame.var_6e24[n2][n3] = GLLib.Mem_GetInt(rmsGameplay, offset);
					offset += 4;
				}
			}
			for (int n4 = 0; n4 < 10; ++n4) {
				for (int n5 = 0; n5 < 6; ++n5) {
					cGame.var_6e34[n4][n5] = GLLib.sub_3f2d(rmsGameplay, offset);
					offset += 8;
				}
			}
			for (int n6 = 0; n6 < 10; ++n6) {
				for (int n7 = 0; n7 < 6; ++n7) {
					cGame.var_6e2c[n6][n7] = GLLib.Mem_GetInt(rmsGameplay, offset);
					offset += 4;
				}
			}
			for (int n8 = 0; n8 < 20; ++n8) {
				cGame.var_6e4c[n8][0] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_6e4c[n8][1] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_6e4c[n8][2] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				for (int n9 = 0; n9 < 3; ++n9) {
					cGame.var_6e44[n8][n9 << 1] = GLLib.Mem_GetInt(rmsGameplay, offset);
					offset += 4;
					cGame.var_6e44[n8][(n9 << 1) + 1] = GLLib.Mem_GetInt(rmsGameplay, offset);
					offset += 4;
				}
			}
			cGame.var_808c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_77f4 = GLLib.sub_3eb0(rmsGameplay, offset);
			offset += 2;
			for (int n10 = 0; n10 < 6; ++n10) {
				cGame.var_7774[n10] = GLLib.sub_3f2d(rmsGameplay, offset);
				offset += 8;
			}
			cGame.var_746c = GLLib.Mem_GetByte(rmsGameplay, offset);
			++offset;
			for (int n11 = 0; n11 < cGame.var_746c; ++n11) {
				final byte sub_3e92 = GLLib.Mem_GetByte(rmsGameplay, offset);
				++offset;
				final long sub_3f2d = GLLib.sub_3f2d(rmsGameplay, offset);
				offset += 8;
				final int sub_3ee1 = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				final int sub_3ee2 = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				final boolean b2 = GLLib.Mem_GetByte(rmsGameplay, offset) != 0;
				++offset;
				final int n12 = n11;
				final int n13 = sub_3ee2;
				final long n14 = sub_3f2d;
				final int n15 = sub_3ee1;
				final boolean b3 = b2;
				final byte b4 = sub_3e92;
				final boolean b5 = b3;
				final int n16 = n15;
				final long n17 = n14;
				final int n18 = n13;
				final int n19 = n12;
				Class_h class_h;
				int n20;
				for (class_h = Class_h.var_6a[7], n20 = 0; n20 < class_h.var_7a
						&& n18 != class_h.var_82[n20][1]; ++n20) {
				}
				if (n20 < class_h.var_7a) {
					cGame.var_748c[n19] = n18;
					cGame.var_74a4[n19] = n17;
					cGame.var_7494[n19] = class_h.var_82[n20][2];
					cGame.var_749c[n19] = n16;
					cGame.var_74ac[n19] = class_h.var_82[n20][15];
					cGame.var_74c4[n19] = b5;
					cGame.var_74b4[n19] = cGame.var_80d4[class_h.var_82[n20][18]];
					cGame.var_74bc[n19] = b4;
					cGame.var_747c = n19 + 1;
				}
			}
			cGame.var_7514 = GLLib.Mem_GetByte(rmsGameplay, offset);
			++offset;
			for (int n21 = 0; n21 < cGame.var_7514; ++n21) {
				final byte sub_3e93 = GLLib.Mem_GetByte(rmsGameplay, offset);
				++offset;
				final long sub_3f2d2 = GLLib.sub_3f2d(rmsGameplay, offset);
				offset += 8;
				final int sub_3ee3 = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				final int sub_3ee4 = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				final int n22 = n21;
				final int n23 = sub_3ee4;
				final long n24 = sub_3f2d2;
				final int n25 = sub_3ee3;
				final byte b6 = sub_3e93;
				final int n26 = n25;
				final long n27 = n24;
				final int n28 = n23;
				final int n29 = n22;
				final Class_h class_h2 = Class_h.var_6a[22];
				final Class_h class_h3 = Class_h.var_6a[1];
				int n30;
				for (n30 = 0; n30 < class_h2.var_7a && n28 != class_h2.var_82[n30][1]; ++n30) {
				}
				if (n30 < class_h2.var_7a) {
					cGame.var_752c[n29] = n28;
					cGame.var_7544[n29] = n27;
					cGame.var_7534[n29] = class_h2.var_82[n30][2];
					cGame.var_753c[n29] = n26;
					cGame.var_754c[n29] = class_h2.var_82[n30][12];
					final int n31 = class_h2.var_82[n30][15];
					cGame.var_7554[n29] = (short) class_h3.var_82[n31][3];
					cGame.var_755c[n29] = (short) class_h3.var_82[n31][4];
					cGame.var_7564[n29] = b6;
					cGame.var_751c = n29 + 1;
				}
			}
			for (int n32 = 0; n32 < cGame.var_6ee4; ++n32) {
				cGame.var_6e64[n32] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_6edc[n32] = GLLib.Mem_GetByte(rmsGameplay, offset);
				++offset;
				cGame.var_6e94[n32] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
				cGame.var_6eac[n32] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
				cGame.var_6ed4[n32] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
			}
			for (int n33 = 0; n33 < 15; ++n33) {
				cGame.var_6eec[n33] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
			}
			for (int n34 = 0; n34 < 10; ++n34) {
				cGame.var_6ef4[n34] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
			}
			for (int n35 = 0; n35 < 64; ++n35) {
				cGame.var_6efc[n35] = GLLib.sub_3eb0(rmsGameplay, offset);
				offset += 2;
			}
			for (int n36 = 0; n36 < 60; ++n36) {
				cGame.var_79f4[n36] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
			}
			if (cGame.var_6dfc == null) {
				cGame.var_6dfc = new boolean[13];
			}
			for (int n37 = 0; n37 < 13; ++n37) {
				cGame.var_6dfc[n37] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
			}
			if (cGame.var_6e04 == null) {
				cGame.var_6e04 = new boolean[13];
			}
			for (int n38 = 0; n38 < 13; ++n38) {
				cGame.var_6e04[n38] = (GLLib.Mem_GetByte(rmsGameplay, offset) != 0);
				++offset;
			}
			cGame.var_7da4 = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.var_814c = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.var_8144 = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.var_776c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			for (int n39 = 0; n39 < 100; ++n39) {
				cGame.var_7764[n39] = GLLib.Mem_GetInt(rmsGameplay, offset);
				offset += 4;
			}
			cGame.var_6d4c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_77bc = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.var_77fc = GLLib.sub_3f2d(rmsGameplay, offset);
			offset += 8;
			cGame.var_709c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_70a4 = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_70ac = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_7d4c = GLLib.Mem_GetInt(rmsGameplay, offset);
			offset += 4;
			cGame.var_77b4 = GLLib.sub_3f2d(rmsGameplay, offset);
			for (char c2 = '\0'; c2 < cGame.var_7f74; ++c2) {
				if (cGame.var_7e54[c2] != -1) {
					sub_4a22d(cGame.var_7e54[c2], c2, false);
				}
			}
			sub_29e85();
			return true;
		}
	}

	private static boolean sub_10216(final boolean b) {
		final byte[] sub_5579;
		if ((sub_5579 = GLLib.Rms_ReadFromBytes("save_farm" + cGame.var_807c)) == null) {
			return false;
		}
		final int length = sub_5579.length;
		final short sub_3eb0 = GLLib.sub_3eb0(sub_5579, 4);
		for (int i = 0; i < 13; ++i) {
			cGame.var_6d5c[i] = ((sub_3eb0 >> i & 0x1) != 0x0);
		}
		sub_102cc(sub_5579, 6, length);
		return true;
	}

	private static int sub_102cc(final byte[] array, int i, final int n) {
		while (i < n) {
			final byte sub_3e92 = GLLib.Mem_GetByte(array, i);
			++i;
			switch (sub_3e92) {
			case 13: {
				int n2 = i;
				(cGame.var_800c = Class_f.sub_92c9(13, new int[] { 0, 0, 255 })).var_17cd = GLLib.sub_3eb0(array,
						n2);
				n2 += 2;
				cGame.var_800c.var_17d5 = GLLib.sub_3eb0(array, n2);
				n2 += 2;
				cGame.var_800c.var_17dd = GLLib.Mem_GetInt(array, n2);
				n2 += 4;
				i = n2;
				continue;
			}
			case 42: {
				int n3 = i;
				final byte sub_3e93 = GLLib.Mem_GetByte(array, n3);
				++n3;
				Class_f sub_25b35;
				if (sub_3e93 == -1) {
					sub_25b35 = (cGame.var_8004 = Class_f.sub_92c9(42, new int[] { 0, 0, 12, 2 }));
				} else {
					sub_25b35 = sub_25b35(8, sub_3e93);
				}
				sub_25b35.var_17cd = GLLib.sub_3eb0(array, n3);
				n3 += 2;
				sub_25b35.var_17d5 = GLLib.sub_3eb0(array, n3);
				n3 += 2;
				sub_25b35.var_17dd = GLLib.sub_3eb0(array, n3);
				n3 += 2;
				sub_25b35.var_1855 = GLLib.Mem_GetInt(array, n3);
				n3 += 4;
				i = n3;
				continue;
			}
			case 20: {
				int n4 = i;
				final byte sub_3e94 = GLLib.Mem_GetByte(array, n4);
				++n4;
				final Class_f sub_25b36;
				(sub_25b36 = sub_25b35(4, sub_3e94)).var_17cd = GLLib.sub_3eb0(array, n4);
				n4 += 2;
				sub_25b36.var_17d5 = GLLib.sub_3eb0(array, n4);
				n4 += 2;
				sub_25b36.var_17dd = GLLib.sub_3eb0(array, n4);
				n4 += 2;
				sub_25b36.var_1855 = GLLib.Mem_GetInt(array, n4);
				n4 += 4;
				sub_25b36.var_185d = GLLib.Mem_GetByte(array, n4);
				++n4;
				if (sub_25b36.sub_a2a0(2)) {
					sub_2c907(sub_25b36);
				}
				i = n4;
				continue;
			}
			case 48: {
				int n5 = i;
				final byte sub_3e95 = GLLib.Mem_GetByte(array, n5);
				++n5;
				final Class_f sub_25b37;
				(sub_25b37 = sub_25b35(11, sub_3e95)).var_17cd = GLLib.sub_3eb0(array, n5);
				n5 += 2;
				sub_25b37.var_17d5 = GLLib.sub_3eb0(array, n5);
				n5 += 2;
				sub_25b37.var_17dd = GLLib.sub_3eb0(array, n5);
				n5 += 2;
				sub_25b37.var_1855 = GLLib.Mem_GetInt(array, n5);
				n5 += 4;
				sub_25b37.var_185d = GLLib.Mem_GetByte(array, n5);
				++n5;
				if (sub_25b37.sub_a2a0(2)) {
					sub_2c907(sub_25b37);
				}
				i = n5;
				continue;
			}
			case 22: {
				int n6 = i;
				final byte sub_3e96 = GLLib.Mem_GetByte(array, n6);
				++n6;
				final Class_f sub_25b38;
				(sub_25b38 = sub_25b35(11, sub_3e96)).var_17a5 = GLLib.sub_3eb0(array, n6);
				n6 += 2;
				sub_25b38.var_17cd = GLLib.sub_3eb0(array, n6);
				n6 += 2;
				sub_25b38.var_17d5 = GLLib.sub_3eb0(array, n6);
				n6 += 2;
				sub_25b38.var_17dd = GLLib.sub_3eb0(array, n6);
				n6 += 2;
				sub_25b38.var_1855 = GLLib.Mem_GetInt(array, n6);
				n6 += 4;
				sub_25b38.var_185d = GLLib.Mem_GetByte(array, n6);
				++n6;
				if (sub_25b38.sub_a2a0(2)) {
					sub_2c907(sub_25b38);
				}
				i = n6;
				continue;
			}
			case 49: {
				int n7 = i;
				final byte sub_3e97 = GLLib.Mem_GetByte(array, n7);
				++n7;
				final Class_f sub_25a26;
				(sub_25a26 = sub_25a26(49, 0, false)).var_1835 = sub_3e97;
				sub_25a26.var_17cd = GLLib.sub_3eb0(array, n7);
				n7 += 2;
				sub_25a26.var_17d5 = GLLib.sub_3eb0(array, n7);
				n7 += 2;
				sub_25a26.var_17dd = GLLib.sub_3eb0(array, n7);
				n7 += 2;
				sub_25a26.var_1855 = GLLib.Mem_GetInt(array, n7);
				n7 += 4;
				final byte sub_3e98 = GLLib.Mem_GetByte(array, n7);
				++n7;
				sub_25a26.sub_7795(sub_3e98);
				if (sub_3e97 > 0) {
					sub_25213(sub_3e97);
					sub_25a26.sub_736e(sub_3e97);
				} else {
					sub_25a26.var_18c5 = cGame.var_8094[0];
				}
				sub_25a26.var_15e5 = GLLib.sub_3f2d(array, n7);
				n7 += 8;
				if (sub_25a26.sub_a2a0(2)) {
					sub_2c907(sub_25a26);
				}
				i = n7;
				continue;
			}
			case 52: {
				int n8 = i;
				final byte sub_3e99 = GLLib.Mem_GetByte(array, n8);
				++n8;
				final Class_f sub_25b39;
				(sub_25b39 = sub_25b35(2, sub_3e99)).var_1835 = sub_3e99;
				sub_25b39.var_17cd = GLLib.sub_3eb0(array, n8);
				n8 += 2;
				sub_25b39.var_17d5 = GLLib.sub_3eb0(array, n8);
				n8 += 2;
				sub_25b39.var_17dd = GLLib.sub_3eb0(array, n8);
				n8 += 2;
				sub_25b39.var_1855 = GLLib.Mem_GetInt(array, n8);
				n8 += 4;
				final byte sub_3e100 = GLLib.Mem_GetByte(array, n8);
				++n8;
				sub_25b39.sub_7b13(sub_3e100);
				sub_25b39.var_1615 = GLLib.sub_3f2d(array, n8);
				n8 += 8;
				if (sub_25b39.sub_a2a0(2)) {
					sub_2c907(sub_25b39);
				}
				i = n8;
				continue;
			}
			case 50: {
				int n9 = i;
				final byte sub_3e101 = GLLib.Mem_GetByte(array, n9);
				++n9;
				final Class_f sub_25b40;
				(sub_25b40 = sub_25b35(3, sub_3e101)).var_17cd = GLLib.sub_3eb0(array, n9);
				n9 += 2;
				sub_25b40.var_17d5 = GLLib.sub_3eb0(array, n9);
				n9 += 2;
				sub_25b40.var_17dd = GLLib.sub_3eb0(array, n9);
				n9 += 2;
				sub_25b40.var_1855 = GLLib.Mem_GetInt(array, n9);
				n9 += 4;
				sub_25b40.var_185d = GLLib.Mem_GetByte(array, n9);
				++n9;
				if (sub_3e101 == 12 || sub_3e101 == 11) {
					sub_25b40.var_15c5 = GLLib.sub_3f2d(array, n9);
					n9 += 8;
				}
				if (sub_25b40.sub_a2a0(2)) {
					sub_2c907(sub_25b40);
				}
				i = n9;
				continue;
			}
			case 54: {
				int n10 = i;
				final byte sub_3e102 = GLLib.Mem_GetByte(array, n10);
				++n10;
				final Class_f sub_25b41;
				(sub_25b41 = sub_25b35(0, sub_3e102)).var_1835 = sub_3e102;
				sub_25b41.var_17cd = GLLib.sub_3eb0(array, n10);
				n10 += 2;
				sub_25b41.var_17d5 = GLLib.sub_3eb0(array, n10);
				n10 += 2;
				sub_25b41.var_17dd = GLLib.sub_3eb0(array, n10);
				n10 += 2;
				sub_25b41.var_1855 = GLLib.Mem_GetInt(array, n10);
				n10 += 4;
				sub_25b41.var_185d = GLLib.Mem_GetByte(array, n10);
				++n10;
				sub_25b41.sub_8365(sub_25b41.var_185d);
				sub_25b41.sub_7ed6();
				sub_25b41.var_162d = GLLib.Mem_GetInt(array, n10);
				n10 += 4;
				sub_25b41.var_167d = GLLib.Mem_GetByte(array, n10);
				++n10;
				sub_25b41.var_1635 = GLLib.Mem_GetByte(array, n10);
				++n10;
				sub_25b41.var_161d = GLLib.sub_3f2d(array, n10);
				n10 += 8;
				sub_25b41.var_1645 = GLLib.sub_3f2d(array, n10);
				n10 += 8;
				i = n10;
				continue;
			}
			}
		}
		return i;
	}

	private static void sub_10922() {
		sub_11320(false, null);
		sub_81e0(14);
	}

	private static void sub_10947(final boolean b) {
		if (sub_20167(1, 38) == b) {
			return;
		}
		final int sub_4ace8;
		if ((sub_4ace8 = sub_4ace8()) > 0) {
			for (int i = 38; i <= 54; ++i) {
				sub_1db3f(1, i);
			}
			cGame.var_68c4[1][38][6] = (short) (sub_4ace8 + 2 - 1);
			cGame.var_68bc[1][38][6] = (short) (sub_4ace8 + 2 - 1);
			int n;
			if ((n = 360 - (sub_4ace8 - 1) * 72 - 36) < 137) {
				n = 137;
			}
			cGame.var_68c4[1][38][3] = (short) n;
			cGame.var_68c4[1][43][3] = (short) (n - 45);
			sub_2000c(1, 38, b);
			sub_2000c(1, 43, b);
			sub_2024d(1, 38, b);
			sub_2024d(1, 39, b);
			sub_2024d(1, 40, b);
			sub_2024d(1, 41, b);
			sub_2024d(1, 42, b);
			n += 41;
			if (b) {
				for (int j = 0; j < sub_4ace8; ++j) {
					final int n2 = j;
					int n3 = -1;
					if (cGame.var_7e4c[n2] != -1) {
						n3 = cGame.var_7e84[n2] - 1;
					}
					final int n4;
					if ((n4 = n3) != -1) {
						cGame.var_68bc[1][j + 39][6] = (short) n4;
						sub_2000c(1, j + 39, true);
						cGame.var_68c4[1][j + 39][3] = (short) n;
					}
					if (cGame.var_7f5c[j] == 1) {
						cGame.var_6bdc |= 1 << j;
						cGame.var_68bc[1][j + 47][3] = (short) (n - 20);
					} else {
						sub_2000c(1, j + 47, false);
					}
					n += 77;
				}
				sub_2c69b();
				sub_1fb8e(1);
				final int[] array = cGame.var_6914[2];
				final int n5 = 7;
				array[n5] += 10;
			} else {
				sub_2000c(1, 39, false);
				sub_2000c(1, 40, false);
				sub_2000c(1, 41, false);
				sub_2000c(1, 42, false);
				sub_2000c(1, 47, false);
				sub_2000c(1, 48, false);
				sub_2000c(1, 49, false);
				sub_2000c(1, 50, false);
				cGame.var_6bd4 = false;
				cGame.var_6bdc = 0;
				sub_2c69b();
				sub_1fb8e(1);
			}
			cGame.var_6be4 = (char) sub_23556(65574, 65579, 0, b ? cGame.var_68c4[1][38][3] : 0, 0,
					b ? 0 : cGame.var_68c4[1][38][3], 500);
			if (!b) {
				cGame.var_6be4 = '\u00ff';
			}
			if (sub_4ace8 < 4) {
				sub_234cb(2, 1);
			}
			return;
		}
		sub_2c69b();
		sub_1fb8e(1);
	}

	private static void sub_10c1f(final boolean b) {
		if (!b) {
			sub_2000c(1, 55, b);
			return;
		}
		int n = 0;
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			if (sub_4aad0(c) && cGame.var_7f5c[c] == 1) {
				++n;
			}
		}
		if (n == 0) {
			sub_2000c(1, 55, false);
			return;
		}
		if (sub_20167(1, 44)) {
			sub_2000c(1, 55, b);
		}
		cGame.var_68bc[1][55][6] = (short) (n - 1);
	}

	private static void sub_10cd1(final boolean b) {
		if (cGame.var_7fd4 == -1) {
			if (cGame.var_7fc4 == 100) {
				cGame.var_68bc[1][58][6] = 66;
			} else {
				cGame.var_68bc[1][58][6] = 8;
			}
			if (cGame.var_807c == 0) {
				sub_2000c(1, 58, b);
				sub_2024d(1, 58, b);
			} else {
				sub_2000c(1, 58, true);
				sub_2024d(1, 58, true);
			}
		}
		sub_2000c(1, 44, b);
		sub_2000c(1, 59, b);
		if (sub_4ace8() > 0) {
			sub_2024d(1, 44, b);
		}
		sub_2024d(1, 59, b);
		if (sub_4ac19(2) || sub_4abbb(cGame.var_80f4[2])) {
			sub_2000c(1, 60, b);
			sub_2024d(1, 60, b);
		}
		sub_10c1f(b);
		if (!b) {
			sub_10947(false);
			return;
		}
		sub_2c69b();
		sub_1fb8e(1);
	}

	private static void sub_10dd3(final boolean b) {
		sub_2000c(1, 62, b);
		sub_2024d(1, 62, b);
		if (cGame.var_7fd4 == -1) {
			sub_2000c(1, 63, b);
			sub_2024d(1, 63, b);
		} else {
			sub_2000c(1, 63, false);
			sub_2024d(1, 63, false);
		}
		sub_2c69b();
		sub_1fb8e(1);
	}

	static void sub_10e3f(final boolean b, int var_6b94, final int var_6b95) {
		final boolean b2 = b;
		for (int i = 64; i <= 71; ++i) {
			sub_2000c(1, i, b);
			cGame.var_68bc[1][i][18] = (short) (b2 ? 1 : 0);
		}
		int n = 65;
		if (b) {
			cGame.var_6b94 = var_6b94;
			Class_h class_h = null;
			var_6b94 = 0;
			int j = 0;
			switch (cGame.var_6b94) {
			case 0: {
				var_6b94 = 12;
				class_h = Class_h.var_6a[2];
				j = 1;
				cGame.var_6b8c = 11;
				break;
			}
			case 1: {
				var_6b94 = 8;
				class_h = Class_h.var_6a[21];
				cGame.var_6b8c = 0;
				break;
			}
			}
			cGame.var_6b64 = var_6b95 - 2;
			cGame.var_6b6c = new int[var_6b94];
			cGame.var_6b74 = new int[var_6b94];
			cGame.var_6b7c = new int[var_6b94];
			cGame.var_6b84 = new int[var_6b94];
			int n2 = 0;
			while (j < var_6b94) {
				switch (cGame.var_6b94) {
				case 0: {
					n2 = class_h.var_82[j][5] - 1;
					if (class_h.var_82[j][8] <= getLevel()) {
						cGame.var_6b6c[n2] = class_h.var_82[j][3];
						cGame.var_6b74[n2] = class_h.var_82[j][4];
					} else {
						cGame.var_6b6c[n2] = 20;
						cGame.var_6b74[n2] = 136;
					}
					cGame.var_6b7c[n2] = class_h.var_82[j][6];
					cGame.var_6b84[n2] = j;
					break;
				}
				case 1: {
					if (class_h.var_82[j][3] > -1) {
						cGame.var_6b6c[n2] = class_h.var_82[j][3];
						cGame.var_6b74[n2] = class_h.var_82[j][4];
						cGame.var_6b7c[n2] = 0;
						if (cGame.var_6af4 == (cGame.var_6b84[n2] = j)) {
							n += n2;
						}
						++n2;
						++cGame.var_6b8c;
						break;
					}
					cGame.var_6b6c[n2] = -1;
					cGame.var_6b74[n2] = -1;
					break;
				}
				}
				++j;
			}
			cGame.var_6b04 = var_6b95;
			if (cGame.var_6b94 == 0) {
				sub_25213(cGame.var_6b84[cGame.var_6b04]);
			}
			sub_111ae();
			sub_2c69b();
			sub_1fb8e(1);
			sub_234cb(3, 6);
			cGame.var_6914[3][4] = ((cGame.var_68d4[20].sub_3238(116) < 0) ? (-cGame.var_68d4[20].sub_3238(116))
					: cGame.var_68d4[20].sub_3238(116));
			cGame.var_6914[3][10] = cGame.var_68c4[1][67][2];
			cGame.var_6914[3][11] = cGame.var_68c4[1][67][3];
			if (cGame.var_6b94 != 0) {
				sub_23297(3, n);
			}
			final int[] array = cGame.var_6914[3];
			final int n3 = 12;
			array[n3] &= 0xFFFFFFF7;
			return;
		}
		sub_2c69b();
		sub_1f8c5(1);
		cGame.var_6b6c = null;
		cGame.var_6b74 = null;
		cGame.var_6b7c = null;
		cGame.var_6b84 = null;
		cGame.var_6af4 = -1;
	}

	private static void sub_111ae() {
		sub_23a84(66);
		int n = 65;
		int i = 0;
		int var_6b8c = cGame.var_6b8c;
		if (cGame.var_6b8c > 6) {
			i = cGame.var_6b64;
			var_6b8c = cGame.var_6b64 + 6;
		}
		while (i < var_6b8c) {
			sub_2000c(1, n, true);
			if (i < 0) {
				if (cGame.var_6b8c + i >= 0 && cGame.var_68bc[1][n] != null && cGame.var_6b6c != null
						&& cGame.var_6b74 != null) {
					cGame.var_68bc[1][n][5] = (short) cGame.var_6b6c[cGame.var_6b8c + i];
					cGame.var_68bc[1][n][6] = (short) cGame.var_6b74[cGame.var_6b8c + i];
				}
			} else if (i >= cGame.var_6b8c) {
				if (i - cGame.var_6b8c >= 0) {
					cGame.var_68bc[1][n][5] = (short) cGame.var_6b6c[i - cGame.var_6b8c];
					cGame.var_68bc[1][n][6] = (short) cGame.var_6b74[i - cGame.var_6b8c];
				}
			} else if (cGame.var_68bc[1][n] != null && cGame.var_6b6c != null && cGame.var_6b74 != null
					&& i >= 0) {
				cGame.var_68bc[1][n][5] = (short) cGame.var_6b6c[i];
				cGame.var_68bc[1][n][6] = (short) cGame.var_6b74[i];
			}
			++i;
			++n;
		}
		for (int j = n; j <= 70; ++j) {
			sub_2000c(1, j, false);
		}
	}

	static void sub_11320(final boolean b, final Class_f var_8034) {
		if (cGame.var_807c != 0) {
			return;
		}
		if (b) {
			sub_251a0(-1);
		}
		cGame.var_8034 = var_8034;
		sub_2000c(1, 0, b);
		sub_2000c(1, 3, b);
		sub_2000c(1, 1, b);
		sub_2000c(1, 2, b);
		sub_2000c(1, 4, b);
		sub_2000c(1, 5, b);
		sub_2000c(1, 6, b);
		sub_2000c(1, 7, b);
		sub_2c69b();
		sub_1f8c5(1);
		if (cGame.var_8034 != null) {
			if (cGame.var_8034.var_17c5 == 54 && cGame.var_8034.sub_a2a0(32)) {
				final String sub_4e1f;
				cGame.var_68cc[1][6] = (((sub_4e1f = GLLib.TODO_sub_4e1f(464)) == null) ? "" : sub_4e1f);
			} else {
				final String sub_4e1f2;
				cGame.var_68cc[1][6] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(463)) == null) ? "" : sub_4e1f2);
			}
			cGame.var_68cc[1][7] = cGame.s_plantGrowTime;
			cGame.var_68cc[1][5] = Integer.toString(cGame.var_8034.var_18cd);
		}
	}

	static boolean sub_1146d() {
		return cGame.var_68bc[1][0][10] == 1;
	}

	private static void sub_114a7(final boolean b, final boolean b2, final boolean b3) {
		final boolean b4 = b;
		if (sub_4ace8() > 0) {
			sub_2024d(1, 44, b);
		}
		sub_10c1f(b);
		sub_2024d(1, 59, b);
		if (!b3) {
			sub_2000c(1, 11, b);
			sub_2000c(1, 12, b);
			sub_2000c(1, 14, cGame.s_iapEnabled && b);
			sub_2000c(1, 15, b);
			if (getLevel() < 50) {
				sub_2000c(1, 17, b);
				sub_2000c(1, 18, b);
			} else {
				sub_2000c(1, 17, false);
				sub_2000c(1, 18, false);
			}
			sub_2000c(1, 21, b);
			cGame.var_68bc[1][34][10] = (short) ((b2 ? b4 : false) ? 1 : 0);
		} else {
			sub_2000c(1, 11, false);
			sub_2024d(1, 11, false);
			sub_2000c(1, 12, false);
			sub_2000c(1, 14, false);
			sub_2024d(1, 14, false);
			sub_2000c(1, 15, false);
			sub_2000c(1, 17, false);
			sub_2000c(1, 18, false);
			sub_2000c(1, 21, true);
		}
		cGame.var_68bc[1][30][10] = 0;
		cGame.var_68bc[1][30][18] = 0;
		sub_2000c(1, 24, false);
		sub_2000c(1, 25, false);
		sub_2000c(1, 26, false);
		if (sub_4ac19(23) || sub_4abbb(cGame.var_80f4[23])) {
			sub_2000c(1, 28, !b2 && b);
			sub_2000c(1, 29, !b2 && b);
		} else {
			sub_2000c(1, 28, false);
			sub_2000c(1, 29, false);
		}
		cGame.var_68bc[1][33][10] = (short) ((b2 ? b4 : false) ? 1 : 0);
		cGame.var_68bc[1][33][18] = (short) ((b2 ? b4 : false) ? 1 : 0);
	}

	private static void sub_11737() {
		if (cGame.var_6bc4) {
			cGame.var_6bc4 = false;
			sub_26a6a(true, cGame.var_7f6c, cGame.var_6bcc);
		}
	}

	private static int sub_11774(final int n) {
		return Class_h.var_6a[2].var_82[n][5] - 1;
	}

	private static void sub_1179d(final boolean b) {
		sub_10dd3(false);
		sub_25043(b);
		GLLibPlayer.sub_5f26();
		cGame.var_8074 = true;
		if (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1 || cGame.var_6aa4 == 4) {
			cGame.var_6aa4 = -1;
			sub_10cd1(true);
		}
		sub_11737();
	}

	private static void sub_117fc() {
		if (cGame.var_6aa4 == -1 || cGame.var_7fd4 != -1) {
			return;
		}
		boolean b = false;
		if (cGame.var_6aa4 == 4) {
			final int sub_a9ce;
			sub_2da02(sub_a9ce = cGame.var_6aac.sub_a9ce(), cGame.var_6aac.var_1835, cGame.var_6aac);
			if (sub_a9ce == 3) {
				sub_2deb3(cGame.var_6aac, true);
				b = true;
			}
		}
		if (cGame.var_6aa4 == 4 || cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1) {
			cGame.var_6aac.sub_aa8a();
		} else if (cGame.var_6aac.sub_a2a0(2)) {
			cGame.var_6aac.var_17cd = cGame.var_6adc;
			cGame.var_6aac.var_17d5 = cGame.var_6ae4;
			sub_2c907(cGame.var_6aac);
		}
		sub_1179d(b);
	}

	private static void sub_118c5(final boolean b) {
		sub_2000c(1, 30, b);
		sub_2024d(1, 30, b);
	}

	private static void sub_118ee() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_11915() {
		if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
			sub_23a84(61);
			sub_3151e(0, 0);
			return;
		}
		if (cGame.var_721c == 2 && cGame.var_7214 == 0 && Class_f.sub_4cf5(0, 49) >= getMaxPlots()) {
			sub_23a84(56);
			sub_4052e(487, 488, 7, 0);
			return;
		}
		sub_3225a(0);
		if (cGame.var_7fd4 == 41) {
			cGame.var_6c94 = true;
		}
	}

	private static void sub_119a4() {
		if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
			sub_23a84(61);
			sub_3151e(0, 2);
			return;
		}
		sub_3225a(2);
	}

	private static void sub_119f0() {
		if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
			sub_23a84(61);
			sub_3151e(0, 3);
			return;
		}
		sub_3225a(3);
	}

	private static void sub_11a3c() {
		if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
			sub_23a84(61);
			sub_3151e(0, 4);
			return;
		}
		sub_3225a(4);
	}

	private static void sub_11a88() {
		if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
			sub_23a84(61);
			sub_3151e(0, 4);
			return;
		}
		sub_3225a(5);
	}

	private static void sub_11ad4() {
		sub_23a84(61);
		sub_32132(3);
	}

	private static void sub_11af8() {
		sub_23a84(61);
		sub_32132(4);
	}

	private static void sub_11b1c() {
		sub_23a84(61);
		sub_32132(5);
	}

	private static void sub_11b40() {
		if (cGame.var_7fd4 == 41 || cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			return;
		}
		sub_23a84(61);
		sub_3151e(2, -1);
		sub_11cd7(0);
	}

	private static void sub_11b96() {
		if (cGame.var_7fd4 == 41) {
			return;
		}
		sub_23a84(61);
		sub_31ca6(0);
		sub_11cd7(1);
	}

	private static void sub_11bd5() {
		if (cGame.var_7fd4 == 41 || cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			return;
		}
		sub_23a84(61);
		sub_3151e(3, -1);
		sub_11cd7(2);
	}

	private static void sub_11c2b() {
		if (cGame.var_7fd4 == 41 || cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			return;
		}
		sub_23a84(61);
		sub_3151e(4, -1);
		sub_11cd7(3);
	}

	private static void sub_11c81() {
		if (cGame.var_7fd4 == 41 || cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			return;
		}
		sub_23a84(61);
		sub_3151e(0, -1);
		sub_11cd7(4);
	}

	private static void sub_11cd7(final int var_722c) {
		cGame.var_722c = var_722c;
		for (int i = 15; i <= 19; ++i) {
			sub_2000c(2, i, false);
		}
		sub_2000c(2, var_722c + 15, true);
		sub_22d97(0);
	}

	private static void sub_11d30() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_11d57() {
		if (cGame.var_7fd4 != 56) {
			sub_23a84(61);
		}
		sub_3347b();
	}

	private static void sub_11d90() {
		if (cGame.var_7fd4 != 56) {
			sub_23a84(61);
		}
		cGame.var_72ec = false;
		cGame.var_72ac = 0;
		sub_2000c(3, 2, false);
		sub_2000c(3, 5, true);
		for (int i = 176; i <= 188; ++i) {
			sub_2000c(3, i, false);
		}
		for (int j = 189; j <= 197; ++j) {
			sub_2000c(3, j, true);
		}
		sub_2000c(3, 202, true);
		sub_2000c(3, 201, true);
		sub_2000c(3, 199, false);
		sub_2000c(3, 198, false);
		int n = 0;
		cGame.var_72a4 = 0;
		sub_33687(cGame.var_7294 = 0);
		Class_h class_h;
		for (int var_7a = (class_h = Class_h.var_6a[1]).var_7a, k = 0; k < var_7a; ++k) {
			if (sub_2e024(0, k) > 0 && class_h.var_82[k][12] > 0) {
				cGame.var_723c[cGame.var_72a4] = class_h.var_82[k][2];
				cGame.var_7244[cGame.var_72a4] = k;
				cGame.var_724c[cGame.var_72a4] = 0;
				cGame.var_7254[cGame.var_72a4] = class_h.var_82[k][7];
				cGame.var_725c[cGame.var_72a4] = (short) sub_2e024(0, k);
				cGame.var_7264[cGame.var_72a4] = (short) class_h.var_82[k][3];
				cGame.var_726c[cGame.var_72a4] = (short) class_h.var_82[k][4];
				cGame.var_7274[cGame.var_72a4] = 0;
				cGame.var_727c[cGame.var_72a4] = (short) class_h.var_82[k][1];
				cGame.var_7284[cGame.var_72a4] = (byte) class_h.var_82[k][9];
				++cGame.var_72a4;
				if (n < 15) {
					sub_32e1a(n, true);
					++n;
				}
			}
		}
		for (int l = n; l < 15; ++l) {
			sub_32e1a(l, false);
		}
		if (sub_336ae() > 0) {
			cGame.var_68bc[3][201][6] = 78;
			sub_23a3d(3, 201, 1);
		} else {
			cGame.var_68bc[3][201][6] = 80;
			sub_23a3d(3, 201, 0);
		}
		sub_2c69b();
		sub_1fb8e(3);
		sub_33148(0);
		sub_234f2(0);
	}

	private static void sub_11fc4() {
		sub_23a84(61);
		sub_33148(0);
	}

	private static void sub_11fe8() {
		sub_23a84(61);
		sub_33148(1);
	}

	private static void sub_1200c() {
		sub_23a84(61);
		sub_33148(2);
	}

	private static void sub_12030() {
		sub_23a84(61);
		sub_33148(3);
	}

	private static void sub_12054() {
		sub_23a84(61);
		sub_33148(4);
	}

	private static void sub_12078() {
		sub_23a84(61);
		sub_33148(5);
	}

	private static void sub_1209c() {
		sub_23a84(61);
		sub_33148(6);
	}

	private static void sub_120c1() {
		sub_23a84(61);
		sub_33148(7);
	}

	private static void sub_120e6() {
		sub_23a84(61);
		sub_33148(8);
	}

	private static void sub_1210b() {
		sub_23a84(61);
		sub_33148(9);
	}

	private static void sub_12130() {
		sub_23a84(61);
		sub_33148(10);
	}

	private static void sub_12155() {
		sub_23a84(61);
		sub_33148(11);
	}

	private static void sub_1217a() {
		sub_23a84(61);
		sub_33148(12);
	}

	private static void sub_1219f() {
		sub_23a84(61);
		sub_33148(13);
	}

	private static void sub_121c4() {
		sub_23a84(61);
		sub_33148(14);
	}

	private static void sub_121e9() {
		if (cGame.var_7274 != null && cGame.var_725c != null
				&& cGame.var_725c[cGame.var_72b4] - cGame.var_7274[cGame.var_72b4] > 0) {
			final short[] var_7274 = cGame.var_7274;
			final int var_72b4 = cGame.var_72b4;
			++var_7274[var_72b4];
			sub_336f2(cGame.var_7254[cGame.var_72b4]);
			sub_23a84(61);
		} else {
			sub_23a84(56);
		}
		if (sub_336ae() > 0) {
			cGame.var_68bc[3][201][6] = 78;
			sub_23a3d(3, 201, 1);
		} else {
			cGame.var_68bc[3][201][6] = 80;
			sub_23a3d(3, 201, 0);
		}
		sub_32e1a(cGame.var_72b4 - cGame.var_72ac, true);
	}

	private static void sub_122a5() {
		if (cGame.var_7274 != null && cGame.var_7274[cGame.var_72b4] > 0) {
			final short[] var_7274 = cGame.var_7274;
			final int var_72b4 = cGame.var_72b4;
			--var_7274[var_72b4];
			sub_336f2(-cGame.var_7254[cGame.var_72b4]);
			sub_23a84(61);
		} else {
			sub_23a84(56);
		}
		if (sub_336ae() > 0) {
			cGame.var_68bc[3][201][6] = 78;
			sub_23a3d(3, 201, 1);
		} else {
			cGame.var_68bc[3][201][6] = 80;
			sub_23a3d(3, 201, 0);
		}
		sub_32e1a(cGame.var_72b4 - cGame.var_72ac, true);
	}

	private static void sub_12354() {
		if (cGame.var_7fd4 == 56) {
			cGame.var_6c94 = true;
		}
		if (sub_2b5c8(cGame.var_72bc[cGame.var_72b4])) {
			final Class_h class_h = Class_h.var_6a[1];
			sub_23a84(49);
			for (int i = 0; i < 3; ++i) {
				final int n;
				if ((n = cGame.var_6e44[cGame.var_72bc[cGame.var_72b4]][i << 1]) > -1) {
					sub_2da54(0, n, -cGame.var_72dc[i]);
					final int n2;
					sub_49db0(n2 = class_h.var_82[n][1], cGame.var_72dc[i], 16, false);
					sub_2bae9(n2, cGame.var_72dc[i], 16);
				}
			}
			cGame.var_7294 += getIntValue(cGame.var_72cc[cGame.var_72b4]);
			cGame.var_729c += getIntValue(cGame.var_72d4[cGame.var_72b4]);
			sub_2b23f(cGame.var_72b4, null);
			sub_32ddb(cGame.var_72b4, cGame.var_72b4);
			sub_33148(cGame.var_72b4 - cGame.var_72ac);
			sub_2bae9(0, 1, 40);
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		sub_23a84(56);
	}

	private static void sub_12471() {
		cGame.var_7294 = sub_336ae();
		sub_33687(0);
		for (int i = 0; i < cGame.var_72a4; ++i) {
			if (cGame.var_7274[i] > 0) {
				sub_23a84(49);
				sub_2da54(0, cGame.var_7244[i], -cGame.var_7274[i]);
				sub_49db0(cGame.var_727c[i], cGame.var_7274[i], 16, false);
				sub_2bae9(cGame.var_727c[i], cGame.var_7274[i], 16);
			}
		}
		if (cGame.var_7294 > 0) {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		sub_23a84(56);
	}

	private static void sub_12537() {
		sub_23a84(23);
		sub_2b23f(cGame.var_72b4, null);
		sub_32ddb(cGame.var_72b4, cGame.var_72b4);
		sub_33148(cGame.var_72b4 - cGame.var_72ac);
		sub_32e1a(cGame.var_72b4, true);
	}

	private static void sub_12578() {
		switch (cGame.var_7b24) {
		case 2: {
			sub_23a84(49);
			final int var_18c5 = cGame.var_7b14.var_18c5;
			cGame.var_7b14.sub_a8e3();
			if (var_18c5 < cGame.var_80a4[0] || var_18c5 > cGame.var_80a4[63] || var_18c5 % 2 == 1) {
				sub_2c0fa(true);
				sub_4ad3f(var_18c5);
			}
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 3: {
			sub_23a84(57);
			cGame.var_7b2c = 34;
			cGame.var_67cc = 1;
			sub_2c69b();
			break;
		}
		}
	}

	private static void sub_12624() {
		switch (cGame.var_7b24) {
		case 2: {
			sub_23a84(57);
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 3: {
			sub_23a84(57);
			cGame.var_67cc = 1;
			sub_2c69b();
			break;
		}
		}
	}

	private static void sub_1268e() {
		sub_23a84(61);
		sub_3282d(3, 2, false);
	}

	private static void sub_126b4() {
		boolean b = false;
		if (cGame.var_7b24 != 2 && cGame.var_7b24 != 3 && cGame.var_7b24 != 4) {
			final String sub_4e1f;
			if (cGame.var_7ac4 == (((sub_4e1f = GLLib.TODO_sub_4e1f(42)) == null) ? "" : sub_4e1f)
					&& cGame.var_7ad4 != "") {
				cGame.var_7ac4 = cGame.var_7ad4;
				b = true;
			} else {
				final String sub_4e1f2;
				if (cGame.var_7ac4 == (((sub_4e1f2 = GLLib.TODO_sub_4e1f(163)) == null) ? "" : sub_4e1f2)
						&& cGame.var_7ad4 != "") {
					cGame.var_7ac4 = cGame.var_7ad4;
					cGame.var_7acc = cGame.var_7adc;
					cGame.var_7afc = false;
					cGame.var_7b24 = 1;
					sub_4074f();
					sub_2000c(4, 5, true);
					sub_2000c(4, 6, true);
					sub_2000c(4, 7, true);
					sub_2000c(4, 11, true);
					sub_2024d(4, 11, true);
					sub_4019a(cGame.var_7ae4, cGame.var_7aec, 10);
					sub_8370(19);
					return;
				}
			}
			Label_0360: {
				final String sub_4e1f3;
				if (cGame.var_7ac4 == (((sub_4e1f3 = GLLib.TODO_sub_4e1f(292)) == null) ? "" : sub_4e1f3)) {
					final int n = Class_h.var_6a[3].var_82[sub_df89(cGame.var_808c)][1];
					if (cGame.var_808c == 1) {
						sub_2bae9(n, 1, 27);
					} else if (cGame.var_808c == 9) {
						sub_2bae9(n, 1, 27);
					}
					sub_49db0(n, 1, 27, false);
					if (cGame.var_808c >= 9) {
						cGame.var_7aac = 7;
					}
					b = true;
				} else {
					final String sub_4e1f4;
					if (cGame.var_7ac4 == (((sub_4e1f4 = GLLib.TODO_sub_4e1f(300)) == null) ? "" : sub_4e1f4)) {
						if (cGame.var_7fa4 != -1) {
							sub_26a6a(true, cGame.var_7fa4, '\u0002');
						}
						cGame.var_7fa4 = -1;
						while (true) {
							for (int i = 0; i < 13; ++i) {
								if (!cGame.var_6d5c[i]) {
									final boolean b2 = false;
									if (b2) {
										cGame.var_7aac = 6;
									}
									b = true;
									break Label_0360;
								}
							}
							continue;
						}
					}
				}
			}
			if (cGame.var_7b0c == 26) {
				sub_23a84(60);
			} else {
				sub_23a84(61);
			}
			if (b) {
				sub_8370(17);
			} else {
				cGame.var_67cc = 1;
				sub_2c69b();
			}
			if (cGame.var_7b34 != null) {
				if (cGame.var_7b34.var_18c5 != -1) {
					final int sub_49db0 = sub_49db0(cGame.var_7b34.var_18c5, 1, 1, false);
					cGame.var_7b34.sub_9274();
					if (sub_49db0 == 1) {
						final Class_f[] array = new Class_f[30];
						for (int sub_5439 = Class_f.sub_5439(0, 22, array, 30), j = 0; j < sub_5439; ++j) {
							array[j].sub_9274();
						}
					}
				} else {
					cGame.var_7b34.sub_9274();
				}
				cGame.var_7b34 = null;
			}
		}
	}

	private static void sub_129f9() {
		cGame.var_67cc = 1;
		sub_2c69b();
		if (cGame.var_7fd4 == -1) {
			sub_1392c();
		}
		final int var_7f6c;
		if ((var_7f6c = cGame.var_7f6c) != -1) {
			if ((getIntValue(cGame.var_7e9c[var_7f6c]) == 0 || cGame.var_7ebc[var_7f6c])
					&& (getIntValue(cGame.var_7ed4[var_7f6c]) == 0 || cGame.var_7ef4[var_7f6c])
					&& (getIntValue(cGame.var_7f0c[var_7f6c]) == 0 || cGame.var_7f2c[var_7f6c])) {
				sub_4ab1c(var_7f6c, false);
				sub_26a6a(true, var_7f6c, '\u0002');
			} else if (cGame.var_7eac[var_7f6c] == 38) {
				sub_4ad3f(cGame.var_7ea4[var_7f6c]);
			}
		}
		sub_23a84(57);
	}

	private static void sub_12ac0() {
		if (sub_2e449(cGame.var_7eb4[cGame.var_7f6c])) {
			if (cGame.var_7f5c[cGame.var_7f6c] == 2) {
				sub_4998f(cGame.var_7f6c, 0);
				sub_48d55();
			}
			sub_23a84(49);
			return;
		}
		sub_23a84(56);
		if (cGame.var_7eb4[cGame.var_7f6c] > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = (cGame.var_7acc = GLLib.sub_547c(
					((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7eb4[cGame.var_7f6c] - getCash(), cGame.var_7fe4, " ")));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			cGame.var_815c = true;
			sub_81e0(34);
		}
	}

	private static void sub_12b8a() {
		if (sub_2e449(cGame.var_7eec[cGame.var_7f6c])) {
			if (cGame.var_7f5c[cGame.var_7f6c] == 2) {
				sub_4998f(cGame.var_7f6c, 1);
				sub_48d55();
			}
			sub_23a84(49);
			return;
		}
		sub_23a84(56);
		if (cGame.var_7eec[cGame.var_7f6c] > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = (cGame.var_7acc = GLLib.sub_547c(
					((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7eec[cGame.var_7f6c] - getCash(), cGame.var_7fe4, " ")));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			cGame.var_815c = true;
			sub_81e0(34);
		}
	}

	private static void sub_12c54() {
		if (sub_2e449(cGame.var_7f24[cGame.var_7f6c])) {
			if (cGame.var_7f5c[cGame.var_7f6c] == 2) {
				sub_4998f(cGame.var_7f6c, 2);
				sub_48d55();
			}
			sub_23a84(49);
			return;
		}
		sub_23a84(56);
		if (cGame.var_7f24[cGame.var_7f6c] > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = (cGame.var_7acc = GLLib.sub_547c(
					((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7f24[cGame.var_7f6c] - getCash(), cGame.var_7fe4, " ")));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			cGame.var_815c = true;
			sub_81e0(34);
		}
	}

	private static void sub_12d1e() {
		cGame.var_7f9c = false;
		if (cGame.var_7f5c[cGame.var_7f6c] == 3) {
			int n = cGame.var_800c.var_17cd + (GLLib.s_screenWidth >> 1);
			int n2 = cGame.var_800c.var_17d5 + (GLLib.s_screenHeight >> 1);
			if (cGame.var_7fc4 < 100) {
				n *= 100 / cGame.var_7fc4;
				n2 *= 100 / cGame.var_7fc4;
			}
			if (getIntValue(cGame.var_7f44[cGame.var_7f6c]) > 0) {
				sub_e055(true, getIntValue(cGame.var_7f44[cGame.var_7f6c]), n, n2);
			}
			if (getIntValue(cGame.var_7f4c[cGame.var_7f6c]) > 0) {
				sub_e055(false, getIntValue(cGame.var_7f4c[cGame.var_7f6c]), n, n2);
			}
			if (!cGame.s_iapEnabled && getIntValue(cGame.var_7f54[cGame.var_7f6c]) > 0) {
				Class_f.sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(n + (GLLib.Math_Rand(0, 50) - 25),
						n2 + (GLLib.Math_Rand(0, 50) - 25), 6, 1000, false,
						getIntValue(cGame.var_7f54[cGame.var_7f6c]));
			}
			if (sub_4ac8d()) {
				cGame.var_7aac = 4;
			} else if (cGame.var_7e54[cGame.var_7f6c] != 16) {
				if (cGame.var_7e54[cGame.var_7f6c] == 52) {
					cGame.var_7aac = 14;
				} else if (cGame.var_7e54[cGame.var_7f6c] == 4) {
					cGame.var_7aac = 15;
				} else if (cGame.var_7e54[cGame.var_7f6c] == 2) {
					cGame.var_7aac = 16;
				} else if (cGame.var_7eac[cGame.var_7f6c] == 8) {
					cGame.var_7aac = 17;
				}
			}
			if (!cGame.var_7964 && cGame.var_7aac == -1) {
				int n3 = 0;
				for (int i = 0; i < cGame.var_7f7c; ++i) {
					if (cGame.var_7f64[i] != -1) {
						++n3;
					}
				}
				if (n3 % 15 == 0) {
					cGame.var_7aac = 13;
				}
			}
		}
		sub_4a6a7(cGame.var_7f6c);
		if (sub_49794()) {
			sub_26a6a(true, cGame.var_7f6c, '\u0001');
		}
		cGame.var_67cc = 1;
		sub_2c69b();
		sub_10947(false);
		sub_23a84(61);
	}

	private static void sub_12f43() {
		sub_23a84(61);
		sub_12fdf(cGame.var_7eac[cGame.var_7f6c], cGame.var_7ea4[cGame.var_7f6c]);
		sub_1392c();
	}

	private static void sub_12f77() {
		sub_23a84(61);
		sub_12fdf(cGame.var_7ee4[cGame.var_7f6c], cGame.var_7edc[cGame.var_7f6c]);
		sub_1392c();
	}

	private static void sub_12fab() {
		sub_23a84(61);
		sub_12fdf(cGame.var_7f1c[cGame.var_7f6c], cGame.var_7f14[cGame.var_7f6c]);
		sub_1392c();
	}

	private static void sub_12fdf(int n, int var_6d54) {
		if (n != 12) {
			if (n != 14) {
				if (n == 16 || n == 33 || n == 11) {
					final Class_f[] array = { null };
					Class_f.sub_545c(0, 50, 9, array, 1);
					if (array[0] != null) {
						sub_82a7(8);
					}
					return;
				}
				if (n == 6) {
					cGame.var_67cc = 1;
					sub_2c69b();
					if (var_6d54 == cGame.var_80b4[14]) {
						final Class_f[] array2 = { null };
						Class_f.sub_545c(0, 50, 14, array2, 1);
						if (array2[0] != null) {
							cGame.var_800c.sub_6b0c(array2[0].var_17cd, array2[0].var_17d5, 1000);
						}
					}
					return;
				} else if (n == 9) {
					if (var_6d54 >= cGame.var_80c4[0] && var_6d54 <= cGame.var_80c4[62]) {
						sub_23a84(61);
						sub_3282d(4, 3, false);
					}
					return;
				} else {
					if (n == 17 || n == 38 || n == 21) {
						int n2;
						if ((var_6d54 >= cGame.var_80a4[0] && var_6d54 <= cGame.var_80a4[63]) || var_6d54 == 2998
								|| var_6d54 == 2999 || var_6d54 == 2994 || var_6d54 == 2995 || var_6d54 == 2996) {
							if (var_6d54 >= cGame.var_80a4[0] && var_6d54 <= cGame.var_80a4[3]) {
								n2 = 4;
							} else {
								n2 = 1;
							}
							n = 0;
							sub_4ad3f(var_6d54);
						} else if (var_6d54 >= cGame.var_8094[0] && var_6d54 <= cGame.var_8094[21]) {
							n2 = 0;
							n = 2;
						} else if (var_6d54 >= cGame.var_80c4[0] && var_6d54 <= cGame.var_80c4[62]) {
							n2 = 3;
							n = 4;
						} else {
							n = 2;
							n2 = 0;
						}
						sub_3282d(n, n2, false);
						return;
					}
					if (n == 25) {
						if (var_6d54 >= cGame.var_80e4[0] && var_6d54 <= cGame.var_80e4[56]) {
							if (cGame.var_808c > 0) {
								sub_82a7(11);
							}
							return;
						} else {
							if (var_6d54 >= cGame.var_80ec[0] && var_6d54 <= cGame.var_80ec[5]) {
								final Class_f[] array3 = { null };
								Class_f.sub_545c(0, 50, 14, array3, 1);
								if (array3[0] != null) {
									sub_82a7(27);
								}
								return;
							}
							if (cGame.var_808c > 0) {
								sub_82a7(11);
							}
							return;
						}
					} else if (n == 18) {
						final Class_f[] array4 = { null };
						Class_f.sub_545c(0, 50, 14, array4, 1);
						if (array4[0] != null) {
							sub_82a7(27);
							return;
						}
						cGame.var_67cc = 1;
						sub_2c69b();
						return;
					} else if (n == 27) {
						n = var_6d54;
						var_6d54 = 0;
						if (n == cGame.var_80b4[2]) {
							var_6d54 = 1;
						} else if (n == cGame.var_80b4[0]) {
							var_6d54 = 2;
						} else if (n == cGame.var_80b4[3]) {
							var_6d54 = 3;
						} else if (n == cGame.var_80b4[1]) {
							var_6d54 = 4;
						} else if (n == cGame.var_80b4[4]) {
							var_6d54 = 5;
						} else if (n == cGame.var_80b4[5]) {
							var_6d54 = 6;
						} else if (n == cGame.var_80b4[6]) {
							var_6d54 = 7;
						} else if (n == cGame.var_80b4[7]) {
							var_6d54 = 8;
						} else if (n == cGame.var_80b4[8]) {
							var_6d54 = 9;
						}
						n = var_6d54;
						cGame.var_67cc = 1;
						sub_2c69b();
						if (n <= cGame.var_808c) {
							sub_4049d(292, 293, 15, 0, 1);
							return;
						}
						final Class_f[] array5 = { null };
						Class_f.sub_545c(0, 50, 18, array5, 1);
						if (array5[0] != null) {
							cGame.var_800c.sub_6b0c(array5[0].var_17cd, array5[0].var_17d5, 1000);
						}
						return;
					} else if (n == 10) {
						cGame.var_67cc = 1;
						sub_2c69b();
						final Class_h class_h = Class_h.var_6a[11];
						int n3 = 0;
						int n4 = 0;
						if (class_h != null) {
							n3 = class_h.var_82[0][1];
							n4 = class_h.var_82[1][1];
						}
						if (var_6d54 == n3) {
							final Class_f[] array6 = { null };
							Class_f.sub_55b2(0, 48, 0, array6);
							if (array6[0] != null) {
								cGame.var_800c.sub_6b0c(array6[0].var_17cd, array6[0].var_17d5, 1000);
							}
							return;
						}
						if (var_6d54 == n4) {
							final Class_f[] array7 = { null };
							Class_f.sub_55b2(0, 48, 1, array7);
							if (array7[0] != null) {
								cGame.var_800c.sub_6b0c(array7[0].var_17cd, array7[0].var_17d5, 1000);
							}
						}
						return;
					} else if (n == 22) {
						cGame.var_67cc = 1;
						sub_2c69b();
						if (var_6d54 == cGame.var_80cc[2]) {
							final Class_f[] array8 = { null };
							Class_f.sub_550f(0, 54, 17, 27, array8, 1);
							if (array8[0] != null) {
								cGame.var_800c.sub_6b0c(array8[0].var_17cd, array8[0].var_17d5, 1000);
								return;
							}
							Class_f.sub_550f(0, 54, 41, 63, array8, 1);
							if (array8[0] != null) {
								cGame.var_800c.sub_6b0c(array8[0].var_17cd, array8[0].var_17d5, 1000);
							}
							return;
						} else {
							if (var_6d54 == cGame.var_80cc[1]) {
								final Class_f[] array9 = { null };
								Class_f.sub_550f(0, 54, 5, 15, array9, 1);
								if (array9[0] != null) {
									cGame.var_800c.sub_6b0c(array9[0].var_17cd, array9[0].var_17d5, 1000);
								}
							}
							return;
						}
					} else {
						if (n == 19 || n == 41) {
							cGame.var_67cc = 1;
							sub_2c69b();
							final Class_f[] array10 = { null };
							if (var_6d54 >= cGame.var_80a4[1] && var_6d54 <= cGame.var_80a4[63]) {
								Class_f.sub_577d(0, 54, var_6d54, array10, 1);
							} else if (var_6d54 == 2999) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[1], cGame.var_80a4[63], array10);
							} else if (var_6d54 == 2998) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[5], cGame.var_80a4[15], array10);
							} else if (var_6d54 == 2997) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[17], cGame.var_80a4[27], array10);
							} else if (var_6d54 == 2996) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[29], cGame.var_80a4[39], array10);
							} else if (var_6d54 == 2995) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[41], cGame.var_80a4[51], array10);
							} else if (var_6d54 == 2994) {
								Class_f.sub_564e(0, 54, cGame.var_80a4[53], cGame.var_80a4[63], array10);
							}
							if (array10[0] != null) {
								cGame.var_800c.sub_6b0c(array10[0].var_17cd, array10[0].var_17d5, 1000);
							}
							return;
						}
						if (n == 39) {
							if (var_6d54 >= cGame.var_80c4[0] && var_6d54 <= cGame.var_80c4[30]) {
								cGame.var_7754 = 2;
							}
							sub_82a7(28);
							return;
						}
						if (n == 8) {
							if (cGame.var_6d5c[var_6d54]) {
								cGame.var_67cc = 1;
								sub_2c69b();
								final int n5 = var_6d54;
								final int n6 = 1;
								final int n7 = 8;
								var_6d54 = n6;
								n = n5;
								sub_49db0(n5, var_6d54, n7, false);
								return;
							}
							cGame.var_6d54 = var_6d54;
							sub_82a7(12);
							return;
						} else {
							if (n == 23 || n == 24 || n == 28 || n == 29 || n == 30 || n == 26) {
								cGame.var_67cc = 1;
								sub_2c69b();
								final Class_f[] array11 = { null };
								Class_f.sub_545c(0, 50, 15, array11, 1);
								if (array11[0] != null) {
									cGame.var_800c.sub_6b0c(array11[0].var_17cd, array11[0].var_17d5, 1000);
								}
								return;
							}
							if (n == 7) {
								if (var_6d54 == cGame.var_80b4[12]) {
									cGame.var_67cc = 1;
									sub_2c69b();
									final Class_f[] array12 = { null };
									Class_f.sub_545c(0, 50, 12, array12, 1);
									if (array12[0] != null) {
										cGame.var_800c.sub_6b0c(array12[0].var_17cd, array12[0].var_17d5, 1000);
									}
									return;
								}
								if (var_6d54 >= cGame.var_80b4[0] && var_6d54 <= cGame.var_80b4[8]) {
									cGame.var_67cc = 1;
									sub_2c69b();
									final Class_f[] array13 = { null };
									Class_f.sub_545c(0, 50, 18, array13, 1);
									if (array13[0] != null) {
										cGame.var_800c.sub_6b0c(array13[0].var_17cd, array13[0].var_17d5, 1000);
									}
								}
								return;
							} else {
								if (n == 3) {
									cGame.var_67cc = 1;
									sub_2c69b();
									final Class_f[] array14 = { null };
									Class_f.sub_545c(0, 50, 17, array14, 1);
									if (array14[0] != null) {
										cGame.var_800c.sub_6b0c(array14[0].var_17cd, array14[0].var_17d5, 1000);
									}
									return;
								}
								if (n == 4 || n == 5) {
									sub_82a7(31);
									return;
								}
								if (n == 34 && var_6d54 == cGame.var_80cc[110]) {
									sub_3282d(0, 4, false);
									return;
								}
							}
						}
					}
				}
			}
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		if (var_6d54 - cGame.var_8094[0] < 12) {
			cGame.var_67cc = 1;
			sub_2c69b();
			cGame.var_6b04 = sub_11774(var_6d54 - cGame.var_8094[0]);
			cGame.var_6afc = 0;
			return;
		}
		sub_23a84(61);
		sub_3282d(2, 0, false);
	}

	private static void sub_1392c() {
		final int n;
		if ((n = cGame.var_7e4c[cGame.var_7f6c]) == cGame.var_80f4[0] && !cGame.var_6c14) {
			cGame.var_6c14 = true;
			cGame.var_6c5c = 161;
			cGame.var_6c8c = (cGame.var_6c94 = false);
			cGame.var_6c54 = true;
		} else if (n == cGame.var_80f4[1] && !cGame.var_6c1c) {
			cGame.var_6c1c = true;
			cGame.var_6c54 = true;
			cGame.var_7fd4 = 13;
			cGame.var_6c8c = (cGame.var_6c94 = false);
			cGame.var_6c44 = true;
		} else if (n == cGame.var_80f4[2] && !cGame.var_6c2c) {
			cGame.var_6c54 = true;
			cGame.var_6c2c = true;
			cGame.var_6c5c = 167;
			cGame.var_6c8c = (cGame.var_6c94 = false);
		} else if (n == cGame.var_80f4[23] && !cGame.var_6c34) {
			cGame.var_6c34 = true;
			cGame.var_7aac = 8;
		} else if (n == cGame.var_80f4[38] && !cGame.var_6c3c) {
			cGame.var_6c3c = true;
			cGame.var_7aac = 12;
		} else if ((cGame.var_7eac[cGame.var_7f6c] == 38 && cGame.var_7ea4[cGame.var_7f6c] == 2999)
				|| (cGame.var_7ee4[cGame.var_7f6c] == 38 && cGame.var_7edc[cGame.var_7f6c] == 2999)
				|| (cGame.var_7f1c[cGame.var_7f6c] == 38 && cGame.var_7f14[cGame.var_7f6c] == 2999)) {
			sub_4ad3f(cGame.var_80a4[0]);
		} else if ((cGame.var_7eac[cGame.var_7f6c] == 32 && cGame.var_7ea4[cGame.var_7f6c] == 2999)
				|| (cGame.var_7ee4[cGame.var_7f6c] == 32 && cGame.var_7edc[cGame.var_7f6c] == 2999)
				|| (cGame.var_7f1c[cGame.var_7f6c] == 32 && cGame.var_7f14[cGame.var_7f6c] == 2999)) {
			sub_4ad3f(0);
		}
		boolean b = false;
		for (int i = 0; i < 22; ++i) {
			if (n == cGame.var_7f84[i] && cGame.var_7f94 != i + 1) {
				cGame.var_7f8c[i] = true;
				cGame.var_7f94 = (short) (i + 1);
				b = true;
				break;
			}
		}
		if (b) {
			final int getIntValue = getIntValue(cGame.var_7e9c[cGame.var_7f6c]);
			final int getIntValue2 = getIntValue(cGame.var_7ed4[cGame.var_7f6c]);
			final int getIntValue3 = getIntValue(cGame.var_7f0c[cGame.var_7f6c]);
			final int n2;
			final int[] array = new int[(n2 = getIntValue + getIntValue2 + getIntValue3) << 1];
			final int[] array2 = new int[n2 << 1];
			final int[] array3 = new int[n2 << 1];
			final Class_h class_h = Class_h.var_6a[11];
			for (int j = 0; j < getIntValue; ++j) {
				array2[j] = cGame.var_7ea4[cGame.var_7f6c];
				array[j] = sub_14091(cGame.var_7ea4[cGame.var_7f6c]);
				for (int k = 0; k < 67; ++k) {
					if (array2[j] == class_h.var_82[k][1]) {
						array3[j] = k;
						break;
					}
				}
			}
			for (int l = 0; l < getIntValue; ++l) {
				array[getIntValue + l] = GLLib.Math_Rand(8412, 8511);
				array3[getIntValue + l] = (array2[getIntValue + l] = -1);
			}
			final int n3 = getIntValue << 1;
			for (int n4 = 0; n4 < getIntValue2; ++n4) {
				array2[n3 + n4] = cGame.var_7edc[cGame.var_7f6c];
				array[n3 + n4] = sub_14091(cGame.var_7edc[cGame.var_7f6c]);
				for (int n5 = 0; n5 < 67; ++n5) {
					if (array2[n3 + n4] == class_h.var_82[n5][1]) {
						array3[n3 + n4] = n5;
						break;
					}
				}
			}
			final int n6 = n3 + getIntValue2;
			for (int n7 = 0; n7 < getIntValue2; ++n7) {
				array[n6 + n7] = GLLib.Math_Rand(8412, 8511);
				array3[n6 + n7] = (array2[n6 + n7] = -1);
			}
			final int n8 = (getIntValue << 1) + (getIntValue2 << 1);
			for (int n9 = 0; n9 < getIntValue3; ++n9) {
				array2[n8 + n9] = cGame.var_7f14[cGame.var_7f6c];
				array[n8 + n9] = sub_14091(cGame.var_7f14[cGame.var_7f6c]);
				for (int n10 = 0; n10 < 67; ++n10) {
					if (array2[n8 + n9] == class_h.var_82[n10][1]) {
						array3[n8 + n9] = n10;
						break;
					}
				}
			}
			final int n11 = n8 + getIntValue3;
			for (int n12 = 0; n12 < getIntValue3; ++n12) {
				array[n11 + n12] = GLLib.Math_Rand(8412, 8511);
				array3[n11 + n12] = (array2[n11 + n12] = -1);
			}
			final int[] array4 = new int[2];
			final int[] array5 = new int[2];
			final int[] array6 = new int[4];
			int n13 = 0;
			while (n13 < n2 << 1) {
				for (int n14 = 0; n14 <= cGame.var_6d54; ++n14) {
					sub_2d42a(n14, array6);
					final int[] array7 = array6;
					final int[] array8 = array5;
					final int[] array9 = array7;
					final int sub_2b97 = GLLib.Math_Rand(array7[0], array9[1]);
					final int sub_2b98 = GLLib.Math_Rand(array9[2], array9[3]);
					array8[0] = sub_2b97;
					array8[1] = sub_2b98;
					sub_2c8b0(array5, array4);
					final Class_f sub_25a75;
					if ((sub_25a75 = sub_25a75(22, 0, array4[0], array4[1], false)) != null) {
						sub_25a75.sub_9297();
						sub_25a75.var_17a5 = array[n13];
						sub_25a75.var_18c5 = array2[n13];
						sub_25a75.var_1835 = array3[n13];
						if (++n13 >= n2 << 1) {
							break;
						}
					}
				}
			}
		}
	}

	private static int sub_14091(final int n) {
		int n2 = 0;
		final Class_h class_h = Class_h.var_6a[11];
		for (int i = 0; i < 67; ++i) {
			if (n == class_h.var_82[i][1]) {
				n2 = class_h.var_82[i][2];
				break;
			}
		}
		return n2;
	}

	private static void sub_14108() {
		sub_23a84(57);
		cGame.var_757c = true;
		cGame.var_67cc = 1;
		sub_2c69b();
		if (cGame.var_7fd4 == 27) {
			cGame.var_6c94 = true;
			cGame.var_757c = false;
		}
	}

	private static void sub_14151() {
		if (cGame.var_7674 <= cGame.var_7694 && cGame.var_767c <= cGame.var_769c) {
			if (cGame.var_751c < cGame.var_7514) {
				sub_2da54(0, cGame.var_7664, -cGame.var_7674);
				sub_2da54(0, cGame.var_766c, -cGame.var_767c);
				final int var_751c = cGame.var_751c;
				final int var_764c = cGame.var_764c;
				final int var_762c = cGame.var_762c;
				final int var_761c = cGame.var_761c;
				final int var_7634 = cGame.var_7634;
				final int var_763c = cGame.var_763c;
				final int var_7635 = cGame.var_7644;
				final int n = var_763c;
				final int n2 = var_7634;
				final int n3 = var_761c;
				final int n4 = var_762c;
				final int n5 = var_764c;
				final int n6 = var_751c;
				cGame.var_752c[n6] = n5;
				cGame.var_7534[n6] = n4;
				cGame.var_753c[n6] = n3;
				cGame.var_7544[n6] = System.currentTimeMillis() / 1000L;
				cGame.var_754c[n6] = n2;
				cGame.var_7554[n6] = n;
				cGame.var_755c[n6] = var_7635;
				cGame.var_751c = n6 + 1;
				cGame.var_7424 = true;
				cGame.var_742c = 0;
				cGame.var_7434 = 0;
				sub_2000c(6, 32, true);
				if (cGame.var_76a4) {
					cGame.var_76ac = 0;
				} else {
					cGame.var_76a4 = true;
					cGame.var_76b4 = '\u0001';
					cGame.var_76ac = 0;
					sub_2000c(6, 33, true);
					sub_2024d(6, 33, true);
					cGame.var_76bc = (char) sub_23556(393249, 393250, 300, 0, 0, 0, 500);
				}
				if (cGame.var_7fd4 == 26) {
					cGame.var_6c94 = true;
				}
				if (!cGame.var_6c4c) {
					cGame.var_6c4c = true;
					cGame.var_7fd4 = 27;
					cGame.var_6c8c = false;
					cGame.var_6c94 = false;
				}
			} else {
				cGame.var_7aac = 9;
				cGame.var_67cc = 1;
				sub_2c69b();
			}
			sub_37991();
			sub_23a84(61);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_142d1() {
		if (!sub_2e449(cGame.var_7684)) {
			sub_23a84(56);
			if (cGame.var_7684 > 0) {
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(cGame.var_7684 - getCash(), cGame.var_7fe4, " "));
				cGame.var_7aac = 19;
				cGame.var_7d24 = true;
				cGame.var_815c = true;
				sub_81e0(34);
			}
			return;
		}
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + cGame.var_7674 - cGame.var_7694 > sub_2df26()) {
			sub_23a84(56);
			sub_2e549(cGame.var_7684);
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, cGame.var_7664, cGame.var_7674 - cGame.var_7694);
		sub_37991();
		sub_23a84(49);
	}

	private static void sub_143b2() {
		if (!sub_2e449(cGame.var_768c)) {
			sub_23a84(56);
			if (cGame.var_768c > 0) {
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(cGame.var_768c - getCash(), cGame.var_7fe4, " "));
				cGame.var_7aac = 19;
				cGame.var_7d24 = true;
				cGame.var_815c = true;
				sub_81e0(34);
			}
			return;
		}
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + cGame.var_767c - cGame.var_769c > sub_2df26()) {
			sub_23a84(56);
			sub_2e549(cGame.var_768c);
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, cGame.var_766c, cGame.var_767c - cGame.var_769c);
		sub_37991();
		sub_23a84(49);
	}

	private static void sub_14493() {
		if (cGame.var_7fd4 == 27) {
			cGame.var_6c8c = (cGame.var_6c94 = false);
			cGame.var_7fd4 = 28;
		}
		sub_23a84(57);
		cGame.var_757c = false;
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_144e1() {
		if (cGame.var_6c5c == 170) {
			cGame.var_6c94 = true;
		}
		sub_23a84(57);
		cGame.var_74dc = true;
		cGame.var_67cc = 1;
		sub_2c69b();
		sub_2000c(7, 39, false);
		sub_2024d(7, 39, false);
		cGame.var_730c = '\0';
		cGame.var_745c = 0;
		cGame.var_73b4 = false;
		cGame.var_741c = false;
	}

	private static void sub_14547() {
		sub_2000c(7, 39, false);
		sub_2024d(7, 39, false);
		sub_23a84(61);
		cGame.var_74dc = true;
		cGame.var_7304 = cGame.var_730c;
		cGame.var_736c = cGame.var_745c;
		sub_33c10();
		cGame.var_73b4 = false;
		cGame.var_741c = false;
	}

	private static void sub_14592() {
		if (cGame.var_73e4 <= cGame.var_7404 && cGame.var_73ec <= cGame.var_740c) {
			if (cGame.var_747c < cGame.var_746c) {
				sub_2da54(0, cGame.var_73d4, -cGame.var_73e4);
				sub_2da54(0, cGame.var_73dc, -cGame.var_73ec);
				if (cGame.var_741c && cGame.var_73b4) {
					if (1 <= cGame.var_7064) {
						--cGame.var_7064;
					}
					cGame.var_73b4 = false;
				}
				final int var_747c = cGame.var_747c;
				final int var_73bc = cGame.var_73bc;
				final int var_739c = cGame.var_739c;
				final int var_738c = cGame.var_738c;
				final int var_73a4 = cGame.var_73a4;
				final int var_73ac = cGame.var_73ac;
				final boolean var_741c = cGame.var_741c;
				final int n = var_73ac;
				final int n2 = var_73a4;
				final int n3 = var_738c;
				final int n4 = var_739c;
				final int n5 = var_73bc;
				final int n6 = var_747c;
				cGame.var_748c[n6] = n5;
				cGame.var_7494[n6] = n4;
				cGame.var_749c[n6] = n3;
				cGame.var_74a4[n6] = System.currentTimeMillis() / 1000L;
				cGame.var_74ac[n6] = n2;
				cGame.var_74b4[n6] = n;
				cGame.var_74c4[n6] = var_741c;
				cGame.var_747c = n6 + 1;
				cGame.var_7424 = true;
				cGame.var_742c = 0;
				cGame.var_7434 = 0;
				sub_2000c(7, 40, true);
				if (cGame.var_743c) {
					cGame.var_7444 = 0;
				} else {
					cGame.var_743c = true;
					cGame.var_744c = '\u0001';
					cGame.var_7444 = 0;
					sub_2000c(7, 47, true);
					sub_2024d(7, 47, true);
					cGame.var_7454 = (char) sub_23556(458799, 458800, 300, 0, 0, 0, 500);
				}
				cGame.var_741c = false;
			} else {
				cGame.var_7aac = 10;
				cGame.var_67cc = 1;
				sub_2c69b();
			}
			sub_33e7d();
			sub_23a84(61);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_14710() {
		cGame.var_73b4 = true;
		sub_23a84(61);
		sub_34199(true);
		sub_2000c(7, 17, false);
		sub_2024d(7, 17, false);
		sub_2c69b();
		sub_1fb8e(7);
	}

	private static void sub_14750() {
		if (!sub_2e449(cGame.var_73f4)) {
			sub_23a84(56);
			if (cGame.var_73f4 > 0) {
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(cGame.var_73f4 - getCash(), cGame.var_7fe4, " "));
				cGame.var_7aac = 19;
				cGame.var_815c = true;
				cGame.var_7d24 = true;
				sub_81e0(34);
			}
			return;
		}
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + cGame.var_73e4 - cGame.var_7404 > sub_2df26()) {
			sub_23a84(56);
			sub_2e549(cGame.var_73f4);
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, cGame.var_73d4, cGame.var_73e4 - cGame.var_7404);
		sub_33e7d();
		sub_23a84(49);
	}

	private static void sub_14831() {
		if (!sub_2e449(cGame.var_73fc)) {
			sub_23a84(56);
			if (cGame.var_73fc > 0) {
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(cGame.var_73fc - getCash(), cGame.var_7fe4, " "));
				cGame.var_7aac = 19;
				cGame.var_815c = true;
				cGame.var_7d24 = true;
				sub_81e0(34);
			}
			return;
		}
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + cGame.var_73ec - cGame.var_740c > sub_2df26()) {
			sub_23a84(56);
			sub_2e549(cGame.var_73fc);
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, cGame.var_73dc, cGame.var_73ec - cGame.var_740c);
		sub_33e7d();
		sub_23a84(49);
	}

	private static void sub_14912() {
		if (cGame.var_6c5c == 170) {
			cGame.var_6c8c = (cGame.var_6c94 = false);
			cGame.var_6c5c = 171;
		}
		sub_23a84(57);
		cGame.var_74dc = false;
		cGame.var_67cc = 1;
		sub_2c69b();
		sub_2000c(7, 39, false);
		sub_2024d(7, 39, false);
		cGame.var_730c = '\0';
		cGame.var_745c = 0;
	}

	private static void sub_1497a(final int n) {
		final char var_7304 = cGame.var_7304;
		final int var_736c = cGame.var_736c;
		boolean b = false;
		final Class_h class_h = Class_h.var_6a[7];
		for (int i = 0; i < class_h.var_7a; ++i) {
			if (class_h.var_82[i][18] == n && getLevel() >= class_h.var_82[i][5]) {
				b = true;
				cGame.var_730c = cGame.var_7304;
				cGame.var_745c = cGame.var_736c;
				cGame.var_736c = class_h.var_82[i][3];
				cGame.var_7304 = (char) (class_h.var_82[i][4] - 1);
				break;
			}
		}
		if (!b) {
			cGame.var_7304 = var_7304;
			cGame.var_736c = var_736c;
			return;
		}
		sub_2000c(7, 39, true);
		sub_2024d(7, 39, true);
		sub_33c10();
		cGame.var_73b4 = false;
		cGame.var_741c = false;
		sub_23a84(61);
	}

	private static void sub_14a74() {
		if (cGame.var_74e4) {
			final int sub_8396;
			if ((sub_8396 = sub_8396()) == 27) {
				sub_36ea2(cGame.var_74f4);
			} else if (sub_8396 == 11) {
				sub_3572e(cGame.var_74f4);
			}
			cGame.var_74e4 = false;
			cGame.var_74ec = 0;
			cGame.var_74f4 = 0;
		}
		if (cGame.var_7fd4 == 24 || cGame.var_7fd4 == 25) {
			return;
		}
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
		if (cGame.var_7fd4 == 30 || cGame.var_7fd4 == 173) {
			cGame.var_6c94 = true;
		}
	}

	private static void sub_14b26(int n, int n2) {
		if (n2 != 27) {
			if (n2 == 11) {
				if (cGame.var_7354) {
					return;
				}
				sub_23a84(61);
				if (cGame.var_6c5c == 172) {
					cGame.var_6c94 = true;
				}
				n += cGame.var_7484;
				if (!cGame.var_74e4) {
					final Class_h class_h = Class_h.var_6a[7];
					int n3 = 0;
					int n4 = 0;
					for (int i = 0; i < 83; ++i) {
						if (cGame.var_748c[n] == class_h.var_82[i][1]) {
							if (cGame.var_74c4[n]) {
								n4 = class_h.var_82[i][13];
							}
							n3 = i;
							break;
						}
					}
					final int n5 = class_h.var_82[n3][18];
					if (sub_2dcf3(5) + Class_f.sub_59d2(2) + 1 > sub_2df26()) {
						cGame.var_7aac = 2;
						sub_8370(17);
						return;
					}
					if (cGame.var_74c4[n]) {
						sub_2da54(0, n5 + 1, 1);
						sub_49db0(n4, 1, 25, false);
						sub_2bae9(n4, 1, 25);
					} else {
						sub_2da54(0, n5, 1);
						sub_49db0(cGame.var_748c[n], 1, 25, false);
						sub_2bae9(cGame.var_748c[n], 1, 25);
					}
					addExperience(n2 = class_h.var_82[n3][16]);
					cGame.var_750c = n2;
					sub_356c2(n - cGame.var_7484);
					n -= cGame.var_7484;
					cGame.var_68bc[22][24 + n * 15][5] = cGame.var_68bc[22][25 + n * 15][5];
					cGame.var_68bc[22][24 + n * 15][6] = cGame.var_68bc[22][25 + n * 15][6];
					sub_2000c(22, 24 + n * 15, true);
					sub_2000c(22, 25 + n * 15, false);
					cGame.var_74e4 = true;
					cGame.var_74ec = 0;
					cGame.var_74f4 = n;
				}
			}
			return;
		}
		if (cGame.var_75d4) {
			return;
		}
		sub_23a84(61);
		if (cGame.var_7fd4 == 29) {
			cGame.var_6c94 = true;
		}
		n += cGame.var_7524;
		if (!cGame.var_74e4) {
			final Class_h class_h2 = Class_h.var_6a[22];
			int n6 = 0;
			for (int j = 0; j < 6; ++j) {
				if (cGame.var_752c[n] == class_h2.var_82[j][1]) {
					n6 = j;
					break;
				}
			}
			if (sub_2e4fa(1, n6)) {
				addExperience(n2 = class_h2.var_82[n6][13]);
				cGame.var_75fc = n2;
				sub_356c2(n - cGame.var_7524);
				sub_49db0(cGame.var_752c[n], 1, 18, false);
				n -= cGame.var_7524;
				cGame.var_68bc[22][24 + n * 15][5] = cGame.var_68bc[22][25 + n * 15][5];
				cGame.var_68bc[22][24 + n * 15][6] = cGame.var_68bc[22][25 + n * 15][6];
				sub_2000c(22, 24 + n * 15, true);
				sub_2000c(22, 25 + n * 15, false);
				cGame.var_74e4 = true;
				cGame.var_74ec = 0;
				cGame.var_74f4 = n;
			}
		}
	}

	private static void sub_14e7b() {
		final int sub_8396;
		if (((sub_8396 = sub_8396()) == 27 && cGame.var_7564[cGame.var_7524] == 4)
				|| (sub_8396 == 11 && cGame.var_74bc[cGame.var_7484] == 4)) {
			sub_14b26(0, sub_8396);
		}
	}

	private static void sub_14ede() {
		final int sub_8396;
		if (((sub_8396 = sub_8396()) == 27 && cGame.var_7564[cGame.var_7524 + 1] == 4)
				|| (sub_8396 == 11 && cGame.var_74bc[cGame.var_7484 + 1] == 4)) {
			sub_14b26(1, sub_8396);
		}
	}

	private static void sub_14f45() {
		final int sub_8396;
		if (((sub_8396 = sub_8396()) == 27 && cGame.var_7564[cGame.var_7524 + 2] == 4)
				|| (sub_8396 == 11 && cGame.var_74bc[cGame.var_7484 + 2] == 4)) {
			sub_14b26(2, sub_8396);
		}
	}

	private static void sub_14fac() {
		final int sub_8396;
		if (((sub_8396 = sub_8396()) == 27 && cGame.var_7564[cGame.var_7524 + 3] == 4)
				|| (sub_8396 == 11 && cGame.var_74bc[cGame.var_7484 + 3] == 4)) {
			sub_14b26(3, sub_8396);
		}
	}

	private static void sub_15013() {
		final int sub_8396;
		if (((sub_8396 = sub_8396()) == 27 && cGame.var_7564[cGame.var_7524 + 4] == 4)
				|| (sub_8396 == 11 && cGame.var_74bc[cGame.var_7484 + 4] == 4)) {
			sub_14b26(4, sub_8396);
		}
	}

	private static void sub_1507a() {
		switch (sub_8396()) {
		case 27: {
			if (cGame.var_7524 < cGame.var_7514) {
				sub_15d57(0);
				return;
			}
			break;
		}
		case 11: {
			if (cGame.var_7484 < cGame.var_746c) {
				sub_15d57(0);
				break;
			}
			break;
		}
		}
	}

	private static void sub_150e6() {
		switch (sub_8396()) {
		case 27: {
			if (cGame.var_7524 + 1 < cGame.var_7514) {
				sub_15d57(1);
				return;
			}
			break;
		}
		case 11: {
			if (cGame.var_7484 + 1 < cGame.var_746c) {
				sub_15d57(1);
				break;
			}
			break;
		}
		}
	}

	private static void sub_15156() {
		switch (sub_8396()) {
		case 27: {
			if (cGame.var_7524 + 2 < cGame.var_7514) {
				sub_15d57(2);
				return;
			}
			break;
		}
		case 11: {
			if (cGame.var_7484 + 2 < cGame.var_746c) {
				sub_15d57(2);
				break;
			}
			break;
		}
		}
	}

	private static void sub_151c6() {
		switch (sub_8396()) {
		case 27: {
			if (cGame.var_7524 + 3 < cGame.var_7514) {
				sub_15d57(3);
				return;
			}
			break;
		}
		case 11: {
			if (cGame.var_7484 + 3 < cGame.var_746c) {
				sub_15d57(3);
				break;
			}
			break;
		}
		}
	}

	private static void sub_15236() {
		switch (sub_8396()) {
		case 27: {
			if (cGame.var_7524 + 4 < cGame.var_7514) {
				sub_15d57(4);
				return;
			}
			break;
		}
		case 11: {
			if (cGame.var_7484 + 4 < cGame.var_746c) {
				sub_15d57(4);
				break;
			}
			break;
		}
		}
	}

	private static void sub_152a6(final int n) {
		if (sub_2e449(cGame.var_756c[n])) {
			sub_23a84(49);
			sub_36fee(n);
			return;
		}
		sub_23a84(56);
		if (cGame.var_756c[n] > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_756c[n] - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_15350(final int n) {
		if (sub_2e449(cGame.var_74cc[n])) {
			sub_23a84(49);
			sub_3587a(n);
			return;
		}
		sub_23a84(56);
		if (cGame.var_74cc[n] > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_74cc[n] - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_153fa() {
		if (cGame.var_7fd4 == 171 || cGame.var_7fd4 == 28) {
			cGame.var_6c94 = true;
		}
		if (sub_8396() == 27) {
			sub_152a6(cGame.var_7524);
		} else {
			sub_15350(cGame.var_7484);
		}
		sub_2024d(22, 14, false);
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_15471() {
		if (sub_8396() == 27) {
			sub_152a6(cGame.var_7524 + 1);
		} else {
			sub_15350(cGame.var_7484 + 1);
		}
		sub_2024d(22, 29, false);
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_154cb() {
		if (sub_8396() == 27) {
			sub_152a6(cGame.var_7524 + 2);
		} else {
			sub_15350(cGame.var_7484 + 2);
		}
		sub_2024d(22, 44, false);
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_15525() {
		if (sub_8396() == 27) {
			sub_152a6(cGame.var_7524 + 3);
		} else {
			sub_15350(cGame.var_7484 + 3);
		}
		sub_2024d(22, 59, false);
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_1557f() {
		if (sub_8396() == 27) {
			sub_152a6(cGame.var_7524 + 4);
		} else {
			sub_15350(cGame.var_7484 + 4);
		}
		sub_2024d(22, 74, false);
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_155d9() {
		sub_23a84(57);
		if (sub_8396() == 27) {
			sub_37204(cGame.var_7524);
			return;
		}
		sub_35acd(cGame.var_7484);
	}

	private static void sub_1561c() {
		sub_23a84(57);
		if (sub_8396() == 27) {
			sub_37204(cGame.var_7524 + 1);
			return;
		}
		sub_35acd(cGame.var_7484 + 1);
	}

	private static void sub_15663() {
		sub_23a84(57);
		if (sub_8396() == 27) {
			sub_37204(cGame.var_7524 + 2);
			return;
		}
		sub_35acd(cGame.var_7484 + 2);
	}

	private static void sub_156aa() {
		sub_23a84(57);
		if (sub_8396() == 27) {
			sub_37204(cGame.var_7524 + 3);
			return;
		}
		sub_35acd(cGame.var_7484 + 3);
	}

	private static void sub_156f1() {
		sub_23a84(57);
		if (sub_8396() == 27) {
			sub_37204(cGame.var_7524 + 4);
			return;
		}
		sub_35acd(cGame.var_7484 + 4);
	}

	private static void sub_15738() {
		sub_23a84(61);
		if (sub_8396() == 27) {
			if (cGame.var_7514 < cGame.var_7474) {
				final int sub_27050;
				if (sub_2e449(sub_27050 = sub_27050(cGame.var_7514 + 1))) {
					sub_23a84(49);
					final int n = cGame.var_6914[0][8];
					++cGame.var_7514;
					sub_36a3e();
					cGame.var_6914[0][8] = n;
					return;
				}
				sub_23a84(56);
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(sub_27050 - getCash(), cGame.var_7fe4, " "));
				cGame.var_7aac = 19;
				cGame.var_815c = true;
				cGame.var_7d24 = true;
				sub_81e0(34);
			}
			return;
		}
		if (cGame.var_746c < cGame.var_7474) {
			final int sub_27051;
			if (sub_2e449(sub_27051 = sub_27050(cGame.var_746c + 1))) {
				sub_23a84(49);
				++cGame.var_746c;
				final int n2 = cGame.var_6914[0][8];
				sub_35262();
				cGame.var_6914[0][8] = n2;
				return;
			}
			sub_23a84(56);
			final String sub_4e1f2;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f2 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f2, "%d",
					GLLib.CurrencySeparator_just_a_guess(sub_27051 - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_158b3() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
			} else {
				sub_23a84(56);
			}
			if (cGame.var_7fd4 == 25) {
				cGame.var_6c94 = true;
			}
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304];
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_15959() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c + 1;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
				return;
			}
			sub_23a84(56);
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304] + 1;
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_159e9() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c + 2;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
				return;
			}
			sub_23a84(56);
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304] + 2;
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_15a79() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c + 3;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
				return;
			}
			sub_23a84(56);
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304] + 3;
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_15b09() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c + 4;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
				return;
			}
			sub_23a84(56);
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304] + 4;
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_15b99() {
		if (sub_8396() == 27) {
			cGame.var_7604 = cGame.var_758c + 5;
			if (getLevel() >= cGame.var_75cc[cGame.var_7604]) {
				sub_23a84(61);
				sub_81e0(9);
				return;
			}
			sub_23a84(56);
		} else {
			cGame.var_736c = cGame.var_72fc[cGame.var_7304] + 5;
			if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_736c]) {
				sub_23a84(61);
				sub_81e0(10);
				return;
			}
			sub_23a84(56);
		}
	}

	private static void sub_15c29() {
		sub_23a84(61);
		if (cGame.var_7304 != '\0') {
			sub_3390a('\0');
		}
	}

	private static void sub_15c61() {
		sub_23a84(61);
		if (cGame.var_7304 != '\u0001') {
			sub_3390a('\u0001');
		}
	}

	private static void sub_15c9a() {
		sub_23a84(61);
		if (cGame.var_7304 != '\u0002') {
			sub_3390a('\u0002');
		}
	}

	private static void sub_15cd3() {
		if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
			sub_81e0(34);
		}
	}

	private static void sub_15d11() {
		if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_15d57(final int n) {
		if (sub_8396() == 27) {
			if (!cGame.var_75d4) {
				sub_23a84(61);
			} else if (cGame.var_7fd4 != 25) {
				sub_23a84(57);
			}
			if (cGame.var_7fd4 >= 28 && cGame.var_7fd4 <= 30 && !cGame.var_75d4) {
				return;
			}
			if (cGame.var_7fd4 == 25) {
				if (!cGame.var_75d4) {
					sub_37449(true);
				}
				return;
			}
			if (cGame.var_75d4) {
				sub_37449(false);
				return;
			}
			if (n == -1 || cGame.var_7524 + n >= cGame.var_751c) {
				sub_37449(true);
			}
		} else {
			if (!cGame.var_7354) {
				sub_23a84(61);
			} else {
				sub_23a84(57);
			}
			if (cGame.var_7354) {
				sub_339af(false);
				return;
			}
			if (n == -1 || cGame.var_7484 + n >= cGame.var_747c) {
				sub_339af(true);
			}
		}
	}

	private static void sub_15e7b() {
		if (cGame.var_816c) {
			return;
		}
		sub_23a84(57);
		if (cGame.var_696c == 3 && cGame.var_6964) {
			cGame.var_7c34 = sub_83cf();
			cGame.var_7c24 = 11;
			sub_81e0(42);
			return;
		}
		sub_16a66();
	}

	private static void sub_15ed7() {
		if (!cGame.var_6924) {
			sub_17b24();
			return;
		}
		if (cGame.var_7d54 > 0) {
			cGame.var_7c24 = cGame.var_7d54;
			sub_81e0(42);
			cGame.var_7d54 = 0;
			return;
		}
		sub_16bcb();
		sub_16d6a();
	}

	private static void sub_15f2c() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 3 + cGame.var_7ce4;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[cGame.var_7ce4], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_15f80() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 3;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[0], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_15fce() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 4;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[1], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_1601c() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 5;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[2], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_1606a() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 6;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[3], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_160b9() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 7;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[4], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_16108() {
		cGame.var_697c = 4;
		if (sub_16aba()) {
			cGame.var_7c24 = 8;
			sub_81e0(42);
			return;
		}
		GLLib.IAP_SendRequest(cGame.var_7cfc[5], "Cash");
		cGame.var_6944 = false;
		sub_1715b();
	}

	private static void sub_16157() {
		sub_23a84(61);
		if (!cGame.var_6934) {
			sub_1715b();
			sub_16bcb();
			sub_174e9();
			sub_17536();
			sub_177a2();
			sub_17ace();
			sub_179fb();
			sub_16cdc();
			sub_171dc();
			cGame.var_7d54 = 0;
		}
	}

	private static void sub_161aa() {
		sub_23a84(61);
		sub_17332();
		cGame.var_7d24 = true;
		if (GLLib.sub_7848()) {
			sub_175b0();
			sub_16c4d();
			cGame.var_6974 = (cGame.var_696c = 3);
			return;
		}
		sub_16c4d();
		cGame.var_7d54 = 0;
	}

	private static void sub_161fb(final int n) {
		cGame.var_816c = true;
		if (cGame.s_iapEnabled) {
			sub_2024d(8, 203, false);
			sub_2024d(8, 206, false);
			sub_161aa();
			cGame.var_8164 = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
		final String sub_4e1f;
		String sub_4e1f2;
		String sub_4e1f3;
		sub_405b1(((sub_4e1f = GLLib.TODO_sub_4e1f(380)) == null) ? "" : sub_4e1f,
				GLLib.sub_547c(
						cGame.s_iapEnabled ? (((sub_4e1f2 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f2)
								: (((sub_4e1f3 = GLLib.TODO_sub_4e1f(852)) == null) ? "" : sub_4e1f3),
						"%d", GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[n] - getCash(), cGame.var_7fe4, " ")),
				7);
	}

	private static void sub_162f2() {
		if (sub_2e449(cGame.var_7c6c[0])) {
			sub_2e482(cGame.var_7cf4[0]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			sub_23a84(49);
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(0);
	}

	private static void sub_1638f() {
		if (sub_2e449(cGame.var_7c6c[1])) {
			sub_2e482(cGame.var_7cf4[1]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(1);
	}

	private static void sub_16427() {
		if (sub_2e449(cGame.var_7c6c[2])) {
			sub_2e482(cGame.var_7cf4[2]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(2);
	}

	private static void sub_164bf() {
		if (sub_2e449(cGame.var_7c6c[3])) {
			sub_2e482(cGame.var_7cf4[3]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(3);
	}

	private static void sub_16557() {
		if (sub_2e449(cGame.var_7c6c[4])) {
			sub_2e482(cGame.var_7cf4[4]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(4);
	}

	private static void sub_165ef() {
		if (sub_2e449(cGame.var_7c6c[5])) {
			sub_2e482(cGame.var_7cf4[5]);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			return;
		}
		sub_23a84(56);
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		cGame.var_6a6c = 0L;
		sub_161fb(5);
	}

	private static void sub_16687() {
		try {
			GloftGF2M.s_instance.notifyPaused();
			Display.getDisplay(GloftGF2M.s_instance).setCurrent((Displayable) null);
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void sub_166cf() {
		sub_45ef1(0);
	}

	private static void sub_166ee() {
		sub_45ef1(3);
	}

	private static void sub_1670d() {
		sub_45ef1(4);
	}

	private static void sub_1672c() {
		sub_45ef1(5);
	}

	private static void sub_1674b() {
		sub_45ef1(6);
	}

	private static void sub_1676b() {
		sub_45ef1(7);
	}

	private static void sub_1678b() {
		sub_45ef1(8);
	}

	private static void sub_167ab() {
		sub_45ef1(9);
	}

	private static void sub_167cb() {
		sub_45e60(true);
	}

	private static void sub_167ea() {
		if (cGame.var_7ca4 > 0) {
			--cGame.var_7ca4;
			cGame.var_7d0c[cGame.var_7ca4] = -1;
			return;
		}
		cGame.var_7c24 = 9;
		sub_81e0(42);
	}

	private static void sub_16834() {
		if (cGame.var_7ca4 < 5) {
			cGame.var_7c24 = 10;
			sub_81e0(42);
			return;
		}
		int n = 0;
		int n2 = 1;
		for (int i = 4; i >= 0; --i) {
			n += cGame.var_7d0c[i] * n2;
			n2 *= 10;
		}
		if (GLLib.IAP_VerifyRequest(n)) {
			GLLib.IAP_GetPackageIDInt();
			sub_2e549((int) GLLib.IAP_GetVirtualCurrencyFromBase(200L));
			cGame.var_68cc[8][7] = Integer.toString(getCash());
			sub_177a2();
			sub_45e60(false);
			GLLib.sub_7903();
			sub_17989();
			return;
		}
		sub_177a2();
		sub_45e60(false);
		cGame.var_6974 = 7;
		cGame.var_7d1c = 11;
		sub_17a52();
	}

	private static void sub_168f1() {
		if (cGame.var_7cdc == 7) {
			cGame.var_7c24 = 2;
			sub_81e0(42);
			return;
		}
		GLLib.sub_77ca();
		sub_177a2();
		sub_1749c();
	}

	private static void sub_16935() {
		sub_23a84(61);
		sub_44ced(20);
	}

	private static void sub_1695a() {
		sub_179fb();
		cGame.var_7ccc = false;
		if (cGame.var_8164) {
			cGame.var_8164 = false;
			cGame.var_7d24 = false;
			sub_16cdc();
			sub_171dc();
			return;
		}
		if (cGame.var_815c) {
			cGame.var_67cc = 1;
			sub_2c69b();
			cGame.var_815c = false;
			sub_16a66();
			return;
		}
		if (cGame.var_7c4c) {
			sub_16c4d();
			sub_16d6a();
			return;
		}
		cGame.var_7d24 = true;
		sub_81e0(34);
	}

	private static void sub_169d6() {
		if (cGame.var_816c) {
			return;
		}
		if ((cGame.var_6974 >= 6 && cGame.var_6974 <= 10) || cGame.var_6974 == 3) {
			cGame.var_7ccc = false;
			sub_17ace();
			cGame.var_697c = 3;
			return;
		}
		cGame.var_7ccc = false;
		sub_1715b();
		sub_16bcb();
		sub_174e9();
		sub_17536();
		sub_177a2();
		sub_17ace();
		sub_179fb();
		if (cGame.var_7cbc > 0) {
			sub_16c4d();
			sub_16d6a();
		}
	}

	private static void sub_16a66() {
		while (sub_8396() == 34) {
			cGame.var_67cc = 1;
			sub_2c69b();
			sub_b465();
		}
		cGame.var_6974 = (cGame.var_696c = 0);
		cGame.var_6934 = false;
		cGame.var_7ccc = true;
	}

	private static boolean sub_16aba() {
		return cGame.var_7cdc != 0;
	}

	private static void sub_16aec() {
		sub_2000c(8, 204, false);
		sub_2024d(8, 204, false);
		sub_2000c(8, 205, false);
	}

	private static void sub_16b22() {
		if (cGame.var_7c9c == null || cGame.var_7c9c.equals("")) {
			sub_16aec();
			return;
		}
		sub_2000c(8, 204, true);
		sub_2024d(8, 204, true);
		sub_2000c(8, 205, true);
		final String sub_4e1f;
		cGame.var_68cc[8][205] = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_6924 ? 45 : 767)) == null) ? ""
				: sub_4e1f);
	}

	private static void sub_16bcb() {
		if (cGame.var_6924) {
			sub_16b22();
			final String sub_4e1f;
			cGame.var_68cc[8][205] = (((sub_4e1f = GLLib.TODO_sub_4e1f(767)) == null) ? "" : sub_4e1f);
			sub_2000c(8, 157, false);
			sub_2000c(8, 158, false);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6924 = false;
		}
	}

	private static void sub_16c4d() {
		if (!cGame.s_iapEnabled) {
			return;
		}
		sub_2000c(8, 12, true);
		sub_2024d(8, 12, true);
		sub_2024d(8, 9, false);
		sub_2000c(8, 9, false);
		sub_2000c(8, 14, false);
		sub_2000c(8, 11, true);
		cGame.var_6964 = true;
		if (GLLib.sub_7848()) {
			cGame.var_696c = 3;
		} else {
			cGame.var_696c = 2;
		}
		cGame.var_6974 = cGame.var_696c;
		sub_2c69b();
		sub_1fb8e(8);
	}

	private static void sub_16cdc() {
		if (cGame.s_iapEnabled) {
			sub_2000c(8, 9, true);
			sub_2024d(8, 9, true);
		}
		sub_2024d(8, 12, false);
		sub_2000c(8, 12, false);
		sub_2000c(8, 11, false);
		sub_2000c(8, 14, true);
		sub_2000c(8, 204, false);
		sub_2024d(8, 204, false);
		sub_2000c(8, 205, false);
		cGame.var_6964 = false;
		cGame.var_6974 = (cGame.var_696c = 1);
		sub_2c69b();
		sub_1fb8e(8);
	}

	private static void sub_16d6a() {
		if (!cGame.var_692c) {
			sub_17048();
			if (cGame.var_7cd4) {
				sub_2000c(8, 16, false);
				sub_16b22();
				int n = 0;
				cGame.var_7ce4 = -1;
				for (int i = 0; i < cGame.var_7cbc; ++i) {
					if (cGame.var_7c54[i] != null) {
						++n;
					}
				}
				if (n == 0 && (cGame.var_7cac == 10 || cGame.var_7cac == 6)) {
					sub_2000c(8, 16, true);
				} else {
					int n2 = 0;
					for (int sub_7988 = GLLib.IAP_GetCurrencyAmount("Cash"), j = 0; j < sub_7988; ++j) {
						final int sub_79a7;
						if ((sub_79a7 = GLLib.IAP_GetPricePoint(j, "Cash")) != -1) {
							cGame.var_7c64[n2++] = sub_79a7 - 1;
						}
					}
					int n3 = 0;
					cGame.var_7ce4 = -1;
					if (cGame.var_7cbc > 0) {
						sub_2000c(8, 17, true);
						sub_2000c(8, 25, true);
						sub_2024d(8, 25, true);
						sub_2000c(8, 21, true);
						sub_2000c(8, 26, true);
						final short[] array = cGame.var_68bc[8][21];
						final int n4 = 6;
						final int[] var_7c64 = cGame.var_7c64;
						final int n5 = 0;
						++n3;
						array[n4] = (short) var_7c64[n5];
					}
					if (1 < cGame.var_7cbc) {
						sub_2000c(8, 32, true);
						sub_2000c(8, 40, true);
						sub_2024d(8, 40, true);
						sub_2000c(8, 36, true);
						sub_2000c(8, 41, true);
						cGame.var_68bc[8][36][6] = (short) cGame.var_7c64[n3++];
					}
					if (2 < cGame.var_7cbc) {
						sub_2000c(8, 47, true);
						sub_2000c(8, 55, true);
						sub_2024d(8, 55, true);
						sub_2000c(8, 51, true);
						sub_2000c(8, 56, true);
						cGame.var_68bc[8][51][6] = (short) cGame.var_7c64[n3++];
					}
					if (3 < cGame.var_7cbc) {
						sub_2000c(8, 62, true);
						sub_2000c(8, 70, true);
						sub_2024d(8, 70, true);
						sub_2000c(8, 66, true);
						sub_2000c(8, 71, true);
						cGame.var_68bc[8][66][6] = (short) cGame.var_7c64[n3++];
					}
					if (cGame.var_7cbc > 4) {
						if (4 < cGame.var_7cbc) {
							sub_2000c(8, 77, true);
							sub_2000c(8, 85, true);
							sub_2024d(8, 85, true);
							sub_2000c(8, 81, true);
							sub_2000c(8, 86, true);
							cGame.var_68bc[8][81][6] = (short) cGame.var_7c64[n3++];
						}
						if (5 < cGame.var_7cbc) {
							sub_2000c(8, 92, true);
							sub_2000c(8, 100, true);
							sub_2024d(8, 100, true);
							sub_2000c(8, 96, true);
							sub_2000c(8, 101, true);
							cGame.var_68bc[8][96][6] = (short) cGame.var_7c64[n3];
						}
					}
				}
			}
			sub_2c69b();
			sub_1fb8e(8);
			sub_46c9b(true);
			cGame.var_692c = true;
			cGame.var_6974 = (cGame.var_696c = 2);
		}
	}

	private static void sub_17048() {
		sub_2000c(8, 17, false);
		sub_2000c(8, 25, false);
		sub_2024d(8, 25, false);
		sub_2000c(8, 21, false);
		sub_2000c(8, 32, false);
		sub_2000c(8, 40, false);
		sub_2024d(8, 40, false);
		sub_2000c(8, 36, false);
		sub_2000c(8, 47, false);
		sub_2000c(8, 55, false);
		sub_2024d(8, 55, false);
		sub_2000c(8, 51, false);
		sub_2000c(8, 62, false);
		sub_2000c(8, 70, false);
		sub_2024d(8, 70, false);
		sub_2000c(8, 66, false);
		sub_2000c(8, 77, false);
		sub_2000c(8, 85, false);
		sub_2024d(8, 85, false);
		sub_2000c(8, 81, false);
		sub_2000c(8, 92, false);
		sub_2000c(8, 100, false);
		sub_2024d(8, 100, false);
		sub_2000c(8, 96, false);
		sub_2000c(8, 26, false);
		sub_2000c(8, 41, false);
		sub_2000c(8, 56, false);
		sub_2000c(8, 71, false);
		sub_2000c(8, 86, false);
		sub_2000c(8, 101, false);
		sub_2000c(8, 112, false);
	}

	private static void sub_1715b() {
		if (cGame.var_692c) {
			sub_2000c(8, 204, false);
			sub_2024d(8, 204, false);
			sub_2000c(8, 205, false);
			sub_2000c(8, 107, false);
			sub_2000c(8, 111, false);
			sub_2024d(8, 111, false);
			sub_2000c(8, 108, false);
			sub_2000c(8, 16, false);
			sub_17048();
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_692c = false;
		}
	}

	private static void sub_171dc() {
		if (!cGame.var_6984) {
			sub_2000c(8, 114, true);
			sub_2000c(8, 118, true);
			sub_2024d(8, 118, true);
			sub_2000c(8, 115, true);
			sub_2000c(8, 117, true);
			sub_2000c(8, 120, true);
			sub_2000c(8, 124, true);
			sub_2024d(8, 124, true);
			sub_2000c(8, 121, true);
			sub_2000c(8, 123, true);
			sub_2000c(8, 126, true);
			sub_2000c(8, 130, true);
			sub_2024d(8, 130, true);
			sub_2000c(8, 127, true);
			sub_2000c(8, 129, true);
			sub_2000c(8, 132, true);
			sub_2000c(8, 136, true);
			sub_2024d(8, 136, true);
			sub_2000c(8, 133, true);
			sub_2000c(8, 135, true);
			if (cGame.var_7cc4 > 4) {
				sub_2000c(8, 138, true);
				sub_2000c(8, 142, true);
				sub_2024d(8, 142, true);
				sub_2000c(8, 139, true);
				sub_2000c(8, 141, true);
				sub_2000c(8, 144, true);
				sub_2000c(8, 148, true);
				sub_2024d(8, 148, true);
				sub_2000c(8, 145, true);
				sub_2000c(8, 147, true);
			}
			sub_2c69b();
			sub_1fb8e(8);
			sub_46c9b(false);
			cGame.var_6984 = true;
			cGame.var_6974 = (cGame.var_696c = 1);
		}
	}

	private static void sub_17332() {
		if (cGame.var_6984) {
			sub_2000c(8, 114, false);
			sub_2000c(8, 118, false);
			sub_2024d(8, 118, false);
			sub_2000c(8, 115, false);
			sub_2000c(8, 117, false);
			sub_2000c(8, 120, false);
			sub_2000c(8, 124, false);
			sub_2024d(8, 124, false);
			sub_2000c(8, 121, false);
			sub_2000c(8, 123, false);
			sub_2000c(8, 126, false);
			sub_2000c(8, 130, false);
			sub_2024d(8, 130, false);
			sub_2000c(8, 127, false);
			sub_2000c(8, 129, false);
			sub_2000c(8, 132, false);
			sub_2000c(8, 136, false);
			sub_2024d(8, 136, false);
			sub_2000c(8, 133, false);
			sub_2000c(8, 135, false);
			sub_2000c(8, 138, false);
			sub_2000c(8, 142, false);
			sub_2024d(8, 142, false);
			sub_2000c(8, 139, false);
			sub_2000c(8, 141, false);
			sub_2000c(8, 144, false);
			sub_2000c(8, 148, false);
			sub_2024d(8, 148, false);
			sub_2000c(8, 145, false);
			sub_2000c(8, 147, false);
			sub_2000c(8, 150, false);
			sub_2000c(8, 154, false);
			sub_2024d(8, 154, false);
			sub_2000c(8, 151, false);
			sub_2000c(8, 153, false);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6984 = false;
		}
	}

	private static void sub_1749c() {
		if (!cGame.var_6934) {
			sub_2000c(8, 203, false);
			sub_2024d(8, 203, false);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6934 = true;
		}
	}

	private static void sub_174e9() {
		if (cGame.var_6934) {
			sub_2000c(8, 203, true);
			sub_2024d(8, 203, true);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6934 = false;
		}
	}

	private static void sub_17536() {
		if (cGame.var_693c) {
			sub_2000c(8, 162, false);
			sub_2024d(8, 162, false);
			sub_2000c(8, 164, false);
			sub_2024d(8, 164, false);
			sub_2000c(8, 163, false);
			sub_2000c(8, 165, false);
			sub_2000c(8, 161, false);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_693c = false;
		}
	}

	private static void sub_175b0() {
		if (!cGame.var_6944) {
			sub_2000c(8, 184, true);
			sub_2024d(8, 184, true);
			sub_2000c(8, 185, true);
			sub_2000c(8, 166, true);
			sub_2024d(8, 166, true);
			sub_2000c(8, 167, true);
			sub_2000c(8, 168, true);
			sub_2024d(8, 168, true);
			sub_2000c(8, 169, true);
			sub_2000c(8, 170, true);
			sub_2024d(8, 170, true);
			sub_2000c(8, 171, true);
			sub_2000c(8, 172, true);
			sub_2024d(8, 172, true);
			sub_2000c(8, 173, true);
			sub_2000c(8, 174, true);
			sub_2024d(8, 174, true);
			sub_2000c(8, 175, true);
			sub_2000c(8, 176, true);
			sub_2024d(8, 176, true);
			sub_2000c(8, 177, true);
			sub_2000c(8, 178, true);
			sub_2024d(8, 178, true);
			sub_2000c(8, 179, true);
			sub_2000c(8, 180, true);
			sub_2024d(8, 180, true);
			sub_2000c(8, 181, true);
			sub_2000c(8, 182, true);
			sub_2024d(8, 182, true);
			sub_2000c(8, 183, true);
			sub_2000c(8, 186, true);
			sub_2024d(8, 186, true);
			sub_2000c(8, 187, true);
			sub_2000c(8, 188, true);
			sub_2024d(8, 188, true);
			sub_2000c(8, 189, true);
			sub_2000c(8, 190, true);
			sub_2024d(8, 190, true);
			sub_2000c(8, 191, true);
			sub_2000c(8, 192, true);
			sub_2024d(8, 192, true);
			sub_2000c(8, 193, true);
			sub_2000c(8, 194, true);
			sub_2024d(8, 194, true);
			sub_2000c(8, 195, true);
			sub_2000c(8, 196, true);
			sub_2000c(8, 197, true);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6944 = true;
			cGame.var_6974 = (cGame.var_696c = 3);
			sub_2024d(8, 12, true);
		}
	}

	private static void sub_177a2() {
		sub_2000c(8, 184, false);
		sub_2024d(8, 184, false);
		sub_2000c(8, 185, false);
		sub_2000c(8, 166, false);
		sub_2024d(8, 166, false);
		sub_2000c(8, 167, false);
		sub_2000c(8, 168, false);
		sub_2024d(8, 168, false);
		sub_2000c(8, 169, false);
		sub_2000c(8, 170, false);
		sub_2024d(8, 170, false);
		sub_2000c(8, 171, false);
		sub_2000c(8, 172, false);
		sub_2024d(8, 172, false);
		sub_2000c(8, 173, false);
		sub_2000c(8, 174, false);
		sub_2024d(8, 174, false);
		sub_2000c(8, 175, false);
		sub_2000c(8, 176, false);
		sub_2024d(8, 176, false);
		sub_2000c(8, 177, false);
		sub_2000c(8, 178, false);
		sub_2024d(8, 178, false);
		sub_2000c(8, 179, false);
		sub_2000c(8, 180, false);
		sub_2024d(8, 180, false);
		sub_2000c(8, 181, false);
		sub_2000c(8, 182, false);
		sub_2024d(8, 182, false);
		sub_2000c(8, 183, false);
		sub_2000c(8, 186, false);
		sub_2024d(8, 186, false);
		sub_2000c(8, 187, false);
		sub_2000c(8, 188, false);
		sub_2024d(8, 188, false);
		sub_2000c(8, 189, false);
		sub_2000c(8, 190, false);
		sub_2024d(8, 190, false);
		sub_2000c(8, 191, false);
		sub_2000c(8, 192, false);
		sub_2024d(8, 192, false);
		sub_2000c(8, 193, false);
		sub_2000c(8, 194, false);
		sub_2024d(8, 194, false);
		sub_2000c(8, 195, false);
		sub_2000c(8, 196, false);
		sub_2000c(8, 197, false);
		sub_2c69b();
		sub_1fb8e(8);
		cGame.var_6944 = false;
		if (cGame.var_696c != 3) {
			cGame.var_696c = 0;
		}
	}

	private static void sub_17989() {
		if (!cGame.var_6954) {
			sub_2000c(8, 199, true);
			sub_2024d(8, 199, true);
			sub_2000c(8, 200, true);
			sub_2000c(8, 198, true);
			sub_2024d(8, 12, false);
			sub_16aec();
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_6954 = true;
			cGame.var_696c = 5;
			cGame.var_7ccc = true;
		}
	}

	private static void sub_179fb() {
		if (cGame.var_6954) {
			sub_2000c(8, 199, false);
			sub_2024d(8, 199, false);
			sub_2000c(8, 200, false);
			sub_2000c(8, 198, false);
			cGame.var_6954 = false;
		}
	}

	private static void sub_17a52() {
		if (!cGame.var_695c) {
			sub_17048();
			sub_2000c(8, 206, true);
			if (!cGame.var_816c) {
				sub_2024d(8, 206, true);
			} else {
				sub_2024d(8, 206, false);
			}
			sub_2000c(8, 207, true);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_695c = true;
			cGame.var_696c = 6;
		}
	}

	private static void sub_17ace() {
		if (cGame.var_695c) {
			sub_2000c(8, 206, false);
			sub_2024d(8, 206, false);
			sub_2000c(8, 207, false);
			sub_2c69b();
			sub_1fb8e(8);
			cGame.var_695c = false;
		}
	}

	private static void sub_17b24() {
		sub_44d11();
		if (cGame.var_7c9c != null && !cGame.var_7c9c.equals("")) {
			sub_1715b();
			sub_17332();
			if (!cGame.var_6924) {
				sub_16b22();
				final String sub_4e1f;
				cGame.var_68cc[8][205] = (((sub_4e1f = GLLib.TODO_sub_4e1f(45)) == null) ? "" : sub_4e1f);
				sub_2000c(8, 157, true);
				sub_2000c(8, 158, true);
				sub_2c69b();
				sub_1fb8e(8);
				cGame.var_6924 = true;
			}
		}
	}

	private static void sub_17bbf() {
		sub_23a84(57);
		if (cGame.var_7b9c == 4 && sub_83cf() != 41) {
			sub_82a7(41);
			return;
		}
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_17c09() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[0 + cGame.var_7b3c][4] != -1) {
			sub_41a13(0);
		}
	}

	private static void sub_17c52() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[1 + cGame.var_7b3c][4] != -1) {
			sub_41a13(1);
		}
	}

	private static void sub_17c9b() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[2 + cGame.var_7b3c][4] != -1) {
			sub_41a13(2);
		}
	}

	private static void sub_17ce4() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[3 + cGame.var_7b3c][4] != -1) {
			sub_41a13(3);
		}
	}

	private static void sub_17d2d() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[4 + cGame.var_7b3c][4] != -1) {
			sub_41a13(4);
		}
	}

	private static void sub_17d76() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[0 + cGame.var_7b3c][3] != -1) {
			sub_41938(0);
		}
	}

	private static void sub_17dbf() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[1 + cGame.var_7b3c][3] != -1) {
			sub_41938(1);
		}
	}

	private static void sub_17e08() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[2 + cGame.var_7b3c][3] != -1) {
			sub_41938(2);
		}
	}

	private static void sub_17e51() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[3 + cGame.var_7b3c][3] != -1) {
			sub_41938(3);
		}
	}

	private static void sub_17e9a() {
		if (cGame.var_7b7c) {
			return;
		}
		if (cGame.var_6e24[4 + cGame.var_7b3c][3] != -1) {
			sub_41938(4);
		}
	}

	private static void sub_17ee3() {
		sub_41ba8(0);
	}

	private static void sub_17f02() {
		sub_41ba8(1);
	}

	private static void sub_17f21() {
		sub_41ba8(2);
	}

	private static void sub_17f40() {
		sub_41ba8(3);
	}

	private static void sub_17f5f() {
		sub_41ba8(4);
	}

	private static void sub_17f7e() {
		if (cGame.var_699c) {
			sub_2000c(9, 10, false);
			cGame.var_699c = false;
		}
		sub_18189(false);
		sub_17fc1(false);
	}

	private static void sub_17fc1(final boolean b) {
		if (!cGame.var_698c || b) {
			sub_2000c(9, 5, true);
			sub_2000c(9, 6, false);
			sub_2024d(9, 11, true);
			sub_2000c(9, 12, true);
			sub_2024d(9, 12, true);
			sub_2000c(9, 13, true);
			sub_2000c(9, 16, true);
			sub_2000c(9, 17, true);
			sub_2000c(9, 18, true);
			sub_2000c(9, 19, true);
			sub_2000c(9, 20, true);
			sub_2000c(9, 23, true);
			sub_2000c(9, 24, true);
			sub_2000c(9, 27, true);
			sub_2000c(9, 28, true);
			sub_2000c(9, 29, true);
			sub_2000c(9, 30, true);
			sub_2000c(9, 31, true);
			cGame.var_68bc[9][11][10] = 1;
			cGame.var_68bc[9][11][18] = 1;
			sub_2000c(9, 34, true);
			sub_2000c(9, 35, true);
			sub_2000c(9, 38, true);
			sub_2000c(9, 39, true);
			sub_2000c(9, 40, true);
			sub_2000c(9, 41, true);
			sub_2000c(9, 42, true);
			sub_2000c(9, 45, true);
			sub_2000c(9, 46, true);
			sub_2000c(9, 49, true);
			sub_2000c(9, 50, true);
			sub_2000c(9, 51, true);
			sub_2000c(9, 52, true);
			sub_2000c(9, 53, true);
			sub_2000c(9, 56, true);
			sub_2000c(9, 57, true);
			sub_2000c(9, 60, true);
			sub_2000c(9, 61, true);
			sub_2000c(9, 62, true);
			sub_2000c(9, 63, true);
			sub_2000c(9, 64, true);
			sub_2c69b();
			sub_1fb8e(9);
			cGame.var_698c = true;
			int n = 0;
			for (int i = 0; i < cGame.var_7b74; ++i) {
				if (n < 5) {
					sub_41599(i, cGame.var_698c);
					++n;
				}
			}
		}
	}

	private static void sub_18189(final boolean b) {
		if (cGame.var_6994 || b) {
			sub_2024d(9, 68, false);
			sub_2000c(9, 69, false);
			sub_2024d(9, 69, false);
			sub_2000c(9, 70, false);
			sub_2000c(9, 73, false);
			sub_2000c(9, 81, false);
			sub_2000c(9, 78, false);
			sub_2000c(9, 84, false);
			sub_2024d(9, 84, false);
			sub_2000c(9, 85, false);
			sub_2000c(9, 88, false);
			sub_2000c(9, 96, false);
			sub_2000c(9, 93, false);
			sub_2000c(9, 99, false);
			sub_2024d(9, 99, false);
			sub_2000c(9, 100, false);
			sub_2000c(9, 103, false);
			sub_2000c(9, 111, false);
			sub_2000c(9, 108, false);
			sub_2000c(9, 114, false);
			sub_2024d(9, 114, false);
			sub_2000c(9, 115, false);
			sub_2000c(9, 118, false);
			sub_2000c(9, 126, false);
			sub_2000c(9, 123, false);
			sub_2000c(9, 129, false);
			sub_2024d(9, 129, false);
			sub_2000c(9, 130, false);
			sub_2000c(9, 133, false);
			sub_2000c(9, 141, false);
			sub_2000c(9, 138, false);
			cGame.var_6994 = false;
		}
	}

	private static void sub_182c6() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_182ed() {
		if (System.currentTimeMillis() / 1000L - cGame.var_6e34[cGame.var_7bb4][4] >= 86400L) {
			sub_23a84(61);
			sub_81e0(16);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1833e() {
		sub_23d73();
		sub_251a0(-1);
		sub_117fc();
		sub_11320(false, null);
		sub_24088();
		sub_24a2c(false, null);
		Class_f.sub_6b3b(100);
		cGame.var_705c = sub_2df26();
		cGame.var_8084 = cGame.var_7bb4 + 1;
		sub_49db0(Class_h.var_6a[8].var_82[cGame.var_7bb4][1], 1, 23, false);
		sub_3e7c1();
		sub_3d6da(false, -1);
		sub_23a84(61);
		sub_e522(false);
		sub_8281(36);
	}

	private static void sub_183b6() {
		if (System.currentTimeMillis() / 1000L - cGame.var_6e34[cGame.var_7bb4][1] >= 86400L) {
			sub_23a84(61);
			sub_81e0(15);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_18407() {
		if (sub_2e449(cGame.var_7be4)) {
			sub_23a84(49);
			sub_425b8(0);
			return;
		}
		sub_23a84(56);
		if (cGame.var_7be4 > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7be4 - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_184a9() {
		if (sub_2e449(cGame.var_7bfc)) {
			sub_23a84(49);
			sub_425b8(1);
			return;
		}
		sub_23a84(56);
		if (cGame.var_7bfc > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7bfc - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
		}
	}

	private static void sub_1854b() {
		sub_23a84(61);
		sub_2b022(cGame.var_7bb4);
		sub_41ff0();
	}

	private static void sub_18574() {
		sub_23a84(61);
		if (cGame.var_7bdc >= cGame.var_6e2c[cGame.var_7bb4][2]
				&& cGame.var_7bf4 >= cGame.var_6e2c[cGame.var_7bb4][5]) {
			final Class_h class_h = Class_h.var_6a[24];
			final Class_h class_h2 = Class_h.var_6a[1];
			final int n = cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[25];
			final int n2 = cGame.var_6e2c[cGame.var_7bb4][2];
			final int n3 = cGame.var_6e2c[cGame.var_7bb4][5];
			sub_2b10b(cGame.var_7bb4,
					(class_h2.var_82[cGame.var_6e2c[cGame.var_7bb4][2] + cGame.var_6e2c[cGame.var_7bb4][1]][11]
							* n2
							+ class_h2.var_82[cGame.var_6e2c[cGame.var_7bb4][5]
									+ cGame.var_6e2c[cGame.var_7bb4][4]][11] * n3)
							/ (n2 + n3) * class_h.var_82[n][6] / getLevel());
			sub_42685(0);
			sub_42685(1);
			addExperience(cGame.var_7bc4);
			sub_2e482(cGame.var_7bcc);
			sub_2b022(cGame.var_7bb4);
			sub_41ff0();
			sub_4014a(756 + cGame.var_7bb4, cGame.var_68bc[17][22][5], cGame.var_68bc[17][22][6]);
		}
	}

	private static void sub_18688() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_186af() {
		switch (sub_8396()) {
		case 28: {
			sub_23a84(61);
			sub_3282d(3, 2, cGame.var_775c = true);
			break;
		}
		}
	}

	private static void sub_18701() {
		switch (sub_8396()) {
		case 28: {
			sub_38251(new int[] { 0, 4 });
			sub_23a84(61);
			sub_18af3(0);
			break;
		}
		}
	}

	private static void sub_1875b() {
		switch (sub_8396()) {
		case 28: {
			sub_38251(new int[] { 3 });
			sub_23a84(61);
			sub_18af3(1);
			break;
		}
		}
	}

	private static void sub_187b1() {
		switch (sub_8396()) {
		case 28: {
			sub_38251(new int[] { 1, 2 });
			sub_23a84(61);
			sub_18af3(2);
			if (cGame.var_7fd4 == 50) {
				cGame.var_6c94 = true;
				break;
			}
			break;
		}
		}
	}

	private static void sub_18817() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 0 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			if (cGame.var_7fd4 == 51) {
				cGame.var_6c94 = true;
				return;
			}
			break;
		}
		case 15: {
			sub_3b9d3(0);
			return;
		}
		case 16: {
			sub_3b1e6(0);
			break;
		}
		}
	}

	private static void sub_1889b() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 1 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			sub_3b9d3(1);
			return;
		}
		case 16: {
			sub_3b1e6(1);
			break;
		}
		}
	}

	private static void sub_18913() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 2 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			sub_3b9d3(2);
			return;
		}
		case 16: {
			sub_3b1e6(2);
			break;
		}
		}
	}

	private static void sub_1898b() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 3 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			sub_3b9d3(3);
			return;
		}
		case 16: {
			sub_3b1e6(3);
			break;
		}
		}
	}

	private static void sub_18a03() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 4 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			sub_3b9d3(4);
			return;
		}
		case 16: {
			sub_3b1e6(4);
			break;
		}
		}
	}

	private static void sub_18a7b() {
		switch (sub_8396()) {
		case 28: {
			cGame.var_76ec = 5 + cGame.var_76e4;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			sub_3b9d3(5);
			return;
		}
		case 16: {
			sub_3b1e6(5);
			break;
		}
		}
	}

	private static void sub_18af3(final int var_7754) {
		cGame.var_7754 = var_7754;
		for (int i = 6; i <= 8; ++i) {
			sub_2000c(10, i, false);
		}
		sub_2000c(10, var_7754 + 6, true);
	}

	private static void sub_18b4a() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_18b71() {
		sub_cc72();
		sub_29f90();
		final Class_f[] array = new Class_f[100];
		final int sub_5830 = Class_f.sub_5830(0, 54, cGame.var_6d74, cGame.var_6d84, cGame.var_6d7c,
				cGame.var_6d8c, array, 100);
		int n = 0;
		for (int i = 0; i < sub_5830; ++i) {
			n += array[i].var_182d;
		}
		final int sub_5ad9 = Class_f.sub_5ad9(0, 54);
		if (n > 0 && sub_5ad9 + n > getMaxSiloAmount()) {
			sub_23a84(56);
			cGame.var_785c = true;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		sub_29f90();
		final int sub_5831 = Class_f.sub_5830(0, 52, cGame.var_6d74, cGame.var_6d84, cGame.var_6d7c,
				cGame.var_6d8c, new Class_f[100], 100);
		final int sub_4cf5 = Class_f.sub_4cf5(0, 52);
		if (sub_5831 > 0 && sub_4cf5 + sub_5831 > getIdk()) {
			sub_23a84(56);
			cGame.var_7864 = true;
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		if (!sub_2e369((int) sub_301eb(cGame.var_6d94))) {
			sub_23a84(56);
			cGame.var_6e1c = sub_301eb(cGame.var_6d94);
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_6e1c - sub_2e0da(), cGame.var_7fe4, " "));
			cGame.var_7aac = 18;
			cGame.var_815c = true;
			cGame.var_7d24 = false;
			sub_81e0(34);
			return;
		}
		sub_23a84(49);
		sub_296ba(cGame.var_7854 = true);
		sub_2c69b();
		sub_29f90();
		final int[] array2 = new int[2];
		final int[] array3 = new int[2];
		final int[] array4 = new int[2];
		array3[0] = cGame.var_6d74 + cGame.var_6d84 >> 1;
		array3[1] = cGame.var_6d7c + cGame.var_6d8c >> 1;
		sub_2c8b0(array3, array2);
		array4[0] = array2[0] * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5b8b(0);
		array4[1] = array2[1] * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5c0b(0);
		(cGame.var_6d6c = new GLLibPlayer(cGame.var_7ff4[13], 0, 0)).SetAnim(2, 2);
		cGame.var_6d64 = 1;
		if (cGame.var_7fc4 == 100) {
			cGame.var_800c.sub_6b0c(array2[0], array2[1], 1000);
		} else {
			cGame.var_800c.sub_6b0c(array2[0], array2[1], 2000);
		}
		sub_23a84(55);
		sub_118c5(false);
		if (sub_20167(1, 37)) {
			cGame.var_6e0c = true;
			sub_2000c(1, 37, false);
			sub_2024d(1, 37, false);
		} else {
			cGame.var_6e0c = false;
		}
		if (sub_20167(1, 28)) {
			cGame.var_6e14 = true;
			sub_2000c(1, 28, false);
			sub_2024d(1, 28, false);
			sub_2000c(1, 29, false);
		} else {
			cGame.var_6e14 = false;
		}
		sub_10cd1(false);
	}

	private static void sub_18e88() {
		if (!sub_2e449(getIntValue(cGame.var_6dc4))) {
			sub_23a84(56);
			cGame.var_6e1c = getIntValue(cGame.var_6dc4);
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_6e1c - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
			return;
		}
		sub_23a84(49);
		cGame.var_6dfc[cGame.var_6d54] = true;
		sub_28cd9();
		sub_2c69b();
		sub_1fb8e(11);
	}

	private static void sub_18f39() {
		if (!sub_2e449(getIntValue(cGame.var_6dcc))) {
			sub_23a84(56);
			cGame.var_6e1c = getIntValue(cGame.var_6dcc);
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_6e1c - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_815c = true;
			cGame.var_7d24 = true;
			sub_81e0(34);
			return;
		}
		sub_23a84(49);
		cGame.var_6e04[cGame.var_6d54] = true;
		sub_28cd9();
		sub_2c69b();
		sub_1fb8e(11);
	}

	private static void sub_18fea() {
		if (cGame.var_7fd4 == 36) {
			cGame.var_6c94 = true;
		}
		if (getLevel() == 50) {
			cGame.var_7aac = 5;
		}
		cGame.var_67cc = 1;
		sub_2c69b();
		sub_23a84(57);
	}

	private static boolean sub_1903d(final int n) {
		return sub_4ac19(sub_3a3b8(n));
	}

	private static void sub_19074(int sub_3a3b8) {
		sub_3a3b8 = sub_3a3b8(sub_3a3b8);
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			if (cGame.var_7e54[c] == sub_3a3b8) {
				cGame.var_7f6c = c;
				cGame.var_7f6c = c;
				sub_48d55();
				cGame.var_7b0c = 26;
				return;
			}
		}
	}

	private static void sub_190dd() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_19104() {
		cGame.var_77ec = 0;
		if (cGame.var_808c < 1) {
			if (sub_1903d(cGame.var_808c)) {
				if (cGame.var_77f4 == 3) {
					sub_81e0(30);
				} else {
					sub_81e0(30);
					if (cGame.var_6c5c == 163 || cGame.var_6c5c == 161) {
						cGame.var_6c5c = 164;
						cGame.var_6c8c = (cGame.var_6c94 = false);
					}
				}
			} else {
				sub_19074(cGame.var_808c);
			}
		} else {
			sub_81e0(11);
		}
		sub_23a84(61);
	}

	private static void sub_191a3() {
		cGame.var_77ec = 1;
		if (cGame.var_808c < 2) {
			sub_193c3();
		} else {
			cGame.var_7a2c = 0;
			sub_81e0(31);
		}
		sub_23a84(61);
	}

	private static void sub_191f1() {
		cGame.var_77ec = 2;
		if (cGame.var_808c < 3) {
			sub_193c3();
		} else {
			sub_49db0(cGame.var_80b4[3], 1, 7, false);
			sub_81e0(32);
		}
		sub_23a84(61);
	}

	private static void sub_1924e() {
		if (cGame.var_808c < 4) {
			cGame.var_77ec = 3;
			sub_193c3();
			return;
		}
		sub_39c33(0);
	}

	private static void sub_1928b() {
		if (cGame.var_808c < 5) {
			cGame.var_77ec = 4;
			sub_193c3();
			return;
		}
		sub_39c33(1);
	}

	private static void sub_192c8() {
		if (cGame.var_808c < 6) {
			cGame.var_77ec = 5;
			sub_193c3();
			return;
		}
		sub_39c33(2);
	}

	private static void sub_19306() {
		if (cGame.var_808c < 7) {
			cGame.var_77ec = 6;
			sub_193c3();
			return;
		}
		sub_39c33(3);
	}

	private static void sub_19345() {
		if (cGame.var_808c < 8) {
			cGame.var_77ec = 7;
			sub_193c3();
			return;
		}
		sub_39c33(4);
	}

	private static void sub_19384() {
		if (cGame.var_808c < 9) {
			cGame.var_77ec = 8;
			sub_193c3();
			return;
		}
		sub_39c33(5);
	}

	private static void sub_193c3() {
		if (sub_1903d(cGame.var_808c)) {
			sub_81e0(30);
			sub_23a84(61);
			return;
		}
		sub_19074(cGame.var_808c);
		sub_23a84(56);
	}

	private static void sub_1940b() {
		sub_2000c(13, 39, false);
		cGame.var_68bc[13][39][5] = -1;
		cGame.var_68bc[13][2][10] = 1;
		Class_f.sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(620, 365, 37, 1000, false, 1);
		sub_23a84(61);
	}

	private static void sub_19473() {
		if (sub_3a230(cGame.var_77ec)) {
			if (sub_2e369(cGame.var_77e4)) {
				sub_23a84(49);
				sub_3a73b((short) 2);
				if (cGame.var_77bc == 0L) {
					final Class_h class_h = Class_h.var_6a[3];
					final int sub_df89 = sub_df89(cGame.var_808c + 1);
					cGame.var_77fc = class_h.var_82[sub_df89][21] * 60;
					cGame.var_7824 = class_h.var_82[sub_df89][22];
					cGame.var_77bc = System.currentTimeMillis() / 1000L;
				}
				if (cGame.var_6c5c == 164 || cGame.var_6c5c == 161) {
					cGame.var_6c8c = (cGame.var_6c94 = false);
					cGame.var_6c5c = 166;
				}
				sub_2000c(14, 53, true);
				sub_2024d(14, 53, true);
				sub_2c69b();
				sub_1f8c5(14);
				return;
			}
			sub_23a84(56);
			if (cGame.var_77e4 > 0) {
				final String sub_4e1f;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f, "%d",
						GLLib.CurrencySeparator_just_a_guess(cGame.var_77e4 - sub_2e0da(), cGame.var_7fe4, " "));
				cGame.var_7aac = 18;
				cGame.var_7d24 = false;
				cGame.var_815c = true;
				sub_81e0(34);
			}
		} else {
			sub_23a84(56);
		}
	}

	private static void sub_195c5() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_195ec() {
		if (sub_2e449(cGame.var_780c)) {
			sub_23a84(49);
			cGame.var_77bc = (cGame.var_77fc = 0L);
			return;
		}
		sub_23a84(56);
		if (cGame.var_780c > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_780c - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			cGame.var_815c = true;
			sub_81e0(34);
		}
	}

	private static void sub_19691() {
		sub_23a84(61);
		sub_3a966(cGame.var_7814 = !cGame.var_7814);
	}

	private static void sub_196d8() {
		cGame.var_7844 = true;
		cGame.var_77bc = 0L;
		cGame.var_77c4 = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "" };
		cGame.var_77cc = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1 };
		cGame.var_77bc = 0L;
		sub_8370(17);
	}

	private static void sub_19f9b() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_19fc2() {
		sub_24046();
		final String sub_78e5 = GLLib.sub_78e5();
		try {
			GLLib.PlatformRequestThread(sub_78e5);
		} catch (final Exception ex) {
		}
	}

	private static void sub_1a006() {
		sub_23a84(61);
		sub_1b5e6();
		sub_1b71c();
	}

	private static void sub_1a02c() {
		sub_23a84(61);
		sub_1b5e6();
		if (!cGame.var_69ac) {
			sub_1b3fa(cGame.var_69ac = true);
			cGame.var_79d4 = "";
			for (int i = 0; i < 278; ++i) {
				if (i + 11264 == 11534) {
					for (int j = 0; j < 77; ++j) {
						final String sub_4e1f;
						cGame.var_79d4 = cGame.var_79d4
								+ (((sub_4e1f = GLLib.TODO_sub_4e1f(j + 11547)) == null) ? "" : sub_4e1f) + '\n';
					}
				}
				StringBuffer sb;
				String appProperty;
				if (i + 11264 == 11265) {
					final String sub_4e1f2;
					sb = new StringBuffer().append(cGame.var_79d4)
							.append(((sub_4e1f2 = GLLib.TODO_sub_4e1f(11265)) == null) ? "" : sub_4e1f2).append(" ");
					appProperty = GloftGF2M.s_instance.getAppProperty("MIDlet-Version");
				} else {
					sb = new StringBuffer().append(cGame.var_79d4);
					final String sub_4e1f3;
					appProperty = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(i + 11264)) == null) ? "" : sub_4e1f3);
				}
				cGame.var_79d4 = sb.append(appProperty).append('\n').toString();
			}
			final short n = cGame.var_68bc[15][21][5];
			final short n2 = cGame.var_68bc[15][21][7];
			final short[] sub_4ac6 = cGame.var_7ffc[sub_237ff(n2)].sub_4ac6(cGame.var_79d4, n, false);
			final ASprite class_e = cGame.var_7ffc[sub_237ff(n2)];
			final short n3 = sub_4ac6[0];
			final ASprite class_e2 = class_e;
			cGame.var_79dc = (cGame.var_79b4 = n3 * class_e2.sub_4a3a() + (n3 - 1) * class_e2.sub_490a()) / 2;
			cGame.var_79e4 = cGame.var_79b4 / 2 + (GLLib.s_screenHeight >> 1);
			cGame.var_79ac = cGame.var_79dc;
			sub_2000c(15, 18, true);
			sub_2024d(15, 18, true);
			sub_2000c(15, 20, true);
			sub_2024d(15, 20, true);
			sub_2000c(15, 22, true);
			sub_2c69b();
			sub_1fb8e(15);
			cGame.var_6914[0][9] = -40;
			sub_22d97(0);
			if (sndPlayingOnChannel(0) && GLLibPlayer.sub_2abc() == 13) {
				sub_23d73();
			}
			sub_23ac1(13, true);
		}
	}

	// skibidi
	private static void openPrivacyNoticeURL() {
		sub_24046();
		final String s = "http://www.gameloft.com/privacy-notice/";
		try {
			GLLib.PlatformRequestThread(s);
		} catch (final Exception ex) {
		}
	}

	private static void sub_1a2b9() {
		sub_23d73();
		sub_81e0(44);
	}

	private static void sub_1a2dc() {
		if (sndPlayingOnChannel(0) && GLLibPlayer.sub_2abc() == 13) {
			sub_23d73();
		}
		sub_23a84(57);
		sub_1b6c1();
		sub_1b45d();
	}

	private static void sub_1a322() {
		sub_23a84(61);
		sub_1b797();
		if (!cGame.var_69bc) {
			sub_2000c(15, 46, cGame.var_69bc = true);
			sub_2024d(15, 46, true);
			sub_2000c(15, 40, true);
			sub_2024d(15, 40, true);
			sub_2000c(15, 43, true);
			sub_2024d(15, 43, true);
			sub_2c69b();
			sub_1fb8e(15);
			sub_1b3fa(false);
		}
	}

	private static void sub_1a399() {
		sub_23a84(61);
		sub_1b797();
		if (!cGame.var_69b4) {
			cGame.var_69b4 = true;
			sub_1b3fa(false);
			sub_2000c(15, 48, true);
			sub_2024d(15, 48, true);
			sub_2000c(15, 51, true);
			sub_2000c(15, 54, true);
			sub_2024d(15, 54, true);
			sub_2000c(15, 55, true);
			sub_2024d(15, 55, true);
			sub_2c69b();
			cGame.var_79bc = 1;
			cGame.var_79c4 = 0;
			sub_1fb8e(15);
			sub_2c760(983092, 1);
			sub_2c760(983093, 1);
			sub_3cdc4();
		}
	}

	private static void sub_1a42f() {
		sub_23a84(66);
		if (--cGame.var_79bc < 1) {
			cGame.var_79bc = 16;
		}
		if (cGame.var_79bc == 7 && --cGame.var_79bc < 1) {
			cGame.var_79bc = 16;
		}
		if (!cGame.s_iapEnabled && cGame.var_79bc == 11 && --cGame.var_79bc < 1) {
			cGame.var_79bc = 16;
		}
		sub_3cdc4();
	}

	private static void sub_1a4b8() {
		sub_23a84(66);
		if (++cGame.var_79bc > 16) {
			cGame.var_79bc = 1;
		}
		if (cGame.var_79bc == 7 && ++cGame.var_79bc > 16) {
			cGame.var_79bc = 1;
		}
		if (!cGame.s_iapEnabled && cGame.var_79bc == 11 && ++cGame.var_79bc > 16) {
			cGame.var_79bc = 1;
		}
		sub_3cdc4();
	}

	private static void sub_1a541() {
		sub_23a84(66);
		cGame.var_79c4 += 20;
	}

	private static void sub_1a56a() {
		sub_23a84(66);
		cGame.var_79c4 -= 20;
	}

	private static void sub_1a593() {
		sub_23a84(57);
		if (cGame.var_69b4) {
			sub_2000c(15, 48, false);
			sub_2024d(15, 48, false);
			sub_2000c(15, 52, false);
			sub_2024d(15, 52, false);
			sub_2000c(15, 53, false);
			sub_2024d(15, 53, false);
			sub_2000c(15, 51, false);
			sub_2000c(15, 54, false);
			sub_2024d(15, 54, false);
			sub_2000c(15, 55, false);
			sub_2024d(15, 55, false);
			cGame.var_69b4 = false;
			sub_1b3fa(true);
		}
		sub_1b71c();
	}

	private static void sub_1a62a() {
		if (sndPlayingOnChannel(0) && GLLibPlayer.sub_2abc() == 0) {
			sub_23d73();
		}
		sub_23a84(57);
		sub_1b797();
		sub_1b45d();
	}

	private static void sub_1a66e() {
		sub_23a84(57);
		if (cGame.var_69bc) {
			sub_2000c(15, 46, cGame.var_69bc = false);
			sub_2024d(15, 46, false);
			sub_2000c(15, 40, false);
			sub_2024d(15, 40, false);
			sub_2000c(15, 43, false);
			sub_2024d(15, 43, false);
			sub_1b3fa(true);
		}
		sub_1b71c();
	}

	private static void sub_1a6dd() {
		if (cGame.var_69f4) {
			cGame.var_69f4 = false;
			sub_23d73();
			return;
		}
		cGame.var_69f4 = true;
		sub_23ac1(0, false);
	}

	private static void sub_1a71d() {
		if (cGame.var_69ec) {
			cGame.var_69ec = false;
			return;
		}
		cGame.var_69ec = true;
		sub_23d73();
		cGame.var_6a6c = 0L;
		try {
			Thread.sleep(200L);
		} catch (final Exception ex) {
		}
		sub_23a84(61);
	}

	private static void sub_1a782() {
		sub_23a84(61);
		sub_1b5e6();
		if (!cGame.var_69cc) {
			sub_1b3fa(false);
			sub_2000c(15, 62, true);
			sub_2024d(15, 62, true);
			sub_2000c(15, 60, true);
			sub_2024d(15, 60, true);
			sub_2000c(15, 63, true);
			sub_2000c(15, 64, true);
			sub_2000c(15, 65, true);
			sub_2024d(15, 65, true);
			sub_2000c(15, 66, true);
			sub_2024d(15, 66, true);
			sub_2000c(15, 67, true);
			sub_2000c(15, 68, true);
			sub_2024d(15, 68, true);
			sub_2000c(15, 70, true);
			sub_2000c(15, 71, true);
			sub_2000c(15, 72, true);
			sub_2024d(15, 72, true);
			sub_2000c(15, 73, true);
			sub_2000c(15, 74, true);
			sub_2024d(15, 74, true);
			sub_2000c(15, 76, true);
			sub_2000c(15, 77, true);
			sub_2000c(15, 78, true);
			sub_2024d(15, 78, true);
			sub_2000c(15, 79, true);
			sub_2000c(15, 80, true);
			sub_2024d(15, 80, true);
			sub_2000c(15, 82, true);
			sub_2000c(15, 83, true);
			sub_2000c(15, 84, true);
			sub_2024d(15, 84, true);
			sub_2000c(15, 85, true);
			sub_2000c(15, 86, true);
			sub_2024d(15, 86, true);
			sub_2000c(15, 88, true);
			sub_2024d(15, 88, true);
			sub_2000c(15, 90, true);
			sub_2024d(15, 90, true);
			sub_2000c(15, 91, true);
			sub_2024d(15, 91, true);
			sub_2000c(15, 92, true);
			sub_2024d(15, 92, true);
			sub_2000c(15, 93, true);
			sub_2024d(15, 93, true);
			sub_2000c(15, 94, true);
			sub_2024d(15, 94, true);
			sub_2000c(15, 95, true);
			sub_2024d(15, 95, true);
			sub_2000c(15, 99, true);
			sub_2024d(15, 99, true);
			sub_2000c(15, 100, true);
			sub_2024d(15, 100, true);
			sub_2000c(15, 101, true);
			sub_2024d(15, 101, true);
			sub_2000c(15, 102, true);
			sub_2024d(15, 102, true);
			sub_2000c(15, 103, true);
			sub_2024d(15, 103, true);
			sub_2000c(15, 104, true);
			sub_2024d(15, 104, true);
			sub_2000c(15, 105, true);
			sub_2024d(15, 105, true);
			sub_2000c(15, 107, true);
			sub_2024d(15, 107, true);
			sub_2000c(15, 109, true);
			sub_2024d(15, 109, true);
			sub_2000c(15, 114, true);
			sub_2024d(15, 114, true);
			sub_2000c(15, 115, true);
			sub_2024d(15, 115, true);
			sub_2000c(15, 112, true);
			sub_2024d(15, 112, true);
			sub_2000c(15, 113, true);
			sub_2024d(15, 113, true);
			sub_2000c(15, 111, true);
			sub_2000c(15, 116, true);
			sub_2000c(15, 117, true);
			sub_2000c(15, 118, true);
			sub_2000c(15, 119, true);
			sub_2b081(15, 116, cGame.var_6e24[cGame.var_68bc[15][111][6]][1]);
			sub_2000c(15, 120, true);
			for (int i = 121; i <= 138; ++i) {
				sub_2000c(15, i, true);
			}
			sub_d500(1, 107, 1, cGame.var_7994 = 0, 24, 0, -1);
			GLLib.Pack_Open("/7");
			sub_d2e8(1, 3);
			GLLib.Pack_FullyClose();
			sub_1bac2();
			sub_2c69b();
			sub_1fb8e(15);
			cGame.var_69cc = true;
		}
	}

	private static void sub_1aaa7() {
		sub_23a84(61);
		addExperience(100);
	}

	private static void sub_1aacc() {
		sub_23a84(61);
		setExperience(0);
	}

	private static void sub_1aaf0() {
		sub_23a84(61);
		++cGame.var_7064;
	}

	private static void sub_1ab18() {
		sub_23a84(61);
		cGame.var_7064 = 0;
	}

	private static void sub_1ab3c() {
		sub_23a84(61);
		sub_2e549(1000);
	}

	private static void sub_1ab62() {
		sub_23a84(61);
		sub_2e208(0);
	}

	private static void sub_1ab86() {
		sub_23a84(61);
		sub_2e482(100000);
	}

	private static void sub_1abab() {
		sub_23a84(61);
		sub_2e482(1000000);
	}

	private static void sub_1abd0() {
		sub_23a84(61);
		sub_2e1e1(0);
	}

	private static void sub_1abf4() {
		sub_23a84(57);
		sub_1b80a();
		sub_1b45d();
	}

	private static void sub_1ac1a() {
		sub_23a84(61);
		setLevel(49);
		onLevelUp();
	}

	private static void sub_1ac42() {
		sub_23a84(61);
		onLevelUp();
	}

	private static void sub_1ac65() {
		sub_23a84(61);
		if (++cGame.var_7984 >= 297) {
			cGame.var_7984 = 0;
		}
		cGame.var_798c = sub_1b386(cGame.var_7984);
	}

	private static void sub_1acaf() {
		sub_23a84(61);
		if ((cGame.var_7984 += 10) >= 297) {
			cGame.var_7984 = 0;
		}
		cGame.var_798c = sub_1b386(cGame.var_7984);
	}

	private static void sub_1acfa() {
		sub_23a84(61);
		if (--cGame.var_7984 < 0) {
			cGame.var_7984 = 296;
		}
		cGame.var_798c = sub_1b386(cGame.var_7984);
	}

	private static void sub_1ad43() {
		sub_23a84(61);
		if ((cGame.var_7984 -= 10) < 0) {
			cGame.var_7984 = 296;
		}
		cGame.var_798c = sub_1b386(cGame.var_7984);
	}

	private static void sub_1ad8d() {
		sub_23a84(61);
		for (int i = cGame.var_7f74 - '\u0001'; i >= 0; --i) {
			if (cGame.var_7e4c[i] >= 0) {
				sub_4ab1c(cGame.var_7f6c = i, true);
				sub_4a6a7(i);
			}
		}
		sub_4a22d(cGame.var_7984, 0, true);
		sub_19f9b();
	}

	private static void sub_1adfa() {
		sub_23a84(61);
		sub_3d937(cGame.var_7994 << 2, cGame.var_7994);
	}

	private static void sub_1ae25() {
		sub_23a84(61);
		sub_3d937((cGame.var_7994 << 2) + 1, cGame.var_7994);
	}

	private static void sub_1ae52() {
		sub_23a84(61);
		sub_3d937((cGame.var_7994 << 2) + 2, cGame.var_7994);
	}

	private static void sub_1ae7f() {
		sub_23a84(61);
		sub_3d937((cGame.var_7994 << 2) + 3, cGame.var_7994);
	}

	private static void sub_1aeac() {
		sub_23a84(61);
		if (cGame.var_7994 < 14) {
			++cGame.var_7994;
		} else {
			cGame.var_7994 = 0;
		}
		sub_1bac2();
	}

	private static void sub_1aefa() {
		sub_23a84(61);
		if (cGame.var_7994 > 0) {
			--cGame.var_7994;
		} else {
			cGame.var_7994 = 14;
		}
		sub_1bac2();
	}

	private static void sub_1af47() {
		sub_23a84(61);
		sub_e522(false);
		sub_44ced(1);
	}

	private static void sub_1af6f() {
		sub_23a84(61);
		cGame.var_6d54 = 1;
		while (cGame.var_6d54 < 13) {
			sub_29f90();
			sub_296ba(true);
			++cGame.var_6d54;
		}
		sub_19f9b();
	}

	private static void sub_1afc4() {
		sub_23a84(61);
		cGame.var_808c = 9;
		Class_f.sub_6cdb();
	}

	private static void sub_1afec() {
		sub_23a84(61);
		if (cGame.var_68bc[15][111][6] < 9) {
			final short[] array = cGame.var_68bc[15][111];
			final int n = 6;
			++array[n];
		} else {
			cGame.var_68bc[15][111][6] = 0;
		}
		sub_2b081(15, 116, cGame.var_6e24[cGame.var_68bc[15][111][6]][1]);
	}

	private static void sub_1b06b() {
		sub_23a84(61);
		if (cGame.var_68bc[15][111][6] > 0) {
			final short[] array = cGame.var_68bc[15][111];
			final int n = 6;
			--array[n];
		} else {
			cGame.var_68bc[15][111][6] = 9;
		}
		sub_2b081(15, 116, cGame.var_6e24[cGame.var_68bc[15][111][6]][1]);
	}

	private static void sub_1b0e9() {
		sub_23a84(61);
		sub_2b081(15, 116,
				cGame.var_6e24[cGame.var_68bc[15][111][6]][1] = ((cGame.var_6e24[cGame.var_68bc[15][111][6]][1]
						+ 100 < 0)
								? 0
								: ((cGame.var_6e24[cGame.var_68bc[15][111][6]][1] + 100 > cGame.var_8064[24])
										? cGame.var_8064[24]
										: (cGame.var_6e24[cGame.var_68bc[15][111][6]][1] + 100))));
	}

	private static void sub_1b1b3() {
		sub_23a84(61);
		sub_2b081(15, 116,
				cGame.var_6e24[cGame.var_68bc[15][111][6]][1] = ((cGame.var_6e24[cGame.var_68bc[15][111][6]][1]
						- 100 < 0)
								? 0
								: ((cGame.var_6e24[cGame.var_68bc[15][111][6]][1] - 100 > cGame.var_8064[24])
										? cGame.var_8064[24]
										: (cGame.var_6e24[cGame.var_68bc[15][111][6]][1] - 100))));
	}

	private static void sub_1b27d() {
		sub_23a84(61);
		sub_2e5a7(60);
	}

	private static void sub_1b2a2() {
		sub_23a84(61);
		sub_2ea12(0, 10);
	}

	private static void sub_1b2c8() {
		sub_23a84(61);
		sub_2ea12(1, 10);
	}

	private static void sub_1b2ee() {
		sub_23a84(61);
		sub_2ea12(2, 10);
	}

	private static void sub_1b314() {
		sub_23a84(61);
		sub_2ea12(3, 10);
	}

	private static void sub_1b33a() {
		sub_23a84(61);
		sub_2ea12(4, 10);
	}

	private static void sub_1b360() {
		sub_23a84(61);
		sub_2ea12(5, 10);
	}

	private static String sub_1b386(final int n) {
		String s = "";
		if (n >= 0 && n < 297 && cGame.var_80fc[n] != -1) {
			final String sub_4e1f;
			s = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_80fc[n])) == null) ? "" : sub_4e1f);
		}
		return s;
	}

	private static void sub_1b3fa(final boolean b) {
		sub_2000c(15, 0, true);
		sub_2000c(15, 144, true);
		if (b) {
			sub_2000c(15, 146, true);
			sub_2000c(15, 147, true);
			return;
		}
		sub_2000c(15, 146, false);
		sub_2000c(15, 147, false);
	}

	private static void sub_1b45d() {
		if (!cGame.var_69a4) {
			sub_1b3fa(true);
			sub_2000c(15, 145, true);
			sub_2024d(15, 145, true);
			final String appProperty;
			if ((appProperty = GloftGF2M.s_instance.getAppProperty("URL-SUPPORT")) != null
					&& appProperty.indexOf("http") != -1) {
				sub_2000c(15, 2, true);
				sub_2024d(15, 2, true);
				final String sub_4e1f;
				cGame.var_68cc[15][3] = (((sub_4e1f = GLLib.TODO_sub_4e1f(64)) == null) ? "" : sub_4e1f);
				sub_2000c(15, 3, true);
			}
			sub_2000c(15, 4, true);
			sub_2024d(15, 4, true);
			sub_2000c(15, 6, true);
			sub_2000c(15, 7, true);
			sub_2024d(15, 7, true);
			sub_2000c(15, 9, true);
			sub_2024d(15, 9, true);
			if (IGP.sub_320d()) {
				sub_2000c(15, 148, true);
				sub_2024d(15, 148, true);
				sub_2000c(15, 149, true);
				final String sub_4e1f2;
				cGame.var_68cc[15][149] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(839)) == null) ? "" : sub_4e1f2);
			}
			sub_2000c(15, 13, true);
			sub_2024d(15, 13, true);
			sub_2000c(15, 16, true);
			sub_2024d(15, 16, true);
			sub_2000c(15, 17, true);
			sub_2024d(15, 17, true);
			sub_2c69b();
			sub_1fb8e(15);
			cGame.var_69a4 = true;
			if (sndPlayingOnChannel(0) && GLLibPlayer.sub_2abc() == 13) {
				sub_23d73();
			}
		}
	}

	private static void sub_1b5e6() {
		if (cGame.var_69a4) {
			sub_2000c(15, 145, false);
			sub_2024d(15, 145, false);
			sub_2000c(15, 2, false);
			sub_2024d(15, 2, false);
			sub_2000c(15, 3, false);
			sub_2000c(15, 4, false);
			sub_2024d(15, 4, false);
			sub_2000c(15, 6, false);
			sub_2000c(15, 7, false);
			sub_2024d(15, 7, false);
			sub_2000c(15, 9, false);
			sub_2024d(15, 9, false);
			sub_2000c(15, 148, false);
			sub_2024d(15, 148, false);
			sub_2000c(15, 149, false);
			sub_2000c(15, 13, false);
			sub_2024d(15, 13, false);
			sub_2000c(15, 16, false);
			sub_2024d(15, 16, false);
			sub_2000c(15, 17, false);
			sub_2024d(15, 17, false);
			cGame.var_69a4 = false;
		}
	}

	private static void sub_1b6c1() {
		if (cGame.var_69ac) {
			sub_2000c(15, 18, false);
			sub_2024d(15, 18, false);
			sub_2000c(15, 20, false);
			sub_2024d(15, 20, false);
			sub_2000c(15, 22, false);
			cGame.var_69ac = false;
		}
	}

	private static void sub_1b71c() {
		if (!cGame.var_69c4) {
			sub_2000c(15, 24, true);
			sub_2024d(15, 24, true);
			sub_2000c(15, 26, true);
			sub_2024d(15, 26, true);
			sub_2000c(15, 28, false);
			sub_2024d(15, 28, false);
			sub_2000c(15, 34, true);
			sub_2024d(15, 34, true);
			sub_2c69b();
			sub_1fb8e(15);
			cGame.var_69c4 = true;
		}
	}

	private static void sub_1b797() {
		if (cGame.var_69c4) {
			sub_2000c(15, 24, false);
			sub_2024d(15, 24, false);
			sub_2000c(15, 26, false);
			sub_2024d(15, 26, false);
			sub_2000c(15, 28, false);
			sub_2024d(15, 28, false);
			sub_2000c(15, 34, false);
			sub_2024d(15, 34, false);
			cGame.var_69c4 = false;
		}
	}

	private static void sub_1b80a() {
		if (cGame.var_69cc) {
			sub_2000c(15, 62, false);
			sub_2024d(15, 62, false);
			sub_2000c(15, 60, false);
			sub_2024d(15, 60, false);
			sub_2000c(15, 63, false);
			sub_2000c(15, 64, false);
			sub_2000c(15, 65, false);
			sub_2024d(15, 65, false);
			sub_2000c(15, 66, false);
			sub_2024d(15, 66, false);
			sub_2000c(15, 67, false);
			sub_2000c(15, 68, false);
			sub_2024d(15, 68, false);
			sub_2000c(15, 70, false);
			sub_2000c(15, 71, false);
			sub_2000c(15, 72, false);
			sub_2024d(15, 72, false);
			sub_2000c(15, 73, false);
			sub_2000c(15, 74, false);
			sub_2024d(15, 74, false);
			sub_2000c(15, 76, false);
			sub_2000c(15, 77, false);
			sub_2000c(15, 78, false);
			sub_2024d(15, 78, false);
			sub_2000c(15, 79, false);
			sub_2000c(15, 80, false);
			sub_2024d(15, 80, false);
			sub_2000c(15, 82, false);
			sub_2000c(15, 83, false);
			sub_2000c(15, 84, false);
			sub_2024d(15, 84, false);
			sub_2000c(15, 85, false);
			sub_2000c(15, 86, false);
			sub_2024d(15, 86, false);
			sub_2000c(15, 88, false);
			sub_2024d(15, 88, false);
			sub_2000c(15, 90, false);
			sub_2024d(15, 90, false);
			sub_2000c(15, 91, false);
			sub_2024d(15, 91, false);
			sub_2000c(15, 92, false);
			sub_2024d(15, 92, false);
			sub_2000c(15, 93, false);
			sub_2024d(15, 93, false);
			sub_2000c(15, 94, false);
			sub_2024d(15, 94, false);
			sub_2000c(15, 95, false);
			sub_2024d(15, 95, false);
			sub_2000c(15, 99, false);
			sub_2000c(15, 100, false);
			sub_2000c(15, 101, false);
			sub_2000c(15, 102, false);
			sub_2000c(15, 103, false);
			sub_2024d(15, 103, false);
			sub_2000c(15, 104, false);
			sub_2024d(15, 104, false);
			sub_2000c(15, 105, false);
			sub_2024d(15, 105, false);
			sub_2000c(15, 107, false);
			sub_2024d(15, 107, false);
			sub_2000c(15, 109, false);
			sub_2024d(15, 109, false);
			sub_2000c(15, 114, false);
			sub_2024d(15, 114, false);
			sub_2000c(15, 115, false);
			sub_2024d(15, 115, false);
			sub_2000c(15, 112, false);
			sub_2024d(15, 112, false);
			sub_2000c(15, 113, false);
			sub_2024d(15, 113, false);
			sub_2000c(15, 111, false);
			sub_2000c(15, 116, false);
			sub_2000c(15, 117, false);
			sub_2000c(15, 118, false);
			sub_2000c(15, 119, false);
			sub_2000c(15, 120, false);
			for (int i = 121; i <= 138; ++i) {
				sub_2000c(15, i, false);
			}
			cGame.var_69cc = false;
		}
	}

	private static void sub_1bac2() {
		final int n = 107 + cGame.var_7994;
		sub_d500(1, n, 1, 0, 24, 0, -1);
		GLLib.Pack_Open("/7");
		sub_d2e8(1, 3);
		GLLib.Pack_FullyClose();
		cGame.var_68bc[15][99][5] = (short) n;
		cGame.var_68bc[15][100][5] = (short) n;
		cGame.var_68bc[15][101][5] = (short) n;
		cGame.var_68bc[15][102][5] = (short) n;
		sub_2c69b();
		sub_1fb8e(15);
	}

	private static void sub_1bb38() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1bb5f() {
		if (cGame.var_68bc[16][57][6] == 54) {
			sub_23a84(49);
			sub_3dcc4(1);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1bba8() {
		if (cGame.var_68bc[16][63][6] == 54) {
			sub_23a84(49);
			sub_3dcc4(2);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1bbf1() {
		if (cGame.var_68bc[16][69][6] == 54) {
			sub_23a84(49);
			sub_3dcc4(3);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1bc3a() {
		if (cGame.var_68bc[16][75][6] == 54) {
			sub_23a84(49);
			sub_3dcc4(4);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1bc83() {
		if (cGame.var_68bc[16][81][6] == 54) {
			sub_23a84(49);
			sub_3dcc4(5);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1bccc() {
		sub_23a84(61);
		if (cGame.var_67dc[cGame.field_a_int] == 25) {
			sub_47802();
		}
	}

	private static void sub_1bd09() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1bd30() {
		switch (sub_8396()) {
		case 15: {
			sub_3b70c(33);
			return;
		}
		case 16: {
			sub_3ae52(33);
			break;
		}
		}
	}

	private static void sub_1bd8c() {
		switch (sub_8396()) {
		case 15: {
			sub_3b70c(1);
			return;
		}
		case 16: {
			sub_3ae52(1);
			break;
		}
		}
	}

	private static void sub_1bde6() {
		switch (sub_8396()) {
		case 15: {
			sub_3b70c(32);
			return;
		}
		case 16: {
			sub_3ae52(32);
			break;
		}
		}
	}

	private static void sub_1be42() {
		switch (sub_8396()) {
		case 15: {
			sub_3b9d3(0);
			return;
		}
		case 16: {
			sub_3b1e6(0);
			break;
		}
		}
	}

	private static void sub_1be9c() {
		switch (sub_8396()) {
		case 15: {
			sub_3b9d3(1);
			return;
		}
		case 16: {
			sub_3b1e6(1);
			break;
		}
		}
	}

	private static void sub_1bef6() {
		switch (sub_8396()) {
		case 15: {
			sub_3b9d3(2);
			return;
		}
		case 16: {
			sub_3b1e6(2);
			break;
		}
		}
	}

	private static void sub_1bf50() {
		switch (sub_8396()) {
		case 15: {
			sub_3b9d3(3);
			return;
		}
		case 16: {
			sub_3b1e6(3);
			break;
		}
		}
	}

	private static void sub_1bfaa() {
		switch (sub_8396()) {
		case 15: {
			sub_3b9d3(4);
			return;
		}
		case 16: {
			sub_3b1e6(4);
			break;
		}
		}
	}

	private static void sub_1c004() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1c02b() {
		sub_23a84(61);
		sub_3282d(3, 2, true);
	}

	private static void sub_1c051() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c076() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c09b() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c0c0() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c0e5() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c10a() {
		sub_23a84(61);
		sub_81e0(27);
	}

	private static void sub_1c12f() {
		sub_23a84(61);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1c156() {
		if (cGame.var_7d9c > cGame.var_7da4) {
			sub_23a84(61);
			if (sub_479c7(0)) {
				sub_49db0(1, 1, 3, false);
			}
			return;
		}
		sub_23a84(56);
		if (!sub_20167(24, 28)) {
			sub_2000c(24, 28, true);
			return;
		}
		sub_2000c(24, 28, false);
	}

	private static void sub_1c1d0() {
		if (sub_2e449(cGame.var_7e34)) {
			sub_23a84(49);
			if (sub_479c7(2)) {
				sub_49db0(1, 1, 3, false);
			}
			return;
		}
		sub_23a84(56);
		if (cGame.var_7e34 > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7e34 - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			sub_81e0(34);
			cGame.var_815c = true;
		}
	}

	private static void sub_1c288() {
		if (sub_2e449(cGame.var_7e2c)) {
			sub_23a84(49);
			if (sub_479c7(1)) {
				sub_49db0(1, 1, 3, false);
			}
			return;
		}
		sub_23a84(56);
		if (cGame.var_7e2c > 0) {
			final String sub_4e1f;
			cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f, "%d",
					GLLib.CurrencySeparator_just_a_guess(cGame.var_7e2c - getCash(), cGame.var_7fe4, " "));
			cGame.var_7aac = 19;
			cGame.var_7d24 = true;
			sub_81e0(34);
			cGame.var_815c = true;
		}
	}

	private static void sub_1c340() {
		sub_23a84(57);
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1c367() {
		if (cGame.var_6edc[cGame.var_7a64] == 1) {
			sub_23a84(61);
			sub_2c048(cGame.var_7a64);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1c3ac() {
		if (cGame.var_6edc[cGame.var_7a64 + 1] == 1) {
			sub_23a84(61);
			sub_2c048(cGame.var_7a64 + 1);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1c3f5() {
		if (cGame.var_6edc[cGame.var_7a64 + 2] == 1) {
			sub_23a84(61);
			sub_2c048(cGame.var_7a64 + 2);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1c43e() {
		if (cGame.var_6edc[cGame.var_7a64 + 3] == 1) {
			sub_23a84(61);
			sub_2c048(cGame.var_7a64 + 3);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1c487() {
		if (cGame.var_6edc[cGame.var_7a64 + 4] == 1) {
			sub_23a84(61);
			sub_2c048(cGame.var_7a64 + 4);
			return;
		}
		sub_23a84(56);
	}

	private static void sub_1c4d0() {
		sub_23a84(61);
		if (cGame.var_7c24 == 1) {
			try {
				Thread.sleep(400L);
			} catch (final Exception ex) {
			}
		}
		sub_4474a();
	}

	private static void sub_1c523() {
		sub_23a84(57);
		sub_44b9b();
	}

	private static void sub_1c546() {
		sub_23a84(61);
		cGame.var_7c2c = "";
		switch (cGame.var_7c24) {
		case 13: {
			if (sub_83cf() == 4) {
				cGame.var_7194 = true;
			}
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 15: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 16: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 17: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 18: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		default: {
			cGame.var_67cc = 1;
			sub_2c69b();
		}
		}
	}

	private static void sub_1c635() {
		sub_23a84(57);
		sub_44b9b();
	}

	private static void sub_1c658() {
		sub_23a84(57);
		sub_4474a();
	}

	private static void sub_1c67b() {
		sub_23a84(61);
		cGame.var_7d54 = cGame.var_7c24;
		cGame.var_7d5c = true;
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_1c6ac() {
		cGame.var_68bc = new short[28][][];
		cGame.var_68c4 = new short[28][][];
		cGame.var_68cc = new String[28][];
		cGame.var_6914 = new int[10][];
		cGame.var_691c = new int[10][];
		cGame.var_68dc = new GLLibImage[200];
		cGame.var_68e4 = new byte[200];
		for (int i = 0; i < 28; ++i) {
			cGame.var_68bc[i] = null;
			cGame.var_68c4[i] = null;
			cGame.var_68cc[i] = null;
		}
		cGame.var_68d4 = new ASprite[122];
		for (int j = 0; j < 122; ++j) {
			cGame.var_68d4[j] = null;
		}
		for (int k = 0; k < 10; ++k) {
			cGame.var_6914[k] = null;
		}
		cGame.var_68ec = new GLLibPlayer[30];
		for (int l = 0; l < 30; ++l) {
			cGame.var_68ec[l] = null;
		}
		cGame.var_6f74 = new int[40][8];
		cGame.var_6fb4 = new int[50];
		cGame.var_6fbc = new GLLibPlayer();
		GLLib.sub_755d();
		sub_2c69b();
	}

	private static void sub_1c7ce(int i) {
		int n = 1;
		switch (i) {
		case 2: {
			sub_d500(1, 19, 1, 0, 24, 0, -1);
			break;
		}
		case 4:
		case 5: {
			sub_d500(1, 0, 1, 0, 24, 0, -1);
			sub_d500(1, 49, 1, 0, 24, 0, -1);
			sub_d500(1, 20, 1, 0, 24, 0, -1);
			sub_d500(1, 33, 1, 0, 24, 0, -1);
			sub_d500(1, 29, 1, 0, 24, 0, -1);
			break;
		}
		case 38: {
			sub_d500(1, 4, 1, 0, 24, 0, -1);
			sub_d500(1, 28, 1, 0, 24, 0, -1);
			sub_d500(1, 45, 1, 0, 24, 0, -1);
			break;
		}
		case 37: {
			break;
		}
		case 8: {
			sub_d500(1, 28, 1, 0, 24, 0, -1);
			break;
		}
		case 36: {
			sub_d500(1, 18, 1, 0, 24, 0, -1);
			sub_d500(1, 31, 1, 0, 24, 0, -1);
			sub_d500(1, 10, 1, 0, 24, 0, -1);
		}
		case 17: {
			sub_d500(1, 1, 1, 0, 24, 0, -1);
			sub_d500(1, 6, 1, 0, 24, 0, -1);
			sub_d500(1, 3, 1, 0, 24, 0, -1);
			sub_d500(1, 2, 1, 0, 24, 0, -1);
			sub_d500(1, 13, 1, 0, 24, 0, -1);
			sub_d500(1, 10, 1, 0, 24, 0, -1);
			sub_d500(1, 9, 1, 0, 24, 0, -1);
			sub_d500(1, 17, 1, 0, 24, 0, -1);
			sub_d500(1, 23, 1, 0, 24, 0, -1);
			sub_d500(1, 30, 1, 0, 24, 0, -1);
			sub_d500(1, 22, 1, 0, 24, 0, -1);
			sub_d500(1, 40, 1, 0, 24, 0, -1);
			sub_d500(1, 41, 1, 0, 24, 0, -1);
			sub_d500(1, 47, 1, 0, 24, 0, -1);
			sub_d500(1, 5, 1, 0, 24, 0, -1);
			sub_d500(1, 48, 1, 0, 24, 0, -1);
			break;
		}
		case 7: {
			sub_d500(1, 4, 1, 0, 24, 0, -1);
			break;
		}
		case 28: {
			sub_d500(1, 4, 1, 0, 24, 0, -1);
			break;
		}
		case 26: {
			sub_d500(1, 11, 1, 0, 24, 0, -1);
			break;
		}
		case 10: {
			sub_d500(1, 12, 1, 0, 24, 0, -1);
			break;
		}
		case 27: {
			sub_d500(1, 11, 1, 0, 24, 0, -1);
			sub_d500(1, 34, 1, 0, 24, 0, -1);
			break;
		}
		case 11: {
			sub_d500(1, 14, 1, 0, 24, 0, -1);
			sub_d500(1, 11, 1, 0, 24, 0, -1);
			break;
		}
		case 12: {
			sub_d500(1, 11, 1, 0, 24, 0, -1);
			break;
		}
		case 13: {
			sub_d500(1, 7, 1, 0, 24, 0, -1);
			sub_d500(1, 21, 1, 0, 24, 0, -1);
			break;
		}
		case 14: {
			sub_d500(1, 7, 1, 0, 24, 0, -1);
			sub_d500(1, 21, 1, 0, 24, 0, -1);
			sub_d500(1, 14, 1, 0, 24, 0, -1);
			sub_d500(1, 34, 1, 0, 24, 0, -1);
			break;
		}
		case 29: {
			sub_d500(1, 16, 1, 0, 24, 0, -1);
			sub_d500(1, 27, 1, 0, 24, 0, -1);
			sub_d500(1, 35, 1, 0, 24, 0, -1);
			sub_d500(1, 36, 1, 0, 24, 0, -1);
			break;
		}
		case 30: {
			sub_d500(1, 35, 1, 0, 24, 0, -1);
			sub_d500(1, 36, 1, 0, 24, 0, -1);
			break;
		}
		case 39: {
			sub_d500(1, 34, 1, 0, 24, 0, -1);
			break;
		}
		case 25: {
			sub_d500(1, 7, 1, 0, 24, 0, -1);
			sub_d500(1, 32, 1, 0, 24, 0, -1);
			sub_d500(1, 35, 1, 0, 24, 0, -1);
			sub_d500(1, 34, 1, 0, 24, 0, -1);
			break;
		}
		case 34: {
			sub_d500(1, 43, 1, 0, 24, 0, -1);
			sub_d500(1, 37, 1, 0, 24, 0, -1);
			sub_d500(1, 38, 1, 0, 24, 0, -1);
			break;
		}
		default: {
			n = 0;
			break;
		}
		}
		if (n == 1) {
			GLLib.Pack_Open("/7");
			sub_d2e8(1, 1);
			GLLib.Pack_FullyClose();
		}
		switch (i) {
		case 29: {
			cGame.var_68fc = new GLLibPlayer[6];
			for (i = 0; i < 6; ++i) {
				cGame.var_68fc[i] = new GLLibPlayer(cGame.var_68d4[36], 0, 0);
			}
			cGame.var_690c = new GLLibPlayer[3];
			for (i = 0; i < 3; ++i) {
				cGame.var_690c[i] = new GLLibPlayer(cGame.var_68d4[36], 0, 0);
			}
			cGame.var_6904 = new GLLibPlayer(cGame.var_68d4[36], 0, 0);
			return;
		}
		case 25: {
			cGame.var_68f4 = new GLLibPlayer[7];
			for (i = 0; i < 7; ++i) {
				cGame.var_68f4[i] = new GLLibPlayer(cGame.var_68d4[32], 0, 0);
			}
			break;
		}
		}
	}

	private static void sub_1cd44(int i) {
		switch (i) {
		case 2: {
			i = 65535;
			sub_d500(1, 19, i, 1, 0, 0, -1);
			break;
		}
		case 4:
		case 5: {
			i = 65535;
			sub_d500(1, 0, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 49, i, 1, 0, 0, -1);
			break;
		}
		case 38: {
			i = 65535;
			sub_d500(1, 4, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 28, i, 1, 0, 0, -1);
			break;
		}
		case 8: {
			i = 65535;
			sub_d500(1, 28, i, 1, 0, 0, -1);
			break;
		}
		case 36: {
			i = 65535;
			sub_d500(1, 18, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 31, i, 1, 0, 0, -1);
		}
		case 17: {
			i = 65535;
			sub_d500(1, 6, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 3, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 2, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 9, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 10, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 17, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 23, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 40, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 5, i, 1, 0, 0, -1);
			break;
		}
		case 7: {
			i = 65535;
			sub_d500(1, 4, i, 1, 0, 0, -1);
			break;
		}
		case 28: {
			i = 65535;
			sub_d500(1, 4, i, 1, 0, 0, -1);
			break;
		}
		case 26: {
			i = 65535;
			sub_d500(1, 11, i, 1, 0, 0, -1);
			break;
		}
		case 10: {
			i = 65535;
			sub_d500(1, 12, i, 1, 0, 0, -1);
			break;
		}
		case 27: {
			i = 65535;
			sub_d500(1, 34, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 11, i, 1, 0, 0, -1);
			break;
		}
		case 11: {
			i = 65535;
			sub_d500(1, 14, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 11, i, 1, 0, 0, -1);
			break;
		}
		case 12: {
			i = 65535;
			sub_d500(1, 11, i, 1, 0, 0, -1);
			break;
		}
		case 13: {
			i = 65535;
			sub_d500(1, 7, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 21, i, 1, 0, 0, -1);
			break;
		}
		case 14: {
			i = 65535;
			sub_d500(1, 7, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 21, i, 1, 0, 0, -1);
			break;
		}
		case 29: {
			for (i = 0; i < 6; ++i) {
				cGame.var_68fc[i] = null;
			}
			for (i = 0; i < 3; ++i) {
				cGame.var_690c[i] = null;
			}
			cGame.var_6904 = null;
			i = 65535;
			sub_d500(1, 16, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 27, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 35, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 36, i, 1, 0, 0, -1);
			break;
		}
		case 30: {
			i = 65535;
			sub_d500(1, 35, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 36, i, 1, 0, 0, -1);
			break;
		}
		case 39: {
			i = 65535;
			sub_d500(1, 34, i, 1, 0, 0, -1);
			break;
		}
		case 25: {
			for (i = 0; i < 7; ++i) {
				cGame.var_68f4[i] = null;
			}
			i = 65535;
			sub_d500(1, 7, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 32, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 35, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 34, i, 1, 0, 0, -1);
			break;
		}
		case 34: {
			i = 65535;
			sub_d500(1, 43, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 37, i, 1, 0, 0, -1);
			i = 65535;
			sub_d500(1, 38, i, 1, 0, 0, -1);
			break;
		}
		}
		sub_d2e8(1, 2);
	}

	private static void sub_1d1a7(int n, final boolean b) {
		if (cGame.var_68bc[n] != null) {
			sub_1daf4(n);
			return;
		}
		GLLib.Pack_Open("/6");
		final byte[] sub_3253 = GLLib.Pack_ReadData(n);
		int n2 = 0;
		int n3 = 0;
		for (int i = 0; i < sub_3253.length; i += n3) {
			n2++;
			int n4 = GLLib.Mem_GetByte(sub_3253, i) & 0xFF;
			byte var10001;

			switch (n3) {
			case 201:
				var10001 = 9;
				break;
			case 202:
				var10001 = 10;
				break;
			case 203:
				var10001 = 14;
				break;
			case 204:
				var10001 = 18;
				break;
			case 205:
				var10001 = 23;
				break;
			case 206:
				var10001 = 12;
				break;
			case 207:
				var10001 = 13;
				break;
			case 208:
				var10001 = 1;
				break;
			case 209:
				var10001 = 7;
				break;
			default:
				var10001 = 0;
			}
		}
		int n6 = 0;
		cGame.var_68c4[n] = new short[n2][];
		cGame.var_68bc[n] = new short[n2][];
		cGame.var_68cc[n] = new String[n2];
		for (int j = 0; j < n2; ++j) {
			final int n7 = GLLib.Mem_GetByte(sub_3253, n6) & 0xFF;
			cGame.var_68c4[n][j] = new short[5 + sub_1dc09(n7)];
			switch (n7) {
			case 201: {
				final byte[] array = sub_3253;
				final int n8 = n6;
				final short[] array2 = cGame.var_68c4[n][j];
				final int n9 = n8;
				final byte[] array3 = array;
				int sub_1dbac = sub_1dbac(array, n9, array2);
				array2[5] = GLLib.sub_3eb0(array3, sub_1dbac);
				sub_1dbac += 2;
				array2[6] = GLLib.sub_3eb0(array3, sub_1dbac);
				sub_1dbac += 2;
				array2[7] = (short) (GLLib.Mem_GetByte(array3, sub_1dbac) & 0xFF);
				++sub_1dbac;
				array2[8] = (short) (GLLib.Mem_GetByte(array3, sub_1dbac) & 0xFF);
				++sub_1dbac;
				array2[9] = (short) (GLLib.Mem_GetByte(array3, sub_1dbac) & 0xFF);
				++sub_1dbac;
				array2[10] = (short) (GLLib.Mem_GetByte(array3, sub_1dbac) & 0xFF);
				++sub_1dbac;
				array2[11] = (short) (GLLib.Mem_GetByte(array3, sub_1dbac) & 0xFF);
				n6 = ++sub_1dbac;
				break;
			}
			case 202: {
				final byte[] array4 = sub_3253;
				final int n10 = n6;
				final short[] array5 = cGame.var_68c4[n][j];
				final int n11 = n10;
				final byte[] array6 = array4;
				int sub_1dbac2 = sub_1dbac(array4, n11, array5);
				array5[5] = GLLib.sub_3eb0(array6, sub_1dbac2);
				sub_1dbac2 += 2;
				array5[6] = GLLib.sub_3eb0(array6, sub_1dbac2);
				sub_1dbac2 += 2;
				array5[7] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				++sub_1dbac2;
				array5[8] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				++sub_1dbac2;
				array5[9] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				++sub_1dbac2;
				array5[10] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				++sub_1dbac2;
				array5[11] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				++sub_1dbac2;
				array5[12] = (short) (GLLib.Mem_GetByte(array6, sub_1dbac2) & 0xFF);
				n6 = ++sub_1dbac2;
				break;
			}
			case 203: {
				final byte[] array7 = sub_3253;
				final int n12 = n6;
				final short[] array8 = cGame.var_68c4[n][j];
				final int n13 = n12;
				final byte[] array9 = array7;
				int sub_1dbac3 = sub_1dbac(array7, n13, array8);
				array8[5] = GLLib.sub_3eb0(array9, sub_1dbac3);
				sub_1dbac3 += 2;
				array8[6] = GLLib.sub_3eb0(array9, sub_1dbac3);
				sub_1dbac3 += 2;
				array8[7] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[8] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[9] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[10] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[11] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[12] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[13] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[14] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[15] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				++sub_1dbac3;
				array8[16] = (short) (GLLib.Mem_GetByte(array9, sub_1dbac3) & 0xFF);
				n6 = ++sub_1dbac3;
				break;
			}
			case 204: {
				final byte[] array10 = sub_3253;
				final int n14 = n6;
				final short[] array11 = cGame.var_68c4[n][j];
				final int n15 = n14;
				final byte[] array12 = array10;
				int sub_1dbac4 = sub_1dbac(array10, n15, array11);
				array11[5] = GLLib.sub_3eb0(array12, sub_1dbac4);
				sub_1dbac4 += 2;
				array11[6] = GLLib.sub_3eb0(array12, sub_1dbac4);
				sub_1dbac4 += 2;
				array11[7] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[8] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[9] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[10] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[11] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[12] = GLLib.sub_3eb0(array12, sub_1dbac4);
				sub_1dbac4 += 2;
				array11[13] = GLLib.sub_3eb0(array12, sub_1dbac4);
				sub_1dbac4 += 2;
				array11[14] = GLLib.sub_3eb0(array12, sub_1dbac4);
				sub_1dbac4 += 2;
				array11[15] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[16] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				++sub_1dbac4;
				array11[17] = (short) (GLLib.Mem_GetByte(array12, sub_1dbac4) & 0xFF);
				n6 = ++sub_1dbac4;
				break;
			}
			case 205: {
				final byte[] array13 = sub_3253;
				final int n16 = n6;
				final short[] array14 = cGame.var_68c4[n][j];
				final int n17 = n16;
				final byte[] array15 = array13;
				int sub_1dbac5 = sub_1dbac(array13, n17, array14);
				array14[5] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[6] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[7] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[8] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[9] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[10] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[11] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[12] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[13] = GLLib.sub_3eb0(array15, sub_1dbac5);
				sub_1dbac5 += 2;
				array14[14] = GLLib.sub_3eb0(array15, sub_1dbac5);
				sub_1dbac5 += 2;
				array14[15] = GLLib.sub_3eb0(array15, sub_1dbac5);
				sub_1dbac5 += 2;
				array14[16] = GLLib.sub_3eb0(array15, sub_1dbac5);
				sub_1dbac5 += 2;
				array14[17] = GLLib.sub_3eb0(array15, sub_1dbac5);
				sub_1dbac5 += 2;
				array14[18] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[19] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[20] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[21] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				++sub_1dbac5;
				array14[22] = (short) (GLLib.Mem_GetByte(array15, sub_1dbac5) & 0xFF);
				n6 = ++sub_1dbac5;
				break;
			}
			case 206: {
				final byte[] array16 = sub_3253;
				final int n18 = n6;
				final short[] array17 = cGame.var_68c4[n][j];
				final int n19 = n18;
				final byte[] array18 = array16;
				int sub_1dbac6 = sub_1dbac(array16, n19, array17);
				array17[5] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[6] = GLLib.sub_3eb0(array18, sub_1dbac6);
				sub_1dbac6 += 2;
				array17[7] = GLLib.sub_3eb0(array18, sub_1dbac6);
				sub_1dbac6 += 2;
				array17[8] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[9] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[10] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[11] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[12] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[13] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				++sub_1dbac6;
				array17[14] = (short) (GLLib.Mem_GetByte(array18, sub_1dbac6) & 0xFF);
				n6 = ++sub_1dbac6;
				break;
			}
			case 207: {
				final byte[] array19 = sub_3253;
				final int n20 = n6;
				final short[] array20 = cGame.var_68c4[n][j];
				final int n21 = n20;
				final byte[] array21 = array19;
				int sub_1dbac7 = sub_1dbac(array19, n21, array20);
				array20[5] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[6] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[7] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[8] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[9] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[10] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[11] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[12] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[13] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[14] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[15] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[16] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				++sub_1dbac7;
				array20[17] = GLLib.Mem_GetByte(array21, sub_1dbac7);
				n6 = ++sub_1dbac7;
				break;
			}
			case 208: {
				final byte[] array22 = sub_3253;
				final int n22 = n6;
				final short[] array23 = cGame.var_68c4[n][j];
				final int n23 = n22;
				final byte[] array24 = array22;
				int sub_1dbac8 = sub_1dbac(array22, n23, array23);
				array23[5] = (short) (GLLib.Mem_GetByte(array24, sub_1dbac8) & 0xFF);
				n6 = ++sub_1dbac8;
				break;
			}
			case 209: {
				final byte[] array25 = sub_3253;
				final int n24 = n6;
				final short[] array26 = cGame.var_68c4[n][j];
				final int n25 = n24;
				final byte[] array27 = array25;
				int sub_1dbac9 = sub_1dbac(array25, n25, array26);
				array26[5] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[6] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[7] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[8] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[9] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[10] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				++sub_1dbac9;
				array26[11] = (short) (GLLib.Mem_GetByte(array27, sub_1dbac9) & 0xFF);
				n6 = ++sub_1dbac9;
				break;
			}
			}
		}
		sub_1daf4(n);
		GLLib.Pack_FullyClose();
	}

	private static void sub_1daf4(final int n) {
		for (int i = cGame.var_68c4[n].length - 1; i >= 0; --i) {
			sub_1db3f(n, i);
		}
	}

	private static void sub_1db3f(final int n, final int n2) {
		int i = 5 + sub_1dc09(cGame.var_68c4[n][n2][0]);
		cGame.var_68bc[n][n2] = new short[i];
		--i;
		while (i >= 0) {
			cGame.var_68bc[n][n2][i] = cGame.var_68c4[n][n2][i];
			--i;
		}
	}

	private static int sub_1dbac(final byte[] array, int n, final short[] array2) {
		array2[0] = (short) (GLLib.Mem_GetByte(array, n) & 0xFF);
		++n;
		array2[1] = GLLib.sub_3eb0(array, n);
		n += 2;
		array2[2] = GLLib.sub_3eb0(array, n);
		n += 2;
		array2[3] = GLLib.sub_3eb0(array, n);
		n += 2;
		array2[4] = (short) (GLLib.Mem_GetByte(array, n) & 0xFF);
		return ++n;
	}

	private static int sub_1dc09(final int n) {
		switch (n) {
		case 201: {
			return 7;
		}
		case 202: {
			return 8;
		}
		case 203: {
			return 12;
		}
		case 204: {
			return 13;
		}
		case 205: {
			return 18;
		}
		case 206: {
			return 10;
		}
		case 207: {
			return 13;
		}
		case 208: {
			return 1;
		}
		case 209: {
			return 7;
		}
		default: {
			return 0;
		}
		}
	}

	private static void sub_1dcc1(final int n) {
		for (int i = 0; i < cGame.var_68bc[n].length; ++i) {
			final int n2 = i;
			if (cGame.var_68bc[n][n2] != null) {
				final short[] array = cGame.var_68bc[n][n2];
				final int n3 = n2;
				final short[] array2 = array;
				switch (array[0]) {
				case 201: {
					final short[] array3;
					final short n4 = (array3 = array2)[2];
					final short n5 = array3[3];
					final short n6 = array3[5];
					final short n7 = array3[6];
					if (array3[10] == 1) {
						GLLib.g
								.setColor((array3[7] & 0xFF) << 16 | (array3[8] & 0xFF) << 8 | (array3[9] & 0xFF));
						GLLib.sub_37b0(GLLib.g, n4, n5, n6, n7, true);
					}
					break;
				}
				case 202: {
					final short[] array4;
					if ((array4 = array2)[11] != 0) {
						final short n8 = array4[2];
						final short n9 = array4[3];
						final short n10 = array4[5];
						final short n11 = array4[6];
						final int n12;
						final int color = (n12 = (array4[7] & 0xFF)) << 24 | (array4[8] & 0xFF) << 16
								| (array4[9] & 0xFF) << 8 | (array4[10] & 0xFF);
						if (n12 != 0) {
							if (n12 == 255) {
								GLLib.g.setColor(color);
								GLLib.FillRect(GLLib.g, n8, n9, n10, n11, true);
							} else {
								GLLib.sub_56ff(color);
								GLLib.sub_57eb(GLLib.g, n8, n9, n10, n11);
							}
						}
					}
				}
				case 204: {
					if (cGame.var_68cc[n][n3] == null) {
						break;
					}
					if (array2[17] == 1) {
						sub_1e2f2(cGame.var_68cc[n][n3], n, n3, 0, 0);
						break;
					}
					sub_1df06(cGame.var_68cc[n][n3], n, n3, 0, 0);
					break;
				}
				case 205: {
					sub_1e477(n, array2, 0, 0, n3);
					break;
				}
				}
			}
		}
	}

	private static void sub_1df06(String s, int var_1de7, int n, int n2, int n3) {
		final String s2 = s;
		final short[] array = cGame.var_68bc[var_1de7][n];
		n = n2;
		final short[] array2 = array;
		s = s2;
		n3 = array2[13];
		n2 = array2[14];
		if (array2[15] == 1) {
			final short n4 = array2[9];
			boolean b = false;
			final short n5;
			if ((n5 = array2[16]) >= 0 && n5 < 10 && cGame.var_6914[n5] != null
					&& (cGame.var_6914[n5][12] & 0x8) != 0x0) {
				final int n6 = cGame.var_6914[n5][0] >> 16 & 0xFFFF;
				final int n7 = cGame.var_6914[n5][0] & 0xFFFF;
				if (cGame.var_68d4[cGame.var_68bc[n6][n7][5]].sub_383d(cGame.var_68bc[n6][n7][6]) > 0) {
					final int[] array3 = new int[4];
					cGame.var_68d4[cGame.var_68bc[n6][n7][5]].sub_3882(cGame.var_68bc[n6][n7][6], 0, array3, 0);
					GLLib.sub_36f4(GLLib.g, cGame.var_68bc[n6][n7][2] + array3[0],
							cGame.var_68bc[n6][n7][3] + array3[1], array3[2], array3[3], true);
					b = true;
				}
			}
			sub_1e07e(s, array2[2] + n + n3, array2[3] + n2, array2[5], array2[6], array2[10], n4, array2[7], array2[8],
					false, false);
			if (b) {
				final int var_1ddf = GLLib.s_screenWidth;
				var_1de7 = GLLib.s_screenHeight;
				GLLib.sub_36f4(GLLib.g, 0, 0, var_1ddf, var_1de7, true);
			}
		}
	}

	static void sub_1e07e(final String s, int sub_6475, final int n, final int n2, int n3, int n4, int n5,
			int sub_237ff, final int n6, final boolean b, final boolean b2) {
		int n7 = 0;
		int n8 = 0;
		int n9 = 0;
		sub_237ff = sub_237ff(sub_237ff);
		switch (n4) {
		case 0: {
			n7 = 16;
			n9 = n;
			break;
		}
		case 1: {
			n7 = 2;
			n9 = n + (n3 >> 1);
			break;
		}
		case 2: {
			n7 = 32;
			n9 = n + n3;
			break;
		}
		}
		switch (n5) {
		case 0: {
			n7 |= 0x4;
			n8 = sub_6475;
			break;
		}
		case 1: {
			n7 |= 0x1;
			n8 = sub_6475 + (n2 >> 1);
			break;
		}
		case 2: {
			n7 |= 0x8;
			n8 = sub_6475 + n2;
			break;
		}
		}
		sub_6475 = 0;
		if (cGame.var_689c[2] == null) {
			return;
		}
		if (cGame.var_689c[2][sub_237ff] == null) {
			return;
		}
		if (cGame.var_689c[2] != null && cGame.var_689c[2][sub_237ff] != null) {
			sub_6475 = cGame.var_689c[2][sub_237ff].sub_6475();
		}
		if (n6 >= 0) {
			cGame.var_689c[2][sub_237ff].sub_6434(n6);
		}
		if (b) {
			final short[] sub_4ac6 = cGame.var_689c[2][sub_237ff].sub_4ac6(s, n2, false);
			final ASprite class_e = cGame.var_689c[2][sub_237ff];
			final Graphics var_1daf = GLLib.g;
			final short[] array = sub_4ac6;
			final int n10 = n8;
			final int n11 = n9;
			n5 = n7;
			n4 = n11;
			n3 = n10;
			class_e.sub_547f(var_1daf, s, array, n3, n4, 0, -1, n5, -1, false);
			return;
		}
		cGame.var_689c[2][sub_237ff].sub_5cd2(GLLib.g, s, n8, n9, n7);
		cGame.var_689c[2][sub_237ff].sub_6434(sub_6475);
	}

	private static void sub_1e2f2(String s, int var_1de7, int n, int n2, int n3) {
		final String s2 = s;
		final short[] array = cGame.var_68bc[var_1de7][n];
		n2 = n3;
		final short[] array2 = array;
		s = s2;
		if (array2[15] == 1) {
			n3 = array2[9];
			n = 0;
			final short n4;
			if ((n4 = array2[16]) >= 0 && n4 < 10 && cGame.var_6914[n4] != null
					&& (cGame.var_6914[n4][12] & 0x8) != 0x0) {
				final int n5 = cGame.var_6914[n4][0] >> 16 & 0xFFFF;
				final int n6 = cGame.var_6914[n4][0] & 0xFFFF;
				if (cGame.var_68d4[cGame.var_68bc[n5][n6][5]].sub_383d(cGame.var_68bc[n5][n6][6]) > 0) {
					final int[] array3 = new int[4];
					cGame.var_68d4[cGame.var_68bc[n5][n6][5]].sub_3882(cGame.var_68bc[n5][n6][6], 0, array3, 0);
					final int n7 = cGame.var_68bc[n5][n6][2] + array3[0];
					final int n8 = cGame.var_68bc[n5][n6][3] + array3[1];
					final int n9 = array3[2];
					final int n10 = array3[3];
					final int n11 = n9;
					final int n12 = n8;
					n = n7;
					GLLib.sub_36f4(GLLib.g, n, n12, n11, n10, true);
					n = 1;
				}
			}
			sub_1e07e(s, array2[2], array2[3] + n2, array2[5], array2[6], array2[10], n3, array2[7], array2[8], true,
					false);
			if (n != 0) {
				final int var_1ddf = GLLib.s_screenWidth;
				var_1de7 = GLLib.s_screenHeight;
				GLLib.sub_36f4(GLLib.g, 0, 0, var_1ddf, var_1de7, true);
			}
		}
	}

	private static void sub_1e44e(final int n, final int n2) {
		sub_1e477(n, cGame.var_68bc[n][n2], 0, 0, n2);
	}

	private static void sub_1e477(int sub_3189, final short[] array, int n, int n2, int max) {
		final short n3 = array[5];
		final short n4 = array[6];
		final short n5 = array[7];
		n = array[17];
		final short n6 = array[10];
		n2 = -1;
		if (max > 0) {
			n2 = (sub_3189 << 16 | (max & 0xFFFF));
		}
		if (n6 != 1) {
			return;
		}
		if (n3 == -1) {
			return;
		}
		final ASprite class_e;
		if ((class_e = ((n3 < 1000) ? cGame.var_68d4[n3] : cGame.var_7ff4[n3 - 1000])) == null) {
			return;
		}
		int sub_3190 = 0;
		boolean b = false;
		boolean b2 = false;
		if (array[9] == 1) {
			if (array[8] < 0 || array[8] >= 255) {
				return;
			}
			sub_3190 = class_e.sub_6475();
			class_e.sub_6434(array[8]);
			b2 = true;
		}
		if (array[19] >= 0 && array[19] < 10 && cGame.var_6914[array[19]] != null
				&& (cGame.var_6914[array[19]][12] & 0x8) != 0x0) {
			final int n7 = cGame.var_6914[array[19]][0] >> 16 & 0xFFFF;
			final int n8 = cGame.var_6914[array[19]][0] & 0xFFFF;
			if (cGame.var_68d4[cGame.var_68c4[n7][n8][5]].sub_383d(cGame.var_68c4[n7][n8][6]) > 0) {
				final int[] array2 = new int[4];
				cGame.var_68d4[cGame.var_68c4[n7][n8][5]].sub_3882(cGame.var_68c4[n7][n8][6], 0, array2, 0);
				GLLib.sub_36f4(GLLib.g, cGame.var_68c4[n7][n8][2] + array2[0],
						cGame.var_68c4[n7][n8][3] + array2[1], array2[2], array2[3], true);
				b = true;
			}
		}
		if (n < 0) {
			if (n4 > -1 && n4 < 255) {
				if (sub_3189 == 1 && max >= 65 && max <= 70) {
					final int n9;
					int n10;
					if ((n9 = (GLLib.s_screenWidth >> 1) - array[2]) < 0) {
						n10 = n9 + 100;
					} else {
						n10 = 100 - n9;
					}
					if (n10 < 50) {
						n10 = 50;
					}
					class_e.sub_7d2b(GLLib.g, n4, array[2], array[3], n10);
				} else if (n3 == 1 && n4 == 56) {
					class_e.sub_71ae(GLLib.g, n4, array[2], array[3], 0);
					if (cGame.var_7024 > 0) {
						final int color = GLLib.g.getColor();
						sub_3189 = -1201919;
						GLLib.g.setColor(sub_3189);
						final Graphics var_1daf = GLLib.g;
						final int n11 = array[2] - 38;
						final int n12 = array[3] - 38;
						n2 = 360 * cGame.var_7024 / cGame.var_702c;
						n = n12;
						GLLib.sub_37ef(var_1daf, n11, n, 76, 76, 90, n2, true);
						sub_3189 = color;
						GLLib.g.setColor(sub_3189);
					}
				} else {
					int n13 = 0;
					if (array[18] == 1 && array[20] == 1 && n2 != -1 && cGame.var_6f84 == n2) {
						n13 = 1;
					}
					if (n13 != 0 && array[22] == 0) {
						final int sub_312c = class_e.sub_312c(n4);
						sub_3189 = class_e.sub_3189(n4);
						max = (((max = sub_312c - sub_312c * 94 / 100 >> 1) != 0) ? max : 1);
						sub_3189 = (((sub_3189 = sub_3189 - sub_3189 * 94 / 100 >> 1) != 0) ? sub_3189 : 1);
						if (array[21] != 0) {
							sub_1edd0(array, array[2] + max, array[3] + sub_3189, 94);
						} else {
							class_e.sub_7d2b(GLLib.g, n4, array[2] + max, array[3] + sub_3189, 94);
						}
					} else if (array[21] != 0) {
						sub_1edd0(array, array[2], array[3], 100);
					} else if (array[22] != 0) {
						final short n14 = array[2];
						final int n15 = array[3];
						n2 = n13;
						n = n15;
						final short n16 = n14;
						max = array[5];
						final short n17 = array[6];
						sub_3189 = array[22];
						if (cGame.var_6fa4 == 2 && max > 1000 && (max - 1000 == 50 || max - 1000 == 51)) {
							sub_3189 = 100;
						}
						final ASprite class_e2 = (max < 1000) ? cGame.var_68d4[max] : cGame.var_7ff4[max - 1000];
						if (cGame.var_6fa4 == 2 && max > 1000
								&& (cGame.var_722c == 1 || cGame.var_722c == 2 || cGame.var_722c == 4)) {
							if (cGame.var_722c == 1) {
								sub_3189 = 100;
							} else if (cGame.var_722c == 2) {
								sub_3189 = 50;
							} else {
								sub_3189 = 90;
							}
							class_e2.sub_7d2b(GLLib.g, n17, n16, n, sub_3189);
						} else if ((max = Math.max(class_e2.sub_312c(n17), class_e2.sub_3189(n17))) < sub_3189) {
							if (n2 == 0) {
								class_e2.sub_71ae(GLLib.g, n17, n16, n, 0);
							} else {
								class_e2.sub_7d2b(GLLib.g, n17, n16, n, 94);
							}
						} else {
							sub_3189 = sub_3189 * 100 / max;
							if (n2 == 0) {
								class_e2.sub_7d2b(GLLib.g, n17, n16, n, sub_3189);
							} else {
								class_e2.sub_7d2b(GLLib.g, n17, n16, n, sub_3189 * 94 / 100);
							}
						}
					} else {
						class_e.sub_71ae(GLLib.g, n4, array[2], array[3], 0);
					}
				}
			}
		} else if (cGame.var_68ec[n] != null) {
			if (n3 == 32) {
				if (n5 == 3) {
					cGame.var_68f4[0].SetPos(array[2], array[3]);
				} else if (n5 == 4) {
					cGame.var_68f4[1].SetPos(array[2], array[3]);
				} else if (n5 == 5) {
					cGame.var_68f4[2].SetPos(array[2], array[3]);
				}
			} else {
				cGame.var_68ec[n].SetPos(array[2], array[3]);
				cGame.var_68ec[n].sub_1b7f();
			}
		}
		if (b2) {
			class_e.sub_6434(sub_3190);
		}
		if (b) {
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			sub_3189 = var_1ddf;
			final Graphics var_1daf2 = GLLib.g;
			final int n18 = sub_3189;
			n = var_1de7;
			GLLib.sub_36f4(var_1daf2, 0, 0, n18, n, true);
		}
	}

	private static int sub_1ed28(final int n, final int n2) {
		final ASprite class_e = cGame.var_68d4[n];
		int n3 = Integer.MIN_VALUE;
		final short n4 = class_e.var_faf[n2];
		final int sub_6494 = class_e.sub_6494(n2);
		for (short n5 = 0; n5 < sub_6494; ++n5) {
			final int sub_310b = class_e.sub_310b(n4 + n5);
			final int n6 = class_e.var_f87[class_e.sub_32e3(n2, n5)] & 0xFFFF;
			if (n3 < sub_310b + n6) {
				n3 = sub_310b + n6;
			}
		}
		return n3;
	}

	private static void sub_1edd0(short[] array, final int n, final int n2, final int n3) {
		final short n4 = array[5];
		final short n5 = array[6];
		if (cGame.var_68dc[n5] == null) {
			final short n6 = array[5];
			final short n7 = array[6];
			final ASprite class_e = cGame.var_68d4[n6];
			int n8 = Integer.MIN_VALUE;
			int n9 = Integer.MIN_VALUE;
			int n10 = 0;
			int n11 = 0;
			final short n12 = class_e.var_faf[n7];
			final int sub_6494 = class_e.sub_6494(n7);
			for (short n13 = 0; n13 < sub_6494; ++n13) {
				final int sub_30ea = class_e.sub_30ea(n12 + n13);
				final int sub_310b = class_e.sub_310b(n12 + n13);
				n10 = (class_e.var_f7f[class_e.sub_32e3(n7, n13)] & 0xFFFF);
				n11 = (class_e.var_f87[class_e.sub_32e3(n7, n13)] & 0xFFFF);
				if (n8 < sub_30ea + n10) {
					n8 = sub_30ea + n10;
				}
				if (n9 < sub_310b + n11) {
					n9 = sub_310b + n11;
				}
			}
			final int n14 = n9;
			final int n15 = n8;
			final int[] array2 = new int[n14 * n15];
			int n16 = 0;
			if (array[21] == 1) {
				n16 = sub_6494 - 1;
			} else if (array[21] == 2) {
				n16 = 4;
			}
			for (short n17 = 0; n17 < n16; ++n17) {
				n10 = (class_e.var_f87[class_e.sub_32e3(n7, n17)] & 0xFFFF);
				n11 = (class_e.var_f7f[class_e.sub_32e3(n7, n17)] & 0xFFFF);
				final int n18 = n14 - class_e.sub_310b(n12 + n17) - n10;
				final int sub_30ea2 = class_e.sub_30ea(n12 + n17);
				final int sub_332f = class_e.sub_332f(n7, n17);
				int[] array3 = new int[n10 * n11];
				if (class_e.var_105f != null) {
					array3 = (int[]) class_e.sub_3fdb(class_e.sub_32e3(n7, n17));
				} else {
					class_e.var_10d7[0][class_e.sub_32e3(n7, n17)].getRGB(array3, 0, n10, 0, 0, n10, n11);
				}
				for (int i = 0; i < n11; ++i) {
					for (int j = 0; j < n10; ++j) {
						int n19 = j;
						int n20 = i;
						if ((sub_332f & 0x2) != 0x0) {
							n19 = n10 - j - 1;
						}
						if ((sub_332f & 0x1) != 0x0) {
							n20 = n11 - i - 1;
						}
						if (n18 + j + (sub_30ea2 + i) * n14 < n14 * n15 && n19 + n20 * n10 < n11 * n10) {
							array2[n18 + j + (sub_30ea2 + i) * n14] = array3[n19 + n20 * n10];
						}
					}
				}
			}
			for (short n21 = (short) n16; n21 < sub_6494; ++n21) {
				final int sub_30ea3 = class_e.sub_30ea(n12 + n21);
				final int sub_310b2 = class_e.sub_310b(n12 + n21);
				final int n22 = class_e.var_f7f[class_e.sub_32e3(n7, n21)] & 0xFFFF;
				final int n23 = class_e.var_f87[class_e.sub_32e3(n7, n21)] & 0xFFFF;
				final int sub_332f2 = class_e.sub_332f(n7, n21);
				int n24;
				if (n22 == 1) {
					if (sub_30ea3 < n8 >> 1) {
						n24 = n8 - (sub_30ea3 << 1);
					} else {
						n24 = n10;
					}
				} else {
					n24 = n22;
				}
				int n25;
				if (n23 == 1) {
					if (sub_310b2 < n9 >> 1) {
						n25 = n9 - (sub_310b2 << 1);
					} else {
						n25 = n11;
					}
				} else {
					n25 = n23;
				}
				final int n26 = n24 ^ n25;
				final int n27 = n25 ^ n26;
				final int n28 = n26 ^ n27;
				final int n29 = class_e.var_f87[class_e.sub_32e3(n7, n21)] & 0xFFFF;
				final int n30 = class_e.var_f7f[class_e.sub_32e3(n7, n21)] & 0xFFFF;
				final int n31 = n14 - class_e.sub_310b(n12 + n21) - n28;
				final int sub_30ea4 = class_e.sub_30ea(n12 + n21);
				int[] array4 = new int[n29 * n30];
				if (class_e.var_105f != null) {
					array4 = (int[]) class_e.sub_3fdb(class_e.sub_32e3(n7, n21));
				} else {
					class_e.var_10d7[0][class_e.sub_32e3(n7, n21)].getRGB(array4, 0, n29, 0, 0, n29, n30);
				}
				for (int k = 0; k < n27; ++k) {
					for (int l = 0; l < n28; ++l) {
						int n32 = l;
						int n33 = k;
						if (n29 == 1) {
							n32 = 0;
						} else if ((sub_332f2 & 0x2) != 0x0) {
							n32 = n29 - n32 - 1;
						}
						if (n30 == 1) {
							n33 = 0;
						} else if ((sub_332f2 & 0x1) != 0x0) {
							n33 = n30 - n33 - 1;
						}
						if (n31 + l + (sub_30ea4 + k) * n14 < n14 * n15 && n32 + n33 * n29 < n30 * n29) {
							array2[n31 + l + (sub_30ea4 + k) * n14] = array4[n32 + n33 * n29];
						}
					}
				}
			}
			cGame.var_68dc[n7] = GLLibImage.createRGBImage(array2, n14, n15, true);
		}
		if (cGame.var_68dc[n5] != null) {
			final byte[] var_68e4 = cGame.var_68e4;
			final short n34 = n5;
			var_68e4[n34] |= 0x1;
			if (n3 != 100) {
				GLLib.sub_5b71();
				GLLib.sub_5c41(n3);
				GLLib.sub_38df(GLLib.g, cGame.var_68dc[n5], GLLib.s_screenHeight - n2 - sub_1ed28(n4, n5), n,
						20, false);
				GLLib.sub_5b96();
				return;
			}
			GLLib.sub_38df(GLLib.g, cGame.var_68dc[n5], GLLib.s_screenHeight - n2 - sub_1ed28(n4, n5), n, 20,
					false);
		}
	}

	private static void sub_1f7a3(int n, int n2, int sub_30ea, final int n3) {
		n = cGame.var_68bc[1][n2][5];
		n2 = cGame.var_68bc[1][n2][6];
		sub_30ea = cGame.var_68bc[1][sub_30ea][6];
		final ASprite class_e = (n < 1000) ? cGame.var_68d4[n] : cGame.var_7ff4[n - 1000];
		int n4 = Integer.MIN_VALUE;
		final short n5 = class_e.var_faf[sub_30ea];
		final int sub_6494 = class_e.sub_6494(sub_30ea);
		final short n6 = class_e.var_faf[n2];
		final int sub_6495 = class_e.sub_6494(n2);
		for (short n7 = 0; n7 < sub_6494; ++n7) {
			sub_30ea = class_e.sub_30ea(n5 + n7);
			if (n4 < sub_30ea) {
				n4 = sub_30ea;
			}
		}
		if (sub_6495 >= 2) {
			class_e.sub_3aab(n6 + sub_6495 - 2, n4 * n3 / 100);
		}
		cGame.var_68dc[n2] = null;
	}

	private static void sub_1f8c5(final int var_6fa4) {
		cGame.var_6fa4 = var_6fa4;
		for (int i = 0; i < cGame.var_68bc[var_6fa4].length; ++i) {
			if (cGame.var_68bc[var_6fa4][i][0] == 205 && cGame.var_68bc[var_6fa4][i][5] > -1
					&& cGame.var_68bc[var_6fa4][i][18] == 1 && cGame.var_68bc[var_6fa4][i][10] == 1) {
				final short n = cGame.var_68bc[var_6fa4][i][5];
				final short n2 = cGame.var_68bc[var_6fa4][i][6];
				final ASprite class_e = (n < 1000) ? cGame.var_68d4[n] : cGame.var_7ff4[n - 1000];
				short n3 = cGame.var_68bc[var_6fa4][i][2];
				short n4 = cGame.var_68bc[var_6fa4][i][3];
				if (var_6fa4 == 2) {
					n3 = cGame.var_68c4[var_6fa4][i][2];
					n4 = cGame.var_68c4[var_6fa4][i][3];
				}
				if (class_e == null) {
					break;
				}
				final int sub_383d;
				if ((sub_383d = class_e.sub_383d(n2)) > 0) {
					final int[] array = new int[4];
					int j = 0;
					Label_0190: while (j < sub_383d) {
						class_e.sub_3882(n2, j, array, 0);
						final int n5 = var_6fa4 << 16 | (i & 0xFFFF);
						final int n6 = n3 + array[0];
						final int n7 = n4 + array[1];
						final int n8 = array[2];
						final int n9 = array[3];
						final int n10 = n8;
						final int n11 = n7;
						final int n12 = n6;
						final int n13 = n5;
						final int[] array2;
						(array2 = new int[8])[0] = n12;
						array2[1] = n11;
						array2[2] = n10;
						array2[3] = n9;
						array2[4] = 0;
						array2[5] = n13;
						array2[7] = (array2[6] = 0);
						while (true) {
							for (int k = 0; k < cGame.var_6f74.length - 2; ++k) {
								if (cGame.var_6f74[k][4] == -1 && cGame.var_6f74[k][5] == -1) {
									final int n15;
									final int n14 = n15 = k;
									final int n16 = n15;
									if (n14 > -1) {
										cGame.var_6f74[n16] = array2;
									}
									++j;
									continue Label_0190;
								}
							}
							int n15;
							final int n14 = n15 = -1;
							continue;
						}
					}
				}
				for (int l = 0; l < cGame.var_6fb4.length; ++l) {
					if (cGame.var_6fb4[l] == -1) {
						cGame.var_6fb4[l] = i;
						break;
					}
				}
			}
		}
	}

	private static void sub_1fb8e(int n) {
		sub_1f8c5(cGame.var_6fa4 = n);
		n = (cGame.var_6fa4 = n);
		for (int i = 0; i < 10; ++i) {
			if (cGame.var_6914[i] != null) {
				final int n2 = cGame.var_6914[i][0] & 0xFFFF;
				final int n3 = cGame.var_6914[i][1] & 0xFFFF;
				final int n4 = cGame.var_6914[i][1] >> 16 & 0xFFFF;
				for (int j = n2 + 1; j <= n3; ++j) {
					cGame.var_68bc[n4][j][2] = cGame.var_68c4[n4][j][2];
					cGame.var_68bc[n4][j][3] = cGame.var_68c4[n4][j][3];
				}
				cGame.var_6914[i] = null;
			}
		}
		for (int k = 0; k < cGame.var_68bc[n].length; ++k) {
			int n5 = -1;
			if (cGame.var_68bc[n][k][0] == 205) {
				n5 = cGame.var_68bc[n][k][19];
			} else if (cGame.var_68bc[n][k][0] == 204) {
				n5 = cGame.var_68bc[n][k][16];
			}
			if (n5 >= 0 && n5 < 10) {
				if (cGame.var_6914[n5] == null) {
					(cGame.var_6914[n5] = new int[13])[0] = (n << 16 | (k & 0xFFFF));
					cGame.var_6914[n5][1] = (n << 16 | (k & 0xFFFF));
					cGame.var_6914[n5][2] = -1;
					cGame.var_6914[n5][3] = -1;
					cGame.var_6914[n5][4] = Integer.MAX_VALUE;
					cGame.var_6914[n5][5] = Integer.MAX_VALUE;
					cGame.var_6914[n5][6] = Integer.MIN_VALUE;
					cGame.var_6914[n5][7] = Integer.MIN_VALUE;
					cGame.var_6914[n5][8] = 0;
					cGame.var_6914[n5][9] = 0;
					cGame.var_6914[n5][10] = 0;
					cGame.var_6914[n5][11] = 0;
					cGame.var_6914[n5][12] = 8;
				} else {
					cGame.var_6914[n5][1] = (n << 16 | (k & 0xFFFF));
					if (sub_20167(n, k)) {
						int sub_31e6 = 0;
						int sub_3238 = 0;
						int sub_312c = 0;
						int sub_3239 = 0;
						if (cGame.var_68bc[n][k][0] == 205) {
							final short n6 = cGame.var_68bc[n][k][5];
							final short n7 = cGame.var_68bc[n][k][6];
							final short n8;
							final ASprite class_e;
							if ((class_e = (((n8 = n6) < 1000) ? cGame.var_68d4[n8]
									: cGame.var_7ff4[n8 - 1000])) == null || cGame.var_68bc[n][k][6] < 0) {
								continue;
							}
							sub_31e6 = class_e.sub_31e6(n7);
							sub_3238 = class_e.sub_3238(n7);
							sub_312c = class_e.sub_312c(n7);
							sub_3239 = class_e.sub_3189(n7);
							if (cGame.var_68bc[n][k][22] != 0) {
								if (sub_312c > cGame.var_68bc[n][k][22]) {
									sub_31e6 += sub_312c - cGame.var_68bc[n][k][22] >> 1;
									sub_312c = cGame.var_68bc[n][k][22];
								}
								if (sub_3239 > cGame.var_68bc[n][k][22]) {
									sub_3238 += sub_3239 - cGame.var_68bc[n][k][22] >> 1;
									sub_3239 = cGame.var_68bc[n][k][22];
								}
							}
						} else if (cGame.var_68bc[n][k][0] == 204) {
							sub_312c = cGame.var_68bc[n][k][5];
							sub_3239 = cGame.var_68bc[n][k][6];
						}
						if (cGame.var_6914[n5][4] > cGame.var_68bc[n][k][2] + sub_31e6) {
							cGame.var_6914[n5][4] = cGame.var_68bc[n][k][2] + sub_31e6;
						}
						if (cGame.var_6914[n5][6] < cGame.var_68bc[n][k][2] + sub_31e6 + sub_312c) {
							cGame.var_6914[n5][6] = cGame.var_68bc[n][k][2] + sub_31e6 + sub_312c + 10;
						}
						if (cGame.var_6914[n5][5] > cGame.var_68bc[n][k][3] + sub_3238) {
							cGame.var_6914[n5][5] = cGame.var_68bc[n][k][3] + sub_3238;
						}
						if (cGame.var_6914[n5][7] < cGame.var_68bc[n][k][3] + sub_3238 + sub_3239) {
							cGame.var_6914[n5][7] = cGame.var_68bc[n][k][3] + sub_3238 + sub_3239 + 10;
						}
					}
				}
			}
		}
	}

	private static void sub_1ffee() {
		sub_2c69b();
	}

	private static void sub_2000c(final int n, final int n2, final boolean b) {
		if (cGame.var_68bc[n][n2][0] == 205) {
			cGame.var_68bc[n][n2][10] = (short) (b ? 1 : 0);
			if (b && cGame.var_68bc[n][n2][7] > -1 && cGame.var_68bc[n][n2][7] < 30) {
				sub_2386a(n, n2, cGame.var_68bc[n][n2][7], -1);
				return;
			}
			if (!b && cGame.var_68bc[n][n2][17] > -1 && cGame.var_68bc[n][n2][17] < 30) {
				sub_2393e(n, n2);
			}
		} else {
			if (cGame.var_68bc[n][n2][0] == 204) {
				cGame.var_68bc[n][n2][15] = (short) (b ? 1 : 0);
				return;
			}
			if (cGame.var_68bc[n][n2][0] == 202) {
				cGame.var_68bc[n][n2][11] = (short) (b ? 1 : 0);
			}
		}
	}

	private static boolean sub_20167(final int n, final int n2) {
		boolean b = false;
		if (cGame.var_68bc[n][n2][0] == 205) {
			b = (cGame.var_68bc[n][n2][10] != 0);
		} else if (cGame.var_68bc[n][n2][0] == 204) {
			b = (cGame.var_68bc[n][n2][15] != 0);
		} else if (cGame.var_68bc[n][n2][0] == 202) {
			b = (cGame.var_68bc[n][n2][11] != 0);
		}
		return b;
	}

	private static void sub_2024d(final int n, final int n2, final boolean b) {
		if (cGame.var_68bc[n][n2][0] == 205) {
			cGame.var_68bc[n][n2][18] = (short) (b ? 1 : 0);
		}
	}

	private static boolean sub_202b7(final int n, final int n2) {
		return cGame.var_68bc[n][n2][0] == 205 && cGame.var_68bc[n][n2][18] != 0;
	}

	private static void switchStatementHell(int n) {
		Label_7332: {
			switch (n >> 16 & 0xFFFF) {
			case 0: {
				return;
			}
			case 1: {
				switch (n) {
				case 65580: {
					if (cGame.var_7fd4 != 13) {
						if (cGame.var_7fd4 == 10) {
							cGame.var_6c94 = true;
						}
						if (cGame.var_7fd4 != 11 || !sub_20167(1, 38)) {
							if (!sub_20167(1, 38)) {
								sub_23a84(59);
							} else {
								sub_23a84(57);
							}
							sub_251a0(-1);
							sub_117fc();
							sub_10947(!sub_20167(1, 38));
							sub_26a6a(false, cGame.var_7f6c, '\0');
						}
					}
					return;
				}
				case 65575: {
					cGame.var_7f6c = 0;
					sub_48d55();
					if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
						cGame.var_7b0c = 26;
					} else {
						sub_23a84(60);
						sub_81e0(26);
					}
					sub_10947(false);
					return;
				}
				case 65576: {
					cGame.var_7f6c = 1;
					sub_48d55();
					if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
						cGame.var_7b0c = 26;
					} else {
						sub_23a84(60);
						sub_81e0(26);
					}
					sub_10947(false);
					return;
				}
				case 65577: {
					cGame.var_7f6c = 2;
					sub_48d55();
					if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
						cGame.var_7b0c = 26;
					} else {
						sub_23a84(60);
						sub_81e0(26);
					}
					sub_10947(false);
					return;
				}
				case 65578: {
					cGame.var_7f6c = 3;
					sub_48d55();
					if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
						cGame.var_7b0c = 26;
					} else {
						sub_23a84(60);
						sub_81e0(26);
					}
					sub_10947(false);
					return;
				}
				case 65595: {
					sub_23a84(60);
					sub_3282d(2, 0, true);
					if (cGame.var_7fd4 == 40) {
						cGame.var_6c94 = true;
						return;
					}
					if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 13) {
						cGame.var_6c94 = true;
					}
					return;
				}
				case 65594: {
					sub_23a84(61);
					if (cGame.var_7fc4 == 100) {
						n = 50;
					} else {
						n = 100;
					}
					Class_f.sub_6b3b(n);
					if (n == 100) {
						cGame.var_68bc[1][58][6] = 66;
						return;
					}
					cGame.var_68bc[1][58][6] = 8;
					return;
				}
				case 65573: {
					sub_10922();
					return;
				}
				case 65596: {
					if (cGame.var_6c64 == 1 || cGame.var_6c64 == 2) {
						sub_23a84(56);
						return;
					}
					sub_81e0(38);
					sub_23a84(61);
					sub_10cd1(false);
					return;
				}
				case 65598: {
					if (!sub_2cad2(cGame.var_6aac)) {
						if (cGame.var_6aa4 == 0) {
							sub_24b52();
							sub_25043(false);
							sub_10dd3(false);
							sub_10cd1(true);
							cGame.var_6aa4 = -1;
						} else if (cGame.var_6aa4 == 1 && cGame.var_6aac != null) {
							switch (cGame.var_6aac.var_17c5) {
							case 49: {
								if (cGame.var_6aac.var_1835 == 0
										&& ((cGame.var_708c > 0 && sub_2e3a5(cGame.var_708c))
												|| (cGame.var_7094 > 0 && sub_2e3d9(cGame.var_7094)))) {
									cGame.var_6aac.sub_7795(8);
									sub_2ec47(5, cGame.var_6aac);
									sub_24b52();
									break;
								}
								if ((cGame.var_6b24 > 0 && sub_2e3a5(cGame.var_6b24))
										|| (cGame.var_6b2c > 0 && sub_2e3d9(cGame.var_6b2c))) {
									cGame.var_6aac.sub_7795(8);
									sub_2ec47(5, cGame.var_6aac);
									sub_24b52();
									break;
								}
								sub_1179d(false);
								cGame.var_7aac = -1;
								if (cGame.var_708c > 0) {
									final String sub_4e1f;
									cGame.var_7ab4 = GLLib.sub_547c(
											((sub_4e1f = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f, "%d",
											GLLib.CurrencySeparator_just_a_guess(cGame.var_708c - sub_2e0da(), cGame.var_7fe4, " "));
									cGame.var_7aac = 18;
									cGame.var_7d24 = false;
									cGame.var_815c = true;
								} else if (cGame.var_7094 > 0) {
									final String sub_4e1f2;
									cGame.var_7ab4 = GLLib.sub_547c(
											((sub_4e1f2 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f2, "%d",
											GLLib.CurrencySeparator_just_a_guess(cGame.var_7094 - getCash(), cGame.var_7fe4, " "));
									cGame.var_7aac = 19;
									cGame.var_7d24 = true;
									cGame.var_815c = true;
								}
								if (cGame.var_7aac != -1) {
									sub_81e0(34);
									break;
								}
								break;
							}
							case 20: {
								if ((cGame.var_708c > 0 && sub_2e3a5(cGame.var_708c))
										|| (cGame.var_7094 > 0 && sub_2e3d9(cGame.var_7094))) {
									sub_24b52();
									break;
								}
								sub_1179d(false);
								cGame.var_7aac = -1;
								if (cGame.var_708c > 0) {
									final String sub_4e1f3;
									cGame.var_7ab4 = GLLib.sub_547c(
											((sub_4e1f3 = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f3, "%d",
											GLLib.CurrencySeparator_just_a_guess(cGame.var_708c - sub_2e0da(), cGame.var_7fe4, " "));
									cGame.var_7aac = 18;
									cGame.var_7d24 = false;
									cGame.var_815c = true;
								} else if (cGame.var_7094 > 0) {
									final String sub_4e1f4;
									cGame.var_7ab4 = GLLib.sub_547c(
											((sub_4e1f4 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f4, "%d",
											GLLib.CurrencySeparator_just_a_guess(cGame.var_7094 - getCash(), cGame.var_7fe4, " "));
									cGame.var_7aac = 19;
									cGame.var_7d24 = true;
									cGame.var_815c = true;
								}
								if (cGame.var_7aac != -1) {
									sub_81e0(34);
									break;
								}
								break;
							}
							}
						} else if (cGame.var_6aa4 == 4 && cGame.var_6aac != null) {
							if (cGame.var_7fd4 == 52) {
								cGame.var_6c94 = true;
							}
							sub_24b52();
							sub_1179d(false);
						} else {
							sub_24b52();
							sub_25043(false);
							sub_10dd3(false);
						}
						sub_11737();
					}
					return;
				}
				case 65599: {
					sub_23a84(57);
					sub_117fc();
					return;
				}
				case 65547: {
					sub_23a84(60);
					if (getLevel() >= 3) {
						sub_23a84(60);
						cGame.var_7d24 = false;
						sub_81e0(34);
						return;
					}
					sub_23a84(56);
					return;
				}
				case 65550: {
					if (cGame.s_iapEnabled) {
						if (getLevel() >= 3) {
							sub_23a84(60);
							cGame.var_7d24 = true;
							sub_81e0(34);
							return;
						}
						sub_23a84(56);
					}
					return;
				}
				case 65601: {
					if (cGame.var_68bc[1][65][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[0];
					return;
				}
				case 65602: {
					if (cGame.var_68bc[1][66][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + 1 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[1];
					return;
				}
				case 65603: {
					if (cGame.var_68bc[1][67][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + 2 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[2];
					return;
				}
				case 65604: {
					if (cGame.var_68bc[1][68][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + 3 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[3];
					return;
				}
				case 65605: {
					if (cGame.var_68bc[1][69][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + 4 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[4];
					return;
				}
				case 65606: {
					if (cGame.var_68bc[1][70][5] == 20) {
						sub_23a84(56);
					} else {
						sub_23a84(61);
					}
					if (cGame.var_6b94 == 0) {
						if (cGame.var_7fd4 == 45) {
							cGame.var_6b04 = 1;
						} else {
							cGame.var_6b04 = (cGame.var_6b64 + 5 + cGame.var_6b8c) % cGame.var_6b8c;
						}
						sub_25213(cGame.var_6b84[cGame.var_6b04]);
						return;
					}
					cGame.var_6af4 = cGame.var_6b84[5];
					return;
				}
				case 65581: {
					sub_23a84(61);
					if (cGame.var_6bcc == '\u0001') {
						sub_48d55();
						cGame.var_7b0c = 26;
					} else {
						sub_81e0(26);
					}
					sub_26a6a(false, cGame.var_7f6c, '\0');
					return;
				}
				case 65539: {
					if (cGame.var_8034 != null) {
						n = 0;
						switch (cGame.var_8034.var_17c5) {
						case 49:
						case 50:
						case 52:
						case 54: {
							n = cGame.var_8034.var_18cd;
							break;
						}
						}
						if (!sub_2e449(n)) {
							sub_23a84(56);
							if (n > 0) {
								final String sub_4e1f5;
								cGame.var_7ab4 = GLLib.sub_547c(
										((sub_4e1f5 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f5, "%d",
										GLLib.CurrencySeparator_just_a_guess(n - getCash(), cGame.var_7fe4, " "));
								cGame.var_7aac = 19;
								cGame.var_7d24 = true;
								cGame.var_815c = true;
								sub_81e0(34);
							}
						} else {
							sub_23a84(49);
							cGame.var_8034.sub_a2da();
							if (cGame.var_7fd4 == 18) {
								sub_28ca1();
							}
						}
					}
					sub_11320(false, null);
					return;
				}
				case 65569: {
					if (sndPlayingOnChannel(0)) {
						sub_23d73();
					}
					if (Class_f.sub_5a6e(2) == 0) {
						sub_23a84(61);
						sub_8281(17);
						cGame.var_8084 = 0;
						if (cGame.var_6c5c == 169) {
							cGame.var_6c94 = true;
						}
					} else {
						sub_23a84(56);
					}
					return;
				}
				case 65564: {
					boolean b;
					if (cGame.var_7024 >= cGame.var_702c) {
						cGame.var_7024 = 0;
						cGame.var_68bc[1][29][7] = -1;
						sub_2393e(1, 29);
						b = true;
					} else {
						b = false;
					}
					if (b) {
						sub_2f41f(19);
					}
					return;
				}
				case 65610: {
					n = Class_f.sub_4cf5(0, 49);
					if (cGame.var_6aac.var_1835 == 0 && n <= cGame.var_8064[22]) {
						sub_4052e(485, 486, 7, 0);
					} else {
						final String sub_4e1f6;
						final String s = ((sub_4e1f6 = GLLib.TODO_sub_4e1f(441)) == null) ? "" : sub_4e1f6;
						final String sub_4e1f7;
						final String s2 = ((sub_4e1f7 = GLLib.TODO_sub_4e1f(442)) == null) ? "" : sub_4e1f7;
						final Class_f var_6aac = cGame.var_6aac;
						final String var_7acc = s2;
						final String var_7ac4 = s;
						cGame.var_7b24 = 2;
						cGame.var_7b14 = var_6aac;
						sub_2000c(4, 5, true);
						sub_2000c(4, 6, true);
						sub_2000c(4, 7, true);
						sub_4019a(7, 0, 10);
						cGame.var_7ac4 = var_7ac4;
						cGame.var_7acc = var_7acc;
						cGame.var_7b1c = GLLib.CurrencySeparator_just_a_guess(cGame.var_7b14.sub_a709(), cGame.var_7fe4, " ");
						sub_2000c(4, 13, true);
						sub_2000c(4, 15, true);
						sub_2000c(4, 16, true);
						sub_81e0(19);
						if (cGame.var_6aac != null && cGame.var_6aac.var_17c5 == 54) {
							cGame.var_6aac.sub_867b();
						}
					}
					sub_117fc();
					return;
				}
				case 65611: {
					if (sub_2dcf3(5) + Class_f.sub_59d2(2) >= sub_2df26()) {
						sub_40658(471, 477);
						break Label_7332;
					}
					sub_23a84(50);
					if (cGame.var_6aac != null && cGame.var_6aac.var_17c5 == 54) {
						cGame.var_6aac.sub_867b();
					}
					n = cGame.var_6aac.var_18c5;
					sub_2ddd7(cGame.var_6aac);
					if (n < cGame.var_80a4[0] || n > cGame.var_80a4[63] || n % 2 == 1) {
						sub_2c0fa(true);
						sub_4ad3f(n);
					}
					sub_1179d(false);
					return;
				}
				case 65612: {
					sub_23a84(57);
					sub_1179d(false);
					return;
				}
				case 65613: {
					sub_23a84(57);
					sub_1179d(false);
					return;
				}
				case 65614: {
					if (cGame.var_808c > 1) {
						sub_23a84(57);
						sub_3d6da(false, -1);
						sub_81e0(31);
						return;
					}
					sub_23a84(56);
					return;
				}
				case 65623: {
					sub_23a84(57);
					if (sub_4abbb(cGame.var_80f4[5])) {
						sub_3e7c1();
						sub_81e0(32);
					}
					return;
				}
				case 65628: {
					sub_23a84(57);
					return;
				}
				case 65630: {
					sub_23a84(61);
					break;
				}
				}
				return;
			}
			case 2: {
				switch (n) {
				case 131185: {
					sub_118ee();
					return;
				}
				case 131076: {
					if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
						cGame.var_7d24 = false;
						sub_81e0(34);
					}
					return;
				}
				case 131080: {
					if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
						cGame.var_7d24 = true;
						sub_81e0(34);
					}
					return;
				}
				case 131100: {
					sub_11915();
					return;
				}
				case 131114: {
					if (cGame.var_722c == 1 && cGame.var_721c == 0 && cGame.var_7224 == -1) {
						sub_23a84(61);
						sub_3151e(0, 1);
						break Label_7332;
					}
					sub_3225a(1);
					return;
				}
				case 131128: {
					sub_119a4();
					return;
				}
				case 131142: {
					sub_119f0();
					return;
				}
				case 131156: {
					sub_11a3c();
					return;
				}
				case 131170: {
					sub_11a88();
					return;
				}
				case 131113: {
					sub_23a84(61);
					sub_32132(0);
					return;
				}
				case 131127: {
					sub_23a84(61);
					sub_32132(1);
					return;
				}
				case 131141: {
					sub_23a84(61);
					sub_32132(2);
					return;
				}
				case 131155: {
					sub_11ad4();
					return;
				}
				case 131169: {
					sub_11af8();
					return;
				}
				case 131183: {
					sub_11b1c();
					return;
				}
				case 131082: {
					sub_11b40();
					return;
				}
				case 131083: {
					sub_11b96();
					return;
				}
				case 131084: {
					sub_11bd5();
					return;
				}
				case 131085: {
					sub_11c2b();
					return;
				}
				case 131086: {
					sub_11c81();
					break;
				}
				}
				return;
			}
			case 3: {
				switch (n) {
				case 196813: {
					sub_11d30();
					return;
				}
				case 196618: {
					sub_11fc4();
					return;
				}
				case 196629: {
					sub_11fe8();
					return;
				}
				case 196640: {
					sub_1200c();
					return;
				}
				case 196651: {
					sub_12030();
					return;
				}
				case 196662: {
					sub_12054();
					return;
				}
				case 196673: {
					sub_12078();
					return;
				}
				case 196684: {
					sub_1209c();
					return;
				}
				case 196695: {
					sub_120c1();
					return;
				}
				case 196706: {
					sub_120e6();
					return;
				}
				case 196717: {
					sub_1210b();
					return;
				}
				case 196728: {
					sub_12130();
					return;
				}
				case 196739: {
					sub_12155();
					return;
				}
				case 196750: {
					sub_1217a();
					return;
				}
				case 196761: {
					sub_1219f();
					return;
				}
				case 196772: {
					sub_121c4();
					return;
				}
				case 196807: {
					sub_12354();
					return;
				}
				case 196809: {
					sub_12471();
					return;
				}
				case 196806: {
					sub_12537();
					return;
				}
				case 196609: {
					sub_11d57();
					return;
				}
				case 196612: {
					sub_11d90();
					return;
				}
				case 196803: {
					sub_121e9();
					return;
				}
				case 196804: {
					sub_122a5();
					break;
				}
				}
				return;
			}
			case 4: {
				switch (n) {
				case 262159: {
					sub_12578();
					return;
				}
				case 262160: {
					sub_12624();
					return;
				}
				case 262174: {
					sub_1268e();
					return;
				}
				case 262155: {
					sub_126b4();
					return;
				}
				case 262148: {
					sub_126b4();
					break;
				}
				}
				return;
			}
			case 5: {
				switch (n) {
				case 327737: {
					sub_129f9();
					return;
				}
				case 327690: {
					sub_12ac0();
					return;
				}
				case 327698: {
					sub_12b8a();
					return;
				}
				case 327706: {
					sub_12c54();
					return;
				}
				case 327733: {
					sub_12d1e();
					return;
				}
				case 327685: {
					sub_12f43();
					return;
				}
				case 327693: {
					sub_12f77();
					return;
				}
				case 327701: {
					sub_12fab();
					break;
				}
				}
				return;
			}
			case 6: {
				switch (n) {
				case 393247: {
					sub_14108();
					return;
				}
				case 393242: {
					sub_14151();
					return;
				}
				case 393223: {
					sub_142d1();
					return;
				}
				case 393228: {
					sub_143b2();
					return;
				}
				case 393249: {
					sub_14493();
					break;
				}
				}
				return;
			}
			case 7: {
				switch (n) {
				case 458794: {
					sub_144e1();
					return;
				}
				case 458791: {
					sub_14547();
					return;
				}
				case 458787: {
					sub_14592();
					return;
				}
				case 458769: {
					sub_14710();
					return;
				}
				case 458759: {
					sub_14750();
					return;
				}
				case 458764: {
					sub_14831();
					return;
				}
				case 458776: {
					sub_1497a(cGame.var_73d4);
					return;
				}
				case 458777: {
					sub_1497a(cGame.var_73dc);
					return;
				}
				case 458799: {
					sub_14912();
					break;
				}
				}
				return;
			}
			case 22: {
				switch (n) {
				case 1441879: {
					sub_14a74();
					return;
				}
				case 1441809: {
					sub_14e7b();
					return;
				}
				case 1441824: {
					sub_14ede();
					return;
				}
				case 1441839: {
					sub_14f45();
					return;
				}
				case 1441854: {
					sub_14fac();
					return;
				}
				case 1441869: {
					sub_15013();
					return;
				}
				case 1441806: {
					sub_153fa();
					return;
				}
				case 1441821: {
					sub_15471();
					return;
				}
				case 1441836: {
					sub_154cb();
					return;
				}
				case 1441851: {
					sub_15525();
					return;
				}
				case 1441866: {
					sub_1557f();
					return;
				}
				case 1441812: {
					sub_15738();
					return;
				}
				case 1441827: {
					sub_15738();
					return;
				}
				case 1441842: {
					sub_15738();
					return;
				}
				case 1441857: {
					sub_15738();
					return;
				}
				case 1441872: {
					sub_15738();
					return;
				}
				case 1441815: {
					sub_155d9();
					return;
				}
				case 1441830: {
					sub_1561c();
					return;
				}
				case 1441845: {
					sub_15663();
					return;
				}
				case 1441860: {
					sub_156aa();
					return;
				}
				case 1441875: {
					sub_156f1();
					return;
				}
				case 1441888: {
					sub_158b3();
					return;
				}
				case 1441897: {
					sub_15959();
					return;
				}
				case 1441906: {
					sub_159e9();
					return;
				}
				case 1441915: {
					sub_15a79();
					return;
				}
				case 1441924: {
					sub_15b09();
					return;
				}
				case 1441933: {
					sub_15b99();
					return;
				}
				case 1441942: {
					sub_15c29();
					return;
				}
				case 1441943: {
					sub_15c61();
					return;
				}
				case 1441944: {
					sub_15c9a();
					return;
				}
				case 1441951: {
					sub_15d57(-1);
					return;
				}
				case 1441795: {
					sub_15cd3();
					return;
				}
				case 1441799: {
					sub_15d11();
					return;
				}
				case 1441796: {
					sub_15cd3();
					return;
				}
				case 1441800: {
					sub_15d11();
					return;
				}
				case 1441803: {
					sub_1507a();
					return;
				}
				case 1441818: {
					sub_150e6();
					return;
				}
				case 1441833: {
					sub_15156();
					return;
				}
				case 1441848: {
					sub_151c6();
					return;
				}
				case 1441863: {
					sub_15236();
					break;
				}
				}
				return;
			}
			case 8: {
				switch (n) {
				case 524491: {
					sub_15e7b();
					return;
				}
				case 524492: {
					sub_15ed7();
					return;
				}
				case 524297: {
					sub_161aa();
					return;
				}
				case 524300: {
					sub_16157();
					return;
				}
				case 524313: {
					sub_15f80();
					return;
				}
				case 524328: {
					sub_15fce();
					return;
				}
				case 524343: {
					sub_1601c();
					return;
				}
				case 524358: {
					sub_1606a();
					return;
				}
				case 524373: {
					sub_160b9();
					return;
				}
				case 524388: {
					sub_16108();
					return;
				}
				case 524399: {
					sub_15f2c();
					return;
				}
				case 524406: {
					sub_162f2();
					return;
				}
				case 524412: {
					sub_1638f();
					return;
				}
				case 524418: {
					sub_16427();
					return;
				}
				case 524424: {
					sub_164bf();
					return;
				}
				case 524430: {
					sub_16557();
					return;
				}
				case 524436: {
					sub_165ef();
					return;
				}
				case 524452: {
					sub_16687();
					return;
				}
				case 524450: {
					sub_17536();
					sub_175b0();
					return;
				}
				case 524454: {
					sub_45ef1(1);
					return;
				}
				case 524456: {
					sub_45ef1(2);
					return;
				}
				case 524458: {
					sub_166ee();
					return;
				}
				case 524460: {
					sub_1670d();
					return;
				}
				case 524462: {
					sub_1672c();
					return;
				}
				case 524464: {
					sub_1674b();
					return;
				}
				case 524466: {
					sub_1676b();
					return;
				}
				case 524468: {
					sub_1678b();
					return;
				}
				case 524470: {
					sub_167ab();
					return;
				}
				case 524472: {
					sub_166cf();
					return;
				}
				case 524474: {
					sub_167cb();
					return;
				}
				case 524476: {
					sub_167ea();
					return;
				}
				case 524478: {
					sub_16834();
					return;
				}
				case 524480: {
					sub_168f1();
					return;
				}
				case 524482: {
					sub_16935();
					return;
				}
				case 524487: {
					sub_1695a();
					return;
				}
				case 524494: {
					sub_169d6();
					break;
				}
				}
				return;
			}
			case 9: {
				switch (n) {
				case 589969: {
					sub_17bbf();
					return;
				}
				case 589836: {
					sub_17ee3();
					return;
				}
				case 589847: {
					sub_17f02();
					return;
				}
				case 589858: {
					sub_17f21();
					return;
				}
				case 589869: {
					sub_17f40();
					return;
				}
				case 589880: {
					sub_17f5f();
					return;
				}
				case 589839: {
					sub_17d76();
					return;
				}
				case 589850: {
					sub_17dbf();
					return;
				}
				case 589861: {
					sub_17e08();
					return;
				}
				case 589872: {
					sub_17e51();
					return;
				}
				case 589883: {
					sub_17e9a();
					return;
				}
				case 589838: {
					sub_17c09();
					return;
				}
				case 589849: {
					sub_17c52();
					return;
				}
				case 589860: {
					sub_17c9b();
					return;
				}
				case 589871: {
					sub_17ce4();
					return;
				}
				case 589882: {
					sub_17d2d();
					return;
				}
				case 589827: {
					sub_17f7e();
					break;
				}
				}
				return;
			}
			case 17: {
				switch (n) {
				case 1114161: {
					sub_182c6();
					return;
				}
				case 1114115: {
					sub_182ed();
					return;
				}
				case 1114117: {
					sub_1833e();
					return;
				}
				case 1114120: {
					sub_183b6();
					return;
				}
				case 1114139: {
					sub_18407();
					return;
				}
				case 1114145: {
					sub_184a9();
					return;
				}
				case 1114156: {
					sub_1854b();
					return;
				}
				case 1114157: {
					sub_18574();
					break;
				}
				}
				return;
			}
			case 10: {
				switch (n) {
				case 655416: {
					sub_18688();
					return;
				}
				case 655423: {
					sub_186af();
					return;
				}
				case 655363: {
					sub_18701();
					return;
				}
				case 655364: {
					sub_1875b();
					return;
				}
				case 655365: {
					sub_187b1();
					return;
				}
				case 655373: {
					sub_18817();
					return;
				}
				case 655380: {
					sub_1889b();
					return;
				}
				case 655387: {
					sub_18913();
					return;
				}
				case 655394: {
					sub_1898b();
					return;
				}
				case 655401: {
					sub_18a03();
					return;
				}
				case 655408: {
					sub_18a7b();
					break;
				}
				}
				return;
			}
			case 11: {
				switch (n) {
				case 720898: {
					sub_18b4a();
					return;
				}
				case 720902: {
					sub_18b71();
					return;
				}
				case 720919: {
					sub_18e88();
					return;
				}
				case 720920: {
					sub_18f39();
					break;
				}
				}
				return;
			}
			case 12: {
				switch (n) {
				case 786437: {
					sub_18fea();
					break;
				}
				}
				return;
			}
			case 13: {
				switch (n) {
				case 852006: {
					sub_190dd();
					return;
				}
				case 851970: {
					sub_19104();
					return;
				}
				case 851971: {
					sub_191a3();
					return;
				}
				case 851972: {
					sub_191f1();
					return;
				}
				case 851973: {
					sub_1924e();
					return;
				}
				case 851974: {
					sub_1928b();
					return;
				}
				case 851975: {
					sub_192c8();
					return;
				}
				case 851976: {
					sub_19306();
					return;
				}
				case 851977: {
					sub_19345();
					return;
				}
				case 851978: {
					sub_19384();
					return;
				}
				case 852007: {
					sub_1940b();
					break;
				}
				}
				return;
			}
			case 14: {
				switch (n) {
				case 917514: {
					sub_19473();
					return;
				}
				case 917557: {
					sub_195c5();
					return;
				}
				case 917522: {
					sub_195ec();
					return;
				}
				case 917571: {
					sub_19691();
					return;
				}
				case 917551: {
					sub_196d8();
					break;
				}
				}
				return;
			}
			case 15: {
				switch (n) {
				case 983185: {
					sub_19f9b();
					return;
				}
				case 983042: {
					sub_19fc2();
					return;
				}
				case 983044: {
					sub_1a006();
					return;
				}
				case 983047: {
					sub_1a02c();
					return;
				}
				case 983049: {
					openPrivacyNoticeURL();
					return;
				}
				case 983053: {
					sub_1af47();
					return;
				}
				case 983188: {
					sub_1a2b9();
					return;
				}
				case 983058: {
					sub_1a2dc();
					return;
				}
				case 983064: {
					sub_1a322();
					return;
				}
				case 983066: {
					sub_1a399();
					return;
				}
				case 983086: {
					sub_1a66e();
					return;
				}
				case 983080: {
					sub_1a6dd();
					return;
				}
				case 983083: {
					sub_1a71d();
					return;
				}
				case 983088: {
					sub_1a593();
					return;
				}
				case 983094: {
					sub_1a42f();
					return;
				}
				case 983095: {
					sub_1a4b8();
					return;
				}
				case 983092: {
					sub_1a541();
					return;
				}
				case 983093: {
					sub_1a56a();
					return;
				}
				case 983074: {
					sub_1a62a();
					return;
				}
				case 983051: {
					sub_1a782();
					return;
				}
				case 983124: {
					sub_1aaf0();
					return;
				}
				case 983126: {
					sub_1ab18();
					return;
				}
				case 983118: {
					sub_1aaa7();
					return;
				}
				case 983120: {
					sub_1aacc();
					return;
				}
				case 983112: {
					sub_1ab3c();
					return;
				}
				case 983114: {
					sub_1ab62();
					return;
				}
				case 983105: {
					sub_1ab86();
					return;
				}
				case 983106: {
					sub_1abab();
					return;
				}
				case 983108: {
					sub_1abd0();
					return;
				}
				case 983100: {
					sub_1abf4();
					return;
				}
				case 983128: {
					sub_1ac1a();
					return;
				}
				case 983130: {
					sub_1ac42();
					return;
				}
				case 983131: {
					sub_1ac65();
					return;
				}
				case 983132: {
					sub_1acfa();
					return;
				}
				case 983133: {
					sub_1acaf();
					return;
				}
				case 983134: {
					sub_1ad43();
					return;
				}
				case 983135: {
					sub_1ad8d();
					return;
				}
				case 983139: {
					sub_1adfa();
					return;
				}
				case 983140: {
					sub_1ae25();
					return;
				}
				case 983141: {
					sub_1ae52();
					return;
				}
				case 983142: {
					sub_1ae7f();
					return;
				}
				case 983143: {
					sub_1aeac();
					return;
				}
				case 983144: {
					sub_1aefa();
					return;
				}
				case 983147: {
					sub_1af6f();
					return;
				}
				case 983149: {
					sub_1afc4();
					return;
				}
				case 983154: {
					sub_1b0e9();
					return;
				}
				case 983155: {
					sub_1b1b3();
					return;
				}
				case 983152: {
					sub_1afec();
					return;
				}
				case 983153: {
					sub_1b06b();
					return;
				}
				case 983160: {
					sub_1b27d();
					return;
				}
				case 983163: {
					sub_1b2a2();
					return;
				}
				case 983164: {
					sub_1b2c8();
					return;
				}
				case 983167: {
					sub_1b2ee();
					return;
				}
				case 983170: {
					sub_1b314();
					return;
				}
				case 983173: {
					sub_1b33a();
					return;
				}
				case 983176: {
					sub_1b360();
					break;
				}
				}
				return;
			}
			case 16: {
				switch (n) {
				case 1048665: {
					sub_1bb38();
					return;
				}
				case 1048633: {
					sub_1bb5f();
					return;
				}
				case 1048639: {
					sub_1bba8();
					return;
				}
				case 1048645: {
					sub_1bbf1();
					return;
				}
				case 1048651: {
					sub_1bc3a();
					return;
				}
				case 1048657: {
					sub_1bc83();
					break;
				}
				}
				return;
			}
			case 21: {
				switch (n) {
				case 1376302: {
					sub_1bd09();
					return;
				}
				case 1376258: {
					sub_1bd30();
					return;
				}
				case 1376259: {
					sub_1bd8c();
					return;
				}
				case 1376260: {
					sub_1bde6();
					return;
				}
				case 1376271: {
					sub_1be42();
					return;
				}
				case 1376277: {
					sub_1be9c();
					return;
				}
				case 1376283: {
					sub_1bef6();
					return;
				}
				case 1376289: {
					sub_1bf50();
					return;
				}
				case 1376295: {
					sub_1bfaa();
					break;
				}
				}
				return;
			}
			case 23: {
				switch (n) {
				case 1507355: {
					sub_1c004();
					return;
				}
				case 1507356: {
					sub_1c02b();
					return;
				}
				case 1507330: {
					sub_1c051();
					return;
				}
				case 1507334: {
					sub_1c076();
					return;
				}
				case 1507338: {
					sub_1c09b();
					return;
				}
				case 1507342: {
					sub_1c0c0();
					return;
				}
				case 1507346: {
					sub_1c0e5();
					return;
				}
				case 1507350: {
					sub_1c10a();
					break;
				}
				}
				return;
			}
			case 24: {
				switch (n) {
				case 1572876: {
					sub_1c12f();
					return;
				}
				case 1572883: {
					sub_1c156();
					return;
				}
				case 1572885: {
					sub_1c1d0();
					return;
				}
				case 1572887: {
					sub_1c288();
					break;
				}
				}
				return;
			}
			case 20: {
				switch (n) {
				case 1310724: {
					sub_1bccc();
					break;
				}
				}
				return;
			}
			case 19: {
				switch (n) {
				case 1245258: {
					sub_1c340();
					return;
				}
				case 1245198: {
					sub_1c367();
					return;
				}
				case 1245212: {
					sub_1c3ac();
					return;
				}
				case 1245226: {
					sub_1c3f5();
					return;
				}
				case 1245240: {
					sub_1c43e();
					return;
				}
				case 1245254: {
					sub_1c487();
					break;
				}
				}
				return;
			}
			case 27: {
				switch (n) {
				case 1769480: {
					sub_1c4d0();
					return;
				}
				case 1769478: {
					sub_1c523();
					return;
				}
				case 1769482: {
					sub_1c546();
					return;
				}
				case 1769488: {
					sub_1c635();
					return;
				}
				case 1769484: {
					sub_1c658();
					return;
				}
				case 1769486: {
					sub_1c67b();
					break;
				}
				}
				return;
			}
			default: {
				cGame.var_6bec = false;
				break;
			}
			}
		}
	}

	private static void sub_22d97(final int n) {
		if (!sub_2351a(n, 1)) {
			final int n2 = cGame.var_6914[n][0] >> 16 & 0xFFFF;
			int i = cGame.var_6914[n][0] & 0xFFFF;
			final int n3 = cGame.var_6914[n][1] & 0xFFFF;
			final short n4 = cGame.var_68bc[n2][i][5];
			final short n5 = cGame.var_68bc[n2][i][6];
			final short n6 = cGame.var_68bc[n2][i][2];
			final short n7 = cGame.var_68bc[n2][i][3];
			final int[] array = new int[4];
			cGame.var_68d4[n4].sub_3882(n5, 0, array, 0);
			++i;
			while (i <= n3) {
				cGame.var_68bc[n2][i][2] = (short) (cGame.var_68c4[n2][i][2] + cGame.var_6914[n][8]);
				cGame.var_68bc[n2][i][3] = (short) (cGame.var_68c4[n2][i][3] + cGame.var_6914[n][9]);
				final short n8;
				final ASprite class_e;
				if (cGame.var_68bc[n2][i][0] == 205 && cGame.var_68bc[n2][i][18] == 1
						&& (class_e = (((n8 = cGame.var_68bc[n2][i][5]) < 1000) ? cGame.var_68d4[n8]
								: cGame.var_7ff4[n8 - 1000])) != null) {
					final short n9 = cGame.var_68bc[n2][i][6];
					final short n10 = cGame.var_68bc[n2][i][2];
					final short n11 = cGame.var_68bc[n2][i][3];
					if (class_e.sub_383d(n9) > 0) {
						final int[] array2 = new int[4];
						class_e.sub_3882(n9, 0, array2, 0);
						int n12 = n10 + array2[0];
						int n13 = n11 + array2[1];
						int n14 = array2[2];
						int n15 = array2[3];
						if (n12 + n14 <= n6 + array[0] || n12 >= n6 + array[0] + array[2]) {
							n14 = 0;
						} else if (n12 <= n6 + array[0]) {
							n14 -= n6 + array[0] - n12;
							n12 = n6 + array[0];
						} else if (n12 + n14 >= n6 + array[0] + array[2]) {
							n14 = n6 + array[0] + array[2] - n12;
						}
						if (n13 + n15 <= n7 + array[1] || n13 >= n7 + array[1] + array[3]) {
							n15 = 0;
						} else if (n13 <= n7 + array[1]) {
							n15 -= n7 + array[1] - n13;
							n13 = n7 + array[1];
						} else if (n13 + n15 >= n7 + array[1] + array[3]) {
							n15 = n7 + array[1] + array[3] - n13;
						}
						sub_2c7ce(n2 << 16 | (i & 0xFFFF), n12, n13, n14, n15);
					}
				}
				++i;
			}
		}
	}

	private static void sub_23105(final int n) {
		if (!sub_2351a(n, 1)) {
			final int n2 = cGame.var_6914[n][0] >> 16 & 0xFFFF;
			int i = cGame.var_6914[n][0] & 0xFFFF;
			final int n3 = cGame.var_6914[n][1] & 0xFFFF;
			final short n4 = cGame.var_68c4[n2][i][2];
			final short n5 = cGame.var_68c4[n2][i][3];
			++i;
			while (i <= n3) {
				cGame.var_68bc[n2][i][2] = (short) (cGame.var_68c4[n2][i][2] + cGame.var_6914[n][8]);
				final int n6 = cGame.var_68bc[n2][i][2] - n4;
				cGame.var_68bc[n2][i][3] = (short) (n5
						- GLLib.sub_2c75(cGame.var_6914[n][4] * cGame.var_6914[n][4] - n6 * n6));
				if (cGame.var_68bc[n2][i][0] == 205 && cGame.var_68bc[n2][i][18] == 1
						&& cGame.var_68bc[n2][i][5] > -1) {
					final short n7 = cGame.var_68bc[n2][i][5];
					final short n8 = cGame.var_68bc[n2][i][6];
					final short n9 = cGame.var_68bc[n2][i][2];
					final short n10 = cGame.var_68bc[n2][i][3];
					if (cGame.var_68d4[n7].sub_383d(n8) > 0) {
						final int[] array = new int[4];
						cGame.var_68d4[n7].sub_3882(n8, 0, array, 0);
						sub_2c7ce(n2 << 16 | (i & 0xFFFF), n9 + array[0], n10 + array[1], array[2], array[3]);
					}
				}
				++i;
			}
		}
	}

	private static void sub_23297(final int n, final int n2) {
		final int n3 = cGame.var_6914[n][0] >> 16 & 0xFFFF;
		if (sub_2351a(n, 4)) {
			final int[] array = cGame.var_6914[n];
			final int n4 = 8;
			array[n4] += cGame.var_6914[n][10] - cGame.var_68bc[n3][n2][2];
			sub_23105(n);
		} else {
			final int[] array2 = cGame.var_6914[n];
			final int n5 = 8;
			array2[n5] += cGame.var_6914[n][10] - cGame.var_68bc[n3][n2][2];
			final int[] array3 = cGame.var_6914[n];
			final int n6 = 9;
			array3[n6] += cGame.var_6914[n][11] - cGame.var_68bc[n3][n2][3];
			sub_22d97(n);
		}
		final int n7 = cGame.var_6914[n][0] & 0xFFFF;
		final int n8 = cGame.var_6914[n][1] & 0xFFFF;
		if (cGame.var_6914[n][2] != -1) {
			if (n2 == n7 + 1) {
				cGame.var_68bc[n3][cGame.var_6914[n][2]][10] = 0;
			} else {
				cGame.var_68bc[n3][cGame.var_6914[n][2]][10] = 1;
			}
		}
		if (cGame.var_6914[n][3] != -1) {
			if (n2 == n8 || cGame.var_68bc[n3][n2 + 1][10] == 0) {
				cGame.var_68bc[n3][cGame.var_6914[n][3]][10] = 0;
				return;
			}
			cGame.var_68bc[n3][cGame.var_6914[n][3]][10] = 1;
		}
	}

	private static void sub_2340c(final int n, final int n2) {
		if (cGame.var_68bc[n][n2][0] == 205 && cGame.var_68bc[n][n2][18] == 1) {
			final short n3 = cGame.var_68bc[n][n2][5];
			final short n4 = cGame.var_68bc[n][n2][6];
			final short n5 = cGame.var_68bc[n][n2][2];
			final short n6 = cGame.var_68bc[n][n2][3];
			if (cGame.var_68d4[n3].sub_383d(n4) > 0) {
				final int[] array = new int[4];
				cGame.var_68d4[n3].sub_3882(n4, 0, array, 0);
				sub_2c7ce(n << 16 | (n2 & 0xFFFF), n5 + array[0], n6 + array[1], array[2], array[3]);
			}
		}
	}

	private static void sub_234cb(final int n, final int n2) {
		final int[] array = cGame.var_6914[n];
		final int n3 = 12;
		array[n3] |= n2;
	}

	private static void sub_234f2(final int n) {
		final int[] array = cGame.var_6914[n];
		final int n2 = 12;
		array[n2] &= 0xFFFFFFFE;
	}

	private static boolean sub_2351a(final int n, final int n2) {
		return (cGame.var_6914[n][12] & n2) == n2;
	}

	private static int sub_23556(final int n, final int n2, final int n3, final int n4, final int n5, final int n6,
			final int n7) {
		int n8;
		for (n8 = 0; n8 < 10 && cGame.var_691c[n8] != null; ++n8) {
		}
		if (n8 < 10) {
			(cGame.var_691c[n8] = new int[8])[0] = n;
			cGame.var_691c[n8][1] = n2;
			cGame.var_691c[n8][2] = n3;
			cGame.var_691c[n8][3] = n4;
			cGame.var_691c[n8][4] = n5;
			cGame.var_691c[n8][5] = n6;
			cGame.var_691c[n8][6] = n7;
			cGame.var_691c[n8][7] = 0;
		}
		return n8;
	}

	private static int sub_2361c(final int n, int i, int j, final int n2, final int n3, final int n4, int n5, int n6) {
		n5 += cGame.var_68d4[cGame.var_68bc[n][n3][5]].sub_312c(cGame.var_68bc[n][n3][6]) + 10;
		n6 = cGame.var_68d4[cGame.var_68bc[n][n3][5]].sub_3189(cGame.var_68bc[n][n3][6]) + 10;
		int n7 = n4;
		int n8 = 2;
		int n9 = 3;
		int n10 = n5;
		int n11 = n6;
		int n12 = i;
		if (i > 0) {
			n8 = 2;
			n9 = 3;
			n10 = n5;
			n11 = n6;
			n7 = (i - 1) * n2 + n3;
			n12 = i;
		} else if (j > 0) {
			n8 = 3;
			n9 = 2;
			n10 = n6;
			n11 = n5;
			n7 = (j - 1) * n2 + n3;
			n12 = j;
		}
		for (i = n3; i < n7; ++i) {
			cGame.var_68c4[n][i][n8] = (short) (cGame.var_68c4[n][i - n2][n8] + n10);
			cGame.var_68c4[n][i][n9] = cGame.var_68c4[n][i - n2][n9];
		}
		i = n2 * n12;
		for (j = n7; j <= n4; ++j) {
			cGame.var_68c4[n][j][n9] = (short) (cGame.var_68c4[n][j - i][n9] + n11);
			cGame.var_68c4[n][j][n8] = cGame.var_68c4[n][j - i][n8];
		}
		return n11;
	}

	private static int sub_237d7(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
		return sub_2361c(n, n2, n3, n4, n5, n6, 0, 0);
	}

	private static int sub_237ff(final int n) {
		int n2 = 0;
		if (n == 1) {
			n2 = 1;
		} else if (n == 2) {
			n2 = 2;
		} else if (n == 3) {
			n2 = 3;
		} else if (n == 4) {
			n2 = 4;
		}
		return n2;
	}

	private static void sub_2386a(final int n, final int n2, final int n3, final int n4) {
		sub_2393e(n, n2);
		int n5;
		for (n5 = 0; n5 < 30 && cGame.var_68ec[n5] != null; ++n5) {
		}
		if (n5 < 30) {
			final short n6;
			(cGame.var_68ec[n5] = new GLLibPlayer(
					((n6 = cGame.var_68bc[n][n2][5]) < 1000) ? cGame.var_68d4[n6] : cGame.var_7ff4[n6 - 1000], 0,
					0)).SetAnim(n3, n4);
			cGame.var_68bc[n][n2][17] = (short) n5;
		}
	}

	private static void sub_2393e(final int n, final int n2) {
		if (sub_2398b(n, n2)) {
			cGame.var_68ec[cGame.var_68bc[n][n2][17]] = null;
			cGame.var_68bc[n][n2][17] = -1;
		}
	}

	private static boolean sub_2398b(final int n, final int n2) {
		return cGame.var_68bc[n][n2][0] == 205
				&& (cGame.var_68bc[n][n2][17] > -1 && cGame.var_68bc[n][n2][17] < 30);
	}

	private static void sub_239ef(final int n) {
		for (int length = cGame.var_68bc[n].length, i = 0; i < length; ++i) {
			sub_2393e(n, i);
		}
	}

	private static void sub_23a3d(final int n, final int n2, final int n3) {
		if (cGame.var_68bc[n][n2][0] == 205) {
			cGame.var_68bc[n][n2][20] = (short) n3;
		}
	}

	static void sub_23a84(final int n) {
		if (!cGame.var_69ec) {
			return;
		}
		playSound(cGame.var_6a3c[n][0], n, false);
	}

	private static void sub_23ac1(final int n, final boolean b) {
		if (!cGame.var_69f4) {
			return;
		}
		playSound(cGame.var_6a3c[n][0], n, b);
	}

	private static void playSound(final int n, final int n2, final boolean b) {
		if (sndPlayingOnChannel(0) && cGame.var_6a3c[n2][1] >= cGame.var_6a3c[cGame.var_6a44][1]) {
			return;
		}
		if (!GLLibPlayer.Snd_IsInSlot(n2)) {
			return;
		}
		if (cGame.var_69e4) {
			if ((cGame.var_6a44 < 0 || cGame.var_6a3c[n2][1] >= cGame.var_6a3c[cGame.var_6a44][1])
					&& System.currentTimeMillis() - cGame.var_6a6c <= 1000L) {
				new StringBuffer().append("==========Sound: ").append(n2).append(" --- DELAY");
				return;
			}
			new StringBuffer().append("==========Sound: ").append(n2).append(" DON'T DELAY");
			cGame.var_6a6c = System.currentTimeMillis();
			int var_6a4c;
			if ((var_6a4c = n2) >= 15) {
				if (n2 == cGame.var_6a4c) {
					var_6a4c = n2 + 52;
				}
				cGame.var_6a4c = var_6a4c;
			}
			cGame.var_6a44 = n2;
			new StringBuffer().append("==========================PlaySound: ").append(n2);
			Label_0243: {
				int var_6a24;
				try {
					final Player sub_1dbe;
					if ((sub_1dbe = GLLibPlayer.Snd_GetChannelPlayer(n)) != null) {
						if ((var_6a24 = ((VolumeControl) ((Controllable) sub_1dbe).getControl("VolumeControl"))
								.getLevel()) > cGame.var_6a2c) {
							var_6a24 = cGame.var_6a2c;
						}
					} else {
						var_6a24 = cGame.var_6a24;
					}
				} catch (final Exception ex) {
					break Label_0243;
				}
				cGame.var_6a24 = var_6a24;
			}
			if (!cGame.var_6a34) {
				GLLibPlayer.Snd_Play(n, var_6a4c, b ? 0 : 1, cGame.var_6a24, cGame.var_6a3c[n2][1]);
				final long currentTimeMillis = System.currentTimeMillis();
				if (n2 < 15) {
					cGame.var_6a84 = currentTimeMillis;
					return;
				}
				cGame.var_6a7c = currentTimeMillis;
				if (cGame.var_7fd4 == -1) {
					cGame.var_6a9c = true;
				}
			}
		}
	}

	static void sub_23d1d(final int n) {
		if (!cGame.var_69ec) {
			return;
		}
		if (cGame.var_69e4) {
			if (!cGame.var_6a34) {
				GLLibPlayer.Snd_Play(0, n, 1, var_6a24, cGame.var_6a3c[n][1]);
			}
		}
	}

	private static void sub_23d73() {
		if (cGame.var_69e4) {
			try {
				GLLibPlayer.sub_239b(0, true);
			} catch (final Exception ex) {
			}
		}
	}

	private static void sub_23dba() {
		if (!cGame.var_6a0c) {
			sub_23ac1(13, false);
			cGame.var_6a0c = true;
			cGame.var_69fc = true;
			return;
		}
		if (cGame.var_6a14) {
			sub_23ac1(0, false);
			cGame.var_6a14 = false;
			cGame.var_69fc = true;
			return;
		}
		final long currentTimeMillis = System.currentTimeMillis();
		if (cGame.var_6a9c) {
			if (currentTimeMillis - cGame.var_6a7c > 5000L) {
				cGame.var_6a9c = false;
			}
			return;
		}
		if (!cGame.var_6a9c && !cGame.var_69fc) {
			cGame.var_69fc = true;
			if (cGame.var_6a5c == 0) {
				cGame.var_6a54 = new int[9];
				for (int i = 0; i < 9; ++i) {
					cGame.var_6a54[i] = i + 1;
				}
				int[] var_6a54;
				for (int j = (var_6a54 = cGame.var_6a54).length - 1; j >= 0; --j) {
					final int sub_2b97 = GLLib.Math_Rand(0, var_6a54.length);
					final int n = var_6a54[sub_2b97];
					var_6a54[sub_2b97] = var_6a54[j];
					var_6a54[j] = n;
				}
				if (cGame.var_6a64 == cGame.var_6a54[cGame.var_6a5c]) {
					++cGame.var_6a5c;
				}
			}
			final int n2 = cGame.var_6a64 = cGame.var_6a54[cGame.var_6a5c];
			final int n3;
			sub_da7a(n3 = n2, 0);
			sub_d9a0(n3);
			try {
				Thread.sleep(200L);
			} catch (final Exception ex) {
			}
			sub_23ac1(n2, false);
			if (cGame.var_6a5c < 8) {
				++cGame.var_6a5c;
			} else {
				cGame.var_6a5c = 0;
			}
			if (!cGame.var_69f4) {
				cGame.var_6a84 = System.currentTimeMillis();
			}
			return;
		}
		if (!cGame.var_6a9c && cGame.var_69fc) {
			final long n4;
			if ((n4 = currentTimeMillis - cGame.var_6a84) > 45000L) {
				cGame.var_69fc = false;
			}
			if (n4 > 10000L && n4 < 20000L) {
				int sub_2b98 = GLLib.Math_Rand(63, 66);
				if (GLLib.Math_Rand(0, 100) < 80 && currentTimeMillis - cGame.var_6a8c > 5000L) {
					if (cGame.var_6a94 != -1 && cGame.var_6a94 == sub_2b98 && ++sub_2b98 > 65) {
						sub_2b98 = 63;
					}
					sub_23a84(sub_2b98);
					cGame.var_6a8c = currentTimeMillis;
				}
				final int sub_2abc = GLLibPlayer.sub_2abc();
				if (sndPlayingOnChannel(0) && sub_2abc >= 63 && sub_2abc <= 65) {
					cGame.var_6a94 = sub_2abc;
				}
			}
		}
	}

	static boolean sndPlayingOnChannel(final int unusedInt) {
		try {
			return GLLibPlayer.Snd_IsPlaying(0);
		} catch (final Exception ex) {
			return false;
		}
	}

	private static void sub_24046() {
		sub_23a84(61);
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException ex) {
		}
	}

	private static void sub_24088() {
		cGame.var_6aa4 = -1;
		cGame.var_6aac = null;
		cGame.var_6ab4 = null;
		cGame.var_6abc = false;
		cGame.var_6ac4 = false;
		cGame.var_6acc = 0;
		cGame.var_6ad4 = 0;
		cGame.var_6aec = false;
		cGame.var_6af4 = -1;
		cGame.var_6afc = -1;
		cGame.var_6b04 = 0;
		cGame.var_6b0c = 1;
		cGame.var_6b54 = 0;
		cGame.var_6b5c = null;
	}

	private static boolean sub_240db() {
		boolean b = false;
		if (GLLib.sub_7660()) {
			if (cGame.var_6aac == cGame.var_8014) {
				cGame.var_6acc = GLLib.s_screenX;
				cGame.var_6ad4 = GLLib.s_screenY;
				if (cGame.var_6aac != null) {
					cGame.var_6abc = true;
					cGame.var_6aec = true;
				}
			} else if (cGame.var_6aa4 == 3 && cGame.var_6aac != null) {
				if (!sub_2cad2(cGame.var_6aac)) {
					sub_24b52();
					sub_25043(false);
					sub_10dd3(false);
				} else {
					sub_117fc();
				}
			}
		} else if (GLLib.sub_7693()) {
			if (cGame.var_6abc) {
				cGame.var_800c.sub_6872();
				b = true;
				sub_2c69b();
				sub_1f8c5(1);
			}
		} else if (GLLib.sub_762d()) {
			Label_0807: {
				if (GLLib.s_screenX >= cGame.var_6acc - 20 && GLLib.s_screenX <= cGame.var_6acc + 20
						&& GLLib.s_screenY >= cGame.var_6ad4 - 20 && GLLib.s_screenY <= cGame.var_6ad4 + 20) {
					if (cGame.var_6abc && cGame.var_6aac != null && cGame.var_6aec) {
						cGame.var_6aec = false;
						if (sub_2cad2(cGame.var_6aac)) {
							break Label_0807;
						}
						if (cGame.var_6aa4 == 1) {
							switch (cGame.var_6aac.var_17c5) {
							case 49: {
								if (cGame.var_6aac.var_1835 == 0
										&& ((cGame.var_708c > 0 && sub_2e3a5(cGame.var_708c))
												|| (cGame.var_7094 > 0 && sub_2e3d9(cGame.var_7094)))) {
									cGame.var_6aac.sub_7795(8);
									sub_2ec47(5, cGame.var_6aac);
									sub_24b52();
									break Label_0807;
								}
								if ((cGame.var_6b24 > 0 && sub_2e3a5(cGame.var_6b24))
										|| (cGame.var_6b2c > 0 && sub_2e3d9(cGame.var_6b2c))) {
									cGame.var_6aac.sub_7795(8);
									sub_2ec47(5, cGame.var_6aac);
									sub_24b52();
									break Label_0807;
								}
								sub_1179d(false);
								if (cGame.var_6aac.var_1835 == 0) {
									if (cGame.var_708c > 0) {
										final String sub_4e1f;
										cGame.var_7ab4 = GLLib.sub_547c(
												((sub_4e1f = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f, "%d",
												GLLib.CurrencySeparator_just_a_guess(cGame.var_708c - sub_2e0da(), cGame.var_7fe4,
														" "));
										cGame.var_7aac = 18;
										cGame.var_7d24 = false;
										cGame.var_815c = true;
										sub_81e0(34);
										break Label_0807;
									}
									if (cGame.var_7094 > 0) {
										final String sub_4e1f2;
										cGame.var_7ab4 = GLLib.sub_547c(
												((sub_4e1f2 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f2, "%d",
												GLLib.CurrencySeparator_just_a_guess(cGame.var_7094 - getCash(), cGame.var_7fe4,
														" "));
										cGame.var_7aac = 19;
										cGame.var_7d24 = true;
										cGame.var_815c = true;
										sub_81e0(34);
									}
									break Label_0807;
								} else {
									if (cGame.var_6b24 > 0) {
										final String sub_4e1f3;
										cGame.var_7ab4 = GLLib.sub_547c(
												((sub_4e1f3 = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f3, "%d",
												GLLib.CurrencySeparator_just_a_guess(cGame.var_6b24 - sub_2e0da(), cGame.var_7fe4,
														" "));
										cGame.var_7aac = 18;
										cGame.var_7d24 = false;
										cGame.var_815c = true;
										sub_81e0(34);
										break Label_0807;
									}
									if (cGame.var_6b2c > 0) {
										final String sub_4e1f4;
										cGame.var_7ab4 = GLLib.sub_547c(
												((sub_4e1f4 = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f4, "%d",
												GLLib.CurrencySeparator_just_a_guess(cGame.var_6b2c - getCash(), cGame.var_7fe4,
														" "));
										cGame.var_7aac = 19;
										cGame.var_7d24 = true;
										cGame.var_815c = true;
										sub_81e0(34);
									}
									break Label_0807;
								}
							}
							case 50: {
								break Label_0807;
							}
							case 20: {
								sub_24b52();
							}
							default: {
								break Label_0807;
							}
							}
						} else {
							if (cGame.var_6aa4 == 0) {
								sub_24b52();
								sub_25043(false);
								sub_10dd3(false);
								sub_10cd1(true);
								cGame.var_6aa4 = -1;
								break Label_0807;
							}
							if (cGame.var_6aa4 == 4) {
								if (cGame.var_7fd4 == 52) {
									cGame.var_6c94 = true;
								}
								sub_24b52();
								sub_1179d(false);
								break Label_0807;
							}
							sub_24b52();
							sub_25043(false);
							sub_10dd3(false);
						}
					} else if (cGame.var_6aac == null) {
						final Class_f sub_4f59;
						if ((sub_4f59 = Class_f.sub_4f59()) != null) {
							sub_245ce(sub_4f59, true);
							if (cGame.var_6aac != null && cGame.var_6aac.sub_a2a0(2) && cGame.var_6aa4 == 3) {
								sub_2c9ec(cGame.var_6aac);
							}
						} else {
							sub_25043(true);
						}
						break Label_0807;
					}
					b = true;
				}
			}
			cGame.var_6abc = false;
		}
		if (!b || cGame.var_7fd4 == 15 || cGame.var_7fd4 == 51) {
			return false;
		}
		final int[] array = new int[2];
		final int[] array2;
		(array2 = new int[2])[0] = GLLib.s_screenX;
		array2[1] = GLLib.s_screenY;
		sub_26427(array2, array);
		sub_2c867(array, array2);
		if (sub_2d213(array2[0], array2[1]) < 0) {
			return true;
		}
		sub_2c8b0(array2, array);
		if (cGame.var_6aac != null) {
			sub_2c8b0(array2, array);
			cGame.var_6aac.var_17cd = array[0];
			cGame.var_6aac.var_17d5 = array[1];
		}
		return true;
	}

	private static void sub_245ce(final Class_f var_6aac, final boolean b) {
		cGame.var_6ab4 = null;
		if (var_6aac != null && cGame.var_807c == 0 && var_6aac.sub_a2a0(1)) {
			sub_251a0(-1);
			sub_11320(false, null);
			if (var_6aac.var_17c5 == 50 && var_6aac.var_1835 < 9) {
				sub_10cd1(true);
				cGame.var_6aa4 = -1;
				cGame.var_802c = null;
				return;
			}
			cGame.var_6aac = var_6aac;
			var_6aac.var_18bd = true;
			if (cGame.var_6ac4 = cGame.var_6aac.sub_a2a0(16777216)) {
				cGame.var_6aac.sub_a25c(16777216);
			}
			if (cGame.var_6aac != null) {
				cGame.var_6aac.var_18bd = true;
				if (cGame.var_6b5c == null) {
					(cGame.var_6b5c = new GLLibPlayer(cGame.var_7ff4[3], cGame.var_6aac.var_17cd,
							cGame.var_6aac.var_17d5)).SetAnim(2, -1);
				} else {
					cGame.var_6b5c.SetPos(cGame.var_6aac.var_17cd, cGame.var_6aac.var_17d5);
				}
			} else {
				cGame.var_6b5c = null;
			}
			cGame.var_8074 = true;
			cGame.var_6adc = cGame.var_6aac.var_17cd;
			cGame.var_6ae4 = cGame.var_6aac.var_17d5;
			if (cGame.var_6aac.var_17c5 == 54) {
				cGame.var_6aac.sub_8365(4);
				if (cGame.var_6aac.sub_a2a0(32)) {
					if (cGame.var_6aa4 == 0) {
						cGame.var_6aac.var_16d5 = true;
						cGame.var_6aac.var_16dd = System.currentTimeMillis();
					} else if (cGame.var_6aa4 == 4) {
						cGame.var_6aac.var_1645 = System.currentTimeMillis() / 1000L;
						cGame.var_6aac.var_163d = Class_h.var_6a[0].var_82[cGame.var_6aac.var_1835][13] * 60;
						cGame.var_6aac.var_16d5 = true;
						cGame.var_6aac.var_16dd = System.currentTimeMillis();
					}
				}
				cGame.var_704c = Class_f.sub_5ad9(0, 54);
				if ((cGame.var_6aa4 == 4 || cGame.var_6aa4 == 0) && cGame.var_704c > getMaxSiloAmount()) {
					sub_117fc();
					cGame.var_7aac = 3;
					sub_8370(17);
					return;
				}
			} else if (cGame.var_6aac.var_17c5 == 52 && (cGame.var_6aa4 == 4 || cGame.var_6aa4 == 0)
					&& Class_f.sub_4cf5(0, 52) > getIdk()) {
				sub_117fc();
				cGame.var_7aac = 20;
				sub_8370(17);
				return;
			}
			if (cGame.var_6aa4 != 3) {
				sub_10dd3(true);
			}
			sub_10cd1(false);
			sub_26a6a(false, -1, '\0');
			if (b && cGame.var_6aac.sub_a2a0(2)) {
				sub_2c9ec(var_6aac);
			}
			cGame.var_6aac.var_17ed = cGame.var_6aac.var_17cd * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5b8b(0);
			cGame.var_6aac.var_17f5 = cGame.var_6aac.var_17d5 * cGame.var_7fc4 / 100 - GLLibPlayer.sub_5c0b(0);
			cGame.var_68bc[1][62][2] = (short) (cGame.var_6aac.var_17ed - 67);
			cGame.var_68bc[1][62][3] = (short) (cGame.var_6aac.var_17f5 + 75);
			cGame.var_68bc[1][63][2] = (short) (cGame.var_6aac.var_17ed + 23);
			cGame.var_68bc[1][63][3] = (short) (cGame.var_6aac.var_17f5 + 75);
			if (cGame.var_6aa4 == 3 && !sub_4ac19(1)) {
				sub_24a2c(true, var_6aac);
			}
			sub_2c69b();
			sub_1f8c5(1);
			if ((cGame.var_6aac.var_1865 > -1 && cGame.var_6aac.var_186d > -1)
					|| (cGame.var_6aac.var_187d > -1 && cGame.var_6aac.var_1885 > -1)) {
				int n2;
				int n3;
				if (cGame.var_6aac.var_1865 > -1) {
					final int var_1865;
					final int n = (var_1865 = cGame.var_6aac.var_1865) & 0x7FFF;
					final ASprite class_e;
					n2 = (class_e = (((var_1865 & 0x8000) != 0x0) ? cGame.var_68d4[n] : cGame.var_7ff4[n]))
							.sub_312c(cGame.var_6aac.var_186d) >> 1;
					n3 = class_e.sub_3189(cGame.var_6aac.var_186d) >> 1;
				} else {
					final int var_187d;
					final int n4 = (var_187d = cGame.var_6aac.var_187d) & 0x7FFF;
					final ASprite class_e2;
					n2 = (class_e2 = (((var_187d & 0x8000) != 0x0) ? cGame.var_68d4[n4] : cGame.var_7ff4[n4]))
							.sub_312c(cGame.var_6aac.var_1885) >> 1;
					n3 = class_e2.sub_3189(cGame.var_6aac.var_1885) >> 1;
				}
				if (cGame.var_6aac.var_17cd - n2 > GLLibPlayer.sub_5b8b(0)
						&& cGame.var_6aac.var_17d5 - n3 > GLLibPlayer.sub_5c0b(0)) {
					cGame.var_6aac.sub_aac5();
				} else {
					GLLibPlayer.sub_5f26();
					cGame.var_8074 = true;
				}
			}
			cGame.var_6aac.var_17dd = 100;
		}
	}

	private static void sub_24a2c(final boolean b, final Class_f class_f) {
		final boolean b2 = b;
		cGame.var_68bc[1][74][10] = (short) (b2 ? 1 : 0);
		cGame.var_68bc[1][75][10] = (short) (b2 ? 1 : 0);
		cGame.var_68bc[1][72][10] = (short) (b2 ? 1 : 0);
		cGame.var_68bc[1][73][10] = (short) (b2 ? 1 : 0);
		cGame.var_68bc[1][76][10] = (short) (b2 ? 1 : 0);
		cGame.var_68bc[1][77][10] = (short) (b2 ? 1 : 0);
		if (class_f != null) {
			if (!class_f.sub_a2a0(64)) {
				cGame.var_68bc[1][74][10] = 0;
				cGame.var_68bc[1][72][10] = 0;
				cGame.var_68bc[1][76][10] = 0;
			}
			if (!class_f.sub_a2a0(128)) {
				cGame.var_68bc[1][75][10] = 0;
				cGame.var_68bc[1][73][10] = 0;
				cGame.var_68bc[1][77][10] = 0;
			}
			if (class_f.sub_a2a0(64) && class_f.sub_a2a0(128)) {
				cGame.var_68bc[1][76][10] = 0;
			}
		}
	}

	private static void sub_24b52() {
		if (cGame.var_6aac != null) {
			final int var_18c5 = cGame.var_6aac.var_18c5;
			cGame.var_6aac.var_18bd = false;
			if (cGame.var_6ac4) {
				cGame.var_6ac4 = false;
				cGame.var_6aac.sub_a21a(16777216);
				cGame.var_6aac.sub_aac5();
			}
			cGame.var_6aac.var_17dd = 12;
			sub_252cf();
			if (cGame.var_6aa4 == 0) {
				sub_23a84(49);
				sub_49db0(cGame.var_6aac.var_18c5, 1, 17, false);
				sub_49db0(cGame.var_6aac.var_18c5, 1, 9, false);
			}
			if (cGame.var_6aa4 == 1) {
				sub_23a84(49);
				sub_49db0(cGame.var_6aac.var_18c5, 1, 17, false);
				sub_49db0(cGame.var_6aac.var_18c5, 1, 9, false);
				if (cGame.var_6aac.var_17c5 == 49 && cGame.var_7fd4 == 42) {
					++cGame.var_6cbc;
				}
			} else if (cGame.var_6aa4 == 3 || cGame.var_6aa4 == 4) {
				if (cGame.var_6adc != cGame.var_6aac.var_17cd && cGame.var_6ae4 != cGame.var_6aac.var_17d5) {
					sub_49db0(cGame.var_6aac.var_18c5, 1, 6, false);
				}
				if (cGame.var_6aa4 == 4) {
					sub_49db0(cGame.var_6aac.var_18c5, 1, 39, false);
					sub_49db0(cGame.var_6aac.var_18c5, 1, 9, false);
				}
			}
			int var_708c = 0;
			int var_7094 = 0;
			if (cGame.var_6aa4 == 1) {
				var_708c = cGame.var_708c;
				var_7094 = cGame.var_7094;
			}
			if (cGame.var_708c > 0) {
				sub_2e369(cGame.var_708c);
				cGame.var_708c = 0;
			}
			if (cGame.var_7094 > 0) {
				sub_2e449(cGame.var_7094);
				cGame.var_7094 = 0;
			}
			if (cGame.var_6aa4 == 1) {
				cGame.var_708c = var_708c;
				cGame.var_7094 = var_7094;
			}
			if (cGame.var_6aac.var_17c5 == 54) {
				boolean b = false;
				cGame.var_6aac.sub_8365(0);
				if (cGame.var_6aa4 == 0) {
					if (cGame.var_6aac.sub_a2a0(32)) {
						cGame.var_6aac.var_16d5 = false;
						cGame.var_6aac.var_16dd = 0L;
					}
					b = true;
					if (cGame.var_6aac.var_16cd > 0) {
						Class_f.sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(cGame.var_6aac.var_17cd,
								cGame.var_6aac.var_17d5, 37, 1000, false, cGame.var_6aac.var_16cd);
					}
					cGame.var_6aac.sub_7ed6();
					if (cGame.var_6aac.sub_a2a0(32)) {
						cGame.var_6aac.sub_7f11();
					}
				} else if (cGame.var_6aa4 == 4) {
					b = false;
					if (cGame.var_6aac.sub_a2a0(32)) {
						cGame.var_6aac.var_16d5 = false;
						cGame.var_6aac.var_16dd = 0L;
					}
					cGame.var_6aac.sub_869a();
				}
				if (b && !cGame.var_6aac.sub_a2a0(32)) {
					cGame.var_6aac.sub_a25c(4);
					cGame.var_6aac.sub_a25c(16);
					cGame.var_6aac.sub_a25c(256);
					cGame.var_6aac.sub_8365(2);
				}
			} else if (cGame.var_6aac.var_17c5 == 52) {
				if (cGame.var_6aa4 == 0) {
					sub_49db0(cGame.var_6aac.var_18c5, 1, 12, false);
				}
				if (cGame.var_6aa4 == 0) {
					cGame.var_6aac.sub_7b13(2);
				}
			} else if (cGame.var_6aac.var_17c5 == 20) {
				if (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1) {
					final int n;
					if ((n = Class_h.var_6a[4].var_82[cGame.var_6aac.var_1835][19]) > 0) {
						Class_f.sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(cGame.var_6aac.var_17cd,
								cGame.var_6aac.var_17d5, 37, 1000, false, n);
					}
				}
			} else if (cGame.var_6aac.var_17c5 == 50 && cGame.var_6aa4 == 0) {
				cGame.var_6aac.var_15c5 = System.currentTimeMillis() / 1000L;
			}
			if (cGame.var_6aac.sub_a2a0(2)) {
				sub_2c907(cGame.var_6aac);
			}
			if (cGame.var_6aa4 == 1 && cGame.var_6aac.var_17c5 == 49) {
				if (Class_f.sub_4cf5(0, 49) < getMaxPlots()) {
					final Class_f sub_25a75;
					(sub_25a75 = sub_25a75(cGame.var_6aac.var_17c5, 0, cGame.var_6aac.var_17cd,
							cGame.var_6aac.var_17d5, true)).var_18c5 = cGame.var_8094[0];
					sub_245ce(sub_25a75, false);
				} else {
					cGame.var_6aac = null;
					cGame.var_6b5c = null;
					sub_1179d(false);
				}
			} else if (cGame.var_6aa4 == 1 && cGame.var_6aac.var_17c5 == 20) {
				final Class_f sub_25b35;
				(sub_25b35 = sub_25b35(4, cGame.var_6aac.var_1835)).var_18c5 = cGame.var_6aac.var_18c5;
				sub_245ce(sub_25b35, false);
			} else {
				cGame.var_6aac = null;
				cGame.var_6b5c = null;
			}
			cGame.var_6abc = false;
			sub_23a84(35);
			if (var_18c5 != 0 && (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 4)
					&& (var_18c5 < cGame.var_80a4[0] || var_18c5 > cGame.var_80a4[63] || var_18c5 % 2 == 1)) {
				sub_2c0fa(true);
				sub_4ad3f(var_18c5);
			}
		}
	}

	private static void sub_25043(final boolean b) {
		if (cGame.var_6aac != null) {
			cGame.var_6aac.var_18bd = false;
			if (cGame.var_6ac4) {
				cGame.var_6ac4 = false;
				cGame.var_6aac.sub_a21a(16777216);
				cGame.var_6aac.sub_aac5();
			}
			cGame.var_6aac.var_17dd = 12;
			if (cGame.var_6aa4 == 3) {
				cGame.var_6aac.var_17cd = cGame.var_6adc;
				cGame.var_6aac.var_17d5 = cGame.var_6ae4;
				if (cGame.var_6aac.var_17c5 == 54) {
					cGame.var_6aac.sub_8365(0);
				}
				sub_252cf();
			} else if (!b) {
				cGame.var_6aac.sub_4bf4();
			}
		}
		cGame.var_6aac = null;
		cGame.var_6b5c = null;
		if (cGame.var_6aa4 == 3) {
			sub_10cd1(true);
			cGame.var_6aa4 = -1;
		}
		sub_24a2c(cGame.var_6abc = false, null);
		sub_114a7(true, false, false);
		sub_2c69b();
		sub_1f8c5(1);
		sub_11737();
		cGame.var_708c = 0;
		cGame.var_7094 = 0;
	}

	private static void sub_25129() {
		if (cGame.var_6b5c != null && cGame.var_6aac != null) {
			if (cGame.var_7fd4 == 15 || cGame.var_7fd4 == 53) {
				return;
			}
			cGame.var_6b5c.SetPos(cGame.var_6aac.var_17ed, cGame.var_6aac.var_17f5);
			cGame.var_6b5c.sub_1d9e(cGame.var_7fc4);
			cGame.var_6b5c.sub_1b7f();
			GLLib.sub_5c77(false);
		}
	}

	static void sub_251a0(final int var_6af4) {
		cGame.var_6afc = -1;
		cGame.var_6bec = false;
		if (cGame.var_6af4 == 0) {
			sub_10e3f(false, 0, cGame.var_6b04);
		}
		if ((cGame.var_6af4 = var_6af4) == 0) {
			sub_10e3f(true, 0, cGame.var_6b04);
			return;
		}
		if (cGame.var_6af4 == 1) {
			cGame.var_6bec = true;
			cGame.var_6bf4 = 30;
			cGame.var_6bfc = 1;
		}
	}

	private static void sub_25213(int var_6b0c) {
		if (cGame.var_7fd4 == 45) {
			var_6b0c = 1;
		}
		final Class_h class_h = Class_h.var_6a[2];
		cGame.var_6b0c = var_6b0c;
		cGame.var_6b14 = class_h.var_82[cGame.var_6b0c][14];
		cGame.var_6b1c = class_h.var_82[cGame.var_6b0c][11];
		cGame.var_6b24 = class_h.var_82[cGame.var_6b0c][6];
		cGame.var_6b2c = class_h.var_82[cGame.var_6b0c][7];
		cGame.var_6b34 = class_h.var_82[cGame.var_6b0c][1];
		cGame.var_6b3c = class_h.var_82[cGame.var_6b0c][9];
		cGame.var_6b44 = class_h.var_82[cGame.var_6b0c][8];
		cGame.var_6b4c = class_h.var_82[cGame.var_6b0c][12];
		cGame.var_6b54 = (byte) class_h.var_82[cGame.var_6b0c][15];
	}

	private static void sub_252cf() {
		if (cGame.var_6aac.sub_a2a0(2)) {
			final Class_f[] array = new Class_f[50];
			for (int sub_56ed = Class_f.sub_56ed(0, 54, array, cGame.var_6aac), i = 0; i < sub_56ed; ++i) {
				final int[] array2 = new int[2];
				sub_2cfd6(array[i], array2, array[i].var_17cd, array[i].var_17d5);
				array[i].sub_7d3f(array2[0], array2[1]);
			}
		}
	}

	private static void sub_2534f() {
		if (!cGame.s_clickblocked) {
			Class_f.sub_3bcd();
			sub_29ee2();
			sub_25129();
			sub_1dcc1(1);
			if (cGame.var_6bec) {
				cGame.var_68d4[cGame.var_6bf4].sub_71ae(GLLib.g, cGame.var_6bfc, cGame.var_6c04,
						cGame.var_6c0c, 0);
			}
		}
	}

	private static void sub_253a8() {
		if (cGame.var_7cb4 == 0) {
			if (GLLib.sub_7848()) {
				cGame.var_7cb4 = 1;
			} else {
				cGame.var_7cb4 = 2;
			}
		}
		if (cGame.var_7cb4 == 1) {
			cGame.var_7cb4 = 2;
			cGame.var_7ccc = false;
			cGame.var_7d24 = true;
			sub_81e0(34);
			cGame.var_815c = true;
		}
		if (cGame.var_6914[3] != null && !sub_2351a(3, 1) && cGame.var_6b8c > 6) {
			if (cGame.var_6914[3][8] < -60) {
				sub_26509(1);
			} else if (cGame.var_6914[3][8] > 60) {
				sub_26509(-1);
			}
		}
		final int n = cGame.var_6f7c & 0xFFFF;
		if ((cGame.var_6f7c >> 16 & 0xFFFF) == 0x1 && n == 71) {
			cGame.var_6bec = true;
			final int n2 = cGame.var_6914[3][0] >> 16 & 0xFFFF;
			final int n3 = cGame.var_6914[3][0] & 0xFFFF;
			final int n4 = cGame.var_6914[3][1] & 0xFFFF;
			int n5 = Integer.MAX_VALUE;
			int n6 = 0;
			for (int i = n3 + 1; i <= n4; ++i) {
				final int n7;
				if (cGame.var_68bc[n2][i][10] == 1 && (n7 = (cGame.var_68bc[n2][i][2] - cGame.var_6914[3][10])
						* (cGame.var_68bc[n2][i][2] - cGame.var_6914[3][10])
						+ (cGame.var_68bc[n2][i][3] - cGame.var_6914[3][11])
								* (cGame.var_68bc[n2][i][3] - cGame.var_6914[3][11])) < n5) {
					n6 = i;
					n5 = n7;
				}
			}
			final int n8 = n2 << 16 | (((n6 < n3 + 1) ? (n3 + 1) : ((n6 > n4) ? n4 : n6)) & 0xFFFF);
			cGame.var_6bf4 = cGame.var_68bc[n8 >> 16 & 0xFFFF][n8 & 0xFFFF][5];
			cGame.var_6bfc = cGame.var_68bc[n8 >> 16 & 0xFFFF][n8 & 0xFFFF][6];
		}
		if (cGame.var_6bec) {
			cGame.var_6c04 = GLLib.s_screenX;
			cGame.var_6c0c = GLLib.s_screenY;
			if (cGame.var_6bf4 == 30) {
				cGame.var_6c0c -= 50;
			}
		}
		cGame.var_800c.sub_692a();
		Class_f.sub_1a7a();
		cGame.var_813c = false;
		Class_f.sub_4b09(0);
		sub_2edea();
		if (cGame.var_8034 != null) {
			final short n9 = cGame.var_68bc[1][0][2];
			final short n10 = cGame.var_68bc[1][0][3];
			final int[] array = new int[2];
			final int[] array2 = new int[2];
			array[0] = cGame.var_8034.var_17cd;
			array[1] = cGame.var_8034.var_17d5;
			array2[0] = array[0] * cGame.var_7fc4 / 100 - cGame.var_800c.var_17cd;
			array2[1] = array[1] * cGame.var_7fc4 / 100 - cGame.var_800c.var_17d5;
			for (int j = 0; j <= 7; ++j) {
				cGame.var_68bc[1][j][2] = (short) (array2[0] + cGame.var_7aa4[j << 1]);
				cGame.var_68bc[1][j][3] = (short) (array2[1] + cGame.var_7aa4[(j << 1) + 1]);
			}
			sub_1f7a3(1, 1, 0, cGame.var_8044 = ((cGame.var_8044 < 0) ? 0
					: ((cGame.var_8044 > 100) ? 100 : cGame.var_8044)));
			if (n9 != cGame.var_68bc[1][0][2] || n10 != cGame.var_68bc[1][0][3]) {
				sub_2c69b();
				sub_1f8c5(1);
			}
			cGame.var_68cc[1][7] = cGame.s_plantGrowTime;
			cGame.var_68cc[1][5] = Integer.toString(cGame.var_8034.var_18cd);
		}
		sub_26854();
		if (cGame.var_6b5c != null) {
			cGame.var_6b5c.sub_1ca1(GLLib.s_game_frameDT);
			if (cGame.var_6aac != null) {
				final int[] array3 = new int[2];
				final int[] array4 = new int[2];
				array3[0] = cGame.var_6aac.var_17cd;
				array3[1] = cGame.var_6aac.var_17d5;
				array4[0] = array3[0] * cGame.var_7fc4 / 100 - cGame.var_800c.var_17cd;
				array4[1] = array3[1] * cGame.var_7fc4 / 100 - cGame.var_800c.var_17d5;
				cGame.var_68bc[1][62][2] = (short) (array4[0] - 67);
				cGame.var_68bc[1][62][3] = (short) (array4[1] + 75 * cGame.var_7fc4 / 100);
				cGame.var_68bc[1][63][2] = (short) (array4[0] + 23);
				cGame.var_68bc[1][63][3] = (short) (array4[1] + 75 * cGame.var_7fc4 / 100);
				sub_2340c(1, 62);
				sub_2340c(1, 63);
				if (!sub_2cad2(cGame.var_6aac)) {
					cGame.var_68bc[1][62][6] = 38;
					cGame.var_68bc[1][62][18] = 1;
				} else {
					cGame.var_68bc[1][62][6] = 39;
					cGame.var_68bc[1][62][18] = 0;
				}
			}
		}
		GLLibPlayer.sub_3b5c(null, 0, 0, 0);
		sub_23dba();
		if (cGame.var_68bc[1][78][10] != 0) {
			if (cGame.var_79ec < 100) {
				if (System.currentTimeMillis() - cGame.var_79ec > 1000L && !cGame.var_7a8c) {
					sub_23a84(62);
					cGame.var_7a8c = true;
				}
				++cGame.var_79ec;
				if (cGame.var_68bc[1][78][2] == cGame.var_7a4c && cGame.var_68bc[1][78][18] == 0) {
					cGame.var_68bc[1][78][18] = 1;
					sub_2c69b();
					sub_1f8c5(1);
				}
			} else {
				sub_3d6da(cGame.var_7a8c = false, -1);
			}
		}
		if (sub_20167(1, 87)) {
			if (cGame.var_7a6c == 1) {
				final long currentTimeMillis;
				if ((currentTimeMillis = System.currentTimeMillis()) - cGame.var_7a54 > 10L && !cGame.var_7a8c) {
					sub_23a84(62);
					cGame.var_7a8c = true;
				}
				if (currentTimeMillis - cGame.var_7a54 > 5000L) {
					sub_3e690(false, -1);
				}
			} else if (cGame.var_7a6c == 2) {
				if (cGame.var_68bc[1][87][2] > GLLib.s_screenWidth) {
					sub_3e7c1();
				}
				if (System.currentTimeMillis() - cGame.var_7a54 > 5000L) {
					sub_3e690(false, -1);
				}
			} else {
				sub_3e7c1();
			}
		}
		sub_2df93();
		final Class_f[] array5 = { null };
		Class_f.sub_545c(0, 50, 14, array5, 1);
		if (array5[0] != null && array5[0].var_15cd && !sub_376da()) {
			array5[0].var_15cd = false;
			array5[0].sub_aa8a();
		}
		if (cGame.var_6c84) {
			sub_1f7a3(1, 18, 17, 100 * getExperience() / sub_2e8f8());
			cGame.var_6c84 = false;
		}
	}

	private static Class_f sub_25a26(final int n, final int n2, final boolean b) {
		final int[] array = new int[2];
		final int[] array2;
		(array2 = new int[2])[0] = GLLib.s_screenWidth >> 1;
		array2[1] = GLLib.s_screenHeight >> 1;
		sub_26427(array2, array);
		sub_2c867(array, array2);
		sub_2c8b0(array2, array);
		return sub_25a75(49, 0, array[0], array[1], b);
	}

	private static Class_f sub_25a75(final int n, final int n2, final int n3, final int n4, final boolean b) {
		final int[] array = { n3, n4, 11 };
		if (n == 50 || n == 54 || n == 48 || n == 22) {
			array[2] = 12;
		}
		final Class_f sub_92ea = Class_f.sub_92ea(n, 0, array);
		final int[] array2 = new int[2];
		array2[0] = n3;
		array2[1] = n4;
		sub_2cfd6(sub_92ea, array2, array2[0], array2[1]);
		sub_92ea.var_17cd = array2[0];
		sub_92ea.var_17d5 = array2[1];
		if (b && cGame.var_7fd4 == -1) {
			cGame.var_800c.sub_6b0c(array2[0], array2[1], 1000);
		}
		return sub_92ea;
	}

	private static Class_f sub_25b35(int n, final int n2) {
		Class_f class_f = null;
		final int[] array = new int[2];
		final int[] array2;
		(array2 = new int[2])[0] = GLLib.s_screenWidth >> 1;
		array2[1] = GLLib.s_screenHeight >> 1;
		sub_26427(array2, array);
		sub_2c867(array, array2);
		sub_2c8b0(array2, array);
		final Class_h class_h = Class_h.var_6a[n];
		switch (n) {
		case 2: {
			(class_f = Class_f.sub_92ea(52, 0, new int[] { array[0], array[1], 12, class_h.var_82[n2][9],
					class_h.var_82[n2][19], class_h.var_82[n2][20] })).var_1835 = n2;
			class_f.var_18c5 = class_h.var_82[n2][1];
			class_f.var_188d = class_h.var_82[n2][14];
			class_f.var_1605 = class_h.var_82[n2][12];
			class_f.var_191d = class_h.var_82[n2][11];
			class_f.var_18cd = (byte) class_h.var_82[n2][15];
			class_f.var_187d = (byte) class_h.var_82[n2][9];
			class_f.var_1885 = (byte) class_h.var_82[n2][10];
			if (n2 >= 12) {
				break;
			}
			break;
		}
		case 0: {
			(class_f = Class_f.sub_92ea(54, 0,
					new int[] { array[0], array[1], 12, class_h.var_82[n2][27], class_h.var_82[n2][28],
							class_h.var_82[n2][31], class_h.var_82[n2][32], class_h.var_82[n2][34],
							class_h.var_82[n2][19], class_h.var_82[n2][33], class_h.var_82[n2][35],
							class_h.var_82[n2][36] })).var_1835 = n2;
			class_f.sub_7ed6();
			if (class_h.var_82[n2][34] == 1) {
				class_f.sub_7f11();
			} else {
				class_f.var_162d = class_h.var_82[n2][14];
				class_f.var_167d = class_h.var_82[n2][17];
				class_f.var_164d = class_h.var_82[n2][24];
			}
			class_f.var_1635 = 0;
			class_f.var_18c5 = class_h.var_82[n2][1];
			final Class_f class_f2 = class_f;
			n = class_h.var_82[n2][31];
			short var_1685 = 0;
			if (n == 7) {
				var_1685 = 0;
			} else if (n == 8) {
				var_1685 = 1;
			} else if (n == 19) {
				var_1685 = 2;
			} else if (n == 18) {
				var_1685 = 3;
			} else if (n == 20) {
				var_1685 = 4;
			} else if (n == 17) {
				var_1685 = 5;
			} else if (n == 5) {
				var_1685 = 5;
			}
			class_f2.var_1685 = var_1685;
			class_f.var_18d5 = (byte) class_h.var_82[n2][37];
			if (class_f.var_1835 >= 2 && class_f.var_1835 <= 3) {
				class_f.var_18d5 = 21;
			}
			class_f.var_182d = (short) class_h.var_82[n2][12];
			class_f.var_169d = (short) class_h.var_82[n2][29];
			class_f.var_16a5 = (short) class_h.var_82[n2][30];
			final ASprite class_e;
			final short n3 = (class_e = cGame.var_7ff4[class_h.var_82[n2][31]]).var_faf[class_f.var_169d];
			class_f.var_16ad = class_e.sub_30ea(n3);
			class_f.var_16b5 = class_e.sub_310b(n3);
			final short n4 = class_e.var_faf[class_f.var_16a5];
			class_f.var_16bd = class_e.sub_30ea(n4);
			class_f.var_16c5 = class_e.sub_310b(n4);
			if (class_h.var_82[n2][19] != 5 && class_h.var_82[n2][19] != 110) {
				class_f.var_16e5 = class_h.var_82[n2][18];
			}
			if (class_h.var_82[n2][22] != 5 && class_h.var_82[n2][22] != 110) {
				class_f.var_16ed = class_h.var_82[n2][21];
			}
			break;
		}
		case 3: {
			(class_f = Class_f.sub_92ea(50, 0,
					new int[] { array[0], array[1], 12, n2, class_h.var_82[n2][25], class_h.var_82[n2][26],
							class_h.var_82[n2][23], class_h.var_82[n2][24], class_h.var_82[n2][27],
							class_h.var_82[n2][28], class_h.var_82[n2][29] })).var_18c5 = class_h.var_82[n2][1];
			if (class_f.var_1835 == 12 || class_f.var_1835 == 11) {
				class_f.var_15c5 = System.currentTimeMillis() / 1000L;
				class_f.var_15cd = false;
			}
			break;
		}
		case 4: {
			(class_f = Class_f.sub_92ea(20, 0,
					new int[] { array[0], array[1], class_h.var_82[n2][15], class_h.var_82[n2][0],
							class_h.var_82[n2][12], class_h.var_82[n2][13], class_h.var_82[n2][11],
							class_h.var_82[n2][9], class_h.var_82[n2][10], class_h.var_82[n2][16],
							class_h.var_82[n2][17] })).var_1835 = n2;
			class_f.var_18c5 = class_h.var_82[n2][1];
			break;
		}
		case 9: {
			(class_f = Class_f.sub_92ea(51, 0,
					new int[] { array[0], array[1], class_h.var_82[n2][4], class_h.var_82[n2][0], class_h.var_82[n2][1],
							class_h.var_82[n2][2], class_h.var_82[n2][3] })).var_1835 = n2;
			break;
		}
		case 8: {
			(class_f = Class_f.sub_92ea(42, 0,
					new int[] { array[0], array[1], 12, class_h.var_82[n2][3] })).var_1835 = n2;
			break;
		}
		case 11: {
			if (n2 == -1) {
				(class_f = Class_f.sub_92ea(22, 0, new int[] { array[0], array[1], 12 })).var_1835 = n2;
				class_f.var_18c5 = -1;
				break;
			}
			if (n2 >= 4 && n2 <= 50) {
				(class_f = Class_f.sub_92ea(22, 0, new int[] { array[0], array[1], 12 })).var_1835 = n2;
				class_f.var_18c5 = class_h.var_82[n2][1];
				break;
			}
			(class_f = Class_f.sub_92ea(48, 0, new int[] { array[0], array[1], 12, class_h.var_82[n2][7],
					class_h.var_82[n2][8], class_h.var_82[n2][9] })).var_1835 = n2;
			class_f.var_18c5 = class_h.var_82[n2][1];
			break;
		}
		case 15: {
			(class_f = Class_f.sub_92ea(32, 0,
					new int[] { array[0], array[1], class_h.var_82[n2][7], class_h.var_82[n2][1], class_h.var_82[n2][2],
							class_h.var_82[n2][4], class_h.var_82[n2][5], class_h.var_82[n2][3],
							class_h.var_82[n2][6] })).var_1835 = n2;
			break;
		}
		case 28: {
			(class_f = Class_f.sub_92ea(34, 0, new int[] { 90, class_h.var_82[n2][1], class_h.var_82[n2][2],
					class_h.var_82[n2][3], class_h.var_82[n2][4] })).var_1835 = n2;
			break;
		}
		}
		return class_f;
	}

	static void sub_26427(final int[] array, final int[] array2) {
		if (cGame.var_7fc4 == 100) {
			array2[0] = cGame.var_800c.var_17cd + array[0];
			array2[1] = cGame.var_800c.var_17d5 + array[1];
			return;
		}
		if (cGame.var_7fc4 == 50) {
			array2[0] = cGame.var_800c.var_17cd + array[0] << 1;
			array2[1] = cGame.var_800c.var_17d5 + array[1] << 1;
			return;
		}
		array2[0] = (cGame.var_800c.var_17cd + array[0]) * 100 / cGame.var_7fc4;
		array2[1] = (cGame.var_800c.var_17d5 + array[1]) * 100 / cGame.var_7fc4;
	}

	static void sub_264d4(final int[] array, final int[] array2) {
		array2[0] = array[0] - cGame.var_800c.var_17cd;
		array2[1] = array[1] - cGame.var_800c.var_17d5;
	}

	private static void sub_26509(final int n) {
		if (cGame.var_7fd4 != 45) {
			cGame.var_6b64 = (cGame.var_6b64 += n) % cGame.var_6b8c;
		}
		final int n2 = cGame.var_6914[3][8];
		sub_111ae();
		cGame.var_6914[3][8] = n2 + (cGame.var_68bc[1][66][2] - cGame.var_68bc[1][65][2]) * n;
		sub_23105(3);
	}

	private static void sub_2657c(final boolean b) {
		if (sub_20167(1, 12)) {
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " "), 1, 13, 0, 0);
		}
		if (sub_20167(1, 21)) {
			if (!b || cGame.var_807c <= 10) {
				if (getLevel() < 50) {
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(getExperience(), cGame.var_7fe4, " ") + " / "
							+ GLLib.CurrencySeparator_just_a_guess(sub_2e8f8(), cGame.var_7fe4, " "), 1, 22, 0, 0);
				}
				sub_1df06("" + getLevel(), 1, 23, 0, 0);
			} else {
				sub_1df06("" + 0, 1, 23, 0, 0);
			}
		}
		if (sub_20167(1, 15)) {
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " "), 1, 16, 0, 0);
		}
		if (sub_20167(1, 87)) {
			final String sub_4e1f;
			sub_1e2f2(((sub_4e1f = GLLib.TODO_sub_4e1f(458)) == null) ? "" : sub_4e1f, 1, 88, 0, 0);
			return;
		}
		if (sub_20167(1, 78)) {
			for (int i = 0; i < 4; ++i) {
				sub_1df06("" + cGame.var_7a24[i], 1, 79 + (i << 1), 0, 0);
			}
		}
	}

	private static void sub_26716() {
		if (cGame.var_6b9c && sub_20167(1, 45)) {
			sub_1df06(cGame.var_6ba4, 1, 46, 0, 0);
		}
		if (cGame.var_6bd4) {
			if (sub_20167(1, 47)) {
				final String sub_4e1f;
				sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(152)) == null) ? "" : sub_4e1f, 1, 51, 0, 0);
			}
			if (sub_20167(1, 48)) {
				final String sub_4e1f2;
				sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(152)) == null) ? "" : sub_4e1f2, 1, 52, 0, 0);
			}
			if (sub_20167(1, 49)) {
				final String sub_4e1f3;
				sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(152)) == null) ? "" : sub_4e1f3, 1, 53, 0, 0);
			}
			if (sub_20167(1, 50)) {
				final String sub_4e1f4;
				sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(152)) == null) ? "" : sub_4e1f4, 1, 54, 0, 0);
			}
		}
	}

	private static void sub_26854() {
		if (cGame.var_6b9c && sub_20167(1, 45)) {
			final long currentTimeMillis = System.currentTimeMillis();
			if (cGame.var_6bac < currentTimeMillis) {
				sub_26a6a(cGame.var_6b9c = false, cGame.var_7f6c, '\0');
			}
			cGame.var_6bbc = (short) ((cGame.var_6bb4 = (short) (cGame.var_68bc[1][44][2] + 80
					+ (10 + GLLib.Math_Cos(
							GLLib.Math_Angle90 - (int) ((cGame.var_6bac - currentTimeMillis) / 5L % 255L)) / 20)))
					+ 15);
			cGame.var_68bc[1][45][2] = cGame.var_6bb4;
			cGame.var_68bc[1][46][2] = cGame.var_6bbc;
		}
		if (cGame.var_6bd4) {
			cGame.var_6bbc = (short) ((cGame.var_6bb4 = (short) (cGame.var_68bc[1][44][2] + 80
					+ (10 + GLLib.Math_Cos(GLLib.Math_Angle90 - (int) (System.currentTimeMillis() / 5L % 255L)) / 20)))
					+ 15);
			cGame.var_68bc[1][47][2] = cGame.var_6bb4;
			cGame.var_68bc[1][48][2] = cGame.var_6bb4;
			cGame.var_68bc[1][49][2] = cGame.var_6bb4;
			cGame.var_68bc[1][50][2] = cGame.var_6bb4;
			cGame.var_68bc[1][47][3] = (short) (cGame.var_68bc[1][39][3] - 16);
			cGame.var_68bc[1][48][3] = (short) (cGame.var_68bc[1][40][3] - 16);
			cGame.var_68bc[1][49][3] = (short) (cGame.var_68bc[1][41][3] - 16);
			cGame.var_68bc[1][50][3] = (short) (cGame.var_68bc[1][42][3] - 16);
			cGame.var_68bc[1][51][2] = cGame.var_6bbc;
			cGame.var_68bc[1][52][2] = cGame.var_6bbc;
			cGame.var_68bc[1][53][2] = cGame.var_6bbc;
			cGame.var_68bc[1][54][2] = cGame.var_6bbc;
			cGame.var_68bc[1][51][3] = (short) (cGame.var_68bc[1][39][3] - 21);
			cGame.var_68bc[1][52][3] = (short) (cGame.var_68bc[1][40][3] - 21);
			cGame.var_68bc[1][53][3] = (short) (cGame.var_68bc[1][41][3] - 21);
			cGame.var_68bc[1][54][3] = (short) (cGame.var_68bc[1][42][3] - 21);
		}
	}

	private static void sub_26a6a(boolean var_6b9c, int i, final char c) {
		final int sub_8396;
		if ((sub_8396 = sub_8396()) != 17 && sub_8396 != 18 && var_6b9c) {
			cGame.var_6bc4 = true;
			cGame.var_6bcc = c;
			cGame.var_7f6c = i;
			return;
		}
		if (sub_20167(1, 44)) {
			cGame.var_6b9c = var_6b9c;
		} else if (var_6b9c) {
			cGame.var_6bc4 = true;
			cGame.var_6bcc = c;
			var_6b9c = false;
		}
		if (var_6b9c) {
			cGame.var_7f6c = i;
			if (c == '\u0001') {
				final String sub_4e1f;
				cGame.var_6ba4 = (((sub_4e1f = GLLib.TODO_sub_4e1f(152)) == null) ? "" : sub_4e1f);
			} else if (c == '\u0002') {
				final String sub_4e1f2;
				cGame.var_6ba4 = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(153)) == null) ? "" : sub_4e1f2);
			} else {
				cGame.var_6ba4 = "%Task%";
			}
			cGame.var_6bac = System.currentTimeMillis() + 5000L;
			sub_2000c(1, 45, true);
			sub_2024d(1, 45, true);
			sub_2000c(1, 46, true);
			sub_23a84(42);
		} else {
			sub_2000c(1, 45, false);
			sub_2024d(1, 45, false);
		}
		int n = -1;
		for (i = 0; i < cGame.var_7f74; ++i) {
			if (cGame.var_7f5c[i] == 3) {
				n = i;
			}
		}
		final int var_7f6c;
		if ((var_7f6c = n) != -1) {
			cGame.var_7f6c = var_7f6c;
			sub_81e0(26);
			cGame.var_6bc4 = false;
			cGame.var_6bcc = '\0';
			sub_2000c(1, 45, false);
			sub_2024d(1, 45, false);
		}
		final int n2 = 65581;
		if (cGame.var_6f74 != null) {
			for (i = 0; i < cGame.var_6f74.length; ++i) {
				if (cGame.var_6f74[i] != null && cGame.var_6f74[i][5] == n2) {
					sub_2c718(i);
					break;
				}
			}
		}
		sub_2c69b();
		sub_1f8c5(1);
	}

	private static void sub_26c8e() {
		if (cGame.var_6c9c != null || cGame.var_6ca4 != -1) {
			sub_27072();
		}
		switch (cGame.var_6c5c) {
		case 160: {
			if (!sub_202b7(1, 44) && sub_4ace8() > 0) {
				sub_2024d(1, 44, true);
				sub_4932b();
			}
			if (cGame.var_6c64 == 1 && sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2c69b();
				sub_1f8c5(1);
				return;
			}
			break;
		}
		case 161: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c7c = false;
				if (sub_8396() == 17) {
					final Class_f[] array = { null };
					Class_f.sub_545c(0, 50, 18, array, 1);
					if (array[0] != null) {
						cGame.var_800c.sub_6b0c(array[0].var_17cd, array[0].var_17d5, 1000);
					}
				}
			}
			if (cGame.var_800c.var_185d == 1) {
				cGame.var_6c7c = true;
			} else if (cGame.var_800c.var_185d == 0 && cGame.var_6c7c) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				++cGame.var_6c5c;
				cGame.var_6c8c = (cGame.var_6c94 = false);
				return;
			}
			break;
		}
		case 162: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f;
				sub_40279(((sub_4e1f = GLLib.TODO_sub_4e1f(19)) == null) ? "" : sub_4e1f, 15, 0);
			}
			if (cGame.var_6c94) {
				++cGame.var_6c5c;
				cGame.var_6c8c = (cGame.var_6c94 = false);
			}
			cGame.var_6c94 = true;
			return;
		}
		case 163: {
			if (!cGame.var_6c8c) {
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
				if (sub_8396() == 17) {
					final Class_f[] array2 = { null };
					Class_f.sub_545c(0, 50, 18, array2, 1);
					sub_28c2e(array2[0], 0, -50);
				}
			}
			if (sub_8396() == 17 && sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2c69b();
				sub_1f8c5(1);
				return;
			}
			break;
		}
		case 164: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				return;
			}
			break;
		}
		case 166: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_28ca1();
				cGame.var_6c5c = 160;
				cGame.var_6c8c = (cGame.var_6c94 = false);
				return;
			}
			break;
		}
		case 167: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f2;
				sub_40279(((sub_4e1f2 = GLLib.TODO_sub_4e1f(25)) == null) ? "" : sub_4e1f2, 7, 0);
				final Class_f[] array3 = { null };
				Class_f.sub_545c(0, 50, 15, array3, 1);
				if (array3[0] != null) {
					cGame.var_800c.sub_6b0c(array3[0].var_17cd, array3[0].var_17d5, 1000);
				}
			}
			if (cGame.var_6c94) {
				cGame.var_6c8c = (cGame.var_6c94 = false);
				++cGame.var_6c5c;
			}
			cGame.var_6c94 = true;
			return;
		}
		case 168: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				final Class_f[] array4 = { null };
				Class_f.sub_545c(0, 50, 15, array4, 1);
				if (array4[0] != null) {
					sub_28c2e(array4[0], 0, -70);
				}
			}
			if (cGame.var_6c94) {
				cGame.var_6c8c = (cGame.var_6c94 = false);
				cGame.var_6c5c = 160;
				sub_28ca1();
				return;
			}
			break;
		}
		case 169: {
			if (cGame.var_807c == 0) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = true;
			}
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_2000c(1, 10, true);
			}
			if (cGame.var_6c94) {
				cGame.var_6c54 = false;
				cGame.var_6c8c = (cGame.var_6c94 = false);
				cGame.var_6c5c = 160;
				sub_2000c(1, 10, false);
				break;
			}
			break;
		}
		}
	}

	private static int sub_27009(final int n, final int n2) {
		if (n == 0) {
			return n2 * cGame.var_8064[14] / cGame.var_8064[8];
		}
		return n / cGame.var_8064[8];
	}

	private static int sub_27050(final int n) {
		return cGame.var_806c[n - 4];
	}

	private static void sub_27072() {
		if (cGame.var_6c9c != null) {
			cGame.var_68bc[1][9][2] = (short) ((cGame.var_6c9c.var_17cd + cGame.var_6cac) * cGame.var_7fc4 / 100
					- cGame.var_800c.var_17cd);
			cGame.var_68bc[1][9][3] = (short) ((cGame.var_6c9c.var_17d5 + cGame.var_6cb4) * cGame.var_7fc4 / 100
					- cGame.var_800c.var_17d5);
			return;
		}
		if (cGame.var_68bc[1][cGame.var_6ca4] != null) {
			final int n = cGame.var_68bc[1][cGame.var_6ca4][2] + cGame.var_6cac;
			final int n2 = cGame.var_68bc[1][cGame.var_6ca4][3] + cGame.var_6cb4;
			cGame.var_68bc[1][9][2] = (short) n;
			cGame.var_68bc[1][9][3] = (short) n2;
		}
	}

	private static void sub_27132() {
		sub_2000c(1, 12, false);
		sub_2000c(1, 21, false);
		sub_2000c(1, 15, false);
		sub_2000c(1, 26, false);
		sub_2000c(1, 44, false);
		sub_10c1f(false);
		sub_2000c(1, 59, false);
		sub_2000c(1, 37, false);
		sub_2000c(1, 30, false);
		sub_2000c(1, 60, false);
		sub_2024d(1, 60, false);
		sub_2000c(1, 11, false);
		sub_2000c(1, 14, false);
		sub_2000c(1, 24, false);
		sub_2000c(1, 17, false);
		sub_2000c(1, 18, false);
		sub_2000c(1, 25, false);
		sub_2000c(1, 28, false);
		sub_2000c(1, 29, false);
		sub_2024d(1, 44, false);
		sub_2024d(1, 59, false);
		sub_2c69b();
		sub_1f8c5(1);
	}

	private static void sub_271e4(final int n) {
		sub_2000c(1, 12, true);
		sub_2000c(1, 21, true);
		sub_2000c(1, 15, true);
		sub_2000c(1, 26, false);
		sub_2000c(1, 44, false);
		sub_10c1f(false);
		sub_2000c(1, 59, false);
		sub_2000c(1, 11, true);
		sub_2000c(1, 14, cGame.s_iapEnabled);
		sub_2000c(1, 24, false);
		if (getLevel() >= 50) {
			sub_2000c(1, 17, false);
			sub_2000c(1, 18, false);
		} else {
			sub_2000c(1, 17, true);
			sub_2000c(1, 18, true);
		}
		sub_2000c(1, 25, false);
		sub_2000c(1, 28, false);
		sub_2000c(1, 29, false);
		sub_2024d(1, 44, false);
		sub_2024d(1, 59, false);
		sub_2024d(1, 63, false);
		sub_2024d(1, 11, false);
		sub_2024d(1, 14, false);
		cGame.var_68bc[1][30][10] = 0;
		if (n == 40 || n == 13) {
			sub_2000c(1, 59, true);
			sub_2024d(1, 59, true);
		}
		sub_2c69b();
		sub_1f8c5(1);
	}

	private static void sub_272f4(final int n) {
		sub_2000c(10, 56, false);
		sub_2024d(10, 56, false);
		sub_2000c(10, 63, false);
		sub_2024d(10, 63, false);
		sub_2024d(10, 3, false);
		sub_2024d(10, 4, false);
		sub_2024d(10, 5, false);
		if (n == 51) {
			sub_2000c(10, 67, true);
		} else if (n == 50) {
			sub_2024d(10, 5, true);
			sub_2000c(10, 68, true);
		}
		sub_2c69b();
		sub_1fb8e(10);
		sub_234cb(0, 1);
	}

	private static void sub_2738d() {
		++cGame.var_7fd4;
		cGame.var_6c8c = (cGame.var_6c94 = false);
	}

	private static void sub_273b8() {
		switch (cGame.var_7fd4) {
		case 1: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_70e4 &= 0xFFFFFF00;
				sub_27132();
				final Class_f[] array = new Class_f[20];
				for (int sub_5439 = Class_f.sub_5439(0, 49, array, 20), i = 0; i < sub_5439; ++i) {
					array[i].sub_7795(5);
				}
				cGame.var_6cec = 1944;
				cGame.var_6cf4 = 900;
				cGame.var_6cfc = 2088;
				cGame.var_6d04 = 972;
				sub_2024d(22, 3, false);
				sub_2024d(22, 7, false);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_7fd4 = 2;
			}
			cGame.var_6c94 = true;
			return;
		}
		case 2: {
			if (!cGame.var_6c8c && cGame.var_800c.var_185d == 0) {
				cGame.var_70e4 &= 0xFFFFFF00;
				sub_27132();
				sub_4052e(2, 3, 7, 0);
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
			}
			if (cGame.var_6c94) {
				cGame.var_8004.sub_a21a(8);
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 3: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_271e4(cGame.var_7fd4);
				final String sub_4e1f;
				sub_40279(((sub_4e1f = GLLib.TODO_sub_4e1f(4)) == null) ? "" : sub_4e1f, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_7fd4 = 5;
			}
			cGame.var_6c94 = true;
			return;
		}
		case 4: {
			if (!cGame.var_6c8c) {
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
				final Class_f[] array2 = new Class_f[5];
				Class_f.sub_5439(0, 49, array2, 5);
				if (array2[1] != null) {
					sub_28c2e(array2[1], 35, -100);
					cGame.var_800c.sub_6b0c(array2[1].var_17cd, array2[1].var_17d5, 1000);
				}
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 5: {
			if (!cGame.var_6c8c) {
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
				cGame.var_70e4 |= 0x2;
				cGame.var_6ccc = true;
				cGame.var_6cdc = 30;
				cGame.var_6ce4 = 1;
				cGame.var_6d34 = 0;
				cGame.var_6d2c = 0;
				cGame.var_6cec = cGame.var_68bc[1][71][2] + cGame.var_800c.var_17cd;
				cGame.var_6cf4 = cGame.var_68bc[1][71][3] + cGame.var_800c.var_17d5;
				cGame.var_6cec = 2088;
				cGame.var_6cf4 = 972;
				cGame.var_6cfc = 1944;
				cGame.var_6d04 = 900;
				cGame.var_6cbc = 0;
			}
			final Class_f[] array3 = { null };
			Class_f.sub_5439(2, 47, array3, 1);
			if (cGame.var_6cbc >= 6 && array3[0] == null) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_7fd4 = 6;
				cGame.var_70e4 &= 0xFFFFFFFD;
			}
			return;
		}
		case 6: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f2;
				sub_40279(((sub_4e1f2 = GLLib.TODO_sub_4e1f(6)) == null) ? "" : sub_4e1f2, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 7: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				final Class_f[] array4 = new Class_f[3];
				Class_f.sub_5439(0, 49, array4, 3);
				if (array4[1] != null) {
					sub_28c2e(array4[1], 0, -50);
					cGame.var_800c.sub_6b0c(array4[1].var_17cd, array4[1].var_17d5, 1000);
				}
				cGame.var_70e4 |= 0x1;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				cGame.var_70e4 &= 0xFFFFFFFE;
				return;
			}
			break;
		}
		case 8: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final int[] array5 = new int[2];
				final int[] array6 = new int[2];
				array5[0] = cGame.var_68bc[1][71][2];
				array5[1] = cGame.var_68bc[1][71][3];
				sub_26427(array5, array6);
				cGame.var_6cec = array6[0];
				cGame.var_6cf4 = array6[1];
				cGame.var_6d0c = 2088;
				cGame.var_6d14 = 972;
				cGame.var_6cfc = 1944;
				cGame.var_6d04 = 900;
				cGame.var_6ccc = true;
				cGame.var_6cdc = 9;
				cGame.var_6ce4 = 4;
				cGame.var_6d34 = 1;
				cGame.var_6d2c = 0;
				cGame.var_70e4 |= 0x1;
				sub_251a0(cGame.var_6b04 = 0);
				sub_234cb(3, 1);
				cGame.var_6cbc = 0;
			}
			final Class_f[] array7 = { null };
			Class_f.sub_5439(2, 47, array7, 1);
			if (cGame.var_6cbc >= 6 && array7[0] == null) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_10e3f(false, 0, cGame.var_6b04);
				cGame.var_70e4 &= 0xFFFFFFFE;
				sub_2738d();
			}
			return;
		}
		case 9: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_4052e(17, 18, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 10: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_49758();
				sub_2000c(1, 56, true);
				sub_2000c(1, 44, true);
				sub_2024d(1, 44, true);
				sub_2c69b();
				sub_1fb8e(1);
			}
			if (cGame.var_6c94) {
				sub_2000c(1, 56, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 11: {
			if (!cGame.var_6c8c) {
				sub_2000c(1, 57, cGame.var_6c8c = true);
			}
			if (cGame.var_6c94) {
				sub_2000c(1, 57, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 12: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				return;
			}
			break;
		}
		case 13: {
			if (!cGame.var_6c8c) {
				sub_2024d(1, 44, false);
				cGame.var_6c8c = true;
				sub_28ca1();
				sub_2000c(1, 61, true);
				sub_2c69b();
				sub_1fb8e(1);
			}
			if (sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2024d(1, 59, true);
				sub_2c69b();
				sub_1fb8e(1);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				return;
			}
			break;
		}
		case 14: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
			}
			if (cGame.var_6aac != null && cGame.var_6aac.var_17c5 == 54 && cGame.var_6aac.var_1835 == 16) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				return;
			}
			break;
		}
		case 15: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_70e4 &= 0xFFFFFFFD;
				final int[] array8 = new int[2];
				final int[] array9;
				(array9 = new int[2])[0] = 27;
				array9[1] = 31;
				sub_2c8b0(array9, array8);
				cGame.var_6aac.var_17cd = array8[0];
				cGame.var_6aac.var_17d5 = array8[1];
				cGame.var_800c.sub_6b0c(cGame.var_6aac.var_17cd, cGame.var_6aac.var_17d5, 1000);
				sub_28ca1();
				sub_2000c(1, 61, false);
				sub_2000c(1, 63, false);
				sub_2024d(1, 63, false);
				sub_2024d(1, 44, false);
				sub_2024d(1, 59, false);
				sub_2024d(1, 45, false);
				sub_2c69b();
				sub_1fb8e(1);
			}
			if (cGame.var_6c94 = (cGame.var_6aac == null)) {
				sub_2738d();
				return;
			}
			break;
		}
		case 16: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f3;
				sub_40279(((sub_4e1f3 = GLLib.TODO_sub_4e1f(5)) == null) ? "" : sub_4e1f3, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 17: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final Class_f[] array10 = { null };
				Class_f.sub_545c(0, 54, 16, array10, 1);
				sub_28c2e(array10[0], -30, -185);
			}
			if (sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2024d(1, 45, false);
				sub_2024d(1, 59, false);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 18: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final Class_f[] array11 = { null };
				Class_f.sub_545c(0, 54, 16, array11, 1);
				if (array11[0] != null) {
					sub_11320(true, array11[0]);
					sub_28c64();
				}
			}
			if (sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2024d(1, 45, false);
				sub_2024d(1, 59, false);
				sub_2c69b();
				sub_1fb8e(1);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 19: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f4;
				sub_40279(((sub_4e1f4 = GLLib.TODO_sub_4e1f(16)) == null) ? "" : sub_4e1f4, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 20: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f5;
				sub_40279(((sub_4e1f5 = GLLib.TODO_sub_4e1f(20)) == null) ? "" : sub_4e1f5, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 21: {
			if (!cGame.var_6c8c) {
				sub_10cd1(false);
				sub_26a6a(false, cGame.var_7f6c, '\0');
				cGame.var_70e4 &= 0xFFFFFF00;
				sub_2f41f(17);
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_6c44 = false;
			}
			cGame.var_6c94 = true;
			return;
		}
		case 22: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f6;
				sub_40279(((sub_4e1f6 = GLLib.TODO_sub_4e1f(22)) == null) ? "" : sub_4e1f6, 7, 0);
			}
			if (sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2024d(1, 45, false);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 23: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				final Class_f[] array12 = { null };
				Class_f.sub_545c(0, 50, 14, array12, 1);
				if (array12[0] != null) {
					sub_28c2e(array12[0], 5, -100);
					array12[0].sub_a21a(512);
				}
			}
			if (sub_202b7(1, 44)) {
				sub_2024d(1, 44, false);
				sub_2024d(1, 45, false);
				sub_2024d(1, 59, false);
				sub_2c69b();
				sub_1f8c5(1);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 24: {
			if (!cGame.var_6c8c) {
				sub_2000c(22, 172, true);
				cGame.var_6c8c = true;
				sub_2024d(22, 87, false);
				sub_2000c(22, 87, false);
				sub_2c69b();
				sub_1f8c5(22);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_2000c(22, 172, false);
				return;
			}
			break;
		}
		case 25: {
			if (!cGame.var_6c8c) {
				sub_2000c(22, 173, true);
				cGame.var_6c8c = true;
				sub_234cb(1, 1);
			}
			if (cGame.var_6c94) {
				sub_234f2(1);
				sub_2c69b();
				sub_1f8c5(22);
				sub_2738d();
				sub_2000c(22, 173, false);
				return;
			}
			break;
		}
		case 26: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2000c(6, 31, false);
				sub_2024d(6, 31, false);
				sub_2c69b();
				sub_1f8c5(6);
			}
			if (!sub_20167(6, 36) && cGame.var_68bc[6][26][6] == 54) {
				sub_2000c(6, 36, true);
			}
			if (cGame.var_6c94) {
				sub_2000c(6, 36, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 27: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2000c(6, 36, false);
				sub_2000c(6, 35, true);
				sub_2000c(6, 31, true);
				sub_2024d(6, 31, true);
				sub_2024d(6, 26, false);
				sub_2024d(6, 7, false);
				sub_2024d(6, 12, false);
				sub_2c69b();
				sub_1f8c5(6);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_2000c(6, 35, false);
				return;
			}
			break;
		}
		case 28: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2000c(6, 35, false);
				sub_2000c(22, 90, true);
				sub_2000c(22, 23, false);
				sub_2024d(22, 23, false);
				sub_2024d(22, 159, false);
				cGame.var_7524 = 0;
			}
			if (!sub_2351a(0, 1)) {
				sub_234cb(0, 1);
				sub_2c69b();
				sub_1f8c5(22);
			}
			if (cGame.var_6c94) {
				sub_2000c(22, 90, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 29: {
			if (!cGame.var_6c8c) {
				sub_2000c(22, 91, cGame.var_6c8c = true);
			}
			if (!sub_2351a(0, 1)) {
				sub_234cb(0, 1);
				sub_2c69b();
				sub_1f8c5(22);
			}
			if (cGame.var_6c94) {
				sub_2000c(22, 91, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 30: {
			if (!cGame.var_6c8c) {
				sub_2000c(22, 170, true);
				sub_2000c(22, 87, true);
				sub_2024d(22, 87, true);
				cGame.var_6c8c = true;
				sub_234f2(0);
				sub_2c69b();
				sub_1f8c5(22);
			}
			if (cGame.var_6c94) {
				sub_2000c(22, 170, false);
				sub_2024d(22, 159, true);
				sub_2738d();
				return;
			}
			break;
		}
		case 31: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_4052e(27, 24, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 32: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				final Class_f[] array13 = { null };
				Class_f.sub_545c(0, 54, 17, array13, 1);
				if (array13[0] != null) {
					sub_28c2e(array13[0], -30, -100);
				}
				cGame.var_70e4 = ((cGame.var_70e4 |= 0xFF) & 0xFFFFFFFE);
			}
			if (cGame.var_6c94) {
				return;
			}
			break;
		}
		case 33: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_28ca1();
				final String sub_4e1f7;
				sub_40279(((sub_4e1f7 = GLLib.TODO_sub_4e1f(23)) == null) ? "" : sub_4e1f7, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 34: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2024d(1, 44, cGame.var_6c94 = false);
				sub_2024d(1, 45, false);
				final Class_f[] array14 = { null };
				Class_f.sub_545c(0, 54, 17, array14, 1);
				if (array14[0] != null) {
					array14[0].sub_7ed6();
					sub_28c2e(array14[0], -30, -100);
				}
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 35: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2024d(1, 44, false);
				sub_2024d(1, 45, false);
				final Class_f[] array15 = { null };
				Class_f.sub_545c(0, 54, 17, array15, 1);
				if (!array15[0].sub_a2a0(16)) {
					sub_11320(true, array15[0]);
					sub_28c64();
				}
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				return;
			}
			break;
		}
		case 36: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				return;
			}
			break;
		}
		case 37: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final Class_f[] array16 = new Class_f[40];
				final int sub_5440 = Class_f.sub_5439(0, 49, array16, 40);
				cGame.var_70e4 |= 0x1;
				for (int j = 0; j < sub_5440; ++j) {
					array16[j].sub_a2da();
					array16[j].sub_aac5();
				}
				final String sub_4e1f8;
				sub_40279(((sub_4e1f8 = GLLib.TODO_sub_4e1f(12)) == null) ? "" : sub_4e1f8, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 38: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_271e4(cGame.var_7fd4);
				cGame.var_6cbc = 0;
				cGame.var_70e4 = ((cGame.var_70e4 &= ~(1 << 255)) | 0x2);
				final Class_f[] array17 = { null };
				Class_f.sub_5439(0, 49, array17, 1);
				if (array17[0] != null) {
					sub_28c2e(array17[0], 0, -50);
					cGame.var_800c.sub_6b0c(array17[0].var_17cd, array17[0].var_17d5, 1000);
				}
				cGame.var_6cc4 = false;
			}
			if (cGame.var_6cbc > 0 && !cGame.var_6cc4) {
				cGame.var_6cc4 = true;
				sub_28ca1();
			}
			if (cGame.var_6cbc >= 6) {
				final Class_f[] array18 = { null };
				Class_f.sub_5439(2, 47, array18, 1);
				if (array18[0] == null) {
					cGame.var_6c94 = true;
				}
			}
			if (cGame.var_6c94) {
				cGame.var_70e4 &= 0xFFFFFFFD;
				sub_2738d();
				return;
			}
			break;
		}
		case 39: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_271e4(cGame.var_7fd4);
				cGame.var_70e4 &= 0xFFFFFFFE;
				final String sub_4e1f9;
				sub_40279(((sub_4e1f9 = GLLib.TODO_sub_4e1f(13)) == null) ? "" : sub_4e1f9, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 40: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_2000c(1, 61, true);
				sub_271e4(cGame.var_7fd4);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_2000c(1, 61, false);
				return;
			}
			break;
		}
		case 41: {
			if (!cGame.var_6c8c) {
				final int var_7fd4 = cGame.var_7fd4;
				sub_2024d(2, 26, false);
				sub_2024d(2, 113, false);
				sub_2000c(2, 113, false);
				sub_2024d(2, 3, false);
				sub_2024d(2, 7, false);
				sub_2024d(2, 20, false);
				sub_2024d(2, 21, false);
				sub_2024d(2, 22, false);
				sub_2024d(2, 23, false);
				sub_2024d(2, 24, false);
				sub_2024d(2, 28, false);
				sub_2024d(2, 42, false);
				sub_2024d(2, 56, false);
				sub_2024d(2, 70, false);
				sub_2024d(2, 84, false);
				sub_2024d(2, 41, false);
				sub_2024d(2, 55, false);
				sub_2024d(2, 69, false);
				sub_2024d(2, 83, false);
				sub_2024d(2, 97, false);
				sub_2000c(2, 41, false);
				sub_2000c(2, 55, false);
				sub_2000c(2, 69, false);
				sub_2000c(2, 83, false);
				sub_2000c(2, 97, false);
				if (var_7fd4 == 41) {
					sub_2024d(2, 28, true);
				}
				sub_2000c(2, 119, true);
				sub_2000c(2, 10, true);
				sub_2024d(2, 10, true);
				sub_2024d(2, 11, false);
				sub_2024d(2, 12, false);
				sub_2024d(2, 13, false);
				sub_2024d(2, 14, false);
				sub_2c69b();
				sub_1fb8e(2);
				sub_234cb(0, 1);
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2000c(2, 119, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 42: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_2000c(1, 63, false);
				sub_2024d(1, 63, false);
				sub_271e4(cGame.var_7fd4);
				cGame.var_70e4 |= 0x20;
				cGame.var_6cbc = 0;
				if (cGame.var_6aac != null) {
					cGame.var_6aac.var_17cd = 2160;
					cGame.var_6aac.var_17d5 = 864;
					cGame.var_800c.sub_6b0c(cGame.var_6aac.var_17cd, cGame.var_6aac.var_17d5, 1000);
				}
			}
			if (cGame.var_6cbc >= 2) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2000c(1, 59, true);
				sub_2024d(1, 59, true);
				sub_25043(false);
				sub_10dd3(false);
				cGame.var_6aa4 = -1;
				cGame.var_70e4 &= 0xFFFFFFDF;
				sub_2738d();
				return;
			}
			break;
		}
		case 43: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_271e4(cGame.var_7fd4);
				final String sub_4e1f10;
				sub_40279(((sub_4e1f10 = GLLib.TODO_sub_4e1f(15)) == null) ? "" : sub_4e1f10, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 44: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				final Class_f[] array19 = new Class_f[5];
				Class_f.sub_5439(0, 49, array19, 5);
				sub_28c2e(array19[4], 0, -50);
				cGame.var_70e4 |= 0x1;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_28ca1();
				cGame.var_70e4 &= 0xFFFFFFFE;
				return;
			}
			break;
		}
		case 45: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_70e4 |= 0x1;
				cGame.var_6cc4 = false;
				sub_251a0(cGame.var_6cbc = 0);
				sub_10e3f(true, 0, sub_11774(1));
			}
			if (!sub_2351a(3, 1)) {
				sub_234cb(3, 1);
			}
			if (cGame.var_6cbc > 0 && !cGame.var_6cc4) {
				cGame.var_6cc4 = true;
				sub_28ca1();
			}
			if (cGame.var_6cbc >= 8) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_70e4 &= 0xFFFFFFFE;
				sub_10e3f(false, 0, cGame.var_6b04);
				sub_234f2(3);
				return;
			}
			break;
		}
		case 46: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_4052e(9, 10, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 47: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				cGame.var_70e4 &= 0xFFFFFF00;
				sub_27132();
				final Class_f[] array20 = { null };
				Class_f.sub_545c(0, 50, 10, array20, 1);
				if (array20[0] != null) {
					array20[0].sub_a25c(512);
				}
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 48: {
			if (!cGame.var_6c8c) {
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
				final String sub_4e1f11;
				sub_40279(((sub_4e1f11 = GLLib.TODO_sub_4e1f(11)) == null) ? "" : sub_4e1f11, 7, 0);
			}
			if (cGame.var_6c94) {
				final Class_f[] array21 = { null };
				Class_f.sub_545c(0, 50, 10, array21, 1);
				if (array21[0] != null) {
					sub_28c2e(array21[0], 0, -100);
					cGame.var_800c.sub_6b0c(array21[0].var_17cd, array21[0].var_17d5, 1000);
				}
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 49: {
			if (!cGame.var_6c8c) {
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
				sub_271e4(cGame.var_7fd4);
				final Class_f[] array22 = { null };
				Class_f.sub_545c(0, 50, 10, array22, 1);
				if (array22[0] != null) {
					array22[0].sub_a21a(512);
				}
				sub_2da54(1, 9, 1);
			}
			if (cGame.var_6c94) {
				sub_28ca1();
				sub_2738d();
				return;
			}
			break;
		}
		case 50: {
			if (!cGame.var_6c8c) {
				sub_272f4(cGame.var_7fd4);
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2000c(10, 68, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 51: {
			if (!cGame.var_6c8c) {
				sub_272f4(cGame.var_7fd4);
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2000c(10, 67, false);
				sub_2738d();
				return;
			}
			break;
		}
		case 52: {
			if (!cGame.var_6c8c) {
				final int[] array23 = new int[2];
				final int[] array24;
				(array24 = new int[2])[0] = 30;
				array24[1] = 28;
				sub_2c8b0(array24, array23);
				cGame.var_6aac.var_17cd = array23[0];
				cGame.var_6aac.var_17d5 = array23[1];
				cGame.var_800c.sub_6b0c(array23[0], array23[1], 1000);
				cGame.var_70e4 |= 0x1;
				sub_2024d(1, 62, true);
				sub_2000c(1, 63, false);
				sub_2024d(1, 63, false);
				sub_2c69b();
				sub_1fb8e(1);
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94 = (cGame.var_6aac == null)) {
				sub_2738d();
				cGame.var_70e4 &= 0xFFFFFFFE;
				return;
			}
			break;
		}
		case 53: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final String sub_4e1f12;
				sub_40279(((sub_4e1f12 = GLLib.TODO_sub_4e1f(8)) == null) ? "" : sub_4e1f12, 7, 0);
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			cGame.var_6c94 = true;
			return;
		}
		case 54: {
			if (!cGame.var_6c8c) {
				final Class_f[] array25 = { null };
				Class_f.sub_545c(0, 50, 9, array25, 1);
				if (array25[0] != null) {
					sub_28c2e(array25[0], 0, -100);
				}
				sub_271e4(cGame.var_7fd4);
				cGame.var_6c94 = false;
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				cGame.var_7fd4 = 56;
				sub_28ca1();
				return;
			}
			break;
		}
		case 55: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				return;
			}
			break;
		}
		case 56: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				final int var_7fd5 = cGame.var_7fd4;
				sub_2000c(3, 205, false);
				sub_2024d(3, 205, false);
				sub_2024d(3, 199, false);
				sub_2024d(3, 198, false);
				sub_2024d(3, 4, false);
				sub_2000c(3, 206, false);
				if (var_7fd5 == 56) {
					sub_2024d(3, 199, true);
					sub_2000c(3, 206, true);
				}
				sub_2c69b();
				sub_1fb8e(3);
				sub_234cb(0, 1);
			}
			if (cGame.var_6c94) {
				sub_2738d();
				sub_2000c(3, 206, false);
				return;
			}
			break;
		}
		case 57: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6cc4 = false;
			}
			final Class_f[] array26 = { null };
			Class_f.sub_5439(2, 47, array26, 1);
			if (array26[0] != null) {
				cGame.var_6cc4 = true;
			}
			if (cGame.var_6cc4 && array26[0] == null) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
			}
			return;
		}
		case 58: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				cGame.var_6c94 = false;
				sub_271e4(cGame.var_7fd4);
				cGame.var_70e4 |= 0xFF;
				sub_10e3f(false, 0, cGame.var_6b04);
				sub_114a7(true, false, false);
				sub_10cd1(true);
				sub_11320(false, null);
			}
			if (getLevel() >= 2) {
				cGame.var_6c94 = true;
			}
			if (cGame.var_6c94) {
				sub_2738d();
				return;
			}
			break;
		}
		case 59: {
			if (!cGame.var_6c8c) {
				cGame.var_6c8c = true;
				sub_49758();
				sub_2000c(1, 44, true);
				sub_2024d(1, 44, true);
				cGame.var_6c94 = false;
				cGame.var_7fd4 = -1;
				cGame.var_6c5c = 160;
				cGame.var_6a9c = true;
				cGame.var_70e4 |= 0xFF;
				sub_10e3f(false, 0, cGame.var_6b04);
				cGame.var_7aac = 13;
				cGame.var_67cc = 1;
				sub_2c69b();
				break;
			}
			break;
		}
		}
	}

	private static void sub_28c2e(final Class_f var_6c9c, final int var_6cac, final int var_6cb4) {
		cGame.var_6c9c = var_6c9c;
		cGame.var_6cac = var_6cac;
		cGame.var_6cb4 = var_6cb4;
		sub_2000c(1, 9, true);
		sub_2386a(1, 9, 1, -1);
	}

	private static void sub_28c64() {
		cGame.var_6c9c = null;
		cGame.var_6ca4 = 0;
		cGame.var_6cac = 220;
		cGame.var_6cb4 = -50;
		sub_2000c(1, 9, true);
		sub_2386a(1, 9, 1, -1);
	}

	static void sub_28ca1() {
		cGame.var_6c9c = null;
		cGame.var_6ca4 = -1;
		cGame.var_6cac = (cGame.var_6cb4 = 0);
		sub_2000c(1, 9, false);
		sub_2393e(1, 9);
	}

	private static void sub_28cd9() {
		cGame.var_7854 = false;
		cGame.var_785c = false;
		cGame.var_7864 = false;
		cGame.var_6d64 = 0;
		final Class_h class_h = Class_h.var_6a[12];
		int n = 0;
		int i = 0;
		while (i == 0) {
			if (class_h.var_82[n][1] == cGame.var_6d54) {
				i = 1;
			} else if (n < class_h.var_7a) {
				++n;
			} else {
				n = 0;
				i = 1;
			}
		}
		final int n2 = class_h.var_82[n][3];
		final int n3 = class_h.var_82[n][4];
		final int n4 = class_h.var_82[n][7];
		final int n5 = class_h.var_82[n][8];
		cGame.var_6d94 = sub_301bd(class_h.var_82[n][2]);
		cGame.var_6da4 = sub_30161(class_h.var_82[n][5]);
		cGame.var_6db4 = sub_30161(class_h.var_82[n][9]);
		cGame.var_6dc4 = sub_30161(class_h.var_82[n][6]);
		cGame.var_6dcc = sub_30161(class_h.var_82[n][10]);
		if (sub_301eb(cGame.var_6d9c = sub_301bd(sub_2e0da())) > sub_301eb(cGame.var_6d94)) {
			cGame.var_6d9c = cGame.var_6d94;
		}
		for (int j = 0; j < 2; ++j) {
			int n6;
			if (j == 0) {
				n6 = n2;
			} else {
				n6 = n4;
			}
			switch (n6) {
			case 1: {
				final Class_h class_h2 = Class_h.var_6a[0];
				short n7 = 1008;
				short n8 = 0;
				short n9 = 0;
				final int var_7a = class_h2.var_7a;
				int k = 0;
				while (k < var_7a) {
					int n10;
					if (j == 0) {
						n10 = n3;
					} else {
						n10 = n5;
					}
					if (n10 == class_h2.var_82[k][1]) {
						n7 = (short) class_h2.var_82[k][3];
						n8 = (short) class_h2.var_82[k][4];
						n9 = (short) class_h2.var_82[k][32];
						if (j == 0) {
							cGame.var_6ddc = (short) class_h2.var_82[k][2];
							break;
						}
						cGame.var_6de4 = (short) class_h2.var_82[k][2];
						break;
					} else {
						++k;
					}
				}
				cGame.var_68bc[11][j + 29][5] = n7;
				cGame.var_68bc[11][j + 29][6] = n8;
				cGame.var_68bc[11][j + 29][8] = n9;
				if (j == 0) {
					cGame.var_6dac = sub_30161(
							cGame.var_6dac = (cGame.var_6dac = Class_f.sub_4d73(0, n3)) + sub_2e024(3, n3 - 2000));
					break;
				}
				cGame.var_6dbc = sub_30161(
						cGame.var_6dbc = (cGame.var_6dbc = Class_f.sub_4d73(0, n5)) + sub_2e024(3, n5 - 2000));
				break;
			}
			case 3: {
				final Class_h class_h3 = Class_h.var_6a[1];
				short n11 = 2;
				short n12 = 0;
				final int var_7a2 = class_h3.var_7a;
				int l = 0;
				while (l < var_7a2) {
					int n13;
					if (j == 0) {
						n13 = n3;
					} else {
						n13 = n5;
					}
					if (n13 == class_h3.var_82[l][1]) {
						n11 = (short) class_h3.var_82[l][3];
						n12 = (short) class_h3.var_82[l][4];
						if (j == 0) {
							cGame.var_6ddc = (short) class_h3.var_82[l][2];
							break;
						}
						cGame.var_6de4 = (short) class_h3.var_82[l][2];
						break;
					} else {
						++l;
					}
				}
				cGame.var_68bc[11][j + 29][5] = n11;
				cGame.var_68bc[11][j + 29][6] = n12;
				cGame.var_68bc[11][j + 29][8] = 0;
				sub_d78c(1, cGame.var_68bc[11][j + 29][5]);
				if (j == 0) {
					cGame.var_6dac = sub_30161(cGame.var_6dac = sub_2e024(0, n3 - 4000));
					break;
				}
				cGame.var_6dbc = sub_30161(cGame.var_6dbc = sub_2e024(0, n5 - 4000));
				break;
			}
			case 2: {
				final Class_h class_h4 = Class_h.var_6a[2];
				short n14 = 9;
				short n15 = 0;
				final int var_7a3 = class_h4.var_7a;
				int n16 = 0;
				while (n16 < var_7a3) {
					int n17;
					if (j == 0) {
						n17 = n3;
					} else {
						n17 = n5;
					}
					if (n17 == class_h4.var_82[n16][1]) {
						n14 = (short) class_h4.var_82[n16][3];
						n15 = (short) class_h4.var_82[n16][4];
						if (j == 0) {
							cGame.var_6ddc = (short) class_h4.var_82[n16][2];
							break;
						}
						cGame.var_6de4 = (short) class_h4.var_82[n16][2];
						break;
					} else {
						++n16;
					}
				}
				cGame.var_68bc[11][j + 29][5] = n14;
				cGame.var_68bc[11][j + 29][6] = n15;
				cGame.var_68bc[11][j + 29][8] = 0;
				sub_d78c(1, cGame.var_68bc[11][j + 29][5]);
				if (j == 0) {
					cGame.var_6dac = sub_30161(cGame.var_6dac = (cGame.var_6dac = Class_f.sub_4d73(0, n3))
							+ sub_2e024(4, n3 - 3000 - 12));
					break;
				}
				cGame.var_6dbc = sub_30161(
						cGame.var_6dbc = (cGame.var_6dbc = Class_f.sub_4d73(0, n5)) + sub_2e024(4, n5 - 3000 - 12));
				break;
			}
			}
		}
		int n18 = 0;
		Label_1368: {
			if (!sub_2a117()) {
				sub_2000c(11, 19, false);
				sub_2000c(11, 16, false);
				sub_2000c(11, 27, false);
				sub_2000c(11, 23, false);
				sub_2000c(11, 20, false);
				sub_2000c(11, 17, false);
				sub_2000c(11, 28, false);
				sub_2000c(11, 24, false);
			} else {
				if (cGame.var_6dfc[cGame.var_6d54] || getIntValue(cGame.var_6dac) >= getIntValue(cGame.var_6da4)) {
					++n18;
					sub_2000c(11, 19, true);
					sub_2000c(11, 16, true);
					sub_2000c(11, 27, false);
					sub_2000c(11, 23, false);
				} else {
					sub_2000c(11, 19, false);
					sub_2000c(11, 16, false);
					sub_2000c(11, 27, true);
					sub_2000c(11, 23, true);
				}
				if (cGame.var_6e04[cGame.var_6d54] || getIntValue(cGame.var_6dbc) >= getIntValue(cGame.var_6db4)) {
					++n18;
					sub_2000c(11, 20, true);
					sub_2000c(11, 17, true);
					sub_2000c(11, 28, false);
					sub_2000c(11, 24, false);
				} else {
					sub_2000c(11, 20, false);
					sub_2000c(11, 17, false);
					sub_2000c(11, 28, true);
					sub_2000c(11, 24, true);
				}
				if (cGame.var_6d5c[cGame.var_6d54 - 1]) {
					++n18;
					sub_2000c(11, 21, true);
					sub_2000c(11, 18, true);
					break Label_1368;
				}
			}
			sub_2000c(11, 21, false);
			sub_2000c(11, 18, false);
		}
		if (cGame.var_6d5c[cGame.var_6d54 - 1]) {
			if (cGame.var_6d54 == 1) {
				cGame.var_68bc[11][31][5] = 10;
				cGame.var_68bc[11][31][6] = 10;
			} else {
				cGame.var_68bc[11][31][5] = 1141;
				cGame.var_68bc[11][31][6] = 0;
			}
		} else if (cGame.var_6d54 == 1) {
			cGame.var_68bc[11][31][5] = 10;
			cGame.var_68bc[11][31][6] = 10;
		} else {
			cGame.var_68bc[11][31][5] = 1141;
			cGame.var_68bc[11][31][6] = 1;
		}
		if (sub_301eb(cGame.var_6d9c) == sub_301eb(cGame.var_6d94)) {
			++n18;
			sub_2000c(11, 22, true);
		} else {
			sub_2000c(11, 22, false);
		}
		if (n18 == 4) {
			sub_2000c(11, 6, cGame.var_6dd4 = true);
			sub_2024d(11, 6, true);
			return;
		}
		sub_2000c(11, 6, cGame.var_6dd4 = false);
		sub_2024d(11, 6, false);
	}

	private static void sub_296ba(final boolean b) {
		int n = 31;
		int n2 = 30;
		int n3 = 34;
		int n4 = 33;
		final int[] array = new int[2];
		final int[] array2 = new int[2];
		sub_29f90();
		switch (cGame.var_6d54) {
		case 1: {
			n2 = 5;
			n = 5;
			break;
		}
		case 2: {
			n2 = 5;
			n = 5;
			break;
		}
		case 3: {
			n = 5;
			break;
		}
		case 4: {
			n = 5;
			n3 = 5;
			break;
		}
		case 5: {
			n = 5;
			n3 = 5;
			n2 = 5;
			break;
		}
		case 6: {
			n = 5;
			n3 = 5;
			n2 = 5;
			break;
		}
		case 7: {
			n = 5;
			n3 = 5;
			n2 = 5;
			break;
		}
		case 8: {
			n = 5;
			n3 = 5;
			n2 = 5;
			break;
		}
		case 9: {
			n = 5;
			n3 = 5;
			n4 = 5;
			break;
		}
		case 10: {
			n = 5;
			n3 = 5;
			n4 = 5;
			break;
		}
		case 11: {
			n = 5;
			n3 = 5;
			n4 = 5;
			break;
		}
		case 12: {
			n = 5;
			n3 = 5;
			n2 = 5;
			n4 = 5;
			break;
		}
		}
		if (cGame.var_6d54 > 0 && cGame.var_6d54 < 13) {
			for (int i = cGame.var_6d74; i < cGame.var_6d84; i += 2) {
				for (int j = cGame.var_6d7c; j <= cGame.var_6d8c; j += 2) {
					array2[0] = i;
					array2[1] = j;
					sub_2c8b0(array2, array);
					if (cGame.var_7fc4 < 100) {
						array[0] = array[0] * cGame.var_7fc4 / 100;
						array[1] = array[1] * cGame.var_7fc4 / 100;
					}
					int n5;
					int n6;
					if (cGame.var_7fc4 == 100) {
						n5 = array[0] / 72;
						n6 = array[1] / 36;
					} else {
						n5 = array[0] / 36;
						n6 = array[1] / 18;
					}
					int n8 = 0;
					Label_0499: {
						int n7;
						if (i == cGame.var_6d74) {
							n7 = n;
						} else if (j == cGame.var_6d7c) {
							n7 = n2;
						} else if (j == cGame.var_6d8c) {
							n7 = n3;
						} else if (i == cGame.var_6d84 - 2) {
							if (j % 4 == 2) {
								n7 = n4;
							} else {
								if ((n8 = GLLibPlayer.sub_5daa(0, n5, n6)) >= 15) {
									n8 = ((n8 - 15 < 0) ? 0 : ((n8 - 15 > 14) ? 14 : (n8 - 15)));
								}
								break Label_0499;
							}
						} else {
							if ((n8 = GLLibPlayer.sub_5daa(0, n5, n6)) < 15) {
								break Label_0499;
							}
							n7 = ((n8 - 15 < 0) ? 0 : ((n8 - 15 > 14) ? 14 : (n8 - 15)));
						}
						n8 = n7;
					}
					GLLibPlayer.sub_5f94(array[0], array[1], n8);
				}
			}
			if (cGame.var_6dec[cGame.var_6d54] != null) {
				cGame.var_6dec[cGame.var_6d54].var_17c5 = -1;
			}
			GLLibPlayer.sub_5f26();
			final int var_6d74 = cGame.var_6d74;
			final int var_6d7c = cGame.var_6d7c;
			final int var_6d75 = cGame.var_6d84;
			final int var_6d8c = cGame.var_6d8c;
			final int n9 = var_6d75;
			final int n10 = var_6d7c;
			for (int k = var_6d74; k < n9; ++k) {
				for (int l = n10; l < var_6d8c; ++l) {
					cGame.var_6fc4[l * 96 + k] = 0;
				}
			}
			cGame.var_6d5c[cGame.var_6d54] = true;
			if (cGame.var_6d54 < 12 && cGame.var_6dec[cGame.var_6d54 + 1] != null) {
				cGame.var_6dec[cGame.var_6d54 + 1].var_186d = 0;
			}
			if (cGame.var_807c == 0 && b) {
				sub_49db0(cGame.var_6d54, 1, 8, false);
				sub_2bae9(cGame.var_6d54, 1, 8);
			}
			final Class_f[] array3 = new Class_f[100];
			for (int sub_5830 = Class_f.sub_5830(0, -1, cGame.var_6d74, cGame.var_6d84, cGame.var_6d7c,
					cGame.var_6d8c, array3, 100), n11 = 0; n11 < sub_5830; ++n11) {
				if (!array3[n11].sub_a2a0(4096)) {
					array3[n11].sub_a21a(512);
					if (array3[n11].var_17c5 == 54 && b && !array3[n11].sub_a2a0(32)) {
						array3[n11].sub_a25c(4);
						array3[n11].sub_a25c(16);
						array3[n11].sub_a25c(256);
						array3[n11].sub_7ed6();
						array3[n11].sub_8365(2);
					}
					if (array3[n11].sub_a2a0(2)) {
						sub_2c907(array3[n11]);
					}
					final int var_18c5;
					if (cGame.var_807c == 0 && b && ((var_18c5 = array3[n11].var_18c5) < cGame.var_80a4[0]
							|| var_18c5 > cGame.var_80a4[63] || var_18c5 % 2 == 1)) {
						sub_2c0fa(true);
						sub_4ad3f(var_18c5);
					}
				}
			}
			GLLibPlayer.sub_5f26();
			cGame.var_8074 = true;
		}
	}

	private static void sub_29de8() {
		cGame.var_6d5c = new boolean[13];
		for (int i = 0; i < 13; ++i) {
			cGame.var_6d5c[i] = false;
		}
		cGame.var_6d5c[0] = true;
		if (cGame.var_807c == 0) {
			cGame.var_6dec = new Class_f[13];
		}
		cGame.var_6dfc = new boolean[13];
		cGame.var_6e04 = new boolean[13];
		for (int j = 0; j < 13; ++j) {
			cGame.var_6dfc[j] = false;
			cGame.var_6e04[j] = false;
		}
	}

	private static void sub_29e85() {
		cGame.var_6d54 = 1;
		while (cGame.var_6d54 < 13 && cGame.var_6d5c != null && cGame.var_6d5c[cGame.var_6d54]) {
			sub_29f90();
			sub_296ba(false);
			++cGame.var_6d54;
		}
	}

	private static void sub_29ee2() {
		if (cGame.var_6d6c != null && !cGame.var_6d6c.sub_1b34()) {
			cGame.var_6d6c.sub_1d9e(cGame.var_7fc4);
			cGame.var_6d6c.sub_1b7f();
		}
		if (cGame.var_6df4 && cGame.var_6dec[cGame.var_6d54] != null) {
			final int var_17ed = cGame.var_6dec[cGame.var_6d54].var_17ed;
			final int var_17f5 = cGame.var_6dec[cGame.var_6d54].var_17f5;
			if (cGame.var_7fc4 == 100) {
				cGame.var_7ff4[143].sub_71ae(GLLib.g, 0, var_17ed, var_17f5, 0);
			} else {
				cGame.var_7ff4[143].sub_7d2b(GLLib.g, 0, var_17ed, var_17f5, cGame.var_7fc4);
			}
		}
		cGame.var_6df4 = false;
	}

	private static void sub_29f90() {
		final int[] array = new int[4];
		sub_2d42a(cGame.var_6d54, array);
		cGame.var_6d74 = array[0];
		cGame.var_6d84 = array[1];
		cGame.var_6d7c = array[2];
		cGame.var_6d8c = array[3];
	}

	private static void sub_29fce() {
		final int[] array = new int[9];
		final int[] array2 = new int[2];
		final int[] array3 = new int[2];
		for (int i = 1; i < 13; ++i) {
			cGame.var_6d54 = i;
			if (!cGame.var_6d5c[i]) {
				sub_29f90();
				array2[0] = cGame.var_6d74 + 12;
				array2[1] = cGame.var_6d7c + 12;
				sub_2c8b0(array2, array3);
				array[0] = array3[0];
				array[1] = array3[1];
				array[2] = 12;
				array[3] = 141;
				if ((cGame.var_6d5c[i - 1] && i == 13) || (cGame.var_6d5c[i - 1] && !cGame.var_6d5c[i + 1])) {
					array[4] = 0;
				} else {
					array[4] = 1;
				}
				array[5] = 0;
				array[7] = (array[6] = -1);
				array[8] = 0;
				if (cGame.var_807c == 0) {
					(cGame.var_6dec[i] = Class_f.sub_92ea(32, 0, array)).sub_a21a(16777216);
				}
			}
		}
	}

	private static boolean sub_2a117() {
		int n = 0;
		switch (cGame.var_6d54) {
		case 1: {
			n = 24;
			break;
		}
		case 2: {
			n = 43;
			break;
		}
		case 3: {
			n = 59;
			break;
		}
		case 4: {
			n = 89;
			break;
		}
		case 5: {
			n = 130;
			break;
		}
		case 6: {
			n = 153;
			break;
		}
		case 7: {
			n = 183;
			break;
		}
		case 8: {
			n = 210;
			break;
		}
		case 9: {
			n = 243;
			break;
		}
		case 10: {
			n = 251;
			break;
		}
		case 11: {
			n = 283;
			break;
		}
		case 12: {
			n = 290;
			break;
		}
		}
		return sub_4ac19(n);
	}

	private static int sub_2a22a() {
		int n;
		for (n = 1; n < 13 && cGame.var_6d5c[n]; ++n) {
		}
		return n - 1;
	}

	private static void sub_2a274() {
		cGame.var_6e24 = new int[10][];
		cGame.var_6e2c = new int[10][];
		cGame.var_6e34 = new long[10][];
		final Class_h class_h = Class_h.var_6a[8];
		for (int i = 0; i < 10; ++i) {
			(cGame.var_6e24[i] = new int[6])[0] = class_h.var_82[i][7];
			cGame.var_6e24[i][1] = class_h.var_82[i][8];
			cGame.var_6e24[i][2] = 0;
			cGame.var_6e24[i][3] = -1;
			cGame.var_6e24[i][4] = -1;
			cGame.var_6e24[i][5] = 5;
			cGame.var_6e2c[i] = new int[6];
		}
		final Class_h class_h2;
		cGame.var_6e3c = new int[(class_h2 = Class_h.var_6a[24]).var_7a];
		for (int j = 0; j < class_h2.var_7a; ++j) {
			cGame.var_6e3c[j] = class_h2.var_82[j][7];
		}
		for (int k = 0; k < 10; ++k) {
			cGame.var_6e34[k] = new long[6];
		}
	}

	static boolean sub_2a397() {
		final long n = System.currentTimeMillis() / 1000L;
		final Class_h class_h = Class_h.var_6a[8];
		final Class_h class_h2 = Class_h.var_6a[18];
		final Class_h class_h3 = Class_h.var_6a[24];
		boolean b = false;
		for (int i = 0; i < 10; ++i) {
			if (cGame.var_6e34[i][3] > 0L) {
				long n2 = n - cGame.var_6e34[i][3];
				for (int n3 = cGame.var_6e24[i][1] / cGame.var_8064[25]; n2 >= cGame.var_6e3c[n3]; n2 = n
						- cGame.var_6e34[i][3], n3 = cGame.var_6e24[i][1] / cGame.var_8064[25]) {
					final long[] array = cGame.var_6e34[i];
					final int n4 = 3;
					array[n4] += cGame.var_6e3c[n3];
					if ((cGame.var_6e24[cGame.var_7bb4][2] & 0x10) != 0x10) {
						sub_2b10b(i, -class_h3.var_82[n3][8]);
					}
					cGame.var_6e24[cGame.var_7bb4][2] = 0;
				}
			}
			if (cGame.var_6e34[i][4] > 0L) {
				if (cGame.var_6e34[cGame.var_7bb4][4] + 86400L - n <= 0L) {
					cGame.var_6e34[cGame.var_7bb4][4] = 0L;
					break;
				}
				while (true) {
					final long n5 = n - cGame.var_6e34[i][4];
					final int n6 = cGame.var_6e24[i][1] / cGame.var_8064[25];
					if (n5 < cGame.var_6e3c[n6]) {
						break;
					}
					final long[] array2 = cGame.var_6e34[i];
					final int n7 = 4;
					array2[n7] += cGame.var_6e3c[n6];
					if ((cGame.var_6e24[cGame.var_7bb4][2] & 0x1) != 0x1) {
						sub_2b10b(i, -class_h3.var_82[n6][9]);
					}
					cGame.var_6e24[cGame.var_7bb4][2] = 0;
				}
			}
			if (cGame.var_6e34[i][2] > 0L && n - cGame.var_6e34[i][2] >= 86400L) {
				final int n8 = i;
				final Class_h class_h4 = Class_h.var_6a[18];
				cGame.var_6e34[n8][2] = 0L;
				if (class_h4.var_82[getLevel() - 1][11] > -1) {
					for (int j = 0; j < 2; ++j) {
						cGame.var_6e2c[n8][j * 3] = 0;
						cGame.var_6e2c[n8][j * 3 + 1] = -1;
						cGame.var_6e2c[n8][j * 3 + 2] = 0;
					}
					final int sub_2b97 = GLLib.Math_Rand(0, 100);
					for (int n9 = 0, n10 = 0; n10 < 2 && n9 < class_h4.var_82[getLevel() - 1][11]; ++n10) {
						if (sub_2b97 < class_h4.var_82[getLevel() - 1][13]) {
							final int n11 = n9;
							final int n12 = n8;
							final int n13 = n10;
							final int n14 = class_h4.var_82[getLevel() - 1][11] - n9;
							final int n15 = n13;
							final int n16 = n12;
							final Class_h class_h5 = Class_h.var_6a[1];
							int n17 = 0;
							final int[] array3 = new int[117];
							for (int k = 0; k < 117; ++k) {
								if (!sub_2afdd(n16, 1, k) && class_h5.var_82[k][5] < n14
										&& class_h5.var_82[k][11] <= getLevel() && class_h5.var_82[k][14] >= 1) {
									array3[n17++] = k;
								}
							}
							int n18 = 0;
							if (n17 > 0) {
								cGame.var_6e2c[n16][n15 * 3] = 1;
								cGame.var_6e2c[n16][n15 * 3 + 1] = array3[GLLib.Math_Rand(0, n17)];
								cGame.var_6e2c[n16][n15 * 3 + 2] = GLLib.Math_Rand(1,
										(n14 / class_h5.var_82[cGame.var_6e2c[n16][n15 * 3 + 1]][5] < 5)
												? (n14 / class_h5.var_82[cGame.var_6e2c[n16][n15 * 3 + 1]][5])
												: 5);
								n18 = cGame.var_6e2c[n16][n15 * 3 + 2]
										* class_h5.var_82[cGame.var_6e2c[n16][n15 * 3 + 1]][5];
							}
							n9 = n11 + n18;
						} else if (sub_2b97 < class_h4.var_82[getLevel() - 1][13]
								+ class_h4.var_82[getLevel() - 1][14]) {
							final int n19 = n9;
							final int n20 = n8;
							final int n21 = n10;
							final int n22 = class_h4.var_82[getLevel() - 1][11] - n9;
							final int n23 = n21;
							final int n24 = n20;
							final Class_h class_h6 = Class_h.var_6a[4];
							int n25 = 0;
							final int[] array4 = new int[63];
							for (int l = 0; l < 63; ++l) {
								if (!sub_2afdd(n24, 2, l) && class_h6.var_82[l][8] <= getLevel()
										&& class_h6.var_82[l][16] >= 1 && class_h6.var_82[l][7] == 0
										&& sub_27009(class_h6.var_82[l][6], class_h6.var_82[l][7]) < n22) {
									array4[n25++] = l;
								}
							}
							int n26 = 0;
							if (n25 > 0) {
								cGame.var_6e2c[n24][n23 * 3] = 2;
								cGame.var_6e2c[n24][n23 * 3 + 1] = array4[GLLib.Math_Rand(0, n25)];
								final int sub_27009 = sub_27009(class_h6.var_82[cGame.var_6e2c[n24][n23 * 3 + 1]][6],
										class_h6.var_82[cGame.var_6e2c[n24][n23 * 3 + 1]][7]);
								cGame.var_6e2c[n24][n23 * 3 + 2] = GLLib.Math_Rand(1,
										(n22 / sub_27009 < 5) ? (n22 / sub_27009) : 5);
								n26 = cGame.var_6e2c[n24][n23 * 3 + 2] * sub_27009;
							}
							n9 = n19 + n26;
						} else {
							final int n27 = n9;
							final int n28 = n8;
							final int n29 = n10;
							final int n30 = class_h4.var_82[getLevel() - 1][11] - n9;
							final int n31 = n29;
							final int n32 = n28;
							final Class_h class_h7 = Class_h.var_6a[16];
							int n33 = 0;
							final int[] array5 = new int[15];
							for (int n34 = 0; n34 < 15; ++n34) {
								if (!sub_2afdd(n32, 3, n34) && class_h7.var_82[n34][4] <= getLevel()
										&& class_h7.var_82[n34][5] < n30) {
									array5[n33] = n34;
									++n33;
								}
							}
							int n35 = 0;
							if (n33 > 0) {
								cGame.var_6e2c[n32][n31 * 3] = 3;
								final int n36 = array5[GLLib.Math_Rand(0, n33)];
								cGame.var_6e2c[n32][n31 * 3 + 1] = (n36 << 2) + GLLib.Math_Rand(0, 3);
								final int n37 = class_h7.var_82[n36][5];
								cGame.var_6e2c[n32][n31 * 3 + 2] = 1;
								n35 = cGame.var_6e2c[n32][n31 * 3 + 2] * n37;
							}
							n9 = n27 + n35;
						}
					}
				}
			}
			if (cGame.var_6e34[i][5] > 0L && n - cGame.var_6e34[i][5] >= 86400L) {
				if (class_h.var_82[i][10] <= cGame.var_6e24[i][1]
						&& GLLib.Math_Rand(0, 100) < class_h.var_82[i][9]) {
					int n38;
					for (n38 = class_h2.var_7a - 1; n38 > 0
							&& class_h2.var_82[n38][12] > cGame.var_6e24[i][1]; --n38) {
					}
					final int n39 = i;
					final int n40 = (getLevel() < ((cGame.var_6e24[i][0] < n38) ? cGame.var_6e24[i][0] : n38))
							? getLevel()
							: ((cGame.var_6e24[i][0] < n38) ? cGame.var_6e24[i][0] : n38);
					final int n41 = n39;
					final Class_h class_h8 = Class_h.var_6a[1];
					int n42 = 0;
					final int[] array6 = new int[117];
					for (int n43 = 0; n43 < 117; ++n43) {
						if (class_h8.var_82[n43][11] <= n40 && class_h8.var_82[n43][11] >= 0
								&& class_h8.var_82[n43][12] >= 1) {
							if (class_h8.var_82[n43][11] > 0) {
								n42 = 0;
							}
							array6[n42++] = n43;
						}
					}
					if (n42 > 0) {
						cGame.var_6e24[n41][3] = array6[GLLib.Math_Rand(0, n42)];
						sub_49db0(cGame.var_80bc[0] + n41, 1, 31, false);
						sub_2bae9(cGame.var_80bc[0] + n41, 1, 31);
					}
				}
				cGame.var_6e34[i][5] = n;
			}
			if (cGame.var_6e2c[i][0] != 0 || cGame.var_6e24[i][3] != -1 || cGame.var_6e24[i][4] != -1) {
				b = true;
			}
		}
		return b;
	}

	private static boolean sub_2afdd(final int n, final int n2, final int n3) {
		return cGame.var_6e2c[n][0] == n2 && cGame.var_6e2c[n][1] == n3;
	}

	private static void sub_2b022(final int n) {
		if (cGame.var_6e2c[n] != null) {
			for (int i = 0; i < 2; ++i) {
				cGame.var_6e2c[n][i * 3] = 0;
			}
		}
		cGame.var_6e34[n][2] = System.currentTimeMillis() / 1000L;
	}

	private static void sub_2b081(final int n, int i, int n2) {
		final int n3 = i + 4;
		n2 /= cGame.var_8064[25];
		while (i < n3) {
			n2 -= 3;
			if (n2 >= 0) {
				cGame.var_68bc[n][i][6] = 61;
			} else {
				cGame.var_68bc[n][i][6] = (short) (n2 + 61);
				n2 = 0;
			}
			++i;
		}
	}

	private static void sub_2b10b(final int n, final int n2) {
		cGame.var_6e24[n][1] = ((cGame.var_6e24[n][1] + n2 < 0) ? 0
				: ((cGame.var_6e24[n][1] + n2 > cGame.var_8064[24]) ? cGame.var_8064[24]
						: (cGame.var_6e24[n][1] + n2)));
	}

	private static void sub_2b18e() {
		cGame.var_6e44 = new int[20][];
		cGame.var_6e4c = new int[20][];
		final Class_h class_h;
		cGame.var_6e54 = new int[(class_h = Class_h.var_6a[23]).var_7a];
		for (int i = 0; i < class_h.var_7a; ++i) {
			cGame.var_6e54[i] = class_h.var_82[i][6];
		}
		for (int j = 0; j < 20; ++j) {
			cGame.var_6e4c[j] = new int[3];
			cGame.var_6e44[j] = new int[6];
			sub_2b23f(j, class_h);
		}
		cGame.var_6e5c = true;
	}

	private static void sub_2b23f(final int n, Class_h class_h) {
		if (class_h == null) {
			class_h = Class_h.var_6a[23];
		}
		cGame.var_6e4c[n][0] = sub_30161(0);
		cGame.var_6e4c[n][1] = sub_30161(0);
		cGame.var_6e4c[n][2] = 0;
		for (int i = 0; i < 3; ++i) {
			cGame.var_6e44[n][i << 1] = -1;
			cGame.var_6e44[n][(i << 1) + 1] = 0;
		}
		if (n < class_h.var_82[getLevel() - 1][6]) {
			if (n == 0 && cGame.var_7fd4 != -1) {
				cGame.var_6e44[n][0] = 9;
				cGame.var_6e44[n][1] = 6;
				cGame.var_6e4c[n][0] = sub_30161(200);
				cGame.var_6e4c[n][1] = sub_30161(10);
				cGame.var_6e4c[n][2] = GLLib.Math_Rand(409, 438);
				return;
			}
			final int sub_2b97 = GLLib.Math_Rand(class_h.var_82[getLevel() - 1][1],
					class_h.var_82[getLevel() - 1][2]);
			int n2 = 0;
			int n4;
			int n12;
			for (int n3 = 0; n3 < 3 && n2 < sub_2b97; n2 = n4 + n12, ++n3) {
				n4 = n2;
				final int n5 = n3;
				final int n6 = sub_2b97 - n2;
				final int n7 = class_h.var_82[getLevel() - 1][4];
				final int n8 = n6;
				final int n9 = n5;
				final Class_h class_h2 = Class_h.var_6a[1];
				int n10 = 0;
				final int[] array = new int[117];
				for (int j = 0; j < 117; ++j) {
					final int n11 = j;
					if (cGame.var_6e44[n][0] != n11 && cGame.var_6e44[n][2] != n11 && class_h2.var_82[j][5] < n8
							&& class_h2.var_82[j][11] <= getLevel() && class_h2.var_82[j][12] >= 1) {
						array[n10] = j;
						++n10;
					}
				}
				n12 = 0;
				if (n10 > 0) {
					cGame.var_6e44[n][n9 << 1] = array[GLLib.Math_Rand(0, n10)];
					final int n13 = n8 / class_h2.var_82[cGame.var_6e44[n][n9 << 1]][5];
					cGame.var_6e44[n][(n9 << 1) + 1] = GLLib.Math_Rand(1, (n13 < n7) ? n13 : n7);
					n12 = cGame.var_6e44[n][(n9 << 1) + 1] * class_h2.var_82[cGame.var_6e44[n][n9 << 1]][5];
				}
			}
			cGame.var_6e4c[n][0] = sub_30161(n2);
			cGame.var_6e4c[n][1] = sub_30161(class_h.var_82[getLevel() - 1][5]);
			cGame.var_6e4c[n][2] = GLLib.Math_Rand(409, 438);
		}
	}

	private static boolean sub_2b5c8(final int n) {
		if (!cGame.var_6e5c) {
			return false;
		}
		boolean b = true;
		for (int n2 = 0; b && n2 < 3; ++n2) {
			boolean b2 = false;
			Label_0088: {
				if (cGame.var_6e44[n] != null) {
					if (cGame.var_6e44[n][n2 << 1] <= -1 || cGame.var_6e44[n][n2 << 1] >= 117) {
						continue;
					}
					if (cGame.var_6e44[n][(n2 << 1) + 1] <= sub_2e024(0, cGame.var_6e44[n][n2 << 1])) {
						b2 = true;
						break Label_0088;
					}
				}
				b2 = false;
			}
			b = b2;
		}
		return b;
	}

	static boolean sub_2b680() {
		for (int i = 0; i < cGame.var_6e54[getLevel() - 1]; ++i) {
			if (sub_2b5c8(i)) {
				return true;
			}
		}
		return false;
	}

	private static void sub_2b6d7() {
		cGame.var_6e64 = new int[cGame.var_6ee4];
		cGame.var_6e6c = new String[cGame.var_6ee4];
		cGame.var_6e74 = new String[cGame.var_6ee4];
		cGame.var_6e7c = new int[cGame.var_6ee4];
		cGame.var_6e84 = new int[cGame.var_6ee4];
		cGame.var_6e8c = new int[cGame.var_6ee4];
		cGame.var_6e94 = new int[cGame.var_6ee4];
		cGame.var_6e9c = new int[cGame.var_6ee4];
		cGame.var_6ea4 = new int[cGame.var_6ee4];
		cGame.var_6eac = new boolean[cGame.var_6ee4];
		cGame.var_6eb4 = new int[cGame.var_6ee4];
		cGame.var_6ebc = new int[cGame.var_6ee4];
		cGame.var_6ec4 = new int[cGame.var_6ee4];
		cGame.var_6ecc = new int[cGame.var_6ee4];
		for (int i = 0; i < cGame.var_6ee4; ++i) {
			cGame.var_6e64[i] = -1;
			cGame.var_6e6c[i] = "";
			cGame.var_6e74[i] = "";
			cGame.var_6e7c[i] = 0;
			cGame.var_6e84[i] = 0;
			cGame.var_6e8c[i] = 0;
			cGame.var_6e94[i] = sub_30161(0);
			cGame.var_6e9c[i] = sub_30161(0);
			cGame.var_6ea4[i] = 0;
			cGame.var_6eac[i] = false;
			cGame.var_6eb4[i] = 0;
			cGame.var_6ebc[i] = 0;
			cGame.var_6ec4[i] = 0;
			cGame.var_6ecc[i] = 0;
		}
		cGame.var_6ed4 = new int[cGame.var_6ee4];
		for (int j = 0; j < cGame.var_6ee4; ++j) {
			cGame.var_6ed4[j] = -1;
		}
		cGame.var_6edc = new byte[cGame.var_6ee4];
		for (int k = 0; k < cGame.var_6ee4; ++k) {
			cGame.var_6edc[k] = 0;
		}
		cGame.var_6eec = new boolean[15];
		cGame.var_6ef4 = new int[10];
		cGame.var_6efc = new short[64];
	}

	private static void sub_2b850() {
		final Class_h class_h = Class_h.var_6a[25];
		for (int i = 0; i < cGame.var_6ee4; ++i) {
			if (cGame.var_6e64[i] == -1) {
				cGame.var_6e64[i] = class_h.var_82[i][1];
				final String sub_4e1f;
				cGame.var_6e6c[i] = (((sub_4e1f = GLLib.TODO_sub_4e1f(class_h.var_82[i][3])) == null) ? "" : sub_4e1f);
				final String sub_4e1f2;
				cGame.var_6e74[i] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(class_h.var_82[i][6])) == null) ? "" : sub_4e1f2);
				cGame.var_6e7c[i] = class_h.var_82[i][4];
				cGame.var_6e84[i] = class_h.var_82[i][5];
				cGame.var_6e8c[i] = class_h.var_82[i][7];
				cGame.var_6e94[i] = sub_30161(0);
				cGame.var_6e9c[i] = sub_30161(class_h.var_82[i][8]);
				cGame.var_6ea4[i] = class_h.var_82[i][9];
				cGame.var_6eac[i] = false;
				cGame.var_6eb4[i] = class_h.var_82[i][10];
				cGame.var_6ebc[i] = class_h.var_82[i][11];
				cGame.var_6ec4[i] = class_h.var_82[i][12];
				cGame.var_6ecc[i] = class_h.var_82[i][13];
			} else if (cGame.var_6e64[i] == class_h.var_82[i][1]) {
				final String sub_4e1f3;
				cGame.var_6e6c[i] = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(class_h.var_82[i][3])) == null) ? "" : sub_4e1f3);
				final String sub_4e1f4;
				cGame.var_6e74[i] = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(class_h.var_82[i][6])) == null) ? "" : sub_4e1f4);
				cGame.var_6e7c[i] = class_h.var_82[i][4];
				cGame.var_6e84[i] = class_h.var_82[i][5];
				cGame.var_6e8c[i] = class_h.var_82[i][7];
				cGame.var_6e9c[i] = sub_30161(class_h.var_82[i][8]);
				cGame.var_6ea4[i] = class_h.var_82[i][9];
				cGame.var_6eb4[i] = class_h.var_82[i][10];
				cGame.var_6ebc[i] = class_h.var_82[i][11];
				cGame.var_6ec4[i] = class_h.var_82[i][12];
				cGame.var_6ecc[i] = class_h.var_82[i][13];
			}
		}
	}

	static int sub_2bae9(final int n, final int n2, final int n3) {
		int n4 = 0;
		if (cGame.var_7fd4 != -1) {
			return 0;
		}
		for (int i = 0; i < cGame.var_6ee4; ++i) {
			int n5 = -1;
			if (!cGame.var_6eac[i] && cGame.var_6e8c[i] == 2999 && n3 == 38) {
				if (n >= 2000 && n < 2999 && n % 2 == 1) {
					cGame.var_6e94[i] = sub_30161(getIntValue(cGame.var_6e94[i]) + n2);
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						cGame.var_6eac[i] = true;
						n5 = i;
					} else if (getIntValue(cGame.var_6e94[i]) < 0) {
						cGame.var_6e94[i] = sub_30161(0);
					}
				}
			} else if (!cGame.var_6eac[i] && cGame.var_6e8c[i] == 5999 && n3 == 5) {
				if (n >= 5000 && n < 5999) {
					final int n6 = n - 5000;
					if (!cGame.var_6eec[n6]) {
						cGame.var_6eec[n6] = true;
						cGame.var_6e94[i] = sub_30161(getIntValue(cGame.var_6e94[i]) + 1);
						if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
							cGame.var_6e94[i] = cGame.var_6e9c[i];
							cGame.var_6eac[i] = true;
							n5 = i;
						}
					}
				}
			} else if (!cGame.var_6eac[i] && cGame.var_6e8c[i] == 9998 && n3 == 42) {
				if (n >= cGame.var_80bc[0] && n <= cGame.var_80bc[9]) {
					final int n7 = n - cGame.var_80bc[0];
					cGame.var_6ef4[n7] = n2;
					if (cGame.var_6ef4[n7] >= 4) {
						cGame.var_6ef4[n7] = 4;
						cGame.var_6e94[i] = sub_30161(0);
						for (int j = 0; j < getIntValue(cGame.var_6e9c[i]); ++j) {
							if (cGame.var_6ef4[j] >= 4) {
								cGame.var_6e94[i] = sub_30161(getIntValue(cGame.var_6e94[i]) + 1);
							}
						}
						if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
							cGame.var_6e94[i] = cGame.var_6e9c[i];
							cGame.var_6eac[i] = true;
							n5 = i;
						}
					}
				}
			} else if (!cGame.var_6eac[i] && cGame.var_6e8c[i] == 2991 && n3 == 38) {
				if (n >= 2000 && n < 2999 && n % 2 == 1 && n2 > 0) {
					cGame.var_6e94[i] = sub_30161(sub_2bf50());
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						cGame.var_6eac[i] = true;
						n5 = i;
					}
				}
			} else {
				final int sub_49a81;
				if ((sub_49a81 = sub_49a81(cGame.var_6eac[i], cGame.var_6e8c[i], n, cGame.var_6ea4[i], n3,
						false)) == 1) {
					cGame.var_6e94[i] = sub_30161(getIntValue(cGame.var_6e94[i]) + n2);
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						cGame.var_6eac[i] = true;
						n5 = i;
					} else if (getIntValue(cGame.var_6e94[i]) < 0) {
						cGame.var_6e94[i] = sub_30161(0);
					}
				} else if (sub_49a81 == 2) {
					if (n2 >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						cGame.var_6eac[i] = true;
						n5 = i;
					} else {
						cGame.var_6e94[i] = sub_30161(n2);
					}
				}
			}
			if (n5 != -1) {
				if (getIntValue(cGame.var_6e9c[n5]) == 0 || cGame.var_6eac[n5]) {
					sub_2c005(n5);
					n4 = 1;
				}
				if (sub_8396() != 38) {
					sub_3e690(true, n5);
				}
			}
		}
		return n4;
	}

	private static int sub_2bf50() {
		int n = 0;
		for (int i = 0; i < 64; ++i) {
			cGame.var_6efc[i] = 0;
		}
		for (int j = 0; j < 64; ++j) {
			if (j % 2 != 0) {
				cGame.var_6efc[j] = (short) Class_f.sub_4de1(0, 54, j, j);
			}
		}
		for (int k = 0; k < 64; ++k) {
			if (cGame.var_6efc[k] > 0) {
				++n;
			}
		}
		return n;
	}

	private static void sub_2c005(final int n) {
		if (cGame.var_6ed4[n] == -1) {
			cGame.var_6ed4[n] = cGame.var_6e64[n];
			cGame.var_6edc[n] = 1;
		}
	}

	private static void sub_2c048(final int n) {
		final int var_7a84 = cGame.var_6914[0][9];
		cGame.var_7a7c = cGame.var_7a64;
		if (cGame.var_6edc[n] == 1) {
			if (cGame.var_6ebc[n] > 0) {
				cGame.var_709c += cGame.var_6ebc[n];
			}
			if (cGame.var_6ec4[n] > 0) {
				cGame.var_70a4 += cGame.var_6ec4[n];
			}
			if (cGame.var_6ecc[n] > 0) {
				cGame.var_70ac += cGame.var_6ecc[n];
			}
			cGame.var_6edc[n] = 2;
			sub_3e45d();
			sub_2c69b();
			sub_1f8c5(19);
		}
		cGame.var_7a84 = var_7a84;
	}

	static void sub_2c0fa(final boolean b) {
		for (int i = 0; i < cGame.var_6ee4; ++i) {
			if (cGame.var_6ed4[i] == -1 && cGame.var_6edc[i] != 1 && !cGame.var_6eac[i]
					&& cGame.var_6ea4[i] == 38) {
				int n = -1;
				if (cGame.var_6e8c[i] == cGame.var_80c4[29]) {
					cGame.var_6e94[i] = sub_30161(Class_f.sub_4d73(0, cGame.var_6e8c[i]));
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						n = i;
					}
				} else if (cGame.var_6e8c[i] == 3999) {
					cGame.var_6e94[i] = sub_30161(Class_f.sub_4e6d(0, 52));
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						n = i;
					}
				} else if (cGame.var_6e8c[i] == 2999) {
					cGame.var_6e94[i] = sub_30161(Class_f.sub_4de1(0, 54, 0, 63));
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						n = i;
					}
				} else if (cGame.var_6e8c[i] == 2991) {
					cGame.var_6e94[i] = sub_30161(sub_2bf50());
					if (getIntValue(cGame.var_6e94[i]) >= getIntValue(cGame.var_6e9c[i])) {
						cGame.var_6e94[i] = cGame.var_6e9c[i];
						n = i;
					}
				}
				if (n != -1) {
					cGame.var_6eac[n] = true;
					sub_2c005(n);
					if (b) {
						sub_3e690(true, n);
					}
				}
			}
		}
	}

	protected final void pointerReleased(final int n, final int n2) {
		if (cGame.var_67dc[cGame.field_a_int] == 44) {
			IGP.sub_48ef(n, n2);
		}
		super.pointerReleased(n, n2);
	}

	protected final void pointerPressed(final int n, final int n2) {
		if (cGame.var_67dc[cGame.field_a_int] == 44) {
			IGP.sub_4acf(n, n2);
		}
		super.pointerPressed(n, n2);
		cGame.var_6f0c = GLLib.s_screenX;
		cGame.var_6f14 = GLLib.s_screenY;
		cGame.var_6f2c = GLLib.s_screenX;
		cGame.var_6f34 = GLLib.s_screenY;
		cGame.var_6f1c = GLLib.s_screenX;
		cGame.var_6f24 = GLLib.s_screenY;
		cGame.var_6f54 = GLLib.s_screenX;
		cGame.var_6f5c = GLLib.s_screenY;
		cGame.var_6f3c = GLLib.s_screenX;
		cGame.var_6f44 = GLLib.s_screenY;
		cGame.var_6f4c = 0;
		cGame.var_6f04 = 0;
	}

	protected final void pointerDragged(final int n, final int var_6f1c) {
		if (cGame.var_67dc[cGame.field_a_int] == 44) {
			IGP.sub_4b41(n, var_6f1c);
		}
		cGame.var_6f1c = var_6f1c;
		cGame.var_6f24 = 480 - n;
		final int var_2037 = GLLib.s_screenX;
		final int var_203f = GLLib.s_screenY;
		super.pointerDragged(n, var_6f1c);
		if (((GLLib.s_screenX - cGame.var_6f3c < 0) ? (-(GLLib.s_screenX - cGame.var_6f3c))
				: (GLLib.s_screenX - cGame.var_6f3c)) < ((var_2037 - cGame.var_6f3c < 0)
						? (-(var_2037 - cGame.var_6f3c))
						: (var_2037 - cGame.var_6f3c))) {
			cGame.var_6f3c = var_2037;
			cGame.var_6f4c = 0;
		}
		if (((GLLib.s_screenY - cGame.var_6f44 < 0) ? (-(GLLib.s_screenY - cGame.var_6f44))
				: (GLLib.s_screenY - cGame.var_6f44)) < ((var_203f - cGame.var_6f44 < 0)
						? (-(var_203f - cGame.var_6f44))
						: (var_203f - cGame.var_6f44))) {
			cGame.var_6f44 = var_203f;
			cGame.var_6f4c = 0;
		}
		cGame.var_6f04 += GLLib.s_game_frameDT;
		cGame.var_6f4c += GLLib.s_game_frameDT;
	}

	static int sub_2c4ff() {
		return ((GLLib.s_screenX - cGame.var_6f54 < 0) ? (-(GLLib.s_screenX - cGame.var_6f54))
				: (GLLib.s_screenX - cGame.var_6f54))
				+ ((GLLib.s_screenY - cGame.var_6f5c < 0) ? (-(GLLib.s_screenY - cGame.var_6f5c))
						: (GLLib.s_screenY - cGame.var_6f5c));
	}

	private static boolean sub_2c577(int n, int n2, int n3, int n4, int n5, int n6) {
		if (n5 > 0 && n6 > 0) {
			cGame.var_6f64[0] = n - 7;
			cGame.var_6f64[1] = n2 - 7;
			cGame.var_6f64[2] = (cGame.var_6f64[3] = 15);
			cGame.var_6f6c[0] = n3;
			cGame.var_6f6c[1] = n4;
			cGame.var_6f6c[2] = n5;
			cGame.var_6f6c[3] = n6;
			final int[] var_6f64 = cGame.var_6f64;
			final int[] var_6f6c = cGame.var_6f6c;
			final int[] array = var_6f64;
			n3 = var_6f64[0];
			n6 = var_6f6c[0];
			n4 = array[0] + array[2];
			final int n7 = var_6f6c[0] + var_6f6c[2];
			n5 = array[1];
			final int n8 = var_6f6c[1];
			n = array[1] + array[3];
			n2 = var_6f6c[1] + var_6f6c[3];
			if (n >= n8 && n5 <= n2 && n4 >= n6 && n3 <= n7) {
				return true;
			}
		}
		return false;
	}

	private static void sub_2c69b() {
		if (cGame.var_6f74 != null) {
			for (int i = 0; i < cGame.var_6f74.length; ++i) {
				if (cGame.var_6f74[i] != null) {
					sub_2c718(i);
				}
			}
			for (int j = 0; j < cGame.var_6fb4.length; ++j) {
				cGame.var_6fb4[j] = -1;
			}
		}
	}

	private static void sub_2c718(final int n) {
		final int[] array = new int[8];
		array[0] = 0;
		array[1] = array[0];
		array[3] = (array[2] = 0);
		array[4] = -1;
		array[6] = (array[5] = -1);
		array[7] = 0;
		cGame.var_6f74[n] = array;
	}

	private static void sub_2c760(final int n, int i) {
		if (cGame.var_6f74 != null) {
			for (i = 0; i < cGame.var_6f74.length; ++i) {
				if (cGame.var_6f74[i] != null && cGame.var_6f74[i][5] == n) {
					cGame.var_6f74[i][7] = 1;
					return;
				}
			}
		}
	}

	private static void sub_2c7ce(final int n, final int n2, final int n3, final int n4, final int n5) {
		if (cGame.var_6f74 != null) {
			for (int i = 0; i < cGame.var_6f74.length; ++i) {
				if (cGame.var_6f74[i] != null && cGame.var_6f74[i][5] == n) {
					cGame.var_6f74[i][0] = n2;
					cGame.var_6f74[i][1] = n3;
					cGame.var_6f74[i][2] = n4;
					cGame.var_6f74[i][3] = n5;
					return;
				}
			}
		}
	}

	static void sub_2c867(final int[] array, final int[] array2) {
		final int n = (array[0] - 2088 << 8) / 36;
		final int n2 = (array[1] - 216 << 8) / 18;
		array2[0] = n + n2 >> 8;
		array2[1] = n2 - n >> 8;
	}

	static void sub_2c8b0(final int[] array, final int[] array2) {
		final int n = array[0] - array[1] << 8 >> 1;
		final int n2 = (array[1] << 8) + n;
		array2[0] = n * 36 >> 8;
		array2[1] = n2 * 18 >> 8;
		final int n3 = 0;
		array2[n3] += 2088;
		final int n4 = 1;
		array2[n4] += 216;
	}

	static void sub_2c907(final Class_f class_f) {
		final int[] array = new int[2];
		final int[] array2 = new int[2];
		array[0] = class_f.var_17cd;
		array[1] = class_f.var_17d5;
		sub_2c867(array, array2);
		final int[] array3 = array2;
		final int n = 0;
		array3[n] -= class_f.var_1815 >> 1;
		final int[] array4 = array2;
		final int n2 = 1;
		array4[n2] -= class_f.var_181d >> 1;
		for (int i = 0; i < class_f.var_1815; ++i) {
			for (int j = 0; j < class_f.var_181d; ++j) {
				if (sub_2cdf8(array2[0] + i, array2[1] + j)) {
					final int n3 = (array2[1] + j) * 96 + array2[0] + i;
					final byte[] var_6fc4 = cGame.var_6fc4;
					final int n4 = n3;
					var_6fc4[n4] |= 0x1;
				}
			}
		}
	}

	static void sub_2c9ec(final Class_f class_f) {
		final int[] array = new int[2];
		final int[] array2 = new int[2];
		array[0] = class_f.var_17cd;
		array[1] = class_f.var_17d5;
		sub_2c867(array, array2);
		final int[] array3 = array2;
		final int n = 0;
		array3[n] -= class_f.var_1815 >> 1;
		final int[] array4 = array2;
		final int n2 = 1;
		array4[n2] -= class_f.var_181d >> 1;
		for (int i = 0; i < class_f.var_1815; ++i) {
			for (int j = 0; j < class_f.var_181d; ++j) {
				if (sub_2cdf8(array2[0] + i, array2[1] + j)) {
					final int n3 = (array2[1] + j) * 96 + array2[0] + i;
					final byte[] var_6fc4 = cGame.var_6fc4;
					final int n4 = n3;
					var_6fc4[n4] &= 0xFFFFFFFE;
				}
			}
		}
	}

	static boolean sub_2cad2(final Class_f class_f) {
		final int[] array = new int[2];
		final int[] array2 = new int[2];
		array[0] = class_f.var_17cd;
		array[1] = class_f.var_17d5;
		sub_2c867(array, array2);
		final int[] array3 = array2;
		final int n = 0;
		array3[n] -= class_f.var_1815 >> 1;
		final int[] array4 = array2;
		final int n2 = 1;
		array4[n2] -= class_f.var_181d >> 1;
		boolean b = false;
		for (int n3 = 0; n3 < class_f.var_1815 && !b; ++n3) {
			for (int n4 = 0; n4 < class_f.var_181d && !b; b = (!sub_2cdf8(array2[0] + n3, array2[1] + n4)
					|| (cGame.var_6fc4[(array2[1] + n4) * 96 + array2[0] + n3] & 0x1) != 0x0), ++n4) {
			}
		}
		return b;
	}

	static boolean sub_2cc02(final Class_f class_f, final Class_f class_f2) {
		final int[] array = new int[2];
		final int[] array2 = new int[2];
		array[0] = class_f.var_17cd;
		array[1] = class_f.var_17d5;
		sub_2c867(array, array2);
		final int[] array3 = array2;
		final int n = 0;
		array3[n] -= class_f.var_1815 >> 1;
		final int[] array4 = array2;
		final int n2 = 1;
		array4[n2] -= class_f.var_181d >> 1;
		final int[] array5 = new int[2];
		final int[] array6 = new int[2];
		array5[0] = class_f2.var_17cd;
		array5[1] = class_f2.var_17d5;
		sub_2c867(array5, array6);
		final int[] array7 = array6;
		final int n3 = 0;
		array7[n3] -= class_f2.var_1815 >> 1;
		final int[] array8 = array6;
		final int n4 = 1;
		array8[n4] -= class_f2.var_181d >> 1;
		return array2[0] < array6[0] + class_f2.var_1815 && array2[0] + class_f.var_1815 > array6[0]
				&& array2[1] < array6[1] + class_f2.var_181d && array2[1] + class_f.var_181d > array6[1];
	}

	static boolean sub_2cce3(int n, int n2, final int n3, final int n4) {
		final int[] array;
		(array = new int[2])[0] = n;
		array[1] = n2;
		final int[] array2 = array;
		final int n5 = 0;
		array2[n5] -= n3 >> 1;
		final int[] array3 = array;
		final int n6 = 1;
		array3[n6] -= n4 >> 1;
		int n7;
		for (n = 0, n2 = 0; n2 < n3 && n == 0; ++n2) {
			for (n7 = 0; n7 < n4 && n == 0; ++n7) {
				if (sub_2cdf8(array[0] + n2, array[1] + n7)) {
					n = (array[1] + n7) * 96 + array[0] + n2;
					n = (((cGame.var_6fc4[n] & 0x1) != 0x0) ? 1 : 0);
				} else {
					n = 1;
				}
			}
		}
		return n != 0;
	}

	private static boolean sub_2cdf8(final int n, final int n2) {
		return n >= 0 && n < 96 && n2 >= 0 && n2 < 96;
	}

	private static void sub_2ce3a(int i, final int n, final int n2, final int n3) {
		while (i < n2) {
			for (int j = n; j < n3; ++j) {
				cGame.var_6fc4[j * 96 + i] = 1;
			}
			++i;
		}
	}

	static boolean sub_2ceb1(int n, final int n2) {
		if (sub_2cdf8(n, n2)) {
			n += n2 * 96;
			return (cGame.var_6fc4[n] & 0x1) == 0x0;
		}
		return false;
	}

	private static void sub_2cf02() {
		for (int i = 0; i < 9216; ++i) {
			cGame.var_6fc4[i] = 0;
		}
		for (int j = 0, n = 48; j < 48; ++j, --n) {
			sub_2ce3a(0, j, n, j + 1);
		}
		sub_2ce3a(0, 48, 48, 96);
		sub_2ce3a(48, 0, 96, 96);
	}

	private static boolean sub_2cf89(final Class_f class_f, final int[] array) {
		final int[] array2 = new int[2];
		final int[] array3 = new int[2];
		array2[0] = GLLib.s_screenWidth >> 1;
		array2[1] = GLLib.s_screenHeight >> 1;
		sub_26427(array2, array3);
		sub_2c867(array3, array2);
		sub_2c8b0(array2, array3);
		return sub_2cfd6(class_f, array, array3[0], array3[1]);
	}

	private static boolean sub_2cfd6(final Class_f class_f, final int[] array, final int var_17cd, final int var_17d5) {
		final int[] array2;
		(array2 = new int[2])[0] = var_17cd;
		array2[1] = var_17d5;
		int n = 0;
		int n2 = 1;
		int n3 = 0;
		int n4 = 0;
		boolean b = false;
		int n5 = 1;
		boolean b2 = false;
		while (!b2 && n2 < 96) {
			class_f.var_17cd = array2[0];
			class_f.var_17d5 = array2[1];
			if (!sub_2cad2(class_f)) {
				array[0] = array2[0];
				array[1] = array2[1];
				b2 = true;
			}
			if (--n2 == 0) {
				if (b = !b) {
					n5 = ((n5 == 0) ? 1 : 0);
					++n;
				}
				n3 = ((n5 != (b ? 1 : 0)) ? 72 : -72);
				n4 = ((n5 != 0) ? -36 : 36);
				n2 = n;
			}
			final int[] array3 = array2;
			final int n6 = 0;
			array3[n6] += n3;
			final int[] array4 = array2;
			final int n7 = 1;
			array4[n7] += n4;
		}
		if (!b2) {
			class_f.var_17cd = var_17cd;
			class_f.var_17d5 = var_17d5;
		}
		return b2;
	}

	static int sub_2d213(final int n, final int n2) {
		if (n >= 0 && n < 48 && n2 >= 0 && n2 < 48 && n + n2 > 48) {
			return 0;
		}
		if (n >= 0 && n < 24 && n2 >= 48 && n2 < 72) {
			return 1;
		}
		if (n >= 24 && n < 48 && n2 >= 48 && n2 < 72) {
			return 2;
		}
		if (n >= 48 && n < 72 && n2 >= 48 && n2 < 72) {
			return 3;
		}
		if (n >= 48 && n < 72 && n2 >= 24 && n2 < 48) {
			return 4;
		}
		if (n >= 48 && n < 72 && n2 >= 0 && n2 < 24) {
			return 5;
		}
		if (n >= 0 && n < 24 && n2 >= 72 && n2 < 96) {
			return 6;
		}
		if (n >= 24 && n < 48 && n2 >= 72 && n2 < 96) {
			return 7;
		}
		if (n >= 48 && n < 72 && n2 >= 72 && n2 < 96) {
			return 8;
		}
		if (n >= 72 && n < 96 && n2 >= 72 && n2 < 96) {
			return 9;
		}
		if (n >= 72 && n < 96 && n2 >= 48 && n2 < 72) {
			return 10;
		}
		if (n >= 72 && n < 96 && n2 >= 24 && n2 < 48) {
			return 11;
		}
		if (n >= 72 && n < 96 && n2 >= 0 && n2 < 24) {
			return 12;
		}
		return -1;
	}

	static boolean sub_2d3f4(final int n) {
		return n > -1 && cGame.var_6d5c[n];
	}

	private static void sub_2d42a(final int n, final int[] array) {
		switch (n) {
		case 0: {
			array[0] = 24;
			array[1] = 48;
			array[2] = 24;
			array[3] = 48;
			return;
		}
		case 1: {
			array[0] = 0;
			array[1] = 24;
			array[2] = 48;
			array[3] = 72;
			return;
		}
		case 2: {
			array[0] = 24;
			array[2] = (array[1] = 48);
			array[3] = 72;
			return;
		}
		case 3: {
			array[0] = 48;
			array[1] = 72;
			array[2] = 48;
			array[3] = 72;
			return;
		}
		case 4: {
			array[0] = 48;
			array[1] = 72;
			array[2] = 24;
			array[3] = 48;
			return;
		}
		case 5: {
			array[0] = 48;
			array[1] = 72;
			array[2] = 0;
			array[3] = 24;
			return;
		}
		case 6: {
			array[0] = 0;
			array[1] = 24;
			array[2] = 72;
			array[3] = 96;
			return;
		}
		case 7: {
			array[0] = 24;
			array[1] = 48;
			array[2] = 72;
			array[3] = 96;
			return;
		}
		case 8: {
			array[0] = 48;
			array[2] = (array[1] = 72);
			array[3] = 96;
			return;
		}
		case 9: {
			array[0] = 72;
			array[1] = 96;
			array[2] = 72;
			array[3] = 96;
			return;
		}
		case 10: {
			array[0] = 72;
			array[1] = 96;
			array[2] = 48;
			array[3] = 72;
			return;
		}
		case 11: {
			array[0] = 72;
			array[1] = 96;
			array[2] = 24;
			array[3] = 48;
			return;
		}
		case 12: {
			array[0] = 72;
			array[1] = 96;
			array[2] = 0;
			array[3] = 24;
			break;
		}
		}
	}

	static int sub_2d629(final int n, final int n2) {
		int n3 = 16;
		switch (n) {
		case 1: {
			if (n2 == 1) {
				n3 = 0;
				break;
			}
			if (n2 == 2) {
				n3 = 1;
				break;
			}
			if (n2 == 3) {
				n3 = 2;
				break;
			}
			if (n2 == 4) {
				n3 = 3;
				break;
			}
			break;
		}
		case 2: {
			if (n2 == 1) {
				n3 = 4;
				break;
			}
			if (n2 == 2) {
				n3 = 5;
				break;
			}
			if (n2 == 3) {
				n3 = 6;
				break;
			}
			if (n2 == 4) {
				n3 = 7;
				break;
			}
			break;
		}
		case 3: {
			if (n2 == 2) {
				n3 = 8;
				break;
			}
			if (n2 == 3) {
				n3 = 9;
				break;
			}
			if (n2 == 4) {
				n3 = 10;
				break;
			}
			if (n2 == 5) {
				n3 = 11;
				break;
			}
			if (n2 == 6) {
				n3 = 12;
				break;
			}
			break;
		}
		case 4: {
			if (n2 == 1) {
				n3 = 13;
				break;
			}
			if (n2 == 2) {
				n3 = 14;
				break;
			}
			if (n2 == 3) {
				n3 = 15;
				break;
			}
			if (n2 == 4) {
				n3 = 16;
				break;
			}
			if (n2 == 5) {
				n3 = 17;
				break;
			}
			if (n2 == 6) {
				n3 = 18;
				break;
			}
			if (n2 == 8) {
				n3 = 19;
				break;
			}
			break;
		}
		case 5: {
			if (n2 == 3) {
				n3 = 20;
				break;
			}
			if (n2 == 4) {
				n3 = 21;
				break;
			}
			if (n2 == 5) {
				n3 = 22;
				break;
			}
			break;
		}
		case 6: {
			if (n2 == 2) {
				n3 = 23;
				break;
			}
			if (n2 == 6) {
				n3 = 24;
				break;
			}
			break;
		}
		case 8: {
			if (n2 == 4) {
				n3 = 25;
				break;
			}
			if (n2 == 8) {
				n3 = 26;
				break;
			}
			break;
		}
		case 10: {
			if (n2 == 10) {
				n3 = 27;
				break;
			}
			break;
		}
		}
		return n3;
	}

	private static void sub_2d8bf() {
		(cGame.var_6fcc = new int[5][])[0] = new int[117];
		cGame.var_6fcc[1] = new int[20];
		cGame.var_6fcc[2] = new int[63];
		cGame.var_6fcc[3] = new int[64];
		cGame.var_6fcc[4] = new int[10];
		cGame.var_7764 = new int[100];
		cGame.var_776c = 0;
		(cGame.var_7174 = new int[5][])[0] = new int[117];
		cGame.var_7174[1] = new int[20];
		cGame.var_7174[2] = new int[63];
		cGame.var_7174[3] = new int[64];
		cGame.var_7174[4] = new int[10];
		for (int i = 0; i < 5; ++i) {
			int n = 0;
			switch (i) {
			case 0: {
				n = 117;
				break;
			}
			case 1: {
				n = 20;
				break;
			}
			case 2: {
				n = 63;
				break;
			}
			case 3: {
				n = 64;
				break;
			}
			case 4: {
				n = 10;
				break;
			}
			}
			for (int j = 0; j < n; ++j) {
				sub_2dff0(i, j, 0);
			}
		}
	}

	private static boolean sub_2da02(final int n, int sub_2da54, final Class_f class_f) {
		sub_2da54 = (sub_2da54(n, sub_2da54, 1) ? 1 : 0);
		if (n == 3 && class_f != null) {
			cGame.var_7764[cGame.var_776c] = class_f.var_18c5;
			++cGame.var_776c;
		}
		return sub_2da54 != 0;
	}

	static boolean sub_2da54(int n, int n2, final int n3) {
		final int sub_2dcf3 = sub_2dcf3(5);
		if (n3 > 0 && sub_2dcf3 > sub_2df26()) {
			sub_40658(471, 477);
			return false;
		}
		if (n3 < 0 && sub_2dcf3 < 0) {
			return false;
		}
		sub_2e06e(n, n2 - ((n == 4) ? 12 : 0), n3);
		int n4 = 0;
		if (n == 0) {
			n4 = cGame.var_80cc[n2];
		} else if (n == 4) {
			n4 = cGame.var_8094[n2];
		} else if (n == 1) {
			n4 = cGame.var_80b4[n2];
		} else if (n == 2) {
			n4 = Class_h.var_6a[4].var_82[n2][1];
		} else if (n == 3) {
			n4 = cGame.var_80a4[n2];
		}
		if (n4 != 0 && n3 > 0) {
			final int n5 = n4;
			final int n6 = 34;
			n2 = n3;
			n = n5;
			sub_49db0(n5, n2, n6, false);
		}
		cGame.var_76c4 = sub_2dcf3 + n3;
		return true;
	}

	private static int sub_2db90(final int n) {
		int n2 = 0;
		for (int i = 0; i < 5; ++i) {
			int n3 = 0;
			switch (i) {
			case 0: {
				if (n == 5 || n == i) {
					n3 = 117;
					break;
				}
				break;
			}
			case 1: {
				if (n == 5 || n == i) {
					n3 = 20;
					break;
				}
				break;
			}
			case 2: {
				if (n == 5 || n == i) {
					n3 = 63;
					break;
				}
				break;
			}
			case 3: {
				if (n == 5 || n == i) {
					n3 = 64;
					break;
				}
				break;
			}
			case 4: {
				if (n == 5 || n == i) {
					n3 = 10;
					break;
				}
				break;
			}
			}
			for (int j = 0; j < n3; ++j) {
				if (sub_2e024(i, j) > 0) {
					++n2;
				}
			}
		}
		return n2;
	}

	static int sub_2dcf3(int n) {
		n = 0;
		for (int i = 0; i < 5; ++i) {
			int n2 = 0;
			switch (i) {
			case 0: {
				n2 = 117;
				break;
			}
			case 1: {
				n2 = 20;
				break;
			}
			case 2: {
				n2 = 63;
				break;
			}
			case 3: {
				n2 = 64;
				break;
			}
			case 4: {
				n2 = 10;
				break;
			}
			}
			for (int j = 0; j < n2; ++j) {
				n += sub_2e024(i, j);
			}
		}
		return n;
	}

	private static void sub_2ddd7(final Class_f class_f) {
		if (class_f != null) {
			int n = 0;
			final int var_1835 = class_f.var_1835;
			switch (class_f.var_17c5) {
			case 50: {
				n = 1;
				break;
			}
			case 54: {
				n = 3;
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
			class_f.sub_aa8a();
			if (class_f.var_17c5 == 54) {
				sub_2da02(n, var_1835, class_f);
				sub_2deb3(class_f, true);
				return;
			}
			sub_2da54(n, var_1835, 1);
			class_f.sub_4bf4();
		}
	}

	private static void sub_2deb3(final Class_f class_f, final boolean b) {
		if (class_f == null) {
			return;
		}
		if (b) {
			class_f.sub_a21a(4096);
			class_f.sub_a25c(8);
			class_f.sub_a25c(512);
			class_f.var_18b5 = null;
			class_f.var_1675 = false;
			return;
		}
		class_f.sub_a25c(4096);
		class_f.sub_a21a(8);
		class_f.sub_a21a(512);
	}

	static int sub_2df26() {
		int var_705c;
		if (cGame.var_807c == 0) {
			var_705c = cGame.var_76d4 * Class_f.sub_4d73(0, 1002);
		} else {
			var_705c = cGame.var_705c;
		}
		return var_705c;
	}

	static void sub_2df70(final int n) {
		cGame.var_6fd4 += n;
	}

	static void sub_2df93() {
		if (cGame.var_6fd4 > 0 && Class_f.sub_59d2(2) == 0 && cGame.var_70d4 == 0) {
			cGame.var_6fd4 = 0;
		}
		if (cGame.var_6fdc && Class_f.sub_59d2(2) == 0 && cGame.var_70d4 == 0) {
			cGame.var_6fdc = false;
		}
	}

	private static void sub_2dff0(final int n, final int n2, final int n3) {
		cGame.var_6fcc[n][n2] = sub_30161(n3);
		cGame.var_7174[n][n2] = cGame.var_6fcc[n][n2];
	}

	private static int sub_2e024(int getIntValue, final int n) {
		final int getIntValue2 = getIntValue(cGame.var_6fcc[getIntValue][n]);
		getIntValue = getIntValue(cGame.var_7174[getIntValue][n]);
		if (getIntValue2 != getIntValue) {
			return getIntValue;
		}
		return getIntValue2;
	}

	private static void sub_2e06e(final int n, final int n2, int n3) {
		n3 = ((sub_2e024(n, n2) + n3 < 0) ? 0
				: ((sub_2e024(n, n2) + n3 > 4000000) ? 4000000 : (sub_2e024(n, n2) + n3)));
		sub_2dff0(n, n2, n3);
	}

	static int sub_2e0da() {
		final long sub_301eb = sub_301eb(cGame.var_6ff4);
		final long sub_301eb2 = sub_301eb(cGame.var_713c);
		if (sub_301eb != sub_301eb2) {
			return (int) sub_301eb2;
		}
		return (int) sub_301eb;
	}

	static int getCash() {
		final int getIntValue = getIntValue(cGame.s_rmsCash);
		final int getIntValue2 = getIntValue(cGame.s_cashAmount);
		if (getIntValue != getIntValue2) {
			return getIntValue2;
		}
		return getIntValue;
	}

	static int getLevel() {
		final int levelRms = getIntValue(cGame.s_rmsLevel);
		final int level = getIntValue(cGame.s_level);
		if (levelRms != level) {
			return level;
		}
		return levelRms;
	}

	private static int getExperience() {
		final int rmsExperience = getIntValue(cGame.s_rmsExp);
		final int experience = getIntValue(cGame.s_experienceAmount);
		if (rmsExperience != experience) {
			return experience;
		}
		return rmsExperience;
	}

	private static void sub_2e1e1(final int n) {
		cGame.var_713c = (cGame.var_6ff4 = sub_301bd(n));
	}

	private static void sub_2e208(final int n) {
		cGame.s_cashAmount = (cGame.s_rmsCash = sub_30161(n));
	}

	private static void setLevel(final int n) {
		cGame.s_level = (cGame.s_rmsLevel = sub_30161(n));
	}

	private static void setExperience(final int n) {
		cGame.s_experienceAmount = (cGame.s_rmsExp = sub_30161(n));
	}

	private static void sub_2e27a(final boolean b) {
		setLevel(1);
		setExperience(0);
		if (b) {
			sub_2e1e1(cGame.var_8064[0]);
			sub_2e208(cGame.var_8064[1]);
		}
		cGame.var_7074 = new int[99];
		cGame.var_707c = new int[99];
		cGame.var_7084 = new short[99];
		final Class_h class_h = Class_h.var_6a[5];
		for (int i = 0; i < 99; ++i) {
			cGame.var_7074[i] = class_h.var_82[i][1];
			cGame.var_707c[i] = class_h.var_82[i][2];
			cGame.var_7084[i] = (short) class_h.var_82[i][3];
		}
		setMaxPlots(10);
		sub_2eaf0(10);
		setMaxSiloAmount(10);
		cGame.var_7014 = new int[6];
		cGame.var_714c = new int[6];
		for (int j = 0; j < 6; ++j) {
			sub_2e99f(j, 0);
		}
	}

	static boolean sub_2e369(final int n) {
		if (n <= sub_2e0da()) {
			sub_2e482(-n);
			return true;
		}
		return false;
	}

	static boolean sub_2e3a5(final int n) {
		return n <= sub_2e0da();
	}

	static boolean sub_2e3d9(final int n) {
		return n <= getCash();
	}

	static boolean sub_2e40d(final int n, final int n2) {
		if (n <= sub_2e9cd(n2)) {
			sub_2ea12(n2, -n);
			return true;
		}
		return false;
	}

	static boolean sub_2e449(final int n) {
		if (n <= getCash()) {
			sub_2e549(-n);
			return true;
		}
		return false;
	}

	static void sub_2e482(int n) {
		sub_2e1e1((sub_2e0da() + n < 0) ? 0
				: ((sub_2e0da() + n > cGame.var_6ffc) ? cGame.var_6ffc : (sub_2e0da() + n)));
		if (n > 0) {
			final int n2 = 0;
			final int n3 = n;
			final int n4 = 11;
			n = n2;
			sub_49db0(n2, n, n4, false);
		}
	}

	static boolean sub_2e4fa(final int n, final int n2) {
		if (sub_2e954() + n > cGame.var_701c * Class_f.sub_4d73(0, 1005)) {
			cGame.var_7aac = 1;
			sub_8370(17);
			return false;
		}
		sub_2ea12(n2, n);
		return true;
	}

	static void sub_2e549(final int n) {
		sub_2e208((getCash() + n < 0) ? 0
				: ((getCash() + n > cGame.var_700c) ? cGame.var_700c : (getCash() + n)));
	}

	static void sub_2e5a7(int n) {
		int var_702c;
		final int n2 = (cGame.var_7024 + n < 0) ? (var_702c = 0)
				: ((cGame.var_7024 + n > cGame.var_702c) ? (var_702c = cGame.var_702c)
						: (var_702c = cGame.var_7024 + n));
		cGame.var_7024 = var_702c;
		if (n2 >= cGame.var_702c && !sub_2398b(1, 29)) {
			cGame.var_68bc[1][29][7] = 0;
			sub_2386a(1, 29, 0, -1);
		}
		if (cGame.var_7024 == cGame.var_702c) {
			final int n3 = 0;
			final int n4 = 1;
			final int n5 = 35;
			final int n6 = n4;
			n = n3;
			sub_49db0(n3, n6, n5, false);
		}
	}

	static void sub_2e64f(final int n) {
		cGame.var_7064 = ((cGame.var_7064 + n < 0) ? 0
				: ((cGame.var_7064 + n > cGame.var_706c) ? cGame.var_706c : (cGame.var_7064 + n)));
	}

	private static void onLevelUp() {
		int nextLevel = getLevel() + 1;
		// Good old Gameloft, daring to set a level above 50.
		setLevel(nextLevel);
		if (nextLevel > 50) {
			return;
		}
		if (nextLevel < 50) {
			final Class_h class_h = Class_h.var_6a[27];
			for (int i = 0; i < class_h.var_7a; ++i) {
				if (class_h.var_82[i][1] == nextLevel) {
					setMaxPlots(class_h.var_82[i][2]);
					// What the fuck Gameloft?
					cGame.var_795c = getMaxPlots() - getMaxPlots();
					sub_2eaf0(class_h.var_82[i][3]);
					setMaxSiloAmount(class_h.var_82[i][4]);
					break;
				}
			}
		} else {
			setMaxPlots(100);
			sub_2eaf0(100);
			setMaxSiloAmount(100);
		}
		if (sub_49794()) {
			sub_26a6a(true, cGame.var_7f6c, '\u0001');
		}
		if (nextLevel < 99) {
			final int n2 = cGame.var_707c[getLevel() - 1];
			final short n3 = cGame.var_7084[getLevel() - 1];
			final int[] array = new int[2];
			final int[] array2;
			(array2 = new int[2])[0] = GLLib.s_screenWidth >> 1;
			array2[1] = GLLib.s_screenHeight >> 1;
			sub_26427(array2, array);
			final int[] array3 = { 0, 0, 14 };
			if (n2 > 0) {
				Class_f.sub_92ea(47, 2, array3).sub_8c4c(array[0], array[1], 36, 1000, false, n2);
			}
			if (n3 > 0) {
				Class_f.sub_92ea(47, 2, array3).sub_8c4c(array[0], array[1], 6, 1000, true, n3);
			}
		}
		cGame.var_6c84 = true;
		sub_81e0(13);
		final Class_h class_h2 = Class_h.var_6a[23];
		for (int j = 0; j < class_h2.var_82[getLevel() - 1][6]; ++j) {
			if (getIntValue(cGame.var_6e4c[j][0]) == 0) {
				sub_2b23f(j, class_h2);
			}
		}
	}

	// I was right lol
	static void addExperience(int amount) {
		final int experience = getExperience();
		if (getLevel() >= 50) {
			return;
		}
		setExperience(experience + amount);
		cGame.var_6c84 = true;
		amount = sub_2e8f8();
		for (int i = getExperience(); amount > 0 && i >= amount; amount = sub_2e8f8()) {
			setExperience(i -= amount);
			onLevelUp();
		}
	}

	private static int sub_2e8f8() {
		int n = 999999;
		// What the fuck Gameloft?
		if (getLevel() < 99) {
			n = ((1 > cGame.var_7074[getLevel()]) ? 1 : cGame.var_7074[getLevel()]);
		}
		return n;
	}

	private static int sub_2e954() {
		int n = 0;
		for (int i = 0; i < 6; ++i) {
			n += sub_2e9cd(i);
		}
		return n;
	}

	private static void sub_2e99f(final int n, final int n2) {
		cGame.var_7014[n] = sub_30161(n2);
		cGame.var_714c[n] = cGame.var_7014[n];
	}

	static int sub_2e9cd(int getIntValue) {
		final int getIntValue2 = getIntValue(cGame.var_7014[getIntValue]);
		getIntValue = getIntValue(cGame.var_714c[getIntValue]);
		if (getIntValue2 != getIntValue) {
			return getIntValue;
		}
		return getIntValue2;
	}

	private static void sub_2ea12(final int n, int n2) {
		n2 = ((sub_2e9cd(n) + n2 < 0) ? 0
				: ((sub_2e9cd(n) + n2 > cGame.var_701c * Class_f.sub_4d73(0, 1005))
						? (cGame.var_701c * Class_f.sub_4d73(0, 1005))
						: (sub_2e9cd(n) + n2)));
		sub_2e99f(n, n2);
	}

	private static void setMaxPlots(final int n) {
		cGame.s_maxPlots = (cGame.s_rmsMaxPlots = sub_30161(n));
	}

	private static int getMaxPlots() {
		final int getIntValue = getIntValue(cGame.s_rmsMaxPlots);
		final int getIntValue2 = getIntValue(cGame.s_maxPlots);
		if (getIntValue != getIntValue2) {
			return getIntValue2;
		}
		return getIntValue;
	}

	private static void sub_2eaf0(final int n) {
		cGame.skibidi_rizz = (cGame.giant_gyatt = sub_30161(n));
	}

	private static int getIdk() {
		final int getIntValue = getIntValue(cGame.giant_gyatt);
		final int getIntValue2 = getIntValue(cGame.skibidi_rizz);
		if (getIntValue != getIntValue2) {
			return getIntValue2;
		}
		return getIntValue;
	}

	private static void setMaxSiloAmount(final int n) {
		cGame.s_maxAmountInSilo = (cGame.s_rmsMaxAmountInSilo = sub_30161(n));
	}

	private static int getMaxSiloAmount() {
		final int getIntValue = getIntValue(cGame.s_rmsMaxAmountInSilo);
		final int getIntValue2 = getIntValue(cGame.s_maxAmountInSilo);
		if (getIntValue != getIntValue2) {
			return getIntValue2;
		}
		return getIntValue;
	}

	private static void sub_2ebbe() {
		cGame.var_70b4 = new int[64];
		cGame.var_70bc = new int[64];
		cGame.var_70c4 = new Class_f[64];
		cGame.var_70e4 = -1;
		sub_2ec20();
		for (int i = 0; i < 64; ++i) {
			cGame.var_70bc[i] = 1;
		}
	}

	private static void sub_2ec20() {
		cGame.var_70cc = 0;
		cGame.var_70d4 = 0;
		cGame.var_70dc = 0;
	}

	static void sub_2ec47(final int n, final Class_f class_f) {
		if (cGame.var_70d4 < 64) {
			boolean b = false;
			for (int n2 = 0, var_70cc = cGame.var_70cc; n2 < cGame.var_70d4
					&& !b; b = (cGame.var_70b4[var_70cc] == n
							&& cGame.var_70c4[var_70cc] == class_f), var_70cc = (++n2 + cGame.var_70cc & 0x3F)) {
			}
			if (!b && (cGame.var_70e4 & 1 << n) == 1 << n) {
				final int n3 = (cGame.var_70d4 + cGame.var_70cc) % 64;
				cGame.var_70b4[n3] = n;
				cGame.var_70c4[n3] = class_f;
				++cGame.var_70d4;
				class_f.var_18bd = true;
				class_f.sub_a21a(65536);
				class_f.sub_aac5();
			}
		}
	}

	private static void sub_2ed68() {
		if (cGame.var_70d4 < 64) {
			cGame.var_70c4[cGame.var_70cc].var_18bd = false;
			cGame.var_70c4[cGame.var_70cc].sub_aac5();
			cGame.var_70c4[cGame.var_70cc].sub_a25c(65536);
			cGame.var_70b4[cGame.var_70cc] = 0;
			cGame.var_70c4[cGame.var_70cc] = null;
			--cGame.var_70d4;
			++cGame.var_70cc;
			cGame.var_70dc = 0;
			if (cGame.var_70cc >= 64) {
				cGame.var_70cc = 0;
			}
		}
	}

	private static void sub_2edea() {
		if (cGame.var_70d4 > 0) {
			switch (cGame.var_70dc) {
			case 0: {
				if (cGame.var_70b4[cGame.var_70cc] != 0 && cGame.var_70b4[cGame.var_70cc] != 1
						&& (cGame.var_807c == 0 || cGame.var_6e24[cGame.var_807c - 1][5] > 0)) {
					cGame.var_8004.sub_66d8(cGame.var_70c4[cGame.var_70cc].var_17cd - 36,
							cGame.var_70c4[cGame.var_70cc].var_17d5 - 18);
					if (cGame.var_70c4[cGame.var_70cc].var_17c5 == 54) {
						cGame.var_8004.sub_6426();
						cGame.var_70c4[cGame.var_70cc].sub_8365(4);
					}
					cGame.var_70dc = 1;
					return;
				}
				cGame.var_70dc = 3;
				return;
			}
			case 1: {
				if (!cGame.var_8004.sub_a1cc()) {
					if (cGame.var_70c4[cGame.var_70cc] != null
							&& cGame.var_70c4[cGame.var_70cc].var_17c5 == 54) {
						cGame.var_8004.sub_6426();
					}
					cGame.var_8004.sub_60d7(2);
					cGame.var_70dc = 2;
					return;
				}
				break;
			}
			case 3: {
				if (cGame.var_807c == 0 || cGame.var_6e24[cGame.var_807c - 1][5] > 0) {
					switch (cGame.var_70b4[cGame.var_70cc]) {
					case 0: {
						sub_23a84(47);
						cGame.var_70c4[cGame.var_70cc].sub_73e7();
						break;
					}
					case 1: {
						if (cGame.var_6fdc) {
							sub_2ed68();
							return;
						}
						sub_23a84(40);
						if (cGame.var_70c4[cGame.var_70cc].var_17c5 == 49) {
							final int n = 1 + (cGame.var_70c4[cGame.var_70cc].sub_a2a0(1024) ? 1 : 0);
							if ((cGame.var_807c != 0 || sub_2dcf3(5) + Class_f.sub_59d2(2) + n <= sub_2df26())
									&& (cGame.var_807c != 0 || sub_2dcf3(5) + cGame.var_6fd4 + n <= sub_2df26())) {
								sub_2df70(1);
								cGame.var_70c4[cGame.var_70cc].sub_7589();
								break;
							}
							cGame.var_6fdc = true;
							sub_10e3f(false, 1, cGame.var_6b04);
							if (sub_2dcf3(5) < sub_2df26()) {
								final String sub_4e1f;
								final String sub_4e1f2;
								sub_406d3(((sub_4e1f = GLLib.TODO_sub_4e1f(475)) == null) ? "" : sub_4e1f,
										GLLib.sub_547c(((sub_4e1f2 = GLLib.TODO_sub_4e1f(476)) == null) ? "" : sub_4e1f2,
												"%slots", "" + GLLib.CurrencySeparator_just_a_guess(n, cGame.var_7fe4, " ")),
										7, 0);
								break;
							}
							sub_40658(471, 477);
							break;
						} else {
							final int n2 = 3 + (cGame.var_70c4[cGame.var_70cc].sub_a2a0(1024) ? 1 : 0);
							if ((cGame.var_807c != 0 || sub_2dcf3(5) + Class_f.sub_59d2(2) + n2 <= sub_2df26())
									&& (cGame.var_807c != 0 || sub_2dcf3(5) + cGame.var_6fd4 + n2 <= sub_2df26())) {
								sub_2df70(3);
								cGame.var_70c4[cGame.var_70cc].sub_7ae7();
								break;
							}
							cGame.var_6fdc = true;
							sub_10e3f(false, 1, cGame.var_6b04);
							if (sub_2dcf3(5) < sub_2df26()) {
								final String sub_4e1f3;
								final String sub_4e1f4;
								sub_406d3(((sub_4e1f3 = GLLib.TODO_sub_4e1f(475)) == null) ? "" : sub_4e1f3,
										GLLib.sub_547c(((sub_4e1f4 = GLLib.TODO_sub_4e1f(476)) == null) ? "" : sub_4e1f4,
												"%slots", "" + GLLib.CurrencySeparator_just_a_guess(n2, cGame.var_7fe4, " ")),
										7, 0);
								break;
							}
							sub_40658(471, 477);
							break;
						}

					}
					case 2: {
						cGame.var_70c4[cGame.var_70cc].sub_7b94();
						sub_49db0(cGame.var_70c4[cGame.var_70cc].var_18c5, 1, 10, false);
					}
					case 4: {
						cGame.var_70c4[cGame.var_70cc].sub_7f50();
						break;
					}
					case 5: {
						cGame.var_70c4[cGame.var_70cc].sub_7795(1);
						break;
					}
					case 6: {
						final Class_f class_f;
						(class_f = cGame.var_70c4[cGame.var_70cc]).sub_aac5();
						sub_2c9ec(class_f);
						Class_f.sub_92ea(47, 2, new int[] { 0, 0, 14 }).sub_8c4c(class_f.var_17cd, class_f.var_17d5, 37,
								1000, false, 1);
						class_f.var_185d = 9;
						class_f.var_1865 = -1;
						class_f.var_186d = -1;
						break;
					}
					case 7: {
						int var_16e5 = cGame.var_70c4[cGame.var_70cc].var_16e5;
						int var_16ed = cGame.var_70c4[cGame.var_70cc].var_16ed;
						if (cGame.var_70c4[cGame.var_70cc].var_1675) {
							if (var_16e5 > 0) {
								++var_16e5;
							}
							if (var_16ed > 0) {
								++var_16ed;
							}
						}
						if ((cGame.var_807c == 0 && sub_2dcf3(5) + var_16e5 + var_16ed <= sub_2df26())
								|| cGame.var_807c != 0) {
							cGame.var_70c4[cGame.var_70cc].sub_80cb();
							break;
						}
						if (sub_2dcf3(5) < sub_2df26()) {
							final String sub_4e1f5;
							final String sub_4e1f6;
							sub_406d3(((sub_4e1f5 = GLLib.TODO_sub_4e1f(475)) == null) ? "" : sub_4e1f5,
									GLLib.sub_547c(((sub_4e1f6 = GLLib.TODO_sub_4e1f(476)) == null) ? "" : sub_4e1f6,
											"%slots",
											"" + GLLib.CurrencySeparator_just_a_guess(var_16e5 + var_16ed, cGame.var_7fe4, " ")),
									7, 0);
							break;
						}
						sub_40658(471, 477);
						break;
					}
					}
					if (cGame.var_807c != 0) {
						sub_40c81(-1);
						if (cGame.var_807c >= 1) {
							sub_49db0(cGame.var_80bc[0] + cGame.var_807c - 1, 1, 24, false);
						}
					}
					sub_2e5a7(cGame.var_70bc[cGame.var_70cc]);
					sub_2ed68();
					return;
				}
				while (cGame.var_70d4 > 0) {
					sub_2ed68();
				}
				sub_23a84(56);
				break;
			}
			}
		}
	}

	private static void sub_2f41f(final int var_711c) {
		cGame.var_711c = var_711c;
		if (var_711c == 19) {
			sub_23a84(43);
		}
		sub_81e0(35);
	}

	private static void sub_2f45d() {
		cGame.var_70ec = 0;
		cGame.var_70fc = 0;
		for (int i = 0; i < cGame.var_710c.length; ++i) {
			cGame.var_710c[i] = null;
		}
		cGame.var_710c = null;
		for (int j = 0; j < cGame.var_7114.length; ++j) {
			cGame.var_7114[j] = null;
		}
		cGame.var_7114 = null;
		cGame.var_711c = 0;
		cGame.var_7124 = 0;
		cGame.var_70f4 = 0;
		if (cGame.var_7ff4[81] != null) {
			cGame.var_7ff4[81].sub_123f();
			cGame.var_7ff4[81] = null;
		}
		sub_d500(0, 101, 65535, 1, 0, 0, -1);
		sub_d2e8(0, 3);
	}

	static boolean sub_2f517() {
		return cGame.var_710c != null;
	}

	private static void sub_2f549() {
		for (int i = 0; i < cGame.var_710c[cGame.var_70ec].length; ++i) {
			switch (cGame.var_710c[cGame.var_70ec][i]) {
			case 108: {
				final Class_f sub_25b35;
				(sub_25b35 = sub_25b35(cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1])).var_17cd = cGame.var_7114[cGame.var_70ec][i
								* 6 + 2];
				sub_25b35.var_17d5 = cGame.var_7114[cGame.var_70ec][i * 6 + 3];
				sub_25b35.var_1845 = sub_25b35.var_17cd;
				sub_25b35.var_184d = sub_25b35.var_17d5;
				break;
			}
			case 103: {
				final Class_f sub_25b36;
				(sub_25b36 = sub_25b35(cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1])).var_17cd = cGame.var_800c.var_17cd
								+ cGame.var_7114[cGame.var_70ec][i * 6 + 2];
				sub_25b36.var_17d5 = cGame.var_800c.var_17d5 + cGame.var_7114[cGame.var_70ec][i * 6 + 3];
				sub_25b36.var_1845 = sub_25b36.var_17cd;
				sub_25b36.var_184d = sub_25b36.var_17d5;
				break;
			}
			case 109: {
				final Class_f[] array = new Class_f[2];
				Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], array, 1);
				sub_2fced(array[0], cGame.var_7114[cGame.var_70ec][i * 6 + 2],
						cGame.var_7114[cGame.var_70ec][i * 6 + 3]);
				break;
			}
			case 104: {
				final Class_f[] array2 = new Class_f[2];
				Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], array2, 1);
				sub_2fced(array2[0], cGame.var_7114[cGame.var_70ec][i * 6 + 2],
						cGame.var_7114[cGame.var_70ec][i * 6 + 3]);
				break;
			}
			case 110: {
				final String sub_4e1f;
				sub_40279(
						((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7114[cGame.var_70ec][i * 6])) == null) ? ""
								: sub_4e1f,
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], cGame.var_7114[cGame.var_70ec][i * 6 + 2]);
				break;
			}
			case 106: {
				final Class_f[] array3 = new Class_f[2];
				Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], array3, 1);
				array3[0].sub_4bf4();
				break;
			}
			case 105: {
				final Class_f[] array4 = new Class_f[2];
				Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], array4, 1);
				if (array4[0].var_189d == null) {
					array4[0].var_189d = new GLLibPlayer(cGame.var_7ff4[array4[0].var_1865], array4[0].var_17ed,
							array4[0].var_17f5);
				}
				array4[0].var_189d.SetAnim(cGame.var_7114[cGame.var_70ec][i * 6 + 2],
						cGame.var_7114[cGame.var_70ec][i * 6 + 3]);
			}
			case 107: {
				switch (cGame.var_7114[cGame.var_70ec][i * 6]) {
				case 0: {
					sub_d500(0, 100, 65535, 1, 0, 0, -1);
					sub_d500(0, 97, 65535, 1, 0, 0, -1);
					sub_d500(0, 81, 65535, 1, 0, 0, -1);
					sub_d500(0, 101, 65535, 1, 0, 0, -1);
					break;
				}
				case 1: {
					sub_d500(0, 86, 65535, 1, 0, 0, -1);
					break;
				}
				case 2: {
					sub_d500(0, 99, 65535, 1, 0, 0, -1);
					break;
				}
				}
				sub_d2e8(0, 3);
				break;
			}
			case 111: {
				sub_2fced(Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6]),
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], cGame.var_7114[cGame.var_70ec][i * 6 + 2]);
				break;
			}
			case 112: {
				final Class_f sub_53db = Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6]);
				if (cGame.var_7114[cGame.var_70ec][i * 6 + 2] == 0) {
					sub_53db.sub_a25c(1 << cGame.var_7114[cGame.var_70ec][i * 6 + 1]);
					break;
				}
				sub_53db.sub_a21a(1 << cGame.var_7114[cGame.var_70ec][i * 6 + 1]);
				break;
			}
			case 113: {
				Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6]).sub_4bf4();
				break;
			}
			case 21: {
				final Class_f sub_53db2;
				(sub_53db2 = Class_f.sub_53db(0,
						cGame.var_7114[cGame.var_70ec][i * 6])).var_17cd = cGame.var_7114[cGame.var_70ec][i * 6
								+ 1];
				sub_53db2.var_17d5 = cGame.var_7114[cGame.var_70ec][i * 6 + 2];
				sub_53db2.var_1845 = sub_53db2.var_17cd;
				sub_53db2.var_184d = sub_53db2.var_17d5;
				break;
			}
			case 22: {
				final Class_f sub_53db3;
				if ((sub_53db3 = Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6])).var_189d == null) {
					sub_53db3.var_189d = new GLLibPlayer(cGame.var_7ff4[sub_53db3.var_1865], sub_53db3.var_17ed,
							sub_53db3.var_17f5);
				}
				sub_53db3.var_189d.SetAnim(cGame.var_7114[cGame.var_70ec][i * 6 + 1],
						(cGame.var_7114[cGame.var_70ec][i * 6 + 2] == 0) ? 1 : -1);
				break;
			}
			case 11: {
				cGame.var_800c.var_17cd = cGame.var_7114[cGame.var_70ec][i * 6];
				cGame.var_800c.var_17d5 = cGame.var_7114[cGame.var_70ec][i * 6 + 1];
				cGame.var_800c.var_1845 = cGame.var_800c.var_17cd;
				cGame.var_800c.var_184d = cGame.var_800c.var_17d5;
				break;
			}
			case 12: {
				cGame.var_800c.sub_6b0c(cGame.var_7114[cGame.var_70ec][i * 6],
						cGame.var_7114[cGame.var_70ec][i * 6 + 1], 1500);
				break;
			}
			case 114: {
				final Class_f sub_53db4;
				(sub_53db4 = Class_f.sub_53db(0,
						cGame.var_7114[cGame.var_70ec][i * 6])).var_17cd = cGame.var_800c.var_17cd
								+ cGame.var_7114[cGame.var_70ec][i * 6 + 1];
				sub_53db4.var_17d5 = cGame.var_800c.var_17d5 + cGame.var_7114[cGame.var_70ec][i * 6 + 2];
				sub_53db4.var_1845 = sub_53db4.var_17cd;
				sub_53db4.var_184d = sub_53db4.var_17d5;
				if (cGame.var_711c == 19) {
					sub_23a84(43);
				}
				break;
			}
			case 115: {
				final Class_f sub_53db5 = Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6]);
				final int n = cGame.var_7114[cGame.var_70ec][i * 6 + 1];
				final int n2 = cGame.var_7114[cGame.var_70ec][i * 6 + 2];
				final int n3 = n;
				final Class_f class_f = sub_53db5;
				switch (sub_53db5.var_17c5) {
				case 42: {
					class_f.sub_670e(cGame.var_800c.var_17cd + n3, cGame.var_800c.var_17d5 + n2);
					continue;
				}
				case 32: {
					class_f.var_1845 = cGame.var_800c.var_17cd + n3;
					class_f.var_184d = cGame.var_800c.var_17d5 + n2;
					continue;
				}
				case 51: {
					class_f.sub_924a(cGame.var_800c.var_17cd + n3, cGame.var_800c.var_17d5 + n2);
					continue;
				}
				case 13: {
					class_f.sub_6b0c(cGame.var_800c.var_17cd + n3, cGame.var_800c.var_17d5 + n2, 1500);
					continue;
				}
				}
				break;
			}
			}
		}
	}

	private static void sub_2fced(final Class_f class_f, final int var_1845, final int var_184d) {
		switch (class_f.var_17c5) {
		case 42: {
			class_f.sub_670e(var_1845, var_184d);
			return;
		}
		case 32: {
			class_f.var_1845 = var_1845;
			class_f.var_184d = var_184d;
			return;
		}
		case 51: {
			if (cGame.var_711c == 17) {
				sub_23a84(52);
			}
			class_f.sub_924a(var_1845, var_184d);
			return;
		}
		case 13: {
			class_f.sub_6b0c(var_1845, var_184d, 1500);
			break;
		}
		}
	}

	private static void sub_2fdb1() {
		if (cGame.var_70ec < cGame.var_7124) {
			int n = 0;
			if (cGame.var_70ec + 1 < cGame.var_7124
					&& cGame.var_7104[cGame.var_70ec + 1] - cGame.var_7104[cGame.var_70ec] > 1
					&& cGame.var_710c[cGame.var_70ec][0] != 116) {
				++cGame.var_70f4;
				if (cGame.var_7104[cGame.var_70ec + 1] - cGame.var_7104[cGame.var_70ec] <= cGame.var_70f4) {
					n = Integer.MAX_VALUE;
				}
			} else {
				for (int i = 0; i < cGame.var_710c[cGame.var_70ec].length; ++i) {
					switch (cGame.var_710c[cGame.var_70ec][i]) {
					case 11:
					case 21:
					case 102:
					case 103:
					case 106:
					case 107:
					case 108:
					case 110:
					case 112:
					case 113:
					case 114: {
						++n;
						break;
					}
					case 116: {
						final Class_f sub_53db;
						if ((sub_53db = Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6])).var_189d
								.sub_1b34()) {
							sub_53db.sub_a25c(8);
							++n;
						}
						break;
					}
					case 22: {
						if (Class_f.sub_53db(0, cGame.var_7114[cGame.var_70ec][i * 6]).var_189d.sub_1a8a() <= 0) {
							++n;
						}
						break;
					}
					case 105: {
						final Class_f[] array = new Class_f[2];
						Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
								cGame.var_7114[cGame.var_70ec][i * 6 + 1], array, 1);
						if (array[0].var_189d.sub_1a8a() <= 0) {
							++n;
						}
						break;
					}
					case 111:
					case 115: {
						final Class_f sub_53db2;
						if ((sub_53db2 = Class_f.sub_53db(0,
								cGame.var_7114[cGame.var_70ec][i * 6])).var_17cd == sub_53db2.var_1845
								&& sub_53db2.var_17d5 == sub_53db2.var_184d) {
							++n;
						}
						break;
					}
					case 12: {
						if (cGame.var_800c.var_17cd + (GLLib.s_screenWidth >> 1) == cGame.var_800c.var_1845
								&& cGame.var_800c.var_17d5 + (GLLib.s_screenHeight >> 1) == cGame.var_800c.var_184d) {
							++n;
							break;
						}
						break;
					}
					case 104:
					case 109: {
						final Class_f[] array2 = new Class_f[2];
						Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][i * 6],
								cGame.var_7114[cGame.var_70ec][i * 6 + 1], array2, 1);
						switch (array2[0].var_17c5) {
						case 13: {
							if (array2[0].var_17cd + (GLLib.s_screenWidth >> 1) == array2[0].var_1845
									&& array2[0].var_17d5 + (GLLib.s_screenHeight >> 1) == array2[0].var_184d) {
								++n;
								continue;
							}
							continue;
						}
						default: {
							if (array2[0].var_17cd == array2[0].var_1845 && array2[0].var_17d5 == array2[0].var_184d) {
								++n;
								continue;
							}
							continue;
						}
						}

					}
					}
				}
			}
			if (n >= cGame.var_710c[cGame.var_70ec].length) {
				sub_30117();
			}
			sub_23dba();
		}
	}

	private static void sub_30117() {
		++cGame.var_70ec;
		cGame.var_70f4 = 0;
		if (cGame.var_70ec < cGame.var_7124) {
			sub_2f549();
			return;
		}
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static int sub_30161(final int n) {
		return (n << cGame.field_cq | n >> 32 - cGame.field_cq) ^ cGame.field_cr;
	}

	private static int getIntValue(int value) {
		return (value ^= cGame.field_cr) >> cGame.field_cq | value << 32 - cGame.field_cq;
	}

	private static long sub_301bd(final long n) {
		return (n << cGame.field_cq | n >> 64 - cGame.field_cq) ^ (long) cGame.field_cr;
	}

	private static long sub_301eb(final long n) {
		final long n2 = n ^ (long) cGame.field_cr;
		return n2 >> cGame.field_cq | n2 << 64 - cGame.field_cq;
	}

	private static void sub_3021b(final boolean b) {
		Class_h.var_6a = new Class_h[34];
		GLLib.Pack_Open("/9");
		for (int i = 0; i < 34; ++i) {
			Class_h.var_6a[i] = new Class_h();
			final byte[] sub_3253 = GLLib.Pack_ReadData(i);
			new StringBuffer().append("Open File ").append(i);
			int n = 0;
			Class_h.var_6a[i].var_7a = GLLib.Mem_GetInt(sub_3253, 0);
			n += 4;
			Class_h.var_6a[i].var_72 = GLLib.Mem_GetInt(sub_3253, 4);
			n += 4;
			if (Class_h.var_6a[i].var_7a > 0 && Class_h.var_6a[i].var_72 > 0) {
				final byte[] array = new byte[Class_h.var_6a[i].var_72];
				for (int j = 0; j < Class_h.var_6a[i].var_72; ++j) {
					array[j] = sub_3253[n];
					++n;
				}
				Class_h.var_6a[i].var_82 = new int[Class_h.var_6a[i].var_7a][Class_h.var_6a[i].var_72];
				for (int k = 0; k < Class_h.var_6a[i].var_7a; ++k) {
					for (int l = 0; l < Class_h.var_6a[i].var_72; ++l) {
						switch (array[l]) {
						case 1: {
							Class_h.var_6a[i].var_82[k][l] = sub_3253[n];
							break;
						}
						case 2: {
							Class_h.var_6a[i].var_82[k][l] = GLLib.sub_3eb0(sub_3253, n);
							break;
						}
						case 4: {
							Class_h.var_6a[i].var_82[k][l] = GLLib.Mem_GetInt(sub_3253, n);
							break;
						}
						}
						n += array[l];
					}
					if (!cGame.s_iapEnabled) {
						final int n2 = i;
						final int n3 = k;
						final int n4 = n2;
						switch (n2) {
						case 20: {
							Class_h.var_6a[n4].var_82[n3][1] = Class_h.var_6a[n4].var_82[n3][2];
						}
						case 3: {
							Class_h.var_6a[n4].var_82[n3][15] = Class_h.var_6a[n4].var_82[n3][16];
							Class_h.var_6a[n4].var_82[n3][31] = Class_h.var_6a[n4].var_82[n3][32];
							Class_h.var_6a[n4].var_82[n3][13] = Class_h.var_6a[n4].var_82[n3][14];
							break;
						}
						case 0: {
							Class_h.var_6a[n4].var_82[n3][15] = Class_h.var_6a[n4].var_82[n3][16];
							break;
						}
						case 2: {
							Class_h.var_6a[n4].var_82[n3][16] = Class_h.var_6a[n4].var_82[n3][17];
							Class_h.var_6a[n4].var_82[n3][12] = Class_h.var_6a[n4].var_82[n3][13];
							break;
						}
						case 7: {
							Class_h.var_6a[n4].var_82[n3][16] = Class_h.var_6a[n4].var_82[n3][17];
							break;
						}
						case 22: {
							Class_h.var_6a[n4].var_82[n3][13] = Class_h.var_6a[n4].var_82[n3][14];
							break;
						}
						case 4: {
							Class_h.var_6a[n4].var_82[n3][19] = Class_h.var_6a[n4].var_82[n3][20];
							break;
						}
						case 1: {
							Class_h.var_6a[n4].var_82[n3][5] = Class_h.var_6a[n4].var_82[n3][6];
							Class_h.var_6a[n4].var_82[n3][7] = Class_h.var_6a[n4].var_82[n3][8];
							break;
						}
						case 6: {
							Class_h.var_6a[n4].var_82[n3][8] = Class_h.var_6a[n4].var_82[n3][9];
							Class_h.var_6a[n4].var_82[n3][10] = Class_h.var_6a[n4].var_82[n3][11];
							break;
						}
						}
					}
				}
			}
		}
		GLLib.Pack_FullyClose();
		cGame.var_7754 = 0;
		cGame.var_6b64 = 0;
		cGame.var_6b6c = null;
		cGame.var_6b74 = null;
		cGame.var_6b7c = null;
		cGame.var_6b84 = null;
		cGame.var_6b8c = 0;
		cGame.var_6b94 = 0;
		cGame.var_6b9c = false;
		cGame.var_6ba4 = "";
		cGame.var_6bac = 0L;
		cGame.var_6bb4 = 0;
		cGame.var_6bbc = 0;
		cGame.var_6bc4 = false;
		cGame.var_6bcc = '\0';
		cGame.var_6bd4 = false;
		cGame.var_6bdc = 0;
		cGame.var_6be4 = '\0';
		cGame.var_6bec = false;
		cGame.var_6bf4 = 0;
		cGame.var_6bfc = 0;
		cGame.var_6c04 = 0;
		cGame.var_6c0c = 0;
		cGame.var_6c14 = false;
		cGame.var_6c1c = false;
		cGame.var_6c24 = false;
		cGame.var_6c2c = false;
		cGame.var_6c34 = false;
		cGame.var_6c3c = false;
		cGame.var_6c44 = false;
		cGame.var_6c4c = false;
		cGame.var_6c54 = false;
		cGame.var_6c5c = 0;
		cGame.var_6c64 = 0;
		cGame.var_6c6c = false;
		cGame.var_6c74 = 0;
		cGame.var_6c7c = false;
		sub_492fc();
		sub_4932b();
		sub_4934e();
		cGame.var_748c = new int[cGame.var_7474];
		cGame.var_7494 = new int[cGame.var_7474];
		cGame.var_749c = new int[cGame.var_7474];
		cGame.var_74a4 = new long[cGame.var_7474];
		cGame.var_74ac = new int[cGame.var_7474];
		cGame.var_74b4 = new int[cGame.var_7474];
		cGame.var_74c4 = new boolean[cGame.var_7474];
		cGame.var_74cc = new int[cGame.var_7474];
		cGame.var_74d4 = new String[cGame.var_7474];
		cGame.var_74bc = new byte[cGame.var_7474];
		cGame.var_752c = new int[cGame.var_7474];
		cGame.var_7534 = new int[cGame.var_7474];
		cGame.var_753c = new int[cGame.var_7474];
		cGame.var_7544 = new long[cGame.var_7474];
		cGame.var_754c = new int[cGame.var_7474];
		cGame.var_7554 = new int[cGame.var_7474];
		cGame.var_755c = new int[cGame.var_7474];
		cGame.var_756c = new int[cGame.var_7474];
		cGame.var_7574 = new String[cGame.var_7474];
		cGame.var_7564 = new byte[cGame.var_7474];
		sub_2b6d7();
		sub_39be7();
		final Class_h class_h = Class_h.var_6a[20];
		cGame.var_8064 = new int[30];
		for (int n5 = 0; n5 < 30; ++n5) {
			cGame.var_8064[n5] = class_h.var_82[n5][1];
		}
		final Class_h class_h2 = Class_h.var_6a[31];
		cGame.var_806c = new int[14];
		for (int n6 = 0; n6 < 14; ++n6) {
			cGame.var_806c[n6] = class_h2.var_82[n6][2];
		}
		GLLib.text_encoding = "UTF-8";
		cGame.var_7fd4 = 0;
		cGame.var_7fc4 = 100;
		cGame.var_8074 = true;
		cGame.var_7fdc = false;
		cGame.var_807c = 0;
		cGame.var_8084 = 0;
		cGame.var_7ff4 = new ASprite[159];
		cGame.var_7ffc = new ASprite[6];
		ASprite.sub_3d55(cGame.var_7c04[cGame.var_7c04.length - 1][0]);
		for (int n7 = 0; n7 < cGame.var_7c04.length - 1; ++n7) {
			ASprite.sub_3d8a(cGame.var_7c04[n7][0], cGame.var_7c04[n7][1]);
		}
		sub_1c6ac();
		(cGame.var_689c = new ASprite[3][])[0] = cGame.var_7ff4;
		cGame.var_689c[1] = cGame.var_68d4;
		cGame.var_689c[2] = cGame.var_7ffc;
		(cGame.var_68a4 = new int[3])[0] = 159;
		cGame.var_68a4[1] = 122;
		cGame.var_68a4[2] = 6;
		(cGame.var_6884 = new byte[3][])[0] = new byte[159];
		cGame.var_6884[1] = new byte[122];
		cGame.var_6884[2] = new byte[6];
		(cGame.var_688c = new short[3][])[0] = new short[159];
		cGame.var_688c[1] = new short[122];
		cGame.var_688c[2] = new short[6];
		(cGame.var_6894 = new short[3][])[0] = new short[159];
		cGame.var_6894[1] = new short[122];
		cGame.var_6894[2] = new short[6];
		cGame.var_68b4 = new byte[119];
		cGame.var_69e4 = true;
		cGame.var_80cc = new short[117];
		cGame.var_80d4 = new short[117];
		cGame.var_80dc = new short[117];
		final Class_h class_h3 = Class_h.var_6a[1];
		for (int n8 = 0; n8 < 117; ++n8) {
			cGame.var_80cc[n8] = (short) class_h3.var_82[n8][1];
			cGame.var_80d4[n8] = (short) class_h3.var_82[n8][3];
			cGame.var_80dc[n8] = (short) class_h3.var_82[n8][4];
		}
		cGame.var_8094 = new short[22];
		cGame.var_809c = new int[22];
		final Class_h class_h4 = Class_h.var_6a[2];
		for (int n9 = 0; n9 < 22; ++n9) {
			cGame.var_8094[n9] = (short) class_h4.var_82[n9][1];
			cGame.var_809c[n9] = class_h4.var_82[n9][2];
		}
		cGame.var_80a4 = new short[64];
		cGame.var_80ac = new int[64];
		final Class_h class_h5 = Class_h.var_6a[0];
		for (int n10 = 0; n10 < 64; ++n10) {
			cGame.var_80a4[n10] = (short) class_h5.var_82[n10][1];
			cGame.var_80ac[n10] = class_h5.var_82[n10][2];
		}
		cGame.var_80bc = new int[10];
		final Class_h class_h6 = Class_h.var_6a[8];
		for (int n11 = 0; n11 < 10; ++n11) {
			cGame.var_80bc[n11] = class_h6.var_82[n11][1];
		}
		cGame.var_80c4 = new short[63];
		final Class_h class_h7 = Class_h.var_6a[4];
		for (int n12 = 0; n12 < 63; ++n12) {
			cGame.var_80c4[n12] = (short) class_h7.var_82[n12][1];
		}
		cGame.var_80fc = new short[297];
		cGame.var_80f4 = new short[297];
		final Class_h class_h8 = Class_h.var_6a[6];
		for (int n13 = 0; n13 < 297; ++n13) {
			cGame.var_80fc[n13] = (short) class_h8.var_82[n13][3];
			cGame.var_80f4[n13] = (short) class_h8.var_82[n13][1];
		}
		cGame.var_80e4 = new short[83];
		final Class_h class_h9 = Class_h.var_6a[7];
		for (int n14 = 0; n14 < 83; ++n14) {
			cGame.var_80e4[n14] = (short) class_h9.var_82[n14][1];
		}
		cGame.var_80ec = new short[6];
		final Class_h class_h10 = Class_h.var_6a[22];
		for (int n15 = 0; n15 < 6; ++n15) {
			cGame.var_80ec[n15] = (short) class_h10.var_82[n15][1];
		}
		cGame.var_80b4 = new short[20];
		final Class_h class_h11 = Class_h.var_6a[3];
		for (int n16 = 0; n16 < 20; ++n16) {
			cGame.var_80b4[n16] = (short) class_h11.var_82[n16][1];
			if (class_h11.var_82[n16][0] == 10) {
				cGame.var_76d4 = class_h11.var_82[n16][30];
			} else if (class_h11.var_82[n16][0] == 13) {
				cGame.var_701c = class_h11.var_82[n16][30];
			}
		}
		cGame.var_8104 = new int[1440];
		cGame.var_810c = new short[1440];
		final Class_h class_h12 = Class_h.var_6a[29];
		for (int n17 = 0; n17 < 1440; ++n17) {
			cGame.var_8104[n17] = class_h12.var_82[n17][1];
			cGame.var_810c[n17] = (short) class_h12.var_82[n17][2];
		}
		cGame.var_8114 = new int[281];
		cGame.var_811c = new short[281];
		final Class_h class_h13 = Class_h.var_6a[32];
		for (int n18 = 0; n18 < 281; ++n18) {
			cGame.var_8114[n18] = class_h13.var_82[n18][2];
			cGame.var_811c[n18] = (short) class_h13.var_82[n18][1];
		}
		sub_2ebbe();
		cGame.var_6fc4 = new byte[9216];
		sub_2d8bf();
		Class_f.sub_9f59();
		cGame.var_6f64 = new int[4];
		cGame.var_6f6c = new int[4];
		sub_2e27a(b);
		sub_2b18e();
		sub_2a274();
		cGame.var_808c = 0;
		cGame.var_721c = 2;
		cGame.var_7224 = -1;
		cGame.var_722c = 0;
	}

	private static boolean sub_30df7(int n) {
		if (n == 0) {
			cGame.var_7234 = sub_237d7(2, 0, 1, 14, 42, 111) + 10;
			sub_1daf4(2);
			sub_2c69b();
			sub_1fb8e(2);
			cGame.var_71a4 = null;
			cGame.var_71ac = null;
			cGame.var_71b4 = null;
			cGame.var_71bc = null;
			cGame.var_71c4 = null;
			cGame.var_71cc = null;
			cGame.var_71d4 = null;
			cGame.var_71dc = null;
			cGame.var_71e4 = null;
			cGame.var_71ec = null;
			cGame.var_71f4 = null;
			cGame.var_71fc = null;
			cGame.var_7204 = null;
			final String sub_4e1f;
			cGame.var_68cc[2][1] = (((sub_4e1f = GLLib.TODO_sub_4e1f(121)) == null) ? "" : sub_4e1f);
		}
		if (n == 1) {
			if (cGame.var_721c == 0) {
				if (cGame.var_722c == 4) {
					sub_3151e(cGame.var_721c, -1);
				} else {
					sub_31ca6(0);
				}
			} else {
				sub_3151e(cGame.var_721c, cGame.var_7224);
			}
			sub_11cd7(cGame.var_722c);
			cGame.var_720c = -1;
			cGame.var_7214 = 0;
			cGame.var_7034 = Class_f.sub_4cf5(0, 49);
			if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
				sub_2024d(2, 4, true);
				sub_2024d(2, 8, cGame.s_iapEnabled);
				sub_2000c(2, 8, cGame.s_iapEnabled);
			} else {
				sub_2024d(2, 4, false);
				sub_2024d(2, 8, false);
			}
			sub_2c69b();
			sub_1f8c5(2);
		}
		if (n == 5) {
			sub_32132(-1);
			cGame.var_71a4 = null;
			cGame.var_71ac = null;
			cGame.var_71b4 = null;
			cGame.var_71bc = null;
			cGame.var_71c4 = null;
			cGame.var_71cc = null;
			cGame.var_71d4 = null;
			cGame.var_71ec = null;
			cGame.var_71f4 = null;
			cGame.var_71fc = null;
			cGame.var_7204 = null;
			sub_234f2(0);
			sub_239ef(2);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				if (cGame.var_7fd4 > 0) {
					final String sub_4e1f2;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f2 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f2));
				} else {
					sub_118ee();
				}
			}
			if (cGame.var_7fd4 > 0) {
				sub_273b8();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_7234 && cGame.var_7214 < cGame.var_719c - '\u0006') {
					sub_3275b(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_7214 > 0) {
					sub_3275b(-1);
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(2);
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " "), 2, 5, 0, 0);
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " "), 2, 9, 0, 0);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[2][26][5]].sub_3882(cGame.var_68bc[2][26][6], 0, array, 0);
			final int n2 = cGame.var_68bc[2][26][2] + array[0];
			final int n3 = cGame.var_68bc[2][26][3] + array[1];
			final int n4 = array[2];
			final int n5 = array[3];
			final int n6 = n4;
			final int n7 = n3;
			n = n2;
			GLLib.sub_36f4(GLLib.g, n, n7, n6, n5, true);
			n = ((cGame.var_719c - cGame.var_7214 >= 6) ? 6 : (cGame.var_719c - cGame.var_7214));
			for (int i = 0; i < n; ++i) {
				final String sub_4e1f3;
				sub_1e2f2(((sub_4e1f3 = GLLib.TODO_sub_4e1f(cGame.var_71a4[i + cGame.var_7214])) == null) ? ""
						: sub_4e1f3, 2, 29 + i * 14, 0, 0);
				if (cGame.var_721c != 0 || cGame.var_7224 != -1
						|| (cGame.var_722c == 4 && cGame.var_721c == 0 && cGame.var_7224 == -1)) {
					if (sub_20167(2, 33 + i * 14)) {
						final int n8 = i + cGame.var_7214;
						if (cGame.var_71cc[n8] > 0) {
							sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_71cc[n8], cGame.var_7fe4, " "), 2, 32 + i * 14, 0,
									0);
						} else if (cGame.var_71d4[n8] > 0) {
							sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_71d4[n8], cGame.var_7fe4, " "), 2, 32 + i * 14, 0,
									0);
						}
					}
					if (sub_20167(2, 40 + i * 14)) {
						final String sub_4e1f4;
						sub_1df06(
								(((sub_4e1f4 = GLLib.TODO_sub_4e1f(447)) == null) ? "" : sub_4e1f4)
										+ Integer.toString(cGame.var_71fc[i + cGame.var_7214]),
								2, 32 + i * 14, 0, 0);
					}
				}
			}
			if (cGame.var_720c >= 0 && cGame.var_720c < 6) {
				sub_1df06(
						GLLib.CurrencySeparator_just_a_guess(cGame.var_71c4[cGame.var_720c + cGame.var_7214], cGame.var_7fe4, " "),
						2, 39 + 14 * cGame.var_720c, 0, 0);
				final int n9 = (n = cGame.var_71bc[cGame.var_720c + cGame.var_7214]) / 86400;
				final int n10;
				int j = (n10 = n % 86400) / 3600;
				final int n11;
				final int k = (n11 = n10 % 3600) / 60;
				final int l = n11 % 60;
				final String s = "";
				String s2;
				if (n > 0) {
					if (n9 > 0) {
						j += n9 * 24;
					}
					String str;
					if (j > 0) {
						str = s + j + ":";
					} else {
						str = s + "00:";
					}
					String str2;
					if (k > 0) {
						if (k / 10 < 1) {
							str += "0";
						}
						str2 = str + k + ":";
					} else {
						str2 = str + "00:";
					}
					if (l > 0) {
						if (l / 10 < 1) {
							str2 += "0";
						}
						s2 = str2 + l;
					} else {
						s2 = str2 + "00";
					}
				} else {
					s2 = "-";
				}
				sub_1df06(s2, 2, 37 + 14 * cGame.var_720c, 0, 0);
				sub_1df06(
						GLLib.CurrencySeparator_just_a_guess(cGame.var_71b4[cGame.var_720c + cGame.var_7214], cGame.var_7fe4, " "),
						2, 35 + 14 * cGame.var_720c, 0, 0);
			}
			if (cGame.var_720c != 0 && cGame.var_721c == 2 && cGame.var_7214 == 0) {
				sub_1df06(Integer.toString(cGame.var_7034) + "/" + getMaxPlots(), 2, 27, 0, 0);
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_3151e(final int var_721c, int var_7224) {
		sub_32132(-1);
		cGame.var_721c = var_721c;
		cGame.var_7224 = var_7224;
		cGame.var_719c = '\0';
		cGame.var_7214 = 0;
		var_7224 = 0;
		final Class_h class_h;
		final int var_7a = (class_h = Class_h.var_6a[var_721c]).var_7a;
		if (class_h != null) {
			cGame.var_71a4 = new int[var_7a];
			cGame.var_71ac = new int[var_7a];
			cGame.var_71b4 = new int[var_7a];
			cGame.var_71bc = new int[var_7a];
			cGame.var_71c4 = new int[var_7a];
			cGame.var_71cc = new int[var_7a];
			cGame.var_71d4 = new int[var_7a];
			cGame.var_71dc = new int[var_7a];
			cGame.var_71e4 = new int[var_7a];
			cGame.var_71ec = new int[var_7a];
			cGame.var_71f4 = new int[var_7a];
			cGame.var_71fc = new int[var_7a];
			cGame.var_7204 = new boolean[var_7a];
		}
		int n = -1;
		for (int i = 0; i < var_7a; ++i) {
			if (cGame.var_721c != 0 || cGame.var_7224 == class_h.var_82[i][9]) {
				switch (cGame.var_721c) {
				case 0: {
					if ((n = class_h.var_82[i][5]) > -1) {
						cGame.var_71ac[n] = class_h.var_82[i][0];
						cGame.var_71a4[n] = class_h.var_82[i][2];
						cGame.var_71cc[n] = class_h.var_82[i][6];
						cGame.var_71d4[n] = class_h.var_82[i][7];
						cGame.var_71f4[n] = class_h.var_82[i][1];
						cGame.var_71dc[n] = class_h.var_82[i][3];
						cGame.var_71e4[n] = class_h.var_82[i][4];
						cGame.var_71fc[n] = class_h.var_82[i][8];
						cGame.var_7204[n] = (class_h.var_82[i][8] > getLevel());
						cGame.var_71ec[n] = class_h.var_82[i][32];
						cGame.var_71b4[n] = class_h.var_82[i][10];
						if (class_h.var_82[i][34] == 1) {
							cGame.var_71bc[n] = class_h.var_82[i][13] * 60;
						} else {
							cGame.var_71bc[n] = class_h.var_82[i][25] * 60;
						}
						cGame.var_71c4[n] = class_h.var_82[i][15];
						break;
					}
					break;
				}
				case 2: {
					if ((n = class_h.var_82[i][5]) > -1) {
						cGame.var_71ac[n] = class_h.var_82[i][0];
						cGame.var_71a4[n] = class_h.var_82[i][2];
						cGame.var_71cc[n] = class_h.var_82[i][6];
						cGame.var_71d4[n] = class_h.var_82[i][7];
						cGame.var_71f4[n] = class_h.var_82[i][1];
						cGame.var_71dc[n] = class_h.var_82[i][3];
						cGame.var_71e4[n] = class_h.var_82[i][4];
						cGame.var_71fc[n] = class_h.var_82[i][8];
						cGame.var_7204[n] = (class_h.var_82[i][8] > getLevel());
						cGame.var_71b4[n] = class_h.var_82[i][16];
						cGame.var_71bc[n] = class_h.var_82[i][11];
						cGame.var_71c4[n] = class_h.var_82[i][12];
						break;
					}
					break;
				}
				case 3: {
					if ((n = class_h.var_82[i][5]) > -1) {
						cGame.var_71ac[n] = class_h.var_82[i][0];
						cGame.var_71a4[n] = class_h.var_82[i][2];
						if (class_h.var_82[i][7] > 0) {
							final int sub_4d73 = Class_f.sub_4d73(0, class_h.var_82[i][1]);
							cGame.var_71cc[n] = class_h.var_82[i][6
									+ ((sub_4d73 - 1 < 0) ? 0 : ((sub_4d73 - 1 > 3) ? 3 : (sub_4d73 - 1)))];
						} else {
							cGame.var_71cc[n] = class_h.var_82[i][6];
						}
						cGame.var_71d4[n] = class_h.var_82[i][10];
						cGame.var_71f4[n] = class_h.var_82[i][1];
						cGame.var_71dc[n] = class_h.var_82[i][3];
						cGame.var_71e4[n] = class_h.var_82[i][4];
						cGame.var_71fc[n] = class_h.var_82[i][11];
						cGame.var_7204[n] = (class_h.var_82[i][11] > getLevel());
						break;
					}
					break;
				}
				case 4: {
					if ((n = class_h.var_82[i][5]) > -1) {
						cGame.var_71ac[n] = class_h.var_82[i][0];
						cGame.var_71a4[n] = class_h.var_82[i][2];
						cGame.var_71cc[n] = class_h.var_82[i][6];
						cGame.var_71d4[n] = class_h.var_82[i][7];
						cGame.var_71f4[n] = class_h.var_82[i][1];
						cGame.var_71dc[n] = class_h.var_82[i][3];
						cGame.var_71e4[n] = class_h.var_82[i][4];
						cGame.var_71fc[n] = class_h.var_82[i][8];
						cGame.var_7204[n] = (class_h.var_82[i][8] > getLevel());
						break;
					}
					break;
				}
				}
				if (n > -1) {
					if (n < 6) {
						sub_31ee1(n, true, false);
						++var_7224;
					}
					++cGame.var_719c;
				}
			}
		}
		for (int j = var_7224; j < 6; ++j) {
			sub_31ee1(j, false, false);
		}
		if (cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			sub_2024d(2, 113, false);
			sub_2000c(2, 113, false);
			if (var_721c != 0) {
				sub_2000c(2, 117, false);
				sub_2000c(2, 121, false);
				sub_2000c(2, 116, true);
				sub_2024d(2, 28, false);
				sub_2024d(2, 42, false);
				sub_2024d(2, 56, false);
				sub_2024d(2, 70, false);
				sub_2024d(2, 84, false);
				sub_2000c(2, 11, true);
				sub_2024d(2, 10, false);
				sub_2024d(2, 11, true);
				sub_2024d(2, 12, false);
				sub_2024d(2, 13, false);
				sub_2024d(2, 14, false);
				sub_2024d(2, 41, false);
				sub_2024d(2, 55, false);
				sub_2024d(2, 69, false);
				sub_2024d(2, 83, false);
				sub_2024d(2, 97, false);
				sub_2000c(2, 41, false);
				sub_2000c(2, 55, false);
				sub_2000c(2, 69, false);
				sub_2000c(2, 83, false);
				sub_2000c(2, 97, false);
			}
		}
		sub_2c69b();
		sub_1fb8e(2);
		if (cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			sub_234cb(0, 1);
			return;
		}
		sub_22d97(0);
	}

	private static void sub_31ca6(int n) {
		sub_32132(-1);
		cGame.var_721c = 0;
		cGame.var_7224 = -1;
		cGame.var_719c = '\0';
		cGame.var_7214 = 0;
		n = 0;
		final Class_h class_h;
		final int var_7a = (class_h = Class_h.var_6a[13]).var_7a;
		if (class_h != null) {
			cGame.var_71a4 = new int[var_7a];
			cGame.var_71ac = null;
			cGame.var_71b4 = new int[var_7a];
			cGame.var_71bc = new int[var_7a];
			cGame.var_71c4 = new int[var_7a];
			cGame.var_71cc = null;
			cGame.var_71d4 = null;
			cGame.var_71dc = new int[var_7a];
			cGame.var_71e4 = new int[var_7a];
			cGame.var_71ec = new int[var_7a];
			cGame.var_71f4 = new int[var_7a];
			cGame.var_71fc = new int[var_7a];
			cGame.var_7204 = new boolean[var_7a];
		}
		for (int i = 0; i < var_7a; ++i) {
			cGame.var_71dc[i] = class_h.var_82[i][2];
			cGame.var_71e4[i] = class_h.var_82[i][3];
			cGame.var_71a4[i] = class_h.var_82[i][1];
			if (i < 6) {
				sub_31ee1(i, true, true);
				++n;
			}
			++cGame.var_719c;
		}
		for (int j = n; j < 6; ++j) {
			sub_31ee1(j, false, true);
		}
		if (cGame.var_7fd4 == 13 || cGame.var_7fd4 == 14) {
			cGame.var_7fd4 = 14;
			sub_2024d(2, 113, false);
			sub_2000c(2, 113, false);
			sub_2000c(2, 116, false);
			sub_2000c(2, 121, false);
			sub_2000c(2, 117, true);
			sub_2024d(2, 28, false);
			sub_2024d(2, 42, true);
			sub_2024d(2, 56, false);
			sub_2024d(2, 70, false);
			sub_2024d(2, 84, false);
			sub_2000c(2, 11, true);
			sub_2024d(2, 10, false);
			sub_2024d(2, 11, true);
			sub_2024d(2, 12, false);
			sub_2024d(2, 13, false);
			sub_2024d(2, 14, false);
			sub_2024d(2, 41, false);
			sub_2024d(2, 55, false);
			sub_2024d(2, 69, false);
			sub_2024d(2, 83, false);
			sub_2024d(2, 97, false);
			sub_2000c(2, 41, false);
			sub_2000c(2, 55, false);
			sub_2000c(2, 69, false);
			sub_2000c(2, 83, false);
			sub_2000c(2, 97, false);
		}
		sub_2c69b();
		sub_1fb8e(2);
		if (cGame.var_7fd4 == 14) {
			sub_234cb(0, 1);
		}
	}

	private static void sub_31ee1(final int var_720c, final boolean b, final boolean b2) {
		int n3;
		int n2;
		for (int n = (n2 = (n3 = var_720c * 14) + 28) + 14, i = n2; i < n; ++i) {
			sub_2000c(2, i, b);
		}
		if (b) {
			final int n4 = n3 + 30;
			cGame.var_68bc[2][n4][5] = (short) cGame.var_71dc[cGame.var_7214 + var_720c];
			cGame.var_68bc[2][n4][6] = (short) cGame.var_71e4[cGame.var_7214 + var_720c];
			if (cGame.var_7204[cGame.var_7214 + var_720c]) {
				sub_2000c(2, n3 + 40, true);
				sub_2000c(2, n3 + 33, false);
			} else {
				sub_2000c(2, n3 + 40, false);
				sub_2000c(2, n3 + 33, true);
			}
			if (cGame.var_7fd4 == 14 && var_720c != 0) {
				sub_2024d(2, n2, false);
			} else {
				sub_2024d(2, n2, true);
			}
			if (cGame.var_721c == 0) {
				cGame.var_68bc[2][n4][8] = (short) cGame.var_71ec[cGame.var_7214 + var_720c];
				cGame.var_68bc[2][n4][9] = 1;
			} else {
				cGame.var_68bc[2][n4][9] = 0;
			}
			if (b2) {
				sub_2000c(2, n3 + 31, false);
				sub_2000c(2, n3 + 33, false);
				sub_2000c(2, n3 + 32, false);
			} else {
				final int n5 = n3 + 33;
				if (cGame.var_71cc[cGame.var_7214 + var_720c] > 0) {
					cGame.var_68bc[2][n5][6] = 115;
				} else {
					cGame.var_68bc[2][n5][6] = 114;
				}
			}
			if (b2 || (cGame.var_721c != 2 && cGame.var_721c != 0)) {
				sub_2000c(2, n3 + 41, false);
			}
			if (cGame.var_721c == 2 && cGame.var_7214 + var_720c == 0) {
				sub_2000c(2, 41, false);
			}
			sub_32132(cGame.var_720c = var_720c);
		}
	}

	private static void sub_32132(final int var_720c) {
		final boolean b = cGame.var_720c != var_720c && var_720c > -1;
		if (cGame.var_720c >= 0 && cGame.var_720c < 6) {
			final int n = 14 * cGame.var_720c;
			sub_2000c(2, n + 30, true);
			sub_2000c(2, n + 34, false);
			sub_2000c(2, n + 36, false);
			sub_2000c(2, n + 38, false);
		}
		if (b) {
			cGame.var_720c = var_720c;
		}
		if (cGame.var_720c >= 0 && cGame.var_720c < 6) {
			final int n2 = 14 * cGame.var_720c;
			sub_2000c(2, n2 + 30, !b);
			sub_2000c(2, n2 + 34, b);
			sub_2000c(2, n2 + 36, b);
			sub_2000c(2, n2 + 38, b);
		}
		if (!b) {
			cGame.var_720c = -1;
		}
		if (cGame.var_7fd4 == 14) {
			sub_2000c(2, 117, false);
			sub_2000c(2, 121, true);
			sub_234cb(0, 1);
		}
	}

	private static void sub_3225a(int n) {
		n += cGame.var_7214;
		final boolean b = cGame.var_71cc[n] == 0;
		if (!cGame.var_7204[n]
				&& ((!b && cGame.var_71cc[n] <= sub_2e0da()) || (b && cGame.var_71d4[n] <= getCash()))) {
			boolean b2 = false;
			if (cGame.var_71cc[n] > 0) {
				cGame.var_708c = cGame.var_71cc[n];
			} else {
				cGame.var_7094 = cGame.var_71d4[n];
			}
			switch (cGame.var_721c) {
			case 2: {
				if (cGame.var_71ac[n] == 0) {
					final Class_f[] array = new Class_f[50];
					final int sub_545c = Class_f.sub_545c(0, 49, -1, array, 50);
					int n2 = -1;
					int n3 = Integer.MAX_VALUE;
					for (int i = 0; i < sub_545c; ++i) {
						final int n4 = array[i].var_17cd - cGame.var_800c.var_17cd;
						final int n5 = array[i].var_17d5 - cGame.var_800c.var_17d5;
						final int n6;
						if ((n6 = n4 * n4 + n5 * n5) < n3) {
							n3 = n6;
							n2 = i;
						}
					}
					cGame.var_6aa4 = 1;
					Class_f var_6ab4;
					if (n2 != -1) {
						var_6ab4 = sub_25a75(49, 0, array[n2].var_17cd, array[n2].var_17d5, true);
					} else {
						var_6ab4 = sub_25a26(49, 0, true);
					}
					var_6ab4.var_18c5 = cGame.var_8094[0];
					cGame.var_6ab4 = var_6ab4;
					break;
				}
				if (cGame.var_71ac[n] <= 11) {
					cGame.var_708c = (cGame.var_7094 = 0);
					cGame.var_6b04 = sub_11774(cGame.var_71ac[n]);
					cGame.var_6afc = 0;
					break;
				}
				if (Class_f.sub_4cf5(0, 52) >= getIdk()) {
					cGame.var_708c = (cGame.var_7094 = 0);
					sub_23a84(56);
					sub_4052e(491, 492, 7, 0);
					return;
				}
				b2 = true;
				cGame.var_6aa4 = 0;
				cGame.var_6ab4 = sub_25b35(cGame.var_721c, cGame.var_71ac[n]);
				break;
			}
			case 4: {
				b2 = true;
				cGame.var_6aa4 = 0;
				if ((cGame.var_71ac[n] >= 1 && cGame.var_71ac[n] <= 4)
						|| (cGame.var_71ac[n] >= 7 && cGame.var_71ac[n] <= 12) || cGame.var_71ac[n] == 40
						|| cGame.var_71ac[n] == 41 || cGame.var_71ac[n] == 45 || cGame.var_71ac[n] == 47
						|| (cGame.var_71ac[n] >= 48 && cGame.var_71ac[n] <= 50) || cGame.var_71ac[n] == 54
						|| cGame.var_71ac[n] == 55) {
					cGame.var_6aa4 = 1;
				}
				cGame.var_6ab4 = sub_25b35(cGame.var_721c, cGame.var_71ac[n]);
				break;
			}
			default: {
				if (cGame.var_721c == 0 && Class_f.sub_4cf5(0, 54) >= getMaxSiloAmount()) {
					cGame.var_708c = (cGame.var_7094 = 0);
					sub_23a84(56);
					sub_4052e(489, 490, 7, 0);
					return;
				}
				b2 = true;
				cGame.var_6aa4 = 0;
				cGame.var_6ab4 = sub_25b35(cGame.var_721c, cGame.var_71ac[n]);
				if (cGame.var_721c == 0) {
					cGame.var_6ab4.var_16cd = (short) cGame.var_71c4[n];
					break;
				}
				break;
			}
			}
			if (cGame.var_6ab4 != null && b2) {
				final int[] array2 = new int[2];
				if (sub_2cf89(cGame.var_6ab4, array2)) {
					cGame.var_6ab4.var_17cd = array2[0];
					cGame.var_6ab4.var_17d5 = array2[1];
				}
				cGame.var_800c.sub_6b0c(cGame.var_6ab4.var_17cd, cGame.var_6ab4.var_17d5, 1000);
			}
			sub_8370(17);
			if (cGame.var_721c == 2 && cGame.var_71ac[n] >= 1 && cGame.var_71ac[n] <= 11) {
				sub_23a84(49);
			} else {
				sub_23a84(61);
			}
		} else if (cGame.var_7204[n]) {
			sub_23a84(56);
		} else {
			sub_23a84(56);
			if (b) {
				if (cGame.var_71d4[n] > 0) {
					final String sub_4e1f;
					cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f = GLLib.TODO_sub_4e1f(381)) == null) ? "" : sub_4e1f,
							"%d", GLLib.CurrencySeparator_just_a_guess(cGame.var_71d4[n] - getCash(), cGame.var_7fe4, " "));
					cGame.var_7aac = 19;
					cGame.var_815c = true;
					cGame.var_7d24 = true;
					sub_81e0(34);
				}
			} else if (cGame.var_71cc[n] > 0) {
				final String sub_4e1f2;
				cGame.var_7ab4 = GLLib.sub_547c(((sub_4e1f2 = GLLib.TODO_sub_4e1f(379)) == null) ? "" : sub_4e1f2,
						"%d", GLLib.CurrencySeparator_just_a_guess(cGame.var_71cc[n] - sub_2e0da(), cGame.var_7fe4, " "));
				cGame.var_7aac = 18;
				cGame.var_815c = true;
				cGame.var_7d24 = false;
				sub_81e0(34);
			}
		}
		if (cGame.var_7fd4 == 14) {
			cGame.var_6c94 = true;
		}
	}

	private static void sub_3275b(final int n) {
		cGame.var_7214 += n;
		final int n2 = cGame.var_6914[0][8];
		final int var_720c = cGame.var_720c;
		for (int i = 0; i < 6; ++i) {
			sub_31ee1(i, true, cGame.var_721c == 0 && cGame.var_7224 == -1 && cGame.var_722c != 4);
		}
		if (var_720c != -1) {
			sub_32132(var_720c - n);
		}
		sub_2c69b();
		sub_1fb8e(2);
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[2][42][2] - cGame.var_68bc[2][28][2]) * n;
		sub_22d97(0);
	}

	private static void sub_3282d(final int n, final int var_722c, final boolean b) {
		sub_251a0(-1);
		sub_117fc();
		sub_3d6da(false, -1);
		sub_3e7c1();
		sub_3151e(n, -1);
		cGame.var_722c = var_722c;
		if (b) {
			sub_81e0(7);
			return;
		}
		sub_82a7(7);
	}

	private static boolean sub_32880(final int n) {
		if (n == 1) {
			cGame.var_774c = sub_237d7(3, 3, 0, 11, 21, 174) + 10;
			sub_1daf4(3);
			cGame.var_7294 = 0;
			cGame.var_729c = 0;
			cGame.var_72ac = 0;
			cGame.var_72a4 = sub_2db90(0);
			sub_33687(0);
			if (cGame.var_72a4 > 0) {
				cGame.var_723c = new int[cGame.var_72a4];
				cGame.var_7244 = new int[cGame.var_72a4];
				cGame.var_724c = new int[cGame.var_72a4];
				cGame.var_7254 = new int[cGame.var_72a4];
				cGame.var_725c = new short[cGame.var_72a4];
				cGame.var_7264 = new short[cGame.var_72a4];
				cGame.var_726c = new short[cGame.var_72a4];
				cGame.var_7274 = new short[cGame.var_72a4];
				cGame.var_727c = new short[cGame.var_72a4];
				cGame.var_7284 = new byte[cGame.var_72a4];
			}
			cGame.var_72a4 = 0;
			sub_3347b();
			sub_23a84(60);
			cGame.var_68ac = 100;
			cGame.var_68bc[3][179][5] = 1138;
			cGame.var_68bc[3][179][6] = 12;
			cGame.var_68bc[3][183][5] = 1138;
			cGame.var_68bc[3][183][6] = 12;
			cGame.var_68bc[3][187][5] = 1138;
			cGame.var_68bc[3][187][6] = 12;
			cGame.var_68bc[3][191][5] = 1138;
			cGame.var_68bc[3][191][6] = 12;
			final String sub_4e1f;
			cGame.var_68cc[3][197] = (((sub_4e1f = GLLib.TODO_sub_4e1f(460)) == null) ? "" : sub_4e1f);
		}
		if (n == 5) {
			if (cGame.var_7294 > 0) {
				final int var_7294 = cGame.var_7294;
				final Class_f[] array = new Class_f[2];
				Class_f.sub_545c(0, 50, 9, array, 2);
				if (array[0] != null) {
					sub_e055(false, cGame.var_7294, array[0].var_17cd, array[0].var_17d5);
					if (cGame.var_729c > 0) {
						sub_e055(true, cGame.var_729c, array[0].var_17cd, array[0].var_17d5);
					}
				} else {
					sub_e055(false, cGame.var_7294, array[0].var_17cd, array[0].var_17d5);
					sub_e055(true, cGame.var_729c, array[0].var_17cd, array[0].var_17d5);
				}
				sub_49db0(0, var_7294, 33, false);
			}
			sub_d7d7(1);
			sub_239ef(3);
		}
		if (n == 2) {
			if (GLLib.IsAnyKeyDown() == 19) {
				if (cGame.var_7fd4 > 0) {
					final String sub_4e1f2;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f2 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f2));
				} else {
					sub_11d30();
				}
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][9] < -cGame.var_774c && cGame.var_72ac < cGame.var_72a4 - 15) {
					sub_335be(1);
				} else if (cGame.var_6914[0][9] > -10 && cGame.var_72ac > 0) {
					sub_335be(-1);
				}
			}
			if (cGame.var_7fd4 != -1) {
				sub_273b8();
			}
			sub_d841(1);
			if (!cGame.var_72ec) {
				if (cGame.var_725c[cGame.var_72b4] - cGame.var_7274[cGame.var_72b4] == 0) {
					cGame.var_68bc[3][195][6] = 124;
					sub_23a3d(3, 195, 0);
				} else {
					cGame.var_68bc[3][195][6] = 123;
					sub_23a3d(3, 195, 1);
				}
				if (cGame.var_7274[cGame.var_72b4] == 0) {
					cGame.var_68bc[3][196][6] = 126;
					sub_23a3d(3, 196, 0);
				} else {
					cGame.var_68bc[3][196][6] = 125;
					sub_23a3d(3, 196, 1);
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(3);
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(404)) == null) ? "" : sub_4e1f3, 3, 8, 0, 0);
			if (cGame.var_72ec) {
				final String sub_4e1f4;
				sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(38)) == null) ? "" : sub_4e1f4, 3, 200, 0, 0);
				final String sub_4e1f5;
				sub_1df06(((sub_4e1f5 = GLLib.TODO_sub_4e1f(cGame.var_6e4c[cGame.var_72b4][2])) == null) ? ""
						: sub_4e1f5, 3, 176, 0, 0);
				for (int i = 0; i < 3; ++i) {
					if (cGame.var_6e44[cGame.var_72b4] != null && cGame.var_6e44[cGame.var_72b4][i << 1] > -1) {
						sub_1df06(Integer.toString(cGame.var_72e4[i]) + "/" + cGame.var_72dc[i], 3, 178 + (i << 2),
								0, 0);
					}
				}
			} else if (cGame.var_72a4 > 0) {
				final String sub_4e1f6;
				sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(cGame.var_723c[cGame.var_72b4])) == null) ? "" : sub_4e1f6,
						3, 189, 0, 0);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7254[cGame.var_72b4], cGame.var_7fe4, " "), 3, 192, 0, 0);
				sub_1df06("" + cGame.var_7274[cGame.var_72b4], 3, 194, 0, 0);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(sub_336ae(), cGame.var_7fe4, " "), 3, 200, 0, 0);
			}
		}
		return false;
	}

	private static void sub_32ddb(final int n, final int n2) {
		cGame.var_72bc[n] = n2;
		cGame.var_72c4[n] = 0;
		cGame.var_72cc[n] = cGame.var_6e4c[n2][0];
		cGame.var_72d4[n] = cGame.var_6e4c[n2][1];
	}

	private static void sub_32e1a(final int n, final boolean b) {
		final int n2 = n * 11;
		sub_2000c(3, n2 + 12, cGame.var_72ec && b);
		sub_2000c(3, n2 + 14, cGame.var_72ec && b);
		sub_2000c(3, n2 + 17, cGame.var_72ec && b);
		sub_2000c(3, n2 + 19, !cGame.var_72ec && b);
		if (b) {
			sub_2024d(3, n2 + 10, true);
			sub_2000c(3, n2 + 10, true);
			if (!cGame.var_72ec) {
				cGame.var_68bc[3][n2 + 19][5] = cGame.var_7264[n + cGame.var_72ac];
				cGame.var_68bc[3][n2 + 19][6] = cGame.var_726c[n + cGame.var_72ac];
				sub_d78c(1, cGame.var_68bc[3][n2 + 19][5]);
				sub_2000c(3, n2 + 20, cGame.var_7284[n + cGame.var_72ac] == 1);
				cGame.var_68bc[3][n2 + 20][5] = 1138;
				cGame.var_68bc[3][n2 + 20][6] = 12;
				final String string = Integer
						.toString(cGame.var_725c[cGame.var_72ac + n] - cGame.var_7274[cGame.var_72ac + n]);
				final int n3 = n2 + 18;
				cGame.var_68cc[3][n3] = string;
				sub_2000c(3, n3, true);
				sub_2000c(3, n2 + 13, false);
				sub_2000c(3, n2 + 11, false);
			} else {
				sub_2000c(3, n2 + 17, sub_2b5c8(cGame.var_72bc[n + cGame.var_72ac]));
				sub_2000c(3, n2 + 18, false);
				sub_2000c(3, n2 + 20, false);
				sub_2000c(3, 178, true);
				sub_2000c(3, 182, true);
				sub_2000c(3, 186, true);
				final String sub_4fa1 = GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_72cc[cGame.var_72ac + n]),
						cGame.var_7fe4, " ");
				final int n4 = n2 + 13;
				cGame.var_68cc[3][n4] = sub_4fa1;
				final String sub_4fa2 = GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_72d4[cGame.var_72ac + n]),
						cGame.var_7fe4, " ");
				final int n5 = n2 + 11;
				cGame.var_68cc[3][n5] = sub_4fa2;
				sub_2000c(3, n4, true);
				sub_2000c(3, n5, true);
			}
			sub_2000c(3, n2 + 16, false);
			return;
		}
		sub_2000c(3, n2 + 17, false);
		sub_2000c(3, n2 + 10, !cGame.var_72ec || n < 9);
		sub_2024d(3, n2 + 10, false);
		sub_2000c(3, n2 + 20, false);
		sub_2000c(3, n2 + 16, true);
		final String sub_4e1f;
		cGame.var_68cc[3][n2 + 16] = (((sub_4e1f = GLLib.TODO_sub_4e1f(197)) == null) ? "" : sub_4e1f);
		sub_2000c(3, n2 + 18, false);
		sub_2000c(3, n2 + 13, false);
		sub_2000c(3, n2 + 11, false);
	}

	private static void sub_33148(final int n) {
		if (cGame.var_7fd4 == 56 && n != 0) {
			return;
		}
		cGame.var_72b4 = cGame.var_72ac + n;
		if (cGame.var_72ec) {
			final Class_h class_h = Class_h.var_6a[1];
			for (int i = 0; i < 3; ++i) {
				final int n3;
				final int n2 = (n3 = i << 2) + 177;
				if (cGame.var_6e44[cGame.var_72b4] != null && cGame.var_6e44[cGame.var_72b4][i << 1] > -1) {
					cGame.var_68bc[3][n2][5] = (short) class_h.var_82[cGame.var_6e44[cGame.var_72b4][i << 1]][3];
					cGame.var_68bc[3][n2][6] = (short) class_h.var_82[cGame.var_6e44[cGame.var_72b4][i << 1]][4];
					cGame.var_72dc[i] = cGame.var_6e44[cGame.var_72b4][(i << 1) + 1];
					cGame.var_72e4[i] = sub_2e024(0, cGame.var_6e44[cGame.var_72b4][i << 1]);
					sub_d78c(1, cGame.var_68bc[3][n2][5]);
					sub_2000c(3, n2, true);
					sub_2000c(3, n3 + 179, class_h.var_82[cGame.var_6e44[cGame.var_72b4][i << 1]][9] == 1);
					sub_2000c(3, n3 + 180, cGame.var_72dc[i] <= cGame.var_72e4[i]);
				} else {
					sub_2000c(3, n2, false);
					sub_2000c(3, n3 + 179, false);
					sub_2000c(3, n3 + 180, false);
				}
			}
			if (sub_2b5c8(cGame.var_72bc[cGame.var_72b4])) {
				cGame.var_68bc[3][199][6] = 77;
				sub_23a3d(3, 199, 1);
			} else {
				cGame.var_68bc[3][199][6] = 79;
				sub_23a3d(3, 199, 0);
			}
		} else if (n < cGame.var_72a4) {
			cGame.var_68bc[3][190][5] = cGame.var_7264[cGame.var_72b4];
			cGame.var_68bc[3][190][6] = cGame.var_726c[cGame.var_72b4];
			sub_2000c(3, 190, true);
			sub_2000c(3, 193, true);
			sub_2000c(3, 195, true);
			sub_2000c(3, 196, true);
			sub_2000c(3, 197, false);
			sub_2000c(3, 191, cGame.var_7284[cGame.var_72b4] != 0);
		} else {
			sub_2000c(3, 190, false);
			sub_2000c(3, 193, false);
			sub_2000c(3, 195, false);
			sub_2000c(3, 196, false);
			sub_2000c(3, 191, false);
			sub_2000c(3, 197, true);
		}
		sub_33408();
	}

	private static void sub_33408() {
		for (int i = 15; i <= 169; i += 11) {
			sub_2000c(3, i, false);
		}
		final int n;
		if ((n = cGame.var_72b4 - cGame.var_72ac) >= 0 && n < 15) {
			sub_2000c(3, 15 + n * 11, true);
		}
		sub_2c69b();
		sub_1f8c5(3);
	}

	private static void sub_3347b() {
		cGame.var_72ec = true;
		cGame.var_72ac = 0;
		sub_2000c(3, 2, true);
		sub_2000c(3, 5, false);
		for (int i = 189; i <= 197; ++i) {
			sub_2000c(3, i, false);
		}
		sub_2000c(3, 202, false);
		sub_2000c(3, 201, false);
		sub_2000c(3, 199, true);
		sub_2024d(3, 199, true);
		sub_2000c(3, 198, true);
		sub_2000c(3, 176, true);
		int n = 0;
		int n2 = 0;
		cGame.var_72a4 = 0;
		cGame.var_72bc = new int[20];
		cGame.var_72c4 = new int[20];
		cGame.var_72cc = new int[20];
		cGame.var_72d4 = new int[20];
		cGame.var_72dc = new int[3];
		cGame.var_72e4 = new int[3];
		for (int n3 = 0; n3 < 20 && cGame.var_6e44[n3][0] != -1; ++n3) {
			sub_32ddb(n2, n3);
			++n2;
			if (n < 15) {
				sub_32e1a(n, true);
				++n;
			}
			++cGame.var_72a4;
		}
		for (int j = n; j < 15; ++j) {
			sub_32e1a(j, false);
		}
		sub_2c69b();
		sub_1fb8e(3);
		sub_33148(0);
		sub_234cb(0, 1);
	}

	private static void sub_335be(final int n) {
		cGame.var_72ac += n * 3;
		final int n2 = cGame.var_6914[0][9];
		int n3;
		int i;
		for (n3 = ((cGame.var_72a4 - cGame.var_72ac >= 15) ? 15
				: (cGame.var_72a4 - cGame.var_72ac)), i = 0; i < n3; ++i) {
			sub_32e1a(i, true);
		}
		while (i < 15) {
			sub_32e1a(i, false);
			++i;
		}
		cGame.var_6914[0][9] = n2 + (cGame.var_68bc[3][43][3] - cGame.var_68bc[3][10][3]) * n;
		sub_22d97(0);
		sub_33408();
	}

	private static void sub_33687(final int n) {
		cGame.var_716c = (cGame.var_728c = sub_301bd(n));
	}

	private static int sub_336ae() {
		final long sub_301eb = sub_301eb(cGame.var_728c);
		final long sub_301eb2 = sub_301eb(cGame.var_716c);
		if (sub_301eb != sub_301eb2) {
			return (int) sub_301eb2;
		}
		return (int) sub_301eb;
	}

	private static void sub_336f2(final int n) {
		sub_33687((sub_336ae() + n < 0) ? 0
				: ((sub_336ae() + n > cGame.var_6ffc) ? cGame.var_6ffc : (sub_336ae() + n)));
	}

	private static void sub_33750(final int n, final boolean b) {
		int i;
		int n2;
		for (n2 = (i = 96 + n * 9); i < n2 + 9; ++i) {
			sub_2000c(22, i, b);
		}
		if (b) {
			final int n3 = 104 + n * 9;
			cGame.var_68bc[22][n3][5] = (short) cGame.var_733c[cGame.var_7304][cGame.var_72fc[cGame.var_7304]
					+ n];
			cGame.var_68bc[22][n3][6] = (short) cGame.var_7344[cGame.var_7304][cGame.var_72fc[cGame.var_7304]
					+ n];
			sub_d78c(1, cGame.var_68bc[22][n3][5]);
		}
		if (getLevel() < cGame.var_734c[cGame.var_7304][cGame.var_72fc[cGame.var_7304] + n]
				&& cGame.var_7354) {
			sub_2000c(22, 103 + n * 9, true);
		} else {
			sub_2000c(22, 103 + n * 9, false);
		}
		if (!cGame.var_7354) {
			sub_2000c(22, 104 + n * 9, false);
			sub_2000c(22, n2, false);
		}
	}

	private static void sub_33877(final int n) {
		if (cGame.var_6914[1] == null) {
			return;
		}
		final int[] var_72fc = cGame.var_72fc;
		final char var_7304 = cGame.var_7304;
		var_72fc[var_7304] += n;
		final int n2 = cGame.var_6914[1][8];
		for (int i = 0; i < 6; ++i) {
			sub_33750(i, true);
		}
		cGame.var_6914[1][8] = n2 + (cGame.var_68bc[22][105][2] - cGame.var_68bc[22][96][2]) * n;
		sub_22d97(1);
	}

	private static void sub_3390a(final char var_7304) {
		cGame.var_7304 = var_7304;
		if (var_7304 == '\0') {
			sub_2000c(22, 153, true);
			sub_2000c(22, 154, false);
			sub_2000c(22, 155, false);
		} else if (var_7304 == '\u0001') {
			sub_2000c(22, 153, false);
			sub_2000c(22, 154, true);
			sub_2000c(22, 155, false);
		} else if (var_7304 == '\u0002') {
			sub_2000c(22, 153, false);
			sub_2000c(22, 154, false);
			sub_2000c(22, 155, true);
		}
		sub_33877(0);
	}

	private static void sub_339af(final boolean var_7354) {
		int n = 0;
		if (cGame.var_6914 != null && cGame.var_6914[0] != null) {
			n = cGame.var_6914[0][8];
		}
		if (cGame.var_7354 = var_7354) {
			cGame.var_7364 = 1;
			cGame.var_735c = sub_23556(1441885, 1441958, 0, 185, 0, 0, 500);
			cGame.var_68bc[22][160][6] = 151;
			sub_2000c(22, 96, var_7354);
			sub_2000c(22, 105, var_7354);
			sub_2000c(22, 114, var_7354);
			sub_2000c(22, 123, var_7354);
			sub_2000c(22, 132, var_7354);
			sub_2000c(22, 141, var_7354);
			sub_2024d(22, 96, var_7354);
			sub_2024d(22, 105, var_7354);
			sub_2024d(22, 114, var_7354);
			sub_2024d(22, 123, var_7354);
			sub_2024d(22, 132, var_7354);
			sub_2024d(22, 141, var_7354);
			sub_2000c(22, 104, var_7354);
			sub_2000c(22, 113, var_7354);
			sub_2000c(22, 122, var_7354);
			sub_2000c(22, 131, var_7354);
			sub_2000c(22, 140, var_7354);
			sub_2000c(22, 149, var_7354);
			for (int i = 0; i < 6; ++i) {
				if (getLevel() >= cGame.var_734c[cGame.var_7304][cGame.var_72fc[cGame.var_7304] + i]) {
					sub_2000c(22, 103 + i * 9, false);
				} else {
					sub_2000c(22, 103 + i * 9, true);
				}
			}
			sub_3390a(cGame.var_7304);
		} else {
			cGame.var_7364 = 2;
			cGame.var_735c = sub_23556(1441885, 1441958, 0, 0, 0, 185, 500);
			sub_2000c(22, 153, false);
			sub_2000c(22, 154, false);
			sub_2000c(22, 155, false);
			cGame.var_68bc[22][160][6] = 152;
		}
		sub_2000c(22, 94, true);
		sub_2000c(22, 150, var_7354);
		sub_2024d(22, 150, var_7354);
		sub_2000c(22, 151, var_7354);
		sub_2024d(22, 151, var_7354);
		sub_2000c(22, 152, var_7354);
		sub_2024d(22, 152, var_7354);
		sub_2000c(22, 161, var_7354);
		sub_2000c(22, 162, var_7354);
		sub_2000c(22, 163, var_7354);
		sub_2000c(22, 164, var_7354);
		sub_2000c(22, 165, var_7354);
		sub_2000c(22, 166, var_7354);
		sub_35262();
		if (cGame.var_6914 != null && cGame.var_6914[0] != null) {
			cGame.var_6914[0][8] = n;
		}
	}

	private static void sub_33c10() {
		final Class_h class_h = Class_h.var_6a[7];
		final Class_h class_h2 = Class_h.var_6a[1];
		int n = 0;
		for (int i = 0; i < class_h.var_7a; ++i) {
			final int n2 = class_h.var_82[i][3];
			final int n3;
			if ((n3 = class_h.var_82[i][4]) >= 1 && n2 == cGame.var_736c && n3 - 1 == cGame.var_7304) {
				n = i;
				break;
			}
		}
		cGame.var_73bc = class_h.var_82[n][1];
		if ((cGame.var_7374 = class_h.var_82[n][18]) > 117) {
			return;
		}
		cGame.var_737c = class_h2.var_82[cGame.var_7374][7];
		cGame.var_7384 = class_h.var_82[n][16];
		cGame.var_739c = class_h.var_82[n][2];
		cGame.var_73d4 = class_h.var_82[n][6];
		cGame.var_73c4 = class_h2.var_82[cGame.var_73d4][2];
		cGame.var_73e4 = class_h.var_82[n][7];
		cGame.var_73f4 = class_h.var_82[n][8];
		cGame.var_73dc = class_h.var_82[n][9];
		cGame.var_73cc = class_h2.var_82[cGame.var_73dc][2];
		cGame.var_73ec = class_h.var_82[n][10];
		cGame.var_73fc = class_h.var_82[n][11];
		cGame.var_7414 = class_h.var_82[n][12];
		cGame.var_7394 = sub_dceb(cGame.var_738c = class_h.var_82[n][14] * 60);
		cGame.var_73a4 = class_h.var_82[n][15];
		cGame.var_73ac = (short) class_h2.var_82[cGame.var_7374][3];
		cGame.var_68bc[7][3][5] = (short) class_h2.var_82[cGame.var_73d4][3];
		cGame.var_68bc[7][3][6] = (short) class_h2.var_82[cGame.var_73d4][4];
		sub_d78c(1, cGame.var_68bc[7][3][5]);
		cGame.var_68bc[7][8][5] = (short) class_h2.var_82[cGame.var_73dc][3];
		cGame.var_68bc[7][8][6] = (short) class_h2.var_82[cGame.var_73dc][4];
		sub_d78c(1, cGame.var_68bc[7][8][5]);
		cGame.var_68bc[7][28][5] = (short) class_h2.var_82[cGame.var_7374][3];
		cGame.var_68bc[7][28][6] = (short) class_h2.var_82[cGame.var_7374][4];
		cGame.var_68bc[7][40][5] = (short) class_h2.var_82[cGame.var_7374][3];
		cGame.var_68bc[7][40][6] = (short) class_h2.var_82[cGame.var_7374][4];
		sub_d78c(1, class_h2.var_82[cGame.var_7374][3]);
		sub_33e7d();
	}

	private static void sub_33e7d() {
		cGame.var_7404 = sub_2e024(0, cGame.var_73d4);
		cGame.var_740c = sub_2e024(0, cGame.var_73dc);
		if (cGame.var_73d4 == cGame.var_73dc && cGame.var_73e4 + cGame.var_73ec > cGame.var_7404) {
			if (cGame.var_7404 <= cGame.var_73e4) {
				cGame.var_740c = 0;
			} else {
				cGame.var_7404 = cGame.var_73e4;
				cGame.var_740c -= cGame.var_73e4;
			}
		}
		boolean b = false;
		boolean b2 = false;
		if (cGame.var_73d4 >= 27) {
			b = true;
		}
		if (cGame.var_73dc >= 27) {
			b2 = true;
		}
		boolean b3 = true;
		if (cGame.var_73e4 <= cGame.var_7404) {
			sub_2000c(7, 5, true);
			sub_2000c(7, 7, false);
			sub_2000c(7, 22, false);
			sub_2000c(7, 24, false);
		} else {
			sub_2000c(7, 5, false);
			sub_2000c(7, 24, b);
			sub_2024d(7, 24, b);
			sub_2000c(7, 7, !b);
			sub_2024d(7, 7, !b);
			sub_2000c(7, 22, !b);
			b3 = false;
		}
		if (cGame.var_73ec <= cGame.var_740c) {
			sub_2000c(7, 10, true);
			sub_2000c(7, 12, false);
			sub_2000c(7, 23, false);
			sub_2000c(7, 25, false);
		} else {
			sub_2000c(7, 10, false);
			int n = 0;
			int n2 = 0;
			boolean b4 = false;
			Label_0355: {
				if (cGame.var_73d4 == cGame.var_73dc && sub_20167(7, 7)) {
					sub_2000c(7, 12, false);
					sub_2024d(7, 12, false);
					n = 7;
					n2 = 23;
				} else {
					sub_2000c(7, 12, !b2);
					sub_2024d(7, 12, !b2);
					n = 7;
					n2 = 23;
					if (!b2) {
						b4 = true;
						break Label_0355;
					}
				}
				b4 = false;
			}
			sub_2000c(n, n2, b4);
			sub_2000c(7, 25, b2);
			sub_2024d(7, 25, b2);
			b3 = false;
		}
		if (cGame.var_7414 > 0 && cGame.var_7064 > 0 && !cGame.var_73b4) {
			sub_2000c(7, 17, true);
			sub_2024d(7, 17, true);
		} else {
			sub_2000c(7, 17, false);
			sub_2024d(7, 17, false);
		}
		if (b3) {
			cGame.var_68bc[7][35][5] = 20;
			cGame.var_68bc[7][35][6] = 54;
			sub_2024d(7, 35, true);
		} else {
			cGame.var_68bc[7][35][5] = 20;
			cGame.var_68bc[7][35][6] = 55;
			sub_2024d(7, 35, true);
		}
		sub_2c69b();
		sub_1f8c5(7);
	}

	private static void sub_34199(final boolean var_741c) {
		if (var_741c) {
			cGame.var_68bc[7][43][5] = 1138;
			sub_2000c(7, 43, true);
			sub_2386a(7, 43, 0, 1);
			if (cGame.var_73b4) {
				cGame.var_737c = Class_h.var_6a[1].var_82[cGame.var_7374 + 1][7];
			} else {
				cGame.var_737c = Class_h.var_6a[1].var_82[cGame.var_7374][7];
			}
		} else {
			sub_2000c(7, 43, false);
			cGame.var_68bc[7][43][5] = -1;
		}
		cGame.var_741c = var_741c;
	}

	private static boolean sub_3423e(int n) {
		if (n == 0) {
			cGame.var_74fc = sub_2361c(22, 0, 1, 15, 26, 85, 20, 0) + 10;
			cGame.var_7504 = sub_237d7(22, 0, 1, 9, 105, 149) + 10;
			cGame.var_7304 = '\0';
			cGame.var_74dc = false;
			cGame.var_68ac = 100;
		}
		if (n == 1) {
			sub_35262();
			(cGame.var_72f4 = new int[3])[cGame.var_7304] = 0;
			(cGame.var_72fc = new int[3])[cGame.var_7304] = 0;
			final Class_h class_h = Class_h.var_6a[7];
			final Class_h class_h2 = Class_h.var_6a[1];
			if (class_h != null) {
				cGame.var_7314 = new int[3][];
				cGame.var_731c = new int[3][];
				cGame.var_7324 = new int[3][];
				cGame.var_732c = new int[3][];
				cGame.var_7334 = new int[3][];
				cGame.var_733c = new int[3][];
				cGame.var_7344 = new int[3][];
				cGame.var_734c = new int[3][];
				for (int i = 0; i < 3; ++i) {
					cGame.var_7314[i] = new int[class_h.var_7a];
					cGame.var_731c[i] = new int[class_h.var_7a];
					cGame.var_7324[i] = new int[class_h.var_7a];
					cGame.var_732c[i] = new int[class_h.var_7a];
					cGame.var_7334[i] = new int[class_h.var_7a];
					cGame.var_733c[i] = new int[class_h.var_7a];
					cGame.var_7344[i] = new int[class_h.var_7a];
					cGame.var_734c[i] = new int[class_h.var_7a];
				}
			}
			for (int j = 0; j < class_h.var_7a; ++j) {
				final int n2;
				final int n3;
				if ((n2 = class_h.var_82[j][4]) > 0 && (n3 = class_h.var_82[j][3]) > -1) {
					cGame.var_7314[n2 - 1][n3] = class_h.var_82[j][2];
					cGame.var_731c[n2 - 1][n3] = class_h.var_82[j][0];
					if (class_h.var_82[j][18] != -1 && class_h.var_82[j][18] < 117) {
						cGame.var_7324[n2 - 1][n3] = class_h2.var_82[class_h.var_82[j][18]][7];
					} else {
						cGame.var_7324[n2 - 1][n3] = 0;
					}
					cGame.var_732c[n2 - 1][n3] = class_h.var_82[j][16];
					cGame.var_7334[n2 - 1][n3] = class_h.var_82[j][14] * 60;
					final int n4;
					if ((n4 = class_h.var_82[j][18]) != -1 && n4 < 117) {
						cGame.var_733c[n2 - 1][n3] = class_h2.var_82[n4][3];
						cGame.var_7344[n2 - 1][n3] = class_h2.var_82[n4][4];
						if (cGame.var_7344[n2 - 1][n3] == -1) {
							cGame.var_7344[n2 - 1][n3] = 0;
						}
					} else {
						cGame.var_733c[n2 - 1][n3] = 0;
						cGame.var_7344[n2 - 1][n3] = 0;
					}
					cGame.var_734c[n2 - 1][n3] = class_h.var_82[j][5];
					final int[] var_72f4 = cGame.var_72f4;
					final int n5 = n2 - 1;
					++var_72f4[n5];
				}
			}
			for (int n6 = 0; n6 < cGame.var_72f4[cGame.var_7304] && n6 < 6; ++n6) {
				sub_33750(n6, true);
			}
			for (int k = cGame.var_72f4[cGame.var_7304]; k < 6; ++k) {
				sub_33750(k, false);
			}
			if (cGame.var_74dc && !cGame.var_7354) {
				sub_339af(true);
			} else if (!cGame.var_74dc && cGame.var_7354) {
				sub_339af(false);
			}
			if (!cGame.var_74dc && !cGame.var_7354 && cGame.var_75d4) {
				sub_339af(false);
			}
			if (!cGame.var_7354) {
				sub_2000c(22, 96, false);
				sub_2000c(22, 105, false);
				sub_2000c(22, 114, false);
				sub_2000c(22, 123, false);
				sub_2000c(22, 132, false);
				sub_2000c(22, 141, false);
				sub_2000c(22, 104, false);
				sub_2000c(22, 113, false);
				sub_2000c(22, 122, false);
				sub_2000c(22, 131, false);
				sub_2000c(22, 140, false);
				sub_2000c(22, 149, false);
				sub_2000c(22, 103, false);
				sub_2000c(22, 112, false);
				sub_2000c(22, 121, false);
				sub_2000c(22, 130, false);
				sub_2000c(22, 139, false);
				sub_2000c(22, 148, false);
			}
			if (cGame.var_7354) {
				sub_3390a(cGame.var_7304);
			}
			sub_2000c(22, 4, false);
			sub_2000c(22, 3, false);
			sub_2000c(22, 2, false);
			sub_2024d(22, 4, false);
			sub_2000c(22, 8, cGame.s_iapEnabled);
			sub_2000c(22, 7, true);
			sub_2000c(22, 6, true);
			if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
				sub_2024d(22, 8, cGame.s_iapEnabled);
			} else {
				sub_2024d(22, 8, false);
			}
			if (cGame.var_7aac != -1) {
				if (cGame.var_7aac == 10) {
					sub_4052e(202, 203, 7, 0);
				}
				cGame.var_7aac = -1;
			}
			sub_2c69b();
			sub_1fb8e(22);
		}
		if (n == 5) {
			sub_239ef(22);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_14a74();
			}
			if (cGame.var_6c54) {
				sub_26c8e();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_74fc && cGame.var_7484 < cGame.var_746c + 1 - 5
						&& cGame.var_7484 + 5 < cGame.var_7474) {
					sub_3566c(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_7484 > 0) {
					sub_3566c(-1);
				}
			}
			for (int n7 = (cGame.var_747c - cGame.var_7484 >= 5) ? 5 : (cGame.var_747c - cGame.var_7484),
					l = 0; l < n7; ++l) {
				if (cGame.var_7484 + l < cGame.var_747c && l < 5) {
					final String sub_4e1f;
					cGame.var_68cc[22][13
							+ l * 15] = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7494[l + cGame.var_7484])) == null)
									? ""
									: sub_4e1f);
					if (!cGame.var_7354) {
						cGame.var_68cc[22][22 + l * 15] = cGame.var_74d4[l + cGame.var_7484];
						if (sub_20167(22, 22 + l * 15)) {
							sub_2000c(22, 12 + l * 15, false);
						} else {
							sub_2000c(22, 12 + l * 15, true);
						}
						final String sub_4e1f2;
						cGame.var_68cc[22][12 + l * 15] = (((sub_4e1f2 = GLLib
								.TODO_sub_4e1f(cGame.var_7494[l + cGame.var_7484])) == null) ? "" : sub_4e1f2);
						if (sub_20167(22, 14 + l * 15)) {
							cGame.var_68cc[22][15 + l * 15] = Integer
									.toString(cGame.var_74cc[l + cGame.var_7484]);
						}
					}
				} else if (!cGame.var_7354 && l + cGame.var_7484 < cGame.var_7474) {
					final String sub_4e1f3;
					cGame.var_68cc[22][12 + l
							* 15] = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(cGame.var_7494[l + cGame.var_7484])) == null)
									? ""
									: sub_4e1f3);
				}
				final long n8 = System.currentTimeMillis() / 1000L;
				final int n9 = l + cGame.var_7484;
				final int n10 = cGame.var_6914[0][8];
				if (n8 > cGame.var_74a4[n9] + cGame.var_749c[n9]) {
					final int n11 = 17 + n9 * 15;
					if ((!sub_20167(22, n11) || !sub_202b7(22, n11)) && cGame.var_74bc[n9] != 4) {
						sub_23a84(33);
					}
					sub_358a9(true, l);
					sub_3596d(false, l);
					sub_35a1e(false, l);
					cGame.var_74d4[n9] = "";
					cGame.var_74cc[n9] = 0;
					cGame.var_74bc[n9] = 4;
					if (cGame.var_6c5c == 171) {
						cGame.var_6c94 = true;
					}
				} else if (n8 > cGame.var_74a4[n9] && n8 < cGame.var_74a4[n9] + cGame.var_749c[n9]) {
					sub_358a9(false, l);
					sub_3596d(true, l);
					sub_35a1e(true, l);
					final int n12 = cGame.var_749c[n9] - (int) (n8 - cGame.var_74a4[n9]);
					cGame.var_74cc[n9] = sub_e1e7(n12);
					cGame.var_74d4[n9] = sub_dceb(n12);
					cGame.var_74bc[n9] = 3;
				} else if (n8 < cGame.var_74a4[n9]) {
					sub_358a9(false, l);
					sub_3596d(false, l);
					sub_35a1e(true, l);
					final String sub_4e1f4;
					cGame.var_74d4[n9] = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(189)) == null) ? "" : sub_4e1f4);
					cGame.var_74cc[n9] = cGame.var_74ac[n9];
					cGame.var_74bc[n9] = 2;
					cGame.var_74a4[n9] = n8;
				}
				cGame.var_6914[0][8] = n10;
			}
			if (cGame.var_746c - cGame.var_7484 < 5 && cGame.var_746c < cGame.var_7474 && !cGame.var_7354) {
				cGame.var_68cc[22][22 + (cGame.var_746c - cGame.var_7484) * 15] = Integer
						.toString(sub_27050(cGame.var_746c + 1));
			}
			if (cGame.var_74e4) {
				++cGame.var_74ec;
				cGame.var_68bc[22][24
						+ cGame.var_74f4 * 15][2] = (short) (cGame.var_68bc[22][25 + cGame.var_74f4 * 15][2]
								+ 4 * cGame.var_74ec);
				cGame.var_68bc[22][24
						+ cGame.var_74f4 * 15][3] = (short) (cGame.var_68bc[22][25 + cGame.var_74f4 * 15][3]
								+ cGame.var_74ec * cGame.var_74ec + 30);
				if (cGame.var_68bc[22][24 + cGame.var_74f4 * 15][3] > GLLib.s_screenHeight) {
					cGame.var_74e4 = false;
					cGame.var_74ec = 0;
					sub_3572e(cGame.var_74f4 + cGame.var_7484);
				}
			}
			if (cGame.var_6914[1] != null && !sub_2351a(1, 1)) {
				if (cGame.var_6914[1][8] < -cGame.var_7504
						&& cGame.var_72fc[cGame.var_7304] < cGame.var_72f4[cGame.var_7304] - 6) {
					sub_33877(1);
				} else if (cGame.var_6914[1][8] > -10 && cGame.var_72fc[cGame.var_7304] > 0) {
					sub_33877(-1);
				}
			}
			if (cGame.var_7364 != 0 && cGame.var_691c[cGame.var_735c] == null) {
				if (cGame.var_7364 == 2) {
					sub_2000c(22, 96, false);
					sub_2000c(22, 105, false);
					sub_2000c(22, 114, false);
					sub_2000c(22, 123, false);
					sub_2000c(22, 132, false);
					sub_2000c(22, 141, false);
					sub_2024d(22, 96, false);
					sub_2024d(22, 105, false);
					sub_2024d(22, 114, false);
					sub_2024d(22, 123, false);
					sub_2024d(22, 132, false);
					sub_2024d(22, 141, false);
					sub_2000c(22, 104, false);
					sub_2000c(22, 113, false);
					sub_2000c(22, 122, false);
					sub_2000c(22, 131, false);
					sub_2000c(22, 140, false);
					sub_2000c(22, 149, false);
					sub_2000c(22, 103, false);
					sub_2000c(22, 112, false);
					sub_2000c(22, 121, false);
					sub_2000c(22, 130, false);
					sub_2000c(22, 139, false);
					sub_2000c(22, 148, false);
				}
				cGame.var_7364 = 0;
				sub_2c69b();
				sub_1f8c5(22);
			}
			sub_d841(1);
		}
		if (n == 3) {
			sub_1dcc1(22);
			final String sub_4e1f5;
			sub_1df06(((sub_4e1f5 = GLLib.TODO_sub_4e1f(180)) == null) ? "" : sub_4e1f5, 22, 1, 0, 0);
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " "), 22, 9, 0, 0);
			final short n13 = cGame.var_68bc[22][92][2];
			n = cGame.var_68bc[22][92][3];
			sub_1e07e("+" + Integer.toString(cGame.var_750c), n13 + 40, n + 10, 0, 0, 0, 0, 2, 0, false, false);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[22][10][5]].sub_3882(cGame.var_68bc[22][10][6], 0, array, 0);
			GLLib.sub_36f4(GLLib.g, cGame.var_68bc[22][10][2] + array[0],
					cGame.var_68bc[22][10][3] + array[1], array[2], array[3], true);
			sub_351a0();
			GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
			final String sub_4e1f6;
			sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(200)) == null) ? "" : sub_4e1f6, 22, 94, 0, 0);
			cGame.var_68d4[cGame.var_68bc[22][95][5]].sub_3882(cGame.var_68bc[22][95][6], 0, array, 0);
			final int n14 = cGame.var_68bc[22][95][2] + array[0];
			final int n15 = cGame.var_68bc[22][95][3] + array[1];
			final int n16 = array[2];
			final int n17 = array[3];
			final int n18 = n16;
			final int n19 = n15;
			n = n14;
			GLLib.sub_36f4(GLLib.g, n, n19, n18, n17, true);
			n = ((cGame.var_72f4[cGame.var_7304] - cGame.var_72fc[cGame.var_7304] >= 6) ? 6
					: (cGame.var_72f4[cGame.var_7304] - cGame.var_72fc[cGame.var_7304]));
			for (int n20 = 0; n20 < n; ++n20) {
				final int n21 = n20 + cGame.var_72fc[cGame.var_7304];
				final String sub_4e1f7;
				sub_1e2f2(((sub_4e1f7 = GLLib.TODO_sub_4e1f(cGame.var_7314[cGame.var_7304][n21])) == null) ? ""
						: sub_4e1f7, 22, 97 + n20 * 9, 0, 0);
				if (getLevel() < cGame.var_734c[cGame.var_7304][n21]) {
					final String sub_4e1f8;
					sub_1df06(
							(((sub_4e1f8 = GLLib.TODO_sub_4e1f(447)) == null) ? "" : sub_4e1f8)
									+ Integer.toString(cGame.var_734c[cGame.var_7304][n21]),
							22, 101 + n20 * 9, 0, 0);
				} else {
					sub_1df06(sub_dceb(cGame.var_7334[cGame.var_7304][n21]), 22, 100 + n20 * 9, 0, 0);
				}
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_351a0() {
		for (int n = (cGame.var_746c - cGame.var_7484 >= 5) ? 5 : (cGame.var_746c - cGame.var_7484),
				i = 0; i <= n; ++i) {
			if (cGame.var_7484 + i < cGame.var_747c && i < 5 && cGame.var_74c4[i + cGame.var_7484]) {
				cGame.var_7ff4[138].sub_71ae(GLLib.g, 11, cGame.var_68bc[22][25 + i * 15][2] - 100,
						cGame.var_68bc[22][25 + i * 15][3] - 50, 0);
			}
		}
	}

	private static void sub_35262() {
		int n = 0;
		if (cGame.var_6914[0] != null) {
			n = cGame.var_6914[0][8];
		}
		for (int n2 = 0; n2 < cGame.var_746c && n2 < 5; ++n2) {
			sub_353b5(n2, true);
		}
		for (int i = cGame.var_746c; i < 5; ++i) {
			sub_353b5(i, false);
		}
		final int n3;
		if ((n3 = cGame.var_746c - cGame.var_7484) < 5 && cGame.var_746c < cGame.var_7474) {
			sub_2000c(22, 11 + n3 * 15, true);
			sub_2024d(22, 11 + n3 * 15, true);
			sub_2000c(22, 19 + n3 * 15, true);
			sub_2000c(22, 20 + n3 * 15, true);
			if (!cGame.var_7354) {
				sub_2024d(22, 20 + n3 * 15, true);
				sub_2000c(22, 22 + n3 * 15, true);
				cGame.var_68cc[22][22 + n3 * 15] = Integer.toString(sub_27050(cGame.var_746c + 1));
			}
			sub_2000c(22, 21 + n3 * 15, true);
		}
		sub_2c69b();
		sub_1fb8e(22);
		if (cGame.var_6914[0] != null) {
			cGame.var_6914[0][8] = n;
			sub_22d97(0);
		}
	}

	private static void sub_353b5(final int n, final boolean b) {
		final int n2 = 11 + n * 15;
		if (cGame.var_7484 + n < cGame.var_747c) {
			sub_2000c(22, n2, b);
			sub_2024d(22, n2, b);
			sub_2000c(22, 24 + n * 15, b);
			sub_2000c(22, 25 + n * 15, b);
			sub_2000c(22, 19 + n * 15, false);
			sub_2000c(22, 20 + n * 15, false);
			sub_2024d(22, 20 + n * 15, false);
			sub_2000c(22, 21 + n * 15, false);
			sub_2000c(22, 13 + n * 15, b);
			final String sub_4e1f;
			cGame.var_68cc[22][13
					+ n * 15] = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7494[n + cGame.var_7484])) == null) ? ""
							: sub_4e1f);
			if (!cGame.var_7354) {
				sub_2000c(22, 22 + n * 15, b);
				cGame.var_68cc[22][22 + n * 15] = cGame.var_74d4[n + cGame.var_7484];
			}
		} else {
			if (cGame.var_7484 + n < cGame.var_7474) {
				for (int i = n2; i < n2 + 15; ++i) {
					sub_2000c(22, i, false);
				}
				sub_2000c(22, n2, b);
				sub_2024d(22, n2, b);
				cGame.var_7494[cGame.var_7484 + n] = 197;
				cGame.var_74bc[cGame.var_7484 + n] = 1;
			}
			if (!cGame.var_7354 && n + cGame.var_7484 < cGame.var_7474
					&& n + cGame.var_7484 < cGame.var_746c) {
				if (sub_20167(22, 22 + n * 15)) {
					sub_2000c(22, 12 + n * 15, false);
				} else {
					sub_2000c(22, 12 + n * 15, true);
				}
				final String sub_4e1f2;
				cGame.var_68cc[22][12
						+ n * 15] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_7494[n + cGame.var_7484])) == null)
								? ""
								: sub_4e1f2);
			}
		}
		if (b && n < 5 && cGame.var_7484 + n < cGame.var_7474) {
			final int n3 = 25 + n * 15;
			final int n4 = 24 + n * 15;
			if (cGame.var_74b4[cGame.var_7484 + n] > 0) {
				cGame.var_68bc[22][n3][5] = (short) cGame.var_74b4[cGame.var_7484 + n];
				cGame.var_68bc[22][n4][5] = (short) cGame.var_74b4[cGame.var_7484 + n];
				cGame.var_68bc[22][n3][6] = 0;
				cGame.var_68bc[22][n4][6] = 0;
			}
			sub_d78c(1, cGame.var_68bc[22][n3][5]);
		}
		sub_3596d(false, n);
	}

	private static void sub_3566c(final int n) {
		cGame.var_7484 += n;
		final int n2 = cGame.var_6914[0][8];
		sub_35262();
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[22][26][2] - cGame.var_68bc[22][11][2]) * n;
		sub_22d97(0);
	}

	private static void sub_356c2(int n) {
		final int n2 = cGame.var_68bc[22][25 + n * 15][2] - cGame.var_68bc[22][92][2];
		n = cGame.var_68bc[22][25 + n * 15][3] - cGame.var_68bc[22][92][3];
		sub_2000c(22, 92, true);
		sub_23556(1441884, 1441884, n2, n, 0, 0, 1000);
	}

	private static void sub_3572e(int i) {
		while (i < cGame.var_747c - 1) {
			cGame.var_748c[i] = cGame.var_748c[i + 1];
			cGame.var_7494[i] = cGame.var_7494[i + 1];
			cGame.var_749c[i] = cGame.var_749c[i + 1];
			cGame.var_74a4[i] = cGame.var_74a4[i + 1];
			cGame.var_74ac[i] = cGame.var_74ac[i + 1];
			cGame.var_74b4[i] = cGame.var_74b4[i + 1];
			cGame.var_74c4[i] = cGame.var_74c4[i + 1];
			cGame.var_74cc[i] = cGame.var_74cc[i + 1];
			cGame.var_74d4[i] = cGame.var_74d4[i + 1];
			cGame.var_74bc[i] = cGame.var_74bc[i + 1];
			++i;
		}
		if (cGame.var_747c > 0) {
			cGame.var_748c[cGame.var_747c - 1] = 0;
			cGame.var_7494[cGame.var_747c - 1] = 0;
			cGame.var_749c[cGame.var_747c - 1] = 0;
			cGame.var_74a4[cGame.var_747c - 1] = 0L;
			cGame.var_74ac[cGame.var_747c - 1] = 0;
			cGame.var_74b4[cGame.var_747c - 1] = -1;
			cGame.var_74c4[cGame.var_747c - 1] = false;
			cGame.var_74cc[cGame.var_747c - 1] = 0;
			cGame.var_74d4[cGame.var_747c - 1] = "";
			cGame.var_74bc[cGame.var_747c - 1] = 0;
		}
		if (--cGame.var_747c < 0) {
			cGame.var_747c = 0;
		}
		sub_35262();
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_3587a(final int n) {
		final long n2 = System.currentTimeMillis() / 1000L;
		cGame.var_749c[n] = 0;
		cGame.var_74a4[n] = n2;
	}

	private static void sub_358a9(final boolean b, final int n) {
		final int n2 = 18 + n * 15;
		final int n3 = 17 + n * 15;
		if (b && n == 0 && cGame.var_6c5c == 171 && sub_20167(22, 90)) {
			sub_2000c(22, 90, false);
			cGame.var_6c94 = true;
		}
		if (sub_20167(22, n3) != b || sub_202b7(22, n3) != b) {
			sub_2000c(22, n2, b);
			sub_2000c(22, n3, b);
			sub_2024d(22, n3, b);
			if (cGame.var_6914[0] != null) {
				final int n4 = cGame.var_6914[0][8];
				sub_2c69b();
				sub_1f8c5(22);
				cGame.var_6914[0][8] = n4;
			}
		}
	}

	private static void sub_3596d(final boolean b, int n) {
		final int n2 = 14 + n * 15;
		final int n3 = 16 + n * 15;
		if (sub_20167(22, n2) != b && cGame.var_6914 != null && cGame.var_6914[0] != null) {
			final int n4 = cGame.var_6914[0][8];
			sub_2000c(22, n2, b);
			sub_2024d(22, n2, b);
			sub_2000c(22, n3, b);
			sub_2000c(22, 15 + n * 15, b);
			final String string = Integer.toString(cGame.var_74cc[n + cGame.var_7484]);
			n = 15 + n * 15;
			cGame.var_68cc[22][n] = string;
			sub_2c69b();
			sub_1f8c5(22);
			cGame.var_6914[0][8] = n4;
		}
	}

	private static void sub_35a1e(final boolean b, int n) {
		n = 23 + n * 15;
		if (cGame.var_6c5c == 171) {
			if (sub_20167(22, n) || sub_202b7(22, n)) {
				sub_2000c(22, n, false);
				sub_2024d(22, n, false);
				sub_2c69b();
				sub_1f8c5(22);
			}
			return;
		}
		if (sub_20167(22, n) != b || sub_202b7(22, n) != b) {
			sub_2000c(22, n, b);
			sub_2024d(22, n, b);
			sub_2c69b();
			sub_1f8c5(22);
		}
	}

	private static void sub_35acd(final int n) {
		final Class_h class_h = Class_h.var_6a[7];
		int n2 = 0;
		for (int i = 0; i < 83; ++i) {
			if (cGame.var_748c[n] == class_h.var_82[i][1]) {
				n2 = i;
				break;
			}
		}
		final int n3 = class_h.var_82[n2][6];
		final int n4 = class_h.var_82[n2][7];
		final int n5 = class_h.var_82[n2][9];
		final int n6 = class_h.var_82[n2][10];
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + n4 + n6 > sub_2df26()) {
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, n3, n4);
		sub_2da54(0, n5, n6);
		if (cGame.var_74c4[n]) {
			sub_2e64f(1);
		}
		sub_3587a(n);
		sub_3572e(n);
	}

	static boolean sub_35bc4() {
		boolean b = false;
		final long n = System.currentTimeMillis() / 1000L;
		for (int i = 0; i < cGame.var_74a4.length; ++i) {
			if (cGame.var_74a4[i] > 0L && n >= cGame.var_74a4[i] + cGame.var_749c[i]) {
				b = true;
				break;
			}
		}
		return b;
	}

	private static boolean sub_35c3d(int n) {
		if (n == 0) {
			cGame.var_75ec = sub_2361c(22, 0, 1, 15, 26, 85, 20, 0) + 10;
			cGame.var_75f4 = sub_237d7(22, 0, 1, 9, 105, 149) + 10;
			cGame.var_757c = false;
			cGame.var_68ac = 100;
			if (cGame.var_7fd4 == 23) {
				cGame.var_6c94 = true;
			}
		}
		if (n == 1) {
			sub_36a3e();
			cGame.var_7584 = 0;
			cGame.var_758c = 0;
			int n2 = 0;
			final Class_h class_h = Class_h.var_6a[22];
			final Class_h class_h2 = Class_h.var_6a[1];
			if (class_h != null) {
				cGame.var_7594 = new int[class_h.var_7a];
				cGame.var_759c = new int[class_h.var_7a];
				cGame.var_75a4 = new int[class_h.var_7a];
				cGame.var_75ac = new int[class_h.var_7a];
				cGame.var_75b4 = new int[class_h.var_7a];
				cGame.var_75bc = new int[class_h.var_7a];
				cGame.var_75c4 = new int[class_h.var_7a];
				cGame.var_75cc = new byte[class_h.var_7a];
			}
			for (int i = 0; i < class_h.var_7a; ++i) {
				final int n3;
				if ((n3 = class_h.var_82[i][3]) > -1) {
					cGame.var_7594[n3] = class_h.var_82[i][2];
					cGame.var_759c[n3] = class_h.var_82[i][0];
					if (class_h.var_82[i][15] != -1 && class_h.var_82[i][15] < 117) {
						cGame.var_75a4[n3] = class_h2.var_82[class_h.var_82[i][15]][7];
					} else {
						cGame.var_75a4[n3] = 0;
					}
					cGame.var_75ac[n3] = class_h.var_82[i][13];
					cGame.var_75b4[n3] = class_h.var_82[i][11] * 60;
					final int n4;
					if ((n4 = class_h.var_82[i][15]) != -1 && n4 < 117) {
						cGame.var_75bc[n3] = class_h2.var_82[n4][3];
						cGame.var_75c4[n3] = class_h2.var_82[n4][4];
						if (cGame.var_75c4[n3] == -1) {
							cGame.var_75c4[n3] = 0;
						}
					} else {
						cGame.var_75bc[n3] = 0;
						cGame.var_75c4[n3] = 0;
					}
					cGame.var_75cc[n3] = (byte) class_h.var_82[i][4];
					if (n2 < 6) {
						++n2;
					}
					++cGame.var_7584;
				}
			}
			for (int n5 = 0; n5 < n2 && n5 < 6; ++n5) {
				sub_372e2(n5, true);
			}
			for (int j = n2; j < 6; ++j) {
				sub_372e2(j, false);
			}
			sub_2000c(22, 4, false);
			sub_2024d(22, 4, false);
			sub_2000c(22, 3, false);
			sub_2000c(22, 2, false);
			sub_2000c(22, 8, cGame.s_iapEnabled);
			sub_2000c(22, 7, true);
			sub_2000c(22, 6, true);
			if (cGame.var_7fd4 == -1 && cGame.var_6c5c == 160) {
				sub_2024d(22, 8, cGame.s_iapEnabled);
			} else {
				sub_2024d(22, 8, false);
			}
			if (cGame.var_757c && !cGame.var_75d4) {
				sub_37449(true);
			} else if (!cGame.var_757c && cGame.var_75d4) {
				sub_37449(false);
			}
			if (!cGame.var_757c && !cGame.var_75d4 && cGame.var_7354) {
				sub_37449(false);
			}
			if (!cGame.var_75d4) {
				sub_2000c(22, 96, false);
				sub_2000c(22, 105, false);
				sub_2000c(22, 114, false);
				sub_2000c(22, 123, false);
				sub_2000c(22, 132, false);
				sub_2000c(22, 141, false);
				sub_2000c(22, 104, false);
				sub_2000c(22, 113, false);
				sub_2000c(22, 122, false);
				sub_2000c(22, 131, false);
				sub_2000c(22, 140, false);
				sub_2000c(22, 149, false);
				sub_2000c(22, 103, false);
				sub_2000c(22, 112, false);
				sub_2000c(22, 121, false);
				sub_2000c(22, 130, false);
				sub_2000c(22, 139, false);
				sub_2000c(22, 148, false);
			}
			if (cGame.var_7aac != -1) {
				if (cGame.var_7aac == 9) {
					sub_4052e(204, 205, 7, 0);
				}
				cGame.var_7aac = -1;
			}
			sub_2c69b();
			sub_1fb8e(22);
		}
		if (n == 5) {
			sub_239ef(22);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				if ((cGame.var_6c5c == 0 || cGame.var_6c5c == 160) && cGame.var_7fd4 == -1) {
					sub_14a74();
				} else {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				}
			}
			if (cGame.var_7fd4 != -1) {
				sub_273b8();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_75ec && cGame.var_7524 < cGame.var_7514 + 1 - 5
						&& cGame.var_7524 + 5 < cGame.var_7474) {
					sub_36e4c(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_7524 > 0) {
					sub_36e4c(-1);
				}
			}
			sub_36661();
			if (cGame.var_6914[1] != null && !sub_2351a(1, 1)) {
				if (cGame.var_6914[1][8] < -cGame.var_75f4 && cGame.var_758c < cGame.var_7584 - 6) {
					sub_373b9(1);
				} else if (cGame.var_6914[1][8] > -10 && cGame.var_758c > 0) {
					sub_373b9(-1);
				}
			}
			if (cGame.var_75e4 != 0 && cGame.var_691c[cGame.var_75dc] == null) {
				if (cGame.var_75e4 == 2) {
					sub_2000c(22, 96, false);
					sub_2000c(22, 105, false);
					sub_2000c(22, 114, false);
					sub_2000c(22, 123, false);
					sub_2000c(22, 132, false);
					sub_2000c(22, 141, false);
					sub_2024d(22, 96, false);
					sub_2024d(22, 105, false);
					sub_2024d(22, 114, false);
					sub_2024d(22, 123, false);
					sub_2024d(22, 132, false);
					sub_2024d(22, 141, false);
					sub_2000c(22, 104, false);
					sub_2000c(22, 113, false);
					sub_2000c(22, 122, false);
					sub_2000c(22, 131, false);
					sub_2000c(22, 140, false);
					sub_2000c(22, 149, false);
					sub_2000c(22, 103, false);
					sub_2000c(22, 112, false);
					sub_2000c(22, 121, false);
					sub_2000c(22, 130, false);
					sub_2000c(22, 139, false);
					sub_2000c(22, 148, false);
				}
				cGame.var_75e4 = 0;
				sub_2c69b();
				sub_1f8c5(22);
			}
			sub_d841(1);
		}
		if (n == 3) {
			sub_1dcc1(22);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(388)) == null) ? "" : sub_4e1f2, 22, 1, 0, 0);
			sub_1df06(GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " "), 22, 9, 0, 0);
			final short n6 = cGame.var_68bc[22][92][2];
			n = cGame.var_68bc[22][92][3];
			sub_1e07e("+" + Integer.toString(cGame.var_75fc), n6 + 40, n + 10, 0, 0, 0, 0, 2, 0, false, false);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[22][10][5]].sub_3882(cGame.var_68bc[22][10][6], 0, array, 0);
			GLLib.sub_36f4(GLLib.g, cGame.var_68bc[22][10][2] + array[0],
					cGame.var_68bc[22][10][3] + array[1], array[2], array[3], true);
			GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(468)) == null) ? "" : sub_4e1f3, 22, 94, 0, 0);
			cGame.var_68d4[cGame.var_68bc[22][95][5]].sub_3882(cGame.var_68bc[22][95][6], 0, array, 0);
			final int n7 = cGame.var_68bc[22][95][2] + array[0];
			final int n8 = cGame.var_68bc[22][95][3] + array[1];
			final int n9 = array[2];
			final int n10 = array[3];
			final int n11 = n9;
			final int n12 = n8;
			n = n7;
			GLLib.sub_36f4(GLLib.g, n, n12, n11, n10, true);
			n = ((cGame.var_7584 - cGame.var_758c >= 6) ? 6 : (cGame.var_7584 - cGame.var_758c));
			for (int k = 0; k < n; ++k) {
				final String sub_4e1f4;
				sub_1e2f2(((sub_4e1f4 = GLLib.TODO_sub_4e1f(cGame.var_7594[k + cGame.var_758c])) == null) ? ""
						: sub_4e1f4, 22, 97 + k * 9, 0, 0);
				if (getLevel() < cGame.var_75cc[k + cGame.var_758c]) {
					final String sub_4e1f5;
					sub_1df06((((sub_4e1f5 = GLLib.TODO_sub_4e1f(447)) == null) ? "" : sub_4e1f5)
							+ Integer.toString(cGame.var_75cc[k + cGame.var_758c]), 22, 101 + k * 9, 0, 0);
				} else {
					sub_1df06(sub_dceb(cGame.var_75b4[k + cGame.var_758c]), 22, 100 + k * 9, 0, 0);
				}
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_36661() {
		for (int n = (cGame.var_751c - cGame.var_7524 >= 5) ? 5 : (cGame.var_751c - cGame.var_7524),
				i = 0; i < n; ++i) {
			if (cGame.var_7524 + i < cGame.var_751c && i < 5) {
				if (!cGame.var_75d4 && i + cGame.var_7524 < cGame.var_7474) {
					cGame.var_68cc[22][22 + i * 15] = cGame.var_7574[i + cGame.var_7524];
					if (sub_20167(22, 14 + i * 15)) {
						cGame.var_68cc[22][15 + i * 15] = Integer.toString(cGame.var_756c[i + cGame.var_7524]);
					}
					sub_2000c(22, 12 + i * 15, false);
				}
			} else if (!cGame.var_75d4 && i + cGame.var_7524 < cGame.var_7474) {
				sub_2000c(22, 12 + i * 15, true);
				final String sub_4e1f;
				cGame.var_68cc[22][12
						+ i * 15] = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7534[i + cGame.var_7524])) == null)
								? ""
								: sub_4e1f);
			}
			final long n2 = System.currentTimeMillis() / 1000L;
			final int n3 = i + cGame.var_7524;
			final int n4 = cGame.var_6914[0][8];
			if (n2 > cGame.var_7544[n3] + cGame.var_753c[n3]) {
				final int n5 = 17 + n3 * 15;
				if ((!sub_20167(22, n5) || !sub_202b7(22, n5)) && cGame.var_7564[n3] == 3) {
					sub_23a84(37);
				}
				sub_3701d(true, i);
				sub_370a5(false, i);
				sub_37156(false, i);
				cGame.var_7574[n3] = "";
				cGame.var_756c[n3] = 0;
				cGame.var_7564[n3] = 4;
				if (cGame.var_7fd4 == 28) {
					cGame.var_6c94 = true;
				}
			} else if (n2 > cGame.var_7544[n3] && n2 < cGame.var_7544[n3] + cGame.var_753c[n3]) {
				sub_3701d(false, i);
				sub_370a5(true, i);
				sub_37156(true, i);
				final int n6 = cGame.var_753c[n3] - (int) (n2 - cGame.var_7544[n3]);
				cGame.var_756c[n3] = sub_e1e7(n6);
				cGame.var_7574[n3] = sub_dceb(n6);
				cGame.var_7564[n3] = 3;
			} else if (n2 < cGame.var_7544[n3]) {
				sub_3701d(false, i);
				sub_370a5(false, i);
				sub_37156(true, i);
				final String sub_4e1f2;
				cGame.var_7574[n3] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(189)) == null) ? "" : sub_4e1f2);
				cGame.var_756c[n3] = cGame.var_754c[n3];
				cGame.var_7564[n3] = 2;
				cGame.var_7544[n3] = n2;
			}
			cGame.var_6914[0][8] = n4;
		}
		if (cGame.var_7514 - cGame.var_7524 < 5 && cGame.var_7514 < cGame.var_7474 && !cGame.var_75d4) {
			cGame.var_68cc[22][22 + (cGame.var_7514 - cGame.var_7524) * 15] = Integer
					.toString(sub_27050(cGame.var_7514 + 1));
		}
		if (cGame.var_74e4) {
			++cGame.var_74ec;
			cGame.var_68bc[22][24
					+ cGame.var_74f4 * 15][2] = (short) (cGame.var_68bc[22][25 + cGame.var_74f4 * 15][2]
							+ 4 * cGame.var_74ec);
			cGame.var_68bc[22][24
					+ cGame.var_74f4 * 15][3] = (short) (cGame.var_68bc[22][25 + cGame.var_74f4 * 15][3]
							+ cGame.var_74ec * cGame.var_74ec);
			if (cGame.var_68bc[22][24 + cGame.var_74f4 * 15][3] > GLLib.s_screenHeight) {
				sub_2000c(22, 24 + cGame.var_74f4 * 15, false);
				cGame.var_74e4 = false;
				cGame.var_74ec = 0;
				sub_36ea2(cGame.var_74f4 + cGame.var_7524);
			}
		}
	}

	private static void sub_36a3e() {
		int n = 0;
		if (cGame.var_6914[0] != null) {
			n = cGame.var_6914[0][8];
		}
		for (int n2 = 0; n2 < cGame.var_7514 && n2 < 5; ++n2) {
			sub_36bc8(n2, true);
		}
		for (int i = cGame.var_7514; i < 5; ++i) {
			sub_36bc8(i, false);
		}
		if (cGame.var_7514 - cGame.var_7524 < 5 && cGame.var_7514 < cGame.var_7474) {
			final int n3 = cGame.var_7514 - cGame.var_7524;
			sub_2000c(22, 11 + n3 * 15, true);
			sub_2024d(22, 11 + n3 * 15, true);
			sub_2000c(22, 19 + n3 * 15, true);
			sub_2000c(22, 20 + n3 * 15, true);
			if (!cGame.var_75d4 && cGame.var_6c5c == 160) {
				sub_2024d(22, 20 + n3 * 15, true);
			} else {
				sub_2024d(22, 20 + n3 * 15, false);
			}
			sub_2000c(22, 21 + n3 * 15, true);
			if (!cGame.var_75d4) {
				sub_2000c(22, 22 + (cGame.var_7514 - cGame.var_7524) * 15, true);
				cGame.var_68cc[22][22 + (cGame.var_7514 - cGame.var_7524) * 15] = Integer
						.toString(sub_27050(cGame.var_7514 + 1));
			}
		}
		sub_2c69b();
		sub_1fb8e(22);
		if (cGame.var_6914[0] != null) {
			cGame.var_6914[0][8] = n;
			sub_22d97(0);
		}
	}

	private static void sub_36bc8(final int n, final boolean b) {
		final int n2 = 11 + n * 15;
		if (cGame.var_7524 + n < cGame.var_751c) {
			sub_2000c(22, n2, b);
			sub_2024d(22, n2, b);
			sub_2000c(22, 25 + n * 15, b);
			sub_2000c(22, 19 + n * 15, false);
			sub_2000c(22, 20 + n * 15, false);
			sub_2024d(22, 20 + n * 15, false);
			sub_2000c(22, 21 + n * 15, false);
			sub_2000c(22, 13 + n * 15, b);
			final String sub_4e1f;
			cGame.var_68cc[22][13
					+ n * 15] = (((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7534[n + cGame.var_7524])) == null) ? ""
							: sub_4e1f);
			if (!cGame.var_75d4) {
				sub_2000c(22, 22 + n * 15, b);
				cGame.var_68cc[22][22 + n * 15] = cGame.var_7574[n + cGame.var_7524];
			}
		} else if (cGame.var_7524 + n < cGame.var_7474) {
			for (int i = n2; i < n2 + 15; ++i) {
				sub_2000c(22, i, false);
			}
			sub_2000c(22, n2, b);
			sub_2024d(22, n2, b);
			cGame.var_7534[cGame.var_7524 + n] = 197;
			cGame.var_7564[cGame.var_7524 + n] = 1;
			if (!cGame.var_75d4 && n + cGame.var_7524 < cGame.var_7474
					&& n + cGame.var_7524 < cGame.var_7514) {
				sub_2000c(22, 12 + n * 15, b);
				final String sub_4e1f2;
				cGame.var_68cc[22][12
						+ n * 15] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_7534[n + cGame.var_7524])) == null)
								? ""
								: sub_4e1f2);
			}
		}
		if (b && n < 5 && cGame.var_7524 + n < cGame.var_7474) {
			final int n3 = 25 + n * 15;
			final int n4 = 24 + n * 15;
			if (cGame.var_7554[cGame.var_7524 + n] > 0) {
				cGame.var_68bc[22][n3][5] = (short) cGame.var_7554[cGame.var_7524 + n];
				cGame.var_68bc[22][n4][5] = (short) cGame.var_7554[cGame.var_7524 + n];
				cGame.var_68bc[22][n3][6] = (short) cGame.var_755c[cGame.var_7524 + n];
				cGame.var_68bc[22][n4][6] = (short) cGame.var_755c[cGame.var_7524 + n];
			}
			sub_d78c(1, cGame.var_68bc[22][n3][5]);
		}
		sub_370a5(false, n);
	}

	private static void sub_36e4c(final int n) {
		cGame.var_7524 += n;
		final int n2 = cGame.var_6914[0][8];
		sub_36a3e();
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[22][26][2] - cGame.var_68bc[22][11][2]) * n;
		sub_22d97(0);
	}

	private static void sub_36ea2(int i) {
		while (i < cGame.var_751c - 1) {
			cGame.var_752c[i] = cGame.var_752c[i + 1];
			cGame.var_7534[i] = cGame.var_7534[i + 1];
			cGame.var_753c[i] = cGame.var_753c[i + 1];
			cGame.var_7544[i] = cGame.var_7544[i + 1];
			cGame.var_754c[i] = cGame.var_754c[i + 1];
			cGame.var_7554[i] = cGame.var_7554[i + 1];
			cGame.var_755c[i] = cGame.var_755c[i + 1];
			cGame.var_756c[i] = cGame.var_756c[i + 1];
			cGame.var_7574[i] = cGame.var_7574[i + 1];
			cGame.var_7564[i] = cGame.var_7564[i + 1];
			++i;
		}
		if (cGame.var_751c > 0) {
			cGame.var_752c[cGame.var_751c - 1] = 0;
			cGame.var_7534[cGame.var_751c - 1] = 0;
			cGame.var_753c[cGame.var_751c - 1] = 0;
			cGame.var_7544[cGame.var_751c - 1] = 0L;
			cGame.var_754c[cGame.var_751c - 1] = 0;
			cGame.var_7554[cGame.var_751c - 1] = -1;
			cGame.var_755c[cGame.var_751c - 1] = 0;
			cGame.var_756c[cGame.var_751c - 1] = 0;
			cGame.var_7574[cGame.var_751c - 1] = "";
			cGame.var_7564[cGame.var_751c - 1] = 0;
		}
		if (--cGame.var_751c < 0) {
			cGame.var_751c = 0;
		}
		sub_36a3e();
		sub_2c69b();
		sub_1f8c5(22);
	}

	private static void sub_36fee(final int n) {
		final long n2 = System.currentTimeMillis() / 1000L;
		cGame.var_753c[n] = 0;
		cGame.var_7544[n] = n2;
	}

	private static void sub_3701d(final boolean b, int n) {
		final int n2 = 18 + n * 15;
		n = 17 + n * 15;
		if (sub_20167(22, n) != b || sub_202b7(22, n) != b) {
			final int n3 = cGame.var_6914[0][8];
			sub_2000c(22, n2, b);
			sub_2000c(22, n, b);
			sub_2024d(22, n, b);
			cGame.var_6914[0][8] = n3;
			sub_2c69b();
			sub_1f8c5(22);
		}
	}

	private static void sub_370a5(final boolean b, int n) {
		final int n2 = 14 + n * 15;
		final int n3 = 16 + n * 15;
		if (sub_20167(22, n2) != b && cGame.var_6914 != null && cGame.var_6914[0] != null) {
			final int n4 = cGame.var_6914[0][8];
			sub_2000c(22, n2, b);
			sub_2024d(22, n2, b);
			sub_2000c(22, n3, b);
			sub_2000c(22, 15 + n * 15, b);
			final String string = Integer.toString(cGame.var_756c[n + cGame.var_7524]);
			n = 15 + n * 15;
			cGame.var_68cc[22][n] = string;
			sub_2c69b();
			sub_1f8c5(22);
			cGame.var_6914[0][8] = n4;
		}
	}

	private static void sub_37156(final boolean b, int n) {
		n = 23 + n * 15;
		if (cGame.var_7fd4 == 28) {
			if (sub_20167(22, n) || sub_202b7(22, n)) {
				sub_2000c(22, n, false);
				sub_2024d(22, n, false);
				sub_2c69b();
				sub_1f8c5(22);
			}
			return;
		}
		if (sub_20167(22, n) != b || sub_202b7(22, n) != b) {
			sub_2000c(22, n, b);
			sub_2024d(22, n, b);
			sub_2c69b();
			sub_1f8c5(22);
		}
	}

	private static void sub_37204(final int n) {
		final Class_h class_h = Class_h.var_6a[22];
		int n2 = 0;
		for (int i = 0; i < 6; ++i) {
			if (cGame.var_752c[n] == class_h.var_82[i][1]) {
				n2 = i;
				break;
			}
		}
		final int n3 = class_h.var_82[n2][5];
		final int n4 = class_h.var_82[n2][6];
		final int n5 = class_h.var_82[n2][8];
		final int n6 = class_h.var_82[n2][9];
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + n4 + n6 >= sub_2df26()) {
			cGame.var_7aac = 2;
			sub_8370(17);
			return;
		}
		sub_2da54(0, n3, n4);
		sub_2da54(0, n5, n6);
		sub_36fee(n);
		sub_36ea2(n);
	}

	private static void sub_372e2(final int n, final boolean b) {
		int i = 0;
		while (i < (i = 96 + n * 9) + 9) {
			sub_2000c(22, i, b);
			++i;
		}
		if (b) {
			final int n2 = 104 + n * 9;
			cGame.var_68bc[22][n2][5] = (short) cGame.var_75bc[cGame.var_758c + n];
			cGame.var_68bc[22][n2][6] = (short) cGame.var_75c4[cGame.var_758c + n];
			sub_d78c(1, cGame.var_68bc[22][n2][5]);
		}
		if (getLevel() >= cGame.var_75cc[cGame.var_758c + n]) {
			sub_2000c(22, 103 + n * 9, false);
			return;
		}
		sub_2000c(22, 103 + n * 9, true);
	}

	private static void sub_373b9(final int n) {
		if (cGame.var_6914[1] == null) {
			return;
		}
		cGame.var_758c += n;
		final int n2 = cGame.var_6914[1][8];
		for (int i = 0; i < 6; ++i) {
			sub_372e2(i, true);
		}
		cGame.var_6914[1][8] = n2 + (cGame.var_68bc[22][105][2] - cGame.var_68bc[22][96][2]) * n;
		sub_22d97(1);
	}

	private static void sub_37449(final boolean var_75d4) {
		int n = 0;
		if (cGame.var_6914 != null && cGame.var_6914[0] != null) {
			n = cGame.var_6914[0][8];
		}
		if (var_75d4 && cGame.var_7fd4 == 24) {
			cGame.var_6c94 = true;
		}
		if (cGame.var_75d4 = var_75d4) {
			cGame.var_75e4 = 1;
			cGame.var_75dc = sub_23556(1441885, 1441958, 0, 185, 0, 0, 500);
			if (cGame.var_6914[0] != null) {
				sub_234cb(0, 1);
			}
			cGame.var_68bc[22][160][6] = 151;
			sub_2000c(22, 96, var_75d4);
			sub_2000c(22, 105, var_75d4);
			sub_2000c(22, 114, var_75d4);
			sub_2000c(22, 123, var_75d4);
			sub_2000c(22, 132, var_75d4);
			sub_2000c(22, 141, var_75d4);
			sub_2024d(22, 96, var_75d4);
			sub_2024d(22, 105, var_75d4);
			sub_2024d(22, 114, var_75d4);
			sub_2024d(22, 123, var_75d4);
			sub_2024d(22, 132, var_75d4);
			sub_2024d(22, 141, var_75d4);
			sub_2000c(22, 104, var_75d4);
			sub_2000c(22, 113, var_75d4);
			sub_2000c(22, 122, var_75d4);
			sub_2000c(22, 131, var_75d4);
			sub_2000c(22, 140, var_75d4);
			sub_2000c(22, 149, var_75d4);
			for (int i = 0; i < 6; ++i) {
				if (getLevel() >= cGame.var_75cc[cGame.var_758c + i]) {
					sub_2000c(22, 103 + i * 9, false);
				} else {
					sub_2000c(22, 103 + i * 9, true);
				}
			}
		} else {
			cGame.var_75e4 = 2;
			cGame.var_75dc = sub_23556(1441885, 1441958, 0, 0, 0, 185, 500);
			if (cGame.var_6914[0] != null) {
				sub_234f2(0);
			}
			cGame.var_68bc[22][160][6] = 152;
		}
		sub_2000c(22, 94, true);
		sub_2000c(22, 150, false);
		sub_2024d(22, 150, false);
		sub_2000c(22, 151, false);
		sub_2024d(22, 151, false);
		sub_2000c(22, 152, false);
		sub_2024d(22, 152, false);
		sub_2000c(22, 153, false);
		sub_2000c(22, 154, false);
		sub_2000c(22, 155, false);
		sub_2000c(22, 161, false);
		sub_2000c(22, 162, false);
		sub_2000c(22, 163, false);
		sub_2000c(22, 164, false);
		sub_2000c(22, 165, false);
		sub_2000c(22, 166, false);
		sub_36a3e();
		if (cGame.var_6914 != null && cGame.var_6914[0] != null) {
			cGame.var_6914[0][8] = n;
		}
	}

	static boolean sub_376da() {
		boolean b = false;
		for (int i = 0; i < cGame.var_7474; ++i) {
			final long n = System.currentTimeMillis() / 1000L;
			if (cGame.var_7544[i] > 0L && n > cGame.var_7544[i] + cGame.var_753c[i]) {
				b = true;
				break;
			}
		}
		return b;
	}

	private static void sub_37750() {
		final Class_h class_h = Class_h.var_6a[22];
		final Class_h class_h2 = Class_h.var_6a[1];
		int n = 0;
		for (int i = 0; i < class_h.var_7a; ++i) {
			if (class_h.var_82[i][3] == cGame.var_7604) {
				n = i;
				break;
			}
		}
		cGame.var_764c = class_h.var_82[n][1];
		if ((cGame.var_760c = class_h.var_82[n][15]) > 117) {
			return;
		}
		cGame.var_7614 = class_h.var_82[n][13];
		cGame.var_762c = class_h.var_82[n][2];
		cGame.var_7664 = class_h.var_82[n][5];
		cGame.var_7654 = class_h2.var_82[cGame.var_7664][2];
		cGame.var_7674 = class_h.var_82[n][6];
		cGame.var_7684 = class_h.var_82[n][7];
		cGame.var_766c = class_h.var_82[n][8];
		cGame.var_765c = class_h2.var_82[cGame.var_766c][2];
		cGame.var_767c = class_h.var_82[n][9];
		cGame.var_768c = class_h.var_82[n][10];
		cGame.var_7624 = sub_dceb(cGame.var_761c = class_h.var_82[n][11] * 60);
		cGame.var_7634 = class_h.var_82[n][12];
		cGame.var_763c = (short) class_h2.var_82[cGame.var_760c][3];
		cGame.var_7644 = (short) class_h2.var_82[cGame.var_760c][4];
		cGame.var_68bc[6][3][5] = (short) class_h2.var_82[cGame.var_7664][3];
		cGame.var_68bc[6][3][6] = (short) class_h2.var_82[cGame.var_7664][4];
		sub_d78c(1, cGame.var_68bc[6][3][5]);
		cGame.var_68bc[6][8][5] = (short) class_h2.var_82[cGame.var_766c][3];
		cGame.var_68bc[6][8][6] = (short) class_h2.var_82[cGame.var_766c][4];
		sub_d78c(1, cGame.var_68bc[6][8][5]);
		cGame.var_68bc[6][21][5] = (short) class_h2.var_82[cGame.var_760c][3];
		cGame.var_68bc[6][21][6] = (short) class_h2.var_82[cGame.var_760c][4];
		cGame.var_68bc[6][32][5] = (short) class_h2.var_82[cGame.var_760c][3];
		cGame.var_68bc[6][32][6] = (short) class_h2.var_82[cGame.var_760c][4];
		sub_d78c(1, class_h2.var_82[cGame.var_760c][3]);
		sub_37991();
	}

	private static void sub_37991() {
		cGame.var_7694 = sub_2e024(0, cGame.var_7664);
		cGame.var_769c = sub_2e024(0, cGame.var_766c);
		if (cGame.var_7664 == cGame.var_766c && cGame.var_7674 + cGame.var_767c > cGame.var_7694) {
			if (cGame.var_7694 <= cGame.var_7674) {
				cGame.var_769c = 0;
			} else {
				cGame.var_7694 = cGame.var_7674;
				cGame.var_769c -= cGame.var_7674;
			}
		}
		boolean b = true;
		if (cGame.var_7674 <= cGame.var_7694) {
			sub_2000c(6, 5, true);
			sub_2000c(6, 7, false);
			sub_2000c(6, 17, false);
		} else {
			sub_2000c(6, 5, false);
			sub_2000c(6, 7, true);
			sub_2024d(6, 7, true);
			sub_2000c(6, 17, true);
			b = false;
		}
		if (cGame.var_767c <= cGame.var_769c) {
			sub_2000c(6, 10, true);
			sub_2000c(6, 12, false);
			sub_2000c(6, 18, false);
		} else {
			sub_2000c(6, 10, false);
			if (cGame.var_7664 == cGame.var_766c && sub_20167(6, 7)) {
				sub_2000c(6, 12, false);
				sub_2024d(6, 12, false);
				sub_2000c(6, 18, false);
			} else {
				sub_2000c(6, 12, true);
				sub_2024d(6, 12, true);
				sub_2000c(6, 18, true);
			}
			b = false;
		}
		if (b) {
			cGame.var_68bc[6][26][5] = 20;
			cGame.var_68bc[6][26][6] = 54;
		} else {
			cGame.var_68bc[6][26][5] = 20;
			cGame.var_68bc[6][26][6] = 55;
		}
		sub_2024d(6, 26, true);
		sub_2c69b();
		sub_1fb8e(6);
	}

	private static boolean sub_37b49(int i) {
		if (i == 1) {
			cGame.var_774c = sub_237d7(10, 0, 1, 7, 20, 54) + 10;
			sub_1daf4(10);
			cGame.var_76e4 = 0;
			for (int j = 13; j <= 48; j += 7) {
				sub_2c760(0xA0000 | (j & 0xFFFF), 1);
			}
			if (cGame.var_7754 == 0) {
				sub_38251(new int[] { 0, 4 });
			} else if (cGame.var_7754 == 1) {
				sub_38251(new int[] { 3 });
			} else if (cGame.var_7754 == 2) {
				sub_38251(new int[] { 1, 2 });
			}
			sub_18af3(cGame.var_7754);
			cGame.var_68cc[10][66] = "";
			sub_2c69b();
			sub_1fb8e(10);
			cGame.var_68ac = 100;
			cGame.var_76c4 = sub_2dcf3(5);
			sub_23a84(51);
			cGame.var_76cc = sub_30161(sub_2df26());
			cGame.var_775c = false;
			cGame.var_76ec = -1;
			cGame.var_68bc[10][19][5] = 1138;
			cGame.var_68bc[10][19][6] = 12;
			cGame.var_68bc[10][26][5] = 1138;
			cGame.var_68bc[10][26][6] = 12;
			cGame.var_68bc[10][33][5] = 1138;
			cGame.var_68bc[10][33][6] = 12;
			cGame.var_68bc[10][40][5] = 1138;
			cGame.var_68bc[10][40][6] = 12;
			cGame.var_68bc[10][47][5] = 1138;
			cGame.var_68bc[10][47][6] = 12;
			cGame.var_68bc[10][54][5] = 1138;
			cGame.var_68bc[10][54][6] = 12;
		}
		if (i == 5) {
			if (cGame.var_76ec != -1) {
				final int var_76ec = cGame.var_76ec;
				cGame.var_6aa4 = 4;
				final int n = cGame.var_7704[var_76ec];
				final int n2 = cGame.var_770c[var_76ec];
				final int n3 = cGame.var_7714[var_76ec];
				boolean b = false;
				sub_2da54(n, n2, -1);
				if (n3 == 0) {
					final short n4 = cGame.var_80a4[n2];
					int n5 = 0;
					for (int k = cGame.var_776c; k >= 0; --k) {
						if (cGame.var_7764[k] == n4) {
							n5 = k;
							break;
						}
					}
					for (int l = n5; l < cGame.var_776c - 1; ++l) {
						cGame.var_7764[l] = cGame.var_7764[l + 1];
					}
					cGame.var_7764[cGame.var_776c - 1] = 0;
					--cGame.var_776c;
					final Class_f[] array = { null };
					Class_f.sub_5b49(0, 54, n4, array);
					if (array[0] != null) {
						sub_2deb3(array[0], false);
						b = true;
						cGame.var_6aa4 = 4;
						cGame.var_6ab4 = array[0];
					}
				} else {
					b = true;
					cGame.var_6aa4 = 4;
					cGame.var_6ab4 = sub_25b35(n3, n2);
				}
				if (cGame.var_6ab4 != null && b) {
					final int[] array2 = new int[2];
					if (sub_2cf89(cGame.var_6ab4, array2)) {
						cGame.var_6ab4.var_17cd = array2[0];
						cGame.var_6ab4.var_17d5 = array2[1];
					}
					cGame.var_800c.sub_6b0c(cGame.var_6ab4.var_17cd, cGame.var_6ab4.var_17d5, 1000);
				}
				sub_10cd1(false);
				sub_10dd3(true);
				sub_23a84(51);
			}
			cGame.var_76fc = null;
			cGame.var_7714 = null;
			cGame.var_771c = null;
			cGame.var_7724 = null;
			cGame.var_772c = null;
			cGame.var_7734 = null;
			cGame.var_773c = null;
			cGame.var_76f4 = null;
			cGame.var_7744 = null;
			sub_d7d7(1);
			sub_239ef(10);
		}
		if (i == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				if (cGame.var_7fd4 > 0) {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				} else {
					sub_18688();
				}
			}
			if (cGame.var_7fd4 > 0) {
				sub_273b8();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_774c && cGame.var_76e4 < cGame.var_76dc - 6) {
					sub_38782(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_76e4 > 0) {
					sub_38782(-1);
				}
			}
			sub_d841(1);
			final short n6 = cGame.var_68bc[10][61][2];
			cGame.var_68bc[10][60][2] = (short) (n6
					+ (cGame.var_68bc[10][62][2] - n6) * cGame.var_76c4 / getIntValue(cGame.var_76cc));
			sub_2000c(10, 60, true);
		}
		if (i == 3 && !cGame.var_775c) {
			sub_1dcc1(10);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(456)) == null) ? "" : sub_4e1f2, 10, 1, 0, 0);
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(483)) == null) ? "" : sub_4e1f3, 10, 65, 0, 0);
			sub_1e44e(10, 60);
			if (sub_202b7(10, 63)) {
				final String sub_4e1f4;
				sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(484)) == null) ? "" : sub_4e1f4, 10, 64, 0, 0);
			}
			sub_1df06("" + cGame.var_76c4 + " / " + getIntValue(cGame.var_76cc), 10, 2, 0, 0);
			final int[] array3 = new int[4];
			cGame.var_68d4[cGame.var_68bc[10][12][5]].sub_3882(cGame.var_68bc[10][12][6], 0, array3, 0);
			final int n7 = cGame.var_68bc[10][12][2] + array3[0];
			final int n8 = cGame.var_68bc[10][12][3] + array3[1];
			final int n9 = array3[2];
			final int n10 = array3[3];
			final int n11 = n9;
			final int n12 = n8;
			i = n7;
			GLLib.sub_36f4(GLLib.g, i, n12, n11, n10, true);
			int n13;
			int n14;
			for (n13 = ((cGame.var_76dc - cGame.var_76e4 >= 6) ? 6
					: (cGame.var_76dc - cGame.var_76e4)), n14 = 0; n14 < n13; ++n14) {
				final String sub_4e1f5;
				sub_1e2f2(((sub_4e1f5 = GLLib.TODO_sub_4e1f(cGame.var_76f4[cGame.var_76e4 + n14])) == null) ? ""
						: sub_4e1f5, 10, 14 + n14 * 7, 0, 0);
				sub_1df06("x" + cGame.var_771c[cGame.var_76e4 + n14], 10, 16 + n14 * 7, 0, 0);
			}
			String sub_4e1f6;
			for (i = n14; i < 6; ++i) {
				sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(197)) == null) ? "" : sub_4e1f6, 10, 15 + i * 7, 0, 0);
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			i = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, i, var_1de7, true);
		}
		return false;
	}

	private static void sub_38251(final int[] array) {
		int n = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		cGame.var_76e4 = 0;
		cGame.var_76dc = 0;
		for (int i = 0; i < array.length; ++i) {
			cGame.var_76dc += sub_2db90(array[i]);
		}
		if (cGame.var_76dc > 0) {
			cGame.var_76fc = new int[cGame.var_76dc];
			cGame.var_7704 = new int[cGame.var_76dc];
			cGame.var_770c = new int[cGame.var_76dc];
			cGame.var_7714 = new int[cGame.var_76dc];
			cGame.var_771c = new short[cGame.var_76dc];
			cGame.var_7724 = new short[cGame.var_76dc];
			cGame.var_772c = new short[cGame.var_76dc];
			cGame.var_7734 = new short[cGame.var_76dc];
			cGame.var_773c = new short[cGame.var_76dc];
			cGame.var_76f4 = new short[cGame.var_76dc];
			cGame.var_7744 = new byte[cGame.var_76dc];
			int n5 = 0;
			for (int j = 0; j < array.length; ++j) {
				switch (array[j]) {
				case 0: {
					n3 = 1;
					n4 = 117;
					break;
				}
				case 3: {
					n3 = 0;
					n4 = 64;
					break;
				}
				case 1: {
					n3 = 3;
					n4 = 20;
					break;
				}
				case 2: {
					n3 = 4;
					n4 = 63;
					break;
				}
				case 4: {
					n3 = 2;
					n5 = 12;
					n4 = 10;
					break;
				}
				}
				final Class_h class_h = Class_h.var_6a[n3];
				for (int k = 0; k < n4; ++k) {
					if (sub_2e024(array[j], k) > 0) {
						cGame.var_76fc[n2] = k;
						cGame.var_7704[n2] = array[j];
						cGame.var_770c[n2] = (short) class_h.var_82[k + n5][0];
						cGame.var_7714[n2] = n3;
						cGame.var_771c[n2] = (short) sub_2e024(array[j], k);
						cGame.var_7724[n2] = (short) class_h.var_82[k + n5][3];
						cGame.var_772c[n2] = (short) class_h.var_82[k + n5][4];
						cGame.var_7734[n2] = 0;
						if (array[j] == 3 && class_h.var_82[k][32] > 0) {
							cGame.var_7734[n2] = (short) class_h.var_82[k][32];
						}
						cGame.var_773c[n2] = (short) class_h.var_82[k + n5][1];
						cGame.var_76f4[n2] = (short) class_h.var_82[k + n5][2];
						if (array[j] == 0) {
							cGame.var_7744[n2] = (byte) class_h.var_82[k][9];
						}
						++n2;
						if (n < 6) {
							sub_385a9(n, true);
							++n;
						}
					}
				}
			}
		}
		for (int l = n; l < 6; ++l) {
			sub_385a9(l, false);
			sub_2000c(10, 17 + l * 7, false);
		}
		sub_2c69b();
		sub_1fb8e(10);
	}

	private static void sub_385a9(final int n, final boolean b) {
		int n4;
		int n3;
		for (int n2 = (n3 = (n4 = n * 7) + 13) + 7, i = n3; i < n2; ++i) {
			sub_2000c(10, i, b);
		}
		final int n5 = n4 + 18;
		final int n6 = n4 + 17;
		if (b) {
			while (true) {
				int n7 = 0;
				int n8 = 0;
				boolean b2 = false;
				Label_0233: {
					switch (cGame.var_7704[cGame.var_76e4 + n]) {
					case 3: {
						cGame.var_68bc[10][n5][8] = cGame.var_7734[cGame.var_76e4 + n];
						sub_2000c(10, n6, true);
						sub_2024d(10, n3, true);
						n7 = 10;
						n8 = n4 + 19;
						break;
					}
					case 1:
					case 2:
					case 4: {
						cGame.var_68bc[10][n5][8] = 0;
						sub_2000c(10, n6, true);
						sub_2024d(10, n3, true);
						n7 = 10;
						n8 = n4 + 19;
						break;
					}
					case 0: {
						cGame.var_68bc[10][n5][8] = 0;
						sub_2000c(10, n6, false);
						sub_2024d(10, n3, false);
						n7 = 10;
						n8 = n4 + 19;
						if (cGame.var_7744[cGame.var_76e4 + n] > 0) {
							b2 = true;
							break Label_0233;
						}
						break;
					}
					default: {
						cGame.var_68bc[10][n5][5] = cGame.var_7724[cGame.var_76e4 + n];
						cGame.var_68bc[10][n5][6] = cGame.var_772c[cGame.var_76e4 + n];
						sub_d78c(1, cGame.var_68bc[10][n5][5]);
						return;
					}
					}
					b2 = false;
				}
				sub_2000c(n7, n8, b2);
				continue;
			}
		}
		sub_2000c(10, n3, true);
		sub_2024d(10, n3, false);
		sub_2000c(10, n6, false);
		sub_2000c(10, n4 + 19, false);
	}

	private static void sub_38782(final int n) {
		cGame.var_76e4 += n;
		final int n2 = cGame.var_6914[0][8];
		int n3;
		int i;
		for (n3 = ((cGame.var_76dc - cGame.var_76e4 >= 6) ? 6
				: (cGame.var_76dc - cGame.var_76e4)), i = 0; i < n3; ++i) {
			sub_385a9(i, true);
		}
		while (i < 6) {
			sub_385a9(i, false);
			++i;
		}
		sub_2c69b();
		sub_1fb8e(10);
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[10][20][2] - cGame.var_68bc[10][13][2]) * n;
		sub_22d97(0);
	}

	private static boolean sub_38850(final int n) {
		if (n == 0) {
			cGame.var_7fcc = cGame.var_7fc4;
			cGame.var_7fc4 = 100;
			sub_114a7(false, false, false);
			sub_2000c(13, 44, false);
			sub_2000c(13, 41, false);
			sub_2024d(13, 41, false);
			sub_23a84(60);
		}
		if (n == 1) {
			cGame.var_7844 = false;
			cGame.var_778c = new boolean[6];
			for (int i = 0; i < 6; ++i) {
				cGame.var_778c[i] = true;
			}
			for (int j = 0; j < ((cGame.var_808c - 3 < 6) ? (cGame.var_808c - 3) : 6); ++j) {
				if (cGame.var_7774[j] < System.currentTimeMillis()) {
					final short n2 = cGame.var_68bc[13][j + 5][2];
					final short n3 = cGame.var_68bc[13][j + 5][3];
					cGame.var_68fc[j].sub_1856(4, -1, true);
					cGame.var_68fc[j].SetPos(n2, n3);
					cGame.var_68fc[j].sub_1941();
					cGame.var_68fc[j].sub_1b7f();
					cGame.var_68bc[13][j + 45][10] = 0;
				}
			}
			cGame.var_7794 = new boolean[3];
			for (int k = 0; k < 3; ++k) {
				final short n4 = cGame.var_68bc[13][k + 2][2];
				final short n5 = cGame.var_68bc[13][k + 2][3];
				if (k == 0) {
					cGame.var_690c[0].sub_1856(2, -1, true);
				} else if (k == 1) {
					cGame.var_690c[1].sub_1856(3, -1, true);
				} else {
					cGame.var_690c[2].sub_1856(0, -1, true);
				}
				cGame.var_690c[k].SetPos(n4, n5);
				cGame.var_690c[k].sub_1941();
				cGame.var_7794[k] = true;
			}
			for (int l = 0; l < 6; ++l) {
				cGame.var_68bc[13][l + 59][10] = 0;
				final short n6 = cGame.var_68bc[13][l + 5][2];
				final int n7 = cGame.var_68bc[13][l + 5][3] + 50;
				cGame.var_68bc[13][l + 59][2] = n6;
				cGame.var_68bc[13][l + 59][3] = (short) n7;
			}
			for (int n8 = 0; n8 < 9; ++n8) {
				sub_2000c(13, n8 + 2, false);
				sub_2024d(13, n8 + 2, false);
			}
			for (int n9 = 0; n9 <= ((cGame.var_808c < 3) ? cGame.var_808c : 2); ++n9) {
				sub_2000c(13, n9 + 2, true);
				sub_2024d(13, n9 + 2, true);
				cGame.var_68bc[13][n9 + 2][5] = 36;
				int n10 = 0;
				switch (n9) {
				case 0: {
					n10 = 2;
					break;
				}
				case 1: {
					n10 = 3;
					break;
				}
				case 2: {
					n10 = 0;
					break;
				}
				}
				cGame.var_68bc[13][n9 + 2][6] = (short) n10;
			}
			if (cGame.var_808c < 9) {
				int n11 = 11;
				switch (cGame.var_77f4) {
				case 0: {
					if (sub_4ac19(sub_3a3b8(cGame.var_808c))) {
						n11 = 1;
						final boolean sub_3a230 = sub_3a230(cGame.var_808c);
						final boolean sub_3a231 = sub_3a383();
						if (cGame.var_77dc = (sub_3a230 && sub_3a231)) {
							sub_3a73b((short) 1);
							n11 = 5;
							final short n12 = cGame.var_68bc[13][2 + cGame.var_808c][2];
							final short n13 = cGame.var_68bc[13][2 + cGame.var_808c][3];
							cGame.var_6904.SetSprite(cGame.var_68d4[36]);
							cGame.var_6904.sub_1856(1, -1, true);
							cGame.var_6904.SetPos(n12, n13);
						}
						break;
					}
					break;
				}
				case 1: {
					n11 = 1;
					final boolean sub_3a232 = sub_3a230(cGame.var_808c);
					final boolean sub_3a233 = sub_3a383();
					if (cGame.var_77dc = (sub_3a232 && sub_3a233)) {
						n11 = 5;
						final short n14 = cGame.var_68bc[13][2 + cGame.var_808c][2];
						final short n15 = cGame.var_68bc[13][2 + cGame.var_808c][3];
						cGame.var_6904.SetSprite(cGame.var_68d4[36]);
						cGame.var_6904.sub_1856(1, -1, true);
						cGame.var_6904.SetPos(n14, n15);
						break;
					}
					break;
				}
				case 2: {
					n11 = 8;
					break;
				}
				case 3: {
					n11 = 12;
					final short n16 = cGame.var_68bc[13][2 + cGame.var_808c][2];
					final short n17 = cGame.var_68bc[13][2 + cGame.var_808c][3];
					cGame.var_6904.SetSprite(cGame.var_68d4[36]);
					cGame.var_6904.sub_1856(5, -1, true);
					cGame.var_6904.SetPos(n16, n17);
					break;
				}
				}
				cGame.var_68bc[13][2 + cGame.var_808c][5] = 36;
				cGame.var_68bc[13][2 + cGame.var_808c][6] = (short) n11;
				sub_2000c(13, 2 + cGame.var_808c, true);
				sub_2024d(13, 2 + cGame.var_808c, true);
			}
			for (int n18 = 3; n18 < ((cGame.var_808c < 9) ? cGame.var_808c : 9); ++n18) {
				sub_2000c(13, n18 + 2, true);
				sub_2024d(13, n18 + 2, true);
				cGame.var_68bc[13][n18 + 2][5] = 36;
				cGame.var_68bc[13][n18 + 2][6] = 9;
				final int n19 = n18 - 3;
				if (cGame.var_68fc[n19] != null && cGame.var_68fc[n19].sub_1b34()
						&& cGame.var_7774[n19] < System.currentTimeMillis()) {
					final short n20 = cGame.var_68bc[13][n19 + 5][2];
					final short n21 = cGame.var_68bc[13][n19 + 5][3];
					cGame.var_68fc[n19].sub_1856(4, -1, true);
					cGame.var_68fc[n19].SetPos(n20, n21);
					cGame.var_68fc[n19].sub_1941();
					cGame.var_778c[n19] = false;
				}
			}
			cGame.var_777c = new Class_f[6];
			if (cGame.var_6c5c == 161 || cGame.var_6c5c == 163) {
				sub_2000c(13, 40, true);
				sub_2024d(13, 38, false);
				sub_2000c(13, 38, false);
			} else {
				sub_2000c(13, 40, false);
				sub_2024d(13, 38, true);
				sub_2000c(13, 38, true);
			}
			sub_2c69b();
			sub_1fb8e(13);
			cGame.var_704c = Class_f.sub_5ad9(0, 54);
			cGame.var_7034 = Class_f.sub_4cf5(0, 49);
			cGame.var_779c = false;
			if (cGame.var_808c >= 1) {
				if (cGame.var_779c = sub_35bc4()) {
					cGame.var_68bc[13][2][6] = 6;
					cGame.var_7794[0] = false;
				} else {
					cGame.var_68bc[13][2][6] = 2;
					cGame.var_7794[0] = true;
				}
			}
			cGame.var_77a4 = false;
			if (cGame.var_808c >= 2) {
				for (int n22 = 0; n22 < 15 && !cGame.var_77a4; ++n22) {
					cGame.var_77a4 = (getIntValue(cGame.var_79f4[n22 << 2]) > 0
							&& getIntValue(cGame.var_79f4[(n22 << 2) + 1]) > 0
							&& getIntValue(cGame.var_79f4[(n22 << 2) + 2]) > 0
							&& getIntValue(cGame.var_79f4[(n22 << 2) + 3]) > 0);
				}
				if (cGame.var_77a4) {
					cGame.var_68bc[13][3][6] = 7;
					cGame.var_7794[1] = false;
				} else {
					cGame.var_68bc[13][3][6] = 3;
					cGame.var_7794[1] = true;
				}
			}
			cGame.var_77ac = false;
			if (cGame.var_808c >= 3) {
				for (int n23 = 0; n23 < cGame.var_6ee4 && !cGame.var_77ac; ++n23) {
					cGame.var_77ac = (cGame.var_6edc[n23] == 1);
				}
				if (cGame.var_77ac) {
					cGame.var_68bc[13][4][6] = 4;
					cGame.var_7794[2] = false;
				} else {
					cGame.var_68bc[13][4][6] = 0;
					cGame.var_7794[2] = true;
				}
			}
		}
		if (n == 5) {
			cGame.var_777c = null;
			cGame.var_7fc4 = cGame.var_7fcc;
			if (cGame.var_7844) {
				cGame.var_77f4 = 0;
				++cGame.var_808c;
				final Class_f[] array = new Class_f[2];
				Class_f.sub_545c(0, 50, 18, array, 2);
				Class_f.sub_6bd7();
				cGame.var_800c.sub_6b0c(array[0].var_17cd, array[0].var_17d5, 1000);
				final ASprite class_e;
				final short n24 = (class_e = cGame.var_7ff4[128]).var_faf[5];
				if (cGame.var_8004 != null) {
					cGame.var_8004.var_17cd = array[0].var_17cd + class_e.sub_30ea(n24);
					cGame.var_8004.var_17d5 = array[0].var_17d5 + class_e.sub_310b(n24);
				}
				cGame.var_6c54 = true;
				if (cGame.var_781c > 0) {
					final Class_f[] array2 = new Class_f[2];
					Class_f.sub_545c(0, 50, 18, array2, 2);
					sub_e055(true, cGame.var_781c, array2[0].var_17cd, array2[0].var_17d5);
				}
				cGame.var_7844 = false;
			}
			sub_239ef(13);
		}
		if (n == 2) {
			if (GLLib.IsAnyKeyDown() == 19) {
				sub_190dd();
			}
			if (cGame.var_7844) {
				return false;
			}
			if (cGame.var_77f4 == 3) {
				cGame.var_68bc[13][2 + cGame.var_808c][5] = 36;
				cGame.var_68bc[13][2 + cGame.var_808c][6] = 12;
				final int n25 = cGame.var_6f7c & 0xFFFF;
				if ((cGame.var_6f7c >> 16 & 0xFFFF) == 0xD && n25 == 2 + cGame.var_808c
						&& !cGame.var_6904.sub_1b34()) {
					cGame.var_7784 = true;
				} else if (!GLLib.sub_76f9() && cGame.var_7784) {
					cGame.var_7784 = false;
				}
				if (cGame.var_7784) {
					sub_2000c(13, 2 + cGame.var_808c, true);
				} else {
					sub_2000c(13, 2 + cGame.var_808c, false);
				}
				if (cGame.var_6904 != null) {
					cGame.var_6904.sub_1ca1(GLLib.s_game_frameDT);
				}
			} else if (cGame.var_77f4 == 2) {
				cGame.var_68bc[13][2 + cGame.var_808c][6] = 8;
				cGame.var_7784 = true;
				if (cGame.var_77bc + cGame.var_77fc - System.currentTimeMillis() / 1000L < 0L) {
					cGame.var_77f4 = 3;
					final short n26 = cGame.var_68bc[13][2 + cGame.var_808c][2];
					final short n27 = cGame.var_68bc[13][2 + cGame.var_808c][3];
					cGame.var_6904.SetSprite(cGame.var_68d4[36]);
					cGame.var_6904.sub_1856(5, -1, true);
					cGame.var_6904.SetPos(n26, n27);
					if (cGame.var_6904 != null) {
						cGame.var_6904.sub_1ca1(GLLib.s_game_frameDT);
					}
				}
			} else if (cGame.var_77f4 == 1 && cGame.var_77dc) {
				if (cGame.var_6904.sub_1b34()) {
					final short n28 = cGame.var_68bc[13][2 + cGame.var_808c][2];
					final short n29 = cGame.var_68bc[13][2 + cGame.var_808c][3];
					cGame.var_6904.SetSprite(cGame.var_68d4[36]);
					cGame.var_6904.sub_1856(1, -1, true);
					cGame.var_6904.SetPos(n28, n29);
				}
				final int n30 = cGame.var_6f7c & 0xFFFF;
				if ((cGame.var_6f7c >> 16 & 0xFFFF) == 0xD && n30 == 2 + cGame.var_808c
						&& !cGame.var_6904.sub_1b34()) {
					cGame.var_7784 = true;
				} else if (!GLLib.sub_76f9() && cGame.var_7784) {
					cGame.var_7784 = false;
				}
				if (cGame.var_6904 != null) {
					cGame.var_6904.sub_1ca1(GLLib.s_game_frameDT);
				}
			}
			for (int n31 = 0; n31 < ((cGame.var_808c - 3 < 6) ? (cGame.var_808c - 3) : 6); ++n31) {
				if (cGame.var_68fc[n31].sub_1b34()) {
					if (cGame.var_7774[n31] < System.currentTimeMillis()) {
						final short n32 = cGame.var_68bc[13][n31 + 5][2];
						final short n33 = cGame.var_68bc[13][n31 + 5][3];
						cGame.var_68fc[n31].sub_1856(4, -1, true);
						cGame.var_68fc[n31].SetPos(n32, n33);
						cGame.var_68fc[n31].sub_1941();
						cGame.var_778c[n31] = false;
						cGame.var_68bc[13][n31 + 45][10] = 0;
						cGame.var_68bc[13][n31 + 5][6] = 10;
					} else {
						cGame.var_778c[n31] = true;
						cGame.var_68bc[13][n31 + 5][6] = 9;
					}
				} else if (!cGame.var_68fc[n31].sub_1b34()) {
					if (cGame.var_7774[n31] < System.currentTimeMillis()) {
						cGame.var_68bc[13][n31 + 5][6] = 10;
						final int n34 = cGame.var_6f7c & 0xFFFF;
						if ((cGame.var_6f7c >> 16 & 0xFFFF) == 0xD && n34 == n31 + 5
								&& !cGame.var_68fc[n31].sub_1b34()) {
							cGame.var_778c[n31] = true;
						} else if (!GLLib.sub_76f9() && cGame.var_778c[n31]) {
							cGame.var_778c[n31] = false;
						}
					} else {
						cGame.var_778c[n31] = true;
						cGame.var_68bc[13][n31 + 5][6] = 9;
					}
				}
				if (cGame.var_68fc[n31] != null) {
					cGame.var_68fc[n31].sub_1ca1(GLLib.s_game_frameDT);
				}
			}
			cGame.var_779c = sub_35bc4();
			for (int n35 = 0; n35 < 3; ++n35) {
				final int n36 = cGame.var_6f7c & 0xFFFF;
				if ((cGame.var_6f7c >> 16 & 0xFFFF) == 0xD && n36 == n35 + 2) {
					if (!cGame.var_7794[n35]) {
						cGame.var_7794[n35] = true;
					}
					if (n35 == 0 && cGame.var_808c >= 1) {
						if (cGame.var_779c) {
							cGame.var_68bc[13][2][6] = 6;
						} else {
							cGame.var_68bc[13][2][6] = 2;
						}
					} else if (n35 == 1 && cGame.var_808c >= 2) {
						if (cGame.var_77a4) {
							cGame.var_68bc[13][3][6] = 7;
						} else {
							cGame.var_68bc[13][3][6] = 3;
						}
					} else if (n35 == 2 && cGame.var_808c >= 3) {
						if (cGame.var_77ac) {
							cGame.var_68bc[13][4][6] = 4;
						} else {
							cGame.var_68bc[13][4][6] = 0;
						}
					}
				} else if (!GLLib.sub_76f9()) {
					if (n35 == 0 && cGame.var_808c >= 1 && cGame.var_779c && cGame.var_7794[n35]) {
						cGame.var_7794[n35] = false;
					} else if (n35 == 1 && cGame.var_808c >= 2 && cGame.var_77a4 && cGame.var_7794[n35]) {
						cGame.var_7794[n35] = false;
					} else if (n35 == 2 && cGame.var_808c >= 3 && cGame.var_77ac && cGame.var_7794[n35]) {
						cGame.var_7794[n35] = false;
					}
				}
				if (cGame.var_690c[n35] != null) {
					cGame.var_690c[n35].sub_1ca1(GLLib.s_game_frameDT);
				}
			}
			for (int n37 = 0; n37 < 6; ++n37) {
				if (cGame.var_68bc[13][n37 + 59][10] == 1 && cGame.var_68bc[13][n37 + 59][3] < -50) {
					cGame.var_68bc[13][n37 + 59][10] = 0;
					final short n38 = cGame.var_68bc[13][n37 + 5][2];
					final int n39 = cGame.var_68bc[13][n37 + 5][3] + 50;
					cGame.var_68bc[13][n37 + 59][2] = n38;
					cGame.var_68bc[13][n37 + 59][3] = (short) n39;
				}
			}
			for (int n40 = 0; n40 < 6; ++n40) {
				if (cGame.var_777c[n40] != null) {
					if (cGame.var_777c[n40].var_1705 > cGame.var_777c[n40].var_170d) {
						cGame.var_777c[n40] = null;
					} else {
						cGame.var_777c[n40].sub_87a1();
						cGame.var_777c[n40].sub_605f();
					}
				}
			}
			sub_2000c(13, 51, false);
			sub_2000c(13, 58, false);
			if (cGame.var_6c54) {
				sub_26c8e();
			}
		}
		if (n == 3) {
			sub_1dcc1(13);
			if (cGame.var_6904 != null && !cGame.var_6904.sub_1b34() && !cGame.var_7784) {
				cGame.var_6904.sub_1b7f();
			}
			for (int n41 = 0; n41 < ((cGame.var_808c - 3 < 6) ? (cGame.var_808c - 3) : 6); ++n41) {
				if (cGame.var_68fc[n41] != null && !cGame.var_68fc[n41].sub_1b34() && !cGame.var_778c[n41]) {
					cGame.var_68fc[n41].sub_1b7f();
				}
			}
			for (int m = 1; m < 10; ++m) {
				sub_1df06(Integer.toString(m) + ".", 13, (m - 1 << 1) + 20, 0, 0);
			}
			for (int n42 = 0; n42 < 3; ++n42) {
				if (cGame.var_690c[n42] != null && !cGame.var_690c[n42].sub_1b34() && !cGame.var_7794[n42]) {
					cGame.var_690c[n42].sub_1b7f();
				}
			}
			final String sub_4e1f;
			sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(301)) == null) ? "" : sub_4e1f, 13, 1, 0, 0);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(302)) == null) ? "" : sub_4e1f2, 13, 21, 0, 0);
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(303)) == null) ? "" : sub_4e1f3, 13, 23, 0, 0);
			final String sub_4e1f4;
			sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(304)) == null) ? "" : sub_4e1f4, 13, 25, 0, 0);
			final String sub_4e1f5;
			sub_1df06(((sub_4e1f5 = GLLib.TODO_sub_4e1f(305)) == null) ? "" : sub_4e1f5, 13, 27, 0, 0);
			final String sub_4e1f6;
			sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(306)) == null) ? "" : sub_4e1f6, 13, 29, 0, 0);
			final String sub_4e1f7;
			sub_1df06(((sub_4e1f7 = GLLib.TODO_sub_4e1f(307)) == null) ? "" : sub_4e1f7, 13, 31, 0, 0);
			final String sub_4e1f8;
			sub_1df06(((sub_4e1f8 = GLLib.TODO_sub_4e1f(308)) == null) ? "" : sub_4e1f8, 13, 33, 0, 0);
			final String sub_4e1f9;
			sub_1df06(((sub_4e1f9 = GLLib.TODO_sub_4e1f(309)) == null) ? "" : sub_4e1f9, 13, 35, 0, 0);
			final String sub_4e1f10;
			sub_1df06(((sub_4e1f10 = GLLib.TODO_sub_4e1f(310)) == null) ? "" : sub_4e1f10, 13, 37, 0, 0);
			for (int n43 = 0; n43 < 6; ++n43) {
				if (cGame.var_68bc[13][n43 + 45][10] == 1) {
					sub_1df06(sub_db5b((int) ((cGame.var_7774[n43] - System.currentTimeMillis()) / 1000L)), 13,
							n43 + 52, 0, 0);
				}
			}
			for (int n44 = 0; n44 < 6; ++n44) {
				if (cGame.var_777c[n44] != null) {
					cGame.var_777c[n44].sub_8d6c();
					cGame.var_777c[n44].sub_8d93();
				}
			}
		}
		return false;
	}

	private static void sub_39be7() {
		cGame.var_7774 = new long[6];
		for (int i = 0; i < 6; ++i) {
			cGame.var_7774[i] = 0L;
		}
	}

	private static boolean sub_39c33(final int n) {
		boolean b = false;
		if (cGame.var_68fc[n].sub_1b34() && cGame.var_7774[n] >= System.currentTimeMillis()) {
			for (int i = 0; i < 6; ++i) {
				if (i != n) {
					cGame.var_68bc[13][i + 45][10] = 0;
				}
			}
			if (cGame.var_68bc[13][n + 45][10] == 1) {
				cGame.var_68bc[13][n + 45][10] = 0;
			} else {
				cGame.var_68bc[13][n + 45][10] = 1;
			}
			sub_23a84(56);
		} else if (!cGame.var_68fc[n].sub_1b34() && cGame.var_7774[n] < System.currentTimeMillis()) {
			switch (n) {
			case 2:
			case 3: {
				if (sub_2dcf3(5) + Class_f.sub_59d2(2) >= sub_2df26()) {
					sub_23a84(56);
					cGame.var_7aac = 2;
					sub_8370(17);
					return false;
				}
				break;
			}
			case 4: {
				if (sub_2e954() >= cGame.var_701c * Class_f.sub_4d73(0, 1005)) {
					sub_23a84(56);
					cGame.var_7aac = 1;
					sub_8370(17);
					return false;
				}
				break;
			}
			}
			sub_23a84(61);
			cGame.var_7774[n] = System.currentTimeMillis() + 86400000L;
			cGame.var_68fc[n].SetAnim(-1, 1);
			final short n2 = cGame.var_68bc[13][n + 5][2];
			final int n3 = cGame.var_68bc[13][n + 5][3] + 50;
			int n4 = 36;
			int n5 = 0;
			final int[] array = { 0, 0, 14 };
			switch (n) {
			case 0:
			case 1:
			case 5: {
				int n6 = 36;
				switch (n) {
				case 1: {
					n6 = 59;
					break;
				}
				case 0: {
					n6 = 36;
					if (!cGame.s_iapEnabled)
						break;
				}
				case 5: {
					n6 = 6;
					break;
				}
				}
				n4 = n6;
				Class_h class_h;
				int j;
				int n7;
				int n8;
				for (class_h = Class_h.var_6a[3], j = 0; j < class_h.var_7a; ++j) {
					n7 = class_h.var_82[j][0];
					n8 = 36;
					switch (n) {
					case 0: {
						n8 = 1;
						break;
					}
					case 1: {
						n8 = 4;
						break;
					}
					case 5: {
						n8 = 8;
						break;
					}
					}
					if (n7 == n8) {
						break;
					}
				}
				final int n9 = class_h.var_82[j][13];
				if (n == 1) {
					n5 = (0x5 | n9 << 16);
					break;
				}
				n5 = n9;
				break;
			}
			case 2:
			case 3:
			case 4: {
				n4 = 59;
				final Class_h class_h2 = Class_h.var_6a[1];
				int n10 = 0;
				final int[] array2 = new int[99];
				for (int k = 0; k < class_h2.var_7a; ++k) {
					if (class_h2.var_82[k][16] != 0) {
						int n11 = 1;
						switch (n) {
						case 2: {
							n11 = 1;
							break;
						}
						case 3: {
							n11 = 2;
							break;
						}
						case 4: {
							n11 = 3;
							break;
						}
						}
						if (n11 == class_h2.var_82[k][16]) {
							array2[n10] = k;
							++n10;
						}
					}
				}
				final int sub_2b97 = GLLib.Math_Rand(0, n10 - 1);
				final int n12 = class_h2.var_82[array2[sub_2b97]][3];
				n5 = (class_h2.var_82[array2[sub_2b97]][1] - 4000 | class_h2.var_82[array2[sub_2b97]][17] << 16);
				sub_d500(1, n12, 1, 0, 24, 0, -1);
				GLLib.Pack_Open("/7");
				sub_d2e8(1, 3);
				GLLib.Pack_FullyClose();
				break;
			}
			}
			(cGame.var_777c[n] = Class_f.sub_92ea(47, 2, array)).sub_8c4c(cGame.var_800c.var_17cd + n2,
					cGame.var_800c.var_17d5 + n3, n4, 1000, true, n5);
			b = true;
			if (n == 1) {
				sub_49db0(cGame.var_80b4[4], 1, 7, false);
			} else if (n == 0) {
				sub_2bae9(cGame.var_80b4[1], 1, 7);
			}
			cGame.var_68bc[13][n + 5][6] = 9;
		}
		return b;
	}

	private static int sub_3a1d6() {
		int n = 0;
		for (int i = 0; i < cGame.var_77c4.length; ++i) {
			if (cGame.var_77cc[i] == 1) {
				++n;
			}
		}
		return n;
	}

	private static boolean sub_3a230(int n) {
		final Class_h class_h = Class_h.var_6a[3];
		int n2 = 0;
		if (n == 0) {
			n2 = 2;
		} else if (n == 1) {
			n2 = 0;
		} else if (n == 2) {
			n2 = 3;
		} else if (n == 3) {
			n2 = 1;
		} else if (n == 4) {
			n2 = 4;
		} else if (n == 5) {
			n2 = 5;
		} else if (n == 6) {
			n2 = 6;
		} else if (n == 7) {
			n2 = 7;
		} else if (n == 8) {
			n2 = 8;
		}
		cGame.var_77e4 = class_h.var_82[n2][6];
		cGame.var_77d4 = class_h.var_82[n2][2];
		n = class_h.var_82[n2][34];
		final String sub_4e1f;
		cGame.var_784c = (((sub_4e1f = GLLib.TODO_sub_4e1f(268 + cGame.var_808c)) == null) ? "" : sub_4e1f);
		return cGame.var_6d5c[n];
	}

	private static boolean sub_3a383() {
		return cGame.var_77e4 <= sub_2e0da();
	}

	private static int sub_3a3b8(final int n) {
		int n2 = 0;
		if (n == 0) {
			n2 = 0;
		} else if (n == 1) {
			n2 = 4;
		} else if (n == 2) {
			n2 = 5;
		} else if (n == 3) {
			n2 = 6;
		} else if (n == 4) {
			n2 = 7;
		} else if (n == 5) {
			n2 = 8;
		} else if (n == 6) {
			n2 = 9;
		} else if (n == 7) {
			n2 = 10;
		} else if (n == 8) {
			n2 = 11;
		}
		return n2;
	}

	private static void sub_3a485() {
		for (Class_f var_17ad = Class_f.var_157d[0]; var_17ad != null; var_17ad = var_17ad.var_17ad) {
			if (var_17ad.var_17c5 == 50) {
				final int n = cGame.var_808c + 1;
				switch (var_17ad.var_1835) {
				case 2: {
					if (n < 1) {
						sub_2000c(14, 62, false);
						break;
					}
					sub_2000c(14, 62, true);
					break;
				}
				case 0: {
					if (n < 2) {
						sub_2000c(14, 60, false);
						break;
					}
					sub_2000c(14, 60, true);
					break;
				}
				case 3: {
					if (n < 3) {
						sub_2000c(14, 65, false);
						break;
					}
					sub_2000c(14, 65, true);
					break;
				}
				case 1: {
					if (n < 4) {
						cGame.var_68bc[14][61][5] = 1128;
						cGame.var_68bc[14][61][6] = 1;
						break;
					}
					cGame.var_68bc[14][61][5] = 1130;
					cGame.var_68bc[14][61][6] = 0;
					break;
				}
				case 4: {
					if (n < 5) {
						sub_2000c(14, 63, false);
						break;
					}
					sub_2000c(14, 63, true);
					break;
				}
				case 5: {
					if (n < 6) {
						sub_2000c(14, 59, false);
						break;
					}
					sub_2000c(14, 59, true);
					break;
				}
				case 6: {
					if (n < 7) {
						sub_2000c(14, 64, false);
						break;
					}
					sub_2000c(14, 64, true);
					break;
				}
				case 7: {
					if (n < 8) {
						cGame.var_68bc[14][57][5] = 1128;
						cGame.var_68bc[14][57][6] = 2;
						break;
					}
					cGame.var_68bc[14][57][5] = 1136;
					cGame.var_68bc[14][57][6] = 0;
					break;
				}
				case 8: {
					if (n < 9) {
						sub_2000c(14, 58, false);
						break;
					}
					sub_2000c(14, 58, true);
					break;
				}
				}
			}
		}
	}

	private static void sub_3a73b(final short var_77f4) {
		cGame.var_77f4 = var_77f4;
		if (var_77f4 == 1) {
			sub_2000c(14, 3, true);
			sub_2000c(14, 6, true);
			sub_2000c(14, 8, false);
			sub_2000c(14, 10, true);
			sub_2000c(14, 13, true);
			sub_2000c(14, 14, false);
			sub_2000c(14, 15, false);
			sub_2000c(14, 18, false);
			sub_2024d(14, 18, false);
			sub_2000c(14, 47, false);
			sub_2024d(14, 47, false);
		} else if (var_77f4 == 2) {
			sub_2000c(14, 3, false);
			sub_2000c(14, 6, false);
			sub_2000c(14, 7, false);
			sub_2000c(14, 8, false);
			sub_2000c(14, 9, false);
			sub_2000c(14, 10, false);
			sub_2024d(14, 10, false);
			sub_2000c(14, 13, false);
			sub_2000c(14, 14, true);
			sub_2000c(14, 15, true);
			sub_2000c(14, 18, true);
			sub_2024d(14, 18, true);
			sub_2000c(14, 47, false);
			sub_2024d(14, 47, false);
			sub_2000c(14, 19, true);
			sub_2000c(14, 76, false);
			sub_3a966(false);
			sub_2000c(14, 67, false);
			sub_2024d(14, 67, false);
		} else if (var_77f4 == 3) {
			sub_2000c(14, 3, false);
			sub_2000c(14, 6, false);
			sub_2000c(14, 7, false);
			sub_2000c(14, 8, false);
			sub_2000c(14, 9, false);
			sub_2000c(14, 10, false);
			sub_2024d(14, 10, false);
			sub_2000c(14, 13, false);
			sub_2000c(14, 14, true);
			sub_2000c(14, 15, true);
			sub_2000c(14, 18, true);
			sub_2024d(14, 18, true);
			sub_2000c(14, 47, false);
			sub_2024d(14, 47, false);
			sub_2000c(14, 19, true);
			sub_2000c(14, 76, false);
			sub_3a966(false);
			sub_2000c(14, 67, false);
			sub_2024d(14, 67, false);
		}
		if (var_77f4 == 2 || var_77f4 == 3) {
			sub_2000c(14, 22, false);
			sub_2024d(14, 22, false);
			for (int i = 0; i < 6; ++i) {
				sub_2000c(14, 23 + (i << 2), false);
				sub_2024d(14, 23 + (i << 2), false);
			}
		}
		sub_2c69b();
		sub_1fb8e(14);
	}

	private static void sub_3a966(final boolean var_7814) {
		sub_2000c(14, 68, var_7814);
		sub_2000c(14, 69, var_7814);
		sub_2000c(14, 66, var_7814);
		cGame.var_7814 = var_7814;
		sub_2000c(14, 67, true);
		sub_2024d(14, 67, true);
		if (cGame.var_808c < 3) {
			sub_2000c(14, 68, false);
		}
		if (cGame.var_782c > 0) {
			sub_2000c(14, 70, var_7814);
		} else {
			sub_2000c(14, 70, false);
		}
		sub_1f8c5(14);
	}

	private static boolean sub_3a9f7(int n) {
		if (n == 0) {
			cGame.var_774c = sub_237d7(10, 0, 1, 7, 20, 54) + 10;
			sub_1daf4(10);
			sub_2000c(10, 63, false);
			sub_2000c(10, 3, false);
			sub_2000c(10, 6, false);
			sub_2000c(10, 9, false);
			sub_2000c(10, 4, false);
			sub_2000c(10, 7, false);
			sub_2000c(10, 10, false);
			sub_2000c(10, 5, false);
			sub_2000c(10, 8, false);
			sub_2000c(10, 11, false);
			sub_2000c(10, 57, false);
			sub_2000c(10, 58, false);
			sub_2000c(10, 59, false);
			sub_2000c(10, 60, false);
			sub_2000c(10, 61, false);
			sub_2000c(10, 62, false);
			sub_2000c(10, 63, false);
			final String sub_4e1f;
			cGame.var_68cc[10][66] = (((sub_4e1f = GLLib.TODO_sub_4e1f(175)) == null) ? "" : sub_4e1f);
			sub_2c69b();
			sub_1fb8e(10);
			cGame.var_7874 = new int[117];
			cGame.var_787c = new int[117];
			cGame.var_7884 = new int[117];
			cGame.var_788c = new short[117];
			cGame.var_7894 = new short[117];
			cGame.var_789c = new short[117];
			cGame.var_78a4 = new short[117];
			cGame.var_78ac = new short[117];
			cGame.var_78b4 = new byte[117];
			cGame.var_68ac = 100;
			sub_3ae52(1);
			cGame.var_68bc[10][19][5] = 1138;
			cGame.var_68bc[10][19][6] = 12;
			cGame.var_68bc[10][26][5] = 1138;
			cGame.var_68bc[10][26][6] = 12;
			cGame.var_68bc[10][33][5] = 1138;
			cGame.var_68bc[10][33][6] = 12;
			cGame.var_68bc[10][40][5] = 1138;
			cGame.var_68bc[10][40][6] = 12;
			cGame.var_68bc[10][47][5] = 1138;
			cGame.var_68bc[10][47][6] = 12;
			cGame.var_68bc[10][54][5] = 1138;
			cGame.var_68bc[10][54][6] = 12;
			cGame.var_76cc = sub_30161(sub_2df26());
			cGame.var_76c4 = sub_2dcf3(5);
			cGame.var_78bc = false;
		}
		if (n == 5) {
			cGame.var_7874 = null;
			cGame.var_787c = null;
			cGame.var_7884 = null;
			cGame.var_788c = null;
			cGame.var_7894 = null;
			cGame.var_789c = null;
			cGame.var_78a4 = null;
			cGame.var_78ac = null;
			cGame.var_78b4 = null;
			sub_d7d7(1);
			if (cGame.var_78bc) {
				sub_4014a(756 + cGame.var_7bb4, cGame.var_7b5c[cGame.var_7bb4],
						cGame.var_7b64[cGame.var_7bb4]);
			}
			sub_239ef(10);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_18688();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_774c && cGame.var_786c < cGame.var_78c4 - 6) {
					sub_3b120(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_786c > 0) {
					sub_3b120(-1);
				}
			}
			sub_d841(1);
		}
		if (n == 3) {
			sub_1dcc1(10);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(171)) == null) ? "" : sub_4e1f2, 10, 1, 0, 0);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[10][12][5]].sub_3882(cGame.var_68bc[10][12][6], 0, array, 0);
			final int n2 = cGame.var_68bc[10][12][2] + array[0];
			final int n3 = cGame.var_68bc[10][12][3] + array[1];
			final int n4 = array[2];
			final int n5 = array[3];
			final int n6 = n4;
			final int n7 = n3;
			n = n2;
			GLLib.sub_36f4(GLLib.g, n, n7, n6, n5, true);
			n = ((cGame.var_78c4 - cGame.var_786c >= 6) ? 6 : (cGame.var_78c4 - cGame.var_786c));
			for (int i = 0; i < n; ++i) {
				final String sub_4e1f3;
				sub_1e2f2(((sub_4e1f3 = GLLib.TODO_sub_4e1f(cGame.var_7874[cGame.var_786c + i])) == null) ? ""
						: sub_4e1f3, 10, 14 + i * 7, 0, 0);
				sub_1df06("x" + cGame.var_78a4[cGame.var_786c + i], 10, 16 + i * 7, 0, 0);
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_3ae52(final int n) {
		int n2 = 0;
		cGame.var_786c = 0;
		cGame.var_78c4 = 0;
		for (int i = 0; i < 5; ++i) {
			if ((n >> i & 0x1) != 0x0) {
				final int n3 = i;
				Class_h class_h = null;
				switch (n3) {
				case 0: {
					class_h = Class_h.var_6a[1];
					break;
				}
				case 1: {
					class_h = Class_h.var_6a[3];
					break;
				}
				}
				for (int j = 0; j < class_h.var_7a; ++j) {
					if (sub_2e024(n3, j) > 0) {
						cGame.var_787c[cGame.var_78c4] = j;
						cGame.var_7884[cGame.var_78c4] = n3;
						cGame.var_7874[cGame.var_78c4] = class_h.var_82[j][2];
						cGame.var_788c[cGame.var_78c4] = (short) class_h.var_82[j][3];
						cGame.var_7894[cGame.var_78c4] = (short) class_h.var_82[j][4];
						cGame.var_789c[cGame.var_78c4] = (short) class_h.var_82[j][11];
						cGame.var_78ac[cGame.var_78c4] = (short) class_h.var_82[j][1];
						cGame.var_78a4[cGame.var_78c4] = (short) sub_2e024(n3, j);
						cGame.var_78b4[cGame.var_78c4] = (byte) class_h.var_82[j][9];
						++cGame.var_78c4;
						if (n2 < 6) {
							sub_3b009(n2, true);
							++n2;
						}
					}
				}
			}
		}
		for (int k = n2; k < 6; ++k) {
			sub_3b009(k, false);
		}
		sub_2c69b();
		sub_1fb8e(10);
	}

	private static void sub_3b009(final int n, final boolean b) {
		int n4;
		int n3;
		for (int n2 = (n3 = (n4 = n * 7) + 13) + 7, i = n3; i < n2; ++i) {
			sub_2000c(10, i, b);
		}
		sub_2000c(10, n4 + 17, false);
		if (b) {
			final int n5 = n4 + 18;
			cGame.var_68bc[10][n5][5] = cGame.var_788c[cGame.var_786c + n];
			cGame.var_68bc[10][n5][6] = cGame.var_7894[cGame.var_786c + n];
			sub_d78c(1, cGame.var_68bc[10][n5][5]);
			cGame.var_68bc[10][n3][18] = 1;
			sub_2000c(10, n4 + 19, cGame.var_78b4[cGame.var_786c + n] > 0);
			return;
		}
		sub_2000c(10, n3, false);
		sub_2024d(10, n3, false);
		sub_2000c(10, n4 + 19, false);
	}

	private static void sub_3b120(final int n) {
		cGame.var_786c += n;
		final int n2 = cGame.var_6914[0][8];
		int n3;
		int i;
		for (n3 = ((cGame.var_78c4 - cGame.var_786c >= 6) ? 6
				: (cGame.var_78c4 - cGame.var_786c)), i = 0; i < n3; ++i) {
			sub_3b009(i, true);
		}
		while (i < 6) {
			sub_3b009(i, false);
			++i;
		}
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[10][20][2] - cGame.var_68bc[10][13][2]) * n;
		sub_22d97(0);
	}

	private static void sub_3b1e6(final int n) {
		sub_23a84(48);
		switch (cGame.var_7884[n + cGame.var_786c]) {
		case 0:
		case 1: {
			sub_2e06e(cGame.var_7884[n + cGame.var_786c], cGame.var_787c[n + cGame.var_786c], -1);
			break;
		}
		}
		cGame.var_6e34[cGame.var_7bb4][4] = System.currentTimeMillis() / 1000L;
		final int[] array = cGame.var_6e24[cGame.var_7bb4];
		final int n2 = 2;
		array[n2] |= 0x1;
		sub_2b10b(cGame.var_7bb4,
				cGame.var_789c[n + cGame.var_786c]
						* Class_h.var_6a[24].var_82[cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[25]][3]
						/ getLevel());
		final int n3;
		sub_49db0(n3 = cGame.var_80bc[0] + cGame.var_7bb4, 1, 28, false);
		sub_49db0(cGame.var_78ac[n + cGame.var_786c], 1, 26, false);
		sub_2bae9(n3, 1, 28);
		sub_4014a(756 + cGame.var_7bb4, cGame.var_7b5c[cGame.var_7bb4], cGame.var_7b64[cGame.var_7bb4]);
		cGame.var_78bc = true;
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static boolean sub_3b305(int n) {
		if (n == 0) {
			cGame.var_774c = sub_237d7(10, 0, 1, 7, 20, 54) + 10;
			sub_1daf4(10);
			sub_2000c(10, 63, false);
			sub_2000c(10, 3, false);
			sub_2000c(10, 6, false);
			sub_2000c(10, 9, false);
			sub_2000c(10, 4, false);
			sub_2000c(10, 7, false);
			sub_2000c(10, 10, false);
			sub_2000c(10, 5, false);
			sub_2000c(10, 8, false);
			sub_2000c(10, 11, false);
			sub_2000c(10, 57, false);
			sub_2000c(10, 58, false);
			sub_2000c(10, 59, false);
			sub_2000c(10, 60, false);
			sub_2000c(10, 61, false);
			sub_2000c(10, 62, false);
			sub_2000c(10, 63, false);
			cGame.var_68cc[10][66] = "";
			sub_2c69b();
			sub_1fb8e(10);
			cGame.var_78d4 = new int[117];
			cGame.var_78dc = new int[117];
			cGame.var_78e4 = new int[117];
			cGame.var_78ec = new short[117];
			cGame.var_78f4 = new short[117];
			cGame.var_78fc = new short[117];
			cGame.var_7904 = new short[117];
			cGame.var_68bc[10][19][5] = 1138;
			cGame.var_68bc[10][19][6] = 12;
			cGame.var_68bc[10][26][5] = 1138;
			cGame.var_68bc[10][26][6] = 12;
			cGame.var_68bc[10][33][5] = 1138;
			cGame.var_68bc[10][33][6] = 12;
			cGame.var_68bc[10][40][5] = 1138;
			cGame.var_68bc[10][40][6] = 12;
			cGame.var_68bc[10][47][5] = 1138;
			cGame.var_68bc[10][47][6] = 12;
			cGame.var_68bc[10][54][5] = 1138;
			cGame.var_68bc[10][54][6] = 12;
			sub_2000c(10, 19, false);
			sub_2000c(10, 26, false);
			sub_2000c(10, 33, false);
			sub_2000c(10, 40, false);
			sub_2000c(10, 47, false);
			sub_2000c(10, 54, false);
			cGame.var_68ac = 100;
			sub_3b70c(1);
			cGame.var_7914 = false;
		}
		if (n == 5) {
			cGame.var_78d4 = null;
			cGame.var_78dc = null;
			cGame.var_78e4 = null;
			cGame.var_78ec = null;
			cGame.var_78f4 = null;
			cGame.var_78fc = null;
			cGame.var_7904 = null;
			sub_d7d7(1);
			if (cGame.var_7914) {
				sub_4014a(166, 7, 0);
			}
			sub_239ef(10);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_18688();
			}
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_774c && cGame.var_78cc < cGame.var_790c - 6) {
					sub_3b90d(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_78cc > 0) {
					sub_3b90d(-1);
				}
			}
			sub_d841(1);
		}
		if (n == 3) {
			sub_1dcc1(10);
			final String sub_4e1f;
			sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(162)) == null) ? "" : sub_4e1f, 10, 1, 0, 0);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[10][12][5]].sub_3882(cGame.var_68bc[10][12][6], 0, array, 0);
			final int n2 = cGame.var_68bc[10][12][2] + array[0];
			final int n3 = cGame.var_68bc[10][12][3] + array[1];
			final int n4 = array[2];
			final int n5 = array[3];
			final int n6 = n4;
			final int n7 = n3;
			n = n2;
			GLLib.sub_36f4(GLLib.g, n, n7, n6, n5, true);
			n = ((cGame.var_790c - cGame.var_78cc >= 6) ? 6 : (cGame.var_790c - cGame.var_78cc));
			for (int i = 0; i < n; ++i) {
				final String sub_4e1f2;
				sub_1e2f2(((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_78d4[cGame.var_78cc + i])) == null) ? ""
						: sub_4e1f2, 10, 14 + i * 7, 0, 0);
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_3b70c(int i) {
		int n = 0;
		cGame.var_78cc = 0;
		cGame.var_790c = 0;
		if ((i & 0x1) != 0x0) {
			final Class_h class_h = Class_h.var_6a[1];
			for (int j = 0; j < 117; ++j) {
				if (class_h.var_82[j][14] > 0 && class_h.var_82[j][11] <= getLevel()) {
					cGame.var_78dc[cGame.var_790c] = j;
					cGame.var_78e4[cGame.var_790c] = 0;
					cGame.var_78d4[cGame.var_790c] = class_h.var_82[j][2];
					cGame.var_78ec[cGame.var_790c] = (short) class_h.var_82[j][3];
					cGame.var_78f4[cGame.var_790c] = (short) class_h.var_82[j][4];
					cGame.var_78fc[cGame.var_790c] = (short) class_h.var_82[j][11];
					cGame.var_7904[cGame.var_790c] = (short) class_h.var_82[j][1];
					++cGame.var_790c;
					if (n < 6) {
						sub_3b82d(n, true);
						++n;
					}
				}
			}
		}
		for (i = n; i < 6; ++i) {
			sub_3b82d(i, false);
		}
		sub_2c69b();
		sub_1fb8e(10);
	}

	private static void sub_3b82d(final int n, final boolean b) {
		int n4;
		int n3;
		for (int n2 = (n3 = (n4 = n * 7) + 13) + 7, i = n3; i < n2; ++i) {
			sub_2000c(10, i, b);
		}
		sub_2000c(10, n4 + 19, false);
		if (b) {
			final int n5 = n4 + 18;
			cGame.var_68bc[10][n5][5] = cGame.var_78ec[cGame.var_78cc + n];
			cGame.var_68bc[10][n5][6] = cGame.var_78f4[cGame.var_78cc + n];
			sub_d78c(1, cGame.var_68bc[10][n5][5]);
			cGame.var_68bc[10][n3][18] = 1;
			return;
		}
		cGame.var_68bc[10][n3][10] = 1;
		cGame.var_68bc[10][n3][18] = 0;
	}

	private static void sub_3b90d(final int n) {
		cGame.var_78cc += n;
		final int n2 = cGame.var_6914[0][8];
		int n3;
		int i;
		for (n3 = ((cGame.var_790c - cGame.var_78cc >= 6) ? 6
				: (cGame.var_790c - cGame.var_78cc)), i = 0; i < n3; ++i) {
			sub_3b82d(i, true);
		}
		while (i < 6) {
			sub_3b82d(i, false);
			++i;
		}
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[10][20][2] - cGame.var_68bc[10][13][2]) * n;
		sub_22d97(0);
	}

	private static void sub_3b9d3(final int n) {
		sub_23a84(48);
		if (cGame.var_7b6c[cGame.var_7bb4] * cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[24] >= GLLib
				.Math_Rand(0, 100)) {
			switch (cGame.var_78e4[n + cGame.var_78cc]) {
			case 0: {
				cGame.var_6e24[cGame.var_7bb4][4] = cGame.var_78dc[n + cGame.var_78cc];
				break;
			}
			}
		} else {
			cGame.var_7aac = 11;
		}
		cGame.var_6e34[cGame.var_7bb4][1] = System.currentTimeMillis() / 1000L;
		cGame.var_7914 = true;
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static boolean sub_3ba87(int n) {
		if (n == 0) {
			sub_23d73();
			cGame.var_6a6c = 0L;
			try {
				Thread.sleep(200L);
			} catch (final Exception ex) {
			}
			sub_23a84(12);
		}
		if (n == 1) {
			playSound(0, 34, false);
			cGame.var_792c = (cGame.var_792c = cGame.var_68bc[12][12][2] - cGame.var_68bc[12][10][2]) + 10;
			cGame.var_68ac = 100;
			cGame.var_7934 = 0;
			cGame.var_793c = new int[100];
			cGame.var_7944 = new int[100];
			cGame.var_794c = new int[100];
			cGame.var_7924 = 0;
			final Class_h class_h;
			final int var_7a = (class_h = Class_h.var_6a[10]).var_7a;
			int var_7954 = 0;
			if (cGame.var_795c > 0) {
				cGame.var_793c[0] = 1006;
				cGame.var_7944[0] = 0;
				cGame.var_794c[0] = 0;
				++var_7954;
			}
			for (int i = 0; i < var_7a; ++i) {
				final int n2 = class_h.var_82[i][1];
				final int n3 = class_h.var_82[i][2];
				final short n4 = (short) class_h.var_82[i][3];
				final short n5 = (short) class_h.var_82[i][4];
				final short n6 = (short) class_h.var_82[i][5];
				if (n3 == getLevel() && var_7954 < 100 && n2 != 3 && n2 != 7) {
					cGame.var_793c[var_7954] = n4;
					cGame.var_7944[var_7954] = n5;
					cGame.var_794c[var_7954] = n6;
					++var_7954;
				}
			}
			cGame.var_7954 = var_7954;
			for (int j = 0; j < 6; ++j) {
				cGame.var_68bc[12][11 + (j << 1)][19] = 0;
				cGame.var_68bc[12][10 + (j << 1)][19] = 0;
				cGame.var_68bc[12][11 + (j << 1)][10] = 1;
				cGame.var_68bc[12][10 + (j << 1)][10] = 1;
			}
			for (int k = var_7954; k < 6; ++k) {
				cGame.var_68bc[12][11 + (k << 1)][19] = -1;
				cGame.var_68bc[12][10 + (k << 1)][19] = -1;
				cGame.var_68bc[12][11 + (k << 1)][10] = 0;
				cGame.var_68bc[12][10 + (k << 1)][10] = 0;
			}
			sub_3c1a3();
			if (cGame.var_7fd4 == -1) {
				sub_2000c(12, 33, false);
			} else {
				sub_2000c(12, 33, true);
			}
			sub_2c69b();
			sub_1fb8e(12);
			cGame.var_791c = Class_f.sub_904a(4);
			sub_3de31();
		}
		if (n == 5) {
			sub_d7d7(1);
			cGame.var_793c = null;
			cGame.var_7944 = null;
			cGame.var_794c = null;
			cGame.var_791c = null;
			cGame.var_7954 = 0;
			cGame.var_7934 = 0;
			Class_f.sub_904a(2);
			sub_239ef(12);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				if (cGame.var_7fd4 == -1) {
					sub_18fea();
				} else {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				}
			}
			sub_d841(1);
			cGame.var_791c.sub_8ed0();
			if (cGame.var_791c.var_189d != null) {
				cGame.var_791c.var_189d.sub_1ca1(GLLib.s_game_frameDT);
			}
			cGame.var_7924 += GLLib.s_game_frameDT;
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][8] < -cGame.var_792c && cGame.var_7934 < cGame.var_7954 - 6) {
					sub_3c13f(1);
				} else if (cGame.var_6914[0][8] > -10 && cGame.var_7934 > 0) {
					sub_3c13f(-1);
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(12);
			final String sub_4e1f2;
			final String sub_4e1f3;
			String s = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(518)) == null) ? "" : sub_4e1f2) + " " + getLevel()
					+ (((sub_4e1f3 = GLLib.TODO_sub_4e1f(517)) == null) ? "" : sub_4e1f3);
			if (cGame.var_7fe4 == 11) {
				final String sub_4e1f4;
				final String sub_4e1f5;
				s = getLevel() + (((sub_4e1f4 = GLLib.TODO_sub_4e1f(518)) == null) ? "" : sub_4e1f4)
						+ (((sub_4e1f5 = GLLib.TODO_sub_4e1f(517)) == null) ? "" : sub_4e1f5);
			}
			sub_1df06(s, 12, 23, 0, 0);
			final String sub_4e1f6;
			sub_1e2f2(((sub_4e1f6 = GLLib.TODO_sub_4e1f(519)) == null) ? "" : sub_4e1f6, 12, 24, 0, 0);
			final String sub_4e1f7;
			sub_1e2f2(((sub_4e1f7 = GLLib.TODO_sub_4e1f(522)) == null) ? "" : sub_4e1f7, 12, 26, 0, 0);
			final String sub_4e1f8;
			sub_1e2f2(((sub_4e1f8 = GLLib.TODO_sub_4e1f(516)) == null) ? "" : sub_4e1f8, 12, 25, 0, 0);
			final String sub_4e1f9;
			sub_1e2f2(((sub_4e1f9 = GLLib.TODO_sub_4e1f(523 + (getLevel() - 2))) == null) ? "" : sub_4e1f9, 12, 27, 0, 0);
			if (cGame.var_7934 == 0 && cGame.var_795c > 0) {
				final int[] array = new int[4];
				cGame.var_68d4[cGame.var_68bc[12][8][5]].sub_3882(cGame.var_68bc[12][8][6], 0, array, 0);
				final int n7 = cGame.var_68bc[12][8][2] + array[0];
				final int n8 = cGame.var_68bc[12][8][3] + array[1];
				final int n9 = array[2];
				final int n10 = array[3];
				final int n11 = n9;
				final int n12 = n8;
				n = n7;
				GLLib.sub_36f4(GLLib.g, n, n12, n11, n10, true);
				sub_1df06("+" + cGame.var_795c, 12, 9, 0, 0);
				final int var_1ddf = GLLib.s_screenWidth;
				final int var_1de7 = GLLib.s_screenHeight;
				n = var_1ddf;
				GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
			}
			cGame.var_791c.sub_8e7d();
		}
		return false;
	}

	private static void sub_3c13f(final int n) {
		cGame.var_7934 += n;
		final int n2 = cGame.var_6914[0][8];
		sub_3c1a3();
		sub_2c69b();
		sub_1fb8e(12);
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[12][12][2] - cGame.var_68bc[12][10][2]) * n;
		sub_22d97(0);
		sub_22d97(1);
	}

	private static void sub_3c1a3() {
		for (int i = 0; i < 6; ++i) {
			cGame.var_68bc[12][11 + (i << 1)][5] = 20;
			cGame.var_68bc[12][11 + (i << 1)][6] = 136;
		}
		for (int j = 0; j < 6; ++j) {
			final short n = (short) cGame.var_793c[cGame.var_7934 + j];
			final short n2 = (short) cGame.var_7944[cGame.var_7934 + j];
			final short n3 = (short) cGame.var_794c[cGame.var_7934 + j];
			if (n > 0) {
				if (n < 127 || n > 137) {
					sub_d78c(1, n);
				}
				cGame.var_68bc[12][11 + (j << 1)][5] = n;
				cGame.var_68bc[12][11 + (j << 1)][6] = n2;
				cGame.var_68bc[12][11 + (j << 1)][8] = n3;
			}
		}
	}

	private static boolean sub_3c2a9(int n) {
		if (n == 0) {
			sub_23d73();
			sub_23a84(60);
			final String appProperty;
			cGame.var_796c = ((appProperty = GloftGF2M.s_instance.getAppProperty("Has-Push-Notification")) != null
					&& appProperty.indexOf("0") == -1);
			cGame.var_7964 = (cGame.var_7964 && cGame.var_796c);
			sub_1daf4(15);
			sub_1b5e6();
			sub_1b6c1();
			sub_1b797();
			cGame.var_69cc = true;
			sub_1b80a();
			sub_1b45d();
		}
		if (n == 1) {
			cGame.var_79bc = 1;
			sub_2c69b();
			sub_1fb8e(15);
		}
		if (n == 5) {
			sub_239ef(15);
			sub_1b5e6();
			sub_1b6c1();
			sub_1b797();
			sub_1b80a();
		}
		if (n == 8 && !cGame.var_69bc && cGame.var_69b4) {
			if (GLLib.sub_76c6() || GLLib.sub_7693() || cGame.var_799c) {
				final int var_2037 = GLLib.s_screenX;
				final int var_203f = GLLib.s_screenY;
				final short n2 = cGame.var_68bc[15][59][2];
				final short n3 = cGame.var_68bc[15][59][3];
				final short n4 = cGame.var_68bc[15][59][5];
				final short n5 = cGame.var_68bc[15][59][6];
				if (sub_2c577(var_2037, var_203f, n2, n3, n4, n5)) {
					if (!cGame.var_799c) {
						cGame.var_79a4 = var_203f;
					}
					cGame.var_799c = true;
					if (cGame.var_79cc >= n5) {
						final boolean b = (cGame.var_79c4 += var_203f - cGame.var_79a4) > cGame.var_79cc / 2
								- n5 / 2;
						final boolean b2 = cGame.var_79c4 < -cGame.var_79cc / 2;
						if (b) {
							cGame.var_79c4 = cGame.var_79cc / 2 - n5 / 2;
						} else if (b2) {
							cGame.var_79c4 = -cGame.var_79cc / 2;
						}
					}
					cGame.var_79a4 = var_203f;
				}
			}
			if (GLLib.sub_762d()) {
				cGame.var_799c = false;
			}
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19) {
				if (cGame.var_69ac) {
					sub_1a2dc();
				} else if (cGame.var_69b4) {
					sub_1a593();
				} else if (cGame.var_69c4) {
					sub_1a62a();
				} else if (cGame.var_69bc) {
					sub_1a66e();
				} else {
					sub_19f9b();
				}
			} else if (sub_2b09 == 24 && !cGame.var_69ac && !cGame.var_69b4 && !cGame.var_69c4
					&& !cGame.var_69bc) {
				sub_19f9b();
			}
			if (cGame.var_69ac) {
				if (!GLLib.sub_76f9()) {
					--cGame.var_79ac;
				}
				if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
					if (cGame.var_6914[0][9] < -60) {
						sub_3ce88(1);
					} else if (cGame.var_6914[0][9] > -10) {
						sub_3ce88(-1);
					}
				}
				if (cGame.var_79ac < -cGame.var_79e4) {
					cGame.var_79ac = cGame.var_79dc;
				} else if (cGame.var_79ac > cGame.var_79e4 + 60) {
					cGame.var_79ac = cGame.var_79e4 + 60;
				}
			}
			if (cGame.var_69ac && cGame.var_797c) {
				cGame.var_797c = false;
				try {
					Thread.sleep(200L);
				} catch (final Exception ex) {
				}
				sub_23ac1(13, true);
			}
		}
		if (n == 3) {
			sub_1dcc1(15);
			if (cGame.var_69a4) {
				final String sub_4e1f;
				sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(63)) == null) ? "" : sub_4e1f, 15, 1, 0, 0);
				final String sub_4e1f2;
				sub_1e2f2(((sub_4e1f2 = GLLib.TODO_sub_4e1f(65)) == null) ? "" : sub_4e1f2, 15, 5, 0, 0);
				final String sub_4e1f3;
				sub_1e2f2(((sub_4e1f3 = GLLib.TODO_sub_4e1f(68)) == null) ? "" : sub_4e1f3, 15, 8, 0, 0);
				final String sub_4e1f4;
				sub_1e2f2(((sub_4e1f4 = GLLib.TODO_sub_4e1f(67)) == null) ? "" : sub_4e1f4, 15, 10, 0, 0);
				final String sub_4e1f5;
				sub_1e2f2(((sub_4e1f5 = GLLib.TODO_sub_4e1f(72)) == null) ? "" : sub_4e1f5, 15, 14, 0, 0);
			}
			if (cGame.var_69b4) {
				int n6;
				if ((n6 = 10240 + (cGame.var_79bc - 1 << 1)) == 10244) {
					n6 = 10272;
				}
				int n7;
				if ((n7 = 10241 + (cGame.var_79bc - 1 << 1)) == 10245) {
					n7 = 10273;
				}
				final String sub_4e1f6;
				sub_1e2f2(((sub_4e1f6 = GLLib.TODO_sub_4e1f(80)) == null) ? "" : sub_4e1f6, 15, 50, 0, 0);
				final String sub_4e1f7;
				sub_1e2f2(((sub_4e1f7 = GLLib.TODO_sub_4e1f(35)) == null) ? "" : sub_4e1f7, 15, 49, 0, 0);
				final String sub_4e1f8;
				sub_1e2f2(((sub_4e1f8 = GLLib.TODO_sub_4e1f(n6)) == null) ? "" : sub_4e1f8, 15, 56, 0, 0);
				final String sub_4e1f9;
				sub_1e2f2(((sub_4e1f9 = GLLib.TODO_sub_4e1f(454)) == null) ? "" : sub_4e1f9, 15, 57, 0, 0);
				final String sub_4e1f10;
				sub_1e2f2(((sub_4e1f10 = GLLib.TODO_sub_4e1f(455)) == null) ? "" : sub_4e1f10, 15, 58, 0, 0);
				final int n8 = cGame.var_68bc[15][59][2];
				final short n9 = cGame.var_68bc[15][59][3];
				final short n10 = cGame.var_68bc[15][59][5];
				final short n11 = cGame.var_68bc[15][59][6];
				final short n12 = n10;
				final short n13 = n9;
				n = n8;
				GLLib.sub_36f4(GLLib.g, n, n13, n12, n11, true);
				final String sub_4e1f11;
				sub_1e2f2(((sub_4e1f11 = GLLib.TODO_sub_4e1f(n7)) == null) ? "" : sub_4e1f11, 15, 59, 0, cGame.var_79c4);
				final int var_1ddf = GLLib.s_screenWidth;
				final int var_1de7 = GLLib.s_screenHeight;
				n = var_1ddf;
				GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
			}
			if (cGame.var_69ac) {
				final String sub_4e1f12;
				sub_1e2f2(((sub_4e1f12 = GLLib.TODO_sub_4e1f(75)) == null) ? "" : sub_4e1f12, 15, 19, 0, 0);
				final int n14 = cGame.var_68bc[15][20][2];
				final short n15 = cGame.var_68bc[15][20][3];
				final int n16 = cGame.var_68bc[15][21][5] + 50;
				final short n17 = cGame.var_68bc[15][21][6];
				final int n18 = n16;
				final short n19 = n15;
				n = n14;
				GLLib.sub_36f4(GLLib.g, n, n19, n18, n17, true);
				sub_1e2f2(cGame.var_79d4, 15, 21, 0, cGame.var_79ac);
				final int var_1ddf2 = GLLib.s_screenWidth;
				final int var_1de8 = GLLib.s_screenHeight;
				n = var_1ddf2;
				GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de8, true);
			}
			if (cGame.var_69c4) {
				final String sub_4e1f13;
				sub_1e2f2(((sub_4e1f13 = GLLib.TODO_sub_4e1f(65)) == null) ? "" : sub_4e1f13, 15, 23, 0, 0);
				final String sub_4e1f14;
				sub_1e2f2(((sub_4e1f14 = GLLib.TODO_sub_4e1f(75)) == null) ? "" : sub_4e1f14, 15, 35, 0, 0);
				final String sub_4e1f15;
				sub_1e2f2(((sub_4e1f15 = GLLib.TODO_sub_4e1f(66)) == null) ? "" : sub_4e1f15, 15, 25, 0, 0);
				final String sub_4e1f16;
				sub_1e2f2(((sub_4e1f16 = GLLib.TODO_sub_4e1f(80)) == null) ? "" : sub_4e1f16, 15, 27, 0, 0);
				final String sub_4e1f17;
				sub_1e2f2(((sub_4e1f17 = GLLib.TODO_sub_4e1f(76)) == null) ? "" : sub_4e1f17, 15, 29, 0, 0);
			}
			if (cGame.var_69bc) {
				final String sub_4e1f18;
				sub_1e2f2(((sub_4e1f18 = GLLib.TODO_sub_4e1f(66)) == null) ? "" : sub_4e1f18, 15, 39, 0, 0);
				final String sub_4e1f19;
				sub_1e2f2(((sub_4e1f19 = GLLib.TODO_sub_4e1f(75)) == null) ? "" : sub_4e1f19, 15, 47, 0, 0);
				final String sub_4e1f20;
				sub_1df06(((sub_4e1f20 = GLLib.TODO_sub_4e1f(78)) == null) ? "" : sub_4e1f20, 15, 41, 0, 0);
				final String sub_4e1f21;
				sub_1df06(((sub_4e1f21 = GLLib.TODO_sub_4e1f(79)) == null) ? "" : sub_4e1f21, 15, 44, 0, 0);
				String sub_4e1f22;
				String sub_4e1f23;
				sub_1df06(cGame.var_69f4 ? (((sub_4e1f22 = GLLib.TODO_sub_4e1f(82)) == null) ? "" : sub_4e1f22)
						: (((sub_4e1f23 = GLLib.TODO_sub_4e1f(83)) == null) ? "" : sub_4e1f23), 15, 42, 0, 0);
				String sub_4e1f24;
				String sub_4e1f25;
				sub_1df06(cGame.var_69ec ? (((sub_4e1f24 = GLLib.TODO_sub_4e1f(82)) == null) ? "" : sub_4e1f24)
						: (((sub_4e1f25 = GLLib.TODO_sub_4e1f(83)) == null) ? "" : sub_4e1f25), 15, 45, 0, 0);
			}
			if (cGame.var_69cc) {
				sub_1e2f2("BACK", 15, 61, 0, 0);
				sub_1e2f2("L.50", 15, 89, 0, 0);
				sub_1e2f2("= 0", 15, 81, 0, 0);
				sub_1e2f2("= 0", 15, 75, 0, 0);
				sub_1e2f2("= 0", 15, 69, 0, 0);
				sub_1e2f2("= 0", 15, 87, 0, 0);
				sub_1e2f2(Integer.toString(getExperience()), 15, 77, 0, 0);
				sub_1e2f2(Integer.toString(getCash()), 15, 71, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e0da()), 15, 64, 0, 0);
				sub_1e2f2(Integer.toString(cGame.var_7064), 15, 83, 0, 0);
				sub_1e2f2(Integer.toString(cGame.var_7984), 15, 96, 0, 0);
				sub_1e2f2(cGame.var_798c, 15, 97, 0, 0);
				sub_1e2f2("start quest", 15, 98, 0, 0);
				sub_1e2f2("PARTY", 15, 106, 0, 0);
				sub_1e2f2("EXPAN", 15, 108, 0, 0);
				sub_1e2f2("MANOR", 15, 110, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(0)), 15, 122, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(1)), 15, 125, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(2)), 15, 128, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(3)), 15, 131, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(4)), 15, 134, 0, 0);
				sub_1e2f2(Integer.toString(sub_2e9cd(5)), 15, 137, 0, 0);
			}
		}
		return false;
	}

	private static void sub_3cdc4() {
		int n;
		if ((n = 10241 + (cGame.var_79bc - 1 << 1)) == 10245) {
			n = 10273;
		}
		final String sub_4e1f;
		final String s = ((sub_4e1f = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f;
		final short n2 = cGame.var_68bc[15][59][5];
		final short n3 = cGame.var_68bc[15][59][7];
		final short[] sub_4ac6 = cGame.var_7ffc[sub_237ff(n3)].sub_4ac6(s, n2, false);
		final ASprite class_e = cGame.var_7ffc[sub_237ff(n3)];
		final short n4 = sub_4ac6[0];
		final ASprite class_e2 = class_e;
		cGame.var_79c4 = (cGame.var_79cc = n4 * class_e2.sub_4a3a() + (n4 - 1) * class_e2.sub_490a()) / 2
				- cGame.var_68bc[15][59][6] / 2;
	}

	private static void sub_3ce88(int n) {
		final int n2 = cGame.var_6914[0][9];
		sub_2c69b();
		sub_1fb8e(15);
		cGame.var_6914[0][9] = n2 + 40 * n;
		n *= -40;
		cGame.var_79ac += n;
		sub_22d97(0);
	}

	private static boolean sub_3ced3(int n) {
		if (n == 0) {
			cGame.var_7a44 = (cGame.var_7a44 = cGame.var_68d4[cGame.var_68bc[16][2][5]]
					.sub_3189(cGame.var_68bc[16][2][6]) + 10) + 10;
			if (cGame.var_7a2c > 13) {
				cGame.var_7a2c = 10;
				sub_3d334();
				sub_3d488();
				sub_2c69b();
				sub_1fb8e(16);
				cGame.var_6914[0][9] = -247;
				sub_22d97(0);
			} else {
				sub_3d334();
				sub_3d488();
				sub_2c69b();
				sub_1fb8e(16);
			}
		}
		if (n == 5) {
			sub_d7d7(1);
			for (int i = 0; i < 5; ++i) {
				cGame.var_68bc[16][2 + i * 3][10] = 0;
				cGame.var_68bc[16][4 + i * 3][10] = 0;
				cGame.var_68bc[16][17 + (i << 3)][10] = 0;
				cGame.var_68bc[16][19 + (i << 3)][10] = 0;
				cGame.var_68bc[16][21 + (i << 3)][10] = 0;
				cGame.var_68bc[16][23 + (i << 3)][10] = 0;
				cGame.var_68bc[16][57 + i * 6][10] = 0;
				cGame.var_68bc[16][62 + i * 6][10] = 0;
				cGame.var_68bc[16][60 + i * 6][10] = 0;
			}
			if (cGame.var_7a3c > 0) {
				final Class_f[] array = new Class_f[2];
				Class_f.sub_545c(0, 50, 18, array, 2);
				final int[] array2 = { 0, 0, 14 };
				if (array[0] != null) {
					cGame.var_800c.sub_6b0c(array[0].var_17cd, array[0].var_17d5, 1000);
					Class_f.sub_92ea(47, 2, array2).sub_8c4c(array[0].var_17cd, array[0].var_17d5, 37, 1000, false,
							cGame.var_7a3c);
					Class_f.sub_92ea(47, 2, array2).sub_8c4c(array[0].var_17cd, array[0].var_17d5, 36, 1000, true,
							cGame.var_7a34);
				}
			}
			sub_239ef(16);
		}
		if (n == 2) {
			if (GLLib.IsAnyKeyDown() == 19) {
				sub_1bb38();
			}
			sub_d841(1);
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][9] < -cGame.var_7a44 && cGame.var_7a2c < 10) {
					sub_3d42c(1);
				} else if (cGame.var_6914[0][9] > -10 && cGame.var_7a2c > 0) {
					sub_3d42c(-1);
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(16);
			final String sub_4e1f;
			sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(219)) == null) ? "" : sub_4e1f, 16, 90, 0, 0);
			final int[] array3 = new int[4];
			cGame.var_68d4[cGame.var_68bc[16][1][5]].sub_3882(cGame.var_68bc[16][1][6], 0, array3, 0);
			final int n2 = cGame.var_68bc[16][1][2] + array3[0];
			final int n3 = cGame.var_68bc[16][1][3] + array3[1];
			final int n4 = array3[2];
			final int n5 = array3[3];
			final int n6 = n4;
			final int n7 = n3;
			n = n2;
			GLLib.sub_36f4(GLLib.g, n, n7, n6, n5, true);
			for (int j = 0; j < 5; ++j) {
				if (cGame.var_68bc[16][57 + j * 6][6] == 54) {
					n = 220;
				} else {
					n = 227;
				}
				final String sub_4e1f2;
				sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f2, 16, 58 + j * 6, 0, 0);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7a0c[cGame.var_7a2c + j], cGame.var_7fe4, " "), 16,
						59 + j * 6, 0, 0);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7a14[cGame.var_7a2c + j], cGame.var_7fe4, " "), 16,
						61 + j * 6, 0, 0);
				final String sub_4e1f3;
				sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(8512 + cGame.var_7a2c + j)) == null) ? "" : sub_4e1f3, 16,
						3 + j * 3, 0, 0);
			}
			for (int k = 0; k < 20; ++k) {
				sub_1df06("" + getIntValue(cGame.var_79f4[(cGame.var_7a2c << 2) + k]), 16, 18 + (k << 1), 0, 0);
			}
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_3d334() {
		cGame.var_7a34 = 0;
		cGame.var_7a3c = 0;
		for (int i = 0; i < 5; ++i) {
			cGame.var_68bc[16][2 + i * 3][10] = 1;
			cGame.var_68bc[16][4 + i * 3][10] = 1;
			cGame.var_68bc[16][17 + (i << 3)][10] = 1;
			cGame.var_68bc[16][19 + (i << 3)][10] = 1;
			cGame.var_68bc[16][21 + (i << 3)][10] = 1;
			cGame.var_68bc[16][23 + (i << 3)][10] = 1;
			cGame.var_68bc[16][57 + i * 6][10] = 1;
			cGame.var_68bc[16][60 + i * 6][10] = 1;
			cGame.var_68bc[16][62 + i * 6][10] = 1;
			cGame.var_68bc[16][57 + i * 6][6] = 55;
		}
		cGame.var_68ac = 100;
	}

	private static void sub_3d42c(final int n) {
		cGame.var_7a2c += n;
		final int n2 = cGame.var_6914[0][9];
		sub_3d488();
		sub_2c69b();
		sub_1fb8e(16);
		cGame.var_6914[0][9] = n2 + (cGame.var_68bc[16][5][3] - cGame.var_68bc[16][2][3]) * n;
		sub_22d97(0);
	}

	private static void sub_3d488() {
		for (int i = 0; i < 5; ++i) {
			cGame.var_68bc[16][17 + (i << 3)][5] = 20;
			cGame.var_68bc[16][17 + (i << 3)][6] = 143;
			cGame.var_68bc[16][19 + (i << 3)][5] = 20;
			cGame.var_68bc[16][19 + (i << 3)][6] = 143;
			cGame.var_68bc[16][21 + (i << 3)][5] = 20;
			cGame.var_68bc[16][21 + (i << 3)][6] = 143;
			cGame.var_68bc[16][23 + (i << 3)][5] = 20;
			cGame.var_68bc[16][23 + (i << 3)][6] = 143;
		}
		for (int j = 0; j < 5; ++j) {
			int n = 0;
			final int n2 = cGame.var_7a2c + j << 2;
			final short n3 = (short) (107 + cGame.var_7a2c + j);
			sub_d78c(1, n3);
			if (getIntValue(cGame.var_79f4[n2]) > 0) {
				cGame.var_68bc[16][17 + (j << 3)][5] = n3;
				cGame.var_68bc[16][17 + (j << 3)][6] = 0;
				++n;
			}
			if (getIntValue(cGame.var_79f4[n2 + 1]) > 0) {
				cGame.var_68bc[16][19 + (j << 3)][5] = n3;
				cGame.var_68bc[16][19 + (j << 3)][6] = 1;
				++n;
			}
			if (getIntValue(cGame.var_79f4[n2 + 2]) > 0) {
				cGame.var_68bc[16][21 + (j << 3)][5] = n3;
				cGame.var_68bc[16][21 + (j << 3)][6] = 2;
				++n;
			}
			if (getIntValue(cGame.var_79f4[n2 + 3]) > 0) {
				cGame.var_68bc[16][23 + (j << 3)][5] = n3;
				cGame.var_68bc[16][23 + (j << 3)][6] = 3;
				++n;
			}
			if (n == 4) {
				cGame.var_68bc[16][57 + j * 6][6] = 54;
				cGame.var_68bc[16][57 + j * 6][18] = 1;
			} else {
				cGame.var_68bc[16][57 + j * 6][6] = 55;
				cGame.var_68bc[16][57 + j * 6][18] = 1;
			}
		}
	}

	static void sub_3d6da(final boolean b, int n) {
		final boolean b2 = b;
		cGame.var_79ec = 0;
		if (b2) {
			cGame.var_68bc[1][78][10] = 1;
			cGame.var_7a4c = cGame.var_68bc[1][78][2];
			sub_2c69b();
			sub_1f8c5(1);
			sub_23556(65614, 65622, cGame.var_68bc[1][78][2], 0, 0, 0, 500);
			final short n2 = (short) GLLib.s_screenWidth;
			cGame.var_68bc[1][78][2] = n2;
			cGame.var_68bc[1][80][2] = n2;
			cGame.var_68bc[1][82][2] = n2;
			cGame.var_68bc[1][84][2] = n2;
			cGame.var_68bc[1][86][2] = n2;
			cGame.var_68bc[1][79][2] = n2;
			cGame.var_68bc[1][81][2] = n2;
			cGame.var_68bc[1][83][2] = n2;
			cGame.var_68bc[1][85][2] = n2;
			cGame.var_68bc[1][80][10] = 1;
			cGame.var_68bc[1][82][10] = 1;
			cGame.var_68bc[1][84][10] = 1;
			cGame.var_68bc[1][86][10] = 1;
			final int var_7a2c = n >> 2;
			sub_3d937(n, var_7a2c);
			cGame.var_68bc[1][80][5] = 20;
			cGame.var_68bc[1][80][6] = 143;
			cGame.var_68bc[1][82][5] = 20;
			cGame.var_68bc[1][82][6] = 143;
			cGame.var_68bc[1][84][5] = 20;
			cGame.var_68bc[1][84][6] = 143;
			cGame.var_68bc[1][86][5] = 20;
			cGame.var_68bc[1][86][6] = 143;
			n = (short) (var_7a2c + 107);
			for (int i = 0; i < 4; ++i) {
				if (getIntValue(cGame.var_79f4[(var_7a2c << 2) + i]) > 0) {
					cGame.var_68bc[1][80 + (i << 1)][5] = (short) n;
					cGame.var_68bc[1][80 + (i << 1)][6] = (short) i;
				}
				cGame.var_7a24[i] = getIntValue(cGame.var_79f4[(var_7a2c << 2) + i]);
			}
			cGame.var_7a2c = var_7a2c;
			return;
		}
		if (cGame.var_68bc[1][78][10] == 1) {
			cGame.var_68bc[1][78][10] = 0;
			cGame.var_68bc[1][80][10] = 0;
			cGame.var_68bc[1][82][10] = 0;
			cGame.var_68bc[1][84][10] = 0;
			cGame.var_68bc[1][86][10] = 0;
			sub_2c69b();
			sub_1f8c5(1);
		}
	}

	private static void sub_3d937(int n, int n2) {
		int n3 = 255;
		if (255 > getIntValue(cGame.var_79f4[n2 << 2])) {
			n3 = getIntValue(cGame.var_79f4[n2 << 2]);
		}
		if (n3 > getIntValue(cGame.var_79f4[(n2 << 2) + 1])) {
			n3 = getIntValue(cGame.var_79f4[(n2 << 2) + 1]);
		}
		if (n3 > getIntValue(cGame.var_79f4[(n2 << 2) + 2])) {
			n3 = getIntValue(cGame.var_79f4[(n2 << 2) + 2]);
		}
		if (n3 > getIntValue(cGame.var_79f4[(n2 << 2) + 3])) {
			n3 = getIntValue(cGame.var_79f4[(n2 << 2) + 3]);
		}
		cGame.var_79f4[n] = sub_30161(getIntValue(cGame.var_79f4[n]) + 1);
		n = 255;
		if (255 > getIntValue(cGame.var_79f4[n2 << 2])) {
			n = getIntValue(cGame.var_79f4[n2 << 2]);
		}
		if (n > getIntValue(cGame.var_79f4[(n2 << 2) + 1])) {
			n = getIntValue(cGame.var_79f4[(n2 << 2) + 1]);
		}
		if (n > getIntValue(cGame.var_79f4[(n2 << 2) + 2])) {
			n = getIntValue(cGame.var_79f4[(n2 << 2) + 2]);
		}
		if (n > getIntValue(cGame.var_79f4[(n2 << 2) + 3])) {
			n = getIntValue(cGame.var_79f4[(n2 << 2) + 3]);
		}
		if (n3 + 1 == n) {
			final int n4 = cGame.var_79fc[n2];
			final int n5 = 1;
			final int n6 = 4;
			n2 = n5;
			n = n4;
			sub_49db0(n4, n2, n6, false);
		}
	}

	private static void sub_3dac2() {
		cGame.var_79f4 = new int[60];
		for (int i = 0; i < 60; ++i) {
			cGame.var_79f4[i] = sub_30161(0);
		}
		cGame.var_7a24 = new int[4];
		for (int j = 0; j < 4; ++j) {
			cGame.var_7a24[j] = 0;
		}
		cGame.var_79fc = new short[15];
		cGame.var_7a04 = new byte[15];
		cGame.var_7a0c = new int[15];
		cGame.var_7a14 = new int[15];
		cGame.var_7a1c = new byte[60];
		final Class_h class_h = Class_h.var_6a[16];
		for (int k = 0; k < 15; ++k) {
			cGame.var_79fc[k] = (short) class_h.var_82[k][1];
			cGame.var_7a04[k] = (byte) class_h.var_82[k][4];
			cGame.var_7a0c[k] = class_h.var_82[k][5];
			cGame.var_7a14[k] = class_h.var_82[k][6];
		}
		final Class_h class_h2 = Class_h.var_6a[17];
		for (int l = 0; l < 60; ++l) {
			cGame.var_7a1c[l] = (byte) class_h2.var_82[l][3];
		}
	}

	static int sub_3dbf6() {
		int n = 0;
		int n2 = 0;
		int n3;
		for (n3 = 0; n3 < 15 && getLevel() >= cGame.var_7a04[n3]; ++n3) {
			n2 = n2 + cGame.var_7a1c[n3 << 2] + cGame.var_7a1c[(n3 << 2) + 1] + cGame.var_7a1c[(n3 << 2) + 2]
					+ cGame.var_7a1c[(n3 << 2) + 3];
		}
		int n4 = 0;
		final int n5 = n3 << 2;
		if (n2 > 0) {
			final int sub_2b97 = GLLib.Math_Rand(0, n2);
			for (int i = 0; i < n5; ++i) {
				n4 += cGame.var_7a1c[i];
				if (sub_2b97 < n4) {
					n = i;
					break;
				}
			}
		}
		return n;
	}

	private static void sub_3dcc4(int n) {
		final int n2 = n - 1;
		final int n3 = cGame.var_68bc[16][62 + n2 * 6][2] - cGame.var_68bc[16][94][2];
		final int n4 = cGame.var_68bc[16][62 + n2 * 6][3] - cGame.var_68bc[16][94][3];
		cGame.var_68bc[16][94][10] = 1;
		sub_23556(1048670, 1048670, n3, n4, 0, 0, 500);
		cGame.var_68bc[16][93][10] = 1;
		sub_23556(1048669, 1048669, cGame.var_68bc[16][60 + n2 * 6][2] - cGame.var_68bc[16][93][2],
				cGame.var_68bc[16][60 + n2 * 6][3] - cGame.var_68bc[16][93][3], 0, 0, 500);
		n = cGame.var_7a2c + n - 1;
		cGame.var_7a34 += cGame.var_7a0c[n];
		cGame.var_7a3c += cGame.var_7a14[n];
		final int n5 = n << 2;
		for (int i = 0; i < 4; ++i) {
			if (getIntValue(cGame.var_79f4[n5 + i]) > 0) {
				cGame.var_79f4[n5 + i] = sub_30161(getIntValue(cGame.var_79f4[n5 + i]) - 1);
			}
		}
		sub_3d488();
		sub_2c69b();
		sub_1f8c5(16);
		sub_49db0(cGame.var_79fc[n], 1, 5, false);
		sub_2bae9(cGame.var_79fc[n], 1, 5);
	}

	private static void sub_3de31() {
		GLLib.Pack_Open("/7");
		int n;
		for (n = 0; n < 15 && cGame.var_7a04[n] <= getLevel(); ++n) {
			sub_d500(1, n + 107, 1, 0, 24, 0, -1);
		}
		if (n > 0) {
			sub_d2e8(1, 3);
		}
		GLLib.Pack_FullyClose();
	}

	private static boolean sub_3dea3(int n) {
		if (n == 0) {
			cGame.var_7a74 = sub_237d7(19, 1, 0, 14, 16, 71) + 10;
			sub_2c0fa(false);
			cGame.var_7a64 = 0;
			for (int i = 0; i < 5; ++i) {
				sub_2000c(19, 2 + i * 14, true);
				sub_2000c(19, 15 + i * 14, true);
				sub_2000c(19, 8 + i * 14, true);
				sub_2000c(19, 11 + i * 14, true);
				sub_2000c(19, 12 + i * 14, true);
				sub_2000c(19, 13 + i * 14, true);
				sub_2000c(19, 14 + i * 14, true);
			}
			cGame.var_7a5c = new int[cGame.var_6ee4];
			for (int j = 0; j < cGame.var_6ee4; ++j) {
				if (cGame.var_6e8c[j] == 5999) {
					if (getIntValue(cGame.var_6e9c[j]) > 0) {
						cGame.var_7a5c[j] = 415 * getIntValue(cGame.var_6e94[j]) / 15;
					} else {
						cGame.var_7a5c[j] = 415;
					}
				} else if (getIntValue(cGame.var_6e9c[j]) > 0) {
					cGame.var_7a5c[j] = 415 * getIntValue(cGame.var_6e94[j]) / getIntValue(cGame.var_6e9c[j]);
				} else {
					cGame.var_7a5c[j] = 415;
				}
			}
			cGame.var_68ac = 100;
		}
		if (n == 1) {
			if (cGame.var_7a7c < cGame.var_6ee4 - 5) {
				cGame.var_7a64 = cGame.var_7a7c;
			} else {
				cGame.var_7a64 = cGame.var_6ee4 - 5;
			}
			cGame.var_7a7c = 0;
			sub_3e45d();
			sub_2c69b();
			sub_1fb8e(19);
			sub_23a84(60);
			cGame.var_6914[0][9] = cGame.var_7a84;
		}
		if (n == 5) {
			sub_d7d7(1);
			for (int k = 0; k < 5; ++k) {
				sub_2000c(19, 2 + k * 14, false);
				sub_2000c(19, 15 + k * 14, false);
				sub_2000c(19, 8 + k * 14, false);
				sub_2000c(19, 11 + k * 14, false);
				sub_2000c(19, 12 + k * 14, false);
				sub_2000c(19, 13 + k * 14, false);
				sub_2000c(19, 14 + k * 14, false);
			}
			cGame.var_7a5c = null;
			sub_239ef(19);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_1c340();
			}
			sub_d841(1);
			if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
				if (cGame.var_6914[0][9] < -cGame.var_7a74 && cGame.var_7a64 < cGame.var_6ee4 - 5) {
					sub_3e400(1);
				} else if (cGame.var_6914[0][9] > -10 && cGame.var_7a64 > 0) {
					sub_3e400(-1);
				}
			}
			final String sub_4e1f;
			cGame.var_68cc[19][75] = (((sub_4e1f = GLLib.TODO_sub_4e1f(457)) == null) ? "" : sub_4e1f);
			for (int l = 0; l < 5; ++l) {
				cGame.var_68cc[19][3 + l * 14] = cGame.var_6e6c[cGame.var_7a64 + l];
				cGame.var_68cc[19][4 + l * 14] = cGame.var_6e74[cGame.var_7a64 + l];
				cGame.var_68cc[19][10 + l * 14] = Integer.toString(getIntValue(cGame.var_6e94[cGame.var_7a64 + l]))
						+ "/" + getIntValue(cGame.var_6e9c[cGame.var_7a64 + l]);
				if (getIntValue(cGame.var_6e9c[cGame.var_7a64 + l]) != 0) {
					cGame.var_68bc[19][9 + l * 14][2] = (short) (cGame.var_68bc[19][8 + l * 14][2] + 13);
					cGame.var_68bc[19][9 + l * 14][3] = (short) (cGame.var_68bc[19][8 + l * 14][3] + 5);
					cGame.var_68bc[19][9 + l * 14][5] = (short) cGame.var_7a5c[cGame.var_7a64 + l];
					cGame.var_68bc[19][9 + l * 14][6] = 18;
				}
				if (cGame.var_6ecc[cGame.var_7a64 + l] > 0) {
					cGame.var_68cc[19][5 + l * 14] = GLLib.CurrencySeparator_just_a_guess(cGame.var_6ecc[cGame.var_7a64 + l],
							cGame.var_7fe4, " ");
				}
				if (cGame.var_6ec4[cGame.var_7a64 + l] > 0) {
					cGame.var_68cc[19][6 + l * 14] = GLLib.CurrencySeparator_just_a_guess(cGame.var_6ec4[cGame.var_7a64 + l],
							cGame.var_7fe4, " ");
				}
				if (cGame.var_6ebc[cGame.var_7a64 + l] > 0) {
					cGame.var_68cc[19][7 + l * 14] = GLLib.CurrencySeparator_just_a_guess(cGame.var_6ebc[cGame.var_7a64 + l],
							cGame.var_7fe4, " ");
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(19);
			final int[] array = new int[4];
			cGame.var_68d4[cGame.var_68bc[19][1][5]].sub_3882(cGame.var_68bc[19][1][6], 0, array, 0);
			final int n2 = cGame.var_68bc[19][1][2] + array[0];
			final int n3 = cGame.var_68bc[19][1][3] + array[1];
			final int n4 = array[2];
			final int n5 = array[3];
			final int n6 = n4;
			final int n7 = n3;
			n = n2;
			GLLib.sub_36f4(GLLib.g, n, n7, n6, n5, true);
			final int var_1ddf = GLLib.s_screenWidth;
			final int var_1de7 = GLLib.s_screenHeight;
			n = var_1ddf;
			GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
		}
		return false;
	}

	private static void sub_3e400(final int n) {
		cGame.var_7a64 += n;
		final int n2 = cGame.var_6914[0][9];
		sub_3e45d();
		sub_2c69b();
		sub_1fb8e(19);
		cGame.var_6914[0][9] = n2 + (cGame.var_68c4[19][16][3] - cGame.var_68c4[19][2][3]) * n;
		sub_22d97(0);
	}

	private static void sub_3e45d() {
		for (int i = 0; i < 5; ++i) {
			if (cGame.var_6edc[cGame.var_7a64 + i] == 0) {
				sub_2000c(19, 15 + i * 14, false);
				sub_2000c(19, 14 + i * 14, true);
				sub_2024d(19, 14 + i * 14, true);
				cGame.var_68bc[19][14 + i * 14][6] = 110;
			} else if (cGame.var_6edc[cGame.var_7a64 + i] == 1) {
				sub_2000c(19, 15 + i * 14, true);
				cGame.var_68bc[19][15 + i * 14][6] = 144;
				sub_2000c(19, 14 + i * 14, true);
				sub_2024d(19, 14 + i * 14, true);
				cGame.var_68bc[19][14 + i * 14][6] = 111;
			} else if (cGame.var_6edc[cGame.var_7a64 + i] == 2) {
				sub_2000c(19, 15 + i * 14, true);
				cGame.var_68bc[19][15 + i * 14][6] = 156;
				sub_2000c(19, 14 + i * 14, false);
				sub_2024d(19, 14 + i * 14, false);
			}
			if (cGame.var_6ecc[cGame.var_7a64 + i] > 0) {
				sub_2000c(19, 11 + i * 14, true);
				sub_2000c(19, 5 + i * 14, true);
			} else {
				sub_2000c(19, 11 + i * 14, false);
				sub_2000c(19, 5 + i * 14, false);
			}
			if (cGame.var_6ec4[cGame.var_7a64 + i] > 0) {
				sub_2000c(19, 12 + i * 14, true);
				sub_2000c(19, 6 + i * 14, true);
			} else {
				sub_2000c(19, 12 + i * 14, false);
				sub_2000c(19, 6 + i * 14, false);
			}
			if (cGame.var_6ebc[cGame.var_7a64 + i] > 0) {
				sub_2000c(19, 13 + i * 14, true);
				sub_2000c(19, 7 + i * 14, true);
			} else {
				sub_2000c(19, 13 + i * 14, false);
				sub_2000c(19, 7 + i * 14, false);
			}
		}
	}

	private static void sub_3e690(final boolean b, int n) {
		if (b) {
			cGame.var_7a7c = n;
		}
		if (sub_8396() == 29 && b) {
			cGame.var_6c6c = true;
			cGame.var_6c74 = n;
			return;
		}
		cGame.var_7a54 = System.currentTimeMillis();
		if (b) {
			cGame.var_7a6c = 1;
			sub_2000c(1, 87, b);
			if (sub_4abbb(cGame.var_80f4[5])) {
				sub_2024d(1, 87, b);
			} else {
				sub_2024d(1, 87, false);
			}
			sub_2c69b();
			sub_1fb8e(1);
			sub_23556(65623, 65625, cGame.var_68bc[1][87][2], 0, 0, 0, 1000);
			n = (short) GLLib.s_screenWidth;
			cGame.var_68bc[1][87][2] = (short) n;
			cGame.var_68bc[1][89][2] = (short) n;
			cGame.var_68bc[1][88][2] = (short) n;
			sub_2000c(1, 89, b);
			cGame.var_68bc[1][89][5] = 20;
			cGame.var_68bc[1][89][6] = 156;
			return;
		}
		if (!b && sub_20167(1, 87)) {
			cGame.var_7a6c = 2;
			sub_23556(65623, 65625, 0, 0, cGame.var_68bc[1][87][2], 0, 1000);
		}
	}

	private static void sub_3e7c1() {
		cGame.var_7a6c = 0;
		cGame.var_7a54 = 0L;
		sub_2000c(1, 87, cGame.var_7a8c = false);
		sub_2000c(1, 89, false);
		sub_2024d(1, 87, false);
		sub_2c69b();
		sub_1fb8e(1);
	}

	private static boolean sub_3e804(final int n) {
		if (n == 1) {
			cGame.var_7a94 = sub_30161(cGame.var_701c * Class_f.sub_4d73(0, 1005));
			sub_2c69b();
			sub_1fb8e(23);
			cGame.var_704c = Class_f.sub_5ad9(0, 54);
			sub_2000c(23, 27, true);
			sub_2024d(23, 27, true);
			sub_2000c(23, 2, true);
			sub_2000c(23, 6, true);
			sub_2000c(23, 10, true);
			sub_2000c(23, 14, true);
			sub_2000c(23, 18, true);
			sub_2000c(23, 22, true);
			sub_2024d(23, 2, true);
			sub_2024d(23, 6, true);
			sub_2024d(23, 10, true);
			sub_2024d(23, 14, true);
			sub_2024d(23, 18, true);
			sub_2024d(23, 22, true);
			sub_2c69b();
			sub_1fb8e(23);
		}
		if (n == 5) {
			sub_239ef(23);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_1c004();
			}
			final short n2 = cGame.var_68bc[23][33][2];
			cGame.var_68bc[23][32][2] = (short) (n2
					+ (cGame.var_68bc[23][34][2] - n2) * sub_2e954() / getIntValue(cGame.var_7a94));
			sub_2000c(23, 32, true);
		}
		if (n == 3) {
			sub_1dcc1(23);
			final String sub_4e1f;
			sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(482)) == null) ? "" : sub_4e1f, 23, 1, 0, 0);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(483)) == null) ? "" : sub_4e1f2, 23, 39, 0, 0);
			sub_1e44e(23, 32);
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(484)) == null) ? "" : sub_4e1f3, 23, 38, 0, 0);
			sub_1df06(Integer.toString(sub_2e954()) + "/" + getIntValue(cGame.var_7a94), 23, 35, 0, 0);
			final String sub_4e1f4;
			sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(459)) == null) ? "" : sub_4e1f4, 23, 36, 0, 0);
			sub_1df06(Integer.toString(cGame.var_704c) + "/" + getMaxSiloAmount(), 23, 37, 0, 0);
			final String sub_4e1f5;
			sub_1e2f2(((sub_4e1f5 = GLLib.TODO_sub_4e1f(8263)) == null) ? "" : sub_4e1f5, 23, 4, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(0)), 23, 5, 0, 0);
			final String sub_4e1f6;
			sub_1e2f2(((sub_4e1f6 = GLLib.TODO_sub_4e1f(8264)) == null) ? "" : sub_4e1f6, 23, 8, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(1)), 23, 9, 0, 0);
			final String sub_4e1f7;
			sub_1e2f2(((sub_4e1f7 = GLLib.TODO_sub_4e1f(8265)) == null) ? "" : sub_4e1f7, 23, 12, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(2)), 23, 13, 0, 0);
			final String sub_4e1f8;
			sub_1e2f2(((sub_4e1f8 = GLLib.TODO_sub_4e1f(8266)) == null) ? "" : sub_4e1f8, 23, 16, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(3)), 23, 17, 0, 0);
			final String sub_4e1f9;
			sub_1e2f2(((sub_4e1f9 = GLLib.TODO_sub_4e1f(8267)) == null) ? "" : sub_4e1f9, 23, 20, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(4)), 23, 21, 0, 0);
			final String sub_4e1f10;
			sub_1e2f2(((sub_4e1f10 = GLLib.TODO_sub_4e1f(8268)) == null) ? "" : sub_4e1f10, 23, 24, 0, 0);
			sub_1df06(Integer.toString(sub_2e9cd(5)), 23, 25, 0, 0);
		}
		return false;
	}

	private static boolean sub_3ebe5(final int n) {
		if (n == 0) {
			cGame.var_7aa4 = new int[16];
			for (int i = 0; i <= 7; ++i) {
				cGame.var_7aa4[i << 1] = cGame.var_68bc[1][i][2] - cGame.var_68bc[1][0][2] - 150;
				cGame.var_7aa4[(i << 1) + 1] = cGame.var_68bc[1][i][3] - cGame.var_68bc[1][0][3] - 100;
			}
			if (cGame.var_7fd4 == -1 && cGame.var_7a9c) {
				cGame.var_7a9c = false;
			}
			sub_114a7(true, false, false);
			sub_10e3f(false, 0, cGame.var_6b04);
			sub_10cd1(true);
			sub_11320(false, null);
			sub_29e85();
			sub_29fce();
			addExperience(0);
			sub_3de31();
			sub_25b35(28, 0);
			sub_25b35(28, 1);
			sub_25b35(28, 2);
			sub_2e5a7(0);
		}
		if (n == 1) {
			if (cGame.var_67dc[cGame.field_a_int] == 17 && cGame.var_69d4 && !cGame.var_69dc) {
				sub_cc72();
				cGame.var_800c.sub_692a();
				cGame.var_69d4 = false;
			}
			if (cGame.var_6ab4 != null) {
				sub_245ce(cGame.var_6ab4, false);
			}
			if (cGame.var_6aac != null) {
				if (cGame.var_6aac.var_17c5 != 54 && cGame.var_6aa4 != 3) {
					sub_10dd3(true);
				}
			} else {
				sub_114a7(true, false, false);
				sub_10cd1(true);
				sub_10dd3(false);
			}
			if (sub_4ac8d()) {
				sub_2000c(1, 44, false);
				sub_2024d(1, 44, false);
			}
			sub_2c69b();
			sub_1fb8e(1);
			if (cGame.var_7fd4 == -1 && (cGame.var_7fa4 == -1 & sub_49794())) {
				sub_26a6a(true, cGame.var_7f6c, '\u0001');
			}
			sub_11737();
			if (cGame.var_7fdc) {
				cGame.var_7fdc = false;
			}
			if (cGame.var_7aac != -1) {
				if (cGame.var_7aac == 1) {
					sub_40658(472, 478);
				} else if (cGame.var_7aac == 2) {
					sub_40658(471, 477);
				} else if (cGame.var_7aac == 3) {
					sub_4052e(489, 490, 7, 0);
				} else if (cGame.var_7aac == 4) {
					sub_4052e(500, 501, 15, 0);
				} else if (cGame.var_7aac == 5) {
					sub_4052e(502, 503, 26, 0);
				} else if (cGame.var_7aac == 6) {
					sub_4052e(504, 505, 7, 0);
				} else if (cGame.var_7aac == 7) {
					sub_4052e(295, 296, 7, 0);
				} else if (cGame.var_7aac == 8) {
					sub_4052e(623, 624, 7, 0);
				} else if (cGame.var_7aac == 11) {
					sub_4052e(163, 164, 7, 0);
				} else if (cGame.var_7aac == 12) {
					sub_4052e(637, 638, 7, 0);
				} else if (cGame.var_7aac == 14) {
					sub_4052e(621, 622, 7, 0);
				} else if (cGame.var_7aac == 15) {
					sub_4052e(633, 634, 7, 0);
				} else if (cGame.var_7aac == 16) {
					sub_4052e(637, 638, 7, 0);
				} else if (cGame.var_7aac == 17) {
					if (sub_2a22a() > 0) {
						sub_4049d(300, 230 + (sub_2a22a() - 1), 7, 0, 2);
					}
				} else if (cGame.var_7aac == 20) {
					sub_4052e(491, 492, 7, 0);
				}
				cGame.var_7aac = -1;
			}
			if (cGame.var_6c6c) {
				cGame.var_6c6c = false;
				sub_3e690(true, cGame.var_6c74);
				cGame.var_6c74 = 0;
			}
			if (!sub_20167(1, 37) && getLevel() >= 3) {
				sub_2000c(1, 37, true);
				sub_2024d(1, 37, true);
				sub_118c5(true);
				sub_2c69b();
				sub_1f8c5(1);
			}
			if (!sub_202b7(1, 11) && getLevel() >= 3) {
				sub_2024d(1, 11, true);
				sub_2024d(1, 14, cGame.s_iapEnabled);
				sub_2c69b();
				sub_1f8c5(1);
			}
			if (cGame.var_807c != 0) {
				sub_2000c(1, 60, false);
				sub_2024d(1, 60, false);
			} else if ((!sub_20167(1, 60) || !sub_202b7(1, 60)) && (sub_4ac19(2) || sub_4abbb(cGame.var_80f4[2]))) {
				sub_2000c(1, 60, true);
				sub_2024d(1, 60, true);
				sub_2c69b();
				sub_1f8c5(1);
			}
			if (cGame.var_6afc != -1) {
				sub_251a0(cGame.var_6afc);
			}
			if (sub_8409() != 7 && sub_8409() != 29 && sub_8409() != 28 && sub_8409() != 26 && sub_8409() != 19
					&& sub_8409() != 20 && sub_8409() != 35 && sub_8409() != 27 && sub_8409() != 8
					&& sub_8409() != 12) {
				sub_e522(false);
			}
			if (cGame.var_7fd4 == 0) {
				sub_2f41f(15);
				sub_27132();
				cGame.var_7fd4 = 1;
			} else if (cGame.var_7fd4 != -1) {
				sub_81e0(18);
				sub_27132();
			}
			final Class_f[] array = { null };
			Class_f.sub_545c(0, 50, 18, array, 1);
			int var_17cd = 0;
			int var_17d5 = 0;
			if (array[0] != null) {
				var_17cd = array[0].var_17cd;
				var_17d5 = array[0].var_17d5;
			}
			final int[] array2 = { 0, 0, 14 };
			if (cGame.var_709c > 0) {
				Class_f.sub_92ea(47, 2, array2).sub_8c4c(var_17cd - 50, var_17d5, 37, 1000, false, cGame.var_709c);
				cGame.var_709c = 0;
			}
			if (cGame.var_70a4 > 0) {
				Class_f.sub_92ea(47, 2, array2).sub_8c4c(var_17cd, var_17d5, 36, 1000, true, cGame.var_70a4);
				cGame.var_70a4 = 0;
			}
			if (cGame.var_70ac > 0) {
				Class_f.sub_92ea(47, 2, array2).sub_8c4c(var_17cd + 50, var_17d5, 6, 1000, true, cGame.var_70ac);
				cGame.var_70ac = 0;
			}
			Class_f.sub_4ba6(0);
		}
		if (n == 8) {
			if (GLLib.sub_762d()) {
				if (cGame.var_8034 != null && cGame.var_7fd4 != 35 && cGame.var_7fd4 != 18) {
					sub_11320(false, null);
				}
				if (cGame.var_6aa4 != 3) {
					sub_10947(false);
				}
				if (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1) {
					final int[] array3 = new int[2];
					final int[] array4;
					(array4 = new int[2])[0] = GLLib.s_screenX;
					array4[1] = GLLib.s_screenY;
					sub_26427(array4, array3);
					sub_2c867(array3, array4);
					if (cGame.var_6aac != null && sub_2d213(array4[0], array4[1]) > -1) {
						sub_2c8b0(array4, array3);
						cGame.var_6aac.var_17cd = array3[0];
						cGame.var_6aac.var_17d5 = array3[1];
					}
				}
			} else if (cGame.var_803c > 15 && cGame.var_6aac != cGame.var_802c && cGame.var_7fd4 != 15
					&& cGame.var_7fd4 != 52 && cGame.var_7fd4 != 51 && cGame.var_7fd4 != 42) {
				if (cGame.var_6aa4 == 0 || cGame.var_6aa4 == 1 || cGame.var_6aa4 == 4) {
					sub_117fc();
				} else if (cGame.var_6aa4 == 3) {
					if (!sub_2cad2(cGame.var_6aac)) {
						sub_24b52();
						sub_25043(false);
						sub_10dd3(false);
						sub_10cd1(true);
					} else {
						sub_1179d(false);
					}
				}
				if (cGame.var_802c != null) {
					sub_271e4(-1);
					sub_10cd1(false);
					cGame.var_6aa4 = 3;
					sub_245ce(cGame.var_802c, true);
					sub_23a84(41);
					cGame.var_803c = 0;
					cGame.var_6abc = true;
				}
			}
			final Class_f sub_4f79;
			if (cGame.var_6f84 == -1 && cGame.var_6f8c == -1 && cGame.var_6aa4 == -1
					&& (GLLib.sub_7660() || GLLib.sub_7693() || GLLib.sub_762d() || GLLib.sub_76c6())
					&& (sub_4f79 = Class_f.sub_4f79(0, 22)) != null) {
				if (sub_4f79.var_185d == 1) {
					final String sub_4e1f;
					String sub_4e1f2;
					final String string = (((sub_4e1f = GLLib.TODO_sub_4e1f(154)) == null) ? "" : sub_4e1f)
							+ ((sub_4f79.var_17a5 == -1) ? ("%RETRIEVE ITEM NAME ERROR%" + sub_4f79.var_17a5)
									: (((sub_4e1f2 = GLLib.TODO_sub_4e1f(sub_4f79.var_17a5)) == null) ? "" : sub_4e1f2));
					final Class_f var_7b34 = sub_4f79;
					final String s = string;
					cGame.var_7b34 = var_7b34;
					sub_40279(s, 7, 0);
				}
				return true;
			}
			if (cGame.var_6af4 > -1 && GLLib.sub_762d() && cGame.var_6f8c == -1
					&& (cGame.var_8024 == null
							|| (cGame.var_8024.var_17c5 != 49 && cGame.var_8024.var_17c5 != 52))
					&& sub_2c4ff() < 50) {
				sub_251a0(-1);
			}
			if (cGame.var_6aa4 != -1) {
				if (sub_240db()) {
					return true;
				}
			} else if (cGame.var_8014 != null) {
				switch (cGame.var_8014.var_17c5) {
				case 49: {
					if (cGame.var_8014.sub_6f71()) {
						return true;
					}
					break;
				}
				case 52: {
					if (cGame.var_8014.sub_790a()) {
						return true;
					}
					break;
				}
				}
			} else if (cGame.var_801c != null) {
				switch (cGame.var_801c.var_17c5) {
				case 49: {
					if (cGame.var_801c.sub_6fe6()) {
						return true;
					}
					break;
				}
				case 52: {
					if (cGame.var_801c.sub_7946()) {
						return true;
					}
					break;
				}
				}
			} else if (cGame.var_8024 != null) {
				if (cGame.var_8024 == cGame.var_6aac) {
					return true;
				}
				switch (cGame.var_8024.var_17c5) {
				case 49: {
					if (cGame.var_8024.sub_7296()) {
						return true;
					}
					break;
				}
				case 52: {
					if (cGame.var_8024.sub_7a79()) {
						return true;
					}
					break;
				}
				case 48: {
					if ((sub_4ac19(12) || sub_4abbb(cGame.var_80f4[12])) && cGame.var_6c64 != 1) {
						sub_2ec47(2, cGame.var_8024);
						return true;
					}
					break;
				}
				case 50: {
					if (cGame.var_6c44) {
						return true;
					}
					if (cGame.var_7fd4 == 23 && cGame.var_8024.var_1835 != 14) {
						return false;
					}
					if (cGame.var_6c64 == 1) {
						return false;
					}
					if (cGame.var_8024.var_1835 == 9) {
						sub_81e0(8);
						return true;
					}
					if (cGame.var_8024.var_1835 == 18) {
						if (cGame.var_6c64 != 1 && cGame.var_6c64 != 2) {
							if ((sub_4abbb(cGame.var_80f4[0]) || sub_4ac19(0)) && cGame.var_70d4 == 0) {
								sub_81e0(29);
							}
						} else {
							sub_23a84(56);
						}
						return true;
					}
					if (cGame.var_8024.var_1835 == 14) {
						sub_23a84(37);
						sub_81e0(27);
						return true;
					}
					if (cGame.var_8024.var_1835 == 10) {
						cGame.var_7754 = 0;
						sub_81e0(28);
						return true;
					}
					if (cGame.var_8024.var_1835 == 15) {
						if (sub_4ac19(2) || sub_4abbb(cGame.var_80f4[2])) {
							sub_23a84(61);
							sub_81e0(38);
							sub_10cd1(false);
							return true;
						}
						sub_23a84(56);
						break;
					} else if (cGame.var_8024.var_1835 == 12 || cGame.var_8024.var_1835 == 11) {
						if (!cGame.var_8024.var_15cd) {
							sub_23a84(56);
							sub_11320(true, cGame.var_8024);
							break;
						}
						int n2 = 0;
						int n3 = 0;
						if (cGame.var_8024.var_1835 == 11) {
							sub_23a84(16);
							n3 = 1;
							n2 = 0 + Class_f.sub_4de1(0, 54, 5, 15);
						} else if (cGame.var_8024.var_1835 == 12) {
							sub_23a84(17);
							n3 = 2;
							n2 = 0 + Class_f.sub_4de1(0, 54, 17, 27) + Class_f.sub_4de1(0, 54, 41, 51)
									+ Class_f.sub_4de1(0, 54, 53, 63);
						}
						final int j = 1 + n2 / 3;
						if (sub_2dcf3(5) + Class_f.sub_59d2(2) + j > sub_2df26()) {
							if (sub_2dcf3(5) < sub_2df26()) {
								final String sub_4e1f3;
								final String sub_4e1f4;
								sub_406d3(((sub_4e1f3 = GLLib.TODO_sub_4e1f(475)) == null) ? "" : sub_4e1f3,
										GLLib.sub_547c(((sub_4e1f4 = GLLib.TODO_sub_4e1f(476)) == null) ? "" : sub_4e1f4,
												"%slots", "" + j),
										7, 0);
							} else {
								sub_40658(471, 477);
							}
							return true;
						}
						final int[] array5 = { 0, 0, 14 };
						Class_f.sub_92ea(47, 2, array5);
						final Class_f sub_92ea = Class_f.sub_92ea(47, 2, array5);
						sub_49db0(cGame.var_80b4[cGame.var_8024.var_1835], 1, 7, false);
						sub_92ea.sub_8c4c(cGame.var_8024.var_17cd, cGame.var_8024.var_17d5, 59, 1000, true,
								n3 | 1 + GLLib.Math_Rand(0, 2) * (n2 / 3) << 16);
						cGame.var_8024.var_15cd = false;
						cGame.var_8024.var_15c5 = System.currentTimeMillis() / 1000L;
						cGame.var_8024.sub_aa8a();
						break;
					} else if (cGame.var_8024.var_1835 == 13) {
						if (sub_4abbb(cGame.var_80f4[1])) {
							sub_23a84(60);
							sub_81e0(39);
							return true;
						}
						break;
					} else {
						if (cGame.var_8024.var_1835 == 17 && cGame.var_8024.sub_a2a0(512)) {
							cGame.var_8024.sub_aa8a();
							final String sub_4e1f5;
							final String s2 = ((sub_4e1f5 = GLLib.TODO_sub_4e1f(627)) == null) ? "" : sub_4e1f5;
							final String sub_4e1f6;
							final String var_7acc = ((sub_4e1f6 = GLLib.TODO_sub_4e1f(628)) == null) ? "" : sub_4e1f6;
							final String var_7ac4 = s2;
							cGame.var_7b24 = 6;
							sub_2000c(4, 5, true);
							sub_2000c(4, 6, true);
							sub_2000c(4, 7, true);
							sub_2000c(4, 11, true);
							sub_2024d(4, 11, true);
							sub_4019a(7, 0, 10);
							cGame.var_7ac4 = var_7ac4;
							cGame.var_7acc = var_7acc;
							sub_81e0(19);
							return true;
						}
						break;
					}

				}
				case 54: {
					if (cGame.var_8024.sub_7d78()) {
						return true;
					}
					break;
				}
				case 19: {
					if (cGame.var_8024.var_185d == 8) {
						sub_2ec47(6, cGame.var_8024);
						return true;
					}
					break;
				}
				}
			}
			if (cGame.var_802c == null && cGame.var_8004 != null && cGame.var_8004.sub_6533()) {
				return true;
			}
			if (cGame.var_6bec) {
				return true;
			}
			cGame.var_800c.sub_67aa();
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 24 || sub_2b09 == 11) {
				if (sub_202b7(1, 37) && sub_20167(1, 37)) {
					sub_10922();
				} else if (sub_2b09 == 19 || sub_2b09 == 11) {
					final String sub_4e1f7;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f7 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f7));
				} else if (sub_2b09 == 24) {
					final String sub_4e1f8;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f8 = GLLib.TODO_sub_4e1f(499)) == null) ? "" : sub_4e1f8));
				}
			}
			sub_253a8();
			if (cGame.var_6c54) {
				sub_26c8e();
			}
		}
		if (n == 3) {
			if (cGame.var_7fd4 == 1 && cGame.var_67c4 == 35) {
				return false;
			}
			sub_2534f();
			if (GLLibPlayer.sub_5ecf() != null) {
				sub_2657c(false);
			}
			if (!cGame.s_clickblocked) {
				sub_26716();
			}
		}
		if (n == 4) {
			sub_10e3f(false, 0, cGame.var_6b04);
		}
		if (n == 5) {
			sub_2ec20();
			Class_f.sub_4921();
			cGame.var_800c = null;
			Class_f.sub_48be();
			sub_2393e(1, 29);
		}
		return false;
	}

	private static boolean sub_3fc6c(final int n) {
		if (n == 1) {
			cGame.var_68ac = 100;
			cGame.var_7b2c = 0;
			sub_2c69b();
			sub_1fb8e(4);
			cGame.var_7b04 = 0;
			int n2 = 10;
			if (cGame.var_7ac4 == "") {
				n2 = 3;
			}
			if (cGame.var_68bc[4][n2][5] > -1 && cGame.var_68d4[cGame.var_68bc[4][n2][5]] == null) {
				sub_d500(1, cGame.var_68bc[4][n2][5], 1, 0, 24, 0, -1);
				GLLib.Pack_Open("/7");
				sub_d2e8(1, 3);
				GLLib.Pack_FullyClose();
			}
			switch (cGame.var_7b24) {
			case 0: {
				if (cGame.var_711c == 15 && cGame.var_70ec == 2) {
					sub_23a84(60);
					break;
				}
				sub_23a84(58);
				break;
			}
			case 1:
			case 2:
			case 3:
			case 4:
			case 6: {
				sub_23a84(58);
				break;
			}
			}
			final int sub_83cf = sub_83cf();
			sub_2000c(4, 0, sub_83cf != 17 && sub_83cf != 17 && sub_83cf != 18 && sub_83cf != 35 && sub_83cf != 36);
			sub_2000c(1, 45, false);
			sub_2000c(1, 46, false);
		}
		if (n == 5) {
			cGame.var_7afc = false;
			sub_4074f();
			cGame.var_6bec = false;
			cGame.var_7ac4 = "";
			cGame.var_7acc = "";
			cGame.var_7b1c = "";
			cGame.var_7b14 = null;
			if (cGame.var_816c) {
				cGame.var_816c = false;
				if (sub_20167(8, 203)) {
					sub_2024d(8, 203, true);
				}
				if (sub_20167(8, 206)) {
					sub_2024d(8, 206, true);
				}
			}
			if (cGame.var_7b2c == 34) {
				sub_81e0(34);
			} else if (cGame.var_7b0c != -1) {
				sub_81e0(cGame.var_7b0c);
				cGame.var_7b0c = -1;
			} else if (cGame.var_7b24 == 6) {
				cGame.var_69d4 = true;
				cGame.s_clickblocked = true;
				cGame.var_69dc = true;
				GLLibPlayer.Tileset_Destroy(0);
				GLLibPlayer.Tileset_Destroy(1);
				sub_81e0(25);
			}
			cGame.var_7b24 = 0;
		}
		if (n == 8 && cGame.var_7b24 != 2 && cGame.var_7b24 != 4 && cGame.var_7b24 != 5 && cGame.var_7b04 > 700
				&& GLLib.sub_762d()) {
			sub_126b4();
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				if (cGame.var_7fd4 == -1) {
					switch (cGame.var_7b24) {
					case 0:
					case 1:
					case 6: {
						sub_126b4();
						break;
					}
					case 2:
					case 3:
					case 4: {
						sub_12624();
						break;
					}
					}
				} else {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				}
			}
			cGame.var_7b04 += GLLib.s_game_frameDT;
			sub_d841(1);
		}
		if (n == 3) {
			sub_1dcc1(4);
			if (cGame.var_7ac4 == "" || cGame.var_7ac4 == null) {
				sub_1e2f2(cGame.var_7acc, 4, 2, 0, 0);
			} else {
				sub_1df06(cGame.var_7ac4, 4, 8, 0, 0);
				sub_1e2f2(cGame.var_7acc, 4, 9, 0, 0);
			}
			if (cGame.var_7b1c != "") {
				sub_1df06(cGame.var_7b1c, 4, 14, 0, 0);
			}
			if (cGame.var_68bc[4][15][10] == 1) {
				switch (cGame.var_7b24) {
				case 2: {
					final String sub_4e1f2;
					sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(45)) == null) ? "" : sub_4e1f2, 4, 17, 0, 0);
					final String sub_4e1f3;
					sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(40)) == null) ? "" : sub_4e1f3, 4, 18, 0, 0);
					break;
				}
				case 3: {
					final String sub_4e1f4;
					sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(32)) == null) ? "" : sub_4e1f4, 4, 17, 0, 0);
					final String sub_4e1f5;
					sub_1df06(((sub_4e1f5 = GLLib.TODO_sub_4e1f(33)) == null) ? "" : sub_4e1f5, 4, 18, 0, 0);
					break;
				}
				}
			}
			if (cGame.var_68bc[4][30][10] == 1) {
				final String sub_4e1f6;
				sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(481)) == null) ? "" : sub_4e1f6, 4, 31, 0, 0);
			}
		}
		return false;
	}

	static void sub_4014a(final int n, final int n2, final int n3) {
		final String sub_4e1f;
		sub_40279(((sub_4e1f = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f, n2, n3);
	}

	private static void sub_4019a(final int var_7ae4, final int var_7aec, final int n) {
		cGame.var_7ae4 = var_7ae4;
		cGame.var_7aec = var_7aec;
		if (cGame.var_68bc[4][n][5] > -1 && cGame.var_68bc[4][n][5] != var_7ae4) {
			if (cGame.var_68bc[4][n][5] >= 1000) {
				sub_d500(0, cGame.var_68bc[4][n][5] - 1000, 65535, 1, 0, 0, -1);
			} else if (cGame.var_68bc[4][n][5] != 44) {
				sub_d500(1, cGame.var_68bc[4][n][5], 65535, 1, 0, 0, -1);
			}
		}
		if (var_7ae4 == -1) {
			sub_2000c(4, n, false);
			return;
		}
		sub_2000c(4, n, true);
		cGame.var_68bc[4][n][5] = (short) var_7ae4;
		cGame.var_68bc[4][n][6] = (short) var_7aec;
	}

	private static void sub_40279(final String var_7acc, int sub_237ff, int n) {
		cGame.var_7b24 = 0;
		cGame.var_7acc = var_7acc;
		sub_2000c(4, 1, true);
		sub_2000c(4, 7, false);
		sub_4019a(sub_237ff, n, 3);
		sub_237ff = sub_237ff(cGame.var_68bc[4][2][7]);
		final short[] sub_4ac6 = cGame.var_7ffc[sub_237ff].sub_4ac6(var_7acc, cGame.var_68bc[4][2][5], false);
		int n2 = (sub_4ac6[0] + (sub_4ac6[0] >> 1)) * cGame.var_7ffc[sub_237ff].sub_494e();
		final int n3 = cGame.var_68bc[4][2][5] + 40;
		final int n4 = n2 + 40;
		n = n3;
		sub_237ff = cGame.var_68bc[4][1][5];
		final short n5 = cGame.var_68bc[4][1][6];
		ASprite class_e = sub_237ff < 1000 ? cGame.var_68d4[sub_237ff] : cGame.var_7ff4[sub_237ff - 1000];
		final short n6 = class_e.var_faf[n5];
		final int sub_6494 = class_e.sub_6494(n5);
		final int n7 = class_e.var_f7f[class_e.sub_32e3(n5, 0)] & 0xFFFF;
		final int n8 = class_e.var_f87[class_e.sub_32e3(n5, 0)] & 0xFFFF;
		for (short n9 = 4; n9 < sub_6494; ++n9) {
			if (class_e.sub_30ea(n6 + n9) == class_e.sub_30ea(n6 + 1)) {
				class_e.sub_3aab(n6 + n9, n - n7);
			} else if (class_e.sub_310b(n6 + n9) == class_e.sub_310b(n6 + 2)) {
				class_e.sub_3ace(n6 + n9, n4 - n8);
			}
		}
		class_e.sub_3aab(n6 + 1, n - n7);
		class_e.sub_3ace(n6 + 2, n4 - n8);
		class_e.sub_3aab(n6 + 3, n - n7);
		class_e.sub_3ace(n6 + 3, n4 - n8);
		cGame.var_68dc[n5] = null;
		sub_2000c(4, 4, true);
		sub_2024d(4, 4, true);
		if (n2 > 105) {
			n2 = 105;
		}
		cGame.var_68bc[4][4][3] = (short) (n2 + cGame.var_68bc[4][2][3] + 10);
		sub_81e0(19);
	}

	static void sub_4049d(final int n, final int n2, final int n3, final int n4, final int n5) {
		final String sub_4e1f;
		final String sub_4e1f2;
		sub_405d4(((sub_4e1f = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f,
				((sub_4e1f2 = GLLib.TODO_sub_4e1f(n2)) == null) ? "" : sub_4e1f2, n3, 0, cGame.var_7afc = true);
	}

	private static void sub_4052e(final int n, final int n2, final int n3, final int n4) {
		final String sub_4e1f;
		final String sub_4e1f2;
		sub_405d4(((sub_4e1f = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f,
				((sub_4e1f2 = GLLib.TODO_sub_4e1f(n2)) == null) ? "" : sub_4e1f2, n3, 0, false);
	}

	private static void sub_405b1(final String s, final String s2, final int n) {
		sub_405d4(s, s2, n, 0, false);
	}

	private static void sub_405d4(final String var_7ac4, final String var_7acc, final int n, final int n2,
			final boolean var_7afc) {
		cGame.var_7afc = var_7afc;
		cGame.var_7b24 = 1;
		sub_4074f();
		sub_2000c(4, 5, true);
		sub_2000c(4, 6, true);
		sub_2000c(4, 7, true);
		sub_2000c(4, 11, true);
		sub_2024d(4, 11, true);
		sub_4019a(n, n2, 10);
		cGame.var_7ac4 = var_7ac4;
		cGame.var_7acc = var_7acc;
		sub_81e0(19);
	}

	static void sub_40631() {
		sub_4052e(469, 470, 7, 0);
	}

	static void sub_40658(final int n, final int n2) {
		final String sub_4e1f;
		final String sub_4e1f2;
		sub_406d3(((sub_4e1f = GLLib.TODO_sub_4e1f(n)) == null) ? "" : sub_4e1f,
				((sub_4e1f2 = GLLib.TODO_sub_4e1f(n2)) == null) ? "" : sub_4e1f2, 7, 0);
	}

	static void sub_406d3(final String var_7ac4, final String var_7acc, final int n, final int n2) {
		sub_4074f();
		if (cGame.var_807c == 0) {
			sub_2000c(4, 30, true);
		}
		cGame.var_7b24 = 1;
		sub_2000c(4, 5, true);
		sub_2000c(4, 6, true);
		sub_2000c(4, 7, true);
		sub_2000c(4, 11, true);
		sub_2024d(4, 11, true);
		sub_4019a(7, 0, 10);
		cGame.var_7ac4 = var_7ac4;
		cGame.var_7acc = var_7acc;
		sub_81e0(19);
	}

	private static void sub_4074f() {
		sub_2000c(4, 1, false);
		sub_2000c(4, 3, false);
		sub_2000c(4, 4, false);
		sub_2024d(4, 4, false);
		sub_2000c(4, 5, false);
		sub_2000c(4, 6, false);
		sub_2000c(4, 7, false);
		sub_2000c(4, 10, false);
		sub_2000c(4, 11, false);
		sub_2024d(4, 11, false);
		sub_2000c(4, 12, false);
		sub_2000c(4, 13, false);
		sub_2000c(4, 15, false);
		sub_2000c(4, 16, false);
		sub_2000c(4, 30, false);
	}

	private static boolean sub_407ce(final int n) {
		if (n == 0) {
			sub_cc72();
			sub_23ac1(14, false);
			if (cGame.var_807c > 0 && cGame.var_807c <= 10 && cGame.var_6e34[cGame.var_807c - 1][5] == 0L) {
				cGame.var_6e34[cGame.var_807c - 1][5] = System.currentTimeMillis() / 1000L;
			}
			if (cGame.var_807c > 0 && cGame.var_807c <= 10) {
				sub_114a7(true, true, false);
				sub_10cd1(true);
			} else {
				sub_114a7(true, true, true);
			}
			sub_11320(false, null);
			sub_2000c(1, 60, false);
			sub_2024d(1, 60, false);
			addExperience(0);
			sub_40c81(0);
			sub_29e85();
			sub_29fce();
			cGame.var_70e4 &= 0xFFFFFFFE;
			final Class_f[] array = new Class_f[50];
			for (int sub_550f = Class_f.sub_550f(0, 54, 0, 63, array, 50), i = 0; i < sub_550f; ++i) {
				if (array[i] != null) {
					array[i].sub_85b3(16);
				}
			}
		}
		if (n == 1) {
			sub_2c69b();
			sub_1fb8e(1);
			if (cGame.var_6aac != null) {
				if (cGame.var_6aac.var_17c5 != 54) {
					sub_10dd3(true);
				}
			} else {
				if (cGame.var_807c > 0 && cGame.var_807c <= 10) {
					sub_114a7(true, true, false);
					sub_10cd1(false);
				} else {
					sub_114a7(true, true, true);
					sub_10cd1(false);
				}
				sub_10dd3(false);
			}
		}
		if (n == 8) {
			if (cGame.var_807c > 0 && cGame.var_807c <= 10) {
				if (cGame.var_6af4 > -1 && GLLib.sub_762d() && cGame.var_6f8c == -1
						&& (cGame.var_8024 == null
								|| (cGame.var_8024.var_17c5 != 49 && cGame.var_8024.var_17c5 != 52))
						&& sub_2c4ff() < 50) {
					sub_251a0(-1);
				}
				if (cGame.var_8014 != null) {
					switch (cGame.var_8014.var_17c5) {
					case 49: {
						if (cGame.var_8014.sub_6f71()) {
							return true;
						}
						break;
					}
					case 52: {
						if (cGame.var_8014.sub_790a()) {
							return true;
						}
						break;
					}
					}
				} else if (cGame.var_801c != null) {
					switch (cGame.var_801c.var_17c5) {
					case 49: {
						if (cGame.var_801c.sub_6fe6()) {
							return true;
						}
						break;
					}
					case 52: {
						if (cGame.var_801c.sub_7946()) {
							return true;
						}
						break;
					}
					}
				} else if (cGame.var_8024 != null) {
					switch (cGame.var_8024.var_17c5) {
					case 48: {
						if (sub_4ac19(12) || sub_4abbb(cGame.var_80f4[12])) {
							sub_2ec47(2, cGame.var_8024);
							return true;
						}
						break;
					}
					case 54: {
						if (cGame.var_8024.sub_7d78()) {
							return true;
						}
						break;
					}
					}
				}
			}
			if (cGame.var_802c == null && cGame.var_8004 != null && cGame.var_8004.sub_6533()) {
				return true;
			}
			cGame.var_800c.sub_67aa();
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 24 || sub_2b09 == 11) {
				if (sub_202b7(1, 37) && sub_20167(1, 37)) {
					sub_10922();
				} else if (sub_2b09 == 19) {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				} else if (sub_2b09 == 24) {
					final String sub_4e1f2;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f2 = GLLib.TODO_sub_4e1f(499)) == null) ? "" : sub_4e1f2));
				}
			}
			sub_253a8();
			sub_2edea();
			sub_26854();
			if (cGame.var_807c <= 10 && cGame.var_6e24[cGame.var_807c - 1][5] < 5
					&& System.currentTimeMillis() / 1000L - cGame.var_6e34[cGame.var_807c - 1][0] >= 86400L) {
				sub_40c81(5);
			}
			if (cGame.var_6c54) {
				sub_26c8e();
			}
		}
		if (n == 3) {
			sub_2534f();
			sub_2657c(true);
			sub_26716();
		}
		if (n == 5) {
			sub_2ec20();
			cGame.var_70e4 |= 0x1;
			Class_f.sub_6b3b(100);
			Class_f.sub_4921();
			Class_f.sub_48be();
			cGame.var_7fdc = true;
			cGame.var_6a14 = true;
			cGame.var_687c = null;
		}
		return false;
	}

	private static void sub_40c81(final int n) {
		if (cGame.var_807c <= 10) {
			if (cGame.var_6e24[cGame.var_807c - 1][5] == 5) {
				cGame.var_6e34[cGame.var_807c - 1][0] = System.currentTimeMillis() / 1000L;
			}
			cGame.var_6e24[cGame.var_807c - 1][5] = ((cGame.var_6e24[cGame.var_807c - 1][5] + n < 0) ? 0
					: ((cGame.var_6e24[cGame.var_807c - 1][5] + n > 5) ? 5
							: (cGame.var_6e24[cGame.var_807c - 1][5] + n)));
			cGame.var_68bc[1][34][6] = (short) cGame.var_6e24[cGame.var_807c - 1][5];
			if (cGame.var_6e24[cGame.var_807c - 1][5] == 0) {
				cGame.var_6e34[cGame.var_807c - 1][3] = System.currentTimeMillis() / 1000L;
				final int[] array = cGame.var_6e24[cGame.var_807c - 1];
				final int n2 = 2;
				array[n2] |= 0x10;
				sub_2b10b(cGame.var_807c - 1,
						Class_h.var_6a[24].var_82[cGame.var_6e24[cGame.var_807c - 1][1] / cGame.var_8064[25]][4]);
				if (sub_4ac19(2)) {
					cGame.var_6c54 = true;
					cGame.var_6c5c = 169;
					cGame.var_6c8c = (cGame.var_6c94 = false);
				}
			}
		}
	}

	private static boolean sub_40dc7(int n) {
		if (n == 0) {
			cGame.var_7b94 = sub_237d7(9, 0, 1, 11, 23, 66) + 10;
			sub_237d7(9, 0, 1, 15, 84, 137);
			sub_1daf4(9);
			if (cGame.var_7b9c != 4 && cGame.var_7b9c != 3) {
				cGame.var_7b3c = 0;
				cGame.var_7b44 = null;
				cGame.var_7b4c = null;
				cGame.var_7b54 = null;
				cGame.var_7b5c = null;
				cGame.var_7b64 = null;
				cGame.var_7b6c = null;
				cGame.var_7b74 = 0;
				final Class_h class_h = Class_h.var_6a[8];
				cGame.var_7b74 = 10;
				if (class_h != null) {
					cGame.var_7b44 = new int[cGame.var_7b74];
					cGame.var_7b4c = new int[cGame.var_7b74];
					cGame.var_7b54 = new int[cGame.var_7b74];
					cGame.var_7b5c = new int[cGame.var_7b74];
					cGame.var_7b64 = new int[cGame.var_7b74];
					cGame.var_7b6c = new int[cGame.var_7b74];
					for (int i = 0; i < cGame.var_7b74; ++i) {
						cGame.var_7b44[i] = class_h.var_82[i][0];
						cGame.var_7b4c[i] = class_h.var_82[i][2];
						cGame.var_7b54[i] = class_h.var_82[i][6];
						cGame.var_7b5c[i] = class_h.var_82[i][4];
						cGame.var_7b64[i] = class_h.var_82[i][5];
						cGame.var_7b6c[i] = class_h.var_82[i][9];
					}
				}
			} else {
				sub_2000c(9, 7, false);
				sub_2000c(9, 3, false);
				sub_2024d(9, 3, false);
			}
			cGame.var_7b7c = false;
			cGame.var_7b84 = 0;
			cGame.var_7b8c = 0;
			if (cGame.var_6c5c == 168) {
				cGame.var_6c94 = true;
			}
		}
		if (n == 1) {
			cGame.var_7b7c = false;
			cGame.var_7b84 = 0;
			cGame.var_7b8c = 0;
			sub_2000c(9, 67, false);
			if (cGame.var_7b9c != 4 && cGame.var_7b9c != 3) {
				sub_18189(true);
				sub_17fc1(true);
			} else {
				if (!cGame.var_699c) {
					sub_2000c(9, 10, true);
					sub_2c69b();
					sub_1fb8e(9);
					cGame.var_699c = true;
				}
				sub_2024d(9, 11, false);
				sub_2000c(9, 12, false);
				sub_2024d(9, 12, false);
				sub_2000c(9, 13, false);
				sub_2000c(9, 16, false);
				sub_2000c(9, 17, false);
				sub_2000c(9, 18, false);
				sub_2000c(9, 19, false);
				sub_2000c(9, 20, false);
				sub_2000c(9, 22, false);
				sub_2000c(9, 14, false);
				sub_2024d(9, 14, false);
				sub_2000c(9, 15, false);
				sub_2024d(9, 15, false);
				sub_2000c(9, 23, false);
				sub_2000c(9, 24, false);
				sub_2000c(9, 27, false);
				sub_2000c(9, 28, false);
				sub_2000c(9, 29, false);
				sub_2000c(9, 30, false);
				sub_2000c(9, 31, false);
				sub_2000c(9, 33, false);
				sub_2000c(9, 25, false);
				sub_2024d(9, 25, false);
				sub_2000c(9, 26, false);
				sub_2024d(9, 26, false);
				sub_2000c(9, 34, false);
				sub_2000c(9, 35, false);
				sub_2000c(9, 38, false);
				sub_2000c(9, 39, false);
				sub_2000c(9, 40, false);
				sub_2000c(9, 41, false);
				sub_2000c(9, 42, false);
				sub_2000c(9, 44, false);
				sub_2000c(9, 36, false);
				sub_2024d(9, 36, false);
				sub_2000c(9, 37, false);
				sub_2024d(9, 37, false);
				sub_2000c(9, 45, false);
				sub_2000c(9, 46, false);
				sub_2000c(9, 49, false);
				sub_2000c(9, 50, false);
				sub_2000c(9, 51, false);
				sub_2000c(9, 52, false);
				sub_2000c(9, 53, false);
				sub_2000c(9, 55, false);
				sub_2000c(9, 47, false);
				sub_2024d(9, 47, false);
				sub_2000c(9, 48, false);
				sub_2024d(9, 48, false);
				sub_2000c(9, 56, false);
				sub_2000c(9, 57, false);
				sub_2000c(9, 60, false);
				sub_2000c(9, 61, false);
				sub_2000c(9, 62, false);
				sub_2000c(9, 63, false);
				sub_2000c(9, 64, false);
				sub_2000c(9, 66, false);
				sub_2000c(9, 58, false);
				sub_2024d(9, 58, false);
				sub_2000c(9, 59, false);
				sub_2024d(9, 59, false);
				cGame.var_698c = false;
				int n2 = 0;
				for (int j = 0; j < cGame.var_7b74; ++j) {
					if (n2 < 5) {
						sub_41599(j, cGame.var_698c);
						++n2;
					}
				}
				sub_2000c(9, 5, false);
				sub_2000c(9, 6, true);
				sub_2024d(9, 68, true);
				sub_2000c(9, 69, true);
				sub_2024d(9, 69, true);
				sub_2000c(9, 70, true);
				sub_2000c(9, 84, true);
				sub_2024d(9, 84, true);
				sub_2000c(9, 85, true);
				sub_2000c(9, 99, true);
				sub_2024d(9, 99, true);
				sub_2000c(9, 100, true);
				sub_2000c(9, 114, true);
				sub_2024d(9, 114, true);
				sub_2000c(9, 115, true);
				sub_2000c(9, 129, true);
				sub_2024d(9, 129, true);
				sub_2000c(9, 130, true);
				sub_2c69b();
				sub_1fb8e(9);
				cGame.var_6994 = true;
			}
			if (cGame.var_698c) {
				sub_17fc1(true);
			}
			sub_2c69b();
			sub_1fb8e(9);
		}
		if (n == 5) {
			cGame.var_7b7c = false;
			cGame.var_7b84 = 0;
			cGame.var_7b8c = 0;
			sub_2000c(9, 67, false);
			cGame.var_7b9c = 1;
			cGame.var_7b3c = 0;
			cGame.var_7b44 = null;
			cGame.var_7b4c = null;
			cGame.var_7b54 = null;
			cGame.var_7b5c = null;
			cGame.var_7b64 = null;
			cGame.var_7b6c = null;
			cGame.var_7b74 = 0;
			cGame.var_698c = false;
			sub_239ef(9);
		}
		if (n == 2) {
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_17bbf();
			}
			if (cGame.var_6c5c != 160) {
				sub_26c8e();
			}
			if (cGame.var_698c) {
				if (cGame.var_6914[0] != null && !sub_2351a(0, 1)) {
					if (cGame.var_6914[0][8] < -cGame.var_7b94 && cGame.var_7b3c < cGame.var_7b74 - 5) {
						sub_418b1(1);
					} else if (cGame.var_6914[0][8] > -10 && cGame.var_7b3c > 0) {
						sub_418b1(-1);
					}
				}
				if (cGame.var_7b7c) {
					++cGame.var_7b84;
					cGame.var_68bc[9][67][2] = (short) (cGame.var_68bc[9][cGame.var_7b8c][2]
							+ 4 * cGame.var_7b84);
					cGame.var_68bc[9][67][3] = (short) (cGame.var_68bc[9][cGame.var_7b8c][3]
							+ cGame.var_7b84 * (cGame.var_7b84 >> 2));
					if (cGame.var_68bc[9][67][3] > GLLib.s_screenHeight) {
						cGame.var_7b7c = false;
						sub_234f2(cGame.var_7b84 = 0);
					}
				}
			}
		}
		if (n == 3) {
			sub_1dcc1(9);
			if (cGame.var_698c) {
				final String sub_4e1f;
				sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(157)) == null) ? "" : sub_4e1f, 9, 1, 0, 0);
				final int[] array = new int[4];
				cGame.var_68d4[cGame.var_68bc[9][11][5]].sub_3882(cGame.var_68bc[9][11][6], 0, array, 0);
				final int n3 = cGame.var_68bc[9][11][2] + array[0];
				final int n4 = cGame.var_68bc[9][11][3] + array[1];
				final int n5 = array[2];
				final int n6 = array[3];
				final int n7 = n5;
				final int n8 = n4;
				n = n3;
				GLLib.sub_36f4(GLLib.g, n, n8, n7, n6, true);
				int n9;
				String sub_4e1f2;
				String sub_4e1f3;
				for (n = 0; n < cGame.var_7b74 && n < 5; ++n) {
					n9 = n * 11;
					sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_7b4c[n + cGame.var_7b3c])) == null) ? ""
							: sub_4e1f2, 9, n9 + 13, 0, 0);
					if (getLevel() < cGame.var_7b54[n + cGame.var_7b3c]) {
						sub_1df06((((sub_4e1f3 = GLLib.TODO_sub_4e1f(447)) == null) ? "" : sub_4e1f3)
								+ Integer.toString(cGame.var_7b54[n + cGame.var_7b3c]), 9, n9 + 22, 0, 0);
					}
				}
				final int var_1ddf = GLLib.s_screenWidth;
				final int var_1de7 = GLLib.s_screenHeight;
				n = var_1ddf;
				GLLib.sub_36f4(GLLib.g, 0, 0, n, var_1de7, true);
			}
		}
		return false;
	}

	private static void sub_41599(final int n, final boolean b) {
		final int n3;
		final int n2 = (n3 = n * 11) + 21;
		final int n4 = n3 + 16;
		if (b) {
			cGame.var_68bc[9][n4][5] = (short) cGame.var_7b5c[cGame.var_7b3c + n];
			cGame.var_68bc[9][n4][6] = (short) cGame.var_7b64[cGame.var_7b3c + n];
			final boolean b2 = getLevel() < cGame.var_7b54[cGame.var_7b3c + n];
			final int n5 = n3 + 17;
			for (int n6 = n3 + 20, i = n5; i <= n6; ++i) {
				sub_2000c(9, i, !b2);
			}
			if (b2) {
				sub_2000c(9, n2, true);
				sub_2000c(9, n3 + 22, true);
				cGame.var_68bc[9][n4][8] = 1;
				cGame.var_68bc[9][n4][9] = 1;
				sub_2024d(9, n3 + 12, true);
			} else {
				sub_2000c(9, n2, false);
				sub_2000c(9, n3 + 22, false);
				cGame.var_68bc[9][n4][8] = 0;
				cGame.var_68bc[9][n4][9] = 1;
				sub_2024d(9, n3 + 12, true);
			}
			sub_2000c(9, n3 + 15, cGame.var_6e24[n + cGame.var_7b3c][3] != -1);
			cGame.var_68bc[9][n3 + 15][5] = 28;
			cGame.var_68bc[9][n3 + 15][6] = 1;
			sub_2000c(9, n3 + 14, cGame.var_6e24[n + cGame.var_7b3c][4] != -1);
			if (sub_20167(9, n3 + 14)) {
				final Class_h class_h = Class_h.var_6a[1];
				cGame.var_68bc[9][n3 + 14][5] = (short) class_h.var_82[cGame.var_6e24[n + cGame.var_7b3c][4]][3];
				cGame.var_68bc[9][n3 + 14][6] = (short) class_h.var_82[cGame.var_6e24[n + cGame.var_7b3c][4]][4];
			}
			final int n7 = cGame.var_7b3c + n;
			final int n8 = cGame.var_6e24[n7][1] / cGame.var_8064[25] / 3;
			sub_49db0(cGame.var_80bc[0] + n7, n8, 29, false);
			sub_2bae9(cGame.var_80bc[0] + n7, n8, 29);
			sub_2bae9(cGame.var_80bc[0] + n7, n8, 42);
			sub_2b081(9, n5, cGame.var_6e24[cGame.var_7b3c + n][1]);
			return;
		}
		sub_2000c(9, n2, false);
		sub_2000c(9, n3 + 22, false);
		cGame.var_68bc[9][n4][8] = 0;
		cGame.var_68bc[9][n4][9] = 1;
	}

	private static void sub_418b1(final int n) {
		cGame.var_7b3c += n;
		final int n2 = cGame.var_6914[0][8];
		for (int i = 0; i < 5; ++i) {
			sub_41599(i, true);
		}
		sub_2c69b();
		sub_1fb8e(9);
		cGame.var_6914[0][8] = n2 + (cGame.var_68bc[9][23][2] - cGame.var_68bc[9][12][2]) * n;
		sub_22d97(0);
	}

	private static void sub_41938(final int n) {
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + 1 > sub_2df26()) {
			sub_40658(471, 477);
			return;
		}
		if (sub_2da54(0, cGame.var_6e24[n + cGame.var_7b3c][3], 1)) {
			sub_41ad0(15 + n * 11, cGame.var_6e24[n + cGame.var_7b3c][3], true);
			sub_23a84(48);
			cGame.var_6e24[n + cGame.var_7b3c][3] = -1;
			cGame.var_6e34[n + cGame.var_7b3c][5] = System.currentTimeMillis() / 1000L;
			sub_49db0(cGame.var_80bc[0] + n + cGame.var_7b3c, 1, 37, false);
			sub_2b10b(n + cGame.var_7b3c,
					Class_h.var_6a[24].var_82[cGame.var_6e24[n + cGame.var_7b3c][1] / cGame.var_8064[25]][5]);
		}
	}

	private static void sub_41a13(int n) {
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) + 1 > sub_2df26()) {
			sub_40658(471, 477);
			return;
		}
		if (sub_2da54(0, cGame.var_6e24[n + cGame.var_7b3c][4], 1)) {
			sub_41ad0(14 + n * 11, cGame.var_6e24[n + cGame.var_7b3c][4], false);
			sub_41ad0(14 + n * 11, cGame.var_6e24[n + cGame.var_7b3c][4], false);
			sub_23a84(48);
			cGame.var_6e24[n + cGame.var_7b3c][4] = -1;
			sub_49db0(n = cGame.var_80bc[0] + cGame.var_7bb4, 1, 30, false);
			sub_2bae9(n, 1, 31);
		}
	}

	private static void sub_41ad0(final int var_7b8c, final int n, final boolean b) {
		final Class_h class_h = Class_h.var_6a[1];
		cGame.var_7b8c = var_7b8c;
		cGame.var_68bc[9][67][5] = (short) class_h.var_82[n][3];
		cGame.var_68bc[9][67][6] = (short) class_h.var_82[n][4];
		sub_2000c(9, 67, true);
		sub_2000c(9, var_7b8c, false);
		sub_234cb(0, 1);
		cGame.var_7b7c = true;
		cGame.var_7b84 = 0;
		cGame.var_68bc[9][67][2] = cGame.var_68bc[9][cGame.var_7b8c][2];
		cGame.var_68bc[9][67][3] = cGame.var_68bc[9][cGame.var_7b8c][3];
		if (b) {
			sub_2000c(9, var_7b8c, true);
			cGame.var_68bc[9][var_7b8c][5] = 1013;
			cGame.var_68bc[9][var_7b8c][6] = 0;
			sub_2386a(9, var_7b8c, 1, 1);
		}
	}

	private static void sub_41ba8(final int n) {
		if (getLevel() < cGame.var_7b54[cGame.var_7b3c + n]) {
			sub_23a84(56);
			return;
		}
		sub_23a84(61);
		sub_81e0(37);
		cGame.var_7bb4 = n + cGame.var_7b3c;
	}

	private static boolean sub_41bf9(int var_7bb4) {
		if (var_7bb4 == 0) {
			sub_1daf4(17);
			sub_41ff0();
			if (cGame.var_6e34[cGame.var_7bb4][2] == 0L && cGame.var_6e2c[cGame.var_7bb4][0] == 0) {
				sub_2b022(cGame.var_7bb4);
			}
			sub_2c69b();
			sub_1fb8e(17);
			sub_426c2();
		}
		if (var_7bb4 == 1) {
			sub_423b1();
			sub_2c69b();
			sub_1f8c5(17);
		}
		if (var_7bb4 == 5) {
			sub_239ef(17);
		}
		if (var_7bb4 == 2) {
			sub_426c2();
			final int sub_2b09;
			if ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11) {
				sub_182c6();
			}
			sub_d841(0);
		}
		if (var_7bb4 == 3) {
			sub_1dcc1(17);
			final String sub_4e1f;
			sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(157)) == null) ? "" : sub_4e1f, 17, 2, 0, 0);
			final String sub_4e1f2;
			sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_7b4c[cGame.var_7bb4])) == null) ? "" : sub_4e1f2, 17,
					11, 0, 0);
			var_7bb4 = cGame.var_7bb4;
			if (cGame.var_6e2c[var_7bb4][0] != 0) {
				final String sub_4e1f3;
				sub_1e2f2(((sub_4e1f3 = GLLib.TODO_sub_4e1f(746 + cGame.var_7bb4)) == null) ? "" : sub_4e1f3, 17, 17, 0,
						0);
				sub_1df06(Integer.toString(cGame.var_7bc4), 17, 18, 0, 0);
				sub_1df06(Integer.toString(cGame.var_7bcc), 17, 20, 0, 0);
				if (cGame.var_6e2c[cGame.var_7bb4][0] != 0) {
					final String sub_4e1f4;
					sub_1df06((((sub_4e1f4 = GLLib.TODO_sub_4e1f(cGame.var_7bd4)) == null) ? "" : sub_4e1f4) + " x"
							+ cGame.var_6e2c[cGame.var_7bb4][2], 17, 24, 0, 0);
					sub_1df06(Integer.toString(cGame.var_7bdc) + "/" + cGame.var_6e2c[cGame.var_7bb4][2], 17, 25,
							0, 0);
					if (cGame.var_68bc[17][27][10] >= 1) {
						sub_1df06(Integer.toString(cGame.var_7be4), 17, 28, 0, 0);
					}
				}
				if (cGame.var_6e2c[cGame.var_7bb4][3] != 0) {
					final String sub_4e1f5;
					sub_1df06((((sub_4e1f5 = GLLib.TODO_sub_4e1f(cGame.var_7bec)) == null) ? "" : sub_4e1f5) + " x"
							+ cGame.var_6e2c[cGame.var_7bb4][5], 17, 30, 0, 0);
					sub_1df06(Integer.toString(cGame.var_7bf4) + "/" + cGame.var_6e2c[cGame.var_7bb4][5], 17, 31,
							0, 0);
					if (cGame.var_68bc[17][33][10] >= 1) {
						sub_1df06(Integer.toString(cGame.var_7bfc), 17, 34, 0, 0);
					}
				}
				final String sub_4e1f6;
				sub_1df06(((sub_4e1f6 = GLLib.TODO_sub_4e1f(173)) == null) ? "" : sub_4e1f6, 17, 46, 0, 0);
				final String sub_4e1f7;
				sub_1df06(((sub_4e1f7 = GLLib.TODO_sub_4e1f(161)) == null) ? "" : sub_4e1f7, 17, 47, 0, 0);
			} else {
				final String sub_4e1f8;
				sub_1e2f2(((sub_4e1f8 = GLLib.TODO_sub_4e1f(cGame.var_7bbc)) == null) ? "" : sub_4e1f8, 17, 17, 0, 0);
				final String sub_4e1f9;
				sub_1e2f2(((sub_4e1f9 = GLLib.TODO_sub_4e1f(159)) == null) ? "" : sub_4e1f9, 17, 42, 0, 0);
			}
		}
		return false;
	}

	private static void sub_41ff0() {
		cGame.var_7bd4 = 0;
		cGame.var_7bdc = 0;
		cGame.var_7be4 = 0;
		cGame.var_7bec = 0;
		cGame.var_7bf4 = 0;
		cGame.var_7bfc = 0;
		if (cGame.var_6e2c[cGame.var_7bb4][0] != 0) {
			final Class_h class_h;
			cGame.var_7bc4 = (class_h = Class_h.var_6a[18]).var_82[getLevel() - 1][17];
			cGame.var_7bcc = class_h.var_82[getLevel() - 1][16];
			sub_2000c(17, 19, true);
			sub_2000c(17, 21, true);
			if (cGame.var_6e2c[cGame.var_7bb4][0] != 0) {
				cGame.var_7bd4 = sub_4244f(cGame.var_6e2c[cGame.var_7bb4][0],
						cGame.var_6e2c[cGame.var_7bb4][1]);
				cGame.var_7bdc = sub_424e1(cGame.var_6e2c[cGame.var_7bb4][0],
						cGame.var_6e2c[cGame.var_7bb4][1]);
				final int n = cGame.var_6e2c[cGame.var_7bb4][2];
				if (cGame.var_7bdc >= n) {
					sub_2000c(17, 26, true);
					sub_2000c(17, 27, false);
					sub_2024d(17, 27, false);
					sub_2000c(17, 29, false);
					cGame.var_7be4 = 0;
				} else {
					sub_2000c(17, 26, false);
					sub_2000c(17, 27, true);
					sub_2024d(17, 27, true);
					sub_2000c(17, 29, true);
					cGame.var_7be4 = (n - cGame.var_7bdc)
							* sub_42560(cGame.var_6e2c[cGame.var_7bb4][0], cGame.var_6e2c[cGame.var_7bb4][1]);
				}
			} else {
				sub_2000c(17, 26, false);
				sub_2000c(17, 27, false);
				sub_2024d(17, 27, false);
				sub_2000c(17, 29, false);
			}
			if (cGame.var_6e2c[cGame.var_7bb4][3] != 0) {
				cGame.var_7bec = sub_4244f(cGame.var_6e2c[cGame.var_7bb4][3],
						cGame.var_6e2c[cGame.var_7bb4][4]);
				cGame.var_7bf4 = sub_424e1(cGame.var_6e2c[cGame.var_7bb4][3],
						cGame.var_6e2c[cGame.var_7bb4][4]);
				final int n2 = cGame.var_6e2c[cGame.var_7bb4][5];
				if (cGame.var_7bf4 >= n2) {
					sub_2000c(17, 32, true);
					sub_2000c(17, 33, false);
					sub_2024d(17, 33, false);
					sub_2000c(17, 35, false);
					cGame.var_7bfc = 0;
				} else {
					sub_2000c(17, 32, false);
					sub_2000c(17, 33, true);
					sub_2024d(17, 33, true);
					sub_2000c(17, 35, true);
					cGame.var_7bfc = (n2 - cGame.var_7bf4)
							* sub_42560(cGame.var_6e2c[cGame.var_7bb4][3], cGame.var_6e2c[cGame.var_7bb4][4]);
				}
			} else {
				sub_2000c(17, 32, false);
				sub_2000c(17, 33, false);
				sub_2024d(17, 33, false);
				sub_2000c(17, 35, false);
			}
			sub_2000c(17, 44, true);
			sub_2024d(17, 44, true);
			sub_2000c(17, 45, true);
			if (cGame.var_7bdc >= cGame.var_6e2c[cGame.var_7bb4][2]
					&& cGame.var_7bf4 >= cGame.var_6e2c[cGame.var_7bb4][5]) {
				cGame.var_68bc[17][45][6] = 54;
				sub_2024d(17, 45, true);
			} else {
				cGame.var_68bc[17][45][6] = 55;
				sub_2024d(17, 45, false);
			}
		} else {
			sub_2000c(17, 19, false);
			sub_2000c(17, 21, false);
			sub_2000c(17, 26, false);
			sub_2000c(17, 27, false);
			sub_2024d(17, 27, false);
			sub_2000c(17, 29, false);
			sub_2000c(17, 32, false);
			sub_2000c(17, 33, false);
			sub_2024d(17, 33, false);
			sub_2000c(17, 35, false);
			sub_2000c(17, 44, false);
			sub_2000c(17, 45, false);
		}
		if (sub_4ac19(2) && cGame.var_7bb4 == 0) {
			sub_2000c(17, 50, true);
			sub_2024d(17, 3, false);
			sub_2024d(17, 8, false);
		} else {
			sub_2000c(17, 50, false);
			sub_2024d(17, 3, true);
			sub_2024d(17, 8, true);
		}
		cGame.var_68bc[17][22][5] = (short) cGame.var_7b5c[cGame.var_7bb4];
		cGame.var_68bc[17][22][6] = (short) cGame.var_7b64[cGame.var_7bb4];
		sub_423b1();
		sub_2c69b();
		sub_1fb8e(17);
	}

	private static void sub_423b1() {
		sub_2b081(17, 12, cGame.var_6e24[cGame.var_7bb4][1]);
		cGame.var_7bbc = 4
				- ((cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[25] / 3 < 0) ? 0
						: ((cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[25] / 3 > 4) ? 4
								: (cGame.var_6e24[cGame.var_7bb4][1] / cGame.var_8064[25] / 3)))
				+ 696 + 5 * cGame.var_7bb4;
	}

	private static int sub_4244f(final int n, final int n2) {
		int n3 = 0;
		switch (n) {
		case 1: {
			n3 = Class_h.var_6a[1].var_82[n2][2];
			break;
		}
		case 2: {
			n3 = Class_h.var_6a[4].var_82[n2][2];
			break;
		}
		case 3: {
			n3 = Class_h.var_6a[17].var_82[n2][2];
			break;
		}
		}
		return n3;
	}

	private static int sub_424e1(final int n, final int n2) {
		int n3 = 0;
		switch (n) {
		case 1: {
			n3 = sub_2e024(0, n2);
			break;
		}
		case 2: {
			n3 = sub_2e024(2, n2);
			break;
		}
		case 3: {
			n3 = getIntValue(cGame.var_79f4[n2]);
			break;
		}
		}
		return n3;
	}

	private static int sub_42560(final int n, final int n2) {
		int n3 = 0;
		switch (n) {
		case 1: {
			n3 = Class_h.var_6a[1].var_82[n2][15];
			break;
		}
		}
		return n3;
	}

	private static int sub_425b8(final int n) {
		final int n2 = cGame.var_6e2c[cGame.var_7bb4][n * 3];
		final int n3 = cGame.var_6e2c[cGame.var_7bb4][n * 3 + 1];
		switch (n2) {
		case 1: {
			sub_2da54(0, n3, cGame.var_6e2c[cGame.var_7bb4][n * 3 + 2] - sub_2e024(0, n3));
			break;
		}
		case 2: {
			sub_2da54(2, n3, cGame.var_6e2c[cGame.var_7bb4][n * 3 + 2] - sub_2e024(2, n3));
			break;
		}
		case 3: {
			cGame.var_79f4[n3] = sub_30161(getIntValue(cGame.var_79f4[n3]) + 1);
			break;
		}
		}
		sub_41ff0();
		return n2;
	}

	private static void sub_42685(final int n) {
		sub_2da54(0, cGame.var_6e2c[cGame.var_7bb4][n * 3 + 1], -cGame.var_6e2c[cGame.var_7bb4][n * 3 + 2]);
	}

	private static void sub_426c2() {
		final long n = System.currentTimeMillis() / 1000L;
		final long n2;
		if ((n2 = cGame.var_6e34[cGame.var_7bb4][4] + 86400L - n) <= 0L) {
			cGame.var_68bc[17][3][6] = 1;
			sub_2000c(17, 4, false);
			sub_23a3d(17, 3, 1);
			cGame.var_6e34[cGame.var_7bb4][4] = 0L;
		} else {
			cGame.var_68bc[17][3][6] = 4;
			cGame.var_68cc[17][4] = sub_db5b((int) ((n2 < 0L) ? 0L : ((n2 > 2147483647L) ? 2147483647L : n2)));
			sub_2000c(17, 4, true);
			sub_23a3d(17, 3, 0);
		}
		final long n3 = cGame.var_6e34[cGame.var_7bb4][0] + 86400L - n;
		if (cGame.var_6e24[cGame.var_7bb4][5] > 0) {
			sub_2000c(17, 7, false);
			sub_2000c(17, 6, true);
		} else {
			sub_2000c(17, 6, false);
			cGame.var_68cc[17][7] = sub_db5b((int) ((n3 < 0L) ? 0L : ((n3 > 2147483647L) ? 2147483647L : n3)));
			sub_2000c(17, 7, true);
			if (n3 <= 0L) {
				cGame.var_6e24[cGame.var_7bb4][5] = 5;
			}
		}
		final long n4;
		if ((n4 = cGame.var_6e34[cGame.var_7bb4][1] + 86400L - n) <= 0L) {
			cGame.var_68bc[17][8][6] = 0;
			sub_2000c(17, 9, false);
			sub_23a3d(17, 8, 1);
			return;
		}
		cGame.var_68bc[17][8][6] = 3;
		cGame.var_68cc[17][9] = sub_db5b((int) ((n4 < 0L) ? 0L : ((n4 > 2147483647L) ? 2147483647L : n4)));
		sub_2000c(17, 9, true);
		sub_23a3d(17, 8, 0);
	}

	private static boolean sub_428d1(int n) {
		if (n == 0) {
			if (cGame.var_711c == 15) {
				cGame.var_6a0c = false;
			}
			Class_f.sub_6b3b(100);
			GLLib.Pack_Open("/5");
			sub_d2e8(0, 3);
			GLLib.Pack_FullyClose();
			switch (cGame.var_711c) {
			case 0:
			case 15: {
				sub_d500(0, 100, 1, 0, 24, 0, -1);
				sub_d500(0, 97, 1, 0, 24, 0, -1);
				sub_d500(0, 81, 1, 0, 24, 0, -1);
				sub_d500(0, 101, 1, 0, 24, 0, -1);
				break;
			}
			case 1:
			case 17: {
				sub_d500(0, 86, 1, 0, 24, 0, -1);
				break;
			}
			case 2:
			case 19: {
				sub_d500(0, 99, 1, 0, 24, 0, -1);
				break;
			}
			}
			GLLib.Pack_Open("/5");
			sub_d2e8(0, 3);
			GLLib.Pack_FullyClose();
			GLLib.Pack_Open("/10");
			final byte[] sub_3253 = GLLib.Pack_ReadData(cGame.var_711c);
			GLLib.Pack_FullyClose();
			int n2 = 0;
			final byte sub_3e92 = GLLib.Mem_GetByte(sub_3253, 0);
			++n2;
			for (byte b = 0; b < sub_3e92; ++b) {
				n2 += 2;
				final byte sub_3e93 = GLLib.Mem_GetByte(sub_3253, n2);
				++n2;
				for (byte b2 = 0; b2 < sub_3e93; ++b2) {
					final byte sub_3e94 = GLLib.Mem_GetByte(sub_3253, n2);
					++n2;
					short sub_3eb0 = 0;
					switch (sub_3e94) {
					case 0:
					case 1: {
						++n2;
						break;
					}
					case 2: {
						++n2;
						sub_3eb0 = GLLib.sub_3eb0(sub_3253, n2);
						n2 += 2;
						break;
					}
					}
					cGame.var_7124 = GLLib.sub_3eb0(sub_3253, n2);
					n2 += 2;
					if (b2 == 0) {
						cGame.var_710c = new short[cGame.var_7124][];
						cGame.var_7114 = new int[cGame.var_7124][];
						cGame.var_7104 = new short[cGame.var_7124];
					}
					for (int i = 0; i < cGame.var_7124; ++i) {
						final short sub_3eb2 = GLLib.sub_3eb0(sub_3253, n2);
						n2 += 2;
						int n4 = 0;
						Label_0622: {
							final short n3;
							if ((n3 = sub_3eb2) != 0) {
								for (int j = 1; j < cGame.var_7104.length; ++j) {
									if (cGame.var_7104[j] == n3 || cGame.var_7104[j] == 0) {
										n4 = j;
										break Label_0622;
									}
									if (cGame.var_7104[j] > n3) {
										final int n5 = j;
										final short[][] var_710c = cGame.var_710c;
										final int[][] var_7114 = cGame.var_7114;
										final short[] var_7115 = cGame.var_7104;
										final int n6;
										cGame.var_710c = new short[n6 = var_710c.length + 1][];
										cGame.var_7114 = new int[n6][];
										cGame.var_7104 = new short[n6];
										for (int k = 0; k < n6 - 1; ++k) {
											if (k < n5) {
												cGame.var_710c[k] = var_710c[k];
												cGame.var_7114[k] = var_7114[k];
												cGame.var_7104[k] = var_7115[k];
											} else {
												cGame.var_710c[k + 1] = var_710c[k];
												cGame.var_7114[k + 1] = var_7114[k];
												cGame.var_7104[k + 1] = var_7115[k];
											}
										}
										n4 = j;
										break Label_0622;
									}
								}
							}
							n4 = 0;
						}
						final int n7 = n4;
						cGame.var_7104[n7] = sub_3eb2;
						if (cGame.var_70fc < cGame.var_7104[n7] + 1) {
							cGame.var_70fc = (short) (cGame.var_7104[n7] + 1);
						}
						final byte sub_3e95 = GLLib.Mem_GetByte(sub_3253, n2);
						++n2;
						if (cGame.var_710c[n7] == null) {
							cGame.var_710c[n7] = new short[sub_3e95];
							cGame.var_7114[n7] = new int[sub_3e95 * 6];
						} else {
							final int n8 = n7;
							final byte b3 = sub_3e95;
							final int n9 = n8;
							final short[] array = cGame.var_710c[n9];
							final int[] array2 = cGame.var_7114[n9];
							cGame.var_710c[n9] = new short[b3 + array.length];
							cGame.var_7114[n9] = new int[(b3 + array.length) * 6];
							for (int l = 0; l < array.length; ++l) {
								cGame.var_710c[n9][l] = array[l];
								for (int n10 = 0; n10 < 6; ++n10) {
									cGame.var_7114[n9][l * 6 + n10] = array2[l * 6 + n10];
								}
							}
						}
						int length;
						for (int n11 = (length = cGame.var_710c[n7].length) - sub_3e95; n11 < length; ++n11) {
							final byte sub_3e96 = GLLib.Mem_GetByte(sub_3253, n2);
							++n2;
							cGame.var_710c[n7][n11] = sub_3e96;
							switch (sub_3e96) {
							case 116: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								break;
							}
							case 102:
							case 107: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 106: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 110: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 103:
							case 104:
							case 105:
							case 108:
							case 109: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 3] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 111: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 112: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 113: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								break;
							}
							case 21: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 22: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.Mem_GetByte(sub_3253, n2);
								++n2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.Mem_GetByte(sub_3253, n2);
								++n2;
								break;
							}
							case 11: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 12: {
								cGame.var_7114[n7][n11 * 6] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 114: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							case 115: {
								cGame.var_7114[n7][n11 * 6] = sub_3eb0;
								cGame.var_7114[n7][n11 * 6 + 1] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								cGame.var_7114[n7][n11 * 6 + 2] = GLLib.sub_3eb0(sub_3253, n2);
								n2 += 2;
								break;
							}
							}
						}
					}
				}
			}
			cGame.var_7124 = cGame.var_7104.length;
			sub_cd28(cGame.var_711c + 1);
			GLLib.Pack_Open("/5");
			if (cGame.var_7fe4 != 7) {
				cGame.var_7ff4[81] = sub_ca9c(81, 1, true, false, 0, -1);
			}
			GLLib.Pack_FullyClose();
			sub_2f549();
		}
		if (n == 8 && GLLib.sub_762d() && cGame.var_711c != 17) {
			while (cGame.var_70ec < cGame.var_7124) {
				for (int n12 = 0; n12 < cGame.var_710c[cGame.var_70ec].length; ++n12) {
					switch (cGame.var_710c[cGame.var_70ec][n12]) {
					case 11: {
						cGame.var_800c.var_17cd = cGame.var_7114[cGame.var_70ec][n12 * 6];
						cGame.var_800c.var_17d5 = cGame.var_7114[cGame.var_70ec][n12 * 6 + 1];
						break;
					}
					case 114: {
						final Class_f sub_53db;
						(sub_53db = Class_f.sub_53db(0,
								cGame.var_7114[cGame.var_70ec][n12 * 6])).var_17cd = cGame.var_800c.var_17cd
										+ cGame.var_7114[cGame.var_70ec][n12 * 6 + 1];
						sub_53db.var_17d5 = cGame.var_800c.var_17d5 + cGame.var_7114[cGame.var_70ec][n12 * 6 + 2];
						break;
					}
					case 12: {
						cGame.var_800c.var_17cd = cGame.var_800c.var_1845 - (GLLib.s_screenWidth >> 1);
						cGame.var_800c.var_17d5 = cGame.var_800c.var_184d - (GLLib.s_screenHeight >> 1);
						break;
					}
					case 111:
					case 115: {
						final Class_f sub_53db2;
						final Class_f class_f = sub_53db2 = Class_f.sub_53db(0,
								cGame.var_7114[cGame.var_70ec][n12 * 6]);
						class_f.var_17cd = class_f.var_1845;
						sub_53db2.var_17d5 = sub_53db2.var_184d;
						break;
					}
					case 104:
					case 109: {
						final Class_f[] array3 = new Class_f[2];
						Class_f.sub_545c(0, cGame.var_7114[cGame.var_70ec][n12 * 6],
								cGame.var_7114[cGame.var_70ec][n12 * 6 + 1], array3, 1);
						switch (array3[0].var_17c5) {
						case 13: {
							array3[0].sub_6adb(array3[0].var_1845 - (GLLib.s_screenWidth >> 1),
									array3[0].var_184d - (GLLib.s_screenHeight >> 1));
							continue;
						}
						default: {
							array3[0].var_17cd = array3[0].var_1845;
							array3[0].var_17d5 = array3[0].var_184d;
							continue;
						}
						}

					}
					}
				}
				sub_30117();
			}
		}
		if (n == 2) {
			if (GLLib.IsAnyKeyDown() == 19) {
				final String sub_4e1f;
				sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
			}
			sub_253a8();
			sub_2fdb1();
		}
		if (n == 3) {
			sub_2534f();
			sub_2657c(false);
			sub_26716();
		}
		if (n == 5) {
			if (cGame.var_711c == 19) {
				Class_f.sub_7898();
				final int n13 = 0;
				final int n14 = 1;
				final int n15 = 15;
				final int n16 = n14;
				n = n13;
				sub_49db0(n13, n16, n15, false);
				sub_2bae9(0, 1, 15);
			}
			sub_2f45d();
		}
		return false;
	}

	private static int sub_43709(final int n) {
		for (int i = 0; i < cGame.var_7c0c.length; ++i) {
			if (cGame.var_7c0c[i][1] == n && GLLib.s_pack_filename.equals("/" + cGame.var_7c0c[i][0])) {
				return cGame.var_7c0c[i][2];
			}
		}
		return -1;
	}

	private static boolean sub_4378f(final ASprite class_e, final int n) {
		int i = 0;
		boolean b = false;
		Label_0141: do {
			final int[] var_7c14 = cGame.var_7c14;
			int j = i;
			final int[] array = var_7c14;
			while (true) {
				while (j < array.length) {
					if (n == array[j + 1]) {
						final int n3;
						final int n2 = n3 = j;
						i = n3;
						if (n2 < 0) {
							continue Label_0141;
						}
						final int k = cGame.var_7c14[i];
						final int n4 = cGame.var_7c14[i + 2];
						final int n5 = cGame.var_7c14[i + 3];
						final int n6 = cGame.var_7c14[i + 4];
						final int n7 = cGame.var_7c14[i + 5];
						i += 6;
						if (GLLib.s_pack_filename.equals("/" + k)) {
							class_e.sub_68e7(n6, n4, n5);
							if (n7 != 0) {
								class_e.sub_2f84();
							}
							b = true;
							continue Label_0141;
						}
						continue Label_0141;
					} else {
						j += 6;
					}
				}
				int n3;
				final int n2 = n3 = -1;
				continue;
			}
		} while (i >= 0);
		return b;
	}

	public static boolean sub_438b0(final int n) {
		for (int i = 0; i < cGame.var_7c1c.length; ++i) {
			if (cGame.var_7c1c[i] == n) {
				return true;
			}
		}
		return false;
	}

	private static String sub_43907(final int n) {
		final String sub_4e1f;
		String s = ((sub_4e1f = GLLib.TODO_sub_4e1f((cGame.var_7cdc == 3) ? 797
				: ((cGame.var_7cdc == 4) ? 800
						: ((cGame.var_7cdc == 10) ? 841
								: ((cGame.var_7cdc == 11) ? 846
										: ((cGame.var_7cdc == 2) ? 798
												: ((cGame.var_7cdc == 6) ? 856
														: ((cGame.var_7cdc != 0) ? 799 : 796)))))))) == null) ? ""
																: sub_4e1f;
		if (cGame.var_7cdc == 3) {
			s = GLLib.sub_547c(s, "%num", cGame.var_7c54[n]);
		} else {
			if (cGame.var_7cdc != 10) {
				if (cGame.var_7cdc == 11) {
					s = GLLib.sub_547c(s, "%amount", GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[n], cGame.var_7fe4, " "));
				} else if (cGame.var_7cdc == 6) {
					int sub_7965;
					if (cGame.var_7d04[n] == -1) {
						sub_7965 = GLLib.IAP_GetPrice(n, "Cash");
						cGame.var_7d04[n] = sub_7965;
					} else {
						sub_7965 = cGame.var_7d04[n];
					}
					if (sub_7965 == 1) {
						final String sub_4e1f2;
						s = GLLib.sub_547c(s, "%price", sub_45928(cGame.var_7c54[n])) + " "
								+ (((sub_4e1f2 = GLLib.TODO_sub_4e1f(853)) == null) ? "" : sub_4e1f2);
						return s;
					}
					final String sub_4e1f3;
					s = GLLib.sub_547c(s, "%price", sub_45928(cGame.var_7c54[n])) + " "
							+ (((sub_4e1f3 = GLLib.TODO_sub_4e1f(785)) == null) ? "" : sub_4e1f3);
					return s;
				} else {
					if (cGame.var_7cdc == 0) {
						return s;
					}
					if (cGame.var_7cdc == 2) {
						s = GLLib.sub_547c(s, "%num", "1");
					}
				}
			}
			s = GLLib.sub_547c(s, "%price", sub_45928(cGame.var_7c54[n]));
		}
		return s;
	}

	private static boolean sub_43b80(final int n) {
		if (n == 0) {
			cGame.var_7c3c = false;
			boolean b = true;
			boolean b2 = false;
			boolean b3 = false;
			if (sub_83cf() == 42) {
				cGame.var_67cc = 1;
				sub_2c69b();
			} else {
				switch (cGame.var_7c24) {
				case 1: {
					final String sub_4e1f;
					cGame.var_7c2c = (((sub_4e1f = GLLib.TODO_sub_4e1f(74)) == null) ? "" : sub_4e1f);
					b3 = true;
					break;
				}
				case 11: {
					final String sub_4e1f2;
					cGame.var_7c2c = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(795)) == null) ? "" : sub_4e1f2);
					b3 = true;
					break;
				}
				case 2: {
					final String sub_4e1f3;
					cGame.var_7c2c = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(777)) == null) ? "" : sub_4e1f3);
					b3 = true;
					break;
				}
				case 3: {
					cGame.var_7c2c = sub_43907(0);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 4: {
					cGame.var_7c2c = sub_43907(1);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 5: {
					cGame.var_7c2c = sub_43907(2);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 6: {
					cGame.var_7c2c = sub_43907(3);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 7: {
					cGame.var_7c2c = sub_43907(4);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 8: {
					cGame.var_7c2c = sub_43907(5);
					b3 = true;
					cGame.var_7c3c = true;
					break;
				}
				case 10: {
					final String sub_4e1f4;
					cGame.var_7c2c = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(773)) == null) ? "" : sub_4e1f4);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 9: {
					final String sub_4e1f5;
					cGame.var_7c2c = (((sub_4e1f5 = GLLib.TODO_sub_4e1f(772)) == null) ? "" : sub_4e1f5);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 12: {
					final String sub_4e1f6;
					cGame.var_7c2c = (((sub_4e1f6 = GLLib.TODO_sub_4e1f(444)) == null) ? "" : sub_4e1f6);
					b3 = true;
					break;
				}
				case 13: {
					if (sub_83cf() == 4) {
						final String sub_4e1f7;
						cGame.var_7c2c = (((sub_4e1f7 = GLLib.TODO_sub_4e1f(514)) == null) ? "" : sub_4e1f7);
						break;
					}
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 14: {
					final String sub_4e1f8;
					cGame.var_7c2c = (((sub_4e1f8 = GLLib.TODO_sub_4e1f(513)) == null) ? "" : sub_4e1f8);
					b3 = true;
					break;
				}
				case 15: {
					final String sub_4e1f9;
					cGame.var_7c2c = GLLib.sub_547c(((sub_4e1f9 = GLLib.TODO_sub_4e1f(508)) == null) ? "" : sub_4e1f9,
							"%d", "" + 0);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 16: {
					final String sub_4e1f10;
					cGame.var_7c2c = GLLib
							.sub_547c(((sub_4e1f10 = GLLib.TODO_sub_4e1f(507)) == null) ? "" : sub_4e1f10, "%d", "" + 0);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 17: {
					final String sub_4e1f11;
					cGame.var_7c2c = (((sub_4e1f11 = GLLib.TODO_sub_4e1f(509)) == null) ? "" : sub_4e1f11);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 18: {
					final String sub_4e1f12;
					cGame.var_7c2c = (((sub_4e1f12 = GLLib.TODO_sub_4e1f(510)) == null) ? "" : sub_4e1f12);
					b = false;
					b2 = true;
					b3 = true;
					break;
				}
				case 20: {
					final String sub_4e1f13;
					cGame.var_7c2c = (((sub_4e1f13 = GLLib.TODO_sub_4e1f(802)) == null) ? "" : sub_4e1f13);
					b = true;
					b2 = false;
					b3 = true;
					break;
				}
				default: {
					final String sub_4e1f14;
					cGame.var_7c2c = (((sub_4e1f14 = GLLib.TODO_sub_4e1f(446)) == null) ? "" : sub_4e1f14);
					break;
				}
				}
				sub_1daf4(27);
				sub_2000c(27, 1, b3);
				if (cGame.var_7c3c) {
					cGame.var_68cc[27][5] = cGame.var_7c2c;
					sub_2000c(27, 2, false);
					sub_2000c(27, 3, false);
					sub_2000c(27, 4, true);
					sub_2000c(27, 5, true);
					sub_2000c(27, 16, true);
					sub_2024d(27, 16, true);
					if (cGame.var_7cdc != 11) {
						sub_2000c(27, 17, true);
						final String sub_4e1f15;
						cGame.var_68cc[27][17] = (((sub_4e1f15 = GLLib.TODO_sub_4e1f(851)) == null) ? "" : sub_4e1f15);
					}
					if (cGame.var_7cdc == 4) {
						sub_2000c(27, 12, true);
						sub_2024d(27, 12, true);
						sub_2000c(27, 13, true);
						final String sub_4e1f16;
						cGame.var_68cc[27][13] = (((sub_4e1f16 = GLLib.TODO_sub_4e1f(838)) == null) ? "" : sub_4e1f16);
						b = false;
						b2 = false;
					} else if (cGame.var_7cdc == 2 || cGame.var_7cdc == 5) {
						sub_2000c(27, 12, true);
						sub_2024d(27, 12, true);
						sub_2000c(27, 13, true);
						final String sub_4e1f17;
						cGame.var_68cc[27][13] = (((sub_4e1f17 = GLLib.TODO_sub_4e1f(127)) == null) ? "" : sub_4e1f17);
						sub_2000c(27, 14, true);
						sub_2024d(27, 14, true);
						sub_2000c(27, 15, true);
						final String sub_4e1f18;
						cGame.var_68cc[27][15] = (((sub_4e1f18 = GLLib.TODO_sub_4e1f(767)) == null) ? "" : sub_4e1f18);
						b = false;
						b2 = false;
					}
				} else {
					cGame.var_68cc[27][3] = cGame.var_7c2c;
					sub_2000c(27, 4, false);
					sub_2000c(27, 5, false);
					sub_2000c(27, 2, true);
					sub_2000c(27, 3, true);
					sub_2000c(27, 16, false);
					sub_2024d(27, 16, false);
					sub_2000c(27, 12, false);
					sub_2024d(27, 12, true);
					sub_2000c(27, 13, false);
					sub_2000c(27, 14, false);
					sub_2024d(27, 14, false);
					sub_2000c(27, 15, false);
					sub_2000c(27, 17, false);
				}
				if (b) {
					switch (cGame.var_7c24) {
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8: {
						if (cGame.var_7cdc == 11) {
							final String sub_4e1f19;
							cGame.var_68cc[27][7] = (((sub_4e1f19 = GLLib.TODO_sub_4e1f(848)) == null) ? ""
									: sub_4e1f19);
							final String sub_4e1f20;
							cGame.var_68cc[27][9] = (((sub_4e1f20 = GLLib.TODO_sub_4e1f(847)) == null) ? ""
									: sub_4e1f20);
							break;
						}
						if (cGame.var_7cdc == 10) {
							final String sub_4e1f21;
							cGame.var_68cc[27][7] = (((sub_4e1f21 = GLLib.TODO_sub_4e1f(843)) == null) ? ""
									: sub_4e1f21);
							final String sub_4e1f22;
							cGame.var_68cc[27][9] = (((sub_4e1f22 = GLLib.TODO_sub_4e1f(842)) == null) ? ""
									: sub_4e1f22);
							break;
						}
						if (cGame.var_7cdc == 6) {
							final String sub_4e1f23;
							cGame.var_68cc[27][7] = (((sub_4e1f23 = GLLib.TODO_sub_4e1f(845)) == null) ? ""
									: sub_4e1f23);
							final String sub_4e1f24;
							cGame.var_68cc[27][9] = (((sub_4e1f24 = GLLib.TODO_sub_4e1f(844)) == null) ? ""
									: sub_4e1f24);
							break;
						}
						final String sub_4e1f25;
						cGame.var_68cc[27][7] = (((sub_4e1f25 = GLLib.TODO_sub_4e1f(850)) == null) ? "" : sub_4e1f25);
						final String sub_4e1f26;
						cGame.var_68cc[27][9] = (((sub_4e1f26 = GLLib.TODO_sub_4e1f(849)) == null) ? "" : sub_4e1f26);
						break;
					}
					default: {
						final String sub_4e1f27;
						cGame.var_68cc[27][7] = (((sub_4e1f27 = GLLib.TODO_sub_4e1f(31)) == null) ? "" : sub_4e1f27);
						final String sub_4e1f28;
						cGame.var_68cc[27][9] = (((sub_4e1f28 = GLLib.TODO_sub_4e1f(30)) == null) ? "" : sub_4e1f28);
						break;
					}
					}
					sub_2000c(27, 6, true);
					sub_2024d(27, 6, true);
					sub_2000c(27, 7, true);
					sub_2000c(27, 8, true);
					sub_2024d(27, 8, true);
					sub_2000c(27, 9, true);
					sub_2000c(27, 10, false);
					sub_2024d(27, 10, false);
					sub_2000c(27, 11, false);
				} else if (b2) {
					final String sub_4e1f29;
					cGame.var_68cc[27][11] = (((sub_4e1f29 = GLLib.TODO_sub_4e1f(45)) == null) ? "" : sub_4e1f29);
					sub_2000c(27, 6, false);
					sub_2024d(27, 6, false);
					sub_2000c(27, 7, false);
					sub_2000c(27, 8, false);
					sub_2024d(27, 8, false);
					sub_2000c(27, 9, false);
					sub_2000c(27, 10, true);
					sub_2024d(27, 10, true);
					sub_2000c(27, 11, true);
				}
			}
		}
		if (n == 1) {
			sub_2c69b();
			sub_1fb8e(27);
		}
		final int sub_2b09;
		if (n == 2 && ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11)) {
			if (sub_20167(27, 16)) {
				sub_1c635();
			} else if (sub_20167(27, 6)) {
				sub_1c523();
			} else if (sub_20167(27, 10)) {
				sub_1c546();
			}
		}
		if (n == 3) {
			sub_1dcc1(27);
		}
		return false;
	}

	private static void sub_4474a() {
		cGame.var_7c2c = "";
		switch (cGame.var_7c24) {
		case 1: {
			GLLib.s_game_state = -1;
			return;
		}
		case 2: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.sub_77ca();
			sub_177a2();
			sub_1749c();
			return;
		}
		case 3: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[0], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 4: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[1], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 5: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[2], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 6: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[3], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 7: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[4], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 8: {
			cGame.var_67cc = 1;
			sub_2c69b();
			GLLib.IAP_SendRequest(cGame.var_7cfc[5], "Cash");
			cGame.var_6944 = false;
			return;
		}
		case 11: {
			sub_8370(cGame.var_7c34);
			cGame.var_694c = 2;
			return;
		}
		case 12: {
			cGame.var_6aac = null;
			cGame.var_6b5c = null;
			cGame.var_76a4 = false;
			cGame.var_76ac = 0;
			cGame.var_76b4 = '\0';
			cGame.var_76bc = '\0';
			cGame.var_7514 = 3;
			cGame.var_751c = 0;
			cGame.var_7524 = 0;
			cGame.var_752c = null;
			cGame.var_7534 = null;
			cGame.var_753c = null;
			cGame.var_7544 = null;
			cGame.var_754c = null;
			cGame.var_7554 = null;
			cGame.var_755c = null;
			cGame.var_7564 = null;
			cGame.var_756c = null;
			cGame.var_7574 = null;
			cGame.var_757c = false;
			cGame.var_7584 = 0;
			cGame.var_758c = 0;
			cGame.var_7594 = null;
			cGame.var_759c = null;
			cGame.var_75a4 = null;
			cGame.var_75ac = null;
			cGame.var_75b4 = null;
			cGame.var_75bc = null;
			cGame.var_75c4 = null;
			cGame.var_75cc = null;
			cGame.var_75d4 = true;
			cGame.var_75dc = 0;
			cGame.var_75e4 = 0;
			cGame.var_746c = 3;
			cGame.var_747c = 0;
			cGame.var_7484 = 0;
			cGame.var_748c = null;
			cGame.var_7494 = null;
			cGame.var_749c = null;
			cGame.var_74a4 = null;
			cGame.var_74ac = null;
			cGame.var_74b4 = null;
			cGame.var_74bc = null;
			cGame.var_74cc = null;
			cGame.var_74d4 = null;
			cGame.var_74dc = false;
			cGame.var_72f4 = null;
			cGame.var_72fc = null;
			cGame.var_7354 = true;
			cGame.var_735c = 0;
			cGame.var_7364 = 0;
			cGame.var_743c = false;
			cGame.var_7444 = 0;
			cGame.var_744c = '\0';
			cGame.var_7454 = '\0';
			cGame.var_7784 = false;
			cGame.var_77e4 = 0;
			cGame.var_77ec = 0;
			cGame.var_77bc = 0L;
			cGame.var_77fc = 0L;
			cGame.var_7804 = "";
			cGame.var_780c = 0;
			cGame.var_7814 = false;
			cGame.var_781c = 0;
			cGame.var_7824 = 0;
			cGame.var_782c = 0;
			cGame.var_7834 = "";
			cGame.var_783c = "";
			cGame.var_7844 = false;
			cGame.var_784c = "";
			sub_492fc();
			cGame.var_6d54 = 0;
			cGame.var_6d74 = 0;
			cGame.var_6d7c = 0;
			cGame.var_6d84 = 0;
			cGame.var_6d8c = 0;
			cGame.var_6d94 = sub_301bd(0L);
			cGame.var_6d9c = sub_301bd(0L);
			cGame.var_6da4 = sub_30161(0);
			cGame.var_6dac = sub_30161(0);
			cGame.var_6db4 = sub_30161(0);
			cGame.var_6dbc = sub_30161(0);
			cGame.var_6dc4 = sub_30161(0);
			cGame.var_6dcc = sub_30161(0);
			cGame.var_6dd4 = false;
			cGame.var_6ddc = 0;
			cGame.var_6de4 = 0;
			cGame.var_6df4 = false;
			cGame.var_6e0c = false;
			cGame.var_6e14 = false;
			cGame.var_6e1c = 0L;
			cGame.var_7a54 = 0L;
			cGame.var_7a64 = 0;
			cGame.var_7a6c = 0;
			cGame.var_7a7c = 0;
			cGame.var_7a84 = 0;
			cGame.var_7a8c = false;
			cGame.var_7a34 = 0;
			cGame.var_7a3c = 0;
			for (int i = 0; i < 60; ++i) {
				cGame.var_79f4[i] = sub_30161(0);
			}
			for (int j = 0; j < 4; ++j) {
				cGame.var_7a24[j] = 0;
			}
			cGame.var_79ec = 0;
			cGame.var_7a2c = 0;
			cGame.var_7a8c = false;
			cGame.var_6fcc = null;
			cGame.var_6fd4 = 0;
			cGame.var_6fdc = false;
			sub_24088();
			cGame.var_7da4 = 0L;
			cGame.var_7064 = 0;
			sub_2e1e1(5000);
			sub_2e208(50);
			sub_3021b(false);
			sub_29de8();
			cGame.var_687c = null;
			cGame.var_681c = cGame.var_6804;
			sub_b76e();
			GLLib.var_1e17 = 1;
			sub_8281(17);
			sub_e522(true);
			cGame.var_7a9c = true;
			cGame.var_6864 = true;
			for (int k = 0; k <= 10; ++k) {
				try {
					RecordStore.deleteRecordStore("save_farm" + k);
				} catch (final RecordStoreException ex) {
				}
			}
			return;
		}
		case 13: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 14: {
			return;
		}
		case 20: {
			GLLib.sub_7903();
			sub_45ea9();
			sub_1715b();
			sub_16bcb();
			sub_174e9();
			sub_17536();
			sub_177a2();
			sub_17ace();
			sub_179fb();
			sub_16c4d();
			cGame.var_692c = false;
			sub_16d6a();
			break;
		}
		}
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_44b9b() {
		cGame.var_7c2c = "";
		switch (cGame.var_7c24) {
		case 1: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 2: {
			cGame.var_67cc = 1;
			sub_2c69b();
			sub_17536();
			sub_175b0();
			return;
		}
		case 3: {
			cGame.var_7d24 = true;
			break;
		}
		case 4: {
			cGame.var_7d24 = true;
			break;
		}
		case 5: {
			cGame.var_7d24 = true;
			break;
		}
		case 6: {
			cGame.var_7d24 = true;
			break;
		}
		case 7: {
			cGame.var_7d24 = true;
			break;
		}
		case 8: {
			cGame.var_7d24 = true;
			break;
		}
		case 11: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 12: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 13: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 14: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		case 20: {
			cGame.var_67cc = 1;
			sub_2c69b();
			return;
		}
		}
		cGame.var_67cc = 1;
		sub_2c69b();
	}

	private static void sub_44ced(final int var_7c24) {
		cGame.var_7c24 = var_7c24;
		sub_81e0(42);
	}

	private static void sub_44d11() {
		cGame.var_7c9c = GLLib.sub_78c7();
		final short n = cGame.var_68bc[8][156][5];
		final short n2 = cGame.var_68bc[8][156][6];
		final short n3 = cGame.var_68bc[8][156][7];
		final short[] sub_4ac6 = cGame.var_7ffc[sub_237ff(n3)].sub_4ac6(cGame.var_7c9c, n, false);
		final ASprite class_e = cGame.var_7ffc[sub_237ff(n3)];
		final short n4 = sub_4ac6[0];
		final ASprite class_e2 = class_e;
		if ((cGame.var_7d34 = n4 * class_e2.sub_4a3a() + (n4 - 1) * class_e2.sub_490a() - n2 + 24) < 0) {
			cGame.var_7d34 = 0;
		}
		cGame.var_7d2c = 0;
	}

	private static boolean sub_44db4(final int n) {
		if (n == 0) {
			if (!cGame.s_iapEnabled && cGame.var_7aac == 19) {
				final String sub_4e1f;
				final String s = ((sub_4e1f = GLLib.TODO_sub_4e1f(852)) == null) ? "" : sub_4e1f;
				final String var_7ab4 = cGame.var_7ab4;
				int n2 = 0;
				for (int i = 0; i < var_7ab4.length(); ++i) {
					final char char1;
					if (!Character.isDigit(char1 = var_7ab4.charAt(i))) {
						if (n2 != 0) {
							break;
						}
					} else {
						n2 = n2 * 10 + Character.digit(char1, 10);
					}
				}
				final String sub_4e1f2;
				sub_405b1(((sub_4e1f2 = GLLib.TODO_sub_4e1f(380)) == null) ? "" : sub_4e1f2,
						GLLib.sub_547c(s, "%d", GLLib.CurrencySeparator_just_a_guess(n2, cGame.var_7fe4, " ")), 7);
				cGame.var_7aac = -1;
				cGame.var_7d24 = false;
			}
			cGame.var_7ccc = false;
			sub_1daf4(8);
			if (cGame.s_iapEnabled) {
				if (cGame.var_694c == 2) {
					cGame.var_694c = 1;
				}
				for (int j = 0; j < 6; ++j) {
					cGame.var_7d04[j] = -1;
				}
			} else {
				sub_2000c(8, 11, false);
				sub_2024d(8, 9, false);
				sub_2000c(8, 10, false);
			}
			if (getLevel() < 3) {
				sub_4052e(473, 474, 7, 0);
				sub_82a7(19);
			}
			final Class_h class_h = Class_h.var_6a[30];
			for (int k = 0; k < 6; ++k) {
				cGame.var_7cf4[k] = class_h.var_82[k][1];
				cGame.var_7c6c[k] = class_h.var_82[k][2];
			}
			sub_45e60(false);
			sub_17ace();
			final String sub_4e1f3;
			cGame.var_68cc[8][1] = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(766)) == null) ? "" : sub_4e1f3);
			cGame.var_68cc[8][7] = GLLib.CurrencySeparator_just_a_guess(getCash(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][4] = GLLib.CurrencySeparator_just_a_guess(sub_2e0da(), cGame.var_7fe4, " ");
			cGame.var_68cc[8][185] = "0";
			cGame.var_68cc[8][167] = "1";
			cGame.var_68cc[8][169] = "2";
			cGame.var_68cc[8][171] = "3";
			cGame.var_68cc[8][173] = "4";
			cGame.var_68cc[8][175] = "5";
			cGame.var_68cc[8][177] = "6";
			cGame.var_68cc[8][179] = "7";
			cGame.var_68cc[8][181] = "8";
			cGame.var_68cc[8][183] = "9";
			cGame.var_68cc[8][187] = "C";
			cGame.var_68cc[8][189] = "<";
			final String sub_4e1f4;
			cGame.var_68cc[8][191] = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(776)) == null) ? "" : sub_4e1f4);
			final String sub_4e1f5;
			cGame.var_68cc[8][193] = (((sub_4e1f5 = GLLib.TODO_sub_4e1f(775)) == null) ? "" : sub_4e1f5);
			final String sub_4e1f6;
			cGame.var_68cc[8][195] = (((sub_4e1f6 = GLLib.TODO_sub_4e1f(70)) == null) ? "" : sub_4e1f6);
			final String sub_4e1f7;
			cGame.var_68cc[8][197] = (((sub_4e1f7 = GLLib.TODO_sub_4e1f(774)) == null) ? "" : sub_4e1f7);
			final String sub_4e1f8;
			cGame.var_68cc[8][163] = (((sub_4e1f8 = GLLib.TODO_sub_4e1f(768)) == null) ? "" : sub_4e1f8);
			final String sub_4e1f9;
			cGame.var_68cc[8][165] = (((sub_4e1f9 = GLLib.TODO_sub_4e1f(769)) == null) ? "" : sub_4e1f9);
			final String sub_4e1f10;
			cGame.var_68cc[8][161] = (((sub_4e1f10 = GLLib.TODO_sub_4e1f(813)) == null) ? "" : sub_4e1f10);
			final String sub_4e1f11;
			cGame.var_68cc[8][200] = (((sub_4e1f11 = GLLib.TODO_sub_4e1f(45)) == null) ? "" : sub_4e1f11);
			final String sub_4e1f12;
			cGame.var_68cc[8][198] = (((sub_4e1f12 = GLLib.TODO_sub_4e1f(809)) == null) ? "" : sub_4e1f12);
			final String sub_4e1f13;
			cGame.var_68cc[8][207] = (((sub_4e1f13 = GLLib.TODO_sub_4e1f(807)) == null) ? "" : sub_4e1f13);
			final String sub_4e1f14;
			cGame.var_68cc[8][16] = (((sub_4e1f14 = GLLib.TODO_sub_4e1f(788)) == null) ? "" : sub_4e1f14);
			sub_2000c(8, 16, false);
			cGame.var_7ce4 = -1;
		}
		if (n == 1) {
			if (!cGame.var_7d24) {
				sub_1715b();
				sub_16bcb();
				sub_174e9();
				sub_17536();
				sub_177a2();
				sub_17ace();
				sub_179fb();
				sub_16cdc();
				cGame.var_6984 = false;
				sub_171dc();
			} else if (GLLib.sub_7848()) {
				sub_1715b();
				sub_16bcb();
				sub_174e9();
				sub_17536();
				sub_177a2();
				sub_17ace();
				sub_179fb();
				sub_17332();
				sub_16c4d();
				cGame.var_6974 = (cGame.var_696c = 3);
			} else {
				sub_1715b();
				sub_16bcb();
				sub_174e9();
				sub_17536();
				sub_177a2();
				sub_17ace();
				sub_179fb();
				sub_17332();
				sub_16c4d();
				cGame.s_iapEnabled = true;
			}
			cGame.var_6924 = false;
			cGame.var_692c = false;
			cGame.var_6934 = false;
			cGame.var_6954 = false;
			cGame.var_695c = false;
			cGame.var_6964 = cGame.var_7d24;
			sub_2000c(8, 203, true);
			sub_2024d(8, 203, true);
			sub_2c69b();
			sub_1fb8e(8);
			if (cGame.s_iapEnabled && cGame.var_7aac == 19) {
				final String sub_4e1f15;
				sub_405b1(((sub_4e1f15 = GLLib.TODO_sub_4e1f(380)) == null) ? "" : sub_4e1f15, cGame.var_7ab4, 7);
				cGame.var_7aac = -1;
				cGame.var_7d24 = true;
			} else if (cGame.var_7aac == 18) {
				final String sub_4e1f16;
				sub_405b1(((sub_4e1f16 = GLLib.TODO_sub_4e1f(378)) == null) ? "" : sub_4e1f16, cGame.var_7ab4, 7);
				cGame.var_7aac = -1;
				cGame.var_7d24 = false;
			}
			if (cGame.var_7d5c) {
				cGame.var_692c = true;
				cGame.var_6984 = true;
				cGame.s_iapEnabled = true;
				sub_17332();
				sub_16c4d();
				cGame.s_iapEnabled = true;
				cGame.var_6924 = false;
				sub_17b24();
				cGame.var_7d5c = false;
			}
		}
		if (n == 2) {
			if (GLLib.IsAnyKeyDown() == 19) {
				if (cGame.var_6924) {
					sub_15ed7();
				} else if (!cGame.var_6934) {
					sub_15e7b();
				} else {
					final String sub_4e1f17;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f17 = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f17));
				}
			}
			for (int l = 0; l < 6; ++l) {
				if (cGame.var_7c74[l] > 0) {
					if (cGame.var_7c84[l] <= 0) {
						if (cGame.var_7c7c[l] >= cGame.var_7c74[l]) {
							cGame.var_7c7c[l] = 0;
							cGame.var_7c84[l] = 1000;
							cGame.var_7c94[l] = 0;
						} else {
							final int[] var_7c94 = cGame.var_7c94;
							final int n3 = l;
							var_7c94[n3] += GLLib.s_game_frameDT;
							final int n4 = cGame.var_7c94[l] * cGame.var_7c74[l] / cGame.var_7c8c[l];
							cGame.var_7c7c[l] = ((n4 < 0) ? 0
									: ((n4 > cGame.var_7c74[l]) ? cGame.var_7c74[l] : n4));
							if (cGame.var_7c7c[l] >= cGame.var_7c74[l]) {
								cGame.var_7c84[l] = 1000;
								cGame.var_7c94[l] = 0;
							}
						}
					} else {
						final int[] var_7c95 = cGame.var_7c84;
						final int n5 = l;
						var_7c95[n5] -= GLLib.s_game_frameDT;
					}
				}
			}
			if (cGame.s_iapEnabled) {
				final int var_7cac = cGame.var_7cac;
				if (!cGame.var_7ccc) {
					cGame.var_7cac = GLLib.sub_780b();
				}
				if (var_7cac != cGame.var_7cac) {
					switch (cGame.var_7cac) {
					case 6:
					case 10: {
						sub_44d11();
						break;
					}
					case 3:
					case 11: {
						cGame.var_7ccc = true;
						break;
					}
					}
				}
				if (cGame.var_6964) {
					switch (cGame.var_7cac) {
					case 0: {
						if (!cGame.var_695c) {
							GLLib.IAP_Init(GLLib.Text_GetLanguageAsString(cGame.var_7fe4));
							break;
						}
						break;
					}
					case 6:
					case 10: {
						if (!cGame.var_6954 && !cGame.var_7c4c) {
							sub_45da5();
							sub_45e60(false);
							cGame.var_7c4c = true;
							cGame.var_7cdc = GLLib.IAP_GetSpecialFlow();
							cGame.var_7cd4 = true;
							cGame.var_692c = false;
							sub_16d6a();
							GLLib.IAP_GetVirtualCurrencyFromBase(200L);
							break;
						}
						if (cGame.var_7c4c) {
							break;
						}
						break;
					}
					case 2:
					case 8: {
					}
					case 12: {
					}
					case 1:
					case 9: {
					}
					case 7: {
						sub_2e549((int) GLLib.IAP_GetVirtualCurrencyFromBase(200L));
						cGame.var_68cc[8][7] = Integer.toString(getCash());
						GLLib.sub_7903();
						sub_17989();
						break;
					}
					}
				}
			}
		}
		if (n == 8 && cGame.var_6924) {
			if (GLLib.sub_76c6() || GLLib.sub_7693() || cGame.var_799c) {
				final int var_2037 = GLLib.s_screenX;
				final int var_203f = GLLib.s_screenY;
				if (sub_2c577(var_2037, var_203f, cGame.var_68bc[8][156][2], cGame.var_68bc[8][156][3],
						cGame.var_68bc[8][156][5], cGame.var_68bc[8][156][6])) {
					if (!cGame.var_7d44) {
						cGame.var_7d3c = var_203f;
					}
					cGame.var_7d44 = true;
					if ((cGame.var_7d2c += var_203f - cGame.var_7d3c) > 0) {
						cGame.var_7d2c = 0;
					} else if (cGame.var_7d2c < -cGame.var_7d34) {
						cGame.var_7d2c = -cGame.var_7d34;
					}
					cGame.var_7d3c = var_203f;
				}
			}
			if (GLLib.s_screenY < cGame.var_68bc[8][156][3]
					|| GLLib.s_screenY > cGame.var_68bc[8][156][3] + cGame.var_68bc[8][156][6]) {
				cGame.var_7d44 = false;
			}
			if (GLLib.sub_762d()) {
				cGame.var_7d44 = false;
			}
		}
		if (n == 3) {
			sub_45f32();
		}
		if (n == 5) {
			cGame.var_7d54 = 0;
			if (cGame.var_7cb4 == 2) {
				cGame.var_815c = false;
			}
		}
		return false;
	}

	private static String sub_45928(String sub_4e1f) {
		if (sub_4e1f == null) {
			return "";
		}
		final int index;
		if ((index = sub_4e1f.indexOf(43)) >= 0) {
			return sub_4e1f.substring(0, index).trim();
		}
		final String trim;
		final int index2;
		if (sub_4e1f.toLowerCase().startsWith("bs ")
				&& (index2 = (trim = sub_4e1f.substring(3).trim()).indexOf(32)) >= 0) {
			return sub_4e1f.substring(0, 3) + trim.substring(0, index2) + " "
					+ (((sub_4e1f = GLLib.TODO_sub_4e1f(770)) == null) ? "" : sub_4e1f);
		}
		return sub_4e1f.trim();
	}

	private static String sub_45a01(int n) {
		final String s = cGame.var_7c5c[n];
		final String s2 = "SMS";
		String s3;
		if (s.toLowerCase().indexOf(s2.toLowerCase()) >= 0) {
			final String sub_4e1f;
			s3 = GLLib.sub_547c(s, s2, ((sub_4e1f = GLLib.TODO_sub_4e1f(792)) == null) ? "" : sub_4e1f);
		} else {
			final StringBuffer append = new StringBuffer().append(sub_45928(s));
			final int n2 = n;
			final String s4 = "Cash";
			n = n2;
			String str;
			if (cGame.var_7cdc == 2 || cGame.var_7cdc == 5 || cGame.var_7cdc == 4) {
				String sub_4e1f2;
				String sub_4e1f3;
				str = ((cGame.var_7fe4 == 1 || cGame.var_7cdc == 4)
						? (" " + (((sub_4e1f2 = GLLib.TODO_sub_4e1f(784)) == null) ? "" : sub_4e1f2))
						: (" " + (((sub_4e1f3 = GLLib.TODO_sub_4e1f(785)) == null) ? "" : sub_4e1f3)));
			} else if (cGame.var_7cdc == 6) {
				int sub_7965;
				if (cGame.var_7d04[n] == -1) {
					sub_7965 = GLLib.IAP_GetPrice(n, s4);
					cGame.var_7d04[n] = sub_7965;
				} else {
					sub_7965 = cGame.var_7d04[n];
				}
				String sub_4e1f4;
				String sub_4e1f5;
				str = ((sub_7965 == 1) ? (" + 2 " + (((sub_4e1f4 = GLLib.TODO_sub_4e1f(792)) == null) ? "" : sub_4e1f4))
						: (" + 1 " + (((sub_4e1f5 = GLLib.TODO_sub_4e1f(792)) == null) ? "" : sub_4e1f5)));
			} else {
				String sub_4e1f6;
				str = ((cGame.var_7cdc == 9 || cGame.var_7cdc == 1)
						? (" " + (((sub_4e1f6 = GLLib.TODO_sub_4e1f(771)) == null) ? "" : sub_4e1f6))
						: "");
			}
			s3 = append.append(str).toString();
		}
		if (s3.trim().equals("")) {
			final String sub_4e1f7;
			s3 = (((sub_4e1f7 = GLLib.TODO_sub_4e1f(127)) == null) ? "" : sub_4e1f7);
		}
		return s3;
	}

	private static void sub_45da5() {
		cGame.var_7cbc = 0;
		cGame.var_7cdc = GLLib.IAP_GetSpecialFlow();
		for (int i = 0; i < GLLib.IAP_GetCurrencyAmount("Cash"); ++i) {
			cGame.var_7c5c[i] = GLLib.sub_78a2(i, "Cash");
			final String sub_45a01 = sub_45a01(i);
			final long sub_7921 = GLLib.IAP_GetVirtualCurrency(200L, i, "Cash");
			if (sub_45a01 != null && !sub_45a01.trim().equals("")) {
				cGame.var_7cfc[i] = i;
				cGame.var_7c54[i] = sub_45a01;
				cGame.var_7cec[i] = sub_7921;
			} else {
				cGame.var_7c54[i] = null;
				cGame.var_7cfc[i] = -1;
			}
			++cGame.var_7cbc;
		}
	}

	private static void sub_45e60(final boolean b) {
		if (cGame.var_7ca4 > 0) {
			sub_45ea9();
			return;
		}
		if (b) {
			cGame.var_7c24 = 9;
			sub_81e0(42);
		}
	}

	private static void sub_45ea9() {
		for (int i = 0; i < 5; ++i) {
			cGame.var_7d0c[i] = -1;
		}
		cGame.var_7ca4 = 0;
	}

	private static void sub_45ef1(final int n) {
		if (cGame.var_7ca4 < 5) {
			cGame.var_7d0c[cGame.var_7ca4] = n;
			++cGame.var_7ca4;
		}
	}

	private static void sub_45f32() {
		sub_1dcc1(8);
		if (cGame.var_6964) {
			switch (cGame.var_7cac) {
			case 0: {
				sub_1715b();
				if (cGame.var_695c) {
					sub_46bb6(cGame.var_7d1c);
					return;
				}
				sub_1749c();
				sub_46afe();
				return;
			}
			case 6:
			case 10: {
				sub_174e9();
				if (cGame.var_6924) {
					if (cGame.var_7c9c != null) {
						GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][156][2], cGame.var_68bc[8][156][3],
								cGame.var_68bc[8][156][5], cGame.var_68bc[8][156][6], true);
						sub_1e2f2(cGame.var_7c9c, 8, 156, 0, cGame.var_7d2c);
						GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
					}
				} else if (!cGame.var_6954) {
					sub_16d6a();
					if (cGame.var_6964) {
						if (cGame.var_7cbc > 0 && cGame.var_692c) {
							if (cGame.var_7cbc > 0) {
								sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[0], cGame.var_7fe4, " "), 8, 22, 0, 0);
								GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][27][2],
										cGame.var_68bc[8][27][3], cGame.var_68bc[8][27][5],
										cGame.var_68bc[8][27][6], true);
								sub_1df06(cGame.var_7c54[0], 8, 27, -cGame.var_7c7c[0], 0);
								GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
							}
							if (1 < cGame.var_7cbc) {
								sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[1], cGame.var_7fe4, " "), 8, 37, 0, 0);
								GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][42][2],
										cGame.var_68bc[8][42][3], cGame.var_68bc[8][42][5],
										cGame.var_68bc[8][42][6], true);
								sub_1df06(cGame.var_7c54[1], 8, 42, -cGame.var_7c7c[1], 0);
								GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
							}
							if (2 < cGame.var_7cbc) {
								if (cGame.var_7c54[2] != null) {
									sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[2], cGame.var_7fe4, " "), 8, 52, 0,
											0);
									GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][57][2],
											cGame.var_68bc[8][57][3], cGame.var_68bc[8][57][5],
											cGame.var_68bc[8][57][6], true);
									sub_1df06(cGame.var_7c54[2], 8, 57, -cGame.var_7c7c[2], 0);
									GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
								}
								if (3 < cGame.var_7cbc) {
									sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[3], cGame.var_7fe4, " "), 8, 67, 0,
											0);
									GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][72][2],
											cGame.var_68bc[8][72][3], cGame.var_68bc[8][72][5],
											cGame.var_68bc[8][72][6], true);
									sub_1df06(cGame.var_7c54[3], 8, 72, -cGame.var_7c7c[3], 0);
									GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
								}
							}
							if (4 < cGame.var_7cbc) {
								if (cGame.var_7c54[4] != null) {
									sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[4], cGame.var_7fe4, " "), 8, 82, 0,
											0);
									GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][87][2],
											cGame.var_68bc[8][87][3], cGame.var_68bc[8][87][5],
											cGame.var_68bc[8][87][6], true);
									sub_1df06(cGame.var_7c54[4], 8, 87, -cGame.var_7c7c[4], 0);
									GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
								}
								if (5 < cGame.var_7cbc) {
									sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cec[5], cGame.var_7fe4, " "), 8, 97, 0,
											0);
									GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][102][2],
											cGame.var_68bc[8][102][3], cGame.var_68bc[8][102][5],
											cGame.var_68bc[8][102][6], true);
									sub_1df06(cGame.var_7c54[5], 8, 102, -cGame.var_7c7c[5], 0);
									GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
								}
							}
						} else {
							final String sub_4e1f;
							sub_1e2f2(((sub_4e1f = GLLib.TODO_sub_4e1f(827)) == null) ? "" : sub_4e1f, 8, 201, 0, 0);
						}
					}
				}
				return;
			}
			case 8: {
				cGame.var_7d1c = GLLib.sub_7884();
				sub_174e9();
				sub_177a2();
				sub_1715b();
				cGame.var_697c = 0;
				cGame.var_6974 = (cGame.var_696c = 6);
				sub_17a52();
			}
			case 2: {
				sub_174e9();
				if (cGame.var_697c == 4) {
					sub_1715b();
					sub_2000c(8, 162, true);
					sub_2024d(8, 162, true);
					sub_2000c(8, 163, true);
					sub_2000c(8, 164, true);
					sub_2024d(8, 164, true);
					sub_2000c(8, 165, true);
					final String sub_4e1f2;
					cGame.var_68cc[8][161] = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(813)) == null) ? "" : sub_4e1f2);
					sub_2000c(8, 161, true);
					sub_2c69b();
					sub_1fb8e(8);
					cGame.var_693c = true;
					cGame.var_696c = 4;
					cGame.var_7cb4 = 2;
					cGame.var_697c = 0;
					return;
				}
				if (cGame.var_697c == 3) {
					cGame.var_6974 = (cGame.var_696c = 3);
					cGame.var_6944 = false;
					sub_175b0();
				}
				if (cGame.var_6974 == 0) {
					cGame.var_6974 = (cGame.var_696c = 3);
					cGame.var_6944 = false;
					sub_175b0();
					cGame.var_697c = 3;
					return;
				}
				if (cGame.var_6974 == 3) {
					sub_1715b();
					cGame.var_697c = 0;
					if (!cGame.var_6954) {
						sub_175b0();
					}
					String s = "";
					for (int i = 0; i < 5; ++i) {
						if (cGame.var_7d0c[i] == -1) {
							s += "+";
						} else {
							s += Integer.toString(cGame.var_7d0c[i]);
						}
					}
					sub_1df06(s, 8, 196, 0, 0);
					return;
				}
				if (cGame.var_696c == 6) {
					sub_1715b();
					sub_46bb6(cGame.var_7d1c);
				}
				return;
			}
			case 12: {
				sub_177a2();
				sub_1715b();
				sub_1749c();
				sub_46afe();
				sub_46b63();
				return;
			}
			case 9: {
				sub_177a2();
				sub_1715b();
				sub_1749c();
				sub_46afe();
				return;
			}
			case 1: {
				sub_177a2();
				cGame.var_692c = true;
				sub_1715b();
				sub_1749c();
				sub_46afe();
				sub_46b63();
				return;
			}
			case 3:
			case 11: {
				final int n = cGame.var_7d1c = GLLib.sub_7884();
				sub_174e9();
				sub_177a2();
				sub_1715b();
				cGame.var_6974 = 8;
				sub_17a52();
				sub_46bb6(n);
				return;
			}
			case 7: {
				sub_174e9();
				sub_17989();
				break;
			}
			}
			return;
		}
		if (cGame.var_6984) {
			sub_171dc();
			if (cGame.var_6984) {
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[0], cGame.var_7fe4, " "), 8, 116, 0, 0);
				GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][119][2], cGame.var_68bc[8][119][3],
						cGame.var_68bc[8][119][5], cGame.var_68bc[8][119][6], true);
				final String sub_4e1f3;
				sub_1df06(
						GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[0], cGame.var_7fe4, " ") + " "
								+ (((sub_4e1f3 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f3),
						8, 119, -cGame.var_7c7c[0], 0);
				GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[1], cGame.var_7fe4, " "), 8, 122, 0, 0);
				GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][125][2], cGame.var_68bc[8][125][3],
						cGame.var_68bc[8][125][5], cGame.var_68bc[8][125][6], true);
				final String sub_4e1f4;
				sub_1df06(
						GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[1], cGame.var_7fe4, " ") + " "
								+ (((sub_4e1f4 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f4),
						8, 125, -cGame.var_7c7c[1], 0);
				GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
				if (cGame.var_7cc4 > 2) {
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[2], cGame.var_7fe4, " "), 8, 128, 0, 0);
					GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][131][2], cGame.var_68bc[8][131][3],
							cGame.var_68bc[8][131][5], cGame.var_68bc[8][131][6], true);
					final String sub_4e1f5;
					sub_1df06(
							GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[2], cGame.var_7fe4, " ") + " "
									+ (((sub_4e1f5 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f5),
							8, 131, -cGame.var_7c7c[2], 0);
					GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[3], cGame.var_7fe4, " "), 8, 134, 0, 0);
					GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][137][2], cGame.var_68bc[8][137][3],
							cGame.var_68bc[8][137][5], cGame.var_68bc[8][137][6], true);
					final String sub_4e1f6;
					sub_1df06(
							GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[3], cGame.var_7fe4, " ") + " "
									+ (((sub_4e1f6 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f6),
							8, 137, -cGame.var_7c7c[3], 0);
					GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
				}
				if (cGame.var_7cc4 > 4) {
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[4], cGame.var_7fe4, " "), 8, 140, 0, 0);
					GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][143][2], cGame.var_68bc[8][143][3],
							cGame.var_68bc[8][143][5], cGame.var_68bc[8][143][6], true);
					final String sub_4e1f7;
					sub_1df06(
							GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[4], cGame.var_7fe4, " ") + " "
									+ (((sub_4e1f7 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f7),
							8, 143, -cGame.var_7c7c[4], 0);
					GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7cf4[5], cGame.var_7fe4, " "), 8, 146, 0, 0);
					GLLib.sub_36f4(GLLib.g, cGame.var_68bc[8][149][2], cGame.var_68bc[8][149][3],
							cGame.var_68bc[8][149][5], cGame.var_68bc[8][149][6], true);
					final String sub_4e1f8;
					sub_1df06(
							GLLib.CurrencySeparator_just_a_guess(cGame.var_7c6c[5], cGame.var_7fe4, " ") + " "
									+ (((sub_4e1f8 = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f8),
							8, 149, -cGame.var_7c7c[5], 0);
					GLLib.sub_36f4(GLLib.g, 0, 0, GLLib.s_screenWidth, GLLib.s_screenHeight, true);
				}
			}
		}
	}

	private static void sub_46afe() {
		if ((System.currentTimeMillis() & 0x200L) != 0x0L) {
			final String sub_4e1f;
			sub_1e2f2(((sub_4e1f = GLLib.TODO_sub_4e1f(791)) == null) ? "" : sub_4e1f, 8, 159, 0, 0);
		}
	}

	private static void sub_46b63() {
		final String sub_4e1f;
		sub_1e2f2(((sub_4e1f = GLLib.TODO_sub_4e1f(794)) == null) ? "" : sub_4e1f, 8, 160, 0, 0);
	}

	private static void sub_46bb6(final int var_7d1c) {
		cGame.var_7d1c = var_7d1c;
		if (var_7d1c < 0 && var_7d1c >= -10) {
			final String sub_4e1f;
			sub_1e2f2(((sub_4e1f = GLLib.TODO_sub_4e1f(cGame.var_7d14[-var_7d1c])) == null) ? "" : sub_4e1f, 8, 201, 0,
					0);
			return;
		}
		if (var_7d1c > 10 && var_7d1c < 12) {
			final String sub_4e1f2;
			sub_1e2f2(((sub_4e1f2 = GLLib.TODO_sub_4e1f(cGame.var_7d14[var_7d1c])) == null) ? "" : sub_4e1f2, 8, 201, 0,
					0);
			return;
		}
		final String sub_4e1f3;
		sub_1e2f2(((sub_4e1f3 = GLLib.TODO_sub_4e1f(cGame.var_7d14[12])) == null) ? "" : sub_4e1f3, 8, 201, 0, 0);
	}

	private static void sub_46c9b(final boolean b) {
		int n = 119;
		int n2 = 6;
		if (b) {
			n = 27;
			n2 = 15;
			cGame.var_7cdc = GLLib.IAP_GetSpecialFlow();
		}
		final int sub_237ff = sub_237ff(cGame.var_68bc[8][n][7]);
		for (int i = 0; i < 6; ++i) {
			String s;
			if (b) {
				if (i < cGame.var_7cbc) {
					s = sub_45a01(i);
				} else {
					s = "";
				}
			} else {
				final String sub_4e1f;
				s = cGame.var_7c6c[i] + " " + (((sub_4e1f = GLLib.TODO_sub_4e1f(812)) == null) ? "" : sub_4e1f);
			}
			cGame.var_7c54[i] = s;
			cGame.var_689c[2][sub_237ff].sub_5917(s, null);
			cGame.var_7c74[i] = ASprite.var_119f;
			cGame.var_7c74[i] = ((cGame.var_7c74[i] - cGame.var_68bc[8][n][5] < 0) ? 0
					: ((cGame.var_7c74[i] - cGame.var_68bc[8][n][5] > cGame.var_7c74[i]) ? cGame.var_7c74[i]
							: (cGame.var_7c74[i] - cGame.var_68bc[8][n][5])));
			cGame.var_7c7c[i] = 0;
			cGame.var_7c84[i] = 1000;
			cGame.var_7c94[i] = 0;
			cGame.var_7c8c[i] = cGame.var_7c74[i] * 1000 / 20;
			if (cGame.var_7c74[i] == 0) {
				cGame.var_68bc[8][n + n2 * i][9] = 1;
			} else {
				cGame.var_68bc[8][n + n2 * i][9] = 0;
			}
		}
	}

	private static boolean sub_46ec6(final int n) {
		if (n == 0) {
			cGame.var_69dc = false;
			sub_23d73();
			sub_23ac1(10, true);
			final Class_h class_h;
			if ((class_h = Class_h.var_6a[33]) != null) {
				cGame.var_7e2c = class_h.var_82[1][2];
				cGame.var_7e34 = class_h.var_82[1][3];
			}
			if (cGame.var_7e2c < 0) {
				cGame.var_7e2c = 30;
			}
			if (cGame.var_7e34 < 0) {
				cGame.var_7e34 = 50;
			}
		}
		if (n == 1) {
			sub_23ac1(10, true);
			if (cGame.var_8134 == 1) {
				sub_2c69b();
				sub_1fb8e(24);
				cGame.var_7d6c = 0;
				while (cGame.var_7d6c < 7) {
					cGame.var_68f4[cGame.var_7d6c].sub_1856(0, -1, true);
					cGame.var_68f4[cGame.var_7d6c].SetPos(cGame.var_7d84[cGame.var_7d6c],
							cGame.var_7d8c[cGame.var_7d6c]);
					cGame.var_68f4[cGame.var_7d6c].sub_1941();
					++cGame.var_7d6c;
				}
				for (int i = 0; i < cGame.var_7d74; ++i) {
					cGame.var_68f4[cGame.var_7de4[i]].SetAnim(-1, 1);
				}
			} else if (cGame.var_8134 == 2) {
				sub_4875f();
			} else {
				sub_47802();
			}
		}
		if (n == 8 && cGame.var_8134 == 1 && GLLib.sub_762d()) {
			final int var_2037 = GLLib.s_screenX;
			final int var_203f = GLLib.s_screenY;
			for (int j = 0; j < cGame.var_7d6c; ++j) {
				if (cGame.var_68f4[j].sub_1922() == 0 && cGame.var_7d74 < 5 && var_2037 > cGame.var_7d84[j] - 65
						&& var_2037 < cGame.var_7d84[j] + 65 && var_203f > cGame.var_7d8c[j] - 30
						&& var_203f < cGame.var_7d8c[j] + 30 && !cGame.var_7e44 && cGame.var_7e3c == -1) {
					cGame.var_7e44 = true;
					cGame.var_7e3c = j;
					break;
				}
			}
		}
		if (n == 5) {
			sub_23d73();
			try {
				Thread.sleep(400L);
			} catch (final Exception ex) {
			}
			cGame.var_6a6c = 0L;
			sub_23a84(57);
			cGame.var_7d64 = 0;
			cGame.var_7d6c = 0;
			cGame.var_7d74 = 0;
			cGame.var_7d94 = 0;
			cGame.var_7d84 = null;
			cGame.var_7d8c = null;
			cGame.var_7dac = null;
			cGame.var_7db4 = null;
			cGame.var_7dbc = null;
			cGame.var_7dc4 = null;
			for (int k = 0; k < 3; ++k) {
				cGame.var_68bc[20][k + 10][10] = 0;
			}
			cGame.var_7e14 = 0;
			cGame.var_7e1c = 0;
			cGame.var_7e24 = 0;
			sub_239ef(24);
		}
		if (n == 2) {
			if (!sndPlayingOnChannel(0)) {
				sub_23ac1(10, true);
			}
			final int sub_2b09 = GLLib.IsAnyKeyDown();
			if (cGame.var_8134 == 0) {
				if (sub_2b09 == 19) {
					sub_1c12f();
				}
				for (int l = 0; l < 3; ++l) {
					cGame.var_68f4[l].sub_1ca1(GLLib.s_game_frameDT);
				}
				if ((cGame.var_7d9c = System.currentTimeMillis()) > cGame.var_7da4) {
					if (cGame.var_68bc[24][19][6] != 8) {
						cGame.var_68bc[24][19][6] = 8;
					}
					if (sub_20167(24, 28)) {
						sub_2000c(24, 28, false);
						sub_1fb8e(24);
					}
				} else if (cGame.var_7d9c <= cGame.var_7da4 && cGame.var_68bc[24][19][6] != 9) {
					cGame.var_68bc[24][19][6] = 9;
				}
			} else if (cGame.var_8134 == 1) {
				if (sub_2b09 == 19) {
					final String sub_4e1f;
					sub_4c6b5("Show_Toast_" + (((sub_4e1f = GLLib.TODO_sub_4e1f(498)) == null) ? "" : sub_4e1f));
				}
				if (cGame.var_7d6c < 7 && --cGame.var_7d64 < 0) {
					sub_47e17();
				}
				if (cGame.var_7e44) {
					cGame.var_7e44 = false;
					sub_47eb6(cGame.var_7e3c);
				}
				int n2 = 0;
				for (int n3 = 0; n3 < cGame.var_7d94; ++n3) {
					short n4 = cGame.var_68bc[24][n3 + 25][2];
					int n5 = cGame.var_68bc[24][n3 + 25][3];
					n4 -= 50;
					n5 += 50;
					if (cGame.var_7d7c == 0) {
						final short n6 = cGame.var_68bc[24][13][2];
						final short n7 = cGame.var_68bc[24][13][3];
						if (n4 > n6 - 100 && n4 < n6 && n5 > n7 + 50 && n5 < n7 + 100) {
							++n2;
							cGame.var_7e3c = -1;
						}
					} else if (cGame.var_7d7c == 1) {
						final short n8 = cGame.var_68bc[24][16][2];
						final short n9 = cGame.var_68bc[24][16][3];
						if (n4 > n8 - 100 && n4 < n8 && n5 > n9 + 50 && n5 < n9 + 100) {
							++n2;
							cGame.var_7e3c = -1;
						}
					} else if (cGame.var_7d7c == 2) {
						final short n10 = cGame.var_68bc[24][14][2];
						final short n11 = cGame.var_68bc[24][14][3];
						if (n4 > n10 - 100 && n4 < n10 && n5 > n11 + 50 && n5 < n11 + 100) {
							++n2;
							cGame.var_7e3c = -1;
						}
					}
				}
				for (int n12 = 0; n12 < 7; ++n12) {
					if (cGame.var_68f4[n12].sub_1922() == 0 || cGame.var_68f4[n12].sub_1922() == 2) {
						cGame.var_68f4[n12].sub_1ca1(GLLib.s_game_frameDT);
					}
					if (cGame.var_68f4[n12].sub_1922() == 2 || cGame.var_68f4[n12].sub_1922() == 1) {
						if (cGame.var_7d74 >= 5 && n2 == cGame.var_7d94 && cGame.var_68f4[n12].sub_1b34()) {
							sub_23a84(38);
							sub_4875f();
						} else {
							cGame.var_68f4[n12].sub_1ca1(GLLib.s_game_frameDT);
						}
					}
				}
			} else if (cGame.var_8134 == 2 && (sub_2b09 == 11 || sub_2b09 == 19)) {
				sub_47802();
			}
			if (!sndPlayingOnChannel(0)) {
				sub_23ac1(10, true);
			}
		}
		if (n == 3) {
			sub_1dcc1(24);
			if (cGame.var_8134 == 0) {
				for (int n13 = 0; n13 < 3; ++n13) {
					cGame.var_68f4[n13].sub_1b7f();
				}
				final String sub_4e1f2;
				sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(397)) == null) ? "" : sub_4e1f2, 24, 20, 0, 0);
				sub_1df06(Integer.toString(cGame.var_7e34), 24, 22, 0, 0);
				sub_1df06(Integer.toString(cGame.var_7e2c), 24, 24, 0, 0);
				if (sub_20167(24, 28)) {
					final int n14;
					final int m = (n14 = (int) ((cGame.var_7da4 - cGame.var_7d9c) / 1000L)) / 3600;
					final int n15;
					final int i2 = (n15 = n14 % 3600) / 60;
					final int i3 = n15 % 60;
					String s2;
					if (m > 0) {
						final String string = "" + m + " : ";
						String s;
						if (i2 < 10) {
							s = string + "0" + i2 + " : ";
						} else {
							s = string + i2 + " : ";
						}
						if (i3 < 10) {
							s2 = s + "0" + i3;
						} else {
							s2 = s + i3;
						}
					} else if (i2 > 0) {
						final String string2 = "" + i2 + " : ";
						if (i3 < 10) {
							s2 = string2 + "0" + i3;
						} else {
							s2 = string2 + i3;
						}
					} else {
						s2 = "" + i3;
					}
					sub_1df06(s2, 24, 29, 0, 0);
				}
			} else if (cGame.var_8134 == 1) {
				for (int n16 = 0; n16 < 7; ++n16) {
					cGame.var_68f4[n16].sub_1b7f();
				}
				switch (cGame.var_7d7c) {
				case 0: {
					sub_1e44e(24, 7);
					break;
				}
				case 1: {
					sub_1e44e(24, 11);
					break;
				}
				case 2: {
					sub_1e44e(24, 9);
					break;
				}
				}
			} else if (cGame.var_8134 == 2) {
				sub_4863a();
			}
		}
		return false;
	}

	private static void sub_47802() {
		cGame.var_7d74 = 0;
		cGame.var_8134 = 0;
		cGame.var_7ddc = new int[5];
		cGame.var_7de4 = new int[5];
		sub_2000c(24, 18, true);
		sub_2000c(24, 13, true);
		sub_2000c(24, 15, true);
		sub_2000c(24, 17, true);
		sub_2000c(24, 19, true);
		sub_2000c(24, 21, true);
		sub_2000c(24, 23, true);
		sub_2000c(24, 7, true);
		sub_2000c(24, 9, true);
		sub_2000c(24, 11, true);
		sub_2000c(24, 14, true);
		sub_2000c(24, 16, true);
		sub_2024d(24, 21, true);
		sub_2024d(24, 23, true);
		sub_2000c(24, 6, true);
		sub_2000c(24, 8, true);
		sub_2000c(24, 10, true);
		sub_2000c(24, 12, true);
		sub_2024d(24, 12, true);
		sub_2000c(24, 25, false);
		sub_2000c(24, 26, false);
		sub_2000c(24, 27, false);
		cGame.var_68f4[0].SetAnim(3, -1);
		cGame.var_68f4[1].SetAnim(4, -1);
		cGame.var_68f4[2].SetAnim(5, -1);
		cGame.var_7d9c = System.currentTimeMillis();
		cGame.var_68bc[24][20][7] = 2;
		cGame.var_68bc[24][20][8] = 4;
		sub_2024d(24, 19, true);
		if (cGame.var_7d9c > cGame.var_7da4) {
			cGame.var_68bc[24][19][6] = 8;
		} else {
			cGame.var_68bc[24][19][6] = 9;
		}
		sub_2000c(24, 28, false);
		sub_2000c(20, 18, false);
		sub_2000c(20, 17, false);
		sub_2000c(20, 16, false);
		sub_2024d(20, 16, false);
		sub_2c69b();
		sub_1fb8e(24);
		cGame.var_7e14 = 0;
		cGame.var_7e1c = 0;
		cGame.var_7e24 = 0;
		cGame.var_7d6c = 0;
		cGame.var_7d74 = 0;
		cGame.var_7d94 = 0;
		cGame.var_7d84 = new int[7];
		cGame.var_7d8c = new int[7];
		cGame.var_7d64 = 30;
		cGame.var_7e3c = -1;
		cGame.var_7e44 = false;
	}

	private static boolean sub_479c7(int i) {
		if (sub_2dcf3(5) + Class_f.sub_59d2(2) > sub_2df26() - 15) {
			if (i == 1) {
				sub_2e549(cGame.var_7e2c);
			} else if (i == 2) {
				sub_2e549(cGame.var_7e34);
			}
			sub_2000c(4, 30, true);
			cGame.var_7b24 = 1;
			sub_2000c(4, 5, true);
			sub_2000c(4, 6, true);
			sub_2000c(4, 11, true);
			sub_2024d(4, 11, true);
			sub_4019a(7, 0, 10);
			final String sub_4e1f;
			cGame.var_7ac4 = (((sub_4e1f = GLLib.TODO_sub_4e1f(401)) == null) ? "" : sub_4e1f);
			final String sub_4e1f2;
			cGame.var_7acc = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(402)) == null) ? "" : sub_4e1f2);
			sub_82a7(19);
			return false;
		}
		sub_2000c(24, 18, false);
		sub_2000c(24, 13, false);
		sub_2000c(24, 15, false);
		sub_2000c(24, 17, false);
		sub_2000c(24, 19, false);
		sub_2000c(24, 21, false);
		sub_2000c(24, 23, false);
		sub_2000c(24, 7, false);
		sub_2000c(24, 9, false);
		sub_2000c(24, 11, false);
		sub_2000c(24, 14, false);
		sub_2000c(24, 16, false);
		sub_2000c(24, 28, false);
		sub_2024d(24, 19, false);
		sub_2024d(24, 21, false);
		sub_2024d(24, 23, false);
		switch (i) {
		case 0: {
			cGame.var_7d7c = 0;
			sub_2000c(24, 13, true);
			sub_2000c(24, 7, true);
			final Class_h class_h;
			if ((class_h = Class_h.var_6a[33]) != null) {
				long n;
				if ((n = class_h.var_82[0][1] * 1000) == 0L) {
					n = 86400000L;
				}
				cGame.var_7da4 = System.currentTimeMillis() + n;
			}
			break;
		}
		case 1: {
			cGame.var_7d7c = 1;
			sub_2000c(24, 16, true);
			sub_2000c(24, 11, true);
			break;
		}
		case 2: {
			cGame.var_7d7c = 2;
			sub_2000c(24, 14, true);
			sub_2000c(24, 9, true);
			break;
		}
		}
		for (i = 0; i < 7; ++i) {
			cGame.var_68f4[i].SetAnim(-1, 1);
		}
		sub_2000c(24, 6, false);
		sub_2000c(24, 8, false);
		sub_2000c(24, 10, false);
		sub_2000c(24, 12, false);
		sub_2024d(24, 12, false);
		cGame.var_7d6c = 0;
		cGame.var_7d74 = 0;
		cGame.var_7d94 = 0;
		cGame.var_7d84 = new int[7];
		cGame.var_7d8c = new int[7];
		cGame.var_7d64 = 30;
		cGame.var_7e3c = -1;
		cGame.var_7e44 = false;
		cGame.var_7dec = new int[50];
		cGame.var_7df4 = new int[50];
		cGame.var_7dfc = new int[50];
		cGame.var_7e04 = new int[50];
		cGame.var_8134 = 1;
		cGame.var_7dac = new int[50];
		cGame.var_7db4 = new int[50];
		cGame.var_7dbc = new int[50];
		cGame.var_7dc4 = new int[50];
		i = 0;
		int var_7dd4 = 0;
		final Class_h class_h2 = Class_h.var_6a[19];
		for (int j = 0; j < class_h2.var_7a; ++j) {
			switch (cGame.var_7d7c) {
			case 0: {
				if (class_h2.var_82[j][6] > 0) {
					cGame.var_7db4[i] = class_h2.var_82[j][4];
					cGame.var_7dbc[i] = class_h2.var_82[j][3];
					cGame.var_7dc4[i] = class_h2.var_82[j][5];
					cGame.var_7dac[i] = class_h2.var_82[j][6];
					var_7dd4 += cGame.var_7dac[i];
					++i;
					break;
				}
				break;
			}
			case 1: {
				if (class_h2.var_82[j][7] > 0) {
					cGame.var_7db4[i] = class_h2.var_82[j][4];
					cGame.var_7dbc[i] = class_h2.var_82[j][3];
					cGame.var_7dc4[i] = class_h2.var_82[j][5];
					cGame.var_7dac[i] = class_h2.var_82[j][7];
					var_7dd4 += cGame.var_7dac[i];
					++i;
					break;
				}
				break;
			}
			case 2: {
				if (class_h2.var_82[j][8] > 0) {
					cGame.var_7db4[i] = class_h2.var_82[j][4];
					cGame.var_7dbc[i] = class_h2.var_82[j][3];
					cGame.var_7dc4[i] = class_h2.var_82[j][5];
					cGame.var_7dac[i] = class_h2.var_82[j][8];
					var_7dd4 += cGame.var_7dac[i];
					++i;
					break;
				}
				break;
			}
			}
		}
		cGame.var_7dd4 = var_7dd4;
		cGame.var_7dcc = i;
		sub_2c69b();
		sub_1fb8e(24);
		return true;
	}

	private static void sub_47e17() {
		cGame.var_7d6c = 0;
		while (cGame.var_7d6c < 7) {
			cGame.var_7d84[cGame.var_7d6c] = GLLib.Math_Rand(240, 600);
			cGame.var_7d8c[cGame.var_7d6c] = GLLib.Math_Rand(160, 300);
			cGame.var_68f4[cGame.var_7d6c].sub_1856(0, -1, true);
			cGame.var_68f4[cGame.var_7d6c].SetPos(cGame.var_7d84[cGame.var_7d6c],
					cGame.var_7d8c[cGame.var_7d6c]);
			cGame.var_68f4[cGame.var_7d6c].sub_1941();
			cGame.var_68f4[cGame.var_7d6c].sub_1b7f();
			++cGame.var_7d6c;
		}
	}

	private static void sub_47eb6(final int n) {
		String s = "";
		final int sub_2b97 = GLLib.Math_Rand(0, cGame.var_7dd4);
		int n2 = 0;
		int i;
		for (i = 0; i < cGame.var_7dcc; ++i) {
			n2 += cGame.var_7dac[i];
			if (sub_2b97 < n2) {
				break;
			}
		}
		if (cGame.var_7d94 < 3 && cGame.var_7db4[i] != 0) {
			sub_23a84(46);
			cGame.var_68f4[n].SetAnim(1, 1);
			int n3 = 0;
			int n4 = 0;
			if (cGame.var_7d7c == 0) {
				n3 = cGame.var_68bc[24][13][2];
				n4 = cGame.var_68bc[24][13][3];
			} else if (cGame.var_7d7c == 1) {
				n3 = cGame.var_68bc[24][16][2];
				n4 = cGame.var_68bc[24][16][3];
			} else if (cGame.var_7d7c == 2) {
				n3 = cGame.var_68bc[24][14][2];
				n4 = cGame.var_68bc[24][14][3];
			}
			cGame.var_68bc[24][25 + cGame.var_7d94][2] = (short) cGame.var_7d84[n];
			cGame.var_68bc[24][25 + cGame.var_7d94][3] = (short) (cGame.var_7d8c[n] - 50);
			final int n5 = 0x180000 | (25 + cGame.var_7d94 & 0xFFFF);
			sub_23556(n5, n5, cGame.var_7d84[n], cGame.var_7d8c[n] - 50, n3 - 50, n4 + 50, 500);
			cGame.var_7ddc[cGame.var_7d94] = i;
			int n6 = 0;
			int n7 = 0;
			int n8 = 0;
			switch (cGame.var_7db4[i]) {
			case 1: {
				final Class_h class_h = Class_h.var_6a[1];
				for (int j = 0; j < class_h.var_7a; ++j) {
					if (class_h.var_82[j][1] == cGame.var_7dbc[i]) {
						n6 = class_h.var_82[j][3];
						n7 = class_h.var_82[j][4];
						final String sub_4e1f;
						s = (((sub_4e1f = GLLib.TODO_sub_4e1f(class_h.var_82[j][2])) == null) ? "" : sub_4e1f);
						if (j == 110) {
							sub_2e64f(cGame.var_7dc4[i]);
							sub_2bae9(cGame.var_7dbc[i], cGame.var_7dc4[i], 34);
							sub_49db0(cGame.var_7dbc[i], cGame.var_7dc4[i], 34, false);
						} else if (j == 5) {
							sub_2e5a7(cGame.var_7dc4[i]);
						} else if (j >= 111 && j <= 116) {
							sub_2e4fa(cGame.var_7dc4[i], j - 111);
						} else {
							sub_2da54(0, j, cGame.var_7dc4[i]);
						}
					}
				}
				break;
			}
			case 2: {
				n6 = 1;
				n7 = 36;
				final String sub_4e1f2;
				s = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(385)) == null) ? "" : sub_4e1f2);
				sub_2e482(cGame.var_7dc4[i]);
				cGame.var_7e1c += cGame.var_7dc4[i];
				break;
			}
			case 3: {
				n6 = 1;
				n7 = 37;
				final String sub_4e1f3;
				s = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(386)) == null) ? "" : sub_4e1f3);
				addExperience(cGame.var_7dc4[i]);
				cGame.var_7e24 += cGame.var_7dc4[i];
				break;
			}
			case 4: {
				n6 = 1;
				n7 = 6;
				final String sub_4e1f4;
				s = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(256)) == null) ? "" : sub_4e1f4);
				sub_2e549(cGame.var_7dc4[i]);
				cGame.var_7e14 += cGame.var_7dc4[i];
				break;
			}
			case 5: {
				final Class_h class_h2 = Class_h.var_6a[4];
				for (int k = 0; k < class_h2.var_7a; ++k) {
					if (class_h2.var_82[k][1] == cGame.var_7dbc[i]) {
						n6 = class_h2.var_82[k][3];
						n7 = class_h2.var_82[k][4];
						final String sub_4e1f5;
						s = (((sub_4e1f5 = GLLib.TODO_sub_4e1f(class_h2.var_82[k][2])) == null) ? "" : sub_4e1f5);
						sub_2da54(2, k, cGame.var_7dc4[i]);
					}
				}
				break;
			}
			case 6: {
				final Class_h class_h3 = Class_h.var_6a[0];
				for (int l = 0; l < class_h3.var_7a; ++l) {
					if (class_h3.var_82[l][1] == cGame.var_7dbc[i]) {
						n6 = class_h3.var_82[l][3];
						n7 = class_h3.var_82[l][4];
						n8 = class_h3.var_82[l][32];
						final String sub_4e1f6;
						s = (((sub_4e1f6 = GLLib.TODO_sub_4e1f(class_h3.var_82[l][2])) == null) ? "" : sub_4e1f6);
						sub_2ddd7(sub_25b35(0, l));
					}
				}
				break;
			}
			case 7: {
				final Class_h class_h4 = Class_h.var_6a[2];
				for (int n9 = 0; n9 < class_h4.var_7a; ++n9) {
					if (class_h4.var_82[n9][1] == cGame.var_7dbc[i]) {
						n6 = class_h4.var_82[n9][3];
						n7 = class_h4.var_82[n9][4];
						final String sub_4e1f7;
						s = (((sub_4e1f7 = GLLib.TODO_sub_4e1f(class_h4.var_82[n9][2])) == null) ? "" : sub_4e1f7);
						sub_2da54(4, n9, cGame.var_7dc4[i]);
					}
				}
				break;
			}
			}
			sub_2000c(24, 25 + cGame.var_7d94, true);
			cGame.var_68bc[24][25 + cGame.var_7d94][5] = (short) n6;
			cGame.var_68bc[24][25 + cGame.var_7d94][6] = (short) n7;
			cGame.var_68bc[24][25 + cGame.var_7d94][8] = (short) n8;
			cGame.var_7dec[cGame.var_7d94] = n6;
			cGame.var_7df4[cGame.var_7d94] = n7;
			cGame.var_7dfc[cGame.var_7d94] = n8;
			cGame.var_7e04[cGame.var_7d94] = cGame.var_7dc4[i];
			cGame.var_7e0c[cGame.var_7d94] = s;
			++cGame.var_7d94;
		} else {
			sub_23a84(46);
			cGame.var_68f4[n].SetAnim(2, 1);
		}
		cGame.var_7de4[cGame.var_7d74] = n;
		++cGame.var_7d74;
	}

	private static void sub_4863a() {
		final String sub_4e1f;
		final String s = ((sub_4e1f = GLLib.TODO_sub_4e1f(403)) == null) ? "" : sub_4e1f;
		sub_1dcc1(20);
		final String sub_4e1f2;
		sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(399)) == null) ? "" : sub_4e1f2, 20, 5, 0, 0);
		sub_1e2f2(s, 20, 7, 0, 0);
		if (sub_20167(20, 4)) {
			final String sub_4e1f3;
			sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(398)) == null) ? "" : sub_4e1f3, 20, 6, 0, 0);
		}
		for (int i = 0; i < cGame.var_7d94; ++i) {
			if (cGame.var_7e04[i] > 0) {
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(cGame.var_7e04[i], cGame.var_7fe4, " "), 20, i + 13, 0, 0);
			}
		}
	}

	private static void sub_4875f() {
		int i;
		for (i = 0; i < cGame.var_7d94; ++i) {
			cGame.var_68bc[20][i + 10][10] = 1;
			cGame.var_68bc[20][i + 10][5] = (short) cGame.var_7dec[i];
			cGame.var_68bc[20][i + 10][6] = (short) cGame.var_7df4[i];
			cGame.var_68bc[20][i + 10][8] = (short) cGame.var_7dfc[i];
		}
		while (i < 3) {
			cGame.var_68bc[20][i + 10][10] = 0;
			++i;
		}
		sub_2000c(20, 4, true);
		sub_2024d(20, 4, true);
		sub_2c69b();
		sub_1fb8e(20);
		cGame.var_8134 = 2;
	}

	private static boolean sub_48824(final int n) {
		if (n == 0) {
			sub_1daf4(5);
			sub_2c69b();
			sub_1fb8e(5);
			cGame.var_7f9c = true;
		}
		if (n == 5) {
			sub_48c86();
			sub_239ef(5);
		}
		final int sub_2b09;
		if (n == 2 && ((sub_2b09 = GLLib.IsAnyKeyDown()) == 19 || sub_2b09 == 11)) {
			if (cGame.var_7f5c[cGame.var_7f6c] == 3) {
				sub_12d1e();
			} else {
				sub_129f9();
			}
		}
		if (n == 3) {
			if (!cGame.var_7f9c) {
				return true;
			}
			switch (cGame.var_7f5c[cGame.var_7f6c]) {
			case 2: {
				sub_1dcc1(5);
				if (!sub_20167(5, 0)) {
					break;
				}
				final String sub_4e1f;
				sub_1df06(((sub_4e1f = GLLib.TODO_sub_4e1f(145)) == null) ? "" : sub_4e1f, 5, 1, 0, 0);
				sub_1df06(cGame.var_7e64[cGame.var_7f6c], 5, 3, 0, 0);
				sub_1e2f2(cGame.var_7e74[cGame.var_7f6c], 5, 4, 0, 0);
				if (cGame.var_7e8c[cGame.var_7f6c] != "") {
					sub_1e2f2(cGame.var_7e8c[cGame.var_7f6c], 5, 7, 0, 0);
					sub_1df06(""
							+ GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7e94[cGame.var_7f6c]), cGame.var_7fe4, " ")
							+ "/"
							+ GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7e9c[cGame.var_7f6c]), cGame.var_7fe4, " "), 5,
							8, 0, 0);
					if (cGame.var_68bc[5][10][10] == 1) {
						sub_1df06("" + cGame.var_7eb4[cGame.var_7f6c], 5, 12, 0, 0);
					}
				}
				if (cGame.var_7ec4[cGame.var_7f6c] != "") {
					sub_1e2f2(cGame.var_7ec4[cGame.var_7f6c], 5, 15, 0, 0);
					sub_1df06(""
							+ GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7ecc[cGame.var_7f6c]), cGame.var_7fe4, " ")
							+ "/"
							+ GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7ed4[cGame.var_7f6c]), cGame.var_7fe4, " "), 5,
							16, 0, 0);
					if (sub_20167(5, 18)) {
						sub_1df06("" + cGame.var_7eec[cGame.var_7f6c], 5, 20, 0, 0);
					}
				}
				if (cGame.s_loadedTexts[cGame.var_7f6c] == "") {
					break;
				}
				sub_1e2f2(cGame.s_loadedTexts[cGame.var_7f6c], 5, 23, 0, 0);
				sub_1df06("" + GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7f04[cGame.var_7f6c]), cGame.var_7fe4, " ")
						+ "/" + GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7f0c[cGame.var_7f6c]), cGame.var_7fe4, " "),
						5, 24, 0, 0);
				if (sub_20167(5, 26)) {
					sub_1df06("" + cGame.var_7f24[cGame.var_7f6c], 5, 28, 0, 0);
					break;
				}
				break;
			}
			case 3: {
				sub_1dcc1(5);
				final String sub_4e1f2;
				sub_1df06(((sub_4e1f2 = GLLib.TODO_sub_4e1f(155)) == null) ? "" : sub_4e1f2, 5, 30, 0, 0);
				sub_1df06(cGame.var_7e64[cGame.var_7f6c], 5, 33, 0, 0);
				sub_1e2f2(cGame.var_7f3c[cGame.var_7f6c], 5, 34, 0, 0);
				final String sub_4e1f3;
				sub_1df06(((sub_4e1f3 = GLLib.TODO_sub_4e1f(156)) == null) ? "" : sub_4e1f3, 5, 35, 0, 0);
				sub_1df06(GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7f44[cGame.var_7f6c]), cGame.var_7fe4, " "), 5, 46,
						0, 0);
				if (getIntValue(cGame.var_7f4c[cGame.var_7f6c]) > 0) {
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7f4c[cGame.var_7f6c]), cGame.var_7fe4, " "), 5,
							50, 0, 0);
				}
				if (getIntValue(cGame.var_7f54[cGame.var_7f6c]) > 0 && !cGame.s_iapEnabled) {
					sub_1df06(GLLib.CurrencySeparator_just_a_guess(getIntValue(cGame.var_7f54[cGame.var_7f6c]), cGame.var_7fe4, " "), 5,
							48, 0, 0);
				}
				final String sub_4e1f4;
				sub_1df06(((sub_4e1f4 = GLLib.TODO_sub_4e1f(45)) == null) ? "" : sub_4e1f4, 5, 54, 0, 0);
				break;
			}
			}
		}
		if (n == 1) {
			if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
				cGame.var_7f5c[cGame.var_7f6c] = 2;
			}
			sub_2c69b();
			sub_1fb8e(5);
			sub_48d55();
			cGame.var_7f9c = true;
		}
		return false;
	}

	private static void sub_48c86() {
		sub_2000c(5, 57, false);
		sub_2000c(5, 2, false);
		sub_2000c(5, 56, false);
		sub_2000c(5, 5, false);
		sub_2000c(5, 13, false);
		sub_2000c(5, 21, false);
		sub_2000c(5, 9, false);
		sub_2000c(5, 17, false);
		sub_2000c(5, 25, false);
		sub_2000c(5, 10, false);
		sub_2000c(5, 18, false);
		sub_2000c(5, 26, false);
		sub_2000c(5, 11, false);
		sub_2000c(5, 19, false);
		sub_2000c(5, 27, false);
		sub_2000c(5, 6, false);
		sub_2000c(5, 14, false);
		sub_2000c(5, 22, false);
		sub_2000c(5, 29, false);
		sub_2000c(5, 31, false);
		sub_2000c(5, 32, false);
		sub_2000c(5, 56, false);
		sub_2000c(5, 45, false);
		sub_2000c(5, 49, false);
		sub_2000c(5, 53, false);
		sub_2000c(5, 47, false);
	}

	private static void sub_48d55() {
		sub_48c86();
		if (cGame.var_7fd4 == 11) {
			cGame.var_6c94 = true;
		}
		int n = 0;
		Label_0115: {
			if (cGame.var_7e7c[cGame.var_7f6c] != 1) {
				if (cGame.var_7e7c[cGame.var_7f6c] == 6) {
					n = 8;
					break Label_0115;
				}
				if (cGame.var_7e7c[cGame.var_7f6c] == 2) {
					n = 15;
					break Label_0115;
				}
				if (cGame.var_7e7c[cGame.var_7f6c] == 5) {
					n = 24;
					break Label_0115;
				}
				if (cGame.var_7e7c[cGame.var_7f6c] == 3) {
					n = 25;
					break Label_0115;
				}
				if (cGame.var_7e7c[cGame.var_7f6c] == 4) {
					n = 26;
					break Label_0115;
				}
			}
			n = 7;
		}
		final short n2 = (short) n;
		if (cGame.var_68d4[n2] == null) {
			if (cGame.var_68bc[5][56][5] > -1 && cGame.var_68bc[5][56][5] != n2) {
				sub_d500(1, cGame.var_68bc[5][56][5], 65535, 1, 0, 0, -1);
			}
			sub_d500(1, n2, 1, 0, 24, 0, -1);
			GLLib.Pack_Open("/7");
			sub_d2e8(1, 3);
			GLLib.Pack_FullyClose();
		}
		if (cGame.var_7f5c[cGame.var_7f6c] == 1) {
			sub_405b1(cGame.var_7e64[cGame.var_7f6c], cGame.var_7e6c[cGame.var_7f6c], n2);
		} else if (cGame.var_7f5c[cGame.var_7f6c] == 2) {
			if (cGame.var_7e4c[cGame.var_7f6c] == cGame.var_80f4[0]
					|| cGame.var_7e4c[cGame.var_7f6c] == cGame.var_80f4[1]) {
				if (!cGame.var_7ebc[cGame.var_7f6c]) {
					if (cGame.var_7e4c[cGame.var_7f6c] == cGame.var_80f4[0]) {
						if (cGame.var_7fac) {
							sub_2000c(5, 58, true);
							cGame.var_7fac = false;
						} else {
							sub_2000c(5, 58, false);
						}
					} else if (cGame.var_7e4c[cGame.var_7f6c] == cGame.var_80f4[1]) {
						if (cGame.var_7fb4) {
							sub_2000c(5, 58, true);
							cGame.var_7fb4 = false;
						} else {
							sub_2000c(5, 58, false);
						}
					}
					sub_2000c(5, 57, false);
					sub_2024d(5, 57, false);
					sub_2024d(5, 13, false);
					sub_2024d(5, 21, false);
				} else {
					sub_2000c(5, 58, false);
					sub_2000c(5, 57, true);
					sub_2024d(5, 57, true);
					sub_2024d(5, 13, true);
					sub_2024d(5, 21, true);
				}
			} else {
				sub_2000c(5, 58, false);
				sub_2000c(5, 57, true);
				sub_2024d(5, 57, true);
				sub_2024d(5, 13, true);
				sub_2024d(5, 21, true);
			}
			sub_2000c(5, 2, true);
			sub_2000c(5, 56, true);
			cGame.var_68bc[5][56][5] = n2;
			cGame.var_68bc[5][56][6] = 0;
			sub_2000c(5, 5, true);
			sub_2000c(5, 13, true);
			sub_2000c(5, 21, true);
			if (getIntValue(cGame.var_7e9c[cGame.var_7f6c]) > 0 && cGame.var_7ebc[cGame.var_7f6c]) {
				sub_2000c(5, 9, true);
			} else {
				sub_2000c(5, 9, false);
			}
			if (getIntValue(cGame.var_7ed4[cGame.var_7f6c]) > 0 && cGame.var_7ef4[cGame.var_7f6c]) {
				sub_2000c(5, 17, true);
			} else {
				sub_2000c(5, 17, false);
			}
			if (getIntValue(cGame.var_7f0c[cGame.var_7f6c]) > 0 && cGame.var_7f2c[cGame.var_7f6c]) {
				sub_2000c(5, 25, true);
			} else {
				sub_2000c(5, 25, false);
			}
			if (getIntValue(cGame.var_7e94[cGame.var_7f6c]) < getIntValue(cGame.var_7e9c[cGame.var_7f6c])) {
				if (cGame.var_7eb4[cGame.var_7f6c] > 0) {
					sub_2000c(5, 10, true);
					sub_2024d(5, 10, true);
					sub_2000c(5, 11, true);
				}
				sub_2000c(5, 6, true);
				sub_2024d(5, 5, true);
			} else {
				sub_2000c(5, 10, false);
				sub_2024d(5, 10, false);
				sub_2000c(5, 11, false);
				sub_2000c(5, 6, false);
				sub_2024d(5, 5, false);
			}
			if (getIntValue(cGame.var_7ecc[cGame.var_7f6c]) < getIntValue(cGame.var_7ed4[cGame.var_7f6c])) {
				if (cGame.var_7eec[cGame.var_7f6c] > 0) {
					sub_2000c(5, 18, true);
					sub_2024d(5, 18, true);
					sub_2000c(5, 19, true);
				}
				sub_2000c(5, 14, true);
			} else {
				sub_2000c(5, 18, false);
				sub_2024d(5, 18, false);
				sub_2000c(5, 19, false);
				sub_2000c(5, 14, false);
				sub_2024d(5, 13, false);
			}
			if (getIntValue(cGame.var_7f04[cGame.var_7f6c]) < getIntValue(cGame.var_7f0c[cGame.var_7f6c])) {
				if (cGame.var_7f24[cGame.var_7f6c] > 0) {
					sub_2000c(5, 26, true);
					sub_2024d(5, 26, true);
					sub_2000c(5, 27, true);
				}
				sub_2000c(5, 22, true);
			} else {
				sub_2000c(5, 26, false);
				sub_2024d(5, 26, false);
				sub_2000c(5, 27, false);
				sub_2000c(5, 22, false);
				sub_2024d(5, 21, false);
			}
		} else if (cGame.var_7f5c[cGame.var_7f6c] == 3) {
			sub_2000c(5, 58, false);
			sub_2000c(5, 31, true);
			sub_2000c(5, 32, true);
			sub_2000c(5, 56, true);
			cGame.var_68bc[5][56][5] = n2;
			cGame.var_68bc[5][56][6] = 0;
			sub_2000c(5, 45, true);
			if (getIntValue(cGame.var_7f4c[cGame.var_7f6c]) > 0) {
				sub_2000c(5, 49, true);
			} else {
				sub_2000c(5, 49, false);
			}
			if (getIntValue(cGame.var_7f54[cGame.var_7f6c]) > 0 && !cGame.s_iapEnabled) {
				sub_2000c(5, 47, true);
			} else {
				sub_2000c(5, 47, false);
			}
			sub_2000c(5, 53, true);
			try {
				Thread.sleep(700L);
			} catch (final Exception ex) {
			}
			cGame.var_6a6c = 0L;
			sub_23a84(45);
		}
		sub_2c69b();
		sub_1fb8e(5);
	}

	private static void sub_492fc() {
		cGame.var_7f84 = null;
		cGame.var_7f8c = null;
		cGame.var_7f94 = 0;
		cGame.var_7f9c = false;
		cGame.var_7fa4 = -1;
	}

	private static void sub_4932b() {
		cGame.var_7fac = true;
		cGame.var_7fb4 = true;
	}

	private static void sub_4934e() {
		cGame.var_7e4c = new int[cGame.var_7f74];
		cGame.var_7e54 = new int[cGame.var_7f74];
		cGame.var_7e5c = new int[cGame.var_7f74];
		cGame.var_7e64 = new String[cGame.var_7f74];
		cGame.var_7e6c = new String[cGame.var_7f74];
		cGame.var_7e74 = new String[cGame.var_7f74];
		cGame.var_7e84 = new int[cGame.var_7f74];
		cGame.var_7e7c = new int[cGame.var_7f74];
		cGame.var_7e8c = new String[cGame.var_7f74];
		cGame.var_7ec4 = new String[cGame.var_7f74];
		cGame.s_loadedTexts = new String[cGame.var_7f74];
		cGame.var_7e94 = new int[cGame.var_7f74];
		cGame.var_7e9c = new int[cGame.var_7f74];
		cGame.var_7ebc = new boolean[cGame.var_7f74];
		cGame.var_7ea4 = new int[cGame.var_7f74];
		cGame.var_7eac = new int[cGame.var_7f74];
		cGame.var_7eb4 = new int[cGame.var_7f74];
		cGame.var_7ecc = new int[cGame.var_7f74];
		cGame.var_7ed4 = new int[cGame.var_7f74];
		cGame.var_7ef4 = new boolean[cGame.var_7f74];
		cGame.var_7edc = new int[cGame.var_7f74];
		cGame.var_7ee4 = new int[cGame.var_7f74];
		cGame.var_7eec = new int[cGame.var_7f74];
		cGame.var_7f04 = new int[cGame.var_7f74];
		cGame.var_7f0c = new int[cGame.var_7f74];
		cGame.var_7f2c = new boolean[cGame.var_7f74];
		cGame.var_7f14 = new int[cGame.var_7f74];
		cGame.var_7f1c = new int[cGame.var_7f74];
		cGame.var_7f24 = new int[cGame.var_7f74];
		cGame.var_7f34 = new int[cGame.var_7f74];
		cGame.var_7f3c = new String[cGame.var_7f74];
		cGame.var_7f44 = new int[cGame.var_7f74];
		cGame.var_7f4c = new int[cGame.var_7f74];
		cGame.var_7f54 = new int[cGame.var_7f74];
		cGame.var_7f5c = new int[cGame.var_7f74];
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			cGame.var_7e4c[c] = -1;
			cGame.var_7e54[c] = -1;
			cGame.var_7e5c[c] = 0;
			cGame.var_7e64[c] = "";
			cGame.var_7e6c[c] = "";
			cGame.var_7e74[c] = "";
			cGame.var_7e84[c] = 0;
			cGame.var_7e7c[c] = 0;
			cGame.var_7e8c[c] = "";
			cGame.var_7ec4[c] = "";
			cGame.s_loadedTexts[c] = "";
			cGame.var_7e94[c] = sub_30161(0);
			cGame.var_7e9c[c] = sub_30161(0);
			cGame.var_7ebc[c] = false;
			cGame.var_7ea4[c] = 0;
			cGame.var_7eac[c] = 0;
			cGame.var_7eb4[c] = 0;
			cGame.var_7ecc[c] = 0;
			cGame.var_7ed4[c] = 0;
			cGame.var_7ef4[c] = false;
			cGame.var_7edc[c] = 0;
			cGame.var_7ee4[c] = 0;
			cGame.var_7eec[c] = 0;
			cGame.var_7f04[c] = 0;
			cGame.var_7f0c[c] = 0;
			cGame.var_7f2c[c] = false;
			cGame.var_7f14[c] = 0;
			cGame.var_7f1c[c] = 0;
			cGame.var_7f24[c] = 0;
			cGame.var_7f34[c] = 0;
			cGame.var_7f3c[c] = "";
			cGame.var_7f44[c] = sub_30161(0);
			cGame.var_7f4c[c] = sub_30161(0);
			cGame.var_7f5c[c] = 0;
		}
		cGame.var_7f6c = 0;
		cGame.var_7f64 = new int[cGame.var_7f7c];
		for (int i = 0; i < cGame.var_7f7c; ++i) {
			cGame.var_7f64[i] = -1;
		}
		cGame.var_7f8c = new boolean[22];
		for (int j = 0; j < 22; ++j) {
			cGame.var_7f8c[j] = false;
		}
		final Class_h class_h = Class_h.var_6a[6];
		(cGame.var_7f84 = new short[22])[0] = (short) class_h.var_82[18][1];
		cGame.var_7f84[1] = (short) class_h.var_82[44][1];
		cGame.var_7f84[2] = (short) class_h.var_82[49][1];
		cGame.var_7f84[3] = (short) class_h.var_82[62][1];
		cGame.var_7f84[4] = (short) class_h.var_82[68][1];
		cGame.var_7f84[5] = (short) class_h.var_82[85][1];
		cGame.var_7f84[6] = (short) class_h.var_82[112][1];
		cGame.var_7f84[7] = (short) class_h.var_82[124][1];
		cGame.var_7f84[8] = (short) class_h.var_82[131][1];
		cGame.var_7f84[9] = (short) class_h.var_82[164][1];
		cGame.var_7f84[10] = (short) class_h.var_82[165][1];
		cGame.var_7f84[11] = (short) class_h.var_82[170][1];
		cGame.var_7f84[12] = (short) class_h.var_82[180][1];
		cGame.var_7f84[13] = (short) class_h.var_82[181][1];
		cGame.var_7f84[14] = (short) class_h.var_82[205][1];
		cGame.var_7f84[15] = (short) class_h.var_82[229][1];
		cGame.var_7f84[16] = (short) class_h.var_82[233][1];
		cGame.var_7f84[17] = (short) class_h.var_82[239][1];
		cGame.var_7f84[18] = (short) class_h.var_82[267][1];
		cGame.var_7f84[19] = (short) class_h.var_82[270][1];
		cGame.var_7f84[20] = (short) class_h.var_82[291][1];
		cGame.var_7f84[21] = (short) class_h.var_82[292][1];
	}

	private static void sub_49758() {
		if (sub_49794()) {
			sub_26a6a(true, cGame.var_7f6c, '\u0001');
		}
		cGame.var_7f6c = 0;
	}

	private static boolean sub_49794() {
		boolean b = false;
		if (cGame.var_7fd4 != -1 && cGame.var_7fd4 != 10) {
			return false;
		}
		final Class_h class_h = Class_h.var_6a[6];
		int n = 0;
		for (char var_7f6c = '\0'; var_7f6c < cGame.var_7f74; ++var_7f6c) {
			if (!sub_4aad0(var_7f6c)) {
				for (int i = n; i < cGame.var_7f7c; ++i) {
					final int n2 = class_h.var_82[i][1];
					boolean b2 = false;
					for (char c = '\0'; c < cGame.var_7f74 && cGame.var_7e4c[c] != -1; ++c) {
						if (cGame.var_7e4c[c] == n2) {
							b2 = true;
							break;
						}
					}
					if (!b2 && !sub_4abbb(n2) && getLevel() >= class_h.var_82[i][14]) {
						final int n3 = class_h.var_82[i][15];
						final int n4 = class_h.var_82[i][16];
						final int n5 = class_h.var_82[i][17];
						boolean b3 = true;
						if (n3 != -1 && !sub_4abbb(class_h.var_82[n3][1])) {
							b3 = false;
						}
						if (n4 != -1 && !sub_4abbb(class_h.var_82[n4][1])) {
							b3 = false;
						}
						if (n5 != -1 && !sub_4abbb(class_h.var_82[n5][1])) {
							b3 = false;
						}
						if (b3) {
							sub_4a22d(i, var_7f6c, true);
							b = true;
							cGame.var_7f6c = var_7f6c;
							n = i;
							break;
						}
					}
				}
			}
		}
		return b;
	}

	private static void sub_4998f(final int n, final int n2) {
		if (cGame.var_7e4c[n] != -1 && cGame.var_7f5c[n] != 3) {
			if (n2 == 0) {
				cGame.var_7e94[n] = cGame.var_7e9c[n];
				cGame.var_7ebc[n] = true;
			} else if (n2 == 1) {
				cGame.var_7ecc[n] = cGame.var_7ed4[n];
				cGame.var_7ef4[n] = true;
			} else if (n2 == 2) {
				cGame.var_7f04[n] = cGame.var_7f0c[n];
				cGame.var_7f2c[n] = true;
			}
			if ((getIntValue(cGame.var_7e9c[n]) == 0 || cGame.var_7ebc[n])
					&& (getIntValue(cGame.var_7ed4[n]) == 0 || cGame.var_7ef4[n])
					&& (getIntValue(cGame.var_7f0c[n]) == 0 || cGame.var_7f2c[n])) {
				sub_4ab1c(n, false);
			}
		}
	}

	private static int sub_49a81(final boolean b, final int n, final int n2, final int n3, final int n4,
			final boolean b2) {
		final short n5 = cGame.var_80a4[3];
		final short n6 = cGame.var_80a4[4];
		final short n7 = cGame.var_80a4[15];
		final short n8 = cGame.var_80a4[16];
		final short n9 = cGame.var_80a4[27];
		final short n10 = cGame.var_80a4[28];
		final short n11 = cGame.var_80a4[39];
		final short n12 = cGame.var_80a4[40];
		final short n13 = cGame.var_80a4[51];
		final short n14 = cGame.var_80a4[52];
		final short n15 = cGame.var_80a4[63];
		final short n16 = cGame.var_8094[12];
		final short n17 = cGame.var_8094[21];
		final int n18 = cGame.var_80bc[0];
		final int n19 = cGame.var_80bc[9];
		final short n20 = cGame.var_80a4[0];
		final short n21 = cGame.var_80a4[61];
		if (!b && n == 2990 && n2 >= n20 && n2 <= n21 && n3 == n4 && b2) {
			return 3;
		}
		if (!b && (n == n2 || (n == 9999 && n2 >= n18 && n2 <= n19)) && n3 == n4 && n3 == 29) {
			return 2;
		}
		if (!b && (n == n2 || (n == 2999 && n2 >= 2000 && n2 < 2999) || (n == 2993 && n2 >= 2000 && n2 <= n5)
				|| (n == 2998 && n2 >= n6 && n2 <= n7) || (n == 2997 && n2 >= n8 && n2 <= n9)
				|| (n == 2996 && n2 >= n10 && n2 <= n11) || (n == 2995 && n2 >= n12 && n2 <= n13)
				|| (n == 2994 && n2 >= n14 && n2 <= n15) || (n == 3999 && n2 >= n16 && n2 <= n17)
				|| (n == 9999 && n2 >= n18 && n2 <= n19)) && n3 == n4) {
			return 1;
		}
		return 0;
	}

	static int sub_49db0(final int n, final int n2, final int n3, final boolean b) {
		int n4 = 0;
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			if (cGame.var_7f5c[c] == 2) {
				int var_7fa4 = -1;
				final int sub_49a81;
				if ((sub_49a81 = sub_49a81(cGame.var_7ebc[c], cGame.var_7ea4[c], n, cGame.var_7eac[c], n3,
						b)) == 3 || sub_49a81 == 1) {
					cGame.var_7e94[c] = sub_30161(getIntValue(cGame.var_7e94[c]) + n2);
					if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
						cGame.var_7e94[c] = cGame.var_7e9c[c];
						cGame.var_7ebc[c] = true;
						var_7fa4 = c;
					}
					if (getIntValue(cGame.var_7e94[c]) < 0) {
						cGame.var_7e94[c] = 0;
					}
				} else if (sub_49a81 == 2) {
					if (n2 >= getIntValue(cGame.var_7e9c[c])) {
						cGame.var_7e94[c] = cGame.var_7e9c[c];
						cGame.var_7ebc[c] = true;
						var_7fa4 = c;
					} else {
						cGame.var_7e94[c] = sub_30161(n2);
					}
				}
				final int sub_49a82;
				if ((sub_49a82 = sub_49a81(cGame.var_7ef4[c], cGame.var_7edc[c], n, cGame.var_7ee4[c], n3,
						b)) == 3 || sub_49a82 == 1) {
					cGame.var_7ecc[c] = sub_30161(getIntValue(cGame.var_7ecc[c]) + n2);
					if (getIntValue(cGame.var_7ecc[c]) >= getIntValue(cGame.var_7ed4[c])) {
						cGame.var_7ecc[c] = cGame.var_7ed4[c];
						cGame.var_7ef4[c] = true;
						var_7fa4 = c;
					}
					if (getIntValue(cGame.var_7ecc[c]) < 0) {
						cGame.var_7ecc[c] = sub_30161(0);
					}
				} else if (sub_49a82 == 2) {
					if (n2 >= getIntValue(cGame.var_7ed4[c])) {
						cGame.var_7ecc[c] = cGame.var_7ed4[c];
						cGame.var_7ef4[c] = true;
						var_7fa4 = c;
					} else {
						cGame.var_7ecc[c] = sub_30161(n2);
					}
				}
				final int sub_49a83;
				if ((sub_49a83 = sub_49a81(cGame.var_7f2c[c], cGame.var_7f14[c], n, cGame.var_7f1c[c], n3,
						b)) == 3 || sub_49a83 == 1) {
					cGame.var_7f04[c] = sub_30161(getIntValue(cGame.var_7f04[c]) + n2);
					if (getIntValue(cGame.var_7f04[c]) >= getIntValue(cGame.var_7f0c[c])) {
						cGame.var_7f04[c] = cGame.var_7f0c[c];
						cGame.var_7f2c[c] = true;
						var_7fa4 = c;
					}
					if (getIntValue(cGame.var_7f04[c]) < 0) {
						cGame.var_7f04[c] = sub_30161(0);
					}
				} else if (sub_49a83 == 2) {
					if (n2 >= getIntValue(cGame.var_7f0c[c])) {
						cGame.var_7f04[c] = cGame.var_7f0c[c];
						cGame.var_7f2c[c] = true;
						var_7fa4 = c;
					} else {
						cGame.var_7f04[c] = sub_30161(n2);
					}
				}
				if (var_7fa4 != -1) {
					cGame.var_7fa4 = var_7fa4;
					if (cGame.var_7fd4 == -1) {
						try {
							Thread.sleep(700L);
						} catch (final Exception ex) {
						}
						cGame.var_6a6c = 0L;
					}
					sub_23a84(39);
					if ((getIntValue(cGame.var_7e9c[var_7fa4]) == 0 || cGame.var_7ebc[var_7fa4])
							&& (getIntValue(cGame.var_7ed4[var_7fa4]) == 0 || cGame.var_7ef4[var_7fa4])
							&& (getIntValue(cGame.var_7f0c[var_7fa4]) == 0 || cGame.var_7f2c[var_7fa4])) {
						sub_4ab1c(var_7fa4, false);
						n4 = 1;
					}
					if (n3 != 8) {
						sub_26a6a(true, var_7fa4, '\u0002');
					} else {
						cGame.var_6bc4 = true;
						cGame.var_6bcc = '\u0002';
					}
				}
			}
		}
		return n4;
	}

	static int sub_4a20b(final int n, final int n2, final int n3) {
		return sub_49db0(n, n2, n3, false);
	}

	private static void sub_4a22d(final int n, final int n2, final boolean b) {
		final Class_h class_h = Class_h.var_6a[6];
		cGame.var_7e4c[n2] = class_h.var_82[n][1];
		cGame.var_7e54[n2] = n;
		sub_2024d(1, 44, true);
		cGame.var_7e5c[n2] = class_h.var_82[n][14];
		final int n3;
		String[] array;
		int n4;
		String s;
		if ((n3 = class_h.var_82[n][3]) < 0) {
			array = cGame.var_7e64;
			n4 = n2;
			s = "%TITLE TEXT ERROR%";
		} else {
			array = cGame.var_7e64;
			n4 = n2;
			final String sub_4e1f;
			s = (((sub_4e1f = GLLib.TODO_sub_4e1f(n3)) == null) ? "" : sub_4e1f);
		}
		array[n4] = s;
		final int n5;
		String[] array2;
		int n6;
		String s2;
		if ((n5 = class_h.var_82[n][5]) < 0) {
			array2 = cGame.var_7e6c;
			n6 = n2;
			s2 = "%INTRO TEXT ERROR%";
		} else {
			array2 = cGame.var_7e6c;
			n6 = n2;
			final String sub_4e1f2;
			s2 = (((sub_4e1f2 = GLLib.TODO_sub_4e1f(n5)) == null) ? "" : sub_4e1f2);
		}
		array2[n6] = s2;
		final int n7;
		String[] array3;
		int n8;
		String s3;
		if ((n7 = class_h.var_82[n][6]) < 0) {
			array3 = cGame.var_7e74;
			n8 = n2;
			s3 = "%DESC TEXT ERROR%";
		} else {
			array3 = cGame.var_7e74;
			n8 = n2;
			final String sub_4e1f3;
			s3 = (((sub_4e1f3 = GLLib.TODO_sub_4e1f(n7)) == null) ? "" : sub_4e1f3);
		}
		array3[n8] = s3;
		cGame.var_7e84[n2] = class_h.var_82[n][7];
		cGame.var_7e7c[n2] = class_h.var_82[n][4];
		final int n9;
		String[] array4;
		int n10;
		String s4;
		if ((n9 = class_h.var_82[n][18]) < 0) {
			array4 = cGame.var_7e8c;
			n10 = n2;
			s4 = "%OBJ1 TEXT ERROR%";
		} else {
			array4 = cGame.var_7e8c;
			n10 = n2;
			final String sub_4e1f4;
			s4 = (((sub_4e1f4 = GLLib.TODO_sub_4e1f(n9)) == null) ? "" : sub_4e1f4);
		}
		array4[n10] = s4;
		final int n11;
		String[] array5;
		int n12;
		String s5;
		if ((n11 = class_h.var_82[n][23]) < 0) {
			array5 = cGame.var_7ec4;
			n12 = n2;
			s5 = "%OBJ2 TEXT ERROR%";
		} else if (n11 == 0) {
			array5 = cGame.var_7ec4;
			n12 = n2;
			s5 = "";
		} else {
			array5 = cGame.var_7ec4;
			n12 = n2;
			final String sub_4e1f5;
			s5 = (((sub_4e1f5 = GLLib.TODO_sub_4e1f(n11)) == null) ? "" : sub_4e1f5);
		}
		array5[n12] = s5;
		final int n13;
		String[] array6;
		int n14;
		String s6;
		if ((n13 = class_h.var_82[n][28]) < 0) {
			array6 = cGame.s_loadedTexts;
			n14 = n2;
			s6 = "%%OBJ3 TEXT ERROR";
		} else if (n13 == 0) {
			array6 = cGame.s_loadedTexts;
			n14 = n2;
			s6 = "";
		} else {
			array6 = cGame.s_loadedTexts;
			n14 = n2;
			final String sub_4e1f6;
			s6 = (((sub_4e1f6 = GLLib.TODO_sub_4e1f(n13)) == null) ? "" : sub_4e1f6);
		}
		array6[n14] = s6;
		cGame.var_7e9c[n2] = sub_30161(class_h.var_82[n][20]);
		cGame.var_7ea4[n2] = class_h.var_82[n][19];
		cGame.var_7eac[n2] = class_h.var_82[n][21];
		cGame.var_7eb4[n2] = class_h.var_82[n][22];
		cGame.var_7ed4[n2] = sub_30161(class_h.var_82[n][25]);
		cGame.var_7edc[n2] = class_h.var_82[n][24];
		cGame.var_7ee4[n2] = class_h.var_82[n][26];
		cGame.var_7eec[n2] = class_h.var_82[n][27];
		cGame.var_7f0c[n2] = sub_30161(class_h.var_82[n][30]);
		cGame.var_7f14[n2] = class_h.var_82[n][29];
		cGame.var_7f1c[n2] = class_h.var_82[n][31];
		cGame.var_7f24[n2] = class_h.var_82[n][32];
		final int n15;
		String[] array7;
		int n16;
		String s7;
		if ((n15 = class_h.var_82[n][13]) < 0) {
			array7 = cGame.var_7f3c;
			n16 = n2;
			s7 = "%OUTRO TEXT ERROR%";
		} else {
			array7 = cGame.var_7f3c;
			n16 = n2;
			final String sub_4e1f7;
			s7 = (((sub_4e1f7 = GLLib.TODO_sub_4e1f(n15)) == null) ? "" : sub_4e1f7);
		}
		array7[n16] = s7;
		cGame.var_7f44[n2] = sub_30161(class_h.var_82[n][8]);
		cGame.var_7f4c[n2] = sub_30161(class_h.var_82[n][10]);
		cGame.var_7f54[n2] = sub_30161(class_h.var_82[n][12]);
		if (b) {
			cGame.var_7f5c[n2] = 1;
			cGame.var_7e94[n2] = sub_30161(0);
			cGame.var_7ebc[n2] = false;
			cGame.var_7ecc[n2] = sub_30161(0);
			cGame.var_7ef4[n2] = false;
			cGame.var_7f04[n2] = sub_30161(0);
			cGame.var_7f2c[n2] = false;
			sub_10c1f(true);
		}
	}

	private static void sub_4a6a7(final int var_7f6c) {
		if (cGame.var_7f5c[var_7f6c] != 3) {
			return;
		}
		cGame.var_7e4c[var_7f6c] = -1;
		cGame.var_7e54[var_7f6c] = -1;
		cGame.var_7e5c[var_7f6c] = 0;
		cGame.var_7e64[var_7f6c] = "";
		cGame.var_7e6c[var_7f6c] = "";
		cGame.var_7e74[var_7f6c] = "";
		cGame.var_7e84[var_7f6c] = 0;
		cGame.var_7e7c[var_7f6c] = 0;
		cGame.var_7e8c[var_7f6c] = "";
		cGame.var_7ec4[var_7f6c] = "";
		cGame.s_loadedTexts[var_7f6c] = "";
		cGame.var_7e94[var_7f6c] = sub_30161(0);
		cGame.var_7e9c[var_7f6c] = sub_30161(0);
		cGame.var_7ebc[var_7f6c] = false;
		cGame.var_7ea4[var_7f6c] = 0;
		cGame.var_7eac[var_7f6c] = 0;
		cGame.var_7eb4[var_7f6c] = 0;
		cGame.var_7ecc[var_7f6c] = sub_30161(0);
		cGame.var_7ed4[var_7f6c] = sub_30161(0);
		cGame.var_7ef4[var_7f6c] = false;
		cGame.var_7edc[var_7f6c] = 0;
		cGame.var_7ee4[var_7f6c] = 0;
		cGame.var_7eec[var_7f6c] = 0;
		cGame.var_7f04[var_7f6c] = sub_30161(0);
		cGame.var_7f0c[var_7f6c] = sub_30161(0);
		cGame.var_7f2c[var_7f6c] = false;
		cGame.var_7f14[var_7f6c] = 0;
		cGame.var_7f1c[var_7f6c] = 0;
		cGame.var_7f24[var_7f6c] = 0;
		cGame.var_7f34[var_7f6c] = 0;
		cGame.var_7f3c[var_7f6c] = "";
		cGame.var_7f44[var_7f6c] = sub_30161(0);
		cGame.var_7f4c[var_7f6c] = sub_30161(0);
		cGame.var_7f54[var_7f6c] = sub_30161(0);
		cGame.var_7f5c[var_7f6c] = 0;
		int n = var_7f6c + 1;
		for (int n2 = var_7f6c; n2 < cGame.var_7f74 - '\u0001' && cGame.var_7e4c[n2 + 1] != -1; ++n2) {
			n = n2 + 1;
			cGame.var_7e4c[n2] = cGame.var_7e4c[n2 + 1];
			cGame.var_7e54[n2] = cGame.var_7e54[n2 + 1];
			cGame.var_7e5c[n2] = cGame.var_7e5c[n2 + 1];
			cGame.var_7e64[n2] = cGame.var_7e64[n2 + 1];
			cGame.var_7e6c[n2] = cGame.var_7e6c[n2 + 1];
			cGame.var_7e74[n2] = cGame.var_7e74[n2 + 1];
			cGame.var_7e84[n2] = cGame.var_7e84[n2 + 1];
			cGame.var_7e7c[n2] = cGame.var_7e7c[n2 + 1];
			cGame.var_7e8c[n2] = cGame.var_7e8c[n2 + 1];
			cGame.var_7ec4[n2] = cGame.var_7ec4[n2 + 1];
			cGame.s_loadedTexts[n2] = cGame.s_loadedTexts[n2 + 1];
			cGame.var_7e94[n2] = cGame.var_7e94[n2 + 1];
			cGame.var_7e9c[n2] = cGame.var_7e9c[n2 + 1];
			cGame.var_7ebc[n2] = cGame.var_7ebc[n2 + 1];
			cGame.var_7ea4[n2] = cGame.var_7ea4[n2 + 1];
			cGame.var_7eac[n2] = cGame.var_7eac[n2 + 1];
			cGame.var_7eb4[n2] = cGame.var_7eb4[n2 + 1];
			cGame.var_7ecc[n2] = cGame.var_7ecc[n2 + 1];
			cGame.var_7ed4[n2] = cGame.var_7ed4[n2 + 1];
			cGame.var_7ef4[n2] = cGame.var_7ef4[n2 + 1];
			cGame.var_7edc[n2] = cGame.var_7edc[n2 + 1];
			cGame.var_7ee4[n2] = cGame.var_7ee4[n2 + 1];
			cGame.var_7eec[n2] = cGame.var_7eec[n2 + 1];
			cGame.var_7f04[n2] = cGame.var_7f04[n2 + 1];
			cGame.var_7f0c[n2] = cGame.var_7f0c[n2 + 1];
			cGame.var_7f2c[n2] = cGame.var_7f2c[n2 + 1];
			cGame.var_7f14[n2] = cGame.var_7f14[n2 + 1];
			cGame.var_7f1c[n2] = cGame.var_7f1c[n2 + 1];
			cGame.var_7f24[n2] = cGame.var_7f24[n2 + 1];
			cGame.var_7f34[n2] = cGame.var_7f34[n2 + 1];
			cGame.var_7f3c[n2] = cGame.var_7f3c[n2 + 1];
			cGame.var_7f44[n2] = cGame.var_7f44[n2 + 1];
			cGame.var_7f4c[n2] = cGame.var_7f4c[n2 + 1];
			cGame.var_7f54[n2] = cGame.var_7f54[n2 + 1];
			cGame.var_7f5c[n2] = cGame.var_7f5c[n2 + 1];
		}
		if (n < cGame.var_7f74) {
			cGame.var_7e4c[n] = -1;
			cGame.var_7e54[n] = -1;
			cGame.var_7e5c[n] = 0;
			cGame.var_7e64[n] = "";
			cGame.var_7e6c[n] = "";
			cGame.var_7e74[n] = "";
			cGame.var_7e84[n] = 0;
			cGame.var_7e7c[n] = 0;
			cGame.var_7e8c[n] = "";
			cGame.var_7ec4[n] = "";
			cGame.s_loadedTexts[n] = "";
			cGame.var_7e94[n] = sub_30161(0);
			cGame.var_7e9c[n] = sub_30161(0);
			cGame.var_7ebc[n] = false;
			cGame.var_7ea4[n] = 0;
			cGame.var_7eac[n] = 0;
			cGame.var_7eb4[n] = 0;
			cGame.var_7ecc[n] = sub_30161(0);
			cGame.var_7ed4[n] = sub_30161(0);
			cGame.var_7ef4[n] = false;
			cGame.var_7edc[n] = 0;
			cGame.var_7ee4[n] = 0;
			cGame.var_7eec[n] = 0;
			cGame.var_7f04[n] = sub_30161(0);
			cGame.var_7f0c[n] = sub_30161(0);
			cGame.var_7f2c[n] = false;
			cGame.var_7f14[n] = 0;
			cGame.var_7f1c[n] = 0;
			cGame.var_7f24[n] = 0;
			cGame.var_7f34[n] = 0;
			cGame.var_7f3c[n] = "";
			cGame.var_7f44[n] = sub_30161(0);
			cGame.var_7f4c[n] = sub_30161(0);
			cGame.var_7f54[n] = sub_30161(0);
			cGame.var_7f5c[n] = 0;
		}
		cGame.var_7f6c = var_7f6c;
		if (var_7f6c >= 1 && cGame.var_7e4c[var_7f6c] == -1) {
			--cGame.var_7f6c;
		}
	}

	private static boolean sub_4aad0(final int n) {
		boolean b = false;
		if (cGame.var_7e4c[n] != -1) {
			b = true;
		}
		if (cGame.var_7e54[n] != -1) {
			b = true;
		}
		return b;
	}

	private static void sub_4ab1c(final int var_7f6c, final boolean b) {
		cGame.var_7f5c[var_7f6c] = 3;
		cGame.var_7f6c = var_7f6c;
		final int n = cGame.var_7e54[var_7f6c];
		if (!b) {
			cGame.var_7f64[n] = cGame.var_7e4c[var_7f6c];
		}
		if (sub_8396() == 17) {
			sub_10947(false);
		}
		if (cGame.var_7eac[var_7f6c] == 1) {
			final Class_f[] array = new Class_f[30];
			for (int sub_5439 = Class_f.sub_5439(0, 22, array, 30), i = 0; i < sub_5439; ++i) {
				array[i].sub_9274();
			}
		}
	}

	static boolean sub_4abbb(final int n) {
		boolean b = false;
		for (int i = 0; i < cGame.var_7f7c; ++i) {
			if (cGame.var_7f64[i] == n) {
				b = true;
				break;
			}
		}
		return b;
	}

	static boolean sub_4ac19(final int n) {
		boolean b = false;
		for (char c = '\0'; c < cGame.var_7f74 && cGame.var_7e4c[c] != -1; ++c) {
			if (cGame.var_7f5c[c] >= 2 && cGame.var_7e4c[c] == cGame.var_80f4[n]) {
				b = true;
				break;
			}
		}
		return b;
	}

	private static boolean sub_4ac8d() {
		boolean b = true;
		for (int i = 0; i < cGame.var_7f7c; ++i) {
			if (cGame.var_7f64[i] == -1) {
				b = false;
				break;
			}
		}
		return b;
	}

	private static int sub_4ace8() {
		int n = 0;
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			if (sub_4aad0(c)) {
				++n;
			}
		}
		return n;
	}

	static void sub_4ad3f(final int n) {
		for (char c = '\0'; c < cGame.var_7f74; ++c) {
			if (cGame.var_7f5c[c] == 2) {
				if (!cGame.var_7ebc[c] && cGame.var_7eac[c] == 38) {
					int n2 = -1;
					if (cGame.var_7ea4[c] == 2998) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 4, 15));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (cGame.var_7ea4[c] == 2997) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 16, 27));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (cGame.var_7ea4[c] == 2996) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 28, 39));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (cGame.var_7ea4[c] == 2995) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 40, 51));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (cGame.var_7ea4[c] == 2994) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 52, 63));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (cGame.var_7ea4[c] == 2999) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4de1(0, 54, 0, 63));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					} else if (n == cGame.var_7ea4[c]) {
						cGame.var_7e94[c] = sub_30161(Class_f.sub_4d73(0, n));
						if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
							cGame.var_7e94[c] = cGame.var_7e9c[c];
							n2 = c;
						}
					}
					if (n2 != -1) {
						cGame.var_7ebc[n2] = true;
						if ((getIntValue(cGame.var_7e9c[n2]) == 0 || cGame.var_7ebc[n2])
								&& (getIntValue(cGame.var_7ed4[n2]) == 0 || cGame.var_7ef4[n2])
								&& (getIntValue(cGame.var_7f0c[n2]) == 0 || cGame.var_7f2c[n2])) {
							sub_4ab1c(n2, false);
						}
						sub_26a6a(true, n2, '\u0002');
					}
				} else if (!cGame.var_7ebc[c] && cGame.var_7eac[c] == 32) {
					cGame.var_7e94[c] = sub_30161(Class_f.sub_4ed9(0, 54));
					if (getIntValue(cGame.var_7e94[c]) >= getIntValue(cGame.var_7e9c[c])) {
						cGame.var_7e94[c] = cGame.var_7e9c[c];
						cGame.var_7ebc[c] = true;
						if ((getIntValue(cGame.var_7e9c[c]) == 0 || cGame.var_7ebc[c])
								&& (getIntValue(cGame.var_7ed4[c]) == 0 || cGame.var_7ef4[c])
								&& (getIntValue(cGame.var_7f0c[c]) == 0 || cGame.var_7f2c[c])) {
							sub_4ab1c(c, false);
						}
						sub_26a6a(true, c, '\u0002');
					}
				}
			}
		}
	}

	cGame(final Object o, final Object o2) {
		super(o, o2);
		GLLib.Game_KeySetKeyCode(false, 50, 8);
		GLLib.Game_KeySetKeyCode(false, 52, 10);
		GLLib.Game_KeySetKeyCode(false, 54, 12);
		GLLib.Game_KeySetKeyCode(false, 56, 14);
		GLLib.Game_KeySetKeyCode(false, 53, 11);
		//cGame.field_a_int = -1;
		cGame.field_a_int = 0;
		cGame.var_67cc = -1;
		cGame.var_67c4 = -1;
		cGame.var_67ec = 0;
		cGame.var_67f4 = 0;
		cGame.var_67dc = new int[15];
		//cGame.var_67dc[0] = 44;
		cGame.var_67e4 = new byte[6];
		for (int i = 0; i < 45; ++i) {
			sub_818c(i, true);
		}
		sub_818c(19, false);
		sub_818c(42, false);
		sub_81e0(1);
		cGame.var_8014 = null;
		cGame.var_801c = null;
		cGame.var_8024 = null;
		cGame.var_802c = null;
		cGame.var_803c = 0;
		final long n = GLLib.s_game_timeWhenFrameStart * GLLib.s_game_totalExecutionTime;
		if (GLLib.s_math_random == null) {
			GLLib.s_math_random = new Random(n);
			return;
		}
		GLLib.s_math_random.setSeed(n);
	}

	final void sub_4b20a() {
		final long currentTimeMillis = System.currentTimeMillis();
		final long currentTimeMillis2 = System.currentTimeMillis();
		sub_b465();
		if (cGame.var_67cc == -1 && cGame.var_67dc[cGame.field_a_int] != 44) {
			cGame.var_8014 = null;
			cGame.var_801c = null;
			cGame.var_8024 = null;
			cGame.var_6f0c = cGame.var_6f2c;
			cGame.var_6f14 = cGame.var_6f34;
			cGame.var_6f2c = cGame.var_6f1c;
			cGame.var_6f34 = cGame.var_6f24;
			final int var_6f9c = cGame.var_6f9c;
			if (cGame.var_6f94 < 0) {
				cGame.var_6f7c = -1;
				cGame.var_6f8c = -1;
				cGame.var_6f94 = -1;
				int n = 0;
				Label_0207: {
					if (cGame.var_6f74 != null) {
						for (int i = cGame.var_6f74.length - 1; i >= 0; --i) {
							if (cGame.var_6f74[i] != null && cGame.var_6f74[i][5] != -1
									&& sub_2c577(GLLib.s_screenX, GLLib.s_screenY, cGame.var_6f74[i][0],
											cGame.var_6f74[i][1], cGame.var_6f74[i][2], cGame.var_6f74[i][3])) {
								n = cGame.var_6f74[i][5];
								break Label_0207;
							}
						}
					}
					n = -1;
				}
				final int var_6f94 = n;
				if (GLLib.var_202f == 1 && var_6f94 > -1) {
					cGame.var_6f7c = var_6f94;
					cGame.var_6f84 = var_6f94;
					cGame.var_6f9c = var_6f94;
				} else if (GLLib.var_202f == 2) {
					cGame.var_6f8c = var_6f94;
					if (cGame.var_6f84 == var_6f94 && sub_2c4ff() < 50) {
						cGame.var_6f94 = var_6f94;
					}
					cGame.var_6f84 = -1;
					cGame.var_6f9c = -1;
				}
				Label_0429: {
					if (cGame.var_6f84 == var_6f94 && sub_2c4ff() < 50) {
						final int var_6f95 = cGame.var_6f84;
						boolean b = false;
						Label_0377: {
							if (cGame.var_6f74 != null) {
								for (int j = 0; j < cGame.var_6f74.length; ++j) {
									if (cGame.var_6f74[j] != null && cGame.var_6f74[j][5] == var_6f95) {
										b = (cGame.var_6f74[j][7] == 1);
										break Label_0377;
									}
								}
							}
							b = false;
						}
						if (b) {
							if ((cGame.var_6fac += GLLib.s_game_frameDT) > 600 && cGame.var_6fac > 900) {
								cGame.var_6f94 = cGame.var_6f84;
								cGame.var_6fac -= 300;
							}
							break Label_0429;
						}
					}
					cGame.var_6fac = 0;
				}
				if (cGame.var_6f84 != -1) {
					final int n2 = cGame.var_6f84 & 0xFFFF;
					final int n3 = cGame.var_6f84 >> 16 & 0xFFFF;
					if (cGame.var_68bc[n3][n2][19] >= 0 && cGame.var_68bc[n3][n2][19] < 10 && sub_2c4ff() > 50) {
						cGame.var_6f84 = -1;
					}
				}
			}
			if (cGame.var_6fbc != null) {
				cGame.var_6fbc.sub_1ca1(GLLib.s_game_frameDT);
			}
			if (cGame.var_6f94 > -1 && cGame.var_6fbc != null && cGame.var_6fbc.sub_1922() < 0) {
				for (int k = 0; k < cGame.var_6fb4.length; ++k) {
					final short n4;
					if (cGame.var_6fb4[k] > -1
							&& cGame.var_6f94 == (cGame.var_6fa4 << 16 | (cGame.var_6fb4[k] & 0xFFFF))
							&& cGame.var_6fa4 > -1
							&& (n4 = cGame.var_68bc[cGame.var_6fa4][cGame.var_6fb4[k]][7]) != 255) {
						cGame.var_6fbc
								.SetSprite(cGame.var_68d4[cGame.var_68bc[cGame.var_6fa4][cGame.var_6fb4[k]][5]]);
						cGame.var_6fbc.SetAnim(n4, -1);
					}
				}
			}
			if (var_6f9c > -1 && cGame.var_6f9c == -1) {
				final int n5 = var_6f9c & 0xFFFF;
				final short n6;
				if ((n6 = cGame.var_68bc[var_6f9c >> 16 & 0xFFFF][n5][19]) >= 0 && n6 < 10
						&& cGame.var_6914[n6] != null && sub_2351a(n6, 2)) {
					if (cGame.var_6f94 > -1) {
						sub_23297(n6, n5);
					} else {
						final short n7 = n6;
						final int n8 = cGame.var_6914[n7][0] >> 16 & 0xFFFF;
						final int n9 = cGame.var_6914[n7][0] & 0xFFFF;
						final int n10 = cGame.var_6914[n7][1] & 0xFFFF;
						int n11 = Integer.MAX_VALUE;
						int n12 = 0;
						for (int l = n9 + 1; l <= n10; ++l) {
							final int n13;
							if (cGame.var_68bc[n8][l][10] == 1
									&& (n13 = (cGame.var_68bc[n8][l][2] - cGame.var_6914[n7][10])
											* (cGame.var_68bc[n8][l][2] - cGame.var_6914[n7][10])
											+ (cGame.var_68bc[n8][l][3] - cGame.var_6914[n7][11])
													* (cGame.var_68bc[n8][l][3] - cGame.var_6914[n7][11])) < n11) {
								n12 = l;
								n11 = n13;
							}
						}
						final int n14 = (n12 < n9 + 1) ? (n9 + 1) : ((n12 > n10) ? n10 : n12);
						sub_23297(n7, n14);
						cGame.var_6f94 = (n8 << 16 | (n14 & 0xFFFF));
					}
				}
				cGame.var_6bec = false;
			}
			int n15 = -1;
			if (cGame.var_6f94 > -1) {
				if (cGame.var_6fbc == null) {
					n15 = cGame.var_6f94;
					cGame.var_6f94 = -1;
				} else if ((cGame.var_6fbc.sub_1922() > -1 && cGame.var_6fbc.sub_1b34())
						|| cGame.var_6fbc.sub_1922() < 0) {
					n15 = cGame.var_6f94;
					cGame.var_6f94 = -1;
					cGame.var_6fbc.Reset();
				}
				if (n15 > -1) {
					switchStatementHell(n15);
				}
			} else if (cGame.var_6f9c > -1) {
				final int var_6f9c2 = cGame.var_6f9c;
				final short n16;
				if ((n16 = cGame.var_68bc[var_6f9c2 >> 16 & 0xFFFF][var_6f9c2 & 0xFFFF][19]) >= 0 && n16 < 10
						&& cGame.var_6914[n16] != null && !sub_2351a(n16, 1)) {
					if (sub_2351a(n16, 4)) {
						cGame.var_6914[n16][8] = cGame.var_6914[n16][8] + cGame.var_6f2c - cGame.var_6f0c;
						cGame.var_6914[n16][9] = cGame.var_6914[n16][9] + cGame.var_6f34 - cGame.var_6f14;
						sub_23105(n16);
					} else {
						final short n17 = n16;
						final int n18 = cGame.var_6f2c - cGame.var_6f0c;
						final int n19 = cGame.var_6f34 - cGame.var_6f14;
						final int n20 = n18;
						final short n21 = n17;
						final int n22 = cGame.var_6914[n21][0] & 0xFFFF;
						final int n23 = cGame.var_6914[n21][0] >> 16 & 0xFFFF;
						final short n24 = cGame.var_68c4[n23][n22][5];
						final short n25 = cGame.var_68c4[n23][n22][6];
						final short n26 = cGame.var_68c4[n23][n22][2];
						final short n27 = cGame.var_68c4[n23][n22][3];
						final int sub_383d = cGame.var_68d4[n24].sub_383d(n25);
						final int[] array = new int[4];
						if (sub_383d > 0) {
							cGame.var_68d4[n24].sub_3882(n25, 0, array, 0);
						}
						int n28 = 0;
						int n29 = 0;
						if (cGame.var_6914[n21][6] > n26 + array[2]) {
							n28 = -cGame.var_6914[n21][6] + n26 + array[2];
						}
						if (n26 > cGame.var_6914[n21][4]) {
							n29 = n26 - cGame.var_6914[n21][4];
						}
						cGame.var_6914[n21][8] = ((cGame.var_6914[n21][8] + n20 < n28) ? n28
								: ((cGame.var_6914[n21][8] + n20 > n29) ? n29 : (cGame.var_6914[n21][8] + n20)));
						int n30 = 0;
						int n31 = 0;
						if (cGame.var_6914[n21][7] > n27 + array[3]) {
							n30 = -cGame.var_6914[n21][7] + n27 + array[3];
						}
						if (n27 > cGame.var_6914[n21][5]) {
							n31 = n27 - cGame.var_6914[n21][5];
						}
						cGame.var_6914[n21][9] = ((cGame.var_6914[n21][9] + n19 < n30) ? n30
								: ((cGame.var_6914[n21][9] + n19 > n31) ? n31 : (cGame.var_6914[n21][9] + n19)));
						sub_22d97(n16);
					}
				}
				final int n32 = cGame.var_6f9c & 0xFFFF;
				final int n33 = cGame.var_6f9c >> 16 & 0xFFFF;
				if (GLLib.sub_7693() && n33 == 1 && n32 == 71) {
					final Class_f[] array2;
					final int sub_506a = Class_f.sub_506a(array2 = new Class_f[20], 0);
					final Class_f[] array3 = array2;
					final int n34 = sub_506a;
					final Class_f[] array4 = array3;
					Class_f[] array5 = null;
					int n36 = 0;
					Label_1980: {
						if (n34 < 2) {
							array5 = array4;
						} else {
							boolean b2 = false;
							final int sub_2dcf3 = sub_2dcf3(5);
							final int sub_2df26 = sub_2df26();
							for (int n35 = n34 - 1; n35 >= 0; --n35) {
								final boolean b3 = array4[n35].var_17c5 == 49 && array4[n35].var_185d == 5;
								final boolean b4 = array4[n35].var_17c5 == 52 && array4[n35].var_185d == 3;
								if ((b3 && sub_2dcf3 + Class_f.sub_59d2(2) >= sub_2df26)
										|| (b4 && sub_2dcf3 + Class_f.sub_59d2(2) >= sub_2df26)
										|| (b3 && (cGame.var_70e4 & 0x2) != 0x2)) {
									b2 = true;
								} else if (b2
										|| (cGame.var_6af4 == 0 && array4[n35].var_17c5 == 49
												&& array4[n35].var_185d == 1)
										|| (cGame.var_6af4 == 1 && array4[n35].var_17c5 == 49
												&& array4[n35].var_185d == 5)
										|| (cGame.var_6af4 == 1 && array4[n35].var_17c5 == 52
												&& array4[n35].var_185d == 3)
										|| (cGame.var_6aa4 != -1 && cGame.var_6aac == null
												&& cGame.var_6aac == array4[n35])) {
									array5 = array4;
									n36 = n35;
									break Label_1980;
								}
							}
							array5 = array4;
							if (n34 > 0) {
								n36 = n34 - 1;
								break Label_1980;
							}
						}
						n36 = 0;
					}
					final Class_f var_801c;
					if ((var_801c = array5[n36]) != null) {
						cGame.var_801c = var_801c;
						sub_b442();
					}
				}
			} else if (cGame.var_6f84 == -1 && cGame.var_6f8c == -1
					&& (GLLib.sub_7660() || GLLib.sub_7693() || GLLib.sub_762d() || GLLib.sub_76c6())) {
				final Class_f sub_50f9;
				if ((sub_50f9 = Class_f.sub_50f9()) != null) {
					if (GLLib.sub_7660()) {
						cGame.var_802c = (cGame.var_8014 = sub_50f9);
						cGame.var_803c = 0;
					} else if (GLLib.sub_7693()) {
						cGame.var_801c = sub_50f9;
						cGame.var_803c = 0;
					} else if (GLLib.sub_762d()) {
						if (sub_50f9 == cGame.var_802c) {
							cGame.var_8024 = sub_50f9;
						}
					} else if (cGame.var_7fd4 == -1 && GLLib.sub_76c6() && sub_50f9 == cGame.var_802c
							&& sub_50f9.sub_a2a0(1)) {
						++cGame.var_803c;
					}
				}
				sub_b442();
			}
			if (GLLib.sub_762d() || sub_2c4ff() > 50) {
				cGame.var_802c = null;
			}
			if (GLLib.sub_762d()) {
				if (cGame.var_800c != null) {
					cGame.var_800c.var_15a5 = false;
				}
				if (cGame.var_6af4 != -1 && cGame.var_6af4 != 0) {
					sub_251a0(-1);
					cGame.var_6bec = false;
				}
			}
		}
		if (cGame.var_691c != null) {
			for (char c = '\0'; c < '\n'; ++c) {
				if (cGame.var_691c[c] != null) {
					final char c2 = c;
					final int[] array6 = cGame.var_691c[c2];
					final int n37 = 7;
					array6[n37] += GLLib.s_game_frameDT;
					final int n38 = cGame.var_691c[c2][0] >> 16 & 0xFFFF;
					final int n39 = cGame.var_691c[c2][0] & 0xFFFF;
					final int n40 = cGame.var_691c[c2][1] & 0xFFFF;
					int n41;
					if (cGame.var_691c[c2][7] >= cGame.var_691c[c2][6]) {
						n41 = (cGame.var_691c[c2][6] << 8) / cGame.var_691c[c2][6];
					} else if ((n41 = (cGame.var_691c[c2][7] << 8) / cGame.var_691c[c2][6]) < 0) {
						n41 = 0;
					}
					int n42 = 0;
					int n43 = 0;
					if (cGame.var_691c[c2][2] != cGame.var_691c[c2][4]) {
						n42 = (n41 * (cGame.var_691c[c2][4] - cGame.var_691c[c2][2]) >> 8)
								+ cGame.var_691c[c2][2];
					}
					if (cGame.var_691c[c2][3] != cGame.var_691c[c2][5]) {
						n43 = (n41 * (cGame.var_691c[c2][5] - cGame.var_691c[c2][3]) >> 8)
								+ cGame.var_691c[c2][3];
					}
					for (int n44 = n39; n44 <= n40; ++n44) {
						cGame.var_68bc[n38][n44][2] = (short) (cGame.var_68c4[n38][n44][2] + n42);
						cGame.var_68bc[n38][n44][3] = (short) (cGame.var_68c4[n38][n44][3] + n43);
						sub_2340c(n38, n44);
					}
					if (cGame.var_691c[c][7] >= cGame.var_691c[c][6]) {
						cGame.var_691c[c] = null;
						if (c == cGame.var_6be4) {
							cGame.var_6bd4 = true;
							if ((cGame.var_6bdc & 0x1) != 0x0) {
								cGame.var_68bc[1][47][10] = 1;
							}
							if ((cGame.var_6bdc & 0x2) != 0x0) {
								cGame.var_68bc[1][48][10] = 1;
							}
							if ((cGame.var_6bdc & 0x4) != 0x0) {
								cGame.var_68bc[1][49][10] = 1;
							}
							if ((cGame.var_6bdc & 0x8) != 0x0) {
								cGame.var_68bc[1][50][10] = 1;
							}
						}
					}
				}
			}
		}
		for (int n45 = 0; n45 < 30; ++n45) {
			if (cGame.var_68ec[n45] != null) {
				cGame.var_68ec[n45].sub_1ca1(GLLib.s_game_frameDT);
			}
		}
		sub_844c(2, cGame.field_a_int);
		++cGame.var_67ec;
		cGame.var_67f4 += GLLib.s_game_frameDT;
		new StringBuffer().append("G_DT : ").append(GLLib.s_game_frameDT).append(" ms");
		new StringBuffer().append("G_Update : ").append(System.currentTimeMillis() - currentTimeMillis2).append(" ms");
		sub_b693();
		new StringBuffer().append("G_Paint : ").append(System.currentTimeMillis() - currentTimeMillis).append(" ms");
	}

	public final void hideNotify() {
		super.hideNotify();
		if (cGame.field_a_int != -1) {
			sub_844c(7, cGame.field_a_int);
			final int sub_8396;
			if ((sub_8396 = sub_8396()) != 2 && sub_8396 != 1) {
				cGame.var_6a34 = true;
				sub_23d73();
			}
		}
	}

	public final void showNotify() {
		super.showNotify();
		if (cGame.field_a_int != -1) {
			cGame.var_6a34 = false;
			sub_844c(6, cGame.field_a_int);
		}
	}

	protected final void sub_4c43e() {
		super.UnInit();
		cGame.var_7ff4 = null;
		cGame.var_7ffc = null;
		GLLib.s_display = null;
		GLLib.s_gllib_instance = null;
		GLLib.sub_4ec1();
		GLLib.Pack_FullyClose();
		ASprite.var_f67 = null;
		try {
			for (int i = 0; i < 99; ++i) {
				GLLibPlayer.Snd_UnLoadSound(i);
			}
		} catch (final Exception ex) {
		}
		GloftGF2M.s_instance = null;
		cGame.var_7e4c = null;
		cGame.var_7e54 = null;
		cGame.var_7e5c = null;
		cGame.var_7e64 = null;
		cGame.var_7e6c = null;
		cGame.var_7e74 = null;
		cGame.var_7e84 = null;
		cGame.var_7e7c = null;
		cGame.var_7e8c = null;
		cGame.var_7ec4 = null;
		cGame.s_loadedTexts = null;
		cGame.var_7e94 = null;
		cGame.var_7e9c = null;
		cGame.var_7ebc = null;
		cGame.var_7ea4 = null;
		cGame.var_7eac = null;
		cGame.var_7eb4 = null;
		cGame.var_7ecc = null;
		cGame.var_7ed4 = null;
		cGame.var_7ef4 = null;
		cGame.var_7edc = null;
		cGame.var_7ee4 = null;
		cGame.var_7eec = null;
		cGame.var_7f04 = null;
		cGame.var_7f0c = null;
		cGame.var_7f2c = null;
		cGame.var_7f14 = null;
		cGame.var_7f1c = null;
		cGame.var_7f24 = null;
		cGame.var_7f34 = null;
		cGame.var_7f3c = null;
		cGame.var_7f44 = null;
		cGame.var_7f4c = null;
		cGame.var_7f54 = null;
		cGame.var_7f5c = null;
		cGame.var_7f8c = null;
		cGame.var_7f84 = null;
		cGame.var_748c = null;
		cGame.var_7494 = null;
		cGame.var_749c = null;
		cGame.var_74a4 = null;
		cGame.var_74ac = null;
		cGame.var_74b4 = null;
		cGame.var_74c4 = null;
		cGame.var_74cc = null;
		cGame.var_74d4 = null;
		cGame.var_752c = null;
		cGame.var_7534 = null;
		cGame.var_753c = null;
		cGame.var_7544 = null;
		cGame.var_754c = null;
		cGame.var_7554 = null;
		cGame.var_755c = null;
		cGame.var_756c = null;
		cGame.var_7574 = null;
		cGame.var_7564 = null;
		cGame.var_6e64 = null;
		cGame.var_6e6c = null;
		cGame.var_6e74 = null;
		cGame.var_6e7c = null;
		cGame.var_6e84 = null;
		cGame.var_6e8c = null;
		cGame.var_6e94 = null;
		cGame.var_6e9c = null;
		cGame.var_6ea4 = null;
		cGame.var_6eac = null;
		cGame.var_6eb4 = null;
		cGame.var_6ebc = null;
		cGame.var_6ec4 = null;
		cGame.var_6ecc = null;
		cGame.var_6ed4 = null;
		cGame.var_6edc = null;
		cGame.var_6eec = null;
		cGame.var_6ef4 = null;
		cGame.var_6efc = null;
	}

	private static void sub_4c5ea() {
		if (cGame.var_7ffc[0] != null) {
			cGame.var_7ffc[0].sub_3e59();
		}
		if (cGame.var_7ffc[1] != null) {
			cGame.var_7ffc[1].sub_3e59();
		}
		if (cGame.var_7ffc[2] != null) {
			cGame.var_7ffc[2].sub_3e59();
		}
		if (cGame.var_7ffc[3] != null) {
			cGame.var_7ffc[3].sub_3e59();
		}
		if (cGame.var_7ffc[4] != null) {
			cGame.var_7ffc[4].sub_3e59();
		}
	}

	protected final void pauseGame() {
		if (cGame.var_69ac) {
			cGame.var_797c = true;
		}
		super.Pause();
	}

	private static void sub_4c6b5(String sub_547c) {
		final long var_8154 = System.currentTimeMillis() / 1000L;
		boolean b = false;
		if (cGame.var_8154 == 0L) {
			cGame.var_8154 = System.currentTimeMillis() / 1000L;
			b = true;
		} else if (var_8154 - cGame.var_8154 > 60L) {
			b = true;
		}
		if (b) {
			try {
				sub_547c = GLLib.sub_547c(sub_547c, "|", "");
				GloftGF2M.s_instance.platformRequest(sub_547c);
			} catch (final Exception ex) {
				ex.printStackTrace();
			}
			cGame.var_8154 = var_8154;
		}
	}

	public static void sub_4c768() {
		final Class_f[] array = new Class_f[10];
		for (int sub_5439 = Class_f.sub_5439(2, 47, array, 10), i = 0; i < sub_5439; ++i) {
			array[i].var_1705 = array[i].var_170d + 20;
			array[i].var_172d = true;
			array[i].sub_87a1();
		}
	}

	static {
		cGame.s_clickblocked = false;
		cGame.var_6804 = new int[] { 35, 38, 37, 30, 1, 31, 140, 32, 0, 8, 36, 23, 39, 141, 34, 42, 125, 126, 45, 6,
				140, 0, 40, 41, 7, 140, 0, 44, 46, 47, 48, 43, 141 };
		cGame.var_680c = new int[] { 23, 46, 49, 6, 140, 0, 47, 6, 140, 0, 43, 141 };
		cGame.var_6814 = new int[] { 50, 46, 49, 6, 140, 0, 47, 6, 140, 0, 43, 141 };
		cGame.var_686c = true;
		cGame.var_6924 = false;
		cGame.var_692c = false;
		cGame.var_6934 = false;
		cGame.var_693c = false;
		cGame.var_6944 = true;
		cGame.var_694c = 1;
		cGame.var_6954 = false;
		cGame.var_695c = false;
		cGame.var_6964 = false;
		cGame.var_696c = 0;
		cGame.var_6974 = 0;
		cGame.var_697c = 0;
		cGame.var_6984 = false;
		cGame.var_698c = false;
		cGame.var_6994 = false;
		cGame.var_699c = false;
		cGame.var_69a4 = false;
		cGame.var_69ac = false;
		cGame.var_69b4 = false;
		cGame.var_69bc = false;
		cGame.var_69c4 = false;
		cGame.var_69cc = true;
		cGame.var_69d4 = false;
		cGame.var_69dc = false;
		cGame.var_69e4 = true;
		cGame.var_69ec = true;
		cGame.var_69f4 = true;
		cGame.var_69fc = false;
		cGame.var_6a04 = false;
		cGame.var_6a0c = false;
		cGame.var_6a14 = false;
		cGame.var_6a1c = 0;
		cGame.var_6a2c = 100;
		cGame.var_6a34 = false;
		cGame.var_6a3c = new int[][] { { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 },
				{ 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 5 }, { 0, 5 }, { 0, 5 },
				{ 0, 5 }, { 0, 5 }, { 0, 5 }, { 0, 5 }, { 0, 3 }, { 0, 0 }, { 0, 3 }, { 0, 10 }, { 0, 10 }, { 0, 10 },
				{ 0, 10 }, { 0, 10 }, { 0, 10 }, { 0, 0 }, { 0, 4 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 4 }, { 0, 2 },
				{ 0, 4 }, { 0, 3 }, { 0, 2 }, { 0, 2 }, { 0, 3 }, { 0, 2 }, { 0, 1 }, { 0, 3 }, { 0, 0 }, { 0, 3 },
				{ 0, 2 }, { 0, 2 }, { 0, 2 }, { 0, 2 }, { 0, 2 }, { 0, 0 }, { 0, 3 }, { 0, 0 }, { 0, 3 }, { 0, 3 },
				{ 0, 4 }, { 0, 4 }, { 0, 0 }, { 0, 3 }, { 0, 3 }, { 0, 4 }, { 0, 4 }, { 0, 4 }, { 0, 4 } };
		cGame.var_6a44 = -1;
		cGame.var_6a4c = -1;
		cGame.var_6a5c = 0;
		cGame.var_6a64 = 8;
		cGame.var_6a6c = System.currentTimeMillis();
		cGame.var_6a74 = 1000;
		cGame.var_6a7c = 0L;
		cGame.var_6a84 = 0L;
		cGame.var_6a8c = 0L;
		cGame.var_6a94 = -1;
		cGame.var_6a9c = false;
		cGame.var_6aa4 = -1;
		cGame.var_6aac = null;
		cGame.var_6ab4 = null;
		cGame.var_6abc = false;
		cGame.var_6ac4 = false;
		cGame.var_6acc = 0;
		cGame.var_6ad4 = 0;
		cGame.var_6aec = false;
		cGame.var_6af4 = -1;
		cGame.var_6afc = -1;
		cGame.var_6b04 = 0;
		cGame.var_6b0c = 1;
		cGame.var_6b54 = 0;
		cGame.var_6b5c = null;
		cGame.var_6b64 = 0;
		cGame.var_6b6c = null;
		cGame.var_6b74 = null;
		cGame.var_6b7c = null;
		cGame.var_6b84 = null;
		cGame.var_6b8c = 0;
		cGame.var_6b94 = 0;
		cGame.var_6b9c = false;
		cGame.var_6ba4 = "";
		cGame.var_6bac = 0L;
		cGame.var_6bb4 = 0;
		cGame.var_6bbc = 0;
		cGame.var_6bc4 = false;
		cGame.var_6bcc = '\0';
		cGame.var_6bd4 = false;
		cGame.var_6bdc = 0;
		cGame.var_6be4 = '\0';
		cGame.var_6bec = false;
		cGame.var_6bf4 = 0;
		cGame.var_6bfc = 0;
		cGame.var_6c04 = 0;
		cGame.var_6c0c = 0;
		cGame.var_6c14 = false;
		cGame.var_6c1c = false;
		cGame.var_6c24 = false;
		cGame.var_6c2c = false;
		cGame.var_6c34 = false;
		cGame.var_6c3c = false;
		cGame.var_6c44 = false;
		cGame.var_6c4c = false;
		cGame.var_6c54 = false;
		cGame.var_6c5c = 0;
		cGame.var_6c64 = 0;
		cGame.var_6c6c = false;
		cGame.var_6c74 = 0;
		cGame.var_6c7c = false;
		cGame.var_6c84 = false;
		cGame.var_6c9c = null;
		cGame.var_6ca4 = -1;
		cGame.var_6cac = 0;
		cGame.var_6cb4 = 0;
		cGame.var_6cbc = 0;
		cGame.var_6cc4 = false;
		cGame.var_6ccc = false;
		cGame.var_6cd4 = false;
		cGame.var_6cdc = 0;
		cGame.var_6ce4 = 0;
		cGame.var_6cec = 0;
		cGame.var_6cf4 = 0;
		cGame.var_6cfc = 0;
		cGame.var_6d04 = 0;
		cGame.var_6d0c = 0;
		cGame.var_6d14 = 0;
		cGame.var_6d1c = 0;
		cGame.var_6d24 = 0;
		cGame.var_6d2c = 0;
		cGame.var_6d34 = 0;
		cGame.var_6d3c = 0L;
		cGame.var_6d44 = 0;
		cGame.var_6d4c = 0;
		cGame.var_6d54 = 0;
		cGame.var_6d74 = 0;
		cGame.var_6d7c = 0;
		cGame.var_6d84 = 0;
		cGame.var_6d8c = 0;
		cGame.var_6dd4 = false;
		cGame.var_6ddc = 0;
		cGame.var_6de4 = 0;
		cGame.var_6df4 = false;
		cGame.var_6e0c = false;
		cGame.var_6e14 = false;
		cGame.var_6e1c = 0L;
		cGame.var_6e5c = false;
		cGame.var_6ee4 = 20;
		cGame.var_6f1c = 0;
		cGame.var_6f24 = 0;
		cGame.var_6f3c = 0;
		cGame.var_6f44 = 0;
		cGame.var_6f4c = 0;
		cGame.var_6f7c = -1;
		cGame.var_6f84 = -1;
		cGame.var_6f8c = -1;
		cGame.var_6f94 = -1;
		cGame.var_6f9c = -1;
		cGame.var_6fac = 0;
		cGame.var_6fd4 = 0;
		cGame.var_6fdc = false;
		cGame.s_rmsLevel = sub_30161(1);
		cGame.s_rmsExp = sub_30161(0);
		cGame.var_6ff4 = sub_301bd(0L);
		cGame.var_6ffc = 99999999;
		cGame.s_rmsCash = sub_30161(0);
		cGame.var_700c = 3000000;
		cGame.var_701c = 0;
		cGame.var_7024 = 0;
		cGame.var_702c = 360;
		cGame.var_7034 = 0;
		cGame.var_704c = 0;
		cGame.var_7064 = 0;
		cGame.var_706c = 99;
		cGame.var_708c = 0;
		cGame.var_7094 = 0;
		cGame.var_709c = 0;
		cGame.var_70a4 = 0;
		cGame.var_70ac = 0;
		cGame.var_70ec = 0;
		cGame.var_70f4 = 0;
		cGame.var_711c = 0;
		cGame.var_7124 = 0;
		cGame.field_cq = 9;
		cGame.field_cr = -1413816336;
		cGame.var_718c = "";
		cGame.var_7194 = false;
		cGame.var_72f4 = null;
		cGame.var_72fc = null;
		cGame.var_7304 = '\0';
		cGame.var_730c = '\0';
		cGame.var_7314 = null;
		cGame.var_731c = null;
		cGame.var_7324 = null;
		cGame.var_732c = null;
		cGame.var_7334 = null;
		cGame.var_733c = null;
		cGame.var_7344 = null;
		cGame.var_734c = null;
		cGame.var_7354 = true;
		cGame.var_735c = 0;
		cGame.var_7364 = 0;
		cGame.var_73b4 = false;
		cGame.var_741c = false;
		cGame.var_7424 = false;
		cGame.var_742c = 0;
		cGame.var_7434 = 0;
		cGame.var_743c = false;
		cGame.var_7444 = 0;
		cGame.var_744c = '\0';
		cGame.var_7454 = '\0';
		cGame.var_746c = 3;
		cGame.var_7474 = 10;
		cGame.var_747c = 0;
		cGame.var_7484 = 0;
		cGame.var_748c = null;
		cGame.var_7494 = null;
		cGame.var_749c = null;
		cGame.var_74a4 = null;
		cGame.var_74ac = null;
		cGame.var_74b4 = null;
		cGame.var_74bc = null;
		cGame.var_74c4 = null;
		cGame.var_74cc = null;
		cGame.var_74d4 = null;
		cGame.var_74dc = false;
		cGame.var_74e4 = false;
		cGame.var_74ec = 0;
		cGame.var_74f4 = 0;
		cGame.var_750c = 0;
		cGame.var_7514 = 3;
		cGame.var_751c = 0;
		cGame.var_7524 = 0;
		cGame.var_752c = null;
		cGame.var_7534 = null;
		cGame.var_753c = null;
		cGame.var_7544 = null;
		cGame.var_754c = null;
		cGame.var_7554 = null;
		cGame.var_755c = null;
		cGame.var_7564 = null;
		cGame.var_756c = null;
		cGame.var_7574 = null;
		cGame.var_757c = false;
		cGame.var_7584 = 0;
		cGame.var_758c = 0;
		cGame.var_7594 = null;
		cGame.var_759c = null;
		cGame.var_75a4 = null;
		cGame.var_75ac = null;
		cGame.var_75b4 = null;
		cGame.var_75bc = null;
		cGame.var_75c4 = null;
		cGame.var_75cc = null;
		cGame.var_75d4 = true;
		cGame.var_75dc = 0;
		cGame.var_75e4 = 0;
		cGame.var_76a4 = false;
		cGame.var_76ac = 0;
		cGame.var_76b4 = '\0';
		cGame.var_76bc = '\0';
		cGame.var_76ec = -1;
		cGame.var_7754 = 0;
		cGame.var_7784 = false;
		cGame.var_779c = false;
		cGame.var_77a4 = false;
		cGame.var_77ac = false;
		cGame.var_77b4 = 0L;
		cGame.var_77bc = 0L;
		cGame.var_77c4 = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "" };
		cGame.var_77cc = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1 };
		cGame.var_77e4 = 0;
		cGame.var_77ec = 0;
		cGame.var_77fc = 0L;
		cGame.var_7804 = "";
		cGame.var_780c = 0;
		cGame.var_7814 = false;
		cGame.var_781c = 0;
		cGame.var_7824 = 0;
		cGame.var_782c = 0;
		cGame.var_7834 = "";
		cGame.var_783c = "";
		cGame.var_7844 = false;
		cGame.var_784c = "";
		cGame.var_7854 = false;
		cGame.var_785c = false;
		cGame.var_7864 = false;
		cGame.var_7924 = 0;
		cGame.var_7934 = 0;
		cGame.var_795c = 0;
		cGame.var_7964 = true;
		cGame.var_796c = false;
		cGame.var_7974 = false;
		cGame.var_797c = false;
		cGame.var_7984 = 0;
		cGame.var_798c = "";
		cGame.var_799c = false;
		cGame.var_79a4 = 0;
		cGame.var_79ac = 0;
		cGame.var_79b4 = 0;
		cGame.var_79bc = 1;
		cGame.var_79c4 = 0;
		cGame.var_79cc = 0;
		cGame.var_79d4 = "";
		cGame.var_79ec = 0;
		cGame.var_7a34 = 0;
		cGame.var_7a3c = 0;
		cGame.var_7a54 = 0L;
		cGame.var_7a64 = 0;
		cGame.var_7a6c = 0;
		cGame.var_7a7c = 0;
		cGame.var_7a84 = 0;
		cGame.var_7a8c = false;
		cGame.var_7a9c = true;
		cGame.var_7aac = -1;
		cGame.var_7abc = true;
		cGame.var_7ac4 = "";
		cGame.var_7acc = "";
		cGame.var_7ad4 = "";
		cGame.var_7adc = "";
		cGame.var_7af4 = false;
		cGame.var_7afc = false;
		cGame.var_7b04 = 0;
		cGame.var_7b0c = -1;
		cGame.var_7b1c = "";
		cGame.var_7b2c = 0;
		cGame.var_7b34 = null;
		cGame.var_7b9c = 1;
		cGame.var_7ba4 = "";
		cGame.var_7bac = "";
		cGame.var_7c04 = new int[][] { { 0, 100 }, { 1, 40 }, { 2, 80 }, { 3, 50 }, { 4, 50 }, { 5, 50 }, { 6, 50 },
				{ 7, 40 }, { 8, 20 }, { 9, 0 } };
		cGame.var_7c0c = new int[][] { { Integer.parseInt("/2".substring(1)), 0, 0 },
				{ Integer.parseInt("/2".substring(1)), 1, 0 }, { Integer.parseInt("/2".substring(1)), 2, 0 },
				{ Integer.parseInt("/2".substring(1)), 3, 0 }, { Integer.parseInt("/2".substring(1)), 4, 0 },
				{ Integer.parseInt("/5".substring(1)), 6, 1 }, { Integer.parseInt("/5".substring(1)), 1, 1 },
				{ Integer.parseInt("/5".substring(1)), 66, 1 }, { Integer.parseInt("/5".substring(1)), 67, 1 },
				{ Integer.parseInt("/5".substring(1)), 68, 1 }, { Integer.parseInt("/5".substring(1)), 69, 1 },
				{ Integer.parseInt("/5".substring(1)), 70, 1 }, { Integer.parseInt("/5".substring(1)), 71, 1 },
				{ Integer.parseInt("/5".substring(1)), 72, 1 }, { Integer.parseInt("/5".substring(1)), 73, 1 },
				{ Integer.parseInt("/5".substring(1)), 74, 1 }, { Integer.parseInt("/5".substring(1)), 75, 1 },
				{ Integer.parseInt("/5".substring(1)), 76, 1 }, { Integer.parseInt("/5".substring(1)), 7, 2 },
				{ Integer.parseInt("/5".substring(1)), 8, 2 }, { Integer.parseInt("/5".substring(1)), 20, 2 },
				{ Integer.parseInt("/5".substring(1)), 19, 2 }, { Integer.parseInt("/5".substring(1)), 5, 2 },
				{ Integer.parseInt("/5".substring(1)), 17, 2 }, { Integer.parseInt("/5".substring(1)), 18, 2 },
				{ Integer.parseInt("/5".substring(1)), 11, 3 }, { Integer.parseInt("/5".substring(1)), 21, 3 },
				{ Integer.parseInt("/5".substring(1)), 22, 3 }, { Integer.parseInt("/5".substring(1)), 24, 3 },
				{ Integer.parseInt("/5".substring(1)), 84, 3 }, { Integer.parseInt("/5".substring(1)), 27, 3 },
				{ Integer.parseInt("/5".substring(1)), 25, 3 }, { Integer.parseInt("/5".substring(1)), 29, 3 },
				{ Integer.parseInt("/5".substring(1)), 26, 3 }, { Integer.parseInt("/5".substring(1)), 23, 3 },
				{ Integer.parseInt("/5".substring(1)), 28, 3 }, { Integer.parseInt("/5".substring(1)), 12, 4 },
				{ Integer.parseInt("/5".substring(1)), 30, 4 }, { Integer.parseInt("/5".substring(1)), 31, 4 },
				{ Integer.parseInt("/5".substring(1)), 32, 4 }, { Integer.parseInt("/5".substring(1)), 33, 4 },
				{ Integer.parseInt("/5".substring(1)), 34, 4 }, { Integer.parseInt("/5".substring(1)), 35, 4 },
				{ Integer.parseInt("/5".substring(1)), 36, 4 }, { Integer.parseInt("/5".substring(1)), 37, 4 },
				{ Integer.parseInt("/5".substring(1)), 38, 4 }, { Integer.parseInt("/5".substring(1)), 39, 4 },
				{ Integer.parseInt("/5".substring(1)), 40, 4 }, { Integer.parseInt("/5".substring(1)), 41, 4 },
				{ Integer.parseInt("/5".substring(1)), 42, 4 }, { Integer.parseInt("/5".substring(1)), 43, 4 },
				{ Integer.parseInt("/5".substring(1)), 44, 4 }, { Integer.parseInt("/5".substring(1)), 45, 4 },
				{ Integer.parseInt("/5".substring(1)), 46, 4 }, { Integer.parseInt("/5".substring(1)), 47, 4 },
				{ Integer.parseInt("/5".substring(1)), 48, 4 }, { Integer.parseInt("/5".substring(1)), 49, 4 },
				{ Integer.parseInt("/5".substring(1)), 50, 4 }, { Integer.parseInt("/5".substring(1)), 51, 4 },
				{ Integer.parseInt("/5".substring(1)), 52, 4 }, { Integer.parseInt("/5".substring(1)), 53, 4 },
				{ Integer.parseInt("/5".substring(1)), 54, 4 }, { Integer.parseInt("/5".substring(1)), 55, 4 },
				{ Integer.parseInt("/5".substring(1)), 56, 4 }, { Integer.parseInt("/5".substring(1)), 57, 4 },
				{ Integer.parseInt("/5".substring(1)), 58, 4 }, { Integer.parseInt("/5".substring(1)), 59, 4 },
				{ Integer.parseInt("/5".substring(1)), 60, 4 }, { Integer.parseInt("/5".substring(1)), 61, 4 },
				{ Integer.parseInt("/5".substring(1)), 62, 4 }, { Integer.parseInt("/5".substring(1)), 63, 4 },
				{ Integer.parseInt("/5".substring(1)), 64, 4 }, { Integer.parseInt("/5".substring(1)), 65, 4 },
				{ Integer.parseInt("/5".substring(1)), 104, 4 }, { Integer.parseInt("/5".substring(1)), 105, 4 },
				{ Integer.parseInt("/5".substring(1)), 106, 4 }, { Integer.parseInt("/5".substring(1)), 107, 4 },
				{ Integer.parseInt("/5".substring(1)), 108, 4 }, { Integer.parseInt("/5".substring(1)), 109, 4 },
				{ Integer.parseInt("/5".substring(1)), 110, 4 }, { Integer.parseInt("/5".substring(1)), 111, 4 },
				{ Integer.parseInt("/5".substring(1)), 112, 4 }, { Integer.parseInt("/5".substring(1)), 113, 4 },
				{ Integer.parseInt("/5".substring(1)), 114, 4 }, { Integer.parseInt("/5".substring(1)), 115, 4 },
				{ Integer.parseInt("/5".substring(1)), 116, 4 }, { Integer.parseInt("/5".substring(1)), 117, 4 },
				{ Integer.parseInt("/5".substring(1)), 118, 4 }, { Integer.parseInt("/5".substring(1)), 119, 4 },
				{ Integer.parseInt("/5".substring(1)), 120, 4 }, { Integer.parseInt("/5".substring(1)), 121, 4 },
				{ Integer.parseInt("/5".substring(1)), 122, 4 }, { Integer.parseInt("/5".substring(1)), 123, 4 },
				{ Integer.parseInt("/5".substring(1)), 124, 4 }, { Integer.parseInt("/5".substring(1)), 125, 4 },
				{ Integer.parseInt("/5".substring(1)), 126, 4 }, { Integer.parseInt("/5".substring(1)), 140, 4 },
				{ Integer.parseInt("/5".substring(1)), 142, 4 }, { Integer.parseInt("/5".substring(1)), 146, 4 },
				{ Integer.parseInt("/5".substring(1)), 3, 6 }, { Integer.parseInt("/5".substring(1)), 10, 6 },
				{ Integer.parseInt("/5".substring(1)), 13, 6 }, { Integer.parseInt("/5".substring(1)), 14, 6 },
				{ Integer.parseInt("/5".substring(1)), 16, 6 }, { Integer.parseInt("/5".substring(1)), 85, 6 },
				{ Integer.parseInt("/5".substring(1)), 138, 6 }, { Integer.parseInt("/5".substring(1)), 143, 6 },
				{ Integer.parseInt("/5".substring(1)), 144, 6 }, { Integer.parseInt("/5".substring(1)), 147, 6 },
				{ Integer.parseInt("/5".substring(1)), 148, 6 }, { Integer.parseInt("/7".substring(1)), 1, 7 },
				{ Integer.parseInt("/7".substring(1)), 10, 7 }, { Integer.parseInt("/7".substring(1)), 23, 7 },
				{ Integer.parseInt("/7".substring(1)), 2, 7 }, { Integer.parseInt("/7".substring(1)), 0, 7 },
				{ Integer.parseInt("/7".substring(1)), 9, 7 }, { Integer.parseInt("/7".substring(1)), 17, 7 },
				{ Integer.parseInt("/7".substring(1)), 16, 7 }, { Integer.parseInt("/7".substring(1)), 3, 7 },
				{ Integer.parseInt("/7".substring(1)), 50, 7 }, { Integer.parseInt("/7".substring(1)), 51, 7 },
				{ Integer.parseInt("/7".substring(1)), 52, 7 }, { Integer.parseInt("/7".substring(1)), 53, 7 },
				{ Integer.parseInt("/7".substring(1)), 54, 7 }, { Integer.parseInt("/7".substring(1)), 55, 7 },
				{ Integer.parseInt("/7".substring(1)), 56, 7 }, { Integer.parseInt("/7".substring(1)), 57, 7 },
				{ Integer.parseInt("/7".substring(1)), 58, 7 }, { Integer.parseInt("/7".substring(1)), 59, 7 },
				{ Integer.parseInt("/7".substring(1)), 60, 7 }, { Integer.parseInt("/7".substring(1)), 61, 7 },
				{ Integer.parseInt("/7".substring(1)), 62, 7 }, { Integer.parseInt("/7".substring(1)), 63, 7 },
				{ Integer.parseInt("/7".substring(1)), 64, 7 }, { Integer.parseInt("/7".substring(1)), 65, 7 },
				{ Integer.parseInt("/7".substring(1)), 66, 7 }, { Integer.parseInt("/7".substring(1)), 67, 7 },
				{ Integer.parseInt("/7".substring(1)), 68, 7 }, { Integer.parseInt("/7".substring(1)), 69, 7 },
				{ Integer.parseInt("/7".substring(1)), 70, 7 }, { Integer.parseInt("/7".substring(1)), 71, 7 },
				{ Integer.parseInt("/7".substring(1)), 72, 7 }, { Integer.parseInt("/7".substring(1)), 73, 7 },
				{ Integer.parseInt("/7".substring(1)), 74, 7 }, { Integer.parseInt("/7".substring(1)), 75, 7 },
				{ Integer.parseInt("/7".substring(1)), 76, 7 }, { Integer.parseInt("/7".substring(1)), 77, 7 },
				{ Integer.parseInt("/7".substring(1)), 78, 7 }, { Integer.parseInt("/7".substring(1)), 79, 7 },
				{ Integer.parseInt("/7".substring(1)), 80, 7 }, { Integer.parseInt("/7".substring(1)), 81, 7 },
				{ Integer.parseInt("/7".substring(1)), 82, 7 }, { Integer.parseInt("/7".substring(1)), 83, 7 },
				{ Integer.parseInt("/7".substring(1)), 84, 7 }, { Integer.parseInt("/7".substring(1)), 85, 7 },
				{ Integer.parseInt("/7".substring(1)), 86, 7 }, { Integer.parseInt("/7".substring(1)), 87, 7 },
				{ Integer.parseInt("/7".substring(1)), 88, 7 }, { Integer.parseInt("/7".substring(1)), 89, 7 },
				{ Integer.parseInt("/7".substring(1)), 90, 7 }, { Integer.parseInt("/7".substring(1)), 91, 7 },
				{ Integer.parseInt("/7".substring(1)), 92, 7 }, { Integer.parseInt("/7".substring(1)), 93, 7 },
				{ Integer.parseInt("/7".substring(1)), 94, 7 }, { Integer.parseInt("/7".substring(1)), 95, 7 },
				{ Integer.parseInt("/7".substring(1)), 96, 7 }, { Integer.parseInt("/7".substring(1)), 97, 7 },
				{ Integer.parseInt("/7".substring(1)), 98, 7 }, { Integer.parseInt("/7".substring(1)), 99, 7 },
				{ Integer.parseInt("/7".substring(1)), 100, 7 }, { Integer.parseInt("/7".substring(1)), 101, 7 },
				{ Integer.parseInt("/7".substring(1)), 102, 7 }, { Integer.parseInt("/7".substring(1)), 103, 7 },
				{ Integer.parseInt("/7".substring(1)), 104, 7 }, { Integer.parseInt("/7".substring(1)), 105, 7 },
				{ Integer.parseInt("/7".substring(1)), 106, 7 }, { Integer.parseInt("/7".substring(1)), 107, 7 },
				{ Integer.parseInt("/7".substring(1)), 108, 7 }, { Integer.parseInt("/7".substring(1)), 109, 7 },
				{ Integer.parseInt("/7".substring(1)), 110, 7 }, { Integer.parseInt("/7".substring(1)), 111, 7 },
				{ Integer.parseInt("/7".substring(1)), 112, 7 }, { Integer.parseInt("/7".substring(1)), 113, 7 },
				{ Integer.parseInt("/7".substring(1)), 114, 7 }, { Integer.parseInt("/7".substring(1)), 115, 7 },
				{ Integer.parseInt("/7".substring(1)), 116, 7 }, { Integer.parseInt("/7".substring(1)), 117, 7 },
				{ Integer.parseInt("/7".substring(1)), 118, 7 }, { Integer.parseInt("/7".substring(1)), 119, 7 },
				{ Integer.parseInt("/7".substring(1)), 120, 7 }, { Integer.parseInt("/7".substring(1)), 121, 7 },
				{ Integer.parseInt("/7".substring(1)), 121, 7 }, { Integer.parseInt("/7".substring(1)), 29, 7 },
				{ Integer.parseInt("/7".substring(1)), 46, 7 }, { Integer.parseInt("/7".substring(1)), 12, 7 },
				{ Integer.parseInt("/5".substring(1)), 80, 8 }, { Integer.parseInt("/5".substring(1)), 81, 8 },
				{ Integer.parseInt("/5".substring(1)), 151, 8 } };
		cGame.var_7c14 = new int[] { Integer.parseInt("/5".substring(1)), 2, 0, -1, 0, 0 };
		cGame.var_7c1c = new int[] { 17, 8, 7, 18, 5, 19, 20, 98, 156, 6, 1, 77, 78, 79, 83, 102, 15, 82, 4, 145, 9,
				139, 153, 154, 141, 152, 36, 115, 116, 117, 118, 119, 120, 37, 104, 105, 106, 42, 108, 109, 110, 111,
				123, 124, 125, 126, 64, 142, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 2 };
		cGame.var_7c24 = 0;
		cGame.var_7c2c = "";
		cGame.var_7c34 = 0;
		cGame.var_7c3c = false;
		cGame.s_iapEnabled = false;
		cGame.var_7c4c = false;
		cGame.var_7c54 = new String[6];
		cGame.var_7c5c = new String[6];
		cGame.var_7c64 = new int[6];
		cGame.var_7c6c = new int[6];
		cGame.var_7c74 = new int[6];
		cGame.var_7c7c = new int[6];
		cGame.var_7c84 = new int[6];
		cGame.var_7c8c = new int[6];
		cGame.var_7c94 = new int[6];
		cGame.var_7c9c = null;
		cGame.var_7ca4 = 0;
		cGame.var_7cac = -1;
		cGame.var_7cb4 = 0;
		cGame.var_7cbc = 0;
		cGame.var_7cc4 = 6;
		cGame.var_7ccc = false;
		cGame.var_7cd4 = false;
		cGame.var_7cdc = 0;
		cGame.var_7ce4 = -1;
		cGame.var_7cec = new long[] { 20L, 50L, 100L, 200L, 500L, 1000L };
		cGame.var_7cf4 = new int[] { 20, 50, 100, 200, 500, 1000 };
		cGame.var_7cfc = new int[6];
		cGame.var_7d04 = new int[6];
		cGame.var_7d0c = new int[] { -1, -1, -1, -1, -1 };
		cGame.var_7d14 = new int[] { 778, 779, 780, 781, 782, 783, 787, 788, 789, 790, 803, 804, 808 };
		cGame.var_7d1c = 0;
		cGame.var_7d24 = true;
		cGame.var_7d2c = 0;
		cGame.var_7d34 = 0;
		cGame.var_7d3c = 0;
		cGame.var_7d44 = false;
		cGame.var_7d4c = 0;
		cGame.var_7d54 = 0;
		cGame.var_7d5c = false;
		cGame.var_7e0c = new String[] { "", "", "" };
		cGame.var_7e14 = 0;
		cGame.var_7e1c = 0;
		cGame.var_7e24 = 0;
		cGame.var_7e2c = 0;
		cGame.var_7e34 = 0;
		cGame.var_7e3c = -1;
		cGame.var_7e44 = false;
		cGame.var_7f6c = 0;
		cGame.var_7f74 = '\u0004';
		cGame.var_7f7c = 297;
		cGame.var_7f84 = null;
		cGame.var_7f8c = null;
		cGame.var_7f94 = 0;
		cGame.var_7f9c = false;
		cGame.var_7fa4 = -1;
		cGame.var_7fac = true;
		cGame.var_7fb4 = true;
		cGame.var_7fbc = new int[] { 30, Integer.parseInt("/7".substring(1)), 9, Integer.parseInt("/7".substring(1)),
				50, Integer.parseInt("/7".substring(1)), 51, Integer.parseInt("/7".substring(1)), 52,
				Integer.parseInt("/7".substring(1)), 53, Integer.parseInt("/7".substring(1)), 54,
				Integer.parseInt("/7".substring(1)), 55, Integer.parseInt("/7".substring(1)), 56,
				Integer.parseInt("/7".substring(1)), 1, Integer.parseInt("/7".substring(1)), 10,
				Integer.parseInt("/7".substring(1)), 34, Integer.parseInt("/7".substring(1)), 20,
				Integer.parseInt("/7".substring(1)), 7, Integer.parseInt("/7".substring(1)), 15,
				Integer.parseInt("/7".substring(1)), 27, Integer.parseInt("/7".substring(1)), 10,
				Integer.parseInt("/5".substring(1)), 16, Integer.parseInt("/5".substring(1)), 155,
				Integer.parseInt("/5".substring(1)) };
		cGame.var_7fe4 = -1;
		cGame.s_languageCode = -1;
		cGame.var_813c = false;
		cGame.var_8144 = 0L;
		cGame.var_814c = 0L;
		cGame.var_8154 = 0L;
		cGame.var_815c = false;
		cGame.var_8164 = false;
		cGame.var_816c = false;
	}

	void Game_update() {
		// TODO Auto-generated method stub

	}
}
