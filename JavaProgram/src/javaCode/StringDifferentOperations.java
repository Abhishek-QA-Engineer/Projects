package javaCode;

public class StringDifferentOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//input**** "Abhishek Tanwar"
		//output*** "kehsihbA rawnaT"
		
//		String str = "Abhishek Tanwar";
//		String[] words = str.split(" "); 
//		
//		String reverseString = "";
//		
//		for(String w : words)
//		{
//			String reverseWord= "";
//			for(int i=w.length()-1;i>=0;i--)
//			{
//				reverseWord =reverseWord + w.charAt(i);
//			}
//			reverseString =reverseString + reverseWord +" ";
//		}
//		
//		System.out.println("After Reverse of Each word " + reverseString);
		
		
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
		// calculate the length of String without inbuilt method
//		String str= "Abhishek Tanwar";
//		str = str.concat("\0");
//		
//		char[] ch= str.toCharArray();
//		
//		int count=0;
//		int i=0;
//		while(ch[i]!='\0')
//		{
//			count++;
//			i++;
//		}
//		System.out.println("Length of String is " + count); //output= 15
//		
		
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
	// lower case to upper case 
    // Acc. to ASCII >>>>> small 'a'=97 and 'A' = 65 here the difference will be 32
   	// >>> formula  so LowerCase-32 =UpperCase Or UpperCase = LowerCase+32
		
//		 String s1 = "abhishek tanwar haryana";
//		 // output = ABHISHEK TANWAR HARYANA
//		 
//		 char a[] = s1.toCharArray();
//		 
//		 int size = a.length;
//		 String rev="";
//		 int i=0;
//		 while(i!=size)
//		 {
//			 if(a[i]!=' ')
//			 {
//				a[i]= (char) (a[i]-32); 
//			 }
//			 rev= rev+a[i];
//			 i++;
//		 }
//		
//		 System.out.println("Old String is " + s1);
//		 System.out.println("UpperCase String is " + rev);
		
//		>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		 String s2= "abhishek tanwar haryana";
//		 //output = Abhishek Tanwar Haryana
//		 
//		 char y[] = s2.toCharArray();
//		 
//		 int size= y.length;
//		 
//		 y[0]= (char) (y[0]-32);
//		 
//		 
//		 int i=1;
//		 while(i!=size)
//		 {
//			if(y[i]==' ')
//			{
//				y[i+1]= (char) (y[i+1]-32);
//			}
//			i++;
//		 }	
//		 String rem="";
//		 for(int j=0;j<size;j++)
//		 {
//			 
//			 rem= rem+ y[j];
//		 }
//		 System.out.print("UpperCase String is " + rem);
		
		String s3= "abhishek tanwar haryana";
		
        String ss= s3.toUpperCase();
        char y[] = ss.toCharArray();
        int size= y.length;
        
        y[0]= (char) (y[0]+32);
        
        int i=1;
		 while(i!=size)
		 {
			if(y[i]==' ')
			{
				y[i+1]= (char) (y[i+1]+32);
			}
			i++;
		 }	
		 String rem="";
		 for(int j=0;j<size;j++)
		 {
			 
			 rem= rem+ y[j];
		 }
		 System.out.print("UpperCase String is " + rem);
		
		
		
		
		
		
       
	}

}

