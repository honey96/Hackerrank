package test;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.nio.file.*;
public class Test {
	public static BufferedImage createThumb(BufferedImage in,int w,int h){
        // scale w, h to keep aspect constant
        double outputAspect = 1.0*w/h;
        double inputAspect = 1.0*in.getWidth()/in.getHeight();
        if (outputAspect < inputAspect) {
            // width is limiting factor; adjust height to keep aspect
            h = (int)(w/inputAspect);
        } else {
            // height is limiting factor; adjust width to keep aspect
            w = (int)(h*inputAspect);
        }
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bi.createGraphics();
        g2.setRenderingHint(
                RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(in, 0, 0, w, h, null);
        g2.dispose();
        return bi;   
    }		
	public static void main(String[] args) throws Exception {
		 for (String in : args) {
	            BufferedImage bi = createThumb(
	                ImageIO.read(Files.newInputStream(Paths.get(in))),
	                128, 128);
	            String ext = in.substring(in.lastIndexOf(".")+1);
	            String out = in.replaceFirst(".([a-z]+)$", "_thumb." + ext);
	            System.err.println(in + " --> " + out);
	            ImageIO.write(bi, ext, Files.newOutputStream(Paths.get(out)));
	        }
		
	}
}
