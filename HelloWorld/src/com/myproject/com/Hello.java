package com.myproject.com;

import java.security.KeyStore.TrustedCertificateEntry;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.net.ssl.SSLContext;

public class Hello {

	public static void main(String[] args) {
		
		//StringBuilder class // appends , continues string
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Hello");
		stringBuilder.append("Paulo");
		stringBuilder.delete(1, 3);

		
		System.out.println(stringBuilder + " length: " + stringBuilder.length() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Hello World! I am well!");
		/* Variables = container // where we put information and use them in a later them
		 * 
		 * Integer = number
		 * 
		 * byte = smallest "container" or memory space we can use 
		 *
		 * Short = 2x the size of a byte
		 * 
		 * float = 1.89
		 * 
		 * Double = 23.89 
		 * 
		 * char = character (*, &, @...)
		 *
		 * Boolean = holds 2 states ==> true and false; or 1 and 0
		 */
		String myName = "Paulo";
		String myDog = "Jerry";
		String myMom = "Gina"	;
		
		int myNumber = 12;
		int anotherNumber = 34 ; 
		
		byte myByte = 127; // byte limit 127, if >127, error
		
		short myShort = 4956;
		
		float myFloat = 2.9f;
		
		double myDouble = 34.78;
		
		char myChar = 'C';
		
		boolean myBoolean = true;
		
		
		System.out.println(myName + " has " + myNumber + " Oranges" );
		System.out.println(myDog + " has " + anotherNumber + " puppies");
		System.out.println(myMom);
		System.out.println(myNumber);
		System.out.println(anotherNumber);
		System.out.println(myByte);
		System.out.println("Byte " + myByte + " short " + myShort + " float " + myFloat + " double " + myDouble + " Char " + myChar + " Boolean " + myBoolean);
		
	}

}
               