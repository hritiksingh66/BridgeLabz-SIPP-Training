package level_1;
import java.util.*;
class Student{
	String name;
	int roll;
	int marks;
	
	Student(String name, int roll, int marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public String Grade(){
		this.marks = marks;
		if(marks > 90) {
			return "O";
		}
		else if(marks > 80 && marks <= 90) {
			return "A+";
		}
		else if(marks > 70 && marks <= 80) {
			return "A";
		}
		else if(marks > 60 && marks <= 70) {
			return "B+";
		}
		else if(marks > 50 && marks <= 60) {
			return "B";
		}
		else if(marks > 40 && marks <= 50) {
			return "C";
		}
		else {
			return "Fail";
		}
		
	}
	void Display() {
		System.out.println("The student name is " + name + " roll number is " + roll + " marks is " + marks);
	}
}
public class StudentReport {
	public static void main(String[] args) {
		Student s1 = new Student("Aryan", 1, 85);
		Student s2 = new Student("Aryanendra", 2, 91);
		s1.Display();
		System.out.println("The Grade of " + s1.name + " is " + s1.Grade());
		s2.Display();
		System.out.println("The Grade of " + s2.name + " is " + s2.Grade());
	}

}
