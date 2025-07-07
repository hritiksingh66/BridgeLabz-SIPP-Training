package level_1;
import java.util.*;
abstract class BankAccount{
	private int accountNumber; 
	private String holderName;
	private double balance;
	
	BankAccount(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	void SetAN(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	int GetAN() {
		return accountNumber;
	}
	
	void SetN(String holderName) {
		this.holderName = holderName;
	}
	
	String GetN() {
		return holderName;
	}
	
	void SetB(double balance) {
		this.balance = balance;
	}
	
	double GetB() {
		return balance;
	}
	
	void deposit(double amount) {}
	void withdraw(double amount){}
	abstract double calculateInterest(); 
}

interface Loanable{
	void applyForLoan(int amount);
	String calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{
	double rate;
	String e;
	
	SavingsAccount(int accountNumber, String holderName, double balance, double rate){
		super(accountNumber, holderName, balance);
		this.rate = rate;
	}
	
	public double calculateInterest() {
		double i = (GetB() * rate) / (365 * 100);
		return i;
	}
	
	void deposit(double amount) {
		double b = GetB() + amount;
		SetB(b);
		System.out.println("The Balance is: " + GetB());
	}
	
	void withdraw(double amount) {
		if(amount > GetB()) {
			System.out.println("Not Enough Balance");
		}
		else {
			double b = GetB() - amount;
			SetB(b);
			System.out.println("The Balance is: " + GetB());
		}
	}
	
	public void applyForLoan(int amount) {
		if(amount >= GetB() * 0.5) {
			this.e = "Eligible";
		}
		else {
			this.e = "Not Eligible";
		}
	}
	
	public String calculateLoanEligibility() {
		return e;
	}
	
	void Display() {
		System.out.println("Account Number: " + GetAN() + " | Account Holder Name: " + GetN() + " | Balance: " + GetB() + " | Interest: " + calculateInterest());
	}
}

class CurrentAccount extends BankAccount implements Loanable{
	double rate;
	String e;
	
	CurrentAccount(int accountNumber, String holderName, double balance, double rate){
		super(accountNumber, holderName, balance);
		this.rate = rate;
	}
	
	public double calculateInterest() {
		double i = (GetB() * rate) / (365 * 100);
		return i;
	}
	
	void deposit(double amount) {
		double b = GetB() + amount;
		SetB(b);
		System.out.println("The Balance is: " + GetB());
	}
	
	void withdraw(double amount) {
		if(amount > GetB()) {
			System.out.println("Not Enough Balance");
		}
		else {
			double b = GetB() - amount;
			SetB(b);
			System.out.println("The Balance is: " + GetB());
		}
	}
	
	public void applyForLoan(int amount) {
		if(amount <= GetB() * 0.5) {
			this.e = "Eligible";
		}
		else {
			this.e = "Not Eligible";
		}
	}
	
	public String calculateLoanEligibility() {
		return e;
	}
	
	void Display() {
		System.out.println("Account Number: " + GetAN() + " | Account Holder Name: " + GetN() + " | Balance: " + GetB() + " | Interest: " + calculateInterest());
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(1001, "Alice", 50000.0, 1.5);
        SavingsAccount sa = new SavingsAccount(2001, "Bob", 100000.0, 3.5);
        ca.Display();
        ca.withdraw(30000);
        ca.deposit(10000);
        ca.applyForLoan(15000);
        System.out.println("Current Account Loan Eligibility: " + ca.calculateLoanEligibility());
        sa.Display();
        sa.withdraw(30000);
        sa.deposit(20000);
        ca.applyForLoan(50000);
        System.out.println("Current Account Loan Eligibility: " + ca.calculateLoanEligibility());
	}
}
