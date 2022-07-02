package com.dkit.problem.solving;

public class PerfectNumber {

	public static void main(String[] args) {
		int temp,i,sum=0;
		int n=6;
		temp=n;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}//end if
		}//end for
		if(temp==sum) {
			System.out.println(temp+" this is perfect number ");
		}
		else {
			System.out.println(temp+" this is not perfect nmber");
		}
	}

}
