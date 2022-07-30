package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to iterate through all elements in a array list.
		 */

		List<String>arr_list = new ArrayList<String>();
		arr_list.add("Sujit");
		arr_list.add("Sudarshan");
		arr_list.add("Akash");
		arr_list.add("Nandkishor");
		
		for(String a: arr_list)
		{
			System.out.println(a);
		}
	}

}
