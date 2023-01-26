package register.swing.component;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RegisterRadioButtons {
	Font font = new Font("맑은 고딕", Font.BOLD, 20);

	public JRadioButton snsO;
	public JRadioButton snsX;

	public RegisterRadioButtons(JPanel panel) {
		snsO = new JRadioButton("동의");
		snsX = new JRadioButton("거부");
		snsO.setFont(font);
		snsX.setFont(font);
		snsO.setBounds(230, 250, 100, 35);
		snsX.setBounds(330, 250, 100, 35);
		
		ButtonGroup btnGroup = new ButtonGroup();
		snsO.setSelected(true);
		btnGroup.add(snsO);
		btnGroup.add(snsX);
		
		panel.add(snsO);
		panel.add(snsX);

	}
}
