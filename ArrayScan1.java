package myFirstJava;
import java.util.Arrays;
import java.util.Scanner; // Add import statement for Scanner class

public class ArrayScan1 {

    public static void main(String[] args) {
        int number[] = new int[5];
        
        Scanner g = new Scanner(System.in); // Capitalize 'Scanner'

        System.out.println("Enter the values:");
        for (int i = 0; i < number.length; i++) { // Declare loop variable 'i'
            number[i] = g.nextInt();
        }
        
        System.out.println("Entered values: " + Arrays.toString(number));
    }
}