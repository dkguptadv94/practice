package com.dk.it.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearch01 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("z");
		al.add("a");
		al.add("m");
		al.add("k");
		al.add("A");
		System.out.println(al);//[z, a, m, k, A]
		Collections.sort(al);
		System.out.println("After sort : "+al);//[A, a, k, m, z]
		System.out.println(Collections.binarySearch(al,"z"));
		System.out.println(Collections.binarySearch(al,"M"));
	}

}
