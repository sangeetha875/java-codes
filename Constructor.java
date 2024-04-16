package myFirstJava;

public class Constructor 
{
	public static void add()
	{
		int a=100;
		int b=200;
		int sum=(a+b);
		System.out.println(sum);
	}
	public static void subtract()
	{
		int a=10;
		int b=20;
		int sum1=(a-b);
		System.out.println(sum1);
	}
	public static void mul()
	{
		int a=50;
		int b=70;
		int sum2=(a*b);
		System.out.println(sum2);
	}
		public static void divi()
		{
			int s=150;
			int r=15;
			int sum3=(s/r);
			System.out.println(sum3);
		}
		public static void modu()
		{
			int a=500;
			int b=100;
			int sum4=(a%b);
			System.out.println(sum4);
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		subtract();
		mul();
		divi();
		modu();
	}

}
