package org.concordiashanghai.chapter11.triangle;

public abstract class Triangle
{
  private double side;

  public Triangle(double a)
  {
    side = a;
  }

  public abstract double getPerimeter();

  public double getSide() {   //accesser method
	  return side;
  }

  
  public abstract double getArea();

  
  public double getRatio()
  {
    return getArea()/getPerimeter();
  }
  
}
