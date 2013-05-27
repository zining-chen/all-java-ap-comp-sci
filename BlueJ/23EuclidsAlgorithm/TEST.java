
/**
 * Write a description of class TEST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEST
{

    public static void main (String [] args)
    {
        int[] r = { 9, 2, 4, 3, 7, 5, 0, 1 }; 
        
        for ( int t : r ) 
        { 
            t = t + 1; 
        }
        
        System.out.println(t);
    }

}
