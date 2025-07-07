package level_1;
import java.util.*;
class Employee{
	String Name;
	String ID;
	int Salary;
		
	Employee(String Name, String ID, int Salary){
		this.Name = Name;
		this.Salary = Salary;
		this.ID = ID;
	}
		
	void Display() {
		System.out.println("The Employee name is " + Name + " ID is " + ID + " salary is " + Salary);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
	    Employee emp1 = new Employee("John", "101", 60000);
	    Employee emp2 = new Employee("Massey", "102", 50000);
	    emp1.Display();
	    emp2.Display();
    }
}