package com.durga.collection;

import java.util.TreeSet;
/**
 * As String implements Comparable Interface
 * so there is no ClassCastException
 * to know more go to terminal
 * and type javap java.lang.String
 * @author anurag
 * false is returned if it is not added
 *
 */
public class TreeSetString {
	public static void main(String args[]){
		TreeSet t=new TreeSet();
		t.add(new String("A"));
		t.add(new String("N"));
		t.add(new String("U"));
		t.add(new String("R"));
		System.out.println(t.add(new String("A")));
		t.add(new String("G"));
		System.out.println("OutPut:"+t);
	}
}
