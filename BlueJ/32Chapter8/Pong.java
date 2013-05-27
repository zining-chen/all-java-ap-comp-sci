import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pong extends JFrame {
	private JPanel jContentPane = null;
	private PanelBall panel = null; // This is the panel of the game class
	
	private PanelBall getPanel() {
		if (panel == null) {
			panel = new PanelBall(); // The panel is created
		}
		return panel;
	}

	public Pong() {
		super();
		
		initialize();
        // Listeners for the keyboard
        this.addKeyListener(new KeyAdapter() {
        	//Method for the key pressed
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
            // Method for the key released
            public void keyReleased(KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
		
	}
	
    //	Here i'm stating the method that will send the key pressed to the game class
	private void formKeyPressed(KeyEvent e)
    {
        panel.keyPressed(e);
    }
    
    //	Here i'm stating the method that will send the key released to the game class
    private void formKeyReleased(KeyEvent e)
    {
        panel.keyReleased(e);
    }


	private void initialize() {
		this.setResizable(false);
		this.setBounds(new Rectangle(312, 184, 250, 250)); // Position on the desktop
		this.setMinimumSize(new Dimension(250, 250));
		this.setMaximumSize(new Dimension(250, 250));
		this.setContentPane(getJContentPane());
		this.setTitle("Pong");
	}


	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getPanel(), BorderLayout.CENTER);
		}
		return jContentPane;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Pong thisClass = new Pong();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}
}