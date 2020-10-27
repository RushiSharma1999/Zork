//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;
import com.company.Items;
import java.util.ArrayList;

//=====================================================================
// Characters class
//=====================================================================
class Characters{
	private String name;
	private String description;
	private final int SIZE = 10;
	private int MAX_HEALTH;
	private int health;
	ArrayList<Items> aItems = new ArrayList<Items>(10);

	// Start of Telescoping Constructors
	public Characters(){
		this("No name");
	}

	public Characters(String name){
		this(name,"No description");
	}

	public Characters(String name, String description){
		this(name,description,0);
	}
	public Characters(String name,String description, int health){
		this.name = name;
		this.description = description;
		this.health = health;
		MAX_HEALTH = health;
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

	public void setHealth(int health){	// setter function, ** you cannot change the max health of a character after creating them **
		this.health = health;			// this function is used for when the character takes damage
	}
	public int getHealth(){				// getter function
		return health;
	}

	public int getMAX_HEALTH(){			// getter function, returns the MAX_HEALTH value for this character
		return MAX_HEALTH;
	}

	// ***************************************************
	// WE CAN ONLY DO THIS IF THE ITEM CAN BE PICKED UP 
	// ***************************************************
	public void pickUp(Items someItem){ 
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

	public void getInventory(){		// prints out the player's inventory
	int count = 0;
		System.out.println("Inventory:");
		for(int i = 0; i < SIZE; ++i){
			
			System.out.println("[" + count + "]" + " " + aItems.get(i));
			count++;
		}
	}

	// public void useItem(){	

	// 	this.getInventory();		// prints out the player's inventory, the player must decide which item to use

	// 	System.out.println("Which item do you want to use?\n>")

	// }

}
