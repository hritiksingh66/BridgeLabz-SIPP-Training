package level_1;
import java.util.*;
class Movie{
	String name;
	int qu;
	int p;
	
	Movie(String name, int p){
		this.name = name;
		this.p = p;
	}
	
	public int[] Seat(int qu) {
		this.qu = qu;
		Random rand = new Random();
		int [] s = new int[qu];
		for(int i = 0; i < qu; i++) {
			s[i] = rand.nextInt(99) + 1;
		}
		return s;
	}
	public int Price(int qu, int p) {
		int tp = p * qu;
		return tp;
	}
	void Display() {
		System.out.println("Ticket Details");
		System.out.println("--------------------");
		System.out.println("Movie: " + name);
	}
}
public class MovieTicketBookingSystem {
	public static void main(String[] args) {
		System.out.println("Movie: War2  Price: 150");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many tickets you want to book: ");
		int t = sc.nextInt();
		Movie m = new Movie("War2 " , 150);
		int [] se = m.Seat(t);
		m.Display();
		System.out.println("No of seats: " + t);
		System.out.println("Seat number: " + Arrays.toString(se));
		System.out.println("Total Price: " + m.Price(t, 150));
	}
}
