package com.streaminapp.corejava.others;

import com.streaminapp.corejava.others.Outer.Inner;


public class Outer{
	private void m() {
		System.out.println("Outer.m()");
	}
	
	class Inner extends Outer {
		
		 private void m() { System.out.println("Inner.m()"); }
		 
	}
	
	
	public static void main(String[] args) {
		Outer outerObj=new Outer();
		Inner innerObj=outerObj.new Inner();
		innerObj.m();
		
		outerObj=innerObj;
		
		outerObj.m();
		
	}
}