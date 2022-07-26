package com.dkit.problem.test;

public class UniqueElement {

	public static void main(String[] args) {
		int arr[]= {1,3,5,1,3,2,3,2,6,7};
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.print(arr[i]);
			}
		}
	}

}
