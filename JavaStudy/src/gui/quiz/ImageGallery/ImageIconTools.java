package gui.quiz.ImageGallery;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageIconTools {
	
	public static ImageIcon getScaledImageIcon(File f, int w, int h) throws IOException {
		return new ImageIcon(ImageIO.read(f).getScaledInstance(w, h, Image.SCALE_AREA_AVERAGING));
	}
}
