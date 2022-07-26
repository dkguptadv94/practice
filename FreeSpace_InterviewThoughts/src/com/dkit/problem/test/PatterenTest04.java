package com.dkit.problem.test;

public class PatterenTest04 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(j>=5-i&&j<=3+i) {
					System.out.print(k);
					k++;
					//j<4?k++:k--;
				}//end if
				else {
					System.out.print(" ");
				}//end else
			}//end for-col
			System.out.println("");
		}//end for-row
	}

}
