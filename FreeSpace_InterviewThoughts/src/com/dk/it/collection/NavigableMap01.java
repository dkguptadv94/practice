package com.dk.it.collection;

import java.util.TreeMap;

public class NavigableMap01 {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<>();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("f", "fun");
		System.out.println(t.ceilingKey("c"));//c
		System.out.println(t.higherKey("e"));//f
		System.out.println(t.floorKey("e"));//d
		System.out.println(t.lowerKey("e"));//d
		System.out.println(t.pollFirstEntry());//a=apple
		System.out.println(t.pollLastEntry()); //f=fun
		System.out.println(t.descendingMap()); //{d=dog, c=cat, b=banana}
	}

}
