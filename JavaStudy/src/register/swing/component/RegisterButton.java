package register.swing.component;

import java.awt.Font;

import javax.swing.JButton;

public class RegisterButton extends JButton {
	
	public RegisterButton() {
		setText("회원 가입");
		setBounds(75, 380, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
	}


}
