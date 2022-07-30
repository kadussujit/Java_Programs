package stringPrograms;

public class ChangeCase {

	public static void main(String[] args) {
		/*
		 * Write a program to convert lower case to upper case and vice versa
		 */

		String str = "Sujit Kadus";
		StringBuffer string = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				string.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				string.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		
		System.out.println("After conversion: "+string);
	}

}
