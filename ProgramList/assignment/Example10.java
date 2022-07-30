//Java Program to Check Whether a Number is Positive or Negative
package assignment;

import java.util.Scanner;

public class Example10 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		if(num>=0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
		sc.close();
	}

}
