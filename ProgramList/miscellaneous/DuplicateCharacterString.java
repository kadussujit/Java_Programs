package miscellaneous;

public class DuplicateCharacterString {

	public static void main(String[] args) {

		//Java program to find duplicate characters in a string
		
		String s = "sujit kadus";				//declaring and initializing string
		
		char[] arr = s.toCharArray();			//converting string to array
		
		for(int i=0;i<arr.length;i++)			//iterating character array
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)		//comparing character with next characters
			{
				if(arr[i]==arr[j]&&arr[i]!=' ')
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>1 && arr[i]!=0)
			{
				System.out.print(arr[i]+",");
			}
		}
		
	}

}
