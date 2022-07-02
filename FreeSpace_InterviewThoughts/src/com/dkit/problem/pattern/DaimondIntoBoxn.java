package com.dkit.problem.pattern;

public class DaimondIntoBoxn {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7 || j == 1 || j == 7) {

					System.out.print("*");
				} // end if
				else {
					if (j ==5-i || j == 3+i) {

						System.out.print("*");
					} // end if
					else {
						System.out.print(" ");
					}
				} // end else
			} // end for-2
			System.out.println();
		} // end for-1

	}

}
