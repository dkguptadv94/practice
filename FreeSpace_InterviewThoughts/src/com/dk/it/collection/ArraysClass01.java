package com.dk.it.collection;

import java.util.Arrays;

public class ArraysClass01 {

	public static void main(String[] args) {
		int[] a= {10,5,20,11,6};
		System.out.println("Primitive array before sorting : ");
		for(int a1:a) {
			System.out.println(a1);
		}//for end
		Arrays.sort(a);
		System.out.println("Primitive array after sorting : ");
		for(int a1:a) {
			System.out.println(a1);
		}//end for
		
		String[]  str= {"A","Z","B"};
		System.out.println("Object array before sorting : ");
		for(String str1:str) {
			System.out.println(str1);
		}//for end 
		Arrays.sort(str);
		System.out.println("Object array after sorting : ");
		for(String str1:str) {
			System.out.println(str1);
		}//end for
		
		//sorting by using comparator
		
		Arrays.sort(str,new MyComparator02());
		System.out.println("Object array after sorting by Comparator : ");
		for(String str1:str) {
			System.out.println(str1);
		}
	}
}
