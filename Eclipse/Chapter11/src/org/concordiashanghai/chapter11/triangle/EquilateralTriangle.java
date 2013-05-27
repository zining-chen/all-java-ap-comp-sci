package org.concordiashanghai.chapter11.triangle;

public class EquilateralTriangle extends Triangle {

	public EquilateralTriangle(double a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 3 * getSide();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(3) / 4 * getSide() * getSide();
	}

}
