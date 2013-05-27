import kareltherobot.*;
import java.awt.Color;

public class Neighbor extends Robot
{
    Neighbor myNeighbor;

    public Neighbor(int st, int av, Direction dir, int numBeepers, Neighbor r)
    {
        super(st, av, dir, numBeepers);
        myNeighbor = r;
    }

    public void turnOffNeighbor()
    {
        if (myNeighbor != null)
        {
            myNeighbor.turnOffNeighbor();
            myNeighbor.turnOff();
        }
    }
    
    public void turnAllAround()
    {
        if (myNeighbor != null)
        {
            myNeighbor.turnAllAround();
           // myNeighbor.turnAround();
        }
    }
    

    
}