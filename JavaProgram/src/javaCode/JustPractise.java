package javaCode;

public class JustPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String s= "ABCD";
		String rev= "";
		
		int len =s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			char c= s.charAt(i);
			rev =rev+c;
			
		}
		System.out.println(rev);    */
		
	/// Automatic Teller Machine -->>> need to print first letter of each word
		
//    	String s = "Automatic Teller Machine";
//		
//		int a = s.indexOf("A");
//		int b= s.indexOf("T");
//		int c =s.indexOf("M");
//	//	int d =s.indexOf("e");
//		
//		System.out.print(s.charAt(a));
//		System.out.print(s.charAt(b));
//		System.out.print(s.charAt(c)+ " ");  
	
	// Approach 1-->>> to extract any particular name from full string 
/*		char[] array= s.toCharArray();
		for(int i=c;i<array.length;i++)
		{
		   System.out.print(array[i]); 
		}  */
 // Approach 2 -->>> to extract any particular name from full string		
		
//      String name = s.substring(c, s.length());
//      System.out.print(name);
//      
//		
		
		
		
		
		
//  print count of characters in given string and duplicate char present
		
/*		String s= "ABHISHEK";
		
		char[] a= s.toCharArray();
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='A')
			count++;
			
			else if(a[i]=='B')
				count1++;
			
			else if(a[i]=='H')
				count2++;
			
			else if(a[i]=='I')
				count3++;
			
			else if(a[i]=='S')
				count4++;
			
			else if(a[i]=='H')
				count5++;
			
			else if(a[i]=='E')
				count6++;
			
			else if(a[i]=='K')
				count7++;
			
			
			}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);               */
      
//      write a java code to convert  "Name Sirname"  into  "sirname name" 
    	    
    	        String fullName = "Name Sirname";

    	        // Split the full name into parts based on space
    	        String[] parts = fullName.split(" ");

    	        if (parts.length == 2) { // Ensure there are exactly two parts (name and surname)
    	            String firstName = parts[0];
    	            String lastName = parts[1];

    	            // Convert the name to lowercase
    	            String lowerLastName = lastName.toLowerCase();
    	            String lowerFirstName = firstName.toLowerCase();

    	            // Create the new formatted string "sirname name"
    	            String formattedName = lowerLastName + " " + lowerFirstName;

    	            System.out.println("Converted name: " + formattedName);
    	        } else {
    	            System.out.println("Invalid input format. Please provide a full name with exactly two parts separated by space.");
    	        }
    	    }
    	
		
		
		

	}


