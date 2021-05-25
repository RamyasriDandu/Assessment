package com.interview;

import java.util.Scanner;

public class Ascending_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int size=sc.nextInt();
	    int temp=0;
	    System.out.println("Enter the elements:");
	    int arr[]=new int[size];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Array Elements are");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    System.out.println("The elements in ascending are:");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]>arr[j]) {
	    			temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	 
	    }
	    System.out.println("Array Elements are");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    
	}

}
