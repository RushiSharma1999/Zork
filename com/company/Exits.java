//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//


interface Exits{
	// all exits have a direction

	enum Direction {
		NORTH, SOUTH, EAST, WEST;
	}

	int getDirection(); // returns the enum value

	boolean isOpen(); // an exit can be locked or open. if locked, the player can not enter
}