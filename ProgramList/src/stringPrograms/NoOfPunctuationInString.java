package stringPrograms;

public class NoOfPunctuationInString {

	public static void main(String[] args) {
		/*
		 * Write a program to count total number of punctuation characters exists in a string
		 */
		
		String str = "Good Morning! Dr. House is busy, please leave a note. Thank you.";
		int count =0;
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='!'||str.charAt(i)=='@'||str.charAt(i)=='%'||str.charAt(i)=='.'||str.charAt(i)==',')
			{
				count++;
			}
		}
		
		System.out.println("Total number of punctuations in the string are: "+count);

	}

}
