package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class S19_JMenu {
	
	/*
	 	JMenu 클래스에 JMenuItem 클래스를 붙이는 방식으로 메뉴를 사용할 수 있다.
	 */
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Menu!!");

		JMenuBar bar = new JMenuBar();
		
		JMenu menu, submenu;
		JMenuItem[] items = new JMenuItem[5];
		
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		
		for (int i = 0; i < items.length; ++i) {
			items[i] = new JMenuItem("item" + (i + 1));
		}
		
		// 메뉴바는 setJMenuBar로 추가한다.
		f.setJMenuBar(bar);
		
		// 바에 메뉴를 추가
		bar.add(menu);
		
		// 메뉴에 서브 메뉴를 추가
		menu.add(submenu);
		
		// 각 메뉴들에 아이템들 추가
		menu.add(items[0]);
		menu.add(items[1]);
		menu.add(items[2]);
		
		submenu.add(items[3]);
		submenu.add(items[4]);
		
		items[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				System.out.println("Item1을 누름");
				f.dispose();
			}
		});
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
