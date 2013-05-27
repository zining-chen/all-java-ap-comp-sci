import java.util.Scanner;

public class CylinderTest
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = kb.nextDouble();
    System.out.print("Enter the height: ");
    double h = kb.nextDouble();
    
    Cylinder c = new Cylinder(r,h);
    double volume = c.getVolume();
    System.out.println("Radius = " + r + " Height = " + h + " Volume = " + volume);
  }
}