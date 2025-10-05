import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class Class_l
{
    Image var_192;
    
    public static Class_l sub_1b2(final int n, final int n2) {
        return new Class_l(Image.createImage(n, n2));
    }
    
    public static Class_l sub_1d9(final int[] array, final int n, final int n2, final boolean b) {
        return new Class_l(Image.createRGBImage(array, n, n2, b));
    }
    
    public final void sub_202(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.var_192.getRGB(array, n, n2, n3, n4, n5, n6);
    }
    
    private Class_l(final Image var_192) {
        this.var_192 = var_192;
    }
    
    public Class_l() {
    }
}
