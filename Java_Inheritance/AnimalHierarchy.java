package level_1;
import java.util.*;
class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Aniamls Make Sound");
	}
	
	void Display() {
		System.out.println("Animal: " + name + " Age: " + age);
	}
}

class Dog extends Animal{
	
	Dog(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println(name + " Barks");
	}
}

class Cat extends Animal{
	
	Cat(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println(name + " Meoww");
	}
}

class Bird extends Animal{
	
	Bird(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println(name + " Chirp");
	}
}

public class AnimalHierarchy {
	public static void main(String[] args) {
		Dog d = new Dog("Sheru", 2);
		d.Display();
		d.makeSound();
	    Cat c = new Cat("Joe", 1);
	    c.Display();
	    c.makeSound();
		Bird b = new Bird("Sparrow", 3);
		b.Display();
		b.makeSound();
	}
}
