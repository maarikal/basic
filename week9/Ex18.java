package week9;

import week9.mooving.domain.Box;
import week9.mooving.domain.Item;
import week9.mooving.logic.Packer;
import week9.mooving.domain.Thing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println("-----Exercise 18.1------");
        Thing item = new Item("toothbrash", 2);
        System.out.println(item);

        System.out.println("-----Exercise 18.2--------");
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);

        System.out.println("-----Exercise 18.3 and 18.4---------");
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));
        things.add(new Item("cup", 3));
        things.add(new Item("pillow", 10));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
        }
    }
}
