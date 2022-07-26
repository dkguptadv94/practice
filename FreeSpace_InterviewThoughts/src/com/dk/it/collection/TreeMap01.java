package com.dk.it.collection;

import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(100,"ZZZ");
		tm.put(103,"XXX");
		tm.put(101,null);
		//tm.put(104,106); //CE
		tm.put(107,null);
		//tm.put("100", "ZZZ"); // java.lang.ClassCastException
		//tm.put(null, "AAA");  //java.lang.NullPointerException:
		System.out.println(tm);

	}

}
