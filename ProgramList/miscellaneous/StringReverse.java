package miscellaneous;

public class StringReverse {

	public static void main(String[] args) {

		//Java program to reverse a string
		
		String s = "My name is Sujit";
		
		String[] arr = s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
