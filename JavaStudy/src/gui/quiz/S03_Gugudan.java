package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class S03_Gugudan extends JFrame {
	/*
	 	실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
	 	
	 	1. 프로그램을 처음 실행하면 구구단 2단이 출력되어 있는 상태로 시작
	 	
	 	2. +버튼을 누르면 단이 증가하며 구구단이 바뀐다 (최대 19단까지)
	 	
	 	3. - 버튼을 누르면 단이 감소하며 구구단이 바뀐다 (최소 2단까지)
	 */
	static int num = 2;
	public static JTextArea result = new JTextArea();
	JButton plusBtn = new JButton("+");
	JButton minusBtn = new JButton("-");
	
	
	public S03_Gugudan() {
		super("구구단");
				
		gugudan(num);
		
		setLayout(null);
		
		result.setBounds(65, 10, 350, 350);
		plusBtn.setBounds(100, 380, 100, 50);
		minusBtn.setBounds(250, 380, 100, 50);
		
		result.setFont(new Font("굴림체", Font.BOLD, 30));
		plusBtn.setFont(new Font(null, Font.PLAIN, 35));
		minusBtn.setFont(new Font(null, Font.PLAIN, 35));
		
		add(result);
		add(plusBtn);
		add(minusBtn);
		
		
		plusBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (num < 19) {
					result.setText("");
					gugudan(++num);
				} else {
					result.setText("19단까지만 출력 가능");
					num = 1;
				}
			}
		});
		
		minusBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (num > 2) {
					result.setText("");
					gugudan(--num);
				} else {
					result.setText("2단까지만 출력 가능");
					num = 20;
				}
			}
		});
		
		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(3);
	}

	public static void gugudan(int num) {
		result.append(num + "단" + "\n");
		for (int i = 2; i <= 9; ++i) {
			result.append(num + "x" + i + "=" + (num * i) + "\n");
		}
	}
	
	
	public static void main(String[] args) {
		new S03_Gugudan();
	}
	
}
