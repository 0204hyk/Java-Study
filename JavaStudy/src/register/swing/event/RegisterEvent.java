package register.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import register.db.MemberDataModel;
import register.db.RegisterToDB;

public class RegisterEvent implements ActionListener {
	private MemberDataModel member;
	private JTextField mem_id;
	private JPasswordField mem_pw;
	private JTextField mem_name;
	private JTextField age;
	private JTextField regident_num1;
	private JTextField regident_num2;
	private JTextField interest;
	private JRadioButton smsO;
	private JRadioButton smsX;
	private JTextField email1;
	private JTextField email2;
	private JComboBox<String> phonenumber1;
	private JTextField phonenumber2;
	private JTextField phonenumber3;
	
	public RegisterEvent(MemberDataModel member, JTextField mem_id, JPasswordField mem_pw, 
			JTextField mem_name, JTextField age, JTextField regident_num1, JTextField regident_num2, 
			JTextField interest, JRadioButton smsO, JRadioButton smsX, JTextField email1,
			JTextField email2, JComboBox<String> phonenumber1, JTextField phonenumber2,
			JTextField phonenumber3) {
		this.member = member;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.age = age;
		this.regident_num1 = regident_num1;
		this.regident_num2 = regident_num2;
		this.interest = interest;
		this.smsO = smsO;
		this.smsX = smsX;
		this.email1 = email1;
		this.email2 = email2;
		this.phonenumber1 = phonenumber1;
		this.phonenumber2 = phonenumber2;
		this.phonenumber3 = phonenumber3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			member.setMem_id(mem_id.getText());
			member.setMem_pw(new String(mem_pw.getPassword()));
			member.setMem_name(mem_name.getText());
			member.setAge(Integer.parseInt(age.getText()));
			member.setRegident_num(regident_num1.getText() + "-" + regident_num2.getText());
			member.setInterest(interest.getText());
			member.setSms(smsO.isSelected()? "O" : "X");
			member.setEmail(email1.getText() + "@" + email2.getText());
			member.setPhonenumber(phonenumber1.getSelectedItem().toString()
					+ "-" + phonenumber2.getText() + "-" + phonenumber3.getText());
			RegisterToDB register = new RegisterToDB(member);
			JOptionPane.showMessageDialog(null, "회원가입 완료", "회원가입", 1);
			System.exit(0);
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "회원가입 실패", "회원가입", 0);
			mem_id.setText(null);
			mem_pw.setText(null);
			mem_name.setText(null);
			age.setText(null);
			regident_num1.setText(null);
			regident_num2.setText(null);
			interest.setText(null);
			smsO.setSelected(true);
			email1.setText(null);
			email2.setText(null);
			phonenumber1.setSelectedIndex(0);
			phonenumber2.setText(null);
			phonenumber3.setText(null);
		}
	}

}
