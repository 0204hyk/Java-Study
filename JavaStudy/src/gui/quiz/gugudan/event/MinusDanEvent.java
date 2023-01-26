package gui.quiz.gugudan.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import gui.quiz.gugudan.component.GugudanButton;

public class MinusDanEvent implements ActionListener {

	List<GugudanButton> gugudanBtns;
	
	public MinusDanEvent(List<GugudanButton> gugudanBtns) {
		this.gugudanBtns = gugudanBtns;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (GugudanButton gugudanBtn : gugudanBtns) {
			gugudanBtn.minusDan();
		}
	}

}
