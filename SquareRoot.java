package com.interview;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("The square root is:"+getSquareRoot(num));
	}

	private static double getSquareRoot(int num) {
		double temp;
		double root=num/2;
		do {
			temp=root;
			root=(temp+(num/temp))/2;
		}
		while((temp-root)!=0);
		return root;
	}

}
