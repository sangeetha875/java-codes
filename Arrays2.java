package myFirstjava
import java.util.Arrays;

public class Arrays2 {
	
    public static void main(String[] args) 
    {
    
        int num[] = new int[4];

        num[0] = 11;
        num[1] = 2;
        num[2] = 5;
        num[3] = 15;

        Arrays.sort(num);
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}