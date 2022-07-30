/*
				****
				***
				**
				*
				**
				***
				****
 */
package starPattern;

public class Pattern12 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)			//print star
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)			//print space
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for(int i=2;i<=4;i++)
		{
			for(int j=1;j<=i;j++)			//print star
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
