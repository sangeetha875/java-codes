package myFirstJava;

public class Constructorex1 {

	int a=50;
	int b=100;
	public void ex1() 
	{
		System.out.println(a+b);
	}
		public void ex2()
	{
		System.out.println(a-b);
		}
	public void ex3() 
	{
		System.out.println(a*b);
		}
	public void ex4() 
	{
		System.out.println(a/b);
		}
	public void ex5() 
	{
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		
		 Constructorex1 se = new Constructorex1();
		
		 se.ex1();
		 se.ex2();
		 se.ex3();
		 se.ex4();
		 se.ex5();
		 
	}

}
