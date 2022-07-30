package starPattern;

public class Pattern11 {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++)
		{
			for(int j=2;j<=i;j++)			//print space
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)			//print star
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)			//print star
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
