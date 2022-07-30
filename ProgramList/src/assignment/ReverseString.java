package assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[]args) {
		//Java program to reverse a string
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		
		char[]reverse= input.toCharArray();
		
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]);
		}
		sc.close();
	}
}
