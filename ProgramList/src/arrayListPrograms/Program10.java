package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program10 {
	/*
	 * Write a Java program to shuffle elements in a array list.
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println("List before Shuffling");
		System.out.println(list);
		System.out.println("List after Shuffling");
		Collections.shuffle(list);
		System.out.println(list);
	}

}
