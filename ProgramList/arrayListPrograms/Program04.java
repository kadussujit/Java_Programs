package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program04 {
	/*
	 * Write a Java program to retrieve an element (at a specified index) from a given array list.
	 */
	
	public static void main(String[] args) {
		
		List<String>arr = new ArrayList<String>();
		arr.add("rot");
		arr.add("weiß");
		arr.add("lila");
		arr.add("blau");
		arr.add("schwarz");
		arr.add("Orange");
		
		System.out.println(arr);
		
		System.out.println(arr.get(1));
		System.out.println(arr.get(3));
	}

}
