package register.swing.component.registercomponent;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegisterLabels {
	Font font = new Font("맑은 고딕", Font.BOLD, 20);

	public RegisterLabels(JPanel panel) {

		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(font);
		idLabel.setBounds(80, 0, 150, 50);
		
		
		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setFont(font);
		pwLabel.setBounds(80, 40, 150, 50);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(font);
		nameLabel.setBounds(80, 80, 150, 50);
		
		JLabel ageLabel = new JLabel("나이");
		ageLabel.setFont(font);
		ageLabel.setBounds(80, 120, 150, 50);
		
		JLabel regidentNumLabel1 = new JLabel("주민등록번호");
		JLabel regidentNumLabel2 = new JLabel("-");
		regidentNumLabel1.setFont(font);
		regidentNumLabel1.setBounds(80, 160, 150, 50);
		regidentNumLabel2.setFont(font);
		regidentNumLabel2.setBounds(325, 160, 20, 50);
		
		JLabel interestLabel = new JLabel("관심분야");
		interestLabel.setFont(font);
		interestLabel.setBounds(80, 200, 150, 50);
		
		JLabel smsLabel = new JLabel("sms수신동의");
		smsLabel.setFont(font);
		smsLabel.setBounds(80, 240, 150, 50);
				
		JLabel emailLabel1 = new JLabel("이메일");
		JLabel emailLabel2 = new JLabel("@");
		emailLabel1.setFont(font);
		emailLabel1.setBounds(80, 280, 150, 50);
		emailLabel2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		emailLabel2.setBounds(320, 280, 20, 50);

		
		JLabel phoneNumLabel1 = new JLabel("전화번호");
		JLabel phoneNumLabel2 = new JLabel("-");
		JLabel phoneNumLabel3 = new JLabel("-");
		phoneNumLabel1.setFont(font);
		phoneNumLabel1.setBounds(80, 320, 150, 50);
		phoneNumLabel2.setFont(font);
		phoneNumLabel2.setBounds(290, 320, 20, 50);
		phoneNumLabel3.setFont(font);
		phoneNumLabel3.setBounds(360, 320, 20, 50);

		
		panel.add(idLabel);
		panel.add(pwLabel);
		panel.add(nameLabel);
		panel.add(ageLabel);
		panel.add(regidentNumLabel1);
		panel.add(regidentNumLabel2);
		panel.add(interestLabel);
		panel.add(smsLabel);
		panel.add(emailLabel1);
		panel.add(emailLabel2);
		panel.add(phoneNumLabel1);
		panel.add(phoneNumLabel2);
		panel.add(phoneNumLabel3);
	}

}
