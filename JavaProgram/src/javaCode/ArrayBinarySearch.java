package javaCode;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};   //should be sorted
		
		// Approach--1
/*		int key= 3;
		int l=0;
		int h= a.length-1;
		boolean flag= false;
		
		while(l<=h)
		{
			int Mid= (l+h)/2;
			if(key==a[Mid])
			{
				System.out.println("Element Found");
				flag = true;
				break;
			}
			if(key<a[Mid])
			{
				h=Mid-1;
			}
			if(key>a[Mid])
			{
				l=Mid+1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element not found");
			
		}       */
		
		
	// Approach--2-->>> using in build function in Java
		
		// Array.binarySearch(arrayName, key)--> we have to provide name of array and key element which we want to search
		                                   // --> it will give us position of that key element in array
		                                   // --> if element is not there the then it will give -VE value 
		                                   // --> array should be sorted before use method
		System.out.println(Arrays.binarySearch(a, 50));
		
		

	}

}
