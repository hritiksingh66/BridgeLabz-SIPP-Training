public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;
        
        int pensPerStudent = totalPens / numberOfStudents;
        
        int remainingPens = totalPens % numberOfStudents;
        
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
        
        System.out.println("\nDetailed Breakdown:");
        System.out.println("Total Pens: " + totalPens);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Pens per Student: " + totalPens + " ÷ " + numberOfStudents + " = " + pensPerStudent);
        System.out.println("Remaining Pens: " + totalPens + " % " + numberOfStudents + " = " + remainingPens);
        
        System.out.println("\nVerification:");
        System.out.println("Distributed Pens: " + numberOfStudents + " × " + pensPerStudent + " = " + (numberOfStudents * pensPerStudent));
        System.out.println("Remaining Pens: " + remainingPens);
        System.out.println("Total: " + (numberOfStudents * pensPerStudent) + " + " + remainingPens + " = " + ((numberOfStudents * pensPerStudent) + remainingPens));
    }
}