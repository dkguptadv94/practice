package com.dkit.problem.test;

public class PatterenTest05 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			char k=65;
			for(int j=1;j<=9;j++) {
				if(j<=6-i||j>=4+i) {
					if(j<5) {
						System.out.print(k);
						k++;
					}
					else {
						System.out.print(k);
						k--;
					}
					
					//j<5?k++:k--;
				}//end if
				else {
					System.out.print(" ");
					if(j==5) {
						k--;
					}
				}//end else
			}//end for-col
			System.out.println("");
		}//end for-row
	}

}
