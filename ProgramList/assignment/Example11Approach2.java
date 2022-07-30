//Java Program to Check Whether a Character is Alphabet or Not
// Checking lowercase and uppercase alphabets.
package assignment;

public class Example11Approach2 {

	public static void main(String[] args) {
		
		char alphabet='6';
		
		if(alphabet>='a' && alphabet<='z')
		{
			System.out.println(alphabet+ " is a lowercase alphabet");
		}
		else if(alphabet>='A' && alphabet<='Z')
		{
			System.out.println(alphabet+ " is an uppercase alphabet");
		}
		else
		{
			System.out.println(alphabet+ " is not an alphabet");
		}
		
	}

}
