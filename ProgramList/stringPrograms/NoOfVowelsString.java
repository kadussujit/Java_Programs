package stringPrograms;

public class NoOfVowelsString {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to count number of vowels in a string
		 */
		
		String str = "My name is sujit";
		
		//convert string to lowercase
		str = str.toLowerCase();
		int vCount = 0;				//Vowel count
		int cCount=0;				//Consonant count
		
		for(int i=0;i<str.length();i++)
		{
			//check whether character is a vowel
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			//check whether character is a consonant
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				cCount++;
			}
		}
		
		System.out.println("Number of vowels in the string are: "+vCount);
		System.out.println("Number of consonant in the string are: "+cCount);

	}

}
