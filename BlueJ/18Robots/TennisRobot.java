import kareltherobot.*;
import java.awt.Color;

public class TennisRobot extends SportRobot
{
  public TennisRobot(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

  public void play()
  {
      System.out.println("Tennis Robot is playing!");
  }

  public void hitBackHand()
  {
      System.out.println("Tennis Robot hit a backhand!");
  }

  public void turnLeft()
  {
      System.out.println("Tennis Robot turned left!");
  }

}