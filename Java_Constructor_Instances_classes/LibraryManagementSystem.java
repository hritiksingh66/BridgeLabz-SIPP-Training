package level_1;
import java.util.*;
class Book{
	static String lname = "The Readers Library";
	String title;
	String author;
	final int ISBN;
	
	Book(String title, String author, int ISBN){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	void DisplayL() {
		System.out.println("Welcome to " + lname);
	}
	
	void Display() {
		System.out.println("Book Title: " + title + " | Author: " + author + " | ISBN: " + ISBN);
	}
}
public class LibraryManagementSystem {
	public static void main(String[] args) {
		Object b1 = new Book("To Kill a Mockingbird", "Harper Lee", 978006112);
		Object b2 = new Book("1984", "George Orwell", 978045152);
		Object b3 = new Book("Pride and Prejudice", "Jane Austen", 978014143);
		Object b4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 978074327);
		Object b5 = new Book("The Catcher in the Rye", "J.D. Salinger", 978031676);
		Object b6 = new String("Hello");
		if(b1 instanceof Book) {
			((Book) b1).DisplayL();
			System.out.println("Instance of Book");
			((Book) b1).Display();
		}
		
		((Book) b2).Display();
		((Book) b3).Display();
		((Book) b4).Display();
		((Book) b5).Display();
		
		if(b6 instanceof Book) {
			System.out.println("Instance of Book");
		}
		else {
			System.out.println("B6 Not an Instance of Book");
		}
	}
}
