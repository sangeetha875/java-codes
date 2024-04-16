package myFirstJava;
abstract class One
{
	abstract void ename();
	abstract void eno();
	void display() 
	{
		System.out.println("Hi in display from one");
	}
}
 abstract class two
{
	 abstract void name();
	 abstract void no();
	 void disp() 
	 {
		 System.out.println("Hi in disp from two");
	}
	}
 class three extends One
 {
	void ename() {
		System.out.println("Hi in ename from three");
	}
	void eno() {
		System.out.println("Hi in eno from three");
	}
 }
 public class assignment extends two
{

	public static void main(String[] args) {
		assignment a = new assignment();
		a.name();
		a.no();
		a.disp();
		three t = new three();
		t.ename();
		t.eno();
		t.display();
	}
	void name() 
	{
		System.out.println("Hi in name from assignment");
	}
	
	void no() {
		System.out.println("Hi in no from assignment");
	}
}
