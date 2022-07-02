package com.dkit.problem.test;

public class StringReverse01 {

	public static void main(String[] args) {
		String str="malayalam";
		String str3="";
		String temp=str;
		for(int i=str.length()-1;i>=0;i--) {
			Character str2=str.charAt(i);
			str3= str3+str2.toString();
		}
		if(temp==str3) {
			System.out.println("Palindrome Number");
		}//end if
		else {
			System.out.println("Not Palindrome Number");
		}//end else

	}

}
