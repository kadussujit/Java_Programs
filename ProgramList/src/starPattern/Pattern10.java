package starPattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)			//printing space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)			//printing star
			{
				System.out.print("*");
			}
			for(int k=3;k>=i;k--)			//printing star
			{
				System.out.print("*");		
			}
			for(int j=2;j<=i;j++)			//printing space
			{
				System.out.print("");
			}
			System.out.println("");
		}
	}

}
