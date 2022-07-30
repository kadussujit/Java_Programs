package arrayListPrograms;

import java.util.ArrayList;

public class Program20 {
/*
 * Write a Java program to increase the size of an array list.
 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sujit");
		list.add("Akshay");
		list.add("Sid");
		list.add("Mahesh");
		
		System.out.println("Original array list:"+list);
		//Increasing size to 6
		list.ensureCapacity(6);
	}

}
