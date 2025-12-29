package com.inhs;


//IS - A Composition
class A{
	public int  test() {
		return 1;
	}
}

class B //extends A
{
	//HAS - A Aggregation
	
	A obj = new A();
	public void test() {
		
	}
}

public class Exp1 {

}
