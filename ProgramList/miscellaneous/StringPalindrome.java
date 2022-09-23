package miscellaneous;

public class StringPalindrome {

	public static void main(String[] args) {

		//Java program to find whether string is palindrome or not
		
		String s ="Sujit";
		
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		
		if(reverse.equals(s))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palidrome");
		}
		
	}

}
