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
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}