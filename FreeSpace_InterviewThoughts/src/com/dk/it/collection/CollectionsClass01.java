package com.dk.it.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass01 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("z");
		al.add("a");
		al.add("k");
		al.add("n");
		al.add("r");
		//al.add(new Integer(10));//CE
		//al.add(null); //NPE
		Collections.sort(al);
		System.out.println("Natural Default Sorting : "+al);
	}

}
