package com.exp;

@FunctionalInterface
interface FunInf1{
	void userData();
}

public class Exp14 {

	public static void main(String[] args) {
		//Before JDK 8 Implementation
		
		FunInf1 obj = new FunInf1() {
			@Override
			public void userData() {
				System.out.println("Overrided");
			}
		};
		obj.userData();
		
		new FunInf1(){
			@Override
			public void userData() {
				System.out.println("namless object");
			}
		}.userData();
		
		//Java 8
		FunInf1 obj1 = ()->{ System.out.println("Default Method");
		};
		obj1.userData();
		}
	}