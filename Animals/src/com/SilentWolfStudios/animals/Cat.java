package com.SilentWolfStudios.animals;

public class Cat extends Animal { // extends means inherit
	
	private String color;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void showCat(){
		
		System.out.println("Cat profile: " + getColor() + 
							" , " +getFood() + " , " + 
							getNumLegs());
	}





	//Behaviour overriding
	@Override
	public void makeNoise() {
		System.out.println("Cat purring...");
	}
//	public void makeNoise() {
//		System.out.println("Purrrrr"); // replaces making noise
//		
//	}
	
	
}
