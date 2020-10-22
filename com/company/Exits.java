//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;
import com.company*;

enum Direction{
	NORTH, SOUTH, EAST, WEST;
}

// //=====================================================================
// // Exits interface
// //=====================================================================
// interface Exits{
// 	// all exits have a direction

// 	enum Direction {
// 		NORTH, SOUTH, EAST, WEST;
// 	}

// 	void getDirection(); // prints out the direction

// 	boolean isOpen();	 // an exit can be locked or open. if locked, the player can not enter
// }

// //=====================================================================
// // Door class
// //=====================================================================
// class Door implements Exits{
// 	boolean locked;
// 	Direction myDirection;

// 	// Start of Telescoping Constructors
// 	public Door(boolean locked, Direction myDirection){
// 		this.locked = locked;
// 	}
// }

//=====================================================================
// Room class
//=====================================================================
class Room{
	String name;					 				 // ex: room 1, monster room
	String description;								 // ex: A dark and spacious room. A passage leads to the west.
	Vector<Items> vItems = new Vector<Items>();	 // Some items that are in the room
	boolean canEnter; // if true, the player can enter and leave freely, else, fulfill some condition or the room doesn't exist

	Room *nRoom;
	Room *sRoom;		// the rooms next to this room
	Room *eRoom;
	Room *wRoom;

	// Start of Telescoping Constructors
	public Room(){
		this("No name",);
	}

	public Room(String name){
		this(name,"No description");
	}

	public Room(String name, String description){
		this(name,description,false);
	}

	public Room(String name, String description, boolean canEnter){
		this.name = name;
		this.description = description;
		this.canEnter = canEnter;
	}
	// End of Telescoping Constructors

	public void setName(String name){		// setter function
		this.name = name;
	}
	public String getName(){				// getter function
		return name;
	}

	public void setDescription(String description){	// setter function
		this.description = description;
	}
	public String getDescription(){					// getter function
		return description;
	}

	public void setCanEnter(boolean canEnter){		// setter function
		this.canEnter = canEnter;
	}
	public boolean getCanEnter(){					// getter function
		return canEnter;
	}

	public String toString(){
		String temp = ("The " + name + ". " + description + ".");
		return temp;
	}


	// Room(Room b){
	// 	name = b.getName();
	// 	description = b.getDescription();
	// 	canEnter = b.getCanEnter();
	// 	// **** NEED TO COPY OVER THE ITEMS TOO **** 
	// }


	public void connectRoom(Room otherRoom, Direction d){

		switch(d){
			case NORTH:
			nRoom = otherRoom;
			otherRoom.connectRoom(this, Direction b = SOUTH);


		}
	}
}