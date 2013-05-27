import kareltherobot.*;
import java.awt.Color;

public class SportRobotTester extends UrRobot
{
  public SportRobotTester(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

    
  static public void main (String[] args) 
  {
      Object tina = new TennisRobot(1,1,North,-1);
      ((TennisRobot)tina.play());
      
  } 



  /*
  * Modify this to manipulate the World.
  */
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