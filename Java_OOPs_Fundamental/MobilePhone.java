package level_1;
import java.util.*;
class Mobile{
	String brand;
	String model;
	int price;
	
	Mobile(String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void Display() {
		System.out.println("Mobile brand: " + brand + " Model: " + model + " Price: " + price);
	}
}
public class MobilePhone {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("IQOO", "9SE", 40000);
		Mobile m2 = new Mobile("Apple", "14 Pro", 70000);
		m1.Display();
		m2.Display();
	}
}
