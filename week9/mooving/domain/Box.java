package week9.mooving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int capacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.capacity = maximumCapacity;
        things = new ArrayList<Thing>();
    }

    public boolean addThing (Thing thing) {
        if(thing.getVolume() <= this.capacity) {
            this.things.add(thing);
            this.capacity -= thing.getVolume();
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        String content = "";
        for (Thing thing: this.things) {
            content += "\t" + thing.toString() + "\n";
        }
        return content;
    }

    @Override
    public int getVolume() {
        int thingsCapacity = 0;
        for (Thing thing: this.things) {
            thingsCapacity += thing.getVolume();
        }
        return thingsCapacity;
    }
}
