package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program08 {
/*
 * Write a Java program to sort a given array list.
 */
	public static void main(String[] args) {

		List<String>array = new ArrayList<String>();
		array.add("red");
		array.add("white");
		array.add("black");
		array.add("white");
		array.add("purple");
		
		System.out.println("List before sorting: "+array);
		Collections.sort(array);
		System.out.println("List after sorting: "+array);
	}

}
