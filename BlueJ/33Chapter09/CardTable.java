import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// CardTable
// based on Copyleft 2007 Fred Swartz MIT License

public class CardTable extends JComponent implements MouseListener,
        MouseMotionListener {
    
    //================================================================ constants
    private static final Color BACKGROUND_COLOR = Color.GREEN;
    private static final int   TABLE_SIZE       = 400;    // Pixels.
    
    //=================================================================== fields
    //... Initial image coords.
    private int initX     = 0;   // x coord - set from drag
    private int initY     = 0;   // y coord - set from drag
    
    //... Position in image of mouse press to make dragging look better.
    private int dragFromX = 0;  // Displacement inside image of mouse press.
    private int dragFromY = 0;
    
    private Deck myDeck;        // Should really be in a model, but ...
    private Card   currentCard = null;  // Current selected card.
    
    //============================================================== constructor
    public CardTable(Deck deck) {
        myDeck = deck;                // Should be passed a model.
        
        //... Initialize graphics
        setPreferredSize(new Dimension(TABLE_SIZE, TABLE_SIZE));
        setBackground(Color.blue);
        
        //... Add mouse listeners.
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    //=========================================================== paintComponent
    @Override
    public void paintComponent(Graphics g) {
        //... Paint background
        int width = getWidth();
        int height = getHeight();
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, width, height);
        
        //... Display the cards, starting with the first array element.
        //    The array order defines the z-axis depth.
        for (Card c : myDeck.getDeck() ) {
            c.draw(g, this);
        }
    }
    
    //====================================================== method mousePressed
    // Check to see if press is within any card.
    // If it is,
    // * Set currentCard so mouseDragged knows what to drag.
    // * Record where in the image (relative to the upper left coordinates)
    //   the mouse was clicked, because it looks best if we drag from there.
    // TODO: Move the card to the last position so that it displays on top.
    public void mousePressed(MouseEvent e) {
        int x = e.getX();   // Save the x coord of the click
        int y = e.getY();   // Save the y coord of the click
        
        //... Find card image this is in.  Check from top down.
        currentCard = null;  // Assume not in any image.
        for (int crd=myDeck.getDeck().size()-1; crd>=0; crd--) {
            Card testCard = myDeck.getDeck().get(crd);
            if (testCard.contains(x, y)) {
                //... Found, remember this card for dragging.
                dragFromX = x - testCard.getX();  // how far from left
                dragFromY = y - testCard.getY();  // how far from top
                currentCard = testCard;  // Remember what we're dragging.
                Card c = myDeck.getDeck().remove( crd );
                myDeck.getDeck().add( c );
                break;        // Stop when we find the first match.
            }
        }
    }
    
    //============================================================= mouseDragged
    // Set x,y to mouse position and repaint.
    public void mouseDragged(MouseEvent e) {
        if (currentCard != null) {   // Non-null if pressed inside card image.
            
            int newX = e.getX() - dragFromX;
            int newY = e.getY() - dragFromY;
            
            //--- Don't move the image off the screen sides
            newX = Math.max(newX, 0);
            newX = Math.min(newX, getWidth() - currentCard.getWidth());
            
            //--- Don't move the image off top or bottom
            newY = Math.max(newY, 0);
            newY = Math.min(newY, getHeight() - currentCard.getHeight());
            
            currentCard.moveTo(newX, newY);
            
            this.repaint(); // Repaint because position changed.
        }
    }
    
    //======================================================= method mouseExited
    // Turn off dragging if mouse exits panel.
    public void mouseExited(MouseEvent e) {
        currentCard = null;
    }
    
    //=============================================== Ignore other mouse events.
    public void mouseMoved  (MouseEvent e)  {}  // ignore these events
    public void mouseEntered(MouseEvent e)  {}  // ignore these events
    public void mouseClicked(MouseEvent e)  {}  // ignore these events
    public void mouseReleased(MouseEvent e) {}  // ignore these events
}