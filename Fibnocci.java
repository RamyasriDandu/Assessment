package com.interview;

import java.util.Scanner;

public class Fibnocci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int num1=0,num2=1;
		int sum=0;
		System.out.println("Fibnocci Series:");
		System.out.print(num1+" "+num2);
		for(int i=1;i<num;i++) {
			sum=num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
		}
		
}
}