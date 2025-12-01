
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
    
    public static GLLibImage createRGBImage(final int[] rgb, final int width, final int height, final boolean processAlpha) {
        return new GLLibImage(Image.createRGBImage(rgb, width, height, processAlpha));
    }
    
    // Re-refactor because the refactoring went wrong
    public final void getRGB(final int[] rgbData, final int offset, final int scanlength, final int x, final int y, final int width, final int height) {
        this.image.getRGB(rgbData, offset, scanlength, x, y, width, height);
    }
    
    private GLLibImage(final Image image) {
        this.image = image;
    }
    
    public GLLibImage() {
    }
}
