package level_1;
import java.util.*;
class ATM{
	String name;
	int acnumber;
	int bal;
	
	ATM(String name, int acnumber, int bal){
		this.name = name;
		this.acnumber = acnumber;
		this.bal = bal;
	}
	public int Withdraw(int with) {
		this.bal = bal;
		if(bal > with) {
			bal = bal - with;
			System.out.println("Withdraw Successful");
			System.out.println("Available Balance: " + bal);
		}
		else {
			System.out.println("Not sufficient balance");
		}
		return bal;
	}
	public void Depo(int depo) {
		this.bal = bal;
		bal = bal + depo;
		System.out.println("Balance is: " + bal);
	}
	void Display() {
		System.out.println("The account holder name is " + name + " account number is " + acnumber + " balance is " + bal);
	}
	void Balance() {
		this.bal = bal;
		System.out.println("The available balance is: " + bal);
	}
}
public class SimulateAnATM {
	public static void main(String[] args) {
		ATM c1 = new ATM("John", 123456, 45000);
		c1.Display();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("0. Exit");
		while(true) {
			System.out.print("What do you want to do ");
			int n = sc.nextInt();
			if(n == 0) break;
			switch(n){
			case 1:
				System.out.print("How much do you want to withdraw: ");
				int w = sc.nextInt();
				c1.Withdraw(w);
				break;
				
			case 2:
				System.out.print("How much do you want to deposit: ");
				int d = sc.nextInt();
				c1.Depo(d);
				break;
				
			case 3:
				c1.Balance();
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
		ATM c2 = new ATM("Freds", 223456, 4000);
		c2.Display();
		while(true) {
			System.out.print("What do you want to do ");
		    int a = sc.nextInt();
		    if(a == 0) break;
			switch(a){
			case 1:
				System.out.print("How much do you want to withdraw: ");
				int w = sc.nextInt();
				c2.Withdraw(w);
				break;
				
			case 2:
				System.out.print("How much do you want to deposit: ");
				int d = sc.nextInt();
				c2.Depo(d);
				break;
				
			case 3:
				c2.Balance();
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
