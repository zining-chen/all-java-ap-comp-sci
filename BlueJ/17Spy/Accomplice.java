import kareltherobot.*;
import java.awt.Color;

public class Accomplice extends Robot
{
  private Strategy myStrategy = null;
  
  public Accomplice(int st, int av, Direction dir, int numBeepers,
                    Strategy s)
  {
      super(st, av, dir, numBeepers);
      myStrategy = s;
  }

    
  public Strategy getStrategy() 
  {
      return myStrategy;
  } 

}