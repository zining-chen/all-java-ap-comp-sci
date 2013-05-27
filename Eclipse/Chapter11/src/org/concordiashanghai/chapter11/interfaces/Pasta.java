package org.concordiashanghai.chapter11.interfaces;

public class Pasta implements Edible {

	@Override
	public int getCalories() {
		
		return 100;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return "Very starchy, needs sauce";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pasta";
	}

}
