package com.interview;

import java.util.Scanner;

public class KeySearch_Array {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int size=sc.nextInt();
    boolean flag=false;
    System.out.println("Enter the elements:");
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Array Elements are");
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    }
    System.out.println("Enter the key element to search:");
    int key=sc.nextInt();
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]==key) {
    	 System.out.println("The element is found at "+i);
    	 flag=true;
    	 break;
    	}
    }
    	if(flag==false) {
    		System.out.println("The element is not found");
    	}
    }
}

