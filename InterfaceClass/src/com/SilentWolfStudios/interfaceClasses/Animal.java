package com.SilentWolfStudios.interfaceClasses;



	

public abstract class Animal { // abstact means you can't instantiate it
	
		// abstract methods have no body , ,  so they will have to be iplemented in inherited classes 
	
	
	//Atributes or properties or Instance variables
	private String name;
	private int numLegs;
	private String food;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumLegs() {
		return numLegs;
	}
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	//Behaviors
	public abstract void makeNoise();
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		System.out.println("Sleeping");
	}


}
