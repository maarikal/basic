package week6;

import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);

        System.out.println("------ Exercise 101.1 --------");
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);

        System.out.println();
        System.out.println("------ Exercise 101.2 --------");
        Library Library = new Library();
        Library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();

        System.out.println();
        System.out.println("------ Exercise 101.3 --------");
        Library Library2 = new Library();

        Library2.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library2.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library2.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library2.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        System.out.println("Search by title: ");
        ArrayList<Book> result = Library2.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }

        System.out.println("Search by Publisher: ");
        for (Book book: Library2.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("Search by Year: ");
        for (Book book: Library2.searchByYear(1851)) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("------ Exercise 101.4 --------");
        Library Library4 = new Library();

        Library4.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library4.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library4.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library4.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library4.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library4.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}
