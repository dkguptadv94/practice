package com.dkit.problem.solving;

public class StrongNumber01 {

	public static void main(String[] args) {
		int n,temp,r,fact;
		int sum=0;
		n=145;
		temp=n;
		while(n>0) {
			r=n%10;
			fact=1;
			for(int i=r;i>=1;i--) {
				fact=fact*i;
			}//end for
			sum=sum+fact;
			n=n/10;
		}//end while
n=temp;
if(sum==n) {
	System.out.println(n+" this is StongNumber");
}//if
else {
	System.out.println(n+" is not StrongNumber");
}//else
	}

}
