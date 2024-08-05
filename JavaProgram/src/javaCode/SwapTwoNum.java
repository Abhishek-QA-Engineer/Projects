package javaCode;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
		System.out.println("before swapping values are.."+a+" "+b); 
		
	  //logic1 >>us third variable
	  /*int t=a;
		a=b;
		b=t;*/
		
	 // Logic2 >>>using - & + 
	/*	a=a+b;
		b=a-b;
		a=a-b;*/
		
	 // Logic3 >>using * & / 
	/*	a=a*b;
		b=a/b;
		a=a/b;*/
		
	 // Logic4 >>> using bitwise XOR (^)
	/*	a=a^b;  // first of all a and b will be converted into binary numbers then we will get answer like a=10 >>>1010, // b=20 >>>10100 then a^b = 11110 =30
		b=a^b;  //30^20 =10                                                                                        
		a=a^b; */ //30^10 =20
		
	 // Logic5 >>single statement
		b=a+b-(a=b); // as execution always start from right to left so first of all a will become b then with the help of formula we will make value of b
		
		
		
		
		
		
	 	System.out.println("after swapping values are.."+a+" "+b);

	}

}
