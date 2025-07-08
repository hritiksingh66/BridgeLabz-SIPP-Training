# Java Keywords: `this`, `static`, `final`, `instanceof`

This document explains the core usage of four important Java keywords: `this`, `static`, `final`, and `instanceof`. Each is detailed with explanation, use cases, and practical examples.

---

## 1. `this` Keyword

The `this` keyword is used in Java to refer to the current object of the class. It resolves ambiguity between instance variables and method parameters or is used to invoke other constructors.

### Common Uses of `this`:

#### a. Referencing Current Object
Access instance variables when they are shadowed by method parameters.

```java
class Employee {
    String name;

    Employee(String name) {
        this.name = name; // Refers to the instance variable
    }
}
```

#### b. Invoke Current Class Methods

```java
class Example {
    void methodOne() {
        System.out.println("Method One");
        this.methodTwo(); // Calls another method in the same class
    }

    void methodTwo() {
        System.out.println("Method Two");
    }
}
```

#### c. Invoke Current Class Constructor (Constructor Chaining)

```java
class Student {
    String name;
    int age;

    Student(String name) {
        this(name, 18); // Calls another constructor in the same class
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 2. `static` Keyword

The `static` keyword in Java is used to indicate that a member (variable, method, block, or nested class) belongs to the class rather than to any specific object.

### Key Features of `static`

- **Class-Level Scope:** Static members belong to the class and are shared among all objects.
- **Memory Management:** Stored in the Method Area of JVM memory.
- **Access Without Object:** Accessed using the class name directly.
- **Shared State:** Shared across all instances.

### Where Can `static` Be Used?

#### 1. Static Variables

```java
class Counter {
    static int count = 0; // Static variable
    Counter() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        obj1.displayCount(); // Output: Count: 2
        obj2.displayCount(); // Output: Count: 2
    }
}
```

#### 2. Static Methods

```java
class MathUtility {
    static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtility.square(5)); // Output: 25
    }
}
```

#### 3. Static Block

```java
class Example {
    static int value;
    static {
        value = 10;
        System.out.println("Static block executed!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Value: " + Example.value);
    }
}
```

**Output:**
```
Static block executed!
Value: 10
```

#### 4. Static Nested Class

```java
class Outer {
    static class Inner {
        void display() {
            System.out.println("Static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // No instance of Outer required
        obj.display(); // Output: Static nested class
    }
}
```

### Advantages of `static`

- **Memory Efficiency:** Shared among all objects.
- **Global Access:** Accessed using the class name.
- **Utility Functions:** Ideal for tools like `Math.sqrt()`.
- **Initialization:** Via static blocks at class loading time.

### Limitations of `static`

- **No Polymorphism:** Cannot be overridden.
- **Limited Access:** Cannot access instance variables directly.
- **Thread-Safety:** Shared state can be problematic.

### Best Practices

- Use for constants:  
  ```java
  public static final double PI = 3.14159;
  ```
- Avoid overuse.
- Use in utility/helper classes.
- Ensure thread safety in multi-threaded applications.

### Practical Examples

#### Example 1: Bank Interest Calculation

```java
class Bank {
    static double interestRate = 3.5; // Shared by all accounts

    static double calculateInterest(double principal, int years) {
        return (principal * years * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Interest: " + Bank.calculateInterest(10000, 2)); // Output: Interest: 700.0
    }
}
```

#### Example 2: Student Count Tracker

```java
class Student {
    static int totalStudents = 0; // Tracks total students
    String name;
    Student(String name) {
        this.name = name;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class Main {
    public static void main(String[] args) {
        new Student("Alice");
        new Student("Bob");
        Student.displayTotalStudents(); // Output: Total Students: 2
    }
}
```

#### Example 3: Utility Functions

```java
class MathUtility {
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + MathUtility.factorial(5)); // Output: Factorial of 5: 120
    }
}
```

---

## 3. `final` Keyword

The `final` keyword is used to declare constants, prevent inheritance, and restrict overriding or reassignment.

### Uses of `final`:

#### a. Final Variables

```java
class Example {
    final int MAX_VALUE = 100;

    void display() {
        System.out.println(MAX_VALUE);
    }
}
```

#### b. Final Methods

```java
class Parent {
    final void display() {
        System.out.println("Final Method");
    }
}

class Child extends Parent {
    // Cannot override display()
}
```

#### c. Final Classes

```java
final class Constants {
    static final double PI = 3.14159;
}

// Cannot extend Constants
```

---

## 4. `instanceof` Operator

The `instanceof` operator is used to test whether an object is an instance of a specific class or subclass.

### Syntax:
```java
object instanceof ClassName
```

### Sample Program:

```java
class Parent {}
class Child extends Parent {}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();

        if (obj instanceof Child) {
            System.out.println("obj is an instance of Child");
        }
        if (obj instanceof Parent) {
            System.out.println("obj is also an instance of Parent");
        }
    }
}
```

### Output:
```
obj is an instance of Child  
obj is also an instance of Parent
```

### Use Cases:
- **Type Checking in Polymorphism**
- **Avoid ClassCastException**

---

## Comparison Table

| Feature       | `this`                         | `final`                               | `instanceof`                     | `static`                                   |
|---------------|--------------------------------|----------------------------------------|----------------------------------|--------------------------------------------|
| **Purpose**   | Refers to the current object.  | Restricts modification or inheritance. | Checks object type.             | Creates shared class-level members.        |
| **Scope**     | Current instance of the class. | Variables, methods, or classes.        | Objects and types.              | Variables, methods, blocks, or classes.    |
| **Usage**     | Resolving name conflicts, constructor chaining. | Constants, prevent overriding. | Polymorphism type checks.       | Utility methods, shared properties.        |

---
