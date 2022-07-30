/*					    *
					   ***
					  *****
					 *******
					*********
*/
package starPattern;

public class Pattern05 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)			//for rows
		{
			for(int j=4;j>=i;j--)		//printing spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)		//printing stars in reverse
			{
				System.out.print("*");
			}
			
			for(int l=2; l<=i;l++)		//printing stars in straight manner
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
