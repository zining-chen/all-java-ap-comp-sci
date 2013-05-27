
public class Perfect
{
    public static boolean isPrime( long x )
    {
        long max = (int) Math.sqrt(x);

        for (int i = 2; i < max; i++)
        {
            if ( (x % i) == 0) return false; //the return breaks out of the loop
        }

        return true; // if it makes it all the way through the loop, then it is prime
    }

    public static void main( String[] args)
    {
        int count = 0;
        int n = 1;

        while (count < 12 && n < Integer.MAX_VALUE)
        {
            long prime = (long)Math.pow(2,n) - 1;
            if (isPrime(prime) ) // found a prime!!
            {
                long perfect = (long)Math.pow(2, n-1) * prime;
                count++;
                System.out.println( "Perfect number #" + count + " is " + perfect );
            }
            n++;
        }

    }
}
