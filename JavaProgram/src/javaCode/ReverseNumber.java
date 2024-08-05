package javaCode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();  //let suppose num=1234
		
	// 1. Using algorithm
	/*	int rev=0;
		
		while(num!=0)
		{
			
			rev=rev*10+ num%10; //  0*10 + 1234%10 >>0 + 4=4 >>first iteration
			num = num/10;  // 1234/10 = 123 >>first iteration
		}
		*/
		
	// 2 using StringBuffer class 
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();   */  
		
		
	// 3 StringBuilder class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num); //  here we are appending the value of num into sbl object then we will reverse the sbl in next step
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse number is:"+ rev);        	

	}

}
