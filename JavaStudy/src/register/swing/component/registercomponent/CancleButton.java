package register.swing.component.registercomponent;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import register.swing.RegisterFrame;
import register.swing.event.CancleEvent;

public class CancleButton extends JButton {
	public CancleButton(RegisterFrame register) {
		setText("취소");
		setBounds(250, 380, 150, 50);
		setFont(new Font("맑은 고딕", Font.BOLD, 20));
		setFocusable(false);
		addActionListener(new CancleEvent(register));
	}
}
