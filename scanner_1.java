package myFirstJava;

import java.util.Scanner;

public class scanner_1 {
	
	static final double pi = 3.14;
	
	public static void main(String[] args)

	{
		Scanner s1 = new Scanner(System.in);
		int a = 10;
		System.out.println("Old value is : " + a);
		System.out.println("Enter a new a value :");
		a = s1.nextInt();
		System.out.println("New value is : " + pi);

	}
}
