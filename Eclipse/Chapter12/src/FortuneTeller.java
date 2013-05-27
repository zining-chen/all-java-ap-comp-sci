// This is the Fortune Teller applet

import java.awt.*;
import java.awt.event.*;
import java.applet.AudioClip;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FortuneTeller extends JApplet
    implements ActionListener
{
  


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


// Declare an array of "fortunes" (strings):
  ArrayList<String> fortunes = new ArrayList<String>();
  

  private JTextField display;
  private AudioClip ding;

  public void init()
  {
    ding = getAudioClip(getDocumentBase(), "ding.wav");
    
    fortunes.add("Yess");
    fortunes.add("No");
    fortunes.add("Maybe So");
    fortunes.add("What do you think?");
    fortunes.add("Tomorrow will never come...");
    fortunes.add("Brightness is in your future");
    fortunes.add("Your dreams will come true :D");
    fortunes.add("Ask again later");
    fortunes.add("Your appendix must be removed");
    fortunes.add("It is what you want");
    fortunes.add("Look into yourself to find the answer");
    fortunes.add("Yes, Definitely");
    fortunes.add("Why should I answer you?");

    display = new JTextField("  Press \"Next\" to see your fortune...", 30);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }

  public void actionPerformed(ActionEvent e)
  {
    ding.play();
    
    String s = fortunes.get( (int) (Math.random() * fortunes.size()) );
    
    display.setText("  " + s );
  }
}

