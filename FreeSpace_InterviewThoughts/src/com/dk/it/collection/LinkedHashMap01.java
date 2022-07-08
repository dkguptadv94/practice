package com.dk.it.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap01 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(101,"John");
		lhm.put(102,"Zoya");
		lhm.put(103,"Arya");
		lhm.put(104,"Dev");
		System.out.println(lhm);
		for(Map.Entry<Integer,String> m:lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
