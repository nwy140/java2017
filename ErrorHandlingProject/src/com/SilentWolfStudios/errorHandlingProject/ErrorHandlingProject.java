package com.SilentWolfStudios.errorHandlingProject;

public class ErrorHandlingProject {

	public static void main(String[] args) {
		
		int number[]  = { 4, 8 , 16 , 32 , 64 , 128, 256, 512};
		int denom[] = {2,0,4,4,0,8};
		
		for (int i = 0 ; i < number.length; i ++) {
			try { // trying a code block and capturing errors, then display custom message
				System.out.println(number[i] + " / " + denom[i]  + " is " + number[i]/denom[i]);
			} catch (ArithmeticException e) {
				System.out.println("Cant Divide by zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found" );
			} finally {
				// will always run
				System.out.println("Running");
			}
			
		}
		

//		String [] myArray = {"Hello","Hi","James"};
		
//		System.out.println(myArray[2]);

//		float sum = 0;
//		
//		for (String argument : args) {
//			try {
//				sum = sum +Float.parseFloat(argument);
//				
//			} catch (NumberFormatException e) {
//				//System.out.println("Exception message " + e.getMessage());
//				System.out.println(argument+" is not a number");
// 			}
//			
//			
//		}
//		
//		System.out.println("Sum is: " + sum);
		
		
	}

}
