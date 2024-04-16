package myFirstJava;

public class dtype {
	//Non Static Methods
	int a = 10;
	int b = 20;
	int res;
	public void sum(){
		res = a + b;
		System.out.println(res);
	}
	public void diff(){
		res = a - b;
		System.out.println(res);
	}
	public void mul(){
		res = a * b;
		System.out.println(res);
	}
	public void div(){			
		res = a / b;
		System.out.println(res);
	}
	public void modulo() {
		res = a%b;
		System.out.println(res);
	}
	//Static Methods
	static int a1=20;
	static int b1= 10;
	static int res1 = 1;
	public static void addition()
	{
		res1= a1+b1;
		System.out.println(res1);
		}
	public static void subtract()
	{
		res1= a1-b1;
		System.out.println(res1);
	}
	
	public static void multiply()
	{
	res1=a1*b1;
	System.out.println(res1);
	}
	
	public static void divi()
	{
		res1=a1/b1;
		System.out.println(res1);
	}
	
	public static void modul()
{
	res1=a1%b1;
	System.out.println(res1);
}
	
	public static void main(String[] args) {
		dtype d = new dtype();
		d.sum();
		d.diff();
		d.mul();
		d.div();
		d.modulo();
		
		
		addition();
		subtract();
		multiply();
		divi();
		modul();
	}
}