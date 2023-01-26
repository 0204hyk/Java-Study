package hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuizPanel extends JPanel {
	HangmanGame game = new HangmanGame(this);
	JLabel wordLabel = new JLabel(game.hidden, JLabel.CENTER);
	JLabel countLabel = new JLabel("Count : " + game.count, JLabel.CENTER);
	
	public QuizPanel() {
		setLayout(new GridLayout(2, 1));
		setBackground(new Color(223, 228, 245));
		
		wordLabel.setFont(new Font("맑은 고딕", Font.BOLD, 120));
		countLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));		
		
		add(wordLabel);
		add(countLabel);
		System.out.println("정답: " + game.answer);
		
	}
}
