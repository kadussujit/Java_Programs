package assignment;

import java.util.Scanner;

public class StringVowelCount {

	public static void main(String[] args) {
		// Java program to count number of Vowels in a string
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		int count =0;
		
		for (int i=0;i<sentence.length();i++)
		{
			char ch = sentence.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
