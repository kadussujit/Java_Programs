//Java Program to Find LCM of two Numbers
package assignment;

import java.util.Scanner;

public class Example14Approach1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int lcm=1;
		
		for(int i=max; i<=num1*num2; i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm = i;
				break;
			}
		}
		System.out.println("LCM is "+lcm);
		sc.close();

	}

}
