//Java Program to Find LCM of two Numbers
package assignment;

import java.util.Scanner;

public class Example14Approach2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		int lcm=1;
		
		while(lcm<=(a*b))
		{
			if((lcm%a==0)&& (lcm%b==0))
			{
				System.out.println("LCM of "+a+" & "+b+" is "+lcm);
				break;
			}
			lcm++;
		}
		sc.close();
	}

}
