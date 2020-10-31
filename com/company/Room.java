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
    
    // *********************************************************
    // UP or DOWN directions? Maybe??
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

    public String toString(){ // toString for the Rooms
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
 
    // *************************************************
    // UNSURE IF THIS ACTUALLY HELPS, NEEDS TO BE REWORKED OR MOVED
    // **************************************************
    // public boolean isConnected(Room otherRoom){  // returns true if the current room is connected to the otherRoom
    //     boolean found = false;                  

    //     if(this.getN() == otherRoom.getN() || this.getN() == otherRoom.getS() || this.getN() == other Room.getE() || this.getN() == otherRoom.getW()){
    //         found = true;
    //     } 
    //     else if (this.getS() == otherRoom.getN() || this.getS() == otherRoom.getS() || this.getS() == other Room.getE() || this.getS() == otherRoom.getW()){
    //         found = true;
    //     }
    //     else if(this.getE() == otherRoom.getN() || this.getE() == otherRoom.getS() || this.getE() == other Room.getE() || this.getE() == otherRoom.getW()){
    //         found = true;
    //     }
    //     else if(this.getW() == otherRoom.getN() || this.getW() == otherRoom.getS() || this.getW() == other Room.getE() || this.getW() == otherRoom.getW()){
    //         found = true;
    //     }

    //     return found;
    // }

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
    private Character playerChar;   // main character
    private ArrayList<Room> map;    // map of zork


    public Game() {
        playerChar = new Characters("Player","A scrawny character with tatterd clothes",20);
        // ^^ main character

        this.map = new ArrayList<Room>(); 
                                     //      N        S       E       W     
        map.add(new Room("Room1", "Starting Room", 1, Direction.noExit, Direction.noExit, Direction.noExit));
        map.add(new Room("Room2", "no description", Direction.noExit, 1, 2, 7));
        map.add(new Room("Room3", "no description",  Direction.noExit,3,Direction.noExit, 2));
        map.add(new Room("Room4", "no description",  3,4,Direction.noExit, Direction.noExit));
        map.add(new Room("Room5", "no description",  Direction.noExit,Direction.noExit,4, 5));
        map.add(new Room("Room6", "no description",  6,5,Direction.noExit, Direction.noExit));
        map.add(new Room("Room7", "no description",  Direction.noExit,6,7, 8));
        map.add(new Room("Room8", "no description",  8,9,Direction.noExit, Direction.noExit));
        map.add(new Room("Room9", "no description",  9,12,11,10));
        map.add(new Room("Room10", "no description",  Direction.noExit,Direction.noExit,Direction.noExit,10));
        map.add(new Room("Room11", "no description",  Direction.noExit,Direction.noExit,11, Direction.noExit));
        map.add(new Room("Room12", "no description",  12,Direction.noExit,Direction.noExit, Direction.noExit));

    }

    public ArrayList getMap() {
        return map;
    }

    void setMap(ArrayList<Room> theMap) {
        map = theMap;
    }

    public Characters getPlayer() {
        return playerChar;
    }

    public void setPlayer(Characters p) {
        playerChar = p;
    }

    private void moveCharacterTo(Characters p, Room aRoom)
     {
        p.setRoom(aRoom);
    }
        // From my understanding of the Room class, in each possible direction there is a number 
        // and that number does not corresponse to the index of the Room it is attached too but simply a numbered
        // connection. Such that, if you wanted to connect two Rooms, they must both share a numbered connection
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
    // given a VALID connection number (NOT -1)
    // search the map to find that other room
    // becareful to not accidentally match with the current room
    // returns the found room
    // ********************************************************
    // this is not checking for valid exits, need to do that before calling this method,
    // ie: if currentRoom.getE() returns -1, that means there is no exit that way
    // if there is no exit, DO NOT CALL THIS METHOD
    // public Room findOtherRoom(int connection){
    //     for(int i = 0; i< map.size(); ++i){

    //     }

    // }

}
