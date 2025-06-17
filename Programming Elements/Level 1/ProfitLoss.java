public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        
        int profit = sellingPrice - costPrice;
        
        double profitPercentage = (double) profit / costPrice * 100;
        
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                          "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
        
        System.out.println("\nDetailed Calculation:");
        System.out.println("Cost Price: INR " + costPrice);
        System.out.println("Selling Price: INR " + sellingPrice);
        System.out.println("Profit = Selling Price - Cost Price");
        System.out.println("Profit = " + sellingPrice + " - " + costPrice + " = INR " + profit);
        System.out.println("Profit Percentage = (Profit / Cost Price) × 100");
        System.out.println("Profit Percentage = (" + profit + " / " + costPrice + ") × 100 = " + profitPercentage + "%");
    }
}