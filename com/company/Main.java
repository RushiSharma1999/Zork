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
		Treasures coin = new Treasures("Gold coin","A single gold coin with a skull on one side",true,2);
		Consumables waterJug = new Consumables("Water jug","A portable jug that has some water in it",true,4);
		NonConsumables ball = new NonConsumables("Bouncy ball","A small ball that has a nice bounce to it",true,"It makes you happy");

		System.out.println(sword1);
		sword1.canPickUp();
		sword1.useItem();

		System.out.println("\n" + coin);
		coin.useItem();

		System.out.println("\n" + waterJug);
		waterJug.useItem();

		System.out.println("\n" + ball);
		ball.useItem();

		
		

	}
}