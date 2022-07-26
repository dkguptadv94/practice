package com.dk.it.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator01 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		return i2.compareTo(i1);
	}
}
public class CollectionsSearch02 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al);//[15, 0, 20, 10, 5]
		//Collections.sort(al);
		Collections.sort(al,new MyComparator01());
		//System.out.println("After Sorting : "+al);//[0, 5, 10, 15, 20]
		System.out.println(Collections.binarySearch(al, 115,new MyComparator01()));
		System.out.println(Collections.binarySearch(al,10));
		System.out.println(Collections.binarySearch(al, 18,new MyComparator01()));
	}

}
