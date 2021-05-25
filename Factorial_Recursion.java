package com.interview;

import java.util.Scanner;

public class Factorial_Recursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(getFactorial(num));
    }

	private static int getFactorial(int num) {
		int fact;
		if(num==0)
			return 1;
		else
		    return num*getFactorial(num-1);
	}
}
