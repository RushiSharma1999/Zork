enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public static final int noExit = -1;
};
class room {
    private String name;
    private String description;

    private int north, south, west, east;

    public room(String name, String description, int N, int S, int W, int E) {
        this.north = N;
        this.south = S;
        this.west = W;
        this.east = E;
    }
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = description;
    }
    public int getN() {
        return north;
    }

    public void setN(int N) {
        this.north = N;
    }

    // s
    public int getS() {
        return south;
    }

    public void setS(int S) {
        this.south = S;
    }

    // e
    public int getE() {
        return east;
    }

    public void setE(int E) {
        this.east = E;
    }

    // w
    public int getW() {
        return west;
    }

    void setW(int W) {
        this.west = W;
    }

}
class Game {
    private Character character;
    private ArrayList<room> map;

    public Game() {
        this.map = new ArrayList<room>();
        map.add(new room("room0", "Test1", Direction.noExit, 2, Direction.noExit, 1));
        map.add(new room("room1", "Test2", Direction.noExit, Direction.noExit, 0, Direction.noExit));

    }
}
