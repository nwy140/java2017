package com.SilentWolfStudios.textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TextField implements ActionListener{
	JTextField jTextField;
	JButton reverseButton;
	JLabel promptLabel;
	JLabel contentLabel;
	
			public TextField () {
		
			
			
			JFrame jFrame = new JFrame("Enter your text");
			
			jFrame.setLayout(new FlowLayout());
			
			// Size the frame
			jFrame.setSize(250,120);
			
			jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE)  ;
			
			// Create TextField
			jTextField  = new JTextField(10) ;
			
			jTextField.setActionCommand ("textField");
			
			// Create a Button
			reverseButton = new JButton("Reverse") ;
			
			// Add action listeners
			
			jTextField.addActionListener(this);
			reverseButton.addActionListener(this);
			

			
			// Create our label prompt
			promptLabel = new JLabel("Enter text: " ) ;
			contentLabel = new JLabel("");
			
			// Add to Frame		
			jFrame.add(jTextField);
			jFrame.add(promptLabel);
			jFrame.add(reverseButton);
			jFrame.add(contentLabel);
					
					
			
			// Set visible
			jFrame.setVisible(true);
			
		}
	

	public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new TextField();
				}
			});

		}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			// Reverse string logic
			String origalString = jTextField.getText();
			String holder = "";
			
			// Text
			
			for(int i = origalString.length() -1 ; i >=0; i --)
			{
				holder += origalString.charAt(i);
				
				contentLabel.setText(holder);
				
			}
		} else {
			// Enter was pressed while focus was in the textfield
			contentLabel.setText("You pressed Enter. Text is :" + jTextField.getText());
		}
	
	}
	
	

	
		
		



}
