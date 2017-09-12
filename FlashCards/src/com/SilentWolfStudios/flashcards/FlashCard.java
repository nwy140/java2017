package com.SilentWolfStudios.flashcards;

public class FlashCard {
	
	
	private String Question;
	private String answer;
	

	
	
	public FlashCard(String q, String a) {
		Question = q; 
		answer = a;
	}
	
	
	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	
	
	
	

}
