//Java Program to Find the Largest Among Three Numbers
package assignment;

public class Example07 {
	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 12;
		int c= 8;
		
		if(a>=b & a>=c)
		{
			System.out.println(a+ " is the largest number.");
		}
		else if(b>=c && b>=a)
		{
			System.out.println(b+ " is the largest number.");
		}
		else
		{
			System.out.println(c+ " is the largest number.");			
		}
	}

}
