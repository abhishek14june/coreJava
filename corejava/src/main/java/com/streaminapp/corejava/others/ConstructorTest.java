package com.streaminapp.corejava.others;

public class ConstructorTest {
	static int j;
	int x;
	 ConstructorTest(int x){
		this.x=x;
	}
	
	{
		System.out.println("instance block");
		x=100;
		j=200;
	}
	static{
		//trying to intialize x here will give errors
		System.out.println("static block executed");
		j=300;
	}
	
	public static void main(String[] args) {
	
		
		System.out.println("J before creating object "+j);
		ConstructorTest obj=new ConstructorTest(5);
		ConstructorTest obj2=new ConstructorTest(6);
		System.out.println("J after creating object "+j);
		System.out.println("value for x "+obj.x);
		System.out.println("value for x from obj 2");
		System.out.println("value for x "+obj2.x);
		
		//so order of execution is Static block-->Initializer block --> Cnstructor
	}
}
class ConstructorChild extends ConstructorTest{
	public ConstructorChild() {
		super(5);//Base class constructor needs to be invoked explicitly since base class has only
		//paramteried constructor and no no-arguement constructor
		
	}
}
