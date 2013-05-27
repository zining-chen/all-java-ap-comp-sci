
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class WritingRobot extends UrRobot
{
  public WritingRobot(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }
  
  public void turnAround()
  {
      turnLeft();
      turnLeft();
    }
  
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

  //create the alphabet, draw each letter in a 3x3 or 5x3 grid...not sure right now
  
  public void lettera() 
  {
      putBeeper();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      putBeeper();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      putBeeper();
      turnAround();
      move();
      move();
      turnLeft();
      move();
      turnRight();
      putBeeper();
      move();
      move();
      turnLeft();
      move();
      turnRight();
      putBeeper();
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      putBeeper();
      turnAround();
      move();
      move();
      turnLeft();
      move();
      move();
      move();
      move();
    }
    
  static public void main (String[] args) 
  {
      Robot r = new Robot(0,0,North,-1);
      
      r.lettera();
      

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