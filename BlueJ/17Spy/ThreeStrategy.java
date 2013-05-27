import kareltherobot.*;

public class ThreeStrategy implements Strategy
{
    public void doIt(Robot aRobot)
    {
        aRobot.move();
        aRobot.move();
        aRobot.move();
    }
}
