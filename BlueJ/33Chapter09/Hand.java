import java.util.*;
public class Hand
{
    private ArrayList<Card> myHand;
    public Hand()
    {
        myHand = new ArrayList<Card>( 5 );
    }

    public ArrayList<Card> getHand()
    {
        return myHand;
    }
    
    public void addCard ( Card c )
    {
        myHand.add(c);
    }
    
    public void printHand()
    {
        for ( Card c : myHand )
        {
            System.out.println( c.name() );
        }
    }
}