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

	// public String getName();				// returns the name of an item
	// public String getDescription();		// returns the description of an item

	// ^^ unsure about these bois, like i dont know if it should be part of the interface

	public void useItem();					// each class will provide functionality
	public boolean canPickUp();  			// returns true/false if the player can pick up this item
}

//=====================================================================
// Weapon class
//=====================================================================
class Weapons implements Items {
	String name;
	String description;
	int damage;						
	boolean pickUp;					


	// Start of Telescoping Constructors
	public Weapons(){				
		this("UNKNOWN NAME","NO DESCRIPTION", 0, false);		
	}

	public Weapons(String name){
		this(name,"NO DESCRIPTION",0,false);
	}

	public Weapons(String name, String description){
		this(name,description,0,false);
	}

	public Weapons(String name, String description, int damage){
		this(name,description,damage, false);
	}

	public Weapons(String name, String description, int damage, boolean pickUp){
		this.name = name;								
		this.description = description;					
		this.damage = damage;
		this.pickUp = pickUp;
	}
	// End of Telescoping Constructors


	public void setName(String name){ this.name = name;} // setter function
	public String getName(){return name;}				 // getter function

	public void setDescription(String description){this.description = description;} // setter function
	public String getDescription(){return description;} // getter function

	public void setDamage(int damage){this.damage = damage;}
	public int getDamage(){return damage;}

	public void setPickUp(boolean pickUp){this.pickUp = pickUp;} // setter function
	public boolean canPickUp(){										// getter function
		if(pickUp){
			System.out.println("You PICK UP " + name );
		}
		else{
			System.out.println("You can NOT PICK UP " + name);
		}
		return pickUp;
	}			

	public void useItem(){								// Weapon's useItem() will attack and do damage to a valid target
		System.out.println("You ATTACK with " + name);	
		// Check if valid target
		// If target is a Character, lower health/do damage
		// else the attack does nothing? possible implement unique interactions ie: a axe breaks a door
		System.out.println("You did " + damage + " damage");	
	}

	public String toString(){  // toString function
		String temp = ("A " + name + ". " + description +". Damage: " + damage);
		return temp;
	}

	
}


//=====================================================================
// Treasure class
//=====================================================================
 class Treasures implements Items{
	String name;
 	String description;
 	boolean pickUp;
 	int value;


 	// Start of Telescoping Constructors
 	public Treasures(){
 		this("NO NAME","NO DESCRIPTION",false,0);
 	}

 	public Treasures(String name){
 		this(name,"NO DESCRIPTION",false,0);
 	}

 	public Treasures(String name,String description){
 		this(name,description,false,0);
 	}

 	public Treasures(String name,String description, boolean pickUp){
 		this(name,description,pickUp,0);
 	}

 	public Treasures(String name, String description, boolean pickUp, int value){
 		this.name = name;
 		this.description = description;
 		this.pickUp = pickUp;
 		this.value = value;
 	}
	// End of Telescoping Constructors

 	public void setName(String name){this.name = name;}	// setter function
 	public String getName(){return name;}				// getter function

 	public void setDescription(String description){this.description = description;}	// setter function
 	public String getDescription(){return description;}								// getter function

 	public void setValue(int value){this.value = value;}	// setter function
 	public int getValue(){return value;}					// getter function

 	public void setPickUp(boolean pickUp){this.pickUp = pickUp;} // setter function
	public boolean canPickUp(){									 // getter function
		if(pickUp){
			System.out.println("You PICK UP " + name );
		}
		else{
			System.out.println("You can NOT PICK UP " + name);
		}
		return pickUp;
	}

	public void useItem(){
		System.out.println("You play with the " + name + " in your hands.");	// treasure does not do anything besides increase the players score at the end 
	}

	public String toString(){		// toString method
		String temp = ("A " + name + ". "  + description + ". Value: " + value);
		return temp;
	}

 }

//=====================================================================
// Consumable class
//=====================================================================
class Consumable implements Items{
	String name;
	String description;
	boolean pickUp;
	int value;				// amount of health it restores 


 	// Start of Telescoping Constructors
	public Consumable(){
		this("NO NAME","NO DESCRIPTION",false,0);
	}

	public Consumable(String name){
		this(name,"NO DESCRIPTION", false,0);
	}

	public Consumable(String name,String description){
		this(name,description,false,0);
	}

	public Consumable(String name,String description, boolean pickUp){
		this(name,description,pickUp,0);
	}

	public Consumable(String name, String description, boolean pickUp, int value){
		this.name = name;
		this.description = description;
		this.pickUp = pickUp;
		this.value = value;
	}
	// End of Telescoping Constructors

	public void setName(String name){this.name = name;}	// setter function
 	public String getName(){return name;}				// getter function

 	public void setDescription(String description){this.description = description;}	// setter function
 	public String getDescription(){return description;}								// getter function

 	public void setPickUp(boolean pickUp){this.pickUp = pickUp;} // setter function
	public boolean canPickUp(){									 // getter function
		if(pickUp){
			System.out.println("You PICK UP " + name );
		}
		else{
			System.out.println("You can NOT PICK UP " + name);
		}
		return pickUp;
	}

	public void setValue(int value){	// setter function
		this.value = value;
	}
	public int getValue(){				// getter function 
		return value;
	}

	public void useItem(){
		System.out.println("You use " + name + ". It restores " + value + " health.");
		//
		// Need to implement the healing aspect!
		//
	}

	public String toString(){
		String temp = ("A " + name + ". " + description + ". Healing: " + value);
		return temp;
	}

}