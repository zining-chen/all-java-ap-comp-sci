
import kareltherobot.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author : Andrew Brandt
 * teacher : Mr. Klammer
 * due date: 8/29/2012
 */

public class Robot extends Robot
{
    public Robot(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
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
        for (int j = 0 ; j < q ; j++)
        {
            move();
        }
    }

    public void letterl() 
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        turnRight();
        move();
        move();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        turnLeft();
    }

    static public void main (String[] args) 
    {
        Robot robo = new Robot(1,1,North,-1);
        robo.letterl();
        

    }

    static
    { // The World
        kareltherobot.World.setSize(15, 15);
        kareltherobot.World.setDelay(-5);
        kareltherobot.World.setBeeperColor(Color.blue.darker());
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());
        kareltherobot.World.setVisible(true);
    }

}