package UdemyJava.Book;// Java program to Illustrate Concept of Composition

// Importing required classes
import java.io.*;
import java.util.*;

// Class 1
// Helper class
// Book class
class Book{
    public String book;
    public String author;

    public Book(String book, String author) {
        this.book = book;
        this.author = author;
    }
}

// Class 2
// Helper class
// Library class contains list of books.
class Library{
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getListOfBooksInLibrary(){
        return books;
    }


}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating the objects of class 1 (Book class)
        // inside main() method
        Book book1 = new Book("Atomic Habits","Mavlonbek");
        Book book2 = new Book("Change Your Mind","Mavlonbek");
        Book book3 = new Book("Hammasi Yaxshi Bo'ladi","Mavlonbek");


        // Creating the list which contains the
        // no. of books.
        List<Book>  books = new ArrayList<Book>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        // Creating an object of class 2
        Library library = new Library(books);

        // Calling method of class 2 and storing list of
        // books in List Here List is declared of type
        // Books(user-defined)
        List<Book>book = library.getListOfBooksInLibrary();

        // Iterating over for each loop
        for (Book bk : books) {

            // Print and display the title and author of
            // books inside List object
            System.out.println("Title : " + bk.book
                    + " and "
                    + " Author : " + bk.author);
        }
    }
}
