package com.SilentWolfStudios.animals;

public class Lion extends Animal {
	private String color;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void showLion(){
		
		System.out.println("Lion profile: " + getColor() + 
							" , " +getFood() + " , " + 
							getNumLegs());
	}


	@Override
	public void makeNoise() {
		System.out.println("Roarrrrr");
		
	}

//	public void makeNoise() {
//		System.out.println("Roarrrrr");
//	}

}
