public class CircularTourProblem {
    
    static class PetrolPump {
        int petrol;
        int distance;
        
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
    
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0;
        int currentPetrol = 0;
        int totalPetrol = 0;
        int totalDistance = 0;
        
        for (int i = 0; i < n; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            currentPetrol += pumps[i].petrol - pumps[i].distance;
            
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }
        
        return (totalPetrol >= totalDistance) ? start : -1;
    }
    
    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        
        int startPoint = findStartingPoint(pumps);
        
        if (startPoint == -1) {
            System.out.println("No solution exists");
        } else {
            System.out.println("Starting point: " + startPoint);
        }
    }
}