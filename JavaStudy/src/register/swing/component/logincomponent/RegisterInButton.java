package register.swing.component.logincomponent;

import java.awt.Font;

import javax.swing.JButton;

import register.swing.LoginFrame;
import register.swing.event.RegisterInEvent;

public class RegisterInButton extends JButton {
	public RegisterInButton(LoginFrame login) {
		setText("회원 가입");
		setBounds(75, 380, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
		addActionListener(new RegisterInEvent(login));
	}
}
