package com.interview;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(isPrime(num));

	}

	private static boolean isPrime(int num) {
		if (num<= 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
		
	}

}
