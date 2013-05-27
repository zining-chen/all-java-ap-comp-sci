
import kareltherobot.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Filler extends UrRobot
{
  public Filler(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }
  void turnAroundR()  // Turn around and move 1 space to the right
  {
      turnRight();
      move();
      turnRight();
      move();
  }
  void turnAroundL()  // Turn around and move 1 space to the left
  {
      turnLeft();
      move();
      turnLeft();
      move();
    }
  void turnRight()
  {
      turnLeft();
      turnLeft();
      turnLeft();
    }
  void backUp()
  {
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
    }
  void fillRow()
  {
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      move();
      
    }
  void clearRow()
  {
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
      pickBeeper();
      move();
    }
  void move9()
  {
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }
  static public void main (String[] args) 
  {
      String temp = JOptionPane.showInputDialog("Enter number of squares created:");
    int times = Integer.parseInt(temp);
    for (int j = 0; j < times; j++)
    {
    Filler Karel = new Filler(1,1,North,-1);
    
    Karel.move();
    Karel.fillRow();       //Fill first row
    Karel.turnAroundR();
    Karel.fillRow();       //Fill second row
    Karel.turnAroundL();
    Karel.fillRow();       //Fill third row
    Karel.turnAroundR();
    Karel.fillRow();       //Fill fourth row
    Karel.turnAroundL();
    Karel.fillRow();       //Fill fifth row
    Karel.turnAroundR();
    Karel.fillRow();       //Fill sixth row
    Karel.turnAroundL();
    Karel.fillRow();       //Fill seventh row
    Karel.turnAroundR();
    Karel.fillRow();       //Fill eigth row
    Karel.turnAroundL();
    Karel.fillRow();       //Fill ninth row
    Karel.turnAroundR();
    Karel.fillRow();       //Fill tenth row
    Karel.turnRight();     //Go back to origin
    Karel.move9();
    Karel.turnRight();     //Face North
    Karel.move();
    Karel.clearRow();      //Start Clearing Rows
    Karel.turnAroundR();
    Karel.clearRow();
    Karel.turnAroundL();
    Karel.clearRow();       
    Karel.turnAroundR();
    Karel.clearRow();       
    Karel.turnAroundL();
    Karel.clearRow();       
    Karel.turnAroundR();
    Karel.clearRow();     
    Karel.turnAroundL();
    Karel.clearRow();       
    Karel.turnAroundR();
    Karel.clearRow();       
    Karel.turnAroundL();
    Karel.clearRow();      
    Karel.turnAroundR();
    Karel.clearRow();     
    Karel.turnRight();
    Karel.move9();
    
    Karel.turnRight();
   }
  } 
  /*

  */
  static 
  {
    kareltherobot.World.setSize(12, 12);
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