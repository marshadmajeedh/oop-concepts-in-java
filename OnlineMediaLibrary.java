/* ## Online Media Library
A Java-based application that manages different types of media using interfaces and OOP principles.

### Features:
- Add Books, Movies, or Songs
- Display all media items
- Calculate total duration of content

### Technologies:
- Java
- OOP
- Interfaces

*/



import java.util.*;
interface MediaItem {
	
	String getTitle();
	String getCreator();
	double getDuration();
	
}

class Book implements MediaItem {
	
	private String title;
	private String author;
	private int pages;
	private double readingTimeInHours;
	
	public Book (String title, String author,int pages, double readingTimeInHours) {

		this.title = title;
		this.author = author;
		this.pages = pages;
		this.readingTimeInHours = readingTimeInHours;
		
	}
	
	@Override
	public String getTitle() {
		
		return title;
		
	}
	
	@Override
	public String getCreator() {
		
		return author;
		
	}
	
	@Override 
	public double getDuration() {
		
		return readingTimeInHours;
		
	}
	
}

class Movie implements MediaItem {
	
	private String title;
	private String director;
	private double durationInHours;
	
	public Movie (String title, String director, double  durationInHours) {

		this.title = title;
		this.director = director;
		this.durationInHours = durationInHours;
		
	}
	
	@Override
	public String getTitle() {
		
		return title;
		
	}
	
	@Override
	public String getCreator() {
		
		return director;
		
	}
	
	@Override 
	public double getDuration() {
		
		return durationInHours;
		
	}
	
}

class Song implements MediaItem {
	
	private String title;
	private String artist;
	private double durationInminutes;
	
	public Song (String title, String artist, double durationInminutes) {

		this.title = title;
		this.artist = artist;
		this.durationInminutes = durationInminutes;
		
	}
	
	@Override
	public String getTitle() {
		
		return title;
		
	}
	
	@Override
	public String getCreator() {
		
		return artist;
		
	}
	
	@Override 
	public double getDuration() {
		
		return durationInminutes / 60.0;
		
	}
	
}

class MediaLibrary {
	
	ArrayList<MediaItem> items = new ArrayList<>();
	
	
	public MediaLibrary (ArrayList<MediaItem> items) {
		
		this.items = items;
		
	}
	
	public void addMedia(MediaItem mt) {
		
		items.add(mt);
		
	}
	
/*Library Contents:
- Book: Atomic Habits by James Clear (2.5 hours)
- Movie: Inception by Christopher Nolan (2.8 hours)
- Song: Bohemian Rhapsody by Queen (0.35 hours)
*/
	
	public void displayLibrary() {
		System.out.println ("Library contents : ");
		
		for (MediaItem item : items) {
			
			String type = item instanceof Book ? "Book" :
						  item instanceof Movie ? "Movie" :
						  item instanceof Song ? "Song" : "Media";
						  
			System.out.println (" - "+type+" : "+item.getTitle()+" by "+item.getCreator()+" ("+item.getDuration()+" hours"+")");
			
		}
		System.out.println();
	}
	
	public double getTotalDuration() {
		
		double total = 0;
		
		for (MediaItem item : items) {
			
			total += item.getDuration();
			
		}
		
		return total;
		
	}
	
}

public class OnlineMediaLibrary {
	
	public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<MediaItem> items = new ArrayList<>();
		MediaLibrary ml = new MediaLibrary(items);
		
		String continueProgram;
		
		do {
			
			System.out.println ("Which media item do you want to add : ");
			System.out.println("1. "+"Book");
			System.out.println("2. "+"Movie");
			System.out.println("3. "+"Songs");
			System.out.println();
			
			System.out.print ("Enter choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				
				case 1 : 
						System.out.print ("Enter title : ");
						String title1 = sc.nextLine();
						
						System.out.print("Enter author name : ");
						String author = sc.nextLine();
						
						System.out.print("Enter total pages : ");
						int pages = Integer.parseInt(sc.nextLine());
						
						System.out.print("Enter estimated time to read the whole book, in hours: ");
						double readingTimeInHours = Double.parseDouble(sc.nextLine());
						
						MediaItem book = new Book (title1,author,pages,readingTimeInHours);
						ml.addMedia(book);
						System.out.println ("Added new book : "+book.getTitle()+" by "+book.getCreator());
						break;
						
				case 2 : 
						System.out.print ("Enter title : ");
						String title2 = sc.nextLine();
						
						System.out.print("Enter director  name : ");
						String director = sc.nextLine();
						
						System.out.print("Enter estimated time to watch the movie, in hours: ");
						double durationInHours = Double.parseDouble(sc.nextLine());
						
						MediaItem movie = new Movie (title2,director,durationInHours);
						ml.addMedia(movie);
						System.out.println ("Added new movie : "+movie.getTitle()+" by "+movie.getCreator());
						break;
						
				case 3 :
						System.out.print ("Enter title : ");
						String title3 = sc.nextLine();
						
						System.out.print("Enter artist name : ");
						String artist = sc.nextLine();
						
						System.out.print("Enter estimated time to listen the song, in minutes: ");
						double durationInminutes = Double.parseDouble(sc.nextLine());
						
						MediaItem song = new Song (title3,artist,durationInminutes);
						ml.addMedia(song);
						System.out.println ("Added new song : "+song.getTitle()+" by "+song.getCreator());
						break;
						
				default :
						System.out.println("Invalid choice, try to enter valid choice");
					
						
			}
			
			System.out.println();
			System.out.print("Do you want to continue using this library(y / n) :  ");
			continueProgram = sc.next();
			System.out.println();
			sc.nextLine();
		
		} while (continueProgram.equalsIgnoreCase("y"));
		
		ml.displayLibrary();
		System.out.println();
		System.out.println("Total duration : "+ml.getTotalDuration()+" hours");
	}
}




