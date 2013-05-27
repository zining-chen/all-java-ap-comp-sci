package org.concordiashanghai.chapter11.interfaces;

public class Pizza implements Edible {

	@Override
	public int getCalories() {
		return 400;
	}

	@Override
	public String getTaste() {
		return "Yummy";
	}

	@Override
	public String getName() {
		return "Pizza";
	}
	
	public int nastiness() {
		return 3;
	}

}
