package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S12_JPanel {
	
	/*
	 	# JPanel
	 	
	 	 - 컨테이너 위에 붙일 수 있는 컨테이너
	 	 - 레이아웃 위에 붙여 다른 레이아웃을 사용할 수 있다는 장점이 있다. 
	 */
	
	public static void main(String[] args) {
		JFrame f = new JFrame("My JPanel Test");
		
		BorderLayout outerLayout = new BorderLayout();
		GridLayout eastLayout = new GridLayout(10, 2);
		BorderLayout southLayout = new BorderLayout();
		
		f.setLayout(outerLayout);
		
		// 패널은 생성 시 레이아웃을 지정할 수 있다.
		JPanel eastPanel = new JPanel(eastLayout);
		JPanel southPanel = new JPanel(southLayout);
		
		for (int i = 0; i < 20; ++i) {
			eastPanel.add(new JButton("" + i));
		}
		
		southPanel.add(new JTextArea() {
			{
				setRows(10);
			}
		},"Center");
		
		southPanel.add(new JTextField("input message here..."),"South");
		
		f.add(new JButton("component"), "Center");
		f.add(southPanel, "South");
		f.add(new JButton("component"), "North");
		f.add(eastPanel, "East");
		f.add(new JButton("compoooooooooooooooooooooooonent"), "West");
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
