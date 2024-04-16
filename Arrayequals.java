package myFirstJava;
	import java.util.Arrays;

	public class Arrayequals
	{
	
		    public static void main(String[] args) 
		    {
	    
	        int[] array1 = {1,2,3,4,5};
	        int[] array2 = {1, 2, 3, 4, 5};

	        if (arraysEqual(array1, array2)) {
	            System.out.println("Arrays are equal.");
	        } else {
	            System.out.println("Arrays are not equal.");
	        }
	    }

	    // Method to check if two arrays are equal
	    public static boolean arraysEqual(int[] array1, int[] array2) {
	        // Check if arrays are null or have different lengths
	        if (array1 == null || array2 == null || array1.length != array2.length) {
	            return false;
	        }

	        // Iterate over each element and compare
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i] != array2[i]) {
	            	if (array1[i] != array2[i]) {
	                    return false; // Arrays are not equal if any corresponding elements are different
	                }
	            }

	            return true; // Arrays are equal if all corresponding elements are the same
	        }
	    }
	            	
	            	