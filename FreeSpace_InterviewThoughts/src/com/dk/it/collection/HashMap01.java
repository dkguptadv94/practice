package com.dk.it.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1,"Raja");
		hm.put(2,"Rani");
		hm.put(3,"nilu");
		hm.put(4,"chaman");
		hm.put(5,"Dk");
		hm.put(6,"PK");
		hm.put(7,"LC");
		System.out.println(hm);
		//Iterating of HashMap
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
