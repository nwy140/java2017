package com.SilentWolfStudios.introclass;

import org.omg.CORBA.PUBLIC_MEMBER;

// all classes automatically extends to Object class by default so we don't  have to extend it manually
public class Person { // a class have attributes (status ) and methods (behaviours)
	
	/*
	 * 
	 * public --> can be tempered with outside the class
	 * 
	 * private --> only used within the class in which it's defined
	 * 
	 * protected --> within the same package and/or derived classes
	 */
	
	
	
	//Instance variables or properties ( states or fields )
	private String name ;
	private int age ;
	private int height;
	
	//Constructor --> first thing that runs in a class 
	public Person(/*String myName, int myAge,int myHeight*/) {
//		name = myName;
//		age = myAge;
//		height = myHeight;

	}


	// Overloading Constructors
	public Person (String myName) {
		name = myName;
	}
	public Person (String myName, int myAge ) {
		name = myName;
		age = myAge;
		
	}
	public Person(String myName, int myAge,int myHeight) {
		name = myName;
		age = myAge;
		height = myHeight;
		
	}
	
	
	
	
	
	
	
	//Behaviours == functions
	public void cry() {
		System.out.println("Crying...");
	}
	
	public void sayName() {
		
		System.out.println("Say name...");
		
	}
	

	public void showData() {
		System.out.println("Name is " + name + " , " + age + " , " + height);
	}
}
	//Getters and setters
//
//	public String getName() {
//	return name;
//}
//
//	public void setName(String myName) {
//	name = myName;
//}
//
//	public int getAge() {
//	return age;
//}
//
//	public void setAge(int myAge) {
//	age = myAge;
//}
//
//	public int getHeight() {
//	return height;
//}
//
//	public void setHeight(int myHeight) {
//	height = myHeight;
//}

