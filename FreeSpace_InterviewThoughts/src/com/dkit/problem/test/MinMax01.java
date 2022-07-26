package com.dkit.problem.test;

public class MinMax01 {

	public static void main(String[] args) {
		int arr[]= {4,3,5,2,-1,6};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}//end for
		System.out.println("MinValue :"+ min +"MaxValue :"+max);
	}

}
