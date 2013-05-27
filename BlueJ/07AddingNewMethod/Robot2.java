
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Robot2 extends UrRobot
{
  public Robot2(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }
  
  public void turnRight()
  {
      turnLeft();
      turnLeft();
      turnLeft();
  }
  
  // Method overloading
  public void turnAround()
  {
      turnLeft();
      turnLeft();
  }
  
  public void turnAround(double turns) // Double (floating point) (3.4; 8.2)
  {
      int j = (int)turns;                // Cast turns as int, store in j
      for (int i = 0; i < j; i++);       // Execute j turns
  }
    
  
  
  public void moves(int q)
  {
      for (int j = 0 ; j < q ; j++)
      {
       move();
    }
  }  
    
  static public void main (String[] args) 
  {
      Robot2 bob;  // Create a variable Bob that is of type Robot2
      
      bob = new Robot2(3,3,North,-1);
      
      int apple;
      apple = (int)(2+Math.random()*9);
      
      bob.turnAround( (int)4.5); // Int forces 4.5 into a int value; Java will not convert auto.
  } 



  /*
  * Modify this to manipulate the World.
  */
  static 
  {
    kareltherobot.World.setSize(12, 12);
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