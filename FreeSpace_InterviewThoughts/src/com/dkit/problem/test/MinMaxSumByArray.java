package com.dkit.problem.test;

public class MinMaxSumByArray {

	public static void main(String[] args) {
		int array[]= {1,3,5,7,9};
		int sum=0;
		int max=array[0];
		int min=array[0];
		for(int i=0;i<5;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if (array[i]>max) {
				max=array[i];
			}
			sum=min+max;
		}
		System.out.println(min+" + "+max+" = "+sum);

	}

}
