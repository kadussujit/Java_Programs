package stringPrograms;

public class CountNoOfCharInString {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to count number of characters in a string
		 */
		
		String string = "my name is sujit";
		int count =0;
		
		//counts each character except space
		for(int i=0; i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
