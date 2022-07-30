package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to insert an element into the array list at the first position
		 */
		List<String>array = new ArrayList<String>();
		array.add("Red");
		array.add("white");
		array.add("black");
		array.add("blue");
		
		System.out.println(array);
		
		array.add(0, "Rot");
		array.add(4, "blau");
		
		System.out.println(array);
	}

}
