import kareltherobot.*;
import java.awt.Color;

public class SoccerRobot extends SportRobot
{
  public SoccerRobot(int st, int av, Direction dir, int numBeepers)
  {
      super(st, av, dir, numBeepers);
  }

  public void play()
  {
      System.out.println("Soccer Robot is playing!");
  }

  public void kickGoal()
  {
      System.out.println("Soccer Robot is kicking the ball!");
  }

  public void move()
  {
      System.out.println("Soccer Robot is moving!");
  }

}