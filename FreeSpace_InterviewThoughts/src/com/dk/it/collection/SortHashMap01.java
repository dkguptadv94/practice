package com.dk.it.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap01 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(23, "Tushar");
		hm.put(17, "Arun");
		hm.put(15, "Swarit");
		hm.put(9, "neelesh");
		Iterator<Integer>it=hm.keySet().iterator();
		System.out.println("Before sorting");
		while(it.hasNext()) {
			int key=it.next();
			System.out.println("Roll no. "+key+" name "+hm.get(key));
		}
		System.out.println("\n");
		Map<Integer, String> map=new HashMap<>();
		System.out.println("After sorting");
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		Iterator itr=tm.keySet().iterator();
		while(itr.hasNext()) {
			int key=(int)itr.next();
			System.out.println("Roll no. "+key+" name "+tm.get(key));
		}
	}

}
