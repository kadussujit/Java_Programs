package assignment;

import java.util.Scanner;

public class Example26 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean a = true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				a=false;
				break;
			}
		}
		
		if(a!=true)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is a prime number.");
		}
		sc.close();
	}

}
