package com.dk.it.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}
public class CollectionsClass02 {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList();
		al.add("z");
		al.add("a");
		al.add("k");
		al.add("n");
		al.add("r");
		al.add(new Integer(10));
		//al.add(null); //NPE
		System.out.println("Befor Sorting : "+al); //[z, a, k, n, r, 10]
		Collections.sort(al,new MyComparator());
		System.out.println("After Costum sorting : "+al);
	}

}
