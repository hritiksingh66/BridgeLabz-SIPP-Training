package level_1;
import java.util.*;
class Employee{
	static String cname = "TCS";
	String name;
	final int id;
	String des;
	static int ec = 0;
	
	Employee(String name, int id, String des){
		this.name = name;
		this.id = id;
		this.des = des;
		ec++;
	}
	
	static void Count() {
		System.out.println("The Total Employees are: " + ec);
	}
	
	void Diplay() {
		System.out.println("Employee ID: " + id + " | Name: " + name + " | Designation: " + des + " | Company: " + cname);
	}
}
public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee e1 = new Employee("Alice Johnson", 101, "Software Engineer");
		Employee e2 = new Employee("Bob Smith", 102, "Project Manager");
		Employee e3 = new Employee("Carol White", 103, "UI/UX Designer");
		Employee e4 = new Employee("David Brown", 104, "QA Analyst");
		Employee e5 = new Employee("Eva Green", 105, "Data Scientist");
		Object e6 = new String("Hello");
		if(e1 instanceof Employee) {
			System.out.println("Instance of Employee");
			e1.Diplay();
		}
		if(e2 instanceof Employee) {
			System.out.println("Instance of Employee");
		    e2.Diplay();
		}
		if(e3 instanceof Employee) {
			System.out.println("Instance of Employee");
		    e3.Diplay();
		}
		if(e4 instanceof Employee) {
			System.out.println("Instance of Employee");
		    e4.Diplay();
		}
		if(e5 instanceof Employee) {
			System.out.println("Instance of Employee");
		    e5.Diplay();
		}
		if(e6 instanceof Employee) {
			System.out.println("Instance of Employee");
		}
		else {
			System.out.println("E6 Not an Instance of Employee");
		}
	}
}
