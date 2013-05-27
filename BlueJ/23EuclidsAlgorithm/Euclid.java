import java.util.Scanner;

public class Euclid
{
    private static int a;
    private static int b;
    private static int c;

    public static int GCF (int a, int b)
    {
        while (c != 0)
        {
            while (a != b)
            {
                if (a > b)
                {
                    a = a - b;
                }
                else 
                {
                    b = b - a;
                }
            }
        }

        return a;
    }

    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);

        System.out.print( "Enter First Number: ");
        a = y.nextInt();

        System.out.print( "Enter Second Number: ");
        b = y.nextInt();

        System.out.println("The Greatest Common Factor is: " + GCF(a,b) );

    }
}
