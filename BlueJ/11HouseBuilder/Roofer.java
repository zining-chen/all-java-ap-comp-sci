
import kareltherobot.*;
import java.awt.Color;

/**
 * @author :
 * teacher :
 * due date:
 */

public class Roofer extends Worker implements Runable, Directions
{
  public Roofer(int st, int av, Direction dir, int numBeepers, Color c)
  {
      super(st, av, dir, numBeepers, c);
  }

  private void makeRoofL()
  {
      for (int i = 0; i < 5; i++)
      {
          putBeeper();
          move();
          turnRight();
          move();
          turnLeft();
        }
        putBeeper();
    }
    private void makeRoofR()
    {
        for (int i = 0; i < 4; i++)
      {
          putBeeper();
          move();
          turnLeft();
          move();
          turnRight();
        }
        putBeeper();
    }
  public void doIt()
  {
      makeRoofL();
      turnRight();
      move();
      turnRight();
      move();
      makeRoofR();
      moves(4);
      turnRight();
      moves(5);
      turnRight();
    }

    public void run()
    {
      doIt();
    }
}