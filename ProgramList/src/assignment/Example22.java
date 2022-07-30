/*Java Program to Display Factors of a Numbers
Factors of a number are that numbers that divide the number completely and remainder of 
divisor is equal to zero.*/
package assignment;

import java.util.Scanner;

public class Example22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number to display its factors: ");
		int num = sc.nextInt();
		
		System.out.print("Factors of "+num+ " are:");
		for (int i=1; i<=num;i++)
		{
			if(num%i==0)						//gives factors
			{
				System.out.print(i+ ",");		//prints factors
			}
		}
		sc.close();
	}

}
