package com.interview;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(getOctal(num));

	}

	private static String getOctal(int num) {
		String res="";
		String octal=" ";
		while(num>0) {
			res+=num%8;
			num=num/8;
		}
		for(int i=res.length()-1;i>=0;i--) {
			octal+=res.charAt(i);
		}
		return octal;
		
	}

}
