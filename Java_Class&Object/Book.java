package level_1;
import java.util.*;
class BookDetails{
	String title;
	String author;
	int price;
	
	BookDetails(){
		this.title = "Life's Amazing Secrets";
		this.author = "Gaur Gopal Das";
		this.price = 169;
	}
		
	BookDetails(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void Display() {
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Price: " + price);
	}
}
public class Book {
	public static void main(String[] args) {
		System.out.println("Default Constructor");
		BookDetails b1 = new BookDetails();
		b1.Display();
		System.out.println("Parameterized Constructor");
		BookDetails b2 = new BookDetails("The Great Gatsby", "F. Scott Fitzgerald", 151);
		b2.Display();
	}
}
