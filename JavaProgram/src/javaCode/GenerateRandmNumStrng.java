package javaCode;

import java.util.Random;

public class GenerateRandmNumStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Approach 1 >>>by using Random class in java
		
		Random rd= new Random();
		
		int randomNum=rd.nextInt(100);  // it will generate random num of type integer between range 0 to 99 ...if we give 1000 then it will generate num between 0 to 999;
		System.out.println(randomNum);
		
		double randomNm=rd.nextDouble(); // range between 0.0 to 1.0
		System.out.println(randomNm);
		
		// Approach 2 >>By using Math class
		
		System.out.println(Math.random()); 
		
		// Approach 3 >>>By using Apache Commons-Lang API
		
		
	}

}
