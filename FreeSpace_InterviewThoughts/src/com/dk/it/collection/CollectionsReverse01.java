package com.dk.it.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverse01 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al);//
		Collections.reverse(al);
		System.out.println("Reverse : "+al);
	}

}
