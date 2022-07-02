package com.dkit.problem.test;

import java.util.Scanner;

public class PalindromeNumber01 {

	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the palindrome test number : ");
		int n= sc.nextInt();
		sc.close();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}//end while
		if(sum==temp) {
			System.out.println(temp+" Palindrome Number");
		}//end if
		else {
			System.out.println(temp+" Not Palindrome Number");
		}//end else
	}

}
