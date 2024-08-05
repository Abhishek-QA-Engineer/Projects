package javaCode;

public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Abhishek Tanwar";
		int countBefore = str.length();
		
		int countAfterRemove = str.replace("h", "").length();
		
		int count = countBefore-countAfterRemove;
		System.out.println("Number of occurance is :"+ count);                                      

	}

}
