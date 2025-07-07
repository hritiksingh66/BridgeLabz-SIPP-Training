package level_1;
import java.util.*;
class Product{
	String name;
	int price;
	static int pc = 0;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		pc++;
	}
	
	void Display() {
		System.out.println("Product Added Successfully");
		System.out.println("Product Name: " + name + " Product Price: " + price);
	}
	
	public static void Total() {
		System.out.println("Total Products created: " + pc);
	}
}
public class ProductInventory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		int p;
		System.out.print("Enter Product Name: ");
		n = sc.nextLine();
		System.out.print("Enter Product Price: ");
		p = sc.nextInt();
		Product p1 = new Product(n, p);
		p1.Display();
		sc.nextLine();
		System.out.print("Enter Product Name: ");
		n = sc.nextLine();
		System.out.print("Enter Product Price: ");
		p = sc.nextInt();
		Product p2 = new Product(n, p);
		p2.Display();
		sc.nextLine();
		System.out.print("Enter Product Name: ");
		n = sc.nextLine();
		System.out.print("Enter Product Price: ");
		p = sc.nextInt();
		Product p3 = new Product(n, p);
		p3.Display();
		sc.nextLine();
		System.out.print("Enter Product Name: ");
		n = sc.nextLine();
		System.out.print("Enter Product Price: ");
		p = sc.nextInt();
		Product p4 = new Product(n, p);
		p4.Display();
		Product.Total();
	}
}
