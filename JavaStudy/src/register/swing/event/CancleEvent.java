package register.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import register.swing.LoginFrame;
import register.swing.RegisterFrame;

public class CancleEvent implements ActionListener{
	RegisterFrame register;
	
	public CancleEvent(RegisterFrame register) {
		this.register = register;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		register.dispose();
		new LoginFrame();
	}

}
