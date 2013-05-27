import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;

public class Zergling extends Critter
{
    

    public Zergling()
    {
        super();
        setColor( new Color( 200,50,200) );
    }

    @Override
    public void processActors(ArrayList <Actor> actors) {
        for (Actor a : actors) {
            if ( !(a instanceof Rock) && !( (a instanceof Zergling) && (a.getColor() == getColor())))
            {
                
                (new Zergling() ).putSelfInGrid(a.getGrid() , a.getLocation() );
            }
        }
    }
}
