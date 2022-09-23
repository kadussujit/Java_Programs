package miscellaneous;

public class StringVowel {

	public static void main(String[] args) {

		//Write a java program to check whether a string contains a wovel or not
		
		String s ="Sujit";
		
		s=s.toLowerCase();
		char[] arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("String contains vowel "+arr[i]);
			}
		}
	}

}
