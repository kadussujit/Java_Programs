package starPattern;

import java.util.Scanner;

public class Pattern11_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and columns: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=2;j<=i;j++)			//print space
			{
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--)			//print star
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)			//print star
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}
