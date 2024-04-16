package myFirstJava;
import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        int number[] = new int[3];
        int number2[] = new int[3]; // Initialize number2 with the same length as number

        number[0] = 20;
        number[1] = 30;
        number[2] = 40;

        // No need to assign any value to number2 because Arrays.equals() will compare the elements of both arrays

        boolean answer = Arrays.equals(number, number2);

        System.out.println(answer);
    }
}


