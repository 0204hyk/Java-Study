package register.swing.component.registercomponent;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SmsRadioButtons {
	Font font = new Font("맑은 고딕", Font.BOLD, 20);

	public JRadioButton smsO;
	public JRadioButton smsX;

	public SmsRadioButtons(JPanel panel) {
		smsO = new JRadioButton("동의");
		smsX = new JRadioButton("거부");
		smsO.setFont(font);
		smsX.setFont(font);
		smsO.setBounds(230, 250, 100, 35);
		smsX.setBounds(330, 250, 100, 35);
		
		ButtonGroup btnGroup = new ButtonGroup();
		smsO.setSelected(true);
		btnGroup.add(smsO);
		btnGroup.add(smsX);
		
		panel.add(smsO);
		panel.add(smsX);

	}
}
