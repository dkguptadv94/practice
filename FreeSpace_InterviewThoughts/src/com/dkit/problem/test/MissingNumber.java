package com.dkit.problem.test;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,9};
		int expLength=a.length+1;
		int total_sum=expLength*(expLength+1)/2;
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}//end for-i
		System.out.println("missing number -: "+(total_sum-sum));
	}

}
