package CodePractise;

import java.util.Scanner;

public class PractiseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// count the digits in a given number>>>>>>>>>>>>>>>>	
//      int x=3456879;
//      int count=0;
//      
//      String s = Integer.toString(x);
//      int len = s.length();
//      
//      for(int i=0;i<len;i++)
//      {
//    	 count++; 
//      }
//      
//      System.out.println(count);
       
	// Ascending order numbers>>>>>>>>>>>>>>>>>>>	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no. of element you wabt in arrray");
//		
//		int num = sc.nextInt();
//		int temp;
//	
//		int[] a = new int[num];
//		System.out.println("Enter Numbers ");
//		int len= a.length;
//		
//		for(int i=0;i<len;i++)
//		{
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]= a[j];
//					a[j]=temp;
//				}
//			}
//
//		}
//		System.out.println("Ascending Number");
//		
//		
//		for(int i=0;i<len-1;i++)
//		{
//			System.out.print(a[i] + ",");
//		}
//		System.out.print(a[len-1])

		
	//	print the triangle with *
//		int n=5;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j>0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.print('\n');
//		}
	 
		// reverse triangle with *
//	for(int i=5;i>0;i--)
//	{
//		for(int j=i;j>0;j--)
//		{
//			System.out.print("*");
//		}
//		System.out.print('\n');
//	}
//	
		
		// prime num find
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n= sc.nextInt();
//		
//		int count=0;
//		
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("Num is Prime");
//		}
//		else
//		{
//			System.out.println("Not Prime");
//		}
		
		// multiplication table
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number");
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=10;i++)
//		{
//		 int c=  n*i;
//		 System.out.println(n+"*"+ i + "=" + c);
//		}
		
//		String s= "Abhishek Tanwar";
//		
//		String[] a= s.split(" ");
//		String rev="";
//		for(int i=0;i<a.length;i++)
//		{
//			String str = a[i];
//			for(int j=str.length()-1;j>=0;j--)
//			{
//				char ch =str.charAt(j);
//				rev =rev + ch;
//			}
//			rev =rev +" ";
//		}
//		System.out.println(rev);
	
		// print triangle with number 
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i;j>0;j--)
//			{
//				System.out.print(i);
//			}
//			System.out.print('\n');
//		}
		
//		String s= "ABHISHEK TANWAR HARYANA";
		
//	   int a= s.indexOf('A');
//	  int b=  s.indexOf('T');
//	  int c=  s.indexOf('H');
//	  
//	  System.out.print(s.charAt(a));
//	  System.out.print(s.charAt(b));
//	  System.out.print(s.charAt(c));
		
//		String[] s1= s.split(" ");
//		int len = s1.length;
//		String rev="";
//	    
//		for(int i=0;i<len;i++)
//		{
//			String s2= s1[i];
//			for(int j=0;i<=0;i++)
//			{
//				char ch =s2.charAt(j);
//				rev = rev + ch;
//			}
//			rev =rev +" ";
//		}
//		System.out.print(rev);
		
	 
//		String s= "ABHISHEK TANWAR";
//		
//		char[] strArray= s.toCharArray();
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(strArray[i]);
//		}
		
//		String s= "AbhishekAshu";
//		
//		char[] ch = s.toCharArray();
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(ch[i]==ch[j])
//				 System.out.println("duplicate characters are " + ch[j]);
//				 count++;
//			}
//		}
//		System.out.println(count);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check armstong");
		int n= sc.nextInt();
		
		String s=  Integer.toString(n);
		int temp=n;
		int sum=0;
		
		
		
		while(temp!=0)
		{
			int rem = temp%10;
			int mul=1;
			
			for(int i=1;i<=s.length();i++)
			{
				mul=mul*rem;
			}
			sum=sum +mul;
			temp=temp/10;
			
		}
		if(sum==n)
		{
			System.out.println("Armstong");
		}
		else
		{
			System.out.println("Not Armstong");
		}
		
		
		
		
	  
	  
}
}

