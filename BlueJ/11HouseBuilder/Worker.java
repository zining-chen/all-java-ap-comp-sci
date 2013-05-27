
import kareltherobot.*;
import java.awt.Color;

public abstract class Worker extends SuperRobot
{
  public Worker(int st, int av, Direction dir, int numBeepers, Color c)
  {
      super(st, av, dir, numBeepers, c);
  }

  public abstract void doIt();

}