//		*
//		**
//		***
//		****
//		*****	
package starPattern;

public class Pattern01 {
	
	public static void main(String[] args)
	{
		int col; int row;
		
		for (col=1; col<=5; col++)
		{
			for (row=1; row<=col; row++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
