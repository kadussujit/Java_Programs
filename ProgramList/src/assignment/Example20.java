//Java Program to Reverse a Number
package assignment;

import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number to reverse: ");
		int num = sc.nextInt();
		
		int reverse=0;
		int rem;
		
		while(num>0)						//Loop will continue until number==0
		{
			rem = num%10;					// get last digit from number
			
			reverse = reverse*10+rem;
			
			num=num/10;						//removing last digit form number
		}
		System.out.println(reverse);
		sc.close();
	}

}