//
//  AUTHORS:        Julia and Tran
//  CLASS:          CPSC - 233j
//  TEACHER:        Professor McCarthy
//  TIME:           T-Th 8:00am-9:45am
//  DUE:            October 30, 2020
//



//
// movement system
// design a map - each room has items, characters
// fighting system
//


//=========================================================================
// Direction enum 
//=========================================================================
enum Direction { 
    NORTH, // 0
    SOUTH, // 1
    EAST,  // 2
    WEST;  // 3
    // *****************************************************************
    // - the only Direction we use is noExit, unsure if we need this ^^^
    // *****************************************************************
    public static final int noExit = -1;
};

//=====================================================================
// Room class
//=====================================================================
class Room {
    private String name;
    private String description;

    // **************************************************
    // Rooms have Items, need an ArrayList of Items here
    // **************************************************

    // *********************************************************
    // Rooms have monsters, need a Arraylist of Characters here
    // *********************************************************
    

    private int north, south, west, east;

    // Start of Telescoping Constructors
    public Room(){
        this("NO ROOM NAME");
    }

    public Room(String name){
        this(name,"NO ROOM DESCRIPTION");
    }

    public Room(String name,String description){
        this(name,description,Direction.noExit);
    }

    public Room(String name, String description,int N){
        this(name,description,n,Direction.noExit);
    }

    public Room(String name, String description,int N, int S){
        this(name,description,n,s,Direction.noExit);
    }

    public Room(String name,String description,int N, int S, int W){
        this(name,description,n,s,w,Direction.noExit);
    }

    public Room(String name, String description, int N, int S, int W, int E) {
        this.north = N;
        this.south = S;
        this.west = W;
        this.east = E;
    }
    // End of Telescoping Constructors

    public String getName() {           // getter function
        return name;
    }

    public void setName(String aName) { // setter function
        this.name = name;
    }

    public String getDescription() {    // getter function
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = description;
    }
    public int getN() {                 // getter function  
        return north;
    }

    public void setN(int N) {           // setter function
        this.north = N;
    }

    // s
    public int getS() {                 // getter function
        return south;
    }
    public void setS(int S) {           // setter function
        this.south = S;
    }

    // e
    public int getE() {                 // getter function
        return east;
    }
    public void setE(int E) {           // setter function
        this.east = E;
    }

    // w
    public int getW() {                 // getter function
        return west;
    }
    public void setW(int W) {           // setter function
        this.west = W;
    }

    public String toString(){
        String temp = (getName() + ". " + getDescription() + " .\n");
        if(getN() >= 0){
            temp += "There is an exit north\n";
        }
        if(getS() >= 0){
            temp += "There is an exit south\n";
        }
        if(getE() >= 0){
            temp += "There is an exit east\n";
        }
        if(getW() >= 0){
            temp += "There is an exit west\n";
        }

        return temp;
}

    public boolean isConnected(Room otherRoom){ // this doesn't return what direction the rooms are connected to, only that the rooms are conencted
        boolean found = false;                  // returns true if they are connected

        if(this.getN() == otherRoom.getN()){
            found = true;
        } 
        else if (this.getS() == otherRoom.getS()){
            found = true;
        }
        else if(this.getE() == otherRoom.getE()){
            found = true;
        }
        else if(this.getW() == otherRoom.getW()){
            found = true;
        }

        return found;
    }

    // *******************************************
    // Need to implement adding Items to a room
    // ------------------------------------------
    // either just putting items into the room or
    // the player drops an item
    // *******************************************

    // *******************************************
    // Need to implement removing Items from a room
    // -------------------------------------------
    // ie: player picking up an Item
    // *******************************************
}

//=====================================================================
// Game class 
//=====================================================================
class Game {
    private Character playerChar;       // main character
    private ArrayList<Room> map;    // map of zork
    private Room currentLoation;    // this is the Room the player is in


    public Game() {
        this.map = new ArrayList<Room>();
        map.add(new Room("room0", "Test1", Direction.noExit, 2, Direction.noExit, 1));
        map.add(new Room("room1", "Test2", Direction.noExit, Direction.noExit, 0, Direction.noExit));
    }
        // From my understanding of the Room class, in each possible direction there is a number 
        // and that number does not corresponse to the index of the Room it is attached too but simply a numbered
        // connection. Such that, if you wanted to connect two Rooms, they must both share a numbered connection
        // The two Rooms above are not connected.
        // ex. of connected Rooms:
        //                                      NORTH               SOUTH               EAST             WEST
        //  map.add(new Room("room3", "Test3",  3,                  Direction.noExit, Direction.noExit, Direction.noExit));
        //  map.add(new Room("room4", "Test4",  Direction.noExit,   3,                Direction.noExit, Direction.noExit));
        // room4 is to the North of room3. 
        // room3 is to the south of room4.
        //
        // we need to be careful with room connections, we can not have multiple room connections.
        // what i mean is that if 3 rooms are all connected, they can not be connected like this: 
        // room1: N = 1
        // room2: S = 1
        // room3: E = 1
        // because it is unclear which room is connected to each.
        // 
        // i do like how flexible the room connections are
    

    // ********************************************************
    // Need to add search function for finding connecting rooms
    // --------------------------------------------------------
    // go through array, compare each room to the current location
    // with isConnected function. If a match is found, inform the
    // player that they entered the next Room and update the currentLocation
    // variable
    // ********************************************************
}
