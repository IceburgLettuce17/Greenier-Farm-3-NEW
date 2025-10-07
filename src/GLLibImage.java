import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class GLLibImage
{
    Image image;
    
    public static GLLibImage createImage(final int width, final int height) {
        return new GLLibImage(Image.createImage(width, height));
    }
    
    public static GLLibImage createRGBImage(final int[] array, final int n, final int n2, final boolean b) {
        return new GLLibImage(Image.createRGBImage(array, n, n2, b));
    }
    
    public final void sub_202(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.image.getRGB(array, n, n2, n3, n4, n5, n6);
    }
    
    private GLLibImage(final Image image) {
        this.image = image;
    }
    
    public GLLibImage() {
    }
}
