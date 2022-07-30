package arrayListPrograms;

import java.util.ArrayList;

public class Program16 {
	/*
	 * Write a Java program to clone an array list to another array list.
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("White");
		list.add("Black");
		list.add("Blue");
		list.add("Green");
		
		System.out.println("Original list:"+list);
		
		@SuppressWarnings("unchecked")
		ArrayList<String> copy_list = (ArrayList<String>)list.clone();
		
		System.out.println("Cloned list:"+copy_list);
	}

}
