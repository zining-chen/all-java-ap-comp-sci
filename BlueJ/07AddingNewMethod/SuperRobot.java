
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class SuperRobot extends Robot
{
  public SuperRobot(int st, int av, Direction dir, int numBeepers, Color c)
  {
      super(st, av, dir, numBeepers, c);
  } 
  public void turnRight()
  {
      turnLeft();
      turnLeft();
      turnLeft();
  }
  public void turnAround()
  {
      turnLeft();
      turnLeft();
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

      SuperRobot jonathan = new SuperRobot(1,1,North,10,new Color(175,0,255)); // Color (RGB)
                                                                               // Max = 256
      while (jonathan.anyBeepersInBeeperBag())
      {
        jonathan.putBeeper();
        jonathan.move();
      }
       
      jonathan.turnAround();
      
      while (jonathan.frontIsClear() )
      jonathan.move();
      
      jonathan.turnAround();
     while (true)
      { 
      if (jonathan.nextToABeeper())
      {
          jonathan.pickBeeper();
          jonathan.move();
    } 
  }
}


  
 
  static 
  {
    kareltherobot.World.setSize(12, 12);
    kareltherobot.World.setDelay(10);
    kareltherobot.World.setBeeperColor(Color.magenta);
    kareltherobot.World.setStreetColor(Color.blue);
    kareltherobot.World.setNeutroniumColor(Color.green.darker());

    //kareltherobot.World.readWorld("folder", "worldfile");
    //kareltherobot.World.showSpeedControl(true);
    //See the JavaDocs for class World for more options

    kareltherobot.World.setVisible(true);
   }

}