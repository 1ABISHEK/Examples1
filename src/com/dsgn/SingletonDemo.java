package com.dsgn;

//Singleton Design Pattern
class SingletonTest{
	public static SingletonTest obj;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if(obj == null) {
//			synchronized (obj) { //double checking singleton Multi threading concept
//				if(obj == null)
//				
//			}
			obj = new SingletonTest();
		}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		SingletonTest obj1 = SingletonTest.getInstance();
		
		SingletonTest obj2 = SingletonTest.getInstance();
		
		System.out.println(obj1.hashCode()+" ");

	}

}
