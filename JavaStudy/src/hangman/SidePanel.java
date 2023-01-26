package hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SidePanel extends JPanel {
	ResetButton resetBtn = new ResetButton();
	ExitButton exitBtn = new ExitButton();
	
	public SidePanel() {
		setBackground(new Color(223, 228, 245));
		
		resetBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		add(resetBtn, "West");
		add(exitBtn, "East");
		
	}
}
