package com.dk.it.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		String str[]= {"A","Z","B"};
		List list=Arrays.asList(str);
		str[0]="k";
		for(String str1:str) {
		System.out.println(str1);
		}
		list.set(1, "L");
		for(String str1:str) {
			System.out.println(str1);
			}
		//list.add("ashok");//java.lang.UnsupportedOperationException
		//list.remove(2); //java.lang.UnsupportedOperationException
		//list.set(1, new Integer(10));// java.lang.ArrayStoreException
		for(String str1:str) {
			System.out.println("Iterator : " +str1);
			}
	}

}
