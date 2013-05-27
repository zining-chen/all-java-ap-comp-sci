import java.util.Scanner;

public class Main {   //chores


	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String temp1 = kb.nextLine();
		int time = Integer.parseInt( temp1 );
		int numberOfChores = Integer.parseInt( kb.nextLine() );
		int [] chores = new int [numberOfChores];
		int smallestChore = 99999;
		int choresCanDo = 0;
		int valFoundIn = 0;
		int temp = 0;

		for (int i = 0; i < numberOfChores; i ++) 
			chores [i] = Integer.parseInt( kb.nextLine() );
		

		for (int k = 0; k < numberOfChores; k++) {
			System.out.println(chores [k]); //debug
		}
	
		
		for (int j = 0; j < chores.length; j++) {
			for (int i = 0; i < chores.length; i++) {
				temp = chores[i];
				if (smallestChore > temp ) {
					smallestChore = temp;
					i = valFoundIn;
				}
			}

			if (time >= smallestChore) { 
				time = time - smallestChore;
				chores[valFoundIn] = 99999;
				choresCanDo++;
			}
		}

		System.out.println(choresCanDo);
	}

}
