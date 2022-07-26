package com.dkit.problem.test;

public class PatterenTest03 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(j>=5-i&&j<=3+i) {
					if(j<4) {
						System.out.print(k);
						k++;
					}
					else {
						System.out.print(k);
						k--;
					}
					//System.out.print(k);
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
