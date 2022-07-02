package com.dkit.problem.pattern;

public class DaimondIntoBox {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((i == 1 || i == 10 || j == 1 || j == 10)||(j ==7-i || j == 4+i||j==i-4 )) {

					System.out.print("*");
				} // end if
				else {
					if((j ==8 && i==7)||(j ==7 && i==8)||(j ==9 && i==6)||j==6 &&i==9) {
						System.out.print("*");
					}else {
					System.out.print(" ");
					}
				} // end else
			} // end for-2
			System.out.println();
		} // end for-1

	}
}

