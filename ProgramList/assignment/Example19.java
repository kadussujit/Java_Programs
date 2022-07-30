//Java Program to Count Number of Digits in an Integer
package assignment;

public class Example19 {

	public static void main(String[] args) {
		int a = 152;
		int count = 0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);

	}

}
