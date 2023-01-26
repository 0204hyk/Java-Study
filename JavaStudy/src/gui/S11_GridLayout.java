package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S11_GridLayout {
	
	// 컴포넌트들을 그리드 방식으로 배치할 수 있다.
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("GridLayout Test");
		
		// 생성자에 행과 열을 설정한다.
		// 가로와 세로의 여백도 설정할 수 있다.
		GridLayout layout = new GridLayout(8, 2, 30, 10);

		f.setLayout(layout);
		
		for (int i = 0; i < 16; ++i) {
			f.add(new JButton("Button" + i));
		}
		
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
