import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Directory extends JFrame implements ActionListener
{
    private JTextField enter;
    private JTextArea display;


    public Directory()
    {
        super("Directory Lister");
        enter = new JTextField("Enter directory name here: ");
        enter.addActionListener(this);
        display = new JTextArea();
        Container c = getContentPane();
        ScrollPane p = new ScrollPane();
        p.add(display);
        c.add(enter, BorderLayout.NORTH);
        c.add(p, BorderLayout.CENTER);        
    }

    public void actionPerformed(ActionEvent e)
    {
        showFiles( e.getActionCommand() );
    }

    /**
     * This method take a file or directory name in the form of a {@link String} and lists all files and subdirectories by calling itself recursively.
     * @param s A string which contains the filename or directory
     * @see File
     */
    public void showFiles(String s)
    {
       
       File name = new File( s );
       
       if ( name.exists() )
       {
         if ( name.isFile() )  display.append( name.getName() + "\n");
       
         if ( name.isDirectory() )   //name.list() returns a String[] of all files in that directory
         {
             String[] files = name.list();
             
             for (String f : files)
             {
                 showFiles( s + "/" + f );
             }
         }
         
       }
    }
    
    public static void main(String[] args)
    {
        Directory app = new Directory();
        
        app.setSize(300, 150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}