package com.dk.it.collection;

import java.util.Hashtable;
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}
public class HashTable01 {

	public static void main(String[] args) {
		Hashtable<Object,String> ht=new Hashtable<>();
		ht.put(new Temp(5),"A");
		ht.put(new Temp(2),"C");
		ht.put(new Temp(15),"D");
		ht.put(new Temp(6),"E"); 
		System.out.println(ht);
	}

}
