package arrayPrograms;

public class ArrayDigitAddition {

	public static void main(String[] args) {
		
		int array[] = new int[6];
		array[0]=70;
		array[1]=15;
		array[2]=25;
		array[3]=35;
		array[4]=56;
		array[5]=61;
		
		
		for(int i=0; i<array.length;i++)
		{
			int sum=0;
			int num = array[i];
			while(num>0)
			{
				int digit = num%10;
				sum = sum+digit;
				num=num/10;
			}
			if(sum==7)
			{
				System.out.println(array[i]);
			}
		}

	}

}
