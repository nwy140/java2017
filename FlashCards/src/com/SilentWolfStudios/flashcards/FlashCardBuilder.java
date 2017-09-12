package com.SilentWolfStudios.flashcards;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.Scrollable;
import javax.swing.SwingUtilities;

public class FlashCardBuilder {

	private JTextArea question;
	private JTextArea answer;
	private  ArrayList<FlashCard> cardlist;
	private JFrame frame;
	
		
	
		
	public FlashCardBuilder() {
		// Build the User interface
		frame = new JFrame("Flash Card");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a JPanel to hold everything
		JPanel mainPanel = new JPanel();
		
		// Create font
		Font greatFont = new Font("Helvetica Neue", Font.BOLD,21);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(greatFont);
	
		// Question area 
		JScrollPane qJScrollPane = new JScrollPane(question);
		qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// Answer area
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(greatFont);
		
		
		// Create JscrollPane
		JScrollPane aJScrollPane = new JScrollPane(answer) ;
		aJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// Add componenets to mainPanels
	
		JButton nextButton = new JButton("Next Card");
		
		cardlist = new ArrayList<FlashCard>() 	;
		
		//Create a few labels
		JLabel qJLabel = new JLabel("Question");
		JLabel aJLabel = new JLabel("Answer") ;
		
		// MenuBar
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");										// this will be shown 
		
		JMenuItem newMenuItem = new JMenuItem("New");
		
		JMenuItem saveMenuItem = new JMenuItem("Save");
		
		
		// Add eventsListener
		newMenuItem.addActionListener(new NewMenuItemListener());
		saveMenuItem.addActionListener(new SaveMenuListener());
		
		frame.setJMenuBar(menuBar);
		
		// Add components to mainPanel
		mainPanel.add(qJLabel);
		mainPanel.add(qJScrollPane);
		mainPanel.add(aJLabel);
		mainPanel.add(aJScrollPane);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener()); // event listener  = action listener
		
		fileMenu.add(newMenuItem) ;
		fileMenu.add(saveMenuItem);
		
		menuBar.add(fileMenu);
		
		
		
		
		// Add to the Frame
		frame.getContentPane().add(BorderLayout.CENTER , mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
		
		
		
		
		
	}	
		
		
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new FlashCardBuilder();
			}
		});
	}

	class NextCardListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//TODO ; 
			FlashCard card = new 	FlashCard(question.getText(),answer.getText());
			System.out.println("Button Clicked");
		
			cardlist.add(card);
			
			clearCard();
			
			System.out.println("Size of Array List " + cardlist.size());
		}


		
		
	}
	
	class NewMenuItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("New Menu clicked");
		}
		
		
	}
	class SaveMenuListener i-mplements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {			
			System.out.println("Save Menu Clicked");
			
			FlashCard card = new FlashCard(question.getText(), answer.getText())
					cardlist.add(card);
			
			// Create a file dialog with file chooser
			JFileChooser fileSave = new JFileChooser() ;
			fileSave.showOpenDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}
		
		
	}
	
	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	
	}
	private void savefil
	
	
	
}
