package level_1;
import java.util.*;
class Radius{
	int r;
	
	Radius(){
		this.r = 14;
	}
	
	Radius(int r){
		this.r = r;
	}
	
	public double Area() {
		this.r = r;
		double a = 3.14 * r * r;
		return a;
	}
	
	void Display() {
		System.out.println("The Radius is: " + r);
	}
}
public class Circle {
	public static void main(String[] args) {
		Radius r1 = new Radius();
		System.out.println("Default Constructor");
		r1.Display();
		System.out.println("The Area is: " + r1.Area());
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		int r = sc.nextInt();
		Radius r2 = new Radius(r);
		System.out.println("Parameterized Constructor");
		r2.Display();
		System.out.println("The Area is: " + r2.Area());
	}
}
