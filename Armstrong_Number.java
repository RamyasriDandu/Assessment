package com.interview;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int org_num=num;
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
	   System.out.println("The number is:");	
       if(org_num==sum) 
    	   System.out.println("Armstrong Number");
       else 
    	   System.out.println("Not Armstrong");
       
	}

}
