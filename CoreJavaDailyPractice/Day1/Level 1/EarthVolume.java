
public class EarthVolume {
    public static void main(String[] args) {
        double radiusInKm = 6378; 
        double pi = 3.14159;
        double kmToMilesFactor = 1.6;
        
        double volumeInKm3 = (4.0/3.0) * pi * radiusInKm * radiusInKm * radiusInKm;
        
        double radiusInMiles = radiusInKm / kmToMilesFactor;
        double volumeInMiles3 = (4.0/3.0) * pi * radiusInMiles * radiusInMiles * radiusInMiles;
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 + " and cubic miles is " + volumeInMiles3);
        
        System.out.println("\nDetailed Calculation:");
        System.out.println("Earth's radius: " + radiusInKm + " km");
        System.out.println("Earth's radius in miles: " + radiusInMiles + " miles");
        System.out.println("Formula: Volume = (4/3) × π × r³");
        System.out.println("Volume in km³: (4/3) × " + pi + " × " + radiusInKm + "³ = " + volumeInKm3);
        System.out.println("Volume in miles³: (4/3) × " + pi + " × " + radiusInMiles + "³ = " + volumeInMiles3);
        
        System.out.println("\nIn Scientific Notation:");
        System.out.printf("Volume in km³: %.2e%n", volumeInKm3);
        System.out.printf("Volume in miles³: %.2e%n", volumeInMiles3);
    }
}