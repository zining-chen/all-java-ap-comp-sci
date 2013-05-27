import java.util.*;
import java.text.SimpleDateFormat;

public class TimeParser {

   private Date getTime(  )   //Sets time zone and returns time in date format
   { 
     TimeZone zone = TimeZone.getTimeZone ( "GMT+8" ) ;
     Calendar calendar = Calendar.getInstance ( zone ) ;
     return calendar.getTime (  ) ;
   }
  
   public int getSeconds()   //Returns the current second as an integer
   {
    SimpleDateFormat formatter = new SimpleDateFormat("ss");
    Date d = getTime();
    return Integer.parseInt(formatter.format(d));   
   }
  
   public int getMinutes()  //Returns the current minute as an integer
   {
    SimpleDateFormat formatter = new SimpleDateFormat("mm");
    Date d = getTime();
    return Integer.parseInt(formatter.format(d));   
   }

   public int getHours()    //Returns the current hour as an integer
   {
    SimpleDateFormat formatter = new SimpleDateFormat("hh");
    Date d = getTime();
    return Integer.parseInt(formatter.format(d));   
   }

      
}
