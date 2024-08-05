package javaCode;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// find the duplicate count in array
		int[] a= {12,33,43,54,12,44,43};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
		}
		System.out.print(count);

	}

}
