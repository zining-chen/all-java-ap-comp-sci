
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class HRobot extends UrRobot
{
  public HRobot(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }


    
  static public void main (String[] args) 
  {

      UrRobot Karel = new UrRobot(1,1,North,-1);
      
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.move();
      Karel.turnLeft();
      Karel.putBeeper();
      Karel.move();
      Karel.putBeeper();
      Karel.move();
      Karel.putBeeper();
      Karel.move();
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.move();
      Karel.move();
      Karel.turnLeft();
      Karel.move();
      Karel.putBeeper();
      Karel.move();
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.move();
      Karel.turnLeft();
      Karel.turnLeft();
      Karel.putBeeper();
      Karel.move();
      Karel.putBeeper();
      Karel.move();
      Karel.putBeeper();
      Karel.move();
      Karel.turnLeft();
      Karel.move();
      Karel.move();
      Karel.move();
      Karel.turnLeft();
      Karel.move();
      Karel.move();
      Karel.move();
      Karel.turnLeft();
      Karel.turnLeft();
      
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

    //kareltherobot.World.readWorld("folder", "worldfile");
    //kareltherobot.World.showSpeedControl(true);
    //See the JavaDocs for class World for more options

    kareltherobot.World.setVisible(true);
   }

}