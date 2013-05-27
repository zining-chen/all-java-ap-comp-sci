------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Clock
PURPOSE OF PROJECT:
VERSION or DATE: 1.0.1
HOW TO START THIS PROJECT: Run Main Method
AUTHORS: Andrew Brandt
USER INSTRUCTIONS:
------------------------------------------------------------------------
OOO
OOO
OOO
OOO
OOO
.

Must start and finish at the dot. 

------------------------------------------------------------------------
This Code is the Original Stuff
Put this inside of "Digits" Method

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

    
------------------------------------------------------------------------

Copy this code to run it.

 Digit a = new Digit(1,1,North,-1,Color.RED);

        for (int i = 0; i < 1; i++) // Change this to change the number of times everything is shown
        {
            a.zero(true);
            a.zero(false);

            a.one(true);
            a.one(false);

            a.two(true);
            a.two(false);

            a.three(true);
            a.three(false);

            a.four(true);
            a.four(false);

            a.five(true);
            a.five(false);

            a.six(true);
            a.six(false);

            a.seven(true);
            a.seven(false);

            a.eight(true);
            a.eight(false);

            a.nine(true);
            a.nine(false);

            a.A(true);
            a.A(false);

            a.P(true);
            a.P(false);

            a.M(true);
            a.M(false);

            a.colon(true);
            a.colon(false);
        }
        a.turnOff();
    