package arrayListPrograms;

import java.util.ArrayList;

public class Program19 {
/*
 * Write a Java program to trim the capacity of an array list the current list size.
 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sujit");
		list.add("Akshay");
		list.add("Sid");
		list.add("Mahesh");
		
		System.out.println("Original list:"+list);
		
		list.trimToSize();
		System.out.println("List after trimming:"+list);
	}

}
