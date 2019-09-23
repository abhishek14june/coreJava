package com.streaminapp.corejava.others;

public class StaticShadow {
public static void main(String[] args) {
	A obj=new B();
	//static method of a class cannot be overriden in child class
	// static method is class property so even if we invoke the static method show()
	//from object of child class ... method of class A will be called
	
	obj.show();
	
	
	
	obj.show2();
	
	
	
}
}
class A{
	static void show() {
		System.out.println("A.show()");
	}
	 void show2() {
		System.out.println("A.show2()");
	}
}
class B extends A{
	
	static void show() {
		System.out.println("B.show()");
	}
	
	@Override
	void show2() {
		System.out.println("B.show2()");
	}
}
