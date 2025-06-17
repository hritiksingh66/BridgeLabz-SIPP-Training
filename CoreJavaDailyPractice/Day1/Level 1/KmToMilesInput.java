import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        double km;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        
        km = input.nextDouble(); 
        
        double miles = km / 1.6;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        System.out.println("\nCalculation:");
        System.out.println("Given: 1 mile = 1.6 km");
        System.out.println("Therefore: 1 km = 1/1.6 miles");
        System.out.println(km + " km = " + km + " ÷ 1.6 = " + miles + " miles");
        
        input.close();
    }
}