package myFirstJava;

import java.util.Scanner;

public class Arrayexer1
{
			public static void main ( String[] args) 
	
			{
		    
	        int size = 5; // Assuming you want to store details for 5 students
	        int[] rollNo = new int[size];
	        String[] sName = new String[size];
	        String[] gender = new String[size];
	        int[] mobileNo = new int[size];
	        Scanner s1 = new Scanner(System.in);

	        for (int i = 0; i < size; i++) {
	            rollNo[i] = i + 1;
	            System.out.print("Enter student name for roll no " + rollNo[i] + ": ");
	            sName[i] = s1.nextLine();
	            System.out.print("Enter gender for roll no " + rollNo[i] + ": ");
	            gender[i] = s1.nextLine();
	            System.out.print("Enter mobile no for roll no " + rollNo[i] + ": ");
	            mobileNo[i] = s1.nextInt();
	            s1.nextLine(); // Consume the newline character left by nextInt()
	        }

	        System.out.println("Roll No\tStudent Name\tGender\tMobile No");
	        for (int i = 0; i < size; i++) {
	            System.out.println(rollNo[i] + "\t" + sName[i] + "\t" + gender[i] + "\t" + mobileNo[i]);
	        }
	        s1.close();
	   }
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
