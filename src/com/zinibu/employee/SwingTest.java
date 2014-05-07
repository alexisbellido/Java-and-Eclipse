package com.zinibu.employee;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SwingTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				SwingFrame frame = new SwingFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
