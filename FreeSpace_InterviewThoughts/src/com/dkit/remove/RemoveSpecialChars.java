package com.dkit.remove;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str="$ja|va$st%ar";
		
		//Approach-1(replaceAll() method)
		String replaceAll=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(replaceAll);

	}

}
