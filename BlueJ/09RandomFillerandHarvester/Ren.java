
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Ren extends Robot
{
    public Ren(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    static public void main (String[] args) 
    {

        RandomNumber ren = new RandomNumber(1,2,East,-1,Color.GREEN);

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