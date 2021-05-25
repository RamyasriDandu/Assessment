package com.interview;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	    double num=sc.nextDouble();
	    if(isSquare(num)) {
	    	System.out.println("Perfect Square");
	    }
	    else {
	    	System.out.println("Not a Perfect Square");
	    }
		

	}

	private static boolean isSquare(double num) {
		double sq=Math.sqrt(num);
		return ((sq-Math.floor(sq)==0));
	}

}
