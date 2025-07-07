package level_1;
import java.util.*;
class Patient{
	static String hname = "Appolo Superspeciality Hospital";
	String name;
	int age;
	String ail;
	final int ID;
	static int tp = 0;
	
	Patient(String name, int age, String ail, int ID){
		this.name = name;
		this.age = age;
		this.ail = ail;
		this.ID = ID;
		tp++;
	}
	
	static void TP() {
		System.out.println("Total Patients are: " + tp);
	}
	
	void Display() {
		System.out.println("Patient ID: " + ID + " | Name: " + name + " | Age: " + age + " | Ailment: " + ail);
	}
}
public class HospitalManagementSystem {
	public static void main(String[] args) {
		Patient p1 = new Patient("John Doe", 30, "Flu", 101);
		Patient p2 = new Patient("Alice Smith", 45, "Diabetes", 102);
		Patient p3 = new Patient("Bob Brown", 60, "Hypertension", 103);
		Patient p4 = new Patient("Carol White", 28, "Cold", 104);
		Patient p5 = new Patient("David Green", 55, "Asthma", 105);
		Object p6 = new String("Hello");
		System.out.println(p1.hname);
		if(p1 instanceof Patient) {
			System.out.println("Instance of Patient");
			p1.Display();
		}
		if(p2 instanceof Patient) {
			System.out.println("Instance of Patient");
			p2.Display();
		}
		if(p3 instanceof Patient) {
			System.out.println("Instance of Patient");
			p3.Display();
		}
		if(p4 instanceof Patient) {
			System.out.println("Instance of Patient");
			p4.Display();
		}
		if(p5 instanceof Patient) {
			System.out.println("Instance of Patient");
			p5.Display();
		}
		if(p6 instanceof Patient) {
			System.out.println("Instance of Patient");
		}
		else {
			System.out.println("P6 Not an Instance of Patient");
		}
		Patient.TP();
	}
}
