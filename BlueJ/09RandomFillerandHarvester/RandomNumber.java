
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class RandomNumber extends Robot
{
    public RandomNumber(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void moves(int q)
    {
        for (int i = 0; i < q; i++)
        {
            move();
        }
    }

    static public void main (String[] args) 
    {

        RandomNumber ren = new RandomNumber(1,2,East,-1,Color.GREEN);

        int r;
        r = (int)(2+Math.random()*9);

        if ((r)%2 == 0)
        {  
            for (int i = 0; i < r / 2; r++)
            {
                for (int j = 0; j < r; j++)
                {
                    ren.putBeeper();
                    ren.move();
                }
                ren.turnLeft();
                ren.move();
                ren.turnLeft();
                ren.move();
                for (int j = 0; j < r; j++)
                {
                    ren.putBeeper();
                    ren.move();
                }
                ren.turnRight();
                ren.move();
                ren.turnRight();
                ren.move();
            }
            ren.turnAround();
            ren.move();
            ren.turnLeft();
            ren.moves(r);
            ren.turnLeft();
            ren.move();

            for (int l = 0; l < r / 2; l++)
            {
                while (ren.nextToABeeper())
                {
                    ren.pickBeeper();
                    ren.move();
                }
                ren.turnLeft();
                ren.move();
                ren.turnLeft();
                ren.move();
                while (ren.nextToABeeper())
                {
                    ren.pickBeeper();
                    ren.move();
                }
                ren.turnRight();
                ren.move();
                ren.turnRight();
                ren.move();
            } 
            ren.turnAround();
            ren.move();
            ren.turnLeft();
            ren.moves(r);
            ren.turnLeft();
            ren.move();

        }
        else // If the number is odd
        {
            for (int k = 0; k < r / 2; k++)
            {
                for (int j = 0; j < r; j++)
                {
                    ren.putBeeper();
                    ren.move();
                }
                ren.turnLeft();
                ren.move();
                ren.turnLeft();
                ren.move();
                for (int n = 0; n < r; n++)
                {
                    ren.putBeeper();
                    ren.move();
                }
                ren.turnRight();
                ren.move();
                ren.turnRight();
                ren.move();
            }

            for (int b = 0; b < r; b++)
            {
                ren.putBeeper();
                ren.move();
            }

            ren.turnRight();
            ren.moves(r - 1);
            ren.turnRight();
            ren.moves(r);
            ren.turnAround();

            for (int d = 0; d < r / 2; d++)
            {
                for (int e = 0; e < r; e++)
                {
                    while (ren.nextToABeeper())
                    {
                        ren.pickBeeper();
                        ren.move();
                    }
                    ren.turnLeft();
                    ren.move();
                    ren.turnLeft();
                    ren.move();

                    while (ren.nextToABeeper())
                    {
                        ren.pickBeeper();
                        ren.move();
                    }
                    ren.turnRight();
                    ren.move();
                    ren.turnRight();
                    ren.move();  
                }  
            }
            while (ren.nextToABeeper())
            {
                ren.pickBeeper();
                ren.move();
            }

            // Return Home goes here

            ren.turnRight();
            ren.moves(r - 1);
            ren.turnRight();
            ren.moves(r);
            ren.turnAround();  

    
        } 
    } 


    /*
     * Modify this to manipulate the World.
     */
    static 
    {
        kareltherobot.World.setSize(12, 12);
        kareltherobot.World.setDelay(10);
        kareltherobot.World.setBeeperColor(Color.magenta);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());


        kareltherobot.World.setVisible(true);
    }

}