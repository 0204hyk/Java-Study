package gui.quiz.gugudan;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.gugudan.component.GugudanButton;
import gui.quiz.gugudan.component.MinusButton;
import gui.quiz.gugudan.component.PlusButton;

public class GugudanMainFrame extends JFrame {
	
	// 리스트로 여러개의 같은 종류의 버튼 관리하기
	List<GugudanButton> gugudanBtns = new ArrayList<>();
	
	// 인스턴스 초기화 블럭 (static이 붙으면 클래스 초기화 블럭)
	/*
	 	- 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행된다.
		- 모든 생성자가 공통적인 내용을 수행해야할 때 작성하여 중복을 최소화할 수 있다.
		- 인스턴스 블럭은 인스턴스가 생성될 때마다 수행되며 멤버의 초기화 이후, 생성자 호출 이전에 수행됨.

	 */
	{
		for (int i = 1; i <= 9; ++i) {
			gugudanBtns.add(new GugudanButton(i));	
		}
	}
	
	JButton plusBtn = new PlusButton(gugudanBtns);
	JButton minusBtn = new MinusButton(gugudanBtns);
	
	public GugudanMainFrame() {
		super("구구단");
		
		for (JButton gugudanBtn : gugudanBtns) {
			add(gugudanBtn);
		}
		
		add(plusBtn);
		add(minusBtn);
		
		//BorderLayout이 설정되어 있으면 원하는대로 배치할 수 없으므로 레이아웃 해제
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500 + 90);
		setVisible(true);
	}
}
