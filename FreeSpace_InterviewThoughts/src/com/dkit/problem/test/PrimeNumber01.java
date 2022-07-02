package com.dkit.problem.test;

import java.util.ArrayList;

public class PrimeNumber01 {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		ArrayList<Integer> al2 =new ArrayList<>();
		for(int n=2;n<=30;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}//end if
			}//end for
			if(count==2) {
				al.add(n);
			}
			else {
				al2.add(n);
			}
		}
		System.out.println("Non-prime No. :"+al2);
		System.out.println("Prime No. :"+al);
	}
}
