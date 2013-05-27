
import kareltherobot.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author :
 * teacher :
 * due date:
 */

public class ForLoop extends UrRobot
{
  public ForLoop(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

    
  static public void main (String[] args) 
  {
    ForLoop ren = new ForLoop(1,1,East,-1);
    
    String temp = JOptionPane.showInputDialog("Enter length:");
    int length = Integer.parseInt(temp);
    
    for (int j = 0; j < 4; j++)
    {
      for (int i = 0; i < length; i++)
      {
        ren.putBeeper();
        ren.move();

      } 
      ren.turnLeft();
    }
    ren.turnLeft();
}



  /*
  * Modify this to manipulate the World.
  */
  static 
  {
    kareltherobot.World.setSize(100, 100);
    kareltherobot.World.setDelay(1);
    kareltherobot.World.setBeeperColor(Color.magenta);
    kareltherobot.World.setStreetColor(Color.blue);
    kareltherobot.World.setNeutroniumColor(Color.green.darker());

    //kareltherobot.World.readWorld("folder", "worldfile");
    //kareltherobot.World.showSpeedControl(true);
    //See the JavaDocs for class World for more options

    kareltherobot.World.setVisible(true);
   }

}