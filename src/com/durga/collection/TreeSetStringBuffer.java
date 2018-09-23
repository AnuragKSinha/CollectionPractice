package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * As the Class StringBuffer is not implementing 
 * Comparable so ClassCastException(default natural sorting order)
 * We can solve this problem by using Comparator Interface
 * 
 * @author anurag
 *
 */
public class TreeSetStringBuffer {
	public static void main(String args[]){
		TreeSet t=new TreeSet(new BufferComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("N"));
		t.add(new StringBuffer("U"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("G"));
		System.out.println("OutPut:"+t);
	}
}
class BufferComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}

