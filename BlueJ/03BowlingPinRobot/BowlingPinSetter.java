
import kareltherobot.*;
import java.awt.Color;

/**
 * @author : Andrew Brandt
 * teacher : Mr. Klammer
 * due date: Aug. 24, 2012
 */

public class BowlingPinSetter extends UrRobot
{
  public BowlingPinSetter(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }
  void turnRight()
  {
     turnLeft();
     turnLeft();
     turnLeft();
  }
  void move8()
  {
     move();
     move();
     move();
     move();
     move();
     move();
     move();
     move();
  }
  void move4()
  {
      move();
      move();
      move();
      move();
  }
  void move3()
  {
      move();
      move();
      move();
  }
  void move2()
  {
      move();
      move();
  }
  void turnAround()
  {
      turnLeft();
      turnLeft();
  }
  static public void main (String[] args) 
  {
     
      
      BowlingPinSetter Karel = new BowlingPinSetter(1,5,North,10);
      
      Karel.turnLeft();
      Karel.move3();
      Karel.turnRight();
      Karel.move4();
      Karel.putBeeper();
      Karel.turnRight();
      Karel.move2();
      Karel.putBeeper();
      Karel.move2();
      Karel.putBeeper();
      Karel.move2();
      Karel.putBeeper();
      Karel.turnRight();
      Karel.move();
      Karel.turnRight();
      Karel.move();
      Karel.putBeeper();
      Karel.move2();
      Karel.putBeeper();
      Karel.move2();
      Karel.putBeeper();
      Karel.turnLeft();
      Karel.move();
      Karel.turnLeft();
      Karel.move();
      Karel.putBeeper();
      Karel.move2();
      Karel.putBeeper();
      Karel.turnRight();
      Karel.move();
      Karel.turnRight();
      Karel.move();
      Karel.putBeeper();
      Karel.turnRight();
      Karel.move4();
      Karel.turnAround();
      
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