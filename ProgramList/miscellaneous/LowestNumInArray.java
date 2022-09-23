package miscellaneous;

public class LowestNumInArray {

	public static void main(String[] args) {

		//Java program to find lowest number in array
		
		int [] arr = {5,6,3,7,9,4,1};
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Lowest number in array is "+min);
		
	}

}
