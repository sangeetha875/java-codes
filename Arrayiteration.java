package myFirstJava;

public class Arrayiteration {

	
		public static void main(String[] args) {
	        // Original array
	        int[] originalArray = {1, 2, 3, 4, 5};

	        // Create a new array to store the copy
	        int[] copiedArray = new int[originalArray.length];

	        // Iterate over the original array and copy each element to the new array
	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	        // Print the original array
	        System.out.print("Original Array: ");
	        printArray(originalArray);

	        // Print the copied array
	        System.out.print("Copied Array: ");
	        printArray(copiedArray);
	    }

	    // Helper method to print an array
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	
	}


