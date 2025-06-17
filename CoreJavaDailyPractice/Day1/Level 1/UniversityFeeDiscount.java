public class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        
        int discountPercent = 10;
        
        double discount = (fee * discountPercent) / 100.0;
        
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        System.out.println("\nDetailed Calculation:");
        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: " + fee + " × " + discountPercent + "% = INR " + discount);
        System.out.println("Final Fee: " + fee + " - " + discount + " = INR " + finalFee);
        System.out.println("You save INR " + discount + " with this discount!");
    }
}