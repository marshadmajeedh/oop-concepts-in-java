import java.util.ArrayList;
import java.util.Scanner;

public class BookInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String isbn;
        String title;

        ArrayList<Book> books = new ArrayList<>();

        do {
            System.out.println("Enter ISBN: ");
            isbn = sc.nextLine();

            System.out.println("Enter Title: ");
            title = sc.nextLine();

            if (!isbn.equalsIgnoreCase("-99")) {
                Book book = new Book(title, isbn);
                books.add(book);
            }
            System.out.println();

        } while (!isbn.equalsIgnoreCase("-99"));

        System.out.println("\nEnter a ISBN of a book to remove from the inventory: ");
        String isbnToRemove = sc.nextLine();

        boolean isAvailable = false;
        for (Book b : books) {

            if (b.getISBN().equals(isbnToRemove)) {

                books.remove(b);
                System.out.println("Book removed successfully.");
                isAvailable = true;
                break;

            }
        }

        if (!isAvailable) {
            System.out.println("ISBN not found. No book removed");
        }

        System.out.println("\nInventory book count : ");
        System.out.println (Book.getCount());

        System.out.println("\nInventory book list: ");
        int count = 1;
        for (Book b : books) {
            System.out.println(count + ". book ");
            b.displayBook();
            count++;
            System.out.println();
        }

    }
}
