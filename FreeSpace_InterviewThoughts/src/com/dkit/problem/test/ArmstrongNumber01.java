package com.dkit.problem.test;

import java.util.Scanner;

public class ArmstrongNumber01 {

	public static void main(String[] args) {
		int temp,sum=0,c,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for test Armstrong Number :");
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n=n/10;
		}//end while
		if(temp==sum) {
			System.out.println(temp+" this number is Armstrong number .");
		}//end if
		else {
			System.out.println(temp+" this number is not Armstrong number .");
		}//end else
	}

}
