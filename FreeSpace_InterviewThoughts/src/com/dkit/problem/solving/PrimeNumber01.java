package com.dkit.problem.solving;

public class PrimeNumber01 {

	public static void main(String[] args) {
		int i,count=0;
		int n=14;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}//end if
		}//end for
		if(count==2) {
			System.out.println(n+" this is prime number");
		}
		else {
			System.out.println(n+" this is not prime number");
		}
	}

}
