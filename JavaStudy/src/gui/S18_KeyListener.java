package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class S18_KeyListener {
	
	// 키보드 이벤트 처리
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Keyboard Event!!");
		
		JTextArea ta = new JTextArea();
		ta.setRows(10);
		
		// KeyListener 대신 KeyAdapter를 사용할 수 있다.

		ta.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// 타이핑이 되는 키들만 받음
//				System.out.printf("방금 누른 키(문자) : %c\n", e.getKeyChar());
//			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.printf("방금 누른 키(문자) : %c\n", e.getKeyChar());
				System.out.printf("방금 누른 키(키보드 코드) : %d\n", e.getKeyCode());
				System.out.println("손을 뗌");
			}
	
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// 키보드에 존재하는 모든 키를 받음
//				System.out.printf("방금 누른 키(키보드 코드) : %d\n", e.getKeyCode());
//			}
		});
		
		f.add(ta, "South");

		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
