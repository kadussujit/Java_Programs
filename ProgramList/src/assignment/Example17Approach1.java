// Java Program to Generate Multiplication Table
package assignment;

public class Example17Approach1 {

	public static void main(String[] args) {
		int num=5;
		int i;
		int n=10;
		int res =0;
		
		for(i=1;i<=n;i++)
		{
			res = num*i;
			System.out.println(num+"*"+i+"="+res);
		}

	}

}
