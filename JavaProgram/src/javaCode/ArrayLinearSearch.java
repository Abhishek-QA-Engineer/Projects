package javaCode;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,34,89,32,43,23,10};
		
		 int Search_ele= 30;
		 boolean flag= false;
		 
		 for(int i=0; i<a.length;i++)
		 {
			 if(a[i]==Search_ele)
			 {
				 System.out.println("Element found at position " +i);
				 flag= true;
				 
			 }
		 }
		 if(flag==false)
			 System.out.println("Element not found");
		 
		 }

}
