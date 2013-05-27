import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;

public class Ball extends JPanel
implements ActionListener
{
    private int x = 5;
    private int y = 50;
    private int r = 20;
    private int t = 0;
    private int xStepSize = 2;
    private int yStepSize = 5;
    private static JFrame w;
    

    public Ball()
    {
        Timer clock = new Timer(30, this);
        clock.start();
    }

    public void paintComponent(Graphics g)
    {
        Container c = w.getContentPane();
        
        if ( ( y > c.getHeight()-100 ) )
          yStepSize = (yStepSize - (int)(t/10) );
        
        yStepSize = yStepSize + (int)(t/20);
          
        x = x + xStepSize;
        y = y + yStepSize;

        setBackground(Color.WHITE);
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(x - r, y - r, 2*r, 2*r);
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
        t++;
    }

    
    public static void main(String[] args)
    {
        w = new JFrame("Bouncing Ball");
        w.setSize(800, 500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Ball());
        w.setResizable(false);
        w.setVisible(true);
    }
}