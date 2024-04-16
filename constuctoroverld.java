package myFirstJava;

public class constuctoroverld {

	constuctoroverld(int a,int b)
	{
		System.out.println("1");
	}
	
	constuctoroverld(double a)
	{
		System.out.println("2");
	}
	constuctoroverld()
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new constuctoroverld();
		new constuctoroverld(65.34);
		new constuctoroverld(10,20);
			}

}
