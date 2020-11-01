//
//  AUTHORS:        Julia, Tran and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//  DUE:            November 1, 2020
//

package com.company; // Main is part of the com.company package?
import com.company.*;


public class Main{

	public static void main(String[] args) {

		//
		//	Testing
		//
		
		Weapons sword1 = new Weapons("Wood sword","A flimsy wooden sword",3,true);
		Treasures coin = new Treasures("Gold coin","A single gold coin with a skull on one side",true,2);
		Consumables waterJug = new Consumables("Water jug","A portable jug that has some water in it",true,4);
		NonConsumables ball = new NonConsumables("Bouncy ball","A small ball that has a nice bounce to it",true,"It makes you happy");
		Characters player = new Characters("Julia", "20 year old gamer, beginning skateboarder, and art enthusiast",20);


		System.out.println(sword1);
		sword1.canPickUp();
		sword1.useItem();

		System.out.println("\n" + coin);
		coin.useItem();

		System.out.println("\n" + waterJug);
		waterJug.useItem();

		System.out.println("\n" + ball);
		ball.useItem();

		System.out.println("\n" + player);
		player.getInventory();
		player.pickUp(sword1);
		player.pickUp(coin);
		player.pickUp(waterJug);
		player.pickUp(ball);
		player.getInventory();

		// *************************************
		// Need to test Room's functions 
		// Need to test Game's functions
		// Need to test Character's functions/ interactions with Items, Rooms and attacking other Characters
		// Need a combat system
		// Need to draw a map
		// If a Character's health hits zero - if enemy, delete them
		// - if main player, end game, total up score from the value of all the treasures collected
		// *************************************
	}
}