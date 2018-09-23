package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * Sort by increasing length order
 * and when the length is same the 
 * Alphabetically
 * @author anurag
 *
 */
public class TreeSetStringAndStringBuffer {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyLength());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println("OUTPUT::"+t);
		

	}

}
class MyLength implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		if(s1.length()==s2.length()){
			return s1.compareTo(s2);
		}
		else if(s1.length()>s2.length()){
			return +1;
		}
		else if(s1.length()<s2.length()){
			return -1;
		}
		else
			
		return 0;
	}
	
}
