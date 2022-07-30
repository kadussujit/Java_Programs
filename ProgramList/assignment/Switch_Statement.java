package assignment;

import java.util.Scanner;

public class Switch_Statement {

	public static void meth1()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number between 1-7: ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case(1):
			System.out.println("Today is Sunday");
		case(2):
			System.out.println("Today is Monday");
		case(3):
			System.out.println("Today is tuesday");
		break;
		case(4):
			System.out.println("Today is Wednesday");
		case(5):
			System.out.println("Today is Thursday");
		case(6):
			System.out.println("Today is Friday");
		case(7):
			System.out.println("Today is Saturday");
		}
		sc.close();
	}	
		public static void main(String[]args)
		{
			meth1();
		}
		
}
