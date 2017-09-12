package com.SilentWolfStudios.MeterToFeet;

import java.awt.event.MouseWheelEvent;
import java.util.Scanner;

public class Meter {

	public static void main(String[] args) {
		
		/*
		 *  1m = 3.28 feet
		 * 
		 */
		double multiplier = 3.28;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter Feet");
		double	feetVal = scan.nextDouble();
		double meterVal = feetVal/multiplier;
		
		System.out.println(feetVal + " feet is " + meterVal + "meter");
		
		
		
		
//		double multiplier = 3.28;
//		
//		double result ;
//		double metersVal = 234;
//		
//		result = multiplier * metersVal;
//		
//		System.out.println(metersVal + " meters is " + result + " feet ");
//		
//		
//		double reverseResult;
//		reverseResult = result/multiplier;
//		System.out.println(result + " feet is " + reverseResult + " meters");
//		
		
		
	}

}
