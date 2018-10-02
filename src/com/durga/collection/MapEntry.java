package com.durga.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Oracle interview Third Round Question
 * Sort the map according to 
 * its value(the value can be duplicates)
 * Entry is a inner interface of Map
 * having 3 methods
 * 1.Object getValue
 * 2.Object getKey
 * 3.Object setValue
 * @author Anurag
 *
 */
public class MapEntry {

	public static void main(String args[]){
		Map<String,Integer> m=new HashMap();
		m.put("Hello",96);
		m.put("Hi", 100);
		m.put("Hi....",101);
		m.put("Hey", 96);
		Set entry=m.entrySet();
		List<Integer> ls=new ArrayList();
		Iterator itr=entry.iterator();
		while(itr.hasNext()){
			Map.Entry enty=(Map.Entry)itr.next();
			ls.add((Integer)enty.getValue());
		}
		LinkedHashMap hm=new LinkedHashMap();
		Collections.sort(ls);
		System.out.println("Sorted::"+ls);
		
		for(Integer i:ls){
			Iterator it=entry.iterator();
			while(it.hasNext()){
				Map.Entry en=(Map.Entry)it.next();
				System.out.println(en.getValue().equals(i));
				System.out.println("Integer::"+i);
				System.out.println("Value ::"+en.getValue());
				if(en.getValue().equals(i)){
					hm.put(en.getKey(), en.getValue());
				}
			}
		}
		System.out.println("Final Result::"+hm);
		
	}
}
