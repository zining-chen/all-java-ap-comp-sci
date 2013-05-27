import java.util.ArrayList;

public class ForEach
{
    
    public static void main(String[] args)
    {
        
        int []a = {2,3,4,5,6,7,8,9,10,25};
        String[] zee = {"Sabrina", "Nick", "Jacob", "Don",};
        
        ArrayList<String> don = new ArrayList<String>();
        // ArrayList (Type: Strings) don = new ArrayList<Type: String>(How Big it should be)
        // Default to 10 items
        // ArrayList <int> can only store ints
        // ArrayList <object> can store anything, but values will return as object, must cast it then
        // <> Stores the type of an object
        
        for (int i : a ) 
        // must be the same type as array values (int) 
        // "for each integer i in a, do..."
        
        {
            System.out.println(i);
        }
        
        for (String k : zee)
        {
            System.out.println(k);
        }
        
        don.add("Casey");
        don.add("Won Tack");
        don.add("Jonathan");
        don.add("Andrew");
        don.add("Andy");
        don.add("Sharleen");
        don.add(2, "Bob"); // Adds Bob into the 2nd Array Slot (In Between Wontack and Jonathan)
        
        for (String me : don)
        {
            System.out.println(me);
        }
    }
}