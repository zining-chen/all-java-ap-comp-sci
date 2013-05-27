package org.concordiashanghai.chapter11.interfaces;

public class Food {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		
		JunkFood e = new DeepFriedTwinkies();
		JunkFood j = new DeepFriedOreos();
		
		System.out.println(e); //returns memory location
		System.out.println(e.getNastiness());
		
		System.out.println(e.equals(j)); //only checking for memory location, not if the nastiness is equal
		

	}

}
