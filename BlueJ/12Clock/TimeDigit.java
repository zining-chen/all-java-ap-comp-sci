import java.awt.Color;

public class TimeDigit extends Digit
{
    int oldDigit;
    int newDigit;
    LCD myLCD;

    public TimeDigit(int st, int av, Direction dir, int numBeepers, Color c, LCD z)
    {
        super(st, av, dir, numBeepers, c);
        myLCD = z;
    }

    public void run()
    {
        while (true)
            try
            {  doDigits(); }
            catch (InterruptedException e) 
            {}
    }

    public void doDigits() throws InterruptedException
    {
        oldDigit = myLCD.getNumber();
        drawDigit(oldDigit,true);
        while(true)
        {
            newDigit = myLCD.getNumber();
            if (newDigit != oldDigit)
            {
                drawDigit(oldDigit,false);
                drawDigit(newDigit,true);
                oldDigit = newDigit;
            }
            else
            {
                // Thread.sleep(100);
            }
        }
    }
}
