package com.streaminapp.corejava.inheritance;

import java.util.HashSet;
import java.util.Set;

class Parent {

	static int x=10;
	static int getArea() {
		return 0;
	}
	int m() {
		
		
		
		System.out.println("Parent m");
		//System.exit(0);
		Set<String> s=new HashSet<String>();
		s.add("1");
		System.out.println(s.contains("1"));
		return 0;
	}
	

}

public class child extends Parent{
	int x=10; 
	static int getArea() {
		return 5;
	}
	
	
	public static void main(String[] args) {
		Parent pObj=new Parent();
		pObj.m();
		System.out.println(pObj.getArea());
		
		child cObj=new child();
		cObj.m();
		System.out.println(cObj.getArea());
		
		pObj=cObj;
		pObj.m();
		System.out.println(pObj.getArea());
	}
}
