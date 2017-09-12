package com.SilentWolfStudios.introclass;

import javax.xml.ws.WebEndpoint;

public class JavaClass {

	public static void main(String[] args) {
		
		//Instantiating objects ( creating objects)
		
		Person myPerson = new Person("Ng Wei Yuen",16  ,9);
		Person secondPerson = new Person();

		System.out.println("Get Class: " + myPerson.getClass().getSimpleName());
		System.out.println("Hashcode: " + myPerson.hashCode()	);   // has

		if (myPerson.equals(secondPerson)) {
			System.out.println("These two are the same");
		}else {
			System.out.print("Not the same objects");
		}
		
		System.out.println("toString: " + myPerson.toString());
		
		//		myPerson.showData();
		
		
		
		
		
		
		 // . means accesing properties or behaviours of a class
//		myPerson.age = 16;
//		myPerson.name = "Ng Wei Yuen";
//		
//		myPerson.
//		secondPerson.age = 16;
//		secondPerson.name = "Yap Sam Mi";
//		
//		myPerson.cry();
//		myPerson.sayName();
//		
//		secondPerson.cry();
//		secondPerson.sayName();
//		
//		System.out.println("My name is " + secondPerson.name);
//		System.out.println("I am " + secondPerson.age);

	}

}
