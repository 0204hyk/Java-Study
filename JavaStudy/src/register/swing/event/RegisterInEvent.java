package register.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import register.swing.LoginFrame;
import register.swing.RegisterFrame;

public class RegisterInEvent implements ActionListener {
	LoginFrame login;
	
	public RegisterInEvent(LoginFrame login) {
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		login.dispose();
		new RegisterFrame();
	}
}
