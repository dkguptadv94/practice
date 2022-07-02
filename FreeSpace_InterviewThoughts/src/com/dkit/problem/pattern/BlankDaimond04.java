package com.dkit.problem.pattern;

public class BlankDaimond04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == i || j == 8 - i) {

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
