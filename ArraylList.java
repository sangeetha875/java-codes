package myFirstJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylList {

	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		
		a1.add(1032);
		a1.add(333);
		a1.add("geetha");
		a1.add(10.55);
		a1.add(null);
		a1.add(false);
			
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		
		a2.add(555);
		a2.add(-750);
		a2.add(25);
		a2.add(250);
		a2.add(6);
		a2.add(23);
		
		Collections.sort(a2);
		System.out.println(a2);

	}

}
