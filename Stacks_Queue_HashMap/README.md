# Stacks, Queues, and HashMap in Java

## 1. Stacks in Java

### What is a Stack?
A Stack is a linear data structure that follows the **Last In, First Out (LIFO)** principle. The element inserted last is the first to be removed.

### Key Operations
- `push(E e)`: Adds an element to the top of the stack
- `pop()`: Removes and returns the top element of the stack
- `peek()`: Retrieves the top element without removing it
- `isEmpty()`: Checks if the stack is empty

### Use Cases
- Expression evaluation (infix to postfix conversion)
- Undo functionality in editors
- Call stack in recursion

### Sample Problem: Balanced Parentheses Checker

**Problem**: Given a string of parentheses `((), {}, [])`, check if the string is balanced.

**Approach**: Use a Stack to track opening brackets and match them with closing brackets.

```java
import java.util.Stack;

public class BalancedParenthesesChecker {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        if (isBalanced(input)) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }
}
```

### Example Input/Output
- Input: `{[()]}`  → Output: The string is balanced
- Input: `{[(])}`  → Output: The string is not balanced
- Input: `(({{[[]]}}))` → Output: The string is balanced
- Input: `{[}` → Output: The string is not balanced

### Time & Space Complexity
- **Time Complexity**: O(n) - Each character is processed once
- **Space Complexity**: O(n) - Stack space depends on opening brackets

### Key Characteristics
- **LIFO Principle**: Last inserted element is removed first
- **Dynamic Nature**: Size grows/shrinks dynamically
- **Operations**: Push, Pop, Peek, isEmpty (all O(1))

### Common Methods in Stack Class
```java
stack.push("Element");        // Add element
String top = stack.pop();     // Remove and return top
String top = stack.peek();    // Return top without removing
boolean empty = stack.isEmpty(); // Check if empty
int position = stack.search("Element"); // Search element
```

### Advantages & Limitations
**Advantages:**
- Simple and easy to implement
- Efficient for LIFO-based operations
- Useful in solving complex problems

**Limitations:**
- Limited access (only top element)
- Fixed size in array-based implementation
- Not thread-safe

---

## 2. Queues in Java

### What is a Queue?
A Queue is a linear data structure that follows the **First In, First Out (FIFO)** principle, where the element added first is the first one to be removed.

### Types of Queues
- **Simple Queue**: FIFO behavior
- **PriorityQueue**: Elements ordered based on priority
- **Deque**: Double-Ended Queue (insertion/deletion from both ends)

### Key Operations
- `offer(E e)`: Adds an element to the queue
- `poll()`: Retrieves and removes the head of the queue
- `peek()`: Retrieves the head without removing it
- `isEmpty()`: Checks if the queue is empty

### Use Cases
- Task scheduling
- Breadth-first search in graphs
- Request processing in multi-threaded environments

### Sample Problem: Ticket Counter Management

**Scenario**: At a ticket counter, people form a queue to purchase tickets in order of arrival.

```java
import java.util.LinkedList;
import java.util.Queue;

public class TicketCounterManagement {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        
        // Enqueue customers
        ticketQueue.add("Customer 1");
        ticketQueue.add("Customer 2");
        ticketQueue.add("Customer 3");
        ticketQueue.add("Customer 4");

        System.out.println("Initial Queue: " + ticketQueue);

        // Serve customers
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.peek() + " is being served.");
            ticketQueue.remove();
            System.out.println("Queue after serving: " + ticketQueue);
        }
        System.out.println("All customers have been served!");
    }
}
```

### Output
```
Initial Queue: [Customer 1, Customer 2, Customer 3, Customer 4]
Customer 1 is being served.
Queue after serving: [Customer 2, Customer 3, Customer 4]
Customer 2 is being served.
Queue after serving: [Customer 3, Customer 4]
Customer 3 is being served.
Queue after serving: [Customer 4]
Customer 4 is being served.
Queue after serving: []
All customers have been served!
```

### Common Queue Methods
- `add(E e)`: Adds element (throws exception if full)
- `offer(E e)`: Adds element (returns false if full)
- `remove()`: Removes head (throws exception if empty)
- `poll()`: Removes head (returns null if empty)
- `element()`: Retrieves head (throws exception if empty)
- `peek()`: Retrieves head (returns null if empty)

### Best Practices
- Use `offer()` instead of `add()` to avoid exceptions
- Avoid storing null values
- Use thread-safe queues for concurrent scenarios
- Use blocking queues for producer-consumer problems

---

## 3. HashMap in Java

### What is a HashMap?
A HashMap is part of `java.util` package used to store key-value pairs. It provides constant-time performance for most operations (average case).

### Key Operations
- `put(K key, V value)`: Inserts or updates a key-value pair
- `get(Object key)`: Retrieves the value for a given key
- `containsKey(Object key)`: Checks if a key exists
- `remove(Object key)`: Removes a key-value pair

### Use Cases
- Caching data
- Implementing hash-based collections
- Associating user data in web sessions

### Example: Word Frequency Count
```java
HashMap<String, Integer> wordCount = new HashMap<>();
String[] words = {"apple", "banana", "apple"};
for (String word : words) {
    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}
System.out.println(wordCount); // {banana=1, apple=2}
```

### Key Characteristics
- **Key-Value Storage**: Each element stored as key-value pair
- **Unique Keys**: Duplicate keys replace old values
- **Null Handling**: Allows one null key, multiple null values
- **No Order Guarantee**: Insertion order not maintained
- **Not Thread-Safe**: Use ConcurrentHashMap for thread safety

### Internal Working
1. **Hashing**: Hash function computes hash code for keys
2. **Buckets**: Internal array of Node objects (default size: 16)
3. **Collision Handling**: Separate chaining with linked lists/trees
4. **Load Factor**: Default 0.75 (75% capacity before resizing)

### Key Methods
```java
// Insertion
map.put(key, value);

// Retrieval
map.get(key);

// Deletion
map.remove(key);

// Check existence
map.containsKey(key);
map.containsValue(value);

// Iteration
for (K key : map.keySet()) { }
for (V value : map.values()) { }
for (Map.Entry<K, V> entry : map.entrySet()) { }
```

### Performance
- **Time Complexity**: O(1) average, O(n) worst case
- **Space Complexity**: Depends on buckets and entries

### Best Practices
- Use suitable initial capacity to minimize resizing
- Override `equals()` and `hashCode()` in custom key classes
- Avoid null keys/values when logic depends on non-null data
- Use immutable objects as keys
- Consider ConcurrentHashMap for multi-threaded environments

---

## 4. Hashing Function in Java

### What is Hashing?
Hashing is a technique to uniquely map data to a fixed-size value (hash code) using a mathematical function. Used in HashMap, HashSet, Hashtable for efficient operations.

### Key Concepts
- **Hash Code**: Numeric representation of an object
- **Hash Function**: Computes hash code of an object
- **Collisions**: When distinct objects produce same hash code
- **Buckets**: Logical slots in hash table for storing elements

### The hashCode() Method
```java
public native int hashCode();
```

### Rules for Overriding hashCode()
1. Equal objects must have same hash code
2. Unequal objects may have same hash code (collision allowed)
3. Use all significant fields for hash code computation
4. Hash code should remain consistent during object's lifetime

### Custom hashCode() Example
```java
import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}
```

### Best Practices for hashCode()
- **Consistent Output**: Don't change during object's lifetime
- **Efficient Calculation**: Fast computation, avoid complex operations
- **Minimize Collisions**: Uniform distribution across hash table
- **Match equals()**: Equal objects must return same hash code

### Common Hashing Algorithms
1. **Division Method**: `index = key % tableSize`
2. **Multiplication Method**: `index = floor(tableSize * (key * constant % 1))`
3. **Custom Algorithms**: Combine hash codes of multiple fields

### Applications
- Hash-based data structures (HashMap, HashSet)
- Database indexing
- Password storage
- Caching systems

### Hashing Steps in Java
1. **Compute Hash Code**: Object's `hashCode()` generates integer
2. **Map to Bucket**: Use `(hashCode % tableSize)` for bucket index
3. **Store/Retrieve**: Add to bucket or search within bucket

---

## Summary

This documentation covers the fundamental data structures in Java:

- **Stacks**: LIFO principle, perfect for expression evaluation and undo operations
- **Queues**: FIFO principle, ideal for scheduling and buffering
- **HashMap**: Key-value storage with efficient lookup, insertion, and deletion
- **Hashing**: Core technique enabling efficient hash-based data structures

Each structure has specific use cases and performance characteristics that make them suitable for different programming scenarios.