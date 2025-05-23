import java.util.*;
class Book {
	
	private int bookID ;
	private String author;
	private String genre;
	private int publicationYear;
	private int availableCopies;
	
	public Book (int bookID,String author, String genre, int publicationYear, int availableCopies) {
		
		this.author = author;
		this.genre = genre;
		this.publicationYear = publicationYear;
		this.availableCopies = availableCopies;
		this.bookID = bookID;
	}
	
	public Book () {
		
		this.author = "Unknown";
		this.genre = "Unassigned";
		this.publicationYear = 0;
		this.availableCopies = 0;
		
	}
	
	public int getBookID() {
		
		return bookID;
		
	}
	
	public String getAuthor() {
		
		return author;
		
	}
	
	public String getGenre() {
		
		return genre;
		
	}
	
	public int getAvailableCopies() {
		
		return availableCopies;
		
	}
	
	public int getPublicationYear() {
		
		return publicationYear;
		
	}
	
	public void decreaseAvailableCopies() {
		
		if (availableCopies > 0) {
			
			availableCopies--;
			return;
			
		}
		
	}
	
	public void increaseAvailableCopies() {
		
		availableCopies++;
		
	}
	
	public void displayBookDetails() {
		
		System.out.println ("Book id : "+bookID);
		System.out.println ("author name : "+author);
		System.out.println ("Genre : "+genre);
		System.out.println ("Publication year : "+publicationYear);
		System.out.println ("Available copies : "+availableCopies);
		
	}
	
	public String toString() {
		
		return "Book id : "+bookID+"\n"+
		"author name : "+author+"\n"+
		"Genre : "+genre+"\n"+
		"Publication year : "+publicationYear+"\n"+
		"Available copies : "+availableCopies+"\n";
		
	}
	
}

class LibraryCatalog {
	
	ArrayList<Book>catalog;
	
	public LibraryCatalog() {
		
		this.catalog = new ArrayList<>();
		
	}
	
	public void addBook (Book book) {
		
		catalog.add(book);
	
	}
	
	public Book searchBook (int bookID) {
		
		for (int i = 0; i < catalog.size(); i++) {
			
			if (bookID == catalog.get(i).getBookID()) {

				return catalog.get(i);

			} 
			
		}
		
		System.out.println ("Couldn't find the book : given "+bookID+" is not in the catalog");
		return null;
	}
	
	public Book borrowBook(int bookID) {
		
		for (int i = 0; i < catalog.size(); i++) {
			
			if (bookID == catalog.get(i).getBookID()) {
				
				catalog.get(i).decreaseAvailableCopies();
				return catalog.get(i);
				
			} 
			
		}
		
		System.out.println ("Cannot borrow : there is no available copies");
		return null;
	}
	
	public Book returnBook (int bookID) {
		
		for (int i = 0; i < catalog.size(); i++) {
			
			if (bookID == catalog.get(i).getBookID()) {
				
				catalog.get(i).increaseAvailableCopies();
				return catalog.get(i);
			} 
			
		}
		
		System.out.println ("Couldn't returned the book : "+bookID+" was not in our catalog");
		return null;
	}
	
	public void displayCatalog() {
		
		System.out.println ("Displaying catalog : ");
		for (Book b : catalog) {
			
			System.out.println (b);
			
		}
		
		System.out.println();
		
	}
}

public class LibraryApp {
	public static void main (String...args) {
		
		
		Book b1 = new Book (1,"Marshad","Sci-Fi",2024,4);
		Book b2 = new Book (2,"Ilham","Comedy",2023,3);
		Book b3 = new Book (3,"Aqeel","Crime",2022,5);
		Book b4 = new Book (4,"Nafris","Horror",2021,6);
		Book b5 = new Book (5,"Shilmy","Thriller",2020,7);
		
		LibraryCatalog lc = new LibraryCatalog();
		
		lc.addBook(b1);
		lc.addBook(b2);
		lc.addBook(b3);
		lc.addBook(b4);
		lc.addBook(b5);
		
		System.out.println ("searching book by ID : "+"\n"+lc.searchBook(3));
		
		System.out.println ("You have borrowed this book: "+"\n"+lc.borrowBook(4));
		
		System.out.println ("You have returned this book: "+"\n"+lc.returnBook(1));
		
		lc.displayCatalog();
		
	}
	
}
	
	
	