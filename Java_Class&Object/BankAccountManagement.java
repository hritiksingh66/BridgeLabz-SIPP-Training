package level_1;
import java.util.*;
class BankAccount{
	public int accountNumber;
	protected String name;
	private int balance;
	
	BankAccount(int accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public void Set(int b) {
		this.balance = b;
	}
	
	public int Get() {
		return balance;
	}
	
	void Up() {
		System.out.println("The Updated Balance is: " + balance);
	}
}

class SavingsAccount extends BankAccount{
	SavingsAccount(int accountNumber, String name){
		super(accountNumber, name);
	}
	
	void B() {
		System.out.println("The Balance is: " + Get());
	}
	
	void Display(){
		System.out.println("Account Holder Name: " + name + " | Account Number: " + accountNumber);
	}
}
public class BankAccountManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s1 = new SavingsAccount(680654782, "Divya");
		s1.Set(25000);
		System.out.println("Account Details");
		s1.Display();
		System.out.println("1. Check Balance");
		System.out.println("2. Update Balance");
		System.out.println("3. Exit");
		int ba;
		while(true) {
			System.out.print("What do you want to do: ");
			int c = sc.nextInt();
			if(c == 3) {
				break;
			}
			switch(c) {
			case 1:
				s1.B();
				break;
				
			case 2:
				System.out.print("Enter New Balance: ");
				ba = sc.nextInt();
				s1.Set(ba);
				s1.Up();
				break;
				
			case 3:
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
