package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S13_FlowLayout {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Flow");
		
		// 정렬방식, 가로, 세로 여백 조정 가능
		JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); 

		int i = 0;
		while(i < 20) {
				centerPanel.add(new JButton("" + i++));			
		}				
		
		f.add(centerPanel, "Center");
		
		f.add(new JButton("Click!") {
			int i = 20;
			{
				addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						centerPanel.add(new JButton("" + i++));
						centerPanel.validate(); // 일종의 새로고침 (컴포넌트의 변화를 업데이트 하는 역할)
					}
				});
			}
		}, "South");
		
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
