package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class S08_JCheckBox {
	
	// 체크박스 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame("CheckBox Sample");
		
		// 선택하고 싶은 항목들을 입력할 수 있다.
		JCheckBox box1 = new JCheckBox("Java");
		JCheckBox box2 = new JCheckBox("Python");
		JCheckBox box3 = new JCheckBox("JavaScript");
		
		JButton btn = new JButton("상태 체크!!");
		
		box1.setBounds(100, 100, 100, 50);
		box2.setBounds(100, 150, 100, 50);
		box3.setBounds(100, 200, 100, 50);
		btn.setBounds(100, 250, 100, 50);
		
		// addItemListener() : 액션 리스너보다 선택에 특화된 이벤트 설정
		// JCheckBox의 이벤트는 클릭 할 때마다 발생 
		box1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 이벤트 발생 시 e에 이벤트 정보들이 함께 전달된다.
				System.out.println(e.getStateChange() == ItemEvent.SELECTED? "방금 체크됨" : "체크 해제됨");
				// ItemEvent.SELECTED == 1
				// ItemEvent.DESELECTED == 2
			}
		});
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// isSelected : 체크 여부 boolean값으로 리턴
				System.out.println("Java: " + box1.isSelected());
				System.out.println("Python: " + box2.isSelected());
				System.out.println("JavaScript: " + box3.isSelected());
			}
		});
		
		f.add(box1);
		f.add(box2);
		f.add(box3);
		f.add(btn);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
