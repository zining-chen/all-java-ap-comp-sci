import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanelBall extends JPanel implements Runnable {

    private int ballX=10, ballY=110;        //initial position of the ball
    private int player1X=10, player1Y=100;  //initial position of player 1's paddle
    private int player2X=230, player2Y=100; //initial position of player 2's paddle
    Thread game;
    int delay = 40;
    int stepSize = 5; // how many pixels to change for each movement
    int winningScore = 10;
    int width, height; // Width and height of the ball
    // Scores
    int player1Score=0, player2Score=0;
    boolean player1UpFlag,player1DownFlag, player2UpFlag, player2DownFlag;
    boolean play, gameOver;

    public PanelBall(){
        play=true;
        game=new Thread(this);
        game.start();
    }

    // Draw ball and ships
    public void paintComponent(Graphics g){
        setOpaque(false);
        super.paintComponent(g);

        // Draw ball
        g.setColor(new Color (224, 27, 208) );
        g.fillOval(ballX, ballY, 8,8);

        // Draw paddles
        g.setColor(new Color (122, width - 26, 27) );
        g.fillRect(player1X, player1Y, 10, 25);
        g.setColor(new Color (27, 135, 224) );
        g.fillRect(player2X, player2Y, 10, 25);

        //Draw scores
        g.setColor( new Color (0, 0, 0) );
        g.drawString("Player1: " + player1Score, 25, 10);
        g.drawString("Player2: " + player2Score, 150, 10);

        if(gameOver)
            g.drawString("Game Over", 100, 125);
    }

    // Positions on X and Y for the ball
    public void positionBall (int nx, int ny)
    {
        ballX= nx; 
        ballY= ny; 
        this.width=this.getWidth();
        this.height=this.getHeight();
        repaint();
    }

    // Here we receive the key pressed from the Main class.
    // This class should receive a key from the Main class and set
    // player1UpFlag, player1DownFlag, player2UpFlag, or 
    // player2DownFlag to TRUE if the appropriate key is pressed.
    // event.getKeyCode() returns an ENUM data type of the form:
    // KeyEvent.VK_A = 'A', KeyEvent.VK_B = 'B', KeyEvent.VK_C = 'C',
    // KeyEvent.VK_UP = Up Arrow Key, KeyEvent.VK_DOWN = Down Arrow Key
    // You will need to complete the SWITCH statement.
    public void keyPressed(KeyEvent event)
    {
        switch(event.getKeyCode())
        {
            case KeyEvent.VK_W: 
            player1UpFlag = true;
            break;

            case KeyEvent.VK_S:
            player1DownFlag = true;
            break;

            case KeyEvent.VK_UP:
            player2UpFlag = true;
            break;

            case KeyEvent.VK_DOWN:
            player2DownFlag = true;
            break;
        }
    }

    // Here we receive the key released from the Main class
    // This class should receive a key from the Main class and set
    // player1UpFlag, player1DownFlag, player2UpFlag, or 
    // player2DownFlag to FALSE if the appropriate key is released.
    // event.getKeyCode() returns an ENUM data type of the form:
    // KeyEvent.VK_A = 'A', KeyEvent.VK_B = 'B', KeyEvent.VK_C = 'C',
    // KeyEvent.VK_UP = Up Arrow Key, KeyEvent.VK_DOWN = Down Arrow Key
    // You will need to complete the SWITCH statement.
    public void keyReleased(KeyEvent event)
    {
        switch(event.getKeyCode())
        {
            case KeyEvent.VK_W: 
            player1UpFlag = false;
            break;

            case KeyEvent.VK_S:
            player1DownFlag = false;
            break;

            case KeyEvent.VK_UP:
            player2UpFlag = false;
            break;

            case KeyEvent.VK_DOWN:
            player2DownFlag = false;
            break;
        }
    }

    // Move player 1
    // Uses the flags player1UpFlag and player1DownFlag to change the 
    // coordinates of Player 1's paddle (player1X, player1Y) by the 
    // stepSize specified.  It must also check to ensure that the user
    // cannot move their paddle off the top or bottom of the screen.
    // The method must call repaint() when it has changed the user's 
    // position.
    public void movePlayer1()
    {
        if (player1UpFlag && player1Y > 0)
        {
            player1Y -= stepSize;
        }
        if (player1DownFlag && player1Y < height - 25)
        {
            player1Y += stepSize;
        }
    }

    // Move player 2
    // Uses the flags player2UpFlag and player2DownFlag to change the 
    // coordinates of Player 2's paddle (player2X, player2Y) by the 
    // stepSize specified.  It must also check to ensure that the user
    // cannot move their paddle off the top or bottom of the screen.
    // The method must call repaint() when it has changed the user's 
    // position.
    public void movePlayer2()
    {
        //       if (player2UpFlag && player2Y > 0)
        //       {
        //           player2Y -= stepSize;
        //       }
        //       if (player2DownFlag && player2Y < height - 25)
        //       {
        //           player2Y += stepSize;
        //       }
        if (player2Y < ballY)
        {
            player2Y += stepSize ;
        }
        if (player2Y > ballY)
        {
            player2Y -= stepSize ;
        }

    }

    public void run() {
        boolean movingRight=false;
        boolean movingUp=false;

        while(true)
        {
            if(play)
            {
                // The ball move from left to right
                if (movingRight) 
                {
                    ballX += stepSize;
                    if (ballX >= (width - 8)) movingRight = false;
                }
                else
                {
                    ballX += -stepSize;
                    if ( ballX <= 0) movingRight = true;
                }

                // The ball moves from up to down
                if (movingUp) 
                {
                    ballY += stepSize;
                    if (ballY >= (height - 8)) movingUp= false;     
                }
                else
                {
                    ballY += -stepSize;
                    if ( ballY <= 0) movingUp =  true;
                }
                positionBall(ballX, ballY);

                // Delay
                try 
                {
                    Thread.sleep(delay);
                }
                catch(InterruptedException ex)
                {
                }

                // Move player 1
                movePlayer1();

                // Move player 2
                movePlayer2();

                // The score of the player 1 increase
                if (ballX >= (this.getWidth() - 8)) player1Score++;

                // The score of the player 2 increase
                if ( ballX == 0) player2Score++;

                // Game over. 
                // When the score reaches the value, the game will end
                if(player1Score==winningScore || player2Score==winningScore){
                    play=false;
                    gameOver=true;
                }

                // The ball stroke with the player 1
                if(ballX<=player1X+10 && ballY>=player1Y && ballY<=(player1Y+25))
                    movingRight=true;

                // The ball stroke with the player 2
                if(ballX>=(player2X-5) && ballY>=player2Y && ballY<=(player2Y+25))
                    movingRight=false;
            }
        }
    }

}