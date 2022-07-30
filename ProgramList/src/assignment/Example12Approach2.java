//Java Program to Swap Two Numbers
package assignment;

public class Example12Approach2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Numbers before swapping are a= "+a+ " and b= " +b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("Numbers after swapping are a= "+a+ " and b= "+b);
	}

}
