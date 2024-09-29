package javaoops;

import encapsulation.Encapsulation;

public class MainClass {
	
	public static void main (String[] args) {
		
//Create an Object with class Person
		
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Neeraj";
		
		Person p2 = new Person();
		p2.age = 25;
		p2.name = "Rohit";
		
//Creating an Object with Parameters
		
		Person p3 = new Person(26, "Virat");
		
		System.out.println(p1.age +" "+ p1.name);
		System.out.println(p2.age +" "+ p2.name);
		System.out.println(p3.age +" "+ p3.name);

// Print the method
		p1.talk();
		
//walk method is called 2 times - It is called Polymorphism and as we knows that its called at compile time so it is called as compile time polymorphism.
	    p2.walk();
		p2.walk(2);
		
		System.out.println(Person.count);
		
//Creating object of Inheritance class
		
		Developer d1 = new Developer(28, "Neeraj");
		
		d1.walk();
		
// Encapsulation
		
		Encapsulation obj = new Encapsulation();
		obj.doWork();
		
	}
	
	
}

// Inheritance

class Developer extends Person{
	
	public Developer(int age, String name) {
		super(age, name);
	}

// method for Runtime Polymorphism->
	void walk () {
		System.out.println("Developer "+name + " is walking");
	}
}


//Create a class person
class Person{
	String name;
	int age;

// Static is used to use it for class and not for any object
	static int count;
	
// Create constructor
	public Person(){
		count++;
		System.out.println("Creating an object");
		
	}
	
// Create constructor using parameters
	public Person(int newAge, String newName) {
//     this keyword is used call the constructor of same class
		this();
		name = newName;
		age = newAge;
	}
	
	
	
	
// Create a Method 
	void walk () {
		System.out.println(name + " is walking");
	}
	
	void talk() {
		System.out.println(name +" with age " + age + " is talking");
	}
	
// Create method with arguments
	
	void walk(int step) {
		System.out.println(name + " walked " + step +" step");
	}
	
		
}



