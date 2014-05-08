package com.zinibu.employee;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class SwingFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 400;
	private SwingPanel currentPanel;
	
	public SwingFrame() {
		currentPanel = new SwingPanel();
		setupFrame();
		
//		Toolkit kit = Toolkit.getDefaultToolkit();
//		Dimension screenSize = kit.getScreenSize();
//		int screenHeight = screenSize.height;
//		int screenWidth = screenSize.width;
//		setSize(screenWidth / 3, screenHeight / 2);
		
//		SpringLayout springLayout = new SpringLayout();
//		getContentPane().setLayout(springLayout);
	}
	
	private void setupFrame() {
		setContentPane(currentPanel);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle("The SwingTest");
		setLocationByPlatform(true);
	}
}
