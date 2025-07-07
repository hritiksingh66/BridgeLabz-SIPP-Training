package level_1;
import java.util.*;
class Vehicle{
	static int fee = 10000;
	String name;
	String type;
	final int number;
	
	Vehicle(String name, String type, int number){
		this.name = name;
		this.type = type;
		this.number = number;
	}
	
	static void Update(int u) {
		fee = u;
		System.out.println("The Updated Registration Fees is: " + fee);
	}
	
	void Display() {
		System.out.println("Vehicle Number: " + number + " | Owner Name: " + name + " | Vehicle Type: " + type + " | Registration Fee (₹): " + fee);
	}
}
public class VehicleRegistrationSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Vehicle("John Doe", "Car", 12345);
		Vehicle v2 = new Vehicle("Alice Smith", "Motorcycle", 67890);
		Vehicle v3 = new Vehicle("Bob Brown", "Truck", 11223);
		Vehicle v4 = new Vehicle("Carol White", "SUV", 44556);
		Vehicle v5 = new Vehicle("David Green", "Bicycle", 78901);
		Object v6 = new String("Hello");
		if(v1 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
			v1.Display();
		}
		if(v2 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
			v2.Display();
		}
		if(v3 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
			v3.Display();
		}
		if(v4 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
			v4.Display();
		}
		if(v5 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
			v5.Display();
		}
		if(v6 instanceof Vehicle) {
			System.out.println("Instance of Vehicle");
		}
		else {
			System.out.println("V6 Not an Instance of Vehicle");
		}
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print("Do you want to update the registration fees: ");
		int c = sc.nextInt();
		if(c == 1) {
			System.out.print("Enter new Registration Fees: ");
			int u = sc.nextInt();
			Vehicle.Update(u);
			v1.Display();
			v2.Display();
			v3.Display();
			v4.Display();
			v5.Display();
		}
		else if(c == 2){
			System.out.println("Exit");
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
}
