import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame implements ActionListener
{
    private EasySound rooster;
    private int time;
 

    /**
     *   Constructor
     */
    private Morning()
    {
        super("Morning");
        rooster = new EasySound("roost.wav");
        // rooster.play();

        Container c = getContentPane();
        c.setBackground(Color.WHITE);

        time = 0;
        Timer clock = new Timer(10, this); 
        clock.start();
    }

    public void paint(Graphics g)
    {
        int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
        int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
        int r = 20;

        Color sky;
        if (y > 130) 
        {
            sky = Color.BLACK;
        }
        else 
        {
            sky = Color.CYAN;
        }
        
        setBackground(sky);

        if (y == 130 && x < 100) 
        {
        rooster.play();
        }
        super.paint(g);

        g.setColor(Color.ORANGE);
        g.fillOval(x - r, y - r, 2*r, 2*r); 
    }

    public void actionPerformed(ActionEvent e)
    {
        time++;
        repaint();
    }

    public static void main(String[] args)
    {
        Morning morning = new Morning();
        morning.setSize(300, 150);
        morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
        morning.setVisible(true);
    }
}  
