package miscellaneous;

public class ReverseString {

	public static void main(String[] args) {

		//Java program to reverse a string
		String s ="Sujit";					//declaring and initializing a string
		
		char[] arr = s.toCharArray();		//converting to array
		
		for(int i=arr.length-1;i>=0;i--)	//iterating array in reverse
		{
			System.out.print(arr[i]);
		}
	}

}
