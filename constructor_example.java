package myFirstJava;

public class constructor_example {
	constructor_example() {
		System.out.println("my default constructor");
	}
	constructor_example(int a, int b) {
		System.out.println("my double int constructor "+a+" "+b);
	}
	constructor_example(int a, int b, int c) {
		System.out.println("my default2 constructor "+a+" "+b+" "+c);
	}
	constructor_example(double a) {
		System.out.println("my default3 constructor "+a );
	}
	constructor_example(boolean a) {
		System.out.println("my default4 constructor "+a);
	}
	
	public static void main(String[] args) {
		
		constructor_example c1= new constructor_example();
		constructor_example c2= new constructor_example(10,20,30);
		constructor_example c3= new constructor_example(33.44);
		constructor_example c4= new constructor_example(200,10);
		constructor_example c5= new constructor_example(true);
				
		
	}

}
