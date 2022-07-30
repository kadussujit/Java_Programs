package stringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		/*
		 * Write a program to remove spaces
		 */
		
		String str = "my name is sujit";
		
		str = str.replaceAll(" ", "");
		
		System.out.println("After removing all spaces\n"+str);

	}

}
