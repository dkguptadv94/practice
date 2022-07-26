package com.dkit.reverse;

public class ReverseTest02 {

	public static void main(String[] args) {
		int n=15125,sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Integer reverse : "+sum);
		System.out.println();
	}

}
