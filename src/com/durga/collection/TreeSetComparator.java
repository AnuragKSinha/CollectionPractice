package com.durga.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String args[]){
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(0);
		t.add(9);
		t.add(2);
		System.out.println("TreeSet Content:"+t);
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i=(Integer)o1;
		Integer j=(Integer)o2;
			if(i>j){
				return -1;
			}
			else
				if(i<j)
				{
					return 1;
				}
				else 
					return 0;
		}
	
}
