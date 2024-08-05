package javaCode;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number");
		int c =sc.nextInt();
		
	// Logic 1 >>>
		
	/*	if(a>b && a>c)
		{
			System.out.println(a+" largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" largest number");
		} 
		else
		{
			System.out.println(c+" largest number");
		}   */
		
	// Ternary operator
		
	//	int largest1=a>b?a:b;
	//	int largest2=c>largest1?c:largest1;
		
		// we can write above expression in one line like ....
		int largest= c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest +" largest number");
		
		
	}

}
