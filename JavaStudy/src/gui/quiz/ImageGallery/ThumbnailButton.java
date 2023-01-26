package gui.quiz.ImageGallery;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ThumbnailButton extends JButton implements ActionListener {
	private static ViewImageFrame view;
	
	public static void setViewFrame(ViewImageFrame viewFrame) {
		view = viewFrame;
	}
	
	File f;
	
	final private static int THUMBNAIL_WIDTH = 100;
	final private static int THUMBNAIL_HEIGHT = 80;
	
	public ThumbnailButton(String path) {
		this(new File(path));
	}
	
	public ThumbnailButton(File f) {
		this.f = f;
		try {
			
			setIcon(ImageIconTools.getScaledImageIcon(f, THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT));
			setSize(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT);
			addActionListener(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.setImageLabel(f);
		view.setVisible(true);
	}
}
