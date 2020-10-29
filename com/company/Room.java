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
    // array of items
    // array monsters
    // main character?

    private int north, south, west, east;

    public Room(String name, String description, int N, int S, int W, int E) {
        this.north = N;
        this.south = S;
        this.west = W;
        this.east = E;
    }

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

    void setW(int W) {                  // setter function
        this.west = W;
    }

}

//=====================================================================
// Game class - for testing purposes
//=====================================================================
class Game {
    private Character character; // main character?
    private ArrayList<room> map;
    // need an Items arralist

    public Game() {
        this.map = new ArrayList<room>();
        map.add(new Room("room0", "Test1", Direction.noExit, 2, Direction.noExit, 1));
        map.add(new Room("room1", "Test2", Direction.noExit, Direction.noExit, 0, Direction.noExit));

    }
}
