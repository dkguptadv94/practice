package com.dkit.problem.test;

import java.util.HashMap;

public class PrimeNumber02 {

	public static void main(String[] args) {
		HashMap<String,String> h1 =new HashMap<>();
		for(int n=2;n<=30;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}//end if
			}//end for
			if(count==2) {
				h1.put(String.valueOf(n)+ " ", " prime no");
			}
			else {
				h1.put(String.valueOf(n)+ " ", " non-prime no");
			}
		}
		System.out.println(h1);
	}
}
