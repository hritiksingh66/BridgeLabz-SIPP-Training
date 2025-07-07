package level_1;
import java.util.*;
class Employee{
	public int employeeID;
	protected String department;
	private int salary;
	
	Employee(int employeeID, String department){
		this.employeeID = employeeID;
		this.department = department;
	}
	
	public void Set(int sa) {
		this.salary = sa;
	}
	
	public int Get() {
		return salary;
	}
	
	public void Update() {
		System.out.println("The Updated Salary is: " + salary);
	}
}

class Manager extends Employee{
	Manager(int employeeID, String department){
		super(employeeID, department);
	}
	
	void Display() {
		System.out.println("Employee ID: " + employeeID + " | Department: " + department + " | Salary: " + Get());
	}
}
public class EmployeeRecords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m1 = new Manager(256, "Accounts");
		m1.Set(45000);
		System.out.println("Employee Details");
		m1.Display();
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print("Do you want to Update Salary: ");
		int c = sc.nextInt();
		int s;
		switch(c) {
		case 1:
			System.out.print("Enter new Salary: ");
			s = sc.nextInt();
			m1.Set(s);
			m1.Update();
			System.out.println("Employee Details");
			m1.Display();
			break;
			
		case 2:
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
	}
}
