/*Java Program to Check Palindrome
A palindromic number is a number (such as 16461) that remains the same
 when its digits are reversed.*/
package assignment;

import java.util.Scanner;

public class Example25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Palindrome number: ");
		int num= sc.nextInt();
		int a=num;
		int reverse=0;
		
		while(a>0)
		{
			int rem=a%10;					//calculate remainder
			
			reverse = 10*reverse+ rem;		//calculating reverse number
			
			a=a/10;							//calculating next number
		}
		
		if(reverse==num)
		{
			System.out.println(num+ " is a Palindrome number.");
		}
		else
		{
			System.out.println(num+ " is not a Palindrome number.");
		}
		sc.close();
	}

}
