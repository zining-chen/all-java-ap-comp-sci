import kareltherobot.*;
import java.awt.Color;

public class Digit extends SuperRobot
{
    public Digit(int st, int av, Direction dir, int numBeepers, Color c)
    {
        super(st, av, dir, numBeepers, c);
    }

    public void drawDigit(int d, boolean draw)
    {
        switch(d)
        {
            case 1: one(draw); break;
            case 2: two(draw); break;
            case 3: three(draw); break;
            case 4: four(draw); break;
            case 5: five(draw); break;
            case 6: six(draw); break;
            case 7: seven(draw); break;
            case 8: eight(draw); break;
            case 9: nine(draw); break;
            case 0: zero(draw); break;
            default: break;
        }
    }

   public void zero (boolean draw)
    {
        for (int j = 0; j < 5; j++)
        {
            move();
            dropOrPick(draw);
        }
        turnRight();
        for (int k = 0; k < 2; k++)
        {
            move();
            dropOrPick(draw);
        }
        turnRight();
        for (int l = 0; l < 4; l++)
        {
            move();
            dropOrPick(draw);
        }
        turnRight();
        move();
        dropOrPick(draw);
        move(); 
        turnLeft();
        move();
        turnAround();
    }

    public void one(boolean draw)
    {
        move();
        turnRight();
        move();
        turnLeft();
        dropOrPick(draw);
        for (int i = 0; i < 4; i++)
        {
            move();
            dropOrPick(draw);
        }
        turnAround();
        moves(4);
        turnRight();
        move();
        turnLeft();
        move();
        turnAround();
    }

    public void two(boolean draw)
    {
        turnRight();
        moves(2);
        turnLeft();
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        dropOrPick(draw);
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            move();
            dropOrPick(draw);
        }
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        moves(5);
        turnAround();
    }

    public void three(boolean draw)
    {
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        moves(2);
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        moves(4);
        turnRight();
        moves(2);
        turnRight();
    }

    public void four(boolean draw)
    {
        turnRight();
        moves(2);
        turnLeft();
        move();
        for (int i = 0; i < 4; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        moves(2);
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        turnRight();
        moves(3);
        turnRight();
        move();
        turnRight();
    }

    public void five(boolean draw)
    {
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        moves(5);
        turnRight();
        moves(2);
        turnRight();
    }

    public void six(boolean draw)
    {
        moves(2);
        turnAround();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        moves(5);
        turnRight();
        moves(2);
        turnRight();
    }

    public void seven(boolean draw)
    {
        move();
        turnRight();
        moves(2);
        turnLeft();
        for (int i = 0; i < 4; i++)
        {
            dropOrPick(draw);
            move();
        }
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        moves(5);
        turnAround();
    }

    public void eight(boolean draw)
    {
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnRight();
        moves(2);
        turnLeft();
        move();
        dropOrPick(draw);
        moves(2);
        turnAround();
    }

    public void nine(boolean draw)
    {
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        for (int i = 0; i < 3; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        for (int i = 0; i < 1; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        turnRight();
        moves(3);
        turnRight();
        moves(2);
        turnRight();
    }

    public void A(boolean draw)
    {
        move();
        for (int i = 0; i < 3; i++)
        {
            dropOrPick(draw);
            move();
        }
        for (int k = 0; k < 1; k++)
        {
            dropOrPick(draw);
            move();
            turnRight();
            move();
            turnLeft();
        }
        dropOrPick(draw);
        turnAround();
        for (int l = 0; l < 1; l++)
        {
            move();
            turnLeft();
            move();
            turnRight();
            dropOrPick(draw);
        }
        move();
        for (int i = 0; i < 3; i++)
        {
            dropOrPick(draw);
            move();
        }
        turnAround();
        moves(2);
        turnLeft();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        moves(2);
        turnAround();
    }

    public void P(boolean draw)
    {
        move();
        for (int i = 0; i < 4; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnRight();
        for (int i = 0; i < 2; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        dropOrPick(draw);
        move();
        turnLeft();
        moves(3);
        turnAround();
    }

    public void M(boolean draw)
    {
        move();
        for (int i = 0; i < 4; i++)
        {
            dropOrPick(draw);
            move();
        }
        dropOrPick(draw);
        turnRight();
        move();
        turnRight();
        move();
        dropOrPick(draw);
        turnLeft();
        move();
        turnLeft();
        move();
        turnAround();
        for (int i = 0; i < 5; i++)
        {
            dropOrPick(draw);
            move();
        }
        turnRight();
        moves(2);
        turnRight();
    }

    public void colon(boolean draw)
    {
        turnRight();
        move();
        turnLeft();
        moves(2);
        dropOrPick(draw);
        moves(2);
        dropOrPick(draw);
        turnAround();
        moves(4);
        turnRight();
        move();
        turnRight();

    }
}