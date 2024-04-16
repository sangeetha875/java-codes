package myFirstJava;
import java.util.Scanner;

public class Frogif 
{

	public static void main(String[] args) 
	
	{
		int i;
		Scanner s1=new Scanner(System.in);
		System.out.print( "enter any number: ");
		
			i=s1.nextInt();
		
		
		if (i%3==0 && i%5==0)
		{
			System.out.println("its both frog and cat");
		}
		else if(i%5==0)
			
		{
			System.out.println("its cat");
		}
		else if( i%3==0)
		{
			System.out.println("its frog");
		}
		else
		{
			System.out.println( "none");
		}
		s1.close();
		
	}
	}


