package com.dkit.problem.test;

public class RecursonFactorial02 {
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		int fact=1;
		int number=7;
		fact=factorial(number);
		System.out.println(fact);
		
	}
}
