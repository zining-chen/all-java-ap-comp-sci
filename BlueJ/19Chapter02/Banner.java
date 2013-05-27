
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class Banner - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Banner extends JApplet implements ActionListener
{
    // instance variables - replace the example below with your own
    private int xPos, yPos;

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
        Timer clock = new Timer(30, this);
        clock.start();
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Hello class!", xPos, yPos);
        g.setFont( new Font("Comic Sans MS", Font.BOLD, 24));
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Container c = getContentPane();
        xPos--;
        if (xPos < -100) xPos = c.getWidth();
        
        yPos = c.getHeight() / 2;
        
        repaint();
    }

}