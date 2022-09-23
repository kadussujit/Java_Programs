package miscellaneous;

public class NoOfCharInString {

	public static void main(String[] args) {

		//Java program to count number of characters in a string
		
		String s ="sujit kadus";
		s=s.toLowerCase();
		char[]arr = s.toCharArray();
		
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'||ch<='z' && ch!=' ')
			{
				count++;
			}
		}
		
		System.out.println("Number of characters in the string are: "+count);
	}

}
