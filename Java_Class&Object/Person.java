package level_1;
import java.util.*;
class PersonDetails{
	String name;
	double height;
	double weight;
	
	PersonDetails(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	PersonDetails(PersonDetails pp){
		this.name = pp.name;
		this.height = pp.height;
		this.weight = pp.weight;
	}
	void Display() {
		System.out.println("Name: " + name + " Height: " + height + " Weight: " + weight);
	}
}
public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String n = sc.nextLine();
		System.out.print("Enter height: ");
		double h = sc.nextDouble();
		System.out.print("Enter weight: ");
		double w = sc.nextDouble();
		PersonDetails p1 = new PersonDetails(n, h, w);
		System.out.println("Parameterized Constructor");
		p1.Display();
		PersonDetails p2 = new PersonDetails(p1);
		System.out.println("Copy Constructor");
		p2.Display();
	}
}
