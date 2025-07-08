# Linked List Data Structure

A linked list is a linear data structure where elements (called nodes) are linked using pointers. Each node consists of two parts:
- **Data**: Holds the value of the node
- **Pointer**: Points to the next node (or previous node, in the case of doubly linked lists)

## Types of Linked Lists

### 1. Singly Linked List (SLL)

In a Singly Linked List, each node contains data and a pointer to the next node. The last node points to null.

**Structure:**
```
Head -> Node1 -> Node2 -> Node3 -> null
```

#### Operations:
- **Insertion**: At the beginning, at the end, at a specific position
- **Deletion**: From the beginning, from the end, from a specific position
- **Traversal**: Visit each node sequentially

#### Advantages:
- Dynamic size: Memory is allocated as needed
- Efficient insertion and deletion compared to arrays

#### Disadvantages:
- Sequential access only (no direct access to elements)
- More memory usage due to pointers

### 2. Doubly Linked List (DLL)

In a Doubly Linked List, each node contains:
- Data
- A pointer to the next node
- A pointer to the previous node

**Structure:**
```
null <- Node1 <-> Node2 <-> Node3 -> null
```

#### Operations:
- **Insertion**: 
  - At the beginning: Adjust prev pointer of the head
  - At the end: Adjust the next pointer of the last node
  - At a specific position: Adjust both prev and next pointers
- **Deletion**: Update both prev and next pointers
- **Traversal**: 
  - Forward traversal: From head to tail
  - Backward traversal: From tail to head

#### Advantages:
- Traversal in both directions
- Easier to delete a node when a reference to it is provided

#### Disadvantages:
- Requires more memory due to two pointers per node

### 3. Circular Linked List (CLL)

In a Circular Linked List, the last node points back to the first node, forming a circle.

**Structure:**

a. **Singly Circular Linked List:**
```
Node1 -> Node2 -> Node3 -> Node1 (Head)
```

b. **Doubly Circular Linked List:**
```
Node1 <-> Node2 <-> Node3 <-> Node1 (Head)
```

#### Operations:
- **Insertion**:
  - At the beginning: Update the last node to point to the new head
  - At the end: Update the new node to point to the head
- **Deletion**: Update the links to skip the node being deleted
- **Traversal**: Use a loop to traverse until the head is encountered again

#### Advantages:
- Suitable for circular operations (e.g., scheduling, buffering)
- No null values, making traversal simpler in certain cases

#### Disadvantages:
- More complex to implement
- Requires careful handling to avoid infinite loops

## Code Examples

### Singly Linked List Node
```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

### Doubly Linked List Node
```java
class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}
```

### Circular Linked List Node
```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = this; // Pointing to itself for circularity
    }
}
```

## Comparison Table

| Feature | Singly Linked List | Doubly Linked List | Circular Linked List |
|---------|-------------------|-------------------|---------------------|
| Memory | Less (one pointer) | More (two pointers) | Similar to SLL/DLL |
| Traversal | Forward only | Forward and backward | Circular traversal |
| Complexity | Simpler implementation | More complex due to prev | Most complex due to circularity |
| Use Case | Basic dynamic data storage | Complex data relationships | Cyclical operations |

## Practical Applications

### 1. Employee Record Management Using Linked Lists

**Objective**: Manage employee records using a Singly Linked List. Each node represents an employee record with fields like ID, Name, Department, and Salary.

#### Features:
- **Add Employee**: Insert a new employee record at the beginning, end, or a specific position
- **Delete Employee**: Remove an employee record by ID
- **Search Employee**: Find an employee record by ID or Name
- **Display Records**: Display all employee records in the linked list

#### Node Structure:
```java
class EmployeeNode {
    int id;
    String name;
    String department;
    double salary;
    EmployeeNode next;

    public EmployeeNode(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.next = null;
    }
}
```

#### Operations:
- **Add Employee**:
  - If adding at the beginning, update the head of the list
  - If adding at the end, traverse to the last node and update its next pointer
- **Delete Employee**:
  - Locate the node to be deleted by matching the ID
  - Update the next pointer of the preceding node to skip the deleted node
- **Search Employee**:
  - Traverse the list, checking each node's ID or Name field
- **Display Records**:
  - Traverse the list from the head to the end, printing each node's data

#### Use Cases:
- Manage dynamic employee data for small organizations
- Useful for operations like adding, deleting, or searching employees without predefined limits

### 2. Playlist Management Using Circular Linked List

**Objective**: Manage a music playlist using a Circular Linked List. Each node represents a song with fields like Song Name, Artist, and Duration.

#### Features:
- **Add Song**: Insert a new song at the beginning, end, or a specific position in the playlist
- **Delete Song**: Remove a song by its name
- **Play Next Song**: Move to the next song in the playlist
- **Play Previous Song**: (If using a doubly circular linked list)
- **Display Playlist**: Print all songs in the playlist

#### Node Structure:
```java
class SongNode {
    String songName;
    String artist;
    double duration; // In minutes
    SongNode next;

    public SongNode(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.next = this; // Point to itself for circularity
    }
}
```

#### Operations:
- **Add Song**:
  - If adding at the beginning, update the new node's next pointer to the current head and the last node's next pointer to the new node
  - If adding at the end, link the last node's next pointer to the new node, and the new node's next pointer to the head
- **Delete Song**:
  - Locate the node containing the song name
  - Update the preceding node's next pointer to skip the deleted node
- **Play Next Song**:
  - Move to the next node from the current node
- **Display Playlist**:
  - Start from the head and traverse the list until the head is encountered again

#### Use Cases:
- Create dynamic music playlists
- Useful for cyclic playback without manual restarting

## Summary

Linked lists are fundamental data structures that provide dynamic memory allocation and efficient insertion/deletion operations. The choice between different types depends on specific requirements:

- Use **Singly Linked Lists** for simple, forward-only traversal needs
- Use **Doubly Linked Lists** when bidirectional traversal is required
- Use **Circular Linked Lists** for applications requiring cyclic operations

Each type has its own trade-offs in terms of memory usage, implementation complexity, and functionality.