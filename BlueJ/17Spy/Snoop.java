
import kareltherobot.*;
import java.awt.Color;

public class Snoop extends Robot
{
  public Snoop(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

    
  static public void main (String[] args) 
  {
      Accomplice q = new Accomplice(4,5,North,-1, new Diagonal3());
      Accomplice m = new Accomplice(7,8,North,-1, new TurnLeftMove3( 7,8,North,-1,new ThreeStrategy()));
      
      Spy bond = new Spy(1,5,North,-1, new ThreeStrategy());
      bond.followStrategy();  //Move North 3 Spaces
      bond.getNextClue();     //Talk to q and get q's next steps
      bond.followStrategy();  //Follow q's strategy
      bond.getNextClue();     
      bond.followStrategy();
  } 

  static 
  {
    kareltherobot.World.setSize(12, 12);
    kareltherobot.World.setDelay(10);
    kareltherobot.World.setBeeperColor(Color.magenta);
    kareltherobot.World.setStreetColor(Color.blue);
    kareltherobot.World.setNeutroniumColor(Color.green.darker());
    kareltherobot.World.setVisible(true);
   }
}