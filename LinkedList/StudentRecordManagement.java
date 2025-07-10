package LinkedList;

class StudentNode {
	int roll;
	String name;
	int age;
	String grade;
	StudentNode next;

	public StudentNode(int roll, String name, int age, String grade) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}

class StudentLinkedList {
	private StudentNode head;

	public void Add(int roll, String name, int age, String grade) {
		StudentNode sn = new StudentNode(roll, name, age, grade);
		if (head == null) {
			head = sn;
		} else {
			StudentNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = sn;
		}
	}

	public void AddB(int roll, String name, int age, String grade) {
		StudentNode sn = new StudentNode(roll, name, age, grade);
		sn.next = head;
		head = sn;
	}

	public void AddP(int pos, int roll, String name, int age, String grade) {
		if (pos <= 1) {
			AddB(roll, name, age, grade);
			return;
		}
		StudentNode sn = new StudentNode(roll, name, age, grade);
		StudentNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Index out of Bound");
			Add(roll, name, age, grade);
			return;
		}
		sn.next = temp.next;
		temp.next = sn;
	}

	public void Delete(int roll) {
		if (head == null) {
			return;
		}
		if (head.roll == roll) {
			head = head.next;
		}
		StudentNode temp = head;
		while (temp.next != null && temp.next.roll != roll) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Student Not Found");
		} else {
			temp.next = temp.next.next;
		}
	}

	public void Search(int roll) {
		StudentNode temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		if (head.roll == roll) {
			System.out.println("Search Result");
			System.out.println(
					"Student Roll Number: " + head.roll + " Name: " + head.name + " Age: " + head.age + " Grade: " + head.grade);
		}
		while (temp.next != null && temp.next.roll != roll) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Roll Number not Found");
		} else {
			System.out.println("Search Result");
			System.out.println("Student Roll Number: " + temp.next.roll + " Name: " + temp.next.name + " Age: "
					+ temp.next.age + " Grade: " + temp.next.grade);
		}
	}

	public void Update(int roll, String Grade) {
		StudentNode temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		if (head.roll == roll) {
			head.grade = Grade;
			System.out.println("Updated Record");
			System.out.println(
					"Student Roll Number: " + head.roll + " Name: " + head.name + " Age: " + head.age + " Grade: " + head.grade);
		}
		while (temp.next != null && temp.next.roll != roll) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Roll Number not Found");
		} else {
			temp.next.grade = Grade;
			System.out.println("Updated Record");
			System.out.println("Student Roll Number: " + temp.next.roll + " Name: " + temp.next.name + " Age: "
					+ temp.next.age + " Grade: " + temp.next.grade);
		}
	}

	void Display() {
		StudentNode curr = head;
		while (curr != null) {
			System.out.println(
					"Student Roll Number: " + curr.roll + " Name: " + curr.name + " Age: " + curr.age + " Grade: " + curr.grade);
			curr = curr.next;
		}
	}
}

public class StudentRecordManagement {
	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();
		list.Add(101, "Alice Johnson", 20, "A");
		list.Add(102, "Bob Smith", 19, "B+");
		list.Add(103, "Charlie Davis", 21, "A-");
		list.Add(104, "Diana Evans", 20, "B");
		list.Add(105, "Ethan Brown", 22, "A+");
		list.Display();
		list.Delete(102);
		System.out.println("List After Deleted Record");
		list.Display();
		list.AddP(2, 102, "Bob Smith", 19, "B+");
		System.out.println("List After Inserted Record");
		list.Display();
		list.Search(102);
		list.Update(102, "A");
	}
}
