package com.exp;

class Book {
	
	static int pincode = 23456;
	int atmpin = 1234;
	
	public Book() {
		System.out.println("constructor");
	}
	
	public static Book getObj() {
		System.out.println("Factory Method");
		return new Book();
	}
	
	static {
		System.out.println("static block "+pincode);
	}
	
	{
		System.out.println("instance block "+atmpin);
	}

	

}
class Exp9{
	public static void main(String arg[]) {
		System.out.println("Main Method");
		
		Book obj = new Book();
		obj.getObj();
//		Book obj2 = obj.clone();Error
//		Class.forName("Null");Error
	}
}
