package hangman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangmanFrame extends JFrame {
	JPanel centerPanel = new JPanel();
	JPanel westPanel = new JPanel(new GridLayout(2,1));
	ImagePanel imgPanel = new ImagePanel();
	QuizPanel quizPanel = new QuizPanel();
	AlphabetPanel alphabetPanel = new AlphabetPanel(imgPanel, quizPanel);
	SidePanel sidePanel = new SidePanel();

	public HangmanFrame() {
		centerPanel.setBackground(new Color(223, 228, 245));

		centerPanel.add(imgPanel);
		centerPanel.add(sidePanel);
//		centerPanel.add(new JLabel("이미 고른 알파벳 들어갈 곳"));
//		centerPanel.add(new JButton("다시하기"));
//		centerPanel.add(new JButton("종료하기"));
		westPanel.add(quizPanel);
		westPanel.add(alphabetPanel);
		
		add(centerPanel, "Center");
		add(westPanel, "West");
		
		setBackground(Color.WHITE);
		setLocation(300, 100);
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
