// Java Program to Calculate the Sum of Natural Numbers
// Calculate the Sum of Natural Numbers in between two numbers
package assignment;

import java.util.Scanner;

public class Example15Approach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Starting number: ");
		double start = sc.nextDouble();
		
		System.out.print("Enter ending number: ");
		double end = sc.nextDouble();
		
		double num=0;
		
		while(start<=end)
		{
			num=num+start;
			start++;
		}
		System.out.println("Sum of natural numbers is "+num);
		sc.close();

	}

}
