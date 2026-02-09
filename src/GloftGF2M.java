import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class GloftGF2M extends MIDlet
{
    public static cGame s_game;
    public static GloftGF2M s_instance;
    
    public GloftGF2M() {
        GloftGF2M.s_instance = this;
    }
    
    public final void startApp() {
        if (GloftGF2M.s_game == null) 
        {
            GloftGF2M.s_game = new cGame(this, Display.getDisplay(this));
            GloftGF2M.s_game.Init();
        }
    }
    
    public final void pauseApp() {
        GloftGF2M.s_game.Pause();
    }
    
    public final void destroyApp(final boolean unconditional) {
        if (GloftGF2M.s_game != null) {
			
			// If we exit the MIDlet in Collection Room (gs 31),
			// make sure to collect any Coins or Experience that was dropped.
            if (cGame.getState() == Define.GS_MANOR_COLLECTIONS) {
                if (cGame.var_7a34 > 0) {
                    cGame.addCoin(cGame.var_7a34);
                }
                if (cGame.var_7a3c > 0) {
                    cGame.addExperience(cGame.var_7a3c);
                }
            }
            cGame.sub_4c768();
            cGame.sub_e503();
            GLLib.s_game_state = -1;
        }
    }
}
