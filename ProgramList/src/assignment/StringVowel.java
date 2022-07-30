package assignment;

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		// Write a java program to check whether a sentence contains vowels
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();

		for(int i=0;i<input.length();i++)
		{
			char vow = input.charAt(i);
			if(vow=='a'||vow=='e'||vow=='i'||vow=='o'||vow=='u')
			{
				System.out.print(vow);
			}
		}
		
		sc.close();
	}

}
