package miscellaneous;

import java.util.Scanner;

public class String_AlternateUppercase {

	public static void main(String[] args) {
		
		/*Write a java program to convert alternate characters to uppercase
		 * e.g. 
		 * Input : maharashtra
		 * Output: mAhArAsHtRa
		 * 
		 * Write a Java program to convert lower case string to upper case at odd position only.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		sc.close();
		
		str = str.toLowerCase();	//This line of code is optional
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(i%2!=0)
			{
				System.out.print(Character.toUpperCase(ch));
			}
			else
			{
				System.out.print(Character.toLowerCase(ch));
			}
		}

	}

}
