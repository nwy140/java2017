package com.SilentWolfStudios.javaarray;

import java.awt.event.ItemEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class javaArrays {

	public static void main(String[] args) {
		//Arrays
		int [] arrInts = {4,2,8,5};
		String [] arrStrings = {"Johna", "Arao", "Ines", "Olga", "Fina"};
		boolean [] arrBools = {true,false,true,true,false,false,true};
		
		int [] newArray = new int[4] ; 
		
		newArray[0] = 12;
		newArray[1] = 13;
		newArray[2] = 45;
		newArray[3] = 23;
		
		
	
		
//	newArray[4] = 2; // array.length does not start counting from 0
//		System.out.println( newArray.length	);
		
//		for (int i=0; i<newArray.length; i++) {
//					
//			System.out.println("Item #: " + newArray[i]) ;	
//			}
//		
		Arrays.sort(arrInts);
		
		for (int i=0; i<arrInts.length; i++) {
			
			
 		System.out.println("Sorted #: " + arrInts[i]) ;
		}
		
		
		for (int i=0; i<arrStrings.length; i++) {
			
			
			System.out.println("My siblings before sorting: " + arrStrings[i]) ;
			System.out.println("-----====------");
		}
		Arrays.sort(arrStrings);
		for (int i=0; i<arrStrings.length; i++) {
			
			
			System.out.println("My siblings " + arrStrings[i]) ;
		}
		
		
		
//		for (int i=0; i<arrBools.length; i++) {
//			System.out.println("Output: " + arrBools[i]);
//				
//			
//		}

	}

}
