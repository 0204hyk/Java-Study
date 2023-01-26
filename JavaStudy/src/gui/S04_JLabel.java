package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class S04_JLabel {	
	
	// 텍스트를 한 줄 표시하기 위한 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JLabel label = new JLabel("Hello, world!");
		
		label.setBounds(50, 50, 400, 30);
		
		// label의 텍스트 정렬
		label.setHorizontalAlignment(JLabel.CENTER);
		
		// 텍스트 수정
		label.setText("Hello, Java Swing!!");
		
		f.add(label);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
