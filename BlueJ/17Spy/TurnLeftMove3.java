import kareltherobot.*;


public class TurnLeftMove3 extends Robot implements Strategy
{

  private Strategy oldStrategy = null;
  public TurnLeftMove3(int st, int av, Direction dir, int numBeepers, Strategy originalStrategy)
  {
      super(st, av, dir, numBeepers);
      oldStrategy = originalStrategy;
  }

  
  public void doIt(Robot a) 
  {
     a.turnLeft();
     oldStrategy.doIt(a);
  } 

}