package gui.quiz.gugudan.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import gui.quiz.gugudan.event.PlusDanEvent;

public class PlusButton extends JButton {

	public PlusButton(List<GugudanButton> gugudanBtns) {
		setText("+");
		setBounds(250, 500, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new PlusDanEvent(gugudanBtns));

	}
}
