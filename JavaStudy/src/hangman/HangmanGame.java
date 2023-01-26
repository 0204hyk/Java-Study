package hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class HangmanGame {
	private static File texts = new File("files_hangman/word.txt");
	final private static int WORD_COUNT = 2997;
	private static String[] words = new String[WORD_COUNT];
	public static int count = 7;
	QuizPanel quizPanel;
	String answer = getRandomword();
	String hidden = getHidden(answer);
	
	static {
		readFile();
	}
	
	public static void readFile() {
		try (
			BufferedReader in = new BufferedReader(new FileReader(texts));
		) {
			String line;
			int i =0;			
			while((line = in.readLine()) != null) {
				words[i] = line;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getRandomword() {
		return words[(int)(Math.random() * WORD_COUNT)];
	}
	
	public static String getHidden(String randomWord) {
		String hiddenWord = "";
		for(int i = 0; i < randomWord.length(); ++i) {
			hiddenWord += "-";
		}
		return hiddenWord;
	}
	
	void reset() {
		count = 7;
		answer = getRandomword();
		hidden = getHidden(answer);
		quizPanel.wordLabel.setText(hidden);
		quizPanel.countLabel.setText("Count : " + count);
		System.out.println("정답: " + answer);
	}

	public HangmanGame(QuizPanel quizPanel) {
		this.quizPanel = quizPanel;
	}
	
}
