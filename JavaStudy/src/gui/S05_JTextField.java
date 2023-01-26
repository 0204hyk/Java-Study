package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class S05_JTextField {
	
	// 직접 입력이 가능한 텍스트 한 줄을 배치할 수 있는 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JTextField tf = new JTextField("Wecome to Swing GUI");
		
		tf.setBounds(50, 50, 200, 30);
		
		// 텍스트 필드에서 엔터키를 누르면 액션 이벤트 발생
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You > " + tf.getText());
				tf.setText(null);	// 엔터키를 친 후 입력되어있는 값 지우기
			}
		});
		
		f.add(tf);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
