//
//  AUTHORS:        Julia, Tran, and Rushi
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


//=====================================================================
// Direction enum
//=====================================================================
enum Direction {
    NORTH, // 0
    SOUTH, // 1
    EAST,  // 2
    WEST;  // 3

    public static final int noExit = -1;
};

//=====================================================================
// Room class
//=====================================================================
class Room {
    private String name;
    private String description;

    

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

//=====================================================================
// Game class 
//=====================================================================
class Game {
    private Character player;    // main character
    private ArrayList<Room> map; // map of zork
    // private int currentLoation;  // this is the index of the room the player is in?


    public Game() {
        this.map = new ArrayList<Room>();
        map.add(new Room("room0", "Test1", Direction.noExit, 2, Direction.noExit, 1));
        map.add(new Room("room1", "Test2", Direction.noExit, Direction.noExit, 0, Direction.noExit));
        // From my understanding of the Room class, in each possible direction there is a number 
        // and that number does not corresponse to the index of the Room it is attached too but simply a numbered
        // connection. Such that, if you wanted to connect two Rooms, they must both share a numbered direction
        // The two Rooms above are not connected.
        // ex. of connected Rooms:
        //                                      NORTH               SOUTH               EAST             WEST
        //  map.add(new Room("room3", "Test3",  3,                  Direction.noExit, Direction.noExit, Direction.noExit));
        //  map.add(new Room("room4", "Test4",  Direction.noExit,   3,                Direction.noExit, Direction.noExit));
        // room4 is to the North of room3. 
        // room3 is to the south of room4.
        //

    }
}
