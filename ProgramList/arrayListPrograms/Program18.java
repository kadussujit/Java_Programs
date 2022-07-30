package arrayListPrograms;

import java.util.ArrayList;

public class Program18 {
/*
 * Write a Java program to test an array list is empty or not.
 */
	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList<String>();
		list.add("Sujit");
		list.add("Akshay");
		list.add("Sid");
		list.add("Mahesh");
		
		list.removeAll(list);
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
	}

}
