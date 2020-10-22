//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;
import com.company*;

//=====================================================================
// Characters class
//=====================================================================
class Characters{
	String name;
	String description;
	final int SIZE = 10;
	ArrayList<Items> aItems = new ArrayList<Items>(SIZE);

	// Start of Telescoping Constructors
	public Character(){
		this("No name");
	}

	public Character(String name){
		this(name,"No description");
	}

	public Character(String name, String description){
		this.name = name;
		this.description = description;
		// not sure if i should initialize the aItems array here
	}
	// End of Telescoping Constructors

	public void setName(String name){	// setter function
		this.name = name;
	}		
	public String getName(){			// getter function
		return name;
	}

	public void setDescription(String description){	// setter function
		this.description = description;
	}
	public String getDescription(){					// getter function
		return description;
	}

	// ***************************************************
	// WE CAN ONLY DO THIS IF THE ITEM CAN BE PICKED UP 
	// ***************************************************
	public void pickUp(Item someItem){ 
		if(aItems.isEmpty())	// if the array is empty, add an item
		{
			aItems.add(someItem);
		}
		else if(aItems.size() < SIZE ) // else, we have to check it is not full
		{
			aItems.add(someItem);
		}
		else{
			System.out.println("Inventory is full");
		}

	}

}