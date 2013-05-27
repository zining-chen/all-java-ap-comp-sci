
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class Banner - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Bouncy extends JApplet implements ActionListener
{
    // instance variables - replace the example below with your own
    private int xPos, yPos;
    private int xInc = -2, yInc = -2;

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        xPos = c.getWidth();
        yPos = c.getHeight() / 2;
        Timer clock = new Timer(10, this);
        clock.start();
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(new Color(xPos % 255, yPos % 255, (xPos*yPos) % 255));
        g.fillOval(xPos, yPos, 15, 15);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Container c = getContentPane();
        
        xPos = xPos + xInc;
        yPos = yPos + yInc;
        
        if ((xPos <- 10) || (xPos > c.getWidth())) xInc = -xInc;
        if ((yPos <- 10) || (yPos > c.getWidth())) yInc = -yInc;
        
        repaint();
    }

}