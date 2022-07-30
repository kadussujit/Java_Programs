package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program12 {
/*
 * Write a Java program to extract a portion of a array list.
 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("white");
		list.add("black");
		list.add("red");
		list.add("green");
		list.add("orange");
		
		System.out.println("Original list: "+list);
		
		List<String>sub_list = list.subList(0, 3);
		
		System.out.println("Extracted List: "+sub_list);
	}

}
