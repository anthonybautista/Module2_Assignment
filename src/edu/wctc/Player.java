package edu.wctc;


import java.util.ArrayList;
import java.util.List;

public class Player {
    int score = 0;
    List<String> inventory = new ArrayList<>();
    boolean grate = false;

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int point) {
        score += point;
    }

    public String getInventory() {
        String inv = "You have nothing in your inventory.";
        if (inventory.size() > 0) {
            inv = "Your inventory: " + inventory.toString();
        }
        return inv;
    }

    public int getScore() {
        return score;
    }

    public boolean keyCheck() {
        return inventory.contains("key");
    }

    public boolean grateCheck() {
        return grate;
    }
}