package miscellaneous;

public class IntegerOccurence {
	
	public static void main(String[]args)
	{
		//Write down a Java program to find frequency of occurence of integers from an array.
		
		int [] arr = new int[] {0,5,3,0,1,8,6,1,4};
		
		int[] visitedArr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visitedArr[j]=-1;
				}
			}
			
			if(visitedArr[i]>-1)
			{
				visitedArr[i]=count;
			}
		}
		
		for(int i=0;i<visitedArr.length;i++)
		{
			if(visitedArr[i]>-1)
			{
				System.out.println("Frequency of occurence of "+arr[i]+" : "+visitedArr[i]);
			}
		}
		
		
		
		
		
		
		
		
	}
}
