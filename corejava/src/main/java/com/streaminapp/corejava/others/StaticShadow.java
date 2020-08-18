package com.streaminapp.corejava.others;

public class StaticShadow {
public static void main(String[] args) {
	A obj=new B();

	
	
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
	
	
	void show2() {
		System.out.println("B.show2()");
	}
}
