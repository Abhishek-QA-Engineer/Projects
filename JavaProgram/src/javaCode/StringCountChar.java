package javaCode;

import java.util.Scanner;

public class StringCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		String s= "Hi Welcome To Java Coding Practise at 12:40am!!";
		
		// write a code to find the uppercase,lowercase, numbers and special char from string
		
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				count++;
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				count1++;
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				count2++;
			else if(s.charAt(i)==' ')
				count3++;
			else
				count4++;
		}
		System.out.println("LowerCase::"+ count);
		System.out.println("UpperCase::"+ count1);
		System.out.println("Numbers::"+ count2);
		System.out.println("SpecialCharacter::"+ count4);
		System.out.println("Space::"+ count3);             */
		
		
	// Count words in a string>>
		
		System.out.println("Enter a String");
	
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words "+ count);
		
	}
	
	
	
	
	
	

}
