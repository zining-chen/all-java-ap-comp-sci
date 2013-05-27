import kareltherobot.*;
import java.awt.Color;
import java.util.Enumeration;

public class Spy extends Robot
{
  private Strategy myStrategy = null;
  
  public Spy(int st, int av, Direction dir, int numBeepers, 
                       Strategy initialStrategy)
  {
      super(st, av, dir, numBeepers);
      myStrategy = initialStrategy;
  }

  public void getNextClue()
  {
      Enumeration neighbors = this.neighbors();
      Accomplice accomplice = (Accomplice)neighbors.nextElement();
      myStrategy = accomplice.getStrategy();
  }
  
  public void followStrategy()
  {
      myStrategy.doIt(this);
    }
}