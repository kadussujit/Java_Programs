package stringPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		/*
		 * Write a program-to-determine-whether-two-strings-are-the-anagram
		 */

		String str1 = "Grab";
		String str2 = "Brag";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both strings are not Anagram");
		}
		else
		{
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)== true)
			{
				System.out.println("Strings are Anagram");
			}
			else
			{
				System.out.println("Strings aren't Anagram");
			}
		}
	}

}
