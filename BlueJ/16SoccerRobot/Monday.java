
import kareltherobot.*;
import java.awt.Color;

public class Monday extends Robot
{
    
    static final int MaxRobots = 15;
    static final int danceHeight = 10;
    static final double π = 3.1415926557;
    static int 你好;

    public Monday(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    public void dance()
    {
        for (int j = 0; j < 10; j++)
        {
            for (int i = 0; i < danceHeight; i++)
            {
                move();
                putBeeper();
            }
            turnLeft();
            turnLeft();
            for (int i = 0; i < danceHeight - 1; i++)
            {
                
                move();
                pickBeeper();
            }
            move();
            turnLeft();
            turnLeft();
        }
    }

    static public void main (String[] args) 
    {
        Monday bob [] = new Monday[MaxRobots];
        
        Monday jane;
        
        for (int i = 0; i < MaxRobots; i++)
        {
            bob[i] = new Monday (1,i+1,North,-1);
        }

        for (int i = 0; i < MaxRobots; i++)
        bob[i].dance();
        
        jane = bob[0];
        jane.你好 = 6;
        
        System.out.println(π);
    } 


    /*
     * Modify this to manipulate the World.
     */
    static 
    {
        kareltherobot.World.setSize(15, 15);
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