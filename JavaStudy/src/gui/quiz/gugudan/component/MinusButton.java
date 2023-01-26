package gui.quiz.gugudan.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import gui.quiz.gugudan.event.MinusDanEvent;

public class MinusButton extends JButton {
	public MinusButton(List<GugudanButton> gugudanBtns) {
		setText("-");
		setBounds(0,500,250,50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new MinusDanEvent(gugudanBtns));
	}
}
