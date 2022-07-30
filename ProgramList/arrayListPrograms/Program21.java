package arrayListPrograms;

import java.util.ArrayList;

public class Program21 {
/*
 * Write a Java program to print all the elements of a ArrayList using the position of the elements.
 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sujit");
		list.add("Akshay");
		list.add("Sid");
		list.add("Mahesh");
		int elements = list.size();
		
		for(int i=0;i<elements;i++)
		{
			System.out.println(list.get(i));
		}
	}

}
