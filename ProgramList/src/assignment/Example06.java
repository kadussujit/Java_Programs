//Java Program to Check Whether an Alphabet is Vowel or Consonant
package assignment;

import java.util.Scanner;

public class Example06 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char alphabet = sc.next().charAt(0);
		
//		char alphabet='a';
		System.out.println(alphabet);
		
		if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}
		sc.close();
	}

}
