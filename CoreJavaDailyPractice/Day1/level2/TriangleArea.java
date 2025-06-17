import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " + areaInCm);
        
        input.close();
    }
}
