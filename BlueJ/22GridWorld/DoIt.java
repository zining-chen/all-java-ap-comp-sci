import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;

public class DoIt
{
    static ActorWorld world;
    
    public static void main(String[] args)
    {       
        
        world = new ActorWorld();
        for (int i = 0; i < 5; i++)
        {
            world.add( new Rock() );
            world.add( new Bug() );
        }
        
        Zergling z = new Zergling();
        world.add( new Location(2,2), z);
        
        world.show();
        
    }
}