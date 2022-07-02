package com.dkit.problem.solving;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=5225;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}//end while
		if(sum==temp) {
			System.out.println(temp+ " this is palindrome number");
		}//end if
		else {
			System.out.println(temp+" this is not palindrome number");
		}//end else
	}

}
