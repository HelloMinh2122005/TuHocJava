package arraylist;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		for (int i = 1; i < 5; i++)
			a.add(i);
		a.add("Hello");
		System.out.println(a.toString()); // [1, 2, 3, 4, Hello]
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("World");
		b.add(2); // error 
		
		ArrayList<Integer> c = new ArrayList<Integer>
		c.add("World"); // error 
		c.add(2); 
		
		// get element at position ... 
		System.out.println(a.get(1));
		
		// remove element at pos... 
		a.remove(1);
	}
}
