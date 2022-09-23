package miscellaneous;

import java.util.Scanner;

public class NoOfDigitsIn_String {

	public static void main(String[] args) {

		//Java program to count number of digits in a string
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		sc.close();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch>=48 && ch<=57)
			{
				count++;
			}
		}
		
		System.out.println("Number of digits in a string are: "+count);
	}

}
