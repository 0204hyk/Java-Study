package register.swing.component.registercomponent;

import java.awt.Font;

import javax.swing.JButton;

import register.db.MemberDataModel;
import register.swing.event.RegisterEvent;

public class RegisterButton extends JButton {
	
	public RegisterButton(MemberDataModel member, RegisterTextFields textField,
			SmsRadioButtons radioBtn, PhonenumberComboBox comboBox) {
		setText("회원 가입");
		setBounds(75, 380, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
		addActionListener(new RegisterEvent(member, textField.mem_id, textField.mem_pw, 
				textField.mem_name, textField.age, textField.regident_num1, textField.regident_num2, 
				textField.interest, radioBtn.smsO, radioBtn.smsX, textField.email1,
				textField.email2, comboBox.phonenumber1, textField.phonenumber2,
				textField.phonenumber3));
	}


}
