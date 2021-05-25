package com.interview;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(getBinary(num));
	}

	private static String getBinary(int num) {
		String res="";
		String binary=" ";
		while(num>0) {
			res+=num%2;
			num=num/2;
		}
		for(int i=res.length()-1;i>=0;i--) {
			binary+=res.charAt(i);
		}
		
		return binary;
	}

}
