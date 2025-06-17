import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
        double fee;
        double discountPercent;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        
        double discount = (fee * discountPercent) / 100.0;
        
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        System.out.println("\nFee Breakdown:");
        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: INR " + discount);
        System.out.println("Final Fee to Pay: INR " + finalFee);
        System.out.println("You save: INR " + discount);
        
        input.close();
    }
}