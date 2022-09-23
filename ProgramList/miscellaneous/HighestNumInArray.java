package miscellaneous;

public class HighestNumInArray {

	public static void main(String[] args) {

		//Java program to find highest number in an array
		
		int[] arr = {4,6,8,3,9,2};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Highest number in array is "+max);
		
		
	}

}
