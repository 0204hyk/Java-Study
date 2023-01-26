package hangman;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AlphabetButton extends JButton implements ActionListener{
	File f;
	ImagePanel imgPanel;
	QuizPanel quizPanel;
	AlphabetPanel alphabetPanel;

	public AlphabetButton(File f, ImagePanel imgPanel, QuizPanel quizPanel, AlphabetPanel alphabetPanel) {
		this.f = f;
		this.imgPanel = imgPanel;
		this.quizPanel = quizPanel;
		this.alphabetPanel = alphabetPanel;
		setBorderPainted(false);	// 버튼 테두리 없애기
		setBackground(new Color(223, 228, 245));
		setSize(50,50);
		setFocusable(false);
	}

	public void resetButton() {
		for (int i = 0; i < alphabetPanel.btnImages.length; ++i) {
			alphabetPanel.btns[i].setEnabled(true);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setEnabled(false);
		char select = f.getName().toString().toLowerCase().charAt(0);
		boolean rightChoice = false;		

		StringBuilder sb = new StringBuilder(quizPanel.game.hidden);
		for (int i = 0; i < quizPanel.game.answer.length(); ++i) {
			if (quizPanel.game.hidden.charAt(i) == '-' && 
					quizPanel.game.answer.charAt(i) == select) {
				sb.setCharAt(i, select);
				quizPanel.game.hidden = sb.toString();
				quizPanel.wordLabel.setText(quizPanel.game.hidden);
				rightChoice = true;
			}
		}
		
		if (!rightChoice) {			
			imgPanel.card.next(imgPanel);
			quizPanel.countLabel.setText("Count : " + --quizPanel.game.count);				
		}
		
		for (int i = 0; i < quizPanel.game.hidden.length(); ++i) {
			if (!quizPanel.game.hidden.contains("-")) {
				imgPanel.card.show(imgPanel, "win");
				JOptionPane.showMessageDialog(null, "승리!", "Result", 1);
				quizPanel.game.reset();
				imgPanel.card.first(imgPanel);
				resetButton();
			}
		}
		
		if (quizPanel.game.count == 0) {
			imgPanel.card.show(imgPanel, "lose");
			JOptionPane.showMessageDialog(null, "패배!", "Result", 0);
			quizPanel.game.reset();
			imgPanel.card.first(imgPanel);
			resetButton();
		}
		
	}

}
