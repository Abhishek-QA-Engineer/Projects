package javaCode;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadDataFromFile {
	
	public static void main(String[] args) throws IOException {
		
		// Approach 1 ---using FileReader and BufferReader
		
			FileInputStream fr = null;
			try {
				fr = new FileInputStream ("C:\\Users\\hp\\Desktop\\Java Folder\\datatype.java");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		BufferedReader br =new BufferedReader(new InputStreamReader(fr));
		
		String str;
		
		while((str=br.readLine())!=null)
		{
		  System.out.println(str);
		}
		br.close();
		
		
}
	
}

