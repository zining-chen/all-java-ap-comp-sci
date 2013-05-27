
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Robot1 extends UrRobot
{
  public Robot1(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

    
  static public void main (String[] args) 
  {
      UrRobot ren = new UrRobot (1,10,North,-1);
      {
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();
          ren.move();
          ren.putBeeper();

  } 
}



  /*
   Modify this to manipulate the World.
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