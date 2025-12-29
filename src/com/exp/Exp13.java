package com.exp;

@FunctionalInterface
interface FunInf{
	String greetUser(String msg);
	
	static void cat() {
		System.out.println("funinf cat()");
	}
	default void dog() {
		System.out.println("funinf dog()");
		fox();
	}
	
	private void fox() {
		System.out.println("funinf fox()");
	}
}

public class Exp13 {
	public static void main(String args[]) {
		
		//jdk 8 feature
		FunInf obj = (String msg)->{
			return msg;
		};
		
		System.out.println(obj.greetUser("Hello......................................................."));
	}

}
