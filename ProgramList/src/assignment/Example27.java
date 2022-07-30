// Java Program to Check Armstrong Number
package assignment;

import java.util.Scanner;

public class Example27 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check armstrong number: ");
		int armstrong = in.nextInt();
		
		int num1= armstrong;
		int num2 = armstrong;
		double count = 0;
		double arm=0;
		
		while (num1>0)
		{
			num1 = num1/10;
			count++;
		}
		
		while(num2>0)
		{
			double remainder = num2%10;
			double abc;
			
			abc = Math.pow(remainder, count);
			arm = arm+abc;
			num2 = num2/10;
		}
		
		if(armstrong==arm)
		{
			System.out.println(armstrong+ " is an armstrong number");
		}
		else
		{
			System.out.println(armstrong+ " is not an armstrong number");
		}
		in.close();
	}

}
