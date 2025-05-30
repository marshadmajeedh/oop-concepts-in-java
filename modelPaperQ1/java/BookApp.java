import exception.AvailableCopiesAreInSuffecientException;
import model.Book;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        Book[] book = new Book[2];
        do {

            System.out.println("Enter book ID: ");
            String bookID = sc.nextLine();

            System.out.println("Enter book name: ");
            String bookName = sc.nextLine();

            System.out.println("Enter author: ");
            String author = sc.nextLine();

            System.out.println("Enter number of available copies: ");
            int numOfAvailableCopies = sc.nextInt();
            sc.nextLine();

            book[i] = new Book(bookID, bookName, author, numOfAvailableCopies);

            i++;

        } while (i < 2);

        while (true) {

            try {
                System.out.println("Lending book for obj 1 : ");
                System.out.println("Enter number of copies to be lent: ");
                int nCopies1 = sc.nextInt();
                sc.nextLine();
                book[0].lendBook(nCopies1);
                break;
            } catch (AvailableCopiesAreInSuffecientException e) {

                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {

            try {
                System.out.println("Lending book for obj 2 : ");
                System.out.println("Enter number of copies to be lent: ");
                int nCopies2 = sc.nextInt();
                book[1].lendBook(nCopies2);
                break;
            } catch (AvailableCopiesAreInSuffecientException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (Book b : book) {
            b.displayBookDetails();
            System.out.println();
        }
    }
}
