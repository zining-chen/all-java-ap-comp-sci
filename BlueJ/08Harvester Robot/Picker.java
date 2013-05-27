
import kareltherobot.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author : Andrew Brandt
 * teacher : Mr. Klammer
 * due date: 8/29/2012
 */

public class Picker extends Robot
{
    public Picker(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void moves(int q)
    {
        for (int j = 0 ; j < q ; j++)
        {
            move();
        }
    }

    public void letterl() 
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        turnLeft();
    }
    
    public void lettera()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
        putBeeper();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void letteru()
    {
        move();
        move();
        turnAround();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        turnRight();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void letterr() 
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        turnRight();
        putBeeper();
        move();
        turnRight();
        putBeeper();        
        move();
        putBeeper();
        turnAround();
        move();
        turnRight();
        move();
        putBeeper();
        turnLeft();
        move();
        move();
        turnLeft(); 
    }
    
    public void lettere () 
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        turnRight();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
       
    public void lettern() 
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
    
    static public void main (String[] args) 
    {
        Picker picker = new Picker(1,1,North,-1);

        
        picker.letterl();
        picker.lettera();
        picker.letteru();
        
        
        picker.letterr();
        picker.lettere();
        picker.lettern();
        /*picker.space();
        picker.letterp();
        picker.letterr();
        picker.lettero();
        picker.letterm();
        picker.questionm();
        */
        
    }

    static
    { // The World
        kareltherobot.World.setSize(30, 50);
        kareltherobot.World.setDelay(5);
        kareltherobot.World.setBeeperColor(Color.blue.darker());
        kareltherobot.World.setStreetColor(Color.blue);
        kareltherobot.World.setNeutroniumColor(Color.green.darker());
        kareltherobot.World.setVisible(true);
    }

}