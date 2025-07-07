package level_1;
import java.util.*;
class Student{
	public int roll;
	protected String name;
	private double CGPA;
	
	Student(int roll, String name, double CGPA){
		this.name = name;
		this.roll = roll;
		this.CGPA = CGPA;
	}
	
	public void Update(double c) {
		CGPA = c;
		System.out.println("The Updated CGPA is: " + CGPA);
	}
	
	void Display() {
		System.out.println("Name: " + name + " | Roll No. " + roll + " | CGPA: " + CGPA);
	}
}

class Post extends Student{
	Post(int roll, String name, double CGPA){
		super(roll, name, CGPA);
	}
	
	void Display() {
		super.Display();
		System.out.println("This is Postgraduate Student");
	}
}
public class UniversityManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student p2 = new Student(628, "Divya", 8);
		p2.Display();
		Post p1 = new Post(628, "Divya", 8);
		System.out.print("Enter new CGPA: ");
		double c = sc.nextDouble();
		p1.Update(c);
		p1.Display();
	}
}
