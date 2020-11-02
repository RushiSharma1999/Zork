//
//  AUTHORS:        Julia, Tran and Rushi
//	CLASS: 			CPSC - 233j
//	TEACHER:		Professor McCarthy
//	TIME:			T-Th 8:00am-9:45am
//	DUE: 			October 30, 2020
//

package com.company;
import java.io.PrintStream;
import java.util.*;
import com.company.*;


//commands list class
class CommandsList
{

    private String command;
    /*private String item;
    private String direction;
    private String character;  //this is the character the player chooses to play as
    private String actions;    //this can be used for the commands that involves the character to do perform an action

    // we can implement this later bit for now we can just work with a set list of all commands
    //ArrayList<String> nonListedCommands = new ArrayList<String>();
    */


    // constant arrays that holds all the commands for the three categories
    private static final String directionCommands[] = { "east", "west", "south", "north", "up", "down" };
    private static final String actionCommands[] = { "go", "grab", "attack", "unlock", "drop", "use", "equip", "unequip" };
    private static final String generalCommands[] = { "quit", "help", "check", "view" };

    public static PrintStream so = System.out;

    //Constructor - initialise the command words.
   public CommandsList()
    {
        // nothing to do at the moment...
    }

    //the idea is to create an object of the other class and use these functions for the if-else statements below as per the received commands
    private Items item = new Item ( );

    public void useItem() {
       item.useItem();
    }

    public void grabItem() {
        item.grabItem();
    }



    public void commandOperations(String command) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter the command: ");
        command = sc.nextLine();             //reads string

        String commands[] = command.split(" ");
        for (int i = 0; i < commands.length; i++)
        {
            String arr = commands[i];

            boolean validCommand(String arr)
            {
                 if(arr.equals(aString))
                    {
                        return true;
                    }
                }
                return false;
            }

            for (int j = 0; j < directionCommands.length; j++) {
                if (directionCommands[j] == arr)
                {
                    if(arr.equalsIgnoreCase("east"))
                        this.arr = "EAST";

                    else if(arr.equalsIgnoreCase("west"))
                        this.arr = "WEST";

                    else if(arr.equalsIgnoreCase("south"))
                        this.arr = "SOUTH";

                    else if(arr.equalsIgnoreCase("north"))
                        this.arr = "NORTH";

                    else if(arr.equalsIgnoreCase("up"))
                        this.arr = "UP";

                    else if(arr.equals("down"))
                        this.arr = "DOWN";
                }
            }

            for (int k = 0; k < actionCommands.length; k++) {
                if (actionCommands[k] == arr)
                {
                    if(arr.equalsIgnoreCase("go"))
                        this.arr = "GO";

                    else if(arr.equalsIgnoreCase("grab"))
                    {
                        grabItem();
                    }

                    else if(arr.equalsIgnoreCase("attack"))
                        this.arr = "ATTACK";

                    else if(arr.equalsIgnoreCase("unlock"))
                        this.arr = "UNLOCK";

                    else if(arr.equalsIgnoreCase("drop"))
                        this.arr = "DROP";

                    else if(arr.equalsIgnoreCase("use"))
                    {
                        useItem();
                    }

                    else if(arr.equalsIgnoreCase("equip"))
                        this.arr = "EQUIP";

                    else if(arr.equalsIgnoreCase("unequip"))
                        this.arr = "UNEQUIP";
                }
            }

            for (int l = 0; l < generalCommands.length; l++) {
                if (generalCommands[l] == arr)
                {
                    if(arr.equalsIgnoreCase("quit"))
                        this.arr = "QUIT";

                    else if(arr.equalsIgnoreCase("help"))
                        this.arr = "HELP";

                    else if(arr.equalsIgnoreCase("check"))
                        this.arr = "CHECK";

                    else if(arr.equalsIgnoreCase("view"))
                    {
                        getInventory();
                    }
                }
            }

        }

    }
/*
    //checks if a command is a string
    //might be redundant if we have similar methods in Commands class
    public boolean validCommand(String aString)
    {
        for(int i = 0; i < arrayOfCommands.length; i++)
        {
            if(arrayOfCommands[i].equals(aString))
            {
                return true;
            }
        }
        return false;
    }
*/
    //print all the commands
    public void printAll()
    {
        for(int i = 0; i < directionCommands.length; i++)
        {
            so.print(directionCommands[i] + "  ");
        }
        for(int i = 0; i < actionCommands.length; i++)
        {
            so.print(actionCommands[i] + "  ");
        }
        for(int i = 0; i < generalCommands.length; i++)
        {
            so.print(generalCommands[i] + "  ");
        }
        so.println();
    }

    //print the direction commands
    public void printDirectionCommands(){
        for(int i = 0; i < directionCommands.length; i++)
        {
            so.print(directionCommands[i] + "  ");
        }
        so.println();
    }

    //print the action commands
    public void printActionCommands(){
        for(int i = 0; i < actionCommands.length; i++)
        {
            so.print(actionCommands[i] + "  ");
        }
        so.println();
    }

    //print the general commands
    public void printGeneralCommands(){
        for(int i = 0; i < generalCommands.length; i++)
        {
            so.print(generalCommands[i] + "  ");
        }
        so.println();
    }

}