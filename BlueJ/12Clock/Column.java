
import kareltherobot.*;
import java.awt.Color;

public class Column extends UrRobot implements Runnable
{
    public Column(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            putBeeper();
            move();
        }
    }
}