package com.excp;

import java.util.Scanner;

public class Exp2 {
	String email = "abishek@gmail.com";
	String pwd = "abi";

	public void Cred() throws Exception {
		if(this.email.equals(email) && this.pwd.equals(pwd)) {
			System.out.println("Valid Credentials");
		}
		else {
			throw new Exception("Invalid Credentials");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter Your Email: ");

		String email = s.next();
		System.out.println("Enter Your Password: ");
		String pwd = s.next();

		Exp2 obj = new Exp2();
		obj.Cred();
		}catch(Exception e) {
			System.out.println("Invalid Credentials");
		}

	}

}
