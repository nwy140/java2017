package Methods;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String myName = scan.nextLine();
//		
//		System.out.println("Enter your name :");
//	
//		//call our method
//		showName(myName + "\n");
//		addNumber(9, 1);
		
		//scanner.close();
		
		int area= getArea(10, 10) ;
		System.out.println(" The area is : " + area);
		System.out.println("Full name is " + fullName("sammi", "yap"));
		System.out.println("My Truth: " + isTrue(true, false));
	}
	
	public static int getArea(int width,int height) {
		
		return width * height;
	}
	
	public static String fullName(String firstname, String lastname) {
			
			return firstname+" "+lastname;
		
	}
	
	public static void addNumber(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	
	public static void showName(String name) {
		System.out.print("My name is " + name);
	}
	
	public static boolean isTrue(boolean a, boolean b) {
		if (a!=b) {
			return a;
		} else {
			 return b;
		}
	}
}
