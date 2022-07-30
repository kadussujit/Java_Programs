//Java Program to Calculate the Power of a Number 
package assignment;

import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base number: ");
		int base = sc.nextInt();
		
		System.out.print("Enter exponent number: ");
		int exponent = sc.nextInt();
		
		double result = Math.pow(base, exponent);
		
		System.out.println(result);
		sc.close();

	}

}
