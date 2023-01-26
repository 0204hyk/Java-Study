package register.swing.component;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginLabels {
	public LoginLabels(JPanel panel) {
		JLabel label1 = new JLabel("로그인 화면");
		label1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		label1.setBounds(135, 0, 250, 100);
		
		JLabel label2 = new JLabel("ID : ");
		label2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		label2.setBounds(110, 120, 100, 80);
		
		JLabel label3 = new JLabel("PW : ");
		label3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		label3.setBounds(95, 200, 100, 80);

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
	}
}
