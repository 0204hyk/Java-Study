package gui.quiz.ImageGallery;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S14_ImageGallery_Solve extends JFrame{
	public S14_ImageGallery_Solve(String path) {
		File dir = new File(path);
		
		// 모든 ThumbnailButton에서 사용할 ViewImageFrame을 하나 생성하여 전달
		// 하나의 동일한 프레임의 이미지가 바뀐다. (새로운 프레임을 여러개 생성X)
		ThumbnailButton.setViewFrame(new ViewImageFrame());
		
		int imageCount = 0;
		
		for (File f : dir.listFiles()) {
			if (f.isFile()) {
				add(new ThumbnailButton(f));
				++imageCount;
			}
		}
		
		while (imageCount++ < 16) {
			add(new JButton("empty"));
		}
		
		setLayout(new GridLayout(4, 4));
		setTitle("Thumbnails");
		setLocation(200, 200);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S14_ImageGallery_Solve("images/");
	}
}
