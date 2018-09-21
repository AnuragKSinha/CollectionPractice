package com.durga.collection;

import java.util.TreeSet;
/**
 * As the Class StringBuffer is not implementing 
 * Comparable so ClassCastException
 * @author anurag
 *
 */
public class TreeSetStringBuffer {
	public static void main(String args[]){
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("N"));
		t.add(new StringBuffer("U"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("G"));
		System.out.println("OutPut:"+t);
	}
}
