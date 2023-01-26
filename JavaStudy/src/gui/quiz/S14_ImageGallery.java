package gui.quiz;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_ImageGallery {
	
	/*
	 	(1) images 폴더 내부의 모든 이미지들을 GridLayout으로 보여주기
	 	
	 	(2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오게 만들기
	 */
	
	public static void btnSet(File f, JFrame frame){
		JButton btn = new JButton();
		try {
			BufferedImage bufferedImage = ImageIO.read(f);
			Image img = bufferedImage.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(img);
			
			btn.setIcon(icon);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Image img = bufferedImage.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
					ImageIcon icon = new ImageIcon(img);
					imagePrint(icon, f);
				}
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.add(btn);
	}
	
	public static void imagePrint(ImageIcon i, File f){
		JFrame frame = new JFrame(f.getName());
		JLabel image = new JLabel();
		
		image.setIcon(i);
		frame.add(image);
		frame.setBounds(300, 100, 500, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame main = new JFrame("ImageGallery");
		
		File[] images = new File("images/").listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".jpg");
			}
		});
		
		int len = images.length;
		
		for (int i = 0; i < len; ++i) {
			btnSet(images[i], main);
		}
		
		main.setLayout(new GridLayout(len/2, len/2));
		main.setBounds(200, 200, 500, 500);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
