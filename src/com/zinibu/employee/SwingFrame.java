package com.zinibu.employee;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SwingFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public SwingFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 3, screenHeight / 2);
//		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		setTitle("The SwingTest");
		setLocationByPlatform(true);

		
	}

}
