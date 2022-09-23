package miscellaneous;

public class ArrayDescendingOrder {
	
	public static void main(String[] args) {
		
		//Java program to sort arrays in descending order
		
		int [] arr = new int[] {1,3,5,7,9};
		
		int temp=0;										//Temp variable to store element
		
		for(int i=0;i<arr.length;i++)					//interating loop
		{
			for(int j=i+1;j<arr.length;j++)				//compares with other elements of array
			{
				if(arr[i]<arr[j])						//compare and swap
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//till this elements of array are put in descending order
		
		//now print the descending order array
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
