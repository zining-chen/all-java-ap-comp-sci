public class TwoDimensionalArray
{
    private static String[][] a = {
        {"","","","","Zee","Andy","Jacob   ","Won Tack"},
        {"","Andrew","Sabrina","Linette","Casey","Don ","Jonathan","Sharleen"}
    };

    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int r = 0; r < a.length; r++)
        {
            for (int c = 0; c < a[r].length; c++)
            {
                System.out.print( a[r][c] + "\t");
            }
            System.out.println("");
        }
    }
}