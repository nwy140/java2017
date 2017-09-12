package com.SilentWolfStudios.animals;


public class AnimalTest {
//	Animal animal = new Animal(); // superclass abstract 	
	
		
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		Lion lion = new Lion();
		lion.setName("Simba");
		lion.setFood("Meat");
		lion.setNumLegs(4);
		lion.setColor("Orange");
		
		lion.showLion();
		
//		System.out.println("My lion is " + lion.getName() +" , " + lion.getFood() + " , " +lion.getNumLegs() );
		
		lion.makeNoise();

		
		
		cat.setName("Moz");
		cat.setFood("Cat food");
		cat.setNumLegs(4);
		cat.setColor("Purple");
		
		cat.showCat();
		
//		System.out.println("My cat is " + cat.getName() +" , " + cat.getFood() + " , " +cat.getNumLegs() );
		
		cat.makeNoise();
		
	}

}
