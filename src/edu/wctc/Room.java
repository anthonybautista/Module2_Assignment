package edu.wctc;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char dir) {
            return switch (dir) {
                case 'n' -> north;
                case 's' -> south;
                case 'e' -> east;
                case 'w' -> west;
                case 'u' -> up;
                default -> down;
            };
    }

    public String getExits() {
        String exits = "Exits are ";
        if (isValidDirection('n')) {
            exits = exits + "North (n), ";
        }
        if (isValidDirection('s')) {
            exits = exits + "South (s), ";
        }
        if (isValidDirection('e')) {
            exits = exits + "East (e), ";
        }
        if (isValidDirection('w')) {
            exits = exits + "West (w), ";
        }
        if (isValidDirection('u')) {
            exits = exits + "up (u), ";
        }
        if (isValidDirection('d')) {
            exits = exits + "down (d). ";
        }
        return exits;
    }

    public boolean isValidDirection(char dir) {
        return getAdjoiningRoom(dir) != null;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}
