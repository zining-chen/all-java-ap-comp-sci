
import kareltherobot.*;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Clock extends Digit
{
    public Clock (int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    
    
    static public void main (String[] args) 
    {
       for (int i = 0; i < 1; i++)
       {
       ExecutorService sew = Executors.newCachedThreadPool();
        
       TimeDigit S01 = new TimeDigit(1,25,North,-1,Color.RED, new s01());
       TimeDigit S10 = new TimeDigit(1,21,North,-1,Color.RED, new s10());

       TimeDigit M01 = new TimeDigit(1,15,North,-1,Color.GREEN, new m01());
       TimeDigit M10 = new TimeDigit(1,11,North,-1,Color.GREEN, new m10());
       
       TimeDigit H01 = new TimeDigit(1,5,North,-1,Color.BLUE, new h01());
       TimeDigit H10 = new TimeDigit(1,1,North,-1,Color.BLUE, new h10());
       
       TimeDigit colon1 = new TimeDigit(1,8,North,-1,Color.BLACK, new h10());
       TimeDigit colon2 = new TimeDigit(1,18,North,-1,Color.BLACK, new h10());

       sew.execute(S01);
       sew.execute(S10);
       sew.execute(M01);
       sew.execute(M10);
       sew.execute(H01);
       sew.execute(H10);
       
       colon1.colon(true);
       colon2.colon(true);
       
       colon1.turnRight();
       colon1.moves(7);
       colon1.turnLeft();
       colon2.turnRight();
       colon2.moves(17);
       colon2.turnLeft();
       
       colon1.turnOff();
       colon2.turnOff();
       
    }
    }

    static 
    {
        kareltherobot.World.setSize(7, 28);
        kareltherobot.World.setDelay(0);
        kareltherobot.World.setBeeperColor(Color.black);
        kareltherobot.World.setStreetColor(Color.white);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());

        kareltherobot.World.setVisible(true);
    }

}