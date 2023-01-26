package gui.quiz;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

public class S20_JPopupMenu {
	/*
	 	JPopupMenu에 JMenuItem을 붙여서 사용
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JPopupMenu popup = new JPopupMenu();
		
		// JPopupMenu에 JMenu로 서브 메뉴 등록하기
		JMenu src = new JMenu("src...");
		
		// 보기 좋게 구분선 추가해주기 (JSepapator)
		JSeparator sep = new JSeparator();
		
		JMenuItem[] items = new JMenuItem[5];
		
		for (int i = 0; i < items.length; ++i) {
			items[i] = new JMenuItem("item" + (i + 1));
			popup.add(items[i]);
		}
		
		popup.add(sep);
		popup.add(src);
		
		src.add(new JMenuItem("Generate Getters"));
		src.add(new JMenuItem("Generate Setters"));
		
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// e.getButton() == 1 : 좌클릭 / 2 : 휠 클릭 / 3 : 우클릭
				System.out.println("방금 누른 버튼 번호: " + e.getButton());
				
				// 팝업 메뉴가 Alt + 우클릭으로 발동하게 만들기.
				if (e.isAltDown() && e.getButton() == 3) {
					popup.show(f, e.getX(), e.getY());					
				}
			}
		});
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
