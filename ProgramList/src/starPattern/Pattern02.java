//				*
//			   **
//			  ***
//			 ****
//			***** 
package starPattern;

public class Pattern02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)			//for rows
		{
			for(int j=4; j>=i;j--)		//for printing spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)		//for printing star
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
