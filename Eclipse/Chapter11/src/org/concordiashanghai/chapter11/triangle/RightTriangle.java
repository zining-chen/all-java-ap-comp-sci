package org.concordiashanghai.chapter11.triangle;

public class RightTriangle extends Triangle {

	public RightTriangle(double a) {
		super(a);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return getSide() * (2 + Math.sqrt(2));
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * getSide() * getSide();
	}  
	
}
