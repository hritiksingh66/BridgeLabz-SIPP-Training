package level_1;
import java.util.*;
class Product{
	static int discount = 20;
	String name;
	int price;
	int quant;
	final int ID;
	
	Product(String name, int price, int quant, int ID){
		this.name = name;
		this.price = price;
		this.quant = quant;
		this.ID = ID;
	}
	
	public void Update(int d) {
		this.discount = d;
		System.out.println("The Updated Discount is: " + discount);
	}
	
	void Display() {
		System.out.println("Product ID: " + ID + " | Name: " + name + " | Price: " + price + " | Quantity: " + quant + " | Discount(%): " + discount);
	}
}
public class ShoppingCartSystem {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 1500, 50, 101);
		Product p2 = new Product("Smartphone", 800, 200, 102);
		Product p3 = new Product("Headphones", 150, 150, 103);
		Product p4 = new Product("Smartwatch", 250, 80, 104);
		Product p5 = new Product("Tablet", 400, 120, 105);
		Object p6 = new String("Hello");
		int d;
		Scanner sc = new Scanner(System.in);
		if(p1 instanceof Product) {
			System.out.println("Instance of Product");
			System.out.print("1. ");
			p1.Display();
		}
		if(p2 instanceof Product) {
			System.out.println("Instance of Product");
			System.out.print("2. ");
			p2.Display();
		}
		if(p3 instanceof Product) {
			System.out.println("Instance of Product");
			System.out.print("3. ");
			p3.Display();
		}
		if(p4 instanceof Product) {
			System.out.println("Instance of Product");
			System.out.print("4. ");
			p4.Display();
		}
		if(p5 instanceof Product) {
			System.out.println("Instance of Product");
			System.out.print("5. ");
			p5.Display();
		}
		if(p6 instanceof Product) {
			System.out.println("Instance of Product");
		}
		else {
			System.out.println("E6 Not an Instance of Product");
		}
		while(true) {
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Do you want to Update the Discount: ");
			int c1 = sc.nextInt();
			if(c1 == 2) {
				break;
			}
			switch(c1) {
			case 1:
				System.out.print("Which Product do you want to Update: ");
				int c2 = sc.nextInt();
				switch(c2) {
				case 1:
					System.out.print("Enter new Discount: ");
					d = sc.nextInt();
					p1.Update(d);
					p1.Display();
					break;
					
				case 2:
					System.out.print("Enter new Discount: ");
					d = sc.nextInt();
					p2.Update(d);
					p2.Display();
					break;
					
				case 3:
					System.out.print("Enter new Discount: ");
					d = sc.nextInt();
					p3.Update(d);
					p3.Display();
					break;
				
				case 4:
					System.out.print("Enter new Discount: ");
					d = sc.nextInt();
					p4.Update(d);
					p4.Display();
					break;
					
				case 5:
					System.out.print("Enter new Discount: ");
					d = sc.nextInt();
					p5.Update(d);
					p5.Display();
					break;
				}
			case 2:
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
