public class Book {
    private String title;
    private String ISBN;
    private static int count = 0;
    public Book (String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
        count++;
    }

    public static int getCount() {
        return count;
    }
    public String getISBN() {
        return ISBN;
    }
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
    }
}
