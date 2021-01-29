package edu.wctc;

public class GreenRoom extends Room {

    public GreenRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in another cube-shaped room, only this time the room glows bright green. This room seems colder than the last.";
    }
}
