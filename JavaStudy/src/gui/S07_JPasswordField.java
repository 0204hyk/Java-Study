package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class S07_JPasswordField {

	// 비밀번호를 입력할 때 사용하는 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Password Field Sample");

		JLabel label = new JLabel("Password");
		JPasswordField pf = new JPasswordField();
		
		label.setBounds(50, 100, 80, 30);
		pf.setBounds(130, 100, 150, 30);
		
		pf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("현재 입력되어 있는 값: " + new String(pf.getPassword()));
				pf.setText(null);
			}
		});
		
		f.add(label);
		f.add(pf);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
