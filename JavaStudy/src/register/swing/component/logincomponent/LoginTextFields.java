package register.swing.component.logincomponent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginTextFields {
	public JTextField mem_id;
	public JPasswordField mem_pw; 
	
	public LoginTextFields(JPanel panel) {
		
		mem_id = new JTextField();
		mem_id.setBounds(180, 145, 200, 35);
		mem_id.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(mem_id.getText().length() >= 16) key.consume();
				
			}
		});
		
		mem_pw = new JPasswordField(); 
		mem_pw.setBounds(180, 225, 200, 35);
		mem_pw.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(new String(mem_pw.getPassword()).length() >= 16) key.consume();
				
			}
		});

		panel.add(mem_id);
		panel.add(mem_pw);

	}
}
