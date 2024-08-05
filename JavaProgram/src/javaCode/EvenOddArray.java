package javaCode;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,66,77,99,30};
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even no in arrray......" + a[i]);
			}
			else
			{
				System.out.println("Odd no in arrray......" + a[i]);
			}
		}
		
		

	}

}
