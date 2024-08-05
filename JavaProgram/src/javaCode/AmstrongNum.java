package javaCode;

import java.util.Scanner;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt(); 

// Approach 1--->>>>>		
		
/*		int last=0,digit=0,sum=0,temp;
		temp=n;
		
		
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		
		while(temp>0)
		{
			last= temp%10;
		//	sum = sum+ last^digit;
			sum +=  (Math.pow(last, digit)); 
			temp=temp/10;
			
		}   */
		
// Approach 2-->>>>>>>>>>>>>>>>
		
		int temp=n,sum=0;
		// now we will convert integer to sting 
		String s =  Integer.toString(temp);
		// store the length of string
		int len = s.length();
		
		while(temp!=0)
		{
			int rem= temp%10;  // here we are extracting the last digit of our no.
			int mul=1; // 
			
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			} 
			sum = sum+mul;
			temp= temp/10;
			
			
		}
		
		
		if(n==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("not Amstrong");
		}
		
		
		
		
		

	}

}
