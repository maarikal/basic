package week9.mooving.logic;

import week9.mooving.domain.Box;
import week9.mooving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box newBox = new Box(this.boxesVolume);
        for (Thing thing: things) {
            boolean added = newBox.addThing(thing);
            System.out.println(thing + " - " + added);
            if(!added) {
                boxes.add(newBox);
                newBox = new Box(this.boxesVolume);
                added = newBox.addThing(thing);
            }
        }
        boxes.add(newBox);
        return boxes;
    }
}
