package com.SilentWolfStudios.interfaceClasses;

public class Dog  extends  Canine implements Pet{

	public static void main(String[] args) {


	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beFriendly() {
		System.out.println("Friendly Dog");
	}

	@Override
	public void play() {
		System.out.println("Playful dog");

		
	}

	
	/*
	 * Animal
	 * 	||
	 * Canine
	 * 	||
	 * Dog 
	 * 
	 */
}
