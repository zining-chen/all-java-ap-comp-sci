package org.concordiashanghai.chapter11.interfaces;

public class DeepFriedOreos implements JunkFood {

	@Override
	public int getCalories() {
		return 275;
	}

	@Override
	public String getTaste() {
		return "Small discs of heaven";
	}

	@Override
	public String getName() {
		return "Deep Fried Oreos";
	}

	@Override
	public int getNastiness() {
		return 7;
	}
	
	@Override
	public String getColor() {
		return "Black and Brown";
	}

}
