package javaCode;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int a[] = {8,9,5,4,6,3,1,2};
		System.out.println("Array before sorting"+ Arrays.toString(a));
		
		int n = a.length;
		for(int i=0;i<n-1;i++)     // for no. of passes
		{
			for(int j=0;j<n-1;j++)  // iteration of each pass
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting"+ Arrays.toString(a));
	       */


    //Approach 2>>>>>>>>>>>>>>Using build in method
    
/*		int a[] = {8,9,5,4,6,3,1,2};
		System.out.println("Array before sorting"+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting"+ Arrays.toString(a));    */
		
	// Approach 3>>>>>> this method simply sort the array 
//		Arrays.sort(a);
		
	// Reverse descending order>>if we have to use sort command with collections command as below
	// this method demand for another data type that is "Integer" a non primitive data type
		Integer a[] = {8,9,5,4,6,3,1,2};
		System.out.println("Array before sorting"+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting"+ Arrays.toString(a));
			
		
		
    
}
}

