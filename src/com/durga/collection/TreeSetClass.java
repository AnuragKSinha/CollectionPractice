package com.durga.collection;

import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String args[]){
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("Z");
		t.add("a");
		t.add("z");
		t.add(null);
		System.out.println("TreeSet Content:"+t);
	}

}
