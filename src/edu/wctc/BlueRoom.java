package edu.wctc;

public class BlueRoom extends Room implements Exit{
    public BlueRoom(String name) {
        super(name);
    }

    @Override
    public String exit(Player player) {
        player.addToScore(1);
        return "You push the key into the small hole in the floor and turn. The wall to your right opens up to reveal a bustling city street. You are free.";
    }

    @Override
    public String getDescription() {
        return "You are in a cube-shaped room. Every surface is plastic-like and emits a neon blue glow. There is a small, pea-sized hole in the floor.";
    }
}
