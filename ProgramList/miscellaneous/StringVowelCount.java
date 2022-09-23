package miscellaneous;

public class StringVowelCount {

	public static void main(String[] args) {

		//Java program to count vowels in a string
		
		String s ="Sujit kadus";
		
		s=s.toLowerCase();
		char[]arr = s.toCharArray();
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		
		System.out.println("Number of vowels in string are: "+count);
		
		
	}

}
