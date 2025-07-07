package level_1;
import java.util.*;
class Student{
	static String uname = "GLA University";
	String name;
	final int roll;
	char Grade;
	static int ts = 0;
	
	Student(String name, int roll, char Grade){
		this.name = name;
		this.roll = roll;
		this.Grade = Grade;
		ts++;
	}
	
	static void Total(){
		System.out.println("Total Students are: " + ts);
	}
	
	void Display() {
		System.out.println("Student Roll Number: " + roll + " | Name: " + name + " | Grade: " + Grade + " | University: " + uname);
	}
}
public class UniversityStudentManagement {
	public static void main(String[] args) {
		Student s1 = new Student("John Doe", 101, 'A');
		Student s2 = new Student("Alice Smith", 102, 'B');
		Student s3 = new Student("Bob Brown", 103, 'A');
		Student s4 = new Student("Charlie White", 104, 'C');
		Student s5 = new Student("Diana Green", 105, 'B');
		Object s6 = new String("Hello");
		if(s1 instanceof Student) {
			System.out.println("Instance of Student");
			s1.Display();
		}
		if(s2 instanceof Student) {
			System.out.println("Instance of Student");
			s2.Display();
		}
		if(s3 instanceof Student) {
			System.out.println("Instance of Student");
			s3.Display();
		}
		if(s4 instanceof Student) {
			System.out.println("Instance of Student");
			s4.Display();
		}
		if(s5 instanceof Student) {
			System.out.println("Instance of Student");
			s5.Display();
		}
		if(s6 instanceof Student) {
			System.out.println("Instance of Student");
		}
		else{
			System.out.println("S6 Not an Instance of Student");
		}
	}
}
