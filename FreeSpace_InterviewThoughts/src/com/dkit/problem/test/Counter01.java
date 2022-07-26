package com.dkit.problem.test;

public class Counter01 {

	public static void main(String[] args) {
		String str="Ind@123ia";
		int lower=0,upper=0,number=0,special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
				upper++;
			
			else if(ch>='a' && ch<='z')
			lower++;
			
			else if(ch>='0' && ch<='9')
			number++;
			else
				special++;
		}//end for
		System.out.println("Uper case : "+upper);
		System.out.println("Lower case : "+lower);
		System.out.println("Number : "+number);
		System.out.println("Special Char : "+special);
	}

}
