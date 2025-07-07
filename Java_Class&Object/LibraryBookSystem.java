package level_1;
import java.util.*;
class Library{
	String author;
	String title;
	int price;
	int avail;
	
	Library(String author, String title, int price, int avail){
		this.author = author;
		this.title = title;
		this.price = price;
		this.avail = avail;
	}
	
	public void Availability(int ava){
		if(avail >= ava) {
			avail = avail - ava;
			System.out.println("Book borrowed successfully");
			System.out.println("Available Quantity: " + avail);
		}
		else {
			System.out.println("Not enough quantity");
		}
	}
	
	void Display() {
		System.out.println("Book Title: " + title + " | Author: " + author + " | Price: " + price + " | Availability: " + avail);
	}
}
public class LibraryBookSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library b1 = new Library("Charles Dickens", "A Tale of Two Cities", 242, 4);
		Library b2 = new Library("Harper Lee", "To Kill a Mockingbird", 299, 5);
		Library b3 = new Library("George Orwell", "1984", 350, 3);
		Library b4 = new Library("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 400, 6);
		Library b5 = new Library("F. Scott Fitzgerald", "The Great Gatsby", 275, 2);
		while(true) {
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Do you want to borrow a book: ");
			int c2 = sc.nextInt();
			if(c2 == 1) {
				System.out.print("1. ");
				b1.Display();
				System.out.print("2. ");
				b2.Display();
				System.out.print("3. ");
				b3.Display();
				System.out.print("4. ");
				b4.Display();
				System.out.print("5. ");
				b5.Display();
				System.out.print("Which book do you want to borrow: ");
				int c1 = sc.nextInt();
				int a = 0;
				switch(c1){
				case 1:
					System.out.print("How much quantity do you want to borrow: ");
					a = sc.nextInt();
					b1.Availability(a);
					break;
					
				case 2:
					System.out.print("How much quantity do you want to borrow: ");
					a = sc.nextInt();
					b2.Availability(a);
					break;
					
				case 3:
					System.out.print("How much quantity do you want to borrow: ");
					a = sc.nextInt();
					b3.Availability(a);
					break;
					
				case 4:
					System.out.print("How much quantity do you want to borrow: ");
					a = sc.nextInt();
					b4.Availability(a);
					break;
					
				case 5:
					System.out.print("How much quantity do you want to borrow: ");
					a = sc.nextInt();
					b5.Availability(a);
					break;
					
				default:
					System.out.println("Invalid choice");
				}
			}
			else if(c2 == 2) {
				break;
			}
			else {
				break;
			}
		}
	}
}
