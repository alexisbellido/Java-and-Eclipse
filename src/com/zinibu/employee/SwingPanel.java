package com.zinibu.employee;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SwingPanel extends JPanel {
	
	private JButton testButton;
	private JTextArea testTextArea;
	private SpringLayout currentLayout;
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
	
	public SwingPanel() {
		testButton = new JButton("Click here");
		testTextArea = new JTextArea();
		setupPanel();
	}
	
	private void setupPanel() {
		testTextArea.setRows(2);
		testTextArea.setColumns(1);
		currentLayout = new SpringLayout();
		currentLayout.putConstraint(SpringLayout.NORTH, testTextArea, 34, SpringLayout.SOUTH, testButton);
		currentLayout.putConstraint(SpringLayout.WEST, testTextArea, 0, SpringLayout.WEST, testButton);
		currentLayout.putConstraint(SpringLayout.EAST, testTextArea, 0, SpringLayout.EAST, testButton);
		currentLayout.putConstraint(SpringLayout.NORTH, testButton, 137, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, testButton, 173, SpringLayout.WEST, this);
		setBackground(new Color(204, 255, 204));
		setLayout(currentLayout);
		add(testButton);
		add(testTextArea);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hi, I am a string", MESSAGE_X, MESSAGE_Y);
		
		Graphics2D g2 = (Graphics2D) g;
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
	}

}
