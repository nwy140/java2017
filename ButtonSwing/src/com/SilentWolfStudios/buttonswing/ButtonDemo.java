package com.SilentWolfStudios.buttonswing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ButtonDemo implements ActionListener {
	
	JLabel myLabel;
	
	
	
	public ButtonDemo () {
		// Create a Jframe
		JFrame jFrame = new JFrame("Button");
		
		// Specify FlowLayout for the layout manager'
		jFrame.setLayout(new FlowLayout());
		
		// Give a size to our frame
		jFrame.setSize(300,120);
		
		// Close application  on exit
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make a button
		JButton upButton = new JButton("Up");
		JButton downButton = new JButton("Down") ;
		JButton testButton = new JButton("Test");
		
		// Add EventListeners
		upButton.addActionListener(this);
		downButton.addActionListener(this);
		
//		upButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// Do the action needed
//				System.out.println("Hello Up clicked");
//			}
//		});
//		
//		downButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hello Downs clicked");
//			}
//		});
		
		// Label
		myLabel = new JLabel("Press Button");
		
		jFrame.add(upButton);
		jFrame.add(downButton);
		jFrame.add(testButton);
		jFrame.add(myLabel);
		
		//Show it!
		jFrame.setVisible(true);
		myLabel.setVisible(true);
		
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Our playground
		if (e.getActionCommand().equals("Up") ) {
			myLabel.setText("You pressed Up");
		}else if (e.getActionCommand().equals("Down")) {
			myLabel.setText("You pressed Down");
		}
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ButtonDemo();
				
			}
		});
	}






}
