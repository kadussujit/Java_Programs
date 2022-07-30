package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program11 {
/*
 * Write a Java program to reverse elements in a array list.
 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Sujit");
		list.add("Balkrishna");
		list.add("Kadus");
		
		System.out.println("List before reversing: "+list);
		Collections.reverse(list);
		System.out.println("List after reversing"+list);
	}

}
