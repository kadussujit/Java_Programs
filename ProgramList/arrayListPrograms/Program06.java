package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program06 {
/*
 * Write a Java program to remove the third element from a array list.
 */
	public static void main(String[] args) {

		List<String>array = new ArrayList<String>();
		array.add("red");
		array.add("white");
		array.add("black");
		array.add("white");
		array.add("purple");
		
		System.out.println(array);
		
		array.remove(3);
		System.out.println(array);
	}

}
