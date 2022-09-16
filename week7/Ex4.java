package week7;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("---- Exercise 4.1 -----");
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);

        System.out.println("-----Exercise 4.2 and 4.3 -----------");
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);

        System.out.println("----Exercise 4.4 -----");
        Suitcase suitcase1 = new Suitcase(10);
        suitcase1.addThing(book);
        suitcase1.addThing(mobile);
        suitcase1.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase1.printThings();
        System.out.println("Total weight: " + suitcase1.totalWeight() + " kg");

        System.out.println("----Exercise 4.5 -----");
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addThing(book);
        suitcase2.addThing(mobile);
        suitcase2.addThing(brick);

        Thing heaviest = suitcase2.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);

        System.out.println("----Exercise 4.6 -----");
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);

        System.out.println("----Exercise 4.7 -----");
        System.out.println("There are the following things in the container suitcases:");
        container.printThings();

        System.out.println("----Exercise 4.8 -----");
        Container container1 = new Container(1000);
        addSuitcasesFullOfBricks(container1);
        System.out.println(container1);
    }

    public static void addSuitcasesFullOfBricks(Container container1) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i <= 100; i++) {
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", i);
            suitcase.addThing(brick);

            container1.addSuitcase(suitcase);
        }
    }
}
