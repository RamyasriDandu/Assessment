package com.interview;

import java.util.Scanner;

public class Palindrome_String {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String org=sc.nextLine();
		String str=org;
		String rev="";
		int length=org.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("Original String: "+org);
		System.out.println("Reverse of String: "+rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
}
}
