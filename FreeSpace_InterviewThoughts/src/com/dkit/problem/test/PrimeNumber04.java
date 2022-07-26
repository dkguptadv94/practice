package com.dkit.problem.test;

import java.util.ArrayList;

public class PrimeNumber04 {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		int sum=0;
		for(int n=1;n<=30;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}//end if
			}//for j
			if(count==2) {
				al1.add(n);
			}//end if
			else {
				al2.add(n);
			}
		}//for i
		System.out.println("PrimeNumber : "+al1);
		System.out.println("NotPrimeNumber : "+al2);
		for(Integer al3:al1) {
			sum=sum+al3;
		}
		System.out.println("Sum of the prime number : "+sum);
	}
}
