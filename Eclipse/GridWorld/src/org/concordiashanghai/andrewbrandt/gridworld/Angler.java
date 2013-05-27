package org.concordiashanghai.andrewbrandt.gridworld;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class Angler extends Critter {
	
	
	public ArrayList<Location> getMoveLocations() {
		return new ArrayList<Location>();
	}
	
	public void processActors (ArrayList<Actor> actors) {
		for (int i = 0; i < actors.size() - 1; i++) {
			if 
		}
	}

	
	 public static void main(String[] args) {
	      ActorWorld world = new ActorWorld();
	      world.setGrid( new BoundedGrid<Actor>(20,20) );
	      BoundedGrid<Actor> grid =  (BoundedGrid<Actor>) world.getGrid();
	      
	      (new Rock()).putSelfInGrid( grid, new Location( 3, 5 ) );
	      (new Rock()).putSelfInGrid( grid, new Location( 0, 10 ) );
	      (new Rock()).putSelfInGrid( grid, new Location( 7, 16 ) );
	      (new Rock()).putSelfInGrid( grid, new Location( 15, 19 ) );
	      (new Rock()).putSelfInGrid( grid, new Location( 19, 2 ) );
	      (new Bug( Color.BLUE )).putSelfInGrid( grid, new Location( 5, 3 ) );
	      (new Bug( Color.GREEN )).putSelfInGrid( grid, new Location( 7, 7 ) );
	      (new Bug( Color.YELLOW )).putSelfInGrid( grid, new Location( 15, 15 ) );
	      (new Bug( Color.PINK )).putSelfInGrid( grid, new Location( 5, 19 ) );

	      (new Angler()).putSelfInGrid( grid, new Location( 10, 14 ) );
	      world.show();
	    }

}
