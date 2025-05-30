package model;

import validator.VaildateNumOfCopies;

public class Book {

    private String bookID;
    private String bookName;
    private String author;
    private int numOfAvailableCopies;

    public Book(String bookID, String bookName, String author, int numOfAvailableCopies) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.numOfAvailableCopies = numOfAvailableCopies;
        System.out.println("Book created successfully");
    }

    public void lendBook(int numOfCopies) {

       VaildateNumOfCopies.validateNumOfCopies(numOfCopies, numOfAvailableCopies);
       numOfAvailableCopies -= numOfCopies;
       System.out.println("Book lent successfully");
    }

    public void displayBookDetails() {

        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Number of available copies: " + numOfAvailableCopies);
    }

}
