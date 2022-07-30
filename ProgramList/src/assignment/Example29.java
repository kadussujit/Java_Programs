//Java Program to Get Current Date/ Time
package assignment;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Example29 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		Date d = new Date();
		System.out.println(s.format(d));
		
	}

}
