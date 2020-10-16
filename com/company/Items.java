//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;



//=====================================================================
// Item interface
//=====================================================================
interface Items {

	public String getName();				// returns the name of an item
	public String getDescription();			// returns the description of an item

	public void useItem();					// each class will provide functionality
	public boolean canPickUp();  			// returns true/false if the player can pick up this item
}

//=====================================================================
// Weapon class
//=====================================================================
class Weapons implements Items {
	String name;
	String description;
	int damage;						// we can possible split this into different Damage types ie: bleed, piercing, severing....
	boolean pickUp;					



	public Weapons(){				// Telescoping constructors, I am selective on how many constructors im making :p
		this("UNKNOWN NAME","NO DESCRIPTION", 0, false);		
	}

	public Weapons(String name, String description, int damage, boolean pickUp){
		this.name = name;
		this.description = description;
		this.damage = damage;
		this.pickUp = pickUp;
	}

	public void setName(String name){ 					// setter function
		this.name = name;
	}

	public String getName(){							// getter function
		return name;	
	}

	public void setDescription(String description){	 	// setter function
		this.description = description;
	}

	public String getDescription(){	 					// getter function
		return description;
	}

	public boolean canPickUp(){							// setter function
		return pickUp;			
	}

	public void useItem(){								// Weapon's useItem() will attack and do damage to a valid target
		System.out.println("You ATTACK with " + name);	
		System.out.println("You did " + damage + " damage");	

		// Check if valid target
		// If target is a Character, lower health/do damage
		// else the attack does nothing? possible implement unique interactions ie: a axe breaks a door

	}

	// public String toString(){
		
	// }

	
}

