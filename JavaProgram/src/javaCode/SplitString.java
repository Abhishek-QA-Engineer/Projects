package javaCode;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abhishek Tanwar Haryana";
		splitwords(str);
		

	}

	private static void splitwords(String str) {
		// TODO Auto-generated method stub
		String words[]= str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String s = words[i];
			System.out.print(s.charAt(0));
		}
		
/*		String name= "ABHI";
		String name2 = name.replace("A", "B");
	    System.out.println(name2);     */
		
		
		
		
/*		String str = "he,xa,wa,re";
		String strNew = str.replace(",", "");
		
		System.out.println(strNew);          */
		
		
	// Reverse  string 
	String ss= "Green Tech";
		String rev="";
		
   	for(int i=ss.length()-1;i>=0;i--)
		{
			rev=rev+ ss.charAt(i);
		}
		System.out.print(rev);      
		
	// Reverse each word of string
//		String s= "Green Tech";
//		
//		String[] a= s.split(" ");
//		String revr= "";
//		for(int i=0;i<a.length;i++)
//		{
//			String t= a[i];
//			for(int j=t.length()-1;j>=0;j--)
//			{
//				revr =revr+ t.charAt(j);
//			}
//			revr=revr+ " ";
//			
//		}
//		System.out.print(revr);          
		
		
// Count duplicate in the string
		
//		String ssb= "AABHISHSSK";
//		
//		int count=0;
//		for(int i=0;i<ssb.length();i++)
//		{
//			for(int j=i+1;j<ssb.length();j++)
//			{
//				if(ssb.charAt(i)==ssb.charAt(j))
//					count++;
//			}
//		}
//		System.out.print(count);
//		
	

        
		
		}

}
