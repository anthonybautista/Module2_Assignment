package edu.wctc;

public class PinkRoom extends Room {

    public PinkRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Another plastic cube of a room. What is this place? Every surface glows pink.";
    }
}
