import java.util.Scanner;

public class Greetings2
{
    public static void main (String[] args)
    {
        Scanner kb;
        String firstName = "", lastName = "";
        kb = new Scanner(System.in);

        while (! firstName.equals("quit"))
        {
            System.out.print("Enter your first name: ");
            firstName = kb.nextLine();
            System.out.print("Enter your last name: ");
            lastName = kb.nextLine();
            System.out.println(" ");
            System.out.println("Hello " + firstName + " " + lastName + "!");
            System.out.println("Welcome to Java!");
            System.out.println(" ");
        }
    }
}
