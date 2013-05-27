import java.util.Scanner;

public class NumberGuess
{

    
    
    public static void main(String[] args)
    {
        int number = (int) (Math.random()*1000 + 1);
        int guess = -1;
        int tries = 1;
        boolean won = false;
         
        Scanner kb = new Scanner(System.in);

        while (!won && (tries <= 10) )
        {
            System.out.println("Enter your guess: ");
            guess = kb.nextInt();

            if (guess == number)
            {
                won = true;
                System.out.println("You Won!");
            }
            else if (guess < number)
            {
                System.out.println("Too Low! Number of Guesses Remaining: " + (10 - tries) );
            }
            else if (guess > number)
            {
                System.out.println("Too High! Number of Guesses Remaining: " + (10 - tries) );
            }
            else if (guess == 112439)
            {
                System.out.println("Cheater...Number: " + number);
            }

            tries++;
        }

        if (won)
        {
            System.out.println("You won in " + (tries - 1) + " guesses!");
        }
        else
        {
            System.out.println("The number was " + number);
        }
    }
}