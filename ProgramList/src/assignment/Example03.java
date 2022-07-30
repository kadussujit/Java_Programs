//Java Program to Multiply two Floating Point Numbers
package assignment;

public class Example03 {
	
	public static void method1()
	{
		float a= 5.2f;
		float b= 2.6f;
		
		System.out.println("Approach 1:");
		System.out.println("Multiplication fo two float numbers is " +(a*b));
	}
	
	public static void method2()
	{
		float a= 2.5f;
		float b= 3.5f;
		float c=a*b;
		
		System.out.println("\nApproach 2:");
		System.out.println("Multiplication fo two float numbers is " +(c));
	}
	
	public static void main(String[] args)
	{
		Example03.method1();
		Example03.method2();
	}

}
