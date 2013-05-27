
import kareltherobot.*;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class RobotArraysColumn extends Robot
{

    Column[] a = new Column[10];

    public RobotArraysColumn (int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    static public void main (String[] args) 
    {
        for (int k = 0; k < 10; k++)
        {
        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService turnAround = Executors.newCachedThreadPool();
        Column[] a = new Column[20];
       
        for (int i = 0; i < 20; i++)
        {
            a[i] = new Column(1,i+1,North,-1);
        }
        
        for (int i = 0; i < 20; i++)
        {
            exec.execute( a[i] );
        }
    }
    }
    static 
    {
        kareltherobot.World.setSize(25, 25);
        kareltherobot.World.setDelay(0);
        kareltherobot.World.setBeeperColor(Color.red);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        kareltherobot.World.setVisible(true);
    }

}