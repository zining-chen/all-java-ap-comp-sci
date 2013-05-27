public class Die
{
    // instance variables - replace the example below with your own
    private int dots;

    public void roll()
    {
        dots = (int) ( Math.random() * 6 + 1 );
    }
    
    public void rollN(int n)
    {
        dots = (int) ( Math.random() * n + 1);
    }
    
    public int getNumDots()
    {
        return dots;
    }
}
