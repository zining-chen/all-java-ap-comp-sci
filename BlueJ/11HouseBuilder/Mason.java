
import kareltherobot.*;
import java.awt.Color;


public class Mason extends Worker implements Runable, Directions
{
  public Mason(int st, int av, Direction dir, int numBeepers, Color c)
  {
      super(st, av, dir, numBeepers, c);
  }

  private void makeWalls()
  {
      for (int i = 0; i < 5; i++)
      {
          putBeeper();
          move();
        }
       
      turnRight();
      moves(8);
      turnRight();
      move();
      for (int i = 0; i < 4; i++)
      {
          putBeeper();
          move();
        }
      putBeeper();
      turnRight();
      moves(4);
      turnRight();
        
    }
    
  public void doIt()
  {
      makeWalls();
  }
  
  public void run()
  {
      doIt();
    }
    
    
}