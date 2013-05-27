import javax.swing.JOptionPane;

public class GUI
{
    public static void main(String[] args)
    {
        int number = (int) (Math.random()*10000 + 1);
        int guess = -1;
        int tries = 1;
        boolean won = false;
        int j = 10;
        
        JOptionPane.showMessageDialog( null, "Guess a number between 1 and 10,000. You have 10 tries",
             "Rules", JOptionPane.PLAIN_MESSAGE);
        
        while ( !won && (tries <= j ) )
        {
            String temp = JOptionPane.showInputDialog("You have " + 
            ((j + 1) - tries) + " tries remaining. Enter your guess: ");
                    
            guess = Integer.parseInt (temp) ;
            
            if (guess == number)
            {
                won = true;
                JOptionPane.showMessageDialog( null, "YOU WIN!!!", "Hint",
                  JOptionPane.PLAIN_MESSAGE);
            }
            
            if (guess < number)
            {
                JOptionPane.showMessageDialog( null, "Your guess is too low! Try again!", "Hint",
                  JOptionPane.PLAIN_MESSAGE);
            }
            else if (guess > number)
            {
                JOptionPane.showMessageDialog( null, "Your guess is too high! Try again!", "Hint",
                  JOptionPane.PLAIN_MESSAGE);
            }
            
            if (guess == 112439 || guess == 0 || guess == 10001)
            {
                JOptionPane.showMessageDialog( null, "The number is: " + number, "CHEATER",
                  JOptionPane.PLAIN_MESSAGE);
                tries += 8;
            }
            
            tries++;
        }
        
        JOptionPane.showMessageDialog (null, "You lose", "Sorry", JOptionPane.PLAIN_MESSAGE);
        
        
    }
}
