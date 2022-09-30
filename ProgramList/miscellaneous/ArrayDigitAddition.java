package miscellaneous;

public class ArrayDigitAddition {
	
	public static void main(String[] args) {

		//Write down a Java program to find elements from an array whose sum is 7
		
		int [] arr = new int[]{12,16,25,56,61,66};
		
		for(int i=0; i<arr.length;i++)
		{
			int sum=0;
			int num = arr[i];
			while(num>0)
			{
				int digit = num%10;
				sum = sum+digit;
				num=num/10;
			}
			if(sum==7)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}
