import kareltherobot.*;

public class Diagonal3 extends Snoop implements Strategy
{
    public void doIt(Robot aRobot)
    {
        for (int i = 0; i < 3; i++)
        {
            aRobot.move();
            for (int j = 0; j < 3; j++)
            {
                aRobot.turnLeft();
            }
            aRobot.move();
            aRobot.turnLeft();

        }
    }
}
