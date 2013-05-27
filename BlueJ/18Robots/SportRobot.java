import kareltherobot.*;

public class SportRobot extends Robot
{
  public SportRobot(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }
   
  public void play() 
  {
      System.out.println("Sport Robot is Playing!");
    }
}