package level_1;
import java.util.*;
class Item{
	String code;
	String name;
	int price;
	int quant;
	int total;
	
	Item(String code, String name, int price, int quant){
		this.code = code;
		this.name = name;
		this.price = price;
		this.quant = quant;
		this.total = quant * price;
	}
	void Display() {
		System.out.println("Item code: " + code + " item name: " + name + " item price: " + price + " item quantity: " + quant);
		System.out.println("The total price is " + total);
	}
}
public class TrackInventoryOfItems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int q = sc.nextInt();
		Item item1 = new Item("101","Soap", 25, q);
		item1.Display();
	}
}
