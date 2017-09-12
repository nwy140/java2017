package com.SilentWolfStudios.SwingDemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwimingDemo {

	public SwimingDemo() {
		// Create a new JFrame container
		JFrame jFrame = new JFrame("First swing application");

		// Give it a size
		jFrame.setSize(270,100);
		
		// Terminate the program when the user closes the application
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// Create a Jlabel
		JLabel jLabel = new JLabel("Wow this is amazing");
		
		// Add to the frame
		jFrame.add(jLabel);	
		
		// Show it
		jFrame.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		// Create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwimingDemo();
				
			}
		});
	}

}
