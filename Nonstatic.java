package myFirstJava;

public class Nonstatic 
{
	
		 void add()
		 {
		 int a=100;
		 int b=10;
		 int sum1=(a+b);
		 
			 System.out.println(sum1);
		 }
		 
		public static void main(String[] args) 
		{
		Nonstatic s1=new Nonstatic();
			s1.add();
			
		}
				
}
