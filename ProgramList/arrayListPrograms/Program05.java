package arrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program05 {

	public static void main(String[] args) {

		List<String>array = new ArrayList<String>();
		array.add("red");
		array.add("white");
		array.add("black");
		array.add("white");
		array.add("purple");
		
		System.out.println(array);
		
		array.set(3, "blue");
		System.out.println(array);
	}

}
