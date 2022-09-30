package miscellaneous;

public class String_Reverse {

	public static void main(String[] args) {

		/*Write a Java program to reverse the string in given order
		 * INPUT = "my name is sujit"
		 * output = "ym eman si tijus"
		*/
		
		String s = "my name is sujt";
		
		String[] arr = s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			char[] ch =arr[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
		
	}

}
