package com.dkit.reverse;

public class ReverseTest01 {

	public static void main(String[] args) {
		String str="raja babu";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}//end for
		System.out.println();
		char[] chrArry = str.toCharArray();
		for(int i=chrArry.length-1;i>=0;i--) {
			System.out.print(chrArry[i]);
		}
	}

}
