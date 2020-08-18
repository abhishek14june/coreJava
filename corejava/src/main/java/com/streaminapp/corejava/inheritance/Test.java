package com.streaminapp.corejava.inheritance;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * String s="ab"; String s2="manoj";
		 */
		Map<Integer,Integer> map=new HashMap();
		Integer i=new Integer(1);
		Integer i2=new Integer(1);
		map.put(i, i);
		map.put(i2, i2);
		System.out.println(map.size());
		
		
		Map<MyInteger,MyInteger> map2=new HashMap();
		MyInteger mi=new MyInteger(1);
		MyInteger mi2=new MyInteger(1);
		map2.put(mi, mi);
		map2.put(mi2, mi2);
		System.out.println(map2.size());
				
	}
}
