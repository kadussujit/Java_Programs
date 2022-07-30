package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program15 {
/*
 * Write a Java program to join two array lists.
 */
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Maharashtra");
		list1.add("Karnataka");
		list1.add("Tamilnadu");
		list1.add("Gujrat");
		System.out.println("Items of list 1:"+list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Mumbai");
		list2.add("Pune");
		list2.add("Ahmednagar");
		list2.add("Kolhapur");
		System.out.println("Items of list 2:"+list2);
		
		List<String> join_list = new ArrayList<String>();
		join_list.addAll(list1);
		join_list.addAll(list2);
		System.out.println("New list:"+join_list);
	}

}
