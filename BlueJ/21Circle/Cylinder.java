public class Cylinder
{
    // instance variables - replace the example below with your own
    private Circle c;
    private double height;
    
    public Cylinder(double r, double h)
    {
        c = new Circle(r);
        height = h;
    }
    
    public double getVolume()
    {
        // put your code here
        return c.getArea() * height;
    }
}
