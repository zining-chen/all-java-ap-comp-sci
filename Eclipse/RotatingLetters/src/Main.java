import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String goodLetters = "I O S H Z X N";
		boolean status = true;
		
		Scanner kb = new Scanner(System.in);
		
		String word = kb.nextLine();
		word = word.toUpperCase();
		
		for (int i = 0; i < word.length(); i++) { 
			if (goodLetters.indexOf( word.charAt(i) ) == -1) {
				status = false;
			}
		}
		
		if (status == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
