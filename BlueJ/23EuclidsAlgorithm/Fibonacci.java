import java.util.Scanner;

public class Fibonacci
{
    private static int a;
    private static long n;
    private static int c;

    public static int fib (int a) // Brute Force
    {
        if (a == 1 || a == 0)
        {
            return a;
        }
        else 
        {
            return fib(a-1) + fib(a-2);
        }

    }

    public static long fib2(int n) // Much Faster
    {
        long[] f = new long[n + 1];
        
        f[0] = 0;
        f[1] = 1;
        
        for (int i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);

        System.out.print( "Which term of Fibonacci sequence? ");
        
        int n = y.nextInt();

        System.out.println("The " + n + "th term " + fib2(n) );

    }
}
