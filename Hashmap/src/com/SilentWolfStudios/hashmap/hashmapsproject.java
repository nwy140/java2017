package com.SilentWolfStudios.hashmap;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashmapsproject {

	public static void main(String[] args) {

		
		HashMap users = new HashMap<>();
		 // assign id to user Kealy
		
		HashMap <String,Integer >newUser = new HashMap<>();
		
		newUser.put("Sue", 34);
		
		System.out.println(  newUser.get("Sue"));
		
		users.put("Kealy", 34);
		users.put("Bonni", 25);
		
		if(users.containsKey("Kealy")) {
			System.out.println("yay");
		} else {
			System.out.println("Nay!");
			
		}
	
		java.util.Iterator it	= users.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next(); //  type map entry will have everything inside user hashmap
			System.out.println(pair.getKey() + " = " + pair.getValue()); // get key and value for all from this hashmap
		}
		
		
		
		// display key ,values
//		System.out.println("Values : " + users.values());
//		System.out.println("Entire values: " + users.entrySet());
//		System.out.println(users.get("Kealy"));
//		System.out.println(users.get("Bonni"));

	}

}
