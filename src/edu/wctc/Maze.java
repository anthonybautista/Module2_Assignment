package edu.wctc;

public class Maze {
    Room currentRoom;
    Player player;
    boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;

        Room blue = new BlueRoom("Blue Room");
        Room green = new GreenRoom("Green Room");
        Room pink = new PinkRoom("Pink Room");
        Room yellow = new YellowRoom("Yellow Room");

        blue.setNorth(pink);
        blue.setWest(green);
        green.setEast(blue);
        green.setNorth(yellow);
        yellow.setSouth(green);
        yellow.setEast(pink);
        pink.setWest(yellow);
        pink.setSouth(blue);

        currentRoom = blue;
    }

    public String exitCurrentRoom() {
        String str = "";
        if (player.keyCheck()) {
            if (currentRoom instanceof Exit) {
                str = ((Exit)currentRoom).exit(player);
                isFinished = true;
            } else {
                str = "You cannot exit this room.";
            }
        } else {
            str = "You cannot exit this room.";
        }
        return str;
    }

    public String interactWithCurrentRoom() {
        String str = "";
        if (currentRoom instanceof Interactable) {
            str = ((Interactable)currentRoom).interact(player);
        } else {
            str = "You cannot interact with this room.";
        }
        return str;
    }

    public String lootCurrentRoom() {
        String str = "";
        if (player.grateCheck()) {
            if (currentRoom instanceof Lootable) {
                str = ((Lootable)currentRoom).loot(player);
            } else {
                str = "You cannot loot this room.";
            }
        } else {
            str = "You cannot loot this room.";
        }
        return str;
    }

    public boolean move(char direction) {
        boolean valid = currentRoom.isValidDirection(direction);
        if (valid) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
        }
        return valid;
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}
