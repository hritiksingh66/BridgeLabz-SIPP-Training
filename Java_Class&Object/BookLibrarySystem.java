package level_1;
import java.util.*;
class BL{
	public int ISBN;
	protected String title;
	private String Author;
	
	BL(int ISBN, String title){
		this.ISBN = ISBN;
		this.title = title;
	}
	
	public void Set(String Author) {
		this.Author = Author;
	}
	
	public String Get() {
		return Author;
	}
}

class EBook extends BL{
	EBook(int ISBN, String title){
		super(ISBN, title);
	}
	
	void Display() {
		System.out.println("Book Title: " + title);
		System.out.println("ISBN: " + ISBN);
		System.out.println("Author: " + Get());
	}
}
public class BookLibrarySystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EBook e1 = new EBook(41235, "Harry Porter");
		e1.Set("JK Rowling");
		e1.Display();
		System.out.println("Update Author Name: ");
		String u = sc.nextLine();
		e1.Set(u);
		e1.Display();
	}
}
