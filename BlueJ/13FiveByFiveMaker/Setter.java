
import kareltherobot.*;
import java.awt.Color;

public class Setter extends SuperRobot
{
    public Setter(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void putSide(int j)
    {
        for (int i = 0; i < j; i++)
        {
            moves(2);
            putBeeper();
        }

    }

    static public void main (String[] args) 
    {
        Setter a = new Setter(1,1,North,-1,Color.RED);

        a.turnRight();
        a.move();
        for (int k = 0; k < 4; k++)
        {
            a.putSide(2);
            a.turnLeft();
        }
        a.turnAround();
        a.move();
        a.turnRight();
    } 



    static 
    {
        kareltherobot.World.setSize(12, 12);
        kareltherobot.World.setDelay(10);
        kareltherobot.World.setBeeperColor(Color.magenta);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        //kareltherobot.World.readWorld("folder", "worldfile");
        kareltherobot.World.showSpeedControl(true);
        //See the JavaDocs for class World for more options

        kareltherobot.World.setVisible(true);
    }

}