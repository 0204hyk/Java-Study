package hangman;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangmanImagePanel extends JPanel {
	CardLayout card = new CardLayout();
	
	private static File[] images = new File("files_hangman/hangman").listFiles(new FilenameFilter() {	
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".PNG");
		}
	});
	
	
	public HangmanImagePanel() {
		setLayout(card);
		setBackground(new Color(223, 228, 245));
		
		
		for (int i = 0; i < images.length; ++i) {
			try {
				String[] fileName = images[i].getName().split("[.]");
				JLabel imageLabel = new JLabel();
				BufferedImage bufferedImage = ImageIO.read(images[i]);
				Image scaledImage = bufferedImage.getScaledInstance(500, 550, Image.SCALE_DEFAULT);
				ImageIcon image = new ImageIcon(scaledImage);
				imageLabel.setIcon(image);
				add(fileName[0], imageLabel);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
