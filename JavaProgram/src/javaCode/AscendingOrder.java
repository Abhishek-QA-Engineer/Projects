package javaCode;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size");
	     n=	sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter all element to ascending order");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); 
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<  n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:");
		for(int i=n-1;i>=0;i--)     // for descending order  we can use this statement
	//	for(int i=0;i<n;i++)        // for ascending order  we can use this statement  
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println("Second largest element" + a[n-2]);
		
		
		

	}

}
