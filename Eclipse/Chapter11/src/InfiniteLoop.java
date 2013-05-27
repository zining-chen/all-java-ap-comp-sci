import java.util.Scanner;

public class InfiniteLoop {
	
	public static double power(double j) {
		return Math.pow(j, j-1);
	}

	public static void main(String[] args) {
		boolean status = false;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Are you sure you want to run this program? \nTo run it, enter the same letter twice.");
		String s = kb.nextLine();
		
		if (s.charAt(0) == s.charAt(1)) {
			status = true;
		}
		else {
			status = false;
		}
			
		long k = 0;
		
		while (status == true) {
			for (int i = 0; i < 10000; i++) {
				k = (long)(power(k));
				System.out.println (k);
			}
			/*
			String temp = kb.nextLine();
			if (temp.charAt(0) == temp.charAt(1)) {
				status = false;
			}
			*/
		}

	}

}
