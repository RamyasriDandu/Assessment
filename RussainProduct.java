package com.interview;
import java.util.*;

public class RussainProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
	    System.out.println(getProduct(sc.nextInt(),sc.nextInt()));
    }

   static String getProduct(int num1, int num2) {
		if(num1<=0||num2<=0) {
			return "-1";
		}
		if(num1>=100000||num2>=100000) {
			return "-2";
		}
		String result=" ";
		int prod=0;
		boolean isFirst=true;
		while(num1>0) {
			if(num1%2 !=0) {
				prod+=num2;
				if(isFirst) {
					result+=num2;
					isFirst=false;
				}
				else {
					result += "+" + num2;
				}
			}
			num1/=2;
			num2*=2;
		}
		result += "="+prod;
		return result;
	}

}
