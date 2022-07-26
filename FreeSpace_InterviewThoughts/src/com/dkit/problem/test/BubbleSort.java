package com.dkit.problem.test;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {70,80,50,40,30};
		int temp=0;
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//end if
			}//for-j
			System.out.println(arr[i]);
		}//for- i
		System.out.println("Min value : "+arr[0]+" & "+"Max value : "+arr[4]);
	}

}
