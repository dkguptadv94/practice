package com.dkit.problem.test;

public class PatterenTest07 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			int k=7-i;
			for(int j=1;j<=7;j++) {
				if(j<=8-i) {
					System.out.print(k);
					k--;
				}
				else {
					System.out.print(" ");
				}
			}//end for-col
			System.out.println("");
		}//end for-row
	}
}
