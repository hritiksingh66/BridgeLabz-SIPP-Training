package level_1;
import java.util.*;
class Course{
	String name;
	int duration;
	int fee;
	static String iname = "GLA University";
	
	Course(String name, int duration, int fee){
		this.name = name;
		this.duration = duration;
		this.fee = fee;
		this.iname = iname;
	}
	
	public static void Update(String i) {
		iname = i;
		System.out.println("The Updated Insitute Name is: " + iname);
	}
	
	void Display() {
		System.out.println("Name: " + name + " | Duration(in Years): " + duration + " | Fee: " + fee + " | Institute: " + iname);
	}
}
public class OnlineCourseManagement {
	public static void main(String[] args) {
		System.out.println("Course Details");
		Scanner sc = new Scanner(System.in);
		Course c1 = new Course("BBA", 3, 80000);
		Course c2 = new Course("BCA", 3, 90000);
		Course c3 = new Course("B.Com", 3, 70000);
		Course c4 = new Course("B.Tech", 4, 150000);
		c1.Display();
		c2.Display();
		c3.Display();
		c4.Display();
		String i;
		while(true) {
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Do you want to update Insitute Name: ");
			int c5 = sc.nextInt();
			sc.nextLine();
			if(c5 == 2) {
				break;
			}
			else {
				System.out.print("Enter new name: ");
				i = sc.nextLine();
				Course.Update(i);
				System.out.println("Course Details");
				c1.Display();
				c2.Display();
				c3.Display();
				c4.Display();
			}
		}
	}
}
