package javaCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String S = "ABCD";
//		String rev ="";
		
   /*	int len= S.length();
		
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev+ S.charAt(i);
		}
		
		System.out.println("Reversed String is:"+ rev);  */

		
	// 2 using char array
		
//		char a[]= S.toCharArray(); 
//		int len= a.length;
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+ a[i];
//		}
//		
//		System.out.println("Reversed String is:"+ rev);
//		
		
	// 3 Using StringBuffer class
		
//		StringBuffer sb = new StringBuffer(S);
//		System.out.println(sb.reverse());
		
		
//		String s="Abhishek Tanwar";
//		
//		String[] str= s.split(" ");
//		String rev= str[0];
//		String revNew= " ";
//		
//	   for(int i=1;i<str.length-1;i++)
//	   {
//		   rev =rev + str[i] + " ";
//		   revNew = rev.toUpperCase();
//		   
//	   }
//	   
//	   System.out.println(revNew);
//	}
		
		
//	String 	s = "This is a java language";
//	
//	String[] str= s.split(" ");
////	int a= s.indexOf('a');
//	
//	
//	for(int i=0;i<str.length;i++)
//	{
//		if(str[i]=="a" && str[i+1]== " ")
//		{
//			System.out.print("");
//		}
//		else
//			System.out.print(str[i]+ " ");
		
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
//		
//		String 	s = "This is a java language";  //output>>>> print only even
//		
//		String[] y = s.split(" ");
//		
//		for(String word : y)
//		{

	//			int a =word.length(); 
//			if(a%2==0)
//			{
//				System.out.println(word);
//			}
//		
//		}
//	

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		String s = "Abhishek Haryana";
		String s1 = "From";
		
//		String s3 = s.concat(" "+s1);
//		System.out.println(s3);
		
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
			  System.out.print(" " +s1+ " ");	
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
		
}
}
