package stringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		
		String input = "My name is Sujit";
		
		String [] array = input.split(" ");
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}

	}

}
