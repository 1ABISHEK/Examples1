package com.exp;

interface Inf {
	float pi = 3.14f;
	
	void cat();

}

abstract class Abs{
	public abstract void disp();
	
	public void show() {
		System.out.println("Implemented Method for Abs");
	}
}

class Impl1 extends Abs implements Inf{
	@Override
	public void disp() {
		System.out.println("abs method overrided");
	}
	@Override
	public void cat() {
		System.out.println("inf methods overrided");
	}
	public void dog() {
		System.out.println("concrete class method");
	}
}

public class Exp10 {
	
	public static void main(String args[]) {
		Impl1 obj = new Impl1();
		obj.cat();
		obj.disp();
		obj.show();
		obj.dog();
	}

}
