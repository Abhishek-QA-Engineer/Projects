package javaCode;

public class calc {

	
	public static void main(String[] args) {
		
		
		int num=77777;
		int countEven=0;
		int countOdd=0;
		
		while(num>0)
		{
			if(num%2==0)
			{
				num=num/10;
				countEven++;
			}
			else
			{
				num=num/10;
				countOdd++;
				
			}
		}
		System.out.println(countEven);
		System.out.println(countOdd);
	}
}
