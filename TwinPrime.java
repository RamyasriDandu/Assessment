package com.interview;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		int num1,num2,val1,val2;
		val1=val2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
	    num1=sc.nextInt();
	    num2=sc.nextInt();
	    for(int i=2;i<num1;i++) {
	    	if(num1%i==0) {
	    		val1=0;
	    		break;
	    	}
	    }
	    for(int i=2;i<num2;i++) {
	    	if(num2%i==0) {
	    		val2=0;
	    		break;
	    	}
	    }
	    if(val1==1&&val2==1&&Math.abs(num1-num2)==2) {
	      System.out.println("Twin Prime number:");
	    }
	    else {
	    	System.out.println("Not Twin prime");
	    }
	}

}
