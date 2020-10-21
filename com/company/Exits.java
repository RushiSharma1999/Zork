//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;
import com.company*;

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
	String description;
	Vector<Items> vItems = new Vector<Items>(10);
	
}