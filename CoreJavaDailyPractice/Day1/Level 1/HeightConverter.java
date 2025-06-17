import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();
        
        double cmPerInch = 2.54;  
        int inchesPerFoot = 12;
        
        double totalInches = heightInCm / cmPerInch;
        
        int feet = (int) totalInches / inchesPerFoot;
        double remainingInches = totalInches % inchesPerFoot;  
        
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + remainingInches);
        
        System.out.println("\nDetailed Conversion:");
        System.out.println("Height in cm: " + heightInCm);
        System.out.println("Total inches: " + heightInCm + " ÷ " + cmPerInch + " = " + totalInches);
        System.out.println("Feet: " + (int)totalInches + " ÷ " + inchesPerFoot + " = " + feet + " feet");
        System.out.println("Remaining inches: " + (int)totalInches + " % " + inchesPerFoot + " = " + remainingInches + " inches");
        
        System.out.println("\nAlternative format: " + heightInCm + " cm = " + feet + "' " + String.format("%.1f", remainingInches) + "\"");
        
        input.close();
    }
}