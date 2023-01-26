package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S16_CardLayout {
	
	// 여러 컴포넌트를 달아놓을 수 있지만 한번에 하나만 보여준다.
	// 카드처럼 원하는 컴포넌트로 넘기면서 사용할 수 있다.
	
	public static void main(String[] args) {
		JFrame f = new JFrame("CardLayout");
		
		JButton next = new JButton(">");
		JButton prev = new JButton("<");
		
		CardLayout card = new CardLayout();
		JPanel panel = new JPanel(card);

		// 카드 레이아웃에 컴포넌트 추가 시 이름을 지정하는 것이 좋다.
		panel.add("apple", new JLabel("1"));
		panel.add("car", new JLabel("2"));
		panel.add("air", new JLabel("3"));
		panel.add("zoo", new JLabel("4"));
		panel.add("baseball", new JLabel("5"));
		
		f.add(next, "East");
		f.add(prev, "West");
		f.add(panel, "Center");
		
		// 해당 카드 레이아웃이 설정된 컨테이너의 인스턴스를 함께 전달해야 한다.
		// card.next(panel) : 카드 레이아웃의 다음 컴포넌트를 보여줌
		// card.previous(panel) : 카드 레이아웃의 이전 컴포넌트를 보여줌
		// card.first(panel) : 카드 레이아웃의 첫 번째 컴포넌트를 보여줌 (리셋버튼 만들기 수월함)
		// card.last(panel) : 카드 레이아웃의 마지막 컴포넌트를 보여줌
		// card.show(panel, name) : 원하는 컴포넌트를 보여줌 (이름이 필요함)
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(panel); 
			}
		});
		
		prev.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(panel);
			}
		});
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
