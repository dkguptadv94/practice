package com.dkit.problem.solving;

public class ArmstrongNumber01 {

	public static void main(String[] args) {
		int r,c,sum=0,temp;
		int n=153;
		temp=n;
		while(n>0) {
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n=n/10;
		}//end while
		if(temp==sum) {
			System.out.println(temp+" this is Armstrong Number");
		}//end if
		else {
			System.out.println(temp+" this is not Armstrong Number");
		}
	}

}
