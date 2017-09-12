package com.SilentWolfStudios.staticProject;

import java.time.Year;

public class StaticProject {

	private static String name;
	
	public static void main(String[] args) {
		// static means you don't have instantiate to use them
		int myValue = -45;
		int secondvalue = 56;
		
		StaticProject myProject = new StaticProject();
		
//		System.out.println(setName("dwa"));
	
		
		int x = Math.min(myValue, secondvalue);
		int y = Math.abs(myValue);
		
		System.out.println("X Min: " + x + "Y Abs: " + y);
		
//		System.out.println ("Minimum: "+ Math.min(myValue, secondvalue));
		
//		System.out.println(Math.abs(myValue));
	
	}
	private static void setName(String n) {
		name = n;
	}
		
}
