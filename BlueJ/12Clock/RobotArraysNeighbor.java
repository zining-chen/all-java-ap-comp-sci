
import kareltherobot.*;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class RobotArraysNeighbor extends Robot
{

    Neighbor[] a = new Neighbor[20];

    public RobotArraysNeighbor (int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    static public void main (String[] args) 
    {
        ExecutorService exec = Executors.newCachedThreadPool();
        Neighbor[] a = new Neighbor[20];
       
        a[19] = new Neighbor(1,20,North,-1,null);
        
        for (int i = 18; i >= 0; i--)
        {
            a[i] = new Neighbor(1,i+1,North,-1, a[i+1] );
        }

        a[0].turnOffNeighbor();
        a[0].turnAllAround();
        //a[0].
        a[0].turnOff();
        
    }
    static 
    {
        kareltherobot.World.setSize(25, 25);
        kareltherobot.World.setDelay(3);
        kareltherobot.World.setBeeperColor(Color.red);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        kareltherobot.World.setVisible(true);
    }

}