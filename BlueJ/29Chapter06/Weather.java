import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weather extends JFrame implements ActionListener
{
    private URL u;                                 //make a new int to store the URL

    private double temperatureC = 0.0;             //make a new double         
    private double temperatureF = 0.0;             //make a new double
    private double pressureMB = 0.0;               //make a new double
    private double pressureIN = 0.0;               //make a new double
    private double windSpeedM = 0.0;               //make a new double
    private double windSpeedK = 0.0;               //make a new double
    private double humidity = 0.0;                 //make a new double
    private double dewPtC = 0.0;                   //make a new double
    private double dewPtF = 0.0;                   //make a new double
    private double chl = 0.0;                      //make a new double
    private double pollution = 0.0;                //make a new double
    private double KTM = 1.6;                      //make a new double
    String windDir = "";                           //make a new String

    private JButton temp;                          //make a new JButton
    private JButton press;                         //make a new JButton
    private JButton wind;                          //make a new JButton
    private JButton humid;                         //make a new JButton
    private JButton dew;                           //make a new JButton
    private JButton chill;                         //make a new JButton
    private JButton all;                           //make a new JButton
    private JButton api;                           //make a new JButton

    private JTextField middle;                     //make a new JTextField

    public Weather()
    {
        super("Andrew's Weather Browser");         //title of the GUI   
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        JPanel mainPanel = new JPanel ();
        
        Timer t = new Timer(60000, this);
        t.start();
        
        
        mainPanel.setLayout(new GridLayout(2,1));  //make a grid of 2 rows & 1 coulmn

        JPanel top    = new JPanel ();             //create JPanel to hold buttons
        top.setLayout ( new GridLayout ( 1, 7 ) ); //make a grid of 1 row & 3 columns
        mainPanel.add ( top );                     //add it to the mainPanel

        all = new JButton ( "All" );               //make new JButton
        temp = new JButton ( "Temp" );             //make new JButton
        press = new JButton ( "Pressure" );        //make new JButton
        wind = new JButton ( "Wind Speed" );       //make new JButton
        humid = new JButton ( "Humidity" );        //make new JButton
        dew = new JButton ( "Dewpoint" );          //make new JButton
        chill = new JButton ( "Wind Chill" );      //make new JButton
        api = new JButton ( "Pollution" );         //make new JButton
        
        /*
        int height = getHeight();
        if (height > 100)
            setHeight = 10;
        */    

        top.add ( all );                           //add button to grid
        top.add ( temp );                          //add button to grid
        top.add ( press );                         //add button to grid
        top.add ( wind );                          //add button to grid
        top.add ( humid );                         //add button to grid
        top.add ( dew );                           //add button to grid
        top.add ( chill );                         //add button to grid
        top.add ( api );                           //add button to grid

        all.addActionListener(this);               //add listener to the button
        temp.addActionListener(this);              //add listener to the button
        press.addActionListener(this);             //add listener to the button
        wind.addActionListener(this);              //add listener to the button
        humid.addActionListener(this);             //add listener to the button
        dew.addActionListener(this);               //add listener to the button
        chill.addActionListener(this);             //add listener to the button
        api.addActionListener(this);               //add listener to the button

        middle = new JTextField (15);              //create JTextField for data
        middle.setLayout (new GridLayout (1, 3));  //make a grid of 1 row & 3 columns
        mainPanel.add ( middle );                  //add it to the mainPanel

        setContentPane ( mainPanel );
        pack ();                                   //format layout without gaps
        setSize ( 1500, 300 );                     //set default size of JFrame
        setVisible ( true );
    }

    public void getData () 
    {
        InputStream is = null;
        BufferedReader br;
        String s;

        try 
        {  //Concordia's weather data URL:
            u = new URL("http://api.wunderground.com/weatherstation/WXCurrentObXML.asp?ID=ISHANGHA3");
            is = u.openStream();                  // can throw an IOException
            br = new BufferedReader(new InputStreamReader(is));
            while ((s = br.readLine()) != null)   //read entire webpage line-by-line
            {
                //find temperature in C
                if (s.indexOf("<temp_c>") != -1)  
                    temperatureC = Double.parseDouble( s.substring( s.indexOf("<temp_c>") + 8, s.indexOf("</temp_c>")));

                //find temperature in F
                if (s.indexOf("<temp_f>") != -1)  
                    temperatureF = Double.parseDouble( s.substring( s.indexOf("<temp_f>") + 8, s.indexOf("</temp_f>")));

                //find wind speed in mph
                if (s.indexOf("<wind_mph>") != -1)  
                    windSpeedM = Double.parseDouble( s.substring( s.indexOf("<wind_mph>") + 10, s.indexOf("</wind_mph>")));

                //find wind direction
                if (s.indexOf("<wind_dir>") != -1)  
                    windDir =s.substring( s.indexOf("<wind_dir>") + 10, s.indexOf("</wind_dir>"));

                //find pressure in mb
                if (s.indexOf("<pressure_mb>") != -1)  
                    pressureMB = Double.parseDouble( s.substring( s.indexOf("<pressure_mb>") + 13, s.indexOf("</pressure_mb>")));

                //find pressure in inches
                if (s.indexOf("<pressure_in>") != -1)  
                    pressureIN = Double.parseDouble( s.substring( s.indexOf("<pressure_in>") + 13, s.indexOf("</pressure_in>")));             

                //find relative humidity
                if (s.indexOf("<relative_humidity>") != -1)  
                    humidity = Double.parseDouble( s.substring( s.indexOf("<relative_humidity>") + 19, s.indexOf("</relative_humidity>")));

                //find dewpoint in C
                if (s.indexOf("<dewpoint_c>") != -1)  
                    dewPtC = Double.parseDouble( s.substring( s.indexOf("<dewpoint_c>") + 12, s.indexOf("</dewpoint_c>")));

                //find dewpoint in F
                if (s.indexOf("<dewpoint_f>") != -1)  
                    dewPtF = Double.parseDouble( s.substring( s.indexOf("<dewpoint_f>") + 12, s.indexOf("</dewpoint_f>")));
            }
            
            /*
            u = new URL("http://www.beijingaqifeed.com/shanghaiaqi/shanghaiairrss.xml");
            is = u.openStream();                  // can throw an IOException
            br = new BufferedReader(new InputStreamReader(is));
            
            while ((s = br.readLine()) != null)   //read entire webpage line-by-line
            {
                if (s.indexOf( "<AQI>" ) != -1)
                {
                    pollution = Double.parseDouble( s.substring( s.indexOf("<AQI>") + 5, s.indexOf("</AQI>")));
                }
            }
            */
        } 
        catch (MalformedURLException e) 
        {
            System.out.println("Ouch - a MalformedURLException happened.");
            e.printStackTrace();
            System.exit(1);
        } 
        catch (IOException e) 
        {
            System.out.println("Oops - an IOException happened.");
            e.printStackTrace();
            System.exit(1);
        } 
        finally 
        {
            try 
            {
                is.close();
            } 
            catch (IOException e) 
            { 
                System.out.println("OOPS");
                e.printStackTrace();
                System.exit(1);
            }
        } // end of 'finally' clause
    }

    public void actionPerformed(ActionEvent event) 
    {     
        getData();                                 //get the data from above         
        int h = getHeight();                       //find height of window, set h = height of window
        middle.setFont(new Font("Arial", Font.BOLD, (h / 10)));     //set the font size so that it fits in the window

        windSpeedK = windSpeedM * KTM;             //calculate kph of wind speed
        
        chl = 13.12 + ( 0.6215 * temperatureC ) - ( 11.37 * Math.pow( windSpeedK, 0.16) ) + 
        ( 0.3965 * temperatureC * ( Math.pow( windSpeedK, 0.16) ) );    // formula for windchill calculations; metric, not imperical
        
       chl = (int) chl ;                           //cast as int

        if ( event.getSource() == temp )  middle.setText( "Temp: " + temperatureC + " °C" + " or " + temperatureF + " °F");

        else if ( event.getSource() == wind )  middle.setText( "Wind Speed: " + windSpeedK + " kph" + " or " + windSpeedM + " mph " + "at " + windDir);

        else if ( event.getSource() == press )  middle.setText( "Pressure: " + pressureMB + " mB" + " or " + pressureIN + " in");

        else if ( event.getSource() == humid )  middle.setText( "Relative Humidity: " + humidity + "%");

        else if ( event.getSource() == dew )  middle.setText( "Dewpoint " + dewPtC + " °C" + " or " + dewPtF + " °F");

        else if ( event.getSource() == chill )  middle.setText( "Wind Chill Factor is: " + chl + " °C");
        
        // else if ( event.getSource() == api )  middle.setText( "Air Pollution Index is: " + pollution);

        else if ( event.getSource() == all )  
        {   
            middle.setFont(new Font ("Arial", Font.BOLD, (h / 24 ) ) );

            middle.setText( 
                "Temp: " + temperatureC + " °C" + " or " + temperatureF + " °F         " + 
                /* "Wind Speed: " + windSpeedM + " mph" + " or " + windSpeedK + " kph " + "at " + windDir + "         "+ */
                "Pressure: " + pressureMB + " mB" + " or " + pressureIN + " in         " + 
                "Relative Humidity: " + humidity + "%         " + 
                "Dewpoint " + dewPtC + " °C" + " or " + dewPtF + " °F         " +
                "Wind Chill Factor is: " + chl + " °C         " + 
                "Air Pollution: "/* +  pollution */  );
        }

        repaint();
    } 

    public static void main(String[] args)
    {
        Weather w = new Weather();
    }

}