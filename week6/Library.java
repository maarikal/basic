package week6;

import java.util.ArrayList;

public class Library {
    // sai tehtud ilma ArrayList väljatoomata, kuna ma ei tea, milline mu raamatukogu on
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book: this.books) {
            System.out.println(book);
        }
    }

}
