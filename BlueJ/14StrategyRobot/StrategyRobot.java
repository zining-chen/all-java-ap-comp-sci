import kareltherobot.*;
import java.awt.Color;

public class StrategyRobot extends UrRobot
{
  Technique  myTechnique;
 
  public StrategyRobot(int st, int av, Direction dir, int numBeepers, Technique t)
  {
      super(st, av, dir, numBeepers);
      myTechnique = t;
  }

  public void go()
  {
      for (int i = 0; i < myTechnique.doMyAction(); i++)
      {
          putBeeper();
          move();
      }
  }
    
  static public void main (String[] args)
  {
      StrategyRobot bob;
      
      bob = new StrategyRobot(1,1,North,-1, new Two() );
      
      bob.go();
 
      bob = new StrategyRobot(1,3,North,-1, new One() );
      
      bob.go();
      
      bob = new StrategyRobot(1,5,North,-1, new Five() );
      
      bob.go();

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