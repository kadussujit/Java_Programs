package assignment;


public class ABC {

	public static void main(String[] args) {

		// Program to count words
		
		String str = "My name is usjit";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			//counts spaces present in string
			if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0))
			{
				count++;
			}
		}
		//To count last word present in string, increament count by 1
		count++;
		System.out.println(count);
	}
}