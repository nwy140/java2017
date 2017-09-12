package com.SilentWolfStudios.iostreamProjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;

public class Readinputs {

	public static void main(String[] args) throws IOException {
			
		File file = new File("src/Test.txt");
	
		try(FileReader fileReader = new FileReader(file)){
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			
			while (( (line = bufferedReader.readLine()  ) != null))
			System.out.println(line);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// byte lower level
//		try (FileInputStream fileInputStream = new FileInputStream(file)){
//			System.out.print("Total size to read in bytes is " +fileInputStream.available());
//			
//			int content;
//			while ((content = fileInputStream.read()) != -1 ) {
//				//convert to char and display it
//				System.out.print(  (char) content);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//}
		
		
		
//		byte data[] = new byte [11];
//		
//		System.out.println("Enter some characters:");;
//		System.in.read(data);
//		System.out.println("You entered: ");
//		
//		for (int i = 0 ; i < data.length; i++) {
//			System.out.print((char)data[i]); // (char) means whatever to the right is type char
//	
//		}
		
	
	
	}

	
	
	
	
	
}
	