package linkedListPrograms;

import java.util.LinkedList;

public class Program01 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Sujit");
		list.add("b");
		list.add("Kadus");
		
		for(String e: list)
		{
			System.out.println(e);
		}
	}

}
