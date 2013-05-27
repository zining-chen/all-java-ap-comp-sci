public class Scope
{
    // instance variables - replace the example below with your own
    int x = 0;

    public void one()
    {
        System.out.println("In One, x = " + x);
    }

    public void two()
    {
        x = 9;
        System.out.println("In Two, x = " + x);

        for (int c = 0; c < 5; c++)
        {
            this.x = c;
        }
    }

    public static void main(String[] args)
    {
        String a = "a";
        int q = 0;
        
        Scope f = new Scope();
        
        System.out.println(f);
        
//         while (true)
//         {   
// 
//             a += "";
//             q += 1;
//             System.out.println(q);
//         }
    }
}
