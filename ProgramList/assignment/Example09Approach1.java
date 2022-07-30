package assignment;

import java.util.Scanner;

public class Example09Approach1 {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a year to check leap year: ");
	int year = sc.nextInt();
	
	/*Condition: 
	 * If the year is evenly divisible by 4,100 and 400, it is a leap year.
	 * Otherwise it is not a leap year
	 */
	
	if (year%400==0)
	{
		System.out.println("It is a leap year");
	}
	else if(year%100==0)
	{
		System.out.println("It is not a leap year");
	}
	
	else if(year%4==0)
	{
		System.out.println("It's a leap year");
	}
	else
	{
		System.out.println("It is not a leap year");
	}
	sc.close();
	}

}
