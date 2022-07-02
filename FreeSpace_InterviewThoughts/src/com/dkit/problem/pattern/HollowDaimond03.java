package com.dkit.problem.pattern;

public class HollowDaimond03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j ==5-i || j == 3+i) {

					System.out.print("*");
				} // end if
				else {
					System.out.print(" ");
				} // end else
			} // end for-2
			System.out.println();
		} // end for-1
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j ==i+1 || j == 7-i) {

					System.out.print("*");
				} // end if
				else {
					System.out.print(" ");
				} // end else
			} // end for-2
			System.out.println();
		} // end for-1

	}
}
