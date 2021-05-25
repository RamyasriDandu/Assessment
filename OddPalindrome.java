package com.interview;

import java.util.Scanner;

public class OddPalindrome {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a range:");
	  int range1=sc.nextInt();
	  int range2=sc.nextInt();
	  int num=0;
	  int rev=0;
	  System.out.println("Odd Palindrome numbers are");
	  for(int i=range1;i<=range2;i++)
	  {
	   num=i;
	   rev=0;
	   while(num!=0)
	  	{
	  	 int rem=num%10;
	  	 num/=10;
	  	 rev=rev*10+rem;
	  	}
	   if(i==rev&&rev%2!=0) {
	  	 System.out.print(i+" ");
	   }
	  		  
	  }
  }
}




