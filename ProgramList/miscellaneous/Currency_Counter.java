package miscellaneous;

import java.util.Scanner;

public class Currency_Counter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount you want to withdraw:");
		int money = sc.nextInt();
		sc.close();
		
		while(money>2000)
		{
			int count2000 = money/2000;
			money = money%2000;
			System.out.println("2000 x "+count2000+" = "+(2000*count2000));
			
			break;
		}
		
		while(money>2000)
		{
			int count2000 = money/2000;
			money = money%2000;
			System.out.println("2000 x "+count2000+" = "+(2000*count2000));
			
			break;
		}
		
		while(money>500 && money <=2000)
		{
			int count500 = money/500;
			money = money%500;
			System.out.println("500 x "+count500+" = "+(500*count500));
			
			break;
		}
		
		while(money>200 && money <=500)
		{
			int count200 = money/200;
			money = money%200;
			System.out.println("200 x "+count200+" = "+(200*count200));
			
			break;
		}
		
		while(money>100 && money<=200)
		{
			int count100 = money/100;
			money = money%100;
			System.out.println("100 x "+count100+" = "+(100*count100));
			
			break;
		}
		
		while(money>50 && money<=100)
		{
			int count50 = money/50;
			money = money%50;
			System.out.println("50 x "+count50+" = "+(50*count50));
			
			break;
		}
		
		while(money>20 && money <=50)
		{
			int count20 = money/20;
			money = money%20;
			System.out.println("20 x "+count20+" = "+(20*count20));
			
			break;
		}
		
		while(money>10 && money<=20)
		{
			int count10 = money/10;
			money = money%10;
			System.out.println("10 x "+count10+" = "+(10*count10));
			
			break;
		}
		
		while(money>5 && money<=10)
		{
			int count5 = money/5;
			money = money%5;
			System.out.println("5 x "+count5+" = "+(5*count5));
			
			break;
		}
		
		while(money>2 && money<=5)
		{
			int count2 = money/2;
			money = money%2;
			System.out.println("2 x "+count2+" = "+(2*count2));
			
			break;
		}
		
		while(money==1)
		{
			int count1 = money/1;
			money = money%1;
			System.out.println("1 x "+count1+" = "+(1*count1));
			
			break;
		}
		

	}

}
