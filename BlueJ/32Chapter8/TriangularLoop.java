import java.util.Scanner;
public class TriangularLoop
{
    // instance variables - replace the example below with your own
    private static String word;
    
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in);
        
        word = s.nextLine();
        
        for (int i = 0; i < word.length(); i++)
        {
            for (int j = i + 1; j < word.length(); j++)
            {
                if ( word.substring(i, i+1).equals( word.substring(j, j+1)) )
                  System.out.println( word.substring (i, i+1) );
            }
        }
    }
}
