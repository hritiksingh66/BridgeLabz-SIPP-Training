package level_1;
import java.util.*;
class Circle{
	double radius;
	double area;
	double circum;
	
	Circle(double radius){
		this.radius = radius;
		this.area = 3.14 * radius * radius;
		this.circum = 2 * 3.14 * radius;
	}
	void Display() {
		System.out.println("The area of circle is: " + area);
		System.out.println("The circumference of circle is: " + circum);
	}
}

public class AreaAndCircumference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		Circle r1 = new Circle(r);
		r1.Display();
	}
}
