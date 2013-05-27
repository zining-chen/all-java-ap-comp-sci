import javax.swing.*;

public class MainClass extends JFrame
{
    public static void main( String[] args )
    {
        Deck d = new Deck();
        d.newDeck();
        d.printDeck();
        d.shuffle();
        Card c = d.dealCard();
        System.out.println(" Selected Card = " + c.name() );

        Hand h = new Hand();
        for ( int i = 0 ; i < 5 ; i++ )
            h.addCard( d.dealCard() );
        h.printHand();
    

    MainClass window = new MainClass();
    window.setTitle("Card Demo 1");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(new CardTable(d));
    window.pack();
    window.setLocationRelativeTo(null);
    window.setVisible(true);
}
}
