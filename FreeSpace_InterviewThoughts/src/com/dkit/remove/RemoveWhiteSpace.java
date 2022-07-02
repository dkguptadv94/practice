package com.dkit.remove;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="j  a   v    as  ta     r";
		
		//String trimmedStr=str.trim();//can't use
		//System.out.println(trimmedStr);
		
		//Approach-1
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);
	}

}
