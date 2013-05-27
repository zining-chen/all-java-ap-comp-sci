import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;
    int sum = 0;
    int elements = 0;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }

    while ( input.hasNextInt() )
    {
        sum += input.nextInt();
        elements++;
    }
    
    System.out.println( "The average is " + ( (double) sum / elements) );
    
  }
}
