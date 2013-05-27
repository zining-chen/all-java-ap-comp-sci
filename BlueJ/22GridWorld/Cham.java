import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;

public class Cham extends Critter
{
    public Cham()
    {
        super();
    }

    public void processActors( ArrayList<Actor> actor)
    {
        int n = actor.size();

        if ( n == 0)
            return;
        else
        {
            int x = (int) ( Math.random() * n );
            setColor( actor.get(x).getColor() );

        }
    }

    public void makeMove( Location loc )
    {
        if (loc == null)
        {
            removeSelfFromGrid();
        }
        else
        {
            int angle = getLocation().getDirectionToward( loc );
            setDirection( angle );
            moveTo( loc );
        }
    }
}