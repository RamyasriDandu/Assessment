package com.interview;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int org_num=num;
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		if(org_num==sum) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not Strong number");
		}

	}

	private static int factorial(int rem) {
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
