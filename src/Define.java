
// Define class in the style of other GL games

// Define.java
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Author(s): Iceburg (@IceburgLettuce17 on GitHub)
//
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  This inteface will be removed during the obfusction process.
//
////////////////////////////////////////////////////////////////////////////////////////////////////
interface Define 
{
	public static final boolean DECOMP_MODE = true;
	
	public static final boolean DECOMP_CUSTOM_PRINTS = true;
	
	// GameStates..... (in the style of Platinum Sudoku
	final static int GS_EXIT = -1;
	
	/**
	 * Gameloft splash screen. 
	 * <br>Switches to {@link Define#GS_INIT}.
	 */
	final static int GS_GAMELOFT = 1;
	final static int GS_INIT = 2;
	final static int GS_UNK_3 = 3;
	final static int GS_LOADING = 4;
	
	// Not a real state, but referenced by GS_UNK_3
	final static int GS_UNREF_5 = 5;
	// 6?
	final static int GS_MARKET = 7;
	final static int GS_SALEDESK = 8;
	final static int GS_MILL_PRODUCE = 9;
	final static int GS_KITCHEN_PRODUCE = 10;
	final static int GS_KITCHEN = 11;
	final static int GS_ACRE = 12;
	final static int GS_LEVELUP = 13;
	final static int GS_PAUSE = 14;
	final static int GS_MAIL_REQUEST = 15;
	final static int GS_MAIL_SEND = 16;
    final static int GS_FARM = 17;
	final static int GS_FARM_TUTORIAL = 18; // Used to be UNK_18
	final static int GS_POPUP = 19;	
	// 20?
	final static int GS_UNK_21 = 21; // This one is really unknown...
	// 22?
	// 23?
	final static int GS_UNREF_24 = 24;
	final static int GS_POND = 25;
	final static int GS_FARMDIARY = 26;
	final static int GS_MILL = 27;
	final static int GS_BARN = 28;
	final static int GS_MANOR = 29;
	final static int GS_MANOR_RESTORE = 30;
	final static int GS_MANOR_COLLECTIONS = 31;
	final static int GS_MANOR_TROPHIES = 32;
	// 33?
	final static int GS_BUYSCR = 34;
	final static int GS_HUD = 35;
	final static int GS_FARM_NEIGHBOR = 36;
	final static int GS_MAIL_NEIGHBOR = 37;
	final static int GS_MAIL = 38;
	final static int GS_SILO = 39;
	// 40?
	// 41?
	final static int GS_UNK_42 = 42;
	// 43?
	final static int GS_IGP = 44;

	final static int GS_FIRST = GS_GAMELOFT;
	
	final static int GS_LAST = GS_IGP;
	
	// ActorIDs
	final static int ACTOR_SALEDESK = 9;	
	final static int ACTOR_BARN = 10;	
	final static int ACTOR_HENHOUSE = 11;	
	final static int ACTOR_STABLES = 12;	
	final static int ACTOR_SILO = 13;	
	final static int ACTOR_MILL = 14;	
	final static int ACTOR_MAIL = 15;
	final static int ACTOR_UNK16 = 16;	
	final static int ACTOR_POND = 17;	
	final static int ACTOR_MANOR = 18;	
	
	// Toast Types
	final static int TOAST_EXIT = 1;
	final static int TOAST_SMSCHARGE = 2;
	final static int TOAST_PURCHASE0 = 3;
	final static int TOAST_PURCHASE1 = 4;
	final static int TOAST_PURCHASE2 = 5;
	final static int TOAST_PURCHASE3 = 6;
	final static int TOAST_PURCHASE4 = 7;
	final static int TOAST_PURCHASE5 = 8;
	final static int TOAST_REDEEM_EXIT = 11;
	
	// Text indices. These are used in GLLib.Text_GetString method
	final static int TEXT_TUTORIAL_HARVEST = 4;
	final static int TEXT_TUTORIAL_GROW = 5;
	final static int TEXT_TUTORIAL_PLANT = 6;
	final static int TEXT_TUTORIAL_SALESDESK = 8;
	final static int TEXT_TUTORIAL_BARN = 11;
	final static int TEXT_TUTORIAL_WHEATREADY = 12;
	final static int TEXT_TUTORIAL_PLOTS = 13;
	final static int TEXT_TUTORIAL_TOMATO = 15;
	final static int TEXT_TUTORIAL_ADULTCOW = 16;
	final static int TEXT_TUTORIAL_MANOR = 19;
	final static int TEXT_TUTORIAL_FEED1 = 20;
	final static int TEXT_TUTORIAL_FEED2 = 22;
	final static int TEXT_TUTORIAL_FEEDCASH = 23;
	final static int TEXT_TUTORIAL_MAILBOX = 25;
	final static int TEXT_YES = 30;
	final static int TEXT_NO = 31;
	final static int TEXT_SURE = 32;
	final static int TEXT_LATER = 33;
	final static int TEXT_BACK = 35;
	final static int TEXT_DELIVER = 38;
	final static int TEXT_CANCEL = 40;
	final static int TEXT_POPUP_LETSTELLEVERYONE = 42;
	final static int TEXT_OK = 45;
	final static int TEXT_LOADING = 46;
	final static int TEXT_POPUP_MEMFULL = 47;
	final static int TEXT_POPUP_MEMFULLDESC = 48;
	final static int TEXT_PAUSE_TITLE = 63;
	final static int TEXT_PAUSE_CUSTOMERCARE = 64;
	final static int TEXT_PAUSE_OPTIONS = 65;
	final static int TEXT_PAUSE_SNDOPTIONS = 66;
	final static int TEXT_PAUSE_PRIV = 67;
	final static int TEXT_PAUSE_ABOUT = 68;
	final static int TEXT_RESET = 70;
	final static int TEXT_PAUSE_EXIT = 72;
	final static int TEXT_PAUSE_EXITDESC = 74;
	final static int TEXT_PAUSE_BACK = 75;
	final static int TEXT_PAUSE_LANGUAGE = 76;
	final static int TEXT_PAUSE_MUSIC = 78;
	final static int TEXT_PAUSE_SFX = 79;
	final static int TEXT_PAUSE_HELP = 80;
	final static int TEXT_PAUSE_ON = 82;
	final static int TEXT_PAUSE_OFF = 83;
	
	final static int TEXT_MARKET = 121;
	final static int TEXT_MARKET_BUY = 127;
	final static int TEXT_DIARY = 145;
	final static int TEXT_QUEST_NEW = 152;
	final static int TEXT_QUEST_PROGRESS = 153;	
	final static int TEXT_MISC_FOUNDITEM = 154;	
	final static int TEXT_QUEST_TASKCOMPLETE = 155;	
	final static int TEXT_QUEST_REWARDS = 156;	
	final static int TEXT_MAILBOX_NEIGHBORS = 157;	
	final static int TEXT_MAILBOX_NONEED = 159;	
	final static int TEXT_MAILBOX_DELIVER = 161;	
	final static int TEXT_REQUEST = 162;
	final static int TEXT_POPUP_WHOOPS = 163;
	final static int TEXT_SEND_ITEM = 171;
	final static int TEXT_MAILBOX_DECLINE = 173;	
	final static int TEXT_SEND_DESC = 175;
	final static int TEXT_KITCHEN_HOME = 180;
	final static int TEXT_DELUXIFIER_NONITEM = 185;
	final static int TEXT_QUEUE = 188;
	final static int TEXT_QUEUED = 189;
	final static int TEXT_DAYS = 193;
	final static int TEXT_HOURS = 194;
	final static int TEXT_MINUTES = 195;
	final static int TEXT_SECONDS = 196;
	final static int TEXT_EMPTY = 197;
	
	final static int TEXT_RECIPES = 200;
	final static int TEXT_COLLECTIONS = 219;
	final static int TEXT_MANOR_KITCHENDESC = 243;
	final static int TEXT_MANOR_COLLROOMDESC = 244;
	final static int TEXT_MANOR_TROPHYROOMDESC = 245;
	final static int TEXT_MANOR_FINISH = 250;
	final static int TEXT_MANOR_COINS = 251;
	final static int TEXT_MANOR_FERTILIZER = 252;
	final static int TEXT_MANOR_CROP = 253;
	final static int TEXT_MANOR_INGREDIENT = 254;
	final static int TEXT_MANOR_FEED = 255;
	final static int TEXT_MANOR_FARMCASH = 256;
	final static int TEXT_ACRE_BASEREQ = 268;
	final static int TEXT_MISC_TIMELEFT = 279;
	final static int TEXT_MANOR_ROOMRESTORE = 284;
	final static int TEXT_MANOR_STARTRESTORING = 285;
	final static int TEXT_POPUP_ROOMRESTORED = 292;
	final static int TEXT_ACRE_BUY = 297;
	final static int TEXT_ACRE_EXPANDTONEWACRE = 298;
	
	final static int TEXT_POPUP_CONGRATS = 300;
	final static int TEXT_MANOR = 301;
	final static int TEXT_MANOR_KITCHEN = 302;
	final static int TEXT_MANOR_COLLROOM = 303;
	final static int TEXT_MANOR_TROPHYROOM = 304;
	final static int TEXT_MANOR_GALLERY = 305;
	final static int TEXT_MANOR_LIBRARY = 306;
	final static int TEXT_MANOR_GREENHOUSE = 307;
	final static int TEXT_MANOR_PANTRY = 308;
	final static int TEXT_MANOR_STORAGE = 309;
	final static int TEXT_MANOR_ATTIC = 310;
	final static int TEXT_ACRE_PRETTY = 312; // Acre base name text
	final static int TEXT_ACRE_PRETTYTASK = 324; // Acre base task name text
	final static int TEXT_NOTENOUGHCOINTITLE = 378;
	final static int TEXT_NOTENOUGHCOIN = 379;
	final static int TEXT_NOTIAP_NOTENOUGHCASH = 380;
	final static int TEXT_NOTENOUGHCASH = 381;
	final static int TEXT_COINS = 385;
	final static int TEXT_EXP = 386;
	final static int TEXT_MAKE = 387;
	final static int TEXT_FEEDMILL = 388;
	final static int TEXT_POND_FREEROD = 397;
	final static int TEXT_PONDOK = 398;
	final static int TEXT_POPUP_PONDWIN = 399;
	
	final static int TEXT_POPUP_NOSPACE = 401;
	final static int TEXT_POPUP_NOSPACEDESC = 402;
	final static int TEXT_POPUP_PONDWINDESC = 403;
	final static int TEXT_SALESDESK = 404;
	final static int TEXT_POPUP_SELL = 441;	
	final static int TEXT_POPUP_SELLDESC = 442;
	final static int TEXT_POPUP_RESETDESC = 444;
	final static int TEXT_POPUP_AREYOUSURE = 446;
	final static int TEXT_PREFIX_LEVEL = 447;
	final static int TEXT_PREVIOUS = 454;
	final static int TEXT_NEXT = 455;
	final static int TEXT_INVENTORY = 456;
	final static int TEXT_TROPHIES = 457;
	final static int TEXT_NEWTROPHY = 458;
	final static int TEXT_SILO_ANIMALS = 459;
	final static int TEXT_SALESDESK_NOITEM = 460;
	final static int TEXT_UNTILREADY = 463;	
	final static int TEXT_UNTILADULT = 464;
	final static int TEXT_FEEDTYPES = 468;
	final static int TEXT_POPUP_BARNFULL = 475;
	final static int TEXT_POPUP_BARNFULLDESC = 476;
	final static int TEXT_MARKETTITLE = 481;
	final static int TEXT_SILOTITLE = 482;
	final static int TEXT_MAXIMUM = 483;
	final static int TEXT_MORE = 484;
	final static int TEXT_CANNOTGOBACK = 498;
	final static int TEXT_CANNOTPAUSE = 499;
	
	final static int TEXT_POPUP_CUSTOMERCARECASHDESC = 507;
	final static int TEXT_POPUP_CUSTOMERCARECOINSDESC = 508;
	final static int TEXT_POPUP_CUSTOMERCARECOINSRESETDESC = 509;
	final static int TEXT_POPUP_CUSTOMERCARECASHRESETDESC = 510;
	final static int TEXT_POPUP_CUSTOMERCAREBACKUPDESC = 513;
	final static int TEXT_POPUP_NEIGHBORFARMERROR = 514;
	final static int TEXT_REACHED = 516;
	final static int TEXT_EXCLAM = 517;
	final static int TEXT_LEVEL = 518;
	final static int TEXT_UNLOCKED = 519;
	final static int TEXT_LEVELDESC = 522;
	final static int TEXT_LEVELFLAVORBASE = 523;
	
	final static int TEXT_POPUP_POND = 627;
	final static int TEXT_POPUP_PONDDESC = 628;
	
	final static int TEXT_MAILBOX_HELPBASE = 746;
	final static int TEXT_IAP_MORE = 766;
	final static int TEXT_IAP_TERMSCONDS = 767;
	final static int TEXT_IAP_VATINCLUDED = 770;
	final static int TEXT_IAP_VATNOTINCLUDED = 771;
	final static int TEXT_IAP_REDEEMENTER = 768;
	final static int TEXT_IAP_REDEEMMINI = 769;
	final static int TEXT_IAP_REDEEMNODIGITS = 772;
	final static int TEXT_IAP_REDEEMALL = 773;
	final static int TEXT_IAP_ENTERCODE = 774;
	final static int TEXT_IAP_RESEND = 775;
	final static int TEXT_IAP_VALIDATE = 776;
	final static int TEXT_IAP_SMSRSCHARGE = 777;
	final static int TEXT_IAP_SMSPRICE = 784;
	final static int TEXT_IAP_PRICEOF1SMS = 785;
	final static int TEXT_IAP_PACKNOTFOUND = 788;
	final static int TEXT_IAP_WAITING = 791;
	final static int TEXT_IAP_SMS = 792;
	final static int TEXT_IAP_INPROG = 794;
	final static int TEXT_IAP_REDEEMEXITDESC = 795;
	
	final static int TEXT_IAP_RESETCYCLEDESC = 802;
	final static int TEXT_IAP_RETRY = 807;
	final static int TEXT_IAP_THANKYOU = 809;
	final static int TEXT_IAP_CASH = 812;
	final static int TEXT_IAP_SMSPIN = 813;
	final static int TEXT_IAP_NOPROFILE = 827;
	final static int TEXT_IAP_DANISHBUY = 838;
	final static int TEXT_PAUSE_IGP = 839;
	final static int TEXT_IAP_BUY = 842;
	final static int TEXT_IAP_CANCEL = 843;
	final static int TEXT_IAP_OK = 844;
	final static int TEXT_IAP_LATER = 845;
	final static int TEXT_IAP_INDOBUY = 847;
	final static int TEXT_IAP_INDOCANCEL = 848;
	final static int TEXT_IAP_ENCANCEL = 850;
	final static int TEXT_IAP_ENBUY = 849;
	final static int TEXT_IAP_CONFIRM = 851;
	final static int TEXT_NOTIAP_NOTENOUGHCASHDESC = 852;
	final static int TEXT_IAP_PRICEOF2SMS = 853;
	
	// 82XX are mostly Item names
	final static int TEXT_ITEM_COWFEED = 8263;
	final static int TEXT_ITEM_CHICKENFEED = 8264;
	final static int TEXT_ITEM_PIGFEED = 8265;
	final static int TEXT_ITEM_GOATFEED = 8266;
	final static int TEXT_ITEM_SHEEPFEED = 8267;
	final static int TEXT_ITEM_SUPERFEED = 8268;
	
	// 85XX is Collection
	final static int TEXT_ITEM_COLLBASE = 8512;
	
	final static int TEXT_CREDITS_TITLE = 11264;
	final static int TEXT_CREDITS_VERSION = 11265;
	final static int TEXT_CREDITS_PORTBASE = 11547;
}