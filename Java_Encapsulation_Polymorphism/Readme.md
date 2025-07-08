### 🔒 Encapsulation

Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP). It refers to the bundling of data (attributes) and methods (functions) that operate on the data into a single unit or class. It restricts direct access to some of an object's components, which can be crucial for maintaining the integrity of the data.

### Key Benefits of Encapsulation

- **Data Hiding**: The internal state of an object is hidden from the outside. Only the object's own methods can directly access and modify its fields
- **Increased Flexibility**: The implementation of a class can be changed without affecting the classes that use it, provided that the public interface remains consistent
- **Reusability**: Encapsulated classes can be easily reused and maintained
- **Ease of Testing**: Encapsulation improves testability by limiting the exposure of implementation details

### Example of Encapsulation in Java

Consider a scenario where we need to manage bank accounts. We want to ensure that the balance of a bank account cannot be set to an invalid value directly.

#### BankAccount Class with Encapsulation

```java
public class BankAccount {
    // Private fields - data encapsulation
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance); // Using setter for validation
    }

    // Public getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to deposit money with encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money with encapsulation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
```

#### Using the BankAccount Class

```java
public class Main {
    public static void main(String[] args) {
        // Create a new bank account with initial balance
        BankAccount account = new BankAccount("123456789", 500.0);

        // Display account information
        account.displayAccountInfo();

        // Deposit money
        account.deposit(150.0);
        account.displayAccountInfo();

        // Withdraw money
        account.withdraw(100.0);
        account.displayAccountInfo();

        // Try to set an invalid balance directly (will not compile)
        // account.balance = -100; // Error: balance has private access in BankAccount

        // Try to set an invalid balance using setter
        account.setBalance(-100); // Prints: Balance cannot be negative.

        // Try to deposit a negative amount
        account.deposit(-50); // Prints: Deposit amount must be positive.

        // Try to withdraw more than the balance
        account.withdraw(1000); // Prints: Invalid withdraw amount.
    }
}
```

### Detailed Explanation

- **Private Fields**: `accountNumber` and `balance` are declared as private. This means they cannot be accessed directly from outside the class
- **Public Getters and Setters**: `getAccountNumber()` and `getBalance()` provide read access to the private fields. `setBalance()` allows controlled modification of the balance field with validation
- **Public Methods**: `deposit()` and `withdraw()` methods modify the balance in a controlled manner, ensuring business rules are adhered to
- **Data Hiding and Validation**: By hiding the fields and providing public methods, we ensure that any changes to the fields are validated, protecting the integrity of the object's state

## 🔄 Polymorphism

Polymorphism in Java is a fundamental concept in object-oriented programming (OOP) that allows one interface to be used for a general class of actions. It's a mechanism that allows objects to be treated as instances of their parent class, enabling flexibility and reusability in code.

### Key Benefits of Polymorphism

- **Code Reusability**: Common methods can be reused across multiple classes
- **Flexibility**: Code written to work with superclass types or interfaces can be reused with any subclass or implementing class
- **Extensibility**: New subclasses or implementations can be added with minimal changes to existing code

### Types of Polymorphism in Java

There are two main types of polymorphism in Java:
- **Compile-time (Static) Polymorphism**: Achieved through method overloading
- **Runtime (Dynamic) Polymorphism**: Achieved through method overriding

#### 1. Compile-Time (Static) Polymorphism

Compile-time polymorphism is achieved by method overloading. It is called compile-time polymorphism because the compiler determines which method to execute based on the method signature.

**Method Overloading Example:**

```java
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class StaticPolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
    }
}
```

#### 2. Runtime (Dynamic) Polymorphism

Runtime polymorphism is achieved through method overriding. Here, the JVM decides which method to execute based on the runtime object.

**Method Overriding Example:**

```java
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Outputs: Bark
        myCat.sound(); // Outputs: Meow
    }
}
```

#### 3. Polymorphism with Interfaces

Polymorphism can also be achieved using interfaces. When a class implements an interface, it can define different implementations for the methods declared in the interface.

```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InterfacePolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Outputs: Drawing a circle
        shape2.draw(); // Outputs: Drawing a rectangle
    }
}
```

#### 4. Polymorphism with Abstract Classes

Abstract classes also support polymorphism, where subclasses provide their implementations of the abstract methods defined in the abstract superclass.

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button");
    }
}

public class AbstractPolymorphismExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start(); // Outputs: Car starts with a key
        myBike.start(); // Outputs: Bike starts with a button
    }
}
```

#### 5. Casting and instanceof with Polymorphism

In polymorphism, you may sometimes need to check the actual type of an object to perform specific operations. The `instanceof` operator and casting allow you to handle objects of different types.

```java
class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        // Check if myAnimal is an instance of Dog
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Downcast to Dog
            myDog.fetch(); // Outputs: Dog is fetching
        }
    }
}
```

## 🎭 Java Interfaces and Abstract Classes

In Java, interfaces and abstract classes are mechanisms for achieving abstraction, which allows developers to define "what to do" (methods) without specifying "how to do it" (implementations).

### 1. Abstract Class

An abstract class is a blueprint for other classes. It can have both abstract methods (without a body) and concrete methods (with a body). You cannot instantiate an abstract class directly; it must be extended by a subclass.

#### Key Characteristics

- **Abstract Methods**: Methods without a body, meant to be implemented by subclasses
- **Concrete Methods**: Can have methods with implementations that can be inherited by subclasses
- **Constructors**: Abstract classes can have constructors
- **Instance Variables**: Can have fields and can define their visibility
- **Access Modifiers**: Can have methods with any access modifier
- **Inheritance**: A class can inherit only one abstract class (single inheritance)

#### When to Use Abstract Classes

- When you want to provide a common base class for related classes
- When you want to share code (method implementations) among subclasses
- When the "is-a" relationship holds strongly, e.g., a Car is-a Vehicle

#### Example

```java
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}
```

### 2. Interface

An interface is a contract or a specification that defines a set of methods that a class must implement. It cannot have any implementation (prior to Java 8). From Java 8 onwards, it can also include default and static methods with implementations.

#### Key Characteristics

- **Abstract Methods (Pre-Java 8)**: All methods are implicitly public and abstract by default
- **Default Methods (Java 8+)**: Interfaces can define default methods with a body
- **Static Methods (Java 8+)**: Interfaces can have static methods with a body
- **Private Methods (Java 9+)**: Interfaces can define private helper methods
- **No State**: Interfaces cannot have instance variables but can have public static final constants
- **Multiple Inheritance**: A class can implement multiple interfaces

#### When to Use Interfaces

- When you want to define a contract for classes with unrelated hierarchies
- When you want multiple inheritance for behaviors
- When you want to achieve loose coupling between components

#### Example

```java
interface Flyable {
    void fly();

    default void takeOff() {
        System.out.println("Taking off...");
    }

    static void emergencyLanding() {
        System.out.println("Performing an emergency landing!");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane is flying.");
    }
}
```

### Comparison Between Abstract Classes and Interfaces

| Feature | Abstract Class | Interface |
|---------|----------------|----------|
| Methods | Can have both abstract and concrete methods | Can have abstract methods (default from Java 8 onwards) |
| Default Implementation | Yes, for concrete methods | Yes, for default and static methods (Java 8+) |
| Constructors | Can have constructors | Cannot have constructors |
| Fields | Can have instance variables | Only public static final constants |
| Access Modifiers | Methods can be public, protected, private | Methods are public by default |
| Multiple Inheritance | Not supported | Supported via multiple interfaces |
| Purpose | Used for sharing code and creating a base class | Used for defining contracts |
| Relationship | Represents an "is-a" relationship | Represents a "can-do" or "behavioral" relationship |

### Best Practices

- **Use Abstract Classes**: When you need shared code or a common base implementation
- **Use Interfaces**: When designing loosely coupled, scalable systems with unrelated classes
- **Combine Both**: An abstract class can implement an interface to combine the benefits of both

## 🆚 Interface vs Class in Java

Interfaces and classes are fundamental building blocks in Java. While both are used to define types and structure programs, they serve different purposes and have distinct characteristics.

### Key Differences Between Interface and Class

| Feature | Interface | Class |
|---------|-----------|-------|
| Purpose | Defines a contract or a set of rules for implementing classes | Defines the blueprint for objects, encapsulating data and behavior |
| Inheritance | Allows multiple inheritance; a class can implement multiple interfaces | Supports single inheritance; a class can extend only one other class |
| Abstract Methods | Contains abstract methods by default (prior to Java 8). From Java 8+, supports default and static methods with implementation | Can contain both abstract and concrete methods (if it is an abstract class). Regular classes can have only concrete methods |
| Access Modifiers for Methods | Methods are public and abstract by default (can also include default, static, and private methods in newer versions) | Methods can have any access modifier: public, protected, private, or package-private |
| Instance Variables | Cannot have instance variables; only public static final constants are allowed | Can have instance variables with any access modifier (private, protected, etc.) |
| Constructors | Cannot have constructors | Can have constructors to initialize objects |
| Multiple Inheritance | Achieves multiple inheritance through implementation of multiple interfaces | Does not support multiple inheritance (directly) |
| Static Methods | Allowed (from Java 8) | Allowed |
| Fields | Only public static final constants are allowed | Can have mutable fields of any type and access level |
| Relationship | Represents a "can-do" or "behavioral" relationship | Represents an "is-a" relationship in inheritance |
| Instantiation | Cannot be instantiated directly | Can be instantiated unless it is an abstract class |

### Use Cases for Interfaces

- **Defining Contracts**: Use interfaces to specify a contract that unrelated classes can follow, e.g., Comparable, Runnable
- **Achieving Multiple Inheritance**: Interfaces allow a class to implement multiple behaviors
- **Loose Coupling**: Interfaces provide abstraction, ensuring loose coupling between components

### Use Cases for Classes

- **Encapsulation**: Use classes to encapsulate data and related methods
- **Inheritance**: Create a base class to share code across related classes
- **Object Creation**: Use classes as blueprints to create objects with properties and methods

### Example: Interface vs Class

#### Interface Example

```java
interface Flyable {
    void fly(); // Abstract method
    default void takeOff() {
        System.out.println("Taking off...");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }
}
```

#### Class Example

```java
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void bark() {
        System.out.println(name + " says Woof!");
    }
}
```

### When to Use Interface vs Class

#### Use an Interface:
- When multiple unrelated classes need to implement a common set of methods
- When you want to enforce a specific behavior (e.g., Serializable or Runnable)
- When designing systems that require loose coupling

#### Use a Class:
- When you need to define concrete objects with state and behavior
- When code reuse is required through inheritance
- When encapsulating data and logic into a single unit


## 📈 UML Diagrams

### 1. Class Diagram

A Class Diagram is a static diagram in UML that describes the structure of a system by showing its classes, their attributes, methods, and relationships.

**Key Components:**
- **Class**: Represented by a rectangle divided into three sections (name, attributes, methods)
- **Attributes**: Variables that define the state of the object
- **Methods**: Functions that define the behavior of the class
- **Relationships**: Association, Aggregation, Composition, Inheritance, Interface realization

#### Vehicle System Class Diagram


┌─────────────────┐
│     Vehicle     │
├─────────────────┤
│ - manufacturedDate: String │
│ - model: String │
│ - year: int     │
│ - baseRate: double │
├─────────────────┤
│ + calculateRent(int): double │
│ + toString(): String │
└─────────────────┘
         ▲
         │
    ┌────┴────┐
    │         │
┌───▼───┐ ┌──▼──┐ ┌───▼────┐
│ Bike  │ │ Car │ │ Truck  │
└───────┘ └─────┘ └────────┘

### 2. Sequence Diagram

A Sequence Diagram shows how objects interact in a particular scenario, highlighting the order of method calls between objects.

**Key Components:**
- **Objects**: Represented by boxes at the top
- **Lifelines**: Vertical dashed lines representing object existence over time
- **Messages**: Horizontal arrows showing interactions
- **Activation bars**: Rectangular boxes showing when an object is active
- **Return messages**: Dashed arrows showing return of control

#### Online Shopping Sequence Diagram Example

Customer    Order    Product
   │         │         │
   │ placeOrder() │    │
   │────────►│         │
   │         │ checkAvailability() │
   │         │────────►│
   │         │◄────────│
   │         │ processPayment() │
   │         │────────►│
   │◄────────│         │
```

## 🎯 OOP Concepts

### 1. Abstraction
- `Rentable` interface abstracts rental behavior
- Hides complex rent calculation logic behind simple methods

### 2. Inheritance
- `Car`, `Bike`, and `Truck` classes inherit from `Vehicle` base class
- Shared attributes and methods are inherited from parent class

### 3. Polymorphism
- Rent calculation differs by vehicle type
- Same method signature with different implementations

### 4. Encapsulation
- All fields are hidden behind getters and setters
- Protected access modifiers for controlled subclass access

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/java-oop-guide.git
   cd java-oop-guide
   ```

2. **Compile the Java files**
   ```bash
   javac *.java
   ```

3. **Run the applications**
   ```bash
   java Vehicle
   java BankAccount
   java School
   ```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


⭐ **Star this repository if you found it helpful!**
