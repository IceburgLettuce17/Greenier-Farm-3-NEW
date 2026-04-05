
public final class ImageG
{
    javax.microedition.lcdui.Image image;
    
    public static ImageG createImage(final int w, final int h) {
        return new ImageG(javax.microedition.lcdui.Image.createImage(w, h));
    }
    
    public static ImageG createRGBImage(final int[] data, final int w, final int h, final boolean processAlpha) {
        return new ImageG(javax.microedition.lcdui.Image.createRGBImage(data, w, h, processAlpha));
    }
    
    // Re-refactor because the refactoring went wrong
    public final void getRGB(final int[] data, final int offset, final int scanlength, final int x, final int y, final int w, final int h) {
        this.image.getRGB(data, offset, scanlength, x, y, w, h);
    }
    
    private ImageG(final javax.microedition.lcdui.Image image) {
        this.image = image;
    }
    
    public ImageG() {}
}
