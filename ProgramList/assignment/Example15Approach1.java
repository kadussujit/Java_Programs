// Java Program to Calculate the Sum of Natural Numbers
package assignment;

import java.util.Scanner;

public class Example15Approach1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto which you calculate natural number: ");
		double n = sc.nextDouble();
		
		int num=0;
		
		for (int i=1;i<=n;i++)
		{
			num = num+i;
		}
		System.out.println(num);
		sc.close();
	}

}
