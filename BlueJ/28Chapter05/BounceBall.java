import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;

public class BounceBall extends JPanel
implements ActionListener
{
    private int x = 50;
    private int y = 50;
    private int r = 20;
    private int xStepSize = 5;
    private int yStepSize = 5;
    private static JFrame w;
    //Image casey, other;

    public BounceBall()
    {
        Timer clock = new Timer(30, this);
        clock.start();
        
    }

    public void paintComponent(Graphics g)
    {
        Container c = w.getContentPane();
        
        if ( ( y > c.getHeight()-r ) || ( y < r ) )
          yStepSize = -yStepSize;

        if ( ( x > c.getWidth()-r ) || ( x < r ) )
          xStepSize = -xStepSize;
 
          
        x = x + xStepSize;
        y = y + yStepSize;

        setBackground(Color.WHITE);
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(x - r, y - r, 2*r, 2*r);
        //AffineTransform coordTransform = new AffineTransform();
        //coordTransform.translate(x, y);
        //((Graphics2D)g).drawImage(other,coordTransform,null);
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }

    
    public static void main(String[] args)
    {
        w = new JFrame("Bouncing Ball");
        w.setSize(300, 150);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Ball());
        w.setResizable(true);
        w.setVisible(true);
    }
}