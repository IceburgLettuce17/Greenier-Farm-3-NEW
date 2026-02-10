
// 
// Decompiled by Procyon v0.6.0
// 

public final class ImageG
{
    javax.microedition.lcdui.Image image;
    
    public static ImageG createImage(final int width, final int height) {
        return new ImageG(javax.microedition.lcdui.Image.createImage(width, height));
    }
    
    public static ImageG createRGBImage(final int[] rgb, final int width, final int height, final boolean processAlpha) {
        return new ImageG(javax.microedition.lcdui.Image.createRGBImage(rgb, width, height, processAlpha));
    }
    
    // Re-refactor because the refactoring went wrong
    public final void getRGB(final int[] rgbData, final int offset, final int scanlength, final int x, final int y, final int width, final int height) {
        this.javax.microedition.lcdui.Image.getRGB(rgbData, offset, scanlength, x, y, width, height);
    }
    
    private ImageG(final javax.microedition.lcdui.Image image) {
        this.image = image;
    }
    
    public ImageG() {}
}
