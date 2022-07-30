//Java Program to Reverse a Sentence
package assignment;

import java.util.Scanner;

public class Example28 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		
		char [] reverseString = input.toCharArray();
		
		for(int i=reverseString.length-1;i>=0;i--)
		{
			System.out.print(reverseString[i]);
		}
		
		sc.close();
		
	}

}
