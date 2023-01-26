package register.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import register.db.MemberDataModel;
import register.swing.component.registercomponent.CancleButton;
import register.swing.component.registercomponent.PhonenumberComboBox;
import register.swing.component.registercomponent.RegisterButton;
import register.swing.component.registercomponent.RegisterLabels;
import register.swing.component.registercomponent.RegisterTextFields;
import register.swing.component.registercomponent.SmsRadioButtons;

public class RegisterFrame extends JFrame {
	MemberDataModel member = new MemberDataModel();
	
	public RegisterFrame() {		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		RegisterLabels label = new RegisterLabels(panel);
		RegisterTextFields textField = new RegisterTextFields(panel);
		SmsRadioButtons radioBtn = new SmsRadioButtons(panel);
		PhonenumberComboBox comboBox = new PhonenumberComboBox(panel);
		
		RegisterButton registerBtn = new RegisterButton(member, textField, radioBtn, comboBox);
		CancleButton cancleBtn = new CancleButton(this);
		panel.add(registerBtn);
		panel.add(cancleBtn);
		
		add(panel);
		
		setTitle("회원 가입");
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
