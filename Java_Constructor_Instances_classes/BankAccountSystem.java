package level_1;
import java.util.*;
class BankAccount{
	static String bName;
	String aName;
	final int accNum;
	static int tc = 0;
	
	BankAccount(String aName, int accNum){
		this.bName = "HDFC Bank";
		this.aName = aName;
		this.accNum = accNum;
		tc++;
	}
	
	void Display() {
		System.out.println("Bank Name: " + bName + " | Account Holder Name: " + aName + " | Account Number: " + accNum);
	}
	
	static void TC() {
		System.out.println("The Total Accounts created are: " + tc);
	}
}
public class BankAccountSystem {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("John", 680654279);
		BankAccount b2 = new BankAccount("Alice", 450126789);
		BankAccount b3 = new BankAccount("Robert", 902345671);
		BankAccount b4 = new BankAccount("Emily", 781245987);
		BankAccount b5 = new BankAccount("David", 367891234);
		Object b6 = new String("Hello");
		if(b1 instanceof BankAccount) {
			System.out.println("Instance of Bank Account");
			System.out.println("Account Details");
			b1.Display();
		}
		
		System.out.println("Account Details");
		b2.Display();
		
		System.out.println("Account Details");
		b3.Display();

		System.out.println("Account Details");
		b4.Display();
		
		System.out.println("Account Details");
		b5.Display();
		
		if(b6 instanceof BankAccount) {
			System.out.println("Instance of Bank Account");
		}
		else {
			System.out.println("Not An Instance of Bank Account");
		}
		BankAccount.TC();
	}
}
