package org.concordiashanghai.chapter10;

import java.util.Scanner;

public class Cooney {

	public static void main(String[] args) {
		int numberCorrect = 0;
		boolean likes = false;
		Scanner kb = new Scanner(System.in);
		String input;
		
		while (numberCorrect < 5) {
			input = kb.nextLine();
			
			for (int i = 0; i < input.length() - 1; i++) {
				if (input.charAt(i) == input.charAt(i + 1)) {
					likes = true;
				}
			}
				 		
			if (likes == true) {
				numberCorrect ++;
				System.out.println("Cooney likes " + input);
			}
				
			else {
				numberCorrect = 0;
				System.out.println("Cooney does not like " + input);
			}
				
			likes = false;
			
		}
		
		System.out.println("You have won!");
	}

}
