package com.dk.it.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Nilesh",700);
		hm.put("Raja",200);
		hm.put("Suresh",800);
		hm.put("Chaman",500);
		hm.put("DK",1500);
		System.out.println(hm);
		Set<?> s=hm.entrySet();
		Collection<Integer> c1=hm.values();
		Collection<String> c2=hm.keySet();
		System.out.println("entrySet : "+s);
		System.out.println(" Keys : "+c2);
		System.out.println(" values : "+c1);
		
		Iterator<?> itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			
			if(m1.getKey().equals("Raja")) {
				m1.setValue(2000);
			}
			System.out.println("equals method :"+m1);
		}
		
		
	}

}
