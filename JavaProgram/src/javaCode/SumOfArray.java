package javaCode;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {12,13,141,125,6,7,8};
		int sum=0;
		
	/*	for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("sum of array :" + sum);  */
		
		
		// Enhanced for loop
		for(int value:a)
		{
			sum=sum+value;
		}
		
		System.out.println("sum of array :" + sum);
		
	}

}
