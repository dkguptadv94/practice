package com.dkit.problem.solving;

import java.util.Arrays;

public class SortString01 {

	public static void main(String[] args) {
		String str="java";
		char[] arr= str.toCharArray();
		//Approach-1 (Without using sort() method
		
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//if
			}//for-j
		}//for-i
		System.out.println(arr);
		
		//Approach-2
		String str1="rock";
		char[] charArray=str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
	}
}
