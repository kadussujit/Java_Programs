//// Java Program to Generate Multiplication Table
package assignment;

import java.util.Scanner;

public class Example17Approach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int res=1;
		int i=1;
		while(i<=10)
		{
			res = num*i;
			System.out.println(num+"*"+i+"="+res);
			i++;
		}
			
		sc.close();
	}

}
