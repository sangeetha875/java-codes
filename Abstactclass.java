package myFirstJava;
abstract class Google_code1
{
	abstract  void login();
	abstract void regestration();
}
public class Abstactclass extends Google_code1
{
public static void main(String[] args)
{
Abstactclass a1=new Abstactclass();
a1.login();
a1.regestration();
}
void login()
{
System.out.println("login logic");
}
void regestration() 
{
System.out.println("regestration logic");
}		
}