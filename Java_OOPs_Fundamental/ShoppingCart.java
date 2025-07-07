package level_1;
import java.util.*;
class CartItem{
	ArrayList<String> cart = new ArrayList<>();
	String name;
	int pr;
	int qu = 0;
	
	CartItem(String name, int pr){
		this.name = name;
		this.pr = pr;
	}
	
	void Add(int quant){
		qu = qu + quant;
		this.name = name;
		this.pr = pr;
		this.qu = qu;
		String item = name + "-> Price: " + pr + " Quantity: " + qu;
		cart.add(item);
		System.out.println(name + " is added to the cart");
	}
	
	void Remove(int quant) {
		this.name = name;
		this.pr = pr;
		this.qu = qu;
		String item = name + "-> Price: " + pr + " Quantity: " + qu;
		if(qu == 0) {
			System.out.println("No items to remove");
		}
		else if(qu >= quant) {
			qu = qu - quant;
			cart.remove(item);
			System.out.println(name + " is removed from the cart");
		}
		else if(qu != 0){
			System.out.println("Not enough quantity to remove");
		}
		else {
			System.out.println(name + " not found in cart");
		}
	}
	
	void Total() {
		int t = pr * qu;
		System.out.println("The total cost is: " + t);
	}
	void Display() {
		if(qu == 0) {
			System.out.println("Cart is Empty");
		}
		else {
			System.out.println("Cart");
			System.out.println("+-------------------------------------------+");
			System.out.println(name + " -> Price: " + pr + " Quantity " + qu);
		}
	}
	
}
public class ShoppingCart {
	public static void main(String[] args) {
		System.out.println("Milk -> Price: 100");
		System.out.println("1. Add Item to Cart");
		System.out.println("2. Remove Item from Cart");
		System.out.println("3. Display Total Cost");
		System.out.println("4. Display Cart");
		System.out.println("0. Exit");
		CartItem i = new CartItem("Milk", 100);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("What do you want to do: ");
			int c = sc.nextInt();
			if(c == 0) break;
			int tq = 0;
			int q;
			switch(c) {
			case 1:
				System.out.print("How much quantity you want: ");
				q = sc.nextInt();
				i.Add(q);
				tq = tq + q;
				break;
				
			case 2:
				System.out.print("How much quantity you want to remove: ");
				q = sc.nextInt();
				i.Remove(q);
				tq = tq - q;
				break;
				
			case 3:
				i.Total();
				break;
				
			case 4:
				i.Display();
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
