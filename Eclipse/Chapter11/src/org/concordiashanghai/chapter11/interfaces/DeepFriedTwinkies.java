package org.concordiashanghai.chapter11.interfaces;

public class DeepFriedTwinkies implements JunkFood {

	@Override
	public int getCalories() {
		return 1200;
	}

	@Override
	public String getTaste() {
		return "Greasy, but delicious";
	}

	@Override
	public String getName() {
		return "Deep Fried Twinkies";
	}

	@Override
	public int getNastiness() {
		return 10;
	}
	
	@Override
	public String getColor() {
		return "Little white, but mostly brown";
	}

}
