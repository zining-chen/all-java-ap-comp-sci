
import kareltherobot.*;
import java.awt.Color;

public class Carpenter extends Worker implements Runable, Directions
{
    public Carpenter(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    private void makeDoor()
    {
        for (int i = 0; i < 2; i++)
        {
            putBeeper();
            move();
        }
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            putBeeper();
            move();
        }
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            putBeeper();
            move();
        }
        putBeeper();
    }
    
    private void makeWindow()
    {
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
    }

    public void doIt()
    {
        makeDoor();
        turnAround();
        moves(4);
        makeWindow();
        turnRight();
        moves(4);
        turnRight();
        makeWindow();
        moves(4);
        turnLeft();
        move();
        turnLeft();
    }
    
    public void run()
    {
        doIt();
    }
    


}