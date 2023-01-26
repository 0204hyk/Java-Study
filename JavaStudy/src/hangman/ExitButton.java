package hangman;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton implements ActionListener{

	public ExitButton() {
		setText("종료하기");
		setFont(new Font("맑은 고딕", Font.BOLD, 30));
		setPreferredSize(new Dimension(200, 100));
		setFocusable(false);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
