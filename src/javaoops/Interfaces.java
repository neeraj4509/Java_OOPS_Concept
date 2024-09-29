package javaoops;

public class Interfaces implements C, P{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void start() {
		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		System.out.println("Person is walking");
	}
	
}

interface C {
	
	void start();
	
}

interface P{
	
	void walk();
	
}
