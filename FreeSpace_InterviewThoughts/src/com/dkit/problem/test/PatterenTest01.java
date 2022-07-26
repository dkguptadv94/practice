package com.dkit.problem.test;

public class PatterenTest01 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			boolean flag=true;
			for(int j=1;j<=7;j++) {
				if(j>=i&&j<=8-i){
					if(flag) {
					System.out.print(1);
					flag=false;
					}
					else {
						System.out.print(0);
						flag=true;
					}
				}//end if
				else {
					System.out.print(" ");
				}//end else
			}//end for-col
			System.out.println("");
		}//end for-row
	}

}
