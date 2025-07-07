package level_1;
import java.util.*;
class Vehicle{
	String name;
	String type;
	static int fee = 8000;
	
	Vehicle(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public static void Update(int u) {
		fee = u;
		System.out.println("The Updated Registration Fees is: " + fee);
	}
	
	void Display() {
		System.out.println("Owner Name: " + name + " | Vehicle Type: " + type + " | Registration Fee: " + fee);
	}
}
public class VehicleRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Vehicle("John", "SUV");
		Vehicle v2 = new Vehicle("Sue", " Sedan");
		System.out.println("Vehicle Deatils");
		v1.Display();
		v2.Display();
		int u;
		while(true) {
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Do you want to update Registration Fees: ");
			int c = sc.nextInt();
			if(c == 2) {
				break;
			}
			else {
				System.out.print("Enter New Fees: ");
				u = sc.nextInt();
				Vehicle.Update(u);
				System.out.println("Vehicle Deatils");
				v1.Display();
				v2.Display();
			}
		}
	}
}
