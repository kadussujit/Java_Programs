package arrayPrograms;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();			//array size declaration and initialization
		
		int arr[] = new int[n];			//array declaration
		
		System.out.println("Enter elements of array:");
		for(int i=0; i<n;i++)			// array initialization
		{
			arr[i]=sc.nextInt();
		}
		
		int temp = 0;					//Temporary variable to store the element
		
		for(int i=0; i<arr.length;i++)	//Holds each Array element
		{
			for (int j=i+1;j<arr.length;j++)	//compares with remaining Array elements
			{
				if(arr[i]<arr[j])		//Compare and swap
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		
		//Displaying elements of array after sorting  
		System.out.println("Array sorted in descending order:");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
