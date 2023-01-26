package register.swing.component;

import java.awt.Font;

import javax.swing.JButton;

import register.swing.event.LoginEvent;

public class LoginButton extends JButton {
	
	public LoginButton() {
		setText("로그인");
		setBounds(75, 350, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
	}
}
