import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel
{
  private Image leftShoe;
  private Image rightShoe;
  
  // Constructor
  public WalkerTest()
  {
    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("rightshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 300;
    int y = 100;
    int stepLength = 160;

    SlowPoke alex = new SlowPoke(x, y, leftShoe, rightShoe);

    for (int count = 1; count <= 4; count++)
    {
      alex.draw(g);
      alex.firstStep();
      alex.nextStep();
      alex.stop();
    }

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Walker Test");
    window.setBounds(100, 100, 900, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    WalkerTest panel = new WalkerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}