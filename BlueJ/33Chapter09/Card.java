import java.awt.*;
import javax.swing.*;

public class Card
{
    private String mySuit;
    private int myValue;
    private int x,y;
    private ImageIcon img;
    
    public Card( String suit, int value )
    {
        mySuit = suit;
        myValue = value;
        loadImage();
    }

    public String name()
    {
        String[] cardNames =
            {
                "Deuce", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King", "Ace"
            };
        return cardNames[ myValue - 2 ] + " of " + mySuit;
    }
    
    
    private void loadImage()
    {
        String faces = "  23456789tjqka";
        
        String imagePath = "cards/" + faces.charAt(myValue) +
                        mySuit.charAt(0) + ".gif";
                
        img = new ImageIcon(imagePath);
    }
    
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean contains(int x, int y) {
        return (x > this.x && x < (this.x + getWidth()) && 
                y > this.y && y < (this.y + getHeight()));
    }
    
    public int getWidth() {
        return img.getIconWidth();
    }
    
    public int getHeight() {
        return img.getIconHeight();
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void draw(Graphics g, Component c) {
        img.paintIcon(c, g, this.x, this.y);
    }
}