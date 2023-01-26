package register.swing.component.logincomponent;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import register.swing.event.LoginEvent;

public class LoginButton extends JButton {
	
	public LoginButton(LoginTextFields textField) {
		setText("로그인");
		setBounds(75, 350, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
		addActionListener(new LoginEvent(textField.mem_id, textField.mem_pw));
	}


}
