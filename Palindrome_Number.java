package com.interview;

import java.util.Scanner;

public class Palindrome_Number {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     int num=sc.nextInt();
     int rev=0;int org_num=num;
     while(num!=0) {
     	rev=rev*10+num%10;
     	num=num/10;
     }
     System.out.println("Reverse of number:"+rev);
     if(rev==org_num) {
    	System.out.println("Palindrome");
     }
     else {
    	System.out.println("Not Palindrome");
     }
 }
}

