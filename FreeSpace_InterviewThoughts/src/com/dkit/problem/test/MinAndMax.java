package com.dkit.problem.test;

public class MinAndMax {

	public static void main(String[] args) {
		int arr[]= {-1,-3,-6,8,13};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
