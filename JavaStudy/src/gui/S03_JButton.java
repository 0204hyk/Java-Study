package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton("Main");
	JButton subBtn = new JButton("Sub Button");
	
	public S03_JButton() {
		super("JButton 테스트");	// super로 부모 클래스(JFrame)의 생성자 호출
		
		add(mainBtn, "Center");
		add(subBtn, "South");

		// 버튼 텍스트 설정
		mainBtn.setText("안녕하세요!");
		
		// 글꼴 설정
		mainBtn.setFont(new Font("궁서체", Font.BOLD, 55));
		subBtn.setFont(new Font("굴림체", Font.PLAIN, 30));
		
		// 버튼의 글씨색 변경
		subBtn.setForeground(Color.RED);
		
		// 버튼의 배경색 변경
		subBtn.setBackground(new Color(31, 236, 255));
		
		// 탭키로 포커스 변경 가능 여부
		subBtn.setFocusable(false);
		mainBtn.setFocusable(false);
		
		// 버튼의 이벤트 설정 (버튼에 액션 리스너 추가)
		subBtn.addActionListener(new ActionListener() {	
			int num = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌렸을 때의 동작을 설정할 수 있음
				System.out.println("Hello, Button Event!!");
				mainBtn.setText(num++ + "번째 눌림");
			}
		});
				
		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
		
		
	}
}
