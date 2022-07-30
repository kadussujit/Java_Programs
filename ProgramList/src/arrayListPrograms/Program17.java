package arrayListPrograms;

import java.util.ArrayList;

public class Program17 {
/*
 * Write a Java program to empty an array list
 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Pune");
		list.add("Nashik");
		list.add("Nagpur");
		
		System.out.println("Original list:"+list);
		
		list.removeAll(list);
		System.out.println("List after removal:"+list);
	}

}
