package com.dk.it.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap02 {

	public static void main(String[] args) {
		TreeMap<Object, Object> tm=new TreeMap<>();
		tm.put("ZZZ",107);
		tm.put("AAA",101);
		tm.put("YYY",201);
		tm.put("BBB",109);
		System.out.println(tm);
		Set<?> es = tm.entrySet();
		System.out.println(es);
		Iterator<?> itr = es.iterator();
		while(itr.hasNext()) {
			Entry next = (Entry) itr.next();
			System.out.println(next);
		}
	}

}
