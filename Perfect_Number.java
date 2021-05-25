package com.interview;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int org_num=num;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(org_num==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Non Perfect Number");
		}
		
     }
}
