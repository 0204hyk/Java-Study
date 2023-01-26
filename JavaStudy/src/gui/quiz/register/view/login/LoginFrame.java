package gui.quiz.register.view.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.register.view.join.JoinFrame;

public class LoginFrame extends JFrame {
	JoinFrame joinFrame = new JoinFrame(this);
	
	JLabel idLabel = new JLabel() {
		{
			setText("아이디");
			setLocation(80, 80);
			setSize(100, 30);
		}
	};
	JLabel passwordLabel = new JLabel() {
		{
			setText("비밀번호");
			setLocation(80, 120);
			setSize(100, 30);
		}
	};
	
	JTextField loginTextField = new JTextField() {
		{
			setLocation(150, 80);
			setSize(150, 30);
			setColumns(30);
		}
	};
	JPasswordField passwordField = new JPasswordField() {
		{
			setLocation(150, 120);
			setSize(150, 30);
			setColumns(30);
		}
	};
	
	JButton LoginButton = new JButton() {
		{
			setText("로그인");
			setLocation(80, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("로그인 버튼이 눌렸음");
				}
			});
		}
	};
	JButton JoinButton = new JButton() {
		{
			setText("회원가입");
			setLocation(195, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					joinFrame.open();
				}
			});
		}
	};
	
	public LoginFrame() {
		
		add(idLabel);
		add(passwordLabel);
		add(loginTextField);
		add(passwordField);
		add(LoginButton);
		add(JoinButton);
		
		setLayout(null);
		setLocation(300, 200);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new LoginFrame();
	}
}
