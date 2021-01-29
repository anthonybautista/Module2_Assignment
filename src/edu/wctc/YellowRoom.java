package edu.wctc;

public class YellowRoom extends Room implements Interactable, Lootable{

    public YellowRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You have entered yet another dystopian, cubic room. This one glows a yellow almost too bright to bare. You squint your eyes to look around and see a metal grate on the ceiling.";
    }

    @Override
    public String interact(Player player) {
        player.grate = true;
        player.addToScore(1);
        return "You reach up and push on the metal grate which causes it to come loose and fall, nearly hitting you. There is a hole in the ceiling where the grate once was.";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("key");
        player.addToScore(1);
        return "You reach your hand up into the hole where the grate once was. You find a small, round key!";
    }
}
