/*		*****
 *  	 ****
 * 		  ***
 *     	   **
 *      	*
*/
package starPattern;

public class Pattern04 {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++)			//for rows
		{
			for(int j=1;j<=i;j++)		//for printing space
			{
				System.out.print(" ");
			}
			
			for(int k=5; k>=i;k--)		//for printing star
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
