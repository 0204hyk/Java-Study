package hangman;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlphabetPanel extends JPanel{
	ImagePanel imgPanel;
	QuizPanel quizPanel;
	public static File[] btnImages = 
			new File("files_hangman/alphbet").listFiles(new FilenameFilter() {	
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".png");
		}
	});

	AlphabetButton[] btns = new AlphabetButton[btnImages.length];
	
	public AlphabetPanel(ImagePanel imgPanel, QuizPanel quizPanel) {
		this.imgPanel = imgPanel;
		this.quizPanel = quizPanel;
		setLayout(new GridLayout(4, 7));
		try {
			for (int i = 0; i < btnImages.length; ++i) {
				AlphabetButton btn = new AlphabetButton(btnImages[i], imgPanel, quizPanel, this); 
				BufferedImage bufferedImage = ImageIO.read(btnImages[i]);
				Image scaledimage = bufferedImage.getScaledInstance(60, 60, Image.SCALE_DEFAULT);
				ImageIcon alphabetIcon = new ImageIcon(scaledimage);
				btn.setIcon(alphabetIcon);
				btn.addActionListener(btn);
				btns[i] = btn;
				add(btns[i]);
			}
			for (int i = 0; i < 2; ++i) {
				JLabel empty = new JLabel();
				empty.setOpaque(true);		
				empty.setBackground(new Color(223, 228, 245));
				add(empty);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
