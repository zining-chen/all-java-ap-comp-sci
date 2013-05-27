
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class SteelpeChaser extends SuperRobot
{
    public SteelpeChaser(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void m()
    {
        if (frontIsClear())
        {
            move();
        }
        else
        {
        }
    }
    public void clearWall()
    {
        turnRight();
        if (frontIsClear())
        {  
        }
        else
        {
            turnLeft();
            move();
            turnRight();
        }
        if (frontIsClear())
        {
           
        }
        else
        {
            turnLeft();
            move();
            turnRight();
        }
        if (frontIsClear())
        {
        }
        else
        {
            turnLeft();
            move();
            turnRight();
        }
        move();
    }
    
    public void goToBottom()
    {
       if (frontIsClear())
        {
            move();
        }
        if (frontIsClear())
        {
            move();
        }
        if (frontIsClear())
        {
            move();
        }
        
    }
    
        
    static public void main (String[] args) 
    {
        SteelpeChaser ren = new SteelpeChaser(1,1,East,-1,Color.RED);
        
        // The first Wall
        
        ren.m();
        ren.turnLeft();
        ren.clearWall();
        ren.turnRight();
        
        ren.goToBottom();
        
        

    } 


    /*
     * Modify this to manipulate the World.
     */
    static 
    {
        kareltherobot.World.setSize(12, 12);
        kareltherobot.World.setDelay(50);
        kareltherobot.World.setBeeperColor(Color.magenta);
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        for (int i = 1; i < 10; i++)
        {
            kareltherobot.World.placeNSWall (1, (int)(Math.random()*8+1), (int)(Math.random()*4));
        }

        //kareltherobot.World.readWorld("folder", "worldfile");
        //kareltherobot.World.showSpeedControl(true);
        //See the JavaDocs for class World for more options

        kareltherobot.World.setVisible(true);
    }

}