//Java Program to Display Fibonacci Series
//The Fibonacci series is a series where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1.
//
//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

package assignment;

public class Example21Approach1 {

	public static void main(String[] args) {
		
		int n=10;
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(firstnum+ ",");
			nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}

	}

}
