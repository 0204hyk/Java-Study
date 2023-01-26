package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_UseImage {
	public static void main(String[] args) {
		JFrame f = new JFrame("Image Test");
		
		JLabel label = new JLabel("Wait for click");
		JButton button = new JButton("Click!");
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// ImageIO : 이미지 입출력 전문 클래스, 이미지 수정 기능들이 포함되어 있음
				// ImageIO.read() : 이미지 데이터를 읽어서 BufferedImage 형태로 반환
				try {
					BufferedImage bufferedImage = ImageIO.read(new File("images/Apple.jpg"));
					
					// getScaledInstance() : 원본에서 크기 조절된 이미지 인스턴스를 생성하여 반환
					Image scaledImage = bufferedImage.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
					
					ImageIcon icon = new ImageIcon(scaledImage);
					
					label.setIcon(icon);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}				
				label.setText(null);
				label.setOpaque(true); // 배경색 투명 해제
				label.setBackground(Color.BLACK); // 배경색 적용
			}
		});
		
		f.add(label, "Center");
		f.add(button, "South");
		
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
