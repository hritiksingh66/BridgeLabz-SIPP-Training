
# Java: Constructors, Access Modifiers, and Class vs. Instance Variables

## 🔧 What is a Constructor?
A **constructor** in Java is a special method that initializes an object when it is created.

### Key Features:
- **Same name as the class**
- **No return type**
- **Automatically called** when the object is created

---

## ☕ Coffee Shop Order System Example

```java
class CoffeeShopOrder {
    String customerName;
    String coffeeType;
    int quantity;
    double totalPrice;

    // Default Constructor
    CoffeeShopOrder() {
        customerName = "Guest";
        coffeeType = "Regular";
        quantity = 1;
        totalPrice = calculatePrice();
    }

    // Parameterized Constructor
    CoffeeShopOrder(String customerName, String coffeeType, int quantity) {
        this.customerName = customerName;
        this.coffeeType = coffeeType;
        this.quantity = quantity;
        this.totalPrice = calculatePrice();
    }

    // Copy Constructor
    CoffeeShopOrder(CoffeeShopOrder previousOrder) {
        this.customerName = previousOrder.customerName;
        this.coffeeType = previousOrder.coffeeType;
        this.quantity = previousOrder.quantity;
        this.totalPrice = previousOrder.totalPrice;
    }

    private double calculatePrice() {
        double pricePerCup = switch (coffeeType.toLowerCase()) {
            case "latte" -> 5.0;
            case "espresso" -> 4.0;
            case "cappuccino" -> 4.5;
            default -> 3.0;
        };
        return pricePerCup * quantity;
    }

    void displayOrderDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Coffee Type: " + coffeeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeShopOrder order1 = new CoffeeShopOrder();
        CoffeeShopOrder order2 = new CoffeeShopOrder("Alice", "Latte", 3);
        CoffeeShopOrder order3 = new CoffeeShopOrder(order2);

        System.out.println("Order 1:");
        order1.displayOrderDetails();

        System.out.println("\nOrder 2:");
        order2.displayOrderDetails();

        System.out.println("\nOrder 3 (Copy of Order 2):");
        order3.displayOrderDetails();
    }
}
```

---

## 🔐 Access Modifiers in Java

| Modifier   | Class | Same Package | Subclass | Outside Package |
|------------|:-----:|:------------:|:--------:|:----------------:|
| `public`   | ✔️    | ✔️           | ✔️       | ✔️                |
| `protected`| ✔️    | ✔️           | ✔️       | ❌                |
| *default*  | ✔️    | ✔️           | ❌       | ❌                |
| `private`  | ✔️    | ❌           | ❌       | ❌                |

### Example:

```java
class Example {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30;
    private int privateVariable = 40;

    void displayAccess() {
        System.out.println("Public: " + publicVariable);
        System.out.println("Protected: " + protectedVariable);
        System.out.println("Default: " + defaultVariable);
        System.out.println("Private: " + privateVariable);
    }
}
```

---

## 🆚 Instance vs Class Variables and Methods

| Aspect               | Instance               | Class (Static)             |
|----------------------|------------------------|----------------------------|
| Belongs To           | Object                 | Class                      |
| Access               | Through object         | Through class or object    |
| Keyword              | —                      | `static`                   |
| Example              | `student.name`         | `Student.totalStudents`    |

### Example:

```java
class School {
    String studentName;        // Instance Variable
    static int totalStudents;  // Class Variable

    School(String studentName) {
        this.studentName = studentName;
        totalStudents++;
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class Main {
    public static void main(String[] args) {
        School student1 = new School("Alice");
        School student2 = new School("Bob");

        student1.displayStudent();
        student2.displayStudent();

        School.displayTotalStudents();
    }
}
```

### Output:
```
Student Name: Alice
Student Name: Bob
Total Students: 2
```

---

## ✅ Summary

- Constructors are special methods used to initialize objects.
- Java supports constructor overloading and copy constructors.
- Access modifiers control visibility.
- Instance variables are unique to each object; class variables are shared.
