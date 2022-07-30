package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program07 {
/*
 * Write a Java program to search an element in a array list.
 */
	public static void main(String[] args) {

		List<String>array = new ArrayList<String>();
		array.add("red");
		array.add("white");
		array.add("black");
		array.add("white");
		array.add("purple");
		
		if(array.contains("black"))
		{
			System.out.println("search result found");
		}
		else
		{
			System.out.println("No results found");
		}
	}

}
