//Java Program to Find all Roots of a Quadratic Equation
package assignment;

import java.util.Scanner;

public class Example08 {
	
	public static void main(String[] args) {
		System.out.println("Quadratic Equation is: ax^2+bx+c=0");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter value of b: ");
		int b = sc.nextInt();
		System.out.print("Enter value of c: ");
		int c = sc.nextInt();
		
		double root1; 
		double root2;
		double determinant = (b*b-4*a*c);	//calculate determinant
		System.out.println("\nDeterminant is " +determinant);
		
		if(determinant>0) 					//roots are real and imaginary
		{
			root1 = (-b+Math.sqrt(determinant))/(2*a);
			root2 = (-b-Math.sqrt(determinant))/(2*a);
			
			System.out.println("\nFirst root is "+root1);
			System.out.println("Second root is "+root2);
		}
		else if(determinant==0) 			//roots are same
		{
			root1 = -b/(2*a);
			root2 = -b/(2*a);
			
			System.out.println("\nFirst root is "+root1);
			System.out.println("Second root is "+root2);
		}
		else if(determinant<0)			//roots are imaginary, real and both are different
		{
			root1 = -b/(2*a);
			root2 = Math.sqrt(-determinant)/(2*a);
			
			System.out.println("\nFirst root is "+root1);
			System.out.println("Second root is "+root2);
		}
		sc.close();
	}

}
