package register.swing.component;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class RegisterComboBox {
	
	public JComboBox<String> phonenumber1;
	
	public RegisterComboBox(JPanel panel) {
		String[] phoneNums = {"010", "011", "016", "017", "018", "019"};
		
		phonenumber1 = new JComboBox<String>(phoneNums);
		
		phonenumber1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		phonenumber1.setBounds(230, 330, 60, 35);
		
		panel.add(phonenumber1);
	}
}
