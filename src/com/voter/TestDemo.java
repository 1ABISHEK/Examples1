package com.voter;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) throws ValidAgeException{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");

		int age = s.nextInt();
		
		VoterData obj = new VoterData();
		
		try {
		obj.checkAge(age);
		}
		catch(ValidAgeException ve) {
			System.out.println("Check u r age");
		}
	}

}
