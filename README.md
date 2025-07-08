# Procedural vs Object-Oriented Programming in Java

## 1. Procedural Programming Overview

Procedural Programming is a programming paradigm that relies on a structured sequence of instructions, organized into procedures, functions, or routines to perform tasks. It follows a top-down approach and emphasizes a clear sequence of commands and control flow.

- Procedural programming (PP) follows a step-by-step approach, where programs are divided into functions.
- Examples: **C**, **Pascal**.
- Focuses on functions or procedures to perform operations.

### Sample Program

```java
import java.util.Scanner;

public class StudentMarks {
    // Function to calculate total marks
    public static int calculateTotal(int marks1, int marks2, int marks3) {
        return marks1 + marks2 + marks3;
    }

    // Function to calculate average marks
    public static double calculateAverage(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    // Function to display results
    public static void displayResults(String name, int total, double average) {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();

        int total = calculateTotal(marks1, marks2, marks3);
        double average = calculateAverage(total, 3);

        displayResults(name, total, average);
        scanner.close();
    }
}
```

### Output Example

```
Enter the student's name: Alice
Enter marks for Subject 1: 85
Enter marks for Subject 2: 90
Enter marks for Subject 3: 88

Student Name: Alice
Total Marks: 263
Average Marks: 87.66666666666667
```

### Key Features of Procedural Programming
- **Functions**: Used to perform specific tasks like calculations and display.
- **Data Flow**: Data is passed explicitly between functions via parameters.
- **Linear Execution**: The program executes in a step-by-step manner.

### Limitations of Procedural Programming
- **Data Handling**: Data and behavior are separate, making the code less modular.
- **Reusability**: Functions operate on external data, limiting encapsulation.
- **Scalability**: Harder to maintain and extend for large applications.

---

## 2. Object-Oriented Programming (OOP) Overview

Object-Oriented Programming (OOP) is a paradigm based on the concept of **objects**, which are instances of **classes**. It helps organize data (attributes) and behavior (methods) into reusable, modular structures.

### Advantages of OOP Over Procedural Programming

- **Encapsulation**: Combines data and methods in a class and hides internal details.
- **Abstraction**: Exposes only necessary parts, hiding the complexity.
- **Reusability via Inheritance**: Allows new classes to inherit existing ones.
- **Polymorphism**: Enables one interface to represent multiple behaviors.
- **Real-World Modeling**: Naturally maps real-world entities to programming.
- **Modularity & Maintainability**: Divides logic into small, maintainable pieces.

### Real-World Examples

- **Encapsulation**: A bank account’s balance accessed only via deposit/withdraw methods.
- **Abstraction**: A `drive()` method for a car without exposing engine details.
- **Inheritance**: `Car` class inherits from `Vehicle`.
- **Polymorphism**: `draw()` method acts differently for `Circle`, `Square`, etc.

---

## Comparison Between Procedural and Object-Oriented Programming

| Feature              | Procedural Programming             | Object-Oriented Programming      |
|----------------------|------------------------------------|----------------------------------|
| **Focus**            | Functions and procedures           | Classes and objects              |
| **Data Security**    | Global data, less secure           | Encapsulated, more secure        |
| **Reusability**      | Minimal, with code duplication     | High, via inheritance            |
| **Scalability**      | Poor for large systems             | Highly scalable                  |
| **Real-World Mapping**| Harder to model real entities      | Easy, intuitive mapping          |
| **Maintenance**      | Hard to maintain in large apps     | Easier due to modular structure  |

---

By understanding these paradigms and their trade-offs, developers can write better, more maintainable, and scalable software.
