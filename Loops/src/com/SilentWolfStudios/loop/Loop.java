package com.SilentWolfStudios.loop;

import org.omg.CORBA.SystemException;

public class Loop {

	public static void main(String[] args) {
		/*
		 *  for loop
		 *  while loop
		 *  do... while loop
		 * 
		 */
		
		int counter=0;
		
		do {
			System.out.println("Counter: " + counter);
			counter++;
		} while (counter<11);
		
		
		
//		while(counter<11) {
//			System.out.println("Count is: " + counter);
//			counter++;
//		}
		
		
//		for (int i=0; i<10; i++) {
//			System.out.println("Running " + i);
//		} 
		
		

	}

}
