package javaCode;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number to calculate factorial");
		
		int num =sc.nextInt();
		
		
		long fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		

	}

}
