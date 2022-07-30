package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program14 {
/*
 * Write a Java program of swap two elements in an array list.
 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ahmednagar");
		list.add("Pune");
		list.add("Mumbai");
		list.add("SambhajiNagar");
		
		System.out.println("Before Swapping: "+list);
		
		Collections.swap(list, 0, 2);
		
		System.out.println("After swapping: "+list);
	}

}
