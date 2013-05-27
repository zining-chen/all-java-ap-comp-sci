package org.concordiashanghai.chapter10;

import java.util.Scanner;

public class Main
{
	final static String romanChar = "IVXLCDM";
	final static int[] romanVals = {1,5,10,50,100,500,1000};

	private static int lookup(char c) {
		return romanVals[romanChar.indexOf(c)];
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int result = 0;
		String input = kb.nextLine();
		input = input.toUpperCase();
			
		for (int i = 0; i < input.length() - 2; i += 2) {
			if ( romanChar.indexOf ( input.charAt(i+1)) >= romanChar.indexOf(input.charAt(i+3) ) ) {		
				result += Integer.parseInt(input.charAt(i) + "") * lookup(input.charAt(i+1));
			}
			else {
				result -= Integer.parseInt(input.charAt(i) + "") * lookup(input.charAt(i+1));
			}
		}	
		result += Integer.parseInt(input.charAt(input.length() - 2) + "") * lookup(input.charAt(input.length() - 1));
	
		System.out.println(result);
		
		
	}
}
	