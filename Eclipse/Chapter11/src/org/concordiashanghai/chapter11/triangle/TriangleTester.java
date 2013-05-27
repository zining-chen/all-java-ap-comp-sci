package org.concordiashanghai.chapter11.triangle;

import java.util.Scanner;


public class TriangleTester {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args)
	{
		
		System.out.println("This will calculate the ratio of the area to the perimeter. \nThe first number is for an equilateral triangle and the second is for a right triangle");
		System.out.println("Enter the first length:");
		Scanner kb = new Scanner(System.in);
		
		String s = kb.nextLine();
		int eql = Integer.parseInt(s);
		double a = eql;
		Triangle equilateralTr = new EquilateralTriangle(a);
		System.out.println("Equilateral: " + equilateralTr.getRatio());
		
		System.out.println("Enter the second length:");
		String q = kb.nextLine();
		int rgh = Integer.parseInt(q);
		double b = rgh;
		Triangle rightTr = new RightTriangle(b);
		System.out.println("Right isosceles: " + rightTr.getRatio());
		
		
		
	}
}  