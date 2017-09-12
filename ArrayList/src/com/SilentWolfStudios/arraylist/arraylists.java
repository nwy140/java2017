package com.SilentWolfStudios.arraylist;

import java.util.ArrayList;

public class arraylists {

	public static void main(String[] args) {
		//ArrayList <type> , .size() is .length, .get(i) is [i]
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Dog");
		animals.add("Monkey") ;
		animals.add("Cat");
		animals.add("Donkey");
		
//		animals.remove(0); //removes [0] array
		animals.remove("Cat"); // removes string array

		if(animals.contains("Dog")){
			animals.remove("Dog");
		} else {
			animals.add("Chicken");
		}
		
		for (int i = 0 ; i <animals.size(); i++) {
			System.out.println("Animals: " + animals.get(i));
		}
		
		
//		if(animals.isEmpty()) {
//			System.out.println("Animal is empty");
//		} else {
//			for (String animal : animals) {
//				System.out.println("Animals: " + animal);
//			}
//		}c
		
	

		
//		System.out.println("Size: " + animals.size());
//		for (int i = 0 ; i <animals.size(); i++) {
//			System.out.println("Animals: " + animals.get(i));
//		}
		
	}

}
