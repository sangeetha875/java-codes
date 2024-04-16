package myFirstJava;

public class java2 {
	static int a1 = 20;
	static int b1 = 10;
	static int res1 = 1;

	public static void addition() {
		res1 = a1 + b1;
		System.out.println(res1);
	}

	public static void subtract() {
		res1 = a1 - b1;
		System.out.println(res1);
	}

	public static void multiply() {
		res1 = a1 * b1;
		System.out.println(res1);
	}

	public static void divi() {
		res1 = a1 / b1;
		System.out.println(res1);
	}

	public static void modul() {
		res1 = a1 % b1;
		System.out.println(res1);
	}

	public static void main(String[] args) {

		addition();
		subtract();
		multiply();
		divi();
		modul();
	}
}