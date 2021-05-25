package com.interview;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(isPrime(num));

	}

	private static String isPrime(int num) {
		boolean b=false;
		int count=0;
		String res=" ";
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
				b=true;
			}
		}
			if(count==0&&b==false) {
				res+="Prime Number";
			}
			else {
				res+="Not Prime";
			}
		return res;
	}

}
