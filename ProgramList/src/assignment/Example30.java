package assignment;

import java.util.Scanner;

public class Example30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence to check duplicates: ");
		String input = sc.nextLine();
		
		char[] arr = input.toCharArray();
		int count;
		
		for(int i=0; i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j] && arr[i]!=' ')
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>1 && arr[i]!='0')
			{
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
