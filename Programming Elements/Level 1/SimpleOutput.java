public class SimpleOutput {
    public static void main(String[] args) {
        System.out.println("=== Different Ways to Print ===");
        
        System.out.println("This is line 1");
        System.out.println("This is line 2");
        System.out.println("This is line 3");
        
        System.out.println(); 
        
        System.out.print("This ");
        System.out.print("is ");
        System.out.print("all ");
        System.out.print("on ");
        System.out.print("one ");
        System.out.println("line!");
        
        System.out.println("\n=== Printing Variables ===");
        
        String studentName = "Sarah";
        int studentGrade = 95;
        String subject = "Math";
        
        System.out.println("Student name: " + studentName);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Subject: " + subject);
        
        System.out.println(studentName + " got " + studentGrade + " in " + subject);
        
        System.out.println("\n=== Fun with Numbers ===");
        
        int apples = 5;
        int oranges = 3;
        int totalFruit = apples + oranges;
        
        System.out.println("I have " + apples + " apples");
        System.out.println("I have " + oranges + " oranges");
        System.out.println("Total fruit: " + totalFruit);
        
        System.out.println("\n=== Creating a Simple Report ===");
        
        String name = "John Doe";
        int age = 22;
        String city = "New York";
        double salary = 45000.50;
        boolean isEmployed = true;
        
        System.out.println("===== PERSONAL REPORT =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("City: " + city);
        System.out.println("Salary: $" + salary);
        System.out.println("Employed: " + isEmployed);
        System.out.println("============================");
        
        System.out.println("\n=== Special Characters ===");
        
        System.out.println("This has a tab:\tSee the space?");
        System.out.println("This has a quote: \"Hello World\"");
        System.out.println("This has a backslash: \\");
        
        System.out.println("\n🌟 Excellent work with output!");
        System.out.println("You now know how to display information!");
    }
}