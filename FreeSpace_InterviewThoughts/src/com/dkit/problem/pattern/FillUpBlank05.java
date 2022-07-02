package com.dkit.problem.pattern;

public class FillUpBlank05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == i || j == 8 - i) {
					if(i==j) {
						System.out.print("\\");
					}//end inner if
					else {
						System.out.print("/");
					}//end inner else
					
				} // end if
				else {
					System.out.print("*");
				} // end else
			} // end for-2
			System.out.println();
		} // end for-1

	}

}
