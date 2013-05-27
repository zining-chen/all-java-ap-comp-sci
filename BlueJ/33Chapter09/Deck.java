import java.util.*;
public class Deck
{
    private ArrayList<Card> myDeck;

    public Deck()
    {}

    public void newDeck()
    {
        // build a new Deck of cards
        myDeck = new ArrayList<Card>( 52 );
        String[] suites = {"diamonds", "clubs", "hearts", "spades"};

        for (String s : suites)
            for ( int n = 2; n <= 14; n++ )
                myDeck.add( new Card(s,n) );
    }

    public void printDeck()
    {
        for ( Card c : myDeck )
        {
            System.out.println( c.name() );
        }
    }

    public void shuffle()
    {
        int index1;
        Random rn = new Random();
        for (int i = 0; i < 10000000; i++)
        {
            index1 = rn.nextInt(52);
            Card c = myDeck.remove(index1);
            myDeck.add(c);
        }
    }
    
    public Card dealCard()
    {
        if ( myDeck == null || myDeck.size()  == 0)
        {
            System.out.println("Sorry, no more cards!");
            return null;
        }
        else
        {
            Card c = myDeck.remove( 0 );
            return c;
        }
    }

    public ArrayList<Card> getDeck()
    {
        return myDeck;
    }
}