import java.util.Scanner;
import java.util.Random;
import java.util.Dictionary;

public class Hangman
{

	int numberOfWords;
	//String[] generateRandomWords;
	//String[] randomStrings = new String[numberOfWords];
		
	

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		//String word = randomStrings[(int)(Math.random() * randomStrings.length)];
		//for (int i = 0; i < generateRandomWords.length; i++)
		//	randomStrings[i] = generateRandomWords[i];
		HangmanGame game = new HangmanGame(word);
		int count = 0;
		int failedGuesses = 0;
		
		


		boolean done = false;
		while (!done)
		{
			System.out.println("Tried: " + game.getTried());
			System.out.println("Failed guesses: " + failedGuesses);
			System.out.println(game.getGuessed());
			System.out.println();

			System.out.print("Enter next letter (or Quit): ");
			String s = input.next();
			s = s.toLowerCase();
			if ("quit".equalsIgnoreCase(s))
				break;
			if (s.length() != 1)
			{
				System.out.println("Invalid input");
			}
			else
			{
				int result = game.tryLetter(s.charAt(0));
				switch(result)
				{
				case 0:

					System.out.println("Already tried");
					break;

				case -1:

					System.out.println("Sorry, not there");
					failedGuesses++;
					break;

				case 1:

					System.out.println("Yes!");
					break;
				}
			}

			count++;

			if (game.getGuessed().indexOf('-') == -1)
			{
				System.out.println("You guessed " + word + " in " + count + " tries.");
				done = true;
			}
		}
	}  
}

