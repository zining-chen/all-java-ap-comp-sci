import kareltherobot.*;
import java.awt.Color;

public class SuperRobot extends Robot
{
    public SuperRobot(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void turnRight()
    {
        turnLeft();
        turnAround();
    }  

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }  

    public void moves(int q)
    {
        for (int j = 0; j < q ; j++)
            move();
    }

    public void fillSquare(int side)
    {
        for (int j = 0; j < side; j++)
        {
            for (int i = 0; i < side; i++)
            {
                putBeeper();
                move();
            }
            turnAround();
            for (int i = 0; i < side; i++)
                move();
            turnLeft();
            move();
            turnLeft();
        }
        turnLeft();
        for (int i = 0; i < side; i++)
            move();
        turnRight();
    }

    public void cleanSquare(int side)
    {
        for (int j = 0; j < side; j++)
        {
            for (int i = 0; i < side; i++)
            {
                while( nextToABeeper() ) pickBeeper();
                move();
            }
            turnAround();
            for (int i = 0; i < side; i++)
                move();
            turnLeft();
            move();
            turnLeft();
        }
        turnLeft();
        for (int i = 0; i < side; i++)
            move();
        turnRight();
    }

    static public void main (String[] args)
    {
        SuperRobot jonathan = new SuperRobot(1,1,North,-1, new Color(180,0,255) );
        int i;
        
        while(true)
        {
            i = (int)(Math.random() * 10)+1;
            kareltherobot.World.setBeeperColor(
              new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255))    );
            jonathan.fillSquare(i);
            jonathan.cleanSquare(i);
        }
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

        //kareltherobot.World.readWorld("folder", "worldfile");
        //kareltherobot.World.showSpeedControl(true);
        //See the JavaDocs for class World for more options

        kareltherobot.World.setVisible(true);
    }

}