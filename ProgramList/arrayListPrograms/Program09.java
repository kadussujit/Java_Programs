package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program09 {
/*
 * Write a Java program to copy one array list into another.
 */
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("List 1 components: "+list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		System.out.println("List 2 components: "+list2);
		
		Collections.copy(list1, list2);
		
		System.out.println("After copy");
		System.out.println("List 1: "+list1);
		System.out.println("List 2:"+list2);
		
		
	}

}
