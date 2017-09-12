package com.SilentWolfStudies.iowritefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

import javax.swing.text.AbstractDocument.Content;

public class WriteToFile {

	public static void main(String[] args) {

		// give file a path
		File file = new File("src/MyFile.txt");
		
		try (FileWriter fileWriter = new FileWriter(file)){
			fileWriter.write("This is amazing... Today is good");
			
			fileWriter.close();
			
			// Read it all back to us
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			
			while(( ( line = bufferedReader.readLine())!= null))
				System.out.println(line);
		} catch (Exception e) {
			
		}

		
	}

}
