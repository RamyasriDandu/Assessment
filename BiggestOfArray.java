package com.interview;

import java.util.Scanner;

public class BiggestOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    int sum=0;
	    System.out.println("Enter the elements:");
	    int arr[]=new int[size];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Array Elements are");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    int max=arr[0];
	    for(int i=0;i<arr.length;i++) {
	    	
	    	if(arr[i]>max) {
	    		max=arr[i];
	    	}
	    }
	   System.out.println("The Biggest of the array is:"+max);
}
}
