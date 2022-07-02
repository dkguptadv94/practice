package com.dkit.problem.test;

public class ArmstrongNumber02 {
	public static void main(String[] args) {
		int temp = 0, sum = 0, c, r;
		for (int i = 153; i <= 1000; i++) {
			int n = i;
			temp = i;
			while (n > 0) {
				r = n % 10;
				c = r * r * r;
				sum = sum + c;
				n = n / 10;
			} // end while
			if (temp == sum) {
				System.out.println(temp + " this number is Armstrong number .");
			} // end if
			else {
				System.out.println(temp + " this number is not Armstrong number .");
			} // end else
			sum = 0;
		}
	}
}