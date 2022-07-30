// Java Program to Make a Simple Calculator Using switch...case
package assignment;

import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("For Addition use 		+\n"
				+ "For Subtraction use		 -\n"
				+ "For Multiplication use		 *\n"
				+ "For division use		 /");
		
		System.out.print("\nEnter a operator: ");
		char op = input.next().charAt(0);
		
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = input.nextDouble();		
		
		double result =0;
		
		switch (op)
		{
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		}
		System.out.println("\nCalculation is: " +num1+""+op+""+num2+"="+result);
		input.close();
	}

}
