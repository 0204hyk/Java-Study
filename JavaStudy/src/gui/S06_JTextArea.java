package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S06_JTextArea {
	
	// 여러 줄의 텍스트를 보여주기 위한 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		// JTextArea는 로우, 컬럼을 설정할 수 있다. (JTextField는 컬럼을 설정할 수 있다.)
		JTextArea ta = new JTextArea(10, 30);
		JTextField tf = new JTextField(50);
		
		ta.setBounds(50, 50, 200, 200);
		tf.setBounds(50, 270, 200, 30);
		
		// 자동 줄바꿈 설정
		ta.setLineWrap(true);
		
		// 수정 가능 여부 설정
		ta.setEditable(false);		
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// append : 기존의 텍스트를 없애지 않고 계속 추가하는 메서드
				ta.append("YOU > " + tf.getText() + "\n");
				tf.setText(null);
			}
		});
		
		f.add(ta);
		f.add(tf);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
