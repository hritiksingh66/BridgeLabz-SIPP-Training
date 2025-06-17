public class SamMarks {
    public static void main(String[] args) {
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        
        double averageMarks = totalMarks / 3.0; 
        
        System.out.println("Sam's average mark in PCM is " + averageMarks);
        
        System.out.println("\nBreakdown:");
        System.out.println("Maths: " + mathsMarks);
        System.out.println("Physics: " + physicsMarks);
        System.out.println("Chemistry: " + chemistryMarks);
        System.out.println("Total: " + totalMarks);
        System.out.println("Average: " + totalMarks + " ÷ 3 = " + averageMarks);
    }
}