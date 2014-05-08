package com.zinibu.employee;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class SwingPanel extends JPanel {
	
	private JButton testButton;
	private JTextArea testTextArea;
	private SpringLayout currentLayout;
	
	public SwingPanel() {
		testButton = new JButton("Click here");
		testTextArea = new JTextArea();
		currentLayout = new SpringLayout();
		currentLayout.putConstraint(SpringLayout.NORTH, testButton, 137, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, testButton, 173, SpringLayout.WEST, this);
		setupPanel();
	}
	
	private void setupPanel() {
		setBackground(new Color(102, 0, 204));
		setLayout(currentLayout);
		add(testButton);
		add(testTextArea);
	}

}
