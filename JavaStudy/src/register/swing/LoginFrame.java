package register.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import register.swing.component.logincomponent.LoginButton;
import register.swing.component.logincomponent.LoginLabels;
import register.swing.component.logincomponent.LoginTextFields;
import register.swing.component.logincomponent.RegisterInButton;
import register.swing.component.registercomponent.RegisterButton;
import register.swing.event.LoginEvent;

public class LoginFrame extends JFrame {
	
	public LoginFrame() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		LoginLabels label = new LoginLabels(panel);
		LoginTextFields textFidld = new LoginTextFields(panel);
		
		RegisterInButton registerInBtn = new RegisterInButton(this);
		LoginButton loginBtn = new LoginButton(textFidld);
		
		registerInBtn.setBounds(250, 350, 150, 50);
		
		panel.add(registerInBtn);
		panel.add(loginBtn);
		
		add(panel);
		
		setTitle("로그인 화면");
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
				
	}
}
