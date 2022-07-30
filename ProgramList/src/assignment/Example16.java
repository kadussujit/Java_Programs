//Java Program to Find Factorial of a Numbers	
package assignment;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number to find its factorial:");
				int a= sc.nextInt();
				int num=1;
						
				for (int i=1;i<=a;i++)
				{
					num=num*i;
				}
				System.out.println(num);
				sc.close();
			}

		}