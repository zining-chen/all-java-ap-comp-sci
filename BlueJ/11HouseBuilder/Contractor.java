
import kareltherobot.*;
import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Contractor extends SuperRobot
{
  public Contractor(int st, int av, Direction dir, int numBeepers, Color c)
  {
      super(st, av, dir, numBeepers, c);
  }

  Carpenter Zee;
  Mason Nick;
  Roofer Eric;
  
  ExecutorService threadExecutor = Executors.newCachedThreadPool();
  
  public void assembleWorkers()
  {
      Zee = new Carpenter(1,5,North,-1,Color.BLACK);
      Nick = new Mason(1,2,North,-1,Color.WHITE);
      Eric = new Roofer(5,1,North,-1,Color.MAGENTA);
    }
  
  public void goW()
  {
      threadExecutor.execute(Zee);
      threadExecutor.execute(Nick);
      threadExecutor.execute(Eric);
    }
    
  static public void main (String[] args) 
  {
     Contractor Sabrina = new Contractor(10,1,South, 0, Color.GREEN);

     Sabrina.assembleWorkers();
     Sabrina.goW();
     
  } 



  /*
  * Modify this to manipulate the World.
  */
  static 
  {
    kareltherobot.World.setSize(12, 12);
    kareltherobot.World.setDelay(5);
    kareltherobot.World.setBeeperColor(Color.magenta);
    kareltherobot.World.setStreetColor(Color.blue);
    kareltherobot.World.setNeutroniumColor(Color.green.darker());

    //kareltherobot.World.readWorld("folder", "worldfile");
    //kareltherobot.World.showSpeedControl(true);
    //See the JavaDocs for class World for more options

    kareltherobot.World.setVisible(true);
   }

}