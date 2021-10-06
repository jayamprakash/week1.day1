package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		
		String S1= "prakash";
		String S3="";
		char [] S2= S1.toCharArray();
		System.out.println(S2);
		
		int length=S1.length();
		System.out.println(length);
		
		for (int i = length-1; i >=0; i--) {
			
			S3=S3+S2[i];
			
			
		}
		
		System.out.println(S3);
		
		if (S1.equals(S3)) {
			
			System.out.println("palindrom");
			
		}
		else 
			System.out.println("Not palindrom");

	}

}
