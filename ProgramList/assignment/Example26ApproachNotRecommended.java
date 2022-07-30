// Java Program to Check Whether a Number is Prime or Not
package assignment;

import java.util.Scanner;

public class Example26ApproachNotRecommended {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean prime = true;
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime==true)
		{
			System.out.println(num+" is a prime number.");
		}
		else
		{
			System.out.println(num+" is not a prime number.");
		}
		sc.close();
	}

}
