import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rps extends JFrame
implements ActionListener
{
    private final char moves[] = {'R', 'P', 'S', 'L', 'K'};
    private JRadioButton rock, paper, scissors, lizard, spock;
    private JTextField display, displayText, overUnder;
    private int wins, losses, ties, overall;
    private Image image;
    

    public Rps()
    {
        super("Rock, Paper, Scissors");

        rock = new JRadioButton("   Rock   ", true);
        paper = new JRadioButton("   Paper  ");
        scissors = new JRadioButton(" Scissors ");
        lizard = new JRadioButton(" Lizard ");
        spock = new JRadioButton("   Spock  ");

        ButtonGroup rpsButtons = new ButtonGroup();
        rpsButtons.add(rock);
        rpsButtons.add(paper);
        rpsButtons.add(scissors);
        rpsButtons.add(lizard);
        rpsButtons.add(spock);

        JButton go = new JButton("         Go         ");
        go.addActionListener(this);

        display = new JTextField(25);
        display.setEditable(false);
        display.setBackground(Color.yellow);
        
        displayText = new JTextField(25);
        displayText.setEditable(false);
        displayText.setBackground(Color.CYAN);
        
        overUnder = new JTextField(25);
        overUnder.setEditable(false);
        overUnder.setBackground(Color.pink);
        
        image = (new ImageIcon( "rpslk.gif" )).getImage();

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(rock);
        c.add(paper);
        c.add(scissors);
        c.add(lizard);
        c.add(spock);
        c.add(go);
        c.add(display);
        c.add(displayText);
        c.add(overUnder);
        // c.image();
    }

    /**
     *  returns -1 if the player wins,
     *  0 if it's a tie, and 1 if the computer wins
     */
    private int nextPlay(char computerMove, char playerMove)
    {
        int result;

        result = 0;
        switch (computerMove)
        {
            case 'R':
            {
                switch (playerMove)
                {
                    case 'R': result = 0; break;
                    case 'P': result = -1; break;
                    case 'S': result = 1; break;
                    case 'L': result = 1; break;
                    case 'K': result = -1; break;
                }
            }
            break;
            case 'P':
            {
                switch (playerMove)
                {
                    case 'R': result = 1; break;
                    case 'P': result = 0; break;
                    case 'S': result = -1; break; 
                    case 'L': result = -1; break;
                    case 'K': result = 1; break;
                }
            }
            break;
            case 'S':
            {
                switch (playerMove)
                {
                    case 'R': result = -1; break;
                    case 'P': result = 1; break;
                    case 'S': result = 0; break;
                    case 'L': result = 1; break;
                    case 'K': result = -1; break;
                }
            }
            break;
            case 'L':
            {
                switch (playerMove)
                {
                    case 'R': result = -1; break;
                    case 'P': result = 1; break;
                    case 'S': result = -1; break;
                    case 'L': result = 0; break;
                    case 'K': result = 1; break;
                }
            }
            break;
            case 'K':
            {
                switch (playerMove)
                {
                    case 'R': result = 1; break;
                    case 'P': result = -1; break;
                    case 'S': result = 1; break;
                    case 'L': result = -1; break;
                    case 'K': result = 0; break;
                }
            }  
            break;
        }
        return result;
    }

    public void actionPerformed(ActionEvent e)
    {
        char playerMove, computerMove;
        if (rock.isSelected())
            playerMove = 'R';
        else if (paper.isSelected())
            playerMove = 'P';
        else if (scissors.isSelected())
            playerMove = 'S';
        else if (spock.isSelected())
            playerMove = 'K';
        else
            playerMove = 'L';

        int k = (int)(Math.random() * 5);
        computerMove = moves[k];
        int result = nextPlay(computerMove, playerMove);

        String msg = "  You said " + makeWord(playerMove) + ", I said " + makeWord(computerMove);
        if (result < 0)
            msg += " -- you win.";
        else if (result == 0)
            msg += " -- tie.";
        else if (result > 0)
            msg += " -- I win.";
        else 
            msg += " ERROR ";
        
        if (result == -1)
            wins++;
        else if (result == 1)
            losses++;
        else
            ties = ties + 1;
            
        if (result == -1)
            overall++;
        else if (result == 1)
            overall--;
        else
            overall = overall;
        
        display.setText(msg); 
        displayText.setText( " Wins: " + wins + "  Losses: " + losses + "  Ties: " + ties);
        
        if (overall >= 1)
        overUnder.setText( " Your win-loss over under is" + " + " + overall );
        else
        overUnder.setText( " Your win-loss over under is " + overall);
    }

    private String makeWord(char move)
    {
        String word = "";

        switch (move)
        {
            case 'R': word = "ROCK"; break;
            case 'P': word = "PAPER"; break;
            case 'S': word = "SCISSORS"; break;
            case 'L': word = "LIZARD"; break;
            case 'K': word = "SPOCK"; break;
        }
        return word;
    }

    public static void main(String[] args)
    {
        Rps window = new Rps();
        window.setBounds(300, 300, 500, 400);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

