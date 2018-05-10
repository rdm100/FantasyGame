package room;

import behaviours.IBelongInRoom;

import java.util.ArrayList;

public abstract class Room{

    private String name;
    private ArrayList roomContains;

    public Room(String name) {
        this.name = name;
        this.roomContains = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList getRoomContains(){
        ArrayList copyRoomContains = new ArrayList<>(roomContains);
        return copyRoomContains;
    }

    public void addObjectToRoom(IBelongInRoom item){
        roomContains.add(item);
    }

    public void removeObjectToRoom(IBelongInRoom item){
        roomContains.remove(item);
    }


}
