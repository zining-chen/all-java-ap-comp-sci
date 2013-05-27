import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Ren extends SuperRobot
{
    public Ren(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void clearColumn(int h)  //clears column of height h
    {
        for (int height = 0; height < (h-1); height++)
        {
            while ( nextToABeeper() )
                pickBeeper();
            move();
        }
        while ( nextToABeeper() )
            pickBeeper();
    }

    public void cleanGrid(int i)
    {
        cleanGrid(i,i);
    }
    
    public void cleanGrid(int h, int w)
    {
        for (int width = 1; width <= w; width++)
        {
            clearColumn(h);

            if ( width < w)
            {
                if ( width % 2 == 1 )  //if odd
                {
                    turnRight();
                    move();
                    turnRight();
                }
                else                   //if even
                {
                    turnLeft();
                    move();
                    turnLeft();
                }
            }
        }
        
        //*** Go Home!  ****
        if ( w % 2 == 1)             // if odd
        {
            turnAround();
            moves(h-1);
        }

        turnRight();
        moves(w-1);
        turnRight();

    }

    static public void main (String[] args)
    {
        Ren sharleen = new Ren(1,1,North,-1, Color.RED);

        sharleen.cleanGrid(10,11);
    }

    /*
     * Modify this to manipulate the World.
     */
    static
    {
        kareltherobot.World.setSize(12, 12);
        kareltherobot.World.setDelay(1);
        kareltherobot.World.setBeeperColor(Color.magenta);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        //place piles of beepers on grid
        int x,y,n;
        for (int i = 0; i < 40; i++)
        {
            x = (int)(Math.random()*9 + 1);
            y = (int)(Math.random()*9 + 1);
            n = (int)(Math.random()*4 + 1);
            kareltherobot.World.placeBeepers(x,y,n);
        }

        kareltherobot.World.setVisible(true);
    }

}