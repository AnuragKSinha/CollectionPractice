package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * Customizing String and printing 
 * the sequence in reverse order
 * @author anurag
 *
 */
public class TreeSetComparatorForAlphabets {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("A");
		t.add("Z");
		t.add("L");
		t.add("C");
		System.out.println(t);

	}

}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}
