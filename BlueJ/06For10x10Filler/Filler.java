
import kareltherobot.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Filler extends UrRobot
{
    public Filler(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    void turnRight() // Create a new object turnRight
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    void turnAround() // Create a new object turnAround
    {
        turnLeft();
        turnLeft();
    }

    void turnAroundR() 
    {
        turnRight();
        move();
        turnRight();
        move();
    }

    void turnAroundL()
    {
        turnLeft();
        move();
        turnLeft();
        move();
    }

    static public void main (String[] args) 
    {
        Filler filler = new Filler(1,2,East,-1); // Start the robot with infinite beepers at (1,2),
        // Facing east

        String temp = JOptionPane.showInputDialog("Enter length of one side");  // The size of the square
        int length = Integer.parseInt(temp);

        String temps = JOptionPane.showInputDialog("Enter number of beepers in each st/ave"); // How many
        // beepers on
        // each spot
        int squares = Integer.parseInt(temps);
        if ((length)%2 == 0)  // Find out if the length is even or odd
        {  
            for (int k = 0; k < squares; k++) // Number of beepers at each spot
            {
                for (int j = 0; j < length / 2; j++) // Number of right/left turns
                {
                    for (int i = 0; i < length; i++) // Make 1 row of beepers
                    {
                        filler.putBeeper();
                        filler.move();
                    }

                    // Make the robot turn around and move up one level on the right side of the square
                    filler.turnAroundL();
                    for (int i = 0; i < length; i++) // Make 1 row of beepers
                    {
                        filler.putBeeper();
                        filler.move();
                    }

                    // Make the robot turn around and move up one level on the left side of the square
                    filler.turnAroundR();
                }

                // The square has been completed, return to home slot to make another if desired
                filler.turnAround();
                filler.move();
                filler.turnLeft();
                for (int l = 0; l < length; l++) // Move to home
                {
                    filler.move();
                }

                // Get into same position as start
                filler.turnLeft();
                filler.move();
            }
            // Move to (1,1) so that the entire square is visible
            filler.turnAround();
            filler.move();
            filler.turnRight();
        }
        else // If the length is not even (odd)
        {
            for (int k = 0; k < squares; k++) // Number of layers on the square
            {
                for (int j = 0; j < (length / 2); j++)
                {
                    for (int i = 0; i < length; i++) // Make 1 row of beepers
                    {
                        filler.putBeeper();
                        filler.move();
                    }

                    // Move up one level and turn around on the right of the square
                    filler.turnAroundL();
                    for (int i = 0; i < length; i++)
                    {
                        filler.putBeeper();
                        filler.move();
                    }

                    // Move up one level and turn around on the left of the square
                    filler.turnAroundR();
                }
                for (int i = 0; i < length; i++) // Put the "odd" row of beepers
                {
                    filler.putBeeper();
                    filler.move();
                }
                // Move to move to home
                filler.turnAround();
                filler.move();
                filler.turnLeft();
                for (int l = 0; l < length - 1; l++) // Move it down to Street 1
                {
                    filler.move();
                }
                filler.turnRight(); // Turn towards (1,2)
                for (int l = 0; l < length - 1; l++) // Move it across to Ave 2
                {
                    filler.move();
                }
                filler.turnAround(); // Turn around to do another layer of beepers
            }
            // Move robot to (1,1) so the square is visible
            filler.turnAround();
            filler.move();
            filler.turnRight();
        }
    }


    /*
     * Modify this to manipulate the World.
     */
    static 
    {
        kareltherobot.World.setSize(200, 200);
        kareltherobot.World.setDelay(0);
        kareltherobot.World.setBeeperColor(Color.magenta);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        //kareltherobot.World.readWorld("folder", "worldfile");
        //kareltherobot.World.showSpeedControl(true);
        //See the JavaDocs for class World for more options

        kareltherobot.World.setVisible(true);
    }

}