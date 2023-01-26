package register.swing.component.registercomponent;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import register.db.MemberDataModel;

public class RegisterTextFields {
	Font font = new Font("맑은 고딕", Font.BOLD, 20);
	
	public JTextField mem_id;
	public JPasswordField mem_pw;
	public JTextField mem_name;
	public JTextField age;
	public JTextField regident_num1;
	public JTextField regident_num2;
	public JTextField interest;
	public JTextField email1;
	public JTextField email2;
	public JTextField phonenumber2;
	public JTextField phonenumber3;

	public RegisterTextFields(JPanel panel) {
		mem_id = new JTextField(16);
		mem_id.setBounds(230, 10, 200, 35);
		mem_id.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(mem_id.getText().length() >= 16) key.consume();
				
			}
		});
		
		mem_pw = new JPasswordField(16);
		mem_pw.setBounds(230 , 50, 200, 35);
		mem_pw.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(new String(mem_pw.getPassword()).length() >= 16) key.consume();
				
			}
		});

		
		mem_name = new JTextField(10);
		mem_name.setBounds(230 , 90, 200, 35);
		mem_name.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(mem_name.getText().length() >= 10) key.consume();
				
			}
		});

		
		age = new JTextField(3);
		age.setBounds(230, 130, 200, 35);
		age.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(age.getText().length() >= 3) key.consume();
				
			}
		});
		
		regident_num1 = new JTextField(6);
		regident_num2 = new JTextField(7);
		regident_num1.setBounds(230, 170, 80, 35);
		regident_num2.setBounds(350, 170, 80, 35);
		regident_num1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(regident_num1.getText().length() >= 6) key.consume();
				
			}
		});
		regident_num2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
			if(regident_num2.getText().length() >= 1) key.consume();
				
			}
		});
		
		interest = new JTextField();
		interest.setBounds(230, 210, 200, 35);
		
		
		email1 = new JTextField();
		email2 = new JTextField();
		email1.setBounds(230, 290, 80, 35);
		email2.setBounds(350, 290, 80, 35);
		
		phonenumber2 = new JTextField(4);
		phonenumber3 = new JTextField(4);
		phonenumber2.setBounds(300, 330, 60, 35);
		phonenumber3.setBounds(370, 330, 60, 35);
		phonenumber2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(phonenumber2.getText().length() >= 4) key.consume();
				
			}
		});
		phonenumber3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent key) {
				if(phonenumber3.getText().length() >= 4) key.consume();
				
			}
		});
		
		panel.add(mem_id);
		panel.add(mem_pw);
		panel.add(mem_name);
		panel.add(age);
		panel.add(regident_num1);
		panel.add(regident_num2);
		panel.add(interest);
		panel.add(email1);
		panel.add(email2);
		panel.add(phonenumber2);
		panel.add(phonenumber3);
	}
}
