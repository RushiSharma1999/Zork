//
//	AUTHORS:	 	Julia, Tran, and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company; // Main is part of the com.company package

import com.company.*;	// importing everything in the com.company package


public class Main{

	public static void main(String[] args) {

		//
		//	Testing
		//
		
		Weapons sword1 = new Weapons("Wood sword","A flimsy wooden sword",5,true);
		Treasures coin = new Treasures("Gold coin","A single gold coin with a skull on one side",true,5);
		Weapons sword2 = new Weapons();

		System.out.println(sword1);
		sword1.canPickUp();

		sword1.setName("Bundle of sticks");
		sword1.setDescription("A bunch of sticks varrying in size. Seemingly held together by a thin string");
		sword1.setDamage(1);
		sword1.setPickUp(false);

		System.out.println("\n" + sword1);
		sword1.canPickUp();


		System.out.println("\n" + coin);

		System.out.println("\n" + sword2);

	}
}